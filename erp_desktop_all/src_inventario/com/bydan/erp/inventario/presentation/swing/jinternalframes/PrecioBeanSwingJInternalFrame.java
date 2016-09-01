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

import com.bydan.erp.inventario.util.PrecioConstantesFunciones;
import com.bydan.erp.inventario.util.PrecioParameterReturnGeneral;
//import com.bydan.erp.inventario.util.PrecioParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.PrecioBean;
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
public class PrecioBeanSwingJInternalFrame extends PrecioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PrecioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Precio> precioValidator = new ClassValidator<Precio>(Precio.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Precio precio;	
	public Precio precioAux;
	public Precio precioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Precio precioTotales;
	public Long idPrecioActual;
	public Long iIdNuevoPrecio=0L;
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

	public String sFinalQueryComboRangoUnidadVenta="";

	public List<RangoUnidadVenta> rangounidadventasForeignKey;

	public List<RangoUnidadVenta> getrangounidadventasForeignKey() {
		return rangounidadventasForeignKey;
	}

	public void setrangounidadventasForeignKey(List<RangoUnidadVenta> rangounidadventasForeignKey) {
		this.rangounidadventasForeignKey = rangounidadventasForeignKey;
	}

	//OBJETO FK ACTUAL
	public RangoUnidadVenta rangounidadventaForeignKey;

	public RangoUnidadVenta getrangounidadventaForeignKey() {
		return rangounidadventaForeignKey;
	}

	public void setrangounidadventaForeignKey(RangoUnidadVenta rangounidadventaForeignKey) {
		this.rangounidadventaForeignKey = rangounidadventaForeignKey;
	}

	public String sFinalQueryComboTipoPrecio="";

	public List<TipoPrecio> tipopreciosForeignKey;

	public List<TipoPrecio> gettipopreciosForeignKey() {
		return tipopreciosForeignKey;
	}

	public void settipopreciosForeignKey(List<TipoPrecio> tipopreciosForeignKey) {
		this.tipopreciosForeignKey = tipopreciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoPrecio tipoprecioForeignKey;

	public TipoPrecio gettipoprecioForeignKey() {
		return tipoprecioForeignKey;
	}

	public void settipoprecioForeignKey(TipoPrecio tipoprecioForeignKey) {
		this.tipoprecioForeignKey = tipoprecioForeignKey;
	}

	public String sFinalQueryComboEstadoPrecio="";

	public List<EstadoPrecio> estadopreciosForeignKey;

	public List<EstadoPrecio> getestadopreciosForeignKey() {
		return estadopreciosForeignKey;
	}

	public void setestadopreciosForeignKey(List<EstadoPrecio> estadopreciosForeignKey) {
		this.estadopreciosForeignKey = estadopreciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoPrecio estadoprecioForeignKey;

	public EstadoPrecio getestadoprecioForeignKey() {
		return estadoprecioForeignKey;
	}

	public void setestadoprecioForeignKey(EstadoPrecio estadoprecioForeignKey) {
		this.estadoprecioForeignKey = estadoprecioForeignKey;
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
	
	public Boolean isPermisoTodoPrecio;
	public Boolean isPermisoNuevoPrecio;
	public Boolean isPermisoActualizarPrecio;
	public Boolean isPermisoActualizarOriginalPrecio;
	public Boolean isPermisoEliminarPrecio;
	public Boolean isPermisoGuardarCambiosPrecio;
	public Boolean isPermisoConsultaPrecio;
	public Boolean isPermisoBusquedaPrecio;
	public Boolean isPermisoReportePrecio;
	public Boolean isPermisoPaginacionMedioPrecio;
	public Boolean isPermisoPaginacionAltoPrecio;
	public Boolean isPermisoPaginacionTodoPrecio;
	public Boolean isPermisoCopiarPrecio;
	public Boolean isPermisoVerFormPrecio;
	public Boolean isPermisoDuplicarPrecio;
	public Boolean isPermisoOrdenPrecio;
	
	
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
	
	public PrecioParameterReturnGeneral precioReturnGeneral;
	public PrecioParameterReturnGeneral precioParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPrecio=false;
	public Boolean esParaAccionDesdeFormularioPrecio=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PrecioSessionBeanAdditional precioSessionBeanAdditional=null;
	
	public PrecioSessionBeanAdditional getPrecioSessionBeanAdditional() {
		return this.precioSessionBeanAdditional;
	}
	
	public void setPrecioSessionBeanAdditional(PrecioSessionBeanAdditional precioSessionBeanAdditional) {
		try {
			this.precioSessionBeanAdditional=precioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PrecioBeanSwingJInternalFrameAdditional precioBeanSwingJInternalFrameAdditional=null;
	//public class PrecioBeanSwingJInternalFrame
	
	public PrecioBeanSwingJInternalFrameAdditional getPrecioBeanSwingJInternalFrameAdditional() {
		return this.precioBeanSwingJInternalFrameAdditional;
	}
	
	public void setPrecioBeanSwingJInternalFrameAdditional(PrecioBeanSwingJInternalFrameAdditional precioBeanSwingJInternalFrameAdditional) {
		try {
			this.precioBeanSwingJInternalFrameAdditional=precioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PrecioLogic precioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Precio precioBean;
	public PrecioConstantesFunciones precioConstantesFunciones;
	//public PrecioParameterReturnGeneral precioReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	public RangoUnidadVentaLogic rangounidadventaLogic;
	public TipoPrecioLogic tipoprecioLogic;
	public EstadoPrecioLogic estadoprecioLogic;
	
	//PARAMETROS
	
	
	//public List<Precio> precios;	
	//public List<Precio> preciosEliminados;
	//public List<Precio> preciosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPrecio=false;
	public Boolean isVisibilidadCeldaDuplicarPrecio=true;
	public Boolean isVisibilidadCeldaCopiarPrecio=true;
	public Boolean isVisibilidadCeldaVerFormPrecio=true;
	public Boolean isVisibilidadCeldaOrdenPrecio=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPrecio=false;
	public Boolean isVisibilidadCeldaModificarPrecio=false;
	public Boolean isVisibilidadCeldaActualizarPrecio=false;
	public Boolean isVisibilidadCeldaEliminarPrecio=false;
	public Boolean isVisibilidadCeldaCancelarPrecio=false;
	public Boolean isVisibilidadCeldaGuardarPrecio=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPrecio=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdBodegaPorIdProducto=false;
	public Boolean isVisibilidadBusquedaPorLineaGrupoCategoriaMarca=false;
	public Boolean isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoPrecio=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdRangoUnidadVenta=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoPrecio=false;
	
	public Long getiIdNuevoPrecio() {
		return this.iIdNuevoPrecio;
	}

	public void setiIdNuevoPrecio(Long iIdNuevoPrecio) {
		this.iIdNuevoPrecio = iIdNuevoPrecio;
	}
	
	public Long getidPrecioActual() {
		return this.idPrecioActual;
	}

	public void setidPrecioActual(Long idPrecioActual) {
		this.idPrecioActual = idPrecioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Precio getprecio() {
		return this.precio;
	}

	public void setprecio(Precio precio) {
		this.precio = precio;
	}
	
	public Precio getprecioAux() {
		return this.precioAux;
	}

	public void setprecioAux(Precio precioAux) {
		this.precioAux = precioAux;
	}				
	
	public Precio getprecioAnterior() {
		return this.precioAnterior;
	}

	public void setprecioAnterior(Precio precioAnterior) {
		this.precioAnterior = precioAnterior;
	}	
	
	public Precio getprecioTotales() {
		return this.precioTotales;
	}

	public void setprecioTotales(Precio precioTotales) {
		this.precioTotales = precioTotales;
	}	
	
	public Precio getprecioBean() {
		return this.precioBean;
	}

	public void setprecioBean(Precio precioBean) {
		this.precioBean = precioBean;
	}	
	
	public PrecioParameterReturnGeneral getprecioReturnGeneral() {
		return this.precioReturnGeneral;
	}

	public void setprecioReturnGeneral(PrecioParameterReturnGeneral precioReturnGeneral) {
		this.precioReturnGeneral = precioReturnGeneral;
	}	
	
	
	public Long id_bodegaBusquedaPorIdBodegaPorIdProducto=-1L;

	public Long getid_bodegaBusquedaPorIdBodegaPorIdProducto() {
		return this.id_bodegaBusquedaPorIdBodegaPorIdProducto;
	}

	public void setid_bodegaBusquedaPorIdBodegaPorIdProducto(Long id_bodegaBusquedaPorIdBodegaPorIdProducto) {
		this.id_bodegaBusquedaPorIdBodegaPorIdProducto = id_bodegaBusquedaPorIdBodegaPorIdProducto;
	}

;
	public Long id_productoBusquedaPorIdBodegaPorIdProducto=-1L;

	public Long getid_productoBusquedaPorIdBodegaPorIdProducto() {
		return this.id_productoBusquedaPorIdBodegaPorIdProducto;
	}

	public void setid_productoBusquedaPorIdBodegaPorIdProducto(Long id_productoBusquedaPorIdBodegaPorIdProducto) {
		this.id_productoBusquedaPorIdBodegaPorIdProducto = id_productoBusquedaPorIdBodegaPorIdProducto;
	}

	public Long id_lineaBusquedaPorLineaGrupoCategoriaMarca=null;

	public Long getid_lineaBusquedaPorLineaGrupoCategoriaMarca() {
		return this.id_lineaBusquedaPorLineaGrupoCategoriaMarca;
	}

	public void setid_lineaBusquedaPorLineaGrupoCategoriaMarca(Long id_lineaBusquedaPorLineaGrupoCategoriaMarca) {
		this.id_lineaBusquedaPorLineaGrupoCategoriaMarca = id_lineaBusquedaPorLineaGrupoCategoriaMarca;
	}

;
	public Long id_linea_grupoBusquedaPorLineaGrupoCategoriaMarca=null;

	public Long getid_linea_grupoBusquedaPorLineaGrupoCategoriaMarca() {
		return this.id_linea_grupoBusquedaPorLineaGrupoCategoriaMarca;
	}

	public void setid_linea_grupoBusquedaPorLineaGrupoCategoriaMarca(Long id_linea_grupoBusquedaPorLineaGrupoCategoriaMarca) {
		this.id_linea_grupoBusquedaPorLineaGrupoCategoriaMarca = id_linea_grupoBusquedaPorLineaGrupoCategoriaMarca;
	}

;
	public Long id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarca=null;

	public Long getid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarca() {
		return this.id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarca;
	}

	public void setid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarca(Long id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarca) {
		this.id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarca = id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarca;
	}

;
	public Long id_linea_marcaBusquedaPorLineaGrupoCategoriaMarca=null;

	public Long getid_linea_marcaBusquedaPorLineaGrupoCategoriaMarca() {
		return this.id_linea_marcaBusquedaPorLineaGrupoCategoriaMarca;
	}

	public void setid_linea_marcaBusquedaPorLineaGrupoCategoriaMarca(Long id_linea_marcaBusquedaPorLineaGrupoCategoriaMarca) {
		this.id_linea_marcaBusquedaPorLineaGrupoCategoriaMarca = id_linea_marcaBusquedaPorLineaGrupoCategoriaMarca;
	}

	public Long id_lineaBusquedaPorLineaGrupoCategoriaMarcaProducto=null;

	public Long getid_lineaBusquedaPorLineaGrupoCategoriaMarcaProducto() {
		return this.id_lineaBusquedaPorLineaGrupoCategoriaMarcaProducto;
	}

	public void setid_lineaBusquedaPorLineaGrupoCategoriaMarcaProducto(Long id_lineaBusquedaPorLineaGrupoCategoriaMarcaProducto) {
		this.id_lineaBusquedaPorLineaGrupoCategoriaMarcaProducto = id_lineaBusquedaPorLineaGrupoCategoriaMarcaProducto;
	}

;
	public Long id_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProducto=null;

	public Long getid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProducto() {
		return this.id_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProducto;
	}

	public void setid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProducto(Long id_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProducto) {
		this.id_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProducto = id_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProducto;
	}

;
	public Long id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProducto=null;

	public Long getid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProducto() {
		return this.id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProducto;
	}

	public void setid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProducto(Long id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProducto) {
		this.id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProducto = id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProducto;
	}

;
	public Long id_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProducto=null;

	public Long getid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProducto() {
		return this.id_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProducto;
	}

	public void setid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProducto(Long id_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProducto) {
		this.id_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProducto = id_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProducto;
	}

;
	public Long id_productoBusquedaPorLineaGrupoCategoriaMarcaProducto=-1L;

	public Long getid_productoBusquedaPorLineaGrupoCategoriaMarcaProducto() {
		return this.id_productoBusquedaPorLineaGrupoCategoriaMarcaProducto;
	}

	public void setid_productoBusquedaPorLineaGrupoCategoriaMarcaProducto(Long id_productoBusquedaPorLineaGrupoCategoriaMarcaProducto) {
		this.id_productoBusquedaPorLineaGrupoCategoriaMarcaProducto = id_productoBusquedaPorLineaGrupoCategoriaMarcaProducto;
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

	public Long id_estado_precioFK_IdEstadoPrecio=-1L;

	public Long getid_estado_precioFK_IdEstadoPrecio() {
		return this.id_estado_precioFK_IdEstadoPrecio;
	}

	public void setid_estado_precioFK_IdEstadoPrecio(Long id_estado_precioFK_IdEstadoPrecio) {
		this.id_estado_precioFK_IdEstadoPrecio = id_estado_precioFK_IdEstadoPrecio;
	}

	public Long id_lineaFK_IdLinea=null;

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

	public Long id_rango_unidad_ventaFK_IdRangoUnidadVenta=-1L;

	public Long getid_rango_unidad_ventaFK_IdRangoUnidadVenta() {
		return this.id_rango_unidad_ventaFK_IdRangoUnidadVenta;
	}

	public void setid_rango_unidad_ventaFK_IdRangoUnidadVenta(Long id_rango_unidad_ventaFK_IdRangoUnidadVenta) {
		this.id_rango_unidad_ventaFK_IdRangoUnidadVenta = id_rango_unidad_ventaFK_IdRangoUnidadVenta;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_precioFK_IdTipoPrecio=-1L;

	public Long getid_tipo_precioFK_IdTipoPrecio() {
		return this.id_tipo_precioFK_IdTipoPrecio;
	}

	public void setid_tipo_precioFK_IdTipoPrecio(Long id_tipo_precioFK_IdTipoPrecio) {
		this.id_tipo_precioFK_IdTipoPrecio = id_tipo_precioFK_IdTipoPrecio;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PrecioLogic getPrecioLogic()	{		
		return precioLogic;
	}

	public void setPrecioLogic(PrecioLogic precioLogic) {
		this.precioLogic = precioLogic;
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
	
	public Boolean getIsEsNuevoPrecio() {
		return isEsNuevoPrecio;
	}

	public void setIsEsNuevoPrecio(Boolean isEsNuevoPrecio) {
		this.isEsNuevoPrecio = isEsNuevoPrecio;
	}

	public Boolean getEsParaAccionDesdeFormularioPrecio() {
		return esParaAccionDesdeFormularioPrecio;
	}
	
	public void setEsParaAccionDesdeFormularioPrecio(Boolean esParaAccionDesdeFormularioPrecio) {
		this.esParaAccionDesdeFormularioPrecio = esParaAccionDesdeFormularioPrecio;
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

			if(this.precioSessionBean==null) {
				this.precioSessionBean=new PrecioSessionBean();
			}

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(precioSessionBean.getlidEmpresaActual());
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

			if(this.precioSessionBean==null) {
				this.precioSessionBean=new PrecioSessionBean();
			}

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(precioSessionBean.getlidSucursalActual());
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

			if(this.precioSessionBean==null) {
				this.precioSessionBean=new PrecioSessionBean();
			}

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(precioSessionBean.getlidBodegaActual());
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

			if(this.precioSessionBean==null) {
				this.precioSessionBean=new PrecioSessionBean();
			}

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(precioSessionBean.getlidProductoActual());
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

			if(this.precioSessionBean==null) {
				this.precioSessionBean=new PrecioSessionBean();
			}

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(precioSessionBean.getlidLineaActual());
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

			if(this.precioSessionBean==null) {
				this.precioSessionBean=new PrecioSessionBean();
			}

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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
					lineaLogic.getEntityWithConnection(precioSessionBean.getlidLineaGrupoActual());
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

			if(this.precioSessionBean==null) {
				this.precioSessionBean=new PrecioSessionBean();
			}

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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
					lineaLogic.getEntityWithConnection(precioSessionBean.getlidLineaCategoriaActual());
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

			if(this.precioSessionBean==null) {
				this.precioSessionBean=new PrecioSessionBean();
			}

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
					lineaLogic.getEntityWithConnection(precioSessionBean.getlidLineaMarcaActual());
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

	public void cargarCombosRangoUnidadVentasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.rangounidadventasForeignKey=new ArrayList<RangoUnidadVenta>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			RangoUnidadVentaLogic rangounidadventaLogic=new RangoUnidadVentaLogic();

			//rangounidadventaLogic.getRangoUnidadVentaDataAccess().setIsForForeingKeyData(true);

			if(this.precioSessionBean==null) {
				this.precioSessionBean=new PrecioSessionBean();
			}

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionRangoUnidadVenta()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//rangounidadventaLogic.getRangoUnidadVentaDataAccess().setIsForForeingKeyData(true);

					rangounidadventaLogic.getTodosRangoUnidadVentasWithConnection(sFinalQuery,new Pagination());

					this.rangounidadventasForeignKey=rangounidadventaLogic.getRangoUnidadVentas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaRangoUnidadVenta(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					rangounidadventaLogic.getEntityWithConnection(precioSessionBean.getlidRangoUnidadVentaActual());
					this.rangounidadventasForeignKey.add(rangounidadventaLogic.getRangoUnidadVenta());
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

	public void cargarCombosTipoPreciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipopreciosForeignKey=new ArrayList<TipoPrecio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoPrecioLogic tipoprecioLogic=new TipoPrecioLogic();

			//tipoprecioLogic.getTipoPrecioDataAccess().setIsForForeingKeyData(true);

			if(this.precioSessionBean==null) {
				this.precioSessionBean=new PrecioSessionBean();
			}

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrecio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoprecioLogic.getTipoPrecioDataAccess().setIsForForeingKeyData(true);

					tipoprecioLogic.getTodosTipoPreciosWithConnection(sFinalQuery,new Pagination());

					this.tipopreciosForeignKey=tipoprecioLogic.getTipoPrecios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoPrecio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprecioLogic.getEntityWithConnection(precioSessionBean.getlidTipoPrecioActual());
					this.tipopreciosForeignKey.add(tipoprecioLogic.getTipoPrecio());
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

	public void cargarCombosEstadoPreciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadopreciosForeignKey=new ArrayList<EstadoPrecio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoPrecioLogic estadoprecioLogic=new EstadoPrecioLogic();

			//estadoprecioLogic.getEstadoPrecioDataAccess().setIsForForeingKeyData(true);

			if(this.precioSessionBean==null) {
				this.precioSessionBean=new PrecioSessionBean();
			}

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionEstadoPrecio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadoprecioLogic.getEstadoPrecioDataAccess().setIsForForeingKeyData(true);

					estadoprecioLogic.getTodosEstadoPreciosWithConnection(sFinalQuery,new Pagination());

					this.estadopreciosForeignKey=estadoprecioLogic.getEstadoPrecios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoPrecio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoprecioLogic.getEntityWithConnection(precioSessionBean.getlidEstadoPrecioActual());
					this.estadopreciosForeignKey.add(estadoprecioLogic.getEstadoPrecio());
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

					if(this.precio!=null) {
						this.precio.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) {
						this.jInternalFrameDetalleFormPrecio.jComboBoxid_empresaPrecio.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPrecio.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPrecio!=null) {
						if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_empresaPrecio.getItemCount()>0) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_empresaPrecio.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPrecioGenerico)throws Exception
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
				jComboBoxid_empresaPrecioGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPrecioGenerico!=null && jComboBoxid_empresaPrecioGenerico.getItemCount()>0) {
					jComboBoxid_empresaPrecioGenerico.setSelectedIndex(0);
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

					if(this.precio!=null) {
						this.precio.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) {
						this.jInternalFrameDetalleFormPrecio.jComboBoxid_sucursalPrecio.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalPrecio.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormPrecio!=null) {
						if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_sucursalPrecio.getItemCount()>0) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_sucursalPrecio.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalPrecioGenerico)throws Exception
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
				jComboBoxid_sucursalPrecioGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalPrecioGenerico!=null && jComboBoxid_sucursalPrecioGenerico.getItemCount()>0) {
					jComboBoxid_sucursalPrecioGenerico.setSelectedIndex(0);
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

					if(this.precio!=null) {
						this.precio.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) {
						this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaPrecio.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormPrecio!=null) {
						if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio.getItemCount()>0) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdBodegaPorIdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio!=null) {
						jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio!=null) {
							//jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.getItemCount()>0) {
								jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaPrecio!=null) {
						jComboBoxid_bodegaFK_IdBodegaPrecio.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaPrecio!=null) {
							//jComboBoxid_bodegaFK_IdBodegaPrecio.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaPrecio.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaPrecio.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaPrecioGenerico)throws Exception
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
				jComboBoxid_bodegaPrecioGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaPrecioGenerico!=null && jComboBoxid_bodegaPrecioGenerico.getItemCount()>0) {
					jComboBoxid_bodegaPrecioGenerico.setSelectedIndex(0);
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

					if(this.precio!=null) {
						this.precio.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) {
						this.jInternalFrameDetalleFormPrecio.jComboBoxid_productoPrecio.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoPrecio.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormPrecio!=null) {
						if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_productoPrecio.getItemCount()>0) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_productoPrecio.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdBodegaPorIdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoPrecio!=null) {
						jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoPrecio.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoPrecio!=null) {
							//jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoPrecio.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoPrecio.getItemCount()>0) {
								jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoPrecio.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarcaProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio!=null) {
						jComboBoxid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio!=null) {
							//jComboBoxid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.getItemCount()>0) {
								jComboBoxid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoPrecio!=null) {
						jComboBoxid_productoFK_IdProductoPrecio.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoPrecio!=null) {
							//jComboBoxid_productoFK_IdProductoPrecio.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoPrecio.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoPrecio.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoPrecioGenerico)throws Exception
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
				jComboBoxid_productoPrecioGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoPrecioGenerico!=null && jComboBoxid_productoPrecioGenerico.getItemCount()>0) {
					jComboBoxid_productoPrecioGenerico.setSelectedIndex(0);
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

					if(this.precio!=null) {
						this.precio.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) {
						this.jInternalFrameDetalleFormPrecio.jComboBoxid_lineaPrecio.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaPrecio.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormPrecio!=null) {
						if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_lineaPrecio.getItemCount()>0) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_lineaPrecio.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarca") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio!=null) {
						jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio!=null) {
							//jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio.getItemCount()>0) {
								jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarcaProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio!=null) {
						jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio!=null) {
							//jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.getItemCount()>0) {
								jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdLinea") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaFK_IdLineaPrecio!=null) {
						jComboBoxid_lineaFK_IdLineaPrecio.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaFK_IdLineaPrecio!=null) {
							//jComboBoxid_lineaFK_IdLineaPrecio.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaFK_IdLineaPrecio.getItemCount()>0) {
								jComboBoxid_lineaFK_IdLineaPrecio.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaPrecioGenerico)throws Exception
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
				jComboBoxid_lineaPrecioGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaPrecioGenerico!=null && jComboBoxid_lineaPrecioGenerico.getItemCount()>0) {
					jComboBoxid_lineaPrecioGenerico.setSelectedIndex(0);
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

					if(this.precio!=null) {
						this.precio.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) {
						this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_grupoPrecio.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoPrecio.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormPrecio!=null) {
						if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_grupoPrecio.getItemCount()>0) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_grupoPrecio.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarca") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio!=null) {
						jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio!=null) {
							//jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarcaProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio!=null) {
						jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio!=null) {
							//jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoPrecioGenerico)throws Exception
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
				jComboBoxid_linea_grupoPrecioGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoPrecioGenerico!=null && jComboBoxid_linea_grupoPrecioGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoPrecioGenerico.setSelectedIndex(0);
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

					if(this.precio!=null) {
						this.precio.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) {
						this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_categoriaPrecio.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaPrecio.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormPrecio!=null) {
						if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_categoriaPrecio.getItemCount()>0) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_categoriaPrecio.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarca") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio!=null) {
						jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio!=null) {
							//jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarcaProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio!=null) {
						jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio!=null) {
							//jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedIndex(0);
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
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaPrecioGenerico)throws Exception
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
				jComboBoxid_linea_categoriaPrecioGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaPrecioGenerico!=null && jComboBoxid_linea_categoriaPrecioGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaPrecioGenerico.setSelectedIndex(0);
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

					if(this.precio!=null) {
						this.precio.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) {
						this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_marcaPrecio.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaPrecio.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormPrecio!=null) {
						if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_marcaPrecio.getItemCount()>0) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_marcaPrecio.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarca") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio!=null) {
						jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio!=null) {
							//jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarcaProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio!=null) {
						jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio!=null) {
							//jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedIndex(0);
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
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaPrecioGenerico)throws Exception
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
				jComboBoxid_linea_marcaPrecioGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaPrecioGenerico!=null && jComboBoxid_linea_marcaPrecioGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaPrecioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualRangoUnidadVentaForeignKey(Long idRangoUnidadVentaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			RangoUnidadVenta  rangounidadventaTemp=null;

			for(RangoUnidadVenta rangounidadventaAux:rangounidadventasForeignKey) {
				if(rangounidadventaAux.getId()!=null && rangounidadventaAux.getId().equals(idRangoUnidadVentaSeleccionado)) {
					rangounidadventaTemp=rangounidadventaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(rangounidadventaTemp!=null) {

					if(this.precio!=null) {
						this.precio.setRangoUnidadVenta(rangounidadventaTemp);
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) {
						this.jInternalFrameDetalleFormPrecio.jComboBoxid_rango_unidad_ventaPrecio.setSelectedItem(rangounidadventaTemp);
					}
				} else {
					//jComboBoxid_rango_unidad_ventaPrecio.setSelectedItem(rangounidadventaTemp);
					if(this.jInternalFrameDetalleFormPrecio!=null) {
						if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_rango_unidad_ventaPrecio.getItemCount()>0) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_rango_unidad_ventaPrecio.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdRangoUnidadVenta") || sFormularioTipoBusqueda.equals("Todos")){
					if(rangounidadventaTemp!=null && jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio!=null) {
						jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio.setSelectedItem(rangounidadventaTemp);
					} else {
						if(jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio!=null) {
							//jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio.setSelectedItem(rangounidadventaTemp);
							if(jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio.getItemCount()>0) {
								jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio.setSelectedIndex(0);
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

	public String getActualRangoUnidadVentaForeignKeyDescripcion(Long idRangoUnidadVentaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			RangoUnidadVenta  rangounidadventaTemp=null;

			for(RangoUnidadVenta rangounidadventaAux:rangounidadventasForeignKey) {
				if(rangounidadventaAux.getId()!=null && rangounidadventaAux.getId().equals(idRangoUnidadVentaSeleccionado)) {
					rangounidadventaTemp=rangounidadventaAux;
					break;
				}
			}


			sDescripcion=RangoUnidadVentaConstantesFunciones.getRangoUnidadVentaDescripcion(rangounidadventaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualRangoUnidadVentaForeignKeyGenerico(Long idRangoUnidadVentaSeleccionado,JComboBox jComboBoxid_rango_unidad_ventaPrecioGenerico)throws Exception
	{
		try
		{
			RangoUnidadVenta  rangounidadventaTemp=null;

			for(RangoUnidadVenta rangounidadventaAux:rangounidadventasForeignKey) {
				if(rangounidadventaAux.getId()!=null && rangounidadventaAux.getId().equals(idRangoUnidadVentaSeleccionado)) {
					rangounidadventaTemp=rangounidadventaAux;
					break;
				}
			}

			if(rangounidadventaTemp!=null) {
				jComboBoxid_rango_unidad_ventaPrecioGenerico.setSelectedItem(rangounidadventaTemp);
			} else {
				if(jComboBoxid_rango_unidad_ventaPrecioGenerico!=null && jComboBoxid_rango_unidad_ventaPrecioGenerico.getItemCount()>0) {
					jComboBoxid_rango_unidad_ventaPrecioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoPrecioForeignKey(Long idTipoPrecioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoPrecio  tipoprecioTemp=null;

			for(TipoPrecio tipoprecioAux:tipopreciosForeignKey) {
				if(tipoprecioAux.getId()!=null && tipoprecioAux.getId().equals(idTipoPrecioSeleccionado)) {
					tipoprecioTemp=tipoprecioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoprecioTemp!=null) {

					if(this.precio!=null) {
						this.precio.setTipoPrecio(tipoprecioTemp);
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) {
						this.jInternalFrameDetalleFormPrecio.jComboBoxid_tipo_precioPrecio.setSelectedItem(tipoprecioTemp);
					}
				} else {
					//jComboBoxid_tipo_precioPrecio.setSelectedItem(tipoprecioTemp);
					if(this.jInternalFrameDetalleFormPrecio!=null) {
						if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_tipo_precioPrecio.getItemCount()>0) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_tipo_precioPrecio.setSelectedIndex(0);
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

	public String getActualTipoPrecioForeignKeyDescripcion(Long idTipoPrecioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoPrecio  tipoprecioTemp=null;

			for(TipoPrecio tipoprecioAux:tipopreciosForeignKey) {
				if(tipoprecioAux.getId()!=null && tipoprecioAux.getId().equals(idTipoPrecioSeleccionado)) {
					tipoprecioTemp=tipoprecioAux;
					break;
				}
			}


			sDescripcion=TipoPrecioConstantesFunciones.getTipoPrecioDescripcion(tipoprecioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoPrecioForeignKeyGenerico(Long idTipoPrecioSeleccionado,JComboBox jComboBoxid_tipo_precioPrecioGenerico)throws Exception
	{
		try
		{
			TipoPrecio  tipoprecioTemp=null;

			for(TipoPrecio tipoprecioAux:tipopreciosForeignKey) {
				if(tipoprecioAux.getId()!=null && tipoprecioAux.getId().equals(idTipoPrecioSeleccionado)) {
					tipoprecioTemp=tipoprecioAux;
					break;
				}
			}

			if(tipoprecioTemp!=null) {
				jComboBoxid_tipo_precioPrecioGenerico.setSelectedItem(tipoprecioTemp);
			} else {
				if(jComboBoxid_tipo_precioPrecioGenerico!=null && jComboBoxid_tipo_precioPrecioGenerico.getItemCount()>0) {
					jComboBoxid_tipo_precioPrecioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoPrecioForeignKey(Long idEstadoPrecioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoPrecio  estadoprecioTemp=null;

			for(EstadoPrecio estadoprecioAux:estadopreciosForeignKey) {
				if(estadoprecioAux.getId()!=null && estadoprecioAux.getId().equals(idEstadoPrecioSeleccionado)) {
					estadoprecioTemp=estadoprecioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadoprecioTemp!=null) {

					if(this.precio!=null) {
						this.precio.setEstadoPrecio(estadoprecioTemp);
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) {
						this.jInternalFrameDetalleFormPrecio.jComboBoxid_estado_precioPrecio.setSelectedItem(estadoprecioTemp);
					}
				} else {
					//jComboBoxid_estado_precioPrecio.setSelectedItem(estadoprecioTemp);
					if(this.jInternalFrameDetalleFormPrecio!=null) {
						if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_estado_precioPrecio.getItemCount()>0) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_estado_precioPrecio.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstadoPrecio") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadoprecioTemp!=null && jComboBoxid_estado_precioFK_IdEstadoPrecioPrecio!=null) {
						jComboBoxid_estado_precioFK_IdEstadoPrecioPrecio.setSelectedItem(estadoprecioTemp);
					} else {
						if(jComboBoxid_estado_precioFK_IdEstadoPrecioPrecio!=null) {
							//jComboBoxid_estado_precioFK_IdEstadoPrecioPrecio.setSelectedItem(estadoprecioTemp);
							if(jComboBoxid_estado_precioFK_IdEstadoPrecioPrecio.getItemCount()>0) {
								jComboBoxid_estado_precioFK_IdEstadoPrecioPrecio.setSelectedIndex(0);
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

	public String getActualEstadoPrecioForeignKeyDescripcion(Long idEstadoPrecioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoPrecio  estadoprecioTemp=null;

			for(EstadoPrecio estadoprecioAux:estadopreciosForeignKey) {
				if(estadoprecioAux.getId()!=null && estadoprecioAux.getId().equals(idEstadoPrecioSeleccionado)) {
					estadoprecioTemp=estadoprecioAux;
					break;
				}
			}


			sDescripcion=EstadoPrecioConstantesFunciones.getEstadoPrecioDescripcion(estadoprecioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoPrecioForeignKeyGenerico(Long idEstadoPrecioSeleccionado,JComboBox jComboBoxid_estado_precioPrecioGenerico)throws Exception
	{
		try
		{
			EstadoPrecio  estadoprecioTemp=null;

			for(EstadoPrecio estadoprecioAux:estadopreciosForeignKey) {
				if(estadoprecioAux.getId()!=null && estadoprecioAux.getId().equals(idEstadoPrecioSeleccionado)) {
					estadoprecioTemp=estadoprecioAux;
					break;
				}
			}

			if(estadoprecioTemp!=null) {
				jComboBoxid_estado_precioPrecioGenerico.setSelectedItem(estadoprecioTemp);
			} else {
				if(jComboBoxid_estado_precioPrecioGenerico!=null && jComboBoxid_estado_precioPrecioGenerico.getItemCount()>0) {
					jComboBoxid_estado_precioPrecioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Precio precio,JComboBox jComboBoxid_empresaPrecioGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPrecioGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPrecio.jComboBoxid_empresaPrecio.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPrecioGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				precio.setid_empresa(empresaAux.getId());
				precio.setempresa_descripcion(PrecioConstantesFunciones.getEmpresaDescripcion(empresaAux));
				precio.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(Precio precio,JComboBox jComboBoxid_sucursalPrecioGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalPrecioGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormPrecio.jComboBoxid_sucursalPrecio.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalPrecioGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				precio.setid_sucursal(sucursalAux.getId());
				precio.setsucursal_descripcion(PrecioConstantesFunciones.getSucursalDescripcion(sucursalAux));
				precio.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(Precio precio,JComboBox jComboBoxid_bodegaPrecioGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaPrecioGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaPrecioGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				precio.setid_bodega(bodegaAux.getId());
				precio.setbodega_descripcion(PrecioConstantesFunciones.getBodegaDescripcion(bodegaAux));
				precio.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(Precio precio,JComboBox jComboBoxid_productoPrecioGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoPrecioGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormPrecio.jComboBoxid_productoPrecio.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoPrecioGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				precio.setid_producto(productoAux.getId());
				precio.setproducto_descripcion(PrecioConstantesFunciones.getProductoDescripcion(productoAux));
				precio.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(Precio precio,JComboBox jComboBoxid_lineaPrecioGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaPrecioGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormPrecio.jComboBoxid_lineaPrecio.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaPrecioGenerico.getSelectedItem();
			}

			if(lineaAux!=null) {
				precio.setid_linea(lineaAux.getId());
				precio.setlinea_descripcion(PrecioConstantesFunciones.getLineaDescripcion(lineaAux));
				precio.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(Precio precio,JComboBox jComboBoxid_linea_grupoPrecioGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoPrecioGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_grupoPrecio.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoPrecioGenerico.getSelectedItem();
			}

			if(lineaAux!=null) {
				precio.setid_linea_grupo(lineaAux.getId());
				precio.setlineagrupo_descripcion(PrecioConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				precio.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(Precio precio,JComboBox jComboBoxid_linea_categoriaPrecioGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaPrecioGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_categoriaPrecio.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaPrecioGenerico.getSelectedItem();
			}

			if(lineaAux!=null) {
				precio.setid_linea_categoria(lineaAux.getId());
				precio.setlineacategoria_descripcion(PrecioConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				precio.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(Precio precio,JComboBox jComboBoxid_linea_marcaPrecioGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaPrecioGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_marcaPrecio.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaPrecioGenerico.getSelectedItem();
			}

			if(lineaAux!=null) {
				precio.setid_linea_marca(lineaAux.getId());
				precio.setlineamarca_descripcion(PrecioConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				precio.setLineaMarca(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarRangoUnidadVentaForeignKey(Precio precio,JComboBox jComboBoxid_rango_unidad_ventaPrecioGenerico)throws Exception
	{
		try
		{
			RangoUnidadVenta  rangounidadventaAux=new RangoUnidadVenta();

			if(jComboBoxid_rango_unidad_ventaPrecioGenerico==null) {
				rangounidadventaAux=(RangoUnidadVenta)this.jInternalFrameDetalleFormPrecio.jComboBoxid_rango_unidad_ventaPrecio.getSelectedItem();
			} else {
				rangounidadventaAux=(RangoUnidadVenta)jComboBoxid_rango_unidad_ventaPrecioGenerico.getSelectedItem();
			}

			if(rangounidadventaAux!=null && rangounidadventaAux.getId()!=null) {
				precio.setid_rango_unidad_venta(rangounidadventaAux.getId());
				precio.setrangounidadventa_descripcion(PrecioConstantesFunciones.getRangoUnidadVentaDescripcion(rangounidadventaAux));
				precio.setRangoUnidadVenta(rangounidadventaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoPrecioForeignKey(Precio precio,JComboBox jComboBoxid_tipo_precioPrecioGenerico)throws Exception
	{
		try
		{
			TipoPrecio  tipoprecioAux=new TipoPrecio();

			if(jComboBoxid_tipo_precioPrecioGenerico==null) {
				tipoprecioAux=(TipoPrecio)this.jInternalFrameDetalleFormPrecio.jComboBoxid_tipo_precioPrecio.getSelectedItem();
			} else {
				tipoprecioAux=(TipoPrecio)jComboBoxid_tipo_precioPrecioGenerico.getSelectedItem();
			}

			if(tipoprecioAux!=null && tipoprecioAux.getId()!=null) {
				precio.setid_tipo_precio(tipoprecioAux.getId());
				precio.settipoprecio_descripcion(PrecioConstantesFunciones.getTipoPrecioDescripcion(tipoprecioAux));
				precio.setTipoPrecio(tipoprecioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoPrecioForeignKey(Precio precio,JComboBox jComboBoxid_estado_precioPrecioGenerico)throws Exception
	{
		try
		{
			EstadoPrecio  estadoprecioAux=new EstadoPrecio();

			if(jComboBoxid_estado_precioPrecioGenerico==null) {
				estadoprecioAux=(EstadoPrecio)this.jInternalFrameDetalleFormPrecio.jComboBoxid_estado_precioPrecio.getSelectedItem();
			} else {
				estadoprecioAux=(EstadoPrecio)jComboBoxid_estado_precioPrecioGenerico.getSelectedItem();
			}

			if(estadoprecioAux!=null && estadoprecioAux.getId()!=null) {
				precio.setid_estado_precio(estadoprecioAux.getId());
				precio.setestadoprecio_descripcion(PrecioConstantesFunciones.getEstadoPrecioDescripcion(estadoprecioAux));
				precio.setEstadoPrecio(estadoprecioAux);			}
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

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) { 
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_empresaPrecio.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPrecio.jComboBoxid_empresaPrecio.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) { 
					}

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) { 
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_sucursalPrecio.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormPrecio.jComboBoxid_sucursalPrecio.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) { 
					}

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) { 
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) { 
					}

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdBodegaPorIdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.addItem(bodega);
							}
						}

						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaPrecio.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaPrecio.addItem(bodega);
							}
						}

						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) { 
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_productoPrecio.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormPrecio.jComboBoxid_productoPrecio.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) { 
					}

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdBodegaPorIdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoPrecio.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoPrecio.addItem(producto);
							}
						}

						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarcaProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.addItem(producto);
							}
						}

						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoPrecio.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoPrecio.addItem(producto);
							}
						}

						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) { 
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_lineaPrecio.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormPrecio.jComboBoxid_lineaPrecio.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) { 
					}

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarca") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio.addItem(linea);
							}
						}

						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarcaProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.addItem(linea);
							}
						}

						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdLinea") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaFK_IdLineaPrecio.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaFK_IdLineaPrecio.addItem(linea);
							}
						}

						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) { 
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_grupoPrecio.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_grupoPrecio.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) { 
					}

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarca") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio.addItem(lineagrupo);
							}
						}

						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarcaProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.addItem(lineagrupo);
							}
						}

						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) { 
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_categoriaPrecio.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_categoriaPrecio.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) { 
					}

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarca") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio.addItem(lineacategoria);
							}
						}

						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarcaProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.addItem(lineacategoria);
							}
						}

						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) { 
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_marcaPrecio.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_marcaPrecio.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) { 
					}

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarca") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio.addItem(lineamarca);
							}
						}

						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarcaProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.addItem(lineamarca);
							}
						}

						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameRangoUnidadVentasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingRangoUnidadVenta=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) { 
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_rango_unidad_ventaPrecio.removeAllItems();

							for(RangoUnidadVenta rangounidadventa:this.rangounidadventasForeignKey) {
								this.jInternalFrameDetalleFormPrecio.jComboBoxid_rango_unidad_ventaPrecio.addItem(rangounidadventa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) { 
					}

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdRangoUnidadVenta") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio.removeAllItems();

							for(RangoUnidadVenta rangounidadventa:this.rangounidadventasForeignKey) {
								this.jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio.addItem(rangounidadventa);
							}
						}

						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoPreciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoPrecio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) { 
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_tipo_precioPrecio.removeAllItems();

							for(TipoPrecio tipoprecio:this.tipopreciosForeignKey) {
								this.jInternalFrameDetalleFormPrecio.jComboBoxid_tipo_precioPrecio.addItem(tipoprecio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) { 
					}

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoPreciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoPrecio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) { 
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_estado_precioPrecio.removeAllItems();

							for(EstadoPrecio estadoprecio:this.estadopreciosForeignKey) {
								this.jInternalFrameDetalleFormPrecio.jComboBoxid_estado_precioPrecio.addItem(estadoprecio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPrecio!=null) { 
					}

					if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstadoPrecio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_precioFK_IdEstadoPrecioPrecio.removeAllItems();

							for(EstadoPrecio estadoprecio:this.estadopreciosForeignKey) {
								this.jComboBoxid_estado_precioFK_IdEstadoPrecioPrecio.addItem(estadoprecio);
							}
						}

						if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_empresaPrecio.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_empresaPrecio.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_sucursalPrecio.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_sucursalPrecio.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaPrecio.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaPrecio.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_productoPrecio.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_productoPrecio.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoPrecio.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoPrecio.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoPrecio.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoPrecio.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_lineaPrecio.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_lineaPrecio.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaFK_IdLineaPrecio.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaFK_IdLineaPrecio.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_grupoPrecio.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_grupoPrecio.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_categoriaPrecio.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_categoriaPrecio.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_marcaPrecio.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_marcaPrecio.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameRangoUnidadVentaForeignKey(RangoUnidadVenta rangounidadventa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_rango_unidad_ventaPrecio.setSelectedItem(rangounidadventa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_rango_unidad_ventaPrecio.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio.setSelectedItem(rangounidadventa);
						} else {
							this.jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoPrecioForeignKey(TipoPrecio tipoprecio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_tipo_precioPrecio.setSelectedItem(tipoprecio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_tipo_precioPrecio.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEstadoPrecioForeignKey(EstadoPrecio estadoprecio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_estado_precioPrecio.setSelectedItem(estadoprecio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPrecio!=null) {
							this.jInternalFrameDetalleFormPrecio.jComboBoxid_estado_precioPrecio.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_precioFK_IdEstadoPrecioPrecio.setSelectedItem(estadoprecio);
						} else {
							this.jComboBoxid_estado_precioFK_IdEstadoPrecioPrecio.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPrecio() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PrecioConstantesFunciones.refrescarForeignKeysDescripcionesPrecio(this.precioLogic.getPrecios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PrecioConstantesFunciones.refrescarForeignKeysDescripcionesPrecio(this.precios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(Linea.class));
		classes.add(new Classe(RangoUnidadVenta.class));
		classes.add(new Classe(TipoPrecio.class));
		classes.add(new Classe(EstadoPrecio.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//precioLogic.setPrecios(this.precios);
			precioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PrecioParameterReturnGeneral getPrecioParameterGeneral() {
		return this.precioParameterGeneral;
	}
	
	public void setPrecioParameterGeneral(PrecioParameterReturnGeneral precioParameterGeneral) {
		this.precioParameterGeneral = precioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPrecio() {
		return isPermisoTodoPrecio;
	}

	public void setIsPermisoTodoPrecio(Boolean isPermisoTodoPrecio) {
		this.isPermisoTodoPrecio = isPermisoTodoPrecio;
	}

	public Boolean getIsPermisoNuevoPrecio() {
		return isPermisoNuevoPrecio;
	}

	public void setIsPermisoNuevoPrecio(Boolean isPermisoNuevoPrecio) {
		this.isPermisoNuevoPrecio = isPermisoNuevoPrecio;
	}

	public Boolean getIsPermisoActualizarPrecio() {
		return isPermisoActualizarPrecio;
	}

	public void setIsPermisoActualizarPrecio(Boolean isPermisoActualizarPrecio) {
		this.isPermisoActualizarPrecio = isPermisoActualizarPrecio;
	}

	public Boolean getIsPermisoEliminarPrecio() {
		return isPermisoEliminarPrecio;
	}

	public void setIsPermisoEliminarPrecio(Boolean isPermisoEliminarPrecio) {
		this.isPermisoEliminarPrecio = isPermisoEliminarPrecio;
	}

	public Boolean getIsPermisoGuardarCambiosPrecio() {
		return isPermisoGuardarCambiosPrecio;
	}

	public void setIsPermisoGuardarCambiosPrecio(Boolean isPermisoGuardarCambiosPrecio) {
		this.isPermisoGuardarCambiosPrecio = isPermisoGuardarCambiosPrecio;
	}
	
	public Boolean getIsPermisoConsultaPrecio() {
		return isPermisoConsultaPrecio;
	}

	public void setIsPermisoConsultaPrecio(Boolean isPermisoConsultaPrecio) {
		this.isPermisoConsultaPrecio = isPermisoConsultaPrecio;
	}

	public Boolean getIsPermisoBusquedaPrecio() {
		return isPermisoBusquedaPrecio;
	}

	public void setIsPermisoBusquedaPrecio(Boolean isPermisoBusquedaPrecio) {
		this.isPermisoBusquedaPrecio = isPermisoBusquedaPrecio;
	}

	public Boolean getIsPermisoReportePrecio() {
		return isPermisoReportePrecio;
	}

	public void setIsPermisoReportePrecio(Boolean isPermisoReportePrecio) {
		this.isPermisoReportePrecio = isPermisoReportePrecio;
	}
	
	public Boolean getIsPermisoPaginacionMedioPrecio() {
		return isPermisoPaginacionMedioPrecio;
	}

	public void setIsPermisoPaginacionMedioPrecio(Boolean isPermisoPaginacionMedioPrecio) {
		this.isPermisoPaginacionMedioPrecio = isPermisoPaginacionMedioPrecio;
	}
	
	public Boolean getIsPermisoPaginacionTodoPrecio() {
		return isPermisoPaginacionTodoPrecio;
	}

	public void setIsPermisoPaginacionTodoPrecio(Boolean isPermisoPaginacionTodoPrecio) {
		this.isPermisoPaginacionTodoPrecio = isPermisoPaginacionTodoPrecio;
	}
	
	public Boolean getIsPermisoPaginacionAltoPrecio() {
		return isPermisoPaginacionAltoPrecio;
	}

	public void setIsPermisoPaginacionAltoPrecio(Boolean isPermisoPaginacionAltoPrecio) {
		this.isPermisoPaginacionAltoPrecio = isPermisoPaginacionAltoPrecio;
	}
	
	public Boolean getIsPermisoCopiarPrecio() {
		return isPermisoCopiarPrecio;
	}

	public void setIsPermisoCopiarPrecio(Boolean isPermisoCopiarPrecio) {
		this.isPermisoCopiarPrecio = isPermisoCopiarPrecio;
	}
	
	public Boolean getIsPermisoVerFormPrecio() {
		return isPermisoVerFormPrecio;
	}

	public void setIsPermisoVerFormPrecio(Boolean isPermisoVerFormPrecio) {
		this.isPermisoVerFormPrecio = isPermisoVerFormPrecio;
	}
	
	public Boolean getIsPermisoDuplicarPrecio() {
		return isPermisoDuplicarPrecio;
	}

	public void setIsPermisoDuplicarPrecio(Boolean isPermisoDuplicarPrecio) {
		this.isPermisoDuplicarPrecio = isPermisoDuplicarPrecio;
	}
	
	public Boolean getIsPermisoOrdenPrecio() {
		return isPermisoOrdenPrecio;
	}

	public void setIsPermisoOrdenPrecio(Boolean isPermisoOrdenPrecio) {
		this.isPermisoOrdenPrecio = isPermisoOrdenPrecio;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPrecio() {
		return isVisibilidadCeldaNuevoPrecio;
	}

	public void setIsVisibilidadCeldaNuevoPrecio(Boolean isVisibilidadCeldaNuevoPrecio) {
		this.isVisibilidadCeldaNuevoPrecio = isVisibilidadCeldaNuevoPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPrecio() {
		return isVisibilidadCeldaDuplicarPrecio;
	}

	public void setIsVisibilidadCeldaDuplicarPrecio(Boolean isVisibilidadCeldaDuplicarPrecio) {
		this.isVisibilidadCeldaDuplicarPrecio = isVisibilidadCeldaDuplicarPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPrecio() {
		return isVisibilidadCeldaCopiarPrecio;
	}

	public void setIsVisibilidadCeldaCopiarPrecio(Boolean isVisibilidadCeldaCopiarPrecio) {
		this.isVisibilidadCeldaCopiarPrecio = isVisibilidadCeldaCopiarPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPrecio() {
		return isVisibilidadCeldaVerFormPrecio;
	}

	public void setIsVisibilidadCeldaVerFormPrecio(Boolean isVisibilidadCeldaVerFormPrecio) {
		this.isVisibilidadCeldaVerFormPrecio = isVisibilidadCeldaVerFormPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPrecio() {
		return isVisibilidadCeldaOrdenPrecio;
	}

	public void setIsVisibilidadCeldaOrdenPrecio(Boolean isVisibilidadCeldaOrdenPrecio) {
		this.isVisibilidadCeldaOrdenPrecio = isVisibilidadCeldaOrdenPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPrecio() {
		return isVisibilidadCeldaNuevoRelacionesPrecio;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPrecio(Boolean isVisibilidadCeldaNuevoRelacionesPrecio) {
		this.isVisibilidadCeldaNuevoRelacionesPrecio = isVisibilidadCeldaNuevoRelacionesPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPrecio() {
		return isVisibilidadCeldaModificarPrecio;
	}

	public void setIsVisibilidadCeldaModificarPrecio(Boolean isVisibilidadCeldaModificarPrecio) {
		this.isVisibilidadCeldaModificarPrecio = isVisibilidadCeldaModificarPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPrecio() {
		return isVisibilidadCeldaActualizarPrecio;
	}

	public void setIsVisibilidadCeldaActualizarPrecio(Boolean isVisibilidadCeldaActualizarPrecio) {
		this.isVisibilidadCeldaActualizarPrecio = isVisibilidadCeldaActualizarPrecio;
	}

	public Boolean getIsVisibilidadCeldaEliminarPrecio() {
		return isVisibilidadCeldaEliminarPrecio;
	}

	public void setIsVisibilidadCeldaEliminarPrecio(Boolean isVisibilidadCeldaEliminarPrecio) {
		this.isVisibilidadCeldaEliminarPrecio = isVisibilidadCeldaEliminarPrecio;
	}

	public Boolean getIsVisibilidadCeldaCancelarPrecio() {
		return isVisibilidadCeldaCancelarPrecio;
	}

	public void setIsVisibilidadCeldaCancelarPrecio(Boolean isVisibilidadCeldaCancelarPrecio) {
		this.isVisibilidadCeldaCancelarPrecio = isVisibilidadCeldaCancelarPrecio;
	}

	public Boolean getIsVisibilidadCeldaGuardarPrecio() {
		return isVisibilidadCeldaGuardarPrecio;
	}

	public void setIsVisibilidadCeldaGuardarPrecio(Boolean isVisibilidadCeldaGuardarPrecio) {
		this.isVisibilidadCeldaGuardarPrecio = isVisibilidadCeldaGuardarPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPrecio() {
		return isVisibilidadCeldaGuardarCambiosPrecio;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPrecio(Boolean isVisibilidadCeldaGuardarCambiosPrecio) {
		this.isVisibilidadCeldaGuardarCambiosPrecio = isVisibilidadCeldaGuardarCambiosPrecio;
	}
		
	public PrecioSessionBean getprecioSessionBean() {
		return this.precioSessionBean;
	}
	
	public void setprecioSessionBean(PrecioSessionBean precioSessionBean) {
		this.precioSessionBean=precioSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdBodegaPorIdProducto() {
		return this.isVisibilidadBusquedaPorIdBodegaPorIdProducto;
	}

	public void setisVisibilidadBusquedaPorIdBodegaPorIdProducto(Boolean isVisibilidadBusquedaPorIdBodegaPorIdProducto) {
		this.isVisibilidadBusquedaPorIdBodegaPorIdProducto=isVisibilidadBusquedaPorIdBodegaPorIdProducto;
	}

	public Boolean getisVisibilidadBusquedaPorLineaGrupoCategoriaMarca() {
		return this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca;
	}

	public void setisVisibilidadBusquedaPorLineaGrupoCategoriaMarca(Boolean isVisibilidadBusquedaPorLineaGrupoCategoriaMarca) {
		this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca=isVisibilidadBusquedaPorLineaGrupoCategoriaMarca;
	}

	public Boolean getisVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto() {
		return this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto;
	}

	public void setisVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto(Boolean isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto) {
		this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto=isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto;
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

	public Boolean getisVisibilidadFK_IdEstadoPrecio() {
		return this.isVisibilidadFK_IdEstadoPrecio;
	}

	public void setisVisibilidadFK_IdEstadoPrecio(Boolean isVisibilidadFK_IdEstadoPrecio) {
		this.isVisibilidadFK_IdEstadoPrecio=isVisibilidadFK_IdEstadoPrecio;
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

	public Boolean getisVisibilidadFK_IdRangoUnidadVenta() {
		return this.isVisibilidadFK_IdRangoUnidadVenta;
	}

	public void setisVisibilidadFK_IdRangoUnidadVenta(Boolean isVisibilidadFK_IdRangoUnidadVenta) {
		this.isVisibilidadFK_IdRangoUnidadVenta=isVisibilidadFK_IdRangoUnidadVenta;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoPrecio() {
		return this.isVisibilidadFK_IdTipoPrecio;
	}

	public void setisVisibilidadFK_IdTipoPrecio(Boolean isVisibilidadFK_IdTipoPrecio) {
		this.isVisibilidadFK_IdTipoPrecio=isVisibilidadFK_IdTipoPrecio;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPrecio(Precio precio)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(precio,null);
				this.setActualParaGuardarSucursalForeignKey(precio,null);
				this.setActualParaGuardarBodegaForeignKey(precio,null);
				this.setActualParaGuardarProductoForeignKey(precio,null);
				this.setActualParaGuardarLineaForeignKey(precio,null);
				this.setActualParaGuardarLineaGrupoForeignKey(precio,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(precio,null);
				this.setActualParaGuardarLineaMarcaForeignKey(precio,null);
				this.setActualParaGuardarRangoUnidadVentaForeignKey(precio,null);
				this.setActualParaGuardarTipoPrecioForeignKey(precio,null);
				this.setActualParaGuardarEstadoPrecioForeignKey(precio,null);
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
	
	public void bugActualizarReferenciaActual(Precio precio,Precio precioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPrecio(precio);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		precioAux.setId(precio.getId());
		precioAux.setVersionRow(precio.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPrecio();
		
			int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPrecio(this.precio,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = precioValidator.getInvalidValues(this.precio);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			precioLogic.setDatosCliente(datosCliente);
			precioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				precioAux=new  Precio();
				
				precioAux.setIsNew(true);
				precioAux.setIsChanged(true);
				
				precioAux.setPrecioOriginal(this.precio);
				
				precioAux.setId(this.precio.getId());	
				precioAux.setVersionRow(this.precio.getVersionRow());	
				precioAux.setid_empresa(this.precio.getid_empresa());	
				precioAux.setid_sucursal(this.precio.getid_sucursal());	
				precioAux.setid_bodega(this.precio.getid_bodega());	
				precioAux.setid_producto(this.precio.getid_producto());	
				precioAux.setid_linea(this.precio.getid_linea());	
				precioAux.setid_linea_grupo(this.precio.getid_linea_grupo());	
				precioAux.setid_linea_categoria(this.precio.getid_linea_categoria());	
				precioAux.setid_linea_marca(this.precio.getid_linea_marca());	
				precioAux.setid_rango_unidad_venta(this.precio.getid_rango_unidad_venta());	
				precioAux.setid_tipo_precio(this.precio.getid_tipo_precio());	
				precioAux.setprecio(this.precio.getprecio());	
				precioAux.setdescuento(this.precio.getdescuento());	
				precioAux.setprecio_minimo(this.precio.getprecio_minimo());	
				precioAux.setcon_impuesto(this.precio.getcon_impuesto());	
				precioAux.setid_estado_precio(this.precio.getid_estado_precio());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.precioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.precioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(precioAux,precioLogic.getPrecios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(precioAux,precios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.precioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.precioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						precioLogic.savePrecios();//WithConnection
						//precioLogic.getSetVersionRowPrecios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.precio,precioAux);
					
					this.refrescarForeignKeysDescripcionesPrecio();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.precioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.precioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								precioLogic.savePrecioRelaciones(precioAux);//WithConnection
								//precioLogic.getSetVersionRowPrecios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.precio,precioAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.precioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.precioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(precioAux,precioLogic.getPrecios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(precioAux,precios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.precio,precioAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				precioAux=new  Precio();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.precioSessionBean.getEsGuardarRelacionado() 
					|| (this.precioSessionBean.getEsGuardarRelacionado() && this.precio.getId()>=0)) {
						
					precioAux.setIsNew(false);
				}
				
				precioAux.setIsDeleted(false);
			
				precioAux.setId(this.precio.getId());	
				precioAux.setVersionRow(this.precio.getVersionRow());	
				precioAux.setid_empresa(this.precio.getid_empresa());	
				precioAux.setid_sucursal(this.precio.getid_sucursal());	
				precioAux.setid_bodega(this.precio.getid_bodega());	
				precioAux.setid_producto(this.precio.getid_producto());	
				precioAux.setid_linea(this.precio.getid_linea());	
				precioAux.setid_linea_grupo(this.precio.getid_linea_grupo());	
				precioAux.setid_linea_categoria(this.precio.getid_linea_categoria());	
				precioAux.setid_linea_marca(this.precio.getid_linea_marca());	
				precioAux.setid_rango_unidad_venta(this.precio.getid_rango_unidad_venta());	
				precioAux.setid_tipo_precio(this.precio.getid_tipo_precio());	
				precioAux.setprecio(this.precio.getprecio());	
				precioAux.setdescuento(this.precio.getdescuento());	
				precioAux.setprecio_minimo(this.precio.getprecio_minimo());	
				precioAux.setcon_impuesto(this.precio.getcon_impuesto());	
				precioAux.setid_estado_precio(this.precio.getid_estado_precio());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(precioAux,precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(precioAux,precios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.precioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.precioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						precioLogic.savePrecios();//WithConnection
						//precioLogic.getSetVersionRowPrecios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.precio,precioAux);
					
					this.refrescarForeignKeysDescripcionesPrecio();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.precioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.precioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								precioLogic.savePrecioRelaciones(precioAux);//WithConnection
								//precioLogic.getSetVersionRowPrecios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.precio,precioAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.precioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.precioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(precioAux,precioLogic.getPrecios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(precioAux,precios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.precio,precioAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				precioAux=new  Precio();
				
				precioAux.setIsNew(false);
				precioAux.setIsChanged(false);
				
				precioAux.setIsDeleted(true);
				
				precioAux.setId(this.precio.getId());	
				precioAux.setVersionRow(this.precio.getVersionRow());	
				precioAux.setid_empresa(this.precio.getid_empresa());	
				precioAux.setid_sucursal(this.precio.getid_sucursal());	
				precioAux.setid_bodega(this.precio.getid_bodega());	
				precioAux.setid_producto(this.precio.getid_producto());	
				precioAux.setid_linea(this.precio.getid_linea());	
				precioAux.setid_linea_grupo(this.precio.getid_linea_grupo());	
				precioAux.setid_linea_categoria(this.precio.getid_linea_categoria());	
				precioAux.setid_linea_marca(this.precio.getid_linea_marca());	
				precioAux.setid_rango_unidad_venta(this.precio.getid_rango_unidad_venta());	
				precioAux.setid_tipo_precio(this.precio.getid_tipo_precio());	
				precioAux.setprecio(this.precio.getprecio());	
				precioAux.setdescuento(this.precio.getdescuento());	
				precioAux.setprecio_minimo(this.precio.getprecio_minimo());	
				precioAux.setcon_impuesto(this.precio.getcon_impuesto());	
				precioAux.setid_estado_precio(this.precio.getid_estado_precio());	
				
				if(this.precioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.precioAux.getId()>=0) {	
						this.preciosEliminados.add(precioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(precioAux,precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(precioAux,precios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.precioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.precioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						precioLogic.savePrecios();//WithConnection
						//precioLogic.getSetVersionRowPrecios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.precioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.precioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								precioLogic.savePrecioRelaciones(precioAux);//WithConnection
								//precioLogic.getSetVersionRowPrecios();//WithConnection
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
							if(this.precioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.precioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(precioAux,precioLogic.getPrecios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(precioAux,precios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.getPrecios().addAll(this.preciosEliminados);
					
					precioLogic.savePrecios();//WithConnection
					//precioLogic.getSetVersionRowPrecios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPrecio();
				
				this.preciosEliminados= new ArrayList<Precio>();		
			}
			
			if(this.precioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.precioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Precio GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Precio",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.precio=precioAux;
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
      		//this.finishProcessPrecio();
      	}
		
	}	
	
	public void actualizarRelaciones(Precio precioLocal) throws Exception {
		
		if(this.precioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Precio precioLocal) throws Exception {	
		if(this.precioSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				precioLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				precioLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				precioLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				precioLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				precioLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				precioLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				precioLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				precioLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(RangoUnidadVentaDetalleFormJInternalFrame.class)) {
				RangoUnidadVentaBeanSwingJInternalFrame rangounidadventaBeanSwingJInternalFrameLocal=(RangoUnidadVentaBeanSwingJInternalFrame) ((RangoUnidadVentaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				rangounidadventaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoRangoUnidadVenta(rangounidadventaBeanSwingJInternalFrameLocal.getrangounidadventa(),true);
				rangounidadventaBeanSwingJInternalFrameLocal.actualizarLista(rangounidadventaBeanSwingJInternalFrameLocal.rangounidadventa,this.rangounidadventasForeignKey);

				rangounidadventaBeanSwingJInternalFrameLocal.actualizarRelaciones(rangounidadventaBeanSwingJInternalFrameLocal.rangounidadventa);

				precioLocal.setRangoUnidadVenta(rangounidadventaBeanSwingJInternalFrameLocal.rangounidadventa);

				this.addItemDefectoCombosForeignKeyRangoUnidadVenta();
				this.cargarCombosFrameRangoUnidadVentasForeignKey("Formulario");
				this.setActualRangoUnidadVentaForeignKey(rangounidadventaBeanSwingJInternalFrameLocal.rangounidadventa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoPrecioDetalleFormJInternalFrame.class)) {
				TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrameLocal=(TipoPrecioBeanSwingJInternalFrame) ((TipoPrecioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoprecioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoPrecio(tipoprecioBeanSwingJInternalFrameLocal.gettipoprecio(),true);
				tipoprecioBeanSwingJInternalFrameLocal.actualizarLista(tipoprecioBeanSwingJInternalFrameLocal.tipoprecio,this.tipopreciosForeignKey);

				tipoprecioBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoprecioBeanSwingJInternalFrameLocal.tipoprecio);

				precioLocal.setTipoPrecio(tipoprecioBeanSwingJInternalFrameLocal.tipoprecio);

				this.addItemDefectoCombosForeignKeyTipoPrecio();
				this.cargarCombosFrameTipoPreciosForeignKey("Formulario");
				this.setActualTipoPrecioForeignKey(tipoprecioBeanSwingJInternalFrameLocal.tipoprecio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoPrecioDetalleFormJInternalFrame.class)) {
				EstadoPrecioBeanSwingJInternalFrame estadoprecioBeanSwingJInternalFrameLocal=(EstadoPrecioBeanSwingJInternalFrame) ((EstadoPrecioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadoprecioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoPrecio(estadoprecioBeanSwingJInternalFrameLocal.getestadoprecio(),true);
				estadoprecioBeanSwingJInternalFrameLocal.actualizarLista(estadoprecioBeanSwingJInternalFrameLocal.estadoprecio,this.estadopreciosForeignKey);

				estadoprecioBeanSwingJInternalFrameLocal.actualizarRelaciones(estadoprecioBeanSwingJInternalFrameLocal.estadoprecio);

				precioLocal.setEstadoPrecio(estadoprecioBeanSwingJInternalFrameLocal.estadoprecio);

				this.addItemDefectoCombosForeignKeyEstadoPrecio();
				this.cargarCombosFrameEstadoPreciosForeignKey("Formulario");
				this.setActualEstadoPrecioForeignKey(estadoprecioBeanSwingJInternalFrameLocal.estadoprecio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPrecioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = precioValidator.getInvalidValues(this.precio);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Precio precio,List<Precio> precios) throws Exception {
		try	{		
			PrecioConstantesFunciones.actualizarLista(precio,precios,this.precioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Precio precio,List<Precio> precios) throws Exception {
		try	{			
			PrecioConstantesFunciones.actualizarSelectedLista(precio,precios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Precio> preciosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				preciosLocal=this.precioLogic.getPrecios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				preciosLocal=this.precios;
			}
			//ARCHITECTURE
		
			for(Precio precioLocal:preciosLocal) {
				if(this.permiteMantenimiento(precioLocal) && precioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PrecioConstantesFunciones.getPrecioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PrecioConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrecio.jLabelid_empresaPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrecioConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrecio.jLabelid_sucursalPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrecioConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrecio.jLabelid_bodegaPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrecioConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrecio.jLabelid_productoPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrecioConstantesFunciones.IDLINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrecio.jLabelid_lineaPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrecioConstantesFunciones.IDLINEAGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrecio.jLabelid_linea_grupoPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrecioConstantesFunciones.IDLINEACATEGORIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrecio.jLabelid_linea_categoriaPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrecioConstantesFunciones.IDLINEAMARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrecio.jLabelid_linea_marcaPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrecioConstantesFunciones.IDRANGOUNIDADVENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrecio.jLabelid_rango_unidad_ventaPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrecioConstantesFunciones.IDTIPOPRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrecio.jLabelid_tipo_precioPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrecioConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrecio.jLabelprecioPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrecioConstantesFunciones.DESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrecio.jLabeldescuentoPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrecioConstantesFunciones.PRECIOMINIMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrecio.jLabelprecio_minimoPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrecioConstantesFunciones.CONIMPUESTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrecio.jLabelcon_impuestoPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrecioConstantesFunciones.IDESTADOPRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrecio.jLabelid_estado_precioPrecio,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPrecio!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrecio.jLabelid_empresaPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrecio.jLabelid_sucursalPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrecio.jLabelid_bodegaPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrecio.jLabelid_productoPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrecio.jLabelid_lineaPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrecio.jLabelid_linea_grupoPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrecio.jLabelid_linea_categoriaPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrecio.jLabelid_linea_marcaPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrecio.jLabelid_rango_unidad_ventaPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrecio.jLabelid_tipo_precioPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrecio.jLabelprecioPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrecio.jLabeldescuentoPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrecio.jLabelprecio_minimoPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrecio.jLabelcon_impuestoPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrecio.jLabelid_estado_precioPrecio,"");
		
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
		this.iIdNuevoPrecio--;	
		
		
		this.precioAux=new Precio();
		
		this.precioAux.setId(this.iIdNuevoPrecio);
		this.precioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.precioLogic.getPrecios().add(this.precioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.precios.add(this.precioAux);
		}
		//ARCHITECTURE
		
		this.precio=this.precioAux;
		
		if(PrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPrecio(this.precio);
			this.setVariablesObjetoActualToFormularioForeignKeyPrecio(this.precio);
		}
				
		//this.setDefaultControlesPrecio();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPrecio();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPrecio();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPrecio();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPrecio(this.precioBean,this.precio,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PrecioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.precioSessionBean.getConGuardarRelaciones()) {
			classes=PrecioConstantesFunciones.getClassesRelationshipsOfPrecio(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.precioReturnGeneral=precioLogic.procesarEventosPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.precioLogic.getPrecios(),this.precio,this.precioParameterGeneral,this.isEsNuevoPrecio,classes);//this.precioLogic.getPrecio()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPrecio(this.precioReturnGeneral,this.precioBean,false);
		
		if(this.precioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPrecio(this.precioReturnGeneral.getPrecio());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPrecio(this.precioReturnGeneral.getPrecio());
		}
		
		if(this.precioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPrecio(this.precioReturnGeneral.getPrecio(),classes);//this.precioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPrecio(this.precio,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPrecio();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPrecio();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PrecioBeanSwingJInternalFrameAdditional.RecargarFormPrecio(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPrecio(false);
						
			if(precioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PrecioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPrecio();
			}
			
			this.actualizarVisualTableDatosPrecio();
			
			this.jTableDatosPrecio.setRowSelectionInterval(this.getIndiceNuevoPrecio(), this.getIndiceNuevoPrecio());
			
			this.seleccionarFilaTablaPrecioActual();
						
			this.actualizarEstadoCeldasBotonesPrecio("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPrecio(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPrecio.jTextFieldprecioPrecio.setEnabled(isHabilitar && this.precioConstantesFunciones.activarprecioPrecio);
		this.jInternalFrameDetalleFormPrecio.jTextFielddescuentoPrecio.setEnabled(isHabilitar && this.precioConstantesFunciones.activardescuentoPrecio);
		this.jInternalFrameDetalleFormPrecio.jTextFieldprecio_minimoPrecio.setEnabled(isHabilitar && this.precioConstantesFunciones.activarprecio_minimoPrecio);
		this.jInternalFrameDetalleFormPrecio.jCheckBoxcon_impuestoPrecio.setEnabled(isHabilitar && this.precioConstantesFunciones.activarcon_impuestoPrecio);	
		//
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_empresaPrecio.setEnabled(isHabilitar && this.precioConstantesFunciones.activarid_empresaPrecio);//
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_sucursalPrecio.setEnabled(isHabilitar && this.precioConstantesFunciones.activarid_sucursalPrecio);
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio.setEnabled(isHabilitar && this.precioConstantesFunciones.activarid_bodegaPrecio);
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_productoPrecio.setEnabled(isHabilitar && this.precioConstantesFunciones.activarid_productoPrecio);//
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_lineaPrecio.setEnabled(isHabilitar && this.precioConstantesFunciones.activarid_lineaPrecio);//
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_grupoPrecio.setEnabled(isHabilitar && this.precioConstantesFunciones.activarid_linea_grupoPrecio);//
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_categoriaPrecio.setEnabled(isHabilitar && this.precioConstantesFunciones.activarid_linea_categoriaPrecio);//
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_marcaPrecio.setEnabled(isHabilitar && this.precioConstantesFunciones.activarid_linea_marcaPrecio);
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_rango_unidad_ventaPrecio.setEnabled(isHabilitar && this.precioConstantesFunciones.activarid_rango_unidad_ventaPrecio);
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_tipo_precioPrecio.setEnabled(isHabilitar && this.precioConstantesFunciones.activarid_tipo_precioPrecio);
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_estado_precioPrecio.setEnabled(isHabilitar && this.precioConstantesFunciones.activarid_estado_precioPrecio);
	};
	
	public void setDefaultControlesPrecio() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPrecio(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.precioSessionBean.setConGuardarRelaciones(true);			
			this.precioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPrecio.jTabbedPaneRelacionesPrecio.setVisible(true);
			
					
		} else {
			//this.precioSessionBean.setConGuardarRelaciones(false);			
			this.precioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPrecio.jTabbedPaneRelacionesPrecio.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPrecio() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Precio precioAux:this.precioLogic.getPrecios()) {
				if(precioAux.getId().equals(this.iIdNuevoPrecio)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Precio precioAux:this.precios) {
				if(precioAux.getId().equals(this.iIdNuevoPrecio)) {
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
	
	public int getIndiceActualPrecio(Precio precio,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Precio precioAux:this.precioLogic.getPrecios()) {
				if(precioAux.getId().equals(precio.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Precio precioAux:this.precios) {
				if(precioAux.getId().equals(precio.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPrecio(Precio precioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Precio precioAux:this.precioLogic.getPrecios()) {
				if(precioAux.getPrecioOriginal().getId().equals(precioOriginal.getId())) {
					existe=true;
					precioOriginal.setId(precioAux.getId());
					precioOriginal.setVersionRow(precioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Precio precioAux:this.precios) {
				if(precioAux.getPrecioOriginal().getId().equals(precioOriginal.getId())) {
					existe=true;
					precioOriginal.setId(precioAux.getId());
					precioOriginal.setVersionRow(precioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPrecio(Boolean esParaCancelar) throws Exception {
		preciosAux=new ArrayList<Precio>();
		precioAux=new Precio();
		
		if(!this.precioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Precio precioAux:this.precioLogic.getPrecios()) {
					if(precioAux.getId()<0) {
						preciosAux.add(precioAux);
					}		
				}
				this.iIdNuevoPrecio=0L;
				this.precioLogic.getPrecios().removeAll(preciosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Precio precioAux:this.precios) {
					if(precioAux.getId()<0) {
						preciosAux.add(precioAux);
					}		
				}
				this.iIdNuevoPrecio=0L;
				this.precios.removeAll(preciosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPrecio 
					&& this.precioLogic.getPrecios().size()>0
					) {
					precioAux=this.precioLogic.getPrecios().get(this.precioLogic.getPrecios().size() - 1);
				
					if(precioAux.getId()<0) {
						this.precioLogic.getPrecios().remove(precioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPrecio && this.precios.size()>0) {
					precioAux=this.precios.get(this.precios.size() - 1);
				
					if(precioAux.getId()<0) {
						this.precios.remove(precioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPrecio(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(precio.getId()<0) {
				this.precioLogic.getPrecios().remove(this.precio);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(precio.getId()<0) {
				this.precios.remove(this.precio);
			}
		}			
	}
	
	public void setEstadosInicialesPrecio(List<Precio> preciosAux) throws Exception {
		PrecioConstantesFunciones.setEstadosInicialesPrecio(preciosAux);
	}
	
	public void setEstadosInicialesPrecio(Precio precioAux) throws Exception {
		PrecioConstantesFunciones.setEstadosInicialesPrecio(precioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPrecioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPrecioActual()) {
				if(!this.isEsNuevoPrecio) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPrecio=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPrecioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Precio ?", "MANTENIMIENTO DE Precio", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Precio precio) throws Exception {
		PrecioConstantesFunciones.seleccionarAsignar(this.precio,precio);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPrecio=this.isPermisoActualizarOriginalPrecio;
			
			
			this.seleccionarAsignar(precio);
			
			

			idProductoActual=precio.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PrecioConstantesFunciones.quitarEspaciosPrecio(this.precio,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPrecio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.precioSessionBean.setsFuncionBusquedaRapida(this.precioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoPrecio) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPrecio(esParaCancelar);				
				this.cancelarNuevoPrecio(esParaCancelar);								
			}
			
			this.precio=new Precio();
			
			this.inicializarPrecio();
			
			this.actualizarEstadoCeldasBotonesPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPrecio() throws Exception {
		try {
			PrecioConstantesFunciones.inicializarPrecio(this.precio);
			
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
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.precioLogic.getPrecios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePrecios(String sAccionBusqueda,List<Precio> preciosParaReportes) throws Exception {
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
					sPathReporteFinal="Precio"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PrecioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PrecioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Precio"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Precios");		
		parameters.put("busquedapor", PrecioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePrecio=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PrecioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PrecioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePrecio=new JRBeanArrayDataSource(PrecioJInternalFrame.TraerPrecioBeans(preciosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePrecio);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PrecioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PrecioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PrecioBean.TraerPrecioBeans(preciosParaReportes).toArray()));
							
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
				this.generarExcelReportePrecios(sAccionBusqueda,sTipoArchivoReporte,preciosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPrecios(sAccionBusqueda,sTipoArchivoReporte,preciosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPrecioActionPerformed(null);
					//this.generarExcelReportePrecios(sAccionBusqueda,sTipoArchivoReporte,preciosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPrecios(sAccionBusqueda,sTipoArchivoReporte,preciosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPrecios(sAccionBusqueda,sTipoArchivoReporte,preciosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPrecios(sAccionBusqueda,sTipoArchivoReporte,preciosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePrecios(String sAccionBusqueda,String sTipoArchivoReporte,List<Precio> preciosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"precio";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Precios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPrecio("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Precio precio : preciosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PrecioConstantesFunciones.generarExcelReporteDataPrecio("NORMAL",row,workbook,precio,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.precioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Precio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPrecio(String sTipo,Row row,Workbook workbook) {
		
		PrecioConstantesFunciones.generarExcelReporteHeaderPrecio(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPrecios(String sAccionBusqueda,String sTipoArchivoReporte,List<Precio> preciosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"precio_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Precios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Precio precio : preciosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PrecioConstantesFunciones.getPrecioDescripcion(precio));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrecioConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrecioConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precio.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrecioConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrecioConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precio.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrecioConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrecioConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precio.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrecioConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrecioConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precio.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrecioConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrecioConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precio.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrecioConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrecioConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precio.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrecioConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrecioConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precio.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrecioConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrecioConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precio.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrecioConstantesFunciones.LABEL_IDRANGOUNIDADVENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrecioConstantesFunciones.LABEL_IDRANGOUNIDADVENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precio.getrangounidadventa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrecioConstantesFunciones.LABEL_IDTIPOPRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrecioConstantesFunciones.LABEL_IDTIPOPRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precio.gettipoprecio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrecioConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrecioConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precio.getprecio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrecioConstantesFunciones.LABEL_DESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrecioConstantesFunciones.LABEL_DESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precio.getdescuento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrecioConstantesFunciones.LABEL_PRECIOMINIMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrecioConstantesFunciones.LABEL_PRECIOMINIMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precio.getprecio_minimo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrecioConstantesFunciones.LABEL_CONIMPUESTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrecioConstantesFunciones.LABEL_CONIMPUESTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(precio.getcon_impuesto()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrecioConstantesFunciones.LABEL_IDESTADOPRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrecioConstantesFunciones.LABEL_IDESTADOPRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(precio.getestadoprecio_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.precioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Precio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPrecios(String sAccionBusqueda,String sTipoArchivoReporte,List<Precio> preciosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Precio> preciosRespaldo=null;
		
		classes=PrecioConstantesFunciones.getClassesRelationshipsOfPrecio(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.precioLogic.setDatosCliente(this.datosCliente);
		this.precioLogic.setDatosDeep(this.datosDeep);
		this.precioLogic.setIsConDeep(true);
		
		preciosRespaldo=this.precioLogic.getPrecios();
		
		this.precioLogic.setPrecios(preciosParaReportes);	
		this.precioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		preciosParaReportes=this.precioLogic.getPrecios();
		this.precioLogic.setPrecios(preciosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"precio_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Precios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPrecio("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Precio precio : preciosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPrecio("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PrecioConstantesFunciones.generarExcelReporteDataPrecio("NORMAL",row,workbook,precio,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PrecioConstantesFunciones.getPrecioDescripcion(precio));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.precioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Precio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPrecio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPrecio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPrecio.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPrecio.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPrecio() throws Exception {		
		this.startProcessPrecio(true);
	}
	
	public void startProcessPrecio(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPrecio ,this.jPanelParametrosReportesPrecio, this.jScrollPanelDatosPrecio,this.jPanelPaginacionPrecio, this.jScrollPanelDatosEdicionPrecio, this.jPanelAccionesPrecio,this.jPanelAccionesFormularioPrecio,this.jmenuBarPrecio,this.jmenuBarDetallePrecio,this.jTtoolBarPrecio,this.jTtoolBarDetallePrecio);		
		
		final JTabbedPane jTabbedPaneBusquedasPrecio=this.jTabbedPaneBusquedasPrecio; 
		
		final JPanel jPanelParametrosReportesPrecio=this.jPanelParametrosReportesPrecio;
		//final JScrollPane jScrollPanelDatosPrecio=this.jScrollPanelDatosPrecio;
		final JTable jTableDatosPrecio=this.jTableDatosPrecio;		
		final JPanel jPanelPaginacionPrecio=this.jPanelPaginacionPrecio;
		//final JScrollPane jScrollPanelDatosEdicionPrecio=this.jScrollPanelDatosEdicionPrecio;
		final JPanel jPanelAccionesPrecio=this.jPanelAccionesPrecio;
		
		JPanel jPanelCamposAuxiliarPrecio=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPrecio=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPrecio!=null) {
			jPanelCamposAuxiliarPrecio=this.jInternalFrameDetalleFormPrecio.jPanelCamposPrecio;
			jPanelAccionesFormularioAuxiliarPrecio=this.jInternalFrameDetalleFormPrecio.jPanelAccionesFormularioPrecio;
		}
		
		final JPanel jPanelCamposPrecio=jPanelCamposAuxiliarPrecio;
		final JPanel jPanelAccionesFormularioPrecio=jPanelAccionesFormularioAuxiliarPrecio;
		
		
		final JMenuBar jmenuBarPrecio=this.jmenuBarPrecio;
		final JToolBar jTtoolBarPrecio=this.jTtoolBarPrecio;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPrecio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPrecio=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPrecio!=null) {
			jmenuBarDetalleAuxiliarPrecio=this.jInternalFrameDetalleFormPrecio.jmenuBarDetallePrecio;
			jTtoolBarDetalleAuxiliarPrecio=this.jInternalFrameDetalleFormPrecio.jTtoolBarDetallePrecio;
		}
		
		final JMenuBar jmenuBarDetallePrecio=jmenuBarDetalleAuxiliarPrecio;
		final JToolBar jTtoolBarDetallePrecio=jTtoolBarDetalleAuxiliarPrecio;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPrecio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPrecio;
			processRunnable.jTableDatos=jTableDatosPrecio;
			processRunnable.jPanelCampos=jPanelCamposPrecio;
			processRunnable.jPanelPaginacion=jPanelPaginacionPrecio;
			processRunnable.jPanelAcciones=jPanelAccionesPrecio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPrecio;
			
			
			processRunnable.jmenuBar=jmenuBarPrecio;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePrecio;
			processRunnable.jTtoolBar=jTtoolBarPrecio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePrecio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPrecio ,jPanelParametrosReportesPrecio,jTableDatosPrecio, /*jScrollPanelDatosPrecio,*/jPanelCamposPrecio,jPanelPaginacionPrecio, /*jScrollPanelDatosEdicionPrecio,*/ jPanelAccionesPrecio,jPanelAccionesFormularioPrecio,jmenuBarPrecio,jmenuBarDetallePrecio,jTtoolBarPrecio,jTtoolBarDetallePrecio);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPrecio ,jPanelParametrosReportesPrecio, jScrollPanelDatosPrecio,jPanelPaginacionPrecio, jScrollPanelDatosEdicionPrecio, jPanelAccionesPrecio,jPanelAccionesFormularioPrecio,jmenuBarPrecio,jmenuBarDetallePrecio,jTtoolBarPrecio,jTtoolBarDetallePrecio);
						
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
	
	public void finishProcessPrecio() {// throws Exception 
		this.finishProcessPrecio(true);
	}
	
	public void finishProcessPrecio(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPrecio ,this.jPanelParametrosReportesPrecio, this.jScrollPanelDatosPrecio,this.jPanelPaginacionPrecio, this.jScrollPanelDatosEdicionPrecio, this.jPanelAccionesPrecio,this.jPanelAccionesFormularioPrecio,this.jmenuBarPrecio,this.jmenuBarDetallePrecio,this.jTtoolBarPrecio,this.jTtoolBarDetallePrecio);		
		
		final JTabbedPane jTabbedPaneBusquedasPrecio=this.jTabbedPaneBusquedasPrecio; 
		
		final JPanel jPanelParametrosReportesPrecio=this.jPanelParametrosReportesPrecio;
		//final JScrollPane jScrollPanelDatosPrecio=this.jScrollPanelDatosPrecio;
		final JTable jTableDatosPrecio=this.jTableDatosPrecio;		
		final JPanel jPanelPaginacionPrecio=this.jPanelPaginacionPrecio;
		//final JScrollPane jScrollPanelDatosEdicionPrecio=this.jScrollPanelDatosEdicionPrecio;
		final JPanel jPanelAccionesPrecio=this.jPanelAccionesPrecio;
		
		JPanel jPanelCamposAuxiliarPrecio=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPrecio=new JPanel();
		
		if(this.jInternalFrameDetalleFormPrecio!=null) {
			jPanelCamposAuxiliarPrecio=this.jInternalFrameDetalleFormPrecio.jPanelCamposPrecio;
			jPanelAccionesFormularioAuxiliarPrecio=this.jInternalFrameDetalleFormPrecio.jPanelAccionesFormularioPrecio;
		}
		
		final JPanel jPanelCamposPrecio=jPanelCamposAuxiliarPrecio;
		final JPanel jPanelAccionesFormularioPrecio=jPanelAccionesFormularioAuxiliarPrecio;
		
		
		final JMenuBar jmenuBarPrecio=this.jmenuBarPrecio;		
		final JToolBar jTtoolBarPrecio=this.jTtoolBarPrecio;
				
		JMenuBar jmenuBarDetalleAuxiliarPrecio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPrecio=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPrecio!=null) {
			jmenuBarDetalleAuxiliarPrecio=this.jInternalFrameDetalleFormPrecio.jmenuBarDetallePrecio;
			jTtoolBarDetalleAuxiliarPrecio=this.jInternalFrameDetalleFormPrecio.jTtoolBarDetallePrecio;		
		}
		
		final JMenuBar jmenuBarDetallePrecio=jmenuBarDetalleAuxiliarPrecio;
		final JToolBar jTtoolBarDetallePrecio=jTtoolBarDetalleAuxiliarPrecio;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPrecio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPrecio;
			processRunnable.jTableDatos=jTableDatosPrecio;
			processRunnable.jPanelCampos=jPanelCamposPrecio;
			processRunnable.jPanelPaginacion=jPanelPaginacionPrecio;
			processRunnable.jPanelAcciones=jPanelAccionesPrecio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPrecio;
			
			
			processRunnable.jmenuBar=jmenuBarPrecio;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePrecio;
			processRunnable.jTtoolBar=jTtoolBarPrecio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePrecio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPrecio ,jPanelParametrosReportesPrecio, jTableDatosPrecio,/*jScrollPanelDatosPrecio,*/jPanelCamposPrecio,jPanelPaginacionPrecio, /*jScrollPanelDatosEdicionPrecio,*/ jPanelAccionesPrecio,jPanelAccionesFormularioPrecio,jmenuBarPrecio,jmenuBarDetallePrecio,jTtoolBarPrecio,jTtoolBarDetallePrecio));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPrecio(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPrecio(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPrecio(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPrecio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPrecio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePrecio,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPrecio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPrecio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePrecio,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.precioConstantesFunciones.getsFinalQueryPrecio();
		String  finalQueryPaginacionTodos=this.precioConstantesFunciones.getsFinalQueryPrecio();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PrecioConstantesFunciones.getArrayColumnasGlobalesNoPrecio(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PrecioConstantesFunciones.getArrayColumnasGlobalesPrecio(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PrecioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.preciosEliminados= new ArrayList<Precio>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPrecio();
		
				///*PrecioSessionBean*/this.precioSessionBean=new PrecioSessionBean();
			
			if(this.precioSessionBean==null) {
				this.precioSessionBean=new PrecioSessionBean();
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
					this.iNumeroPaginacion=PrecioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PrecioConstantesFunciones.getClassesForeignKeysOfPrecio(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/precio."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			preciosAux= new ArrayList<Precio>();
			
				
			precioLogic.setDatosCliente(this.datosCliente);
			precioLogic.setDatosDeep(this.datosDeep);
			precioLogic.setIsConDeep(true);
			
			
			precioLogic.getPrecioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					precioLogic.getTodosPrecios(finalQueryGlobal,pagination);
					
					//precioLogic.getTodosPreciosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(precioLogic.getPrecios()==null|| precioLogic.getPrecios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							preciosAux= new ArrayList<Precio>();
							preciosAux.addAll(precioLogic.getPrecios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preciosAux= new ArrayList<Precio>();
							preciosAux.addAll(precios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							precioLogic.getTodosPrecios(finalQueryGlobal+"",this.pagination);												
							
							//precioLogic.getTodosPreciosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePrecios("Todos",precioLogic.getPrecios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							precioLogic.setPrecios(new ArrayList<Precio>());					
							precioLogic.getPrecios().addAll(preciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							precios=new ArrayList<Precio>();
							precios.addAll(preciosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPrecio=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPrecio=this.idActual;
				
				} else if(this.idPrecioActual!=null && this.idPrecioActual!=0L) {
					idPrecio=idPrecioActual;
				}
				
					
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndicePorId(idPrecio);
				
				this.precios=new ArrayList<Precio>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					precioLogic.getEntity(idPrecio);
					
					//precioLogic.getEntityWithConnection(idPrecio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					precioLogic.setPrecios(new ArrayList<Precio>());
					precioLogic.getPrecios().add(precioLogic.getPrecio());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precios=new ArrayList<Precio>();
					this.precios.add(precio);
				}
				
				if(precioLogic.getPrecio()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdBodegaPorIdProducto")) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceBusquedaPorIdBodegaPorIdProducto(id_bodegaBusquedaPorIdBodegaPorIdProducto,id_productoBusquedaPorIdBodegaPorIdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					precioLogic.getPreciosBusquedaPorIdBodegaPorIdProducto(finalQueryGlobal,pagination,id_bodegaBusquedaPorIdBodegaPorIdProducto,id_productoBusquedaPorIdBodegaPorIdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceBusquedaPorIdBodegaPorIdProducto(id_bodegaBusquedaPorIdBodegaPorIdProducto,id_productoBusquedaPorIdBodegaPorIdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceBusquedaPorIdBodegaPorIdProducto(id_bodegaBusquedaPorIdBodegaPorIdProducto,id_productoBusquedaPorIdBodegaPorIdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=precioLogic.getPrecios()==null||precioLogic.getPrecios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=precios==null|| precios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						preciosAux=new ArrayList<Precio>();
						preciosAux.addAll(precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preciosAux=new ArrayList<Precio>();
							preciosAux.addAll(precios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							precioLogic.getPreciosBusquedaPorIdBodegaPorIdProducto(finalQueryGlobal,pagination,id_bodegaBusquedaPorIdBodegaPorIdProducto,id_productoBusquedaPorIdBodegaPorIdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceBusquedaPorIdBodegaPorIdProducto(id_bodegaBusquedaPorIdBodegaPorIdProducto,id_productoBusquedaPorIdBodegaPorIdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceBusquedaPorIdBodegaPorIdProducto(id_bodegaBusquedaPorIdBodegaPorIdProducto,id_productoBusquedaPorIdBodegaPorIdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePrecios("BusquedaPorIdBodegaPorIdProducto",precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePrecios("BusquedaPorIdBodegaPorIdProducto",precios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						precioLogic.setPrecios(new ArrayList<Precio>());
						precioLogic.getPrecios().addAll(preciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							precios=new ArrayList<Precio>();
							precios.addAll(preciosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarca")) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceBusquedaPorLineaGrupoCategoriaMarca(id_lineaBusquedaPorLineaGrupoCategoriaMarca,id_linea_grupoBusquedaPorLineaGrupoCategoriaMarca,id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarca,id_linea_marcaBusquedaPorLineaGrupoCategoriaMarca);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					precioLogic.getPreciosBusquedaPorLineaGrupoCategoriaMarca(finalQueryGlobal,pagination,id_lineaBusquedaPorLineaGrupoCategoriaMarca,id_linea_grupoBusquedaPorLineaGrupoCategoriaMarca,id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarca,id_linea_marcaBusquedaPorLineaGrupoCategoriaMarca);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceBusquedaPorLineaGrupoCategoriaMarca(id_lineaBusquedaPorLineaGrupoCategoriaMarca,id_linea_grupoBusquedaPorLineaGrupoCategoriaMarca,id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarca,id_linea_marcaBusquedaPorLineaGrupoCategoriaMarca);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceBusquedaPorLineaGrupoCategoriaMarca(id_lineaBusquedaPorLineaGrupoCategoriaMarca,id_linea_grupoBusquedaPorLineaGrupoCategoriaMarca,id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarca,id_linea_marcaBusquedaPorLineaGrupoCategoriaMarca);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=precioLogic.getPrecios()==null||precioLogic.getPrecios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=precios==null|| precios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						preciosAux=new ArrayList<Precio>();
						preciosAux.addAll(precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preciosAux=new ArrayList<Precio>();
							preciosAux.addAll(precios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							precioLogic.getPreciosBusquedaPorLineaGrupoCategoriaMarca(finalQueryGlobal,pagination,id_lineaBusquedaPorLineaGrupoCategoriaMarca,id_linea_grupoBusquedaPorLineaGrupoCategoriaMarca,id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarca,id_linea_marcaBusquedaPorLineaGrupoCategoriaMarca);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceBusquedaPorLineaGrupoCategoriaMarca(id_lineaBusquedaPorLineaGrupoCategoriaMarca,id_linea_grupoBusquedaPorLineaGrupoCategoriaMarca,id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarca,id_linea_marcaBusquedaPorLineaGrupoCategoriaMarca);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceBusquedaPorLineaGrupoCategoriaMarca(id_lineaBusquedaPorLineaGrupoCategoriaMarca,id_linea_grupoBusquedaPorLineaGrupoCategoriaMarca,id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarca,id_linea_marcaBusquedaPorLineaGrupoCategoriaMarca);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePrecios("BusquedaPorLineaGrupoCategoriaMarca",precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePrecios("BusquedaPorLineaGrupoCategoriaMarca",precios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						precioLogic.setPrecios(new ArrayList<Precio>());
						precioLogic.getPrecios().addAll(preciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							precios=new ArrayList<Precio>();
							precios.addAll(preciosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarcaProducto")) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceBusquedaPorLineaGrupoCategoriaMarcaProducto(id_lineaBusquedaPorLineaGrupoCategoriaMarcaProducto,id_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProducto,id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProducto,id_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProducto,id_productoBusquedaPorLineaGrupoCategoriaMarcaProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					precioLogic.getPreciosBusquedaPorLineaGrupoCategoriaMarcaProducto(finalQueryGlobal,pagination,id_lineaBusquedaPorLineaGrupoCategoriaMarcaProducto,id_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProducto,id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProducto,id_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProducto,id_productoBusquedaPorLineaGrupoCategoriaMarcaProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceBusquedaPorLineaGrupoCategoriaMarcaProducto(id_lineaBusquedaPorLineaGrupoCategoriaMarcaProducto,id_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProducto,id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProducto,id_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProducto,id_productoBusquedaPorLineaGrupoCategoriaMarcaProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceBusquedaPorLineaGrupoCategoriaMarcaProducto(id_lineaBusquedaPorLineaGrupoCategoriaMarcaProducto,id_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProducto,id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProducto,id_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProducto,id_productoBusquedaPorLineaGrupoCategoriaMarcaProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=precioLogic.getPrecios()==null||precioLogic.getPrecios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=precios==null|| precios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						preciosAux=new ArrayList<Precio>();
						preciosAux.addAll(precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preciosAux=new ArrayList<Precio>();
							preciosAux.addAll(precios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							precioLogic.getPreciosBusquedaPorLineaGrupoCategoriaMarcaProducto(finalQueryGlobal,pagination,id_lineaBusquedaPorLineaGrupoCategoriaMarcaProducto,id_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProducto,id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProducto,id_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProducto,id_productoBusquedaPorLineaGrupoCategoriaMarcaProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceBusquedaPorLineaGrupoCategoriaMarcaProducto(id_lineaBusquedaPorLineaGrupoCategoriaMarcaProducto,id_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProducto,id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProducto,id_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProducto,id_productoBusquedaPorLineaGrupoCategoriaMarcaProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceBusquedaPorLineaGrupoCategoriaMarcaProducto(id_lineaBusquedaPorLineaGrupoCategoriaMarcaProducto,id_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProducto,id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProducto,id_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProducto,id_productoBusquedaPorLineaGrupoCategoriaMarcaProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePrecios("BusquedaPorLineaGrupoCategoriaMarcaProducto",precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePrecios("BusquedaPorLineaGrupoCategoriaMarcaProducto",precios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						precioLogic.setPrecios(new ArrayList<Precio>());
						precioLogic.getPrecios().addAll(preciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							precios=new ArrayList<Precio>();
							precios.addAll(preciosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					precioLogic.getPreciosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=precioLogic.getPrecios()==null||precioLogic.getPrecios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=precios==null|| precios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						preciosAux=new ArrayList<Precio>();
						preciosAux.addAll(precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preciosAux=new ArrayList<Precio>();
							preciosAux.addAll(precios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							precioLogic.getPreciosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePrecios("FK_IdBodega",precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePrecios("FK_IdBodega",precios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						precioLogic.setPrecios(new ArrayList<Precio>());
						precioLogic.getPrecios().addAll(preciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							precios=new ArrayList<Precio>();
							precios.addAll(preciosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					precioLogic.getPreciosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=precioLogic.getPrecios()==null||precioLogic.getPrecios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=precios==null|| precios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						preciosAux=new ArrayList<Precio>();
						preciosAux.addAll(precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preciosAux=new ArrayList<Precio>();
							preciosAux.addAll(precios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							precioLogic.getPreciosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePrecios("FK_IdEmpresa",precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePrecios("FK_IdEmpresa",precios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						precioLogic.setPrecios(new ArrayList<Precio>());
						precioLogic.getPrecios().addAll(preciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							precios=new ArrayList<Precio>();
							precios.addAll(preciosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstadoPrecio")) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdEstadoPrecio(id_estado_precioFK_IdEstadoPrecio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					precioLogic.getPreciosFK_IdEstadoPrecio(finalQueryGlobal,pagination,id_estado_precioFK_IdEstadoPrecio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdEstadoPrecio(id_estado_precioFK_IdEstadoPrecio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdEstadoPrecio(id_estado_precioFK_IdEstadoPrecio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=precioLogic.getPrecios()==null||precioLogic.getPrecios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=precios==null|| precios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						preciosAux=new ArrayList<Precio>();
						preciosAux.addAll(precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preciosAux=new ArrayList<Precio>();
							preciosAux.addAll(precios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							precioLogic.getPreciosFK_IdEstadoPrecio(finalQueryGlobal,pagination,id_estado_precioFK_IdEstadoPrecio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdEstadoPrecio(id_estado_precioFK_IdEstadoPrecio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdEstadoPrecio(id_estado_precioFK_IdEstadoPrecio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePrecios("FK_IdEstadoPrecio",precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePrecios("FK_IdEstadoPrecio",precios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						precioLogic.setPrecios(new ArrayList<Precio>());
						precioLogic.getPrecios().addAll(preciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							precios=new ArrayList<Precio>();
							precios.addAll(preciosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdLinea")) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					precioLogic.getPreciosFK_IdLinea(finalQueryGlobal,pagination,id_lineaFK_IdLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=precioLogic.getPrecios()==null||precioLogic.getPrecios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=precios==null|| precios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						preciosAux=new ArrayList<Precio>();
						preciosAux.addAll(precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preciosAux=new ArrayList<Precio>();
							preciosAux.addAll(precios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							precioLogic.getPreciosFK_IdLinea(finalQueryGlobal,pagination,id_lineaFK_IdLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePrecios("FK_IdLinea",precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePrecios("FK_IdLinea",precios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						precioLogic.setPrecios(new ArrayList<Precio>());
						precioLogic.getPrecios().addAll(preciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							precios=new ArrayList<Precio>();
							precios.addAll(preciosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					precioLogic.getPreciosFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=precioLogic.getPrecios()==null||precioLogic.getPrecios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=precios==null|| precios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						preciosAux=new ArrayList<Precio>();
						preciosAux.addAll(precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preciosAux=new ArrayList<Precio>();
							preciosAux.addAll(precios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							precioLogic.getPreciosFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePrecios("FK_IdProducto",precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePrecios("FK_IdProducto",precios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						precioLogic.setPrecios(new ArrayList<Precio>());
						precioLogic.getPrecios().addAll(preciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							precios=new ArrayList<Precio>();
							precios.addAll(preciosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdRangoUnidadVenta")) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdRangoUnidadVenta(id_rango_unidad_ventaFK_IdRangoUnidadVenta);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					precioLogic.getPreciosFK_IdRangoUnidadVenta(finalQueryGlobal,pagination,id_rango_unidad_ventaFK_IdRangoUnidadVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdRangoUnidadVenta(id_rango_unidad_ventaFK_IdRangoUnidadVenta);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdRangoUnidadVenta(id_rango_unidad_ventaFK_IdRangoUnidadVenta);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=precioLogic.getPrecios()==null||precioLogic.getPrecios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=precios==null|| precios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						preciosAux=new ArrayList<Precio>();
						preciosAux.addAll(precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preciosAux=new ArrayList<Precio>();
							preciosAux.addAll(precios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							precioLogic.getPreciosFK_IdRangoUnidadVenta(finalQueryGlobal,pagination,id_rango_unidad_ventaFK_IdRangoUnidadVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdRangoUnidadVenta(id_rango_unidad_ventaFK_IdRangoUnidadVenta);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdRangoUnidadVenta(id_rango_unidad_ventaFK_IdRangoUnidadVenta);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePrecios("FK_IdRangoUnidadVenta",precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePrecios("FK_IdRangoUnidadVenta",precios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						precioLogic.setPrecios(new ArrayList<Precio>());
						precioLogic.getPrecios().addAll(preciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							precios=new ArrayList<Precio>();
							precios.addAll(preciosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					precioLogic.getPreciosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=precioLogic.getPrecios()==null||precioLogic.getPrecios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=precios==null|| precios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						preciosAux=new ArrayList<Precio>();
						preciosAux.addAll(precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preciosAux=new ArrayList<Precio>();
							preciosAux.addAll(precios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							precioLogic.getPreciosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrecioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePrecios("FK_IdSucursal",precioLogic.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePrecios("FK_IdSucursal",precios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						precioLogic.setPrecios(new ArrayList<Precio>());
						precioLogic.getPrecios().addAll(preciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							precios=new ArrayList<Precio>();
							precios.addAll(preciosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPrecio();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPrecio();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=precioLogic.getPrecios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=precios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=precioLogic.getPrecios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=precios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Precio precio) {
		Boolean permite=true;
		
		if(this.precio.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PrecioConstantesFunciones.getOrderByListaPrecio();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PrecioConstantesFunciones.getOrderByListaPrecio();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Precio precio:precioLogic.getPrecios()) {
				if(precio.getsType().equals(Constantes2.S_TOTALES)) {
					precioTotales=precio;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Precio precio:this.precios) {
				if(precio.getsType().equals(Constantes2.S_TOTALES)) {
					precioTotales=precio;
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
			this.precioAux=new Precio();
			this.precioAux.setsType(Constantes2.S_TOTALES);
			this.precioAux.setIsNew(false);
			this.precioAux.setIsChanged(false);
			this.precioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PrecioConstantesFunciones.TotalizarValoresFilaPrecio(this.precioLogic.getPrecios(),this.precioAux);
				
				this.precioLogic.getPrecios().add(this.precioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PrecioConstantesFunciones.TotalizarValoresFilaPrecio(this.precios,this.precioAux);
				
				this.precios.add(this.precioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		precioTotales=new Precio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.precioLogic.getPrecios().remove(precioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.precios.remove(precioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		precioTotales=new Precio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Precio precio:precioLogic.getPrecios()) {
				if(precio.getsType().equals(Constantes2.S_TOTALES)) {
					precioTotales=precio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PrecioConstantesFunciones.TotalizarValoresFilaPrecio(this.precioLogic.getPrecios(),precioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Precio precio:this.precios) {
				if(precio.getsType().equals(Constantes2.S_TOTALES)) {
					precioTotales=precio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PrecioConstantesFunciones.TotalizarValoresFilaPrecio(this.precios,precioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPreciosBusquedaPorIdBodegaPorIdProducto()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdBodegaPorIdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosBusquedaPorLineaGrupoCategoriaMarca()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorLineaGrupoCategoriaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosBusquedaPorLineaGrupoCategoriaMarcaProducto()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorLineaGrupoCategoriaMarcaProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosFK_IdEstadoPrecio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoPrecio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosFK_IdRangoUnidadVenta()throws Exception {
		try {
			sAccionBusqueda="FK_IdRangoUnidadVenta";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreciosFK_IdTipoPrecio()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoPrecio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPreciosBusquedaPorIdBodegaPorIdProducto(String sFinalQuery,Long id_bodega,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					precioLogic.getPreciosBusquedaPorIdBodegaPorIdProducto(sFinalQuery,this.pagination,id_bodega,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosBusquedaPorLineaGrupoCategoriaMarca(String sFinalQuery,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					precioLogic.getPreciosBusquedaPorLineaGrupoCategoriaMarca(sFinalQuery,this.pagination,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosBusquedaPorLineaGrupoCategoriaMarcaProducto(String sFinalQuery,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					precioLogic.getPreciosBusquedaPorLineaGrupoCategoriaMarcaProducto(sFinalQuery,this.pagination,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					precioLogic.getPreciosFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					precioLogic.getPreciosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosFK_IdEstadoPrecio(String sFinalQuery,Long id_estado_precio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					precioLogic.getPreciosFK_IdEstadoPrecio(sFinalQuery,this.pagination,id_estado_precio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					precioLogic.getPreciosFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					precioLogic.getPreciosFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					precioLogic.getPreciosFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					precioLogic.getPreciosFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					precioLogic.getPreciosFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosFK_IdRangoUnidadVenta(String sFinalQuery,Long id_rango_unidad_venta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					precioLogic.getPreciosFK_IdRangoUnidadVenta(sFinalQuery,this.pagination,id_rango_unidad_venta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					precioLogic.getPreciosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreciosFK_IdTipoPrecio(String sFinalQuery,Long id_tipo_precio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					precioLogic.getPreciosFK_IdTipoPrecio(sFinalQuery,this.pagination,id_tipo_precio);
				
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
	
	public void inicializarPermisosPrecio() {
		this.isPermisoTodoPrecio=false;
		this.isPermisoNuevoPrecio=false;
		this.isPermisoActualizarPrecio=false;
		this.isPermisoActualizarOriginalPrecio=false;
		this.isPermisoEliminarPrecio=false;
		this.isPermisoGuardarCambiosPrecio=false;
		this.isPermisoConsultaPrecio=false;
		this.isPermisoBusquedaPrecio=false;
		this.isPermisoReportePrecio=false;		
		this.isPermisoOrdenPrecio=false;		
		this.isPermisoPaginacionMedioPrecio=false;		
		this.isPermisoPaginacionAltoPrecio=false;
		this.isPermisoPaginacionTodoPrecio=false;
		this.isPermisoCopiarPrecio=false;		
		this.isPermisoVerFormPrecio=false;		
		this.isPermisoDuplicarPrecio=false;		
		this.isPermisoOrdenPrecio=false;		
	}
	
	public void setPermisosUsuarioPrecio(Boolean isPermiso) {
		this.isPermisoTodoPrecio=isPermiso;
		this.isPermisoNuevoPrecio=isPermiso;
		this.isPermisoActualizarPrecio=isPermiso;
		this.isPermisoActualizarOriginalPrecio=isPermiso;
		this.isPermisoEliminarPrecio=isPermiso;
		this.isPermisoGuardarCambiosPrecio=isPermiso;
		this.isPermisoConsultaPrecio=isPermiso;
		this.isPermisoBusquedaPrecio=isPermiso;
		this.isPermisoReportePrecio=isPermiso;
		this.isPermisoOrdenPrecio=isPermiso;		
		this.isPermisoPaginacionMedioPrecio=isPermiso;		
		this.isPermisoPaginacionAltoPrecio=isPermiso;		
		this.isPermisoPaginacionTodoPrecio=isPermiso;		
		this.isPermisoCopiarPrecio=isPermiso;		
		this.isPermisoVerFormPrecio=isPermiso;		
		this.isPermisoDuplicarPrecio=isPermiso;
		this.isPermisoOrdenPrecio=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPrecio(Boolean isPermiso) {
		//this.isPermisoTodoPrecio=isPermiso;
		this.isPermisoNuevoPrecio=isPermiso;
		this.isPermisoActualizarPrecio=isPermiso;
		this.isPermisoActualizarOriginalPrecio=isPermiso;
		this.isPermisoEliminarPrecio=isPermiso;
		this.isPermisoGuardarCambiosPrecio=isPermiso;
		//this.isPermisoConsultaPrecio=isPermiso;
		//this.isPermisoBusquedaPrecio=isPermiso;
		//this.isPermisoReportePrecio=isPermiso;
		//this.isPermisoOrdenPrecio=isPermiso;		
		//this.isPermisoPaginacionMedioPrecio=isPermiso;		
		//this.isPermisoPaginacionAltoPrecio=isPermiso;		
		//this.isPermisoPaginacionTodoPrecio=isPermiso;		
		//this.isPermisoCopiarPrecio=isPermiso;		
		//this.isPermisoDuplicarPrecio=isPermiso;
		//this.isPermisoOrdenPrecio=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPrecioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPrecio(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPrecioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPrecioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPrecioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPrecioClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPrecio() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.precioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PrecioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPrecio=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPrecio=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPrecio=this.isPermisoActualizarPrecio;
			this.isPermisoEliminarPrecio=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPrecio=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPrecio=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPrecio=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPrecio=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePrecio=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPrecio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPrecio=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPrecio=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPrecio=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPrecio=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPrecio=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPrecio=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPrecio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.precioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPrecio.setToolTipText(this.jTableDatosPrecio.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPrecio(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPrecio(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPrecio() throws Exception {
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
	public void inicializarCombosForeignKeyPrecioListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
				this.rangounidadventasForeignKey=new ArrayList();
				this.tipopreciosForeignKey=new ArrayList();
				this.estadopreciosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPrecioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PrecioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPrecioListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyRangoUnidadVentaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoPrecioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoPrecioListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyRangoUnidadVentaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.rangounidadventasForeignKey==null||this.rangounidadventasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=RangoUnidadVentaConstantesFunciones.getArrayColumnasGlobalesRangoUnidadVenta(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RangoUnidadVentaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=RangoUnidadVentaConstantesFunciones.SFINALQUERY;

				this.cargarCombosRangoUnidadVentasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoPrecioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipopreciosForeignKey==null||this.tipopreciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoPrecioConstantesFunciones.getArrayColumnasGlobalesTipoPrecio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoPrecioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoPrecioConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoPreciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoPrecioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadopreciosForeignKey==null||this.estadopreciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoPrecioConstantesFunciones.getArrayColumnasGlobalesEstadoPrecio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoPrecioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoPrecioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoPreciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyPrecioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PrecioParameterReturnGeneral precioReturnGeneral=new PrecioParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.precioConstantesFunciones.cargarid_empresaPrecio)
					 || (this.esRecargarFks && this.precioConstantesFunciones.cargarid_empresaPrecio)) {

					if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+precioSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.precioConstantesFunciones.cargarid_sucursalPrecio)
					 || (this.esRecargarFks && this.precioConstantesFunciones.cargarid_sucursalPrecio)) {

					if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+precioSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.precioConstantesFunciones.cargarid_bodegaPrecio)
					 || (this.esRecargarFks && this.precioConstantesFunciones.cargarid_bodegaPrecio)) {

					if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+precioSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(cargarCombosDependencia && ((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.precioConstantesFunciones.cargarid_productoPrecio)
					 || (this.esRecargarFks && this.precioConstantesFunciones.cargarid_productoPrecio)) {

					if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+precioSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalLinea="";

				if(((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0) && this.precioConstantesFunciones.cargarid_lineaPrecio)
					 || (this.esRecargarFks && this.precioConstantesFunciones.cargarid_lineaPrecio)) {

					if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLinea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLinea=Funciones.GetFinalQueryAppend(finalQueryGlobalLinea, "");
						finalQueryGlobalLinea+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLinea=" WHERE " + ConstantesSql.ID + "="+precioSessionBean.getlidLineaActual();
					}
				} else {
					finalQueryGlobalLinea="NONE";
				}


				String finalQueryGlobalLineaGrupo="";

				if(((this.lineagruposForeignKey==null||this.lineagruposForeignKey.size()<=0) && this.precioConstantesFunciones.cargarid_linea_grupoPrecio)
					 || (this.esRecargarFks && this.precioConstantesFunciones.cargarid_linea_grupoPrecio)) {

					if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLineaGrupo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLineaGrupo=Funciones.GetFinalQueryAppend(finalQueryGlobalLineaGrupo, "");
						finalQueryGlobalLineaGrupo+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineaGruposForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLineaGrupo=" WHERE " + ConstantesSql.ID + "="+precioSessionBean.getlidLineaGrupoActual();
					}
				} else {
					finalQueryGlobalLineaGrupo="NONE";
				}


				String finalQueryGlobalLineaCategoria="";

				if(((this.lineacategoriasForeignKey==null||this.lineacategoriasForeignKey.size()<=0) && this.precioConstantesFunciones.cargarid_linea_categoriaPrecio)
					 || (this.esRecargarFks && this.precioConstantesFunciones.cargarid_linea_categoriaPrecio)) {

					if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLineaCategoria=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLineaCategoria=Funciones.GetFinalQueryAppend(finalQueryGlobalLineaCategoria, "");
						finalQueryGlobalLineaCategoria+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineaCategoriasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLineaCategoria=" WHERE " + ConstantesSql.ID + "="+precioSessionBean.getlidLineaCategoriaActual();
					}
				} else {
					finalQueryGlobalLineaCategoria="NONE";
				}


				String finalQueryGlobalLineaMarca="";

				if(((this.lineamarcasForeignKey==null||this.lineamarcasForeignKey.size()<=0) && this.precioConstantesFunciones.cargarid_linea_marcaPrecio)
					 || (this.esRecargarFks && this.precioConstantesFunciones.cargarid_linea_marcaPrecio)) {

					if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLineaMarca=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLineaMarca=Funciones.GetFinalQueryAppend(finalQueryGlobalLineaMarca, "");
						finalQueryGlobalLineaMarca+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineaMarcasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLineaMarca=" WHERE " + ConstantesSql.ID + "="+precioSessionBean.getlidLineaMarcaActual();
					}
				} else {
					finalQueryGlobalLineaMarca="NONE";
				}


				String finalQueryGlobalRangoUnidadVenta="";

				if(((this.rangounidadventasForeignKey==null||this.rangounidadventasForeignKey.size()<=0) && this.precioConstantesFunciones.cargarid_rango_unidad_ventaPrecio)
					 || (this.esRecargarFks && this.precioConstantesFunciones.cargarid_rango_unidad_ventaPrecio)) {

					if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionRangoUnidadVenta()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=RangoUnidadVentaConstantesFunciones.getArrayColumnasGlobalesRangoUnidadVenta(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalRangoUnidadVenta=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RangoUnidadVentaConstantesFunciones.TABLENAME);

						finalQueryGlobalRangoUnidadVenta=Funciones.GetFinalQueryAppend(finalQueryGlobalRangoUnidadVenta, "");
						finalQueryGlobalRangoUnidadVenta+=RangoUnidadVentaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosRangoUnidadVentasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalRangoUnidadVenta=" WHERE " + ConstantesSql.ID + "="+precioSessionBean.getlidRangoUnidadVentaActual();
					}
				} else {
					finalQueryGlobalRangoUnidadVenta="NONE";
				}


				String finalQueryGlobalTipoPrecio="";

				if(((this.tipopreciosForeignKey==null||this.tipopreciosForeignKey.size()<=0) && this.precioConstantesFunciones.cargarid_tipo_precioPrecio)
					 || (this.esRecargarFks && this.precioConstantesFunciones.cargarid_tipo_precioPrecio)) {

					if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrecio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoPrecioConstantesFunciones.getArrayColumnasGlobalesTipoPrecio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoPrecio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoPrecioConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoPrecio=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoPrecio, "");
						finalQueryGlobalTipoPrecio+=TipoPrecioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoPreciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoPrecio=" WHERE " + ConstantesSql.ID + "="+precioSessionBean.getlidTipoPrecioActual();
					}
				} else {
					finalQueryGlobalTipoPrecio="NONE";
				}


				String finalQueryGlobalEstadoPrecio="";

				if(((this.estadopreciosForeignKey==null||this.estadopreciosForeignKey.size()<=0) && this.precioConstantesFunciones.cargarid_estado_precioPrecio)
					 || (this.esRecargarFks && this.precioConstantesFunciones.cargarid_estado_precioPrecio)) {

					if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionEstadoPrecio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoPrecioConstantesFunciones.getArrayColumnasGlobalesEstadoPrecio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoPrecio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoPrecioConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoPrecio=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoPrecio, "");
						finalQueryGlobalEstadoPrecio+=EstadoPrecioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoPreciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoPrecio=" WHERE " + ConstantesSql.ID + "="+precioSessionBean.getlidEstadoPrecioActual();
					}
				} else {
					finalQueryGlobalEstadoPrecio="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				precioReturnGeneral=precioLogic.cargarCombosLoteForeignKeyPrecio(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalLinea,finalQueryGlobalLineaGrupo,finalQueryGlobalLineaCategoria,finalQueryGlobalLineaMarca,finalQueryGlobalRangoUnidadVenta,finalQueryGlobalTipoPrecio,finalQueryGlobalEstadoPrecio);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=precioReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=precioReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=precioReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=precioReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalLinea.equals("NONE")) {
				this.lineasForeignKey=precioReturnGeneral.getlineasForeignKey();
			}

			if(!finalQueryGlobalLineaGrupo.equals("NONE")) {
				this.lineagruposForeignKey=precioReturnGeneral.getlineagruposForeignKey();
			}

			if(!finalQueryGlobalLineaCategoria.equals("NONE")) {
				this.lineacategoriasForeignKey=precioReturnGeneral.getlineacategoriasForeignKey();
			}

			if(!finalQueryGlobalLineaMarca.equals("NONE")) {
				this.lineamarcasForeignKey=precioReturnGeneral.getlineamarcasForeignKey();
			}

			if(!finalQueryGlobalRangoUnidadVenta.equals("NONE")) {
				this.rangounidadventasForeignKey=precioReturnGeneral.getrangounidadventasForeignKey();
			}

			if(!finalQueryGlobalTipoPrecio.equals("NONE")) {
				this.tipopreciosForeignKey=precioReturnGeneral.gettipopreciosForeignKey();
			}

			if(!finalQueryGlobalEstadoPrecio.equals("NONE")) {
				this.estadopreciosForeignKey=precioReturnGeneral.getestadopreciosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPrecio()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyLineaGrupo();
			this.addItemDefectoCombosForeignKeyLineaCategoria();
			this.addItemDefectoCombosForeignKeyLineaMarca();
			this.addItemDefectoCombosForeignKeyRangoUnidadVenta();
			this.addItemDefectoCombosForeignKeyTipoPrecio();
			this.addItemDefectoCombosForeignKeyEstadoPrecio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.precioSessionBean==null) {
				this.precioSessionBean=new PrecioSessionBean();
			}

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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

	public void addItemDefectoCombosForeignKeyRangoUnidadVenta()throws Exception {
		try {

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionRangoUnidadVenta()) {
				RangoUnidadVenta rangounidadventa=new RangoUnidadVenta();
				RangoUnidadVentaConstantesFunciones.setRangoUnidadVentaDescripcion(rangounidadventa,Constantes.SMENSAJE_ESCOJA_OPCION);
				rangounidadventa.setId(null);

				if(!RangoUnidadVentaConstantesFunciones.ExisteEnLista(this.rangounidadventasForeignKey,rangounidadventa,true)) {

					this.rangounidadventasForeignKey.add(0,rangounidadventa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoPrecio()throws Exception {
		try {

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrecio()) {
				TipoPrecio tipoprecio=new TipoPrecio();
				TipoPrecioConstantesFunciones.setTipoPrecioDescripcion(tipoprecio,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoprecio.setId(null);

				if(!TipoPrecioConstantesFunciones.ExisteEnLista(this.tipopreciosForeignKey,tipoprecio,true)) {

					this.tipopreciosForeignKey.add(0,tipoprecio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstadoPrecio()throws Exception {
		try {

			if(!this.precioSessionBean.getisBusquedaDesdeForeignKeySesionEstadoPrecio()) {
				EstadoPrecio estadoprecio=new EstadoPrecio();
				EstadoPrecioConstantesFunciones.setEstadoPrecioDescripcion(estadoprecio,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadoprecio.setId(null);

				if(!EstadoPrecioConstantesFunciones.ExisteEnLista(this.estadopreciosForeignKey,estadoprecio,true)) {

					this.estadopreciosForeignKey.add(0,estadoprecio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPrecio()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyBodega("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPrecio(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyBodega(sFormularioTipoBusqueda);
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
			sFinalQueryCombo=" inner join  inventario.bodega_producto on bodega_producto.id_producto=producto.id where bodega_producto.id_bodega="+bodegaLocal.getId();

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboProducto=sFinalQueryCombo;

			this.productosForeignKey=new ArrayList<Producto>();
			this.cargarCombosForeignKeyProducto(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyBodega(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormPrecio!=null) {
						this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio.addItemListener(new ComboBoxItemListener(this,"id_bodegaPrecio"));
						this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaPrecio"));
					}
				} else {
					if(this.jInternalFrameDetalleFormPrecio!=null) {
						this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio.addActionListener(new ComboBoxActionListener(this,"id_bodegaPrecio"));
						this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaPrecio"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio"));

						this.jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio"));

					} else {
						this.jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio"));

						this.jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio"));

					}
			
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_bodegaFK_IdBodegaPrecio.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_bodegaFK_IdBodegaPrecio"));

						this.jComboBoxid_bodegaFK_IdBodegaPrecio.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaFK_IdBodegaPrecio"));

					} else {
						this.jComboBoxid_bodegaFK_IdBodegaPrecio.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_bodegaFK_IdBodegaPrecio"));

						this.jComboBoxid_bodegaFK_IdBodegaPrecio.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaFK_IdBodegaPrecio"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyPrecio()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPrecio();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPrecio(Precio precio)throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(precio.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(precio.getid_producto(),false,"Formulario");
			this.setActualLineaForeignKey(precio.getid_linea(),false,"Formulario");
			this.setActualLineaGrupoForeignKey(precio.getid_linea_grupo(),false,"Formulario");
			this.setActualLineaCategoriaForeignKey(precio.getid_linea_categoria(),false,"Formulario");
			this.setActualLineaMarcaForeignKey(precio.getid_linea_marca(),false,"Formulario");
			this.setActualRangoUnidadVentaForeignKey(precio.getid_rango_unidad_venta(),false,"Formulario");
			this.setActualTipoPrecioForeignKey(precio.getid_tipo_precio(),false,"Formulario");
			this.setActualEstadoPrecioForeignKey(precio.getid_estado_precio(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPrecio(Precio precio,String sTipoEvento)throws Exception {	
		try {
			
			

				if(precio.getProducto()!=null && !sTipoEvento.equals("id_productoPrecio")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(precio.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPrecio()throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(this.precioConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.precioConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualLineaForeignKey(this.precioConstantesFunciones.getid_linea(),false,"Formulario");
			this.setActualLineaGrupoForeignKey(this.precioConstantesFunciones.getid_linea_grupo(),false,"Formulario");
			this.setActualLineaCategoriaForeignKey(this.precioConstantesFunciones.getid_linea_categoria(),false,"Formulario");
			this.setActualLineaMarcaForeignKey(this.precioConstantesFunciones.getid_linea_marca(),false,"Formulario");
			this.setActualRangoUnidadVentaForeignKey(this.precioConstantesFunciones.getid_rango_unidad_venta(),false,"Formulario");
			this.setActualTipoPrecioForeignKey(this.precioConstantesFunciones.getid_tipo_precio(),false,"Formulario");
			this.setActualEstadoPrecioForeignKey(this.precioConstantesFunciones.getid_estado_precio(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPrecio()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPrecio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPrecio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPrecio()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPrecio()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");
			this.cargarCombosFrameRangoUnidadVentasForeignKey("Todos");
			this.cargarCombosFrameTipoPreciosForeignKey("Todos");
			this.cargarCombosFrameEstadoPreciosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPrecio(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameRangoUnidadVentasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoPreciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoPreciosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPrecio()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_empresaPrecio!=null && this.jInternalFrameDetalleFormPrecio.jComboBoxid_empresaPrecio.getItemCount()>0) {
				this.jInternalFrameDetalleFormPrecio.jComboBoxid_empresaPrecio.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_sucursalPrecio!=null && this.jInternalFrameDetalleFormPrecio.jComboBoxid_sucursalPrecio.getItemCount()>0) {
				this.jInternalFrameDetalleFormPrecio.jComboBoxid_sucursalPrecio.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio!=null && this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio.getItemCount()>0) {
				this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_productoPrecio!=null && this.jInternalFrameDetalleFormPrecio.jComboBoxid_productoPrecio.getItemCount()>0) {
				this.jInternalFrameDetalleFormPrecio.jComboBoxid_productoPrecio.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_lineaPrecio!=null && this.jInternalFrameDetalleFormPrecio.jComboBoxid_lineaPrecio.getItemCount()>0) {
				this.jInternalFrameDetalleFormPrecio.jComboBoxid_lineaPrecio.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_grupoPrecio!=null && this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_grupoPrecio.getItemCount()>0) {
				this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_grupoPrecio.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_categoriaPrecio!=null && this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_categoriaPrecio.getItemCount()>0) {
				this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_categoriaPrecio.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_marcaPrecio!=null && this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_marcaPrecio.getItemCount()>0) {
				this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_marcaPrecio.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_rango_unidad_ventaPrecio!=null && this.jInternalFrameDetalleFormPrecio.jComboBoxid_rango_unidad_ventaPrecio.getItemCount()>0) {
				this.jInternalFrameDetalleFormPrecio.jComboBoxid_rango_unidad_ventaPrecio.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_tipo_precioPrecio!=null && this.jInternalFrameDetalleFormPrecio.jComboBoxid_tipo_precioPrecio.getItemCount()>0) {
				this.jInternalFrameDetalleFormPrecio.jComboBoxid_tipo_precioPrecio.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPrecio.jComboBoxid_estado_precioPrecio!=null && this.jInternalFrameDetalleFormPrecio.jComboBoxid_estado_precioPrecio.getItemCount()>0) {
				this.jInternalFrameDetalleFormPrecio.jComboBoxid_estado_precioPrecio.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	





	public void recargarFormPrecioBodega(JComboBox<?> jComboBoxGenericoBodega,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormPrecioid_producto(jComboBoxGenericoBodega,sFormularioTipoBusqueda,"Bodega",false);
	}
















	
	



	public void recargarFormPrecioid_producto(JComboBox<?> jComboBoxGenericoProducto,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Bodega")){
				this.setActualParaGuardarBodegaForeignKey(this.precio,jComboBoxGenericoProducto);
			}

			if(this.precio.getid_bodega()!=null && this.precio.getid_bodega()!=0L) {
				sFinalQuery+="  WHERE  id_bodega="+this.precio.getid_bodega();
			} else {
				sFinalQuery+="  WHERE  id_bodega=-1";
			}



			//BUCLE RECURSIVO
			this.setActualProductoForeignKey(this.precio.getid_bodega(),true,sFormularioTipoBusqueda);

			this.cargarCombosProductosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public PrecioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PrecioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PrecioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.precioSessionBean=new PrecioSessionBean(); 
		this.precioConstantesFunciones=new PrecioConstantesFunciones(); 
		this.precioBean=new Precio();//(this.precioConstantesFunciones); 		
		this.precioReturnGeneral=new PrecioParameterReturnGeneral(); 
		
		this.precioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.precioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PrecioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PrecioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PrecioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPrecio(true);
			
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
			
			this.precioConstantesFunciones=new PrecioConstantesFunciones(); 
			this.precioBean=new Precio();//this.precioConstantesFunciones); 			
			this.precioReturnGeneral=new PrecioParameterReturnGeneral(); 
		
			PrecioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Precio Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.precio=new Precio();
			this.precios = new ArrayList<Precio>();
			this.preciosAux = new ArrayList<Precio>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic=new PrecioLogic();
				this.precioLogic.getNewConnexionToDeep("");
			}
			
			//this.precioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.precioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPrecio);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPrecio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPrecio);	
					}
					
					if(this.jInternalFrameImportacionPrecio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPrecio);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPrecio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPrecio);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPrecio!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPrecio);
				this.jInternalFrameDetalleFormPrecio.setVisible(false);
				this.jInternalFrameDetalleFormPrecio.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPrecio!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPrecio);
					this.jInternalFrameReporteDinamicoPrecio.setVisible(false);
					this.jInternalFrameReporteDinamicoPrecio.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPrecio!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPrecio);
					this.jInternalFrameImportacionPrecio.setVisible(false);
					this.jInternalFrameImportacionPrecio.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPrecio!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPrecio);
					this.jInternalFrameOrderByPrecio.setVisible(false);
					this.jInternalFrameOrderByPrecio.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPrecioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PrecioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.precioReturnGeneral=new PrecioParameterReturnGeneral();
			
			this.precioParameterGeneral=new PrecioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.precioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.precioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.precioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PrecioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.precioSessionBean.getEsGuardarRelacionado(),this.precioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PrecioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.precioSessionBean.getEsGuardarRelacionado(),this.precioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPrecio=false;
			this.isVisibilidadCeldaDuplicarPrecio=true;
			this.isVisibilidadCeldaCopiarPrecio=true;
			this.isVisibilidadCeldaVerFormPrecio=true;
			this.isVisibilidadCeldaOrdenPrecio=true;
			this.isVisibilidadCeldaNuevoRelacionesPrecio=false;
			this.isVisibilidadCeldaModificarPrecio=false;
			this.isVisibilidadCeldaActualizarPrecio=false;
			this.isVisibilidadCeldaEliminarPrecio=false;
			this.isVisibilidadCeldaCancelarPrecio=false;
			this.isVisibilidadCeldaGuardarPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosPrecio=false;
			
			
			this.isVisibilidadBusquedaPorIdBodegaPorIdProducto=true;
			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca=true;
			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto=true;
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoPrecio=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdRangoUnidadVenta=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoPrecio=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPrecio();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPrecio(false);
			
			this.setPermisosUsuarioPrecio();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.precioSessionBean.getEsGuardarRelacionado() 
				|| (this.precioSessionBean.getEsGuardarRelacionado() && this.precioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPrecioClasesRelacionadas();
			}
			
			if(this.precioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPrecioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PrecioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPrecio();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPrecio();
			}
			
			if(!this.isPermisoBusquedaPrecio) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPrecio.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.precioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPrecio,this.isPermisoPaginacionMedioPrecio,this.isPermisoPaginacionTodoPrecio);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PrecioConstantesFunciones.getTiposSeleccionarPrecio());
				
				this.tiposColumnasSelect=PrecioConstantesFunciones.getTiposSeleccionarPrecio(true);
				
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
			//if(!this.precioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPrecio();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioPrecio(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioPrecio(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPrecio() ;
			
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
			this.lineaLogic=new LineaLogic();
			this.lineagrupoLogic=new LineaLogic();
			this.lineacategoriaLogic=new LineaLogic();
			this.lineamarcaLogic=new LineaLogic();
			this.rangounidadventaLogic=new RangoUnidadVentaLogic();
			this.tipoprecioLogic=new TipoPrecioLogic();
			this.estadoprecioLogic=new EstadoPrecioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				precioImplementable= (PrecioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PrecioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				precioImplementableHome= (PrecioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PrecioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.precios= new ArrayList<Precio>();
			this.preciosEliminados= new ArrayList<Precio>();
						
			this.isEsNuevoPrecio=false;
			this.esParaAccionDesdeFormularioPrecio=false;
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
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			this.rangounidadventasForeignKey=new ArrayList<RangoUnidadVenta>() ;
			this.tipopreciosForeignKey=new ArrayList<TipoPrecio>() ;
			this.estadopreciosForeignKey=new ArrayList<EstadoPrecio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPrecio(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPrecio();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.precioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PrecioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PrecioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPrecio(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPrecio!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPrecio();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPrecio();
			}
			
			PrecioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPrecio.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPrecio.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPrecio.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPrecio(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Precio: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPrecio() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPrecio")) {
				iIndex=this.jInternalFrameDetalleFormPrecio.jTabbedPaneRelacionesPrecio.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPrecio.jTabbedPaneRelacionesPrecio.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPrecio.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPrecio();	
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
	
	public void cargarCombosForeignKeyPrecio(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPrecio(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPrecio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPrecioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPrecio();
		
		this.cargarCombosFrameForeignKeyPrecio();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPrecio();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPrecio();
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
					this.initActionsCombosForeignKeyBodega("Todos");
				}

			this.recargarComboTablaProducto(this.productosForeignKey);

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
					this.initActionsCombosForeignKeyBodega("Todos");
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
					this.initActionsCombosForeignKeyBodega("Todos");
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
					this.initActionsCombosForeignKeyBodega("Todos");
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
					this.initActionsCombosForeignKeyBodega("Todos");
				}

			this.recargarComboTablaLineaMarca(this.lineamarcasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyRangoUnidadVenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyRangoUnidadVentaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyRangoUnidadVenta();
				this.cargarCombosFrameRangoUnidadVentasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyBodega("Todos");
				}

			this.recargarComboTablaRangoUnidadVenta(this.rangounidadventasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoPrecio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoPrecioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoPrecio();
				this.cargarCombosFrameTipoPreciosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyBodega("Todos");
				}

			this.recargarComboTablaTipoPrecio(this.tipopreciosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoPrecio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoPrecioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoPrecio();
				this.cargarCombosFrameEstadoPreciosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyBodega("Todos");
				}

			this.recargarComboTablaEstadoPrecio(this.estadopreciosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPrecioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.precioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
			
			
			if(jTableDatosPrecio.getRowCount()>=1) {
				jTableDatosPrecio.removeRowSelectionInterval(0, jTableDatosPrecio.getRowCount()-1);						
			}
			
			this.isEsNuevoPrecio=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPrecio(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPrecio(true);			
			//this.precio=new Precio();
			//this.precio.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPrecio(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPrecio() ;
			
			if(PrecioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePrecio(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.precio);	
			this.actualizarInformacion("INFO_PADRE",false,this.precio);				
			
			PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
			
			if(this.precioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Precio: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPrecioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Precio> preciosSeleccionados=new ArrayList<Precio>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPrecio.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPrecio.getSelectedRows().length;			
			}
			
			preciosSeleccionados=this.getPreciosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPrecio--;			
				//Precio precioAux= new Precio();			
				//precioAux.setId(this.iIdNuevoPrecio);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Precio precioOrigen=new Precio();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Precio precioOrigen : preciosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPrecio.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							precioOrigen =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							precioOrigen =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPrecio();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.precio.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPrecio(precioOrigen,this.precio,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.precioLogic.getPrecios().add(this.precioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.precios.add(this.precioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPrecio(false);
				
				this.jTableDatosPrecio.setRowSelectionInterval(this.getIndiceNuevoPrecio(), this.getIndiceNuevoPrecio());
				
				int iLastRow =  this.jTableDatosPrecio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPrecio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPrecio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPrecio(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Precio> preciosSeleccionados=new ArrayList<Precio>();									
		
			Precio precioOrigen=new Precio();
			Precio precioDestino=new Precio();
				
			preciosSeleccionados=this.getPreciosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPrecio.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || preciosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPrecio.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						precioOrigen =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						precioOrigen =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						precioDestino =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						precioDestino =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				precioOrigen =preciosSeleccionados.get(0);
				precioDestino =preciosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPrecio(precioOrigen,precioDestino,true,false);
				
				precioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(precioDestino,precioLogic.getPrecios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(precioDestino,precios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPrecio(false);
				
				//this.jTableDatosPrecio.setRowSelectionInterval(this.getIndiceNuevoPrecio(), this.getIndiceNuevoPrecio());
				
				int iLastRow =  this.jTableDatosPrecio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPrecio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPrecio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPrecio(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPrecio.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPrecio.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPrecio.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPrecio.setVisible(!isVisible);
			this.jPanelPaginacionPrecio.setVisible(!isVisible);
			this.jPanelAccionesPrecio.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePrecio();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPrecio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPrecio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPrecio();
			
			this.abrirFrameOrderByPrecio();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPrecio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePrecio(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPrecio);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPrecio.isMaximum()) {
					this.jInternalFrameDetalleFormPrecio.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPrecio.setSize(this.jInternalFrameDetalleFormPrecio.iWidthFormulario,this.jInternalFrameDetalleFormPrecio.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPrecio.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPrecio.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPrecio.isMaximum()) {
						this.jInternalFrameDetalleFormPrecio.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPrecio.jContentPaneDetallePrecio.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPrecio.jTabbedPaneRelacionesPrecio.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPrecio.jContentPaneDetallePrecio.getWidth(),PrecioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPrecio.jTabbedPaneRelacionesPrecio.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPrecio.jContentPaneDetallePrecio.getWidth(),PrecioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPrecio.jTabbedPaneRelacionesPrecio.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPrecio.jContentPaneDetallePrecio.getWidth(),PrecioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPrecio.setVisible(true);
	        this.jInternalFrameDetalleFormPrecio.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPrecio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPrecio==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPrecio,false,this);
				} else {
					this.jInternalFrameOrderByPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPrecio,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPrecio);
				this.jInternalFrameOrderByPrecio.setVisible(false);
				this.jInternalFrameOrderByPrecio.setSelected(false);
				
				this.jInternalFrameOrderByPrecio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPrecio"));
				
				this.inicializarActualizarBindingTablaOrderByPrecio();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPrecio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPrecio==null) {
				
				this.jInternalFrameImportacionPrecio=new ImportacionJInternalFrame(PrecioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPrecio);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPrecio);
				this.jInternalFrameImportacionPrecio.setVisible(false);
				this.jInternalFrameImportacionPrecio.setSelected(false);


				this.jInternalFrameImportacionPrecio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPrecio"));
				this.jInternalFrameImportacionPrecio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPrecio"));
				this.jInternalFrameImportacionPrecio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPrecio"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPrecio() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPrecio==null) {
				this.jInternalFrameReporteDinamicoPrecio=new ReporteDinamicoJInternalFrame(PrecioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPrecio);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPrecio);
				this.jInternalFrameReporteDinamicoPrecio.setVisible(false);
				this.jInternalFrameReporteDinamicoPrecio.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPrecio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPrecio"));
				this.jInternalFrameReporteDinamicoPrecio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPrecio"));
				this.jInternalFrameReporteDinamicoPrecio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPrecio"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPrecio();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePrecio() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPrecio);
			
	       	this.jInternalFrameDetalleFormPrecio.setVisible(false);
	        this.jInternalFrameDetalleFormPrecio.setSelected(false);
			
			//this.jInternalFrameDetalleFormPrecio.dispose();
			//this.jInternalFrameDetalleFormPrecio=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPrecio() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPrecio.setVisible(true);
	        this.jInternalFrameReporteDinamicoPrecio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPrecio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPrecio.setVisible(true);
	        this.jInternalFrameImportacionPrecio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPrecio() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPrecio.setVisible(true);
	        this.jInternalFrameOrderByPrecio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPrecio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPrecio.setVisible(false);
	        this.jInternalFrameOrderByPrecio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPrecio() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPrecio.setVisible(false);
	        this.jInternalFrameReporteDinamicoPrecio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPrecio() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPrecio.setVisible(false);
	        this.jInternalFrameImportacionPrecio.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderPrecio=(TitledBorder)this.jScrollPanelDatosPrecio.getBorder();
						TitledBorder titledBorderLinea=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLinea.setTitle(titledBorderPrecio.getTitle() + " -> Linea");


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
						TitledBorder titledBorderPrecio=(TitledBorder)this.jScrollPanelDatosPrecio.getBorder();
						TitledBorder titledBorderLineaGrupo=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLineaGrupo.setTitle(titledBorderPrecio.getTitle() + " -> Linea");


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
						TitledBorder titledBorderPrecio=(TitledBorder)this.jScrollPanelDatosPrecio.getBorder();
						TitledBorder titledBorderLineaCategoria=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLineaCategoria.setTitle(titledBorderPrecio.getTitle() + " -> Linea");


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
						TitledBorder titledBorderPrecio=(TitledBorder)this.jScrollPanelDatosPrecio.getBorder();
						TitledBorder titledBorderLineaMarca=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLineaMarca.setTitle(titledBorderPrecio.getTitle() + " -> Linea");


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
	
	public void jButtonModificarPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPrecio(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPrecio(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPrecio.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPrecio(true);
			//this.isEsNuevoPrecio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPrecio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPrecio(false) ;
			
			if(precioSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PrecioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePrecio(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPrecio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPrecioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPrecio(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPrecio.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPrecio(true);
			//this.isEsNuevoPrecio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.precio.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPrecio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPrecio(false) ;
			
			if(PrecioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePrecio(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPrecio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.precioConstantesFunciones.cargarid_productoPrecio) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingPrecio(false,false);
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
		TableColumn tableColumnBodega=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPrecio.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPrecio.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPrecio.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPrecio.getSelectedRow();

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
		TableColumn tableColumnLineaCategoria=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPrecio.getSelectedRow();

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
		TableColumn tableColumnLineaMarca=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPrecio.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaRangoUnidadVenta(List<RangoUnidadVenta> rangounidadventasForeignKey)throws Exception{
		TableColumn tableColumnRangoUnidadVenta=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_IDRANGOUNIDADVENTA));
		TableCellEditor tableCellEditorRangoUnidadVenta =tableColumnRangoUnidadVenta.getCellEditor();

		RangoUnidadVentaTableCell rangounidadventaTableCellFk=(RangoUnidadVentaTableCell)tableCellEditorRangoUnidadVenta;

		if(rangounidadventaTableCellFk!=null) {
			rangounidadventaTableCellFk.setrangounidadventasForeignKey(rangounidadventasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPrecio.getSelectedRow();

		//if(intSelectedRow<=0) {
			//rangounidadventaTableCellFk.setRowActual(intSelectedRow);
			//rangounidadventaTableCellFk.setrangounidadventasForeignKeyActual(rangounidadventasForeignKey);
		//}


		if(rangounidadventaTableCellFk!=null) {
			rangounidadventaTableCellFk.RecargarRangoUnidadVentasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoPrecio(List<TipoPrecio> tipopreciosForeignKey)throws Exception{
		TableColumn tableColumnTipoPrecio=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_IDTIPOPRECIO));
		TableCellEditor tableCellEditorTipoPrecio =tableColumnTipoPrecio.getCellEditor();

		TipoPrecioTableCell tipoprecioTableCellFk=(TipoPrecioTableCell)tableCellEditorTipoPrecio;

		if(tipoprecioTableCellFk!=null) {
			tipoprecioTableCellFk.settipopreciosForeignKey(tipopreciosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPrecio.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoprecioTableCellFk.setRowActual(intSelectedRow);
			//tipoprecioTableCellFk.settipopreciosForeignKeyActual(tipopreciosForeignKey);
		//}


		if(tipoprecioTableCellFk!=null) {
			tipoprecioTableCellFk.RecargarTipoPreciosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoPrecio(List<EstadoPrecio> estadopreciosForeignKey)throws Exception{
		TableColumn tableColumnEstadoPrecio=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_IDESTADOPRECIO));
		TableCellEditor tableCellEditorEstadoPrecio =tableColumnEstadoPrecio.getCellEditor();

		EstadoPrecioTableCell estadoprecioTableCellFk=(EstadoPrecioTableCell)tableCellEditorEstadoPrecio;

		if(estadoprecioTableCellFk!=null) {
			estadoprecioTableCellFk.setestadopreciosForeignKey(estadopreciosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPrecio.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadoprecioTableCellFk.setRowActual(intSelectedRow);
			//estadoprecioTableCellFk.setestadopreciosForeignKeyActual(estadopreciosForeignKey);
		//}


		if(estadoprecioTableCellFk!=null) {
			estadoprecioTableCellFk.RecargarEstadoPreciosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPrecio(false);
			
			//if(!this.isEsNuevoPrecio) {								
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPrecio(this.precio,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
				
			}
			
			if(this.permiteMantenimiento(this.precio)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.precioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPrecio=true;
					this.inicializarActualizarBindingTablaPrecio(false);
					this.isEsNuevoPrecio=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPrecio=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPrecio=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPrecio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPrecio(false);
				
				this.habilitarDeshabilitarControlesPrecio(false);
			
												
				
				if(PrecioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePrecio();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPrecioActionPerformed(evt,precioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPrecio(this.precio,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPrecio.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,precioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.precio.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Precio.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Precio.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				this.precio.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				this.precio.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.precio)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.precioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PrecioModel) this.jTableDatosPrecio.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPrecio=true;
				this.inicializarActualizarBindingTablaPrecio(false);
				this.isEsNuevoPrecio=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPrecio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPrecio(false);
				
				this.habilitarDeshabilitarControlesPrecio(false);
				
				
				
				if(PrecioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePrecio();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPrecioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPrecio.getRowCount()>=1) {
				jTableDatosPrecio.removeRowSelectionInterval(0, jTableDatosPrecio.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPrecio(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPrecio(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPrecio(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPrecio(false) ;
			
			this.isEsNuevoPrecio=false;
			
			if(PrecioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePrecio();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPrecio(false);
				
				//SI ES MANUAL
				if(PrecioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPrecio();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPrecio--;			
			//Precio precioAux= new Precio();			
			//precioAux.setId(this.iIdNuevoPrecio);
			
			if(this.jInternalFrameDetalleFormPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPrecio();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
			
			this.precio.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.precioLogic.getPrecios().add(this.precioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.precios.add(this.precioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPrecio(false);
			
			this.jTableDatosPrecio.setRowSelectionInterval(this.getIndiceNuevoPrecio(), this.getIndiceNuevoPrecio());
			
			int iLastRow =  this.jTableDatosPrecio.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPrecio.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPrecio.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPrecio(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPrecio(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPrecio(false);
			
			//SI ES MANUAL
			if(PrecioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPrecio();
			}
			
			//this.abrirFrameTreePrecio();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPrecioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE PrecioS ?", "MANTENIMIENTO DE Precio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPrecio.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPrecio();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.precioReturnGeneral=precioLogic.procesarImportacionPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.precioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPrecioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPrecioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPrecio.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPrecio.setFileImportacion(this.jInternalFrameImportacionPrecio.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPrecio.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPrecio.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPrecio.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPrecio.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Precio> preciosSeleccionados=new ArrayList<Precio>();		

		preciosSeleccionados=this.getPreciosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPrecio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPrecio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PrecioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PrecioBaseDesign.jrxml";
			
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
			
			this.generarReportePrecios("Todos",preciosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.precioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Precio",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPrecio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPrecio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PrecioConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrecioConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrecioConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrecioConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrecioConstantesFunciones.LABEL_IDLINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Linea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Linea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Linea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Linea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrecioConstantesFunciones.LABEL_IDLINEAGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrecioConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaCategoria_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaCategoria_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaCategoria_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaCategoria_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrecioConstantesFunciones.LABEL_IDLINEAMARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaMarca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaMarca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaMarca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaMarca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrecioConstantesFunciones.LABEL_IDRANGOUNIDADVENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_RangoUnidadVenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_RangoUnidadVenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_RangoUnidadVenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_RangoUnidadVenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrecioConstantesFunciones.LABEL_IDTIPOPRECIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoPrecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoPrecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoPrecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoPrecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrecioConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrecioConstantesFunciones.LABEL_DESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrecioConstantesFunciones.LABEL_PRECIOMINIMO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecioMinimo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecioMinimo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecioMinimo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecioMinimo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrecioConstantesFunciones.LABEL_CONIMPUESTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nImpuesto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nImpuesto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nImpuesto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nImpuesto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrecioConstantesFunciones.LABEL_IDESTADOPRECIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoPrecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoPrecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoPrecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoPrecio_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPrecio.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPrecio.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPrecio.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PrecioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PrecioConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case PrecioConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case PrecioConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case PrecioConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoria="id_linea";
					break;

				case PrecioConstantesFunciones.LABEL_IDLINEAGRUPO:
					sNombreCampoCategoria="id_linea_grupo";
					break;

				case PrecioConstantesFunciones.LABEL_IDLINEACATEGORIA:
					sNombreCampoCategoria="id_linea_categoria";
					break;

				case PrecioConstantesFunciones.LABEL_IDLINEAMARCA:
					sNombreCampoCategoria="id_linea_marca";
					break;

				case PrecioConstantesFunciones.LABEL_IDRANGOUNIDADVENTA:
					sNombreCampoCategoria="id_rango_unidad_venta";
					break;

				case PrecioConstantesFunciones.LABEL_IDTIPOPRECIO:
					sNombreCampoCategoria="id_tipo_precio";
					break;

				case PrecioConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;

				case PrecioConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoria="descuento";
					break;

				case PrecioConstantesFunciones.LABEL_PRECIOMINIMO:
					sNombreCampoCategoria="precio_minimo";
					break;

				case PrecioConstantesFunciones.LABEL_CONIMPUESTO:
					sNombreCampoCategoria="con_impuesto";
					break;

				case PrecioConstantesFunciones.LABEL_IDESTADOPRECIO:
					sNombreCampoCategoria="id_estado_precio";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPrecio.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PrecioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PrecioConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case PrecioConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case PrecioConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case PrecioConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoriaValor="id_linea";
					break;

				case PrecioConstantesFunciones.LABEL_IDLINEAGRUPO:
					sNombreCampoCategoriaValor="id_linea_grupo";
					break;

				case PrecioConstantesFunciones.LABEL_IDLINEACATEGORIA:
					sNombreCampoCategoriaValor="id_linea_categoria";
					break;

				case PrecioConstantesFunciones.LABEL_IDLINEAMARCA:
					sNombreCampoCategoriaValor="id_linea_marca";
					break;

				case PrecioConstantesFunciones.LABEL_IDRANGOUNIDADVENTA:
					sNombreCampoCategoriaValor="id_rango_unidad_venta";
					break;

				case PrecioConstantesFunciones.LABEL_IDTIPOPRECIO:
					sNombreCampoCategoriaValor="id_tipo_precio";
					break;

				case PrecioConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;

				case PrecioConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoriaValor="descuento";
					break;

				case PrecioConstantesFunciones.LABEL_PRECIOMINIMO:
					sNombreCampoCategoriaValor="precio_minimo";
					break;

				case PrecioConstantesFunciones.LABEL_CONIMPUESTO:
					sNombreCampoCategoriaValor="con_impuesto";
					break;

				case PrecioConstantesFunciones.LABEL_IDESTADOPRECIO:
					sNombreCampoCategoriaValor="id_estado_precio";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPrecio.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPrecio.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PrecioConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PrecioConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case PrecioConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case PrecioConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case PrecioConstantesFunciones.LABEL_IDLINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea");
					break;

				case PrecioConstantesFunciones.LABEL_IDLINEAGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_grupo");
					break;

				case PrecioConstantesFunciones.LABEL_IDLINEACATEGORIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Categoria",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_categoria");
					break;

				case PrecioConstantesFunciones.LABEL_IDLINEAMARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_marca");
					break;

				case PrecioConstantesFunciones.LABEL_IDRANGOUNIDADVENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Rango Unidad Venta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_rango_unidad_venta");
					break;

				case PrecioConstantesFunciones.LABEL_IDTIPOPRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_precio");
					break;

				case PrecioConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
					break;

				case PrecioConstantesFunciones.LABEL_DESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento");
					break;

				case PrecioConstantesFunciones.LABEL_PRECIOMINIMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio Minimo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio_minimo");
					break;

				case PrecioConstantesFunciones.LABEL_CONIMPUESTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Impuesto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_impuesto");
					break;

				case PrecioConstantesFunciones.LABEL_IDESTADOPRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_precio");
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
	
	public void jButtonGenerarExcelReporteDinamicoPrecioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Precio> preciosSeleccionados=new ArrayList<Precio>();		
		
		preciosSeleccionados=this.getPreciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"precio";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Precios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPrecio.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPrecio.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PrecioConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrecioConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Precio precio:preciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precio.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrecioConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrecioConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(Precio precio:preciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precio.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrecioConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrecioConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(Precio precio:preciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precio.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrecioConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrecioConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(Precio precio:preciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precio.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrecioConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrecioConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(Precio precio:preciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precio.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrecioConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrecioConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(Precio precio:preciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precio.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrecioConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrecioConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(Precio precio:preciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precio.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrecioConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrecioConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(Precio precio:preciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precio.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrecioConstantesFunciones.LABEL_IDRANGOUNIDADVENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrecioConstantesFunciones.LABEL_IDRANGOUNIDADVENTA);
					iRow++;

					for(Precio precio:preciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precio.getrangounidadventa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrecioConstantesFunciones.LABEL_IDTIPOPRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrecioConstantesFunciones.LABEL_IDTIPOPRECIO);
					iRow++;

					for(Precio precio:preciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precio.gettipoprecio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrecioConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrecioConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(Precio precio:preciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precio.getprecio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrecioConstantesFunciones.LABEL_DESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrecioConstantesFunciones.LABEL_DESCUENTO);
					iRow++;

					for(Precio precio:preciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precio.getdescuento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrecioConstantesFunciones.LABEL_PRECIOMINIMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrecioConstantesFunciones.LABEL_PRECIOMINIMO);
					iRow++;

					for(Precio precio:preciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precio.getprecio_minimo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrecioConstantesFunciones.LABEL_CONIMPUESTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrecioConstantesFunciones.LABEL_CONIMPUESTO);
					iRow++;

					for(Precio precio:preciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precio.getcon_impuesto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrecioConstantesFunciones.LABEL_IDESTADOPRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrecioConstantesFunciones.LABEL_IDESTADOPRECIO);
					iRow++;

					for(Precio precio:preciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(precio.getestadoprecio_descripcion());
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
			//	this.getFilaCabeceraExportarExcelPrecio(row);				
			//	iRow++;
			//}				
			
			//for(Precio precioAux:preciosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPrecio(precioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.precioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Precio",JOptionPane.INFORMATION_MESSAGE);
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
				this.precioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPrecio(false);
			
			//SI ES MANUAL
			if(PrecioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPrecio();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPrecio(false);
			
			//SI ES MANUAL
			if(PrecioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPrecio();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPrecio(false);
			
			//SI ES MANUAL
			if(PrecioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPrecio();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPrecio() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPrecio.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPrecio.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPrecio.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPrecio.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPrecio.setMinimumSize(dimensionMinimum);
		this.jTableDatosPrecio.setMaximumSize(dimensionMaximum);
		this.jTableDatosPrecio.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPrecio(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPrecio(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPrecio(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPrecio(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPrecio(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.precioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPrecio(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPrecio(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPrecio(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PrecioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PrecioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPrecio() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPrecio();
		
		this.inicializarActualizarBindingBotonesManualPrecio(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.precioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPrecio();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPrecio() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPrecio(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPrecio(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPrecio.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPrecio.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePrecio.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPrecio!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPrecio.jCheckBoxPostAccionNuevoPrecio.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPrecio.jCheckBoxPostAccionSinCerrarPrecio.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPrecio.jCheckBoxPostAccionSinMensajePrecio.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPrecio.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPrecio.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePrecio.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPrecio!=null) {
				this.jInternalFrameDetalleFormPrecio.jCheckBoxPostAccionNuevoPrecio.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPrecio.jCheckBoxPostAccionSinCerrarPrecio.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPrecio.jCheckBoxPostAccionSinMensajePrecio.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPrecio.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPrecio.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPrecio!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPrecio.jComboBoxTiposAccionesFormularioPrecio.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPrecio.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPrecio!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPrecio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPrecio.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPrecio.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPrecio.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPrecio.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPrecio!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPrecio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPrecio.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPrecio.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPrecio(Boolean esInicializar) throws Exception {
		try	{	
			if(PrecioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPrecio(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPrecio() throws Exception {
		try	{
			if(PrecioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPrecio();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePrecio() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPrecio.jComboBoxTiposAccionesFormularioPrecio.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPrecio.jComboBoxTiposAccionesFormularioPrecio.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPrecio() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPrecio.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPrecio.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPrecio.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPrecio.addItem(reporte);
			}
			
			
			if(!this.precioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPrecio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPrecio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPrecio.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPrecio.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPrecio!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPrecio.jComboBoxTiposAccionesFormularioPrecio.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPrecio.jComboBoxTiposAccionesFormularioPrecio.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPrecio.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPrecio.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPrecio();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPrecio() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPrecio!=null) {
				this.jInternalFrameReporteDinamicoPrecio.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPrecio.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPrecio!=null) {
				this.jInternalFrameReporteDinamicoPrecio.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPrecio.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPrecio!=null) {
				
				if(this.jInternalFrameReporteDinamicoPrecio.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPrecio.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPrecio.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPrecio.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPrecio.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPrecio.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPrecio.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPrecio.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PrecioConstantesFunciones.getTiposSeleccionarPrecio(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPrecio.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPrecio.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPrecio.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PrecioConstantesFunciones.getTiposSeleccionarPrecio(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPrecio.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPrecio.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPrecio.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PrecioConstantesFunciones.getTiposSeleccionarPrecio(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPrecio.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPrecio.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPrecio.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPrecio.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPrecio()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.getSelectedItem()!=null){this.id_bodegaBusquedaPorIdBodegaPorIdProducto=((Bodega)this.jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoPrecio.getSelectedItem()!=null){this.id_productoBusquedaPorIdBodegaPorIdProducto=((Producto)this.jComboBoxid_productoBusquedaPorIdBodegaPorIdProductoPrecio.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio.getSelectedItem()!=null){this.id_lineaBusquedaPorLineaGrupoCategoriaMarca=((Linea)this.jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaPrecio.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio.getSelectedItem()!=null){this.id_linea_grupoBusquedaPorLineaGrupoCategoriaMarca=((Linea)this.jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaPrecio.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio.getSelectedItem()!=null){this.id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarca=((Linea)this.jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaPrecio.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio.getSelectedItem()!=null){this.id_linea_marcaBusquedaPorLineaGrupoCategoriaMarca=((Linea)this.jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaPrecio.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.getSelectedItem()!=null){this.id_lineaBusquedaPorLineaGrupoCategoriaMarcaProducto=((Linea)this.jComboBoxid_lineaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.getSelectedItem()!=null){this.id_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProducto=((Linea)this.jComboBoxid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.getSelectedItem()!=null){this.id_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProducto=((Linea)this.jComboBoxid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.getSelectedItem()!=null){this.id_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProducto=((Linea)this.jComboBoxid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.getSelectedItem()!=null){this.id_productoBusquedaPorLineaGrupoCategoriaMarcaProducto=((Producto)this.jComboBoxid_productoBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.getSelectedItem()).getId();}
		if(this.jComboBoxid_bodegaFK_IdBodegaPrecio.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaPrecio.getSelectedItem()).getId();}
		if(this.jComboBoxid_estado_precioFK_IdEstadoPrecioPrecio.getSelectedItem()!=null){this.id_estado_precioFK_IdEstadoPrecio=((EstadoPrecio)this.jComboBoxid_estado_precioFK_IdEstadoPrecioPrecio.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaFK_IdLineaPrecio.getSelectedItem()!=null){this.id_lineaFK_IdLinea=((Linea)this.jComboBoxid_lineaFK_IdLineaPrecio.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoPrecio.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoPrecio.getSelectedItem()).getId();}
		if(this.jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio.getSelectedItem()!=null){this.id_rango_unidad_ventaFK_IdRangoUnidadVenta=((RangoUnidadVenta)this.jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaPrecio.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPrecio(Boolean esInicializar) throws Exception {				
		if(PrecioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPrecio();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPrecio() throws Exception {
		this.inicializarActualizarBindingTablaPrecio(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPrecio() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPrecio.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPrecio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPrecio.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PrecioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPrecio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPrecio.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PrecioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPrecioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PrecioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPrecio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPrecio.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PrecioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPrecio.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPrecio(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=precioLogic.getPrecios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=precios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPrecio.setModel(new PrecioModel(this.precioLogic.getPrecios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPrecio.setModel(new PrecioModel(this.precios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPrecio!=null && this.jInternalFrameOrderByPrecio.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPrecio();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PrecioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PrecioConstantesFunciones.SCLASSWEBTITULO,precioConstantesFunciones.resaltarSeleccionarPrecio,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PrecioConstantesFunciones.SCLASSWEBTITULO,precioConstantesFunciones.resaltarSeleccionarPrecio,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_ID));

		if(this.precioConstantesFunciones.mostraridPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrecioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.precioConstantesFunciones.resaltaridPrecio,this.precioConstantesFunciones.activaridPrecio,iSizeTabla,this,true,"idPrecio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.precioConstantesFunciones.resaltaridPrecio,this.precioConstantesFunciones.activaridPrecio,this,true,"idPrecio","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_IDEMPRESA));

		if(this.precioConstantesFunciones.mostrarid_empresaPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrecioConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.precioConstantesFunciones.resaltarid_empresaPrecio,this,this.precioConstantesFunciones.activarid_empresaPrecio,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.precioConstantesFunciones.resaltarid_empresaPrecio,this,this.precioConstantesFunciones.activarid_empresaPrecio,false,"id_empresaPrecio","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.precioConstantesFunciones.mostrarid_sucursalPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrecioConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.precioConstantesFunciones.resaltarid_sucursalPrecio,this,this.precioConstantesFunciones.activarid_sucursalPrecio,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.precioConstantesFunciones.resaltarid_sucursalPrecio,this,this.precioConstantesFunciones.activarid_sucursalPrecio,false,"id_sucursalPrecio","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_IDBODEGA));

		if(this.precioConstantesFunciones.mostrarid_bodegaPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrecioConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.precioConstantesFunciones.resaltarid_bodegaPrecio,this,this.precioConstantesFunciones.activarid_bodegaPrecio,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.precioConstantesFunciones.resaltarid_bodegaPrecio,this,this.precioConstantesFunciones.activarid_bodegaPrecio,true,"id_bodegaPrecio","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new PrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.precioConstantesFunciones.mostrarid_productoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrecioConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.precioConstantesFunciones.resaltarid_productoPrecio,this,this.precioConstantesFunciones.activarid_productoPrecio,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.precioConstantesFunciones.resaltarid_productoPrecio,this,this.precioConstantesFunciones.activarid_productoPrecio,true,"id_productoPrecio","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new PrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_IDLINEA));

		if(this.precioConstantesFunciones.mostrarid_lineaPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrecioConstantesFunciones.LABEL_IDLINEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineasForeignKey,this.precioConstantesFunciones.resaltarid_lineaPrecio,this,this.precioConstantesFunciones.activarid_lineaPrecio,iSizeTabla));
			tableColumn.setCellEditor(new LineaTableCell(this.lineasForeignKey,this.precioConstantesFunciones.resaltarid_lineaPrecio,this,this.precioConstantesFunciones.activarid_lineaPrecio,true,"id_lineaPrecio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_IDLINEAGRUPO));

		if(this.precioConstantesFunciones.mostrarid_linea_grupoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrecioConstantesFunciones.LABEL_IDLINEAGRUPO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineagruposForeignKey,this.precioConstantesFunciones.resaltarid_linea_grupoPrecio,this,this.precioConstantesFunciones.activarid_linea_grupoPrecio,iSizeTabla));
			tableColumn.setCellEditor(new LineaTableCell(this.lineagruposForeignKey,this.precioConstantesFunciones.resaltarid_linea_grupoPrecio,this,this.precioConstantesFunciones.activarid_linea_grupoPrecio,true,"id_linea_grupoPrecio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_IDLINEACATEGORIA));

		if(this.precioConstantesFunciones.mostrarid_linea_categoriaPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrecioConstantesFunciones.LABEL_IDLINEACATEGORIA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineacategoriasForeignKey,this.precioConstantesFunciones.resaltarid_linea_categoriaPrecio,this,this.precioConstantesFunciones.activarid_linea_categoriaPrecio,iSizeTabla));
			tableColumn.setCellEditor(new LineaTableCell(this.lineacategoriasForeignKey,this.precioConstantesFunciones.resaltarid_linea_categoriaPrecio,this,this.precioConstantesFunciones.activarid_linea_categoriaPrecio,true,"id_linea_categoriaPrecio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_IDLINEAMARCA));

		if(this.precioConstantesFunciones.mostrarid_linea_marcaPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrecioConstantesFunciones.LABEL_IDLINEAMARCA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineamarcasForeignKey,this.precioConstantesFunciones.resaltarid_linea_marcaPrecio,this,this.precioConstantesFunciones.activarid_linea_marcaPrecio,iSizeTabla));
			tableColumn.setCellEditor(new LineaTableCell(this.lineamarcasForeignKey,this.precioConstantesFunciones.resaltarid_linea_marcaPrecio,this,this.precioConstantesFunciones.activarid_linea_marcaPrecio,true,"id_linea_marcaPrecio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_IDRANGOUNIDADVENTA));

		if(this.precioConstantesFunciones.mostrarid_rango_unidad_ventaPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrecioConstantesFunciones.LABEL_IDRANGOUNIDADVENTA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new RangoUnidadVentaTableCell(this.rangounidadventasForeignKey,this.precioConstantesFunciones.resaltarid_rango_unidad_ventaPrecio,this,this.precioConstantesFunciones.activarid_rango_unidad_ventaPrecio,iSizeTabla));
			tableColumn.setCellEditor(new RangoUnidadVentaTableCell(this.rangounidadventasForeignKey,this.precioConstantesFunciones.resaltarid_rango_unidad_ventaPrecio,this,this.precioConstantesFunciones.activarid_rango_unidad_ventaPrecio,true,"id_rango_unidad_ventaPrecio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_IDTIPOPRECIO));

		if(this.precioConstantesFunciones.mostrarid_tipo_precioPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrecioConstantesFunciones.LABEL_IDTIPOPRECIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoPrecioTableCell(this.tipopreciosForeignKey,this.precioConstantesFunciones.resaltarid_tipo_precioPrecio,this,this.precioConstantesFunciones.activarid_tipo_precioPrecio,iSizeTabla));
			tableColumn.setCellEditor(new TipoPrecioTableCell(this.tipopreciosForeignKey,this.precioConstantesFunciones.resaltarid_tipo_precioPrecio,this,this.precioConstantesFunciones.activarid_tipo_precioPrecio,true,"id_tipo_precioPrecio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_PRECIO));

		if(this.precioConstantesFunciones.mostrarprecioPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrecioConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.precioConstantesFunciones.resaltarprecioPrecio,this.precioConstantesFunciones.activarprecioPrecio,iSizeTabla,this,true,"precioPrecio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.precioConstantesFunciones.resaltarprecioPrecio,this.precioConstantesFunciones.activarprecioPrecio,this,true,"precioPrecio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_DESCUENTO));

		if(this.precioConstantesFunciones.mostrardescuentoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrecioConstantesFunciones.LABEL_DESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.precioConstantesFunciones.resaltardescuentoPrecio,this.precioConstantesFunciones.activardescuentoPrecio,iSizeTabla,this,true,"descuentoPrecio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.precioConstantesFunciones.resaltardescuentoPrecio,this.precioConstantesFunciones.activardescuentoPrecio,this,true,"descuentoPrecio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_PRECIOMINIMO));

		if(this.precioConstantesFunciones.mostrarprecio_minimoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrecioConstantesFunciones.LABEL_PRECIOMINIMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.precioConstantesFunciones.resaltarprecio_minimoPrecio,this.precioConstantesFunciones.activarprecio_minimoPrecio,iSizeTabla,this,true,"precio_minimoPrecio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.precioConstantesFunciones.resaltarprecio_minimoPrecio,this.precioConstantesFunciones.activarprecio_minimoPrecio,this,true,"precio_minimoPrecio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_CONIMPUESTO));

		if(this.precioConstantesFunciones.mostrarcon_impuestoPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrecioConstantesFunciones.LABEL_CONIMPUESTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.precioConstantesFunciones.resaltarcon_impuestoPrecio,this.precioConstantesFunciones.activarcon_impuestoPrecio,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.precioConstantesFunciones.resaltarcon_impuestoPrecio,this.precioConstantesFunciones.activarcon_impuestoPrecio,this,true,"con_impuestoPrecio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrecio,PrecioConstantesFunciones.LABEL_IDESTADOPRECIO));

		if(this.precioConstantesFunciones.mostrarid_estado_precioPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrecioConstantesFunciones.LABEL_IDESTADOPRECIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoPrecioTableCell(this.estadopreciosForeignKey,this.precioConstantesFunciones.resaltarid_estado_precioPrecio,this,this.precioConstantesFunciones.activarid_estado_precioPrecio,iSizeTabla));
			tableColumn.setCellEditor(new EstadoPrecioTableCell(this.estadopreciosForeignKey,this.precioConstantesFunciones.resaltarid_estado_precioPrecio,this,this.precioConstantesFunciones.activarid_estado_precioPrecio,true,"id_estado_precioPrecio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.precioSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.precioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.precioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPrecio.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.precioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.precioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPrecio.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPrecio && this.isPermisoGuardarCambiosPrecio) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.precioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.precioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPrecio.addColumn(tableColumn);
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
			
			this.jTableDatosPrecio.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPrecio && this.isPermisoGuardarCambiosPrecio) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPrecio && this.isPermisoGuardarCambiosPrecio) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPrecio.moveColumn(this.jTableDatosPrecio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPrecio.moveColumn(this.jTableDatosPrecio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPrecio.moveColumn(this.jTableDatosPrecio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPrecio.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPrecio.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPrecio,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPrecio.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPrecio.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPrecio.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPrecio.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPrecio.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=precioLogic.getPrecios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=precios.size()-1;
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
		//this.jTableDatosPrecio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPrecio();
			
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
				
				//this.isEsNuevoPrecio=false;
					
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
			
				if(this.precioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPrecio==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPrecio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPrecio.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.precio.getsType().equals("DUPLICADO")
				   || this.precio.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPrecio=true;
				
				} else {
					this.isEsNuevoPrecio=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.precioSessionBean.getEsGuardarRelacionado()) {
					if(this.precio.getId()>=0 && !this.precio.getIsNew()) {						
						this.isEsNuevoPrecio=false;
						
					} else {
						this.isEsNuevoPrecio=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPrecio(esRelaciones);						
				
				this.seleccionarPrecio(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.precio.getId()<0) {
					this.isEsNuevoPrecio=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPrecio(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPrecio(evt,rowIndex);
				}	
				
				if(this.precioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Precio: " + this.dDif); 
					}
				}								
				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPrecio(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.precio)) {
					if(this.precio.getId()>0) {
						this.precio.setIsDeleted(true);
						
						this.preciosEliminados.add(this.precio);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.precioLogic.getPrecios().remove(this.precio);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.precios.remove(this.precio);				
					}
					
					
					((PrecioModel) this.jTableDatosPrecio.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPrecio(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPrecio(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPrecio) {
			
			if(this.jInternalFrameDetalleFormPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPrecio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPrecio.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPrecio(this.precio);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.precioConstantesFunciones.cargarid_empresaPrecio || this.precioConstantesFunciones.event_dependid_empresaPrecio) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.precio.getid_empresa());
									//this.inicializarActualizarBindingPrecio(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(precio.getEmpresa()!=null) {
							this.empresasForeignKey.add(precio.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.precio.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.precioConstantesFunciones.cargarid_sucursalPrecio || this.precioConstantesFunciones.event_dependid_sucursalPrecio) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.precio.getid_sucursal());
									//this.inicializarActualizarBindingPrecio(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(precio.getSucursal()!=null) {
							this.sucursalsForeignKey.add(precio.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.precio.getid_sucursal(),false,"Formulario");

					//Bodega
					if(!this.precioConstantesFunciones.cargarid_bodegaPrecio || this.precioConstantesFunciones.event_dependid_bodegaPrecio) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.precio.getid_bodega());
									//this.inicializarActualizarBindingPrecio(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(precio.getBodega()!=null) {
							this.bodegasForeignKey.add(precio.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.precio.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.precioConstantesFunciones.cargarid_productoPrecio || this.precioConstantesFunciones.event_dependid_productoPrecio) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.precio.getid_producto());
									//this.inicializarActualizarBindingPrecio(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(precio.getProducto()!=null) {
							this.productosForeignKey.add(precio.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.precio.getid_producto(),false,"Formulario");

					//Linea
					if(!this.precioConstantesFunciones.cargarid_lineaPrecio || this.precioConstantesFunciones.event_dependid_lineaPrecio) {
						//this.cargarCombosLineasForeignKeyLista(" where id="+this.precio.getid_linea());
									//this.inicializarActualizarBindingPrecio(false,false);
						this.lineasForeignKey=new ArrayList<Linea>();

						if(precio.getLinea()!=null) {
							this.lineasForeignKey.add(precio.getLinea());
						}

						this.addItemDefectoCombosForeignKeyLinea();
						this.cargarCombosFrameLineasForeignKey("Todos");
					}
					this.setActualLineaForeignKey(this.precio.getid_linea(),false,"Formulario");

					//LineaGrupo
					if(!this.precioConstantesFunciones.cargarid_linea_grupoPrecio || this.precioConstantesFunciones.event_dependid_linea_grupoPrecio) {
						//this.cargarCombosLineaGruposForeignKeyLista(" where id="+this.precio.getid_linea_grupo());
									//this.inicializarActualizarBindingPrecio(false,false);
						this.lineagruposForeignKey=new ArrayList<Linea>();

						if(precio.getLineaGrupo()!=null) {
							this.lineagruposForeignKey.add(precio.getLineaGrupo());
						}

						this.addItemDefectoCombosForeignKeyLineaGrupo();
						this.cargarCombosFrameLineaGruposForeignKey("Todos");
					}
					this.setActualLineaGrupoForeignKey(this.precio.getid_linea_grupo(),false,"Formulario");

					//LineaCategoria
					if(!this.precioConstantesFunciones.cargarid_linea_categoriaPrecio || this.precioConstantesFunciones.event_dependid_linea_categoriaPrecio) {
						//this.cargarCombosLineaCategoriasForeignKeyLista(" where id="+this.precio.getid_linea_categoria());
									//this.inicializarActualizarBindingPrecio(false,false);
						this.lineacategoriasForeignKey=new ArrayList<Linea>();

						if(precio.getLineaCategoria()!=null) {
							this.lineacategoriasForeignKey.add(precio.getLineaCategoria());
						}

						this.addItemDefectoCombosForeignKeyLineaCategoria();
						this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
					}
					this.setActualLineaCategoriaForeignKey(this.precio.getid_linea_categoria(),false,"Formulario");

					//LineaMarca
					if(!this.precioConstantesFunciones.cargarid_linea_marcaPrecio || this.precioConstantesFunciones.event_dependid_linea_marcaPrecio) {
						//this.cargarCombosLineaMarcasForeignKeyLista(" where id="+this.precio.getid_linea_marca());
									//this.inicializarActualizarBindingPrecio(false,false);
						this.lineamarcasForeignKey=new ArrayList<Linea>();

						if(precio.getLineaMarca()!=null) {
							this.lineamarcasForeignKey.add(precio.getLineaMarca());
						}

						this.addItemDefectoCombosForeignKeyLineaMarca();
						this.cargarCombosFrameLineaMarcasForeignKey("Todos");
					}
					this.setActualLineaMarcaForeignKey(this.precio.getid_linea_marca(),false,"Formulario");

					//RangoUnidadVenta
					if(!this.precioConstantesFunciones.cargarid_rango_unidad_ventaPrecio || this.precioConstantesFunciones.event_dependid_rango_unidad_ventaPrecio) {
						//this.cargarCombosRangoUnidadVentasForeignKeyLista(" where id="+this.precio.getid_rango_unidad_venta());
									//this.inicializarActualizarBindingPrecio(false,false);
						this.rangounidadventasForeignKey=new ArrayList<RangoUnidadVenta>();

						if(precio.getRangoUnidadVenta()!=null) {
							this.rangounidadventasForeignKey.add(precio.getRangoUnidadVenta());
						}

						this.addItemDefectoCombosForeignKeyRangoUnidadVenta();
						this.cargarCombosFrameRangoUnidadVentasForeignKey("Todos");
					}
					this.setActualRangoUnidadVentaForeignKey(this.precio.getid_rango_unidad_venta(),false,"Formulario");

					//TipoPrecio
					if(!this.precioConstantesFunciones.cargarid_tipo_precioPrecio || this.precioConstantesFunciones.event_dependid_tipo_precioPrecio) {
						//this.cargarCombosTipoPreciosForeignKeyLista(" where id="+this.precio.getid_tipo_precio());
									//this.inicializarActualizarBindingPrecio(false,false);
						this.tipopreciosForeignKey=new ArrayList<TipoPrecio>();

						if(precio.getTipoPrecio()!=null) {
							this.tipopreciosForeignKey.add(precio.getTipoPrecio());
						}

						this.addItemDefectoCombosForeignKeyTipoPrecio();
						this.cargarCombosFrameTipoPreciosForeignKey("Todos");
					}
					this.setActualTipoPrecioForeignKey(this.precio.getid_tipo_precio(),false,"Formulario");

					//EstadoPrecio
					if(!this.precioConstantesFunciones.cargarid_estado_precioPrecio || this.precioConstantesFunciones.event_dependid_estado_precioPrecio) {
						//this.cargarCombosEstadoPreciosForeignKeyLista(" where id="+this.precio.getid_estado_precio());
									//this.inicializarActualizarBindingPrecio(false,false);
						this.estadopreciosForeignKey=new ArrayList<EstadoPrecio>();

						if(precio.getEstadoPrecio()!=null) {
							this.estadopreciosForeignKey.add(precio.getEstadoPrecio());
						}

						this.addItemDefectoCombosForeignKeyEstadoPrecio();
						this.cargarCombosFrameEstadoPreciosForeignKey("Todos");
					}
					this.setActualEstadoPrecioForeignKey(this.precio.getid_estado_precio(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPrecio("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPrecio(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPrecio() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPrecio(Precio precio) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPrecio(precio,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPrecio(Precio precio,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPrecio(precio);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPrecio(precio,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPrecio(precio);
	}
	
	public void setVariablesObjetoActualToFormularioPrecio(Precio precio) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPrecio.jLabelidPrecio.setText(precio.getId().toString());
			this.jInternalFrameDetalleFormPrecio.jTextFieldprecioPrecio.setText(precio.getprecio().toString());
			this.jInternalFrameDetalleFormPrecio.jTextFielddescuentoPrecio.setText(precio.getdescuento().toString());
			this.jInternalFrameDetalleFormPrecio.jTextFieldprecio_minimoPrecio.setText(precio.getprecio_minimo().toString());
			this.jInternalFrameDetalleFormPrecio.jCheckBoxcon_impuestoPrecio.setSelected(precio.getcon_impuesto());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Precio precioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,precioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Precio precioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				precioLocal=this.precio;
			} else {
				precioLocal=this.precioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(precioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPrecio(precioLocal,true);
					
					if(precioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(precioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.precioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(precioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPrecio(Precio precio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPrecio(precio,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPrecio(precio);
	}
	
	public void setVariablesFormularioToObjetoActualPrecio(Precio precio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPrecio(precio,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPrecio(Precio precio,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPrecio.jLabelidPrecio.getText()==null || this.jInternalFrameDetalleFormPrecio.jLabelidPrecio.getText()=="" || this.jInternalFrameDetalleFormPrecio.jLabelidPrecio.getText()=="Id") {
				this.jInternalFrameDetalleFormPrecio.jLabelidPrecio.setText("0");
			}

			if(conColumnasBase) {precio.setId(Long.parseLong(this.jInternalFrameDetalleFormPrecio.jLabelidPrecio.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PrecioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrecio.jLabelIdPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			precio.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormPrecio.jTextFieldprecioPrecio.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PrecioConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrecio.jLabelprecioPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			precio.setdescuento(Double.parseDouble(this.jInternalFrameDetalleFormPrecio.jTextFielddescuentoPrecio.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PrecioConstantesFunciones.LABEL_DESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrecio.jLabeldescuentoPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			precio.setprecio_minimo(Double.parseDouble(this.jInternalFrameDetalleFormPrecio.jTextFieldprecio_minimoPrecio.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PrecioConstantesFunciones.LABEL_PRECIOMINIMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrecio.jLabelprecio_minimoPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			precio.setcon_impuesto(this.jInternalFrameDetalleFormPrecio.jCheckBoxcon_impuestoPrecio.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PrecioConstantesFunciones.LABEL_CONIMPUESTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrecio.jLabelcon_impuestoPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPrecio(Precio precioBean,Precio precio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && precioBean.getid_bodega()!=null && !precioBean.getid_bodega().equals(-1L))) {precio.setid_bodega(precioBean.getid_bodega());}
			if(conDefault || (!conDefault && precioBean.getid_producto()!=null && !precioBean.getid_producto().equals(-1L))) {precio.setid_producto(precioBean.getid_producto());}
			if(conDefault || (!conDefault && precioBean.getid_linea()!=null && !precioBean.getid_linea().equals(null))) {precio.setid_linea(precioBean.getid_linea());}
			if(conDefault || (!conDefault && precioBean.getid_linea_grupo()!=null && !precioBean.getid_linea_grupo().equals(null))) {precio.setid_linea_grupo(precioBean.getid_linea_grupo());}
			if(conDefault || (!conDefault && precioBean.getid_linea_categoria()!=null && !precioBean.getid_linea_categoria().equals(null))) {precio.setid_linea_categoria(precioBean.getid_linea_categoria());}
			if(conDefault || (!conDefault && precioBean.getid_linea_marca()!=null && !precioBean.getid_linea_marca().equals(null))) {precio.setid_linea_marca(precioBean.getid_linea_marca());}
			if(conDefault || (!conDefault && precioBean.getid_rango_unidad_venta()!=null && !precioBean.getid_rango_unidad_venta().equals(-1L))) {precio.setid_rango_unidad_venta(precioBean.getid_rango_unidad_venta());}
			if(conDefault || (!conDefault && precioBean.getid_tipo_precio()!=null && !precioBean.getid_tipo_precio().equals(-1L))) {precio.setid_tipo_precio(precioBean.getid_tipo_precio());}
			if(conDefault || (!conDefault && precioBean.getid_estado_precio()!=null && !precioBean.getid_estado_precio().equals(-1L))) {precio.setid_estado_precio(precioBean.getid_estado_precio());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPrecio(Precio precioOrigen,Precio precio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && precioOrigen.getId()!=null && !precioOrigen.getId().equals(0L))) {precio.setId(precioOrigen.getId());}}
			if(conDefault || (!conDefault && precioOrigen.getid_bodega()!=null && !precioOrigen.getid_bodega().equals(-1L))) {precio.setid_bodega(precioOrigen.getid_bodega());}
			if(conDefault || (!conDefault && precioOrigen.getid_producto()!=null && !precioOrigen.getid_producto().equals(-1L))) {precio.setid_producto(precioOrigen.getid_producto());}
			if(conDefault || (!conDefault && precioOrigen.getid_linea()!=null && !precioOrigen.getid_linea().equals(null))) {precio.setid_linea(precioOrigen.getid_linea());}
			if(conDefault || (!conDefault && precioOrigen.getid_linea_grupo()!=null && !precioOrigen.getid_linea_grupo().equals(null))) {precio.setid_linea_grupo(precioOrigen.getid_linea_grupo());}
			if(conDefault || (!conDefault && precioOrigen.getid_linea_categoria()!=null && !precioOrigen.getid_linea_categoria().equals(null))) {precio.setid_linea_categoria(precioOrigen.getid_linea_categoria());}
			if(conDefault || (!conDefault && precioOrigen.getid_linea_marca()!=null && !precioOrigen.getid_linea_marca().equals(null))) {precio.setid_linea_marca(precioOrigen.getid_linea_marca());}
			if(conDefault || (!conDefault && precioOrigen.getid_rango_unidad_venta()!=null && !precioOrigen.getid_rango_unidad_venta().equals(-1L))) {precio.setid_rango_unidad_venta(precioOrigen.getid_rango_unidad_venta());}
			if(conDefault || (!conDefault && precioOrigen.getid_tipo_precio()!=null && !precioOrigen.getid_tipo_precio().equals(-1L))) {precio.setid_tipo_precio(precioOrigen.getid_tipo_precio());}
			if(conDefault || (!conDefault && precioOrigen.getprecio()!=null && !precioOrigen.getprecio().equals(0.0))) {precio.setprecio(precioOrigen.getprecio());}
			if(conDefault || (!conDefault && precioOrigen.getdescuento()!=null && !precioOrigen.getdescuento().equals(0.0))) {precio.setdescuento(precioOrigen.getdescuento());}
			if(conDefault || (!conDefault && precioOrigen.getprecio_minimo()!=null && !precioOrigen.getprecio_minimo().equals(0.0))) {precio.setprecio_minimo(precioOrigen.getprecio_minimo());}
			if(conDefault || (!conDefault && precioOrigen.getcon_impuesto()!=null && !precioOrigen.getcon_impuesto().equals(false))) {precio.setcon_impuesto(precioOrigen.getcon_impuesto());}
			if(conDefault || (!conDefault && precioOrigen.getid_estado_precio()!=null && !precioOrigen.getid_estado_precio().equals(-1L))) {precio.setid_estado_precio(precioOrigen.getid_estado_precio());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPrecio(Precio precio) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPrecio.jLabelidPrecio.setText(precio.getId().toString());
			this.jInternalFrameDetalleFormPrecio.jTextFieldprecioPrecio.setText(precio.getprecio().toString());
			this.jInternalFrameDetalleFormPrecio.jTextFielddescuentoPrecio.setText(precio.getdescuento().toString());
			this.jInternalFrameDetalleFormPrecio.jTextFieldprecio_minimoPrecio.setText(precio.getprecio_minimo().toString());
			this.jInternalFrameDetalleFormPrecio.jCheckBoxcon_impuestoPrecio.setSelected(precio.getcon_impuesto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPrecio(PrecioBean precioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPrecio.jLabelidPrecio.setText(precioBean.getId().toString());
			this.jInternalFrameDetalleFormPrecio.jTextFieldprecioPrecio.setText(precioBean.getprecio().toString());
			this.jInternalFrameDetalleFormPrecio.jTextFielddescuentoPrecio.setText(precioBean.getdescuento().toString());
			this.jInternalFrameDetalleFormPrecio.jTextFieldprecio_minimoPrecio.setText(precioBean.getprecio_minimo().toString());
			this.jInternalFrameDetalleFormPrecio.jCheckBoxcon_impuestoPrecio.setSelected(precioBean.getcon_impuesto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPrecio(PrecioParameterReturnGeneral precioReturnGeneral,PrecioBean precioBean,Boolean conDefault) throws Exception { 
		try {
			Precio precioLocal=new Precio();
			
			precioLocal=precioReturnGeneral.getPrecio();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && precioLocal.getId()!=null && !precioLocal.getId().equals(0L))) {precioBean.setId(precioLocal.getId());}}
			if(conDefault || (!conDefault && precioLocal.getid_bodega()!=null && !precioLocal.getid_bodega().equals(-1L))) {precioBean.setid_bodega(precioLocal.getid_bodega());}
			if(conDefault || (!conDefault && precioLocal.getid_producto()!=null && !precioLocal.getid_producto().equals(-1L))) {precioBean.setid_producto(precioLocal.getid_producto());}
			if(conDefault || (!conDefault && precioLocal.getid_linea()!=null && !precioLocal.getid_linea().equals(null))) {precioBean.setid_linea(precioLocal.getid_linea());}
			if(conDefault || (!conDefault && precioLocal.getid_linea_grupo()!=null && !precioLocal.getid_linea_grupo().equals(null))) {precioBean.setid_linea_grupo(precioLocal.getid_linea_grupo());}
			if(conDefault || (!conDefault && precioLocal.getid_linea_categoria()!=null && !precioLocal.getid_linea_categoria().equals(null))) {precioBean.setid_linea_categoria(precioLocal.getid_linea_categoria());}
			if(conDefault || (!conDefault && precioLocal.getid_linea_marca()!=null && !precioLocal.getid_linea_marca().equals(null))) {precioBean.setid_linea_marca(precioLocal.getid_linea_marca());}
			if(conDefault || (!conDefault && precioLocal.getid_rango_unidad_venta()!=null && !precioLocal.getid_rango_unidad_venta().equals(-1L))) {precioBean.setid_rango_unidad_venta(precioLocal.getid_rango_unidad_venta());}
			if(conDefault || (!conDefault && precioLocal.getid_tipo_precio()!=null && !precioLocal.getid_tipo_precio().equals(-1L))) {precioBean.setid_tipo_precio(precioLocal.getid_tipo_precio());}
			if(conDefault || (!conDefault && precioLocal.getprecio()!=null && !precioLocal.getprecio().equals(0.0))) {precioBean.setprecio(precioLocal.getprecio());}
			if(conDefault || (!conDefault && precioLocal.getdescuento()!=null && !precioLocal.getdescuento().equals(0.0))) {precioBean.setdescuento(precioLocal.getdescuento());}
			if(conDefault || (!conDefault && precioLocal.getprecio_minimo()!=null && !precioLocal.getprecio_minimo().equals(0.0))) {precioBean.setprecio_minimo(precioLocal.getprecio_minimo());}
			if(conDefault || (!conDefault && precioLocal.getcon_impuesto()!=null && !precioLocal.getcon_impuesto().equals(false))) {precioBean.setcon_impuesto(precioLocal.getcon_impuesto());}
			if(conDefault || (!conDefault && precioLocal.getid_estado_precio()!=null && !precioLocal.getid_estado_precio().equals(-1L))) {precioBean.setid_estado_precio(precioLocal.getid_estado_precio());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPrecioGenerico(Long idPrecioSeleccionado,JComboBox jComboBoxPrecio,List<Precio> preciosLocal)throws Exception {
		try {
			Precio  precioTemp=null;

			for(Precio precioAux:preciosLocal) {
				if(precioAux.getId()!=null && precioAux.getId().equals(idPrecioSeleccionado)) {
					precioTemp=precioAux;
					break;
				}
			}

			jComboBoxPrecio.setSelectedItem(precioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPrecioGenerico(JComboBox jComboBoxPrecio,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPrecio.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPrecio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPrecio.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPrecio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			precio=(Precio) precioLogic.getPrecios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			precio =(Precio) precios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!precio.getIsNew() && !precio.getIsChanged() && !precio.getIsDeleted()) {
				sDescripcion=precio.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=precio.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!precio.getIsNew() && !precio.getIsChanged() && !precio.getIsDeleted()) {
				sDescripcion=precio.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=precio.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!precio.getIsNew() && !precio.getIsChanged() && !precio.getIsDeleted()) {
				sDescripcion=precio.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=precio.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!precio.getIsNew() && !precio.getIsChanged() && !precio.getIsDeleted()) {
				sDescripcion=precio.getproducto_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=precio.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!precio.getIsNew() && !precio.getIsChanged() && !precio.getIsDeleted()) {
				sDescripcion=precio.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=precio.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!precio.getIsNew() && !precio.getIsChanged() && !precio.getIsDeleted()) {
				sDescripcion=precio.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=precio.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!precio.getIsNew() && !precio.getIsChanged() && !precio.getIsDeleted()) {
				sDescripcion=precio.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=precio.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!precio.getIsNew() && !precio.getIsChanged() && !precio.getIsDeleted()) {
				sDescripcion=precio.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=precio.getlineamarca_descripcion();
			}
		}

		if(sTipo.equals("RangoUnidadVenta")) {
			//sDescripcion=this.getActualRangoUnidadVentaForeignKeyDescripcion((Long)value);
			if(!precio.getIsNew() && !precio.getIsChanged() && !precio.getIsDeleted()) {
				sDescripcion=precio.getrangounidadventa_descripcion();
			} else {
				//sDescripcion=this.getActualRangoUnidadVentaForeignKeyDescripcion((Long)value);
				sDescripcion=precio.getrangounidadventa_descripcion();
			}
		}

		if(sTipo.equals("TipoPrecio")) {
			//sDescripcion=this.getActualTipoPrecioForeignKeyDescripcion((Long)value);
			if(!precio.getIsNew() && !precio.getIsChanged() && !precio.getIsDeleted()) {
				sDescripcion=precio.gettipoprecio_descripcion();
			} else {
				//sDescripcion=this.getActualTipoPrecioForeignKeyDescripcion((Long)value);
				sDescripcion=precio.gettipoprecio_descripcion();
			}
		}

		if(sTipo.equals("EstadoPrecio")) {
			//sDescripcion=this.getActualEstadoPrecioForeignKeyDescripcion((Long)value);
			if(!precio.getIsNew() && !precio.getIsChanged() && !precio.getIsDeleted()) {
				sDescripcion=precio.getestadoprecio_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoPrecioForeignKeyDescripcion((Long)value);
				sDescripcion=precio.getestadoprecio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Precio precioRow=new Precio();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			precioRow=(Precio) precioLogic.getPrecios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			precioRow=(Precio) precios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPrecio(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPrecio.setVisible((this.isVisibilidadCeldaNuevoPrecio && this.isPermisoNuevoPrecio));			
			this.jButtonDuplicarPrecio.setVisible((this.isVisibilidadCeldaDuplicarPrecio && this.isPermisoDuplicarPrecio));			
			this.jButtonCopiarPrecio.setVisible((this.isVisibilidadCeldaCopiarPrecio && this.isPermisoCopiarPrecio));
			this.jButtonVerFormPrecio.setVisible((this.isVisibilidadCeldaVerFormPrecio && this.isPermisoVerFormPrecio));
			
			this.jButtonAbrirOrderByPrecio.setVisible((this.isVisibilidadCeldaOrdenPrecio && this.isPermisoOrdenPrecio));			
			
			this.jButtonNuevoRelacionesPrecio.setVisible((this.isVisibilidadCeldaNuevoRelacionesPrecio && this.isPermisoNuevoPrecio));			
			this.jButtonNuevoGuardarCambiosPrecio.setVisible((this.isVisibilidadCeldaNuevoPrecio && this.isPermisoNuevoPrecio && this.isPermisoGuardarCambiosPrecio));
			
			if(this.jInternalFrameDetalleFormPrecio!=null) {
			this.jInternalFrameDetalleFormPrecio.jButtonModificarPrecio.setVisible((this.isVisibilidadCeldaModificarPrecio && this.isPermisoActualizarPrecio));	
			this.jInternalFrameDetalleFormPrecio.jButtonActualizarPrecio.setVisible((this.isVisibilidadCeldaActualizarPrecio && this.isPermisoActualizarPrecio));	
			this.jInternalFrameDetalleFormPrecio.jButtonEliminarPrecio.setVisible((this.isVisibilidadCeldaEliminarPrecio && this.isPermisoEliminarPrecio));
			this.jInternalFrameDetalleFormPrecio.jButtonCancelarPrecio.setVisible(this.isVisibilidadCeldaCancelarPrecio);							
			this.jInternalFrameDetalleFormPrecio.jButtonGuardarCambiosPrecio.setVisible((this.isVisibilidadCeldaGuardarPrecio && this.isPermisoGuardarCambiosPrecio));			
			
			}
						
			this.jButtonGuardarCambiosTablaPrecio.setVisible((this.isVisibilidadCeldaGuardarCambiosPrecio && this.isPermisoGuardarCambiosPrecio));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPrecio.setVisible((this.isVisibilidadCeldaNuevoPrecio && this.isPermisoNuevoPrecio));						
			this.jButtonDuplicarToolBarPrecio.setVisible((this.isVisibilidadCeldaDuplicarPrecio && this.isPermisoDuplicarPrecio));						
			this.jButtonCopiarToolBarPrecio.setVisible((this.isVisibilidadCeldaCopiarPrecio && this.isPermisoCopiarPrecio));			
			this.jButtonVerFormToolBarPrecio.setVisible((this.isVisibilidadCeldaVerFormPrecio && this.isPermisoVerFormPrecio));			
			this.jButtonAbrirOrderByToolBarPrecio.setVisible((this.isVisibilidadCeldaOrdenPrecio && this.isPermisoOrdenPrecio));
			this.jButtonNuevoRelacionesToolBarPrecio.setVisible((this.isVisibilidadCeldaNuevoRelacionesPrecio && this.isPermisoNuevoPrecio));			
			this.jButtonNuevoGuardarCambiosToolBarPrecio.setVisible((this.isVisibilidadCeldaNuevoPrecio && this.isPermisoNuevoPrecio && this.isPermisoGuardarCambiosPrecio));			
			
			if(this.jInternalFrameDetalleFormPrecio!=null) {
			this.jInternalFrameDetalleFormPrecio.jButtonModificarToolBarPrecio.setVisible((this.isVisibilidadCeldaModificarPrecio && this.isPermisoActualizarPrecio));	
			this.jInternalFrameDetalleFormPrecio.jButtonActualizarToolBarPrecio.setVisible((this.isVisibilidadCeldaActualizarPrecio  && this.isPermisoActualizarPrecio));	
			this.jInternalFrameDetalleFormPrecio.jButtonEliminarToolBarPrecio.setVisible((this.isVisibilidadCeldaEliminarPrecio && this.isPermisoEliminarPrecio));
			this.jInternalFrameDetalleFormPrecio.jButtonCancelarToolBarPrecio.setVisible(this.isVisibilidadCeldaCancelarPrecio);				
			this.jInternalFrameDetalleFormPrecio.jButtonGuardarCambiosToolBarPrecio.setVisible((this.isVisibilidadCeldaGuardarPrecio && this.isPermisoGuardarCambiosPrecio));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPrecio.setVisible((this.isVisibilidadCeldaGuardarCambiosPrecio && this.isPermisoGuardarCambiosPrecio));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPrecio.setVisible((this.isVisibilidadCeldaNuevoPrecio && this.isPermisoNuevoPrecio));			
			this.jMenuItemDuplicarPrecio.setVisible((this.isVisibilidadCeldaDuplicarPrecio && this.isPermisoDuplicarPrecio));			
			this.jMenuItemCopiarPrecio.setVisible((this.isVisibilidadCeldaCopiarPrecio && this.isPermisoCopiarPrecio));			
			this.jMenuItemVerFormPrecio.setVisible((this.isVisibilidadCeldaVerFormPrecio && this.isPermisoVerFormPrecio));			
			this.jMenuItemAbrirOrderByPrecio.setVisible((this.isVisibilidadCeldaOrdenPrecio && this.isPermisoOrdenPrecio));			
			//this.jMenuItemMostrarOcultarPrecio.setVisible((this.isVisibilidadCeldaOrdenPrecio && this.isPermisoOrdenPrecio));
			this.jMenuItemDetalleAbrirOrderByPrecio.setVisible((this.isVisibilidadCeldaOrdenPrecio && this.isPermisoOrdenPrecio));			
			//this.jMenuItemDetalleMostrarOcultarPrecio.setVisible((this.isVisibilidadCeldaOrdenPrecio && this.isPermisoOrdenPrecio));			
			this.jMenuItemNuevoRelacionesPrecio.setVisible((this.isVisibilidadCeldaNuevoRelacionesPrecio && this.isPermisoNuevoPrecio));			
			this.jMenuItemNuevoGuardarCambiosPrecio.setVisible((this.isVisibilidadCeldaNuevoPrecio && this.isPermisoNuevoPrecio && this.isPermisoGuardarCambiosPrecio));									
			
			if(this.jInternalFrameDetalleFormPrecio!=null) {
			this.jInternalFrameDetalleFormPrecio.jMenuItemModificarPrecio.setVisible((this.isVisibilidadCeldaModificarPrecio && this.isPermisoActualizarPrecio));	
			this.jInternalFrameDetalleFormPrecio.jMenuItemActualizarPrecio.setVisible((this.isVisibilidadCeldaActualizarPrecio && this.isPermisoActualizarPrecio));	
			this.jInternalFrameDetalleFormPrecio.jMenuItemEliminarPrecio.setVisible((this.isVisibilidadCeldaEliminarPrecio && this.isPermisoEliminarPrecio));
			this.jInternalFrameDetalleFormPrecio.jMenuItemCancelarPrecio.setVisible(this.isVisibilidadCeldaCancelarPrecio);				
			}
			
			this.jMenuItemGuardarCambiosPrecio.setVisible((this.isVisibilidadCeldaGuardarPrecio && this.isPermisoGuardarCambiosPrecio));						
			this.jMenuItemGuardarCambiosTablaPrecio.setVisible((this.isVisibilidadCeldaGuardarCambiosPrecio && this.isPermisoGuardarCambiosPrecio));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPrecio=this.jButtonNuevoPrecio.isVisible();
			this.isVisibilidadCeldaDuplicarPrecio=this.jButtonDuplicarPrecio.isVisible();
			this.isVisibilidadCeldaCopiarPrecio=this.jButtonCopiarPrecio.isVisible();
			this.isVisibilidadCeldaVerFormPrecio=this.jButtonVerFormPrecio.isVisible();
			
			this.isVisibilidadCeldaOrdenPrecio=this.jButtonAbrirOrderByPrecio.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPrecio=this.jButtonNuevoRelacionesPrecio.isVisible();
			this.isVisibilidadCeldaModificarPrecio=this.jButtonModificarPrecio.isVisible();
			
			if(this.jInternalFrameDetalleFormPrecio!=null) {
			this.isVisibilidadCeldaActualizarPrecio=this.jInternalFrameDetalleFormPrecio.jButtonActualizarPrecio.isVisible();
			this.isVisibilidadCeldaEliminarPrecio=this.jInternalFrameDetalleFormPrecio.jButtonEliminarPrecio.isVisible();
			this.isVisibilidadCeldaCancelarPrecio=this.jInternalFrameDetalleFormPrecio.jButtonCancelarPrecio.isVisible();
			this.isVisibilidadCeldaGuardarPrecio=this.jInternalFrameDetalleFormPrecio.jButtonGuardarCambiosPrecio.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPrecio=this.jButtonGuardarCambiosTablaPrecio.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPrecio=this.jButtonNuevoToolBarPrecio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPrecio=this.jButtonNuevoRelacionesToolBarPrecio.isVisible();
			
			if(this.jInternalFrameDetalleFormPrecio!=null) {
			this.isVisibilidadCeldaModificarPrecio=this.jInternalFrameDetalleFormPrecio.jButtonModificarToolBarPrecio.isVisible();
			this.isVisibilidadCeldaActualizarPrecio=this.jInternalFrameDetalleFormPrecio.jButtonActualizarToolBarPrecio.isVisible();
			this.isVisibilidadCeldaEliminarPrecio=this.jInternalFrameDetalleFormPrecio.jButtonEliminarToolBarPrecio.isVisible();
			this.isVisibilidadCeldaCancelarPrecio=this.jInternalFrameDetalleFormPrecio.jButtonCancelarToolBarPrecio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPrecio=this.jButtonGuardarCambiosToolBarPrecio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPrecio=this.jButtonGuardarCambiosTablaToolBarPrecio.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPrecio=this.jMenuItemNuevoPrecio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPrecio=this.jMenuItemNuevoRelacionesPrecio.isVisible();
			
			if(this.jInternalFrameDetalleFormPrecio!=null) {
			this.isVisibilidadCeldaModificarPrecio=this.jInternalFrameDetalleFormPrecio.jMenuItemModificarPrecio.isVisible();
			this.isVisibilidadCeldaActualizarPrecio=this.jInternalFrameDetalleFormPrecio.jMenuItemActualizarPrecio.isVisible();
			this.isVisibilidadCeldaEliminarPrecio=this.jInternalFrameDetalleFormPrecio.jMenuItemEliminarPrecio.isVisible();
			this.isVisibilidadCeldaCancelarPrecio=this.jInternalFrameDetalleFormPrecio.jMenuItemCancelarPrecio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPrecio=this.jMenuItemGuardarCambiosPrecio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPrecio=this.jMenuItemGuardarCambiosTablaPrecio.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPrecio(Boolean esInicializar) {
		if(PrecioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.precioSessionBean.getConGuardarRelaciones()) {
				//if(this.precioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPrecio();
			}
			
			this.inicializarActualizarBindingBotonesManualPrecio(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPrecio() {
		this.jButtonNuevoPrecio.setVisible(this.isPermisoNuevoPrecio);			
		this.jButtonDuplicarPrecio.setVisible(this.isPermisoDuplicarPrecio);			
		this.jButtonCopiarPrecio.setVisible(this.isPermisoCopiarPrecio);			
		this.jButtonVerFormPrecio.setVisible(this.isPermisoVerFormPrecio);			
		
		this.jButtonAbrirOrderByPrecio.setVisible(this.isPermisoOrdenPrecio);					
		
		this.jButtonNuevoRelacionesPrecio.setVisible(this.isPermisoNuevoPrecio);			
		
		if(this.jInternalFrameDetalleFormPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrecio.jButtonModificarPrecio.setVisible(this.isPermisoActualizarPrecio);	
			this.jInternalFrameDetalleFormPrecio.jButtonActualizarPrecio.setVisible(this.isPermisoActualizarPrecio);	
			this.jInternalFrameDetalleFormPrecio.jButtonEliminarPrecio.setVisible(this.isPermisoEliminarPrecio);
			this.jInternalFrameDetalleFormPrecio.jButtonCancelarPrecio.setVisible(this.isVisibilidadCeldaCancelarPrecio);						
			this.jInternalFrameDetalleFormPrecio.jButtonGuardarCambiosPrecio.setVisible(this.isPermisoGuardarCambiosPrecio);							
		}
		
		this.jButtonGuardarCambiosTablaPrecio.setVisible(this.isPermisoActualizarPrecio);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePrecio() {
		this.jInternalFrameDetalleFormPrecio.jButtonModificarPrecio.setVisible(this.isPermisoActualizarPrecio);	
		this.jInternalFrameDetalleFormPrecio.jButtonActualizarPrecio.setVisible(this.isPermisoActualizarPrecio);	
		this.jInternalFrameDetalleFormPrecio.jButtonEliminarPrecio.setVisible(this.isPermisoEliminarPrecio);
		this.jInternalFrameDetalleFormPrecio.jButtonCancelarPrecio.setVisible(this.isVisibilidadCeldaCancelarPrecio);							
		this.jInternalFrameDetalleFormPrecio.jButtonGuardarCambiosPrecio.setVisible((this.isVisibilidadCeldaGuardarPrecio && this.isPermisoGuardarCambiosPrecio));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPrecio() {
		if(PrecioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPrecio();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPrecio() {
	}
	
	public void jTableDatosPrecioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPrecio(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precio==null) {
						this.precio = new Precio();
					}

					this.setVariablesFormularioToObjetoActualPrecio(this.precio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
				}

				if(this.precio.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.precio.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPrecioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPrecio(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPrecio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPrecio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.precioLogic.getConnexion());

				if(this.precio.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.precio.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPrecio=(TitledBorder)this.jScrollPanelDatosPrecio.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPrecio.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precio==null) {
						this.precio = new Precio();
					}

					this.setVariablesFormularioToObjetoActualPrecio(this.precio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
				}

				if(this.precio.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.precio.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalPrecioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebPrecio(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPrecio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPrecio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.precioLogic.getConnexion());

				if(this.precio.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.precio.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPrecio=(TitledBorder)this.jScrollPanelDatosPrecio.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderPrecio.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precio==null) {
						this.precio = new Precio();
					}

					this.setVariablesFormularioToObjetoActualPrecio(this.precio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
				}

				if(this.precio.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.precio.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaPrecioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebPrecio(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPrecio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPrecio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.precioLogic.getConnexion());

				if(this.precio.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.precio.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPrecio=(TitledBorder)this.jScrollPanelDatosPrecio.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderPrecio.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precio==null) {
						this.precio = new Precio();
					}

					this.setVariablesFormularioToObjetoActualPrecio(this.precio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
				}

				if(this.precio.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.precio.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoPrecioActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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

				//BUSQUEDA FILTRADA DESDE COMBO EVENT Y EVENTDEPEND
				this.productoBeanSwingJInternalFrame.sFinalQueryGeneral=this.sFinalQueryComboProducto;
				this.productoBeanSwingJInternalFrame.procesarBusqueda(this.productoBeanSwingJInternalFrame.sAccionBusqueda);
				this.productoBeanSwingJInternalFrame.inicializarActualizarBindingProducto(false);
			}


			JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderPrecio=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosPrecio.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderPrecio=(TitledBorder)this.jScrollPanelDatosPrecio.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderPrecio.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoPrecioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebPrecio(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPrecio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPrecio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.precioLogic.getConnexion());

				if(this.precio.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.precio.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPrecio=(TitledBorder)this.jScrollPanelDatosPrecio.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderPrecio.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precio==null) {
						this.precio = new Precio();
					}

					this.setVariablesFormularioToObjetoActualPrecio(this.precio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
				}

				if(this.precio.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.precio.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaPrecioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebPrecio(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPrecio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPrecio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.precioLogic.getConnexion());

				if(this.precio.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.precio.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPrecio=(TitledBorder)this.jScrollPanelDatosPrecio.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderPrecio.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precio==null) {
						this.precio = new Precio();
					}

					this.setVariablesFormularioToObjetoActualPrecio(this.precio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
				}

				if(this.precio.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.precio.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoPrecioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebPrecio(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPrecio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPrecio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.precioLogic.getConnexion());

				if(this.precio.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.precio.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPrecio=(TitledBorder)this.jScrollPanelDatosPrecio.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderPrecio.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precio==null) {
						this.precio = new Precio();
					}

					this.setVariablesFormularioToObjetoActualPrecio(this.precio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
				}

				if(this.precio.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.precio.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaPrecioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebPrecio(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPrecio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPrecio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.precioLogic.getConnexion());

				if(this.precio.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.precio.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPrecio=(TitledBorder)this.jScrollPanelDatosPrecio.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderPrecio.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precio==null) {
						this.precio = new Precio();
					}

					this.setVariablesFormularioToObjetoActualPrecio(this.precio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
				}

				if(this.precio.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.precio.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaPrecioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebPrecio(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPrecio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPrecio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.precioLogic.getConnexion());

				if(this.precio.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.precio.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPrecio=(TitledBorder)this.jScrollPanelDatosPrecio.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderPrecio.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precio==null) {
						this.precio = new Precio();
					}

					this.setVariablesFormularioToObjetoActualPrecio(this.precio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
				}

				if(this.precio.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.precio.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_rango_unidad_ventaPrecioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisorangounidadventa=true;

			idTienePermisorangounidadventa=this.tienePermisosUsuarioEnPaginaWebPrecio(RangoUnidadVentaConstantesFunciones.CLASSNAME);

			if(idTienePermisorangounidadventa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPrecio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPrecio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);

				this.rangounidadventaBeanSwingJInternalFrame=new RangoUnidadVentaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.rangounidadventaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.rangounidadventaBeanSwingJInternalFrame.getRangoUnidadVentaLogic().setConnexion(this.precioLogic.getConnexion());

				if(this.precio.getid_rango_unidad_venta()!=null) {
					this.rangounidadventaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.rangounidadventaBeanSwingJInternalFrame.setIdActual(this.precio.getid_rango_unidad_venta());
					this.rangounidadventaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.rangounidadventaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.rangounidadventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRangoUnidadVenta();
				}

				JInternalFrameBase jinternalFrame =this.rangounidadventaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPrecio=(TitledBorder)this.jScrollPanelDatosPrecio.getBorder();
				TitledBorder titledBorderrangounidadventa=(TitledBorder)this.rangounidadventaBeanSwingJInternalFrame.jScrollPanelDatosRangoUnidadVenta.getBorder();

				titledBorderrangounidadventa.setTitle(titledBorderPrecio.getTitle() + " -> Rango Unidad Venta");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_rango_unidad_ventaPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precio==null) {
						this.precio = new Precio();
					}

					this.setVariablesFormularioToObjetoActualPrecio(this.precio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
				}

				if(this.precio.getid_rango_unidad_venta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_rango_unidad_venta = "+this.precio.getid_rango_unidad_venta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_precioPrecioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoprecio=true;

			idTienePermisotipoprecio=this.tienePermisosUsuarioEnPaginaWebPrecio(TipoPrecioConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoprecio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPrecio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPrecio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);

				this.tipoprecioBeanSwingJInternalFrame=new TipoPrecioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoprecioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoprecioBeanSwingJInternalFrame.getTipoPrecioLogic().setConnexion(this.precioLogic.getConnexion());

				if(this.precio.getid_tipo_precio()!=null) {
					this.tipoprecioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoprecioBeanSwingJInternalFrame.setIdActual(this.precio.getid_tipo_precio());
					this.tipoprecioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoprecioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoprecioBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoPrecio();
				}

				JInternalFrameBase jinternalFrame =this.tipoprecioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPrecio=(TitledBorder)this.jScrollPanelDatosPrecio.getBorder();
				TitledBorder titledBordertipoprecio=(TitledBorder)this.tipoprecioBeanSwingJInternalFrame.jScrollPanelDatosTipoPrecio.getBorder();

				titledBordertipoprecio.setTitle(titledBorderPrecio.getTitle() + " -> Tipo Precio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_precioPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precio==null) {
						this.precio = new Precio();
					}

					this.setVariablesFormularioToObjetoActualPrecio(this.precio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
				}

				if(this.precio.getid_tipo_precio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_precio = "+this.precio.getid_tipo_precio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precio==null) {
						this.precio = new Precio();
					}

					this.setVariablesFormularioToObjetoActualPrecio(this.precio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
				}

				if(this.precio.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.precio.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuentoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precio==null) {
						this.precio = new Precio();
					}

					this.setVariablesFormularioToObjetoActualPrecio(this.precio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
				}

				if(this.precio.getdescuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento = "+this.precio.getdescuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecio_minimoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precio==null) {
						this.precio = new Precio();
					}

					this.setVariablesFormularioToObjetoActualPrecio(this.precio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
				}

				if(this.precio.getprecio_minimo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio_minimo = "+this.precio.getprecio_minimo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_impuestoPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precio==null) {
						this.precio = new Precio();
					}

					this.setVariablesFormularioToObjetoActualPrecio(this.precio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
				}

				if(this.precio.getcon_impuesto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_impuesto = "+this.precio.getcon_impuesto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_precioPrecioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadoprecio=true;

			idTienePermisoestadoprecio=this.tienePermisosUsuarioEnPaginaWebPrecio(EstadoPrecioConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadoprecio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPrecio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPrecio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);

				this.estadoprecioBeanSwingJInternalFrame=new EstadoPrecioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadoprecioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadoprecioBeanSwingJInternalFrame.getEstadoPrecioLogic().setConnexion(this.precioLogic.getConnexion());

				if(this.precio.getid_estado_precio()!=null) {
					this.estadoprecioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadoprecioBeanSwingJInternalFrame.setIdActual(this.precio.getid_estado_precio());
					this.estadoprecioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadoprecioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadoprecioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoPrecio();
				}

				JInternalFrameBase jinternalFrame =this.estadoprecioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPrecio=(TitledBorder)this.jScrollPanelDatosPrecio.getBorder();
				TitledBorder titledBorderestadoprecio=(TitledBorder)this.estadoprecioBeanSwingJInternalFrame.jScrollPanelDatosEstadoPrecio.getBorder();

				titledBorderestadoprecio.setTitle(titledBorderPrecio.getTitle() + " -> Estado Precio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_precioPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrecio(this.getprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.precio==null) {
						this.precio = new Precio();
					}

					this.setVariablesFormularioToObjetoActualPrecio(this.precio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);
				}

				if(this.precio.getid_estado_precio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_precio = "+this.precio.getid_estado_precio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdBodegaPorIdProductoPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPrecio(false,false);

			this.getPreciosBusquedaPorIdBodegaPorIdProducto();

			this.inicializarActualizarBindingPrecio(false);

			//if(PrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorLineaGrupoCategoriaMarcaPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPrecio(false,false);

			this.getPreciosBusquedaPorLineaGrupoCategoriaMarca();

			this.inicializarActualizarBindingPrecio(false);

			//if(PrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorLineaGrupoCategoriaMarcaProductoPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPrecio(false,false);

			this.getPreciosBusquedaPorLineaGrupoCategoriaMarcaProducto();

			this.inicializarActualizarBindingPrecio(false);

			//if(PrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPrecio(false,false);

			this.getPreciosFK_IdBodega();

			this.inicializarActualizarBindingPrecio(false);

			//if(PrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPrecio(false,false);

			this.getPreciosFK_IdEmpresa();

			this.inicializarActualizarBindingPrecio(false);

			//if(PrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoPrecioPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPrecio(false,false);

			this.getPreciosFK_IdEstadoPrecio();

			this.inicializarActualizarBindingPrecio(false);

			//if(PrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPrecio(false,false);

			this.getPreciosFK_IdLinea();

			this.inicializarActualizarBindingPrecio(false);

			//if(PrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPrecio(false,false);

			this.getPreciosFK_IdLineaCategoria();

			this.inicializarActualizarBindingPrecio(false);

			//if(PrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPrecio(false,false);

			this.getPreciosFK_IdLineaGrupo();

			this.inicializarActualizarBindingPrecio(false);

			//if(PrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPrecio(false,false);

			this.getPreciosFK_IdLineaMarca();

			this.inicializarActualizarBindingPrecio(false);

			//if(PrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPrecio(false,false);

			this.getPreciosFK_IdProducto();

			this.inicializarActualizarBindingPrecio(false);

			//if(PrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdRangoUnidadVentaPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPrecio(false,false);

			this.getPreciosFK_IdRangoUnidadVenta();

			this.inicializarActualizarBindingPrecio(false);

			//if(PrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPrecio(false,false);

			this.getPreciosFK_IdSucursal();

			this.inicializarActualizarBindingPrecio(false);

			//if(PrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoPrecioPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPrecio(false,false);

			this.getPreciosFK_IdTipoPrecio();

			this.inicializarActualizarBindingPrecio(false);

			//if(PrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.precioLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePrecio() {
		if(this.jInternalFrameDetalleFormPrecio!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPrecio!=null) {
			this.jInternalFrameDetalleFormPrecio.setVisible(false);	    			
			this.jInternalFrameDetalleFormPrecio.dispose();
			this.jInternalFrameDetalleFormPrecio=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPrecio!=null) {
			this.jInternalFrameReporteDinamicoPrecio.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPrecio.dispose();
			this.jInternalFrameReporteDinamicoPrecio=null;
		}
		
		if(this.jInternalFrameImportacionPrecio!=null) {
			this.jInternalFrameImportacionPrecio.setVisible(false);	    			
			this.jInternalFrameImportacionPrecio.dispose();
			this.jInternalFrameImportacionPrecio=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPrecio();
			
			PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
			
			
			if(sTipo.equals("NuevoPrecio")) {
				jButtonNuevoPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPrecio")) {
				jButtonDuplicarPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPrecio")) {
				jButtonCopiarPrecioActionPerformed(evt);
			} else if(sTipo.equals("VerFormPrecio")) {
				jButtonVerFormPrecioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPrecio")) {
				jButtonNuevoPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPrecio")) {
				jButtonDuplicarPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPrecio")) {
				jButtonNuevoPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPrecio")) {
				jButtonDuplicarPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPrecio")) {
				jButtonNuevoPrecioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPrecio")) {
				jButtonNuevoPrecioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPrecio")) {
				jButtonNuevoPrecioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPrecio")) {
				jButtonModificarPrecioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPrecio")) {
				jButtonModificarPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPrecio")) {
				jButtonModificarPrecioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPrecio")) {
				jButtonActualizarPrecioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPrecio")) {
				jButtonActualizarPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPrecio")) {
				jButtonActualizarPrecioActionPerformed(evt);
			} else if(sTipo.equals("EliminarPrecio")) {
				jButtonEliminarPrecioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPrecio")) {
				jButtonEliminarPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPrecio")) {
				jButtonEliminarPrecioActionPerformed(evt);
			} else if(sTipo.equals("CancelarPrecio")) {
				jButtonCancelarPrecioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPrecio")) {
				jButtonCancelarPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPrecio")) {
				jButtonCancelarPrecioActionPerformed(evt);
			} else if(sTipo.equals("CerrarPrecio")) {
				jButtonCerrarPrecioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPrecio")) {
				jButtonCerrarPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPrecio")) {
				jButtonCerrarPrecioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPrecio")) {
				jButtonMostrarOcultarPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPrecio")) {
				jButtonCancelarPrecioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPrecio")) {
				jButtonGuardarCambiosPrecioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPrecio")) {
				jButtonGuardarCambiosPrecioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPrecio")) {
				jButtonCopiarPrecioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPrecio")) {
				jButtonVerFormPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPrecio")) {
				jButtonGuardarCambiosPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPrecio")) {
				jButtonCopiarPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPrecio")) {
				jButtonVerFormPrecioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPrecio")) {
				jButtonGuardarCambiosPrecioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPrecio")) {
				jButtonGuardarCambiosPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPrecio")) {
				jButtonGuardarCambiosPrecioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPrecio")) {
				jButtonRecargarInformacionPrecioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPrecio")) {
				jButtonRecargarInformacionPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPrecio")) {
				jButtonRecargarInformacionPrecioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPrecio")) {
				jButtonAnterioresPrecioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPrecio")) {
				jButtonAnterioresPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePrecio")) {
				jButtonAnterioresPrecioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPrecio")) {
				jButtonSiguientesPrecioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPrecio")) {
				jButtonSiguientesPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPrecio")) {
				jButtonSiguientesPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPrecio") || sTipo.equals("MenuItemDetalleAbrirOrderByPrecio")) {
				jButtonAbrirOrderByPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPrecio") || sTipo.equals("MenuItemDetalleMostrarOcultarPrecio")) {
				jButtonMostrarOcultarPrecioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPrecio")) {
				jButtonNuevoGuardarCambiosPrecioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPrecio")) {
				jButtonNuevoGuardarCambiosPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPrecio")) {
				jButtonNuevoGuardarCambiosPrecioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPrecio")) {
				jButtonCerrarReporteDinamicoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPrecio")) {
				jButtonGenerarReporteDinamicoPrecioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPrecio")) {
				
				jButtonGenerarExcelReporteDinamicoPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPrecio")) {
				jButtonCerrarImportacionPrecioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPrecio")) {
				
				jButtonGenerarImportacionPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPrecio")) {
				
				jButtonAbrirImportacionPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPrecio")) {
				jComboBoxTiposAccionesPrecioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPrecio")) {
				jComboBoxTiposRelacionesPrecioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPrecio")) {
				jComboBoxTiposAccionesPrecioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPrecio")) {
				
				jComboBoxTiposSeleccionarPrecioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPrecio")) {
				jTextFieldValorCampoGeneralPrecioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPrecio")) {
				jButtonAbrirOrderByPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPrecio")) {
				jButtonAbrirOrderByPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPrecio")) {
				jButtonCerrarOrderByPrecioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPrecioBusqueda")) {
				this.jButtonidPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPrecioUpdate")) {
				this.jButtonid_empresaPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPrecioBusqueda")) {
				this.jButtonid_empresaPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPrecioUpdate")) {
				this.jButtonid_sucursalPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPrecioBusqueda")) {
				this.jButtonid_sucursalPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaPrecioUpdate")) {
				this.jButtonid_bodegaPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaPrecioBusqueda")) {
				this.jButtonid_bodegaPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoPrecio")) {
				this.jButtonid_productoPrecioActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoPrecioUpdate")) {
				this.jButtonid_productoPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoPrecioBusqueda")) {
				this.jButtonid_productoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaPrecioUpdate")) {
				this.jButtonid_lineaPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaPrecioBusqueda")) {
				this.jButtonid_lineaPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoPrecioUpdate")) {
				this.jButtonid_linea_grupoPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoPrecioBusqueda")) {
				this.jButtonid_linea_grupoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaPrecioUpdate")) {
				this.jButtonid_linea_categoriaPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaPrecioBusqueda")) {
				this.jButtonid_linea_categoriaPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaPrecioUpdate")) {
				this.jButtonid_linea_marcaPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaPrecioBusqueda")) {
				this.jButtonid_linea_marcaPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rango_unidad_ventaPrecioUpdate")) {
				this.jButtonid_rango_unidad_ventaPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rango_unidad_ventaPrecioBusqueda")) {
				this.jButtonid_rango_unidad_ventaPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_precioPrecioUpdate")) {
				this.jButtonid_tipo_precioPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_precioPrecioBusqueda")) {
				this.jButtonid_tipo_precioPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioPrecioBusqueda")) {
				this.jButtonprecioPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoPrecioBusqueda")) {
				this.jButtondescuentoPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio_minimoPrecioBusqueda")) {
				this.jButtonprecio_minimoPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_impuestoPrecioBusqueda")) {
				this.jButtoncon_impuestoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_precioPrecioUpdate")) {
				this.jButtonid_estado_precioPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_precioPrecioBusqueda")) {
				this.jButtonid_estado_precioPrecioBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoPrecio")) {
				this.jButtonid_productoPrecioActionPerformed(evt);
			}
			else if(sTipo.equals("id_productoPrecio")) {
				this.jButtonid_productoPrecioActionPerformed(evt);
			}
			else if(sTipo.equals("id_productoPrecio")) {
				this.jButtonid_productoPrecioActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("BusquedaPorIdBodegaPorIdProductoPrecio")) {
				this.jButtonBusquedaPorIdBodegaPorIdProductoPrecioActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorLineaGrupoCategoriaMarcaPrecio")) {
				this.jButtonBusquedaPorLineaGrupoCategoriaMarcaPrecioActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorLineaGrupoCategoriaMarcaProductoPrecio")) {
				this.jButtonBusquedaPorLineaGrupoCategoriaMarcaProductoPrecioActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdBodegaPrecio")) {
				this.jButtonFK_IdBodegaPrecioActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstadoPrecioPrecio")) {
				this.jButtonFK_IdEstadoPrecioPrecioActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdLineaPrecio")) {
				this.jButtonFK_IdLineaPrecioActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoPrecio")) {
				this.jButtonFK_IdProductoPrecioActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdRangoUnidadVentaPrecio")) {
				this.jButtonFK_IdRangoUnidadVentaPrecioActionPerformed(evt);
			}
			
			;
			
			
			PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPrecio();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPrecioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precio);
				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
				
				


				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Precio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Precio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Precio precioLocal=null;
			
			if(!this.getEsControlTabla()) {
				precioLocal=this.precio;
			} else {
				precioLocal=this.precioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precio);
				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
							
				
				


				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Precio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Precio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioAnterior =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.precioAnterior =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
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
			
			PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
			
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
			
			


			
			PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPrecioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precio);
				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
								
						
				


				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Precio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Precio.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precio);
				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
								
				
				


				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Precio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Precio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioAnterior =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.precioAnterior =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precio);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioAnterior =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.precioAnterior =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrecioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.precio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.precio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precio);
				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
							
				
				


				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Precio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Precio.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPrecioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPrecio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioAnterior =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.precioAnterior =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
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
			
			PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
			
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
			
			


			
			PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrecioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.precio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.precio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precio);
				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
								
				
				


				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Precio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Precio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioAnterior =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.precioAnterior =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrecioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.precio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.precio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPrecioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precio);
				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPrecio")) {
					jCheckBoxSeleccionarTodosPrecioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPrecio")) {
					jCheckBoxSeleccionadosPrecioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPrecio")) {
					
				}
				
				


				
				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Precio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Precio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.precio);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.precio);
				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
												
				
				


				
				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Precio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Precio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPrecioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPrecio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.precioAnterior =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.precioAnterior =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPrecioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precio);
				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
				
				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
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
			
			PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
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
			
			


			if(sTipo.equals("id_bodegaPrecio")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio;
				}

				if(this.precioSessionBean.getConGuardarRelaciones()) {
					//classes=PrecioConstantesFunciones.getClassesRelationshipsOfPrecio(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormPrecio(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio,"BusquedaPorIdBodegaPorIdProducto");
				//recargarFormPrecioBodega(jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio,"BusquedaPorIdBodegaPorIdProducto");
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaPrecio")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaPrecio,"FK_IdBodega");
				//recargarFormPrecioBodega(jComboBoxid_bodegaFK_IdBodegaPrecio,"FK_IdBodega");
			}
			
			PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPrecioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precio);
				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_bodegaPrecio")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio;
				}

				if(this.precioSessionBean.getConGuardarRelaciones()) {
					//classes=PrecioConstantesFunciones.getClassesRelationshipsOfPrecio(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormPrecio(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio,"BusquedaPorIdBodegaPorIdProducto");
				//recargarFormPrecioBodega(jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio,"BusquedaPorIdBodegaPorIdProducto");
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaPrecio")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaPrecio,"FK_IdBodega");
				//recargarFormPrecioBodega(jComboBoxid_bodegaFK_IdBodegaPrecio,"FK_IdBodega");
			}
				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Precio.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Precio.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.precio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.precio);
				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
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
				
				


			if(sTipo.equals("id_bodegaPrecio")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio;
				}

				if(this.precioSessionBean.getConGuardarRelaciones()) {
					//classes=PrecioConstantesFunciones.getClassesRelationshipsOfPrecio(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormPrecio(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio,"BusquedaPorIdBodegaPorIdProducto");
				//recargarFormPrecioBodega(jComboBoxid_bodegaBusquedaPorIdBodegaPorIdProductoPrecio,"BusquedaPorIdBodegaPorIdProducto");
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaPrecio")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaPrecio,"FK_IdBodega");
				//recargarFormPrecioBodega(jComboBoxid_bodegaFK_IdBodegaPrecio,"FK_IdBodega");
			}
				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Precio.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Precio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.precioAnterior =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.precioAnterior =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPrecio")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPrecioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPrecio.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.precio =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.precio =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.precio);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPrecio")) {
				
				}
				
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPrecio")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPrecio.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPrecio")) {
			
			}
			
			PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPrecio();
			
			PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
			
			if(sTipo.equals("NuevoPrecio")) {
				jButtonNuevoPrecioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPrecio")) {
				jButtonDuplicarPrecioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPrecio")) {
				jButtonCopiarPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPrecio")) {
				jButtonVerFormPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPrecio")) {
				jButtonNuevoPrecioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPrecio")) {
				jButtonModificarPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPrecio")) {
				jButtonActualizarPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPrecio")) {
				jButtonEliminarPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPrecio")) {
				jButtonGuardarCambiosPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPrecio")) {
				jButtonCancelarPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPrecio")) {
				jButtonCerrarPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPrecio")) {
				jButtonGuardarCambiosPrecioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPrecio")) {
				jButtonNuevoGuardarCambiosPrecioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPrecio")) {
				jButtonAbrirOrderByPrecioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPrecio")) {
				jButtonRecargarInformacionPrecioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPrecio")) {
				jButtonAnterioresPrecioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPrecio")) {
				jButtonSiguientesPrecioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPrecioBusqueda")) {
				this.jButtonidPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPrecioUpdate")) {
				this.jButtonid_empresaPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPrecioBusqueda")) {
				this.jButtonid_empresaPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPrecioUpdate")) {
				this.jButtonid_sucursalPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPrecioBusqueda")) {
				this.jButtonid_sucursalPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaPrecioUpdate")) {
				this.jButtonid_bodegaPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaPrecioBusqueda")) {
				this.jButtonid_bodegaPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoPrecio")) {
				this.jButtonid_productoPrecioActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoPrecioUpdate")) {
				this.jButtonid_productoPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoPrecioBusqueda")) {
				this.jButtonid_productoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaPrecioUpdate")) {
				this.jButtonid_lineaPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaPrecioBusqueda")) {
				this.jButtonid_lineaPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoPrecioUpdate")) {
				this.jButtonid_linea_grupoPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoPrecioBusqueda")) {
				this.jButtonid_linea_grupoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaPrecioUpdate")) {
				this.jButtonid_linea_categoriaPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaPrecioBusqueda")) {
				this.jButtonid_linea_categoriaPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaPrecioUpdate")) {
				this.jButtonid_linea_marcaPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaPrecioBusqueda")) {
				this.jButtonid_linea_marcaPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rango_unidad_ventaPrecioUpdate")) {
				this.jButtonid_rango_unidad_ventaPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rango_unidad_ventaPrecioBusqueda")) {
				this.jButtonid_rango_unidad_ventaPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_precioPrecioUpdate")) {
				this.jButtonid_tipo_precioPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_precioPrecioBusqueda")) {
				this.jButtonid_tipo_precioPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioPrecioBusqueda")) {
				this.jButtonprecioPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoPrecioBusqueda")) {
				this.jButtondescuentoPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio_minimoPrecioBusqueda")) {
				this.jButtonprecio_minimoPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_impuestoPrecioBusqueda")) {
				this.jButtoncon_impuestoPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_precioPrecioUpdate")) {
				this.jButtonid_estado_precioPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_precioPrecioBusqueda")) {
				this.jButtonid_estado_precioPrecioBusquedaActionPerformed(evt);
			}
			
			PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPrecio();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePrecio")) {
				closingInternalFramePrecio();
				
			} else if(sTipo.equals("jButtonCancelarPrecio")) {
				JInternalFrameBase jInternalFrameDetalleFormPrecio = (JInternalFrameBase)evt.getSource();
	            	
	            PrecioBeanSwingJInternalFrame jInternalFrameParent=(PrecioBeanSwingJInternalFrame)jInternalFrameDetalleFormPrecio.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPrecioActionPerformed(null);
			}
			
			PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.precio,new Object(),this.precioParameterGeneral,this.precioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPrecio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPrecio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPrecio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.precio)) {
			if(!esControlTabla) {
				if(PrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPrecio(this.precio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);			
				}
				
				if(this.precioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPrecio(this.precio,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.precioReturnGeneral=precioLogic.procesarEventosPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.precioLogic.getPrecios(),this.precio,this.precioParameterGeneral,this.isEsNuevoPrecio,classes);//this.precioLogic.getPrecio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPrecio(this.precioReturnGeneral,this.precioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.precioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPrecio(classes,this.precioReturnGeneral,this.precioBean,false);
					}
						
					if(this.precioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPrecio(this.precioReturnGeneral.getPrecio());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPrecio(this.precioReturnGeneral.getPrecio());	
					}
						
					if(this.precioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPrecio(this.precioReturnGeneral.getPrecio(),classes);//this.precioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPrecio(this.precio,classes);//this.precioBean);									
				}
			
				if(PrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPrecio(this.precio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPrecio(this.precio);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.precioAnterior!=null) {
						this.precio=this.precioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.precioReturnGeneral=precioLogic.procesarEventosPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.precioLogic.getPrecios(),this.precio,this.precioParameterGeneral,this.isEsNuevoPrecio,classes);//this.precioLogic.getPrecio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.precioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.precioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.precioReturnGeneral.getPrecio(),precioLogic.getPrecios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.precioReturnGeneral.getPrecio(),this.precios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPrecio.repaint();
				
				//((AbstractTableModel) this.jTableDatosPrecio.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPrecio();
			}
		}
	}
	
	public void actualizarVisualTableDatosPrecio() throws Exception {
		
		PrecioModel precioModel=(PrecioModel)this.jTableDatosPrecio.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			precioModel.precios=this.precioLogic.getPrecios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			precioModel.precios=this.precios;
		}
		
		
		((PrecioModel) this.jTableDatosPrecio.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPrecio() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprecioAnterior(),this.precioLogic.getPrecios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprecioAnterior(),this.precios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPrecio();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPrecio(Precio precio,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
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
										
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.precio,new Object(),generalEntityParameterGeneral,this.precioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.precioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PrecioConstantesFunciones.getClassesRelationshipsOfPrecio(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PrecioConstantesFunciones.getClassesRelationshipsFromStringsOfPrecio(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPrecio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.precio,new Object(),generalEntityParameterGeneral,this.precioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPrecio(PrecioBean precioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPrecio(ArrayList<Classe> classes,PrecioReturnGeneral precioReturnGeneral,PrecioBean precioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPrecio(Precio precio,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.precio)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPrecio = new PrecioDetalleFormJInternalFrame(jDesktopPane,this.precioSessionBean.getConGuardarRelaciones(),this.precioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPrecio);
		this.jInternalFrameDetalleFormPrecio.setVisible(false);
		this.jInternalFrameDetalleFormPrecio.setSelected(false);						
		
		this.jInternalFrameDetalleFormPrecio.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPrecio.precioLogic=this.precioLogic;
		
		this.cargarCombosFrameForeignKeyPrecio("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePrecio();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePrecio();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPrecio("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPrecio();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPrecio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPrecio"));
		
		this.jInternalFrameDetalleFormPrecio.jButtonModificarPrecio.addActionListener(new ButtonActionListener(this,"ModificarPrecio"));

		
		this.jInternalFrameDetalleFormPrecio.jButtonModificarToolBarPrecio.addActionListener(new ButtonActionListener(this,"ModificarToolBarPrecio"));
					
		this.jInternalFrameDetalleFormPrecio.jMenuItemModificarPrecio.addActionListener(new ButtonActionListener(this,"MenuItemModificarPrecio"));		
		
		
		
		this.jInternalFrameDetalleFormPrecio.jButtonActualizarPrecio.addActionListener (new ButtonActionListener(this,"ActualizarPrecio"));
		
		
		this.jInternalFrameDetalleFormPrecio.jButtonActualizarToolBarPrecio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPrecio"));
						
		this.jInternalFrameDetalleFormPrecio.jMenuItemActualizarPrecio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPrecio"));		
		
		
		
		this.jInternalFrameDetalleFormPrecio.jButtonEliminarPrecio.addActionListener (new ButtonActionListener(this,"EliminarPrecio"));
		
		
		this.jInternalFrameDetalleFormPrecio.jButtonEliminarToolBarPrecio.addActionListener (new ButtonActionListener(this,"EliminarToolBarPrecio"));
								
		this.jInternalFrameDetalleFormPrecio.jMenuItemEliminarPrecio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPrecio"));		
		
		
		
		this.jInternalFrameDetalleFormPrecio.jButtonCancelarPrecio.addActionListener (new ButtonActionListener(this,"CancelarPrecio"));
		
		
		this.jInternalFrameDetalleFormPrecio.jButtonCancelarToolBarPrecio.addActionListener (new ButtonActionListener(this,"CancelarToolBarPrecio"));
					
		this.jInternalFrameDetalleFormPrecio.jMenuItemCancelarPrecio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPrecio"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPrecio.jMenuItemDetalleCerrarPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPrecio"));		
		
		
		
		this.jInternalFrameDetalleFormPrecio.jButtonGuardarCambiosToolBarPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPrecio"));
		
		
		
		this.jInternalFrameDetalleFormPrecio.jButtonGuardarCambiosToolBarPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPrecio"));
		
		
		
		this.jInternalFrameDetalleFormPrecio.jComboBoxTiposAccionesFormularioPrecio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPrecio"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonidPrecioBusqueda.addActionListener(new ButtonActionListener(this,"idPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_empresaPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_empresaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_sucursalPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_sucursalPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_bodegaPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_bodegaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaPrecioBusqueda"));
		//jButtonid_productoPrecio.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoPrecioActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPrecio.jButtonid_productoPrecio.addActionListener(new ButtonActionListener(this,"id_productoPrecio"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_productoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_productoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_productoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_lineaPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_lineaPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_lineaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_linea_grupoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_linea_grupoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_linea_categoriaPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_linea_categoriaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_linea_marcaPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_linea_marcaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_rango_unidad_ventaPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_rango_unidad_ventaPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_rango_unidad_ventaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_rango_unidad_ventaPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_tipo_precioPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_precioPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_tipo_precioPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_precioPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonprecioPrecioBusqueda.addActionListener(new ButtonActionListener(this,"precioPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtondescuentoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"descuentoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonprecio_minimoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"precio_minimoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtoncon_impuestoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"con_impuestoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_estado_precioPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_estado_precioPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_estado_precioPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_precioPrecioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPrecio.jTabbedPaneRelacionesPrecio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPrecio"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePrecio"));
		
		if(this.jInternalFrameDetalleFormPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrecio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPrecio"));
		}
		
		this.jTableDatosPrecio.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPrecio"));
		
		this.jTableDatosPrecio.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPrecio"));
		
		this.jButtonNuevoPrecio.addActionListener(new ButtonActionListener(this,"NuevoPrecio"));
		
		this.jButtonDuplicarPrecio.addActionListener(new ButtonActionListener(this,"DuplicarPrecio"));
		
		this.jButtonCopiarPrecio.addActionListener(new ButtonActionListener(this,"CopiarPrecio"));
		
		this.jButtonVerFormPrecio.addActionListener(new ButtonActionListener(this,"VerFormPrecio"));
		
		
		this.jButtonNuevoToolBarPrecio.addActionListener(new ButtonActionListener(this,"NuevoToolBarPrecio"));
			
		this.jButtonDuplicarToolBarPrecio.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPrecio"));
			
		this.jMenuItemNuevoPrecio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPrecio"));
			
		this.jMenuItemDuplicarPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPrecio"));		
		
		
		this.jButtonNuevoRelacionesPrecio.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPrecio"));
		
		
		this.jButtonNuevoRelacionesToolBarPrecio.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPrecio"));
			
		this.jMenuItemNuevoRelacionesPrecio.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPrecio"));		
		
		
		if(this.jInternalFrameDetalleFormPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrecio.jButtonModificarPrecio.addActionListener(new ButtonActionListener(this,"ModificarPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrecio.jButtonModificarToolBarPrecio.addActionListener(new ButtonActionListener(this,"ModificarToolBarPrecio"));
			
			this.jInternalFrameDetalleFormPrecio.jMenuItemModificarPrecio.addActionListener(new ButtonActionListener(this,"MenuItemModificarPrecio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPrecio!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPrecio.jButtonActualizarPrecio.addActionListener (new ButtonActionListener(this,"ActualizarPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrecio.jButtonActualizarToolBarPrecio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPrecio"));
				
			this.jInternalFrameDetalleFormPrecio.jMenuItemActualizarPrecio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPrecio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrecio.jButtonEliminarPrecio.addActionListener (new ButtonActionListener(this,"EliminarPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrecio.jButtonEliminarToolBarPrecio.addActionListener (new ButtonActionListener(this,"EliminarToolBarPrecio"));
						
			this.jInternalFrameDetalleFormPrecio.jMenuItemEliminarPrecio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPrecio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrecio.jButtonCancelarPrecio.addActionListener (new ButtonActionListener(this,"CancelarPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrecio.jButtonCancelarToolBarPrecio.addActionListener (new ButtonActionListener(this,"CancelarToolBarPrecio"));
			
			this.jInternalFrameDetalleFormPrecio.jMenuItemCancelarPrecio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPrecio"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPrecio.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPrecio"));		
		
		
		this.jButtonCerrarPrecio.addActionListener (new ButtonActionListener(this,"CerrarPrecio"));
		
		
		this.jButtonCerrarToolBarPrecio.addActionListener (new ButtonActionListener(this,"CerrarToolBarPrecio"));
			
		this.jMenuItemCerrarPrecio.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPrecio"));
			
		if(this.jInternalFrameDetalleFormPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrecio.jMenuItemDetalleCerrarPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPrecio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrecio.jButtonGuardarCambiosPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrecio.jButtonGuardarCambiosToolBarPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPrecio"));
		}
		
		this.jButtonCopiarToolBarPrecio.addActionListener (new ButtonActionListener(this,"CopiarToolBarPrecio"));
			
		this.jButtonVerFormToolBarPrecio.addActionListener (new ButtonActionListener(this,"VerFormToolBarPrecio"));
		
		this.jMenuItemGuardarCambiosPrecio.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPrecio"));
			
		this.jMenuItemCopiarPrecio.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPrecio"));		
		
		this.jMenuItemVerFormPrecio.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPrecio"));		
		
		
		this.jButtonGuardarCambiosTablaPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPrecio"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPrecio"));
			
		this.jMenuItemGuardarCambiosTablaPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPrecio"));		
		
		
		
		this.jButtonRecargarInformacionPrecio.addActionListener (new ButtonActionListener(this,"RecargarInformacionPrecio"));
					
		this.jButtonRecargarInformacionToolBarPrecio.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPrecio"));
		
		this.jMenuItemRecargarInformacionPrecio.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPrecio"));		
		
		
		
		this.jButtonAnterioresPrecio.addActionListener (new ButtonActionListener(this,"AnterioresPrecio"));
		
		
		this.jButtonAnterioresToolBarPrecio.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPrecio"));
		
		this.jMenuItemAnterioresPrecio.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPrecio"));		
		
		
		this.jButtonSiguientesPrecio.addActionListener (new ButtonActionListener(this,"SiguientesPrecio"));
		
		
		this.jButtonSiguientesToolBarPrecio.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPrecio"));
			
		this.jMenuItemSiguientesPrecio.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPrecio"));
			
		this.jMenuItemAbrirOrderByPrecio.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPrecio"));
			
		this.jMenuItemMostrarOcultarPrecio.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPrecio"));
			
		this.jMenuItemDetalleAbrirOrderByPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPrecio"));
			
		this.jMenuItemDetalleMostarOcultarPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPrecio"));		
		
		
		this.jButtonNuevoGuardarCambiosPrecio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPrecio"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPrecio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPrecio"));
			
		this.jMenuItemNuevoGuardarCambiosPrecio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPrecio"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPrecio.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPrecio"));

		this.jCheckBoxSeleccionadosPrecio.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPrecio"));
		
		if(this.jInternalFrameDetalleFormPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrecio.jComboBoxTiposAccionesFormularioPrecio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPrecio"));
		}
		
		
		this.jComboBoxTiposRelacionesPrecio.addActionListener (new ButtonActionListener(this,"TiposRelacionesPrecio"));
			
		this.jComboBoxTiposAccionesPrecio.addActionListener (new ButtonActionListener(this,"TiposAccionesPrecio"));
					
		this.jComboBoxTiposSeleccionarPrecio.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPrecio"));
			
		this.jTextFieldValorCampoGeneralPrecio.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPrecio"));		
		
		
		if(this.jInternalFrameDetalleFormPrecio!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonidPrecioBusqueda.addActionListener(new ButtonActionListener(this,"idPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_empresaPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_empresaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_sucursalPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_sucursalPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_bodegaPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_bodegaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaPrecioBusqueda"));
		//jButtonid_productoPrecio.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoPrecioActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPrecio.jButtonid_productoPrecio.addActionListener(new ButtonActionListener(this,"id_productoPrecio"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_productoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_productoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_productoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_lineaPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_lineaPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_lineaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_linea_grupoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_linea_grupoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_linea_categoriaPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_linea_categoriaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_linea_marcaPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_linea_marcaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_rango_unidad_ventaPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_rango_unidad_ventaPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_rango_unidad_ventaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_rango_unidad_ventaPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_tipo_precioPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_precioPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_tipo_precioPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_precioPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonprecioPrecioBusqueda.addActionListener(new ButtonActionListener(this,"precioPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtondescuentoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"descuentoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonprecio_minimoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"precio_minimoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtoncon_impuestoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"con_impuestoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_estado_precioPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_estado_precioPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_estado_precioPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_precioPrecioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdBodegaPorIdProductoPrecio.addActionListener(new ButtonActionListener(this,"BusquedaPorIdBodegaPorIdProductoPrecio"));

			this.jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoPrecio.addActionListener(new ButtonActionListener(this,"id_productoPrecio"));

			this.jButtonBusquedaPorLineaGrupoCategoriaMarcaPrecio.addActionListener(new ButtonActionListener(this,"BusquedaPorLineaGrupoCategoriaMarcaPrecio"));

			this.jButtonBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.addActionListener(new ButtonActionListener(this,"BusquedaPorLineaGrupoCategoriaMarcaProductoPrecio"));

			this.jButtonBuscarBusquedaPorLineaGrupoCategoriaMarcaProductoid_productoPrecio.addActionListener(new ButtonActionListener(this,"id_productoPrecio"));

			this.jButtonFK_IdBodegaPrecio.addActionListener(new ButtonActionListener(this,"FK_IdBodegaPrecio"));

			this.jButtonFK_IdEstadoPrecioPrecio.addActionListener(new ButtonActionListener(this,"FK_IdEstadoPrecioPrecio"));

			this.jButtonFK_IdLineaPrecio.addActionListener(new ButtonActionListener(this,"FK_IdLineaPrecio"));

			this.jButtonFK_IdProductoPrecio.addActionListener(new ButtonActionListener(this,"FK_IdProductoPrecio"));

			this.jButtonBuscarFK_IdProductoid_productoPrecio.addActionListener(new ButtonActionListener(this,"id_productoPrecio"));

			this.jButtonFK_IdRangoUnidadVentaPrecio.addActionListener(new ButtonActionListener(this,"FK_IdRangoUnidadVentaPrecio"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPrecio!=null) {
				this.jInternalFrameReporteDinamicoPrecio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPrecio"));
				this.jInternalFrameReporteDinamicoPrecio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPrecio"));
				this.jInternalFrameReporteDinamicoPrecio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPrecio"));
			}
			
			//this.jButtonCerrarReporteDinamicoPrecio.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPrecio"));				
			//this.jButtonGenerarReporteDinamicoPrecio.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPrecio"));
			//this.jButtonGenerarExcelReporteDinamicoPrecio.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPrecio"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPrecio!=null) {
				this.jInternalFrameImportacionPrecio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPrecio"));
				this.jInternalFrameImportacionPrecio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPrecio"));
				this.jInternalFrameImportacionPrecio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPrecio"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPrecio.addActionListener (new ButtonActionListener(this,"AbrirOrderByPrecio"));
			
			this.jButtonAbrirOrderByToolBarPrecio.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPrecio"));			
			
			if(this.jInternalFrameOrderByPrecio!=null) {
				this.jInternalFrameOrderByPrecio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPrecio"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPrecio!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrecio.jTabbedPaneRelacionesPrecio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPrecio"));
		
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
            		closingInternalFramePrecio();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPrecio.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPrecio = (JInternalFrameBase)event.getSource();
	            	
	            PrecioBeanSwingJInternalFrame jInternalFrameParent=(PrecioBeanSwingJInternalFrame)jInternalFrameDetalleFormPrecio.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPrecioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPrecio.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPrecioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPrecio.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPrecio.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPrecioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPrecioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPrecioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPrecio";
		inputMap = this.jButtonNuevoPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPrecioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPrecioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPrecioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPrecioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPrecio";
		inputMap = this.jButtonNuevoRelacionesPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPrecioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPrecio";
		inputMap = this.jButtonModificarPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPrecio";
		inputMap = this.jButtonActualizarPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPrecio";
		inputMap = this.jButtonEliminarPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPrecio";
		inputMap = this.jButtonCancelarPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPrecio";
		inputMap = this.jButtonCerrarPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPrecio.jButtonGuardarCambiosPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPrecio";
		inputMap = this.jInternalFrameDetalleFormPrecio.jButtonGuardarCambiosPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPrecio.jButtonGuardarCambiosPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPrecio.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPrecioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPrecio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPrecioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPrecio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPrecioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPrecio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPrecioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonidPrecioBusqueda.addActionListener(new ButtonActionListener(this,"idPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_empresaPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_empresaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_sucursalPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_sucursalPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_bodegaPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_bodegaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaPrecioBusqueda"));
		//jButtonid_productoPrecio.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoPrecioActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPrecio.jButtonid_productoPrecio.addActionListener(new ButtonActionListener(this,"id_productoPrecio"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_productoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_productoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_productoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_lineaPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_lineaPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_lineaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_linea_grupoPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_linea_grupoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_linea_categoriaPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_linea_categoriaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_linea_marcaPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_linea_marcaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_rango_unidad_ventaPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_rango_unidad_ventaPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_rango_unidad_ventaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_rango_unidad_ventaPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_tipo_precioPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_precioPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_tipo_precioPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_precioPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonprecioPrecioBusqueda.addActionListener(new ButtonActionListener(this,"precioPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtondescuentoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"descuentoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonprecio_minimoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"precio_minimoPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtoncon_impuestoPrecioBusqueda.addActionListener(new ButtonActionListener(this,"con_impuestoPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrecio.jButtonid_estado_precioPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_estado_precioPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrecio.jButtonid_estado_precioPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_precioPrecioBusqueda"));
		
		
		this.jButtonBusquedaPorIdBodegaPorIdProductoPrecio.addActionListener(new ButtonActionListener(this,"BusquedaPorIdBodegaPorIdProductoPrecio"));

		this.jButtonBuscarBusquedaPorIdBodegaPorIdProductoid_productoPrecio.addActionListener(new ButtonActionListener(this,"id_productoPrecio"));

		this.jButtonBusquedaPorLineaGrupoCategoriaMarcaPrecio.addActionListener(new ButtonActionListener(this,"BusquedaPorLineaGrupoCategoriaMarcaPrecio"));

		this.jButtonBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio.addActionListener(new ButtonActionListener(this,"BusquedaPorLineaGrupoCategoriaMarcaProductoPrecio"));

		this.jButtonBuscarBusquedaPorLineaGrupoCategoriaMarcaProductoid_productoPrecio.addActionListener(new ButtonActionListener(this,"id_productoPrecio"));

		this.jButtonFK_IdBodegaPrecio.addActionListener(new ButtonActionListener(this,"FK_IdBodegaPrecio"));

		this.jButtonFK_IdEstadoPrecioPrecio.addActionListener(new ButtonActionListener(this,"FK_IdEstadoPrecioPrecio"));

		this.jButtonFK_IdLineaPrecio.addActionListener(new ButtonActionListener(this,"FK_IdLineaPrecio"));

		this.jButtonFK_IdProductoPrecio.addActionListener(new ButtonActionListener(this,"FK_IdProductoPrecio"));

		this.jButtonBuscarFK_IdProductoid_productoPrecio.addActionListener(new ButtonActionListener(this,"id_productoPrecio"));

		this.jButtonFK_IdRangoUnidadVentaPrecio.addActionListener(new ButtonActionListener(this,"FK_IdRangoUnidadVentaPrecio"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPrecioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPrecio.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPrecio(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Precio precioAux:this.precioLogic.getPrecios()) {
					precioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Precio precioAux:precios) {
					precioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPrecioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPrecio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Precio precioAux:this.precioLogic.getPrecios()) {
						precioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Precio precioAux:precios) {
						precioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Precio precioAux:this.precioLogic.getPrecios()) {
					
						if(sTipoSeleccionar.equals(PrecioConstantesFunciones.LABEL_CONIMPUESTO)) {
							existe=true;
							precioAux.setcon_impuesto(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Precio precioAux:precios) {
						
						if(sTipoSeleccionar.equals(PrecioConstantesFunciones.LABEL_CONIMPUESTO)) {
							existe=true;
							precioAux.setcon_impuesto(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPrecio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPrecio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPrecio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPrecio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPrecioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPrecio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPrecio.getSelectedRows();
			
			Precio precioLocal=new Precio();
			
			//this.seleccionarTodosPrecio(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					precioLocal =(Precio) this.precioLogic.getPrecios().toArray()[this.jTableDatosPrecio.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					precioLocal =(Precio) this.precios.toArray()[this.jTableDatosPrecio.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				precioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Precio precioAux:this.precioLogic.getPrecios()) {
						precioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Precio precioAux:precios) {
						precioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPrecio(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPrecio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPrecio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPrecio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPrecioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPrecioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPrecioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPrecio(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPrecio.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Precio precioAux:this.precioLogic.getPrecios()) {
				
						if(sTipoSeleccionar.equals(PrecioConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							precioAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PrecioConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							precioAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PrecioConstantesFunciones.LABEL_PRECIOMINIMO)) {
							existe=true;
							precioAux.setprecio_minimo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Precio precioAux:precios) {
					
						if(sTipoSeleccionar.equals(PrecioConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							precioAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PrecioConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							precioAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PrecioConstantesFunciones.LABEL_PRECIOMINIMO)) {
							existe=true;
							precioAux.setprecio_minimo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPrecio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPrecioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPrecio(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPrecio=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPrecio.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPrecio.jComboBoxTiposAccionesFormularioPrecio.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePrecio) {				
					conSplash=true;//false;										
					
					//this.startProcessPrecio(conSplash);
				
					this.generarReportePreciosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPrecio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPrecio.jComboBoxTiposAccionesFormularioPrecio.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPreciosSeleccionados();
				//this.jComboBoxTiposAccionesPrecio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPreciosSeleccionados(false);
				//this.jComboBoxTiposAccionesPrecio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPreciosSeleccionados(true);
				//this.jComboBoxTiposAccionesPrecio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPrecio();
				
				this.exportarPreciosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPrecio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPrecio.jComboBoxTiposAccionesFormularioPrecio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPrecios();
				//this.importarPrecios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPrecio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPrecio.jComboBoxTiposAccionesFormularioPrecio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPrecio();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPreciosSeleccionados();
				//this.jComboBoxTiposAccionesPrecio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Precio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPrecio();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPrecio)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPrecio(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Precio",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPrecio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPrecio.jComboBoxTiposAccionesFormularioPrecio.setSelectedIndex(0);					
				}	
			} 			
			else if(PrecioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePrecio) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPrecio(conSplash);
					
						//this.actualizarParametrosGeneralPrecio();
						
						this.generarReporteProcesoAccionPreciosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPrecio.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPrecio.jComboBoxTiposAccionesFormularioPrecio.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PrecioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO PrecioS SELECCIONADOS?", "MANTENIMIENTO DE Precio", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPrecio();
				
						this.actualizarParametrosGeneralPrecio();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.precioReturnGeneral=precioLogic.procesarAccionPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.precioLogic.getPrecios(),this.precioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPrecioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPrecio.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPrecio.jComboBoxTiposAccionesFormularioPrecio.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPrecio();
					
					PrecioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPrecioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPrecio.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPrecio.jComboBoxTiposAccionesFormularioPrecio.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPrecio(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPrecioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPrecio();
			
			if(this.jInternalFrameDetalleFormPrecio==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Precio> preciosSeleccionados=new ArrayList<Precio>();		
			Precio precio=new Precio();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPrecio(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPrecio.getSelectedItem();
			
			
			
			
			preciosSeleccionados=this.getPreciosSeleccionados(true);
			//this.sTipoAccion;
			
			if(preciosSeleccionados.size()==1) {
				for(Precio precioAux:preciosSeleccionados) {
					precio=precioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPrecio();
			
      		//this.finishProcessPrecio(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPrecioReturnGeneral() throws Exception {
		if(this.precioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.precioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.precioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.precioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.precioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.precioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPrecio(false);
		}
		
		if(this.precioReturnGeneral.getConRetornoLista() || this.precioReturnGeneral.getConRetornoObjeto()) {
			if(this.precioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.precioLogic.setPrecios(this.precioReturnGeneral.getPrecios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.precioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.precioLogic.setPrecio(this.precioReturnGeneral.getPrecio());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPrecio(false);
		}
	}
	
	public void actualizarParametrosGeneralPrecio() throws Exception {
		
		
	}
	
	public ArrayList<Precio> getPreciosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Precio> preciosSeleccionados=new ArrayList<Precio>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPrecio) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Precio precioAux:precioLogic.getPrecios()) {
					if(precioAux.getIsSelected()) {
						preciosSeleccionados.add(precioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Precio precioAux:this.precios) {
					if(precioAux.getIsSelected()) {
						preciosSeleccionados.add(precioAux);				
					}
				}
			}
			
			if(preciosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						preciosSeleccionados.addAll(this.precioLogic.getPrecios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						preciosSeleccionados.addAll(this.precios);				
					}
				}
			}
		} else {
			preciosSeleccionados.add(this.precio);
		}
		
		return preciosSeleccionados;
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
	
	public void generarReportePreciosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPreciosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPreciosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPreciosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPreciosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Precio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPreciosSeleccionados() throws Exception {
		ArrayList<Precio> preciosSeleccionados=new ArrayList<Precio>();		
		
		preciosSeleccionados=this.getPreciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePrecios("Todos",preciosSeleccionados);
		
	}	
	
	public void generarReporteNormalPreciosSeleccionados() throws Exception {
		ArrayList<Precio> preciosSeleccionados=new ArrayList<Precio>();		
		
		preciosSeleccionados=this.getPreciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePrecios("Todos",preciosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPreciosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Precio> preciosSeleccionados=new ArrayList<Precio>();
		
		preciosSeleccionados=this.getPreciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePrecios("Todos",preciosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPreciosSeleccionados() throws Exception {
		ArrayList<Precio> preciosSeleccionados=new ArrayList<Precio>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPrecio();
		
		
		preciosSeleccionados=this.getPreciosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPrecio();
		
		
		//this.generarReportePrecios("Todos",preciosSeleccionados ,precioImplementable,precioImplementableHome);
	}
	
	public void mostrarImportacionPrecios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPrecio();
		
		this.abrirFrameImportacionPrecio();		
		
			
		//this.generarReportePrecios("Todos",preciosSeleccionados ,precioImplementable,precioImplementableHome);
	}
	
	public void importarPrecios() throws Exception {		
	
	}
	
	public void exportarPreciosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPreciosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPreciosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPreciosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Precio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPreciosSeleccionados() throws Exception {
		ArrayList<Precio> preciosSeleccionados=new ArrayList<Precio>();		
		
		preciosSeleccionados=this.getPreciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"precio."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPrecio(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Precio precioAux:preciosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPrecio(precioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//precioAux.setsDetalleGeneralEntityReporte(precioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.precioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Precio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPrecio(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PrecioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrecioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrecioConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrecioConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrecioConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrecioConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrecioConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrecioConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrecioConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrecioConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrecioConstantesFunciones.LABEL_IDRANGOUNIDADVENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrecioConstantesFunciones.LABEL_IDTIPOPRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrecioConstantesFunciones.LABEL_PRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrecioConstantesFunciones.LABEL_DESCUENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrecioConstantesFunciones.LABEL_PRECIOMINIMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrecioConstantesFunciones.LABEL_CONIMPUESTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrecioConstantesFunciones.LABEL_IDESTADOPRECIO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPrecio(Precio precio,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=precio.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=precio.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=precio.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precio.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precio.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precio.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precio.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precio.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precio.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precio.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precio.getrangounidadventa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precio.gettipoprecio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precio.getprecio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precio.getdescuento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precio.getprecio_minimo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precio.getcon_impuesto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=precio.getestadoprecio_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPreciosSeleccionados() throws Exception {
		ArrayList<Precio> preciosSeleccionados=new ArrayList<Precio>();		
		
		preciosSeleccionados=this.getPreciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"precio.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Precios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPrecio(row);				
				iRow++;
			}				
			
			for(Precio precioAux:preciosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPrecio(precioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.precioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Precio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPreciosSeleccionados() throws Exception {
		ArrayList<Precio> preciosSeleccionados=new ArrayList<Precio>();		
		
		preciosSeleccionados=this.getPreciosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"precio.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("precios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("precio");
			//elementRoot.appendChild(element);
		
			for(Precio precioAux:preciosSeleccionados) {
				element = document.createElement("precio");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPrecio(precioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.precioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Precio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPrecio(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PrecioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PrecioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PrecioConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PrecioConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PrecioConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(PrecioConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PrecioConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(PrecioConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(PrecioConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(PrecioConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(PrecioConstantesFunciones.LABEL_IDRANGOUNIDADVENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(PrecioConstantesFunciones.LABEL_IDTIPOPRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PrecioConstantesFunciones.LABEL_PRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PrecioConstantesFunciones.LABEL_DESCUENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PrecioConstantesFunciones.LABEL_PRECIOMINIMO);
		cell = row.createCell(iColumn++);cell.setCellValue(PrecioConstantesFunciones.LABEL_CONIMPUESTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PrecioConstantesFunciones.LABEL_IDESTADOPRECIO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPrecio(Precio precio,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(precio.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(precio.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(precio.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(precio.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(precio.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(precio.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(precio.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(precio.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(precio.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(precio.getrangounidadventa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(precio.gettipoprecio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(precio.getprecio());
		cell = row.createCell(iColumn++);cell.setCellValue(precio.getdescuento());
		cell = row.createCell(iColumn++);cell.setCellValue(precio.getprecio_minimo());
		cell = row.createCell(iColumn++);cell.setCellValue(precio.getcon_impuesto());
		cell = row.createCell(iColumn++);cell.setCellValue(precio.getestadoprecio_descripcion());				
	}
	
	public void setFilaDatosExportarXmlPrecio(Precio precio,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PrecioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(precio.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PrecioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(precio.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PrecioConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(precio.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(PrecioConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(precio.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(PrecioConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(precio.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(PrecioConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(precio.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementlinea_descripcion = document.createElement(PrecioConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(precio.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(PrecioConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(precio.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(PrecioConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(precio.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(PrecioConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(precio.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementrangounidadventa_descripcion = document.createElement(PrecioConstantesFunciones.IDRANGOUNIDADVENTA);
		elementrangounidadventa_descripcion.appendChild(document.createTextNode(precio.getrangounidadventa_descripcion()));
		element.appendChild(elementrangounidadventa_descripcion);

		Element elementtipoprecio_descripcion = document.createElement(PrecioConstantesFunciones.IDTIPOPRECIO);
		elementtipoprecio_descripcion.appendChild(document.createTextNode(precio.gettipoprecio_descripcion()));
		element.appendChild(elementtipoprecio_descripcion);

		Element elementprecio = document.createElement(PrecioConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(precio.getprecio().toString().trim()));
		element.appendChild(elementprecio);

		Element elementdescuento = document.createElement(PrecioConstantesFunciones.DESCUENTO);
		elementdescuento.appendChild(document.createTextNode(precio.getdescuento().toString().trim()));
		element.appendChild(elementdescuento);

		Element elementprecio_minimo = document.createElement(PrecioConstantesFunciones.PRECIOMINIMO);
		elementprecio_minimo.appendChild(document.createTextNode(precio.getprecio_minimo().toString().trim()));
		element.appendChild(elementprecio_minimo);

		Element elementcon_impuesto = document.createElement(PrecioConstantesFunciones.CONIMPUESTO);
		elementcon_impuesto.appendChild(document.createTextNode(precio.getcon_impuesto().toString().trim()));
		element.appendChild(elementcon_impuesto);

		Element elementestadoprecio_descripcion = document.createElement(PrecioConstantesFunciones.IDESTADOPRECIO);
		elementestadoprecio_descripcion.appendChild(document.createTextNode(precio.getestadoprecio_descripcion()));
		element.appendChild(elementestadoprecio_descripcion);
	}
	
	public void generarReporteGroupGenericoPreciosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Precio> preciosSeleccionados=new ArrayList<Precio>();
		
		preciosSeleccionados=this.getPreciosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPrecio(preciosSeleccionados);
		
		this.generarReportePrecios("Todos",preciosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPrecio(ArrayList<Precio> preciosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Precio precioAux:preciosSeleccionados) {
				precioAux.setsDetalleGeneralEntityReporte(precioAux.toString());
			
				if(sTipoSeleccionar.equals(PrecioConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					precioAux.setsDescripcionGeneralEntityReporte1(precioAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PrecioConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					precioAux.setsDescripcionGeneralEntityReporte1(precioAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PrecioConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					precioAux.setsDescripcionGeneralEntityReporte1(precioAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PrecioConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					precioAux.setsDescripcionGeneralEntityReporte1(precioAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PrecioConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					precioAux.setsDescripcionGeneralEntityReporte1(precioAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PrecioConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					precioAux.setsDescripcionGeneralEntityReporte1(precioAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PrecioConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					precioAux.setsDescripcionGeneralEntityReporte1(precioAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PrecioConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					precioAux.setsDescripcionGeneralEntityReporte1(precioAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PrecioConstantesFunciones.LABEL_IDRANGOUNIDADVENTA)) {
					existe=true;
					precioAux.setsDescripcionGeneralEntityReporte1(precioAux.getrangounidadventa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PrecioConstantesFunciones.LABEL_IDTIPOPRECIO)) {
					existe=true;
					precioAux.setsDescripcionGeneralEntityReporte1(precioAux.gettipoprecio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PrecioConstantesFunciones.LABEL_CONIMPUESTO)) {
					existe=true;
					precioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(precioAux.getcon_impuesto()));
				}
				 else if(sTipoSeleccionar.equals(PrecioConstantesFunciones.LABEL_IDESTADOPRECIO)) {
					existe=true;
					precioAux.setsDescripcionGeneralEntityReporte1(precioAux.getestadoprecio_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPrecio(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPrecio=true;
				this.isVisibilidadCeldaNuevoRelacionesPrecio=true;
				this.isVisibilidadCeldaGuardarCambiosPrecio=true;
			}
			
			this.isVisibilidadCeldaModificarPrecio=false;
			this.isVisibilidadCeldaActualizarPrecio=false;
			this.isVisibilidadCeldaEliminarPrecio=false;
			this.isVisibilidadCeldaCancelarPrecio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPrecio=true;
				} else {
					this.isVisibilidadCeldaGuardarPrecio=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosPrecio=false;
			this.isVisibilidadCeldaModificarPrecio=false;
			this.isVisibilidadCeldaActualizarPrecio=true;
			this.isVisibilidadCeldaEliminarPrecio=false;
			this.isVisibilidadCeldaCancelarPrecio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPrecio=true;
				} else {
					this.isVisibilidadCeldaGuardarPrecio=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosPrecio=false;
			this.isVisibilidadCeldaModificarPrecio=false;
			this.isVisibilidadCeldaActualizarPrecio=true;
			this.isVisibilidadCeldaEliminarPrecio=true;
			this.isVisibilidadCeldaCancelarPrecio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPrecio=true;
				} else {
					this.isVisibilidadCeldaGuardarPrecio=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosPrecio=false;
			this.isVisibilidadCeldaModificarPrecio=false;
			this.isVisibilidadCeldaActualizarPrecio=true;
			this.isVisibilidadCeldaEliminarPrecio=false;
			this.isVisibilidadCeldaCancelarPrecio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPrecio=false;
				} else {
					this.isVisibilidadCeldaGuardarPrecio=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPrecio=true;
			this.isVisibilidadCeldaNuevoRelacionesPrecio=true;
			this.isVisibilidadCeldaGuardarCambiosPrecio=true;
			this.isVisibilidadCeldaModificarPrecio=false;
			this.isVisibilidadCeldaActualizarPrecio=false;
			this.isVisibilidadCeldaEliminarPrecio=false;
			this.isVisibilidadCeldaCancelarPrecio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPrecio=true;
				} else {
					this.isVisibilidadCeldaGuardarPrecio=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosPrecio=false;
			this.isVisibilidadCeldaActualizarPrecio=false;
			this.isVisibilidadCeldaEliminarPrecio=false;
			this.isVisibilidadCeldaCancelarPrecio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPrecio=false;
				} else {
					this.isVisibilidadCeldaGuardarPrecio=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosPrecio=false;
			this.isVisibilidadCeldaModificarPrecio=true;
			this.isVisibilidadCeldaActualizarPrecio=false;
			this.isVisibilidadCeldaEliminarPrecio=false;
			this.isVisibilidadCeldaCancelarPrecio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPrecio=false;
				} else {
					this.isVisibilidadCeldaGuardarPrecio=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PrecioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPrecio=true;
			this.isVisibilidadCeldaNuevoRelacionesPrecio=true;
			this.isVisibilidadCeldaGuardarCambiosPrecio=true;
		} else {
			this.actualizarEstadoPanelsPrecio(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPrecio=false;
			//this.isVisibilidadCeldaVerFormPrecio=false;
			this.isVisibilidadCeldaDuplicarPrecio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!precioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPrecio=false;
		} else {
			this.isVisibilidadCeldaNuevoPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosPrecio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(precioSessionBean.getEsGuardarRelacionado()) {
			if(!precioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPrecio=false;												
			}
			
			this.jButtonCerrarPrecio.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPrecio=false;
		}
		
		if(!this.permiteMantenimiento(this.precio)) {
			this.isVisibilidadCeldaActualizarPrecio=false;
			this.isVisibilidadCeldaEliminarPrecio=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPrecio() {
	}
	
	public void actualizarEstadoPanelsPrecio(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPrecio!=null) {
				this.jScrollPanelDatosEdicionPrecio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrecio!=null) {
				this.jTabbedPaneBusquedasPrecio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPrecio!=null) {
				this.jScrollPanelDatosPrecio.setVisible(true);
			}
			
			if(this.jPanelPaginacionPrecio!=null) {
				this.jPanelPaginacionPrecio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPrecio!=null) {
				this.jPanelParametrosReportesPrecio.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPrecio!=null) {
				this.jScrollPanelDatosEdicionPrecio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrecio!=null) {
				this.jTabbedPaneBusquedasPrecio.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPrecio!=null) {
				this.jScrollPanelDatosPrecio.setVisible(false);
			}
			
			if(this.jPanelPaginacionPrecio!=null) {
				this.jPanelPaginacionPrecio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPrecio!=null) {
				this.jPanelParametrosReportesPrecio.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPrecio!=null) {
				this.jScrollPanelDatosEdicionPrecio.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrecio!=null) {
				this.jTabbedPaneBusquedasPrecio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPrecio!=null) {
				this.jScrollPanelDatosPrecio.setVisible(false);
			}
			
			if(this.jPanelPaginacionPrecio!=null) {
				this.jPanelPaginacionPrecio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPrecio!=null) {
				this.jPanelParametrosReportesPrecio.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPrecio!=null) {
				this.jScrollPanelDatosEdicionPrecio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrecio!=null) {
				this.jTabbedPaneBusquedasPrecio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPrecio!=null) {
				this.jScrollPanelDatosPrecio.setVisible(false);
			}
			
			if(this.jPanelPaginacionPrecio!=null) {
				this.jPanelPaginacionPrecio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPrecio!=null) {
				this.jPanelParametrosReportesPrecio.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPrecio!=null) {
				this.jScrollPanelDatosEdicionPrecio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrecio!=null) {
				this.jTabbedPaneBusquedasPrecio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPrecio!=null) {
				this.jScrollPanelDatosPrecio.setVisible(true);
			}
			
			if(this.jPanelPaginacionPrecio!=null) {
				this.jPanelPaginacionPrecio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPrecio!=null) {
				this.jPanelParametrosReportesPrecio.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPrecio!=null) {
				this.jScrollPanelDatosEdicionPrecio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrecio!=null) {
				this.jTabbedPaneBusquedasPrecio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPrecio!=null) {
				this.jScrollPanelDatosPrecio.setVisible(true);
			}
			
			if(this.jPanelPaginacionPrecio!=null) {
				this.jPanelPaginacionPrecio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPrecio!=null) {
				this.jPanelParametrosReportesPrecio.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPrecio!=null) {
				this.jScrollPanelDatosEdicionPrecio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrecio!=null) {
				this.jTabbedPaneBusquedasPrecio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPrecio!=null) {
				this.jScrollPanelDatosPrecio.setVisible(true);
			}
			
			if(this.jPanelPaginacionPrecio!=null) {
				this.jPanelPaginacionPrecio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPrecio!=null) {
				this.jPanelParametrosReportesPrecio.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.precioSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPrecio!=null) {
					this.jTabbedPaneBusquedasPrecio.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPrecio!=null) {
				this.jPanelParametrosReportesPrecio.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.precioSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrecio!=null) {
				this.jTabbedPaneBusquedasPrecio.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPrecio!=null) {
				this.jPanelParametrosReportesPrecio.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorIdBodegaPorIdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorIdBodegaPorIdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorIdBodegaPorIdProductoPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);}

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdBodegaPrecio);}

			this.isVisibilidadFK_IdEstadoPrecio=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstadoPrecio) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdEstadoPrecioPrecio);}

			this.isVisibilidadFK_IdLinea=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdLineaPrecio);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdProductoPrecio);}

			this.isVisibilidadFK_IdRangoUnidadVenta=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdRangoUnidadVenta) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdRangoUnidadVentaPrecio);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPorIdBodegaPorIdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorIdBodegaPorIdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorIdBodegaPorIdProductoPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);}

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdBodegaPrecio);}

			this.isVisibilidadFK_IdEstadoPrecio=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstadoPrecio) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdEstadoPrecioPrecio);}

			this.isVisibilidadFK_IdLinea=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdLineaPrecio);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdProductoPrecio);}

			this.isVisibilidadFK_IdRangoUnidadVenta=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdRangoUnidadVenta) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdRangoUnidadVentaPrecio);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadBusquedaPorIdBodegaPorIdProducto=isParaBodega;
			if(!this.isVisibilidadBusquedaPorIdBodegaPorIdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorIdBodegaPorIdProductoPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca=isParaBodegaNegation;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto=isParaBodegaNegation;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);}

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdBodegaPrecio);}

			this.isVisibilidadFK_IdEstadoPrecio=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdEstadoPrecio) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdEstadoPrecioPrecio);}

			this.isVisibilidadFK_IdLinea=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdLineaPrecio);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdProductoPrecio);}

			this.isVisibilidadFK_IdRangoUnidadVenta=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdRangoUnidadVenta) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdRangoUnidadVentaPrecio);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaPorIdBodegaPorIdProducto=isParaProducto;
			if(!this.isVisibilidadBusquedaPorIdBodegaPorIdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorIdBodegaPorIdProductoPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca=isParaProductoNegation;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto=isParaProducto;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);}

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdBodegaPrecio);}

			this.isVisibilidadFK_IdEstadoPrecio=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdEstadoPrecio) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdEstadoPrecioPrecio);}

			this.isVisibilidadFK_IdLinea=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdLineaPrecio);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdProductoPrecio);}

			this.isVisibilidadFK_IdRangoUnidadVenta=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdRangoUnidadVenta) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdRangoUnidadVentaPrecio);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaPorIdBodegaPorIdProducto=isParaLineaNegation;
			if(!this.isVisibilidadBusquedaPorIdBodegaPorIdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorIdBodegaPorIdProductoPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca=isParaLinea;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto=isParaLinea;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);}

			this.isVisibilidadFK_IdBodega=isParaLineaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdBodegaPrecio);}

			this.isVisibilidadFK_IdEstadoPrecio=isParaLineaNegation;
			if(!this.isVisibilidadFK_IdEstadoPrecio) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdEstadoPrecioPrecio);}

			this.isVisibilidadFK_IdLinea=isParaLinea;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdLineaPrecio);}

			this.isVisibilidadFK_IdProducto=isParaLineaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdProductoPrecio);}

			this.isVisibilidadFK_IdRangoUnidadVenta=isParaLineaNegation;
			if(!this.isVisibilidadFK_IdRangoUnidadVenta) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdRangoUnidadVentaPrecio);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaPorIdBodegaPorIdProducto=isParaLineaGrupoNegation;
			if(!this.isVisibilidadBusquedaPorIdBodegaPorIdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorIdBodegaPorIdProductoPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);}

			this.isVisibilidadFK_IdBodega=isParaLineaGrupoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdBodegaPrecio);}

			this.isVisibilidadFK_IdEstadoPrecio=isParaLineaGrupoNegation;
			if(!this.isVisibilidadFK_IdEstadoPrecio) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdEstadoPrecioPrecio);}

			this.isVisibilidadFK_IdLinea=isParaLineaGrupoNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdLineaPrecio);}

			this.isVisibilidadFK_IdProducto=isParaLineaGrupoNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdProductoPrecio);}

			this.isVisibilidadFK_IdRangoUnidadVenta=isParaLineaGrupoNegation;
			if(!this.isVisibilidadFK_IdRangoUnidadVenta) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdRangoUnidadVentaPrecio);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaPorIdBodegaPorIdProducto=isParaLineaCategoriaNegation;
			if(!this.isVisibilidadBusquedaPorIdBodegaPorIdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorIdBodegaPorIdProductoPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);}

			this.isVisibilidadFK_IdBodega=isParaLineaCategoriaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdBodegaPrecio);}

			this.isVisibilidadFK_IdEstadoPrecio=isParaLineaCategoriaNegation;
			if(!this.isVisibilidadFK_IdEstadoPrecio) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdEstadoPrecioPrecio);}

			this.isVisibilidadFK_IdLinea=isParaLineaCategoriaNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdLineaPrecio);}

			this.isVisibilidadFK_IdProducto=isParaLineaCategoriaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdProductoPrecio);}

			this.isVisibilidadFK_IdRangoUnidadVenta=isParaLineaCategoriaNegation;
			if(!this.isVisibilidadFK_IdRangoUnidadVenta) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdRangoUnidadVentaPrecio);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaPorIdBodegaPorIdProducto=isParaLineaMarcaNegation;
			if(!this.isVisibilidadBusquedaPorIdBodegaPorIdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorIdBodegaPorIdProductoPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);}

			this.isVisibilidadFK_IdBodega=isParaLineaMarcaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdBodegaPrecio);}

			this.isVisibilidadFK_IdEstadoPrecio=isParaLineaMarcaNegation;
			if(!this.isVisibilidadFK_IdEstadoPrecio) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdEstadoPrecioPrecio);}

			this.isVisibilidadFK_IdLinea=isParaLineaMarcaNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdLineaPrecio);}

			this.isVisibilidadFK_IdProducto=isParaLineaMarcaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdProductoPrecio);}

			this.isVisibilidadFK_IdRangoUnidadVenta=isParaLineaMarcaNegation;
			if(!this.isVisibilidadFK_IdRangoUnidadVenta) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdRangoUnidadVentaPrecio);}
		}
		
	}

	public void setVisibilidadBusquedasParaRangoUnidadVenta(Boolean isParaRangoUnidadVenta){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaRangoUnidadVentaNegation=!isParaRangoUnidadVenta;

			this.isVisibilidadBusquedaPorIdBodegaPorIdProducto=isParaRangoUnidadVentaNegation;
			if(!this.isVisibilidadBusquedaPorIdBodegaPorIdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorIdBodegaPorIdProductoPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca=isParaRangoUnidadVentaNegation;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto=isParaRangoUnidadVentaNegation;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);}

			this.isVisibilidadFK_IdBodega=isParaRangoUnidadVentaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdBodegaPrecio);}

			this.isVisibilidadFK_IdEstadoPrecio=isParaRangoUnidadVentaNegation;
			if(!this.isVisibilidadFK_IdEstadoPrecio) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdEstadoPrecioPrecio);}

			this.isVisibilidadFK_IdLinea=isParaRangoUnidadVentaNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdLineaPrecio);}

			this.isVisibilidadFK_IdProducto=isParaRangoUnidadVentaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdProductoPrecio);}

			this.isVisibilidadFK_IdRangoUnidadVenta=isParaRangoUnidadVenta;
			if(!this.isVisibilidadFK_IdRangoUnidadVenta) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdRangoUnidadVentaPrecio);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoPrecio(Boolean isParaTipoPrecio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoPrecioNegation=!isParaTipoPrecio;

			this.isVisibilidadBusquedaPorIdBodegaPorIdProducto=isParaTipoPrecioNegation;
			if(!this.isVisibilidadBusquedaPorIdBodegaPorIdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorIdBodegaPorIdProductoPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca=isParaTipoPrecioNegation;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto=isParaTipoPrecioNegation;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);}

			this.isVisibilidadFK_IdBodega=isParaTipoPrecioNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdBodegaPrecio);}

			this.isVisibilidadFK_IdEstadoPrecio=isParaTipoPrecioNegation;
			if(!this.isVisibilidadFK_IdEstadoPrecio) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdEstadoPrecioPrecio);}

			this.isVisibilidadFK_IdLinea=isParaTipoPrecioNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdLineaPrecio);}

			this.isVisibilidadFK_IdProducto=isParaTipoPrecioNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdProductoPrecio);}

			this.isVisibilidadFK_IdRangoUnidadVenta=isParaTipoPrecioNegation;
			if(!this.isVisibilidadFK_IdRangoUnidadVenta) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdRangoUnidadVentaPrecio);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoPrecio(Boolean isParaEstadoPrecio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoPrecioNegation=!isParaEstadoPrecio;

			this.isVisibilidadBusquedaPorIdBodegaPorIdProducto=isParaEstadoPrecioNegation;
			if(!this.isVisibilidadBusquedaPorIdBodegaPorIdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorIdBodegaPorIdProductoPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca=isParaEstadoPrecioNegation;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarca) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio);}

			this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto=isParaEstadoPrecioNegation;
			if(!this.isVisibilidadBusquedaPorLineaGrupoCategoriaMarcaProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);}

			this.isVisibilidadFK_IdBodega=isParaEstadoPrecioNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdBodegaPrecio);}

			this.isVisibilidadFK_IdEstadoPrecio=isParaEstadoPrecio;
			if(!this.isVisibilidadFK_IdEstadoPrecio) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdEstadoPrecioPrecio);}

			this.isVisibilidadFK_IdLinea=isParaEstadoPrecioNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdLineaPrecio);}

			this.isVisibilidadFK_IdProducto=isParaEstadoPrecioNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdProductoPrecio);}

			this.isVisibilidadFK_IdRangoUnidadVenta=isParaEstadoPrecioNegation;
			if(!this.isVisibilidadFK_IdRangoUnidadVenta) {this.jTabbedPaneBusquedasPrecio.remove(jPanelFK_IdRangoUnidadVentaPrecio);}
		}
		
	}
	
	
	
	

	public String registrarSesionPrecioParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(precioSessionBean==null) {
				precioSessionBean=new PrecioSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(precioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.precioFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(PrecioConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionPrecio(true);
			//productoSessionBean.setlidPrecioActual(this.idPrecioActual);

			precioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPrecio(true);
			precioSessionBean.setlIdPrecioActualForeignKey(this.idPrecioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PrecioSessionBean precioSessionBean=new PrecioSessionBean();
		
		if(this.precioSessionBean==null) {
			this.precioSessionBean=new PrecioSessionBean();
		}
		
		this.precioSessionBean.setsUltimaBusquedaPrecio(this.getsAccionBusqueda());
		this.precioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.precioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdBodegaPorIdProducto")) {
			precioSessionBean.setid_bodega(this.getid_bodegaBusquedaPorIdBodegaPorIdProducto());	
			precioSessionBean.setid_producto(this.getid_productoBusquedaPorIdBodegaPorIdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorLineaGrupoCategoriaMarca")) {
			precioSessionBean.setid_linea(this.getid_lineaBusquedaPorLineaGrupoCategoriaMarca());	
			precioSessionBean.setid_linea_grupo(this.getid_linea_grupoBusquedaPorLineaGrupoCategoriaMarca());	
			precioSessionBean.setid_linea_categoria(this.getid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarca());	
			precioSessionBean.setid_linea_marca(this.getid_linea_marcaBusquedaPorLineaGrupoCategoriaMarca());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorLineaGrupoCategoriaMarcaProducto")) {
			precioSessionBean.setid_linea(this.getid_lineaBusquedaPorLineaGrupoCategoriaMarcaProducto());	
			precioSessionBean.setid_linea_grupo(this.getid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProducto());	
			precioSessionBean.setid_linea_categoria(this.getid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProducto());	
			precioSessionBean.setid_linea_marca(this.getid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProducto());	
			precioSessionBean.setid_producto(this.getid_productoBusquedaPorLineaGrupoCategoriaMarcaProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			precioSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			precioSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstadoPrecio")) {
			precioSessionBean.setid_estado_precio(this.getid_estado_precioFK_IdEstadoPrecio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdLinea")) {
			precioSessionBean.setid_linea(this.getid_lineaFK_IdLinea());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			precioSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdRangoUnidadVenta")) {
			precioSessionBean.setid_rango_unidad_venta(this.getid_rango_unidad_ventaFK_IdRangoUnidadVenta());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			precioSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PrecioSessionBean precioSessionBean=new PrecioSessionBean();
		
		if(this.precioSessionBean==null) {
			this.precioSessionBean=new PrecioSessionBean();
		}
		
		if(this.precioSessionBean.getsUltimaBusquedaPrecio()!=null&&!this.precioSessionBean.getsUltimaBusquedaPrecio().equals("")) {
			this.setsAccionBusqueda(precioSessionBean.getsUltimaBusquedaPrecio());
			this.setiNumeroPaginacion(precioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(precioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdBodegaPorIdProducto")) {
				this.setid_bodegaBusquedaPorIdBodegaPorIdProducto(precioSessionBean.getid_bodega());
				precioSessionBean.setid_bodega(-1L);
				this.setid_productoBusquedaPorIdBodegaPorIdProducto(precioSessionBean.getid_producto());
				precioSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorLineaGrupoCategoriaMarca")) {
				this.setid_lineaBusquedaPorLineaGrupoCategoriaMarca(precioSessionBean.getid_linea());
				precioSessionBean.setid_linea(null);
				this.setid_linea_grupoBusquedaPorLineaGrupoCategoriaMarca(precioSessionBean.getid_linea_grupo());
				precioSessionBean.setid_linea_grupo(null);
				this.setid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarca(precioSessionBean.getid_linea_categoria());
				precioSessionBean.setid_linea_categoria(null);
				this.setid_linea_marcaBusquedaPorLineaGrupoCategoriaMarca(precioSessionBean.getid_linea_marca());
				precioSessionBean.setid_linea_marca(null);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorLineaGrupoCategoriaMarcaProducto")) {
				this.setid_lineaBusquedaPorLineaGrupoCategoriaMarcaProducto(precioSessionBean.getid_linea());
				precioSessionBean.setid_linea(null);
				this.setid_linea_grupoBusquedaPorLineaGrupoCategoriaMarcaProducto(precioSessionBean.getid_linea_grupo());
				precioSessionBean.setid_linea_grupo(null);
				this.setid_linea_categoriaBusquedaPorLineaGrupoCategoriaMarcaProducto(precioSessionBean.getid_linea_categoria());
				precioSessionBean.setid_linea_categoria(null);
				this.setid_linea_marcaBusquedaPorLineaGrupoCategoriaMarcaProducto(precioSessionBean.getid_linea_marca());
				precioSessionBean.setid_linea_marca(null);
				this.setid_productoBusquedaPorLineaGrupoCategoriaMarcaProducto(precioSessionBean.getid_producto());
				precioSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(precioSessionBean.getid_bodega());
				precioSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(precioSessionBean.getid_empresa());
				precioSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstadoPrecio")) {
				this.setid_estado_precioFK_IdEstadoPrecio(precioSessionBean.getid_estado_precio());
				precioSessionBean.setid_estado_precio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdLinea")) {
				this.setid_lineaFK_IdLinea(precioSessionBean.getid_linea());
				precioSessionBean.setid_linea(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(precioSessionBean.getid_producto());
				precioSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdRangoUnidadVenta")) {
				this.setid_rango_unidad_ventaFK_IdRangoUnidadVenta(precioSessionBean.getid_rango_unidad_venta());
				precioSessionBean.setid_rango_unidad_venta(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(precioSessionBean.getid_sucursal());
				precioSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.precioSessionBean.setsUltimaBusquedaPrecio("");
		this.precioSessionBean.setiNumeroPaginacion(PrecioConstantesFunciones.INUMEROPAGINACION);
		this.precioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPrecio(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPrecio() {
		this.updateBorderResaltarBusquedasFormularioPrecio();
		this.updateVisibilidadBusquedasFormularioPrecio();
		this.updateHabilitarBusquedasFormularioPrecio();
	}
	
	public void updateBorderResaltarBusquedasFormularioPrecio() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPrecio.getComponents().length>0) {
	

		if(this.precioConstantesFunciones.resaltarBusquedaPorIdBodegaPorIdProductoPrecio!=null) {
			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelBusquedaPorIdBodegaPorIdProductoPrecio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
				jPanel.setBorder(this.precioConstantesFunciones.resaltarBusquedaPorIdBodegaPorIdProductoPrecio);
			}
		}

		if(this.precioConstantesFunciones.resaltarBusquedaPorLineaGrupoCategoriaMarcaPrecio!=null) {
			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
				jPanel.setBorder(this.precioConstantesFunciones.resaltarBusquedaPorLineaGrupoCategoriaMarcaPrecio);
			}
		}

		if(this.precioConstantesFunciones.resaltarBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio!=null) {
			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
				jPanel.setBorder(this.precioConstantesFunciones.resaltarBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);
			}
		}

		if(this.precioConstantesFunciones.resaltarFK_IdBodegaPrecio!=null) {
			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelFK_IdBodegaPrecio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
				jPanel.setBorder(this.precioConstantesFunciones.resaltarFK_IdBodegaPrecio);
			}
		}

		if(this.precioConstantesFunciones.resaltarFK_IdEstadoPrecioPrecio!=null) {
			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelFK_IdEstadoPrecioPrecio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
				jPanel.setBorder(this.precioConstantesFunciones.resaltarFK_IdEstadoPrecioPrecio);
			}
		}

		if(this.precioConstantesFunciones.resaltarFK_IdLineaPrecio!=null) {
			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelFK_IdLineaPrecio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
				jPanel.setBorder(this.precioConstantesFunciones.resaltarFK_IdLineaPrecio);
			}
		}

		if(this.precioConstantesFunciones.resaltarFK_IdProductoPrecio!=null) {
			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelFK_IdProductoPrecio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
				jPanel.setBorder(this.precioConstantesFunciones.resaltarFK_IdProductoPrecio);
			}
		}

		if(this.precioConstantesFunciones.resaltarFK_IdRangoUnidadVentaPrecio!=null) {
			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelFK_IdRangoUnidadVentaPrecio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
				jPanel.setBorder(this.precioConstantesFunciones.resaltarFK_IdRangoUnidadVentaPrecio);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPrecio() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPrecio.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelBusquedaPorIdBodegaPorIdProductoPrecio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.precioConstantesFunciones.mostrarBusquedaPorIdBodegaPorIdProductoPrecio);
			if(!this.precioConstantesFunciones.mostrarBusquedaPorIdBodegaPorIdProductoPrecio && index>-1) {
				this.jTabbedPaneBusquedasPrecio.remove(index);
			}

			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.precioConstantesFunciones.mostrarBusquedaPorLineaGrupoCategoriaMarcaPrecio);
			if(!this.precioConstantesFunciones.mostrarBusquedaPorLineaGrupoCategoriaMarcaPrecio && index>-1) {
				this.jTabbedPaneBusquedasPrecio.remove(index);
			}

			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.precioConstantesFunciones.mostrarBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);
			if(!this.precioConstantesFunciones.mostrarBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio && index>-1) {
				this.jTabbedPaneBusquedasPrecio.remove(index);
			}

			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelFK_IdBodegaPrecio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.precioConstantesFunciones.mostrarFK_IdBodegaPrecio);
			if(!this.precioConstantesFunciones.mostrarFK_IdBodegaPrecio && index>-1) {
				this.jTabbedPaneBusquedasPrecio.remove(index);
			}

			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelFK_IdEstadoPrecioPrecio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.precioConstantesFunciones.mostrarFK_IdEstadoPrecioPrecio);
			if(!this.precioConstantesFunciones.mostrarFK_IdEstadoPrecioPrecio && index>-1) {
				this.jTabbedPaneBusquedasPrecio.remove(index);
			}

			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelFK_IdLineaPrecio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.precioConstantesFunciones.mostrarFK_IdLineaPrecio);
			if(!this.precioConstantesFunciones.mostrarFK_IdLineaPrecio && index>-1) {
				this.jTabbedPaneBusquedasPrecio.remove(index);
			}

			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelFK_IdProductoPrecio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.precioConstantesFunciones.mostrarFK_IdProductoPrecio);
			if(!this.precioConstantesFunciones.mostrarFK_IdProductoPrecio && index>-1) {
				this.jTabbedPaneBusquedasPrecio.remove(index);
			}

			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelFK_IdRangoUnidadVentaPrecio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.precioConstantesFunciones.mostrarFK_IdRangoUnidadVentaPrecio);
			if(!this.precioConstantesFunciones.mostrarFK_IdRangoUnidadVentaPrecio && index>-1) {
				this.jTabbedPaneBusquedasPrecio.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPrecio() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPrecio.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelBusquedaPorIdBodegaPorIdProductoPrecio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.precioConstantesFunciones.activarBusquedaPorIdBodegaPorIdProductoPrecio);
				this.jTabbedPaneBusquedasPrecio.setEnabledAt(index,this.precioConstantesFunciones.activarBusquedaPorIdBodegaPorIdProductoPrecio);
			}

			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.precioConstantesFunciones.activarBusquedaPorLineaGrupoCategoriaMarcaPrecio);
				this.jTabbedPaneBusquedasPrecio.setEnabledAt(index,this.precioConstantesFunciones.activarBusquedaPorLineaGrupoCategoriaMarcaPrecio);
			}

			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.precioConstantesFunciones.activarBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);
				this.jTabbedPaneBusquedasPrecio.setEnabledAt(index,this.precioConstantesFunciones.activarBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);
			}

			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelFK_IdBodegaPrecio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.precioConstantesFunciones.activarFK_IdBodegaPrecio);
				this.jTabbedPaneBusquedasPrecio.setEnabledAt(index,this.precioConstantesFunciones.activarFK_IdBodegaPrecio);
			}

			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelFK_IdEstadoPrecioPrecio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.precioConstantesFunciones.activarFK_IdEstadoPrecioPrecio);
				this.jTabbedPaneBusquedasPrecio.setEnabledAt(index,this.precioConstantesFunciones.activarFK_IdEstadoPrecioPrecio);
			}

			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelFK_IdLineaPrecio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.precioConstantesFunciones.activarFK_IdLineaPrecio);
				this.jTabbedPaneBusquedasPrecio.setEnabledAt(index,this.precioConstantesFunciones.activarFK_IdLineaPrecio);
			}

			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelFK_IdProductoPrecio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.precioConstantesFunciones.activarFK_IdProductoPrecio);
				this.jTabbedPaneBusquedasPrecio.setEnabledAt(index,this.precioConstantesFunciones.activarFK_IdProductoPrecio);
			}

			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelFK_IdRangoUnidadVentaPrecio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.precioConstantesFunciones.activarFK_IdRangoUnidadVentaPrecio);
				this.jTabbedPaneBusquedasPrecio.setEnabledAt(index,this.precioConstantesFunciones.activarFK_IdRangoUnidadVentaPrecio);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPrecio(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdBodegaPorIdProducto")) {
			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelBusquedaPorIdBodegaPorIdProductoPrecio);

			this.jTabbedPaneBusquedasPrecio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);

			this.precioConstantesFunciones.setResaltarBusquedaPorIdBodegaPorIdProductoPrecio(resaltar);

			jPanel.setBorder(this.precioConstantesFunciones.resaltarBusquedaPorIdBodegaPorIdProductoPrecio);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarca")) {
			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelBusquedaPorLineaGrupoCategoriaMarcaPrecio);

			this.jTabbedPaneBusquedasPrecio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);

			this.precioConstantesFunciones.setResaltarBusquedaPorLineaGrupoCategoriaMarcaPrecio(resaltar);

			jPanel.setBorder(this.precioConstantesFunciones.resaltarBusquedaPorLineaGrupoCategoriaMarcaPrecio);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorLineaGrupoCategoriaMarcaProducto")) {
			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);

			this.jTabbedPaneBusquedasPrecio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);

			this.precioConstantesFunciones.setResaltarBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio(resaltar);

			jPanel.setBorder(this.precioConstantesFunciones.resaltarBusquedaPorLineaGrupoCategoriaMarcaProductoPrecio);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelFK_IdBodegaPrecio);

			this.jTabbedPaneBusquedasPrecio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);

			this.precioConstantesFunciones.setResaltarFK_IdBodegaPrecio(resaltar);

			jPanel.setBorder(this.precioConstantesFunciones.resaltarFK_IdBodegaPrecio);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstadoPrecio")) {
			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelFK_IdEstadoPrecioPrecio);

			this.jTabbedPaneBusquedasPrecio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);

			this.precioConstantesFunciones.setResaltarFK_IdEstadoPrecioPrecio(resaltar);

			jPanel.setBorder(this.precioConstantesFunciones.resaltarFK_IdEstadoPrecioPrecio);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdLinea")) {
			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelFK_IdLineaPrecio);

			this.jTabbedPaneBusquedasPrecio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);

			this.precioConstantesFunciones.setResaltarFK_IdLineaPrecio(resaltar);

			jPanel.setBorder(this.precioConstantesFunciones.resaltarFK_IdLineaPrecio);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelFK_IdProductoPrecio);

			this.jTabbedPaneBusquedasPrecio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);

			this.precioConstantesFunciones.setResaltarFK_IdProductoPrecio(resaltar);

			jPanel.setBorder(this.precioConstantesFunciones.resaltarFK_IdProductoPrecio);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdRangoUnidadVenta")) {
			index= this.jTabbedPaneBusquedasPrecio.indexOfComponent(this.jPanelFK_IdRangoUnidadVentaPrecio);

			this.jTabbedPaneBusquedasPrecio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrecio.getComponent(index);

			this.precioConstantesFunciones.setResaltarFK_IdRangoUnidadVentaPrecio(resaltar);

			jPanel.setBorder(this.precioConstantesFunciones.resaltarFK_IdRangoUnidadVentaPrecio);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPrecio.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPrecio() throws Exception {

		if(this.jInternalFrameDetalleFormPrecio==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPrecio();
		this.updateVisibilidadResaltarControlesFormularioPrecio();
		this.updateHabilitarResaltarControlesFormularioPrecio();
		
	}
	
	public void updateBorderResaltarControlesFormularioPrecio() throws Exception {
		if(this.jInternalFrameDetalleFormPrecio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.precioConstantesFunciones.resaltaridPrecio!=null && this.jInternalFrameDetalleFormPrecio!=null) {this.jInternalFrameDetalleFormPrecio.jLabelidPrecio.setBorder(this.precioConstantesFunciones.resaltaridPrecio);}
		if(this.precioConstantesFunciones.resaltarid_empresaPrecio!=null && this.jInternalFrameDetalleFormPrecio!=null) {this.jInternalFrameDetalleFormPrecio.jComboBoxid_empresaPrecio.setBorder(this.precioConstantesFunciones.resaltarid_empresaPrecio);}
		if(this.precioConstantesFunciones.resaltarid_sucursalPrecio!=null && this.jInternalFrameDetalleFormPrecio!=null) {this.jInternalFrameDetalleFormPrecio.jComboBoxid_sucursalPrecio.setBorder(this.precioConstantesFunciones.resaltarid_sucursalPrecio);}
		if(this.precioConstantesFunciones.resaltarid_bodegaPrecio!=null && this.jInternalFrameDetalleFormPrecio!=null) {this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio.setBorder(this.precioConstantesFunciones.resaltarid_bodegaPrecio);}
		if(this.precioConstantesFunciones.resaltarid_productoPrecio!=null && this.jInternalFrameDetalleFormPrecio!=null) {this.jInternalFrameDetalleFormPrecio.jComboBoxid_productoPrecio.setBorder(this.precioConstantesFunciones.resaltarid_productoPrecio);}
		if(this.precioConstantesFunciones.resaltarid_lineaPrecio!=null && this.jInternalFrameDetalleFormPrecio!=null) {this.jInternalFrameDetalleFormPrecio.jComboBoxid_lineaPrecio.setBorder(this.precioConstantesFunciones.resaltarid_lineaPrecio);}
		if(this.precioConstantesFunciones.resaltarid_linea_grupoPrecio!=null && this.jInternalFrameDetalleFormPrecio!=null) {this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_grupoPrecio.setBorder(this.precioConstantesFunciones.resaltarid_linea_grupoPrecio);}
		if(this.precioConstantesFunciones.resaltarid_linea_categoriaPrecio!=null && this.jInternalFrameDetalleFormPrecio!=null) {this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_categoriaPrecio.setBorder(this.precioConstantesFunciones.resaltarid_linea_categoriaPrecio);}
		if(this.precioConstantesFunciones.resaltarid_linea_marcaPrecio!=null && this.jInternalFrameDetalleFormPrecio!=null) {this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_marcaPrecio.setBorder(this.precioConstantesFunciones.resaltarid_linea_marcaPrecio);}
		if(this.precioConstantesFunciones.resaltarid_rango_unidad_ventaPrecio!=null && this.jInternalFrameDetalleFormPrecio!=null) {this.jInternalFrameDetalleFormPrecio.jComboBoxid_rango_unidad_ventaPrecio.setBorder(this.precioConstantesFunciones.resaltarid_rango_unidad_ventaPrecio);}
		if(this.precioConstantesFunciones.resaltarid_tipo_precioPrecio!=null && this.jInternalFrameDetalleFormPrecio!=null) {this.jInternalFrameDetalleFormPrecio.jComboBoxid_tipo_precioPrecio.setBorder(this.precioConstantesFunciones.resaltarid_tipo_precioPrecio);}
		if(this.precioConstantesFunciones.resaltarprecioPrecio!=null && this.jInternalFrameDetalleFormPrecio!=null) {this.jInternalFrameDetalleFormPrecio.jTextFieldprecioPrecio.setBorder(this.precioConstantesFunciones.resaltarprecioPrecio);}
		if(this.precioConstantesFunciones.resaltardescuentoPrecio!=null && this.jInternalFrameDetalleFormPrecio!=null) {this.jInternalFrameDetalleFormPrecio.jTextFielddescuentoPrecio.setBorder(this.precioConstantesFunciones.resaltardescuentoPrecio);}
		if(this.precioConstantesFunciones.resaltarprecio_minimoPrecio!=null && this.jInternalFrameDetalleFormPrecio!=null) {this.jInternalFrameDetalleFormPrecio.jTextFieldprecio_minimoPrecio.setBorder(this.precioConstantesFunciones.resaltarprecio_minimoPrecio);}
		if(this.precioConstantesFunciones.resaltarcon_impuestoPrecio!=null && this.jInternalFrameDetalleFormPrecio!=null) {this.jInternalFrameDetalleFormPrecio.jCheckBoxcon_impuestoPrecio.setBorderPainted(true);this.jInternalFrameDetalleFormPrecio.jCheckBoxcon_impuestoPrecio.setBorder(this.precioConstantesFunciones.resaltarcon_impuestoPrecio);}
		if(this.precioConstantesFunciones.resaltarid_estado_precioPrecio!=null && this.jInternalFrameDetalleFormPrecio!=null) {this.jInternalFrameDetalleFormPrecio.jComboBoxid_estado_precioPrecio.setBorder(this.precioConstantesFunciones.resaltarid_estado_precioPrecio);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPrecio() throws Exception {		
		if(this.jInternalFrameDetalleFormPrecio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPrecio!=null) {
	
		//this.jInternalFrameDetalleFormPrecio.jLabelidPrecio.setVisible(this.precioConstantesFunciones.mostraridPrecio);
		this.jInternalFrameDetalleFormPrecio.jPanelidPrecio.setVisible(this.precioConstantesFunciones.mostraridPrecio);
		//this.jInternalFrameDetalleFormPrecio.jComboBoxid_empresaPrecio.setVisible(this.precioConstantesFunciones.mostrarid_empresaPrecio);
		this.jInternalFrameDetalleFormPrecio.jPanelid_empresaPrecio.setVisible(this.precioConstantesFunciones.mostrarid_empresaPrecio);
		//this.jInternalFrameDetalleFormPrecio.jComboBoxid_sucursalPrecio.setVisible(this.precioConstantesFunciones.mostrarid_sucursalPrecio);
		this.jInternalFrameDetalleFormPrecio.jPanelid_sucursalPrecio.setVisible(this.precioConstantesFunciones.mostrarid_sucursalPrecio);
		//this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio.setVisible(this.precioConstantesFunciones.mostrarid_bodegaPrecio);
		this.jInternalFrameDetalleFormPrecio.jPanelid_bodegaPrecio.setVisible(this.precioConstantesFunciones.mostrarid_bodegaPrecio);
		//this.jInternalFrameDetalleFormPrecio.jComboBoxid_productoPrecio.setVisible(this.precioConstantesFunciones.mostrarid_productoPrecio);
		this.jInternalFrameDetalleFormPrecio.jPanelid_productoPrecio.setVisible(this.precioConstantesFunciones.mostrarid_productoPrecio);
			this.jInternalFrameDetalleFormPrecio.jButtonid_productoPrecio.setVisible(this.precioConstantesFunciones.mostrarid_productoPrecio);
		//this.jInternalFrameDetalleFormPrecio.jComboBoxid_lineaPrecio.setVisible(this.precioConstantesFunciones.mostrarid_lineaPrecio);
		this.jInternalFrameDetalleFormPrecio.jPanelid_lineaPrecio.setVisible(this.precioConstantesFunciones.mostrarid_lineaPrecio);
		//this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_grupoPrecio.setVisible(this.precioConstantesFunciones.mostrarid_linea_grupoPrecio);
		this.jInternalFrameDetalleFormPrecio.jPanelid_linea_grupoPrecio.setVisible(this.precioConstantesFunciones.mostrarid_linea_grupoPrecio);
		//this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_categoriaPrecio.setVisible(this.precioConstantesFunciones.mostrarid_linea_categoriaPrecio);
		this.jInternalFrameDetalleFormPrecio.jPanelid_linea_categoriaPrecio.setVisible(this.precioConstantesFunciones.mostrarid_linea_categoriaPrecio);
		//this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_marcaPrecio.setVisible(this.precioConstantesFunciones.mostrarid_linea_marcaPrecio);
		this.jInternalFrameDetalleFormPrecio.jPanelid_linea_marcaPrecio.setVisible(this.precioConstantesFunciones.mostrarid_linea_marcaPrecio);
		//this.jInternalFrameDetalleFormPrecio.jComboBoxid_rango_unidad_ventaPrecio.setVisible(this.precioConstantesFunciones.mostrarid_rango_unidad_ventaPrecio);
		this.jInternalFrameDetalleFormPrecio.jPanelid_rango_unidad_ventaPrecio.setVisible(this.precioConstantesFunciones.mostrarid_rango_unidad_ventaPrecio);
		//this.jInternalFrameDetalleFormPrecio.jComboBoxid_tipo_precioPrecio.setVisible(this.precioConstantesFunciones.mostrarid_tipo_precioPrecio);
		this.jInternalFrameDetalleFormPrecio.jPanelid_tipo_precioPrecio.setVisible(this.precioConstantesFunciones.mostrarid_tipo_precioPrecio);
		//this.jInternalFrameDetalleFormPrecio.jTextFieldprecioPrecio.setVisible(this.precioConstantesFunciones.mostrarprecioPrecio);
		this.jInternalFrameDetalleFormPrecio.jPanelprecioPrecio.setVisible(this.precioConstantesFunciones.mostrarprecioPrecio);
		//this.jInternalFrameDetalleFormPrecio.jTextFielddescuentoPrecio.setVisible(this.precioConstantesFunciones.mostrardescuentoPrecio);
		this.jInternalFrameDetalleFormPrecio.jPaneldescuentoPrecio.setVisible(this.precioConstantesFunciones.mostrardescuentoPrecio);
		//this.jInternalFrameDetalleFormPrecio.jTextFieldprecio_minimoPrecio.setVisible(this.precioConstantesFunciones.mostrarprecio_minimoPrecio);
		this.jInternalFrameDetalleFormPrecio.jPanelprecio_minimoPrecio.setVisible(this.precioConstantesFunciones.mostrarprecio_minimoPrecio);
		//this.jInternalFrameDetalleFormPrecio.jCheckBoxcon_impuestoPrecio.setVisible(this.precioConstantesFunciones.mostrarcon_impuestoPrecio);
		this.jInternalFrameDetalleFormPrecio.jPanelcon_impuestoPrecio.setVisible(this.precioConstantesFunciones.mostrarcon_impuestoPrecio);
		//this.jInternalFrameDetalleFormPrecio.jComboBoxid_estado_precioPrecio.setVisible(this.precioConstantesFunciones.mostrarid_estado_precioPrecio);
		this.jInternalFrameDetalleFormPrecio.jPanelid_estado_precioPrecio.setVisible(this.precioConstantesFunciones.mostrarid_estado_precioPrecio);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPrecio() throws Exception {
		if(this.jInternalFrameDetalleFormPrecio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPrecio!=null) {
	
		this.jInternalFrameDetalleFormPrecio.jLabelidPrecio.setEnabled(this.precioConstantesFunciones.activaridPrecio);
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_empresaPrecio.setEnabled(this.precioConstantesFunciones.activarid_empresaPrecio);
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_sucursalPrecio.setEnabled(this.precioConstantesFunciones.activarid_sucursalPrecio);
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_bodegaPrecio.setEnabled(this.precioConstantesFunciones.activarid_bodegaPrecio);
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_productoPrecio.setEnabled(this.precioConstantesFunciones.activarid_productoPrecio);
			this.jInternalFrameDetalleFormPrecio.jButtonid_productoPrecio.setEnabled(this.precioConstantesFunciones.activarid_productoPrecio);
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_lineaPrecio.setEnabled(this.precioConstantesFunciones.activarid_lineaPrecio);
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_grupoPrecio.setEnabled(this.precioConstantesFunciones.activarid_linea_grupoPrecio);
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_categoriaPrecio.setEnabled(this.precioConstantesFunciones.activarid_linea_categoriaPrecio);
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_linea_marcaPrecio.setEnabled(this.precioConstantesFunciones.activarid_linea_marcaPrecio);
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_rango_unidad_ventaPrecio.setEnabled(this.precioConstantesFunciones.activarid_rango_unidad_ventaPrecio);
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_tipo_precioPrecio.setEnabled(this.precioConstantesFunciones.activarid_tipo_precioPrecio);
		this.jInternalFrameDetalleFormPrecio.jTextFieldprecioPrecio.setEnabled(this.precioConstantesFunciones.activarprecioPrecio);
		this.jInternalFrameDetalleFormPrecio.jTextFielddescuentoPrecio.setEnabled(this.precioConstantesFunciones.activardescuentoPrecio);
		this.jInternalFrameDetalleFormPrecio.jTextFieldprecio_minimoPrecio.setEnabled(this.precioConstantesFunciones.activarprecio_minimoPrecio);
		this.jInternalFrameDetalleFormPrecio.jCheckBoxcon_impuestoPrecio.setEnabled(this.precioConstantesFunciones.activarcon_impuestoPrecio);
		this.jInternalFrameDetalleFormPrecio.jComboBoxid_estado_precioPrecio.setEnabled(this.precioConstantesFunciones.activarid_estado_precioPrecio);
		}
	}
	
		
}