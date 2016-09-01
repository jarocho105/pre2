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

//import com.bydan.erp.inventario.util.ProductosBodegasConstantesFunciones;
import com.bydan.erp.inventario.util.report.ProductosBodegasParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.ProductosBodegasParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.ProductosBodegasBean;
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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProductosBodegasBeanSwingJInternalFrame extends ProductosBodegasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductosBodegasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductosBodegas> productosbodegasValidator = new ClassValidator<ProductosBodegas>(ProductosBodegas.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductosBodegas productosbodegas;	
	public ProductosBodegas productosbodegasAux;
	public ProductosBodegas productosbodegasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductosBodegas productosbodegasTotales;
	public Long idProductosBodegasActual;
	public Long iIdNuevoProductosBodegas=0L;
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
	
	public Boolean isPermisoTodoProductosBodegas;
	public Boolean isPermisoNuevoProductosBodegas;
	public Boolean isPermisoActualizarProductosBodegas;
	public Boolean isPermisoActualizarOriginalProductosBodegas;
	public Boolean isPermisoEliminarProductosBodegas;
	public Boolean isPermisoGuardarCambiosProductosBodegas;
	public Boolean isPermisoConsultaProductosBodegas;
	public Boolean isPermisoBusquedaProductosBodegas;
	public Boolean isPermisoReporteProductosBodegas;
	public Boolean isPermisoPaginacionMedioProductosBodegas;
	public Boolean isPermisoPaginacionAltoProductosBodegas;
	public Boolean isPermisoPaginacionTodoProductosBodegas;
	public Boolean isPermisoCopiarProductosBodegas;
	public Boolean isPermisoVerFormProductosBodegas;
	public Boolean isPermisoDuplicarProductosBodegas;
	public Boolean isPermisoOrdenProductosBodegas;
	
	
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
	
	public ProductosBodegasParameterReturnGeneral productosbodegasReturnGeneral;
	public ProductosBodegasParameterReturnGeneral productosbodegasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductosBodegas=false;
	public Boolean esParaAccionDesdeFormularioProductosBodegas=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductosBodegasSessionBeanAdditional productosbodegasSessionBeanAdditional=null;
	
	public ProductosBodegasSessionBeanAdditional getProductosBodegasSessionBeanAdditional() {
		return this.productosbodegasSessionBeanAdditional;
	}
	
	public void setProductosBodegasSessionBeanAdditional(ProductosBodegasSessionBeanAdditional productosbodegasSessionBeanAdditional) {
		try {
			this.productosbodegasSessionBeanAdditional=productosbodegasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductosBodegasBeanSwingJInternalFrameAdditional productosbodegasBeanSwingJInternalFrameAdditional=null;
	//public class ProductosBodegasBeanSwingJInternalFrame
	
	public ProductosBodegasBeanSwingJInternalFrameAdditional getProductosBodegasBeanSwingJInternalFrameAdditional() {
		return this.productosbodegasBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductosBodegasBeanSwingJInternalFrameAdditional(ProductosBodegasBeanSwingJInternalFrameAdditional productosbodegasBeanSwingJInternalFrameAdditional) {
		try {
			this.productosbodegasBeanSwingJInternalFrameAdditional=productosbodegasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductosBodegasLogic productosbodegasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductosBodegas productosbodegasBean;
	public ProductosBodegasConstantesFunciones productosbodegasConstantesFunciones;
	//public ProductosBodegasParameterReturnGeneral productosbodegasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	
	//PARAMETROS
	
	
	//public List<ProductosBodegas> productosbodegass;	
	//public List<ProductosBodegas> productosbodegassEliminados;
	//public List<ProductosBodegas> productosbodegassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductosBodegas=false;
	public Boolean isVisibilidadCeldaDuplicarProductosBodegas=true;
	public Boolean isVisibilidadCeldaCopiarProductosBodegas=true;
	public Boolean isVisibilidadCeldaVerFormProductosBodegas=true;
	public Boolean isVisibilidadCeldaOrdenProductosBodegas=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductosBodegas=false;
	public Boolean isVisibilidadCeldaModificarProductosBodegas=false;
	public Boolean isVisibilidadCeldaActualizarProductosBodegas=false;
	public Boolean isVisibilidadCeldaEliminarProductosBodegas=false;
	public Boolean isVisibilidadCeldaCancelarProductosBodegas=false;
	public Boolean isVisibilidadCeldaGuardarProductosBodegas=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductosBodegas=false;	
	
	
	public Boolean isVisibilidadBusquedaProductosBodegas=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoProductosBodegas() {
		return this.iIdNuevoProductosBodegas;
	}

	public void setiIdNuevoProductosBodegas(Long iIdNuevoProductosBodegas) {
		this.iIdNuevoProductosBodegas = iIdNuevoProductosBodegas;
	}
	
	public Long getidProductosBodegasActual() {
		return this.idProductosBodegasActual;
	}

	public void setidProductosBodegasActual(Long idProductosBodegasActual) {
		this.idProductosBodegasActual = idProductosBodegasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductosBodegas getproductosbodegas() {
		return this.productosbodegas;
	}

	public void setproductosbodegas(ProductosBodegas productosbodegas) {
		this.productosbodegas = productosbodegas;
	}
	
	public ProductosBodegas getproductosbodegasAux() {
		return this.productosbodegasAux;
	}

	public void setproductosbodegasAux(ProductosBodegas productosbodegasAux) {
		this.productosbodegasAux = productosbodegasAux;
	}				
	
	public ProductosBodegas getproductosbodegasAnterior() {
		return this.productosbodegasAnterior;
	}

	public void setproductosbodegasAnterior(ProductosBodegas productosbodegasAnterior) {
		this.productosbodegasAnterior = productosbodegasAnterior;
	}	
	
	public ProductosBodegas getproductosbodegasTotales() {
		return this.productosbodegasTotales;
	}

	public void setproductosbodegasTotales(ProductosBodegas productosbodegasTotales) {
		this.productosbodegasTotales = productosbodegasTotales;
	}	
	
	public ProductosBodegas getproductosbodegasBean() {
		return this.productosbodegasBean;
	}

	public void setproductosbodegasBean(ProductosBodegas productosbodegasBean) {
		this.productosbodegasBean = productosbodegasBean;
	}	
	
	public ProductosBodegasParameterReturnGeneral getproductosbodegasReturnGeneral() {
		return this.productosbodegasReturnGeneral;
	}

	public void setproductosbodegasReturnGeneral(ProductosBodegasParameterReturnGeneral productosbodegasReturnGeneral) {
		this.productosbodegasReturnGeneral = productosbodegasReturnGeneral;
	}	
	
	
	public Long id_bodegaBusquedaProductosBodegas=-1L;

	public Long getid_bodegaBusquedaProductosBodegas() {
		return this.id_bodegaBusquedaProductosBodegas;
	}

	public void setid_bodegaBusquedaProductosBodegas(Long id_bodegaBusquedaProductosBodegas) {
		this.id_bodegaBusquedaProductosBodegas = id_bodegaBusquedaProductosBodegas;
	}

;
	public Long id_lineaBusquedaProductosBodegas=-1L;

	public Long getid_lineaBusquedaProductosBodegas() {
		return this.id_lineaBusquedaProductosBodegas;
	}

	public void setid_lineaBusquedaProductosBodegas(Long id_lineaBusquedaProductosBodegas) {
		this.id_lineaBusquedaProductosBodegas = id_lineaBusquedaProductosBodegas;
	}

;
	public Long id_linea_grupoBusquedaProductosBodegas=-1L;

	public Long getid_linea_grupoBusquedaProductosBodegas() {
		return this.id_linea_grupoBusquedaProductosBodegas;
	}

	public void setid_linea_grupoBusquedaProductosBodegas(Long id_linea_grupoBusquedaProductosBodegas) {
		this.id_linea_grupoBusquedaProductosBodegas = id_linea_grupoBusquedaProductosBodegas;
	}

;
	public Long id_linea_categoriaBusquedaProductosBodegas=-1L;

	public Long getid_linea_categoriaBusquedaProductosBodegas() {
		return this.id_linea_categoriaBusquedaProductosBodegas;
	}

	public void setid_linea_categoriaBusquedaProductosBodegas(Long id_linea_categoriaBusquedaProductosBodegas) {
		this.id_linea_categoriaBusquedaProductosBodegas = id_linea_categoriaBusquedaProductosBodegas;
	}

;
	public Long id_linea_marcaBusquedaProductosBodegas=-1L;

	public Long getid_linea_marcaBusquedaProductosBodegas() {
		return this.id_linea_marcaBusquedaProductosBodegas;
	}

	public void setid_linea_marcaBusquedaProductosBodegas(Long id_linea_marcaBusquedaProductosBodegas) {
		this.id_linea_marcaBusquedaProductosBodegas = id_linea_marcaBusquedaProductosBodegas;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProductosBodegasLogic getProductosBodegasLogic()	{		
		return productosbodegasLogic;
	}

	public void setProductosBodegasLogic(ProductosBodegasLogic productosbodegasLogic) {
		this.productosbodegasLogic = productosbodegasLogic;
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
	
	public Boolean getIsEsNuevoProductosBodegas() {
		return isEsNuevoProductosBodegas;
	}

	public void setIsEsNuevoProductosBodegas(Boolean isEsNuevoProductosBodegas) {
		this.isEsNuevoProductosBodegas = isEsNuevoProductosBodegas;
	}

	public Boolean getEsParaAccionDesdeFormularioProductosBodegas() {
		return esParaAccionDesdeFormularioProductosBodegas;
	}
	
	public void setEsParaAccionDesdeFormularioProductosBodegas(Boolean esParaAccionDesdeFormularioProductosBodegas) {
		this.esParaAccionDesdeFormularioProductosBodegas = esParaAccionDesdeFormularioProductosBodegas;
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

			if(this.productosbodegasSessionBean==null) {
				this.productosbodegasSessionBean=new ProductosBodegasSessionBean();
			}

			if(!this.productosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(productosbodegasSessionBean.getlidEmpresaActual());
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

			if(this.productosbodegasSessionBean==null) {
				this.productosbodegasSessionBean=new ProductosBodegasSessionBean();
			}

			if(!this.productosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(productosbodegasSessionBean.getlidSucursalActual());
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

			if(this.productosbodegasSessionBean==null) {
				this.productosbodegasSessionBean=new ProductosBodegasSessionBean();
			}

			if(!this.productosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(productosbodegasSessionBean.getlidBodegaActual());
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

			if(this.productosbodegasSessionBean==null) {
				this.productosbodegasSessionBean=new ProductosBodegasSessionBean();
			}

			if(!this.productosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(productosbodegasSessionBean.getlidLineaActual());
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

			if(this.productosbodegasSessionBean==null) {
				this.productosbodegasSessionBean=new ProductosBodegasSessionBean();
			}

			if(!this.productosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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
					lineaLogic.getEntityWithConnection(productosbodegasSessionBean.getlidLineaGrupoActual());
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

			if(this.productosbodegasSessionBean==null) {
				this.productosbodegasSessionBean=new ProductosBodegasSessionBean();
			}

			if(!this.productosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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
					lineaLogic.getEntityWithConnection(productosbodegasSessionBean.getlidLineaCategoriaActual());
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

			if(this.productosbodegasSessionBean==null) {
				this.productosbodegasSessionBean=new ProductosBodegasSessionBean();
			}

			if(!this.productosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
					lineaLogic.getEntityWithConnection(productosbodegasSessionBean.getlidLineaMarcaActual());
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

					if(this.productosbodegas!=null) {
						this.productosbodegas.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
						this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_empresaProductosBodegas.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProductosBodegas.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
						if(this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_empresaProductosBodegas.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_empresaProductosBodegas.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProductosBodegasGenerico)throws Exception
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
				jComboBoxid_empresaProductosBodegasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProductosBodegasGenerico!=null && jComboBoxid_empresaProductosBodegasGenerico.getItemCount()>0) {
					jComboBoxid_empresaProductosBodegasGenerico.setSelectedIndex(0);
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

					if(this.productosbodegas!=null) {
						this.productosbodegas.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
						this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_sucursalProductosBodegas.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProductosBodegas.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
						if(this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_sucursalProductosBodegas.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_sucursalProductosBodegas.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProductosBodegasGenerico)throws Exception
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
				jComboBoxid_sucursalProductosBodegasGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProductosBodegasGenerico!=null && jComboBoxid_sucursalProductosBodegasGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProductosBodegasGenerico.setSelectedIndex(0);
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

					if(this.productosbodegas!=null) {
						this.productosbodegas.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
						this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_bodegaProductosBodegas.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaProductosBodegas.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
						if(this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_bodegaProductosBodegas.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_bodegaProductosBodegas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosBodegas") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaBusquedaProductosBodegasProductosBodegas!=null) {
						jComboBoxid_bodegaBusquedaProductosBodegasProductosBodegas.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaBusquedaProductosBodegasProductosBodegas!=null) {
							//jComboBoxid_bodegaBusquedaProductosBodegasProductosBodegas.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaBusquedaProductosBodegasProductosBodegas.getItemCount()>0) {
								jComboBoxid_bodegaBusquedaProductosBodegasProductosBodegas.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaProductosBodegasGenerico)throws Exception
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
				jComboBoxid_bodegaProductosBodegasGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaProductosBodegasGenerico!=null && jComboBoxid_bodegaProductosBodegasGenerico.getItemCount()>0) {
					jComboBoxid_bodegaProductosBodegasGenerico.setSelectedIndex(0);
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

					if(this.productosbodegas!=null) {
						this.productosbodegas.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
						this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_lineaProductosBodegas.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaProductosBodegas.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
						if(this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_lineaProductosBodegas.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_lineaProductosBodegas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosBodegas") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaProductosBodegasProductosBodegas!=null) {
						jComboBoxid_lineaBusquedaProductosBodegasProductosBodegas.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaProductosBodegasProductosBodegas!=null) {
							//jComboBoxid_lineaBusquedaProductosBodegasProductosBodegas.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaProductosBodegasProductosBodegas.getItemCount()>0) {
								jComboBoxid_lineaBusquedaProductosBodegasProductosBodegas.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaProductosBodegasGenerico)throws Exception
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
				jComboBoxid_lineaProductosBodegasGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaProductosBodegasGenerico!=null && jComboBoxid_lineaProductosBodegasGenerico.getItemCount()>0) {
					jComboBoxid_lineaProductosBodegasGenerico.setSelectedIndex(0);
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

					if(this.productosbodegas!=null) {
						this.productosbodegas.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
						this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_grupoProductosBodegas.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoProductosBodegas.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
						if(this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_grupoProductosBodegas.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_grupoProductosBodegas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosBodegas") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaProductosBodegasProductosBodegas!=null) {
						jComboBoxid_linea_grupoBusquedaProductosBodegasProductosBodegas.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaProductosBodegasProductosBodegas!=null) {
							//jComboBoxid_linea_grupoBusquedaProductosBodegasProductosBodegas.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaProductosBodegasProductosBodegas.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaProductosBodegasProductosBodegas.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoProductosBodegasGenerico)throws Exception
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
				jComboBoxid_linea_grupoProductosBodegasGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoProductosBodegasGenerico!=null && jComboBoxid_linea_grupoProductosBodegasGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoProductosBodegasGenerico.setSelectedIndex(0);
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

					if(this.productosbodegas!=null) {
						this.productosbodegas.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
						this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_categoriaProductosBodegas.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaProductosBodegas.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
						if(this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_categoriaProductosBodegas.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_categoriaProductosBodegas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosBodegas") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaProductosBodegasProductosBodegas!=null) {
						jComboBoxid_linea_categoriaBusquedaProductosBodegasProductosBodegas.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaProductosBodegasProductosBodegas!=null) {
							//jComboBoxid_linea_categoriaBusquedaProductosBodegasProductosBodegas.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaProductosBodegasProductosBodegas.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaProductosBodegasProductosBodegas.setSelectedIndex(0);
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
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaProductosBodegasGenerico)throws Exception
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
				jComboBoxid_linea_categoriaProductosBodegasGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaProductosBodegasGenerico!=null && jComboBoxid_linea_categoriaProductosBodegasGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaProductosBodegasGenerico.setSelectedIndex(0);
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

					if(this.productosbodegas!=null) {
						this.productosbodegas.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
						this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_marcaProductosBodegas.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaProductosBodegas.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
						if(this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_marcaProductosBodegas.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_marcaProductosBodegas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosBodegas") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaProductosBodegasProductosBodegas!=null) {
						jComboBoxid_linea_marcaBusquedaProductosBodegasProductosBodegas.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaProductosBodegasProductosBodegas!=null) {
							//jComboBoxid_linea_marcaBusquedaProductosBodegasProductosBodegas.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaProductosBodegasProductosBodegas.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaProductosBodegasProductosBodegas.setSelectedIndex(0);
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
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaProductosBodegasGenerico)throws Exception
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
				jComboBoxid_linea_marcaProductosBodegasGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaProductosBodegasGenerico!=null && jComboBoxid_linea_marcaProductosBodegasGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaProductosBodegasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProductosBodegas productosbodegas,JComboBox jComboBoxid_empresaProductosBodegasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProductosBodegasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_empresaProductosBodegas.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProductosBodegasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				productosbodegas.setid_empresa(empresaAux.getId());
				productosbodegas.setempresa_descripcion(ProductosBodegasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				productosbodegas.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProductosBodegas productosbodegas,JComboBox jComboBoxid_sucursalProductosBodegasGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProductosBodegasGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_sucursalProductosBodegas.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProductosBodegasGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				productosbodegas.setid_sucursal(sucursalAux.getId());
				productosbodegas.setsucursal_descripcion(ProductosBodegasConstantesFunciones.getSucursalDescripcion(sucursalAux));
				productosbodegas.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ProductosBodegas productosbodegas,JComboBox jComboBoxid_bodegaProductosBodegasGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaProductosBodegasGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_bodegaProductosBodegas.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaProductosBodegasGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				productosbodegas.setid_bodega(bodegaAux.getId());
				productosbodegas.setbodega_descripcion(ProductosBodegasConstantesFunciones.getBodegaDescripcion(bodegaAux));
				productosbodegas.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(ProductosBodegas productosbodegas,JComboBox jComboBoxid_lineaProductosBodegasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaProductosBodegasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_lineaProductosBodegas.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaProductosBodegasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				productosbodegas.setid_linea(lineaAux.getId());
				productosbodegas.setlinea_descripcion(ProductosBodegasConstantesFunciones.getLineaDescripcion(lineaAux));
				productosbodegas.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(ProductosBodegas productosbodegas,JComboBox jComboBoxid_linea_grupoProductosBodegasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoProductosBodegasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_grupoProductosBodegas.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoProductosBodegasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				productosbodegas.setid_linea_grupo(lineaAux.getId());
				productosbodegas.setlineagrupo_descripcion(ProductosBodegasConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				productosbodegas.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(ProductosBodegas productosbodegas,JComboBox jComboBoxid_linea_categoriaProductosBodegasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaProductosBodegasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_categoriaProductosBodegas.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaProductosBodegasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				productosbodegas.setid_linea_categoria(lineaAux.getId());
				productosbodegas.setlineacategoria_descripcion(ProductosBodegasConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				productosbodegas.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(ProductosBodegas productosbodegas,JComboBox jComboBoxid_linea_marcaProductosBodegasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaProductosBodegasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_marcaProductosBodegas.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaProductosBodegasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				productosbodegas.setid_linea_marca(lineaAux.getId());
				productosbodegas.setlineamarca_descripcion(ProductosBodegasConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				productosbodegas.setLineaMarca(lineaAux);			}
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

					if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosBodegas!=null) { 
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_empresaProductosBodegas.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_empresaProductosBodegas.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosBodegas!=null) { 
					}

					if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosBodegas!=null) { 
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_sucursalProductosBodegas.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_sucursalProductosBodegas.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosBodegas!=null) { 
					}

					if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosBodegas!=null) { 
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_bodegaProductosBodegas.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_bodegaProductosBodegas.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosBodegas!=null) { 
					}

					if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosBodegas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaBusquedaProductosBodegasProductosBodegas.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaBusquedaProductosBodegasProductosBodegas.addItem(bodega);
							}
						}

						if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosBodegas!=null) { 
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_lineaProductosBodegas.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_lineaProductosBodegas.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosBodegas!=null) { 
					}

					if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosBodegas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaProductosBodegasProductosBodegas.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaProductosBodegasProductosBodegas.addItem(linea);
							}
						}

						if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosBodegas!=null) { 
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_grupoProductosBodegas.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_grupoProductosBodegas.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosBodegas!=null) { 
					}

					if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosBodegas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaProductosBodegasProductosBodegas.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaProductosBodegasProductosBodegas.addItem(lineagrupo);
							}
						}

						if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosBodegas!=null) { 
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_categoriaProductosBodegas.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_categoriaProductosBodegas.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosBodegas!=null) { 
					}

					if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosBodegas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaProductosBodegasProductosBodegas.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaProductosBodegasProductosBodegas.addItem(lineacategoria);
							}
						}

						if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosBodegas!=null) { 
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_marcaProductosBodegas.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_marcaProductosBodegas.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosBodegas!=null) { 
					}

					if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosBodegas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaProductosBodegasProductosBodegas.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaProductosBodegasProductosBodegas.addItem(lineamarca);
							}
						}

						if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_empresaProductosBodegas.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_empresaProductosBodegas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_sucursalProductosBodegas.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_sucursalProductosBodegas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_bodegaProductosBodegas.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_bodegaProductosBodegas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaBusquedaProductosBodegasProductosBodegas.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaBusquedaProductosBodegasProductosBodegas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_lineaProductosBodegas.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_lineaProductosBodegas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaProductosBodegasProductosBodegas.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaProductosBodegasProductosBodegas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_grupoProductosBodegas.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_grupoProductosBodegas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaProductosBodegasProductosBodegas.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaProductosBodegasProductosBodegas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_categoriaProductosBodegas.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_categoriaProductosBodegas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaProductosBodegasProductosBodegas.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaProductosBodegasProductosBodegas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_marcaProductosBodegas.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_marcaProductosBodegas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaProductosBodegasProductosBodegas.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaProductosBodegasProductosBodegas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductosBodegas() throws Exception {
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
		
	public ProductosBodegasParameterReturnGeneral getProductosBodegasParameterGeneral() {
		return this.productosbodegasParameterGeneral;
	}
	
	public void setProductosBodegasParameterGeneral(ProductosBodegasParameterReturnGeneral productosbodegasParameterGeneral) {
		this.productosbodegasParameterGeneral = productosbodegasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductosBodegas() {
		return isPermisoTodoProductosBodegas;
	}

	public void setIsPermisoTodoProductosBodegas(Boolean isPermisoTodoProductosBodegas) {
		this.isPermisoTodoProductosBodegas = isPermisoTodoProductosBodegas;
	}

	public Boolean getIsPermisoNuevoProductosBodegas() {
		return isPermisoNuevoProductosBodegas;
	}

	public void setIsPermisoNuevoProductosBodegas(Boolean isPermisoNuevoProductosBodegas) {
		this.isPermisoNuevoProductosBodegas = isPermisoNuevoProductosBodegas;
	}

	public Boolean getIsPermisoActualizarProductosBodegas() {
		return isPermisoActualizarProductosBodegas;
	}

	public void setIsPermisoActualizarProductosBodegas(Boolean isPermisoActualizarProductosBodegas) {
		this.isPermisoActualizarProductosBodegas = isPermisoActualizarProductosBodegas;
	}

	public Boolean getIsPermisoEliminarProductosBodegas() {
		return isPermisoEliminarProductosBodegas;
	}

	public void setIsPermisoEliminarProductosBodegas(Boolean isPermisoEliminarProductosBodegas) {
		this.isPermisoEliminarProductosBodegas = isPermisoEliminarProductosBodegas;
	}

	public Boolean getIsPermisoGuardarCambiosProductosBodegas() {
		return isPermisoGuardarCambiosProductosBodegas;
	}

	public void setIsPermisoGuardarCambiosProductosBodegas(Boolean isPermisoGuardarCambiosProductosBodegas) {
		this.isPermisoGuardarCambiosProductosBodegas = isPermisoGuardarCambiosProductosBodegas;
	}
	
	public Boolean getIsPermisoConsultaProductosBodegas() {
		return isPermisoConsultaProductosBodegas;
	}

	public void setIsPermisoConsultaProductosBodegas(Boolean isPermisoConsultaProductosBodegas) {
		this.isPermisoConsultaProductosBodegas = isPermisoConsultaProductosBodegas;
	}

	public Boolean getIsPermisoBusquedaProductosBodegas() {
		return isPermisoBusquedaProductosBodegas;
	}

	public void setIsPermisoBusquedaProductosBodegas(Boolean isPermisoBusquedaProductosBodegas) {
		this.isPermisoBusquedaProductosBodegas = isPermisoBusquedaProductosBodegas;
	}

	public Boolean getIsPermisoReporteProductosBodegas() {
		return isPermisoReporteProductosBodegas;
	}

	public void setIsPermisoReporteProductosBodegas(Boolean isPermisoReporteProductosBodegas) {
		this.isPermisoReporteProductosBodegas = isPermisoReporteProductosBodegas;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductosBodegas() {
		return isPermisoPaginacionMedioProductosBodegas;
	}

	public void setIsPermisoPaginacionMedioProductosBodegas(Boolean isPermisoPaginacionMedioProductosBodegas) {
		this.isPermisoPaginacionMedioProductosBodegas = isPermisoPaginacionMedioProductosBodegas;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductosBodegas() {
		return isPermisoPaginacionTodoProductosBodegas;
	}

	public void setIsPermisoPaginacionTodoProductosBodegas(Boolean isPermisoPaginacionTodoProductosBodegas) {
		this.isPermisoPaginacionTodoProductosBodegas = isPermisoPaginacionTodoProductosBodegas;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductosBodegas() {
		return isPermisoPaginacionAltoProductosBodegas;
	}

	public void setIsPermisoPaginacionAltoProductosBodegas(Boolean isPermisoPaginacionAltoProductosBodegas) {
		this.isPermisoPaginacionAltoProductosBodegas = isPermisoPaginacionAltoProductosBodegas;
	}
	
	public Boolean getIsPermisoCopiarProductosBodegas() {
		return isPermisoCopiarProductosBodegas;
	}

	public void setIsPermisoCopiarProductosBodegas(Boolean isPermisoCopiarProductosBodegas) {
		this.isPermisoCopiarProductosBodegas = isPermisoCopiarProductosBodegas;
	}
	
	public Boolean getIsPermisoVerFormProductosBodegas() {
		return isPermisoVerFormProductosBodegas;
	}

	public void setIsPermisoVerFormProductosBodegas(Boolean isPermisoVerFormProductosBodegas) {
		this.isPermisoVerFormProductosBodegas = isPermisoVerFormProductosBodegas;
	}
	
	public Boolean getIsPermisoDuplicarProductosBodegas() {
		return isPermisoDuplicarProductosBodegas;
	}

	public void setIsPermisoDuplicarProductosBodegas(Boolean isPermisoDuplicarProductosBodegas) {
		this.isPermisoDuplicarProductosBodegas = isPermisoDuplicarProductosBodegas;
	}
	
	public Boolean getIsPermisoOrdenProductosBodegas() {
		return isPermisoOrdenProductosBodegas;
	}

	public void setIsPermisoOrdenProductosBodegas(Boolean isPermisoOrdenProductosBodegas) {
		this.isPermisoOrdenProductosBodegas = isPermisoOrdenProductosBodegas;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductosBodegas() {
		return isVisibilidadCeldaNuevoProductosBodegas;
	}

	public void setIsVisibilidadCeldaNuevoProductosBodegas(Boolean isVisibilidadCeldaNuevoProductosBodegas) {
		this.isVisibilidadCeldaNuevoProductosBodegas = isVisibilidadCeldaNuevoProductosBodegas;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductosBodegas() {
		return isVisibilidadCeldaDuplicarProductosBodegas;
	}

	public void setIsVisibilidadCeldaDuplicarProductosBodegas(Boolean isVisibilidadCeldaDuplicarProductosBodegas) {
		this.isVisibilidadCeldaDuplicarProductosBodegas = isVisibilidadCeldaDuplicarProductosBodegas;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductosBodegas() {
		return isVisibilidadCeldaCopiarProductosBodegas;
	}

	public void setIsVisibilidadCeldaCopiarProductosBodegas(Boolean isVisibilidadCeldaCopiarProductosBodegas) {
		this.isVisibilidadCeldaCopiarProductosBodegas = isVisibilidadCeldaCopiarProductosBodegas;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductosBodegas() {
		return isVisibilidadCeldaVerFormProductosBodegas;
	}

	public void setIsVisibilidadCeldaVerFormProductosBodegas(Boolean isVisibilidadCeldaVerFormProductosBodegas) {
		this.isVisibilidadCeldaVerFormProductosBodegas = isVisibilidadCeldaVerFormProductosBodegas;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductosBodegas() {
		return isVisibilidadCeldaOrdenProductosBodegas;
	}

	public void setIsVisibilidadCeldaOrdenProductosBodegas(Boolean isVisibilidadCeldaOrdenProductosBodegas) {
		this.isVisibilidadCeldaOrdenProductosBodegas = isVisibilidadCeldaOrdenProductosBodegas;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductosBodegas() {
		return isVisibilidadCeldaNuevoRelacionesProductosBodegas;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductosBodegas(Boolean isVisibilidadCeldaNuevoRelacionesProductosBodegas) {
		this.isVisibilidadCeldaNuevoRelacionesProductosBodegas = isVisibilidadCeldaNuevoRelacionesProductosBodegas;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductosBodegas() {
		return isVisibilidadCeldaModificarProductosBodegas;
	}

	public void setIsVisibilidadCeldaModificarProductosBodegas(Boolean isVisibilidadCeldaModificarProductosBodegas) {
		this.isVisibilidadCeldaModificarProductosBodegas = isVisibilidadCeldaModificarProductosBodegas;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductosBodegas() {
		return isVisibilidadCeldaActualizarProductosBodegas;
	}

	public void setIsVisibilidadCeldaActualizarProductosBodegas(Boolean isVisibilidadCeldaActualizarProductosBodegas) {
		this.isVisibilidadCeldaActualizarProductosBodegas = isVisibilidadCeldaActualizarProductosBodegas;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductosBodegas() {
		return isVisibilidadCeldaEliminarProductosBodegas;
	}

	public void setIsVisibilidadCeldaEliminarProductosBodegas(Boolean isVisibilidadCeldaEliminarProductosBodegas) {
		this.isVisibilidadCeldaEliminarProductosBodegas = isVisibilidadCeldaEliminarProductosBodegas;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductosBodegas() {
		return isVisibilidadCeldaCancelarProductosBodegas;
	}

	public void setIsVisibilidadCeldaCancelarProductosBodegas(Boolean isVisibilidadCeldaCancelarProductosBodegas) {
		this.isVisibilidadCeldaCancelarProductosBodegas = isVisibilidadCeldaCancelarProductosBodegas;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductosBodegas() {
		return isVisibilidadCeldaGuardarProductosBodegas;
	}

	public void setIsVisibilidadCeldaGuardarProductosBodegas(Boolean isVisibilidadCeldaGuardarProductosBodegas) {
		this.isVisibilidadCeldaGuardarProductosBodegas = isVisibilidadCeldaGuardarProductosBodegas;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductosBodegas() {
		return isVisibilidadCeldaGuardarCambiosProductosBodegas;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductosBodegas(Boolean isVisibilidadCeldaGuardarCambiosProductosBodegas) {
		this.isVisibilidadCeldaGuardarCambiosProductosBodegas = isVisibilidadCeldaGuardarCambiosProductosBodegas;
	}
		
	public ProductosBodegasSessionBean getproductosbodegasSessionBean() {
		return this.productosbodegasSessionBean;
	}
	
	public void setproductosbodegasSessionBean(ProductosBodegasSessionBean productosbodegasSessionBean) {
		this.productosbodegasSessionBean=productosbodegasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProductosBodegas() {
		return this.isVisibilidadBusquedaProductosBodegas;
	}

	public void setisVisibilidadBusquedaProductosBodegas(Boolean isVisibilidadBusquedaProductosBodegas) {
		this.isVisibilidadBusquedaProductosBodegas=isVisibilidadBusquedaProductosBodegas;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(ProductosBodegas productosbodegas)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(productosbodegas,null);
				this.setActualParaGuardarSucursalForeignKey(productosbodegas,null);
				this.setActualParaGuardarBodegaForeignKey(productosbodegas,null);
				this.setActualParaGuardarLineaForeignKey(productosbodegas,null);
				this.setActualParaGuardarLineaGrupoForeignKey(productosbodegas,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(productosbodegas,null);
				this.setActualParaGuardarLineaMarcaForeignKey(productosbodegas,null);
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
	
	public void bugActualizarReferenciaActual(ProductosBodegas productosbodegas,ProductosBodegas productosbodegasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductosBodegas(productosbodegas);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productosbodegasAux.setId(productosbodegas.getId());
		productosbodegasAux.setVersionRow(productosbodegas.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProductosBodegas productosbodegasLocal) throws Exception {
		
		if(this.productosbodegasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductosBodegas productosbodegasLocal) throws Exception {	
		if(this.productosbodegasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				productosbodegasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				productosbodegasLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				productosbodegasLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				productosbodegasLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				productosbodegasLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				productosbodegasLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				productosbodegasLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductosBodegasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productosbodegasValidator.getInvalidValues(this.productosbodegas);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductosBodegas productosbodegas,List<ProductosBodegas> productosbodegass) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProductosBodegas productosbodegas,List<ProductosBodegas> productosbodegass) throws Exception {
		try	{			
			ProductosBodegasConstantesFunciones.actualizarSelectedLista(productosbodegas,productosbodegass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductosBodegas> productosbodegassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productosbodegassLocal=this.productosbodegasLogic.getProductosBodegass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productosbodegassLocal=this.productosbodegass;
			}
			//ARCHITECTURE
		
			for(ProductosBodegas productosbodegasLocal:productosbodegassLocal) {
				if(this.permiteMantenimiento(productosbodegasLocal) && productosbodegasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductosBodegasConstantesFunciones.getProductosBodegasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductosBodegasConstantesFunciones.NOMBRESUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosBodegas.jLabelnombre_sucursalProductosBodegas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosBodegasConstantesFunciones.NOMBRELINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosBodegas.jLabelnombre_lineaProductosBodegas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosBodegasConstantesFunciones.NOMBRELINEAGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosBodegas.jLabelnombre_linea_grupoProductosBodegas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosBodegasConstantesFunciones.NOMBRELINEACATEGORIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosBodegas.jLabelnombre_linea_categoriaProductosBodegas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosBodegasConstantesFunciones.NOMBRELINEAMARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosBodegas.jLabelnombre_linea_marcaProductosBodegas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosBodegasConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosBodegas.jLabelcodigoProductosBodegas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosBodegasConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosBodegas.jLabelnombreProductosBodegas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosBodegasConstantesFunciones.NOMBREBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosBodegas.jLabelnombre_bodegaProductosBodegas,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosBodegas.jLabelnombre_sucursalProductosBodegas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosBodegas.jLabelnombre_lineaProductosBodegas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosBodegas.jLabelnombre_linea_grupoProductosBodegas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosBodegas.jLabelnombre_linea_categoriaProductosBodegas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosBodegas.jLabelnombre_linea_marcaProductosBodegas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosBodegas.jLabelcodigoProductosBodegas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosBodegas.jLabelnombreProductosBodegas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosBodegas.jLabelnombre_bodegaProductosBodegas,"");
		
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
		this.iIdNuevoProductosBodegas--;	
		
		
		this.productosbodegasAux=new ProductosBodegas();
		
		this.productosbodegasAux.setId(this.iIdNuevoProductosBodegas);
		this.productosbodegasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productosbodegasLogic.getProductosBodegass().add(this.productosbodegasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productosbodegass.add(this.productosbodegasAux);
		}
		//ARCHITECTURE
		
		this.productosbodegas=this.productosbodegasAux;
		
		if(ProductosBodegasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductosBodegas(this.productosbodegas);
			this.setVariablesObjetoActualToFormularioForeignKeyProductosBodegas(this.productosbodegas);
		}
				
		//this.setDefaultControlesProductosBodegas();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductosBodegas();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductosBodegas();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductosBodegas();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductosBodegas(this.productosbodegasBean,this.productosbodegas,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductosBodegas(this.productosbodegasReturnGeneral,this.productosbodegasBean,false);
		
		if(this.productosbodegasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductosBodegas(this.productosbodegasReturnGeneral.getProductosBodegas());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductosBodegas(this.productosbodegasReturnGeneral.getProductosBodegas());
		}
		
		if(this.productosbodegasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductosBodegas(this.productosbodegasReturnGeneral.getProductosBodegas(),classes);//this.productosbodegasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductosBodegas(this.productosbodegas,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductosBodegas();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductosBodegas();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductosBodegasBeanSwingJInternalFrameAdditional.RecargarFormProductosBodegas(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductosBodegas(false);
						
			if(productosbodegasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductosBodegas();
			}
			
			this.actualizarVisualTableDatosProductosBodegas();
			
			this.jTableDatosProductosBodegas.setRowSelectionInterval(this.getIndiceNuevoProductosBodegas(), this.getIndiceNuevoProductosBodegas());
			
			this.seleccionarFilaTablaProductosBodegasActual();
						
			this.actualizarEstadoCeldasBotonesProductosBodegas("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductosBodegas(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_sucursalProductosBodegas.setEnabled(isHabilitar && this.productosbodegasConstantesFunciones.activarnombre_sucursalProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_lineaProductosBodegas.setEnabled(isHabilitar && this.productosbodegasConstantesFunciones.activarnombre_lineaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_grupoProductosBodegas.setEnabled(isHabilitar && this.productosbodegasConstantesFunciones.activarnombre_linea_grupoProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_categoriaProductosBodegas.setEnabled(isHabilitar && this.productosbodegasConstantesFunciones.activarnombre_linea_categoriaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_marcaProductosBodegas.setEnabled(isHabilitar && this.productosbodegasConstantesFunciones.activarnombre_linea_marcaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jTextFieldcodigoProductosBodegas.setEnabled(isHabilitar && this.productosbodegasConstantesFunciones.activarcodigoProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombreProductosBodegas.setEnabled(isHabilitar && this.productosbodegasConstantesFunciones.activarnombreProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_bodegaProductosBodegas.setEnabled(isHabilitar && this.productosbodegasConstantesFunciones.activarnombre_bodegaProductosBodegas);	
		//
		this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_empresaProductosBodegas.setEnabled(isHabilitar && this.productosbodegasConstantesFunciones.activarid_empresaProductosBodegas);//
		this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_sucursalProductosBodegas.setEnabled(isHabilitar && this.productosbodegasConstantesFunciones.activarid_sucursalProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_bodegaProductosBodegas.setEnabled(isHabilitar && this.productosbodegasConstantesFunciones.activarid_bodegaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_lineaProductosBodegas.setEnabled(isHabilitar && this.productosbodegasConstantesFunciones.activarid_lineaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_grupoProductosBodegas.setEnabled(isHabilitar && this.productosbodegasConstantesFunciones.activarid_linea_grupoProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_categoriaProductosBodegas.setEnabled(isHabilitar && this.productosbodegasConstantesFunciones.activarid_linea_categoriaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_marcaProductosBodegas.setEnabled(isHabilitar && this.productosbodegasConstantesFunciones.activarid_linea_marcaProductosBodegas);
	};
	
	public void setDefaultControlesProductosBodegas() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductosBodegas(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productosbodegasSessionBean.setConGuardarRelaciones(true);			
			this.productosbodegasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductosBodegas.jTabbedPaneRelacionesProductosBodegas.setVisible(true);
			
					
		} else {
			//this.productosbodegasSessionBean.setConGuardarRelaciones(false);			
			this.productosbodegasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductosBodegas.jTabbedPaneRelacionesProductosBodegas.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductosBodegas() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosBodegas productosbodegasAux:this.productosbodegasLogic.getProductosBodegass()) {
				if(productosbodegasAux.getId().equals(this.iIdNuevoProductosBodegas)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosBodegas productosbodegasAux:this.productosbodegass) {
				if(productosbodegasAux.getId().equals(this.iIdNuevoProductosBodegas)) {
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
	
	public int getIndiceActualProductosBodegas(ProductosBodegas productosbodegas,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosBodegas productosbodegasAux:this.productosbodegasLogic.getProductosBodegass()) {
				if(productosbodegasAux.getId().equals(productosbodegas.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosBodegas productosbodegasAux:this.productosbodegass) {
				if(productosbodegasAux.getId().equals(productosbodegas.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductosBodegas(ProductosBodegas productosbodegasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosBodegas productosbodegasAux:this.productosbodegasLogic.getProductosBodegass()) {
				if(productosbodegasAux.getProductosBodegasOriginal().getId().equals(productosbodegasOriginal.getId())) {
					existe=true;
					productosbodegasOriginal.setId(productosbodegasAux.getId());
					productosbodegasOriginal.setVersionRow(productosbodegasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosBodegas productosbodegasAux:this.productosbodegass) {
				if(productosbodegasAux.getProductosBodegasOriginal().getId().equals(productosbodegasOriginal.getId())) {
					existe=true;
					productosbodegasOriginal.setId(productosbodegasAux.getId());
					productosbodegasOriginal.setVersionRow(productosbodegasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductosBodegas(Boolean esParaCancelar) throws Exception {
		productosbodegassAux=new ArrayList<ProductosBodegas>();
		productosbodegasAux=new ProductosBodegas();
		
		if(!this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductosBodegas productosbodegasAux:this.productosbodegasLogic.getProductosBodegass()) {
					if(productosbodegasAux.getId()<0) {
						productosbodegassAux.add(productosbodegasAux);
					}		
				}
				this.iIdNuevoProductosBodegas=0L;
				this.productosbodegasLogic.getProductosBodegass().removeAll(productosbodegassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosBodegas productosbodegasAux:this.productosbodegass) {
					if(productosbodegasAux.getId()<0) {
						productosbodegassAux.add(productosbodegasAux);
					}		
				}
				this.iIdNuevoProductosBodegas=0L;
				this.productosbodegass.removeAll(productosbodegassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductosBodegas 
					&& this.productosbodegasLogic.getProductosBodegass().size()>0
					) {
					productosbodegasAux=this.productosbodegasLogic.getProductosBodegass().get(this.productosbodegasLogic.getProductosBodegass().size() - 1);
				
					if(productosbodegasAux.getId()<0) {
						this.productosbodegasLogic.getProductosBodegass().remove(productosbodegasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductosBodegas && this.productosbodegass.size()>0) {
					productosbodegasAux=this.productosbodegass.get(this.productosbodegass.size() - 1);
				
					if(productosbodegasAux.getId()<0) {
						this.productosbodegass.remove(productosbodegasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductosBodegas(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productosbodegas.getId()<0) {
				this.productosbodegasLogic.getProductosBodegass().remove(this.productosbodegas);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productosbodegas.getId()<0) {
				this.productosbodegass.remove(this.productosbodegas);
			}
		}			
	}
	
	public void setEstadosInicialesProductosBodegas(List<ProductosBodegas> productosbodegassAux) throws Exception {
		ProductosBodegasConstantesFunciones.setEstadosInicialesProductosBodegas(productosbodegassAux);
	}
	
	public void setEstadosInicialesProductosBodegas(ProductosBodegas productosbodegasAux) throws Exception {
		ProductosBodegasConstantesFunciones.setEstadosInicialesProductosBodegas(productosbodegasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductosBodegasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductosBodegas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductosBodegasActual()) {
				if(!this.isEsNuevoProductosBodegas) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductosBodegas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductosBodegas=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductosBodegasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Productos Bodegas ?", "MANTENIMIENTO DE Productos Bodegas", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductosBodegas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductosBodegas productosbodegas) throws Exception {
		ProductosBodegasConstantesFunciones.seleccionarAsignar(this.productosbodegas,productosbodegas);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductosBodegas=this.isPermisoActualizarOriginalProductosBodegas;
			
			
			this.seleccionarAsignar(productosbodegas);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProductosBodegas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productosbodegasSessionBean.setsFuncionBusquedaRapida(this.productosbodegasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProductosBodegas) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductosBodegas(esParaCancelar);				
				this.cancelarNuevoProductosBodegas(esParaCancelar);								
			}
			
			this.productosbodegas=new ProductosBodegas();
			
			this.inicializarProductosBodegas();
			
			this.actualizarEstadoCeldasBotonesProductosBodegas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductosBodegas() throws Exception {
		try {
			ProductosBodegasConstantesFunciones.inicializarProductosBodegas(this.productosbodegas);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productosbodegasLogic.getProductosBodegass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductosBodegass(String sAccionBusqueda,List<ProductosBodegas> productosbodegassParaReportes) throws Exception {
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
					sPathReporteFinal="ProductosBodegas"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductosBodegasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductosBodegasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductosBodegas"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Productos Bodegases");		
		parameters.put("busquedapor", ProductosBodegasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductosBodegas=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductosBodegasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductosBodegasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductosBodegas=new JRBeanArrayDataSource(ProductosBodegasJInternalFrame.TraerProductosBodegasBeans(productosbodegassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductosBodegas);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductosBodegasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductosBodegasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductosBodegasBean.TraerProductosBodegasBeans(productosbodegassParaReportes).toArray()));
							
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
				this.generarExcelReporteProductosBodegass(sAccionBusqueda,sTipoArchivoReporte,productosbodegassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductosBodegass(sAccionBusqueda,sTipoArchivoReporte,productosbodegassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductosBodegasActionPerformed(null);
					//this.generarExcelReporteProductosBodegass(sAccionBusqueda,sTipoArchivoReporte,productosbodegassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductosBodegass(sAccionBusqueda,sTipoArchivoReporte,productosbodegassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductosBodegass(sAccionBusqueda,sTipoArchivoReporte,productosbodegassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductosBodegass(sAccionBusqueda,sTipoArchivoReporte,productosbodegassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductosBodegass(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductosBodegas> productosbodegassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosbodegas";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductosBodegass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductosBodegas("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductosBodegas productosbodegas : productosbodegassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductosBodegasConstantesFunciones.generarExcelReporteDataProductosBodegas("NORMAL",row,workbook,productosbodegas,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosbodegasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Bodegas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductosBodegas(String sTipo,Row row,Workbook workbook) {
		
		ProductosBodegasConstantesFunciones.generarExcelReporteHeaderProductosBodegas(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductosBodegass(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductosBodegas> productosbodegassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosbodegas_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductosBodegass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductosBodegas productosbodegas : productosbodegassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductosBodegasConstantesFunciones.getProductosBodegasDescripcion(productosbodegas));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosBodegasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosbodegas.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosBodegasConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosbodegas.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosBodegasConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosbodegas.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosBodegasConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosbodegas.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosBodegasConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosbodegas.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosBodegasConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosbodegas.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosBodegasConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosbodegas.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosBodegasConstantesFunciones.LABEL_NOMBRESUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_NOMBRESUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosbodegas.getnombre_sucursal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosbodegas.getnombre_linea());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosbodegas.getnombre_linea_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosbodegas.getnombre_linea_categoria());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosbodegas.getnombre_linea_marca());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosBodegasConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosbodegas.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosBodegasConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosbodegas.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosBodegasConstantesFunciones.LABEL_NOMBREBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_NOMBREBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosbodegas.getnombre_bodega());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosbodegasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Bodegas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductosBodegass(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductosBodegas> productosbodegassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductosBodegas> productosbodegassRespaldo=null;
		
		classes=ProductosBodegasConstantesFunciones.getClassesRelationshipsOfProductosBodegas(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productosbodegasLogic.setDatosCliente(this.datosCliente);
		this.productosbodegasLogic.setDatosDeep(this.datosDeep);
		this.productosbodegasLogic.setIsConDeep(true);
		
		productosbodegassRespaldo=this.productosbodegasLogic.getProductosBodegass();
		
		this.productosbodegasLogic.setProductosBodegass(productosbodegassParaReportes);	
		this.productosbodegasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productosbodegassParaReportes=this.productosbodegasLogic.getProductosBodegass();
		this.productosbodegasLogic.setProductosBodegass(productosbodegassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosbodegas_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductosBodegass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductosBodegas("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductosBodegas productosbodegas : productosbodegassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductosBodegas("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductosBodegasConstantesFunciones.generarExcelReporteDataProductosBodegas("NORMAL",row,workbook,productosbodegas,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductosBodegasConstantesFunciones.getProductosBodegasDescripcion(productosbodegas));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosbodegasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Bodegas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductosBodegas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosBodegas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductosBodegas.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosBodegas.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductosBodegas() throws Exception {		
		this.startProcessProductosBodegas(true);
	}
	
	public void startProcessProductosBodegas(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductosBodegas ,this.jPanelParametrosReportesProductosBodegas, this.jScrollPanelDatosProductosBodegas,this.jPanelPaginacionProductosBodegas, this.jScrollPanelDatosEdicionProductosBodegas, this.jPanelAccionesProductosBodegas,this.jPanelAccionesFormularioProductosBodegas,this.jmenuBarProductosBodegas,this.jmenuBarDetalleProductosBodegas,this.jTtoolBarProductosBodegas,this.jTtoolBarDetalleProductosBodegas);		
		
		final JTabbedPane jTabbedPaneBusquedasProductosBodegas=this.jTabbedPaneBusquedasProductosBodegas; 
		
		final JPanel jPanelParametrosReportesProductosBodegas=this.jPanelParametrosReportesProductosBodegas;
		//final JScrollPane jScrollPanelDatosProductosBodegas=this.jScrollPanelDatosProductosBodegas;
		final JTable jTableDatosProductosBodegas=this.jTableDatosProductosBodegas;		
		final JPanel jPanelPaginacionProductosBodegas=this.jPanelPaginacionProductosBodegas;
		//final JScrollPane jScrollPanelDatosEdicionProductosBodegas=this.jScrollPanelDatosEdicionProductosBodegas;
		final JPanel jPanelAccionesProductosBodegas=this.jPanelAccionesProductosBodegas;
		
		JPanel jPanelCamposAuxiliarProductosBodegas=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductosBodegas=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
			jPanelCamposAuxiliarProductosBodegas=this.jInternalFrameDetalleFormProductosBodegas.jPanelCamposProductosBodegas;
			jPanelAccionesFormularioAuxiliarProductosBodegas=this.jInternalFrameDetalleFormProductosBodegas.jPanelAccionesFormularioProductosBodegas;
		}
		
		final JPanel jPanelCamposProductosBodegas=jPanelCamposAuxiliarProductosBodegas;
		final JPanel jPanelAccionesFormularioProductosBodegas=jPanelAccionesFormularioAuxiliarProductosBodegas;
		
		
		final JMenuBar jmenuBarProductosBodegas=this.jmenuBarProductosBodegas;
		final JToolBar jTtoolBarProductosBodegas=this.jTtoolBarProductosBodegas;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductosBodegas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductosBodegas=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
			jmenuBarDetalleAuxiliarProductosBodegas=this.jInternalFrameDetalleFormProductosBodegas.jmenuBarDetalleProductosBodegas;
			jTtoolBarDetalleAuxiliarProductosBodegas=this.jInternalFrameDetalleFormProductosBodegas.jTtoolBarDetalleProductosBodegas;
		}
		
		final JMenuBar jmenuBarDetalleProductosBodegas=jmenuBarDetalleAuxiliarProductosBodegas;
		final JToolBar jTtoolBarDetalleProductosBodegas=jTtoolBarDetalleAuxiliarProductosBodegas;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductosBodegas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductosBodegas;
			processRunnable.jTableDatos=jTableDatosProductosBodegas;
			processRunnable.jPanelCampos=jPanelCamposProductosBodegas;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductosBodegas;
			processRunnable.jPanelAcciones=jPanelAccionesProductosBodegas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductosBodegas;
			
			
			processRunnable.jmenuBar=jmenuBarProductosBodegas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductosBodegas;
			processRunnable.jTtoolBar=jTtoolBarProductosBodegas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductosBodegas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductosBodegas ,jPanelParametrosReportesProductosBodegas,jTableDatosProductosBodegas, /*jScrollPanelDatosProductosBodegas,*/jPanelCamposProductosBodegas,jPanelPaginacionProductosBodegas, /*jScrollPanelDatosEdicionProductosBodegas,*/ jPanelAccionesProductosBodegas,jPanelAccionesFormularioProductosBodegas,jmenuBarProductosBodegas,jmenuBarDetalleProductosBodegas,jTtoolBarProductosBodegas,jTtoolBarDetalleProductosBodegas);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductosBodegas ,jPanelParametrosReportesProductosBodegas, jScrollPanelDatosProductosBodegas,jPanelPaginacionProductosBodegas, jScrollPanelDatosEdicionProductosBodegas, jPanelAccionesProductosBodegas,jPanelAccionesFormularioProductosBodegas,jmenuBarProductosBodegas,jmenuBarDetalleProductosBodegas,jTtoolBarProductosBodegas,jTtoolBarDetalleProductosBodegas);
						
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
	
	public void finishProcessProductosBodegas() {// throws Exception 
		this.finishProcessProductosBodegas(true);
	}
	
	public void finishProcessProductosBodegas(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductosBodegas ,this.jPanelParametrosReportesProductosBodegas, this.jScrollPanelDatosProductosBodegas,this.jPanelPaginacionProductosBodegas, this.jScrollPanelDatosEdicionProductosBodegas, this.jPanelAccionesProductosBodegas,this.jPanelAccionesFormularioProductosBodegas,this.jmenuBarProductosBodegas,this.jmenuBarDetalleProductosBodegas,this.jTtoolBarProductosBodegas,this.jTtoolBarDetalleProductosBodegas);		
		
		final JTabbedPane jTabbedPaneBusquedasProductosBodegas=this.jTabbedPaneBusquedasProductosBodegas; 
		
		final JPanel jPanelParametrosReportesProductosBodegas=this.jPanelParametrosReportesProductosBodegas;
		//final JScrollPane jScrollPanelDatosProductosBodegas=this.jScrollPanelDatosProductosBodegas;
		final JTable jTableDatosProductosBodegas=this.jTableDatosProductosBodegas;		
		final JPanel jPanelPaginacionProductosBodegas=this.jPanelPaginacionProductosBodegas;
		//final JScrollPane jScrollPanelDatosEdicionProductosBodegas=this.jScrollPanelDatosEdicionProductosBodegas;
		final JPanel jPanelAccionesProductosBodegas=this.jPanelAccionesProductosBodegas;
		
		JPanel jPanelCamposAuxiliarProductosBodegas=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductosBodegas=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
			jPanelCamposAuxiliarProductosBodegas=this.jInternalFrameDetalleFormProductosBodegas.jPanelCamposProductosBodegas;
			jPanelAccionesFormularioAuxiliarProductosBodegas=this.jInternalFrameDetalleFormProductosBodegas.jPanelAccionesFormularioProductosBodegas;
		}
		
		final JPanel jPanelCamposProductosBodegas=jPanelCamposAuxiliarProductosBodegas;
		final JPanel jPanelAccionesFormularioProductosBodegas=jPanelAccionesFormularioAuxiliarProductosBodegas;
		
		
		final JMenuBar jmenuBarProductosBodegas=this.jmenuBarProductosBodegas;		
		final JToolBar jTtoolBarProductosBodegas=this.jTtoolBarProductosBodegas;
				
		JMenuBar jmenuBarDetalleAuxiliarProductosBodegas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductosBodegas=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
			jmenuBarDetalleAuxiliarProductosBodegas=this.jInternalFrameDetalleFormProductosBodegas.jmenuBarDetalleProductosBodegas;
			jTtoolBarDetalleAuxiliarProductosBodegas=this.jInternalFrameDetalleFormProductosBodegas.jTtoolBarDetalleProductosBodegas;		
		}
		
		final JMenuBar jmenuBarDetalleProductosBodegas=jmenuBarDetalleAuxiliarProductosBodegas;
		final JToolBar jTtoolBarDetalleProductosBodegas=jTtoolBarDetalleAuxiliarProductosBodegas;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductosBodegas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductosBodegas;
			processRunnable.jTableDatos=jTableDatosProductosBodegas;
			processRunnable.jPanelCampos=jPanelCamposProductosBodegas;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductosBodegas;
			processRunnable.jPanelAcciones=jPanelAccionesProductosBodegas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductosBodegas;
			
			
			processRunnable.jmenuBar=jmenuBarProductosBodegas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductosBodegas;
			processRunnable.jTtoolBar=jTtoolBarProductosBodegas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductosBodegas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductosBodegas ,jPanelParametrosReportesProductosBodegas, jTableDatosProductosBodegas,/*jScrollPanelDatosProductosBodegas,*/jPanelCamposProductosBodegas,jPanelPaginacionProductosBodegas, /*jScrollPanelDatosEdicionProductosBodegas,*/ jPanelAccionesProductosBodegas,jPanelAccionesFormularioProductosBodegas,jmenuBarProductosBodegas,jmenuBarDetalleProductosBodegas,jTtoolBarProductosBodegas,jTtoolBarDetalleProductosBodegas));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductosBodegas(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductosBodegas(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductosBodegas(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductosBodegas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductosBodegas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductosBodegas,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductosBodegas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductosBodegas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductosBodegas,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productosbodegasConstantesFunciones.getsFinalQueryProductosBodegas();
		String  finalQueryPaginacionTodos=this.productosbodegasConstantesFunciones.getsFinalQueryProductosBodegas();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductosBodegasConstantesFunciones.getArrayColumnasGlobalesNoProductosBodegas(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductosBodegasConstantesFunciones.getArrayColumnasGlobalesProductosBodegas(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductosBodegasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productosbodegassEliminados= new ArrayList<ProductosBodegas>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductosBodegas();
		
				///*ProductosBodegasSessionBean*/this.productosbodegasSessionBean=new ProductosBodegasSessionBean();
			
			if(this.productosbodegasSessionBean==null) {
				this.productosbodegasSessionBean=new ProductosBodegasSessionBean();
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
					this.iNumeroPaginacion=ProductosBodegasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductosBodegasConstantesFunciones.getClassesForeignKeysOfProductosBodegas(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productosbodegas."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productosbodegassAux= new ArrayList<ProductosBodegas>();
			
				
			productosbodegasLogic.setDatosCliente(this.datosCliente);
			productosbodegasLogic.setDatosDeep(this.datosDeep);
			productosbodegasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProductosBodegas")) {
				this.sDetalleReporte=ProductosBodegasConstantesFunciones.getDetalleIndiceBusquedaProductosBodegas(id_bodegaBusquedaProductosBodegas,id_lineaBusquedaProductosBodegas,id_linea_grupoBusquedaProductosBodegas,id_linea_categoriaBusquedaProductosBodegas,id_linea_marcaBusquedaProductosBodegas);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productosbodegasLogic.getProductosBodegassBusquedaProductosBodegas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaProductosBodegas,id_lineaBusquedaProductosBodegas,id_linea_grupoBusquedaProductosBodegas,id_linea_categoriaBusquedaProductosBodegas,id_linea_marcaBusquedaProductosBodegas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductosBodegasConstantesFunciones.getDetalleIndiceBusquedaProductosBodegas(id_bodegaBusquedaProductosBodegas,id_lineaBusquedaProductosBodegas,id_linea_grupoBusquedaProductosBodegas,id_linea_categoriaBusquedaProductosBodegas,id_linea_marcaBusquedaProductosBodegas);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductosBodegasConstantesFunciones.getDetalleIndiceBusquedaProductosBodegas(id_bodegaBusquedaProductosBodegas,id_lineaBusquedaProductosBodegas,id_linea_grupoBusquedaProductosBodegas,id_linea_categoriaBusquedaProductosBodegas,id_linea_marcaBusquedaProductosBodegas);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productosbodegasLogic.getProductosBodegass()==null||productosbodegasLogic.getProductosBodegass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productosbodegass==null|| productosbodegass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productosbodegassAux=new ArrayList<ProductosBodegas>();
						productosbodegassAux.addAll(productosbodegasLogic.getProductosBodegass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productosbodegassAux=new ArrayList<ProductosBodegas>();
							productosbodegassAux.addAll(productosbodegass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productosbodegasLogic.getProductosBodegassBusquedaProductosBodegas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaProductosBodegas,id_lineaBusquedaProductosBodegas,id_linea_grupoBusquedaProductosBodegas,id_linea_categoriaBusquedaProductosBodegas,id_linea_marcaBusquedaProductosBodegas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductosBodegasConstantesFunciones.getDetalleIndiceBusquedaProductosBodegas(id_bodegaBusquedaProductosBodegas,id_lineaBusquedaProductosBodegas,id_linea_grupoBusquedaProductosBodegas,id_linea_categoriaBusquedaProductosBodegas,id_linea_marcaBusquedaProductosBodegas);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductosBodegasConstantesFunciones.getDetalleIndiceBusquedaProductosBodegas(id_bodegaBusquedaProductosBodegas,id_lineaBusquedaProductosBodegas,id_linea_grupoBusquedaProductosBodegas,id_linea_categoriaBusquedaProductosBodegas,id_linea_marcaBusquedaProductosBodegas);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductosBodegass("BusquedaProductosBodegas",productosbodegasLogic.getProductosBodegass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductosBodegass("BusquedaProductosBodegas",productosbodegass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productosbodegasLogic.setProductosBodegass(new ArrayList<ProductosBodegas>());
						productosbodegasLogic.getProductosBodegass().addAll(productosbodegassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productosbodegass=new ArrayList<ProductosBodegas>();
							productosbodegass.addAll(productosbodegassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductosBodegas();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductosBodegas();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productosbodegasLogic.getProductosBodegass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productosbodegass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productosbodegasLogic.getProductosBodegass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productosbodegass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductosBodegas productosbodegas) {
		Boolean permite=true;
		
		if(this.productosbodegas.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductosBodegasConstantesFunciones.getOrderByListaProductosBodegas();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductosBodegasConstantesFunciones.getOrderByListaProductosBodegas();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosBodegas productosbodegas:productosbodegasLogic.getProductosBodegass()) {
				if(productosbodegas.getsType().equals(Constantes2.S_TOTALES)) {
					productosbodegasTotales=productosbodegas;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosBodegas productosbodegas:this.productosbodegass) {
				if(productosbodegas.getsType().equals(Constantes2.S_TOTALES)) {
					productosbodegasTotales=productosbodegas;
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
			this.productosbodegasAux=new ProductosBodegas();
			this.productosbodegasAux.setsType(Constantes2.S_TOTALES);
			this.productosbodegasAux.setIsNew(false);
			this.productosbodegasAux.setIsChanged(false);
			this.productosbodegasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProductosBodegasConstantesFunciones.TotalizarValoresFilaProductosBodegas(this.productosbodegasLogic.getProductosBodegass(),this.productosbodegasAux);
				
				//this.productosbodegasLogic.getProductosBodegass().add(this.productosbodegasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductosBodegasConstantesFunciones.TotalizarValoresFilaProductosBodegas(this.productosbodegass,this.productosbodegasAux);
				
				this.productosbodegass.add(this.productosbodegasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productosbodegasTotales=new ProductosBodegas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productosbodegasLogic.getProductosBodegass().remove(productosbodegasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productosbodegass.remove(productosbodegasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productosbodegasTotales=new ProductosBodegas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosBodegas productosbodegas:productosbodegasLogic.getProductosBodegass()) {
				if(productosbodegas.getsType().equals(Constantes2.S_TOTALES)) {
					productosbodegasTotales=productosbodegas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductosBodegasConstantesFunciones.TotalizarValoresFilaProductosBodegas(this.productosbodegasLogic.getProductosBodegass(),productosbodegasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosBodegas productosbodegas:this.productosbodegass) {
				if(productosbodegas.getsType().equals(Constantes2.S_TOTALES)) {
					productosbodegasTotales=productosbodegas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductosBodegasConstantesFunciones.TotalizarValoresFilaProductosBodegas(this.productosbodegass,productosbodegasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductosBodegassBusquedaProductosBodegas()throws Exception {
		try {
			sAccionBusqueda="BusquedaProductosBodegas";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosBodegassFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosBodegassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosBodegassFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosBodegassFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosBodegassFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosBodegassFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosBodegassFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductosBodegassBusquedaProductosBodegas(String sFinalQuery,Long id_bodega,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosbodegasLogic.getProductosBodegassBusquedaProductosBodegas(sFinalQuery,this.pagination,id_bodega,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosBodegassFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosbodegasLogic.getProductosBodegassFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosBodegassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosbodegasLogic.getProductosBodegassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosBodegassFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosbodegasLogic.getProductosBodegassFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosBodegassFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosbodegasLogic.getProductosBodegassFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosBodegassFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosbodegasLogic.getProductosBodegassFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosBodegassFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosbodegasLogic.getProductosBodegassFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosBodegassFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosbodegasLogic.getProductosBodegassFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosProductosBodegas() {
		this.isPermisoTodoProductosBodegas=false;
		this.isPermisoNuevoProductosBodegas=false;
		this.isPermisoActualizarProductosBodegas=false;
		this.isPermisoActualizarOriginalProductosBodegas=false;
		this.isPermisoEliminarProductosBodegas=false;
		this.isPermisoGuardarCambiosProductosBodegas=false;
		this.isPermisoConsultaProductosBodegas=true;
		this.isPermisoBusquedaProductosBodegas=true;
		this.isPermisoReporteProductosBodegas=true;
		this.isPermisoOrdenProductosBodegas=false;		
		this.isPermisoPaginacionMedioProductosBodegas=false;		
		this.isPermisoPaginacionAltoProductosBodegas=false;		
		this.isPermisoPaginacionTodoProductosBodegas=false;		
		this.isPermisoCopiarProductosBodegas=false;		
		this.isPermisoVerFormProductosBodegas=false;		
		this.isPermisoDuplicarProductosBodegas=false;
		this.isPermisoOrdenProductosBodegas=false;
	}
	
	public void setPermisosUsuarioProductosBodegas(Boolean isPermiso) {
		this.isPermisoTodoProductosBodegas=isPermiso;
		this.isPermisoNuevoProductosBodegas=isPermiso;
		this.isPermisoActualizarProductosBodegas=isPermiso;
		this.isPermisoActualizarOriginalProductosBodegas=isPermiso;
		this.isPermisoEliminarProductosBodegas=isPermiso;
		this.isPermisoGuardarCambiosProductosBodegas=isPermiso;
		this.isPermisoConsultaProductosBodegas=isPermiso;
		this.isPermisoBusquedaProductosBodegas=isPermiso;
		this.isPermisoReporteProductosBodegas=isPermiso;
		this.isPermisoOrdenProductosBodegas=isPermiso;		
		this.isPermisoPaginacionMedioProductosBodegas=isPermiso;		
		this.isPermisoPaginacionAltoProductosBodegas=isPermiso;		
		this.isPermisoPaginacionTodoProductosBodegas=isPermiso;		
		this.isPermisoCopiarProductosBodegas=isPermiso;		
		this.isPermisoVerFormProductosBodegas=isPermiso;		
		this.isPermisoDuplicarProductosBodegas=isPermiso;
		this.isPermisoOrdenProductosBodegas=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductosBodegas(Boolean isPermiso) {
		//this.isPermisoTodoProductosBodegas=isPermiso;
		this.isPermisoNuevoProductosBodegas=isPermiso;
		this.isPermisoActualizarProductosBodegas=isPermiso;
		this.isPermisoActualizarOriginalProductosBodegas=isPermiso;
		this.isPermisoEliminarProductosBodegas=isPermiso;
		this.isPermisoGuardarCambiosProductosBodegas=isPermiso;
		//this.isPermisoConsultaProductosBodegas=isPermiso;
		//this.isPermisoBusquedaProductosBodegas=isPermiso;
		//this.isPermisoReporteProductosBodegas=isPermiso;
		//this.isPermisoOrdenProductosBodegas=isPermiso;		
		//this.isPermisoPaginacionMedioProductosBodegas=isPermiso;		
		//this.isPermisoPaginacionAltoProductosBodegas=isPermiso;		
		//this.isPermisoPaginacionTodoProductosBodegas=isPermiso;		
		//this.isPermisoCopiarProductosBodegas=isPermiso;		
		//this.isPermisoDuplicarProductosBodegas=isPermiso;
		//this.isPermisoOrdenProductosBodegas=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductosBodegasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductosBodegasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductosBodegas(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductosBodegasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductosBodegasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductosBodegasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductosBodegasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductosBodegas() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductosBodegasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductosBodegasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductosBodegas=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductosBodegas=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductosBodegas=this.isPermisoActualizarProductosBodegas;
			this.isPermisoEliminarProductosBodegas=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductosBodegas=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductosBodegas=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductosBodegas=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductosBodegas=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductosBodegas=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductosBodegas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductosBodegas=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductosBodegas=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductosBodegas=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductosBodegas=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductosBodegas=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductosBodegas=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductosBodegas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductosBodegas.setToolTipText(this.jTableDatosProductosBodegas.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductosBodegas(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductosBodegas(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductosBodegasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductosBodegasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductosBodegas() throws Exception {
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
	public void inicializarCombosForeignKeyProductosBodegasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductosBodegasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductosBodegasJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyProductosBodegas()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyLineaGrupo();
			this.addItemDefectoCombosForeignKeyLineaCategoria();
			this.addItemDefectoCombosForeignKeyLineaMarca();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.productosbodegasSessionBean==null) {
				this.productosbodegasSessionBean=new ProductosBodegasSessionBean();
			}

			if(!this.productosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.productosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.productosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.productosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.productosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

			if(!this.productosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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

			if(!this.productosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
	
	public void initActionsCombosTodosForeignKeyProductosBodegas()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductosBodegas(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductosBodegas()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductosBodegas();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductosBodegas(ProductosBodegas productosbodegas)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductosBodegas(ProductosBodegas productosbodegas,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductosBodegas()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductosBodegas()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductosBodegas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductosBodegas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductosBodegas()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductosBodegas()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductosBodegas(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductosBodegas()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_empresaProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_empresaProductosBodegas.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_empresaProductosBodegas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_sucursalProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_sucursalProductosBodegas.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_sucursalProductosBodegas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_bodegaProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_bodegaProductosBodegas.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_bodegaProductosBodegas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_lineaProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_lineaProductosBodegas.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_lineaProductosBodegas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_grupoProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_grupoProductosBodegas.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_grupoProductosBodegas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_categoriaProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_categoriaProductosBodegas.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_categoriaProductosBodegas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_marcaProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_marcaProductosBodegas.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_marcaProductosBodegas.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public ProductosBodegasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductosBodegasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductosBodegasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productosbodegasSessionBean=new ProductosBodegasSessionBean(); 
		this.productosbodegasConstantesFunciones=new ProductosBodegasConstantesFunciones(); 
		this.productosbodegasBean=new ProductosBodegas();//(this.productosbodegasConstantesFunciones); 		
		this.productosbodegasReturnGeneral=new ProductosBodegasParameterReturnGeneral(); 
		
		this.productosbodegasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosbodegasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductosBodegasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductosBodegasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductosBodegasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductosBodegas(true);
			
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
			
			this.productosbodegasConstantesFunciones=new ProductosBodegasConstantesFunciones(); 
			this.productosbodegasBean=new ProductosBodegas();//this.productosbodegasConstantesFunciones); 			
			this.productosbodegasReturnGeneral=new ProductosBodegasParameterReturnGeneral(); 
		
			ProductosBodegasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Productos Bodegas Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.productosbodegas=new ProductosBodegas();
			this.productosbodegass = new ArrayList<ProductosBodegas>();
			this.productosbodegassAux = new ArrayList<ProductosBodegas>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic=new ProductosBodegasLogic();
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}
			
			//this.productosbodegasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productosbodegasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductosBodegas);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductosBodegas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductosBodegas);	
					}
					
					if(this.jInternalFrameImportacionProductosBodegas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductosBodegas);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductosBodegas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductosBodegas);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductosBodegas!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductosBodegas);
				this.jInternalFrameDetalleFormProductosBodegas.setVisible(false);
				this.jInternalFrameDetalleFormProductosBodegas.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductosBodegas!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductosBodegas);
					this.jInternalFrameReporteDinamicoProductosBodegas.setVisible(false);
					this.jInternalFrameReporteDinamicoProductosBodegas.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductosBodegas!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductosBodegas);
					this.jInternalFrameImportacionProductosBodegas.setVisible(false);
					this.jInternalFrameImportacionProductosBodegas.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductosBodegas!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductosBodegas);
					this.jInternalFrameOrderByProductosBodegas.setVisible(false);
					this.jInternalFrameOrderByProductosBodegas.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductosBodegasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductosBodegasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productosbodegasReturnGeneral=new ProductosBodegasParameterReturnGeneral();
			
			this.productosbodegasParameterGeneral=new ProductosBodegasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productosbodegasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductosBodegasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductosBodegasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productosbodegasSessionBean.getEsGuardarRelacionado(),this.productosbodegasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductosBodegasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productosbodegasSessionBean.getEsGuardarRelacionado(),this.productosbodegasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductosBodegas=false;
			this.isVisibilidadCeldaDuplicarProductosBodegas=true;
			this.isVisibilidadCeldaCopiarProductosBodegas=true;
			this.isVisibilidadCeldaVerFormProductosBodegas=true;
			this.isVisibilidadCeldaOrdenProductosBodegas=true;
			this.isVisibilidadCeldaNuevoRelacionesProductosBodegas=false;
			this.isVisibilidadCeldaModificarProductosBodegas=false;
			this.isVisibilidadCeldaActualizarProductosBodegas=false;
			this.isVisibilidadCeldaEliminarProductosBodegas=false;
			this.isVisibilidadCeldaCancelarProductosBodegas=false;
			this.isVisibilidadCeldaGuardarProductosBodegas=false;
			this.isVisibilidadCeldaGuardarCambiosProductosBodegas=false;
			
			
			this.isVisibilidadBusquedaProductosBodegas=true;
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductosBodegas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductosBodegas();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductosBodegas(false);
			
			this.setPermisosUsuarioProductosBodegas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productosbodegasSessionBean.getEsGuardarRelacionado() 
				|| (this.productosbodegasSessionBean.getEsGuardarRelacionado() && this.productosbodegasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductosBodegasClasesRelacionadas();
			}
			
			if(this.productosbodegasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductosBodegasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductosBodegas();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductosBodegas();
			}
			
			if(!this.isPermisoBusquedaProductosBodegas) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductosBodegas.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productosbodegasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductosBodegasConstantesFunciones.getTiposSeleccionarProductosBodegas());
				
				this.tiposColumnasSelect=ProductosBodegasConstantesFunciones.getTiposSeleccionarProductosBodegas(true);
				
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
			//if(!this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductosBodegas();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProductosBodegas(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProductosBodegas(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductosBodegas() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				productosbodegasImplementable= (ProductosBodegasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductosBodegasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productosbodegasImplementableHome= (ProductosBodegasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductosBodegasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productosbodegass= new ArrayList<ProductosBodegas>();
			this.productosbodegassEliminados= new ArrayList<ProductosBodegas>();
						
			this.isEsNuevoProductosBodegas=false;
			this.esParaAccionDesdeFormularioProductosBodegas=false;
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
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductosBodegas(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductosBodegas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductosBodegasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductosBodegasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductosBodegas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductosBodegas(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductosBodegas!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductosBodegas();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductosBodegas();
			}
			
			ProductosBodegasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductosBodegas.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductosBodegas.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductosBodegas.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductosBodegas(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductosBodegas: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductosBodegas() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductosBodegas")) {
				iIndex=this.jInternalFrameDetalleFormProductosBodegas.jTabbedPaneRelacionesProductosBodegas.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductosBodegas.jTabbedPaneRelacionesProductosBodegas.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductosBodegas();	
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
	
	public void cargarCombosForeignKeyProductosBodegas(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductosBodegas(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductosBodegas(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductosBodegasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductosBodegas();
		
		this.cargarCombosFrameForeignKeyProductosBodegas();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductosBodegas();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductosBodegas();
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
	
	public void jButtonNuevoProductosBodegasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productosbodegasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductosBodegas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
			
			
			if(jTableDatosProductosBodegas.getRowCount()>=1) {
				jTableDatosProductosBodegas.removeRowSelectionInterval(0, jTableDatosProductosBodegas.getRowCount()-1);						
			}
			
			this.isEsNuevoProductosBodegas=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductosBodegas(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductosBodegas(true);			
			//this.productosbodegas=new ProductosBodegas();
			//this.productosbodegas.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductosBodegas(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosBodegas() ;
			
			if(ProductosBodegasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductosBodegas(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productosbodegas);	
			this.actualizarInformacion("INFO_PADRE",false,this.productosbodegas);				
			
			ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
			
			if(this.productosbodegasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductosBodegas: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductosBodegasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductosBodegas> productosbodegassSeleccionados=new ArrayList<ProductosBodegas>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductosBodegas.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductosBodegas.getSelectedRows().length;			
			}
			
			productosbodegassSeleccionados=this.getProductosBodegassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductosBodegas--;			
				//ProductosBodegas productosbodegasAux= new ProductosBodegas();			
				//productosbodegasAux.setId(this.iIdNuevoProductosBodegas);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductosBodegas productosbodegasOrigen=new ProductosBodegas();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductosBodegas productosbodegasOrigen : productosbodegassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productosbodegasOrigen =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productosbodegasOrigen =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductosBodegas();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productosbodegas.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductosBodegas(productosbodegasOrigen,this.productosbodegas,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productosbodegasLogic.getProductosBodegass().add(this.productosbodegasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productosbodegass.add(this.productosbodegasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductosBodegas(false);
				
				this.jTableDatosProductosBodegas.setRowSelectionInterval(this.getIndiceNuevoProductosBodegas(), this.getIndiceNuevoProductosBodegas());
				
				int iLastRow =  this.jTableDatosProductosBodegas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductosBodegas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductosBodegas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductosBodegas(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductosBodegas> productosbodegassSeleccionados=new ArrayList<ProductosBodegas>();									
		
			ProductosBodegas productosbodegasOrigen=new ProductosBodegas();
			ProductosBodegas productosbodegasDestino=new ProductosBodegas();
				
			productosbodegassSeleccionados=this.getProductosBodegassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductosBodegas.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productosbodegassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductosBodegas.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productosbodegasOrigen =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productosbodegasOrigen =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productosbodegasDestino =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productosbodegasDestino =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productosbodegasOrigen =productosbodegassSeleccionados.get(0);
				productosbodegasDestino =productosbodegassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductosBodegas(productosbodegasOrigen,productosbodegasDestino,true,false);
				
				productosbodegasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productosbodegasDestino,productosbodegasLogic.getProductosBodegass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productosbodegasDestino,productosbodegass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductosBodegas(false);
				
				//this.jTableDatosProductosBodegas.setRowSelectionInterval(this.getIndiceNuevoProductosBodegas(), this.getIndiceNuevoProductosBodegas());
				
				int iLastRow =  this.jTableDatosProductosBodegas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductosBodegas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductosBodegas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductosBodegas(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductosBodegas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductosBodegas.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductosBodegas.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductosBodegas.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductosBodegas.setVisible(!isVisible);
			this.jPanelPaginacionProductosBodegas.setVisible(!isVisible);
			this.jPanelAccionesProductosBodegas.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductosBodegas();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductosBodegas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductosBodegas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductosBodegas();
			
			this.abrirFrameOrderByProductosBodegas();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductosBodegas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductosBodegas(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductosBodegas);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductosBodegas.isMaximum()) {
					this.jInternalFrameDetalleFormProductosBodegas.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductosBodegas.setSize(this.jInternalFrameDetalleFormProductosBodegas.iWidthFormulario,this.jInternalFrameDetalleFormProductosBodegas.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductosBodegas.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductosBodegas.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductosBodegas.isMaximum()) {
						this.jInternalFrameDetalleFormProductosBodegas.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductosBodegas.jContentPaneDetalleProductosBodegas.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductosBodegas.jTabbedPaneRelacionesProductosBodegas.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductosBodegas.jContentPaneDetalleProductosBodegas.getWidth(),ProductosBodegasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductosBodegas.jTabbedPaneRelacionesProductosBodegas.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductosBodegas.jContentPaneDetalleProductosBodegas.getWidth(),ProductosBodegasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductosBodegas.jTabbedPaneRelacionesProductosBodegas.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductosBodegas.jContentPaneDetalleProductosBodegas.getWidth(),ProductosBodegasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductosBodegas.setVisible(true);
	        this.jInternalFrameDetalleFormProductosBodegas.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductosBodegas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductosBodegas==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductosBodegas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosBodegas,false,this);
				} else {
					this.jInternalFrameOrderByProductosBodegas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosBodegas,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductosBodegas);
				this.jInternalFrameOrderByProductosBodegas.setVisible(false);
				this.jInternalFrameOrderByProductosBodegas.setSelected(false);
				
				this.jInternalFrameOrderByProductosBodegas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductosBodegas"));
				
				this.inicializarActualizarBindingTablaOrderByProductosBodegas();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductosBodegas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductosBodegas==null) {
				
				this.jInternalFrameImportacionProductosBodegas=new ImportacionJInternalFrame(ProductosBodegasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductosBodegas);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductosBodegas);
				this.jInternalFrameImportacionProductosBodegas.setVisible(false);
				this.jInternalFrameImportacionProductosBodegas.setSelected(false);


				this.jInternalFrameImportacionProductosBodegas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductosBodegas"));
				this.jInternalFrameImportacionProductosBodegas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductosBodegas"));
				this.jInternalFrameImportacionProductosBodegas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductosBodegas"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductosBodegas() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductosBodegas==null) {
				this.jInternalFrameReporteDinamicoProductosBodegas=new ReporteDinamicoJInternalFrame(ProductosBodegasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductosBodegas);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductosBodegas);
				this.jInternalFrameReporteDinamicoProductosBodegas.setVisible(false);
				this.jInternalFrameReporteDinamicoProductosBodegas.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductosBodegas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductosBodegas"));
				this.jInternalFrameReporteDinamicoProductosBodegas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductosBodegas"));
				this.jInternalFrameReporteDinamicoProductosBodegas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductosBodegas"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductosBodegas();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductosBodegas() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductosBodegas);
			
	       	this.jInternalFrameDetalleFormProductosBodegas.setVisible(false);
	        this.jInternalFrameDetalleFormProductosBodegas.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductosBodegas.dispose();
			//this.jInternalFrameDetalleFormProductosBodegas=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductosBodegas() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductosBodegas.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductosBodegas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductosBodegas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductosBodegas.setVisible(true);
	        this.jInternalFrameImportacionProductosBodegas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductosBodegas() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductosBodegas.setVisible(true);
	        this.jInternalFrameOrderByProductosBodegas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductosBodegas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductosBodegas.setVisible(false);
	        this.jInternalFrameOrderByProductosBodegas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductosBodegas() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductosBodegas.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductosBodegas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductosBodegas() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductosBodegas.setVisible(false);
	        this.jInternalFrameImportacionProductosBodegas.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductosBodegas(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductosBodegas(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductosBodegas(true);
			//this.isEsNuevoProductosBodegas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductosBodegas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductosBodegas(false) ;
			
			if(productosbodegasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductosBodegasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductosBodegas(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosBodegas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductosBodegasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductosBodegas(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductosBodegas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductosBodegas(true);
			//this.isEsNuevoProductosBodegas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productosbodegas.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductosBodegas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductosBodegas(false) ;
			
			if(ProductosBodegasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductosBodegas(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosBodegas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosProductosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosBodegas,ProductosBodegasConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosBodegas.getSelectedRow();

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
		TableColumn tableColumnLinea=this.jTableDatosProductosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosBodegas,ProductosBodegasConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosBodegas.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosProductosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosBodegas,ProductosBodegasConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosBodegas.getSelectedRow();

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
		TableColumn tableColumnLineaCategoria=this.jTableDatosProductosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosBodegas,ProductosBodegasConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosBodegas.getSelectedRow();

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
		TableColumn tableColumnLineaMarca=this.jTableDatosProductosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosBodegas,ProductosBodegasConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosBodegas.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProductosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductosBodegas(false);
			
			//if(!this.isEsNuevoProductosBodegas) {								
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductosBodegasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductosBodegas(this.productosbodegas,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
				
			}
			
			if(this.permiteMantenimiento(this.productosbodegas)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductosBodegas=true;
					this.inicializarActualizarBindingTablaProductosBodegas(false);
					this.isEsNuevoProductosBodegas=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductosBodegas=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductosBodegas=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductosBodegas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductosBodegas(false);
				
				this.habilitarDeshabilitarControlesProductosBodegas(false);
			
												
				
				if(ProductosBodegasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductosBodegas();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductosBodegasActionPerformed(evt,productosbodegasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductosBodegas(this.productosbodegas,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductosBodegas.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productosbodegasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productosbodegas.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductosBodegas.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosBodegas.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				this.productosbodegas.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				this.productosbodegas.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productosbodegas)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductosBodegasModel) this.jTableDatosProductosBodegas.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductosBodegas=true;
				this.inicializarActualizarBindingTablaProductosBodegas(false);
				this.isEsNuevoProductosBodegas=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductosBodegas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductosBodegas(false);
				
				this.habilitarDeshabilitarControlesProductosBodegas(false);
				
				
				
				if(ProductosBodegasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductosBodegas();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductosBodegasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductosBodegas.getRowCount()>=1) {
				jTableDatosProductosBodegas.removeRowSelectionInterval(0, jTableDatosProductosBodegas.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductosBodegas(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductosBodegas(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductosBodegas(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosBodegas(false) ;
			
			this.isEsNuevoProductosBodegas=false;
			
			if(ProductosBodegasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductosBodegas();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductosBodegasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductosBodegas(false);
				
				//SI ES MANUAL
				if(ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductosBodegas();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductosBodegasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductosBodegas--;			
			//ProductosBodegas productosbodegasAux= new ProductosBodegas();			
			//productosbodegasAux.setId(this.iIdNuevoProductosBodegas);
			
			if(this.jInternalFrameDetalleFormProductosBodegas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductosBodegas();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
			
			this.productosbodegas.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productosbodegasLogic.getProductosBodegass().add(this.productosbodegasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productosbodegass.add(this.productosbodegasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductosBodegas(false);
			
			this.jTableDatosProductosBodegas.setRowSelectionInterval(this.getIndiceNuevoProductosBodegas(), this.getIndiceNuevoProductosBodegas());
			
			int iLastRow =  this.jTableDatosProductosBodegas.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductosBodegas.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductosBodegas.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductosBodegas(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductosBodegasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductosBodegas(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosBodegas(false);
			
			//SI ES MANUAL
			if(ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductosBodegas();
			}
			
			//this.abrirFrameTreeProductosBodegas();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductosBodegasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductosBodegasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductosBodegas.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductosBodegas.setFileImportacion(this.jInternalFrameImportacionProductosBodegas.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductosBodegas.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductosBodegas.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductosBodegas.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductosBodegas.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductosBodegasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductosBodegas> productosbodegassSeleccionados=new ArrayList<ProductosBodegas>();		

		productosbodegassSeleccionados=this.getProductosBodegassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosBodegas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosBodegas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductosBodegasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductosBodegasBaseDesign.jrxml";
			
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
			
			this.generarReporteProductosBodegass("Todos",productosbodegassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosbodegasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Bodegas",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductosBodegas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosBodegas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductosBodegasConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLinea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLinea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLinea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLinea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaCategoria_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaCategoria_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaCategoria_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaCategoria_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaMarca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaMarca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaMarca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaMarca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosBodegasConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBREBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBodega_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProductosBodegas.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductosBodegas.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductosBodegas.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductosBodegasConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoria="nombre_sucursal";
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoria="nombre_linea";
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					sNombreCampoCategoria="nombre_linea_grupo";
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					sNombreCampoCategoria="nombre_linea_categoria";
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					sNombreCampoCategoria="nombre_linea_marca";
					break;

				case ProductosBodegasConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoria="nombre_bodega";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductosBodegas.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductosBodegasConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoriaValor="nombre_sucursal";
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoriaValor="nombre_linea";
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					sNombreCampoCategoriaValor="nombre_linea_grupo";
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					sNombreCampoCategoriaValor="nombre_linea_categoria";
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					sNombreCampoCategoriaValor="nombre_linea_marca";
					break;

				case ProductosBodegasConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoriaValor="nombre_bodega";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductosBodegas.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosBodegas.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductosBodegasConstantesFunciones.LABEL_NOMBRESUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sucursal");
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea");
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_grupo");
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Categoria",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_categoria");
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_marca");
					break;

				case ProductosBodegasConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBREBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_bodega");
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
	
	public void jButtonGenerarExcelReporteDinamicoProductosBodegasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductosBodegas> productosbodegassSeleccionados=new ArrayList<ProductosBodegas>();		
		
		productosbodegassSeleccionados=this.getProductosBodegassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosbodegas";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductosBodegass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductosBodegas.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosBodegas.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductosBodegasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProductosBodegas productosbodegas:productosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosbodegas.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosBodegasConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProductosBodegas productosbodegas:productosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosbodegas.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosBodegasConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ProductosBodegas productosbodegas:productosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosbodegas.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosBodegasConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(ProductosBodegas productosbodegas:productosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosbodegas.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosBodegasConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(ProductosBodegas productosbodegas:productosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosbodegas.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosBodegasConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(ProductosBodegas productosbodegas:productosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosbodegas.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosBodegasConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(ProductosBodegas productosbodegas:productosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosbodegas.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_NOMBRESUCURSAL);
					iRow++;

					for(ProductosBodegas productosbodegas:productosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosbodegas.getnombre_sucursal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEA);
					iRow++;

					for(ProductosBodegas productosbodegas:productosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosbodegas.getnombre_linea());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
					iRow++;

					for(ProductosBodegas productosbodegas:productosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosbodegas.getnombre_linea_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
					iRow++;

					for(ProductosBodegas productosbodegas:productosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosbodegas.getnombre_linea_categoria());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA);
					iRow++;

					for(ProductosBodegas productosbodegas:productosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosbodegas.getnombre_linea_marca());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosBodegasConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ProductosBodegas productosbodegas:productosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosbodegas.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ProductosBodegas productosbodegas:productosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosbodegas.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosBodegasConstantesFunciones.LABEL_NOMBREBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_NOMBREBODEGA);
					iRow++;

					for(ProductosBodegas productosbodegas:productosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosbodegas.getnombre_bodega());
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
			//	this.getFilaCabeceraExportarExcelProductosBodegas(row);				
			//	iRow++;
			//}				
			
			//for(ProductosBodegas productosbodegasAux:productosbodegassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductosBodegas(productosbodegasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosbodegasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Bodegas",JOptionPane.INFORMATION_MESSAGE);
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
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosBodegas(false);
			
			//SI ES MANUAL
			if(ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductosBodegas();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductosBodegasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosBodegas(false);
			
			//SI ES MANUAL
			if(ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductosBodegas();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductosBodegasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosBodegas(false);
			
			//SI ES MANUAL
			if(ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductosBodegas();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductosBodegas() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductosBodegas.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductosBodegas.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductosBodegas.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductosBodegas.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductosBodegas.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductosBodegas.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductosBodegas.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductosBodegas(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductosBodegas(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductosBodegas(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductosBodegas(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductosBodegas(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductosBodegas(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductosBodegas(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductosBodegas(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductosBodegasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductosBodegas() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductosBodegas();
		
		this.inicializarActualizarBindingBotonesManualProductosBodegas(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductosBodegas();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductosBodegas() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductosBodegas(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductosBodegas(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductosBodegas.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductosBodegas.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductosBodegas.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductosBodegas.jCheckBoxPostAccionNuevoProductosBodegas.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductosBodegas.jCheckBoxPostAccionSinCerrarProductosBodegas.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductosBodegas.jCheckBoxPostAccionSinMensajeProductosBodegas.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductosBodegas.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductosBodegas.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductosBodegas.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
				this.jInternalFrameDetalleFormProductosBodegas.jCheckBoxPostAccionNuevoProductosBodegas.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductosBodegas.jCheckBoxPostAccionSinCerrarProductosBodegas.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductosBodegas.jCheckBoxPostAccionSinMensajeProductosBodegas.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductosBodegas.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductosBodegas.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductosBodegas.jComboBoxTiposAccionesFormularioProductosBodegas.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductosBodegas.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductosBodegas!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosBodegas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductosBodegas.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductosBodegas.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductosBodegas.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductosBodegas.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductosBodegas!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosBodegas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductosBodegas.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductosBodegas.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductosBodegas(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductosBodegas(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductosBodegas() throws Exception {
		try	{
			if(ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductosBodegas();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductosBodegas() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductosBodegas.jComboBoxTiposAccionesFormularioProductosBodegas.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductosBodegas.jComboBoxTiposAccionesFormularioProductosBodegas.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductosBodegas() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductosBodegas.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductosBodegas.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductosBodegas.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductosBodegas.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductosBodegas.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductosBodegas.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductosBodegas.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductosBodegas.addItem(reporte);
			}
			
			
			if(!this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductosBodegas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductosBodegas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductosBodegas.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductosBodegas.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductosBodegas.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductosBodegas.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductosBodegas!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductosBodegas.jComboBoxTiposAccionesFormularioProductosBodegas.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductosBodegas.jComboBoxTiposAccionesFormularioProductosBodegas.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductosBodegas.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductosBodegas.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductosBodegas.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductosBodegas();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductosBodegas() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductosBodegas!=null) {
				this.jInternalFrameReporteDinamicoProductosBodegas.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductosBodegas.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductosBodegas!=null) {
				this.jInternalFrameReporteDinamicoProductosBodegas.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductosBodegas.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductosBodegas!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductosBodegas.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductosBodegas.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductosBodegas.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductosBodegas.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductosBodegas.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductosBodegas.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductosBodegas()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaBusquedaProductosBodegasProductosBodegas.getSelectedItem()!=null){this.id_bodegaBusquedaProductosBodegas=((Bodega)this.jComboBoxid_bodegaBusquedaProductosBodegasProductosBodegas.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaProductosBodegasProductosBodegas.getSelectedItem()!=null){this.id_lineaBusquedaProductosBodegas=((Linea)this.jComboBoxid_lineaBusquedaProductosBodegasProductosBodegas.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaProductosBodegasProductosBodegas.getSelectedItem()!=null){this.id_linea_grupoBusquedaProductosBodegas=((Linea)this.jComboBoxid_linea_grupoBusquedaProductosBodegasProductosBodegas.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaProductosBodegasProductosBodegas.getSelectedItem()!=null){this.id_linea_categoriaBusquedaProductosBodegas=((Linea)this.jComboBoxid_linea_categoriaBusquedaProductosBodegasProductosBodegas.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaProductosBodegasProductosBodegas.getSelectedItem()!=null){this.id_linea_marcaBusquedaProductosBodegas=((Linea)this.jComboBoxid_linea_marcaBusquedaProductosBodegasProductosBodegas.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductosBodegas(Boolean esInicializar) throws Exception {				
		if(ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductosBodegas();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductosBodegas() throws Exception {
		this.inicializarActualizarBindingTablaProductosBodegas(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductosBodegas() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductosBodegas.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductosBodegas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductosBodegas.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductosBodegasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductosBodegas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductosBodegas.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductosBodegasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductosBodegasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosBodegasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductosBodegasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductosBodegas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductosBodegas.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductosBodegasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductosBodegas.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductosBodegas(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productosbodegasLogic.getProductosBodegass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productosbodegass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductosBodegasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductosBodegas.setModel(new ProductosBodegasModel(this.productosbodegasLogic.getProductosBodegass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductosBodegas.setModel(new ProductosBodegasModel(this.productosbodegass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductosBodegas!=null && this.jInternalFrameOrderByProductosBodegas.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductosBodegas();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosBodegas,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductosBodegasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO,productosbodegasConstantesFunciones.resaltarSeleccionarProductosBodegas,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductosBodegasConstantesFunciones.SCLASSWEBTITULO,productosbodegasConstantesFunciones.resaltarSeleccionarProductosBodegas,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosBodegas,ProductosBodegasConstantesFunciones.LABEL_ID));

		if(this.productosbodegasConstantesFunciones.mostraridProductosBodegas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosBodegasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productosbodegasConstantesFunciones.resaltaridProductosBodegas,this.productosbodegasConstantesFunciones.activaridProductosBodegas,this,true,"idProductosBodegas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosbodegasConstantesFunciones.resaltaridProductosBodegas,this.productosbodegasConstantesFunciones.activaridProductosBodegas,this,true,"idProductosBodegas","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosBodegas,ProductosBodegasConstantesFunciones.LABEL_NOMBRESUCURSAL));

		if(this.productosbodegasConstantesFunciones.mostrarnombre_sucursalProductosBodegas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosBodegasConstantesFunciones.LABEL_NOMBRESUCURSAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosbodegasConstantesFunciones.resaltarnombre_sucursalProductosBodegas,this.productosbodegasConstantesFunciones.activarnombre_sucursalProductosBodegas,this,true,"nombre_sucursalProductosBodegas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosbodegasConstantesFunciones.resaltarnombre_sucursalProductosBodegas,this.productosbodegasConstantesFunciones.activarnombre_sucursalProductosBodegas,this,true,"nombre_sucursalProductosBodegas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosBodegasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosBodegas,ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEA));

		if(this.productosbodegasConstantesFunciones.mostrarnombre_lineaProductosBodegas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosbodegasConstantesFunciones.resaltarnombre_lineaProductosBodegas,this.productosbodegasConstantesFunciones.activarnombre_lineaProductosBodegas,this,true,"nombre_lineaProductosBodegas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosbodegasConstantesFunciones.resaltarnombre_lineaProductosBodegas,this.productosbodegasConstantesFunciones.activarnombre_lineaProductosBodegas,this,true,"nombre_lineaProductosBodegas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosBodegasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosBodegas,ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO));

		if(this.productosbodegasConstantesFunciones.mostrarnombre_linea_grupoProductosBodegas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosbodegasConstantesFunciones.resaltarnombre_linea_grupoProductosBodegas,this.productosbodegasConstantesFunciones.activarnombre_linea_grupoProductosBodegas,this,true,"nombre_linea_grupoProductosBodegas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosbodegasConstantesFunciones.resaltarnombre_linea_grupoProductosBodegas,this.productosbodegasConstantesFunciones.activarnombre_linea_grupoProductosBodegas,this,true,"nombre_linea_grupoProductosBodegas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosBodegasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosBodegas,ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA));

		if(this.productosbodegasConstantesFunciones.mostrarnombre_linea_categoriaProductosBodegas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosbodegasConstantesFunciones.resaltarnombre_linea_categoriaProductosBodegas,this.productosbodegasConstantesFunciones.activarnombre_linea_categoriaProductosBodegas,this,true,"nombre_linea_categoriaProductosBodegas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosbodegasConstantesFunciones.resaltarnombre_linea_categoriaProductosBodegas,this.productosbodegasConstantesFunciones.activarnombre_linea_categoriaProductosBodegas,this,true,"nombre_linea_categoriaProductosBodegas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosBodegasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosBodegas,ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA));

		if(this.productosbodegasConstantesFunciones.mostrarnombre_linea_marcaProductosBodegas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosbodegasConstantesFunciones.resaltarnombre_linea_marcaProductosBodegas,this.productosbodegasConstantesFunciones.activarnombre_linea_marcaProductosBodegas,this,true,"nombre_linea_marcaProductosBodegas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosbodegasConstantesFunciones.resaltarnombre_linea_marcaProductosBodegas,this.productosbodegasConstantesFunciones.activarnombre_linea_marcaProductosBodegas,this,true,"nombre_linea_marcaProductosBodegas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosBodegasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosBodegas,ProductosBodegasConstantesFunciones.LABEL_CODIGO));

		if(this.productosbodegasConstantesFunciones.mostrarcodigoProductosBodegas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosBodegasConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosbodegasConstantesFunciones.resaltarcodigoProductosBodegas,this.productosbodegasConstantesFunciones.activarcodigoProductosBodegas,this,true,"codigoProductosBodegas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosbodegasConstantesFunciones.resaltarcodigoProductosBodegas,this.productosbodegasConstantesFunciones.activarcodigoProductosBodegas,this,true,"codigoProductosBodegas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosBodegasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosBodegas,ProductosBodegasConstantesFunciones.LABEL_NOMBRE));

		if(this.productosbodegasConstantesFunciones.mostrarnombreProductosBodegas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosBodegasConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosbodegasConstantesFunciones.resaltarnombreProductosBodegas,this.productosbodegasConstantesFunciones.activarnombreProductosBodegas,this,true,"nombreProductosBodegas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosbodegasConstantesFunciones.resaltarnombreProductosBodegas,this.productosbodegasConstantesFunciones.activarnombreProductosBodegas,this,true,"nombreProductosBodegas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosBodegasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosBodegas,ProductosBodegasConstantesFunciones.LABEL_NOMBREBODEGA));

		if(this.productosbodegasConstantesFunciones.mostrarnombre_bodegaProductosBodegas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosBodegasConstantesFunciones.LABEL_NOMBREBODEGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosbodegasConstantesFunciones.resaltarnombre_bodegaProductosBodegas,this.productosbodegasConstantesFunciones.activarnombre_bodegaProductosBodegas,this,true,"nombre_bodegaProductosBodegas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosbodegasConstantesFunciones.resaltarnombre_bodegaProductosBodegas,this.productosbodegasConstantesFunciones.activarnombre_bodegaProductosBodegas,this,true,"nombre_bodegaProductosBodegas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosBodegasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productosbodegasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productosbodegasSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productosbodegasSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductosBodegas.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productosbodegasSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productosbodegasSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductosBodegas.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductosBodegas && this.isPermisoGuardarCambiosProductosBodegas) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productosbodegasSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productosbodegasSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductosBodegas.addColumn(tableColumn);
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
			
			this.jTableDatosProductosBodegas.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductosBodegas && this.isPermisoGuardarCambiosProductosBodegas) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductosBodegas && this.isPermisoGuardarCambiosProductosBodegas) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductosBodegas.moveColumn(this.jTableDatosProductosBodegas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductosBodegas.moveColumn(this.jTableDatosProductosBodegas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductosBodegas.moveColumn(this.jTableDatosProductosBodegas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductosBodegas.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductosBodegas.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductosBodegas,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductosBodegas.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductosBodegas.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductosBodegasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductosBodegas.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductosBodegas.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductosBodegas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=productosbodegasLogic.getProductosBodegass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productosbodegass.size()-1;
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
		//this.jTableDatosProductosBodegas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductosBodegas();
			
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
				
				//this.isEsNuevoProductosBodegas=false;
					
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
			
				if(this.productosbodegasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductosBodegas==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductosBodegas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductosBodegas.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productosbodegas.getsType().equals("DUPLICADO")
				   || this.productosbodegas.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductosBodegas=true;
				
				} else {
					this.isEsNuevoProductosBodegas=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
					if(this.productosbodegas.getId()>=0 && !this.productosbodegas.getIsNew()) {						
						this.isEsNuevoProductosBodegas=false;
						
					} else {
						this.isEsNuevoProductosBodegas=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductosBodegas(esRelaciones);						
				
				this.seleccionarProductosBodegas(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productosbodegas.getId()<0) {
					this.isEsNuevoProductosBodegas=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductosBodegas(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductosBodegas(evt,rowIndex);
				}	
				
				if(this.productosbodegasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductosBodegas: " + this.dDif); 
					}
				}								
				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductosBodegas(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productosbodegas)) {
					if(this.productosbodegas.getId()>0) {
						this.productosbodegas.setIsDeleted(true);
						
						this.productosbodegassEliminados.add(this.productosbodegas);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productosbodegasLogic.getProductosBodegass().remove(this.productosbodegas);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productosbodegass.remove(this.productosbodegas);				
					}
					
					
					((ProductosBodegasModel) this.jTableDatosProductosBodegas.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductosBodegas(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductosBodegas(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductosBodegas) {
			
			if(this.jInternalFrameDetalleFormProductosBodegas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductosBodegas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductosBodegas.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductosBodegasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductosBodegas(this.productosbodegas);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductosBodegas("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductosBodegas(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductosBodegas() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductosBodegas(ProductosBodegas productosbodegas) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductosBodegas(productosbodegas,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductosBodegas(ProductosBodegas productosbodegas,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductosBodegas(productosbodegas);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductosBodegas(productosbodegas,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductosBodegas(productosbodegas);
	}
	
	public void setVariablesObjetoActualToFormularioProductosBodegas(ProductosBodegas productosbodegas) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductosBodegas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductosBodegas.jLabelidProductosBodegas.setText(productosbodegas.getId().toString());
			this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_sucursalProductosBodegas.setText(productosbodegas.getnombre_sucursal());
			this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_lineaProductosBodegas.setText(productosbodegas.getnombre_linea());
			this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_grupoProductosBodegas.setText(productosbodegas.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_categoriaProductosBodegas.setText(productosbodegas.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_marcaProductosBodegas.setText(productosbodegas.getnombre_linea_marca());
			this.jInternalFrameDetalleFormProductosBodegas.jTextFieldcodigoProductosBodegas.setText(productosbodegas.getcodigo());
			this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombreProductosBodegas.setText(productosbodegas.getnombre());
			this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_bodegaProductosBodegas.setText(productosbodegas.getnombre_bodega());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductosBodegas productosbodegasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productosbodegasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductosBodegas productosbodegasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productosbodegasLocal=this.productosbodegas;
			} else {
				productosbodegasLocal=this.productosbodegasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productosbodegasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductosBodegas(productosbodegasLocal,true);
					
					if(productosbodegasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productosbodegasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productosbodegasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductosBodegas(ProductosBodegas productosbodegas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductosBodegas(productosbodegas,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(productosbodegas);
	}
	
	public void setVariablesFormularioToObjetoActualProductosBodegas(ProductosBodegas productosbodegas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductosBodegas(productosbodegas,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductosBodegas(ProductosBodegas productosbodegas,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductosBodegas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductosBodegas.jLabelidProductosBodegas.getText()==null || this.jInternalFrameDetalleFormProductosBodegas.jLabelidProductosBodegas.getText()=="" || this.jInternalFrameDetalleFormProductosBodegas.jLabelidProductosBodegas.getText()=="Id") {
				this.jInternalFrameDetalleFormProductosBodegas.jLabelidProductosBodegas.setText("0");
			}

			if(conColumnasBase) {productosbodegas.setId(Long.parseLong(this.jInternalFrameDetalleFormProductosBodegas.jLabelidProductosBodegas.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosBodegasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosBodegas.jLabelIdProductosBodegas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosbodegas.setnombre_sucursal(this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_sucursalProductosBodegas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosBodegasConstantesFunciones.LABEL_NOMBRESUCURSAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosBodegas.jLabelnombre_sucursalProductosBodegas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosbodegas.setnombre_linea(this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_lineaProductosBodegas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosBodegas.jLabelnombre_lineaProductosBodegas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosbodegas.setnombre_linea_grupo(this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_grupoProductosBodegas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosBodegas.jLabelnombre_linea_grupoProductosBodegas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosbodegas.setnombre_linea_categoria(this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_categoriaProductosBodegas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosBodegas.jLabelnombre_linea_categoriaProductosBodegas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosbodegas.setnombre_linea_marca(this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_marcaProductosBodegas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosBodegas.jLabelnombre_linea_marcaProductosBodegas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosbodegas.setcodigo(this.jInternalFrameDetalleFormProductosBodegas.jTextFieldcodigoProductosBodegas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosBodegasConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosBodegas.jLabelcodigoProductosBodegas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosbodegas.setnombre(this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombreProductosBodegas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosBodegasConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosBodegas.jLabelnombreProductosBodegas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosbodegas.setnombre_bodega(this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_bodegaProductosBodegas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosBodegasConstantesFunciones.LABEL_NOMBREBODEGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosBodegas.jLabelnombre_bodegaProductosBodegas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductosBodegas(ProductosBodegas productosbodegasBean,ProductosBodegas productosbodegas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductosBodegas(ProductosBodegas productosbodegasOrigen,ProductosBodegas productosbodegas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productosbodegasOrigen.getId()!=null && !productosbodegasOrigen.getId().equals(0L))) {productosbodegas.setId(productosbodegasOrigen.getId());}}
			if(conDefault || (!conDefault && productosbodegasOrigen.getnombre_sucursal()!=null && !productosbodegasOrigen.getnombre_sucursal().equals(""))) {productosbodegas.setnombre_sucursal(productosbodegasOrigen.getnombre_sucursal());}
			if(conDefault || (!conDefault && productosbodegasOrigen.getnombre_linea()!=null && !productosbodegasOrigen.getnombre_linea().equals(""))) {productosbodegas.setnombre_linea(productosbodegasOrigen.getnombre_linea());}
			if(conDefault || (!conDefault && productosbodegasOrigen.getnombre_linea_grupo()!=null && !productosbodegasOrigen.getnombre_linea_grupo().equals(""))) {productosbodegas.setnombre_linea_grupo(productosbodegasOrigen.getnombre_linea_grupo());}
			if(conDefault || (!conDefault && productosbodegasOrigen.getnombre_linea_categoria()!=null && !productosbodegasOrigen.getnombre_linea_categoria().equals(""))) {productosbodegas.setnombre_linea_categoria(productosbodegasOrigen.getnombre_linea_categoria());}
			if(conDefault || (!conDefault && productosbodegasOrigen.getnombre_linea_marca()!=null && !productosbodegasOrigen.getnombre_linea_marca().equals(""))) {productosbodegas.setnombre_linea_marca(productosbodegasOrigen.getnombre_linea_marca());}
			if(conDefault || (!conDefault && productosbodegasOrigen.getcodigo()!=null && !productosbodegasOrigen.getcodigo().equals(""))) {productosbodegas.setcodigo(productosbodegasOrigen.getcodigo());}
			if(conDefault || (!conDefault && productosbodegasOrigen.getnombre()!=null && !productosbodegasOrigen.getnombre().equals(""))) {productosbodegas.setnombre(productosbodegasOrigen.getnombre());}
			if(conDefault || (!conDefault && productosbodegasOrigen.getnombre_bodega()!=null && !productosbodegasOrigen.getnombre_bodega().equals(""))) {productosbodegas.setnombre_bodega(productosbodegasOrigen.getnombre_bodega());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductosBodegas(ProductosBodegas productosbodegas) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductosBodegas.jLabelidProductosBodegas.setText(productosbodegas.getId().toString());
			this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_sucursalProductosBodegas.setText(productosbodegas.getnombre_sucursal());
			this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_lineaProductosBodegas.setText(productosbodegas.getnombre_linea());
			this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_grupoProductosBodegas.setText(productosbodegas.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_categoriaProductosBodegas.setText(productosbodegas.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_marcaProductosBodegas.setText(productosbodegas.getnombre_linea_marca());
			this.jInternalFrameDetalleFormProductosBodegas.jTextFieldcodigoProductosBodegas.setText(productosbodegas.getcodigo());
			this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombreProductosBodegas.setText(productosbodegas.getnombre());
			this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_bodegaProductosBodegas.setText(productosbodegas.getnombre_bodega());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductosBodegas(ProductosBodegasBean productosbodegasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductosBodegas.jLabelidProductosBodegas.setText(productosbodegasBean.getId().toString());
			this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_sucursalProductosBodegas.setText(productosbodegasBean.getnombre_sucursal());
			this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_lineaProductosBodegas.setText(productosbodegasBean.getnombre_linea());
			this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_grupoProductosBodegas.setText(productosbodegasBean.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_categoriaProductosBodegas.setText(productosbodegasBean.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_marcaProductosBodegas.setText(productosbodegasBean.getnombre_linea_marca());
			this.jInternalFrameDetalleFormProductosBodegas.jTextFieldcodigoProductosBodegas.setText(productosbodegasBean.getcodigo());
			this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombreProductosBodegas.setText(productosbodegasBean.getnombre());
			this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_bodegaProductosBodegas.setText(productosbodegasBean.getnombre_bodega());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductosBodegas(ProductosBodegasParameterReturnGeneral productosbodegasReturnGeneral,ProductosBodegasBean productosbodegasBean,Boolean conDefault) throws Exception { 
		try {
			ProductosBodegas productosbodegasLocal=new ProductosBodegas();
			
			productosbodegasLocal=productosbodegasReturnGeneral.getProductosBodegas();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productosbodegasLocal.getId()!=null && !productosbodegasLocal.getId().equals(0L))) {productosbodegasBean.setId(productosbodegasLocal.getId());}}
			if(conDefault || (!conDefault && productosbodegasLocal.getnombre_sucursal()!=null && !productosbodegasLocal.getnombre_sucursal().equals(""))) {productosbodegasBean.setnombre_sucursal(productosbodegasLocal.getnombre_sucursal());}
			if(conDefault || (!conDefault && productosbodegasLocal.getnombre_linea()!=null && !productosbodegasLocal.getnombre_linea().equals(""))) {productosbodegasBean.setnombre_linea(productosbodegasLocal.getnombre_linea());}
			if(conDefault || (!conDefault && productosbodegasLocal.getnombre_linea_grupo()!=null && !productosbodegasLocal.getnombre_linea_grupo().equals(""))) {productosbodegasBean.setnombre_linea_grupo(productosbodegasLocal.getnombre_linea_grupo());}
			if(conDefault || (!conDefault && productosbodegasLocal.getnombre_linea_categoria()!=null && !productosbodegasLocal.getnombre_linea_categoria().equals(""))) {productosbodegasBean.setnombre_linea_categoria(productosbodegasLocal.getnombre_linea_categoria());}
			if(conDefault || (!conDefault && productosbodegasLocal.getnombre_linea_marca()!=null && !productosbodegasLocal.getnombre_linea_marca().equals(""))) {productosbodegasBean.setnombre_linea_marca(productosbodegasLocal.getnombre_linea_marca());}
			if(conDefault || (!conDefault && productosbodegasLocal.getcodigo()!=null && !productosbodegasLocal.getcodigo().equals(""))) {productosbodegasBean.setcodigo(productosbodegasLocal.getcodigo());}
			if(conDefault || (!conDefault && productosbodegasLocal.getnombre()!=null && !productosbodegasLocal.getnombre().equals(""))) {productosbodegasBean.setnombre(productosbodegasLocal.getnombre());}
			if(conDefault || (!conDefault && productosbodegasLocal.getnombre_bodega()!=null && !productosbodegasLocal.getnombre_bodega().equals(""))) {productosbodegasBean.setnombre_bodega(productosbodegasLocal.getnombre_bodega());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductosBodegasGenerico(Long idProductosBodegasSeleccionado,JComboBox jComboBoxProductosBodegas,List<ProductosBodegas> productosbodegassLocal)throws Exception {
		try {
			ProductosBodegas  productosbodegasTemp=null;

			for(ProductosBodegas productosbodegasAux:productosbodegassLocal) {
				if(productosbodegasAux.getId()!=null && productosbodegasAux.getId().equals(idProductosBodegasSeleccionado)) {
					productosbodegasTemp=productosbodegasAux;
					break;
				}
			}

			jComboBoxProductosBodegas.setSelectedItem(productosbodegasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductosBodegasGenerico(JComboBox jComboBoxProductosBodegas,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductosBodegas.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductosBodegas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductosBodegas.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductosBodegas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productosbodegas=(ProductosBodegas) productosbodegasLogic.getProductosBodegass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productosbodegas =(ProductosBodegas) productosbodegass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!productosbodegas.getIsNew() && !productosbodegas.getIsChanged() && !productosbodegas.getIsDeleted()) {
				sDescripcion=productosbodegas.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productosbodegas.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!productosbodegas.getIsNew() && !productosbodegas.getIsChanged() && !productosbodegas.getIsDeleted()) {
				sDescripcion=productosbodegas.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=productosbodegas.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!productosbodegas.getIsNew() && !productosbodegas.getIsChanged() && !productosbodegas.getIsDeleted()) {
				sDescripcion=productosbodegas.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=productosbodegas.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!productosbodegas.getIsNew() && !productosbodegas.getIsChanged() && !productosbodegas.getIsDeleted()) {
				sDescripcion=productosbodegas.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=productosbodegas.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!productosbodegas.getIsNew() && !productosbodegas.getIsChanged() && !productosbodegas.getIsDeleted()) {
				sDescripcion=productosbodegas.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=productosbodegas.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!productosbodegas.getIsNew() && !productosbodegas.getIsChanged() && !productosbodegas.getIsDeleted()) {
				sDescripcion=productosbodegas.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=productosbodegas.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!productosbodegas.getIsNew() && !productosbodegas.getIsChanged() && !productosbodegas.getIsDeleted()) {
				sDescripcion=productosbodegas.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=productosbodegas.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductosBodegas productosbodegasRow=new ProductosBodegas();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productosbodegasRow=(ProductosBodegas) productosbodegasLogic.getProductosBodegass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productosbodegasRow=(ProductosBodegas) productosbodegass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductosBodegas(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductosBodegas.setVisible((this.isVisibilidadCeldaNuevoProductosBodegas && this.isPermisoNuevoProductosBodegas));			
			this.jButtonDuplicarProductosBodegas.setVisible((this.isVisibilidadCeldaDuplicarProductosBodegas && this.isPermisoDuplicarProductosBodegas));			
			this.jButtonCopiarProductosBodegas.setVisible((this.isVisibilidadCeldaCopiarProductosBodegas && this.isPermisoCopiarProductosBodegas));
			this.jButtonVerFormProductosBodegas.setVisible((this.isVisibilidadCeldaVerFormProductosBodegas && this.isPermisoVerFormProductosBodegas));
			
			this.jButtonAbrirOrderByProductosBodegas.setVisible((this.isVisibilidadCeldaOrdenProductosBodegas && this.isPermisoOrdenProductosBodegas));			
			
			this.jButtonNuevoRelacionesProductosBodegas.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductosBodegas && this.isPermisoNuevoProductosBodegas));			
			this.jButtonNuevoGuardarCambiosProductosBodegas.setVisible((this.isVisibilidadCeldaNuevoProductosBodegas && this.isPermisoNuevoProductosBodegas && this.isPermisoGuardarCambiosProductosBodegas));
			
			if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
			this.jInternalFrameDetalleFormProductosBodegas.jButtonModificarProductosBodegas.setVisible((this.isVisibilidadCeldaModificarProductosBodegas && this.isPermisoActualizarProductosBodegas));	
			this.jInternalFrameDetalleFormProductosBodegas.jButtonActualizarProductosBodegas.setVisible((this.isVisibilidadCeldaActualizarProductosBodegas && this.isPermisoActualizarProductosBodegas));	
			this.jInternalFrameDetalleFormProductosBodegas.jButtonEliminarProductosBodegas.setVisible((this.isVisibilidadCeldaEliminarProductosBodegas && this.isPermisoEliminarProductosBodegas));
			this.jInternalFrameDetalleFormProductosBodegas.jButtonCancelarProductosBodegas.setVisible(this.isVisibilidadCeldaCancelarProductosBodegas);							
			this.jInternalFrameDetalleFormProductosBodegas.jButtonGuardarCambiosProductosBodegas.setVisible((this.isVisibilidadCeldaGuardarProductosBodegas && this.isPermisoGuardarCambiosProductosBodegas));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductosBodegas.setVisible((this.isVisibilidadCeldaGuardarCambiosProductosBodegas && this.isPermisoGuardarCambiosProductosBodegas));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductosBodegas.setVisible((this.isVisibilidadCeldaNuevoProductosBodegas && this.isPermisoNuevoProductosBodegas));						
			this.jButtonDuplicarToolBarProductosBodegas.setVisible((this.isVisibilidadCeldaDuplicarProductosBodegas && this.isPermisoDuplicarProductosBodegas));						
			this.jButtonCopiarToolBarProductosBodegas.setVisible((this.isVisibilidadCeldaCopiarProductosBodegas && this.isPermisoCopiarProductosBodegas));			
			this.jButtonVerFormToolBarProductosBodegas.setVisible((this.isVisibilidadCeldaVerFormProductosBodegas && this.isPermisoVerFormProductosBodegas));			
			this.jButtonAbrirOrderByToolBarProductosBodegas.setVisible((this.isVisibilidadCeldaOrdenProductosBodegas && this.isPermisoOrdenProductosBodegas));
			this.jButtonNuevoRelacionesToolBarProductosBodegas.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductosBodegas && this.isPermisoNuevoProductosBodegas));			
			this.jButtonNuevoGuardarCambiosToolBarProductosBodegas.setVisible((this.isVisibilidadCeldaNuevoProductosBodegas && this.isPermisoNuevoProductosBodegas && this.isPermisoGuardarCambiosProductosBodegas));			
			
			if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
			this.jInternalFrameDetalleFormProductosBodegas.jButtonModificarToolBarProductosBodegas.setVisible((this.isVisibilidadCeldaModificarProductosBodegas && this.isPermisoActualizarProductosBodegas));	
			this.jInternalFrameDetalleFormProductosBodegas.jButtonActualizarToolBarProductosBodegas.setVisible((this.isVisibilidadCeldaActualizarProductosBodegas  && this.isPermisoActualizarProductosBodegas));	
			this.jInternalFrameDetalleFormProductosBodegas.jButtonEliminarToolBarProductosBodegas.setVisible((this.isVisibilidadCeldaEliminarProductosBodegas && this.isPermisoEliminarProductosBodegas));
			this.jInternalFrameDetalleFormProductosBodegas.jButtonCancelarToolBarProductosBodegas.setVisible(this.isVisibilidadCeldaCancelarProductosBodegas);				
			this.jInternalFrameDetalleFormProductosBodegas.jButtonGuardarCambiosToolBarProductosBodegas.setVisible((this.isVisibilidadCeldaGuardarProductosBodegas && this.isPermisoGuardarCambiosProductosBodegas));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductosBodegas.setVisible((this.isVisibilidadCeldaGuardarCambiosProductosBodegas && this.isPermisoGuardarCambiosProductosBodegas));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductosBodegas.setVisible((this.isVisibilidadCeldaNuevoProductosBodegas && this.isPermisoNuevoProductosBodegas));			
			this.jMenuItemDuplicarProductosBodegas.setVisible((this.isVisibilidadCeldaDuplicarProductosBodegas && this.isPermisoDuplicarProductosBodegas));			
			this.jMenuItemCopiarProductosBodegas.setVisible((this.isVisibilidadCeldaCopiarProductosBodegas && this.isPermisoCopiarProductosBodegas));			
			this.jMenuItemVerFormProductosBodegas.setVisible((this.isVisibilidadCeldaVerFormProductosBodegas && this.isPermisoVerFormProductosBodegas));			
			this.jMenuItemAbrirOrderByProductosBodegas.setVisible((this.isVisibilidadCeldaOrdenProductosBodegas && this.isPermisoOrdenProductosBodegas));			
			//this.jMenuItemMostrarOcultarProductosBodegas.setVisible((this.isVisibilidadCeldaOrdenProductosBodegas && this.isPermisoOrdenProductosBodegas));
			this.jMenuItemDetalleAbrirOrderByProductosBodegas.setVisible((this.isVisibilidadCeldaOrdenProductosBodegas && this.isPermisoOrdenProductosBodegas));			
			//this.jMenuItemDetalleMostrarOcultarProductosBodegas.setVisible((this.isVisibilidadCeldaOrdenProductosBodegas && this.isPermisoOrdenProductosBodegas));			
			this.jMenuItemNuevoRelacionesProductosBodegas.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductosBodegas && this.isPermisoNuevoProductosBodegas));			
			this.jMenuItemNuevoGuardarCambiosProductosBodegas.setVisible((this.isVisibilidadCeldaNuevoProductosBodegas && this.isPermisoNuevoProductosBodegas && this.isPermisoGuardarCambiosProductosBodegas));									
			
			if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
			this.jInternalFrameDetalleFormProductosBodegas.jMenuItemModificarProductosBodegas.setVisible((this.isVisibilidadCeldaModificarProductosBodegas && this.isPermisoActualizarProductosBodegas));	
			this.jInternalFrameDetalleFormProductosBodegas.jMenuItemActualizarProductosBodegas.setVisible((this.isVisibilidadCeldaActualizarProductosBodegas && this.isPermisoActualizarProductosBodegas));	
			this.jInternalFrameDetalleFormProductosBodegas.jMenuItemEliminarProductosBodegas.setVisible((this.isVisibilidadCeldaEliminarProductosBodegas && this.isPermisoEliminarProductosBodegas));
			this.jInternalFrameDetalleFormProductosBodegas.jMenuItemCancelarProductosBodegas.setVisible(this.isVisibilidadCeldaCancelarProductosBodegas);				
			}
			
			this.jMenuItemGuardarCambiosProductosBodegas.setVisible((this.isVisibilidadCeldaGuardarProductosBodegas && this.isPermisoGuardarCambiosProductosBodegas));						
			this.jMenuItemGuardarCambiosTablaProductosBodegas.setVisible((this.isVisibilidadCeldaGuardarCambiosProductosBodegas && this.isPermisoGuardarCambiosProductosBodegas));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductosBodegas=this.jButtonNuevoProductosBodegas.isVisible();
			this.isVisibilidadCeldaDuplicarProductosBodegas=this.jButtonDuplicarProductosBodegas.isVisible();
			this.isVisibilidadCeldaCopiarProductosBodegas=this.jButtonCopiarProductosBodegas.isVisible();
			this.isVisibilidadCeldaVerFormProductosBodegas=this.jButtonVerFormProductosBodegas.isVisible();
			
			this.isVisibilidadCeldaOrdenProductosBodegas=this.jButtonAbrirOrderByProductosBodegas.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductosBodegas=this.jButtonNuevoRelacionesProductosBodegas.isVisible();
			this.isVisibilidadCeldaModificarProductosBodegas=this.jButtonModificarProductosBodegas.isVisible();
			
			if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
			this.isVisibilidadCeldaActualizarProductosBodegas=this.jInternalFrameDetalleFormProductosBodegas.jButtonActualizarProductosBodegas.isVisible();
			this.isVisibilidadCeldaEliminarProductosBodegas=this.jInternalFrameDetalleFormProductosBodegas.jButtonEliminarProductosBodegas.isVisible();
			this.isVisibilidadCeldaCancelarProductosBodegas=this.jInternalFrameDetalleFormProductosBodegas.jButtonCancelarProductosBodegas.isVisible();
			this.isVisibilidadCeldaGuardarProductosBodegas=this.jInternalFrameDetalleFormProductosBodegas.jButtonGuardarCambiosProductosBodegas.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductosBodegas=this.jButtonGuardarCambiosTablaProductosBodegas.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductosBodegas=this.jButtonNuevoToolBarProductosBodegas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductosBodegas=this.jButtonNuevoRelacionesToolBarProductosBodegas.isVisible();
			
			if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
			this.isVisibilidadCeldaModificarProductosBodegas=this.jInternalFrameDetalleFormProductosBodegas.jButtonModificarToolBarProductosBodegas.isVisible();
			this.isVisibilidadCeldaActualizarProductosBodegas=this.jInternalFrameDetalleFormProductosBodegas.jButtonActualizarToolBarProductosBodegas.isVisible();
			this.isVisibilidadCeldaEliminarProductosBodegas=this.jInternalFrameDetalleFormProductosBodegas.jButtonEliminarToolBarProductosBodegas.isVisible();
			this.isVisibilidadCeldaCancelarProductosBodegas=this.jInternalFrameDetalleFormProductosBodegas.jButtonCancelarToolBarProductosBodegas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductosBodegas=this.jButtonGuardarCambiosToolBarProductosBodegas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductosBodegas=this.jButtonGuardarCambiosTablaToolBarProductosBodegas.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductosBodegas=this.jMenuItemNuevoProductosBodegas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductosBodegas=this.jMenuItemNuevoRelacionesProductosBodegas.isVisible();
			
			if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
			this.isVisibilidadCeldaModificarProductosBodegas=this.jInternalFrameDetalleFormProductosBodegas.jMenuItemModificarProductosBodegas.isVisible();
			this.isVisibilidadCeldaActualizarProductosBodegas=this.jInternalFrameDetalleFormProductosBodegas.jMenuItemActualizarProductosBodegas.isVisible();
			this.isVisibilidadCeldaEliminarProductosBodegas=this.jInternalFrameDetalleFormProductosBodegas.jMenuItemEliminarProductosBodegas.isVisible();
			this.isVisibilidadCeldaCancelarProductosBodegas=this.jInternalFrameDetalleFormProductosBodegas.jMenuItemCancelarProductosBodegas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductosBodegas=this.jMenuItemGuardarCambiosProductosBodegas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductosBodegas=this.jMenuItemGuardarCambiosTablaProductosBodegas.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductosBodegas(Boolean esInicializar) {
		if(ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productosbodegasSessionBean.getConGuardarRelaciones()) {
				//if(this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductosBodegas();
			}
			
			this.inicializarActualizarBindingBotonesManualProductosBodegas(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductosBodegas() {
		this.jButtonNuevoProductosBodegas.setVisible(this.isPermisoNuevoProductosBodegas);			
		this.jButtonDuplicarProductosBodegas.setVisible(this.isPermisoDuplicarProductosBodegas);			
		this.jButtonCopiarProductosBodegas.setVisible(this.isPermisoCopiarProductosBodegas);			
		this.jButtonVerFormProductosBodegas.setVisible(this.isPermisoVerFormProductosBodegas);			
		
		this.jButtonAbrirOrderByProductosBodegas.setVisible(this.isPermisoOrdenProductosBodegas);					
		
		this.jButtonNuevoRelacionesProductosBodegas.setVisible(this.isPermisoNuevoProductosBodegas);			
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosBodegas.jButtonModificarProductosBodegas.setVisible(this.isPermisoActualizarProductosBodegas);	
			this.jInternalFrameDetalleFormProductosBodegas.jButtonActualizarProductosBodegas.setVisible(this.isPermisoActualizarProductosBodegas);	
			this.jInternalFrameDetalleFormProductosBodegas.jButtonEliminarProductosBodegas.setVisible(this.isPermisoEliminarProductosBodegas);
			this.jInternalFrameDetalleFormProductosBodegas.jButtonCancelarProductosBodegas.setVisible(this.isVisibilidadCeldaCancelarProductosBodegas);						
			this.jInternalFrameDetalleFormProductosBodegas.jButtonGuardarCambiosProductosBodegas.setVisible(this.isPermisoGuardarCambiosProductosBodegas);							
		}
		
		this.jButtonGuardarCambiosTablaProductosBodegas.setVisible(this.isPermisoActualizarProductosBodegas);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductosBodegas() {
		this.jInternalFrameDetalleFormProductosBodegas.jButtonModificarProductosBodegas.setVisible(this.isPermisoActualizarProductosBodegas);	
		this.jInternalFrameDetalleFormProductosBodegas.jButtonActualizarProductosBodegas.setVisible(this.isPermisoActualizarProductosBodegas);	
		this.jInternalFrameDetalleFormProductosBodegas.jButtonEliminarProductosBodegas.setVisible(this.isPermisoEliminarProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jButtonCancelarProductosBodegas.setVisible(this.isVisibilidadCeldaCancelarProductosBodegas);							
		this.jInternalFrameDetalleFormProductosBodegas.jButtonGuardarCambiosProductosBodegas.setVisible((this.isVisibilidadCeldaGuardarProductosBodegas && this.isPermisoGuardarCambiosProductosBodegas));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductosBodegas() {
		if(ProductosBodegasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductosBodegas();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductosBodegas() {
	}
	
	public void jTableDatosProductosBodegasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductosBodegas(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosbodegas==null) {
						this.productosbodegas = new ProductosBodegas();
					}

					this.setVariablesFormularioToObjetoActualProductosBodegas(this.productosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
				}

				if(this.productosbodegas.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productosbodegas.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProductosBodegasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProductosBodegas(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosBodegas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosBodegas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.productosbodegasLogic.getConnexion());

				if(this.productosbodegas.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.productosbodegas.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosBodegas=(TitledBorder)this.jScrollPanelDatosProductosBodegas.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProductosBodegas.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProductosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosbodegas==null) {
						this.productosbodegas = new ProductosBodegas();
					}

					this.setVariablesFormularioToObjetoActualProductosBodegas(this.productosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
				}

				if(this.productosbodegas.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.productosbodegas.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProductosBodegasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProductosBodegas(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosBodegas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosBodegas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.productosbodegasLogic.getConnexion());

				if(this.productosbodegas.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.productosbodegas.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosBodegas=(TitledBorder)this.jScrollPanelDatosProductosBodegas.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProductosBodegas.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProductosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosbodegas==null) {
						this.productosbodegas = new ProductosBodegas();
					}

					this.setVariablesFormularioToObjetoActualProductosBodegas(this.productosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
				}

				if(this.productosbodegas.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.productosbodegas.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaProductosBodegasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebProductosBodegas(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosBodegas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosBodegas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.productosbodegasLogic.getConnexion());

				if(this.productosbodegas.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.productosbodegas.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosBodegas=(TitledBorder)this.jScrollPanelDatosProductosBodegas.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderProductosBodegas.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaProductosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosbodegas==null) {
						this.productosbodegas = new ProductosBodegas();
					}

					this.setVariablesFormularioToObjetoActualProductosBodegas(this.productosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
				}

				if(this.productosbodegas.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.productosbodegas.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaProductosBodegasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebProductosBodegas(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosBodegas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosBodegas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productosbodegasLogic.getConnexion());

				if(this.productosbodegas.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.productosbodegas.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosBodegas=(TitledBorder)this.jScrollPanelDatosProductosBodegas.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderProductosBodegas.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaProductosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosbodegas==null) {
						this.productosbodegas = new ProductosBodegas();
					}

					this.setVariablesFormularioToObjetoActualProductosBodegas(this.productosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
				}

				if(this.productosbodegas.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.productosbodegas.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoProductosBodegasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebProductosBodegas(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosBodegas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosBodegas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productosbodegasLogic.getConnexion());

				if(this.productosbodegas.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.productosbodegas.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosBodegas=(TitledBorder)this.jScrollPanelDatosProductosBodegas.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderProductosBodegas.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoProductosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosbodegas==null) {
						this.productosbodegas = new ProductosBodegas();
					}

					this.setVariablesFormularioToObjetoActualProductosBodegas(this.productosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
				}

				if(this.productosbodegas.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.productosbodegas.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaProductosBodegasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebProductosBodegas(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosBodegas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosBodegas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productosbodegasLogic.getConnexion());

				if(this.productosbodegas.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.productosbodegas.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosBodegas=(TitledBorder)this.jScrollPanelDatosProductosBodegas.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderProductosBodegas.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaProductosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosbodegas==null) {
						this.productosbodegas = new ProductosBodegas();
					}

					this.setVariablesFormularioToObjetoActualProductosBodegas(this.productosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
				}

				if(this.productosbodegas.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.productosbodegas.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaProductosBodegasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebProductosBodegas(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosBodegas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosBodegas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productosbodegasLogic.getConnexion());

				if(this.productosbodegas.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.productosbodegas.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosBodegas=(TitledBorder)this.jScrollPanelDatosProductosBodegas.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderProductosBodegas.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaProductosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosbodegas==null) {
						this.productosbodegas = new ProductosBodegas();
					}

					this.setVariablesFormularioToObjetoActualProductosBodegas(this.productosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
				}

				if(this.productosbodegas.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.productosbodegas.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sucursalProductosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosbodegas==null) {
						this.productosbodegas = new ProductosBodegas();
					}

					this.setVariablesFormularioToObjetoActualProductosBodegas(this.productosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
				}

				if(this.productosbodegas.getnombre_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sucursal like '%"+this.productosbodegas.getnombre_sucursal()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_lineaProductosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosbodegas==null) {
						this.productosbodegas = new ProductosBodegas();
					}

					this.setVariablesFormularioToObjetoActualProductosBodegas(this.productosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
				}

				if(this.productosbodegas.getnombre_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea like '%"+this.productosbodegas.getnombre_linea()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_grupoProductosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosbodegas==null) {
						this.productosbodegas = new ProductosBodegas();
					}

					this.setVariablesFormularioToObjetoActualProductosBodegas(this.productosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
				}

				if(this.productosbodegas.getnombre_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_grupo like '%"+this.productosbodegas.getnombre_linea_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_categoriaProductosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosbodegas==null) {
						this.productosbodegas = new ProductosBodegas();
					}

					this.setVariablesFormularioToObjetoActualProductosBodegas(this.productosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
				}

				if(this.productosbodegas.getnombre_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_categoria like '%"+this.productosbodegas.getnombre_linea_categoria()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_marcaProductosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosbodegas==null) {
						this.productosbodegas = new ProductosBodegas();
					}

					this.setVariablesFormularioToObjetoActualProductosBodegas(this.productosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
				}

				if(this.productosbodegas.getnombre_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_marca like '%"+this.productosbodegas.getnombre_linea_marca()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoProductosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosbodegas==null) {
						this.productosbodegas = new ProductosBodegas();
					}

					this.setVariablesFormularioToObjetoActualProductosBodegas(this.productosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
				}

				if(this.productosbodegas.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.productosbodegas.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreProductosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosbodegas==null) {
						this.productosbodegas = new ProductosBodegas();
					}

					this.setVariablesFormularioToObjetoActualProductosBodegas(this.productosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
				}

				if(this.productosbodegas.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.productosbodegas.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_bodegaProductosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosBodegas(this.getproductosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosbodegas==null) {
						this.productosbodegas = new ProductosBodegas();
					}

					this.setVariablesFormularioToObjetoActualProductosBodegas(this.productosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);
				}

				if(this.productosbodegas.getnombre_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_bodega like '%"+this.productosbodegas.getnombre_bodega()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProductosBodegasProductosBodegasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosBodegas(false,false);

			this.getProductosBodegassBusquedaProductosBodegas();

			this.inicializarActualizarBindingProductosBodegas(false);

			//if(ProductosBodegasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosBodegas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaProductosBodegasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosBodegas(false,false);

			this.getProductosBodegassFK_IdBodega();

			this.inicializarActualizarBindingProductosBodegas(false);

			//if(ProductosBodegasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosBodegas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProductosBodegasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosBodegas(false,false);

			this.getProductosBodegassFK_IdEmpresa();

			this.inicializarActualizarBindingProductosBodegas(false);

			//if(ProductosBodegasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosBodegas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaProductosBodegasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosBodegas(false,false);

			this.getProductosBodegassFK_IdLinea();

			this.inicializarActualizarBindingProductosBodegas(false);

			//if(ProductosBodegasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosBodegas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaProductosBodegasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosBodegas(false,false);

			this.getProductosBodegassFK_IdLineaCategoria();

			this.inicializarActualizarBindingProductosBodegas(false);

			//if(ProductosBodegasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosBodegas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoProductosBodegasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosBodegas(false,false);

			this.getProductosBodegassFK_IdLineaGrupo();

			this.inicializarActualizarBindingProductosBodegas(false);

			//if(ProductosBodegasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosBodegas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaProductosBodegasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosBodegas(false,false);

			this.getProductosBodegassFK_IdLineaMarca();

			this.inicializarActualizarBindingProductosBodegas(false);

			//if(ProductosBodegasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosBodegas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProductosBodegasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosBodegas(false,false);

			this.getProductosBodegassFK_IdSucursal();

			this.inicializarActualizarBindingProductosBodegas(false);

			//if(ProductosBodegasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosBodegas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductosBodegas() {
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
			this.jInternalFrameDetalleFormProductosBodegas.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductosBodegas.dispose();
			this.jInternalFrameDetalleFormProductosBodegas=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductosBodegas!=null) {
			this.jInternalFrameReporteDinamicoProductosBodegas.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductosBodegas.dispose();
			this.jInternalFrameReporteDinamicoProductosBodegas=null;
		}
		
		if(this.jInternalFrameImportacionProductosBodegas!=null) {
			this.jInternalFrameImportacionProductosBodegas.setVisible(false);	    			
			this.jInternalFrameImportacionProductosBodegas.dispose();
			this.jInternalFrameImportacionProductosBodegas=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductosBodegas();
			
			ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductosBodegas")) {
				jButtonNuevoProductosBodegasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductosBodegas")) {
				jButtonDuplicarProductosBodegasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductosBodegas")) {
				jButtonCopiarProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductosBodegas")) {
				jButtonVerFormProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductosBodegas")) {
				jButtonNuevoProductosBodegasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductosBodegas")) {
				jButtonDuplicarProductosBodegasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductosBodegas")) {
				jButtonNuevoProductosBodegasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductosBodegas")) {
				jButtonDuplicarProductosBodegasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductosBodegas")) {
				jButtonNuevoProductosBodegasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductosBodegas")) {
				jButtonNuevoProductosBodegasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductosBodegas")) {
				jButtonNuevoProductosBodegasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductosBodegas")) {
				jButtonModificarProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductosBodegas")) {
				jButtonModificarProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductosBodegas")) {
				jButtonModificarProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductosBodegas")) {
				jButtonActualizarProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductosBodegas")) {
				jButtonActualizarProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductosBodegas")) {
				jButtonActualizarProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductosBodegas")) {
				jButtonEliminarProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductosBodegas")) {
				jButtonEliminarProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductosBodegas")) {
				jButtonEliminarProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductosBodegas")) {
				jButtonCancelarProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductosBodegas")) {
				jButtonCancelarProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductosBodegas")) {
				jButtonCancelarProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductosBodegas")) {
				jButtonCerrarProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductosBodegas")) {
				jButtonCerrarProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductosBodegas")) {
				jButtonCerrarProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductosBodegas")) {
				jButtonMostrarOcultarProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductosBodegas")) {
				jButtonCancelarProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductosBodegas")) {
				jButtonGuardarCambiosProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductosBodegas")) {
				jButtonGuardarCambiosProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductosBodegas")) {
				jButtonCopiarProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductosBodegas")) {
				jButtonVerFormProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductosBodegas")) {
				jButtonGuardarCambiosProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductosBodegas")) {
				jButtonCopiarProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductosBodegas")) {
				jButtonVerFormProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductosBodegas")) {
				jButtonGuardarCambiosProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductosBodegas")) {
				jButtonGuardarCambiosProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductosBodegas")) {
				jButtonGuardarCambiosProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductosBodegas")) {
				jButtonRecargarInformacionProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductosBodegas")) {
				jButtonRecargarInformacionProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductosBodegas")) {
				jButtonRecargarInformacionProductosBodegasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductosBodegas")) {
				jButtonAnterioresProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductosBodegas")) {
				jButtonAnterioresProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductosBodegas")) {
				jButtonAnterioresProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductosBodegas")) {
				jButtonSiguientesProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductosBodegas")) {
				jButtonSiguientesProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductosBodegas")) {
				jButtonSiguientesProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductosBodegas") || sTipo.equals("MenuItemDetalleAbrirOrderByProductosBodegas")) {
				jButtonAbrirOrderByProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductosBodegas") || sTipo.equals("MenuItemDetalleMostrarOcultarProductosBodegas")) {
				jButtonMostrarOcultarProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductosBodegas")) {
				jButtonNuevoGuardarCambiosProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductosBodegas")) {
				jButtonNuevoGuardarCambiosProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductosBodegas")) {
				jButtonNuevoGuardarCambiosProductosBodegasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductosBodegas")) {
				jButtonCerrarReporteDinamicoProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductosBodegas")) {
				jButtonGenerarReporteDinamicoProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductosBodegas")) {
				
				jButtonGenerarExcelReporteDinamicoProductosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductosBodegas")) {
				jButtonCerrarImportacionProductosBodegasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductosBodegas")) {
				
				jButtonGenerarImportacionProductosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductosBodegas")) {
				
				jButtonAbrirImportacionProductosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductosBodegas")) {
				jComboBoxTiposAccionesProductosBodegasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductosBodegas")) {
				jComboBoxTiposRelacionesProductosBodegasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductosBodegas")) {
				jComboBoxTiposAccionesProductosBodegasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductosBodegas")) {
				
				jComboBoxTiposSeleccionarProductosBodegasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductosBodegas")) {
				jTextFieldValorCampoGeneralProductosBodegasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductosBodegas")) {
				jButtonAbrirOrderByProductosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductosBodegas")) {
				jButtonAbrirOrderByProductosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductosBodegas")) {
				jButtonCerrarOrderByProductosBodegasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductosBodegasBusqueda")) {
				this.jButtonidProductosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductosBodegasUpdate")) {
				this.jButtonid_empresaProductosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductosBodegasBusqueda")) {
				this.jButtonid_empresaProductosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductosBodegasUpdate")) {
				this.jButtonid_sucursalProductosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductosBodegasBusqueda")) {
				this.jButtonid_sucursalProductosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductosBodegasUpdate")) {
				this.jButtonid_bodegaProductosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductosBodegasBusqueda")) {
				this.jButtonid_bodegaProductosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProductosBodegasUpdate")) {
				this.jButtonid_lineaProductosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProductosBodegasBusqueda")) {
				this.jButtonid_lineaProductosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProductosBodegasUpdate")) {
				this.jButtonid_linea_grupoProductosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProductosBodegasBusqueda")) {
				this.jButtonid_linea_grupoProductosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProductosBodegasUpdate")) {
				this.jButtonid_linea_categoriaProductosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProductosBodegasBusqueda")) {
				this.jButtonid_linea_categoriaProductosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProductosBodegasUpdate")) {
				this.jButtonid_linea_marcaProductosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProductosBodegasBusqueda")) {
				this.jButtonid_linea_marcaProductosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalProductosBodegasBusqueda")) {
				this.jButtonnombre_sucursalProductosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaProductosBodegasBusqueda")) {
				this.jButtonnombre_lineaProductosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_grupoProductosBodegasBusqueda")) {
				this.jButtonnombre_linea_grupoProductosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_categoriaProductosBodegasBusqueda")) {
				this.jButtonnombre_linea_categoriaProductosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_marcaProductosBodegasBusqueda")) {
				this.jButtonnombre_linea_marcaProductosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProductosBodegasBusqueda")) {
				this.jButtoncodigoProductosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProductosBodegasBusqueda")) {
				this.jButtonnombreProductosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaProductosBodegasBusqueda")) {
				this.jButtonnombre_bodegaProductosBodegasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProductosBodegasProductosBodegas")) {
				this.jButtonBusquedaProductosBodegasProductosBodegasActionPerformed(evt);
			}
			
			;
			
			
			ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductosBodegas();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosBodegasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosbodegas);
				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
				
				


				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosBodegas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosBodegas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductosBodegas productosbodegasLocal=null;
			
			if(!this.getEsControlTabla()) {
				productosbodegasLocal=this.productosbodegas;
			} else {
				productosbodegasLocal=this.productosbodegasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosbodegas);
				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
							
				
				


				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosBodegas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosBodegas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosBodegasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasAnterior =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosbodegasAnterior =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
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
			
			ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
			
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
			
			


			
			ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosBodegasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosbodegas);
				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
								
						
				


				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosBodegas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosBodegas.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosbodegas);
				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
								
				
				


				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosBodegas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosBodegas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosBodegasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasAnterior =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosbodegasAnterior =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosbodegas);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosBodegasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasAnterior =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosbodegasAnterior =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosBodegasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productosbodegas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productosbodegas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosbodegas);
				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
							
				
				


				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosBodegas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosBodegas.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosBodegasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosbodegasAnterior =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productosbodegasAnterior =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
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
			
			ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
			
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
			
			


			
			ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosBodegasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productosbodegas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productosbodegas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosbodegas);
				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
								
				
				


				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosBodegas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosBodegas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosBodegasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasAnterior =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosbodegasAnterior =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosBodegasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productosbodegas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productosbodegas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosBodegasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosbodegas);
				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductosBodegas")) {
					jCheckBoxSeleccionarTodosProductosBodegasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductosBodegas")) {
					jCheckBoxSeleccionadosProductosBodegasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductosBodegas")) {
					
				}
				
				


				
				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosBodegas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosBodegas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productosbodegas);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productosbodegas);
				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
												
				
				


				
				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosBodegas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosBodegas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosBodegasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosbodegasAnterior =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productosbodegasAnterior =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosBodegasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosbodegas);
				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
				
				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
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
			
			ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
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
			
			


			
			ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosBodegasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosbodegas);
				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosBodegas.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosBodegas.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosbodegas);
				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
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
				
				


				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosBodegas.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosBodegas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosBodegasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosbodegasAnterior =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosbodegasAnterior =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductosBodegas")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductosBodegasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductosBodegas.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productosbodegas =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productosbodegas =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productosbodegas);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductosBodegas")) {
				
				}
				
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductosBodegas")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductosBodegas.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductosBodegas")) {
			
			}
			
			ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductosBodegas();
			
			ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
			
			if(sTipo.equals("NuevoProductosBodegas")) {
				jButtonNuevoProductosBodegasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductosBodegas")) {
				jButtonDuplicarProductosBodegasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductosBodegas")) {
				jButtonCopiarProductosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductosBodegas")) {
				jButtonVerFormProductosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductosBodegas")) {
				jButtonNuevoProductosBodegasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductosBodegas")) {
				jButtonModificarProductosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductosBodegas")) {
				jButtonActualizarProductosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductosBodegas")) {
				jButtonEliminarProductosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductosBodegas")) {
				jButtonGuardarCambiosProductosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductosBodegas")) {
				jButtonCancelarProductosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductosBodegas")) {
				jButtonCerrarProductosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductosBodegas")) {
				jButtonGuardarCambiosProductosBodegasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductosBodegas")) {
				jButtonNuevoGuardarCambiosProductosBodegasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductosBodegas")) {
				jButtonAbrirOrderByProductosBodegasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductosBodegas")) {
				jButtonRecargarInformacionProductosBodegasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductosBodegas")) {
				jButtonAnterioresProductosBodegasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductosBodegas")) {
				jButtonSiguientesProductosBodegasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductosBodegasBusqueda")) {
				this.jButtonidProductosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductosBodegasUpdate")) {
				this.jButtonid_empresaProductosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductosBodegasBusqueda")) {
				this.jButtonid_empresaProductosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductosBodegasUpdate")) {
				this.jButtonid_sucursalProductosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductosBodegasBusqueda")) {
				this.jButtonid_sucursalProductosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductosBodegasUpdate")) {
				this.jButtonid_bodegaProductosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductosBodegasBusqueda")) {
				this.jButtonid_bodegaProductosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProductosBodegasUpdate")) {
				this.jButtonid_lineaProductosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProductosBodegasBusqueda")) {
				this.jButtonid_lineaProductosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProductosBodegasUpdate")) {
				this.jButtonid_linea_grupoProductosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProductosBodegasBusqueda")) {
				this.jButtonid_linea_grupoProductosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProductosBodegasUpdate")) {
				this.jButtonid_linea_categoriaProductosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProductosBodegasBusqueda")) {
				this.jButtonid_linea_categoriaProductosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProductosBodegasUpdate")) {
				this.jButtonid_linea_marcaProductosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProductosBodegasBusqueda")) {
				this.jButtonid_linea_marcaProductosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalProductosBodegasBusqueda")) {
				this.jButtonnombre_sucursalProductosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaProductosBodegasBusqueda")) {
				this.jButtonnombre_lineaProductosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_grupoProductosBodegasBusqueda")) {
				this.jButtonnombre_linea_grupoProductosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_categoriaProductosBodegasBusqueda")) {
				this.jButtonnombre_linea_categoriaProductosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_marcaProductosBodegasBusqueda")) {
				this.jButtonnombre_linea_marcaProductosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProductosBodegasBusqueda")) {
				this.jButtoncodigoProductosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProductosBodegasBusqueda")) {
				this.jButtonnombreProductosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaProductosBodegasBusqueda")) {
				this.jButtonnombre_bodegaProductosBodegasBusquedaActionPerformed(evt);
			}
			
			ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductosBodegas();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductosBodegas")) {
				closingInternalFrameProductosBodegas();
				
			} else if(sTipo.equals("jButtonCancelarProductosBodegas")) {
				JInternalFrameBase jInternalFrameDetalleFormProductosBodegas = (JInternalFrameBase)evt.getSource();
	            	
	            ProductosBodegasBeanSwingJInternalFrame jInternalFrameParent=(ProductosBodegasBeanSwingJInternalFrame)jInternalFrameDetalleFormProductosBodegas.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductosBodegasActionPerformed(null);
			}
			
			ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productosbodegas,new Object(),this.productosbodegasParameterGeneral,this.productosbodegasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductosBodegas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductosBodegas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductosBodegas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productosbodegas)) {
			if(!esControlTabla) {
				if(ProductosBodegasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductosBodegas(this.productosbodegas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);			
				}
				
				if(this.productosbodegasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductosBodegas(this.productosbodegas,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductosBodegas(this.productosbodegasReturnGeneral,this.productosbodegasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productosbodegasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductosBodegas(classes,this.productosbodegasReturnGeneral,this.productosbodegasBean,false);
					}
						
					if(this.productosbodegasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductosBodegas(this.productosbodegasReturnGeneral.getProductosBodegas());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductosBodegas(this.productosbodegasReturnGeneral.getProductosBodegas());	
					}
						
					if(this.productosbodegasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductosBodegas(this.productosbodegasReturnGeneral.getProductosBodegas(),classes);//this.productosbodegasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductosBodegas(this.productosbodegas,classes);//this.productosbodegasBean);									
				}
			
				if(ProductosBodegasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductosBodegas(this.productosbodegas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosBodegas(this.productosbodegas);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productosbodegasAnterior!=null) {
						this.productosbodegas=this.productosbodegasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productosbodegasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productosbodegasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productosbodegasReturnGeneral.getProductosBodegas(),productosbodegasLogic.getProductosBodegass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productosbodegasReturnGeneral.getProductosBodegas(),this.productosbodegass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductosBodegas.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductosBodegas.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductosBodegas();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductosBodegas() throws Exception {
		
		ProductosBodegasModel productosbodegasModel=(ProductosBodegasModel)this.jTableDatosProductosBodegas.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productosbodegasModel.productosbodegass=this.productosbodegasLogic.getProductosBodegass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productosbodegasModel.productosbodegass=this.productosbodegass;
		}
		
		
		((ProductosBodegasModel) this.jTableDatosProductosBodegas.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductosBodegas() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductosbodegasAnterior(),this.productosbodegasLogic.getProductosBodegass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductosbodegasAnterior(),this.productosbodegass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductosBodegas();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductosBodegas(ProductosBodegas productosbodegas,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
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
										
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productosbodegas,new Object(),generalEntityParameterGeneral,this.productosbodegasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productosbodegasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductosBodegasConstantesFunciones.getClassesRelationshipsOfProductosBodegas(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductosBodegasConstantesFunciones.getClassesRelationshipsFromStringsOfProductosBodegas(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductosBodegas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productosbodegas,new Object(),generalEntityParameterGeneral,this.productosbodegasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductosBodegas(ProductosBodegasBean productosbodegasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductosBodegas(ArrayList<Classe> classes,ProductosBodegasReturnGeneral productosbodegasReturnGeneral,ProductosBodegasBean productosbodegasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductosBodegas(ProductosBodegas productosbodegas,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productosbodegas)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductosBodegas = new ProductosBodegasDetalleFormJInternalFrame(jDesktopPane,this.productosbodegasSessionBean.getConGuardarRelaciones(),this.productosbodegasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.setVisible(false);
		this.jInternalFrameDetalleFormProductosBodegas.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductosBodegas.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductosBodegas.productosbodegasLogic=this.productosbodegasLogic;
		
		this.cargarCombosFrameForeignKeyProductosBodegas("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductosBodegas();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductosBodegas();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductosBodegas("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductosBodegas();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductosBodegas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductosBodegas"));
		
		this.jInternalFrameDetalleFormProductosBodegas.jButtonModificarProductosBodegas.addActionListener(new ButtonActionListener(this,"ModificarProductosBodegas"));

		
		this.jInternalFrameDetalleFormProductosBodegas.jButtonModificarToolBarProductosBodegas.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductosBodegas"));
					
		this.jInternalFrameDetalleFormProductosBodegas.jMenuItemModificarProductosBodegas.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductosBodegas"));		
		
		
		
		this.jInternalFrameDetalleFormProductosBodegas.jButtonActualizarProductosBodegas.addActionListener (new ButtonActionListener(this,"ActualizarProductosBodegas"));
		
		
		this.jInternalFrameDetalleFormProductosBodegas.jButtonActualizarToolBarProductosBodegas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductosBodegas"));
						
		this.jInternalFrameDetalleFormProductosBodegas.jMenuItemActualizarProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductosBodegas"));		
		
		
		
		this.jInternalFrameDetalleFormProductosBodegas.jButtonEliminarProductosBodegas.addActionListener (new ButtonActionListener(this,"EliminarProductosBodegas"));
		
		
		this.jInternalFrameDetalleFormProductosBodegas.jButtonEliminarToolBarProductosBodegas.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductosBodegas"));
								
		this.jInternalFrameDetalleFormProductosBodegas.jMenuItemEliminarProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductosBodegas"));		
		
		
		
		this.jInternalFrameDetalleFormProductosBodegas.jButtonCancelarProductosBodegas.addActionListener (new ButtonActionListener(this,"CancelarProductosBodegas"));
		
		
		this.jInternalFrameDetalleFormProductosBodegas.jButtonCancelarToolBarProductosBodegas.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductosBodegas"));
					
		this.jInternalFrameDetalleFormProductosBodegas.jMenuItemCancelarProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductosBodegas"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductosBodegas.jMenuItemDetalleCerrarProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductosBodegas"));		
		
		
		
		this.jInternalFrameDetalleFormProductosBodegas.jButtonGuardarCambiosToolBarProductosBodegas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductosBodegas"));
		
		
		
		this.jInternalFrameDetalleFormProductosBodegas.jButtonGuardarCambiosToolBarProductosBodegas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductosBodegas"));
		
		
		
		this.jInternalFrameDetalleFormProductosBodegas.jComboBoxTiposAccionesFormularioProductosBodegas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductosBodegas"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonidProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"idProductosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_empresaProductosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_empresaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_sucursalProductosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_sucursalProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_bodegaProductosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_bodegaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_lineaProductosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProductosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_lineaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProductosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_linea_grupoProductosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_linea_grupoProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_linea_categoriaProductosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_linea_categoriaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_linea_marcaProductosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_linea_marcaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonnombre_sucursalProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonnombre_lineaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonnombre_linea_grupoProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonnombre_linea_categoriaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonnombre_linea_marcaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtoncodigoProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"codigoProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonnombreProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombreProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonnombre_bodegaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaProductosBodegasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductosBodegas.jTabbedPaneRelacionesProductosBodegas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductosBodegas"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductosBodegas"));
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosBodegas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductosBodegas"));
		}
		
		this.jTableDatosProductosBodegas.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductosBodegas"));
		
		this.jTableDatosProductosBodegas.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductosBodegas"));
		
		this.jButtonNuevoProductosBodegas.addActionListener(new ButtonActionListener(this,"NuevoProductosBodegas"));
		
		this.jButtonDuplicarProductosBodegas.addActionListener(new ButtonActionListener(this,"DuplicarProductosBodegas"));
		
		this.jButtonCopiarProductosBodegas.addActionListener(new ButtonActionListener(this,"CopiarProductosBodegas"));
		
		this.jButtonVerFormProductosBodegas.addActionListener(new ButtonActionListener(this,"VerFormProductosBodegas"));
		
		
		this.jButtonNuevoToolBarProductosBodegas.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductosBodegas"));
			
		this.jButtonDuplicarToolBarProductosBodegas.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductosBodegas"));
			
		this.jMenuItemNuevoProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductosBodegas"));
			
		this.jMenuItemDuplicarProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductosBodegas"));		
		
		
		this.jButtonNuevoRelacionesProductosBodegas.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductosBodegas"));
		
		
		this.jButtonNuevoRelacionesToolBarProductosBodegas.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductosBodegas"));
			
		this.jMenuItemNuevoRelacionesProductosBodegas.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductosBodegas"));		
		
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosBodegas.jButtonModificarProductosBodegas.addActionListener(new ButtonActionListener(this,"ModificarProductosBodegas"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosBodegas.jButtonModificarToolBarProductosBodegas.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductosBodegas"));
			
			this.jInternalFrameDetalleFormProductosBodegas.jMenuItemModificarProductosBodegas.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductosBodegas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductosBodegas.jButtonActualizarProductosBodegas.addActionListener (new ButtonActionListener(this,"ActualizarProductosBodegas"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosBodegas.jButtonActualizarToolBarProductosBodegas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductosBodegas"));
				
			this.jInternalFrameDetalleFormProductosBodegas.jMenuItemActualizarProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductosBodegas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosBodegas.jButtonEliminarProductosBodegas.addActionListener (new ButtonActionListener(this,"EliminarProductosBodegas"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosBodegas.jButtonEliminarToolBarProductosBodegas.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductosBodegas"));
						
			this.jInternalFrameDetalleFormProductosBodegas.jMenuItemEliminarProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductosBodegas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosBodegas.jButtonCancelarProductosBodegas.addActionListener (new ButtonActionListener(this,"CancelarProductosBodegas"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosBodegas.jButtonCancelarToolBarProductosBodegas.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductosBodegas"));
			
			this.jInternalFrameDetalleFormProductosBodegas.jMenuItemCancelarProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductosBodegas"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductosBodegas.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductosBodegas"));		
		
		
		this.jButtonCerrarProductosBodegas.addActionListener (new ButtonActionListener(this,"CerrarProductosBodegas"));
		
		
		this.jButtonCerrarToolBarProductosBodegas.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductosBodegas"));
			
		this.jMenuItemCerrarProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductosBodegas"));
			
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosBodegas.jMenuItemDetalleCerrarProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductosBodegas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosBodegas.jButtonGuardarCambiosProductosBodegas.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductosBodegas"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosBodegas.jButtonGuardarCambiosToolBarProductosBodegas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductosBodegas"));
		}
		
		this.jButtonCopiarToolBarProductosBodegas.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductosBodegas"));
			
		this.jButtonVerFormToolBarProductosBodegas.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductosBodegas"));
		
		this.jMenuItemGuardarCambiosProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductosBodegas"));
			
		this.jMenuItemCopiarProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductosBodegas"));		
		
		this.jMenuItemVerFormProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductosBodegas"));		
		
		
		this.jButtonGuardarCambiosTablaProductosBodegas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductosBodegas"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductosBodegas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductosBodegas"));
			
		this.jMenuItemGuardarCambiosTablaProductosBodegas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductosBodegas"));		
		
		
		
		this.jButtonRecargarInformacionProductosBodegas.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductosBodegas"));
					
		this.jButtonRecargarInformacionToolBarProductosBodegas.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductosBodegas"));
		
		this.jMenuItemRecargarInformacionProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductosBodegas"));		
		
		
		
		this.jButtonAnterioresProductosBodegas.addActionListener (new ButtonActionListener(this,"AnterioresProductosBodegas"));
		
		
		this.jButtonAnterioresToolBarProductosBodegas.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductosBodegas"));
		
		this.jMenuItemAnterioresProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductosBodegas"));		
		
		
		this.jButtonSiguientesProductosBodegas.addActionListener (new ButtonActionListener(this,"SiguientesProductosBodegas"));
		
		
		this.jButtonSiguientesToolBarProductosBodegas.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductosBodegas"));
			
		this.jMenuItemSiguientesProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductosBodegas"));
			
		this.jMenuItemAbrirOrderByProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductosBodegas"));
			
		this.jMenuItemMostrarOcultarProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductosBodegas"));
			
		this.jMenuItemDetalleAbrirOrderByProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductosBodegas"));
			
		this.jMenuItemDetalleMostarOcultarProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductosBodegas"));		
		
		
		this.jButtonNuevoGuardarCambiosProductosBodegas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductosBodegas"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductosBodegas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductosBodegas"));
			
		this.jMenuItemNuevoGuardarCambiosProductosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductosBodegas"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductosBodegas.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductosBodegas"));

		this.jCheckBoxSeleccionadosProductosBodegas.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductosBodegas"));
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosBodegas.jComboBoxTiposAccionesFormularioProductosBodegas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductosBodegas"));
		}
		
		
		this.jComboBoxTiposRelacionesProductosBodegas.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductosBodegas"));
			
		this.jComboBoxTiposAccionesProductosBodegas.addActionListener (new ButtonActionListener(this,"TiposAccionesProductosBodegas"));
					
		this.jComboBoxTiposSeleccionarProductosBodegas.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductosBodegas"));
			
		this.jTextFieldValorCampoGeneralProductosBodegas.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductosBodegas"));		
		
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonidProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"idProductosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_empresaProductosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_empresaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_sucursalProductosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_sucursalProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_bodegaProductosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_bodegaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_lineaProductosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProductosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_lineaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProductosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_linea_grupoProductosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_linea_grupoProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_linea_categoriaProductosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_linea_categoriaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_linea_marcaProductosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_linea_marcaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonnombre_sucursalProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonnombre_lineaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonnombre_linea_grupoProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonnombre_linea_categoriaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonnombre_linea_marcaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtoncodigoProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"codigoProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonnombreProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombreProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonnombre_bodegaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaProductosBodegasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProductosBodegasProductosBodegas.addActionListener(new ButtonActionListener(this,"BusquedaProductosBodegasProductosBodegas"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductosBodegas!=null) {
				this.jInternalFrameReporteDinamicoProductosBodegas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductosBodegas"));
				this.jInternalFrameReporteDinamicoProductosBodegas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductosBodegas"));
				this.jInternalFrameReporteDinamicoProductosBodegas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductosBodegas"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductosBodegas.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductosBodegas"));				
			//this.jButtonGenerarReporteDinamicoProductosBodegas.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductosBodegas"));
			//this.jButtonGenerarExcelReporteDinamicoProductosBodegas.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductosBodegas"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductosBodegas!=null) {
				this.jInternalFrameImportacionProductosBodegas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductosBodegas"));
				this.jInternalFrameImportacionProductosBodegas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductosBodegas"));
				this.jInternalFrameImportacionProductosBodegas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductosBodegas"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductosBodegas.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductosBodegas"));
			
			this.jButtonAbrirOrderByToolBarProductosBodegas.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductosBodegas"));			
			
			if(this.jInternalFrameOrderByProductosBodegas!=null) {
				this.jInternalFrameOrderByProductosBodegas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductosBodegas"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductosBodegas!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosBodegas.jTabbedPaneRelacionesProductosBodegas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductosBodegas"));
		
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
            		closingInternalFrameProductosBodegas();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductosBodegas.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductosBodegas = (JInternalFrameBase)event.getSource();
	            	
	            ProductosBodegasBeanSwingJInternalFrame jInternalFrameParent=(ProductosBodegasBeanSwingJInternalFrame)jInternalFrameDetalleFormProductosBodegas.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductosBodegasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductosBodegas.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductosBodegasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductosBodegas.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductosBodegas.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosBodegasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosBodegasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosBodegasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductosBodegas";
		inputMap = this.jButtonNuevoProductosBodegas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductosBodegas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductosBodegasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosBodegasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosBodegasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosBodegasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductosBodegas";
		inputMap = this.jButtonNuevoRelacionesProductosBodegas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductosBodegas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductosBodegasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductosBodegas";
		inputMap = this.jButtonModificarProductosBodegas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductosBodegas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductosBodegasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductosBodegas";
		inputMap = this.jButtonActualizarProductosBodegas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductosBodegas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductosBodegasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductosBodegas";
		inputMap = this.jButtonEliminarProductosBodegas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductosBodegas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductosBodegasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductosBodegas";
		inputMap = this.jButtonCancelarProductosBodegas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductosBodegas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductosBodegasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductosBodegas";
		inputMap = this.jButtonCerrarProductosBodegas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductosBodegas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductosBodegasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductosBodegas.jButtonGuardarCambiosProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductosBodegas";
		inputMap = this.jInternalFrameDetalleFormProductosBodegas.jButtonGuardarCambiosProductosBodegas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductosBodegas.jButtonGuardarCambiosProductosBodegas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductosBodegasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductosBodegas.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductosBodegasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductosBodegas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductosBodegasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductosBodegas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductosBodegasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductosBodegas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductosBodegasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonidProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"idProductosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_empresaProductosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_empresaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_sucursalProductosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_sucursalProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_bodegaProductosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_bodegaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_lineaProductosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProductosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_lineaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProductosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_linea_grupoProductosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_linea_grupoProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_linea_categoriaProductosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_linea_categoriaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_linea_marcaProductosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonid_linea_marcaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonnombre_sucursalProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonnombre_lineaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonnombre_linea_grupoProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonnombre_linea_categoriaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonnombre_linea_marcaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtoncodigoProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"codigoProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonnombreProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombreProductosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosBodegas.jButtonnombre_bodegaProductosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaProductosBodegasBusqueda"));
		
		
		this.jButtonBusquedaProductosBodegasProductosBodegas.addActionListener(new ButtonActionListener(this,"BusquedaProductosBodegasProductosBodegas"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductosBodegasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductosBodegas.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductosBodegas(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductosBodegas productosbodegasAux:this.productosbodegasLogic.getProductosBodegass()) {
					productosbodegasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosBodegas productosbodegasAux:productosbodegass) {
					productosbodegasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductosBodegasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductosBodegas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductosBodegas productosbodegasAux:this.productosbodegasLogic.getProductosBodegass()) {
						productosbodegasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductosBodegas productosbodegasAux:productosbodegass) {
						productosbodegasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductosBodegas productosbodegasAux:this.productosbodegasLogic.getProductosBodegass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductosBodegas productosbodegasAux:productosbodegass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductosBodegas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductosBodegas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductosBodegas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductosBodegas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductosBodegasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductosBodegas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductosBodegas.getSelectedRows();
			
			ProductosBodegas productosbodegasLocal=new ProductosBodegas();
			
			//this.seleccionarTodosProductosBodegas(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productosbodegasLocal =(ProductosBodegas) this.productosbodegasLogic.getProductosBodegass().toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productosbodegasLocal =(ProductosBodegas) this.productosbodegass.toArray()[this.jTableDatosProductosBodegas.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productosbodegasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductosBodegas productosbodegasAux:this.productosbodegasLogic.getProductosBodegass()) {
						productosbodegasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductosBodegas productosbodegasAux:productosbodegass) {
						productosbodegasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductosBodegas(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductosBodegas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductosBodegas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductosBodegas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductosBodegasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductosBodegasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductosBodegasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductosBodegas(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductosBodegas.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductosBodegas productosbodegasAux:this.productosbodegasLogic.getProductosBodegass()) {
				
						if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							productosbodegasAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							productosbodegasAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
							existe=true;
							productosbodegasAux.setnombre_linea_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
							existe=true;
							productosbodegasAux.setnombre_linea_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
							existe=true;
							productosbodegasAux.setnombre_linea_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							productosbodegasAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							productosbodegasAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							productosbodegasAux.setnombre_bodega(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosBodegas productosbodegasAux:productosbodegass) {
					
						if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							productosbodegasAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							productosbodegasAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
							existe=true;
							productosbodegasAux.setnombre_linea_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
							existe=true;
							productosbodegasAux.setnombre_linea_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
							existe=true;
							productosbodegasAux.setnombre_linea_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							productosbodegasAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							productosbodegasAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							productosbodegasAux.setnombre_bodega(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductosBodegas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductosBodegasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductosBodegas(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductosBodegas=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductosBodegas.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductosBodegas.jComboBoxTiposAccionesFormularioProductosBodegas.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductosBodegas) {				
					conSplash=true;//false;										
					
					//this.startProcessProductosBodegas(conSplash);
				
					this.generarReporteProductosBodegassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosBodegas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosBodegas.jComboBoxTiposAccionesFormularioProductosBodegas.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductosBodegassSeleccionados();
				//this.jComboBoxTiposAccionesProductosBodegas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductosBodegassSeleccionados(false);
				//this.jComboBoxTiposAccionesProductosBodegas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductosBodegassSeleccionados(true);
				//this.jComboBoxTiposAccionesProductosBodegas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductosBodegas();
				
				this.exportarProductosBodegassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosBodegas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosBodegas.jComboBoxTiposAccionesFormularioProductosBodegas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductosBodegass();
				//this.importarProductosBodegass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosBodegas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosBodegas.jComboBoxTiposAccionesFormularioProductosBodegas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductosBodegas();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductosBodegassSeleccionados();
				//this.jComboBoxTiposAccionesProductosBodegas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Productos Bodegas", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductosBodegas();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductosBodegas)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductosBodegas(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Productos Bodegas",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosBodegas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosBodegas.jComboBoxTiposAccionesFormularioProductosBodegas.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductosBodegasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductosBodegas) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductosBodegas(conSplash);
					
						//this.actualizarParametrosGeneralProductosBodegas();
						
						this.generarReporteProcesoAccionProductosBodegassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductosBodegas.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductosBodegas.jComboBoxTiposAccionesFormularioProductosBodegas.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductosBodegasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Productos BodegasES SELECCIONADOS?", "MANTENIMIENTO DE Productos Bodegas", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductosBodegas();
				
						this.actualizarParametrosGeneralProductosBodegas();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productosbodegasReturnGeneral=productosbodegasLogic.procesarAccionProductosBodegassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productosbodegasLogic.getProductosBodegass(),this.productosbodegasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductosBodegasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductosBodegas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductosBodegas.jComboBoxTiposAccionesFormularioProductosBodegas.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductosBodegas();
					
					ProductosBodegasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductosBodegasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductosBodegas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductosBodegas.jComboBoxTiposAccionesFormularioProductosBodegas.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductosBodegas(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductosBodegasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductosBodegas();
			
			if(this.jInternalFrameDetalleFormProductosBodegas==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductosBodegas> productosbodegassSeleccionados=new ArrayList<ProductosBodegas>();		
			ProductosBodegas productosbodegas=new ProductosBodegas();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductosBodegas(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductosBodegas.getSelectedItem();
			
			
			
			
			productosbodegassSeleccionados=this.getProductosBodegassSeleccionados(true);
			//this.sTipoAccion;
			
			if(productosbodegassSeleccionados.size()==1) {
				for(ProductosBodegas productosbodegasAux:productosbodegassSeleccionados) {
					productosbodegas=productosbodegasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductosBodegas();
			
      		//this.finishProcessProductosBodegas(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductosBodegasReturnGeneral() throws Exception {
		if(this.productosbodegasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productosbodegasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productosbodegasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productosbodegasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productosbodegasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productosbodegasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductosBodegas(false);
		}
		
		if(this.productosbodegasReturnGeneral.getConRetornoLista() || this.productosbodegasReturnGeneral.getConRetornoObjeto()) {
			if(this.productosbodegasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productosbodegasLogic.setProductosBodegass(this.productosbodegasReturnGeneral.getProductosBodegass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProductosBodegas(false);
		}
	}
	
	public void actualizarParametrosGeneralProductosBodegas() throws Exception {
		
		
	}
	
	public ArrayList<ProductosBodegas> getProductosBodegassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductosBodegas> productosbodegassSeleccionados=new ArrayList<ProductosBodegas>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductosBodegas) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductosBodegas productosbodegasAux:productosbodegasLogic.getProductosBodegass()) {
					if(productosbodegasAux.getIsSelected()) {
						productosbodegassSeleccionados.add(productosbodegasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosBodegas productosbodegasAux:this.productosbodegass) {
					if(productosbodegasAux.getIsSelected()) {
						productosbodegassSeleccionados.add(productosbodegasAux);				
					}
				}
			}
			
			if(productosbodegassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productosbodegassSeleccionados.addAll(this.productosbodegasLogic.getProductosBodegass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productosbodegassSeleccionados.addAll(this.productosbodegass);				
					}
				}
			}
		} else {
			productosbodegassSeleccionados.add(this.productosbodegas);
		}
		
		return productosbodegassSeleccionados;
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
	
	public void generarReporteProductosBodegassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductosBodegassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductosBodegassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductosBodegassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductosBodegassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Productos Bodegas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductosBodegassSeleccionados() throws Exception {
		ArrayList<ProductosBodegas> productosbodegassSeleccionados=new ArrayList<ProductosBodegas>();		
		
		productosbodegassSeleccionados=this.getProductosBodegassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductosBodegass("Todos",productosbodegassSeleccionados);
		
	}	
	
	public void generarReporteNormalProductosBodegassSeleccionados() throws Exception {
		ArrayList<ProductosBodegas> productosbodegassSeleccionados=new ArrayList<ProductosBodegas>();		
		
		productosbodegassSeleccionados=this.getProductosBodegassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductosBodegass("Todos",productosbodegassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductosBodegassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductosBodegas> productosbodegassSeleccionados=new ArrayList<ProductosBodegas>();
		
		productosbodegassSeleccionados=this.getProductosBodegassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductosBodegass("Todos",productosbodegassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductosBodegassSeleccionados() throws Exception {
		ArrayList<ProductosBodegas> productosbodegassSeleccionados=new ArrayList<ProductosBodegas>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductosBodegas();
		
		
		productosbodegassSeleccionados=this.getProductosBodegassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductosBodegas();
		
		
		//this.generarReporteProductosBodegass("Todos",productosbodegassSeleccionados ,productosbodegasImplementable,productosbodegasImplementableHome);
	}
	
	public void mostrarImportacionProductosBodegass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductosBodegas();
		
		this.abrirFrameImportacionProductosBodegas();		
		
			
		//this.generarReporteProductosBodegass("Todos",productosbodegassSeleccionados ,productosbodegasImplementable,productosbodegasImplementableHome);
	}
	
	public void importarProductosBodegass() throws Exception {		
	
	}
	
	public void exportarProductosBodegassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductosBodegassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductosBodegassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductosBodegassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Productos Bodegas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductosBodegassSeleccionados() throws Exception {
		ArrayList<ProductosBodegas> productosbodegassSeleccionados=new ArrayList<ProductosBodegas>();		
		
		productosbodegassSeleccionados=this.getProductosBodegassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosbodegas."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductosBodegas(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductosBodegas productosbodegasAux:productosbodegassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductosBodegas(productosbodegasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productosbodegasAux.setsDetalleGeneralEntityReporte(productosbodegasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosbodegasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Bodegas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductosBodegas(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductosBodegasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosBodegasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosBodegasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosBodegasConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosBodegasConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosBodegasConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosBodegasConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosBodegasConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosBodegasConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosBodegasConstantesFunciones.LABEL_NOMBRESUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosBodegasConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosBodegasConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosBodegasConstantesFunciones.LABEL_NOMBREBODEGA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductosBodegas(ProductosBodegas productosbodegas,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productosbodegas.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productosbodegas.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosbodegas.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosbodegas.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosbodegas.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosbodegas.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosbodegas.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosbodegas.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosbodegas.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosbodegas.getnombre_sucursal();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosbodegas.getnombre_linea();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosbodegas.getnombre_linea_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosbodegas.getnombre_linea_categoria();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosbodegas.getnombre_linea_marca();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosbodegas.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosbodegas.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosbodegas.getnombre_bodega();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductosBodegassSeleccionados() throws Exception {
		ArrayList<ProductosBodegas> productosbodegassSeleccionados=new ArrayList<ProductosBodegas>();		
		
		productosbodegassSeleccionados=this.getProductosBodegassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosbodegas.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductosBodegass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductosBodegas(row);				
				iRow++;
			}				
			
			for(ProductosBodegas productosbodegasAux:productosbodegassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductosBodegas(productosbodegasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosbodegasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Bodegas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductosBodegassSeleccionados() throws Exception {
		ArrayList<ProductosBodegas> productosbodegassSeleccionados=new ArrayList<ProductosBodegas>();		
		
		productosbodegassSeleccionados=this.getProductosBodegassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosbodegas.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productosbodegass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productosbodegas");
			//elementRoot.appendChild(element);
		
			for(ProductosBodegas productosbodegasAux:productosbodegassSeleccionados) {
				element = document.createElement("productosbodegas");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductosBodegas(productosbodegasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosbodegasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Bodegas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductosBodegas(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_NOMBRESUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosBodegasConstantesFunciones.LABEL_NOMBREBODEGA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductosBodegas(ProductosBodegas productosbodegas,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productosbodegas.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productosbodegas.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosbodegas.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosbodegas.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosbodegas.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosbodegas.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosbodegas.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosbodegas.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosbodegas.getnombre_sucursal());
		cell = row.createCell(iColumn++);cell.setCellValue(productosbodegas.getnombre_linea());
		cell = row.createCell(iColumn++);cell.setCellValue(productosbodegas.getnombre_linea_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(productosbodegas.getnombre_linea_categoria());
		cell = row.createCell(iColumn++);cell.setCellValue(productosbodegas.getnombre_linea_marca());
		cell = row.createCell(iColumn++);cell.setCellValue(productosbodegas.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(productosbodegas.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(productosbodegas.getnombre_bodega());				
	}
	
	public void setFilaDatosExportarXmlProductosBodegas(ProductosBodegas productosbodegas,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductosBodegasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productosbodegas.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductosBodegasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productosbodegas.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProductosBodegasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(productosbodegas.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProductosBodegasConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(productosbodegas.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(ProductosBodegasConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(productosbodegas.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementlinea_descripcion = document.createElement(ProductosBodegasConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(productosbodegas.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(ProductosBodegasConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(productosbodegas.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(ProductosBodegasConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(productosbodegas.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(ProductosBodegasConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(productosbodegas.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementnombre_sucursal = document.createElement(ProductosBodegasConstantesFunciones.NOMBRESUCURSAL);
		elementnombre_sucursal.appendChild(document.createTextNode(productosbodegas.getnombre_sucursal().trim()));
		element.appendChild(elementnombre_sucursal);

		Element elementnombre_linea = document.createElement(ProductosBodegasConstantesFunciones.NOMBRELINEA);
		elementnombre_linea.appendChild(document.createTextNode(productosbodegas.getnombre_linea().trim()));
		element.appendChild(elementnombre_linea);

		Element elementnombre_linea_grupo = document.createElement(ProductosBodegasConstantesFunciones.NOMBRELINEAGRUPO);
		elementnombre_linea_grupo.appendChild(document.createTextNode(productosbodegas.getnombre_linea_grupo().trim()));
		element.appendChild(elementnombre_linea_grupo);

		Element elementnombre_linea_categoria = document.createElement(ProductosBodegasConstantesFunciones.NOMBRELINEACATEGORIA);
		elementnombre_linea_categoria.appendChild(document.createTextNode(productosbodegas.getnombre_linea_categoria().trim()));
		element.appendChild(elementnombre_linea_categoria);

		Element elementnombre_linea_marca = document.createElement(ProductosBodegasConstantesFunciones.NOMBRELINEAMARCA);
		elementnombre_linea_marca.appendChild(document.createTextNode(productosbodegas.getnombre_linea_marca().trim()));
		element.appendChild(elementnombre_linea_marca);

		Element elementcodigo = document.createElement(ProductosBodegasConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(productosbodegas.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ProductosBodegasConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(productosbodegas.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementnombre_bodega = document.createElement(ProductosBodegasConstantesFunciones.NOMBREBODEGA);
		elementnombre_bodega.appendChild(document.createTextNode(productosbodegas.getnombre_bodega().trim()));
		element.appendChild(elementnombre_bodega);
	}
	
	public void generarReporteGroupGenericoProductosBodegassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductosBodegas> productosbodegassSeleccionados=new ArrayList<ProductosBodegas>();
		
		productosbodegassSeleccionados=this.getProductosBodegassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductosBodegas(productosbodegassSeleccionados);
		
		this.generarReporteProductosBodegass("Todos",productosbodegassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductosBodegas(ArrayList<ProductosBodegas> productosbodegassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductosBodegas productosbodegasAux:productosbodegassSeleccionados) {
				productosbodegasAux.setsDetalleGeneralEntityReporte(productosbodegasAux.toString());
			
				if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					productosbodegasAux.setsDescripcionGeneralEntityReporte1(productosbodegasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					productosbodegasAux.setsDescripcionGeneralEntityReporte1(productosbodegasAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					productosbodegasAux.setsDescripcionGeneralEntityReporte1(productosbodegasAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					productosbodegasAux.setsDescripcionGeneralEntityReporte1(productosbodegasAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					productosbodegasAux.setsDescripcionGeneralEntityReporte1(productosbodegasAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					productosbodegasAux.setsDescripcionGeneralEntityReporte1(productosbodegasAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					productosbodegasAux.setsDescripcionGeneralEntityReporte1(productosbodegasAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
					existe=true;
					productosbodegasAux.setsDescripcionGeneralEntityReporte1(productosbodegasAux.getnombre_sucursal());
				}
				 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEA)) {
					existe=true;
					productosbodegasAux.setsDescripcionGeneralEntityReporte1(productosbodegasAux.getnombre_linea());
				}
				 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
					existe=true;
					productosbodegasAux.setsDescripcionGeneralEntityReporte1(productosbodegasAux.getnombre_linea_grupo());
				}
				 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
					existe=true;
					productosbodegasAux.setsDescripcionGeneralEntityReporte1(productosbodegasAux.getnombre_linea_categoria());
				}
				 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
					existe=true;
					productosbodegasAux.setsDescripcionGeneralEntityReporte1(productosbodegasAux.getnombre_linea_marca());
				}
				 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					productosbodegasAux.setsDescripcionGeneralEntityReporte1(productosbodegasAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					productosbodegasAux.setsDescripcionGeneralEntityReporte1(productosbodegasAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ProductosBodegasConstantesFunciones.LABEL_NOMBREBODEGA)) {
					existe=true;
					productosbodegasAux.setsDescripcionGeneralEntityReporte1(productosbodegasAux.getnombre_bodega());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductosBodegas(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductosBodegas=true;
				this.isVisibilidadCeldaNuevoRelacionesProductosBodegas=true;
				this.isVisibilidadCeldaGuardarCambiosProductosBodegas=true;
			}
			
			this.isVisibilidadCeldaModificarProductosBodegas=false;
			this.isVisibilidadCeldaActualizarProductosBodegas=false;
			this.isVisibilidadCeldaEliminarProductosBodegas=false;
			this.isVisibilidadCeldaCancelarProductosBodegas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosBodegas=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosBodegas=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductosBodegas=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosBodegas=false;
			this.isVisibilidadCeldaGuardarCambiosProductosBodegas=false;
			this.isVisibilidadCeldaModificarProductosBodegas=false;
			this.isVisibilidadCeldaActualizarProductosBodegas=true;
			this.isVisibilidadCeldaEliminarProductosBodegas=false;
			this.isVisibilidadCeldaCancelarProductosBodegas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosBodegas=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosBodegas=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductosBodegas=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosBodegas=false;
			this.isVisibilidadCeldaGuardarCambiosProductosBodegas=false;
			this.isVisibilidadCeldaModificarProductosBodegas=false;
			this.isVisibilidadCeldaActualizarProductosBodegas=true;
			this.isVisibilidadCeldaEliminarProductosBodegas=true;
			this.isVisibilidadCeldaCancelarProductosBodegas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosBodegas=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosBodegas=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductosBodegas=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosBodegas=false;
			this.isVisibilidadCeldaGuardarCambiosProductosBodegas=false;
			this.isVisibilidadCeldaModificarProductosBodegas=false;
			this.isVisibilidadCeldaActualizarProductosBodegas=true;
			this.isVisibilidadCeldaEliminarProductosBodegas=false;
			this.isVisibilidadCeldaCancelarProductosBodegas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosBodegas=false;
				} else {
					this.isVisibilidadCeldaGuardarProductosBodegas=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductosBodegas=true;
			this.isVisibilidadCeldaNuevoRelacionesProductosBodegas=true;
			this.isVisibilidadCeldaGuardarCambiosProductosBodegas=true;
			this.isVisibilidadCeldaModificarProductosBodegas=false;
			this.isVisibilidadCeldaActualizarProductosBodegas=false;
			this.isVisibilidadCeldaEliminarProductosBodegas=false;
			this.isVisibilidadCeldaCancelarProductosBodegas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosBodegas=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosBodegas=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductosBodegas=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosBodegas=false;
			this.isVisibilidadCeldaGuardarCambiosProductosBodegas=false;
			this.isVisibilidadCeldaActualizarProductosBodegas=false;
			this.isVisibilidadCeldaEliminarProductosBodegas=false;
			this.isVisibilidadCeldaCancelarProductosBodegas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosBodegas=false;
				} else {
					this.isVisibilidadCeldaGuardarProductosBodegas=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductosBodegas=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosBodegas=false;
			this.isVisibilidadCeldaGuardarCambiosProductosBodegas=false;
			this.isVisibilidadCeldaModificarProductosBodegas=true;
			this.isVisibilidadCeldaActualizarProductosBodegas=false;
			this.isVisibilidadCeldaEliminarProductosBodegas=false;
			this.isVisibilidadCeldaCancelarProductosBodegas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosBodegas=false;
				} else {
					this.isVisibilidadCeldaGuardarProductosBodegas=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductosBodegasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductosBodegas=true;
			this.isVisibilidadCeldaNuevoRelacionesProductosBodegas=true;
			this.isVisibilidadCeldaGuardarCambiosProductosBodegas=true;
		} else {
			this.actualizarEstadoPanelsProductosBodegas(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductosBodegas=false;
			//this.isVisibilidadCeldaVerFormProductosBodegas=false;
			this.isVisibilidadCeldaDuplicarProductosBodegas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productosbodegasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductosBodegas=false;
		} else {
			this.isVisibilidadCeldaNuevoProductosBodegas=false;
			this.isVisibilidadCeldaGuardarCambiosProductosBodegas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productosbodegasSessionBean.getEsGuardarRelacionado()) {
			if(!productosbodegasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductosBodegas=false;												
			}
			
			this.jButtonCerrarProductosBodegas.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductosBodegas=false;
		}
		
		if(!this.permiteMantenimiento(this.productosbodegas)) {
			this.isVisibilidadCeldaActualizarProductosBodegas=false;
			this.isVisibilidadCeldaEliminarProductosBodegas=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProductosBodegas=false;
		this.isVisibilidadCeldaNuevoRelacionesProductosBodegas=false;
		this.isVisibilidadCeldaGuardarCambiosProductosBodegas=false;
		//this.isVisibilidadCeldaModificarProductosBodegas=true;
		this.isVisibilidadCeldaActualizarProductosBodegas=false;
		this.isVisibilidadCeldaEliminarProductosBodegas=false;
		//this.isVisibilidadCeldaCancelarProductosBodegas=true;			
		this.isVisibilidadCeldaGuardarProductosBodegas=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductosBodegas() {
	}
	
	public void actualizarEstadoPanelsProductosBodegas(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductosBodegas!=null) {
				this.jScrollPanelDatosEdicionProductosBodegas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosBodegas!=null) {
				this.jTabbedPaneBusquedasProductosBodegas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosBodegas!=null) {
				this.jScrollPanelDatosProductosBodegas.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosBodegas!=null) {
				this.jPanelPaginacionProductosBodegas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosBodegas!=null) {
				this.jPanelParametrosReportesProductosBodegas.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductosBodegas!=null) {
				this.jScrollPanelDatosEdicionProductosBodegas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosBodegas!=null) {
				this.jTabbedPaneBusquedasProductosBodegas.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductosBodegas!=null) {
				this.jScrollPanelDatosProductosBodegas.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductosBodegas!=null) {
				this.jPanelPaginacionProductosBodegas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductosBodegas!=null) {
				this.jPanelParametrosReportesProductosBodegas.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductosBodegas!=null) {
				this.jScrollPanelDatosEdicionProductosBodegas.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosBodegas!=null) {
				this.jTabbedPaneBusquedasProductosBodegas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductosBodegas!=null) {
				this.jScrollPanelDatosProductosBodegas.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductosBodegas!=null) {
				this.jPanelPaginacionProductosBodegas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductosBodegas!=null) {
				this.jPanelParametrosReportesProductosBodegas.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductosBodegas!=null) {
				this.jScrollPanelDatosEdicionProductosBodegas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosBodegas!=null) {
				this.jTabbedPaneBusquedasProductosBodegas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductosBodegas!=null) {
				this.jScrollPanelDatosProductosBodegas.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductosBodegas!=null) {
				this.jPanelPaginacionProductosBodegas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductosBodegas!=null) {
				this.jPanelParametrosReportesProductosBodegas.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductosBodegas!=null) {
				this.jScrollPanelDatosEdicionProductosBodegas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosBodegas!=null) {
				this.jTabbedPaneBusquedasProductosBodegas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosBodegas!=null) {
				this.jScrollPanelDatosProductosBodegas.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosBodegas!=null) {
				this.jPanelPaginacionProductosBodegas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosBodegas!=null) {
				this.jPanelParametrosReportesProductosBodegas.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductosBodegas!=null) {
				this.jScrollPanelDatosEdicionProductosBodegas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosBodegas!=null) {
				this.jTabbedPaneBusquedasProductosBodegas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosBodegas!=null) {
				this.jScrollPanelDatosProductosBodegas.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosBodegas!=null) {
				this.jPanelPaginacionProductosBodegas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosBodegas!=null) {
				this.jPanelParametrosReportesProductosBodegas.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductosBodegas!=null) {
				this.jScrollPanelDatosEdicionProductosBodegas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosBodegas!=null) {
				this.jTabbedPaneBusquedasProductosBodegas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosBodegas!=null) {
				this.jScrollPanelDatosProductosBodegas.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosBodegas!=null) {
				this.jPanelPaginacionProductosBodegas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosBodegas!=null) {
				this.jPanelParametrosReportesProductosBodegas.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductosBodegas!=null) {
					this.jTabbedPaneBusquedasProductosBodegas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductosBodegas!=null) {
				this.jPanelParametrosReportesProductosBodegas.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productosbodegasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosBodegas!=null) {
				this.jTabbedPaneBusquedasProductosBodegas.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductosBodegas!=null) {
				this.jPanelParametrosReportesProductosBodegas.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaProductosBodegas=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaProductosBodegas) {this.jTabbedPaneBusquedasProductosBodegas.remove(jPanelBusquedaProductosBodegasProductosBodegas);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaProductosBodegas=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaProductosBodegas) {this.jTabbedPaneBusquedasProductosBodegas.remove(jPanelBusquedaProductosBodegasProductosBodegas);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadBusquedaProductosBodegas=isParaBodega;
			if(!this.isVisibilidadBusquedaProductosBodegas) {this.jTabbedPaneBusquedasProductosBodegas.remove(jPanelBusquedaProductosBodegasProductosBodegas);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaProductosBodegas=isParaLinea;
			if(!this.isVisibilidadBusquedaProductosBodegas) {this.jTabbedPaneBusquedasProductosBodegas.remove(jPanelBusquedaProductosBodegasProductosBodegas);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaProductosBodegas=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaProductosBodegas) {this.jTabbedPaneBusquedasProductosBodegas.remove(jPanelBusquedaProductosBodegasProductosBodegas);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaProductosBodegas=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaProductosBodegas) {this.jTabbedPaneBusquedasProductosBodegas.remove(jPanelBusquedaProductosBodegasProductosBodegas);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaProductosBodegas=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaProductosBodegas) {this.jTabbedPaneBusquedasProductosBodegas.remove(jPanelBusquedaProductosBodegasProductosBodegas);}
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
			
			this.inicializarActualizarBindingTablaProductosBodegas(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductosBodegas() {
		this.updateBorderResaltarBusquedasFormularioProductosBodegas();
		this.updateVisibilidadBusquedasFormularioProductosBodegas();
		this.updateHabilitarBusquedasFormularioProductosBodegas();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductosBodegas() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductosBodegas.getComponents().length>0) {
	

		if(this.productosbodegasConstantesFunciones.resaltarBusquedaProductosBodegasProductosBodegas!=null) {
			index= this.jTabbedPaneBusquedasProductosBodegas.indexOfComponent(this.jPanelBusquedaProductosBodegasProductosBodegas);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductosBodegas.getComponent(index);
				jPanel.setBorder(this.productosbodegasConstantesFunciones.resaltarBusquedaProductosBodegasProductosBodegas);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductosBodegas() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductosBodegas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductosBodegas.indexOfComponent(this.jPanelBusquedaProductosBodegasProductosBodegas);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductosBodegas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productosbodegasConstantesFunciones.mostrarBusquedaProductosBodegasProductosBodegas);
			if(!this.productosbodegasConstantesFunciones.mostrarBusquedaProductosBodegasProductosBodegas && index>-1) {
				this.jTabbedPaneBusquedasProductosBodegas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductosBodegas() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductosBodegas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductosBodegas.indexOfComponent(this.jPanelBusquedaProductosBodegasProductosBodegas);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductosBodegas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productosbodegasConstantesFunciones.activarBusquedaProductosBodegasProductosBodegas);
				this.jTabbedPaneBusquedasProductosBodegas.setEnabledAt(index,this.productosbodegasConstantesFunciones.activarBusquedaProductosBodegasProductosBodegas);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductosBodegas(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProductosBodegas")) {
			index= this.jTabbedPaneBusquedasProductosBodegas.indexOfComponent(this.jPanelBusquedaProductosBodegasProductosBodegas);

			this.jTabbedPaneBusquedasProductosBodegas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductosBodegas.getComponent(index);

			this.productosbodegasConstantesFunciones.setResaltarBusquedaProductosBodegasProductosBodegas(resaltar);

			jPanel.setBorder(this.productosbodegasConstantesFunciones.resaltarBusquedaProductosBodegasProductosBodegas);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductosBodegas.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductosBodegas() throws Exception {

		if(this.jInternalFrameDetalleFormProductosBodegas==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductosBodegas();
		this.updateVisibilidadResaltarControlesFormularioProductosBodegas();
		this.updateHabilitarResaltarControlesFormularioProductosBodegas();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductosBodegas() throws Exception {
		if(this.jInternalFrameDetalleFormProductosBodegas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productosbodegasConstantesFunciones.resaltaridProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas!=null) {this.jInternalFrameDetalleFormProductosBodegas.jLabelidProductosBodegas.setBorder(this.productosbodegasConstantesFunciones.resaltaridProductosBodegas);}
		if(this.productosbodegasConstantesFunciones.resaltarid_empresaProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas!=null) {this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_empresaProductosBodegas.setBorder(this.productosbodegasConstantesFunciones.resaltarid_empresaProductosBodegas);}
		if(this.productosbodegasConstantesFunciones.resaltarid_sucursalProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas!=null) {this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_sucursalProductosBodegas.setBorder(this.productosbodegasConstantesFunciones.resaltarid_sucursalProductosBodegas);}
		if(this.productosbodegasConstantesFunciones.resaltarid_bodegaProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas!=null) {this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_bodegaProductosBodegas.setBorder(this.productosbodegasConstantesFunciones.resaltarid_bodegaProductosBodegas);}
		if(this.productosbodegasConstantesFunciones.resaltarid_lineaProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas!=null) {this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_lineaProductosBodegas.setBorder(this.productosbodegasConstantesFunciones.resaltarid_lineaProductosBodegas);}
		if(this.productosbodegasConstantesFunciones.resaltarid_linea_grupoProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas!=null) {this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_grupoProductosBodegas.setBorder(this.productosbodegasConstantesFunciones.resaltarid_linea_grupoProductosBodegas);}
		if(this.productosbodegasConstantesFunciones.resaltarid_linea_categoriaProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas!=null) {this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_categoriaProductosBodegas.setBorder(this.productosbodegasConstantesFunciones.resaltarid_linea_categoriaProductosBodegas);}
		if(this.productosbodegasConstantesFunciones.resaltarid_linea_marcaProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas!=null) {this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_marcaProductosBodegas.setBorder(this.productosbodegasConstantesFunciones.resaltarid_linea_marcaProductosBodegas);}
		if(this.productosbodegasConstantesFunciones.resaltarnombre_sucursalProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas!=null) {this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_sucursalProductosBodegas.setBorder(this.productosbodegasConstantesFunciones.resaltarnombre_sucursalProductosBodegas);}
		if(this.productosbodegasConstantesFunciones.resaltarnombre_lineaProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas!=null) {this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_lineaProductosBodegas.setBorder(this.productosbodegasConstantesFunciones.resaltarnombre_lineaProductosBodegas);}
		if(this.productosbodegasConstantesFunciones.resaltarnombre_linea_grupoProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas!=null) {this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_grupoProductosBodegas.setBorder(this.productosbodegasConstantesFunciones.resaltarnombre_linea_grupoProductosBodegas);}
		if(this.productosbodegasConstantesFunciones.resaltarnombre_linea_categoriaProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas!=null) {this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_categoriaProductosBodegas.setBorder(this.productosbodegasConstantesFunciones.resaltarnombre_linea_categoriaProductosBodegas);}
		if(this.productosbodegasConstantesFunciones.resaltarnombre_linea_marcaProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas!=null) {this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_marcaProductosBodegas.setBorder(this.productosbodegasConstantesFunciones.resaltarnombre_linea_marcaProductosBodegas);}
		if(this.productosbodegasConstantesFunciones.resaltarcodigoProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas!=null) {this.jInternalFrameDetalleFormProductosBodegas.jTextFieldcodigoProductosBodegas.setBorder(this.productosbodegasConstantesFunciones.resaltarcodigoProductosBodegas);}
		if(this.productosbodegasConstantesFunciones.resaltarnombreProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas!=null) {this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombreProductosBodegas.setBorder(this.productosbodegasConstantesFunciones.resaltarnombreProductosBodegas);}
		if(this.productosbodegasConstantesFunciones.resaltarnombre_bodegaProductosBodegas!=null && this.jInternalFrameDetalleFormProductosBodegas!=null) {this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_bodegaProductosBodegas.setBorder(this.productosbodegasConstantesFunciones.resaltarnombre_bodegaProductosBodegas);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductosBodegas() throws Exception {		
		if(this.jInternalFrameDetalleFormProductosBodegas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
	
		//this.jInternalFrameDetalleFormProductosBodegas.jLabelidProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostraridProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jPanelidProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostraridProductosBodegas);
		//this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_empresaProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarid_empresaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jPanelid_empresaProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarid_empresaProductosBodegas);
		//this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_sucursalProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarid_sucursalProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jPanelid_sucursalProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarid_sucursalProductosBodegas);
		//this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_bodegaProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarid_bodegaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jPanelid_bodegaProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarid_bodegaProductosBodegas);
		//this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_lineaProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarid_lineaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jPanelid_lineaProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarid_lineaProductosBodegas);
		//this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_grupoProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarid_linea_grupoProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jPanelid_linea_grupoProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarid_linea_grupoProductosBodegas);
		//this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_categoriaProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarid_linea_categoriaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jPanelid_linea_categoriaProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarid_linea_categoriaProductosBodegas);
		//this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_marcaProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarid_linea_marcaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jPanelid_linea_marcaProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarid_linea_marcaProductosBodegas);
		//this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_sucursalProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarnombre_sucursalProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jPanelnombre_sucursalProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarnombre_sucursalProductosBodegas);
		//this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_lineaProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarnombre_lineaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jPanelnombre_lineaProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarnombre_lineaProductosBodegas);
		//this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_grupoProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarnombre_linea_grupoProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jPanelnombre_linea_grupoProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarnombre_linea_grupoProductosBodegas);
		//this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_categoriaProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarnombre_linea_categoriaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jPanelnombre_linea_categoriaProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarnombre_linea_categoriaProductosBodegas);
		//this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_marcaProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarnombre_linea_marcaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jPanelnombre_linea_marcaProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarnombre_linea_marcaProductosBodegas);
		//this.jInternalFrameDetalleFormProductosBodegas.jTextFieldcodigoProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarcodigoProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jPanelcodigoProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarcodigoProductosBodegas);
		//this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombreProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarnombreProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jPanelnombreProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarnombreProductosBodegas);
		//this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_bodegaProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarnombre_bodegaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jPanelnombre_bodegaProductosBodegas.setVisible(this.productosbodegasConstantesFunciones.mostrarnombre_bodegaProductosBodegas);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductosBodegas() throws Exception {
		if(this.jInternalFrameDetalleFormProductosBodegas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductosBodegas!=null) {
	
		this.jInternalFrameDetalleFormProductosBodegas.jLabelidProductosBodegas.setEnabled(this.productosbodegasConstantesFunciones.activaridProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_empresaProductosBodegas.setEnabled(this.productosbodegasConstantesFunciones.activarid_empresaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_sucursalProductosBodegas.setEnabled(this.productosbodegasConstantesFunciones.activarid_sucursalProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_bodegaProductosBodegas.setEnabled(this.productosbodegasConstantesFunciones.activarid_bodegaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_lineaProductosBodegas.setEnabled(this.productosbodegasConstantesFunciones.activarid_lineaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_grupoProductosBodegas.setEnabled(this.productosbodegasConstantesFunciones.activarid_linea_grupoProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_categoriaProductosBodegas.setEnabled(this.productosbodegasConstantesFunciones.activarid_linea_categoriaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jComboBoxid_linea_marcaProductosBodegas.setEnabled(this.productosbodegasConstantesFunciones.activarid_linea_marcaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_sucursalProductosBodegas.setEnabled(this.productosbodegasConstantesFunciones.activarnombre_sucursalProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_lineaProductosBodegas.setEnabled(this.productosbodegasConstantesFunciones.activarnombre_lineaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_grupoProductosBodegas.setEnabled(this.productosbodegasConstantesFunciones.activarnombre_linea_grupoProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_categoriaProductosBodegas.setEnabled(this.productosbodegasConstantesFunciones.activarnombre_linea_categoriaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_linea_marcaProductosBodegas.setEnabled(this.productosbodegasConstantesFunciones.activarnombre_linea_marcaProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jTextFieldcodigoProductosBodegas.setEnabled(this.productosbodegasConstantesFunciones.activarcodigoProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombreProductosBodegas.setEnabled(this.productosbodegasConstantesFunciones.activarnombreProductosBodegas);
		this.jInternalFrameDetalleFormProductosBodegas.jTextAreanombre_bodegaProductosBodegas.setEnabled(this.productosbodegasConstantesFunciones.activarnombre_bodegaProductosBodegas);
		}
	}
	
		
}