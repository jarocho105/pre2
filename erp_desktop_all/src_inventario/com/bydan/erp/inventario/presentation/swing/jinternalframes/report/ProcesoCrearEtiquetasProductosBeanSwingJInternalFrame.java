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

//import com.bydan.erp.inventario.util.ProcesoCrearEtiquetasProductosConstantesFunciones;
import com.bydan.erp.inventario.util.report.ProcesoCrearEtiquetasProductosParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.ProcesoCrearEtiquetasProductosParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.ProcesoCrearEtiquetasProductosBean;
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

import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.business.entity.report.*;
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


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame extends ProcesoCrearEtiquetasProductosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductosValidator = new ClassValidator<ProcesoCrearEtiquetasProductos>(ProcesoCrearEtiquetasProductos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos;	
	public ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux;
	public ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosTotales;
	public Long idProcesoCrearEtiquetasProductosActual;
	public Long iIdNuevoProcesoCrearEtiquetasProductos=0L;
	public int rowIndexActual=0;
	
	
	
	
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
	
	public Boolean isPermisoTodoProcesoCrearEtiquetasProductos;
	public Boolean isPermisoNuevoProcesoCrearEtiquetasProductos;
	public Boolean isPermisoActualizarProcesoCrearEtiquetasProductos;
	public Boolean isPermisoActualizarOriginalProcesoCrearEtiquetasProductos;
	public Boolean isPermisoEliminarProcesoCrearEtiquetasProductos;
	public Boolean isPermisoGuardarCambiosProcesoCrearEtiquetasProductos;
	public Boolean isPermisoConsultaProcesoCrearEtiquetasProductos;
	public Boolean isPermisoBusquedaProcesoCrearEtiquetasProductos;
	public Boolean isPermisoReporteProcesoCrearEtiquetasProductos;
	public Boolean isPermisoPaginacionMedioProcesoCrearEtiquetasProductos;
	public Boolean isPermisoPaginacionAltoProcesoCrearEtiquetasProductos;
	public Boolean isPermisoPaginacionTodoProcesoCrearEtiquetasProductos;
	public Boolean isPermisoCopiarProcesoCrearEtiquetasProductos;
	public Boolean isPermisoVerFormProcesoCrearEtiquetasProductos;
	public Boolean isPermisoDuplicarProcesoCrearEtiquetasProductos;
	public Boolean isPermisoOrdenProcesoCrearEtiquetasProductos;
	
	
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
	
	public ProcesoCrearEtiquetasProductosParameterReturnGeneral procesocrearetiquetasproductosReturnGeneral;
	public ProcesoCrearEtiquetasProductosParameterReturnGeneral procesocrearetiquetasproductosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoCrearEtiquetasProductos=false;
	public Boolean esParaAccionDesdeFormularioProcesoCrearEtiquetasProductos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoCrearEtiquetasProductosSessionBeanAdditional procesocrearetiquetasproductosSessionBeanAdditional=null;
	
	public ProcesoCrearEtiquetasProductosSessionBeanAdditional getProcesoCrearEtiquetasProductosSessionBeanAdditional() {
		return this.procesocrearetiquetasproductosSessionBeanAdditional;
	}
	
	public void setProcesoCrearEtiquetasProductosSessionBeanAdditional(ProcesoCrearEtiquetasProductosSessionBeanAdditional procesocrearetiquetasproductosSessionBeanAdditional) {
		try {
			this.procesocrearetiquetasproductosSessionBeanAdditional=procesocrearetiquetasproductosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional procesocrearetiquetasproductosBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame
	
	public ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional getProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional() {
		return this.procesocrearetiquetasproductosBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional(ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional procesocrearetiquetasproductosBeanSwingJInternalFrameAdditional) {
		try {
			this.procesocrearetiquetasproductosBeanSwingJInternalFrameAdditional=procesocrearetiquetasproductosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoCrearEtiquetasProductosLogic procesocrearetiquetasproductosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosBean;
	public ProcesoCrearEtiquetasProductosConstantesFunciones procesocrearetiquetasproductosConstantesFunciones;
	//public ProcesoCrearEtiquetasProductosParameterReturnGeneral procesocrearetiquetasproductosReturnGeneral;
	
	//FK
	
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductoss;	
	//public List<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossEliminados;
	//public List<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoCrearEtiquetasProductos=true;
	public Boolean isVisibilidadCeldaCopiarProcesoCrearEtiquetasProductos=true;
	public Boolean isVisibilidadCeldaVerFormProcesoCrearEtiquetasProductos=true;
	public Boolean isVisibilidadCeldaOrdenProcesoCrearEtiquetasProductos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos=false;
	public Boolean isVisibilidadCeldaModificarProcesoCrearEtiquetasProductos=false;
	public Boolean isVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos=false;
	public Boolean isVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos=false;
	public Boolean isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos=false;
	public Boolean isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoCrearEtiquetasProductos=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoProcesoCrearEtiquetasProductos() {
		return this.iIdNuevoProcesoCrearEtiquetasProductos;
	}

	public void setiIdNuevoProcesoCrearEtiquetasProductos(Long iIdNuevoProcesoCrearEtiquetasProductos) {
		this.iIdNuevoProcesoCrearEtiquetasProductos = iIdNuevoProcesoCrearEtiquetasProductos;
	}
	
	public Long getidProcesoCrearEtiquetasProductosActual() {
		return this.idProcesoCrearEtiquetasProductosActual;
	}

	public void setidProcesoCrearEtiquetasProductosActual(Long idProcesoCrearEtiquetasProductosActual) {
		this.idProcesoCrearEtiquetasProductosActual = idProcesoCrearEtiquetasProductosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoCrearEtiquetasProductos getprocesocrearetiquetasproductos() {
		return this.procesocrearetiquetasproductos;
	}

	public void setprocesocrearetiquetasproductos(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos) {
		this.procesocrearetiquetasproductos = procesocrearetiquetasproductos;
	}
	
	public ProcesoCrearEtiquetasProductos getprocesocrearetiquetasproductosAux() {
		return this.procesocrearetiquetasproductosAux;
	}

	public void setprocesocrearetiquetasproductosAux(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux) {
		this.procesocrearetiquetasproductosAux = procesocrearetiquetasproductosAux;
	}				
	
	public ProcesoCrearEtiquetasProductos getprocesocrearetiquetasproductosAnterior() {
		return this.procesocrearetiquetasproductosAnterior;
	}

	public void setprocesocrearetiquetasproductosAnterior(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAnterior) {
		this.procesocrearetiquetasproductosAnterior = procesocrearetiquetasproductosAnterior;
	}	
	
	public ProcesoCrearEtiquetasProductos getprocesocrearetiquetasproductosTotales() {
		return this.procesocrearetiquetasproductosTotales;
	}

	public void setprocesocrearetiquetasproductosTotales(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosTotales) {
		this.procesocrearetiquetasproductosTotales = procesocrearetiquetasproductosTotales;
	}	
	
	public ProcesoCrearEtiquetasProductos getprocesocrearetiquetasproductosBean() {
		return this.procesocrearetiquetasproductosBean;
	}

	public void setprocesocrearetiquetasproductosBean(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosBean) {
		this.procesocrearetiquetasproductosBean = procesocrearetiquetasproductosBean;
	}	
	
	public ProcesoCrearEtiquetasProductosParameterReturnGeneral getprocesocrearetiquetasproductosReturnGeneral() {
		return this.procesocrearetiquetasproductosReturnGeneral;
	}

	public void setprocesocrearetiquetasproductosReturnGeneral(ProcesoCrearEtiquetasProductosParameterReturnGeneral procesocrearetiquetasproductosReturnGeneral) {
		this.procesocrearetiquetasproductosReturnGeneral = procesocrearetiquetasproductosReturnGeneral;
	}	
	
	
	public Long id_bodegaBusquedaProcesoCrearEtiquetasProductos=-1L;

	public Long getid_bodegaBusquedaProcesoCrearEtiquetasProductos() {
		return this.id_bodegaBusquedaProcesoCrearEtiquetasProductos;
	}

	public void setid_bodegaBusquedaProcesoCrearEtiquetasProductos(Long id_bodegaBusquedaProcesoCrearEtiquetasProductos) {
		this.id_bodegaBusquedaProcesoCrearEtiquetasProductos = id_bodegaBusquedaProcesoCrearEtiquetasProductos;
	}

;
	public Long id_productoBusquedaProcesoCrearEtiquetasProductos=-1L;

	public Long getid_productoBusquedaProcesoCrearEtiquetasProductos() {
		return this.id_productoBusquedaProcesoCrearEtiquetasProductos;
	}

	public void setid_productoBusquedaProcesoCrearEtiquetasProductos(Long id_productoBusquedaProcesoCrearEtiquetasProductos) {
		this.id_productoBusquedaProcesoCrearEtiquetasProductos = id_productoBusquedaProcesoCrearEtiquetasProductos;
	}

;
	public Long id_lineaBusquedaProcesoCrearEtiquetasProductos=-1L;

	public Long getid_lineaBusquedaProcesoCrearEtiquetasProductos() {
		return this.id_lineaBusquedaProcesoCrearEtiquetasProductos;
	}

	public void setid_lineaBusquedaProcesoCrearEtiquetasProductos(Long id_lineaBusquedaProcesoCrearEtiquetasProductos) {
		this.id_lineaBusquedaProcesoCrearEtiquetasProductos = id_lineaBusquedaProcesoCrearEtiquetasProductos;
	}

;
	public Long id_linea_grupoBusquedaProcesoCrearEtiquetasProductos=-1L;

	public Long getid_linea_grupoBusquedaProcesoCrearEtiquetasProductos() {
		return this.id_linea_grupoBusquedaProcesoCrearEtiquetasProductos;
	}

	public void setid_linea_grupoBusquedaProcesoCrearEtiquetasProductos(Long id_linea_grupoBusquedaProcesoCrearEtiquetasProductos) {
		this.id_linea_grupoBusquedaProcesoCrearEtiquetasProductos = id_linea_grupoBusquedaProcesoCrearEtiquetasProductos;
	}

;
	public Long id_linea_categoriaBusquedaProcesoCrearEtiquetasProductos=-1L;

	public Long getid_linea_categoriaBusquedaProcesoCrearEtiquetasProductos() {
		return this.id_linea_categoriaBusquedaProcesoCrearEtiquetasProductos;
	}

	public void setid_linea_categoriaBusquedaProcesoCrearEtiquetasProductos(Long id_linea_categoriaBusquedaProcesoCrearEtiquetasProductos) {
		this.id_linea_categoriaBusquedaProcesoCrearEtiquetasProductos = id_linea_categoriaBusquedaProcesoCrearEtiquetasProductos;
	}

;
	public Long id_linea_marcaBusquedaProcesoCrearEtiquetasProductos=-1L;

	public Long getid_linea_marcaBusquedaProcesoCrearEtiquetasProductos() {
		return this.id_linea_marcaBusquedaProcesoCrearEtiquetasProductos;
	}

	public void setid_linea_marcaBusquedaProcesoCrearEtiquetasProductos(Long id_linea_marcaBusquedaProcesoCrearEtiquetasProductos) {
		this.id_linea_marcaBusquedaProcesoCrearEtiquetasProductos = id_linea_marcaBusquedaProcesoCrearEtiquetasProductos;
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
	
	
	public ProcesoCrearEtiquetasProductosLogic getProcesoCrearEtiquetasProductosLogic()	{		
		return procesocrearetiquetasproductosLogic;
	}

	public void setProcesoCrearEtiquetasProductosLogic(ProcesoCrearEtiquetasProductosLogic procesocrearetiquetasproductosLogic) {
		this.procesocrearetiquetasproductosLogic = procesocrearetiquetasproductosLogic;
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
	
	public Boolean getIsEsNuevoProcesoCrearEtiquetasProductos() {
		return isEsNuevoProcesoCrearEtiquetasProductos;
	}

	public void setIsEsNuevoProcesoCrearEtiquetasProductos(Boolean isEsNuevoProcesoCrearEtiquetasProductos) {
		this.isEsNuevoProcesoCrearEtiquetasProductos = isEsNuevoProcesoCrearEtiquetasProductos;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoCrearEtiquetasProductos() {
		return esParaAccionDesdeFormularioProcesoCrearEtiquetasProductos;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoCrearEtiquetasProductos(Boolean esParaAccionDesdeFormularioProcesoCrearEtiquetasProductos) {
		this.esParaAccionDesdeFormularioProcesoCrearEtiquetasProductos = esParaAccionDesdeFormularioProcesoCrearEtiquetasProductos;
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

			bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

			if(this.procesocrearetiquetasproductosSessionBean==null) {
				this.procesocrearetiquetasproductosSessionBean=new ProcesoCrearEtiquetasProductosSessionBean();
			}

			if(!this.procesocrearetiquetasproductosSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

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
					bodegaLogic.getEntityWithConnection(procesocrearetiquetasproductosSessionBean.getlidBodegaActual());
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

			productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

			if(this.procesocrearetiquetasproductosSessionBean==null) {
				this.procesocrearetiquetasproductosSessionBean=new ProcesoCrearEtiquetasProductosSessionBean();
			}

			if(!this.procesocrearetiquetasproductosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(procesocrearetiquetasproductosSessionBean.getlidProductoActual());
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

			if(this.procesocrearetiquetasproductosSessionBean==null) {
				this.procesocrearetiquetasproductosSessionBean=new ProcesoCrearEtiquetasProductosSessionBean();
			}

			if(!this.procesocrearetiquetasproductosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(procesocrearetiquetasproductosSessionBean.getlidEmpresaActual());
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

			if(this.procesocrearetiquetasproductosSessionBean==null) {
				this.procesocrearetiquetasproductosSessionBean=new ProcesoCrearEtiquetasProductosSessionBean();
			}

			if(!this.procesocrearetiquetasproductosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(procesocrearetiquetasproductosSessionBean.getlidSucursalActual());
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

			if(this.procesocrearetiquetasproductosSessionBean==null) {
				this.procesocrearetiquetasproductosSessionBean=new ProcesoCrearEtiquetasProductosSessionBean();
			}

			if(!this.procesocrearetiquetasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(procesocrearetiquetasproductosSessionBean.getlidLineaActual());
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

			if(this.procesocrearetiquetasproductosSessionBean==null) {
				this.procesocrearetiquetasproductosSessionBean=new ProcesoCrearEtiquetasProductosSessionBean();
			}

			if(!this.procesocrearetiquetasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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
					lineaLogic.getEntityWithConnection(procesocrearetiquetasproductosSessionBean.getlidLineaGrupoActual());
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

			if(this.procesocrearetiquetasproductosSessionBean==null) {
				this.procesocrearetiquetasproductosSessionBean=new ProcesoCrearEtiquetasProductosSessionBean();
			}

			if(!this.procesocrearetiquetasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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
					lineaLogic.getEntityWithConnection(procesocrearetiquetasproductosSessionBean.getlidLineaCategoriaActual());
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

			if(this.procesocrearetiquetasproductosSessionBean==null) {
				this.procesocrearetiquetasproductosSessionBean=new ProcesoCrearEtiquetasProductosSessionBean();
			}

			if(!this.procesocrearetiquetasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
					lineaLogic.getEntityWithConnection(procesocrearetiquetasproductosSessionBean.getlidLineaMarcaActual());
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

					if(this.procesocrearetiquetasproductos!=null) {
						this.procesocrearetiquetasproductos.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_bodegaProcesoCrearEtiquetasProductos.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaProcesoCrearEtiquetasProductos.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_bodegaProcesoCrearEtiquetasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_bodegaProcesoCrearEtiquetasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos!=null) {
						jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos!=null) {
							//jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.getItemCount()>0) {
								jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaProcesoCrearEtiquetasProductosGenerico)throws Exception
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
				jComboBoxid_bodegaProcesoCrearEtiquetasProductosGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaProcesoCrearEtiquetasProductosGenerico!=null && jComboBoxid_bodegaProcesoCrearEtiquetasProductosGenerico.getItemCount()>0) {
					jComboBoxid_bodegaProcesoCrearEtiquetasProductosGenerico.setSelectedIndex(0);
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

					if(this.procesocrearetiquetasproductos!=null) {
						this.procesocrearetiquetasproductos.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_productoProcesoCrearEtiquetasProductos.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoProcesoCrearEtiquetasProductos.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_productoProcesoCrearEtiquetasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_productoProcesoCrearEtiquetasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos!=null) {
						jComboBoxid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos!=null) {
							//jComboBoxid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.getItemCount()>0) {
								jComboBoxid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoProcesoCrearEtiquetasProductosGenerico)throws Exception
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
				jComboBoxid_productoProcesoCrearEtiquetasProductosGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoProcesoCrearEtiquetasProductosGenerico!=null && jComboBoxid_productoProcesoCrearEtiquetasProductosGenerico.getItemCount()>0) {
					jComboBoxid_productoProcesoCrearEtiquetasProductosGenerico.setSelectedIndex(0);
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

					if(this.procesocrearetiquetasproductos!=null) {
						this.procesocrearetiquetasproductos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_empresaProcesoCrearEtiquetasProductos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProcesoCrearEtiquetasProductos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_empresaProcesoCrearEtiquetasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_empresaProcesoCrearEtiquetasProductos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProcesoCrearEtiquetasProductosGenerico)throws Exception
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
				jComboBoxid_empresaProcesoCrearEtiquetasProductosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProcesoCrearEtiquetasProductosGenerico!=null && jComboBoxid_empresaProcesoCrearEtiquetasProductosGenerico.getItemCount()>0) {
					jComboBoxid_empresaProcesoCrearEtiquetasProductosGenerico.setSelectedIndex(0);
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

					if(this.procesocrearetiquetasproductos!=null) {
						this.procesocrearetiquetasproductos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_sucursalProcesoCrearEtiquetasProductos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProcesoCrearEtiquetasProductos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_sucursalProcesoCrearEtiquetasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_sucursalProcesoCrearEtiquetasProductos.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProcesoCrearEtiquetasProductosGenerico)throws Exception
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
				jComboBoxid_sucursalProcesoCrearEtiquetasProductosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProcesoCrearEtiquetasProductosGenerico!=null && jComboBoxid_sucursalProcesoCrearEtiquetasProductosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProcesoCrearEtiquetasProductosGenerico.setSelectedIndex(0);
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

					if(this.procesocrearetiquetasproductos!=null) {
						this.procesocrearetiquetasproductos.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_lineaProcesoCrearEtiquetasProductos.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaProcesoCrearEtiquetasProductos.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_lineaProcesoCrearEtiquetasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_lineaProcesoCrearEtiquetasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos!=null) {
						jComboBoxid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos!=null) {
							//jComboBoxid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.getItemCount()>0) {
								jComboBoxid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaProcesoCrearEtiquetasProductosGenerico)throws Exception
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
				jComboBoxid_lineaProcesoCrearEtiquetasProductosGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaProcesoCrearEtiquetasProductosGenerico!=null && jComboBoxid_lineaProcesoCrearEtiquetasProductosGenerico.getItemCount()>0) {
					jComboBoxid_lineaProcesoCrearEtiquetasProductosGenerico.setSelectedIndex(0);
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

					if(this.procesocrearetiquetasproductos!=null) {
						this.procesocrearetiquetasproductos.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos!=null) {
						jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos!=null) {
							//jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoProcesoCrearEtiquetasProductosGenerico)throws Exception
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
				jComboBoxid_linea_grupoProcesoCrearEtiquetasProductosGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoProcesoCrearEtiquetasProductosGenerico!=null && jComboBoxid_linea_grupoProcesoCrearEtiquetasProductosGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoProcesoCrearEtiquetasProductosGenerico.setSelectedIndex(0);
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

					if(this.procesocrearetiquetasproductos!=null) {
						this.procesocrearetiquetasproductos.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos!=null) {
						jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos!=null) {
							//jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedIndex(0);
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
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductosGenerico)throws Exception
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
				jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductosGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductosGenerico!=null && jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductosGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductosGenerico.setSelectedIndex(0);
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

					if(this.procesocrearetiquetasproductos!=null) {
						this.procesocrearetiquetasproductos.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos!=null) {
						jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos!=null) {
							//jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedIndex(0);
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
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaProcesoCrearEtiquetasProductosGenerico)throws Exception
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
				jComboBoxid_linea_marcaProcesoCrearEtiquetasProductosGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaProcesoCrearEtiquetasProductosGenerico!=null && jComboBoxid_linea_marcaProcesoCrearEtiquetasProductosGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaProcesoCrearEtiquetasProductosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,JComboBox jComboBoxid_bodegaProcesoCrearEtiquetasProductosGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaProcesoCrearEtiquetasProductosGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_bodegaProcesoCrearEtiquetasProductos.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaProcesoCrearEtiquetasProductosGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				procesocrearetiquetasproductos.setid_bodega(bodegaAux.getId());
				procesocrearetiquetasproductos.setbodega_descripcion(ProcesoCrearEtiquetasProductosConstantesFunciones.getBodegaDescripcion(bodegaAux));
				procesocrearetiquetasproductos.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,JComboBox jComboBoxid_productoProcesoCrearEtiquetasProductosGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoProcesoCrearEtiquetasProductosGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_productoProcesoCrearEtiquetasProductos.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoProcesoCrearEtiquetasProductosGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				procesocrearetiquetasproductos.setid_producto(productoAux.getId());
				procesocrearetiquetasproductos.setproducto_descripcion(ProcesoCrearEtiquetasProductosConstantesFunciones.getProductoDescripcion(productoAux));
				procesocrearetiquetasproductos.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,JComboBox jComboBoxid_empresaProcesoCrearEtiquetasProductosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProcesoCrearEtiquetasProductosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_empresaProcesoCrearEtiquetasProductos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProcesoCrearEtiquetasProductosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				procesocrearetiquetasproductos.setid_empresa(empresaAux.getId());
				procesocrearetiquetasproductos.setempresa_descripcion(ProcesoCrearEtiquetasProductosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				procesocrearetiquetasproductos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,JComboBox jComboBoxid_sucursalProcesoCrearEtiquetasProductosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProcesoCrearEtiquetasProductosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_sucursalProcesoCrearEtiquetasProductos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProcesoCrearEtiquetasProductosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				procesocrearetiquetasproductos.setid_sucursal(sucursalAux.getId());
				procesocrearetiquetasproductos.setsucursal_descripcion(ProcesoCrearEtiquetasProductosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				procesocrearetiquetasproductos.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,JComboBox jComboBoxid_lineaProcesoCrearEtiquetasProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaProcesoCrearEtiquetasProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_lineaProcesoCrearEtiquetasProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaProcesoCrearEtiquetasProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				procesocrearetiquetasproductos.setid_linea(lineaAux.getId());
				procesocrearetiquetasproductos.setlinea_descripcion(ProcesoCrearEtiquetasProductosConstantesFunciones.getLineaDescripcion(lineaAux));
				procesocrearetiquetasproductos.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,JComboBox jComboBoxid_linea_grupoProcesoCrearEtiquetasProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoProcesoCrearEtiquetasProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoProcesoCrearEtiquetasProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				procesocrearetiquetasproductos.setid_linea_grupo(lineaAux.getId());
				procesocrearetiquetasproductos.setlineagrupo_descripcion(ProcesoCrearEtiquetasProductosConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				procesocrearetiquetasproductos.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,JComboBox jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				procesocrearetiquetasproductos.setid_linea_categoria(lineaAux.getId());
				procesocrearetiquetasproductos.setlineacategoria_descripcion(ProcesoCrearEtiquetasProductosConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				procesocrearetiquetasproductos.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,JComboBox jComboBoxid_linea_marcaProcesoCrearEtiquetasProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaProcesoCrearEtiquetasProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaProcesoCrearEtiquetasProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				procesocrearetiquetasproductos.setid_linea_marca(lineaAux.getId());
				procesocrearetiquetasproductos.setlineamarca_descripcion(ProcesoCrearEtiquetasProductosConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				procesocrearetiquetasproductos.setLineaMarca(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBodegasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBodega=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { 
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_bodegaProcesoCrearEtiquetasProductos.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_bodegaProcesoCrearEtiquetasProductos.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { 
					}

					if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.addItem(bodega);
							}
						}

						if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { 
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_productoProcesoCrearEtiquetasProductos.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_productoProcesoCrearEtiquetasProductos.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { 
					}

					if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.addItem(producto);
							}
						}

						if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { 
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_empresaProcesoCrearEtiquetasProductos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_empresaProcesoCrearEtiquetasProductos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { 
					}

					if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { 
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_sucursalProcesoCrearEtiquetasProductos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_sucursalProcesoCrearEtiquetasProductos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { 
					}

					if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { 
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_lineaProcesoCrearEtiquetasProductos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_lineaProcesoCrearEtiquetasProductos.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { 
					}

					if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.addItem(linea);
							}
						}

						if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { 
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { 
					}

					if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.addItem(lineagrupo);
							}
						}

						if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { 
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { 
					}

					if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.addItem(lineacategoria);
							}
						}

						if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { 
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { 
					}

					if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.addItem(lineamarca);
							}
						}

						if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameBodegaForeignKey(Bodega bodega,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_bodegaProcesoCrearEtiquetasProductos.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_bodegaProcesoCrearEtiquetasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_productoProcesoCrearEtiquetasProductos.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_productoProcesoCrearEtiquetasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_empresaProcesoCrearEtiquetasProductos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_empresaProcesoCrearEtiquetasProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_sucursalProcesoCrearEtiquetasProductos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_sucursalProcesoCrearEtiquetasProductos.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameLineaForeignKey(Linea linea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_lineaProcesoCrearEtiquetasProductos.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_lineaProcesoCrearEtiquetasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoCrearEtiquetasProductos() throws Exception {
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
		
	public ProcesoCrearEtiquetasProductosParameterReturnGeneral getProcesoCrearEtiquetasProductosParameterGeneral() {
		return this.procesocrearetiquetasproductosParameterGeneral;
	}
	
	public void setProcesoCrearEtiquetasProductosParameterGeneral(ProcesoCrearEtiquetasProductosParameterReturnGeneral procesocrearetiquetasproductosParameterGeneral) {
		this.procesocrearetiquetasproductosParameterGeneral = procesocrearetiquetasproductosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoCrearEtiquetasProductos() {
		return isPermisoTodoProcesoCrearEtiquetasProductos;
	}

	public void setIsPermisoTodoProcesoCrearEtiquetasProductos(Boolean isPermisoTodoProcesoCrearEtiquetasProductos) {
		this.isPermisoTodoProcesoCrearEtiquetasProductos = isPermisoTodoProcesoCrearEtiquetasProductos;
	}

	public Boolean getIsPermisoNuevoProcesoCrearEtiquetasProductos() {
		return isPermisoNuevoProcesoCrearEtiquetasProductos;
	}

	public void setIsPermisoNuevoProcesoCrearEtiquetasProductos(Boolean isPermisoNuevoProcesoCrearEtiquetasProductos) {
		this.isPermisoNuevoProcesoCrearEtiquetasProductos = isPermisoNuevoProcesoCrearEtiquetasProductos;
	}

	public Boolean getIsPermisoActualizarProcesoCrearEtiquetasProductos() {
		return isPermisoActualizarProcesoCrearEtiquetasProductos;
	}

	public void setIsPermisoActualizarProcesoCrearEtiquetasProductos(Boolean isPermisoActualizarProcesoCrearEtiquetasProductos) {
		this.isPermisoActualizarProcesoCrearEtiquetasProductos = isPermisoActualizarProcesoCrearEtiquetasProductos;
	}

	public Boolean getIsPermisoEliminarProcesoCrearEtiquetasProductos() {
		return isPermisoEliminarProcesoCrearEtiquetasProductos;
	}

	public void setIsPermisoEliminarProcesoCrearEtiquetasProductos(Boolean isPermisoEliminarProcesoCrearEtiquetasProductos) {
		this.isPermisoEliminarProcesoCrearEtiquetasProductos = isPermisoEliminarProcesoCrearEtiquetasProductos;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoCrearEtiquetasProductos() {
		return isPermisoGuardarCambiosProcesoCrearEtiquetasProductos;
	}

	public void setIsPermisoGuardarCambiosProcesoCrearEtiquetasProductos(Boolean isPermisoGuardarCambiosProcesoCrearEtiquetasProductos) {
		this.isPermisoGuardarCambiosProcesoCrearEtiquetasProductos = isPermisoGuardarCambiosProcesoCrearEtiquetasProductos;
	}
	
	public Boolean getIsPermisoConsultaProcesoCrearEtiquetasProductos() {
		return isPermisoConsultaProcesoCrearEtiquetasProductos;
	}

	public void setIsPermisoConsultaProcesoCrearEtiquetasProductos(Boolean isPermisoConsultaProcesoCrearEtiquetasProductos) {
		this.isPermisoConsultaProcesoCrearEtiquetasProductos = isPermisoConsultaProcesoCrearEtiquetasProductos;
	}

	public Boolean getIsPermisoBusquedaProcesoCrearEtiquetasProductos() {
		return isPermisoBusquedaProcesoCrearEtiquetasProductos;
	}

	public void setIsPermisoBusquedaProcesoCrearEtiquetasProductos(Boolean isPermisoBusquedaProcesoCrearEtiquetasProductos) {
		this.isPermisoBusquedaProcesoCrearEtiquetasProductos = isPermisoBusquedaProcesoCrearEtiquetasProductos;
	}

	public Boolean getIsPermisoReporteProcesoCrearEtiquetasProductos() {
		return isPermisoReporteProcesoCrearEtiquetasProductos;
	}

	public void setIsPermisoReporteProcesoCrearEtiquetasProductos(Boolean isPermisoReporteProcesoCrearEtiquetasProductos) {
		this.isPermisoReporteProcesoCrearEtiquetasProductos = isPermisoReporteProcesoCrearEtiquetasProductos;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoCrearEtiquetasProductos() {
		return isPermisoPaginacionMedioProcesoCrearEtiquetasProductos;
	}

	public void setIsPermisoPaginacionMedioProcesoCrearEtiquetasProductos(Boolean isPermisoPaginacionMedioProcesoCrearEtiquetasProductos) {
		this.isPermisoPaginacionMedioProcesoCrearEtiquetasProductos = isPermisoPaginacionMedioProcesoCrearEtiquetasProductos;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoCrearEtiquetasProductos() {
		return isPermisoPaginacionTodoProcesoCrearEtiquetasProductos;
	}

	public void setIsPermisoPaginacionTodoProcesoCrearEtiquetasProductos(Boolean isPermisoPaginacionTodoProcesoCrearEtiquetasProductos) {
		this.isPermisoPaginacionTodoProcesoCrearEtiquetasProductos = isPermisoPaginacionTodoProcesoCrearEtiquetasProductos;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoCrearEtiquetasProductos() {
		return isPermisoPaginacionAltoProcesoCrearEtiquetasProductos;
	}

	public void setIsPermisoPaginacionAltoProcesoCrearEtiquetasProductos(Boolean isPermisoPaginacionAltoProcesoCrearEtiquetasProductos) {
		this.isPermisoPaginacionAltoProcesoCrearEtiquetasProductos = isPermisoPaginacionAltoProcesoCrearEtiquetasProductos;
	}
	
	public Boolean getIsPermisoCopiarProcesoCrearEtiquetasProductos() {
		return isPermisoCopiarProcesoCrearEtiquetasProductos;
	}

	public void setIsPermisoCopiarProcesoCrearEtiquetasProductos(Boolean isPermisoCopiarProcesoCrearEtiquetasProductos) {
		this.isPermisoCopiarProcesoCrearEtiquetasProductos = isPermisoCopiarProcesoCrearEtiquetasProductos;
	}
	
	public Boolean getIsPermisoVerFormProcesoCrearEtiquetasProductos() {
		return isPermisoVerFormProcesoCrearEtiquetasProductos;
	}

	public void setIsPermisoVerFormProcesoCrearEtiquetasProductos(Boolean isPermisoVerFormProcesoCrearEtiquetasProductos) {
		this.isPermisoVerFormProcesoCrearEtiquetasProductos = isPermisoVerFormProcesoCrearEtiquetasProductos;
	}
	
	public Boolean getIsPermisoDuplicarProcesoCrearEtiquetasProductos() {
		return isPermisoDuplicarProcesoCrearEtiquetasProductos;
	}

	public void setIsPermisoDuplicarProcesoCrearEtiquetasProductos(Boolean isPermisoDuplicarProcesoCrearEtiquetasProductos) {
		this.isPermisoDuplicarProcesoCrearEtiquetasProductos = isPermisoDuplicarProcesoCrearEtiquetasProductos;
	}
	
	public Boolean getIsPermisoOrdenProcesoCrearEtiquetasProductos() {
		return isPermisoOrdenProcesoCrearEtiquetasProductos;
	}

	public void setIsPermisoOrdenProcesoCrearEtiquetasProductos(Boolean isPermisoOrdenProcesoCrearEtiquetasProductos) {
		this.isPermisoOrdenProcesoCrearEtiquetasProductos = isPermisoOrdenProcesoCrearEtiquetasProductos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos() {
		return isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos;
	}

	public void setIsVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos(Boolean isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos) {
		this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos = isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoCrearEtiquetasProductos() {
		return isVisibilidadCeldaDuplicarProcesoCrearEtiquetasProductos;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoCrearEtiquetasProductos(Boolean isVisibilidadCeldaDuplicarProcesoCrearEtiquetasProductos) {
		this.isVisibilidadCeldaDuplicarProcesoCrearEtiquetasProductos = isVisibilidadCeldaDuplicarProcesoCrearEtiquetasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoCrearEtiquetasProductos() {
		return isVisibilidadCeldaCopiarProcesoCrearEtiquetasProductos;
	}

	public void setIsVisibilidadCeldaCopiarProcesoCrearEtiquetasProductos(Boolean isVisibilidadCeldaCopiarProcesoCrearEtiquetasProductos) {
		this.isVisibilidadCeldaCopiarProcesoCrearEtiquetasProductos = isVisibilidadCeldaCopiarProcesoCrearEtiquetasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoCrearEtiquetasProductos() {
		return isVisibilidadCeldaVerFormProcesoCrearEtiquetasProductos;
	}

	public void setIsVisibilidadCeldaVerFormProcesoCrearEtiquetasProductos(Boolean isVisibilidadCeldaVerFormProcesoCrearEtiquetasProductos) {
		this.isVisibilidadCeldaVerFormProcesoCrearEtiquetasProductos = isVisibilidadCeldaVerFormProcesoCrearEtiquetasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoCrearEtiquetasProductos() {
		return isVisibilidadCeldaOrdenProcesoCrearEtiquetasProductos;
	}

	public void setIsVisibilidadCeldaOrdenProcesoCrearEtiquetasProductos(Boolean isVisibilidadCeldaOrdenProcesoCrearEtiquetasProductos) {
		this.isVisibilidadCeldaOrdenProcesoCrearEtiquetasProductos = isVisibilidadCeldaOrdenProcesoCrearEtiquetasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos() {
		return isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos(Boolean isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos = isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoCrearEtiquetasProductos() {
		return isVisibilidadCeldaModificarProcesoCrearEtiquetasProductos;
	}

	public void setIsVisibilidadCeldaModificarProcesoCrearEtiquetasProductos(Boolean isVisibilidadCeldaModificarProcesoCrearEtiquetasProductos) {
		this.isVisibilidadCeldaModificarProcesoCrearEtiquetasProductos = isVisibilidadCeldaModificarProcesoCrearEtiquetasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos() {
		return isVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos;
	}

	public void setIsVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos(Boolean isVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos) {
		this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos = isVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos() {
		return isVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos;
	}

	public void setIsVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos(Boolean isVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos) {
		this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos = isVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos() {
		return isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos;
	}

	public void setIsVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos(Boolean isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos) {
		this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos = isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos() {
		return isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos;
	}

	public void setIsVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos(Boolean isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos) {
		this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos = isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos() {
		return isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos(Boolean isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos) {
		this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos = isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos;
	}
		
	public ProcesoCrearEtiquetasProductosSessionBean getprocesocrearetiquetasproductosSessionBean() {
		return this.procesocrearetiquetasproductosSessionBean;
	}
	
	public void setprocesocrearetiquetasproductosSessionBean(ProcesoCrearEtiquetasProductosSessionBean procesocrearetiquetasproductosSessionBean) {
		this.procesocrearetiquetasproductosSessionBean=procesocrearetiquetasproductosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoCrearEtiquetasProductos() {
		return this.isVisibilidadBusquedaProcesoCrearEtiquetasProductos;
	}

	public void setisVisibilidadBusquedaProcesoCrearEtiquetasProductos(Boolean isVisibilidadBusquedaProcesoCrearEtiquetasProductos) {
		this.isVisibilidadBusquedaProcesoCrearEtiquetasProductos=isVisibilidadBusquedaProcesoCrearEtiquetasProductos;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos)throws Exception {
		try {
			
				this.setActualParaGuardarBodegaForeignKey(procesocrearetiquetasproductos,null);
				this.setActualParaGuardarProductoForeignKey(procesocrearetiquetasproductos,null);
				this.setActualParaGuardarEmpresaForeignKey(procesocrearetiquetasproductos,null);
				this.setActualParaGuardarSucursalForeignKey(procesocrearetiquetasproductos,null);
				this.setActualParaGuardarLineaForeignKey(procesocrearetiquetasproductos,null);
				this.setActualParaGuardarLineaGrupoForeignKey(procesocrearetiquetasproductos,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(procesocrearetiquetasproductos,null);
				this.setActualParaGuardarLineaMarcaForeignKey(procesocrearetiquetasproductos,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoCrearEtiquetasProductos(procesocrearetiquetasproductos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesocrearetiquetasproductosAux.setId(procesocrearetiquetasproductos.getId());
		procesocrearetiquetasproductosAux.setVersionRow(procesocrearetiquetasproductos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosLocal) throws Exception {
		
		if(this.procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosLocal) throws Exception {	
		if(this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				procesocrearetiquetasproductosLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				procesocrearetiquetasproductosLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				procesocrearetiquetasproductosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				procesocrearetiquetasproductosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				procesocrearetiquetasproductosLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				procesocrearetiquetasproductosLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				procesocrearetiquetasproductosLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				procesocrearetiquetasproductosLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoCrearEtiquetasProductosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesocrearetiquetasproductosValidator.getInvalidValues(this.procesocrearetiquetasproductos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,List<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,List<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductoss) throws Exception {
		try	{			
			ProcesoCrearEtiquetasProductosConstantesFunciones.actualizarSelectedLista(procesocrearetiquetasproductos,procesocrearetiquetasproductoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesocrearetiquetasproductossLocal=this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesocrearetiquetasproductossLocal=this.procesocrearetiquetasproductoss;
			}
			//ARCHITECTURE
		
			for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosLocal:procesocrearetiquetasproductossLocal) {
				if(this.permiteMantenimiento(procesocrearetiquetasproductosLocal) && procesocrearetiquetasproductosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoCrearEtiquetasProductosConstantesFunciones.getProcesoCrearEtiquetasProductosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoCrearEtiquetasProductosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelcodigoProcesoCrearEtiquetasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCrearEtiquetasProductosConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelnombreProcesoCrearEtiquetasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCrearEtiquetasProductosConstantesFunciones.PRECIO1)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelprecio1ProcesoCrearEtiquetasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCrearEtiquetasProductosConstantesFunciones.PRECIO2)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelprecio2ProcesoCrearEtiquetasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCrearEtiquetasProductosConstantesFunciones.PRECIO3)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelprecio3ProcesoCrearEtiquetasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCrearEtiquetasProductosConstantesFunciones.PRECIO4)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelprecio4ProcesoCrearEtiquetasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCrearEtiquetasProductosConstantesFunciones.PRECIO5)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelprecio5ProcesoCrearEtiquetasProductos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelcodigoProcesoCrearEtiquetasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelnombreProcesoCrearEtiquetasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelprecio1ProcesoCrearEtiquetasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelprecio2ProcesoCrearEtiquetasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelprecio3ProcesoCrearEtiquetasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelprecio4ProcesoCrearEtiquetasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelprecio5ProcesoCrearEtiquetasProductos,"");
		
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
		this.iIdNuevoProcesoCrearEtiquetasProductos--;	
		
		
		this.procesocrearetiquetasproductosAux=new ProcesoCrearEtiquetasProductos();
		
		this.procesocrearetiquetasproductosAux.setId(this.iIdNuevoProcesoCrearEtiquetasProductos);
		this.procesocrearetiquetasproductosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().add(this.procesocrearetiquetasproductosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesocrearetiquetasproductoss.add(this.procesocrearetiquetasproductosAux);
		}
		//ARCHITECTURE
		
		this.procesocrearetiquetasproductos=this.procesocrearetiquetasproductosAux;
		
		if(ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
		}
				
		//this.setDefaultControlesProcesoCrearEtiquetasProductos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoCrearEtiquetasProductos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoCrearEtiquetasProductos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCrearEtiquetasProductos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductosBean,this.procesocrearetiquetasproductos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductosReturnGeneral,this.procesocrearetiquetasproductosBean,false);
		
		if(this.procesocrearetiquetasproductosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductosReturnGeneral.getProcesoCrearEtiquetasProductos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductosReturnGeneral.getProcesoCrearEtiquetasProductos());
		}
		
		if(this.procesocrearetiquetasproductosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductosReturnGeneral.getProcesoCrearEtiquetasProductos(),classes);//this.procesocrearetiquetasproductosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoCrearEtiquetasProductos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoCrearEtiquetasProductos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.RecargarFormProcesoCrearEtiquetasProductos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
						
			if(procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCrearEtiquetasProductos();
			}
			
			this.actualizarVisualTableDatosProcesoCrearEtiquetasProductos();
			
			this.jTableDatosProcesoCrearEtiquetasProductos.setRowSelectionInterval(this.getIndiceNuevoProcesoCrearEtiquetasProductos(), this.getIndiceNuevoProcesoCrearEtiquetasProductos());
			
			this.seleccionarFilaTablaProcesoCrearEtiquetasProductosActual();
						
			this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasProductos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoCrearEtiquetasProductos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldcodigoProcesoCrearEtiquetasProductos.setEnabled(isHabilitar && this.procesocrearetiquetasproductosConstantesFunciones.activarcodigoProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextAreanombreProcesoCrearEtiquetasProductos.setEnabled(isHabilitar && this.procesocrearetiquetasproductosConstantesFunciones.activarnombreProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio1ProcesoCrearEtiquetasProductos.setEnabled(isHabilitar && this.procesocrearetiquetasproductosConstantesFunciones.activarprecio1ProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio2ProcesoCrearEtiquetasProductos.setEnabled(isHabilitar && this.procesocrearetiquetasproductosConstantesFunciones.activarprecio2ProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio3ProcesoCrearEtiquetasProductos.setEnabled(isHabilitar && this.procesocrearetiquetasproductosConstantesFunciones.activarprecio3ProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio4ProcesoCrearEtiquetasProductos.setEnabled(isHabilitar && this.procesocrearetiquetasproductosConstantesFunciones.activarprecio4ProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio5ProcesoCrearEtiquetasProductos.setEnabled(isHabilitar && this.procesocrearetiquetasproductosConstantesFunciones.activarprecio5ProcesoCrearEtiquetasProductos);	
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_bodegaProcesoCrearEtiquetasProductos.setEnabled(isHabilitar && this.procesocrearetiquetasproductosConstantesFunciones.activarid_bodegaProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_productoProcesoCrearEtiquetasProductos.setEnabled(isHabilitar && this.procesocrearetiquetasproductosConstantesFunciones.activarid_productoProcesoCrearEtiquetasProductos);//
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_empresaProcesoCrearEtiquetasProductos.setEnabled(isHabilitar && this.procesocrearetiquetasproductosConstantesFunciones.activarid_empresaProcesoCrearEtiquetasProductos);//
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_sucursalProcesoCrearEtiquetasProductos.setEnabled(isHabilitar && this.procesocrearetiquetasproductosConstantesFunciones.activarid_sucursalProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_lineaProcesoCrearEtiquetasProductos.setEnabled(isHabilitar && this.procesocrearetiquetasproductosConstantesFunciones.activarid_lineaProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.setEnabled(isHabilitar && this.procesocrearetiquetasproductosConstantesFunciones.activarid_linea_grupoProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.setEnabled(isHabilitar && this.procesocrearetiquetasproductosConstantesFunciones.activarid_linea_categoriaProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.setEnabled(isHabilitar && this.procesocrearetiquetasproductosConstantesFunciones.activarid_linea_marcaProcesoCrearEtiquetasProductos);
	};
	
	public void setDefaultControlesProcesoCrearEtiquetasProductos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoCrearEtiquetasProductos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesocrearetiquetasproductosSessionBean.setConGuardarRelaciones(true);			
			this.procesocrearetiquetasproductosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTabbedPaneRelacionesProcesoCrearEtiquetasProductos.setVisible(true);
			
					
		} else {
			//this.procesocrearetiquetasproductosSessionBean.setConGuardarRelaciones(false);			
			this.procesocrearetiquetasproductosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTabbedPaneRelacionesProcesoCrearEtiquetasProductos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoCrearEtiquetasProductos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss()) {
				if(procesocrearetiquetasproductosAux.getId().equals(this.iIdNuevoProcesoCrearEtiquetasProductos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:this.procesocrearetiquetasproductoss) {
				if(procesocrearetiquetasproductosAux.getId().equals(this.iIdNuevoProcesoCrearEtiquetasProductos)) {
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
	
	public int getIndiceActualProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss()) {
				if(procesocrearetiquetasproductosAux.getId().equals(procesocrearetiquetasproductos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:this.procesocrearetiquetasproductoss) {
				if(procesocrearetiquetasproductosAux.getId().equals(procesocrearetiquetasproductos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss()) {
				if(procesocrearetiquetasproductosAux.getProcesoCrearEtiquetasProductosOriginal().getId().equals(procesocrearetiquetasproductosOriginal.getId())) {
					existe=true;
					procesocrearetiquetasproductosOriginal.setId(procesocrearetiquetasproductosAux.getId());
					procesocrearetiquetasproductosOriginal.setVersionRow(procesocrearetiquetasproductosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:this.procesocrearetiquetasproductoss) {
				if(procesocrearetiquetasproductosAux.getProcesoCrearEtiquetasProductosOriginal().getId().equals(procesocrearetiquetasproductosOriginal.getId())) {
					existe=true;
					procesocrearetiquetasproductosOriginal.setId(procesocrearetiquetasproductosAux.getId());
					procesocrearetiquetasproductosOriginal.setVersionRow(procesocrearetiquetasproductosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoCrearEtiquetasProductos(Boolean esParaCancelar) throws Exception {
		procesocrearetiquetasproductossAux=new ArrayList<ProcesoCrearEtiquetasProductos>();
		procesocrearetiquetasproductosAux=new ProcesoCrearEtiquetasProductos();
		
		if(!this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss()) {
					if(procesocrearetiquetasproductosAux.getId()<0) {
						procesocrearetiquetasproductossAux.add(procesocrearetiquetasproductosAux);
					}		
				}
				this.iIdNuevoProcesoCrearEtiquetasProductos=0L;
				this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().removeAll(procesocrearetiquetasproductossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:this.procesocrearetiquetasproductoss) {
					if(procesocrearetiquetasproductosAux.getId()<0) {
						procesocrearetiquetasproductossAux.add(procesocrearetiquetasproductosAux);
					}		
				}
				this.iIdNuevoProcesoCrearEtiquetasProductos=0L;
				this.procesocrearetiquetasproductoss.removeAll(procesocrearetiquetasproductossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoCrearEtiquetasProductos 
					&& this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().size()>0
					) {
					procesocrearetiquetasproductosAux=this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().get(this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().size() - 1);
				
					if(procesocrearetiquetasproductosAux.getId()<0) {
						this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().remove(procesocrearetiquetasproductosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoCrearEtiquetasProductos && this.procesocrearetiquetasproductoss.size()>0) {
					procesocrearetiquetasproductosAux=this.procesocrearetiquetasproductoss.get(this.procesocrearetiquetasproductoss.size() - 1);
				
					if(procesocrearetiquetasproductosAux.getId()<0) {
						this.procesocrearetiquetasproductoss.remove(procesocrearetiquetasproductosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoCrearEtiquetasProductos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesocrearetiquetasproductos.getId()<0) {
				this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().remove(this.procesocrearetiquetasproductos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesocrearetiquetasproductos.getId()<0) {
				this.procesocrearetiquetasproductoss.remove(this.procesocrearetiquetasproductos);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoCrearEtiquetasProductos(List<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossAux) throws Exception {
		ProcesoCrearEtiquetasProductosConstantesFunciones.setEstadosInicialesProcesoCrearEtiquetasProductos(procesocrearetiquetasproductossAux);
	}
	
	public void setEstadosInicialesProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux) throws Exception {
		ProcesoCrearEtiquetasProductosConstantesFunciones.setEstadosInicialesProcesoCrearEtiquetasProductos(procesocrearetiquetasproductosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoCrearEtiquetasProductosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoCrearEtiquetasProductosActual()) {
				if(!this.isEsNuevoProcesoCrearEtiquetasProductos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoCrearEtiquetasProductos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoCrearEtiquetasProductosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Crear Etiquetas Productos ?", "MANTENIMIENTO DE Proceso Crear Etiquetas Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos) throws Exception {
		ProcesoCrearEtiquetasProductosConstantesFunciones.seleccionarAsignar(this.procesocrearetiquetasproductos,procesocrearetiquetasproductos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoCrearEtiquetasProductos=this.isPermisoActualizarOriginalProcesoCrearEtiquetasProductos;
			
			
			this.seleccionarAsignar(procesocrearetiquetasproductos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesocrearetiquetasproductosSessionBean.setsFuncionBusquedaRapida(this.procesocrearetiquetasproductosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoCrearEtiquetasProductos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoCrearEtiquetasProductos(esParaCancelar);				
				this.cancelarNuevoProcesoCrearEtiquetasProductos(esParaCancelar);								
			}
			
			this.procesocrearetiquetasproductos=new ProcesoCrearEtiquetasProductos();
			
			this.inicializarProcesoCrearEtiquetasProductos();
			
			this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoCrearEtiquetasProductos() throws Exception {
		try {
			ProcesoCrearEtiquetasProductosConstantesFunciones.inicializarProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoCrearEtiquetasProductoss(String sAccionBusqueda,List<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoCrearEtiquetasProductos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoCrearEtiquetasProductosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoCrearEtiquetasProductosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoCrearEtiquetasProductos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Crear Etiquetas Productoses");		
		parameters.put("busquedapor", ProcesoCrearEtiquetasProductosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoCrearEtiquetasProductos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProcesoCrearEtiquetasProductosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProcesoCrearEtiquetasProductosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProcesoCrearEtiquetasProductos=new JRBeanArrayDataSource(ProcesoCrearEtiquetasProductosJInternalFrame.TraerProcesoCrearEtiquetasProductosBeans(procesocrearetiquetasproductossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoCrearEtiquetasProductos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoCrearEtiquetasProductosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoCrearEtiquetasProductosBean.TraerProcesoCrearEtiquetasProductosBeans(procesocrearetiquetasproductossParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoCrearEtiquetasProductoss(sAccionBusqueda,sTipoArchivoReporte,procesocrearetiquetasproductossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoCrearEtiquetasProductoss(sAccionBusqueda,sTipoArchivoReporte,procesocrearetiquetasproductossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasProductosActionPerformed(null);
					//this.generarExcelReporteProcesoCrearEtiquetasProductoss(sAccionBusqueda,sTipoArchivoReporte,procesocrearetiquetasproductossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoCrearEtiquetasProductoss(sAccionBusqueda,sTipoArchivoReporte,procesocrearetiquetasproductossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoCrearEtiquetasProductoss(sAccionBusqueda,sTipoArchivoReporte,procesocrearetiquetasproductossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoCrearEtiquetasProductoss(sAccionBusqueda,sTipoArchivoReporte,procesocrearetiquetasproductossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoCrearEtiquetasProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocrearetiquetasproductos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCrearEtiquetasProductoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCrearEtiquetasProductos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos : procesocrearetiquetasproductossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoCrearEtiquetasProductosConstantesFunciones.generarExcelReporteDataProcesoCrearEtiquetasProductos("NORMAL",row,workbook,procesocrearetiquetasproductos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Crear Etiquetas Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoCrearEtiquetasProductos(String sTipo,Row row,Workbook workbook) {
		
		ProcesoCrearEtiquetasProductosConstantesFunciones.generarExcelReporteHeaderProcesoCrearEtiquetasProductos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoCrearEtiquetasProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocrearetiquetasproductos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCrearEtiquetasProductoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos : procesocrearetiquetasproductossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.getProcesoCrearEtiquetasProductosDescripcion(procesocrearetiquetasproductos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetasproductos.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetasproductos.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetasproductos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetasproductos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetasproductos.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetasproductos.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetasproductos.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetasproductos.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetasproductos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetasproductos.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO1))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO1);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetasproductos.getprecio1());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO2))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO2);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetasproductos.getprecio2());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO3))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO3);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetasproductos.getprecio3());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO4))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO4);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetasproductos.getprecio4());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO5))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO5);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetasproductos.getprecio5());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Crear Etiquetas Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoCrearEtiquetasProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossRespaldo=null;
		
		classes=ProcesoCrearEtiquetasProductosConstantesFunciones.getClassesRelationshipsOfProcesoCrearEtiquetasProductos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesocrearetiquetasproductosLogic.setDatosCliente(this.datosCliente);
		this.procesocrearetiquetasproductosLogic.setDatosDeep(this.datosDeep);
		this.procesocrearetiquetasproductosLogic.setIsConDeep(true);
		
		procesocrearetiquetasproductossRespaldo=this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss();
		
		this.procesocrearetiquetasproductosLogic.setProcesoCrearEtiquetasProductoss(procesocrearetiquetasproductossParaReportes);	
		this.procesocrearetiquetasproductosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesocrearetiquetasproductossParaReportes=this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss();
		this.procesocrearetiquetasproductosLogic.setProcesoCrearEtiquetasProductoss(procesocrearetiquetasproductossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocrearetiquetasproductos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCrearEtiquetasProductoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCrearEtiquetasProductos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos : procesocrearetiquetasproductossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoCrearEtiquetasProductos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoCrearEtiquetasProductosConstantesFunciones.generarExcelReporteDataProcesoCrearEtiquetasProductos("NORMAL",row,workbook,procesocrearetiquetasproductos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.getProcesoCrearEtiquetasProductosDescripcion(procesocrearetiquetasproductos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Crear Etiquetas Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoCrearEtiquetasProductos() throws Exception {		
		this.startProcessProcesoCrearEtiquetasProductos(true);
	}
	
	public void startProcessProcesoCrearEtiquetasProductos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos ,this.jPanelParametrosReportesProcesoCrearEtiquetasProductos, this.jScrollPanelDatosProcesoCrearEtiquetasProductos,this.jPanelPaginacionProcesoCrearEtiquetasProductos, this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos, this.jPanelAccionesProcesoCrearEtiquetasProductos,this.jPanelAccionesFormularioProcesoCrearEtiquetasProductos,this.jmenuBarProcesoCrearEtiquetasProductos,this.jmenuBarDetalleProcesoCrearEtiquetasProductos,this.jTtoolBarProcesoCrearEtiquetasProductos,this.jTtoolBarDetalleProcesoCrearEtiquetasProductos);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCrearEtiquetasProductos=this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos; 
		
		final JPanel jPanelParametrosReportesProcesoCrearEtiquetasProductos=this.jPanelParametrosReportesProcesoCrearEtiquetasProductos;
		//final JScrollPane jScrollPanelDatosProcesoCrearEtiquetasProductos=this.jScrollPanelDatosProcesoCrearEtiquetasProductos;
		final JTable jTableDatosProcesoCrearEtiquetasProductos=this.jTableDatosProcesoCrearEtiquetasProductos;		
		final JPanel jPanelPaginacionProcesoCrearEtiquetasProductos=this.jPanelPaginacionProcesoCrearEtiquetasProductos;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos=this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos;
		final JPanel jPanelAccionesProcesoCrearEtiquetasProductos=this.jPanelAccionesProcesoCrearEtiquetasProductos;
		
		JPanel jPanelCamposAuxiliarProcesoCrearEtiquetasProductos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCrearEtiquetasProductos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
			jPanelCamposAuxiliarProcesoCrearEtiquetasProductos=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jPanelCamposProcesoCrearEtiquetasProductos;
			jPanelAccionesFormularioAuxiliarProcesoCrearEtiquetasProductos=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jPanelAccionesFormularioProcesoCrearEtiquetasProductos;
		}
		
		final JPanel jPanelCamposProcesoCrearEtiquetasProductos=jPanelCamposAuxiliarProcesoCrearEtiquetasProductos;
		final JPanel jPanelAccionesFormularioProcesoCrearEtiquetasProductos=jPanelAccionesFormularioAuxiliarProcesoCrearEtiquetasProductos;
		
		
		final JMenuBar jmenuBarProcesoCrearEtiquetasProductos=this.jmenuBarProcesoCrearEtiquetasProductos;
		final JToolBar jTtoolBarProcesoCrearEtiquetasProductos=this.jTtoolBarProcesoCrearEtiquetasProductos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoCrearEtiquetasProductos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCrearEtiquetasProductos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
			jmenuBarDetalleAuxiliarProcesoCrearEtiquetasProductos=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jmenuBarDetalleProcesoCrearEtiquetasProductos;
			jTtoolBarDetalleAuxiliarProcesoCrearEtiquetasProductos=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTtoolBarDetalleProcesoCrearEtiquetasProductos;
		}
		
		final JMenuBar jmenuBarDetalleProcesoCrearEtiquetasProductos=jmenuBarDetalleAuxiliarProcesoCrearEtiquetasProductos;
		final JToolBar jTtoolBarDetalleProcesoCrearEtiquetasProductos=jTtoolBarDetalleAuxiliarProcesoCrearEtiquetasProductos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCrearEtiquetasProductos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCrearEtiquetasProductos;
			processRunnable.jTableDatos=jTableDatosProcesoCrearEtiquetasProductos;
			processRunnable.jPanelCampos=jPanelCamposProcesoCrearEtiquetasProductos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCrearEtiquetasProductos;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCrearEtiquetasProductos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCrearEtiquetasProductos;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCrearEtiquetasProductos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCrearEtiquetasProductos;
			processRunnable.jTtoolBar=jTtoolBarProcesoCrearEtiquetasProductos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCrearEtiquetasProductos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCrearEtiquetasProductos ,jPanelParametrosReportesProcesoCrearEtiquetasProductos,jTableDatosProcesoCrearEtiquetasProductos, /*jScrollPanelDatosProcesoCrearEtiquetasProductos,*/jPanelCamposProcesoCrearEtiquetasProductos,jPanelPaginacionProcesoCrearEtiquetasProductos, /*jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos,*/ jPanelAccionesProcesoCrearEtiquetasProductos,jPanelAccionesFormularioProcesoCrearEtiquetasProductos,jmenuBarProcesoCrearEtiquetasProductos,jmenuBarDetalleProcesoCrearEtiquetasProductos,jTtoolBarProcesoCrearEtiquetasProductos,jTtoolBarDetalleProcesoCrearEtiquetasProductos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCrearEtiquetasProductos ,jPanelParametrosReportesProcesoCrearEtiquetasProductos, jScrollPanelDatosProcesoCrearEtiquetasProductos,jPanelPaginacionProcesoCrearEtiquetasProductos, jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos, jPanelAccionesProcesoCrearEtiquetasProductos,jPanelAccionesFormularioProcesoCrearEtiquetasProductos,jmenuBarProcesoCrearEtiquetasProductos,jmenuBarDetalleProcesoCrearEtiquetasProductos,jTtoolBarProcesoCrearEtiquetasProductos,jTtoolBarDetalleProcesoCrearEtiquetasProductos);
						
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
	
	public void finishProcessProcesoCrearEtiquetasProductos() {// throws Exception 
		this.finishProcessProcesoCrearEtiquetasProductos(true);
	}
	
	public void finishProcessProcesoCrearEtiquetasProductos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos ,this.jPanelParametrosReportesProcesoCrearEtiquetasProductos, this.jScrollPanelDatosProcesoCrearEtiquetasProductos,this.jPanelPaginacionProcesoCrearEtiquetasProductos, this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos, this.jPanelAccionesProcesoCrearEtiquetasProductos,this.jPanelAccionesFormularioProcesoCrearEtiquetasProductos,this.jmenuBarProcesoCrearEtiquetasProductos,this.jmenuBarDetalleProcesoCrearEtiquetasProductos,this.jTtoolBarProcesoCrearEtiquetasProductos,this.jTtoolBarDetalleProcesoCrearEtiquetasProductos);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCrearEtiquetasProductos=this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos; 
		
		final JPanel jPanelParametrosReportesProcesoCrearEtiquetasProductos=this.jPanelParametrosReportesProcesoCrearEtiquetasProductos;
		//final JScrollPane jScrollPanelDatosProcesoCrearEtiquetasProductos=this.jScrollPanelDatosProcesoCrearEtiquetasProductos;
		final JTable jTableDatosProcesoCrearEtiquetasProductos=this.jTableDatosProcesoCrearEtiquetasProductos;		
		final JPanel jPanelPaginacionProcesoCrearEtiquetasProductos=this.jPanelPaginacionProcesoCrearEtiquetasProductos;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos=this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos;
		final JPanel jPanelAccionesProcesoCrearEtiquetasProductos=this.jPanelAccionesProcesoCrearEtiquetasProductos;
		
		JPanel jPanelCamposAuxiliarProcesoCrearEtiquetasProductos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCrearEtiquetasProductos=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
			jPanelCamposAuxiliarProcesoCrearEtiquetasProductos=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jPanelCamposProcesoCrearEtiquetasProductos;
			jPanelAccionesFormularioAuxiliarProcesoCrearEtiquetasProductos=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jPanelAccionesFormularioProcesoCrearEtiquetasProductos;
		}
		
		final JPanel jPanelCamposProcesoCrearEtiquetasProductos=jPanelCamposAuxiliarProcesoCrearEtiquetasProductos;
		final JPanel jPanelAccionesFormularioProcesoCrearEtiquetasProductos=jPanelAccionesFormularioAuxiliarProcesoCrearEtiquetasProductos;
		
		
		final JMenuBar jmenuBarProcesoCrearEtiquetasProductos=this.jmenuBarProcesoCrearEtiquetasProductos;		
		final JToolBar jTtoolBarProcesoCrearEtiquetasProductos=this.jTtoolBarProcesoCrearEtiquetasProductos;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoCrearEtiquetasProductos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCrearEtiquetasProductos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
			jmenuBarDetalleAuxiliarProcesoCrearEtiquetasProductos=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jmenuBarDetalleProcesoCrearEtiquetasProductos;
			jTtoolBarDetalleAuxiliarProcesoCrearEtiquetasProductos=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTtoolBarDetalleProcesoCrearEtiquetasProductos;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoCrearEtiquetasProductos=jmenuBarDetalleAuxiliarProcesoCrearEtiquetasProductos;
		final JToolBar jTtoolBarDetalleProcesoCrearEtiquetasProductos=jTtoolBarDetalleAuxiliarProcesoCrearEtiquetasProductos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCrearEtiquetasProductos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCrearEtiquetasProductos;
			processRunnable.jTableDatos=jTableDatosProcesoCrearEtiquetasProductos;
			processRunnable.jPanelCampos=jPanelCamposProcesoCrearEtiquetasProductos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCrearEtiquetasProductos;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCrearEtiquetasProductos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCrearEtiquetasProductos;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCrearEtiquetasProductos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCrearEtiquetasProductos;
			processRunnable.jTtoolBar=jTtoolBarProcesoCrearEtiquetasProductos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCrearEtiquetasProductos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoCrearEtiquetasProductos ,jPanelParametrosReportesProcesoCrearEtiquetasProductos, jTableDatosProcesoCrearEtiquetasProductos,/*jScrollPanelDatosProcesoCrearEtiquetasProductos,*/jPanelCamposProcesoCrearEtiquetasProductos,jPanelPaginacionProcesoCrearEtiquetasProductos, /*jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos,*/ jPanelAccionesProcesoCrearEtiquetasProductos,jPanelAccionesFormularioProcesoCrearEtiquetasProductos,jmenuBarProcesoCrearEtiquetasProductos,jmenuBarDetalleProcesoCrearEtiquetasProductos,jTtoolBarProcesoCrearEtiquetasProductos,jTtoolBarDetalleProcesoCrearEtiquetasProductos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoCrearEtiquetasProductos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoCrearEtiquetasProductos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoCrearEtiquetasProductos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoCrearEtiquetasProductos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoCrearEtiquetasProductos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoCrearEtiquetasProductos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoCrearEtiquetasProductos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoCrearEtiquetasProductos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoCrearEtiquetasProductos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesocrearetiquetasproductosConstantesFunciones.getsFinalQueryProcesoCrearEtiquetasProductos();
		String  finalQueryPaginacionTodos=this.procesocrearetiquetasproductosConstantesFunciones.getsFinalQueryProcesoCrearEtiquetasProductos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoCrearEtiquetasProductosConstantesFunciones.getArrayColumnasGlobalesNoProcesoCrearEtiquetasProductos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoCrearEtiquetasProductosConstantesFunciones.getArrayColumnasGlobalesProcesoCrearEtiquetasProductos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoCrearEtiquetasProductosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesocrearetiquetasproductossEliminados= new ArrayList<ProcesoCrearEtiquetasProductos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoCrearEtiquetasProductos();
		
				///*ProcesoCrearEtiquetasProductosSessionBean*/this.procesocrearetiquetasproductosSessionBean=new ProcesoCrearEtiquetasProductosSessionBean();
			
			if(this.procesocrearetiquetasproductosSessionBean==null) {
				this.procesocrearetiquetasproductosSessionBean=new ProcesoCrearEtiquetasProductosSessionBean();
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
					this.iNumeroPaginacion=ProcesoCrearEtiquetasProductosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoCrearEtiquetasProductosConstantesFunciones.getClassesForeignKeysOfProcesoCrearEtiquetasProductos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesocrearetiquetasproductos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesocrearetiquetasproductossAux= new ArrayList<ProcesoCrearEtiquetasProductos>();
			
				
			procesocrearetiquetasproductosLogic.setDatosCliente(this.datosCliente);
			procesocrearetiquetasproductosLogic.setDatosDeep(this.datosDeep);
			procesocrearetiquetasproductosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoCrearEtiquetasProductos")) {
				this.sDetalleReporte=ProcesoCrearEtiquetasProductosConstantesFunciones.getDetalleIndiceBusquedaProcesoCrearEtiquetasProductos(id_bodegaBusquedaProcesoCrearEtiquetasProductos,id_productoBusquedaProcesoCrearEtiquetasProductos,id_lineaBusquedaProcesoCrearEtiquetasProductos,id_linea_grupoBusquedaProcesoCrearEtiquetasProductos,id_linea_categoriaBusquedaProcesoCrearEtiquetasProductos,id_linea_marcaBusquedaProcesoCrearEtiquetasProductos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductossBusquedaProcesoCrearEtiquetasProductos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaProcesoCrearEtiquetasProductos,id_productoBusquedaProcesoCrearEtiquetasProductos,id_lineaBusquedaProcesoCrearEtiquetasProductos,id_linea_grupoBusquedaProcesoCrearEtiquetasProductos,id_linea_categoriaBusquedaProcesoCrearEtiquetasProductos,id_linea_marcaBusquedaProcesoCrearEtiquetasProductos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCrearEtiquetasProductosConstantesFunciones.getDetalleIndiceBusquedaProcesoCrearEtiquetasProductos(id_bodegaBusquedaProcesoCrearEtiquetasProductos,id_productoBusquedaProcesoCrearEtiquetasProductos,id_lineaBusquedaProcesoCrearEtiquetasProductos,id_linea_grupoBusquedaProcesoCrearEtiquetasProductos,id_linea_categoriaBusquedaProcesoCrearEtiquetasProductos,id_linea_marcaBusquedaProcesoCrearEtiquetasProductos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCrearEtiquetasProductosConstantesFunciones.getDetalleIndiceBusquedaProcesoCrearEtiquetasProductos(id_bodegaBusquedaProcesoCrearEtiquetasProductos,id_productoBusquedaProcesoCrearEtiquetasProductos,id_lineaBusquedaProcesoCrearEtiquetasProductos,id_linea_grupoBusquedaProcesoCrearEtiquetasProductos,id_linea_categoriaBusquedaProcesoCrearEtiquetasProductos,id_linea_marcaBusquedaProcesoCrearEtiquetasProductos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss()==null||procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesocrearetiquetasproductoss==null|| procesocrearetiquetasproductoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocrearetiquetasproductossAux=new ArrayList<ProcesoCrearEtiquetasProductos>();
						procesocrearetiquetasproductossAux.addAll(procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocrearetiquetasproductossAux=new ArrayList<ProcesoCrearEtiquetasProductos>();
							procesocrearetiquetasproductossAux.addAll(procesocrearetiquetasproductoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductossBusquedaProcesoCrearEtiquetasProductos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaProcesoCrearEtiquetasProductos,id_productoBusquedaProcesoCrearEtiquetasProductos,id_lineaBusquedaProcesoCrearEtiquetasProductos,id_linea_grupoBusquedaProcesoCrearEtiquetasProductos,id_linea_categoriaBusquedaProcesoCrearEtiquetasProductos,id_linea_marcaBusquedaProcesoCrearEtiquetasProductos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCrearEtiquetasProductosConstantesFunciones.getDetalleIndiceBusquedaProcesoCrearEtiquetasProductos(id_bodegaBusquedaProcesoCrearEtiquetasProductos,id_productoBusquedaProcesoCrearEtiquetasProductos,id_lineaBusquedaProcesoCrearEtiquetasProductos,id_linea_grupoBusquedaProcesoCrearEtiquetasProductos,id_linea_categoriaBusquedaProcesoCrearEtiquetasProductos,id_linea_marcaBusquedaProcesoCrearEtiquetasProductos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCrearEtiquetasProductosConstantesFunciones.getDetalleIndiceBusquedaProcesoCrearEtiquetasProductos(id_bodegaBusquedaProcesoCrearEtiquetasProductos,id_productoBusquedaProcesoCrearEtiquetasProductos,id_lineaBusquedaProcesoCrearEtiquetasProductos,id_linea_grupoBusquedaProcesoCrearEtiquetasProductos,id_linea_categoriaBusquedaProcesoCrearEtiquetasProductos,id_linea_marcaBusquedaProcesoCrearEtiquetasProductos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoCrearEtiquetasProductoss("BusquedaProcesoCrearEtiquetasProductos",procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoCrearEtiquetasProductoss("BusquedaProcesoCrearEtiquetasProductos",procesocrearetiquetasproductoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocrearetiquetasproductosLogic.setProcesoCrearEtiquetasProductoss(new ArrayList<ProcesoCrearEtiquetasProductos>());
						procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().addAll(procesocrearetiquetasproductossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocrearetiquetasproductoss=new ArrayList<ProcesoCrearEtiquetasProductos>();
							procesocrearetiquetasproductoss.addAll(procesocrearetiquetasproductossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoCrearEtiquetasProductos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoCrearEtiquetasProductos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocrearetiquetasproductoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocrearetiquetasproductoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos) {
		Boolean permite=true;
		
		if(this.procesocrearetiquetasproductos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoCrearEtiquetasProductosConstantesFunciones.getOrderByListaProcesoCrearEtiquetasProductos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoCrearEtiquetasProductosConstantesFunciones.getOrderByListaProcesoCrearEtiquetasProductos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos:procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss()) {
				if(procesocrearetiquetasproductos.getsType().equals(Constantes2.S_TOTALES)) {
					procesocrearetiquetasproductosTotales=procesocrearetiquetasproductos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos:this.procesocrearetiquetasproductoss) {
				if(procesocrearetiquetasproductos.getsType().equals(Constantes2.S_TOTALES)) {
					procesocrearetiquetasproductosTotales=procesocrearetiquetasproductos;
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
			this.procesocrearetiquetasproductosAux=new ProcesoCrearEtiquetasProductos();
			this.procesocrearetiquetasproductosAux.setsType(Constantes2.S_TOTALES);
			this.procesocrearetiquetasproductosAux.setIsNew(false);
			this.procesocrearetiquetasproductosAux.setIsChanged(false);
			this.procesocrearetiquetasproductosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoCrearEtiquetasProductosConstantesFunciones.TotalizarValoresFilaProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss(),this.procesocrearetiquetasproductosAux);
				
				//this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().add(this.procesocrearetiquetasproductosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoCrearEtiquetasProductosConstantesFunciones.TotalizarValoresFilaProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductoss,this.procesocrearetiquetasproductosAux);
				
				this.procesocrearetiquetasproductoss.add(this.procesocrearetiquetasproductosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesocrearetiquetasproductosTotales=new ProcesoCrearEtiquetasProductos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().remove(procesocrearetiquetasproductosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocrearetiquetasproductoss.remove(procesocrearetiquetasproductosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesocrearetiquetasproductosTotales=new ProcesoCrearEtiquetasProductos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos:procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss()) {
				if(procesocrearetiquetasproductos.getsType().equals(Constantes2.S_TOTALES)) {
					procesocrearetiquetasproductosTotales=procesocrearetiquetasproductos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCrearEtiquetasProductosConstantesFunciones.TotalizarValoresFilaProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss(),procesocrearetiquetasproductosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos:this.procesocrearetiquetasproductoss) {
				if(procesocrearetiquetasproductos.getsType().equals(Constantes2.S_TOTALES)) {
					procesocrearetiquetasproductosTotales=procesocrearetiquetasproductos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCrearEtiquetasProductosConstantesFunciones.TotalizarValoresFilaProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductoss,procesocrearetiquetasproductosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoCrearEtiquetasProductossBusquedaProcesoCrearEtiquetasProductos()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoCrearEtiquetasProductos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCrearEtiquetasProductossFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCrearEtiquetasProductossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCrearEtiquetasProductossFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCrearEtiquetasProductossFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCrearEtiquetasProductossFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCrearEtiquetasProductossFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCrearEtiquetasProductossFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCrearEtiquetasProductossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoCrearEtiquetasProductossBusquedaProcesoCrearEtiquetasProductos(String sFinalQuery,Long id_bodega,Long id_producto,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductossBusquedaProcesoCrearEtiquetasProductos(sFinalQuery,this.pagination,id_bodega,id_producto,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCrearEtiquetasProductossFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductossFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCrearEtiquetasProductossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCrearEtiquetasProductossFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductossFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCrearEtiquetasProductossFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductossFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCrearEtiquetasProductossFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductossFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCrearEtiquetasProductossFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductossFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCrearEtiquetasProductossFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductossFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCrearEtiquetasProductossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosProcesoCrearEtiquetasProductos() {
		this.isPermisoTodoProcesoCrearEtiquetasProductos=false;
		this.isPermisoNuevoProcesoCrearEtiquetasProductos=false;
		this.isPermisoActualizarProcesoCrearEtiquetasProductos=false;
		this.isPermisoActualizarOriginalProcesoCrearEtiquetasProductos=false;
		this.isPermisoEliminarProcesoCrearEtiquetasProductos=false;
		this.isPermisoGuardarCambiosProcesoCrearEtiquetasProductos=false;
		this.isPermisoConsultaProcesoCrearEtiquetasProductos=true;
		this.isPermisoBusquedaProcesoCrearEtiquetasProductos=true;
		this.isPermisoReporteProcesoCrearEtiquetasProductos=true;
		this.isPermisoOrdenProcesoCrearEtiquetasProductos=false;		
		this.isPermisoPaginacionMedioProcesoCrearEtiquetasProductos=false;		
		this.isPermisoPaginacionAltoProcesoCrearEtiquetasProductos=false;		
		this.isPermisoPaginacionTodoProcesoCrearEtiquetasProductos=false;		
		this.isPermisoCopiarProcesoCrearEtiquetasProductos=false;		
		this.isPermisoVerFormProcesoCrearEtiquetasProductos=false;		
		this.isPermisoDuplicarProcesoCrearEtiquetasProductos=false;
		this.isPermisoOrdenProcesoCrearEtiquetasProductos=false;
	}
	
	public void setPermisosUsuarioProcesoCrearEtiquetasProductos(Boolean isPermiso) {
		this.isPermisoTodoProcesoCrearEtiquetasProductos=isPermiso;
		this.isPermisoNuevoProcesoCrearEtiquetasProductos=isPermiso;
		this.isPermisoActualizarProcesoCrearEtiquetasProductos=isPermiso;
		this.isPermisoActualizarOriginalProcesoCrearEtiquetasProductos=isPermiso;
		this.isPermisoEliminarProcesoCrearEtiquetasProductos=isPermiso;
		this.isPermisoGuardarCambiosProcesoCrearEtiquetasProductos=isPermiso;
		this.isPermisoConsultaProcesoCrearEtiquetasProductos=isPermiso;
		this.isPermisoBusquedaProcesoCrearEtiquetasProductos=isPermiso;
		this.isPermisoReporteProcesoCrearEtiquetasProductos=isPermiso;
		this.isPermisoOrdenProcesoCrearEtiquetasProductos=isPermiso;		
		this.isPermisoPaginacionMedioProcesoCrearEtiquetasProductos=isPermiso;		
		this.isPermisoPaginacionAltoProcesoCrearEtiquetasProductos=isPermiso;		
		this.isPermisoPaginacionTodoProcesoCrearEtiquetasProductos=isPermiso;		
		this.isPermisoCopiarProcesoCrearEtiquetasProductos=isPermiso;		
		this.isPermisoVerFormProcesoCrearEtiquetasProductos=isPermiso;		
		this.isPermisoDuplicarProcesoCrearEtiquetasProductos=isPermiso;
		this.isPermisoOrdenProcesoCrearEtiquetasProductos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoCrearEtiquetasProductos(Boolean isPermiso) {
		//this.isPermisoTodoProcesoCrearEtiquetasProductos=isPermiso;
		this.isPermisoNuevoProcesoCrearEtiquetasProductos=isPermiso;
		this.isPermisoActualizarProcesoCrearEtiquetasProductos=isPermiso;
		this.isPermisoActualizarOriginalProcesoCrearEtiquetasProductos=isPermiso;
		this.isPermisoEliminarProcesoCrearEtiquetasProductos=isPermiso;
		this.isPermisoGuardarCambiosProcesoCrearEtiquetasProductos=isPermiso;
		//this.isPermisoConsultaProcesoCrearEtiquetasProductos=isPermiso;
		//this.isPermisoBusquedaProcesoCrearEtiquetasProductos=isPermiso;
		//this.isPermisoReporteProcesoCrearEtiquetasProductos=isPermiso;
		//this.isPermisoOrdenProcesoCrearEtiquetasProductos=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoCrearEtiquetasProductos=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoCrearEtiquetasProductos=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoCrearEtiquetasProductos=isPermiso;		
		//this.isPermisoCopiarProcesoCrearEtiquetasProductos=isPermiso;		
		//this.isPermisoDuplicarProcesoCrearEtiquetasProductos=isPermiso;
		//this.isPermisoOrdenProcesoCrearEtiquetasProductos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCrearEtiquetasProductosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoCrearEtiquetasProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoCrearEtiquetasProductos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCrearEtiquetasProductosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoCrearEtiquetasProductosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoCrearEtiquetasProductosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoCrearEtiquetasProductosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoCrearEtiquetasProductos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoCrearEtiquetasProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoCrearEtiquetasProductosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoCrearEtiquetasProductos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoCrearEtiquetasProductos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoCrearEtiquetasProductos=this.isPermisoActualizarProcesoCrearEtiquetasProductos;
			this.isPermisoEliminarProcesoCrearEtiquetasProductos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoCrearEtiquetasProductos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoCrearEtiquetasProductos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoCrearEtiquetasProductos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoCrearEtiquetasProductos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoCrearEtiquetasProductos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCrearEtiquetasProductos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoCrearEtiquetasProductos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoCrearEtiquetasProductos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoCrearEtiquetasProductos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoCrearEtiquetasProductos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoCrearEtiquetasProductos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoCrearEtiquetasProductos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCrearEtiquetasProductos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoCrearEtiquetasProductos.setToolTipText(this.jTableDatosProcesoCrearEtiquetasProductos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoCrearEtiquetasProductos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoCrearEtiquetasProductos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoCrearEtiquetasProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoCrearEtiquetasProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoCrearEtiquetasProductos() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoCrearEtiquetasProductosListas()throws Exception {
		try	{						
			
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoCrearEtiquetasProductosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoCrearEtiquetasProductosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoCrearEtiquetasProductos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyLineaGrupo();
			this.addItemDefectoCombosForeignKeyLineaCategoria();
			this.addItemDefectoCombosForeignKeyLineaMarca();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {
			if(this.procesocrearetiquetasproductosSessionBean==null) {
				this.procesocrearetiquetasproductosSessionBean=new ProcesoCrearEtiquetasProductosSessionBean();
			}

			if(!this.procesocrearetiquetasproductosSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.procesocrearetiquetasproductosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

			if(!this.procesocrearetiquetasproductosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.procesocrearetiquetasproductosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.procesocrearetiquetasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.procesocrearetiquetasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

			if(!this.procesocrearetiquetasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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

			if(!this.procesocrearetiquetasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
	
	public void initActionsCombosTodosForeignKeyProcesoCrearEtiquetasProductos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoCrearEtiquetasProductos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoCrearEtiquetasProductos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCrearEtiquetasProductos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoCrearEtiquetasProductos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCrearEtiquetasProductos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoCrearEtiquetasProductos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoCrearEtiquetasProductos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoCrearEtiquetasProductos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoCrearEtiquetasProductos()throws Exception {
		try {
			

			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoCrearEtiquetasProductos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoCrearEtiquetasProductos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_bodegaProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_bodegaProcesoCrearEtiquetasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_bodegaProcesoCrearEtiquetasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_productoProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_productoProcesoCrearEtiquetasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_productoProcesoCrearEtiquetasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_empresaProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_empresaProcesoCrearEtiquetasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_empresaProcesoCrearEtiquetasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_sucursalProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_sucursalProcesoCrearEtiquetasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_sucursalProcesoCrearEtiquetasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_lineaProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_lineaProcesoCrearEtiquetasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_lineaProcesoCrearEtiquetasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesocrearetiquetasproductosSessionBean=new ProcesoCrearEtiquetasProductosSessionBean(); 
		this.procesocrearetiquetasproductosConstantesFunciones=new ProcesoCrearEtiquetasProductosConstantesFunciones(); 
		this.procesocrearetiquetasproductosBean=new ProcesoCrearEtiquetasProductos();//(this.procesocrearetiquetasproductosConstantesFunciones); 		
		this.procesocrearetiquetasproductosReturnGeneral=new ProcesoCrearEtiquetasProductosParameterReturnGeneral(); 
		
		this.procesocrearetiquetasproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocrearetiquetasproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoCrearEtiquetasProductos(true);
			
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
			
			this.procesocrearetiquetasproductosConstantesFunciones=new ProcesoCrearEtiquetasProductosConstantesFunciones(); 
			this.procesocrearetiquetasproductosBean=new ProcesoCrearEtiquetasProductos();//this.procesocrearetiquetasproductosConstantesFunciones); 			
			this.procesocrearetiquetasproductosReturnGeneral=new ProcesoCrearEtiquetasProductosParameterReturnGeneral(); 
		
			ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Crear Etiquetas Productos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.procesocrearetiquetasproductos=new ProcesoCrearEtiquetasProductos();
			this.procesocrearetiquetasproductoss = new ArrayList<ProcesoCrearEtiquetasProductos>();
			this.procesocrearetiquetasproductossAux = new ArrayList<ProcesoCrearEtiquetasProductos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic=new ProcesoCrearEtiquetasProductosLogic();
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}
			
			//this.procesocrearetiquetasproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesocrearetiquetasproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos);	
					}
					
					if(this.jInternalFrameImportacionProcesoCrearEtiquetasProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCrearEtiquetasProductos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoCrearEtiquetasProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoCrearEtiquetasProductos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos);
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.setVisible(false);
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos);
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoCrearEtiquetasProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCrearEtiquetasProductos);
					this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setVisible(false);
					this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoCrearEtiquetasProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCrearEtiquetasProductos);
					this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.setVisible(false);
					this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoCrearEtiquetasProductosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoCrearEtiquetasProductosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesocrearetiquetasproductosReturnGeneral=new ProcesoCrearEtiquetasProductosParameterReturnGeneral();
			
			this.procesocrearetiquetasproductosParameterGeneral=new ProcesoCrearEtiquetasProductosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesocrearetiquetasproductosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoCrearEtiquetasProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCrearEtiquetasProductosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado(),this.procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCrearEtiquetasProductosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado(),this.procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaDuplicarProcesoCrearEtiquetasProductos=true;
			this.isVisibilidadCeldaCopiarProcesoCrearEtiquetasProductos=true;
			this.isVisibilidadCeldaVerFormProcesoCrearEtiquetasProductos=true;
			this.isVisibilidadCeldaOrdenProcesoCrearEtiquetasProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaModificarProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos=false;
			
			
			this.isVisibilidadBusquedaProcesoCrearEtiquetasProductos=true;
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoCrearEtiquetasProductos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoCrearEtiquetasProductos(false);
			
			this.setPermisosUsuarioProcesoCrearEtiquetasProductos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado() 
				|| (this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado() && this.procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoCrearEtiquetasProductosClasesRelacionadas();
			}
			
			if(this.procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoCrearEtiquetasProductosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoCrearEtiquetasProductos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoCrearEtiquetasProductos();
			}
			
			if(!this.isPermisoBusquedaProcesoCrearEtiquetasProductos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoCrearEtiquetasProductosConstantesFunciones.getTiposSeleccionarProcesoCrearEtiquetasProductos());
				
				this.tiposColumnasSelect=ProcesoCrearEtiquetasProductosConstantesFunciones.getTiposSeleccionarProcesoCrearEtiquetasProductos(true);
				
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
			//if(!this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoCrearEtiquetasProductos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioProcesoCrearEtiquetasProductos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioProcesoCrearEtiquetasProductos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCrearEtiquetasProductos() ;
			
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
			
			this.bodegaLogic=new BodegaLogic();
			this.productoLogic=new ProductoLogic();
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
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
				procesocrearetiquetasproductosImplementable= (ProcesoCrearEtiquetasProductosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCrearEtiquetasProductosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesocrearetiquetasproductosImplementableHome= (ProcesoCrearEtiquetasProductosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCrearEtiquetasProductosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesocrearetiquetasproductoss= new ArrayList<ProcesoCrearEtiquetasProductos>();
			this.procesocrearetiquetasproductossEliminados= new ArrayList<ProcesoCrearEtiquetasProductos>();
						
			this.isEsNuevoProcesoCrearEtiquetasProductos=false;
			this.esParaAccionDesdeFormularioProcesoCrearEtiquetasProductos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoCrearEtiquetasProductos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoCrearEtiquetasProductos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoCrearEtiquetasProductosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoCrearEtiquetasProductos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoCrearEtiquetasProductos();
			}
			
			ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoCrearEtiquetasProductos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoCrearEtiquetasProductos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoCrearEtiquetasProductos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoCrearEtiquetasProductos")) {
				iIndex=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTabbedPaneRelacionesProcesoCrearEtiquetasProductos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTabbedPaneRelacionesProcesoCrearEtiquetasProductos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoCrearEtiquetasProductos();	
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
	
	public void cargarCombosForeignKeyProcesoCrearEtiquetasProductos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoCrearEtiquetasProductos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoCrearEtiquetasProductos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoCrearEtiquetasProductosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoCrearEtiquetasProductos();
		
		this.cargarCombosFrameForeignKeyProcesoCrearEtiquetasProductos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoCrearEtiquetasProductos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoCrearEtiquetasProductos();
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
	
	public void jButtonNuevoProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
			
			
			if(jTableDatosProcesoCrearEtiquetasProductos.getRowCount()>=1) {
				jTableDatosProcesoCrearEtiquetasProductos.removeRowSelectionInterval(0, jTableDatosProcesoCrearEtiquetasProductos.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoCrearEtiquetasProductos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoCrearEtiquetasProductos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoCrearEtiquetasProductos(true);			
			//this.procesocrearetiquetasproductos=new ProcesoCrearEtiquetasProductos();
			//this.procesocrearetiquetasproductos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCrearEtiquetasProductos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCrearEtiquetasProductos() ;
			
			if(ProcesoCrearEtiquetasProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCrearEtiquetasProductos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesocrearetiquetasproductos);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetasproductos);				
			
			ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
			
			if(this.procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoCrearEtiquetasProductos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossSeleccionados=new ArrayList<ProcesoCrearEtiquetasProductos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRows().length;			
			}
			
			procesocrearetiquetasproductossSeleccionados=this.getProcesoCrearEtiquetasProductossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoCrearEtiquetasProductos--;			
				//ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux= new ProcesoCrearEtiquetasProductos();			
				//procesocrearetiquetasproductosAux.setId(this.iIdNuevoProcesoCrearEtiquetasProductos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosOrigen=new ProcesoCrearEtiquetasProductos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosOrigen : procesocrearetiquetasproductossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesocrearetiquetasproductosOrigen =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocrearetiquetasproductosOrigen =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoCrearEtiquetasProductos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesocrearetiquetasproductos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoCrearEtiquetasProductos(procesocrearetiquetasproductosOrigen,this.procesocrearetiquetasproductos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().add(this.procesocrearetiquetasproductosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetasproductoss.add(this.procesocrearetiquetasproductosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoCrearEtiquetasProductos(false);
				
				this.jTableDatosProcesoCrearEtiquetasProductos.setRowSelectionInterval(this.getIndiceNuevoProcesoCrearEtiquetasProductos(), this.getIndiceNuevoProcesoCrearEtiquetasProductos());
				
				int iLastRow =  this.jTableDatosProcesoCrearEtiquetasProductos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCrearEtiquetasProductos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCrearEtiquetasProductos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCrearEtiquetasProductos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossSeleccionados=new ArrayList<ProcesoCrearEtiquetasProductos>();									
		
			ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosOrigen=new ProcesoCrearEtiquetasProductos();
			ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosDestino=new ProcesoCrearEtiquetasProductos();
				
			procesocrearetiquetasproductossSeleccionados=this.getProcesoCrearEtiquetasProductossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesocrearetiquetasproductossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocrearetiquetasproductosOrigen =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocrearetiquetasproductosOrigen =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocrearetiquetasproductosDestino =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocrearetiquetasproductosDestino =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesocrearetiquetasproductosOrigen =procesocrearetiquetasproductossSeleccionados.get(0);
				procesocrearetiquetasproductosDestino =procesocrearetiquetasproductossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoCrearEtiquetasProductos(procesocrearetiquetasproductosOrigen,procesocrearetiquetasproductosDestino,true,false);
				
				procesocrearetiquetasproductosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesocrearetiquetasproductosDestino,procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesocrearetiquetasproductosDestino,procesocrearetiquetasproductoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoCrearEtiquetasProductos(false);
				
				//this.jTableDatosProcesoCrearEtiquetasProductos.setRowSelectionInterval(this.getIndiceNuevoProcesoCrearEtiquetasProductos(), this.getIndiceNuevoProcesoCrearEtiquetasProductos());
				
				int iLastRow =  this.jTableDatosProcesoCrearEtiquetasProductos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCrearEtiquetasProductos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCrearEtiquetasProductos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCrearEtiquetasProductos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.setVisible(!isVisible);
			this.jPanelPaginacionProcesoCrearEtiquetasProductos.setVisible(!isVisible);
			this.jPanelAccionesProcesoCrearEtiquetasProductos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoCrearEtiquetasProductos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoCrearEtiquetasProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoCrearEtiquetasProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoCrearEtiquetasProductos();
			
			this.abrirFrameOrderByProcesoCrearEtiquetasProductos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoCrearEtiquetasProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoCrearEtiquetasProductos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCrearEtiquetasProductos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.setSize(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.iWidthFormulario,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jContentPaneDetalleProcesoCrearEtiquetasProductos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTabbedPaneRelacionesProcesoCrearEtiquetasProductos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jContentPaneDetalleProcesoCrearEtiquetasProductos.getWidth(),ProcesoCrearEtiquetasProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTabbedPaneRelacionesProcesoCrearEtiquetasProductos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jContentPaneDetalleProcesoCrearEtiquetasProductos.getWidth(),ProcesoCrearEtiquetasProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTabbedPaneRelacionesProcesoCrearEtiquetasProductos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jContentPaneDetalleProcesoCrearEtiquetasProductos.getWidth(),ProcesoCrearEtiquetasProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoCrearEtiquetasProductos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoCrearEtiquetasProductos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoCrearEtiquetasProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos,false,this);
				} else {
					this.jInternalFrameOrderByProcesoCrearEtiquetasProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCrearEtiquetasProductos);
				this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.setVisible(false);
				this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.setSelected(false);
				
				this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCrearEtiquetasProductos"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoCrearEtiquetasProductos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoCrearEtiquetasProductos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoCrearEtiquetasProductos==null) {
				
				this.jInternalFrameImportacionProcesoCrearEtiquetasProductos=new ImportacionJInternalFrame(ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCrearEtiquetasProductos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCrearEtiquetasProductos);
				this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setVisible(false);
				this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setSelected(false);


				this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCrearEtiquetasProductos"));
				this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCrearEtiquetasProductos"));
				this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCrearEtiquetasProductos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoCrearEtiquetasProductos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos==null) {
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos=new ReporteDinamicoJInternalFrame(ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos);
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCrearEtiquetasProductos"));
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCrearEtiquetasProductos"));
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCrearEtiquetasProductos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCrearEtiquetasProductos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoCrearEtiquetasProductos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCrearEtiquetasProductos);
			
	       	this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.dispose();
			//this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoCrearEtiquetasProductos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoCrearEtiquetasProductos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setVisible(true);
	        this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoCrearEtiquetasProductos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.setVisible(true);
	        this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoCrearEtiquetasProductos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.setVisible(false);
	        this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoCrearEtiquetasProductos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoCrearEtiquetasProductos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setVisible(false);
	        this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoCrearEtiquetasProductos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoCrearEtiquetasProductos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoCrearEtiquetasProductos(true);
			//this.isEsNuevoProcesoCrearEtiquetasProductos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCrearEtiquetasProductos(false) ;
			
			if(procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoCrearEtiquetasProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCrearEtiquetasProductos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCrearEtiquetasProductos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoCrearEtiquetasProductosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoCrearEtiquetasProductos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoCrearEtiquetasProductos(true);
			//this.isEsNuevoProcesoCrearEtiquetasProductos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesocrearetiquetasproductos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoCrearEtiquetasProductos(false) ;
			
			if(ProcesoCrearEtiquetasProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCrearEtiquetasProductos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCrearEtiquetasProductos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasProductos,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasProductos,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

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
		TableColumn tableColumnLinea=this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasProductos,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasProductos,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

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
		TableColumn tableColumnLineaCategoria=this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasProductos,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

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
		TableColumn tableColumnLineaMarca=this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasProductos,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoCrearEtiquetasProductos(false);
			
			//if(!this.isEsNuevoProcesoCrearEtiquetasProductos) {								
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
				
			}
			
			if(this.permiteMantenimiento(this.procesocrearetiquetasproductos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoCrearEtiquetasProductos=true;
					this.inicializarActualizarBindingTablaProcesoCrearEtiquetasProductos(false);
					this.isEsNuevoProcesoCrearEtiquetasProductos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoCrearEtiquetasProductos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoCrearEtiquetasProductos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCrearEtiquetasProductos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCrearEtiquetasProductos(false);
				
				this.habilitarDeshabilitarControlesProcesoCrearEtiquetasProductos(false);
			
												
				
				if(ProcesoCrearEtiquetasProductosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoCrearEtiquetasProductos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoCrearEtiquetasProductosActionPerformed(evt,procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoCrearEtiquetasProductos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesocrearetiquetasproductos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasProductos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasProductos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				this.procesocrearetiquetasproductos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				this.procesocrearetiquetasproductos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesocrearetiquetasproductos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoCrearEtiquetasProductosModel) this.jTableDatosProcesoCrearEtiquetasProductos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoCrearEtiquetasProductos=true;
				this.inicializarActualizarBindingTablaProcesoCrearEtiquetasProductos(false);
				this.isEsNuevoProcesoCrearEtiquetasProductos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCrearEtiquetasProductos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCrearEtiquetasProductos(false);
				
				this.habilitarDeshabilitarControlesProcesoCrearEtiquetasProductos(false);
				
				
				
				if(ProcesoCrearEtiquetasProductosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoCrearEtiquetasProductos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoCrearEtiquetasProductos.getRowCount()>=1) {
				jTableDatosProcesoCrearEtiquetasProductos.removeRowSelectionInterval(0, jTableDatosProcesoCrearEtiquetasProductos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoCrearEtiquetasProductos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoCrearEtiquetasProductos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCrearEtiquetasProductos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCrearEtiquetasProductos(false) ;
			
			this.isEsNuevoProcesoCrearEtiquetasProductos=false;
			
			if(ProcesoCrearEtiquetasProductosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoCrearEtiquetasProductos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
				
				//SI ES MANUAL
				if(ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoCrearEtiquetasProductos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoCrearEtiquetasProductos--;			
			//ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux= new ProcesoCrearEtiquetasProductos();			
			//procesocrearetiquetasproductosAux.setId(this.iIdNuevoProcesoCrearEtiquetasProductos);
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoCrearEtiquetasProductos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
			
			this.procesocrearetiquetasproductos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().add(this.procesocrearetiquetasproductosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesocrearetiquetasproductoss.add(this.procesocrearetiquetasproductosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoCrearEtiquetasProductos(false);
			
			this.jTableDatosProcesoCrearEtiquetasProductos.setRowSelectionInterval(this.getIndiceNuevoProcesoCrearEtiquetasProductos(), this.getIndiceNuevoProcesoCrearEtiquetasProductos());
			
			int iLastRow =  this.jTableDatosProcesoCrearEtiquetasProductos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoCrearEtiquetasProductos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoCrearEtiquetasProductos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoCrearEtiquetasProductos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
			
			//SI ES MANUAL
			if(ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCrearEtiquetasProductos();
			}
			
			//this.abrirFrameTreeProcesoCrearEtiquetasProductos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setFileImportacion(this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoCrearEtiquetasProductos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossSeleccionados=new ArrayList<ProcesoCrearEtiquetasProductos>();		

		procesocrearetiquetasproductossSeleccionados=this.getProcesoCrearEtiquetasProductossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoCrearEtiquetasProductosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoCrearEtiquetasProductosBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoCrearEtiquetasProductoss("Todos",procesocrearetiquetasproductossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Crear Etiquetas Productos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO1:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio1_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio1_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio1_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio1_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO2:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio2_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio2_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio2_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio2_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO3:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio3_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio3_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio3_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio3_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO4:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio4_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio4_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio4_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio4_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO5:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio5_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio5_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio5_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio5_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO1:
					sNombreCampoCategoria="precio1";
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO2:
					sNombreCampoCategoria="precio2";
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO3:
					sNombreCampoCategoria="precio3";
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO4:
					sNombreCampoCategoria="precio4";
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO5:
					sNombreCampoCategoria="precio5";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO1:
					sNombreCampoCategoriaValor="precio1";
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO2:
					sNombreCampoCategoriaValor="precio2";
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO3:
					sNombreCampoCategoriaValor="precio3";
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO4:
					sNombreCampoCategoriaValor="precio4";
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO5:
					sNombreCampoCategoriaValor="precio5";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO1:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio1",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio1");
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO2:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio2",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio2");
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO3:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio3",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio3");
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO4:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio4",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio4");
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO5:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio5",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio5");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossSeleccionados=new ArrayList<ProcesoCrearEtiquetasProductos>();		
		
		procesocrearetiquetasproductossSeleccionados=this.getProcesoCrearEtiquetasProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocrearetiquetasproductos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoCrearEtiquetasProductoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos:procesocrearetiquetasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetasproductos.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos:procesocrearetiquetasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetasproductos.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos:procesocrearetiquetasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetasproductos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos:procesocrearetiquetasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetasproductos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos:procesocrearetiquetasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetasproductos.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos:procesocrearetiquetasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetasproductos.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos:procesocrearetiquetasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetasproductos.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos:procesocrearetiquetasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetasproductos.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos:procesocrearetiquetasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetasproductos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos:procesocrearetiquetasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetasproductos.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO1:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO1);
					iRow++;

					for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos:procesocrearetiquetasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetasproductos.getprecio1());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO2:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO2);
					iRow++;

					for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos:procesocrearetiquetasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetasproductos.getprecio2());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO3:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO3);
					iRow++;

					for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos:procesocrearetiquetasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetasproductos.getprecio3());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO4:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO4);
					iRow++;

					for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos:procesocrearetiquetasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetasproductos.getprecio4());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO5:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO5);
					iRow++;

					for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos:procesocrearetiquetasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetasproductos.getprecio5());
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
			//	this.getFilaCabeceraExportarExcelProcesoCrearEtiquetasProductos(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:procesocrearetiquetasproductossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoCrearEtiquetasProductos(procesocrearetiquetasproductosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Crear Etiquetas Productos",JOptionPane.INFORMATION_MESSAGE);
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
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
			
			//SI ES MANUAL
			if(ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCrearEtiquetasProductos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
			
			//SI ES MANUAL
			if(ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCrearEtiquetasProductos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
			
			//SI ES MANUAL
			if(ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCrearEtiquetasProductos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoCrearEtiquetasProductos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoCrearEtiquetasProductos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoCrearEtiquetasProductos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoCrearEtiquetasProductos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoCrearEtiquetasProductos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoCrearEtiquetasProductos.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoCrearEtiquetasProductos.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoCrearEtiquetasProductos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoCrearEtiquetasProductos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoCrearEtiquetasProductos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoCrearEtiquetasProductos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoCrearEtiquetasProductos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoCrearEtiquetasProductos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCrearEtiquetasProductos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoCrearEtiquetasProductos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoCrearEtiquetasProductos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoCrearEtiquetasProductos();
		
		this.inicializarActualizarBindingBotonesManualProcesoCrearEtiquetasProductos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCrearEtiquetasProductos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCrearEtiquetasProductos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCrearEtiquetasProductos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCrearEtiquetasProductos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoCrearEtiquetasProductos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasProductos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jCheckBoxPostAccionNuevoProcesoCrearEtiquetasProductos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jCheckBoxPostAccionSinCerrarProcesoCrearEtiquetasProductos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jCheckBoxPostAccionSinMensajeProcesoCrearEtiquetasProductos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoCrearEtiquetasProductos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasProductos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jCheckBoxPostAccionNuevoProcesoCrearEtiquetasProductos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jCheckBoxPostAccionSinCerrarProcesoCrearEtiquetasProductos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jCheckBoxPostAccionSinMensajeProcesoCrearEtiquetasProductos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoCrearEtiquetasProductos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoCrearEtiquetasProductos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasProductos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoCrearEtiquetasProductos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasProductos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoCrearEtiquetasProductos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoCrearEtiquetasProductos(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCrearEtiquetasProductos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCrearEtiquetasProductos() throws Exception {
		try	{
			if(ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCrearEtiquetasProductos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCrearEtiquetasProductos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCrearEtiquetasProductos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasProductos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoCrearEtiquetasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoCrearEtiquetasProductos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasProductos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoCrearEtiquetasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoCrearEtiquetasProductos.addItem(reporte);
			}
			
			
			if(!this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoCrearEtiquetasProductos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoCrearEtiquetasProductos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCrearEtiquetasProductos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCrearEtiquetasProductos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos!=null) {
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos!=null) {
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProcesoCrearEtiquetasProductosConstantesFunciones.getTiposSeleccionarProcesoCrearEtiquetasProductos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProcesoCrearEtiquetasProductosConstantesFunciones.getTiposSeleccionarProcesoCrearEtiquetasProductos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProcesoCrearEtiquetasProductosConstantesFunciones.getTiposSeleccionarProcesoCrearEtiquetasProductos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoCrearEtiquetasProductos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.getSelectedItem()!=null){this.id_bodegaBusquedaProcesoCrearEtiquetasProductos=((Bodega)this.jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.getSelectedItem()!=null){this.id_productoBusquedaProcesoCrearEtiquetasProductos=((Producto)this.jComboBoxid_productoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.getSelectedItem()!=null){this.id_lineaBusquedaProcesoCrearEtiquetasProductos=((Linea)this.jComboBoxid_lineaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.getSelectedItem()!=null){this.id_linea_grupoBusquedaProcesoCrearEtiquetasProductos=((Linea)this.jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.getSelectedItem()!=null){this.id_linea_categoriaBusquedaProcesoCrearEtiquetasProductos=((Linea)this.jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.getSelectedItem()!=null){this.id_linea_marcaBusquedaProcesoCrearEtiquetasProductos=((Linea)this.jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoCrearEtiquetasProductos(Boolean esInicializar) throws Exception {				
		if(ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCrearEtiquetasProductos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoCrearEtiquetasProductos() throws Exception {
		this.inicializarActualizarBindingTablaProcesoCrearEtiquetasProductos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoCrearEtiquetasProductos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasProductosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasProductosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoCrearEtiquetasProductosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasProductosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasProductosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasProductosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoCrearEtiquetasProductos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesocrearetiquetasproductoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoCrearEtiquetasProductos.setModel(new ProcesoCrearEtiquetasProductosModel(this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoCrearEtiquetasProductos.setModel(new ProcesoCrearEtiquetasProductosModel(this.procesocrearetiquetasproductoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoCrearEtiquetasProductos!=null && this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoCrearEtiquetasProductos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasProductos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasProductosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO,procesocrearetiquetasproductosConstantesFunciones.resaltarSeleccionarProcesoCrearEtiquetasProductos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoCrearEtiquetasProductosConstantesFunciones.SCLASSWEBTITULO,procesocrearetiquetasproductosConstantesFunciones.resaltarSeleccionarProcesoCrearEtiquetasProductos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasProductos,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_ID));

		if(this.procesocrearetiquetasproductosConstantesFunciones.mostraridProcesoCrearEtiquetasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesocrearetiquetasproductosConstantesFunciones.resaltaridProcesoCrearEtiquetasProductos,this.procesocrearetiquetasproductosConstantesFunciones.activaridProcesoCrearEtiquetasProductos,iSizeTabla,this,true,"idProcesoCrearEtiquetasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocrearetiquetasproductosConstantesFunciones.resaltaridProcesoCrearEtiquetasProductos,this.procesocrearetiquetasproductosConstantesFunciones.activaridProcesoCrearEtiquetasProductos,this,true,"idProcesoCrearEtiquetasProductos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasProductos,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_CODIGO));

		if(this.procesocrearetiquetasproductosConstantesFunciones.mostrarcodigoProcesoCrearEtiquetasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesocrearetiquetasproductosConstantesFunciones.resaltarcodigoProcesoCrearEtiquetasProductos,this.procesocrearetiquetasproductosConstantesFunciones.activarcodigoProcesoCrearEtiquetasProductos,iSizeTabla,this,true,"codigoProcesoCrearEtiquetasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocrearetiquetasproductosConstantesFunciones.resaltarcodigoProcesoCrearEtiquetasProductos,this.procesocrearetiquetasproductosConstantesFunciones.activarcodigoProcesoCrearEtiquetasProductos,this,true,"codigoProcesoCrearEtiquetasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasProductos,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_NOMBRE));

		if(this.procesocrearetiquetasproductosConstantesFunciones.mostrarnombreProcesoCrearEtiquetasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesocrearetiquetasproductosConstantesFunciones.resaltarnombreProcesoCrearEtiquetasProductos,this.procesocrearetiquetasproductosConstantesFunciones.activarnombreProcesoCrearEtiquetasProductos,iSizeTabla,this,true,"nombreProcesoCrearEtiquetasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocrearetiquetasproductosConstantesFunciones.resaltarnombreProcesoCrearEtiquetasProductos,this.procesocrearetiquetasproductosConstantesFunciones.activarnombreProcesoCrearEtiquetasProductos,this,true,"nombreProcesoCrearEtiquetasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasProductos,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO1));

		if(this.procesocrearetiquetasproductosConstantesFunciones.mostrarprecio1ProcesoCrearEtiquetasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO1,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesocrearetiquetasproductosConstantesFunciones.resaltarprecio1ProcesoCrearEtiquetasProductos,this.procesocrearetiquetasproductosConstantesFunciones.activarprecio1ProcesoCrearEtiquetasProductos,iSizeTabla,this,true,"precio1ProcesoCrearEtiquetasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocrearetiquetasproductosConstantesFunciones.resaltarprecio1ProcesoCrearEtiquetasProductos,this.procesocrearetiquetasproductosConstantesFunciones.activarprecio1ProcesoCrearEtiquetasProductos,this,true,"precio1ProcesoCrearEtiquetasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasProductos,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO2));

		if(this.procesocrearetiquetasproductosConstantesFunciones.mostrarprecio2ProcesoCrearEtiquetasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO2,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesocrearetiquetasproductosConstantesFunciones.resaltarprecio2ProcesoCrearEtiquetasProductos,this.procesocrearetiquetasproductosConstantesFunciones.activarprecio2ProcesoCrearEtiquetasProductos,iSizeTabla,this,true,"precio2ProcesoCrearEtiquetasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocrearetiquetasproductosConstantesFunciones.resaltarprecio2ProcesoCrearEtiquetasProductos,this.procesocrearetiquetasproductosConstantesFunciones.activarprecio2ProcesoCrearEtiquetasProductos,this,true,"precio2ProcesoCrearEtiquetasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasProductos,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO3));

		if(this.procesocrearetiquetasproductosConstantesFunciones.mostrarprecio3ProcesoCrearEtiquetasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO3,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesocrearetiquetasproductosConstantesFunciones.resaltarprecio3ProcesoCrearEtiquetasProductos,this.procesocrearetiquetasproductosConstantesFunciones.activarprecio3ProcesoCrearEtiquetasProductos,iSizeTabla,this,true,"precio3ProcesoCrearEtiquetasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocrearetiquetasproductosConstantesFunciones.resaltarprecio3ProcesoCrearEtiquetasProductos,this.procesocrearetiquetasproductosConstantesFunciones.activarprecio3ProcesoCrearEtiquetasProductos,this,true,"precio3ProcesoCrearEtiquetasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasProductos,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO4));

		if(this.procesocrearetiquetasproductosConstantesFunciones.mostrarprecio4ProcesoCrearEtiquetasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO4,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesocrearetiquetasproductosConstantesFunciones.resaltarprecio4ProcesoCrearEtiquetasProductos,this.procesocrearetiquetasproductosConstantesFunciones.activarprecio4ProcesoCrearEtiquetasProductos,iSizeTabla,this,true,"precio4ProcesoCrearEtiquetasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocrearetiquetasproductosConstantesFunciones.resaltarprecio4ProcesoCrearEtiquetasProductos,this.procesocrearetiquetasproductosConstantesFunciones.activarprecio4ProcesoCrearEtiquetasProductos,this,true,"precio4ProcesoCrearEtiquetasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasProductos,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO5));

		if(this.procesocrearetiquetasproductosConstantesFunciones.mostrarprecio5ProcesoCrearEtiquetasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO5,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesocrearetiquetasproductosConstantesFunciones.resaltarprecio5ProcesoCrearEtiquetasProductos,this.procesocrearetiquetasproductosConstantesFunciones.activarprecio5ProcesoCrearEtiquetasProductos,iSizeTabla,this,true,"precio5ProcesoCrearEtiquetasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocrearetiquetasproductosConstantesFunciones.resaltarprecio5ProcesoCrearEtiquetasProductos,this.procesocrearetiquetasproductosConstantesFunciones.activarprecio5ProcesoCrearEtiquetasProductos,this,true,"precio5ProcesoCrearEtiquetasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCrearEtiquetasProductos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCrearEtiquetasProductos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoCrearEtiquetasProductos && this.isPermisoGuardarCambiosProcesoCrearEtiquetasProductos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoCrearEtiquetasProductos.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoCrearEtiquetasProductos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCrearEtiquetasProductos && this.isPermisoGuardarCambiosProcesoCrearEtiquetasProductos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCrearEtiquetasProductos && this.isPermisoGuardarCambiosProcesoCrearEtiquetasProductos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoCrearEtiquetasProductos.moveColumn(this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoCrearEtiquetasProductos.moveColumn(this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoCrearEtiquetasProductos.moveColumn(this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoCrearEtiquetasProductos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoCrearEtiquetasProductos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoCrearEtiquetasProductos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoCrearEtiquetasProductos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoCrearEtiquetasProductos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoCrearEtiquetasProductos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesocrearetiquetasproductoss.size()-1;
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
		//this.jTableDatosProcesoCrearEtiquetasProductos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoCrearEtiquetasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoCrearEtiquetasProductos();
			
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
				
				//this.isEsNuevoProcesoCrearEtiquetasProductos=false;
					
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
			
				if(this.procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCrearEtiquetasProductos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesocrearetiquetasproductos.getsType().equals("DUPLICADO")
				   || this.procesocrearetiquetasproductos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoCrearEtiquetasProductos=true;
				
				} else {
					this.isEsNuevoProcesoCrearEtiquetasProductos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
					if(this.procesocrearetiquetasproductos.getId()>=0 && !this.procesocrearetiquetasproductos.getIsNew()) {						
						this.isEsNuevoProcesoCrearEtiquetasProductos=false;
						
					} else {
						this.isEsNuevoProcesoCrearEtiquetasProductos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoCrearEtiquetasProductos(esRelaciones);						
				
				this.seleccionarProcesoCrearEtiquetasProductos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesocrearetiquetasproductos.getId()<0) {
					this.isEsNuevoProcesoCrearEtiquetasProductos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoCrearEtiquetasProductos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoCrearEtiquetasProductos(evt,rowIndex);
				}	
				
				if(this.procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoCrearEtiquetasProductos: " + this.dDif); 
					}
				}								
				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoCrearEtiquetasProductos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesocrearetiquetasproductos)) {
					if(this.procesocrearetiquetasproductos.getId()>0) {
						this.procesocrearetiquetasproductos.setIsDeleted(true);
						
						this.procesocrearetiquetasproductossEliminados.add(this.procesocrearetiquetasproductos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().remove(this.procesocrearetiquetasproductos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetasproductoss.remove(this.procesocrearetiquetasproductos);				
					}
					
					
					((ProcesoCrearEtiquetasProductosModel) this.jTableDatosProcesoCrearEtiquetasProductos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCrearEtiquetasProductos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoCrearEtiquetasProductos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoCrearEtiquetasProductos) {
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCrearEtiquetasProductos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasProductos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoCrearEtiquetasProductos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCrearEtiquetasProductos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoCrearEtiquetasProductos(procesocrearetiquetasproductos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoCrearEtiquetasProductos(procesocrearetiquetasproductos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoCrearEtiquetasProductos(procesocrearetiquetasproductos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoCrearEtiquetasProductos(procesocrearetiquetasproductos);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelidProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductos.getId().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldcodigoProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductos.getcodigo());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextAreanombreProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductos.getnombre());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio1ProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductos.getprecio1().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio2ProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductos.getprecio2().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio3ProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductos.getprecio3().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio4ProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductos.getprecio4().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio5ProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductos.getprecio5().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesocrearetiquetasproductosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesocrearetiquetasproductosLocal=this.procesocrearetiquetasproductos;
			} else {
				procesocrearetiquetasproductosLocal=this.procesocrearetiquetasproductosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesocrearetiquetasproductosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoCrearEtiquetasProductos(procesocrearetiquetasproductosLocal,true);
					
					if(procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesocrearetiquetasproductosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesocrearetiquetasproductosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(procesocrearetiquetasproductos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(procesocrearetiquetasproductos);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(procesocrearetiquetasproductos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelidProcesoCrearEtiquetasProductos.getText()==null || this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelidProcesoCrearEtiquetasProductos.getText()=="" || this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelidProcesoCrearEtiquetasProductos.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelidProcesoCrearEtiquetasProductos.setText("0");
			}

			if(conColumnasBase) {procesocrearetiquetasproductos.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelidProcesoCrearEtiquetasProductos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelIdProcesoCrearEtiquetasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocrearetiquetasproductos.setcodigo(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldcodigoProcesoCrearEtiquetasProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelcodigoProcesoCrearEtiquetasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocrearetiquetasproductos.setnombre(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextAreanombreProcesoCrearEtiquetasProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelnombreProcesoCrearEtiquetasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocrearetiquetasproductos.setprecio1(Double.parseDouble(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio1ProcesoCrearEtiquetasProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO1+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelprecio1ProcesoCrearEtiquetasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocrearetiquetasproductos.setprecio2(Double.parseDouble(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio2ProcesoCrearEtiquetasProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO2+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelprecio2ProcesoCrearEtiquetasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocrearetiquetasproductos.setprecio3(Double.parseDouble(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio3ProcesoCrearEtiquetasProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO3+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelprecio3ProcesoCrearEtiquetasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocrearetiquetasproductos.setprecio4(Double.parseDouble(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio4ProcesoCrearEtiquetasProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO4+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelprecio4ProcesoCrearEtiquetasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocrearetiquetasproductos.setprecio5(Double.parseDouble(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio5ProcesoCrearEtiquetasProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO5+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelprecio5ProcesoCrearEtiquetasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosBean,ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosOrigen,ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocrearetiquetasproductosOrigen.getId()!=null && !procesocrearetiquetasproductosOrigen.getId().equals(0L))) {procesocrearetiquetasproductos.setId(procesocrearetiquetasproductosOrigen.getId());}}
			if(conDefault || (!conDefault && procesocrearetiquetasproductosOrigen.getcodigo()!=null && !procesocrearetiquetasproductosOrigen.getcodigo().equals(""))) {procesocrearetiquetasproductos.setcodigo(procesocrearetiquetasproductosOrigen.getcodigo());}
			if(conDefault || (!conDefault && procesocrearetiquetasproductosOrigen.getnombre()!=null && !procesocrearetiquetasproductosOrigen.getnombre().equals(""))) {procesocrearetiquetasproductos.setnombre(procesocrearetiquetasproductosOrigen.getnombre());}
			if(conDefault || (!conDefault && procesocrearetiquetasproductosOrigen.getprecio1()!=null && !procesocrearetiquetasproductosOrigen.getprecio1().equals(0.0))) {procesocrearetiquetasproductos.setprecio1(procesocrearetiquetasproductosOrigen.getprecio1());}
			if(conDefault || (!conDefault && procesocrearetiquetasproductosOrigen.getprecio2()!=null && !procesocrearetiquetasproductosOrigen.getprecio2().equals(0.0))) {procesocrearetiquetasproductos.setprecio2(procesocrearetiquetasproductosOrigen.getprecio2());}
			if(conDefault || (!conDefault && procesocrearetiquetasproductosOrigen.getprecio3()!=null && !procesocrearetiquetasproductosOrigen.getprecio3().equals(0.0))) {procesocrearetiquetasproductos.setprecio3(procesocrearetiquetasproductosOrigen.getprecio3());}
			if(conDefault || (!conDefault && procesocrearetiquetasproductosOrigen.getprecio4()!=null && !procesocrearetiquetasproductosOrigen.getprecio4().equals(0.0))) {procesocrearetiquetasproductos.setprecio4(procesocrearetiquetasproductosOrigen.getprecio4());}
			if(conDefault || (!conDefault && procesocrearetiquetasproductosOrigen.getprecio5()!=null && !procesocrearetiquetasproductosOrigen.getprecio5().equals(0.0))) {procesocrearetiquetasproductos.setprecio5(procesocrearetiquetasproductosOrigen.getprecio5());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelidProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductos.getId().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldcodigoProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductos.getcodigo());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextAreanombreProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductos.getnombre());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio1ProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductos.getprecio1().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio2ProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductos.getprecio2().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio3ProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductos.getprecio3().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio4ProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductos.getprecio4().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio5ProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductos.getprecio5().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductosBean procesocrearetiquetasproductosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelidProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductosBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldcodigoProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductosBean.getcodigo());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextAreanombreProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductosBean.getnombre());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio1ProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductosBean.getprecio1().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio2ProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductosBean.getprecio2().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio3ProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductosBean.getprecio3().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio4ProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductosBean.getprecio4().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio5ProcesoCrearEtiquetasProductos.setText(procesocrearetiquetasproductosBean.getprecio5().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductosParameterReturnGeneral procesocrearetiquetasproductosReturnGeneral,ProcesoCrearEtiquetasProductosBean procesocrearetiquetasproductosBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosLocal=new ProcesoCrearEtiquetasProductos();
			
			procesocrearetiquetasproductosLocal=procesocrearetiquetasproductosReturnGeneral.getProcesoCrearEtiquetasProductos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocrearetiquetasproductosLocal.getId()!=null && !procesocrearetiquetasproductosLocal.getId().equals(0L))) {procesocrearetiquetasproductosBean.setId(procesocrearetiquetasproductosLocal.getId());}}
			if(conDefault || (!conDefault && procesocrearetiquetasproductosLocal.getcodigo()!=null && !procesocrearetiquetasproductosLocal.getcodigo().equals(""))) {procesocrearetiquetasproductosBean.setcodigo(procesocrearetiquetasproductosLocal.getcodigo());}
			if(conDefault || (!conDefault && procesocrearetiquetasproductosLocal.getnombre()!=null && !procesocrearetiquetasproductosLocal.getnombre().equals(""))) {procesocrearetiquetasproductosBean.setnombre(procesocrearetiquetasproductosLocal.getnombre());}
			if(conDefault || (!conDefault && procesocrearetiquetasproductosLocal.getprecio1()!=null && !procesocrearetiquetasproductosLocal.getprecio1().equals(0.0))) {procesocrearetiquetasproductosBean.setprecio1(procesocrearetiquetasproductosLocal.getprecio1());}
			if(conDefault || (!conDefault && procesocrearetiquetasproductosLocal.getprecio2()!=null && !procesocrearetiquetasproductosLocal.getprecio2().equals(0.0))) {procesocrearetiquetasproductosBean.setprecio2(procesocrearetiquetasproductosLocal.getprecio2());}
			if(conDefault || (!conDefault && procesocrearetiquetasproductosLocal.getprecio3()!=null && !procesocrearetiquetasproductosLocal.getprecio3().equals(0.0))) {procesocrearetiquetasproductosBean.setprecio3(procesocrearetiquetasproductosLocal.getprecio3());}
			if(conDefault || (!conDefault && procesocrearetiquetasproductosLocal.getprecio4()!=null && !procesocrearetiquetasproductosLocal.getprecio4().equals(0.0))) {procesocrearetiquetasproductosBean.setprecio4(procesocrearetiquetasproductosLocal.getprecio4());}
			if(conDefault || (!conDefault && procesocrearetiquetasproductosLocal.getprecio5()!=null && !procesocrearetiquetasproductosLocal.getprecio5().equals(0.0))) {procesocrearetiquetasproductosBean.setprecio5(procesocrearetiquetasproductosLocal.getprecio5());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoCrearEtiquetasProductosGenerico(Long idProcesoCrearEtiquetasProductosSeleccionado,JComboBox jComboBoxProcesoCrearEtiquetasProductos,List<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossLocal)throws Exception {
		try {
			ProcesoCrearEtiquetasProductos  procesocrearetiquetasproductosTemp=null;

			for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:procesocrearetiquetasproductossLocal) {
				if(procesocrearetiquetasproductosAux.getId()!=null && procesocrearetiquetasproductosAux.getId().equals(idProcesoCrearEtiquetasProductosSeleccionado)) {
					procesocrearetiquetasproductosTemp=procesocrearetiquetasproductosAux;
					break;
				}
			}

			jComboBoxProcesoCrearEtiquetasProductos.setSelectedItem(procesocrearetiquetasproductosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoCrearEtiquetasProductosGenerico(JComboBox jComboBoxProcesoCrearEtiquetasProductos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCrearEtiquetasProductos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoCrearEtiquetasProductos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCrearEtiquetasProductos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoCrearEtiquetasProductos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoCrearEtiquetasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoCrearEtiquetasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocrearetiquetasproductos=(ProcesoCrearEtiquetasProductos) procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) procesocrearetiquetasproductoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!procesocrearetiquetasproductos.getIsNew() && !procesocrearetiquetasproductos.getIsChanged() && !procesocrearetiquetasproductos.getIsDeleted()) {
				sDescripcion=procesocrearetiquetasproductos.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=procesocrearetiquetasproductos.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!procesocrearetiquetasproductos.getIsNew() && !procesocrearetiquetasproductos.getIsChanged() && !procesocrearetiquetasproductos.getIsDeleted()) {
				sDescripcion=procesocrearetiquetasproductos.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=procesocrearetiquetasproductos.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!procesocrearetiquetasproductos.getIsNew() && !procesocrearetiquetasproductos.getIsChanged() && !procesocrearetiquetasproductos.getIsDeleted()) {
				sDescripcion=procesocrearetiquetasproductos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=procesocrearetiquetasproductos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!procesocrearetiquetasproductos.getIsNew() && !procesocrearetiquetasproductos.getIsChanged() && !procesocrearetiquetasproductos.getIsDeleted()) {
				sDescripcion=procesocrearetiquetasproductos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=procesocrearetiquetasproductos.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!procesocrearetiquetasproductos.getIsNew() && !procesocrearetiquetasproductos.getIsChanged() && !procesocrearetiquetasproductos.getIsDeleted()) {
				sDescripcion=procesocrearetiquetasproductos.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=procesocrearetiquetasproductos.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!procesocrearetiquetasproductos.getIsNew() && !procesocrearetiquetasproductos.getIsChanged() && !procesocrearetiquetasproductos.getIsDeleted()) {
				sDescripcion=procesocrearetiquetasproductos.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=procesocrearetiquetasproductos.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!procesocrearetiquetasproductos.getIsNew() && !procesocrearetiquetasproductos.getIsChanged() && !procesocrearetiquetasproductos.getIsDeleted()) {
				sDescripcion=procesocrearetiquetasproductos.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=procesocrearetiquetasproductos.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!procesocrearetiquetasproductos.getIsNew() && !procesocrearetiquetasproductos.getIsChanged() && !procesocrearetiquetasproductos.getIsDeleted()) {
				sDescripcion=procesocrearetiquetasproductos.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=procesocrearetiquetasproductos.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosRow=new ProcesoCrearEtiquetasProductos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocrearetiquetasproductosRow=(ProcesoCrearEtiquetasProductos) procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocrearetiquetasproductosRow=(ProcesoCrearEtiquetasProductos) procesocrearetiquetasproductoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoCrearEtiquetasProductos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos && this.isPermisoNuevoProcesoCrearEtiquetasProductos));			
			this.jButtonDuplicarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaDuplicarProcesoCrearEtiquetasProductos && this.isPermisoDuplicarProcesoCrearEtiquetasProductos));			
			this.jButtonCopiarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaCopiarProcesoCrearEtiquetasProductos && this.isPermisoCopiarProcesoCrearEtiquetasProductos));
			this.jButtonVerFormProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaVerFormProcesoCrearEtiquetasProductos && this.isPermisoVerFormProcesoCrearEtiquetasProductos));
			
			this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaOrdenProcesoCrearEtiquetasProductos && this.isPermisoOrdenProcesoCrearEtiquetasProductos));			
			
			this.jButtonNuevoRelacionesProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos && this.isPermisoNuevoProcesoCrearEtiquetasProductos));			
			this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos && this.isPermisoNuevoProcesoCrearEtiquetasProductos && this.isPermisoGuardarCambiosProcesoCrearEtiquetasProductos));
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonModificarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaModificarProcesoCrearEtiquetasProductos && this.isPermisoActualizarProcesoCrearEtiquetasProductos));	
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonActualizarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos && this.isPermisoActualizarProcesoCrearEtiquetasProductos));	
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonEliminarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos && this.isPermisoEliminarProcesoCrearEtiquetasProductos));
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonCancelarProcesoCrearEtiquetasProductos.setVisible(this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos);							
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonGuardarCambiosProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos && this.isPermisoGuardarCambiosProcesoCrearEtiquetasProductos));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos && this.isPermisoGuardarCambiosProcesoCrearEtiquetasProductos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos && this.isPermisoNuevoProcesoCrearEtiquetasProductos));						
			this.jButtonDuplicarToolBarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaDuplicarProcesoCrearEtiquetasProductos && this.isPermisoDuplicarProcesoCrearEtiquetasProductos));						
			this.jButtonCopiarToolBarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaCopiarProcesoCrearEtiquetasProductos && this.isPermisoCopiarProcesoCrearEtiquetasProductos));			
			this.jButtonVerFormToolBarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaVerFormProcesoCrearEtiquetasProductos && this.isPermisoVerFormProcesoCrearEtiquetasProductos));			
			this.jButtonAbrirOrderByToolBarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaOrdenProcesoCrearEtiquetasProductos && this.isPermisoOrdenProcesoCrearEtiquetasProductos));
			this.jButtonNuevoRelacionesToolBarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos && this.isPermisoNuevoProcesoCrearEtiquetasProductos));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos && this.isPermisoNuevoProcesoCrearEtiquetasProductos && this.isPermisoGuardarCambiosProcesoCrearEtiquetasProductos));			
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonModificarToolBarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaModificarProcesoCrearEtiquetasProductos && this.isPermisoActualizarProcesoCrearEtiquetasProductos));	
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonActualizarToolBarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos  && this.isPermisoActualizarProcesoCrearEtiquetasProductos));	
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonEliminarToolBarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos && this.isPermisoEliminarProcesoCrearEtiquetasProductos));
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonCancelarToolBarProcesoCrearEtiquetasProductos.setVisible(this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos);				
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonGuardarCambiosToolBarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos && this.isPermisoGuardarCambiosProcesoCrearEtiquetasProductos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos && this.isPermisoGuardarCambiosProcesoCrearEtiquetasProductos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos && this.isPermisoNuevoProcesoCrearEtiquetasProductos));			
			this.jMenuItemDuplicarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaDuplicarProcesoCrearEtiquetasProductos && this.isPermisoDuplicarProcesoCrearEtiquetasProductos));			
			this.jMenuItemCopiarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaCopiarProcesoCrearEtiquetasProductos && this.isPermisoCopiarProcesoCrearEtiquetasProductos));			
			this.jMenuItemVerFormProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaVerFormProcesoCrearEtiquetasProductos && this.isPermisoVerFormProcesoCrearEtiquetasProductos));			
			this.jMenuItemAbrirOrderByProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaOrdenProcesoCrearEtiquetasProductos && this.isPermisoOrdenProcesoCrearEtiquetasProductos));			
			//this.jMenuItemMostrarOcultarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaOrdenProcesoCrearEtiquetasProductos && this.isPermisoOrdenProcesoCrearEtiquetasProductos));
			this.jMenuItemDetalleAbrirOrderByProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaOrdenProcesoCrearEtiquetasProductos && this.isPermisoOrdenProcesoCrearEtiquetasProductos));			
			//this.jMenuItemDetalleMostrarOcultarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaOrdenProcesoCrearEtiquetasProductos && this.isPermisoOrdenProcesoCrearEtiquetasProductos));			
			this.jMenuItemNuevoRelacionesProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos && this.isPermisoNuevoProcesoCrearEtiquetasProductos));			
			this.jMenuItemNuevoGuardarCambiosProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos && this.isPermisoNuevoProcesoCrearEtiquetasProductos && this.isPermisoGuardarCambiosProcesoCrearEtiquetasProductos));									
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jMenuItemModificarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaModificarProcesoCrearEtiquetasProductos && this.isPermisoActualizarProcesoCrearEtiquetasProductos));	
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jMenuItemActualizarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos && this.isPermisoActualizarProcesoCrearEtiquetasProductos));	
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jMenuItemEliminarProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos && this.isPermisoEliminarProcesoCrearEtiquetasProductos));
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jMenuItemCancelarProcesoCrearEtiquetasProductos.setVisible(this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos);				
			}
			
			this.jMenuItemGuardarCambiosProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos && this.isPermisoGuardarCambiosProcesoCrearEtiquetasProductos));						
			this.jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos && this.isPermisoGuardarCambiosProcesoCrearEtiquetasProductos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos=this.jButtonNuevoProcesoCrearEtiquetasProductos.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoCrearEtiquetasProductos=this.jButtonDuplicarProcesoCrearEtiquetasProductos.isVisible();
			this.isVisibilidadCeldaCopiarProcesoCrearEtiquetasProductos=this.jButtonCopiarProcesoCrearEtiquetasProductos.isVisible();
			this.isVisibilidadCeldaVerFormProcesoCrearEtiquetasProductos=this.jButtonVerFormProcesoCrearEtiquetasProductos.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoCrearEtiquetasProductos=this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos=this.jButtonNuevoRelacionesProcesoCrearEtiquetasProductos.isVisible();
			this.isVisibilidadCeldaModificarProcesoCrearEtiquetasProductos=this.jButtonModificarProcesoCrearEtiquetasProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonActualizarProcesoCrearEtiquetasProductos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonEliminarProcesoCrearEtiquetasProductos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonCancelarProcesoCrearEtiquetasProductos.isVisible();
			this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonGuardarCambiosProcesoCrearEtiquetasProductos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos=this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos=this.jButtonNuevoToolBarProcesoCrearEtiquetasProductos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos=this.jButtonNuevoRelacionesToolBarProcesoCrearEtiquetasProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
			this.isVisibilidadCeldaModificarProcesoCrearEtiquetasProductos=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonModificarToolBarProcesoCrearEtiquetasProductos.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonActualizarToolBarProcesoCrearEtiquetasProductos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonEliminarToolBarProcesoCrearEtiquetasProductos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonCancelarToolBarProcesoCrearEtiquetasProductos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos=this.jButtonGuardarCambiosToolBarProcesoCrearEtiquetasProductos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos=this.jButtonGuardarCambiosTablaToolBarProcesoCrearEtiquetasProductos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos=this.jMenuItemNuevoProcesoCrearEtiquetasProductos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos=this.jMenuItemNuevoRelacionesProcesoCrearEtiquetasProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
			this.isVisibilidadCeldaModificarProcesoCrearEtiquetasProductos=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jMenuItemModificarProcesoCrearEtiquetasProductos.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jMenuItemActualizarProcesoCrearEtiquetasProductos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jMenuItemEliminarProcesoCrearEtiquetasProductos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos=this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jMenuItemCancelarProcesoCrearEtiquetasProductos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos=this.jMenuItemGuardarCambiosProcesoCrearEtiquetasProductos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos=this.jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasProductos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoCrearEtiquetasProductos(Boolean esInicializar) {
		if(ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones()) {
				//if(this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCrearEtiquetasProductos();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoCrearEtiquetasProductos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoCrearEtiquetasProductos() {
		this.jButtonNuevoProcesoCrearEtiquetasProductos.setVisible(this.isPermisoNuevoProcesoCrearEtiquetasProductos);			
		this.jButtonDuplicarProcesoCrearEtiquetasProductos.setVisible(this.isPermisoDuplicarProcesoCrearEtiquetasProductos);			
		this.jButtonCopiarProcesoCrearEtiquetasProductos.setVisible(this.isPermisoCopiarProcesoCrearEtiquetasProductos);			
		this.jButtonVerFormProcesoCrearEtiquetasProductos.setVisible(this.isPermisoVerFormProcesoCrearEtiquetasProductos);			
		
		this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos.setVisible(this.isPermisoOrdenProcesoCrearEtiquetasProductos);					
		
		this.jButtonNuevoRelacionesProcesoCrearEtiquetasProductos.setVisible(this.isPermisoNuevoProcesoCrearEtiquetasProductos);			
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonModificarProcesoCrearEtiquetasProductos.setVisible(this.isPermisoActualizarProcesoCrearEtiquetasProductos);	
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonActualizarProcesoCrearEtiquetasProductos.setVisible(this.isPermisoActualizarProcesoCrearEtiquetasProductos);	
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonEliminarProcesoCrearEtiquetasProductos.setVisible(this.isPermisoEliminarProcesoCrearEtiquetasProductos);
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonCancelarProcesoCrearEtiquetasProductos.setVisible(this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos);						
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonGuardarCambiosProcesoCrearEtiquetasProductos.setVisible(this.isPermisoGuardarCambiosProcesoCrearEtiquetasProductos);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos.setVisible(this.isPermisoActualizarProcesoCrearEtiquetasProductos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCrearEtiquetasProductos() {
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonModificarProcesoCrearEtiquetasProductos.setVisible(this.isPermisoActualizarProcesoCrearEtiquetasProductos);	
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonActualizarProcesoCrearEtiquetasProductos.setVisible(this.isPermisoActualizarProcesoCrearEtiquetasProductos);	
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonEliminarProcesoCrearEtiquetasProductos.setVisible(this.isPermisoEliminarProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonCancelarProcesoCrearEtiquetasProductos.setVisible(this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos);							
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonGuardarCambiosProcesoCrearEtiquetasProductos.setVisible((this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos && this.isPermisoGuardarCambiosProcesoCrearEtiquetasProductos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoCrearEtiquetasProductos() {
		if(ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoCrearEtiquetasProductos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoCrearEtiquetasProductos() {
	}
	
	public void jTableDatosProcesoCrearEtiquetasProductosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoCrearEtiquetasProductos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoCrearEtiquetasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetasproductos==null) {
						this.procesocrearetiquetasproductos = new ProcesoCrearEtiquetasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
				}

				if(this.procesocrearetiquetasproductos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesocrearetiquetasproductos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaProcesoCrearEtiquetasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebProcesoCrearEtiquetasProductos(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCrearEtiquetasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCrearEtiquetasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.procesocrearetiquetasproductosLogic.getConnexion());

				if(this.procesocrearetiquetasproductos.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.procesocrearetiquetasproductos.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCrearEtiquetasProductos=(TitledBorder)this.jScrollPanelDatosProcesoCrearEtiquetasProductos.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderProcesoCrearEtiquetasProductos.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaProcesoCrearEtiquetasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetasproductos==null) {
						this.procesocrearetiquetasproductos = new ProcesoCrearEtiquetasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
				}

				if(this.procesocrearetiquetasproductos.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.procesocrearetiquetasproductos.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoProcesoCrearEtiquetasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebProcesoCrearEtiquetasProductos(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCrearEtiquetasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCrearEtiquetasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.procesocrearetiquetasproductosLogic.getConnexion());

				if(this.procesocrearetiquetasproductos.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.procesocrearetiquetasproductos.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCrearEtiquetasProductos=(TitledBorder)this.jScrollPanelDatosProcesoCrearEtiquetasProductos.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProcesoCrearEtiquetasProductos.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoProcesoCrearEtiquetasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetasproductos==null) {
						this.procesocrearetiquetasproductos = new ProcesoCrearEtiquetasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
				}

				if(this.procesocrearetiquetasproductos.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.procesocrearetiquetasproductos.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProcesoCrearEtiquetasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProcesoCrearEtiquetasProductos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCrearEtiquetasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCrearEtiquetasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.procesocrearetiquetasproductosLogic.getConnexion());

				if(this.procesocrearetiquetasproductos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.procesocrearetiquetasproductos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCrearEtiquetasProductos=(TitledBorder)this.jScrollPanelDatosProcesoCrearEtiquetasProductos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProcesoCrearEtiquetasProductos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProcesoCrearEtiquetasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetasproductos==null) {
						this.procesocrearetiquetasproductos = new ProcesoCrearEtiquetasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
				}

				if(this.procesocrearetiquetasproductos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.procesocrearetiquetasproductos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProcesoCrearEtiquetasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProcesoCrearEtiquetasProductos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCrearEtiquetasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCrearEtiquetasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.procesocrearetiquetasproductosLogic.getConnexion());

				if(this.procesocrearetiquetasproductos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.procesocrearetiquetasproductos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCrearEtiquetasProductos=(TitledBorder)this.jScrollPanelDatosProcesoCrearEtiquetasProductos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProcesoCrearEtiquetasProductos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProcesoCrearEtiquetasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetasproductos==null) {
						this.procesocrearetiquetasproductos = new ProcesoCrearEtiquetasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
				}

				if(this.procesocrearetiquetasproductos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.procesocrearetiquetasproductos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaProcesoCrearEtiquetasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebProcesoCrearEtiquetasProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCrearEtiquetasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCrearEtiquetasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.procesocrearetiquetasproductosLogic.getConnexion());

				if(this.procesocrearetiquetasproductos.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.procesocrearetiquetasproductos.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCrearEtiquetasProductos=(TitledBorder)this.jScrollPanelDatosProcesoCrearEtiquetasProductos.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderProcesoCrearEtiquetasProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaProcesoCrearEtiquetasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetasproductos==null) {
						this.procesocrearetiquetasproductos = new ProcesoCrearEtiquetasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
				}

				if(this.procesocrearetiquetasproductos.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.procesocrearetiquetasproductos.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoProcesoCrearEtiquetasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebProcesoCrearEtiquetasProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCrearEtiquetasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCrearEtiquetasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.procesocrearetiquetasproductosLogic.getConnexion());

				if(this.procesocrearetiquetasproductos.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.procesocrearetiquetasproductos.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCrearEtiquetasProductos=(TitledBorder)this.jScrollPanelDatosProcesoCrearEtiquetasProductos.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderProcesoCrearEtiquetasProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoProcesoCrearEtiquetasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetasproductos==null) {
						this.procesocrearetiquetasproductos = new ProcesoCrearEtiquetasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
				}

				if(this.procesocrearetiquetasproductos.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.procesocrearetiquetasproductos.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaProcesoCrearEtiquetasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebProcesoCrearEtiquetasProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCrearEtiquetasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCrearEtiquetasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.procesocrearetiquetasproductosLogic.getConnexion());

				if(this.procesocrearetiquetasproductos.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.procesocrearetiquetasproductos.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCrearEtiquetasProductos=(TitledBorder)this.jScrollPanelDatosProcesoCrearEtiquetasProductos.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderProcesoCrearEtiquetasProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaProcesoCrearEtiquetasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetasproductos==null) {
						this.procesocrearetiquetasproductos = new ProcesoCrearEtiquetasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
				}

				if(this.procesocrearetiquetasproductos.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.procesocrearetiquetasproductos.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaProcesoCrearEtiquetasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebProcesoCrearEtiquetasProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCrearEtiquetasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCrearEtiquetasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.procesocrearetiquetasproductosLogic.getConnexion());

				if(this.procesocrearetiquetasproductos.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.procesocrearetiquetasproductos.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCrearEtiquetasProductos=(TitledBorder)this.jScrollPanelDatosProcesoCrearEtiquetasProductos.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderProcesoCrearEtiquetasProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaProcesoCrearEtiquetasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetasproductos==null) {
						this.procesocrearetiquetasproductos = new ProcesoCrearEtiquetasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
				}

				if(this.procesocrearetiquetasproductos.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.procesocrearetiquetasproductos.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoProcesoCrearEtiquetasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetasproductos==null) {
						this.procesocrearetiquetasproductos = new ProcesoCrearEtiquetasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
				}

				if(this.procesocrearetiquetasproductos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.procesocrearetiquetasproductos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreProcesoCrearEtiquetasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetasproductos==null) {
						this.procesocrearetiquetasproductos = new ProcesoCrearEtiquetasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
				}

				if(this.procesocrearetiquetasproductos.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.procesocrearetiquetasproductos.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecio1ProcesoCrearEtiquetasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetasproductos==null) {
						this.procesocrearetiquetasproductos = new ProcesoCrearEtiquetasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
				}

				if(this.procesocrearetiquetasproductos.getprecio1()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio1 = "+this.procesocrearetiquetasproductos.getprecio1().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecio2ProcesoCrearEtiquetasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetasproductos==null) {
						this.procesocrearetiquetasproductos = new ProcesoCrearEtiquetasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
				}

				if(this.procesocrearetiquetasproductos.getprecio2()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio2 = "+this.procesocrearetiquetasproductos.getprecio2().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecio3ProcesoCrearEtiquetasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetasproductos==null) {
						this.procesocrearetiquetasproductos = new ProcesoCrearEtiquetasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
				}

				if(this.procesocrearetiquetasproductos.getprecio3()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio3 = "+this.procesocrearetiquetasproductos.getprecio3().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecio4ProcesoCrearEtiquetasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetasproductos==null) {
						this.procesocrearetiquetasproductos = new ProcesoCrearEtiquetasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
				}

				if(this.procesocrearetiquetasproductos.getprecio4()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio4 = "+this.procesocrearetiquetasproductos.getprecio4().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecio5ProcesoCrearEtiquetasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.getprocesocrearetiquetasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetasproductos==null) {
						this.procesocrearetiquetasproductos = new ProcesoCrearEtiquetasProductos();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);
				}

				if(this.procesocrearetiquetasproductos.getprecio5()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio5 = "+this.procesocrearetiquetasproductos.getprecio5().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);

			this.getProcesoCrearEtiquetasProductossBusquedaProcesoCrearEtiquetasProductos();

			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);

			//if(ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);

			this.getProcesoCrearEtiquetasProductossFK_IdBodega();

			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);

			//if(ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);

			this.getProcesoCrearEtiquetasProductossFK_IdEmpresa();

			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);

			//if(ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);

			this.getProcesoCrearEtiquetasProductossFK_IdLinea();

			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);

			//if(ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);

			this.getProcesoCrearEtiquetasProductossFK_IdLineaCategoria();

			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);

			//if(ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);

			this.getProcesoCrearEtiquetasProductossFK_IdLineaGrupo();

			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);

			//if(ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);

			this.getProcesoCrearEtiquetasProductossFK_IdLineaMarca();

			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);

			//if(ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);

			this.getProcesoCrearEtiquetasProductossFK_IdProducto();

			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);

			//if(ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProcesoCrearEtiquetasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);

			this.getProcesoCrearEtiquetasProductossFK_IdSucursal();

			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);

			//if(ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoCrearEtiquetasProductos() {
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.dispose();
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos!=null) {
			this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.dispose();
			this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos=null;
		}
		
		if(this.jInternalFrameImportacionProcesoCrearEtiquetasProductos!=null) {
			this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.dispose();
			this.jInternalFrameImportacionProcesoCrearEtiquetasProductos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoCrearEtiquetasProductos();
			
			ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoCrearEtiquetasProductos")) {
				jButtonNuevoProcesoCrearEtiquetasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoCrearEtiquetasProductos")) {
				jButtonDuplicarProcesoCrearEtiquetasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoCrearEtiquetasProductos")) {
				jButtonCopiarProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoCrearEtiquetasProductos")) {
				jButtonVerFormProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoCrearEtiquetasProductos")) {
				jButtonNuevoProcesoCrearEtiquetasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoCrearEtiquetasProductos")) {
				jButtonDuplicarProcesoCrearEtiquetasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoCrearEtiquetasProductos")) {
				jButtonNuevoProcesoCrearEtiquetasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoCrearEtiquetasProductos")) {
				jButtonDuplicarProcesoCrearEtiquetasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoCrearEtiquetasProductos")) {
				jButtonNuevoProcesoCrearEtiquetasProductosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoCrearEtiquetasProductos")) {
				jButtonNuevoProcesoCrearEtiquetasProductosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoCrearEtiquetasProductos")) {
				jButtonNuevoProcesoCrearEtiquetasProductosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoCrearEtiquetasProductos")) {
				jButtonModificarProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoCrearEtiquetasProductos")) {
				jButtonModificarProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoCrearEtiquetasProductos")) {
				jButtonModificarProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoCrearEtiquetasProductos")) {
				jButtonActualizarProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoCrearEtiquetasProductos")) {
				jButtonActualizarProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoCrearEtiquetasProductos")) {
				jButtonActualizarProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoCrearEtiquetasProductos")) {
				jButtonEliminarProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoCrearEtiquetasProductos")) {
				jButtonEliminarProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoCrearEtiquetasProductos")) {
				jButtonEliminarProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoCrearEtiquetasProductos")) {
				jButtonCancelarProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoCrearEtiquetasProductos")) {
				jButtonCancelarProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoCrearEtiquetasProductos")) {
				jButtonCancelarProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoCrearEtiquetasProductos")) {
				jButtonCerrarProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoCrearEtiquetasProductos")) {
				jButtonCerrarProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoCrearEtiquetasProductos")) {
				jButtonCerrarProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoCrearEtiquetasProductos")) {
				jButtonMostrarOcultarProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoCrearEtiquetasProductos")) {
				jButtonCancelarProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoCrearEtiquetasProductos")) {
				jButtonGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoCrearEtiquetasProductos")) {
				jButtonGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoCrearEtiquetasProductos")) {
				jButtonCopiarProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoCrearEtiquetasProductos")) {
				jButtonVerFormProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoCrearEtiquetasProductos")) {
				jButtonGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoCrearEtiquetasProductos")) {
				jButtonCopiarProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoCrearEtiquetasProductos")) {
				jButtonVerFormProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCrearEtiquetasProductos")) {
				jButtonGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoCrearEtiquetasProductos")) {
				jButtonGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoCrearEtiquetasProductos")) {
				jButtonGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoCrearEtiquetasProductos")) {
				jButtonRecargarInformacionProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoCrearEtiquetasProductos")) {
				jButtonRecargarInformacionProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoCrearEtiquetasProductos")) {
				jButtonRecargarInformacionProcesoCrearEtiquetasProductosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoCrearEtiquetasProductos")) {
				jButtonAnterioresProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoCrearEtiquetasProductos")) {
				jButtonAnterioresProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoCrearEtiquetasProductos")) {
				jButtonAnterioresProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoCrearEtiquetasProductos")) {
				jButtonSiguientesProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoCrearEtiquetasProductos")) {
				jButtonSiguientesProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoCrearEtiquetasProductos")) {
				jButtonSiguientesProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoCrearEtiquetasProductos") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoCrearEtiquetasProductos")) {
				jButtonAbrirOrderByProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoCrearEtiquetasProductos") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoCrearEtiquetasProductos")) {
				jButtonMostrarOcultarProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCrearEtiquetasProductos")) {
				jButtonNuevoGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoCrearEtiquetasProductos")) {
				jButtonNuevoGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoCrearEtiquetasProductos")) {
				jButtonNuevoGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoCrearEtiquetasProductos")) {
				jButtonCerrarReporteDinamicoProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoCrearEtiquetasProductos")) {
				jButtonGenerarReporteDinamicoProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoCrearEtiquetasProductos")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoCrearEtiquetasProductos")) {
				jButtonCerrarImportacionProcesoCrearEtiquetasProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoCrearEtiquetasProductos")) {
				
				jButtonGenerarImportacionProcesoCrearEtiquetasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoCrearEtiquetasProductos")) {
				
				jButtonAbrirImportacionProcesoCrearEtiquetasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoCrearEtiquetasProductos")) {
				jComboBoxTiposAccionesProcesoCrearEtiquetasProductosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoCrearEtiquetasProductos")) {
				jComboBoxTiposRelacionesProcesoCrearEtiquetasProductosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoCrearEtiquetasProductos")) {
				jComboBoxTiposAccionesProcesoCrearEtiquetasProductosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoCrearEtiquetasProductos")) {
				
				jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoCrearEtiquetasProductos")) {
				jTextFieldValorCampoGeneralProcesoCrearEtiquetasProductosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoCrearEtiquetasProductos")) {
				jButtonAbrirOrderByProcesoCrearEtiquetasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoCrearEtiquetasProductos")) {
				jButtonAbrirOrderByProcesoCrearEtiquetasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoCrearEtiquetasProductos")) {
				jButtonCerrarOrderByProcesoCrearEtiquetasProductosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonidProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProcesoCrearEtiquetasProductosUpdate")) {
				this.jButtonid_bodegaProcesoCrearEtiquetasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonid_bodegaProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProcesoCrearEtiquetasProductosUpdate")) {
				this.jButtonid_productoProcesoCrearEtiquetasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonid_productoProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoCrearEtiquetasProductosUpdate")) {
				this.jButtonid_empresaProcesoCrearEtiquetasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonid_empresaProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProcesoCrearEtiquetasProductosUpdate")) {
				this.jButtonid_sucursalProcesoCrearEtiquetasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonid_sucursalProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProcesoCrearEtiquetasProductosUpdate")) {
				this.jButtonid_lineaProcesoCrearEtiquetasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonid_lineaProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProcesoCrearEtiquetasProductosUpdate")) {
				this.jButtonid_linea_grupoProcesoCrearEtiquetasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonid_linea_grupoProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProcesoCrearEtiquetasProductosUpdate")) {
				this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProcesoCrearEtiquetasProductosUpdate")) {
				this.jButtonid_linea_marcaProcesoCrearEtiquetasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonid_linea_marcaProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtoncodigoProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonnombreProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio1ProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonprecio1ProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio2ProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonprecio2ProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio3ProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonprecio3ProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio4ProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonprecio4ProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio5ProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonprecio5ProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos")) {
				this.jButtonBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductosActionPerformed(evt);
			}
			
			;
			
			
			ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoCrearEtiquetasProductos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCrearEtiquetasProductosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetasproductos);
				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
				
				


				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesocrearetiquetasproductosLocal=this.procesocrearetiquetasproductos;
			} else {
				procesocrearetiquetasproductosLocal=this.procesocrearetiquetasproductosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetasproductos);
				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
							
				
				


				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCrearEtiquetasProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosAnterior =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocrearetiquetasproductosAnterior =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
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
			
			ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
			
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
			
			


			
			ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCrearEtiquetasProductosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetasproductos);
				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
								
						
				


				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasProductos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetasproductos);
				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
								
				
				


				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCrearEtiquetasProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosAnterior =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocrearetiquetasproductosAnterior =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetasproductos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCrearEtiquetasProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosAnterior =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocrearetiquetasproductosAnterior =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCrearEtiquetasProductosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetasproductos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetasproductos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetasproductos);
				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
							
				
				


				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasProductos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCrearEtiquetasProductosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetasproductosAnterior =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocrearetiquetasproductosAnterior =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
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
			
			ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
			
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
			
			


			
			ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCrearEtiquetasProductosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetasproductos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetasproductos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetasproductos);
				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
								
				
				


				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCrearEtiquetasProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosAnterior =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocrearetiquetasproductosAnterior =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCrearEtiquetasProductosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetasproductos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetasproductos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCrearEtiquetasProductosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetasproductos);
				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoCrearEtiquetasProductos")) {
					jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoCrearEtiquetasProductos")) {
					jCheckBoxSeleccionadosProcesoCrearEtiquetasProductosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoCrearEtiquetasProductos")) {
					
				}
				
				


				
				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetasproductos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetasproductos);
				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
												
				
				


				
				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCrearEtiquetasProductosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetasproductosAnterior =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocrearetiquetasproductosAnterior =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCrearEtiquetasProductosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetasproductos);
				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
				
				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
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
			
			ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
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
			
			


			
			ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCrearEtiquetasProductosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetasproductos);
				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasProductos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasProductos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetasproductos);
				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
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
				
				


				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasProductos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCrearEtiquetasProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetasproductosAnterior =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocrearetiquetasproductosAnterior =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoCrearEtiquetasProductos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoCrearEtiquetasProductosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesocrearetiquetasproductos =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesocrearetiquetasproductos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoCrearEtiquetasProductos")) {
				
				}
				
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoCrearEtiquetasProductos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoCrearEtiquetasProductos")) {
			
			}
			
			ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoCrearEtiquetasProductos();
			
			ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoCrearEtiquetasProductos")) {
				jButtonNuevoProcesoCrearEtiquetasProductosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoCrearEtiquetasProductos")) {
				jButtonDuplicarProcesoCrearEtiquetasProductosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoCrearEtiquetasProductos")) {
				jButtonCopiarProcesoCrearEtiquetasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoCrearEtiquetasProductos")) {
				jButtonVerFormProcesoCrearEtiquetasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoCrearEtiquetasProductos")) {
				jButtonNuevoProcesoCrearEtiquetasProductosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoCrearEtiquetasProductos")) {
				jButtonModificarProcesoCrearEtiquetasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoCrearEtiquetasProductos")) {
				jButtonActualizarProcesoCrearEtiquetasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoCrearEtiquetasProductos")) {
				jButtonEliminarProcesoCrearEtiquetasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCrearEtiquetasProductos")) {
				jButtonGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoCrearEtiquetasProductos")) {
				jButtonCancelarProcesoCrearEtiquetasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoCrearEtiquetasProductos")) {
				jButtonCerrarProcesoCrearEtiquetasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoCrearEtiquetasProductos")) {
				jButtonGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCrearEtiquetasProductos")) {
				jButtonNuevoGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoCrearEtiquetasProductos")) {
				jButtonAbrirOrderByProcesoCrearEtiquetasProductosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoCrearEtiquetasProductos")) {
				jButtonRecargarInformacionProcesoCrearEtiquetasProductosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoCrearEtiquetasProductos")) {
				jButtonAnterioresProcesoCrearEtiquetasProductosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoCrearEtiquetasProductos")) {
				jButtonSiguientesProcesoCrearEtiquetasProductosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonidProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProcesoCrearEtiquetasProductosUpdate")) {
				this.jButtonid_bodegaProcesoCrearEtiquetasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonid_bodegaProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProcesoCrearEtiquetasProductosUpdate")) {
				this.jButtonid_productoProcesoCrearEtiquetasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonid_productoProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoCrearEtiquetasProductosUpdate")) {
				this.jButtonid_empresaProcesoCrearEtiquetasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonid_empresaProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProcesoCrearEtiquetasProductosUpdate")) {
				this.jButtonid_sucursalProcesoCrearEtiquetasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonid_sucursalProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProcesoCrearEtiquetasProductosUpdate")) {
				this.jButtonid_lineaProcesoCrearEtiquetasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonid_lineaProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProcesoCrearEtiquetasProductosUpdate")) {
				this.jButtonid_linea_grupoProcesoCrearEtiquetasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonid_linea_grupoProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProcesoCrearEtiquetasProductosUpdate")) {
				this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProcesoCrearEtiquetasProductosUpdate")) {
				this.jButtonid_linea_marcaProcesoCrearEtiquetasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonid_linea_marcaProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtoncodigoProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonnombreProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio1ProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonprecio1ProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio2ProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonprecio2ProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio3ProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonprecio3ProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio4ProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonprecio4ProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio5ProcesoCrearEtiquetasProductosBusqueda")) {
				this.jButtonprecio5ProcesoCrearEtiquetasProductosBusquedaActionPerformed(evt);
			}
			
			ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoCrearEtiquetasProductos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoCrearEtiquetasProductos")) {
				closingInternalFrameProcesoCrearEtiquetasProductos();
				
			} else if(sTipo.equals("jButtonCancelarProcesoCrearEtiquetasProductos")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoCrearEtiquetasProductos = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoCrearEtiquetasProductosActionPerformed(null);
			}
			
			ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocrearetiquetasproductos,new Object(),this.procesocrearetiquetasproductosParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoCrearEtiquetasProductos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoCrearEtiquetasProductos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoCrearEtiquetasProductos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesocrearetiquetasproductos)) {
			if(!esControlTabla) {
				if(ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);			
				}
				
				if(this.procesocrearetiquetasproductosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductosReturnGeneral,this.procesocrearetiquetasproductosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesocrearetiquetasproductosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCrearEtiquetasProductos(classes,this.procesocrearetiquetasproductosReturnGeneral,this.procesocrearetiquetasproductosBean,false);
					}
						
					if(this.procesocrearetiquetasproductosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductosReturnGeneral.getProcesoCrearEtiquetasProductos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductosReturnGeneral.getProcesoCrearEtiquetasProductos());	
					}
						
					if(this.procesocrearetiquetasproductosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductosReturnGeneral.getProcesoCrearEtiquetasProductos(),classes);//this.procesocrearetiquetasproductosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,classes);//this.procesocrearetiquetasproductosBean);									
				}
			
				if(ProcesoCrearEtiquetasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasProductos(this.procesocrearetiquetasproductos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesocrearetiquetasproductosAnterior!=null) {
						this.procesocrearetiquetasproductos=this.procesocrearetiquetasproductosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesocrearetiquetasproductosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesocrearetiquetasproductosReturnGeneral.getProcesoCrearEtiquetasProductos(),procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesocrearetiquetasproductosReturnGeneral.getProcesoCrearEtiquetasProductos(),this.procesocrearetiquetasproductoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoCrearEtiquetasProductos.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoCrearEtiquetasProductos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoCrearEtiquetasProductos();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoCrearEtiquetasProductos() throws Exception {
		
		ProcesoCrearEtiquetasProductosModel procesocrearetiquetasproductosModel=(ProcesoCrearEtiquetasProductosModel)this.jTableDatosProcesoCrearEtiquetasProductos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocrearetiquetasproductosModel.procesocrearetiquetasproductoss=this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesocrearetiquetasproductosModel.procesocrearetiquetasproductoss=this.procesocrearetiquetasproductoss;
		}
		
		
		((ProcesoCrearEtiquetasProductosModel) this.jTableDatosProcesoCrearEtiquetasProductos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoCrearEtiquetasProductos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesocrearetiquetasproductosAnterior(),this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesocrearetiquetasproductosAnterior(),this.procesocrearetiquetasproductoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoCrearEtiquetasProductos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
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
										
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocrearetiquetasproductos,new Object(),generalEntityParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoCrearEtiquetasProductosConstantesFunciones.getClassesRelationshipsOfProcesoCrearEtiquetasProductos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoCrearEtiquetasProductosConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoCrearEtiquetasProductos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoCrearEtiquetasProductos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocrearetiquetasproductos,new Object(),generalEntityParameterGeneral,this.procesocrearetiquetasproductosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductosBean procesocrearetiquetasproductosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCrearEtiquetasProductos(ArrayList<Classe> classes,ProcesoCrearEtiquetasProductosReturnGeneral procesocrearetiquetasproductosReturnGeneral,ProcesoCrearEtiquetasProductosBean procesocrearetiquetasproductosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesocrearetiquetasproductos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos = new ProcesoCrearEtiquetasProductosDetalleFormJInternalFrame(jDesktopPane,this.procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones(),this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.setVisible(false);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.procesocrearetiquetasproductosLogic=this.procesocrearetiquetasproductosLogic;
		
		this.cargarCombosFrameForeignKeyProcesoCrearEtiquetasProductos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCrearEtiquetasProductos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCrearEtiquetasProductos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoCrearEtiquetasProductos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoCrearEtiquetasProductos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCrearEtiquetasProductos"));
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonModificarProcesoCrearEtiquetasProductos.addActionListener(new ButtonActionListener(this,"ModificarProcesoCrearEtiquetasProductos"));

		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonModificarToolBarProcesoCrearEtiquetasProductos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCrearEtiquetasProductos"));
					
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jMenuItemModificarProcesoCrearEtiquetasProductos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCrearEtiquetasProductos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonActualizarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCrearEtiquetasProductos"));
		
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonActualizarToolBarProcesoCrearEtiquetasProductos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCrearEtiquetasProductos"));
						
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jMenuItemActualizarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCrearEtiquetasProductos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonEliminarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"EliminarProcesoCrearEtiquetasProductos"));
		
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonEliminarToolBarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCrearEtiquetasProductos"));
								
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jMenuItemEliminarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCrearEtiquetasProductos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonCancelarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"CancelarProcesoCrearEtiquetasProductos"));
		
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonCancelarToolBarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCrearEtiquetasProductos"));
					
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jMenuItemCancelarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCrearEtiquetasProductos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jMenuItemDetalleCerrarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCrearEtiquetasProductos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonGuardarCambiosToolBarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCrearEtiquetasProductos"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonGuardarCambiosToolBarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCrearEtiquetasProductos"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCrearEtiquetasProductos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonidProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_bodegaProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_bodegaProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_productoProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_productoProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_productoProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_empresaProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_empresaProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_sucursalProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_sucursalProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_lineaProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_lineaProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_linea_grupoProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_linea_grupoProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_linea_marcaProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_linea_marcaProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoCrearEtiquetasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtoncodigoProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoCrearEtiquetasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonnombreProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombreProcesoCrearEtiquetasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonprecio1ProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"precio1ProcesoCrearEtiquetasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonprecio2ProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"precio2ProcesoCrearEtiquetasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonprecio3ProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"precio3ProcesoCrearEtiquetasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonprecio4ProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"precio4ProcesoCrearEtiquetasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonprecio5ProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"precio5ProcesoCrearEtiquetasProductosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTabbedPaneRelacionesProcesoCrearEtiquetasProductos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCrearEtiquetasProductos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoCrearEtiquetasProductos"));
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCrearEtiquetasProductos"));
		}
		
		this.jTableDatosProcesoCrearEtiquetasProductos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoCrearEtiquetasProductos"));
		
		this.jTableDatosProcesoCrearEtiquetasProductos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoCrearEtiquetasProductos"));
		
		this.jButtonNuevoProcesoCrearEtiquetasProductos.addActionListener(new ButtonActionListener(this,"NuevoProcesoCrearEtiquetasProductos"));
		
		this.jButtonDuplicarProcesoCrearEtiquetasProductos.addActionListener(new ButtonActionListener(this,"DuplicarProcesoCrearEtiquetasProductos"));
		
		this.jButtonCopiarProcesoCrearEtiquetasProductos.addActionListener(new ButtonActionListener(this,"CopiarProcesoCrearEtiquetasProductos"));
		
		this.jButtonVerFormProcesoCrearEtiquetasProductos.addActionListener(new ButtonActionListener(this,"VerFormProcesoCrearEtiquetasProductos"));
		
		
		this.jButtonNuevoToolBarProcesoCrearEtiquetasProductos.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoCrearEtiquetasProductos"));
			
		this.jButtonDuplicarToolBarProcesoCrearEtiquetasProductos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoCrearEtiquetasProductos"));
			
		this.jMenuItemNuevoProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoCrearEtiquetasProductos"));
			
		this.jMenuItemDuplicarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoCrearEtiquetasProductos"));		
		
		
		this.jButtonNuevoRelacionesProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoCrearEtiquetasProductos"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCrearEtiquetasProductos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoCrearEtiquetasProductos"));
			
		this.jMenuItemNuevoRelacionesProcesoCrearEtiquetasProductos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoCrearEtiquetasProductos"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonModificarProcesoCrearEtiquetasProductos.addActionListener(new ButtonActionListener(this,"ModificarProcesoCrearEtiquetasProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonModificarToolBarProcesoCrearEtiquetasProductos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCrearEtiquetasProductos"));
			
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jMenuItemModificarProcesoCrearEtiquetasProductos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCrearEtiquetasProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonActualizarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCrearEtiquetasProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonActualizarToolBarProcesoCrearEtiquetasProductos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCrearEtiquetasProductos"));
				
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jMenuItemActualizarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCrearEtiquetasProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonEliminarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"EliminarProcesoCrearEtiquetasProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonEliminarToolBarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCrearEtiquetasProductos"));
						
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jMenuItemEliminarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCrearEtiquetasProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonCancelarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"CancelarProcesoCrearEtiquetasProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonCancelarToolBarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCrearEtiquetasProductos"));
			
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jMenuItemCancelarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCrearEtiquetasProductos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoCrearEtiquetasProductos"));		
		
		
		this.jButtonCerrarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"CerrarProcesoCrearEtiquetasProductos"));
		
		
		this.jButtonCerrarToolBarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoCrearEtiquetasProductos"));
			
		this.jMenuItemCerrarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoCrearEtiquetasProductos"));
			
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jMenuItemDetalleCerrarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCrearEtiquetasProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonGuardarCambiosProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoCrearEtiquetasProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonGuardarCambiosToolBarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCrearEtiquetasProductos"));
		}
		
		this.jButtonCopiarToolBarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoCrearEtiquetasProductos"));
			
		this.jButtonVerFormToolBarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoCrearEtiquetasProductos"));
		
		this.jMenuItemGuardarCambiosProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoCrearEtiquetasProductos"));
			
		this.jMenuItemCopiarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoCrearEtiquetasProductos"));		
		
		this.jMenuItemVerFormProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoCrearEtiquetasProductos"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCrearEtiquetasProductos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoCrearEtiquetasProductos"));
			
		this.jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCrearEtiquetasProductos"));		
		
		
		
		this.jButtonRecargarInformacionProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoCrearEtiquetasProductos"));
					
		this.jButtonRecargarInformacionToolBarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoCrearEtiquetasProductos"));
		
		this.jMenuItemRecargarInformacionProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoCrearEtiquetasProductos"));		
		
		
		
		this.jButtonAnterioresProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"AnterioresProcesoCrearEtiquetasProductos"));
		
		
		this.jButtonAnterioresToolBarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoCrearEtiquetasProductos"));
		
		this.jMenuItemAnterioresProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoCrearEtiquetasProductos"));		
		
		
		this.jButtonSiguientesProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"SiguientesProcesoCrearEtiquetasProductos"));
		
		
		this.jButtonSiguientesToolBarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoCrearEtiquetasProductos"));
			
		this.jMenuItemSiguientesProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoCrearEtiquetasProductos"));
			
		this.jMenuItemAbrirOrderByProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoCrearEtiquetasProductos"));
			
		this.jMenuItemMostrarOcultarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoCrearEtiquetasProductos"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoCrearEtiquetasProductos"));
			
		this.jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoCrearEtiquetasProductos"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoCrearEtiquetasProductos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoCrearEtiquetasProductos"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoCrearEtiquetasProductos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoCrearEtiquetasProductos"));

		this.jCheckBoxSeleccionadosProcesoCrearEtiquetasProductos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoCrearEtiquetasProductos"));
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCrearEtiquetasProductos"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoCrearEtiquetasProductos"));
			
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoCrearEtiquetasProductos"));
					
		this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoCrearEtiquetasProductos"));
			
		this.jTextFieldValorCampoGeneralProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoCrearEtiquetasProductos"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonidProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_bodegaProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_bodegaProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_productoProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_productoProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_productoProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_empresaProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_empresaProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_sucursalProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_sucursalProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_lineaProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_lineaProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_linea_grupoProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_linea_grupoProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_linea_marcaProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_linea_marcaProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoCrearEtiquetasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtoncodigoProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoCrearEtiquetasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonnombreProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombreProcesoCrearEtiquetasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonprecio1ProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"precio1ProcesoCrearEtiquetasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonprecio2ProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"precio2ProcesoCrearEtiquetasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonprecio3ProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"precio3ProcesoCrearEtiquetasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonprecio4ProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"precio4ProcesoCrearEtiquetasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonprecio5ProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"precio5ProcesoCrearEtiquetasProductosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.addActionListener(new ButtonActionListener(this,"BusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos!=null) {
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCrearEtiquetasProductos"));
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCrearEtiquetasProductos"));
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasProductos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCrearEtiquetasProductos"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCrearEtiquetasProductos"));				
			//this.jButtonGenerarReporteDinamicoProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCrearEtiquetasProductos"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCrearEtiquetasProductos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoCrearEtiquetasProductos!=null) {
				this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCrearEtiquetasProductos"));
				this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCrearEtiquetasProductos"));
				this.jInternalFrameImportacionProcesoCrearEtiquetasProductos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCrearEtiquetasProductos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoCrearEtiquetasProductos"));
			
			this.jButtonAbrirOrderByToolBarProcesoCrearEtiquetasProductos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoCrearEtiquetasProductos"));			
			
			if(this.jInternalFrameOrderByProcesoCrearEtiquetasProductos!=null) {
				this.jInternalFrameOrderByProcesoCrearEtiquetasProductos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCrearEtiquetasProductos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTabbedPaneRelacionesProcesoCrearEtiquetasProductos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCrearEtiquetasProductos"));
		
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
            		closingInternalFrameProcesoCrearEtiquetasProductos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoCrearEtiquetasProductos = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoCrearEtiquetasProductosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoCrearEtiquetasProductos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoCrearEtiquetasProductosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoCrearEtiquetasProductos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoCrearEtiquetasProductos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCrearEtiquetasProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCrearEtiquetasProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCrearEtiquetasProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonNuevoProcesoCrearEtiquetasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCrearEtiquetasProductosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCrearEtiquetasProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCrearEtiquetasProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCrearEtiquetasProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonNuevoRelacionesProcesoCrearEtiquetasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCrearEtiquetasProductosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonModificarProcesoCrearEtiquetasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoCrearEtiquetasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonActualizarProcesoCrearEtiquetasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoCrearEtiquetasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonEliminarProcesoCrearEtiquetasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoCrearEtiquetasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonCancelarProcesoCrearEtiquetasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoCrearEtiquetasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoCrearEtiquetasProductos";
		inputMap = this.jButtonCerrarProcesoCrearEtiquetasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoCrearEtiquetasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonGuardarCambiosProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoCrearEtiquetasProductos";
		inputMap = this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonGuardarCambiosProcesoCrearEtiquetasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonGuardarCambiosProcesoCrearEtiquetasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoCrearEtiquetasProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoCrearEtiquetasProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoCrearEtiquetasProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonidProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_bodegaProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_bodegaProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_productoProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_productoProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_productoProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_empresaProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_empresaProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_sucursalProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_sucursalProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_lineaProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_lineaProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_linea_grupoProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_linea_grupoProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_linea_categoriaProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoCrearEtiquetasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_linea_marcaProcesoCrearEtiquetasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoCrearEtiquetasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonid_linea_marcaProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoCrearEtiquetasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtoncodigoProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoCrearEtiquetasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonnombreProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombreProcesoCrearEtiquetasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonprecio1ProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"precio1ProcesoCrearEtiquetasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonprecio2ProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"precio2ProcesoCrearEtiquetasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonprecio3ProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"precio3ProcesoCrearEtiquetasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonprecio4ProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"precio4ProcesoCrearEtiquetasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jButtonprecio5ProcesoCrearEtiquetasProductosBusqueda.addActionListener(new ButtonActionListener(this,"precio5ProcesoCrearEtiquetasProductosBusqueda"));
		
		
		this.jButtonBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos.addActionListener(new ButtonActionListener(this,"BusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoCrearEtiquetasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoCrearEtiquetasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasProductos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoCrearEtiquetasProductos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss()) {
					procesocrearetiquetasproductosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:procesocrearetiquetasproductoss) {
					procesocrearetiquetasproductosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoCrearEtiquetasProductosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss()) {
						procesocrearetiquetasproductosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:procesocrearetiquetasproductoss) {
						procesocrearetiquetasproductosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:procesocrearetiquetasproductoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCrearEtiquetasProductos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCrearEtiquetasProductos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCrearEtiquetasProductos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasProductos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoCrearEtiquetasProductosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoCrearEtiquetasProductos.getSelectedRows();
			
			ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosLocal=new ProcesoCrearEtiquetasProductos();
			
			//this.seleccionarTodosProcesoCrearEtiquetasProductos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesocrearetiquetasproductosLocal =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss().toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesocrearetiquetasproductosLocal =(ProcesoCrearEtiquetasProductos) this.procesocrearetiquetasproductoss.toArray()[this.jTableDatosProcesoCrearEtiquetasProductos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesocrearetiquetasproductosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss()) {
						procesocrearetiquetasproductosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:procesocrearetiquetasproductoss) {
						procesocrearetiquetasproductosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoCrearEtiquetasProductos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCrearEtiquetasProductos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCrearEtiquetasProductos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasProductos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoCrearEtiquetasProductosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoCrearEtiquetasProductosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoCrearEtiquetasProductosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoCrearEtiquetasProductos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss()) {
				
						if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							procesocrearetiquetasproductosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							procesocrearetiquetasproductosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO1)) {
							existe=true;
							procesocrearetiquetasproductosAux.setprecio1(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO2)) {
							existe=true;
							procesocrearetiquetasproductosAux.setprecio2(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO3)) {
							existe=true;
							procesocrearetiquetasproductosAux.setprecio3(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO4)) {
							existe=true;
							procesocrearetiquetasproductosAux.setprecio4(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO5)) {
							existe=true;
							procesocrearetiquetasproductosAux.setprecio5(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:procesocrearetiquetasproductoss) {
					
						if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							procesocrearetiquetasproductosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							procesocrearetiquetasproductosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO1)) {
							existe=true;
							procesocrearetiquetasproductosAux.setprecio1(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO2)) {
							existe=true;
							procesocrearetiquetasproductosAux.setprecio2(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO3)) {
							existe=true;
							procesocrearetiquetasproductosAux.setprecio3(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO4)) {
							existe=true;
							procesocrearetiquetasproductosAux.setprecio4(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO5)) {
							existe=true;
							procesocrearetiquetasproductosAux.setprecio5(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCrearEtiquetasProductos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoCrearEtiquetasProductosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoCrearEtiquetasProductos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoCrearEtiquetasProductos) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoCrearEtiquetasProductos(conSplash);
				
					this.generarReporteProcesoCrearEtiquetasProductossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoCrearEtiquetasProductossSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCrearEtiquetasProductossSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCrearEtiquetasProductossSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCrearEtiquetasProductos();
				
				this.exportarProcesoCrearEtiquetasProductossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoCrearEtiquetasProductoss();
				//this.importarProcesoCrearEtiquetasProductoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCrearEtiquetasProductos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoCrearEtiquetasProductossSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Crear Etiquetas Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoCrearEtiquetasProductos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoCrearEtiquetasProductos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoCrearEtiquetasProductos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Crear Etiquetas Productos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoCrearEtiquetasProductosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoCrearEtiquetasProductos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoCrearEtiquetasProductos(conSplash);
					
						//this.actualizarParametrosGeneralProcesoCrearEtiquetasProductos();
						
						this.generarReporteProcesoAccionProcesoCrearEtiquetasProductossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Crear Etiquetas ProductosES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Crear Etiquetas Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoCrearEtiquetasProductos();
				
						this.actualizarParametrosGeneralProcesoCrearEtiquetasProductos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesocrearetiquetasproductosReturnGeneral=procesocrearetiquetasproductosLogic.procesarAccionProcesoCrearEtiquetasProductossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss(),this.procesocrearetiquetasproductosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoCrearEtiquetasProductosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoCrearEtiquetasProductos();
					
					ProcesoCrearEtiquetasProductosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoCrearEtiquetasProductosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCrearEtiquetasProductos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasProductos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoCrearEtiquetasProductos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoCrearEtiquetasProductosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoCrearEtiquetasProductos();
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossSeleccionados=new ArrayList<ProcesoCrearEtiquetasProductos>();		
			ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos=new ProcesoCrearEtiquetasProductos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoCrearEtiquetasProductos.getSelectedItem();
			
			
			
			
			procesocrearetiquetasproductossSeleccionados=this.getProcesoCrearEtiquetasProductossSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesocrearetiquetasproductossSeleccionados.size()==1) {
				for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:procesocrearetiquetasproductossSeleccionados) {
					procesocrearetiquetasproductos=procesocrearetiquetasproductosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoCrearEtiquetasProductos();
			
      		//this.finishProcessProcesoCrearEtiquetasProductos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoCrearEtiquetasProductosReturnGeneral() throws Exception {
		if(this.procesocrearetiquetasproductosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesocrearetiquetasproductosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesocrearetiquetasproductosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesocrearetiquetasproductosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesocrearetiquetasproductosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesocrearetiquetasproductosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
		}
		
		if(this.procesocrearetiquetasproductosReturnGeneral.getConRetornoLista() || this.procesocrearetiquetasproductosReturnGeneral.getConRetornoObjeto()) {
			if(this.procesocrearetiquetasproductosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.procesocrearetiquetasproductosLogic.setProcesoCrearEtiquetasProductoss(this.procesocrearetiquetasproductosReturnGeneral.getProcesoCrearEtiquetasProductoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoCrearEtiquetasProductos(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoCrearEtiquetasProductos() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoCrearEtiquetasProductos> getProcesoCrearEtiquetasProductossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossSeleccionados=new ArrayList<ProcesoCrearEtiquetasProductos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoCrearEtiquetasProductos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss()) {
					if(procesocrearetiquetasproductosAux.getIsSelected()) {
						procesocrearetiquetasproductossSeleccionados.add(procesocrearetiquetasproductosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:this.procesocrearetiquetasproductoss) {
					if(procesocrearetiquetasproductosAux.getIsSelected()) {
						procesocrearetiquetasproductossSeleccionados.add(procesocrearetiquetasproductosAux);				
					}
				}
			}
			
			if(procesocrearetiquetasproductossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesocrearetiquetasproductossSeleccionados.addAll(this.procesocrearetiquetasproductosLogic.getProcesoCrearEtiquetasProductoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesocrearetiquetasproductossSeleccionados.addAll(this.procesocrearetiquetasproductoss);				
					}
				}
			}
		} else {
			procesocrearetiquetasproductossSeleccionados.add(this.procesocrearetiquetasproductos);
		}
		
		return procesocrearetiquetasproductossSeleccionados;
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
	
	public void generarReporteProcesoCrearEtiquetasProductossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoCrearEtiquetasProductossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoCrearEtiquetasProductossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCrearEtiquetasProductossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCrearEtiquetasProductossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Crear Etiquetas Productos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoCrearEtiquetasProductossSeleccionados() throws Exception {
		ArrayList<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossSeleccionados=new ArrayList<ProcesoCrearEtiquetasProductos>();		
		
		procesocrearetiquetasproductossSeleccionados=this.getProcesoCrearEtiquetasProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoCrearEtiquetasProductoss("Todos",procesocrearetiquetasproductossSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoCrearEtiquetasProductossSeleccionados() throws Exception {
		ArrayList<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossSeleccionados=new ArrayList<ProcesoCrearEtiquetasProductos>();		
		
		procesocrearetiquetasproductossSeleccionados=this.getProcesoCrearEtiquetasProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoCrearEtiquetasProductoss("Todos",procesocrearetiquetasproductossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoCrearEtiquetasProductossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossSeleccionados=new ArrayList<ProcesoCrearEtiquetasProductos>();
		
		procesocrearetiquetasproductossSeleccionados=this.getProcesoCrearEtiquetasProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoCrearEtiquetasProductoss("Todos",procesocrearetiquetasproductossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoCrearEtiquetasProductossSeleccionados() throws Exception {
		ArrayList<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossSeleccionados=new ArrayList<ProcesoCrearEtiquetasProductos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoCrearEtiquetasProductos();
		
		
		procesocrearetiquetasproductossSeleccionados=this.getProcesoCrearEtiquetasProductossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoCrearEtiquetasProductos();
		
		
		//this.generarReporteProcesoCrearEtiquetasProductoss("Todos",procesocrearetiquetasproductossSeleccionados ,procesocrearetiquetasproductosImplementable,procesocrearetiquetasproductosImplementableHome);
	}
	
	public void mostrarImportacionProcesoCrearEtiquetasProductoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoCrearEtiquetasProductos();
		
		this.abrirFrameImportacionProcesoCrearEtiquetasProductos();		
		
			
		//this.generarReporteProcesoCrearEtiquetasProductoss("Todos",procesocrearetiquetasproductossSeleccionados ,procesocrearetiquetasproductosImplementable,procesocrearetiquetasproductosImplementableHome);
	}
	
	public void importarProcesoCrearEtiquetasProductoss() throws Exception {		
	
	}
	
	public void exportarProcesoCrearEtiquetasProductossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoCrearEtiquetasProductossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoCrearEtiquetasProductossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoCrearEtiquetasProductossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Crear Etiquetas Productos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoCrearEtiquetasProductossSeleccionados() throws Exception {
		ArrayList<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossSeleccionados=new ArrayList<ProcesoCrearEtiquetasProductos>();		
		
		procesocrearetiquetasproductossSeleccionados=this.getProcesoCrearEtiquetasProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocrearetiquetasproductos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoCrearEtiquetasProductos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:procesocrearetiquetasproductossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoCrearEtiquetasProductos(procesocrearetiquetasproductosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesocrearetiquetasproductosAux.setsDetalleGeneralEntityReporte(procesocrearetiquetasproductosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Crear Etiquetas Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoCrearEtiquetasProductos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO1;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO2;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO3;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO4;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO5;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesocrearetiquetasproductos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetasproductos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetasproductos.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetasproductos.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetasproductos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetasproductos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetasproductos.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetasproductos.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetasproductos.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetasproductos.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetasproductos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetasproductos.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetasproductos.getprecio1().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetasproductos.getprecio2().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetasproductos.getprecio3().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetasproductos.getprecio4().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetasproductos.getprecio5().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoCrearEtiquetasProductossSeleccionados() throws Exception {
		ArrayList<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossSeleccionados=new ArrayList<ProcesoCrearEtiquetasProductos>();		
		
		procesocrearetiquetasproductossSeleccionados=this.getProcesoCrearEtiquetasProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocrearetiquetasproductos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoCrearEtiquetasProductoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoCrearEtiquetasProductos(row);				
				iRow++;
			}				
			
			for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:procesocrearetiquetasproductossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoCrearEtiquetasProductos(procesocrearetiquetasproductosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Crear Etiquetas Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoCrearEtiquetasProductossSeleccionados() throws Exception {
		ArrayList<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossSeleccionados=new ArrayList<ProcesoCrearEtiquetasProductos>();		
		
		procesocrearetiquetasproductossSeleccionados=this.getProcesoCrearEtiquetasProductossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocrearetiquetasproductos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesocrearetiquetasproductoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesocrearetiquetasproductos");
			//elementRoot.appendChild(element);
		
			for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:procesocrearetiquetasproductossSeleccionados) {
				element = document.createElement("procesocrearetiquetasproductos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoCrearEtiquetasProductos(procesocrearetiquetasproductosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Crear Etiquetas Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoCrearEtiquetasProductos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO1);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO2);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO3);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO4);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_PRECIO5);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetasproductos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetasproductos.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetasproductos.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetasproductos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetasproductos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetasproductos.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetasproductos.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetasproductos.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetasproductos.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetasproductos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetasproductos.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetasproductos.getprecio1());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetasproductos.getprecio2());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetasproductos.getprecio3());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetasproductos.getprecio4());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetasproductos.getprecio5());				
	}
	
	public void setFilaDatosExportarXmlProcesoCrearEtiquetasProductos(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoCrearEtiquetasProductosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesocrearetiquetasproductos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoCrearEtiquetasProductosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesocrearetiquetasproductos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementbodega_descripcion = document.createElement(ProcesoCrearEtiquetasProductosConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(procesocrearetiquetasproductos.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(ProcesoCrearEtiquetasProductosConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(procesocrearetiquetasproductos.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementempresa_descripcion = document.createElement(ProcesoCrearEtiquetasProductosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(procesocrearetiquetasproductos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProcesoCrearEtiquetasProductosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(procesocrearetiquetasproductos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementlinea_descripcion = document.createElement(ProcesoCrearEtiquetasProductosConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(procesocrearetiquetasproductos.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(ProcesoCrearEtiquetasProductosConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(procesocrearetiquetasproductos.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(ProcesoCrearEtiquetasProductosConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(procesocrearetiquetasproductos.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(ProcesoCrearEtiquetasProductosConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(procesocrearetiquetasproductos.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementcodigo = document.createElement(ProcesoCrearEtiquetasProductosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(procesocrearetiquetasproductos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ProcesoCrearEtiquetasProductosConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(procesocrearetiquetasproductos.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementprecio1 = document.createElement(ProcesoCrearEtiquetasProductosConstantesFunciones.PRECIO1);
		elementprecio1.appendChild(document.createTextNode(procesocrearetiquetasproductos.getprecio1().toString().trim()));
		element.appendChild(elementprecio1);

		Element elementprecio2 = document.createElement(ProcesoCrearEtiquetasProductosConstantesFunciones.PRECIO2);
		elementprecio2.appendChild(document.createTextNode(procesocrearetiquetasproductos.getprecio2().toString().trim()));
		element.appendChild(elementprecio2);

		Element elementprecio3 = document.createElement(ProcesoCrearEtiquetasProductosConstantesFunciones.PRECIO3);
		elementprecio3.appendChild(document.createTextNode(procesocrearetiquetasproductos.getprecio3().toString().trim()));
		element.appendChild(elementprecio3);

		Element elementprecio4 = document.createElement(ProcesoCrearEtiquetasProductosConstantesFunciones.PRECIO4);
		elementprecio4.appendChild(document.createTextNode(procesocrearetiquetasproductos.getprecio4().toString().trim()));
		element.appendChild(elementprecio4);

		Element elementprecio5 = document.createElement(ProcesoCrearEtiquetasProductosConstantesFunciones.PRECIO5);
		elementprecio5.appendChild(document.createTextNode(procesocrearetiquetasproductos.getprecio5().toString().trim()));
		element.appendChild(elementprecio5);
	}
	
	public void generarReporteGroupGenericoProcesoCrearEtiquetasProductossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossSeleccionados=new ArrayList<ProcesoCrearEtiquetasProductos>();
		
		procesocrearetiquetasproductossSeleccionados=this.getProcesoCrearEtiquetasProductossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoCrearEtiquetasProductos(procesocrearetiquetasproductossSeleccionados);
		
		this.generarReporteProcesoCrearEtiquetasProductoss("Todos",procesocrearetiquetasproductossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoCrearEtiquetasProductos(ArrayList<ProcesoCrearEtiquetasProductos> procesocrearetiquetasproductossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoCrearEtiquetasProductos procesocrearetiquetasproductosAux:procesocrearetiquetasproductossSeleccionados) {
				procesocrearetiquetasproductosAux.setsDetalleGeneralEntityReporte(procesocrearetiquetasproductosAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					procesocrearetiquetasproductosAux.setsDescripcionGeneralEntityReporte1(procesocrearetiquetasproductosAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					procesocrearetiquetasproductosAux.setsDescripcionGeneralEntityReporte1(procesocrearetiquetasproductosAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					procesocrearetiquetasproductosAux.setsDescripcionGeneralEntityReporte1(procesocrearetiquetasproductosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					procesocrearetiquetasproductosAux.setsDescripcionGeneralEntityReporte1(procesocrearetiquetasproductosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					procesocrearetiquetasproductosAux.setsDescripcionGeneralEntityReporte1(procesocrearetiquetasproductosAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					procesocrearetiquetasproductosAux.setsDescripcionGeneralEntityReporte1(procesocrearetiquetasproductosAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					procesocrearetiquetasproductosAux.setsDescripcionGeneralEntityReporte1(procesocrearetiquetasproductosAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					procesocrearetiquetasproductosAux.setsDescripcionGeneralEntityReporte1(procesocrearetiquetasproductosAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					procesocrearetiquetasproductosAux.setsDescripcionGeneralEntityReporte1(procesocrearetiquetasproductosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasProductosConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					procesocrearetiquetasproductosAux.setsDescripcionGeneralEntityReporte1(procesocrearetiquetasproductosAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoCrearEtiquetasProductos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaModificarProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos=true;
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaModificarProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos=true;
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos=true;
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaModificarProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos=true;
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos=true;
			this.isVisibilidadCeldaModificarProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaModificarProcesoCrearEtiquetasProductos=true;
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoCrearEtiquetasProductosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos=true;
		} else {
			this.actualizarEstadoPanelsProcesoCrearEtiquetasProductos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoCrearEtiquetasProductos=false;
			//this.isVisibilidadCeldaVerFormProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaDuplicarProcesoCrearEtiquetasProductos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
			if(!procesocrearetiquetasproductosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos=false;												
			}
			
			this.jButtonCerrarProcesoCrearEtiquetasProductos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos=false;
		}
		
		if(!this.permiteMantenimiento(this.procesocrearetiquetasproductos)) {
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos=false;
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasProductos=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasProductos=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasProductos=false;
		//this.isVisibilidadCeldaModificarProcesoCrearEtiquetasProductos=true;
		this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasProductos=false;
		this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasProductos=false;
		//this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasProductos=true;			
		this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasProductos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCrearEtiquetasProductos() {
	}
	
	public void actualizarEstadoPanelsProcesoCrearEtiquetasProductos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos!=null) {
				this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos!=null) {
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCrearEtiquetasProductos!=null) {
				this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCrearEtiquetasProductos!=null) {
				this.jPanelPaginacionProcesoCrearEtiquetasProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCrearEtiquetasProductos!=null) {
				this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos!=null) {
				this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos!=null) {
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoCrearEtiquetasProductos!=null) {
				this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCrearEtiquetasProductos!=null) {
				this.jPanelPaginacionProcesoCrearEtiquetasProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCrearEtiquetasProductos!=null) {
				this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos!=null) {
				this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos!=null) {
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCrearEtiquetasProductos!=null) {
				this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCrearEtiquetasProductos!=null) {
				this.jPanelPaginacionProcesoCrearEtiquetasProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCrearEtiquetasProductos!=null) {
				this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos!=null) {
				this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos!=null) {
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCrearEtiquetasProductos!=null) {
				this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCrearEtiquetasProductos!=null) {
				this.jPanelPaginacionProcesoCrearEtiquetasProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCrearEtiquetasProductos!=null) {
				this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos!=null) {
				this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos!=null) {
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCrearEtiquetasProductos!=null) {
				this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCrearEtiquetasProductos!=null) {
				this.jPanelPaginacionProcesoCrearEtiquetasProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCrearEtiquetasProductos!=null) {
				this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos!=null) {
				this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos!=null) {
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCrearEtiquetasProductos!=null) {
				this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCrearEtiquetasProductos!=null) {
				this.jPanelPaginacionProcesoCrearEtiquetasProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCrearEtiquetasProductos!=null) {
				this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos!=null) {
				this.jScrollPanelDatosEdicionProcesoCrearEtiquetasProductos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos!=null) {
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCrearEtiquetasProductos!=null) {
				this.jScrollPanelDatosProcesoCrearEtiquetasProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCrearEtiquetasProductos!=null) {
				this.jPanelPaginacionProcesoCrearEtiquetasProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCrearEtiquetasProductos!=null) {
				this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos!=null) {
					this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoCrearEtiquetasProductos!=null) {
				this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesocrearetiquetasproductosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos!=null) {
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoCrearEtiquetasProductos!=null) {
				this.jPanelParametrosReportesProcesoCrearEtiquetasProductos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadBusquedaProcesoCrearEtiquetasProductos=isParaBodega;
			if(!this.isVisibilidadBusquedaProcesoCrearEtiquetasProductos) {this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.remove(jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaProcesoCrearEtiquetasProductos=isParaProducto;
			if(!this.isVisibilidadBusquedaProcesoCrearEtiquetasProductos) {this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.remove(jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaProcesoCrearEtiquetasProductos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaProcesoCrearEtiquetasProductos) {this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.remove(jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaProcesoCrearEtiquetasProductos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaProcesoCrearEtiquetasProductos) {this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.remove(jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaProcesoCrearEtiquetasProductos=isParaLinea;
			if(!this.isVisibilidadBusquedaProcesoCrearEtiquetasProductos) {this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.remove(jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaProcesoCrearEtiquetasProductos=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaProcesoCrearEtiquetasProductos) {this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.remove(jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaProcesoCrearEtiquetasProductos=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaProcesoCrearEtiquetasProductos) {this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.remove(jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaProcesoCrearEtiquetasProductos=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaProcesoCrearEtiquetasProductos) {this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.remove(jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos);}
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
			
			this.inicializarActualizarBindingTablaProcesoCrearEtiquetasProductos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoCrearEtiquetasProductos() {
		this.updateBorderResaltarBusquedasFormularioProcesoCrearEtiquetasProductos();
		this.updateVisibilidadBusquedasFormularioProcesoCrearEtiquetasProductos();
		this.updateHabilitarBusquedasFormularioProcesoCrearEtiquetasProductos();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoCrearEtiquetasProductos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.getComponents().length>0) {
	

		if(this.procesocrearetiquetasproductosConstantesFunciones.resaltarBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos!=null) {
			index= this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.indexOfComponent(this.jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.getComponent(index);
				jPanel.setBorder(this.procesocrearetiquetasproductosConstantesFunciones.resaltarBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoCrearEtiquetasProductos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.indexOfComponent(this.jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos);
			if(!this.procesocrearetiquetasproductosConstantesFunciones.mostrarBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos && index>-1) {
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoCrearEtiquetasProductos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.indexOfComponent(this.jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesocrearetiquetasproductosConstantesFunciones.activarBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos);
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.setEnabledAt(index,this.procesocrearetiquetasproductosConstantesFunciones.activarBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoCrearEtiquetasProductos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasProductos")) {
			index= this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.indexOfComponent(this.jPanelBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos);

			this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCrearEtiquetasProductos.getComponent(index);

			this.procesocrearetiquetasproductosConstantesFunciones.setResaltarBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos(resaltar);

			jPanel.setBorder(this.procesocrearetiquetasproductosConstantesFunciones.resaltarBusquedaProcesoCrearEtiquetasProductosProcesoCrearEtiquetasProductos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoCrearEtiquetasProductos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoCrearEtiquetasProductos() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoCrearEtiquetasProductos();
		this.updateVisibilidadResaltarControlesFormularioProcesoCrearEtiquetasProductos();
		this.updateHabilitarResaltarControlesFormularioProcesoCrearEtiquetasProductos();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoCrearEtiquetasProductos() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesocrearetiquetasproductosConstantesFunciones.resaltaridProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelidProcesoCrearEtiquetasProductos.setBorder(this.procesocrearetiquetasproductosConstantesFunciones.resaltaridProcesoCrearEtiquetasProductos);}
		if(this.procesocrearetiquetasproductosConstantesFunciones.resaltarid_bodegaProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_bodegaProcesoCrearEtiquetasProductos.setBorder(this.procesocrearetiquetasproductosConstantesFunciones.resaltarid_bodegaProcesoCrearEtiquetasProductos);}
		if(this.procesocrearetiquetasproductosConstantesFunciones.resaltarid_productoProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_productoProcesoCrearEtiquetasProductos.setBorder(this.procesocrearetiquetasproductosConstantesFunciones.resaltarid_productoProcesoCrearEtiquetasProductos);}
		if(this.procesocrearetiquetasproductosConstantesFunciones.resaltarid_empresaProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_empresaProcesoCrearEtiquetasProductos.setBorder(this.procesocrearetiquetasproductosConstantesFunciones.resaltarid_empresaProcesoCrearEtiquetasProductos);}
		if(this.procesocrearetiquetasproductosConstantesFunciones.resaltarid_sucursalProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_sucursalProcesoCrearEtiquetasProductos.setBorder(this.procesocrearetiquetasproductosConstantesFunciones.resaltarid_sucursalProcesoCrearEtiquetasProductos);}
		if(this.procesocrearetiquetasproductosConstantesFunciones.resaltarid_lineaProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_lineaProcesoCrearEtiquetasProductos.setBorder(this.procesocrearetiquetasproductosConstantesFunciones.resaltarid_lineaProcesoCrearEtiquetasProductos);}
		if(this.procesocrearetiquetasproductosConstantesFunciones.resaltarid_linea_grupoProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.setBorder(this.procesocrearetiquetasproductosConstantesFunciones.resaltarid_linea_grupoProcesoCrearEtiquetasProductos);}
		if(this.procesocrearetiquetasproductosConstantesFunciones.resaltarid_linea_categoriaProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.setBorder(this.procesocrearetiquetasproductosConstantesFunciones.resaltarid_linea_categoriaProcesoCrearEtiquetasProductos);}
		if(this.procesocrearetiquetasproductosConstantesFunciones.resaltarid_linea_marcaProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.setBorder(this.procesocrearetiquetasproductosConstantesFunciones.resaltarid_linea_marcaProcesoCrearEtiquetasProductos);}
		if(this.procesocrearetiquetasproductosConstantesFunciones.resaltarcodigoProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldcodigoProcesoCrearEtiquetasProductos.setBorder(this.procesocrearetiquetasproductosConstantesFunciones.resaltarcodigoProcesoCrearEtiquetasProductos);}
		if(this.procesocrearetiquetasproductosConstantesFunciones.resaltarnombreProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextAreanombreProcesoCrearEtiquetasProductos.setBorder(this.procesocrearetiquetasproductosConstantesFunciones.resaltarnombreProcesoCrearEtiquetasProductos);}
		if(this.procesocrearetiquetasproductosConstantesFunciones.resaltarprecio1ProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio1ProcesoCrearEtiquetasProductos.setBorder(this.procesocrearetiquetasproductosConstantesFunciones.resaltarprecio1ProcesoCrearEtiquetasProductos);}
		if(this.procesocrearetiquetasproductosConstantesFunciones.resaltarprecio2ProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio2ProcesoCrearEtiquetasProductos.setBorder(this.procesocrearetiquetasproductosConstantesFunciones.resaltarprecio2ProcesoCrearEtiquetasProductos);}
		if(this.procesocrearetiquetasproductosConstantesFunciones.resaltarprecio3ProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio3ProcesoCrearEtiquetasProductos.setBorder(this.procesocrearetiquetasproductosConstantesFunciones.resaltarprecio3ProcesoCrearEtiquetasProductos);}
		if(this.procesocrearetiquetasproductosConstantesFunciones.resaltarprecio4ProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio4ProcesoCrearEtiquetasProductos.setBorder(this.procesocrearetiquetasproductosConstantesFunciones.resaltarprecio4ProcesoCrearEtiquetasProductos);}
		if(this.procesocrearetiquetasproductosConstantesFunciones.resaltarprecio5ProcesoCrearEtiquetasProductos!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio5ProcesoCrearEtiquetasProductos.setBorder(this.procesocrearetiquetasproductosConstantesFunciones.resaltarprecio5ProcesoCrearEtiquetasProductos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoCrearEtiquetasProductos() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
	
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelidProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostraridProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jPanelidProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostraridProcesoCrearEtiquetasProductos);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_bodegaProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarid_bodegaProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jPanelid_bodegaProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarid_bodegaProcesoCrearEtiquetasProductos);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_productoProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarid_productoProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jPanelid_productoProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarid_productoProcesoCrearEtiquetasProductos);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_empresaProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarid_empresaProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jPanelid_empresaProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarid_empresaProcesoCrearEtiquetasProductos);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_sucursalProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarid_sucursalProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jPanelid_sucursalProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarid_sucursalProcesoCrearEtiquetasProductos);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_lineaProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarid_lineaProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jPanelid_lineaProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarid_lineaProcesoCrearEtiquetasProductos);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarid_linea_grupoProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jPanelid_linea_grupoProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarid_linea_grupoProcesoCrearEtiquetasProductos);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarid_linea_categoriaProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jPanelid_linea_categoriaProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarid_linea_categoriaProcesoCrearEtiquetasProductos);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarid_linea_marcaProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jPanelid_linea_marcaProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarid_linea_marcaProcesoCrearEtiquetasProductos);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldcodigoProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarcodigoProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jPanelcodigoProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarcodigoProcesoCrearEtiquetasProductos);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextAreanombreProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarnombreProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jPanelnombreProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarnombreProcesoCrearEtiquetasProductos);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio1ProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarprecio1ProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jPanelprecio1ProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarprecio1ProcesoCrearEtiquetasProductos);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio2ProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarprecio2ProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jPanelprecio2ProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarprecio2ProcesoCrearEtiquetasProductos);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio3ProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarprecio3ProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jPanelprecio3ProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarprecio3ProcesoCrearEtiquetasProductos);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio4ProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarprecio4ProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jPanelprecio4ProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarprecio4ProcesoCrearEtiquetasProductos);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio5ProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarprecio5ProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jPanelprecio5ProcesoCrearEtiquetasProductos.setVisible(this.procesocrearetiquetasproductosConstantesFunciones.mostrarprecio5ProcesoCrearEtiquetasProductos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoCrearEtiquetasProductos() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos!=null) {
	
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jLabelidProcesoCrearEtiquetasProductos.setEnabled(this.procesocrearetiquetasproductosConstantesFunciones.activaridProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_bodegaProcesoCrearEtiquetasProductos.setEnabled(this.procesocrearetiquetasproductosConstantesFunciones.activarid_bodegaProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_productoProcesoCrearEtiquetasProductos.setEnabled(this.procesocrearetiquetasproductosConstantesFunciones.activarid_productoProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_empresaProcesoCrearEtiquetasProductos.setEnabled(this.procesocrearetiquetasproductosConstantesFunciones.activarid_empresaProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_sucursalProcesoCrearEtiquetasProductos.setEnabled(this.procesocrearetiquetasproductosConstantesFunciones.activarid_sucursalProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_lineaProcesoCrearEtiquetasProductos.setEnabled(this.procesocrearetiquetasproductosConstantesFunciones.activarid_lineaProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_grupoProcesoCrearEtiquetasProductos.setEnabled(this.procesocrearetiquetasproductosConstantesFunciones.activarid_linea_grupoProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_categoriaProcesoCrearEtiquetasProductos.setEnabled(this.procesocrearetiquetasproductosConstantesFunciones.activarid_linea_categoriaProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jComboBoxid_linea_marcaProcesoCrearEtiquetasProductos.setEnabled(this.procesocrearetiquetasproductosConstantesFunciones.activarid_linea_marcaProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldcodigoProcesoCrearEtiquetasProductos.setEnabled(this.procesocrearetiquetasproductosConstantesFunciones.activarcodigoProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextAreanombreProcesoCrearEtiquetasProductos.setEnabled(this.procesocrearetiquetasproductosConstantesFunciones.activarnombreProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio1ProcesoCrearEtiquetasProductos.setEnabled(this.procesocrearetiquetasproductosConstantesFunciones.activarprecio1ProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio2ProcesoCrearEtiquetasProductos.setEnabled(this.procesocrearetiquetasproductosConstantesFunciones.activarprecio2ProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio3ProcesoCrearEtiquetasProductos.setEnabled(this.procesocrearetiquetasproductosConstantesFunciones.activarprecio3ProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio4ProcesoCrearEtiquetasProductos.setEnabled(this.procesocrearetiquetasproductosConstantesFunciones.activarprecio4ProcesoCrearEtiquetasProductos);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasProductos.jTextFieldprecio5ProcesoCrearEtiquetasProductos.setEnabled(this.procesocrearetiquetasproductosConstantesFunciones.activarprecio5ProcesoCrearEtiquetasProductos);
		}
	}
	
		
}