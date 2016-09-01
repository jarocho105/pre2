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

//import com.bydan.erp.inventario.util.DemandaProductosConstantesFunciones;
import com.bydan.erp.inventario.util.report.DemandaProductosParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.DemandaProductosParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.DemandaProductosBean;
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
public class DemandaProductosBeanSwingJInternalFrame extends DemandaProductosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DemandaProductosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DemandaProductos> demandaproductosValidator = new ClassValidator<DemandaProductos>(DemandaProductos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DemandaProductos demandaproductos;	
	public DemandaProductos demandaproductosAux;
	public DemandaProductos demandaproductosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DemandaProductos demandaproductosTotales;
	public Long idDemandaProductosActual;
	public Long iIdNuevoDemandaProductos=0L;
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
	
	public Boolean isPermisoTodoDemandaProductos;
	public Boolean isPermisoNuevoDemandaProductos;
	public Boolean isPermisoActualizarDemandaProductos;
	public Boolean isPermisoActualizarOriginalDemandaProductos;
	public Boolean isPermisoEliminarDemandaProductos;
	public Boolean isPermisoGuardarCambiosDemandaProductos;
	public Boolean isPermisoConsultaDemandaProductos;
	public Boolean isPermisoBusquedaDemandaProductos;
	public Boolean isPermisoReporteDemandaProductos;
	public Boolean isPermisoPaginacionMedioDemandaProductos;
	public Boolean isPermisoPaginacionAltoDemandaProductos;
	public Boolean isPermisoPaginacionTodoDemandaProductos;
	public Boolean isPermisoCopiarDemandaProductos;
	public Boolean isPermisoVerFormDemandaProductos;
	public Boolean isPermisoDuplicarDemandaProductos;
	public Boolean isPermisoOrdenDemandaProductos;
	
	
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
	
	public DemandaProductosParameterReturnGeneral demandaproductosReturnGeneral;
	public DemandaProductosParameterReturnGeneral demandaproductosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDemandaProductos=false;
	public Boolean esParaAccionDesdeFormularioDemandaProductos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DemandaProductosSessionBeanAdditional demandaproductosSessionBeanAdditional=null;
	
	public DemandaProductosSessionBeanAdditional getDemandaProductosSessionBeanAdditional() {
		return this.demandaproductosSessionBeanAdditional;
	}
	
	public void setDemandaProductosSessionBeanAdditional(DemandaProductosSessionBeanAdditional demandaproductosSessionBeanAdditional) {
		try {
			this.demandaproductosSessionBeanAdditional=demandaproductosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DemandaProductosBeanSwingJInternalFrameAdditional demandaproductosBeanSwingJInternalFrameAdditional=null;
	//public class DemandaProductosBeanSwingJInternalFrame
	
	public DemandaProductosBeanSwingJInternalFrameAdditional getDemandaProductosBeanSwingJInternalFrameAdditional() {
		return this.demandaproductosBeanSwingJInternalFrameAdditional;
	}
	
	public void setDemandaProductosBeanSwingJInternalFrameAdditional(DemandaProductosBeanSwingJInternalFrameAdditional demandaproductosBeanSwingJInternalFrameAdditional) {
		try {
			this.demandaproductosBeanSwingJInternalFrameAdditional=demandaproductosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DemandaProductosLogic demandaproductosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DemandaProductos demandaproductosBean;
	public DemandaProductosConstantesFunciones demandaproductosConstantesFunciones;
	//public DemandaProductosParameterReturnGeneral demandaproductosReturnGeneral;
	
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
	
	
	//public List<DemandaProductos> demandaproductoss;	
	//public List<DemandaProductos> demandaproductossEliminados;
	//public List<DemandaProductos> demandaproductossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDemandaProductos=false;
	public Boolean isVisibilidadCeldaDuplicarDemandaProductos=true;
	public Boolean isVisibilidadCeldaCopiarDemandaProductos=true;
	public Boolean isVisibilidadCeldaVerFormDemandaProductos=true;
	public Boolean isVisibilidadCeldaOrdenDemandaProductos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDemandaProductos=false;
	public Boolean isVisibilidadCeldaModificarDemandaProductos=false;
	public Boolean isVisibilidadCeldaActualizarDemandaProductos=false;
	public Boolean isVisibilidadCeldaEliminarDemandaProductos=false;
	public Boolean isVisibilidadCeldaCancelarDemandaProductos=false;
	public Boolean isVisibilidadCeldaGuardarDemandaProductos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDemandaProductos=false;	
	
	
	public Boolean isVisibilidadBusquedaDemandaProductos=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoDemandaProductos() {
		return this.iIdNuevoDemandaProductos;
	}

	public void setiIdNuevoDemandaProductos(Long iIdNuevoDemandaProductos) {
		this.iIdNuevoDemandaProductos = iIdNuevoDemandaProductos;
	}
	
	public Long getidDemandaProductosActual() {
		return this.idDemandaProductosActual;
	}

	public void setidDemandaProductosActual(Long idDemandaProductosActual) {
		this.idDemandaProductosActual = idDemandaProductosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DemandaProductos getdemandaproductos() {
		return this.demandaproductos;
	}

	public void setdemandaproductos(DemandaProductos demandaproductos) {
		this.demandaproductos = demandaproductos;
	}
	
	public DemandaProductos getdemandaproductosAux() {
		return this.demandaproductosAux;
	}

	public void setdemandaproductosAux(DemandaProductos demandaproductosAux) {
		this.demandaproductosAux = demandaproductosAux;
	}				
	
	public DemandaProductos getdemandaproductosAnterior() {
		return this.demandaproductosAnterior;
	}

	public void setdemandaproductosAnterior(DemandaProductos demandaproductosAnterior) {
		this.demandaproductosAnterior = demandaproductosAnterior;
	}	
	
	public DemandaProductos getdemandaproductosTotales() {
		return this.demandaproductosTotales;
	}

	public void setdemandaproductosTotales(DemandaProductos demandaproductosTotales) {
		this.demandaproductosTotales = demandaproductosTotales;
	}	
	
	public DemandaProductos getdemandaproductosBean() {
		return this.demandaproductosBean;
	}

	public void setdemandaproductosBean(DemandaProductos demandaproductosBean) {
		this.demandaproductosBean = demandaproductosBean;
	}	
	
	public DemandaProductosParameterReturnGeneral getdemandaproductosReturnGeneral() {
		return this.demandaproductosReturnGeneral;
	}

	public void setdemandaproductosReturnGeneral(DemandaProductosParameterReturnGeneral demandaproductosReturnGeneral) {
		this.demandaproductosReturnGeneral = demandaproductosReturnGeneral;
	}	
	
	
	public Long id_bodegaBusquedaDemandaProductos=-1L;

	public Long getid_bodegaBusquedaDemandaProductos() {
		return this.id_bodegaBusquedaDemandaProductos;
	}

	public void setid_bodegaBusquedaDemandaProductos(Long id_bodegaBusquedaDemandaProductos) {
		this.id_bodegaBusquedaDemandaProductos = id_bodegaBusquedaDemandaProductos;
	}

;
	public Long id_productoBusquedaDemandaProductos=-1L;

	public Long getid_productoBusquedaDemandaProductos() {
		return this.id_productoBusquedaDemandaProductos;
	}

	public void setid_productoBusquedaDemandaProductos(Long id_productoBusquedaDemandaProductos) {
		this.id_productoBusquedaDemandaProductos = id_productoBusquedaDemandaProductos;
	}

;
	public Long id_lineaBusquedaDemandaProductos=-1L;

	public Long getid_lineaBusquedaDemandaProductos() {
		return this.id_lineaBusquedaDemandaProductos;
	}

	public void setid_lineaBusquedaDemandaProductos(Long id_lineaBusquedaDemandaProductos) {
		this.id_lineaBusquedaDemandaProductos = id_lineaBusquedaDemandaProductos;
	}

;
	public Long id_linea_grupoBusquedaDemandaProductos=-1L;

	public Long getid_linea_grupoBusquedaDemandaProductos() {
		return this.id_linea_grupoBusquedaDemandaProductos;
	}

	public void setid_linea_grupoBusquedaDemandaProductos(Long id_linea_grupoBusquedaDemandaProductos) {
		this.id_linea_grupoBusquedaDemandaProductos = id_linea_grupoBusquedaDemandaProductos;
	}

;
	public Long id_linea_categoriaBusquedaDemandaProductos=-1L;

	public Long getid_linea_categoriaBusquedaDemandaProductos() {
		return this.id_linea_categoriaBusquedaDemandaProductos;
	}

	public void setid_linea_categoriaBusquedaDemandaProductos(Long id_linea_categoriaBusquedaDemandaProductos) {
		this.id_linea_categoriaBusquedaDemandaProductos = id_linea_categoriaBusquedaDemandaProductos;
	}

;
	public Long id_linea_marcaBusquedaDemandaProductos=-1L;

	public Long getid_linea_marcaBusquedaDemandaProductos() {
		return this.id_linea_marcaBusquedaDemandaProductos;
	}

	public void setid_linea_marcaBusquedaDemandaProductos(Long id_linea_marcaBusquedaDemandaProductos) {
		this.id_linea_marcaBusquedaDemandaProductos = id_linea_marcaBusquedaDemandaProductos;
	}

;
	public Date fecha_ultima_venta_hastaBusquedaDemandaProductos=new Date();

	public Date getfecha_ultima_venta_hastaBusquedaDemandaProductos() {
		return this.fecha_ultima_venta_hastaBusquedaDemandaProductos;
	}

	public void setfecha_ultima_venta_hastaBusquedaDemandaProductos(Date fecha_ultima_venta_hastaBusquedaDemandaProductos) {
		this.fecha_ultima_venta_hastaBusquedaDemandaProductos = fecha_ultima_venta_hastaBusquedaDemandaProductos;
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
	
	
	public DemandaProductosLogic getDemandaProductosLogic()	{		
		return demandaproductosLogic;
	}

	public void setDemandaProductosLogic(DemandaProductosLogic demandaproductosLogic) {
		this.demandaproductosLogic = demandaproductosLogic;
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
	
	public Boolean getIsEsNuevoDemandaProductos() {
		return isEsNuevoDemandaProductos;
	}

	public void setIsEsNuevoDemandaProductos(Boolean isEsNuevoDemandaProductos) {
		this.isEsNuevoDemandaProductos = isEsNuevoDemandaProductos;
	}

	public Boolean getEsParaAccionDesdeFormularioDemandaProductos() {
		return esParaAccionDesdeFormularioDemandaProductos;
	}
	
	public void setEsParaAccionDesdeFormularioDemandaProductos(Boolean esParaAccionDesdeFormularioDemandaProductos) {
		this.esParaAccionDesdeFormularioDemandaProductos = esParaAccionDesdeFormularioDemandaProductos;
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

			if(this.demandaproductosSessionBean==null) {
				this.demandaproductosSessionBean=new DemandaProductosSessionBean();
			}

			if(!this.demandaproductosSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(demandaproductosSessionBean.getlidBodegaActual());
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

			if(this.demandaproductosSessionBean==null) {
				this.demandaproductosSessionBean=new DemandaProductosSessionBean();
			}

			if(!this.demandaproductosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(demandaproductosSessionBean.getlidProductoActual());
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

			if(this.demandaproductosSessionBean==null) {
				this.demandaproductosSessionBean=new DemandaProductosSessionBean();
			}

			if(!this.demandaproductosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(demandaproductosSessionBean.getlidEmpresaActual());
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

			if(this.demandaproductosSessionBean==null) {
				this.demandaproductosSessionBean=new DemandaProductosSessionBean();
			}

			if(!this.demandaproductosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(demandaproductosSessionBean.getlidSucursalActual());
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

			if(this.demandaproductosSessionBean==null) {
				this.demandaproductosSessionBean=new DemandaProductosSessionBean();
			}

			if(!this.demandaproductosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(demandaproductosSessionBean.getlidLineaActual());
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

			if(this.demandaproductosSessionBean==null) {
				this.demandaproductosSessionBean=new DemandaProductosSessionBean();
			}

			if(!this.demandaproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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
					lineaLogic.getEntityWithConnection(demandaproductosSessionBean.getlidLineaGrupoActual());
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

			if(this.demandaproductosSessionBean==null) {
				this.demandaproductosSessionBean=new DemandaProductosSessionBean();
			}

			if(!this.demandaproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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
					lineaLogic.getEntityWithConnection(demandaproductosSessionBean.getlidLineaCategoriaActual());
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

			if(this.demandaproductosSessionBean==null) {
				this.demandaproductosSessionBean=new DemandaProductosSessionBean();
			}

			if(!this.demandaproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
					lineaLogic.getEntityWithConnection(demandaproductosSessionBean.getlidLineaMarcaActual());
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

					if(this.demandaproductos!=null) {
						this.demandaproductos.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
						this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_bodegaDemandaProductos.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaDemandaProductos.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
						if(this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_bodegaDemandaProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_bodegaDemandaProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDemandaProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaBusquedaDemandaProductosDemandaProductos!=null) {
						jComboBoxid_bodegaBusquedaDemandaProductosDemandaProductos.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaBusquedaDemandaProductosDemandaProductos!=null) {
							//jComboBoxid_bodegaBusquedaDemandaProductosDemandaProductos.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaBusquedaDemandaProductosDemandaProductos.getItemCount()>0) {
								jComboBoxid_bodegaBusquedaDemandaProductosDemandaProductos.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaDemandaProductosGenerico)throws Exception
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
				jComboBoxid_bodegaDemandaProductosGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaDemandaProductosGenerico!=null && jComboBoxid_bodegaDemandaProductosGenerico.getItemCount()>0) {
					jComboBoxid_bodegaDemandaProductosGenerico.setSelectedIndex(0);
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

					if(this.demandaproductos!=null) {
						this.demandaproductos.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
						this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_productoDemandaProductos.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoDemandaProductos.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
						if(this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_productoDemandaProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_productoDemandaProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDemandaProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaDemandaProductosDemandaProductos!=null) {
						jComboBoxid_productoBusquedaDemandaProductosDemandaProductos.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaDemandaProductosDemandaProductos!=null) {
							//jComboBoxid_productoBusquedaDemandaProductosDemandaProductos.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaDemandaProductosDemandaProductos.getItemCount()>0) {
								jComboBoxid_productoBusquedaDemandaProductosDemandaProductos.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoDemandaProductosGenerico)throws Exception
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
				jComboBoxid_productoDemandaProductosGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoDemandaProductosGenerico!=null && jComboBoxid_productoDemandaProductosGenerico.getItemCount()>0) {
					jComboBoxid_productoDemandaProductosGenerico.setSelectedIndex(0);
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

					if(this.demandaproductos!=null) {
						this.demandaproductos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
						this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_empresaDemandaProductos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDemandaProductos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
						if(this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_empresaDemandaProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_empresaDemandaProductos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDemandaProductosGenerico)throws Exception
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
				jComboBoxid_empresaDemandaProductosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDemandaProductosGenerico!=null && jComboBoxid_empresaDemandaProductosGenerico.getItemCount()>0) {
					jComboBoxid_empresaDemandaProductosGenerico.setSelectedIndex(0);
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

					if(this.demandaproductos!=null) {
						this.demandaproductos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
						this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_sucursalDemandaProductos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDemandaProductos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
						if(this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_sucursalDemandaProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_sucursalDemandaProductos.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDemandaProductosGenerico)throws Exception
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
				jComboBoxid_sucursalDemandaProductosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDemandaProductosGenerico!=null && jComboBoxid_sucursalDemandaProductosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDemandaProductosGenerico.setSelectedIndex(0);
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

					if(this.demandaproductos!=null) {
						this.demandaproductos.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
						this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_lineaDemandaProductos.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaDemandaProductos.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
						if(this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_lineaDemandaProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_lineaDemandaProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDemandaProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaDemandaProductosDemandaProductos!=null) {
						jComboBoxid_lineaBusquedaDemandaProductosDemandaProductos.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaDemandaProductosDemandaProductos!=null) {
							//jComboBoxid_lineaBusquedaDemandaProductosDemandaProductos.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaDemandaProductosDemandaProductos.getItemCount()>0) {
								jComboBoxid_lineaBusquedaDemandaProductosDemandaProductos.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaDemandaProductosGenerico)throws Exception
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
				jComboBoxid_lineaDemandaProductosGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaDemandaProductosGenerico!=null && jComboBoxid_lineaDemandaProductosGenerico.getItemCount()>0) {
					jComboBoxid_lineaDemandaProductosGenerico.setSelectedIndex(0);
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

					if(this.demandaproductos!=null) {
						this.demandaproductos.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
						this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_grupoDemandaProductos.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoDemandaProductos.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
						if(this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_grupoDemandaProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_grupoDemandaProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDemandaProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaDemandaProductosDemandaProductos!=null) {
						jComboBoxid_linea_grupoBusquedaDemandaProductosDemandaProductos.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaDemandaProductosDemandaProductos!=null) {
							//jComboBoxid_linea_grupoBusquedaDemandaProductosDemandaProductos.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaDemandaProductosDemandaProductos.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaDemandaProductosDemandaProductos.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoDemandaProductosGenerico)throws Exception
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
				jComboBoxid_linea_grupoDemandaProductosGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoDemandaProductosGenerico!=null && jComboBoxid_linea_grupoDemandaProductosGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoDemandaProductosGenerico.setSelectedIndex(0);
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

					if(this.demandaproductos!=null) {
						this.demandaproductos.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
						this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_categoriaDemandaProductos.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaDemandaProductos.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
						if(this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_categoriaDemandaProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_categoriaDemandaProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDemandaProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaDemandaProductosDemandaProductos!=null) {
						jComboBoxid_linea_categoriaBusquedaDemandaProductosDemandaProductos.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaDemandaProductosDemandaProductos!=null) {
							//jComboBoxid_linea_categoriaBusquedaDemandaProductosDemandaProductos.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaDemandaProductosDemandaProductos.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaDemandaProductosDemandaProductos.setSelectedIndex(0);
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
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaDemandaProductosGenerico)throws Exception
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
				jComboBoxid_linea_categoriaDemandaProductosGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaDemandaProductosGenerico!=null && jComboBoxid_linea_categoriaDemandaProductosGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaDemandaProductosGenerico.setSelectedIndex(0);
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

					if(this.demandaproductos!=null) {
						this.demandaproductos.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
						this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_marcaDemandaProductos.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaDemandaProductos.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
						if(this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_marcaDemandaProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_marcaDemandaProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDemandaProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaDemandaProductosDemandaProductos!=null) {
						jComboBoxid_linea_marcaBusquedaDemandaProductosDemandaProductos.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaDemandaProductosDemandaProductos!=null) {
							//jComboBoxid_linea_marcaBusquedaDemandaProductosDemandaProductos.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaDemandaProductosDemandaProductos.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaDemandaProductosDemandaProductos.setSelectedIndex(0);
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
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaDemandaProductosGenerico)throws Exception
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
				jComboBoxid_linea_marcaDemandaProductosGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaDemandaProductosGenerico!=null && jComboBoxid_linea_marcaDemandaProductosGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaDemandaProductosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(DemandaProductos demandaproductos,JComboBox jComboBoxid_bodegaDemandaProductosGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaDemandaProductosGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_bodegaDemandaProductos.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaDemandaProductosGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				demandaproductos.setid_bodega(bodegaAux.getId());
				demandaproductos.setbodega_descripcion(DemandaProductosConstantesFunciones.getBodegaDescripcion(bodegaAux));
				demandaproductos.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(DemandaProductos demandaproductos,JComboBox jComboBoxid_productoDemandaProductosGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoDemandaProductosGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_productoDemandaProductos.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoDemandaProductosGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				demandaproductos.setid_producto(productoAux.getId());
				demandaproductos.setproducto_descripcion(DemandaProductosConstantesFunciones.getProductoDescripcion(productoAux));
				demandaproductos.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DemandaProductos demandaproductos,JComboBox jComboBoxid_empresaDemandaProductosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDemandaProductosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_empresaDemandaProductos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDemandaProductosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				demandaproductos.setid_empresa(empresaAux.getId());
				demandaproductos.setempresa_descripcion(DemandaProductosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				demandaproductos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DemandaProductos demandaproductos,JComboBox jComboBoxid_sucursalDemandaProductosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDemandaProductosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_sucursalDemandaProductos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDemandaProductosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				demandaproductos.setid_sucursal(sucursalAux.getId());
				demandaproductos.setsucursal_descripcion(DemandaProductosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				demandaproductos.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(DemandaProductos demandaproductos,JComboBox jComboBoxid_lineaDemandaProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaDemandaProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_lineaDemandaProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaDemandaProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				demandaproductos.setid_linea(lineaAux.getId());
				demandaproductos.setlinea_descripcion(DemandaProductosConstantesFunciones.getLineaDescripcion(lineaAux));
				demandaproductos.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(DemandaProductos demandaproductos,JComboBox jComboBoxid_linea_grupoDemandaProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoDemandaProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_grupoDemandaProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoDemandaProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				demandaproductos.setid_linea_grupo(lineaAux.getId());
				demandaproductos.setlineagrupo_descripcion(DemandaProductosConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				demandaproductos.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(DemandaProductos demandaproductos,JComboBox jComboBoxid_linea_categoriaDemandaProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaDemandaProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_categoriaDemandaProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaDemandaProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				demandaproductos.setid_linea_categoria(lineaAux.getId());
				demandaproductos.setlineacategoria_descripcion(DemandaProductosConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				demandaproductos.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(DemandaProductos demandaproductos,JComboBox jComboBoxid_linea_marcaDemandaProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaDemandaProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_marcaDemandaProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaDemandaProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				demandaproductos.setid_linea_marca(lineaAux.getId());
				demandaproductos.setlineamarca_descripcion(DemandaProductosConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				demandaproductos.setLineaMarca(lineaAux);			}
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

					if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) { 
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_bodegaDemandaProductos.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_bodegaDemandaProductos.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDemandaProductos!=null) { 
					}

					if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDemandaProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaBusquedaDemandaProductosDemandaProductos.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaBusquedaDemandaProductosDemandaProductos.addItem(bodega);
							}
						}

						if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) { 
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_productoDemandaProductos.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_productoDemandaProductos.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDemandaProductos!=null) { 
					}

					if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDemandaProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaDemandaProductosDemandaProductos.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaDemandaProductosDemandaProductos.addItem(producto);
							}
						}

						if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) { 
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_empresaDemandaProductos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_empresaDemandaProductos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDemandaProductos!=null) { 
					}

					if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) { 
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_sucursalDemandaProductos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_sucursalDemandaProductos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDemandaProductos!=null) { 
					}

					if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) { 
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_lineaDemandaProductos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_lineaDemandaProductos.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDemandaProductos!=null) { 
					}

					if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDemandaProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaDemandaProductosDemandaProductos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaDemandaProductosDemandaProductos.addItem(linea);
							}
						}

						if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) { 
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_grupoDemandaProductos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_grupoDemandaProductos.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDemandaProductos!=null) { 
					}

					if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDemandaProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaDemandaProductosDemandaProductos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaDemandaProductosDemandaProductos.addItem(lineagrupo);
							}
						}

						if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) { 
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_categoriaDemandaProductos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_categoriaDemandaProductos.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDemandaProductos!=null) { 
					}

					if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDemandaProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaDemandaProductosDemandaProductos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaDemandaProductosDemandaProductos.addItem(lineacategoria);
							}
						}

						if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) { 
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_marcaDemandaProductos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_marcaDemandaProductos.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDemandaProductos!=null) { 
					}

					if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDemandaProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaDemandaProductosDemandaProductos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaDemandaProductosDemandaProductos.addItem(lineamarca);
							}
						}

						if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_bodegaDemandaProductos.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_bodegaDemandaProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaBusquedaDemandaProductosDemandaProductos.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaBusquedaDemandaProductosDemandaProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_productoDemandaProductos.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_productoDemandaProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaDemandaProductosDemandaProductos.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaDemandaProductosDemandaProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_empresaDemandaProductos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_empresaDemandaProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_sucursalDemandaProductos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_sucursalDemandaProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_lineaDemandaProductos.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_lineaDemandaProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaDemandaProductosDemandaProductos.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaDemandaProductosDemandaProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_grupoDemandaProductos.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_grupoDemandaProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaDemandaProductosDemandaProductos.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaDemandaProductosDemandaProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_categoriaDemandaProductos.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_categoriaDemandaProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaDemandaProductosDemandaProductos.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaDemandaProductosDemandaProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_marcaDemandaProductos.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_marcaDemandaProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaDemandaProductosDemandaProductos.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaDemandaProductosDemandaProductos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDemandaProductos() throws Exception {
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
		
	public DemandaProductosParameterReturnGeneral getDemandaProductosParameterGeneral() {
		return this.demandaproductosParameterGeneral;
	}
	
	public void setDemandaProductosParameterGeneral(DemandaProductosParameterReturnGeneral demandaproductosParameterGeneral) {
		this.demandaproductosParameterGeneral = demandaproductosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDemandaProductos() {
		return isPermisoTodoDemandaProductos;
	}

	public void setIsPermisoTodoDemandaProductos(Boolean isPermisoTodoDemandaProductos) {
		this.isPermisoTodoDemandaProductos = isPermisoTodoDemandaProductos;
	}

	public Boolean getIsPermisoNuevoDemandaProductos() {
		return isPermisoNuevoDemandaProductos;
	}

	public void setIsPermisoNuevoDemandaProductos(Boolean isPermisoNuevoDemandaProductos) {
		this.isPermisoNuevoDemandaProductos = isPermisoNuevoDemandaProductos;
	}

	public Boolean getIsPermisoActualizarDemandaProductos() {
		return isPermisoActualizarDemandaProductos;
	}

	public void setIsPermisoActualizarDemandaProductos(Boolean isPermisoActualizarDemandaProductos) {
		this.isPermisoActualizarDemandaProductos = isPermisoActualizarDemandaProductos;
	}

	public Boolean getIsPermisoEliminarDemandaProductos() {
		return isPermisoEliminarDemandaProductos;
	}

	public void setIsPermisoEliminarDemandaProductos(Boolean isPermisoEliminarDemandaProductos) {
		this.isPermisoEliminarDemandaProductos = isPermisoEliminarDemandaProductos;
	}

	public Boolean getIsPermisoGuardarCambiosDemandaProductos() {
		return isPermisoGuardarCambiosDemandaProductos;
	}

	public void setIsPermisoGuardarCambiosDemandaProductos(Boolean isPermisoGuardarCambiosDemandaProductos) {
		this.isPermisoGuardarCambiosDemandaProductos = isPermisoGuardarCambiosDemandaProductos;
	}
	
	public Boolean getIsPermisoConsultaDemandaProductos() {
		return isPermisoConsultaDemandaProductos;
	}

	public void setIsPermisoConsultaDemandaProductos(Boolean isPermisoConsultaDemandaProductos) {
		this.isPermisoConsultaDemandaProductos = isPermisoConsultaDemandaProductos;
	}

	public Boolean getIsPermisoBusquedaDemandaProductos() {
		return isPermisoBusquedaDemandaProductos;
	}

	public void setIsPermisoBusquedaDemandaProductos(Boolean isPermisoBusquedaDemandaProductos) {
		this.isPermisoBusquedaDemandaProductos = isPermisoBusquedaDemandaProductos;
	}

	public Boolean getIsPermisoReporteDemandaProductos() {
		return isPermisoReporteDemandaProductos;
	}

	public void setIsPermisoReporteDemandaProductos(Boolean isPermisoReporteDemandaProductos) {
		this.isPermisoReporteDemandaProductos = isPermisoReporteDemandaProductos;
	}
	
	public Boolean getIsPermisoPaginacionMedioDemandaProductos() {
		return isPermisoPaginacionMedioDemandaProductos;
	}

	public void setIsPermisoPaginacionMedioDemandaProductos(Boolean isPermisoPaginacionMedioDemandaProductos) {
		this.isPermisoPaginacionMedioDemandaProductos = isPermisoPaginacionMedioDemandaProductos;
	}
	
	public Boolean getIsPermisoPaginacionTodoDemandaProductos() {
		return isPermisoPaginacionTodoDemandaProductos;
	}

	public void setIsPermisoPaginacionTodoDemandaProductos(Boolean isPermisoPaginacionTodoDemandaProductos) {
		this.isPermisoPaginacionTodoDemandaProductos = isPermisoPaginacionTodoDemandaProductos;
	}
	
	public Boolean getIsPermisoPaginacionAltoDemandaProductos() {
		return isPermisoPaginacionAltoDemandaProductos;
	}

	public void setIsPermisoPaginacionAltoDemandaProductos(Boolean isPermisoPaginacionAltoDemandaProductos) {
		this.isPermisoPaginacionAltoDemandaProductos = isPermisoPaginacionAltoDemandaProductos;
	}
	
	public Boolean getIsPermisoCopiarDemandaProductos() {
		return isPermisoCopiarDemandaProductos;
	}

	public void setIsPermisoCopiarDemandaProductos(Boolean isPermisoCopiarDemandaProductos) {
		this.isPermisoCopiarDemandaProductos = isPermisoCopiarDemandaProductos;
	}
	
	public Boolean getIsPermisoVerFormDemandaProductos() {
		return isPermisoVerFormDemandaProductos;
	}

	public void setIsPermisoVerFormDemandaProductos(Boolean isPermisoVerFormDemandaProductos) {
		this.isPermisoVerFormDemandaProductos = isPermisoVerFormDemandaProductos;
	}
	
	public Boolean getIsPermisoDuplicarDemandaProductos() {
		return isPermisoDuplicarDemandaProductos;
	}

	public void setIsPermisoDuplicarDemandaProductos(Boolean isPermisoDuplicarDemandaProductos) {
		this.isPermisoDuplicarDemandaProductos = isPermisoDuplicarDemandaProductos;
	}
	
	public Boolean getIsPermisoOrdenDemandaProductos() {
		return isPermisoOrdenDemandaProductos;
	}

	public void setIsPermisoOrdenDemandaProductos(Boolean isPermisoOrdenDemandaProductos) {
		this.isPermisoOrdenDemandaProductos = isPermisoOrdenDemandaProductos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDemandaProductos() {
		return isVisibilidadCeldaNuevoDemandaProductos;
	}

	public void setIsVisibilidadCeldaNuevoDemandaProductos(Boolean isVisibilidadCeldaNuevoDemandaProductos) {
		this.isVisibilidadCeldaNuevoDemandaProductos = isVisibilidadCeldaNuevoDemandaProductos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDemandaProductos() {
		return isVisibilidadCeldaDuplicarDemandaProductos;
	}

	public void setIsVisibilidadCeldaDuplicarDemandaProductos(Boolean isVisibilidadCeldaDuplicarDemandaProductos) {
		this.isVisibilidadCeldaDuplicarDemandaProductos = isVisibilidadCeldaDuplicarDemandaProductos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDemandaProductos() {
		return isVisibilidadCeldaCopiarDemandaProductos;
	}

	public void setIsVisibilidadCeldaCopiarDemandaProductos(Boolean isVisibilidadCeldaCopiarDemandaProductos) {
		this.isVisibilidadCeldaCopiarDemandaProductos = isVisibilidadCeldaCopiarDemandaProductos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDemandaProductos() {
		return isVisibilidadCeldaVerFormDemandaProductos;
	}

	public void setIsVisibilidadCeldaVerFormDemandaProductos(Boolean isVisibilidadCeldaVerFormDemandaProductos) {
		this.isVisibilidadCeldaVerFormDemandaProductos = isVisibilidadCeldaVerFormDemandaProductos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDemandaProductos() {
		return isVisibilidadCeldaOrdenDemandaProductos;
	}

	public void setIsVisibilidadCeldaOrdenDemandaProductos(Boolean isVisibilidadCeldaOrdenDemandaProductos) {
		this.isVisibilidadCeldaOrdenDemandaProductos = isVisibilidadCeldaOrdenDemandaProductos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDemandaProductos() {
		return isVisibilidadCeldaNuevoRelacionesDemandaProductos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDemandaProductos(Boolean isVisibilidadCeldaNuevoRelacionesDemandaProductos) {
		this.isVisibilidadCeldaNuevoRelacionesDemandaProductos = isVisibilidadCeldaNuevoRelacionesDemandaProductos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDemandaProductos() {
		return isVisibilidadCeldaModificarDemandaProductos;
	}

	public void setIsVisibilidadCeldaModificarDemandaProductos(Boolean isVisibilidadCeldaModificarDemandaProductos) {
		this.isVisibilidadCeldaModificarDemandaProductos = isVisibilidadCeldaModificarDemandaProductos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDemandaProductos() {
		return isVisibilidadCeldaActualizarDemandaProductos;
	}

	public void setIsVisibilidadCeldaActualizarDemandaProductos(Boolean isVisibilidadCeldaActualizarDemandaProductos) {
		this.isVisibilidadCeldaActualizarDemandaProductos = isVisibilidadCeldaActualizarDemandaProductos;
	}

	public Boolean getIsVisibilidadCeldaEliminarDemandaProductos() {
		return isVisibilidadCeldaEliminarDemandaProductos;
	}

	public void setIsVisibilidadCeldaEliminarDemandaProductos(Boolean isVisibilidadCeldaEliminarDemandaProductos) {
		this.isVisibilidadCeldaEliminarDemandaProductos = isVisibilidadCeldaEliminarDemandaProductos;
	}

	public Boolean getIsVisibilidadCeldaCancelarDemandaProductos() {
		return isVisibilidadCeldaCancelarDemandaProductos;
	}

	public void setIsVisibilidadCeldaCancelarDemandaProductos(Boolean isVisibilidadCeldaCancelarDemandaProductos) {
		this.isVisibilidadCeldaCancelarDemandaProductos = isVisibilidadCeldaCancelarDemandaProductos;
	}

	public Boolean getIsVisibilidadCeldaGuardarDemandaProductos() {
		return isVisibilidadCeldaGuardarDemandaProductos;
	}

	public void setIsVisibilidadCeldaGuardarDemandaProductos(Boolean isVisibilidadCeldaGuardarDemandaProductos) {
		this.isVisibilidadCeldaGuardarDemandaProductos = isVisibilidadCeldaGuardarDemandaProductos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDemandaProductos() {
		return isVisibilidadCeldaGuardarCambiosDemandaProductos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDemandaProductos(Boolean isVisibilidadCeldaGuardarCambiosDemandaProductos) {
		this.isVisibilidadCeldaGuardarCambiosDemandaProductos = isVisibilidadCeldaGuardarCambiosDemandaProductos;
	}
		
	public DemandaProductosSessionBean getdemandaproductosSessionBean() {
		return this.demandaproductosSessionBean;
	}
	
	public void setdemandaproductosSessionBean(DemandaProductosSessionBean demandaproductosSessionBean) {
		this.demandaproductosSessionBean=demandaproductosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaDemandaProductos() {
		return this.isVisibilidadBusquedaDemandaProductos;
	}

	public void setisVisibilidadBusquedaDemandaProductos(Boolean isVisibilidadBusquedaDemandaProductos) {
		this.isVisibilidadBusquedaDemandaProductos=isVisibilidadBusquedaDemandaProductos;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(DemandaProductos demandaproductos)throws Exception {
		try {
			
				this.setActualParaGuardarBodegaForeignKey(demandaproductos,null);
				this.setActualParaGuardarProductoForeignKey(demandaproductos,null);
				this.setActualParaGuardarEmpresaForeignKey(demandaproductos,null);
				this.setActualParaGuardarSucursalForeignKey(demandaproductos,null);
				this.setActualParaGuardarLineaForeignKey(demandaproductos,null);
				this.setActualParaGuardarLineaGrupoForeignKey(demandaproductos,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(demandaproductos,null);
				this.setActualParaGuardarLineaMarcaForeignKey(demandaproductos,null);
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
	
	public void bugActualizarReferenciaActual(DemandaProductos demandaproductos,DemandaProductos demandaproductosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDemandaProductos(demandaproductos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		demandaproductosAux.setId(demandaproductos.getId());
		demandaproductosAux.setVersionRow(demandaproductos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(DemandaProductos demandaproductosLocal) throws Exception {
		
		if(this.demandaproductosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DemandaProductos demandaproductosLocal) throws Exception {	
		if(this.demandaproductosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				demandaproductosLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				demandaproductosLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				demandaproductosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				demandaproductosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				demandaproductosLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				demandaproductosLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				demandaproductosLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				demandaproductosLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDemandaProductosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = demandaproductosValidator.getInvalidValues(this.demandaproductos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DemandaProductos demandaproductos,List<DemandaProductos> demandaproductoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(DemandaProductos demandaproductos,List<DemandaProductos> demandaproductoss) throws Exception {
		try	{			
			DemandaProductosConstantesFunciones.actualizarSelectedLista(demandaproductos,demandaproductoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DemandaProductos> demandaproductossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				demandaproductossLocal=this.demandaproductosLogic.getDemandaProductoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				demandaproductossLocal=this.demandaproductoss;
			}
			//ARCHITECTURE
		
			for(DemandaProductos demandaproductosLocal:demandaproductossLocal) {
				if(this.permiteMantenimiento(demandaproductosLocal) && demandaproductosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DemandaProductosConstantesFunciones.getDemandaProductosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DemandaProductosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabelcodigoDemandaProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DemandaProductosConstantesFunciones.NOMBREUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabelnombre_unidadDemandaProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DemandaProductosConstantesFunciones.CANTIDADDISPONIBLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabelcantidad_disponibleDemandaProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DemandaProductosConstantesFunciones.STOCKMINIMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabelstock_minimoDemandaProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DemandaProductosConstantesFunciones.CODIGOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabelcodigo_productoDemandaProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DemandaProductosConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabelnombreDemandaProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DemandaProductosConstantesFunciones.DEMTRI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabeldem_triDemandaProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DemandaProductosConstantesFunciones.DEMBI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabeldem_biDemandaProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DemandaProductosConstantesFunciones.DEMMEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabeldem_menDemandaProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DemandaProductosConstantesFunciones.INGRESOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabelingresosDemandaProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DemandaProductosConstantesFunciones.EGRESOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabelegresosDemandaProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DemandaProductosConstantesFunciones.EXISTENCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabelexistenciaDemandaProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DemandaProductosConstantesFunciones.COSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabelcostoDemandaProductos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDemandaProductos.jLabelcodigoDemandaProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDemandaProductos.jLabelnombre_unidadDemandaProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDemandaProductos.jLabelcantidad_disponibleDemandaProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDemandaProductos.jLabelstock_minimoDemandaProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDemandaProductos.jLabelcodigo_productoDemandaProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDemandaProductos.jLabelnombreDemandaProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDemandaProductos.jLabeldem_triDemandaProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDemandaProductos.jLabeldem_biDemandaProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDemandaProductos.jLabeldem_menDemandaProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDemandaProductos.jLabelingresosDemandaProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDemandaProductos.jLabelegresosDemandaProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDemandaProductos.jLabelexistenciaDemandaProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDemandaProductos.jLabelcostoDemandaProductos,"");
		
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
		this.iIdNuevoDemandaProductos--;	
		
		
		this.demandaproductosAux=new DemandaProductos();
		
		this.demandaproductosAux.setId(this.iIdNuevoDemandaProductos);
		this.demandaproductosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.demandaproductosLogic.getDemandaProductoss().add(this.demandaproductosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.demandaproductoss.add(this.demandaproductosAux);
		}
		//ARCHITECTURE
		
		this.demandaproductos=this.demandaproductosAux;
		
		if(DemandaProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDemandaProductos(this.demandaproductos);
			this.setVariablesObjetoActualToFormularioForeignKeyDemandaProductos(this.demandaproductos);
		}
				
		//this.setDefaultControlesDemandaProductos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDemandaProductos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDemandaProductos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDemandaProductos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDemandaProductos(this.demandaproductosBean,this.demandaproductos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDemandaProductos(this.demandaproductosReturnGeneral,this.demandaproductosBean,false);
		
		if(this.demandaproductosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDemandaProductos(this.demandaproductosReturnGeneral.getDemandaProductos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDemandaProductos(this.demandaproductosReturnGeneral.getDemandaProductos());
		}
		
		if(this.demandaproductosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDemandaProductos(this.demandaproductosReturnGeneral.getDemandaProductos(),classes);//this.demandaproductosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDemandaProductos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDemandaProductos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DemandaProductosBeanSwingJInternalFrameAdditional.RecargarFormDemandaProductos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDemandaProductos(false);
						
			if(demandaproductosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDemandaProductos();
			}
			
			this.actualizarVisualTableDatosDemandaProductos();
			
			this.jTableDatosDemandaProductos.setRowSelectionInterval(this.getIndiceNuevoDemandaProductos(), this.getIndiceNuevoDemandaProductos());
			
			this.seleccionarFilaTablaDemandaProductosActual();
						
			this.actualizarEstadoCeldasBotonesDemandaProductos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDemandaProductos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDemandaProductos.jDateChooserfecha_ultima_venta_hastaDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activarfecha_ultima_venta_hastaDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextAreacodigoDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activarcodigoDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFieldnombre_unidadDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activarnombre_unidadDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcantidad_disponibleDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activarcantidad_disponibleDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFieldstock_minimoDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activarstock_minimoDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcodigo_productoDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activarcodigo_productoDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextAreanombreDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activarnombreDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_triDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activardem_triDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_biDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activardem_biDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_menDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activardem_menDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFieldingresosDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activaringresosDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFieldegresosDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activaregresosDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFieldexistenciaDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activarexistenciaDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcostoDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activarcostoDemandaProductos);	
		
		this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_bodegaDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activarid_bodegaDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_productoDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activarid_productoDemandaProductos);//
		this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_empresaDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activarid_empresaDemandaProductos);//
		this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_sucursalDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activarid_sucursalDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_lineaDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activarid_lineaDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_grupoDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activarid_linea_grupoDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_categoriaDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activarid_linea_categoriaDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_marcaDemandaProductos.setEnabled(isHabilitar && this.demandaproductosConstantesFunciones.activarid_linea_marcaDemandaProductos);
	};
	
	public void setDefaultControlesDemandaProductos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDemandaProductos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.demandaproductosSessionBean.setConGuardarRelaciones(true);			
			this.demandaproductosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDemandaProductos.jTabbedPaneRelacionesDemandaProductos.setVisible(true);
			
					
		} else {
			//this.demandaproductosSessionBean.setConGuardarRelaciones(false);			
			this.demandaproductosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDemandaProductos.jTabbedPaneRelacionesDemandaProductos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDemandaProductos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DemandaProductos demandaproductosAux:this.demandaproductosLogic.getDemandaProductoss()) {
				if(demandaproductosAux.getId().equals(this.iIdNuevoDemandaProductos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DemandaProductos demandaproductosAux:this.demandaproductoss) {
				if(demandaproductosAux.getId().equals(this.iIdNuevoDemandaProductos)) {
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
	
	public int getIndiceActualDemandaProductos(DemandaProductos demandaproductos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DemandaProductos demandaproductosAux:this.demandaproductosLogic.getDemandaProductoss()) {
				if(demandaproductosAux.getId().equals(demandaproductos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DemandaProductos demandaproductosAux:this.demandaproductoss) {
				if(demandaproductosAux.getId().equals(demandaproductos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDemandaProductos(DemandaProductos demandaproductosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DemandaProductos demandaproductosAux:this.demandaproductosLogic.getDemandaProductoss()) {
				if(demandaproductosAux.getDemandaProductosOriginal().getId().equals(demandaproductosOriginal.getId())) {
					existe=true;
					demandaproductosOriginal.setId(demandaproductosAux.getId());
					demandaproductosOriginal.setVersionRow(demandaproductosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DemandaProductos demandaproductosAux:this.demandaproductoss) {
				if(demandaproductosAux.getDemandaProductosOriginal().getId().equals(demandaproductosOriginal.getId())) {
					existe=true;
					demandaproductosOriginal.setId(demandaproductosAux.getId());
					demandaproductosOriginal.setVersionRow(demandaproductosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDemandaProductos(Boolean esParaCancelar) throws Exception {
		demandaproductossAux=new ArrayList<DemandaProductos>();
		demandaproductosAux=new DemandaProductos();
		
		if(!this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DemandaProductos demandaproductosAux:this.demandaproductosLogic.getDemandaProductoss()) {
					if(demandaproductosAux.getId()<0) {
						demandaproductossAux.add(demandaproductosAux);
					}		
				}
				this.iIdNuevoDemandaProductos=0L;
				this.demandaproductosLogic.getDemandaProductoss().removeAll(demandaproductossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DemandaProductos demandaproductosAux:this.demandaproductoss) {
					if(demandaproductosAux.getId()<0) {
						demandaproductossAux.add(demandaproductosAux);
					}		
				}
				this.iIdNuevoDemandaProductos=0L;
				this.demandaproductoss.removeAll(demandaproductossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDemandaProductos 
					&& this.demandaproductosLogic.getDemandaProductoss().size()>0
					) {
					demandaproductosAux=this.demandaproductosLogic.getDemandaProductoss().get(this.demandaproductosLogic.getDemandaProductoss().size() - 1);
				
					if(demandaproductosAux.getId()<0) {
						this.demandaproductosLogic.getDemandaProductoss().remove(demandaproductosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDemandaProductos && this.demandaproductoss.size()>0) {
					demandaproductosAux=this.demandaproductoss.get(this.demandaproductoss.size() - 1);
				
					if(demandaproductosAux.getId()<0) {
						this.demandaproductoss.remove(demandaproductosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDemandaProductos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(demandaproductos.getId()<0) {
				this.demandaproductosLogic.getDemandaProductoss().remove(this.demandaproductos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(demandaproductos.getId()<0) {
				this.demandaproductoss.remove(this.demandaproductos);
			}
		}			
	}
	
	public void setEstadosInicialesDemandaProductos(List<DemandaProductos> demandaproductossAux) throws Exception {
		DemandaProductosConstantesFunciones.setEstadosInicialesDemandaProductos(demandaproductossAux);
	}
	
	public void setEstadosInicialesDemandaProductos(DemandaProductos demandaproductosAux) throws Exception {
		DemandaProductosConstantesFunciones.setEstadosInicialesDemandaProductos(demandaproductosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDemandaProductosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDemandaProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDemandaProductosActual()) {
				if(!this.isEsNuevoDemandaProductos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDemandaProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDemandaProductos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDemandaProductosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Demanda Productos ?", "MANTENIMIENTO DE Demanda Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDemandaProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DemandaProductos demandaproductos) throws Exception {
		DemandaProductosConstantesFunciones.seleccionarAsignar(this.demandaproductos,demandaproductos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDemandaProductos=this.isPermisoActualizarOriginalDemandaProductos;
			
			
			this.seleccionarAsignar(demandaproductos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesDemandaProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.demandaproductosSessionBean.setsFuncionBusquedaRapida(this.demandaproductosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDemandaProductos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDemandaProductos(esParaCancelar);				
				this.cancelarNuevoDemandaProductos(esParaCancelar);								
			}
			
			this.demandaproductos=new DemandaProductos();
			
			this.inicializarDemandaProductos();
			
			this.actualizarEstadoCeldasBotonesDemandaProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDemandaProductos() throws Exception {
		try {
			DemandaProductosConstantesFunciones.inicializarDemandaProductos(this.demandaproductos);
			
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
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.demandaproductosLogic.getDemandaProductoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDemandaProductoss(String sAccionBusqueda,List<DemandaProductos> demandaproductossParaReportes) throws Exception {
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
					sPathReporteFinal="DemandaProductos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DemandaProductosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DemandaProductosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DemandaProductos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Demanda Productoses");		
		parameters.put("busquedapor", DemandaProductosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDemandaProductos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DemandaProductosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DemandaProductosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDemandaProductos=new JRBeanArrayDataSource(DemandaProductosJInternalFrame.TraerDemandaProductosBeans(demandaproductossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDemandaProductos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DemandaProductosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DemandaProductosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DemandaProductosBean.TraerDemandaProductosBeans(demandaproductossParaReportes).toArray()));
							
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
				this.generarExcelReporteDemandaProductoss(sAccionBusqueda,sTipoArchivoReporte,demandaproductossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDemandaProductoss(sAccionBusqueda,sTipoArchivoReporte,demandaproductossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDemandaProductosActionPerformed(null);
					//this.generarExcelReporteDemandaProductoss(sAccionBusqueda,sTipoArchivoReporte,demandaproductossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDemandaProductoss(sAccionBusqueda,sTipoArchivoReporte,demandaproductossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDemandaProductoss(sAccionBusqueda,sTipoArchivoReporte,demandaproductossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDemandaProductoss(sAccionBusqueda,sTipoArchivoReporte,demandaproductossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDemandaProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<DemandaProductos> demandaproductossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"demandaproductos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DemandaProductoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDemandaProductos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DemandaProductos demandaproductos : demandaproductossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DemandaProductosConstantesFunciones.generarExcelReporteDataDemandaProductos("NORMAL",row,workbook,demandaproductos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.demandaproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Demanda Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDemandaProductos(String sTipo,Row row,Workbook workbook) {
		
		DemandaProductosConstantesFunciones.generarExcelReporteHeaderDemandaProductos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDemandaProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<DemandaProductos> demandaproductossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"demandaproductos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DemandaProductoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DemandaProductos demandaproductos : demandaproductossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DemandaProductosConstantesFunciones.getDemandaProductosDescripcion(demandaproductos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getfecha_ultima_venta_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_NOMBREUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_NOMBREUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getnombre_unidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getcantidad_disponible());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_STOCKMINIMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_STOCKMINIMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getstock_minimo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getcodigo_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_DEMTRI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_DEMTRI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getdem_tri());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_DEMBI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_DEMBI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getdem_bi());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_DEMMEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_DEMMEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getdem_men());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_INGRESOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_INGRESOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getingresos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_EGRESOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_EGRESOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getegresos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_EXISTENCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_EXISTENCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getexistencia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DemandaProductosConstantesFunciones.LABEL_COSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_COSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(demandaproductos.getcosto());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.demandaproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Demanda Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDemandaProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<DemandaProductos> demandaproductossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DemandaProductos> demandaproductossRespaldo=null;
		
		classes=DemandaProductosConstantesFunciones.getClassesRelationshipsOfDemandaProductos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.demandaproductosLogic.setDatosCliente(this.datosCliente);
		this.demandaproductosLogic.setDatosDeep(this.datosDeep);
		this.demandaproductosLogic.setIsConDeep(true);
		
		demandaproductossRespaldo=this.demandaproductosLogic.getDemandaProductoss();
		
		this.demandaproductosLogic.setDemandaProductoss(demandaproductossParaReportes);	
		this.demandaproductosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		demandaproductossParaReportes=this.demandaproductosLogic.getDemandaProductoss();
		this.demandaproductosLogic.setDemandaProductoss(demandaproductossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"demandaproductos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DemandaProductoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDemandaProductos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DemandaProductos demandaproductos : demandaproductossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDemandaProductos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DemandaProductosConstantesFunciones.generarExcelReporteDataDemandaProductos("NORMAL",row,workbook,demandaproductos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DemandaProductosConstantesFunciones.getDemandaProductosDescripcion(demandaproductos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.demandaproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Demanda Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDemandaProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDemandaProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDemandaProductos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDemandaProductos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDemandaProductos() throws Exception {		
		this.startProcessDemandaProductos(true);
	}
	
	public void startProcessDemandaProductos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDemandaProductos ,this.jPanelParametrosReportesDemandaProductos, this.jScrollPanelDatosDemandaProductos,this.jPanelPaginacionDemandaProductos, this.jScrollPanelDatosEdicionDemandaProductos, this.jPanelAccionesDemandaProductos,this.jPanelAccionesFormularioDemandaProductos,this.jmenuBarDemandaProductos,this.jmenuBarDetalleDemandaProductos,this.jTtoolBarDemandaProductos,this.jTtoolBarDetalleDemandaProductos);		
		
		final JTabbedPane jTabbedPaneBusquedasDemandaProductos=this.jTabbedPaneBusquedasDemandaProductos; 
		
		final JPanel jPanelParametrosReportesDemandaProductos=this.jPanelParametrosReportesDemandaProductos;
		//final JScrollPane jScrollPanelDatosDemandaProductos=this.jScrollPanelDatosDemandaProductos;
		final JTable jTableDatosDemandaProductos=this.jTableDatosDemandaProductos;		
		final JPanel jPanelPaginacionDemandaProductos=this.jPanelPaginacionDemandaProductos;
		//final JScrollPane jScrollPanelDatosEdicionDemandaProductos=this.jScrollPanelDatosEdicionDemandaProductos;
		final JPanel jPanelAccionesDemandaProductos=this.jPanelAccionesDemandaProductos;
		
		JPanel jPanelCamposAuxiliarDemandaProductos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDemandaProductos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
			jPanelCamposAuxiliarDemandaProductos=this.jInternalFrameDetalleFormDemandaProductos.jPanelCamposDemandaProductos;
			jPanelAccionesFormularioAuxiliarDemandaProductos=this.jInternalFrameDetalleFormDemandaProductos.jPanelAccionesFormularioDemandaProductos;
		}
		
		final JPanel jPanelCamposDemandaProductos=jPanelCamposAuxiliarDemandaProductos;
		final JPanel jPanelAccionesFormularioDemandaProductos=jPanelAccionesFormularioAuxiliarDemandaProductos;
		
		
		final JMenuBar jmenuBarDemandaProductos=this.jmenuBarDemandaProductos;
		final JToolBar jTtoolBarDemandaProductos=this.jTtoolBarDemandaProductos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDemandaProductos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDemandaProductos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
			jmenuBarDetalleAuxiliarDemandaProductos=this.jInternalFrameDetalleFormDemandaProductos.jmenuBarDetalleDemandaProductos;
			jTtoolBarDetalleAuxiliarDemandaProductos=this.jInternalFrameDetalleFormDemandaProductos.jTtoolBarDetalleDemandaProductos;
		}
		
		final JMenuBar jmenuBarDetalleDemandaProductos=jmenuBarDetalleAuxiliarDemandaProductos;
		final JToolBar jTtoolBarDetalleDemandaProductos=jTtoolBarDetalleAuxiliarDemandaProductos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDemandaProductos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDemandaProductos;
			processRunnable.jTableDatos=jTableDatosDemandaProductos;
			processRunnable.jPanelCampos=jPanelCamposDemandaProductos;
			processRunnable.jPanelPaginacion=jPanelPaginacionDemandaProductos;
			processRunnable.jPanelAcciones=jPanelAccionesDemandaProductos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDemandaProductos;
			
			
			processRunnable.jmenuBar=jmenuBarDemandaProductos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDemandaProductos;
			processRunnable.jTtoolBar=jTtoolBarDemandaProductos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDemandaProductos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDemandaProductos ,jPanelParametrosReportesDemandaProductos,jTableDatosDemandaProductos, /*jScrollPanelDatosDemandaProductos,*/jPanelCamposDemandaProductos,jPanelPaginacionDemandaProductos, /*jScrollPanelDatosEdicionDemandaProductos,*/ jPanelAccionesDemandaProductos,jPanelAccionesFormularioDemandaProductos,jmenuBarDemandaProductos,jmenuBarDetalleDemandaProductos,jTtoolBarDemandaProductos,jTtoolBarDetalleDemandaProductos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDemandaProductos ,jPanelParametrosReportesDemandaProductos, jScrollPanelDatosDemandaProductos,jPanelPaginacionDemandaProductos, jScrollPanelDatosEdicionDemandaProductos, jPanelAccionesDemandaProductos,jPanelAccionesFormularioDemandaProductos,jmenuBarDemandaProductos,jmenuBarDetalleDemandaProductos,jTtoolBarDemandaProductos,jTtoolBarDetalleDemandaProductos);
						
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
	
	public void finishProcessDemandaProductos() {// throws Exception 
		this.finishProcessDemandaProductos(true);
	}
	
	public void finishProcessDemandaProductos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDemandaProductos ,this.jPanelParametrosReportesDemandaProductos, this.jScrollPanelDatosDemandaProductos,this.jPanelPaginacionDemandaProductos, this.jScrollPanelDatosEdicionDemandaProductos, this.jPanelAccionesDemandaProductos,this.jPanelAccionesFormularioDemandaProductos,this.jmenuBarDemandaProductos,this.jmenuBarDetalleDemandaProductos,this.jTtoolBarDemandaProductos,this.jTtoolBarDetalleDemandaProductos);		
		
		final JTabbedPane jTabbedPaneBusquedasDemandaProductos=this.jTabbedPaneBusquedasDemandaProductos; 
		
		final JPanel jPanelParametrosReportesDemandaProductos=this.jPanelParametrosReportesDemandaProductos;
		//final JScrollPane jScrollPanelDatosDemandaProductos=this.jScrollPanelDatosDemandaProductos;
		final JTable jTableDatosDemandaProductos=this.jTableDatosDemandaProductos;		
		final JPanel jPanelPaginacionDemandaProductos=this.jPanelPaginacionDemandaProductos;
		//final JScrollPane jScrollPanelDatosEdicionDemandaProductos=this.jScrollPanelDatosEdicionDemandaProductos;
		final JPanel jPanelAccionesDemandaProductos=this.jPanelAccionesDemandaProductos;
		
		JPanel jPanelCamposAuxiliarDemandaProductos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDemandaProductos=new JPanel();
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
			jPanelCamposAuxiliarDemandaProductos=this.jInternalFrameDetalleFormDemandaProductos.jPanelCamposDemandaProductos;
			jPanelAccionesFormularioAuxiliarDemandaProductos=this.jInternalFrameDetalleFormDemandaProductos.jPanelAccionesFormularioDemandaProductos;
		}
		
		final JPanel jPanelCamposDemandaProductos=jPanelCamposAuxiliarDemandaProductos;
		final JPanel jPanelAccionesFormularioDemandaProductos=jPanelAccionesFormularioAuxiliarDemandaProductos;
		
		
		final JMenuBar jmenuBarDemandaProductos=this.jmenuBarDemandaProductos;		
		final JToolBar jTtoolBarDemandaProductos=this.jTtoolBarDemandaProductos;
				
		JMenuBar jmenuBarDetalleAuxiliarDemandaProductos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDemandaProductos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
			jmenuBarDetalleAuxiliarDemandaProductos=this.jInternalFrameDetalleFormDemandaProductos.jmenuBarDetalleDemandaProductos;
			jTtoolBarDetalleAuxiliarDemandaProductos=this.jInternalFrameDetalleFormDemandaProductos.jTtoolBarDetalleDemandaProductos;		
		}
		
		final JMenuBar jmenuBarDetalleDemandaProductos=jmenuBarDetalleAuxiliarDemandaProductos;
		final JToolBar jTtoolBarDetalleDemandaProductos=jTtoolBarDetalleAuxiliarDemandaProductos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDemandaProductos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDemandaProductos;
			processRunnable.jTableDatos=jTableDatosDemandaProductos;
			processRunnable.jPanelCampos=jPanelCamposDemandaProductos;
			processRunnable.jPanelPaginacion=jPanelPaginacionDemandaProductos;
			processRunnable.jPanelAcciones=jPanelAccionesDemandaProductos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDemandaProductos;
			
			
			processRunnable.jmenuBar=jmenuBarDemandaProductos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDemandaProductos;
			processRunnable.jTtoolBar=jTtoolBarDemandaProductos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDemandaProductos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDemandaProductos ,jPanelParametrosReportesDemandaProductos, jTableDatosDemandaProductos,/*jScrollPanelDatosDemandaProductos,*/jPanelCamposDemandaProductos,jPanelPaginacionDemandaProductos, /*jScrollPanelDatosEdicionDemandaProductos,*/ jPanelAccionesDemandaProductos,jPanelAccionesFormularioDemandaProductos,jmenuBarDemandaProductos,jmenuBarDetalleDemandaProductos,jTtoolBarDemandaProductos,jTtoolBarDetalleDemandaProductos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDemandaProductos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDemandaProductos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDemandaProductos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDemandaProductos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDemandaProductos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDemandaProductos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDemandaProductos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDemandaProductos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDemandaProductos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.demandaproductosConstantesFunciones.getsFinalQueryDemandaProductos();
		String  finalQueryPaginacionTodos=this.demandaproductosConstantesFunciones.getsFinalQueryDemandaProductos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DemandaProductosConstantesFunciones.getArrayColumnasGlobalesNoDemandaProductos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DemandaProductosConstantesFunciones.getArrayColumnasGlobalesDemandaProductos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DemandaProductosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.demandaproductossEliminados= new ArrayList<DemandaProductos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDemandaProductos();
		
				///*DemandaProductosSessionBean*/this.demandaproductosSessionBean=new DemandaProductosSessionBean();
			
			if(this.demandaproductosSessionBean==null) {
				this.demandaproductosSessionBean=new DemandaProductosSessionBean();
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
					this.iNumeroPaginacion=DemandaProductosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DemandaProductosConstantesFunciones.getClassesForeignKeysOfDemandaProductos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/demandaproductos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			demandaproductossAux= new ArrayList<DemandaProductos>();
			
				
			demandaproductosLogic.setDatosCliente(this.datosCliente);
			demandaproductosLogic.setDatosDeep(this.datosDeep);
			demandaproductosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaDemandaProductos")) {
				this.sDetalleReporte=DemandaProductosConstantesFunciones.getDetalleIndiceBusquedaDemandaProductos(id_bodegaBusquedaDemandaProductos,id_productoBusquedaDemandaProductos,id_lineaBusquedaDemandaProductos,id_linea_grupoBusquedaDemandaProductos,id_linea_categoriaBusquedaDemandaProductos,id_linea_marcaBusquedaDemandaProductos,fecha_ultima_venta_hastaBusquedaDemandaProductos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					demandaproductosLogic.getDemandaProductossBusquedaDemandaProductos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaDemandaProductos,id_productoBusquedaDemandaProductos,id_lineaBusquedaDemandaProductos,id_linea_grupoBusquedaDemandaProductos,id_linea_categoriaBusquedaDemandaProductos,id_linea_marcaBusquedaDemandaProductos,fecha_ultima_venta_hastaBusquedaDemandaProductos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DemandaProductosConstantesFunciones.getDetalleIndiceBusquedaDemandaProductos(id_bodegaBusquedaDemandaProductos,id_productoBusquedaDemandaProductos,id_lineaBusquedaDemandaProductos,id_linea_grupoBusquedaDemandaProductos,id_linea_categoriaBusquedaDemandaProductos,id_linea_marcaBusquedaDemandaProductos,fecha_ultima_venta_hastaBusquedaDemandaProductos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DemandaProductosConstantesFunciones.getDetalleIndiceBusquedaDemandaProductos(id_bodegaBusquedaDemandaProductos,id_productoBusquedaDemandaProductos,id_lineaBusquedaDemandaProductos,id_linea_grupoBusquedaDemandaProductos,id_linea_categoriaBusquedaDemandaProductos,id_linea_marcaBusquedaDemandaProductos,fecha_ultima_venta_hastaBusquedaDemandaProductos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=demandaproductosLogic.getDemandaProductoss()==null||demandaproductosLogic.getDemandaProductoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=demandaproductoss==null|| demandaproductoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						demandaproductossAux=new ArrayList<DemandaProductos>();
						demandaproductossAux.addAll(demandaproductosLogic.getDemandaProductoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							demandaproductossAux=new ArrayList<DemandaProductos>();
							demandaproductossAux.addAll(demandaproductoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							demandaproductosLogic.getDemandaProductossBusquedaDemandaProductos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaDemandaProductos,id_productoBusquedaDemandaProductos,id_lineaBusquedaDemandaProductos,id_linea_grupoBusquedaDemandaProductos,id_linea_categoriaBusquedaDemandaProductos,id_linea_marcaBusquedaDemandaProductos,fecha_ultima_venta_hastaBusquedaDemandaProductos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DemandaProductosConstantesFunciones.getDetalleIndiceBusquedaDemandaProductos(id_bodegaBusquedaDemandaProductos,id_productoBusquedaDemandaProductos,id_lineaBusquedaDemandaProductos,id_linea_grupoBusquedaDemandaProductos,id_linea_categoriaBusquedaDemandaProductos,id_linea_marcaBusquedaDemandaProductos,fecha_ultima_venta_hastaBusquedaDemandaProductos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DemandaProductosConstantesFunciones.getDetalleIndiceBusquedaDemandaProductos(id_bodegaBusquedaDemandaProductos,id_productoBusquedaDemandaProductos,id_lineaBusquedaDemandaProductos,id_linea_grupoBusquedaDemandaProductos,id_linea_categoriaBusquedaDemandaProductos,id_linea_marcaBusquedaDemandaProductos,fecha_ultima_venta_hastaBusquedaDemandaProductos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDemandaProductoss("BusquedaDemandaProductos",demandaproductosLogic.getDemandaProductoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDemandaProductoss("BusquedaDemandaProductos",demandaproductoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						demandaproductosLogic.setDemandaProductoss(new ArrayList<DemandaProductos>());
						demandaproductosLogic.getDemandaProductoss().addAll(demandaproductossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							demandaproductoss=new ArrayList<DemandaProductos>();
							demandaproductoss.addAll(demandaproductossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDemandaProductos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDemandaProductos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=demandaproductosLogic.getDemandaProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=demandaproductoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=demandaproductosLogic.getDemandaProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=demandaproductoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DemandaProductos demandaproductos) {
		Boolean permite=true;
		
		if(this.demandaproductos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DemandaProductosConstantesFunciones.getOrderByListaDemandaProductos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DemandaProductosConstantesFunciones.getOrderByListaDemandaProductos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DemandaProductos demandaproductos:demandaproductosLogic.getDemandaProductoss()) {
				if(demandaproductos.getsType().equals(Constantes2.S_TOTALES)) {
					demandaproductosTotales=demandaproductos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DemandaProductos demandaproductos:this.demandaproductoss) {
				if(demandaproductos.getsType().equals(Constantes2.S_TOTALES)) {
					demandaproductosTotales=demandaproductos;
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
			this.demandaproductosAux=new DemandaProductos();
			this.demandaproductosAux.setsType(Constantes2.S_TOTALES);
			this.demandaproductosAux.setIsNew(false);
			this.demandaproductosAux.setIsChanged(false);
			this.demandaproductosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//DemandaProductosConstantesFunciones.TotalizarValoresFilaDemandaProductos(this.demandaproductosLogic.getDemandaProductoss(),this.demandaproductosAux);
				
				//this.demandaproductosLogic.getDemandaProductoss().add(this.demandaproductosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DemandaProductosConstantesFunciones.TotalizarValoresFilaDemandaProductos(this.demandaproductoss,this.demandaproductosAux);
				
				this.demandaproductoss.add(this.demandaproductosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		demandaproductosTotales=new DemandaProductos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.demandaproductosLogic.getDemandaProductoss().remove(demandaproductosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.demandaproductoss.remove(demandaproductosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		demandaproductosTotales=new DemandaProductos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DemandaProductos demandaproductos:demandaproductosLogic.getDemandaProductoss()) {
				if(demandaproductos.getsType().equals(Constantes2.S_TOTALES)) {
					demandaproductosTotales=demandaproductos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DemandaProductosConstantesFunciones.TotalizarValoresFilaDemandaProductos(this.demandaproductosLogic.getDemandaProductoss(),demandaproductosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DemandaProductos demandaproductos:this.demandaproductoss) {
				if(demandaproductos.getsType().equals(Constantes2.S_TOTALES)) {
					demandaproductosTotales=demandaproductos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DemandaProductosConstantesFunciones.TotalizarValoresFilaDemandaProductos(this.demandaproductoss,demandaproductosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDemandaProductossBusquedaDemandaProductos()throws Exception {
		try {
			sAccionBusqueda="BusquedaDemandaProductos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDemandaProductossFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDemandaProductossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDemandaProductossFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDemandaProductossFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDemandaProductossFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDemandaProductossFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDemandaProductossFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDemandaProductossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDemandaProductossBusquedaDemandaProductos(String sFinalQuery,Long id_bodega,Long id_producto,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca,Date fecha_ultima_venta_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//demandaproductosLogic.getDemandaProductossBusquedaDemandaProductos(sFinalQuery,this.pagination,id_bodega,id_producto,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca,fecha_ultima_venta_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDemandaProductossFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//demandaproductosLogic.getDemandaProductossFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDemandaProductossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//demandaproductosLogic.getDemandaProductossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDemandaProductossFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//demandaproductosLogic.getDemandaProductossFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDemandaProductossFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//demandaproductosLogic.getDemandaProductossFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDemandaProductossFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//demandaproductosLogic.getDemandaProductossFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDemandaProductossFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//demandaproductosLogic.getDemandaProductossFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDemandaProductossFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//demandaproductosLogic.getDemandaProductossFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDemandaProductossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//demandaproductosLogic.getDemandaProductossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosDemandaProductos() {
		this.isPermisoTodoDemandaProductos=false;
		this.isPermisoNuevoDemandaProductos=false;
		this.isPermisoActualizarDemandaProductos=false;
		this.isPermisoActualizarOriginalDemandaProductos=false;
		this.isPermisoEliminarDemandaProductos=false;
		this.isPermisoGuardarCambiosDemandaProductos=false;
		this.isPermisoConsultaDemandaProductos=true;
		this.isPermisoBusquedaDemandaProductos=true;
		this.isPermisoReporteDemandaProductos=true;
		this.isPermisoOrdenDemandaProductos=false;		
		this.isPermisoPaginacionMedioDemandaProductos=false;		
		this.isPermisoPaginacionAltoDemandaProductos=false;		
		this.isPermisoPaginacionTodoDemandaProductos=false;		
		this.isPermisoCopiarDemandaProductos=false;		
		this.isPermisoVerFormDemandaProductos=false;		
		this.isPermisoDuplicarDemandaProductos=false;
		this.isPermisoOrdenDemandaProductos=false;
	}
	
	public void setPermisosUsuarioDemandaProductos(Boolean isPermiso) {
		this.isPermisoTodoDemandaProductos=isPermiso;
		this.isPermisoNuevoDemandaProductos=isPermiso;
		this.isPermisoActualizarDemandaProductos=isPermiso;
		this.isPermisoActualizarOriginalDemandaProductos=isPermiso;
		this.isPermisoEliminarDemandaProductos=isPermiso;
		this.isPermisoGuardarCambiosDemandaProductos=isPermiso;
		this.isPermisoConsultaDemandaProductos=isPermiso;
		this.isPermisoBusquedaDemandaProductos=isPermiso;
		this.isPermisoReporteDemandaProductos=isPermiso;
		this.isPermisoOrdenDemandaProductos=isPermiso;		
		this.isPermisoPaginacionMedioDemandaProductos=isPermiso;		
		this.isPermisoPaginacionAltoDemandaProductos=isPermiso;		
		this.isPermisoPaginacionTodoDemandaProductos=isPermiso;		
		this.isPermisoCopiarDemandaProductos=isPermiso;		
		this.isPermisoVerFormDemandaProductos=isPermiso;		
		this.isPermisoDuplicarDemandaProductos=isPermiso;
		this.isPermisoOrdenDemandaProductos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDemandaProductos(Boolean isPermiso) {
		//this.isPermisoTodoDemandaProductos=isPermiso;
		this.isPermisoNuevoDemandaProductos=isPermiso;
		this.isPermisoActualizarDemandaProductos=isPermiso;
		this.isPermisoActualizarOriginalDemandaProductos=isPermiso;
		this.isPermisoEliminarDemandaProductos=isPermiso;
		this.isPermisoGuardarCambiosDemandaProductos=isPermiso;
		//this.isPermisoConsultaDemandaProductos=isPermiso;
		//this.isPermisoBusquedaDemandaProductos=isPermiso;
		//this.isPermisoReporteDemandaProductos=isPermiso;
		//this.isPermisoOrdenDemandaProductos=isPermiso;		
		//this.isPermisoPaginacionMedioDemandaProductos=isPermiso;		
		//this.isPermisoPaginacionAltoDemandaProductos=isPermiso;		
		//this.isPermisoPaginacionTodoDemandaProductos=isPermiso;		
		//this.isPermisoCopiarDemandaProductos=isPermiso;		
		//this.isPermisoDuplicarDemandaProductos=isPermiso;
		//this.isPermisoOrdenDemandaProductos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDemandaProductosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DemandaProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDemandaProductos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDemandaProductosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDemandaProductosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDemandaProductosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDemandaProductosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDemandaProductos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DemandaProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DemandaProductosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDemandaProductos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDemandaProductos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDemandaProductos=this.isPermisoActualizarDemandaProductos;
			this.isPermisoEliminarDemandaProductos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDemandaProductos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDemandaProductos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDemandaProductos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDemandaProductos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDemandaProductos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDemandaProductos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDemandaProductos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDemandaProductos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDemandaProductos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDemandaProductos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDemandaProductos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDemandaProductos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDemandaProductos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDemandaProductos.setToolTipText(this.jTableDatosDemandaProductos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDemandaProductos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDemandaProductos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DemandaProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DemandaProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDemandaProductos() throws Exception {
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
	public void inicializarCombosForeignKeyDemandaProductosListas()throws Exception {
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
	
	public void cargarCombosTodosForeignKeyDemandaProductosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DemandaProductosJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyDemandaProductos()throws Exception {
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
			if(this.demandaproductosSessionBean==null) {
				this.demandaproductosSessionBean=new DemandaProductosSessionBean();
			}

			if(!this.demandaproductosSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.demandaproductosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

			if(!this.demandaproductosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.demandaproductosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.demandaproductosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.demandaproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

			if(!this.demandaproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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

			if(!this.demandaproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
	
	public void initActionsCombosTodosForeignKeyDemandaProductos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDemandaProductos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDemandaProductos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDemandaProductos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDemandaProductos(DemandaProductos demandaproductos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDemandaProductos(DemandaProductos demandaproductos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDemandaProductos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDemandaProductos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDemandaProductos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDemandaProductos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDemandaProductos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDemandaProductos()throws Exception {
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
	
	public void cargarCombosFrameForeignKeyDemandaProductos(String sFormularioTipoBusqueda)throws Exception {
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
	
	public void setItemDefectoCombosForeignKeyDemandaProductos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_bodegaDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_bodegaDemandaProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_bodegaDemandaProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_productoDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_productoDemandaProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_productoDemandaProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_empresaDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_empresaDemandaProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_empresaDemandaProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_sucursalDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_sucursalDemandaProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_sucursalDemandaProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_lineaDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_lineaDemandaProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_lineaDemandaProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_grupoDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_grupoDemandaProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_grupoDemandaProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_categoriaDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_categoriaDemandaProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_categoriaDemandaProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_marcaDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_marcaDemandaProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_marcaDemandaProductos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public DemandaProductosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DemandaProductosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DemandaProductosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.demandaproductosSessionBean=new DemandaProductosSessionBean(); 
		this.demandaproductosConstantesFunciones=new DemandaProductosConstantesFunciones(); 
		this.demandaproductosBean=new DemandaProductos();//(this.demandaproductosConstantesFunciones); 		
		this.demandaproductosReturnGeneral=new DemandaProductosParameterReturnGeneral(); 
		
		this.demandaproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.demandaproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DemandaProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DemandaProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DemandaProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDemandaProductos(true);
			
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
			
			this.demandaproductosConstantesFunciones=new DemandaProductosConstantesFunciones(); 
			this.demandaproductosBean=new DemandaProductos();//this.demandaproductosConstantesFunciones); 			
			this.demandaproductosReturnGeneral=new DemandaProductosParameterReturnGeneral(); 
		
			DemandaProductosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Demanda Productos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.demandaproductos=new DemandaProductos();
			this.demandaproductoss = new ArrayList<DemandaProductos>();
			this.demandaproductossAux = new ArrayList<DemandaProductos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic=new DemandaProductosLogic();
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}
			
			//this.demandaproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.demandaproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDemandaProductos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDemandaProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDemandaProductos);	
					}
					
					if(this.jInternalFrameImportacionDemandaProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDemandaProductos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDemandaProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDemandaProductos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDemandaProductos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDemandaProductos);
				this.jInternalFrameDetalleFormDemandaProductos.setVisible(false);
				this.jInternalFrameDetalleFormDemandaProductos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDemandaProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDemandaProductos);
					this.jInternalFrameReporteDinamicoDemandaProductos.setVisible(false);
					this.jInternalFrameReporteDinamicoDemandaProductos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDemandaProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDemandaProductos);
					this.jInternalFrameImportacionDemandaProductos.setVisible(false);
					this.jInternalFrameImportacionDemandaProductos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDemandaProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDemandaProductos);
					this.jInternalFrameOrderByDemandaProductos.setVisible(false);
					this.jInternalFrameOrderByDemandaProductos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDemandaProductosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DemandaProductosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.demandaproductosReturnGeneral=new DemandaProductosParameterReturnGeneral();
			
			this.demandaproductosParameterGeneral=new DemandaProductosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.demandaproductosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DemandaProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DemandaProductosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.demandaproductosSessionBean.getEsGuardarRelacionado(),this.demandaproductosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DemandaProductosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.demandaproductosSessionBean.getEsGuardarRelacionado(),this.demandaproductosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDemandaProductos=false;
			this.isVisibilidadCeldaDuplicarDemandaProductos=true;
			this.isVisibilidadCeldaCopiarDemandaProductos=true;
			this.isVisibilidadCeldaVerFormDemandaProductos=true;
			this.isVisibilidadCeldaOrdenDemandaProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesDemandaProductos=false;
			this.isVisibilidadCeldaModificarDemandaProductos=false;
			this.isVisibilidadCeldaActualizarDemandaProductos=false;
			this.isVisibilidadCeldaEliminarDemandaProductos=false;
			this.isVisibilidadCeldaCancelarDemandaProductos=false;
			this.isVisibilidadCeldaGuardarDemandaProductos=false;
			this.isVisibilidadCeldaGuardarCambiosDemandaProductos=false;
			
			
			this.isVisibilidadBusquedaDemandaProductos=true;
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
			
			//this.actualizarEstadoCeldasBotonesDemandaProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDemandaProductos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDemandaProductos(false);
			
			this.setPermisosUsuarioDemandaProductos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.demandaproductosSessionBean.getEsGuardarRelacionado() 
				|| (this.demandaproductosSessionBean.getEsGuardarRelacionado() && this.demandaproductosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDemandaProductosClasesRelacionadas();
			}
			
			if(this.demandaproductosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDemandaProductosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDemandaProductos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDemandaProductos();
			}
			
			if(!this.isPermisoBusquedaDemandaProductos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDemandaProductos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.demandaproductosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DemandaProductosConstantesFunciones.getTiposSeleccionarDemandaProductos());
				
				this.tiposColumnasSelect=DemandaProductosConstantesFunciones.getTiposSeleccionarDemandaProductos(true);
				
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
			//if(!this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDemandaProductos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioDemandaProductos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioDemandaProductos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDemandaProductos() ;
			
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
				demandaproductosImplementable= (DemandaProductosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DemandaProductosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				demandaproductosImplementableHome= (DemandaProductosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DemandaProductosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.demandaproductoss= new ArrayList<DemandaProductos>();
			this.demandaproductossEliminados= new ArrayList<DemandaProductos>();
						
			this.isEsNuevoDemandaProductos=false;
			this.esParaAccionDesdeFormularioDemandaProductos=false;
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
				this.cargarCombosForeignKeyDemandaProductos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDemandaProductos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DemandaProductosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DemandaProductosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDemandaProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDemandaProductos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDemandaProductos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDemandaProductos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDemandaProductos();
			}
			
			DemandaProductosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDemandaProductos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDemandaProductos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDemandaProductos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDemandaProductos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DemandaProductos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDemandaProductos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDemandaProductos")) {
				iIndex=this.jInternalFrameDetalleFormDemandaProductos.jTabbedPaneRelacionesDemandaProductos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDemandaProductos.jTabbedPaneRelacionesDemandaProductos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDemandaProductos();	
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
	
	public void cargarCombosForeignKeyDemandaProductos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDemandaProductos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDemandaProductos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDemandaProductosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDemandaProductos();
		
		this.cargarCombosFrameForeignKeyDemandaProductos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDemandaProductos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDemandaProductos();
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
	
	public void jButtonNuevoDemandaProductosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.demandaproductosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDemandaProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
			
			
			if(jTableDatosDemandaProductos.getRowCount()>=1) {
				jTableDatosDemandaProductos.removeRowSelectionInterval(0, jTableDatosDemandaProductos.getRowCount()-1);						
			}
			
			this.isEsNuevoDemandaProductos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDemandaProductos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDemandaProductos(true);			
			//this.demandaproductos=new DemandaProductos();
			//this.demandaproductos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDemandaProductos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDemandaProductos() ;
			
			if(DemandaProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDemandaProductos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.demandaproductos);	
			this.actualizarInformacion("INFO_PADRE",false,this.demandaproductos);				
			
			DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
			
			if(this.demandaproductosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DemandaProductos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDemandaProductosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DemandaProductos> demandaproductossSeleccionados=new ArrayList<DemandaProductos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDemandaProductos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDemandaProductos.getSelectedRows().length;			
			}
			
			demandaproductossSeleccionados=this.getDemandaProductossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDemandaProductos--;			
				//DemandaProductos demandaproductosAux= new DemandaProductos();			
				//demandaproductosAux.setId(this.iIdNuevoDemandaProductos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DemandaProductos demandaproductosOrigen=new DemandaProductos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DemandaProductos demandaproductosOrigen : demandaproductossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							demandaproductosOrigen =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							demandaproductosOrigen =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDemandaProductos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.demandaproductos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDemandaProductos(demandaproductosOrigen,this.demandaproductos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.demandaproductosLogic.getDemandaProductoss().add(this.demandaproductosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.demandaproductoss.add(this.demandaproductosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDemandaProductos(false);
				
				this.jTableDatosDemandaProductos.setRowSelectionInterval(this.getIndiceNuevoDemandaProductos(), this.getIndiceNuevoDemandaProductos());
				
				int iLastRow =  this.jTableDatosDemandaProductos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDemandaProductos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDemandaProductos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDemandaProductos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDemandaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DemandaProductos> demandaproductossSeleccionados=new ArrayList<DemandaProductos>();									
		
			DemandaProductos demandaproductosOrigen=new DemandaProductos();
			DemandaProductos demandaproductosDestino=new DemandaProductos();
				
			demandaproductossSeleccionados=this.getDemandaProductossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDemandaProductos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || demandaproductossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDemandaProductos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						demandaproductosOrigen =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						demandaproductosOrigen =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						demandaproductosDestino =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						demandaproductosDestino =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				demandaproductosOrigen =demandaproductossSeleccionados.get(0);
				demandaproductosDestino =demandaproductossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDemandaProductos(demandaproductosOrigen,demandaproductosDestino,true,false);
				
				demandaproductosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(demandaproductosDestino,demandaproductosLogic.getDemandaProductoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(demandaproductosDestino,demandaproductoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDemandaProductos(false);
				
				//this.jTableDatosDemandaProductos.setRowSelectionInterval(this.getIndiceNuevoDemandaProductos(), this.getIndiceNuevoDemandaProductos());
				
				int iLastRow =  this.jTableDatosDemandaProductos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDemandaProductos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDemandaProductos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDemandaProductos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDemandaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDemandaProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDemandaProductos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDemandaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDemandaProductos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDemandaProductos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDemandaProductos.setVisible(!isVisible);
			this.jPanelPaginacionDemandaProductos.setVisible(!isVisible);
			this.jPanelAccionesDemandaProductos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDemandaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDemandaProductos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDemandaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDemandaProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDemandaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDemandaProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDemandaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDemandaProductos();
			
			this.abrirFrameOrderByDemandaProductos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDemandaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDemandaProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDemandaProductos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDemandaProductos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDemandaProductos.isMaximum()) {
					this.jInternalFrameDetalleFormDemandaProductos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDemandaProductos.setSize(this.jInternalFrameDetalleFormDemandaProductos.iWidthFormulario,this.jInternalFrameDetalleFormDemandaProductos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDemandaProductos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDemandaProductos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDemandaProductos.isMaximum()) {
						this.jInternalFrameDetalleFormDemandaProductos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDemandaProductos.jContentPaneDetalleDemandaProductos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDemandaProductos.jTabbedPaneRelacionesDemandaProductos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDemandaProductos.jContentPaneDetalleDemandaProductos.getWidth(),DemandaProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDemandaProductos.jTabbedPaneRelacionesDemandaProductos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDemandaProductos.jContentPaneDetalleDemandaProductos.getWidth(),DemandaProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDemandaProductos.jTabbedPaneRelacionesDemandaProductos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDemandaProductos.jContentPaneDetalleDemandaProductos.getWidth(),DemandaProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDemandaProductos.setVisible(true);
	        this.jInternalFrameDetalleFormDemandaProductos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDemandaProductos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDemandaProductos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDemandaProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDemandaProductos,false,this);
				} else {
					this.jInternalFrameOrderByDemandaProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDemandaProductos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDemandaProductos);
				this.jInternalFrameOrderByDemandaProductos.setVisible(false);
				this.jInternalFrameOrderByDemandaProductos.setSelected(false);
				
				this.jInternalFrameOrderByDemandaProductos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDemandaProductos"));
				
				this.inicializarActualizarBindingTablaOrderByDemandaProductos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDemandaProductos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDemandaProductos==null) {
				
				this.jInternalFrameImportacionDemandaProductos=new ImportacionJInternalFrame(DemandaProductosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDemandaProductos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDemandaProductos);
				this.jInternalFrameImportacionDemandaProductos.setVisible(false);
				this.jInternalFrameImportacionDemandaProductos.setSelected(false);


				this.jInternalFrameImportacionDemandaProductos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDemandaProductos"));
				this.jInternalFrameImportacionDemandaProductos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDemandaProductos"));
				this.jInternalFrameImportacionDemandaProductos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDemandaProductos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDemandaProductos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDemandaProductos==null) {
				this.jInternalFrameReporteDinamicoDemandaProductos=new ReporteDinamicoJInternalFrame(DemandaProductosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDemandaProductos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDemandaProductos);
				this.jInternalFrameReporteDinamicoDemandaProductos.setVisible(false);
				this.jInternalFrameReporteDinamicoDemandaProductos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDemandaProductos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDemandaProductos"));
				this.jInternalFrameReporteDinamicoDemandaProductos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDemandaProductos"));
				this.jInternalFrameReporteDinamicoDemandaProductos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDemandaProductos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDemandaProductos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDemandaProductos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDemandaProductos);
			
	       	this.jInternalFrameDetalleFormDemandaProductos.setVisible(false);
	        this.jInternalFrameDetalleFormDemandaProductos.setSelected(false);
			
			//this.jInternalFrameDetalleFormDemandaProductos.dispose();
			//this.jInternalFrameDetalleFormDemandaProductos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDemandaProductos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDemandaProductos.setVisible(true);
	        this.jInternalFrameReporteDinamicoDemandaProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDemandaProductos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDemandaProductos.setVisible(true);
	        this.jInternalFrameImportacionDemandaProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDemandaProductos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDemandaProductos.setVisible(true);
	        this.jInternalFrameOrderByDemandaProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDemandaProductos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDemandaProductos.setVisible(false);
	        this.jInternalFrameOrderByDemandaProductos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDemandaProductos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDemandaProductos.setVisible(false);
	        this.jInternalFrameReporteDinamicoDemandaProductos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDemandaProductos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDemandaProductos.setVisible(false);
	        this.jInternalFrameImportacionDemandaProductos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDemandaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDemandaProductos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDemandaProductos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDemandaProductos(true);
			//this.isEsNuevoDemandaProductos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDemandaProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDemandaProductos(false) ;
			
			if(demandaproductosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DemandaProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDemandaProductos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDemandaProductos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDemandaProductosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDemandaProductos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDemandaProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDemandaProductos(true);
			//this.isEsNuevoDemandaProductos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.demandaproductos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDemandaProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDemandaProductos(false) ;
			
			if(DemandaProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDemandaProductos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDemandaProductos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,DemandaProductosConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDemandaProductos.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,DemandaProductosConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDemandaProductos.getSelectedRow();

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
		TableColumn tableColumnLinea=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,DemandaProductosConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDemandaProductos.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,DemandaProductosConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDemandaProductos.getSelectedRow();

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
		TableColumn tableColumnLineaCategoria=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,DemandaProductosConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDemandaProductos.getSelectedRow();

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
		TableColumn tableColumnLineaMarca=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,DemandaProductosConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDemandaProductos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDemandaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDemandaProductos(false);
			
			//if(!this.isEsNuevoDemandaProductos) {								
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DemandaProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				
			}
			
			if(this.permiteMantenimiento(this.demandaproductos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDemandaProductos=true;
					this.inicializarActualizarBindingTablaDemandaProductos(false);
					this.isEsNuevoDemandaProductos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDemandaProductos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDemandaProductos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDemandaProductos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDemandaProductos(false);
				
				this.habilitarDeshabilitarControlesDemandaProductos(false);
			
												
				
				if(DemandaProductosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDemandaProductos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDemandaProductosActionPerformed(evt,demandaproductosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDemandaProductos(this.demandaproductos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDemandaProductos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,demandaproductosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.demandaproductos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DemandaProductos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DemandaProductos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDemandaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				this.demandaproductos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				this.demandaproductos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.demandaproductos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DemandaProductosModel) this.jTableDatosDemandaProductos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDemandaProductos=true;
				this.inicializarActualizarBindingTablaDemandaProductos(false);
				this.isEsNuevoDemandaProductos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDemandaProductos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDemandaProductos(false);
				
				this.habilitarDeshabilitarControlesDemandaProductos(false);
				
				
				
				if(DemandaProductosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDemandaProductos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDemandaProductosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDemandaProductos.getRowCount()>=1) {
				jTableDatosDemandaProductos.removeRowSelectionInterval(0, jTableDatosDemandaProductos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDemandaProductos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDemandaProductos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDemandaProductos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDemandaProductos(false) ;
			
			this.isEsNuevoDemandaProductos=false;
			
			if(DemandaProductosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDemandaProductos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDemandaProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDemandaProductos(false);
				
				//SI ES MANUAL
				if(DemandaProductosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDemandaProductos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDemandaProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDemandaProductos--;			
			//DemandaProductos demandaproductosAux= new DemandaProductos();			
			//demandaproductosAux.setId(this.iIdNuevoDemandaProductos);
			
			if(this.jInternalFrameDetalleFormDemandaProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDemandaProductos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
			
			this.demandaproductos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.demandaproductosLogic.getDemandaProductoss().add(this.demandaproductosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.demandaproductoss.add(this.demandaproductosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDemandaProductos(false);
			
			this.jTableDatosDemandaProductos.setRowSelectionInterval(this.getIndiceNuevoDemandaProductos(), this.getIndiceNuevoDemandaProductos());
			
			int iLastRow =  this.jTableDatosDemandaProductos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDemandaProductos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDemandaProductos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDemandaProductos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDemandaProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDemandaProductos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDemandaProductos(false);
			
			//SI ES MANUAL
			if(DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDemandaProductos();
			}
			
			//this.abrirFrameTreeDemandaProductos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDemandaProductosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDemandaProductosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDemandaProductos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDemandaProductos.setFileImportacion(this.jInternalFrameImportacionDemandaProductos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDemandaProductos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDemandaProductos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDemandaProductos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDemandaProductos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDemandaProductosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DemandaProductos> demandaproductossSeleccionados=new ArrayList<DemandaProductos>();		

		demandaproductossSeleccionados=this.getDemandaProductossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDemandaProductos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDemandaProductos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DemandaProductosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DemandaProductosBaseDesign.jrxml";
			
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
			
			this.generarReporteDemandaProductoss("Todos",demandaproductossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.demandaproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Demanda Productos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDemandaProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDemandaProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DemandaProductosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DemandaProductosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUnidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DemandaProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadDisponible_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadDisponible_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadDisponible_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadDisponible_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DemandaProductosConstantesFunciones.LABEL_STOCKMINIMO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ockMinimo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ockMinimo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ockMinimo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ockMinimo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DemandaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DemandaProductosConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DemandaProductosConstantesFunciones.LABEL_DEMTRI:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mTri_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mTri_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mTri_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mTri_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DemandaProductosConstantesFunciones.LABEL_DEMBI:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mBi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mBi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mBi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mBi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DemandaProductosConstantesFunciones.LABEL_DEMMEN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mMen_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mMen_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mMen_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mMen_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DemandaProductosConstantesFunciones.LABEL_INGRESOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_gresos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_gresos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_gresos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_gresos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DemandaProductosConstantesFunciones.LABEL_EGRESOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_resos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_resos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_resos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_resos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DemandaProductosConstantesFunciones.LABEL_EXISTENCIA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_istencia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_istencia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_istencia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_istencia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DemandaProductosConstantesFunciones.LABEL_COSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sto_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDemandaProductos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDemandaProductos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDemandaProductos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DemandaProductosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case DemandaProductosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoria="nombre_unidad";
					break;

				case DemandaProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					sNombreCampoCategoria="cantidad_disponible";
					break;

				case DemandaProductosConstantesFunciones.LABEL_STOCKMINIMO:
					sNombreCampoCategoria="stock_minimo";
					break;

				case DemandaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoria="codigo_producto";
					break;

				case DemandaProductosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case DemandaProductosConstantesFunciones.LABEL_DEMTRI:
					sNombreCampoCategoria="dem_tri";
					break;

				case DemandaProductosConstantesFunciones.LABEL_DEMBI:
					sNombreCampoCategoria="dem_bi";
					break;

				case DemandaProductosConstantesFunciones.LABEL_DEMMEN:
					sNombreCampoCategoria="dem_men";
					break;

				case DemandaProductosConstantesFunciones.LABEL_INGRESOS:
					sNombreCampoCategoria="ingresos";
					break;

				case DemandaProductosConstantesFunciones.LABEL_EGRESOS:
					sNombreCampoCategoria="egresos";
					break;

				case DemandaProductosConstantesFunciones.LABEL_EXISTENCIA:
					sNombreCampoCategoria="existencia";
					break;

				case DemandaProductosConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoria="costo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDemandaProductos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DemandaProductosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case DemandaProductosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoriaValor="nombre_unidad";
					break;

				case DemandaProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					sNombreCampoCategoriaValor="cantidad_disponible";
					break;

				case DemandaProductosConstantesFunciones.LABEL_STOCKMINIMO:
					sNombreCampoCategoriaValor="stock_minimo";
					break;

				case DemandaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoriaValor="codigo_producto";
					break;

				case DemandaProductosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case DemandaProductosConstantesFunciones.LABEL_DEMTRI:
					sNombreCampoCategoriaValor="dem_tri";
					break;

				case DemandaProductosConstantesFunciones.LABEL_DEMBI:
					sNombreCampoCategoriaValor="dem_bi";
					break;

				case DemandaProductosConstantesFunciones.LABEL_DEMMEN:
					sNombreCampoCategoriaValor="dem_men";
					break;

				case DemandaProductosConstantesFunciones.LABEL_INGRESOS:
					sNombreCampoCategoriaValor="ingresos";
					break;

				case DemandaProductosConstantesFunciones.LABEL_EGRESOS:
					sNombreCampoCategoriaValor="egresos";
					break;

				case DemandaProductosConstantesFunciones.LABEL_EXISTENCIA:
					sNombreCampoCategoriaValor="existencia";
					break;

				case DemandaProductosConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoriaValor="costo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDemandaProductos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDemandaProductos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DemandaProductosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case DemandaProductosConstantesFunciones.LABEL_NOMBREUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Unidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_unidad");
					break;

				case DemandaProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad Disponible",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_disponible");
					break;

				case DemandaProductosConstantesFunciones.LABEL_STOCKMINIMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Stock Minimo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"stock_minimo");
					break;

				case DemandaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_producto");
					break;

				case DemandaProductosConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case DemandaProductosConstantesFunciones.LABEL_DEMTRI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dem Tri",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dem_tri");
					break;

				case DemandaProductosConstantesFunciones.LABEL_DEMBI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dem Bi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dem_bi");
					break;

				case DemandaProductosConstantesFunciones.LABEL_DEMMEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dem Men",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dem_men");
					break;

				case DemandaProductosConstantesFunciones.LABEL_INGRESOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ingresos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ingresos");
					break;

				case DemandaProductosConstantesFunciones.LABEL_EGRESOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Egresos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"egresos");
					break;

				case DemandaProductosConstantesFunciones.LABEL_EXISTENCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Existencia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"existencia");
					break;

				case DemandaProductosConstantesFunciones.LABEL_COSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo");
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
	
	public void jButtonGenerarExcelReporteDinamicoDemandaProductosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DemandaProductos> demandaproductossSeleccionados=new ArrayList<DemandaProductos>();		
		
		demandaproductossSeleccionados=this.getDemandaProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"demandaproductos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DemandaProductoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDemandaProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDemandaProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DemandaProductosConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DemandaProductosConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DemandaProductosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DemandaProductosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DemandaProductosConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DemandaProductosConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DemandaProductosConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DemandaProductosConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DemandaProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getfecha_ultima_venta_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DemandaProductosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DemandaProductosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_NOMBREUNIDAD);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getnombre_unidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DemandaProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getcantidad_disponible());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DemandaProductosConstantesFunciones.LABEL_STOCKMINIMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_STOCKMINIMO);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getstock_minimo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DemandaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getcodigo_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DemandaProductosConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DemandaProductosConstantesFunciones.LABEL_DEMTRI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_DEMTRI);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getdem_tri());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DemandaProductosConstantesFunciones.LABEL_DEMBI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_DEMBI);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getdem_bi());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DemandaProductosConstantesFunciones.LABEL_DEMMEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_DEMMEN);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getdem_men());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DemandaProductosConstantesFunciones.LABEL_INGRESOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_INGRESOS);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getingresos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DemandaProductosConstantesFunciones.LABEL_EGRESOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_EGRESOS);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getegresos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DemandaProductosConstantesFunciones.LABEL_EXISTENCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_EXISTENCIA);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getexistencia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DemandaProductosConstantesFunciones.LABEL_COSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_COSTO);
					iRow++;

					for(DemandaProductos demandaproductos:demandaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(demandaproductos.getcosto());
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
			//	this.getFilaCabeceraExportarExcelDemandaProductos(row);				
			//	iRow++;
			//}				
			
			//for(DemandaProductos demandaproductosAux:demandaproductossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDemandaProductos(demandaproductosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.demandaproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Demanda Productos",JOptionPane.INFORMATION_MESSAGE);
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
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDemandaProductos(false);
			
			//SI ES MANUAL
			if(DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDemandaProductos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDemandaProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDemandaProductos(false);
			
			//SI ES MANUAL
			if(DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDemandaProductos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDemandaProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDemandaProductos(false);
			
			//SI ES MANUAL
			if(DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDemandaProductos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDemandaProductos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDemandaProductos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDemandaProductos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDemandaProductos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDemandaProductos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDemandaProductos.setMinimumSize(dimensionMinimum);
		this.jTableDatosDemandaProductos.setMaximumSize(dimensionMaximum);
		this.jTableDatosDemandaProductos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDemandaProductos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDemandaProductos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDemandaProductos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDemandaProductos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDemandaProductos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDemandaProductos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDemandaProductos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDemandaProductos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DemandaProductosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDemandaProductos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDemandaProductos();
		
		this.inicializarActualizarBindingBotonesManualDemandaProductos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDemandaProductos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDemandaProductos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDemandaProductos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDemandaProductos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDemandaProductos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDemandaProductos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDemandaProductos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDemandaProductos.jCheckBoxPostAccionNuevoDemandaProductos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDemandaProductos.jCheckBoxPostAccionSinCerrarDemandaProductos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDemandaProductos.jCheckBoxPostAccionSinMensajeDemandaProductos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDemandaProductos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDemandaProductos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDemandaProductos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
				this.jInternalFrameDetalleFormDemandaProductos.jCheckBoxPostAccionNuevoDemandaProductos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDemandaProductos.jCheckBoxPostAccionSinCerrarDemandaProductos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDemandaProductos.jCheckBoxPostAccionSinMensajeDemandaProductos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDemandaProductos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDemandaProductos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDemandaProductos.jComboBoxTiposAccionesFormularioDemandaProductos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDemandaProductos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDemandaProductos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDemandaProductos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDemandaProductos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDemandaProductos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDemandaProductos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDemandaProductos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDemandaProductos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDemandaProductos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDemandaProductos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDemandaProductos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDemandaProductos(Boolean esInicializar) throws Exception {
		try	{	
			if(DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDemandaProductos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDemandaProductos() throws Exception {
		try	{
			if(DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDemandaProductos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDemandaProductos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDemandaProductos.jComboBoxTiposAccionesFormularioDemandaProductos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDemandaProductos.jComboBoxTiposAccionesFormularioDemandaProductos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDemandaProductos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDemandaProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDemandaProductos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDemandaProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDemandaProductos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDemandaProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDemandaProductos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDemandaProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDemandaProductos.addItem(reporte);
			}
			
			
			if(!this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDemandaProductos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDemandaProductos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDemandaProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDemandaProductos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDemandaProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDemandaProductos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDemandaProductos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDemandaProductos.jComboBoxTiposAccionesFormularioDemandaProductos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDemandaProductos.jComboBoxTiposAccionesFormularioDemandaProductos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDemandaProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDemandaProductos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDemandaProductos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDemandaProductos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDemandaProductos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDemandaProductos!=null) {
				this.jInternalFrameReporteDinamicoDemandaProductos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDemandaProductos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDemandaProductos!=null) {
				this.jInternalFrameReporteDinamicoDemandaProductos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDemandaProductos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDemandaProductos!=null) {
				
				if(this.jInternalFrameReporteDinamicoDemandaProductos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDemandaProductos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDemandaProductos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDemandaProductos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDemandaProductos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDemandaProductos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDemandaProductos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDemandaProductos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DemandaProductosConstantesFunciones.getTiposSeleccionarDemandaProductos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDemandaProductos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDemandaProductos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDemandaProductos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DemandaProductosConstantesFunciones.getTiposSeleccionarDemandaProductos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDemandaProductos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDemandaProductos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDemandaProductos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DemandaProductosConstantesFunciones.getTiposSeleccionarDemandaProductos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDemandaProductos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDemandaProductos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDemandaProductos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDemandaProductos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDemandaProductos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaBusquedaDemandaProductosDemandaProductos.getSelectedItem()!=null){this.id_bodegaBusquedaDemandaProductos=((Bodega)this.jComboBoxid_bodegaBusquedaDemandaProductosDemandaProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoBusquedaDemandaProductosDemandaProductos.getSelectedItem()!=null){this.id_productoBusquedaDemandaProductos=((Producto)this.jComboBoxid_productoBusquedaDemandaProductosDemandaProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaDemandaProductosDemandaProductos.getSelectedItem()!=null){this.id_lineaBusquedaDemandaProductos=((Linea)this.jComboBoxid_lineaBusquedaDemandaProductosDemandaProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaDemandaProductosDemandaProductos.getSelectedItem()!=null){this.id_linea_grupoBusquedaDemandaProductos=((Linea)this.jComboBoxid_linea_grupoBusquedaDemandaProductosDemandaProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaDemandaProductosDemandaProductos.getSelectedItem()!=null){this.id_linea_categoriaBusquedaDemandaProductos=((Linea)this.jComboBoxid_linea_categoriaBusquedaDemandaProductosDemandaProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaDemandaProductosDemandaProductos.getSelectedItem()!=null){this.id_linea_marcaBusquedaDemandaProductos=((Linea)this.jComboBoxid_linea_marcaBusquedaDemandaProductosDemandaProductos.getSelectedItem()).getId();}
		this.fecha_ultima_venta_hastaBusquedaDemandaProductos=new Date(this.jDateChooserfecha_ultima_venta_hastaBusquedaDemandaProductosDemandaProductos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDemandaProductos(Boolean esInicializar) throws Exception {				
		if(DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDemandaProductos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDemandaProductos() throws Exception {
		this.inicializarActualizarBindingTablaDemandaProductos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDemandaProductos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDemandaProductos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDemandaProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDemandaProductos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DemandaProductosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDemandaProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDemandaProductos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DemandaProductosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDemandaProductosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DemandaProductosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDemandaProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDemandaProductos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DemandaProductosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDemandaProductos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDemandaProductos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=demandaproductosLogic.getDemandaProductoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=demandaproductoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DemandaProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDemandaProductos.setModel(new DemandaProductosModel(this.demandaproductosLogic.getDemandaProductoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDemandaProductos.setModel(new DemandaProductosModel(this.demandaproductoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDemandaProductos!=null && this.jInternalFrameOrderByDemandaProductos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDemandaProductos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DemandaProductosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO,demandaproductosConstantesFunciones.resaltarSeleccionarDemandaProductos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DemandaProductosConstantesFunciones.SCLASSWEBTITULO,demandaproductosConstantesFunciones.resaltarSeleccionarDemandaProductos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,DemandaProductosConstantesFunciones.LABEL_ID));

		if(this.demandaproductosConstantesFunciones.mostraridDemandaProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DemandaProductosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.demandaproductosConstantesFunciones.resaltaridDemandaProductos,this.demandaproductosConstantesFunciones.activaridDemandaProductos,iSizeTabla,this,true,"idDemandaProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.demandaproductosConstantesFunciones.resaltaridDemandaProductos,this.demandaproductosConstantesFunciones.activaridDemandaProductos,this,true,"idDemandaProductos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,DemandaProductosConstantesFunciones.LABEL_CODIGO));

		if(this.demandaproductosConstantesFunciones.mostrarcodigoDemandaProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DemandaProductosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.demandaproductosConstantesFunciones.resaltarcodigoDemandaProductos,this.demandaproductosConstantesFunciones.activarcodigoDemandaProductos,iSizeTabla,this,true,"codigoDemandaProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.demandaproductosConstantesFunciones.resaltarcodigoDemandaProductos,this.demandaproductosConstantesFunciones.activarcodigoDemandaProductos,this,true,"codigoDemandaProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DemandaProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,DemandaProductosConstantesFunciones.LABEL_NOMBREUNIDAD));

		if(this.demandaproductosConstantesFunciones.mostrarnombre_unidadDemandaProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DemandaProductosConstantesFunciones.LABEL_NOMBREUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.demandaproductosConstantesFunciones.resaltarnombre_unidadDemandaProductos,this.demandaproductosConstantesFunciones.activarnombre_unidadDemandaProductos,iSizeTabla,this,true,"nombre_unidadDemandaProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.demandaproductosConstantesFunciones.resaltarnombre_unidadDemandaProductos,this.demandaproductosConstantesFunciones.activarnombre_unidadDemandaProductos,this,true,"nombre_unidadDemandaProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DemandaProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,DemandaProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE));

		if(this.demandaproductosConstantesFunciones.mostrarcantidad_disponibleDemandaProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DemandaProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.demandaproductosConstantesFunciones.resaltarcantidad_disponibleDemandaProductos,this.demandaproductosConstantesFunciones.activarcantidad_disponibleDemandaProductos,iSizeTabla,this,true,"cantidad_disponibleDemandaProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.demandaproductosConstantesFunciones.resaltarcantidad_disponibleDemandaProductos,this.demandaproductosConstantesFunciones.activarcantidad_disponibleDemandaProductos,this,true,"cantidad_disponibleDemandaProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DemandaProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,DemandaProductosConstantesFunciones.LABEL_STOCKMINIMO));

		if(this.demandaproductosConstantesFunciones.mostrarstock_minimoDemandaProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DemandaProductosConstantesFunciones.LABEL_STOCKMINIMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.demandaproductosConstantesFunciones.resaltarstock_minimoDemandaProductos,this.demandaproductosConstantesFunciones.activarstock_minimoDemandaProductos,iSizeTabla,this,true,"stock_minimoDemandaProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.demandaproductosConstantesFunciones.resaltarstock_minimoDemandaProductos,this.demandaproductosConstantesFunciones.activarstock_minimoDemandaProductos,this,true,"stock_minimoDemandaProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DemandaProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,DemandaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO));

		if(this.demandaproductosConstantesFunciones.mostrarcodigo_productoDemandaProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DemandaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.demandaproductosConstantesFunciones.resaltarcodigo_productoDemandaProductos,this.demandaproductosConstantesFunciones.activarcodigo_productoDemandaProductos,iSizeTabla,this,true,"codigo_productoDemandaProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.demandaproductosConstantesFunciones.resaltarcodigo_productoDemandaProductos,this.demandaproductosConstantesFunciones.activarcodigo_productoDemandaProductos,this,true,"codigo_productoDemandaProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DemandaProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,DemandaProductosConstantesFunciones.LABEL_NOMBRE));

		if(this.demandaproductosConstantesFunciones.mostrarnombreDemandaProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DemandaProductosConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.demandaproductosConstantesFunciones.resaltarnombreDemandaProductos,this.demandaproductosConstantesFunciones.activarnombreDemandaProductos,iSizeTabla,this,true,"nombreDemandaProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.demandaproductosConstantesFunciones.resaltarnombreDemandaProductos,this.demandaproductosConstantesFunciones.activarnombreDemandaProductos,this,true,"nombreDemandaProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DemandaProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,DemandaProductosConstantesFunciones.LABEL_DEMTRI));

		if(this.demandaproductosConstantesFunciones.mostrardem_triDemandaProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DemandaProductosConstantesFunciones.LABEL_DEMTRI,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.demandaproductosConstantesFunciones.resaltardem_triDemandaProductos,this.demandaproductosConstantesFunciones.activardem_triDemandaProductos,iSizeTabla,this,true,"dem_triDemandaProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.demandaproductosConstantesFunciones.resaltardem_triDemandaProductos,this.demandaproductosConstantesFunciones.activardem_triDemandaProductos,this,true,"dem_triDemandaProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DemandaProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,DemandaProductosConstantesFunciones.LABEL_DEMBI));

		if(this.demandaproductosConstantesFunciones.mostrardem_biDemandaProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DemandaProductosConstantesFunciones.LABEL_DEMBI,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.demandaproductosConstantesFunciones.resaltardem_biDemandaProductos,this.demandaproductosConstantesFunciones.activardem_biDemandaProductos,iSizeTabla,this,true,"dem_biDemandaProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.demandaproductosConstantesFunciones.resaltardem_biDemandaProductos,this.demandaproductosConstantesFunciones.activardem_biDemandaProductos,this,true,"dem_biDemandaProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DemandaProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,DemandaProductosConstantesFunciones.LABEL_DEMMEN));

		if(this.demandaproductosConstantesFunciones.mostrardem_menDemandaProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DemandaProductosConstantesFunciones.LABEL_DEMMEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.demandaproductosConstantesFunciones.resaltardem_menDemandaProductos,this.demandaproductosConstantesFunciones.activardem_menDemandaProductos,iSizeTabla,this,true,"dem_menDemandaProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.demandaproductosConstantesFunciones.resaltardem_menDemandaProductos,this.demandaproductosConstantesFunciones.activardem_menDemandaProductos,this,true,"dem_menDemandaProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DemandaProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,DemandaProductosConstantesFunciones.LABEL_INGRESOS));

		if(this.demandaproductosConstantesFunciones.mostraringresosDemandaProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DemandaProductosConstantesFunciones.LABEL_INGRESOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.demandaproductosConstantesFunciones.resaltaringresosDemandaProductos,this.demandaproductosConstantesFunciones.activaringresosDemandaProductos,iSizeTabla,this,true,"ingresosDemandaProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.demandaproductosConstantesFunciones.resaltaringresosDemandaProductos,this.demandaproductosConstantesFunciones.activaringresosDemandaProductos,this,true,"ingresosDemandaProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DemandaProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,DemandaProductosConstantesFunciones.LABEL_EGRESOS));

		if(this.demandaproductosConstantesFunciones.mostraregresosDemandaProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DemandaProductosConstantesFunciones.LABEL_EGRESOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.demandaproductosConstantesFunciones.resaltaregresosDemandaProductos,this.demandaproductosConstantesFunciones.activaregresosDemandaProductos,iSizeTabla,this,true,"egresosDemandaProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.demandaproductosConstantesFunciones.resaltaregresosDemandaProductos,this.demandaproductosConstantesFunciones.activaregresosDemandaProductos,this,true,"egresosDemandaProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DemandaProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,DemandaProductosConstantesFunciones.LABEL_EXISTENCIA));

		if(this.demandaproductosConstantesFunciones.mostrarexistenciaDemandaProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DemandaProductosConstantesFunciones.LABEL_EXISTENCIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.demandaproductosConstantesFunciones.resaltarexistenciaDemandaProductos,this.demandaproductosConstantesFunciones.activarexistenciaDemandaProductos,iSizeTabla,this,true,"existenciaDemandaProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.demandaproductosConstantesFunciones.resaltarexistenciaDemandaProductos,this.demandaproductosConstantesFunciones.activarexistenciaDemandaProductos,this,true,"existenciaDemandaProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DemandaProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,DemandaProductosConstantesFunciones.LABEL_COSTO));

		if(this.demandaproductosConstantesFunciones.mostrarcostoDemandaProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DemandaProductosConstantesFunciones.LABEL_COSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.demandaproductosConstantesFunciones.resaltarcostoDemandaProductos,this.demandaproductosConstantesFunciones.activarcostoDemandaProductos,iSizeTabla,this,true,"costoDemandaProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.demandaproductosConstantesFunciones.resaltarcostoDemandaProductos,this.demandaproductosConstantesFunciones.activarcostoDemandaProductos,this,true,"costoDemandaProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DemandaProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.demandaproductosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.demandaproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.demandaproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDemandaProductos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.demandaproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.demandaproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDemandaProductos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDemandaProductos && this.isPermisoGuardarCambiosDemandaProductos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.demandaproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.demandaproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDemandaProductos.addColumn(tableColumn);
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
			
			this.jTableDatosDemandaProductos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDemandaProductos && this.isPermisoGuardarCambiosDemandaProductos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDemandaProductos && this.isPermisoGuardarCambiosDemandaProductos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDemandaProductos.moveColumn(this.jTableDatosDemandaProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDemandaProductos.moveColumn(this.jTableDatosDemandaProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDemandaProductos.moveColumn(this.jTableDatosDemandaProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDemandaProductos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDemandaProductos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDemandaProductos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDemandaProductos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDemandaProductos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DemandaProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDemandaProductos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDemandaProductos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDemandaProductos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=demandaproductosLogic.getDemandaProductoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=demandaproductoss.size()-1;
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
		//this.jTableDatosDemandaProductos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDemandaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDemandaProductos();
			
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
				
				//this.isEsNuevoDemandaProductos=false;
					
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
			
				if(this.demandaproductosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDemandaProductos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDemandaProductos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDemandaProductos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.demandaproductos.getsType().equals("DUPLICADO")
				   || this.demandaproductos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDemandaProductos=true;
				
				} else {
					this.isEsNuevoDemandaProductos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
					if(this.demandaproductos.getId()>=0 && !this.demandaproductos.getIsNew()) {						
						this.isEsNuevoDemandaProductos=false;
						
					} else {
						this.isEsNuevoDemandaProductos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDemandaProductos(esRelaciones);						
				
				this.seleccionarDemandaProductos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.demandaproductos.getId()<0) {
					this.isEsNuevoDemandaProductos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDemandaProductos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDemandaProductos(evt,rowIndex);
				}	
				
				if(this.demandaproductosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DemandaProductos: " + this.dDif); 
					}
				}								
				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDemandaProductos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.demandaproductos)) {
					if(this.demandaproductos.getId()>0) {
						this.demandaproductos.setIsDeleted(true);
						
						this.demandaproductossEliminados.add(this.demandaproductos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.demandaproductosLogic.getDemandaProductoss().remove(this.demandaproductos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.demandaproductoss.remove(this.demandaproductos);				
					}
					
					
					((DemandaProductosModel) this.jTableDatosDemandaProductos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDemandaProductos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDemandaProductos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDemandaProductos) {
			
			if(this.jInternalFrameDetalleFormDemandaProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDemandaProductos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDemandaProductos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DemandaProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDemandaProductos(this.demandaproductos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDemandaProductos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDemandaProductos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDemandaProductos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDemandaProductos(DemandaProductos demandaproductos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDemandaProductos(demandaproductos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDemandaProductos(DemandaProductos demandaproductos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDemandaProductos(demandaproductos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDemandaProductos(demandaproductos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDemandaProductos(demandaproductos);
	}
	
	public void setVariablesObjetoActualToFormularioDemandaProductos(DemandaProductos demandaproductos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDemandaProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDemandaProductos.jLabelidDemandaProductos.setText(demandaproductos.getId().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextAreacodigoDemandaProductos.setText(demandaproductos.getcodigo());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldnombre_unidadDemandaProductos.setText(demandaproductos.getnombre_unidad());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcantidad_disponibleDemandaProductos.setText(demandaproductos.getcantidad_disponible().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldstock_minimoDemandaProductos.setText(demandaproductos.getstock_minimo().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcodigo_productoDemandaProductos.setText(demandaproductos.getcodigo_producto());
			this.jInternalFrameDetalleFormDemandaProductos.jTextAreanombreDemandaProductos.setText(demandaproductos.getnombre());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_triDemandaProductos.setText(demandaproductos.getdem_tri().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_biDemandaProductos.setText(demandaproductos.getdem_bi().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_menDemandaProductos.setText(demandaproductos.getdem_men().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldingresosDemandaProductos.setText(demandaproductos.getingresos().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldegresosDemandaProductos.setText(demandaproductos.getegresos().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldexistenciaDemandaProductos.setText(demandaproductos.getexistencia().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcostoDemandaProductos.setText(demandaproductos.getcosto().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DemandaProductos demandaproductosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,demandaproductosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DemandaProductos demandaproductosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				demandaproductosLocal=this.demandaproductos;
			} else {
				demandaproductosLocal=this.demandaproductosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(demandaproductosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDemandaProductos(demandaproductosLocal,true);
					
					if(demandaproductosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(demandaproductosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(demandaproductosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDemandaProductos(DemandaProductos demandaproductos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDemandaProductos(demandaproductos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(demandaproductos);
	}
	
	public void setVariablesFormularioToObjetoActualDemandaProductos(DemandaProductos demandaproductos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDemandaProductos(demandaproductos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDemandaProductos(DemandaProductos demandaproductos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDemandaProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDemandaProductos.jLabelidDemandaProductos.getText()==null || this.jInternalFrameDetalleFormDemandaProductos.jLabelidDemandaProductos.getText()=="" || this.jInternalFrameDetalleFormDemandaProductos.jLabelidDemandaProductos.getText()=="Id") {
				this.jInternalFrameDetalleFormDemandaProductos.jLabelidDemandaProductos.setText("0");
			}

			if(conColumnasBase) {demandaproductos.setId(Long.parseLong(this.jInternalFrameDetalleFormDemandaProductos.jLabelidDemandaProductos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DemandaProductosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabelIdDemandaProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			demandaproductos.setcodigo(this.jInternalFrameDetalleFormDemandaProductos.jTextAreacodigoDemandaProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DemandaProductosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabelcodigoDemandaProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			demandaproductos.setnombre_unidad(this.jInternalFrameDetalleFormDemandaProductos.jTextFieldnombre_unidadDemandaProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DemandaProductosConstantesFunciones.LABEL_NOMBREUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabelnombre_unidadDemandaProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			demandaproductos.setcantidad_disponible(Integer.parseInt(this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcantidad_disponibleDemandaProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DemandaProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabelcantidad_disponibleDemandaProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			demandaproductos.setstock_minimo(Integer.parseInt(this.jInternalFrameDetalleFormDemandaProductos.jTextFieldstock_minimoDemandaProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DemandaProductosConstantesFunciones.LABEL_STOCKMINIMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabelstock_minimoDemandaProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			demandaproductos.setcodigo_producto(this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcodigo_productoDemandaProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DemandaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabelcodigo_productoDemandaProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			demandaproductos.setnombre(this.jInternalFrameDetalleFormDemandaProductos.jTextAreanombreDemandaProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DemandaProductosConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabelnombreDemandaProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			demandaproductos.setdem_tri(Double.parseDouble(this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_triDemandaProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DemandaProductosConstantesFunciones.LABEL_DEMTRI+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabeldem_triDemandaProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			demandaproductos.setdem_bi(Double.parseDouble(this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_biDemandaProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DemandaProductosConstantesFunciones.LABEL_DEMBI+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabeldem_biDemandaProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			demandaproductos.setdem_men(Double.parseDouble(this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_menDemandaProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DemandaProductosConstantesFunciones.LABEL_DEMMEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabeldem_menDemandaProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			demandaproductos.setingresos(Double.parseDouble(this.jInternalFrameDetalleFormDemandaProductos.jTextFieldingresosDemandaProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DemandaProductosConstantesFunciones.LABEL_INGRESOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabelingresosDemandaProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			demandaproductos.setegresos(Double.parseDouble(this.jInternalFrameDetalleFormDemandaProductos.jTextFieldegresosDemandaProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DemandaProductosConstantesFunciones.LABEL_EGRESOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabelegresosDemandaProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			demandaproductos.setexistencia(Double.parseDouble(this.jInternalFrameDetalleFormDemandaProductos.jTextFieldexistenciaDemandaProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DemandaProductosConstantesFunciones.LABEL_EXISTENCIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabelexistenciaDemandaProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			demandaproductos.setcosto(Double.parseDouble(this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcostoDemandaProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DemandaProductosConstantesFunciones.LABEL_COSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDemandaProductos.jLabelcostoDemandaProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDemandaProductos(DemandaProductos demandaproductosBean,DemandaProductos demandaproductos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDemandaProductos(DemandaProductos demandaproductosOrigen,DemandaProductos demandaproductos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && demandaproductosOrigen.getId()!=null && !demandaproductosOrigen.getId().equals(0L))) {demandaproductos.setId(demandaproductosOrigen.getId());}}
			if(conDefault || (!conDefault && demandaproductosOrigen.getfecha_ultima_venta_hasta()!=null && !demandaproductosOrigen.getfecha_ultima_venta_hasta().equals(new Date()))) {demandaproductos.setfecha_ultima_venta_hasta(demandaproductosOrigen.getfecha_ultima_venta_hasta());}
			if(conDefault || (!conDefault && demandaproductosOrigen.getcodigo()!=null && !demandaproductosOrigen.getcodigo().equals(""))) {demandaproductos.setcodigo(demandaproductosOrigen.getcodigo());}
			if(conDefault || (!conDefault && demandaproductosOrigen.getnombre_unidad()!=null && !demandaproductosOrigen.getnombre_unidad().equals(""))) {demandaproductos.setnombre_unidad(demandaproductosOrigen.getnombre_unidad());}
			if(conDefault || (!conDefault && demandaproductosOrigen.getcantidad_disponible()!=null && !demandaproductosOrigen.getcantidad_disponible().equals(0))) {demandaproductos.setcantidad_disponible(demandaproductosOrigen.getcantidad_disponible());}
			if(conDefault || (!conDefault && demandaproductosOrigen.getstock_minimo()!=null && !demandaproductosOrigen.getstock_minimo().equals(0))) {demandaproductos.setstock_minimo(demandaproductosOrigen.getstock_minimo());}
			if(conDefault || (!conDefault && demandaproductosOrigen.getcodigo_producto()!=null && !demandaproductosOrigen.getcodigo_producto().equals(""))) {demandaproductos.setcodigo_producto(demandaproductosOrigen.getcodigo_producto());}
			if(conDefault || (!conDefault && demandaproductosOrigen.getnombre()!=null && !demandaproductosOrigen.getnombre().equals(""))) {demandaproductos.setnombre(demandaproductosOrigen.getnombre());}
			if(conDefault || (!conDefault && demandaproductosOrigen.getdem_tri()!=null && !demandaproductosOrigen.getdem_tri().equals(0.0))) {demandaproductos.setdem_tri(demandaproductosOrigen.getdem_tri());}
			if(conDefault || (!conDefault && demandaproductosOrigen.getdem_bi()!=null && !demandaproductosOrigen.getdem_bi().equals(0.0))) {demandaproductos.setdem_bi(demandaproductosOrigen.getdem_bi());}
			if(conDefault || (!conDefault && demandaproductosOrigen.getdem_men()!=null && !demandaproductosOrigen.getdem_men().equals(0.0))) {demandaproductos.setdem_men(demandaproductosOrigen.getdem_men());}
			if(conDefault || (!conDefault && demandaproductosOrigen.getingresos()!=null && !demandaproductosOrigen.getingresos().equals(0.0))) {demandaproductos.setingresos(demandaproductosOrigen.getingresos());}
			if(conDefault || (!conDefault && demandaproductosOrigen.getegresos()!=null && !demandaproductosOrigen.getegresos().equals(0.0))) {demandaproductos.setegresos(demandaproductosOrigen.getegresos());}
			if(conDefault || (!conDefault && demandaproductosOrigen.getexistencia()!=null && !demandaproductosOrigen.getexistencia().equals(0.0))) {demandaproductos.setexistencia(demandaproductosOrigen.getexistencia());}
			if(conDefault || (!conDefault && demandaproductosOrigen.getcosto()!=null && !demandaproductosOrigen.getcosto().equals(0.0))) {demandaproductos.setcosto(demandaproductosOrigen.getcosto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDemandaProductos(DemandaProductos demandaproductos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDemandaProductos.jLabelidDemandaProductos.setText(demandaproductos.getId().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextAreacodigoDemandaProductos.setText(demandaproductos.getcodigo());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldnombre_unidadDemandaProductos.setText(demandaproductos.getnombre_unidad());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcantidad_disponibleDemandaProductos.setText(demandaproductos.getcantidad_disponible().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldstock_minimoDemandaProductos.setText(demandaproductos.getstock_minimo().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcodigo_productoDemandaProductos.setText(demandaproductos.getcodigo_producto());
			this.jInternalFrameDetalleFormDemandaProductos.jTextAreanombreDemandaProductos.setText(demandaproductos.getnombre());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_triDemandaProductos.setText(demandaproductos.getdem_tri().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_biDemandaProductos.setText(demandaproductos.getdem_bi().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_menDemandaProductos.setText(demandaproductos.getdem_men().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldingresosDemandaProductos.setText(demandaproductos.getingresos().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldegresosDemandaProductos.setText(demandaproductos.getegresos().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldexistenciaDemandaProductos.setText(demandaproductos.getexistencia().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcostoDemandaProductos.setText(demandaproductos.getcosto().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDemandaProductos(DemandaProductosBean demandaproductosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDemandaProductos.jLabelidDemandaProductos.setText(demandaproductosBean.getId().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextAreacodigoDemandaProductos.setText(demandaproductosBean.getcodigo());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldnombre_unidadDemandaProductos.setText(demandaproductosBean.getnombre_unidad());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcantidad_disponibleDemandaProductos.setText(demandaproductosBean.getcantidad_disponible().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldstock_minimoDemandaProductos.setText(demandaproductosBean.getstock_minimo().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcodigo_productoDemandaProductos.setText(demandaproductosBean.getcodigo_producto());
			this.jInternalFrameDetalleFormDemandaProductos.jTextAreanombreDemandaProductos.setText(demandaproductosBean.getnombre());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_triDemandaProductos.setText(demandaproductosBean.getdem_tri().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_biDemandaProductos.setText(demandaproductosBean.getdem_bi().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_menDemandaProductos.setText(demandaproductosBean.getdem_men().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldingresosDemandaProductos.setText(demandaproductosBean.getingresos().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldegresosDemandaProductos.setText(demandaproductosBean.getegresos().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldexistenciaDemandaProductos.setText(demandaproductosBean.getexistencia().toString());
			this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcostoDemandaProductos.setText(demandaproductosBean.getcosto().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDemandaProductos(DemandaProductosParameterReturnGeneral demandaproductosReturnGeneral,DemandaProductosBean demandaproductosBean,Boolean conDefault) throws Exception { 
		try {
			DemandaProductos demandaproductosLocal=new DemandaProductos();
			
			demandaproductosLocal=demandaproductosReturnGeneral.getDemandaProductos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && demandaproductosLocal.getId()!=null && !demandaproductosLocal.getId().equals(0L))) {demandaproductosBean.setId(demandaproductosLocal.getId());}}
			if(conDefault || (!conDefault && demandaproductosLocal.getcodigo()!=null && !demandaproductosLocal.getcodigo().equals(""))) {demandaproductosBean.setcodigo(demandaproductosLocal.getcodigo());}
			if(conDefault || (!conDefault && demandaproductosLocal.getnombre_unidad()!=null && !demandaproductosLocal.getnombre_unidad().equals(""))) {demandaproductosBean.setnombre_unidad(demandaproductosLocal.getnombre_unidad());}
			if(conDefault || (!conDefault && demandaproductosLocal.getcantidad_disponible()!=null && !demandaproductosLocal.getcantidad_disponible().equals(0))) {demandaproductosBean.setcantidad_disponible(demandaproductosLocal.getcantidad_disponible());}
			if(conDefault || (!conDefault && demandaproductosLocal.getstock_minimo()!=null && !demandaproductosLocal.getstock_minimo().equals(0))) {demandaproductosBean.setstock_minimo(demandaproductosLocal.getstock_minimo());}
			if(conDefault || (!conDefault && demandaproductosLocal.getcodigo_producto()!=null && !demandaproductosLocal.getcodigo_producto().equals(""))) {demandaproductosBean.setcodigo_producto(demandaproductosLocal.getcodigo_producto());}
			if(conDefault || (!conDefault && demandaproductosLocal.getnombre()!=null && !demandaproductosLocal.getnombre().equals(""))) {demandaproductosBean.setnombre(demandaproductosLocal.getnombre());}
			if(conDefault || (!conDefault && demandaproductosLocal.getdem_tri()!=null && !demandaproductosLocal.getdem_tri().equals(0.0))) {demandaproductosBean.setdem_tri(demandaproductosLocal.getdem_tri());}
			if(conDefault || (!conDefault && demandaproductosLocal.getdem_bi()!=null && !demandaproductosLocal.getdem_bi().equals(0.0))) {demandaproductosBean.setdem_bi(demandaproductosLocal.getdem_bi());}
			if(conDefault || (!conDefault && demandaproductosLocal.getdem_men()!=null && !demandaproductosLocal.getdem_men().equals(0.0))) {demandaproductosBean.setdem_men(demandaproductosLocal.getdem_men());}
			if(conDefault || (!conDefault && demandaproductosLocal.getingresos()!=null && !demandaproductosLocal.getingresos().equals(0.0))) {demandaproductosBean.setingresos(demandaproductosLocal.getingresos());}
			if(conDefault || (!conDefault && demandaproductosLocal.getegresos()!=null && !demandaproductosLocal.getegresos().equals(0.0))) {demandaproductosBean.setegresos(demandaproductosLocal.getegresos());}
			if(conDefault || (!conDefault && demandaproductosLocal.getexistencia()!=null && !demandaproductosLocal.getexistencia().equals(0.0))) {demandaproductosBean.setexistencia(demandaproductosLocal.getexistencia());}
			if(conDefault || (!conDefault && demandaproductosLocal.getcosto()!=null && !demandaproductosLocal.getcosto().equals(0.0))) {demandaproductosBean.setcosto(demandaproductosLocal.getcosto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDemandaProductosGenerico(Long idDemandaProductosSeleccionado,JComboBox jComboBoxDemandaProductos,List<DemandaProductos> demandaproductossLocal)throws Exception {
		try {
			DemandaProductos  demandaproductosTemp=null;

			for(DemandaProductos demandaproductosAux:demandaproductossLocal) {
				if(demandaproductosAux.getId()!=null && demandaproductosAux.getId().equals(idDemandaProductosSeleccionado)) {
					demandaproductosTemp=demandaproductosAux;
					break;
				}
			}

			jComboBoxDemandaProductos.setSelectedItem(demandaproductosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDemandaProductosGenerico(JComboBox jComboBoxDemandaProductos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDemandaProductos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDemandaProductos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDemandaProductos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDemandaProductos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDemandaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDemandaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			demandaproductos=(DemandaProductos) demandaproductosLogic.getDemandaProductoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			demandaproductos =(DemandaProductos) demandaproductoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!demandaproductos.getIsNew() && !demandaproductos.getIsChanged() && !demandaproductos.getIsDeleted()) {
				sDescripcion=demandaproductos.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=demandaproductos.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!demandaproductos.getIsNew() && !demandaproductos.getIsChanged() && !demandaproductos.getIsDeleted()) {
				sDescripcion=demandaproductos.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=demandaproductos.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!demandaproductos.getIsNew() && !demandaproductos.getIsChanged() && !demandaproductos.getIsDeleted()) {
				sDescripcion=demandaproductos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=demandaproductos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!demandaproductos.getIsNew() && !demandaproductos.getIsChanged() && !demandaproductos.getIsDeleted()) {
				sDescripcion=demandaproductos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=demandaproductos.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!demandaproductos.getIsNew() && !demandaproductos.getIsChanged() && !demandaproductos.getIsDeleted()) {
				sDescripcion=demandaproductos.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=demandaproductos.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!demandaproductos.getIsNew() && !demandaproductos.getIsChanged() && !demandaproductos.getIsDeleted()) {
				sDescripcion=demandaproductos.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=demandaproductos.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!demandaproductos.getIsNew() && !demandaproductos.getIsChanged() && !demandaproductos.getIsDeleted()) {
				sDescripcion=demandaproductos.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=demandaproductos.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!demandaproductos.getIsNew() && !demandaproductos.getIsChanged() && !demandaproductos.getIsDeleted()) {
				sDescripcion=demandaproductos.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=demandaproductos.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DemandaProductos demandaproductosRow=new DemandaProductos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			demandaproductosRow=(DemandaProductos) demandaproductosLogic.getDemandaProductoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			demandaproductosRow=(DemandaProductos) demandaproductoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDemandaProductos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDemandaProductos.setVisible((this.isVisibilidadCeldaNuevoDemandaProductos && this.isPermisoNuevoDemandaProductos));			
			this.jButtonDuplicarDemandaProductos.setVisible((this.isVisibilidadCeldaDuplicarDemandaProductos && this.isPermisoDuplicarDemandaProductos));			
			this.jButtonCopiarDemandaProductos.setVisible((this.isVisibilidadCeldaCopiarDemandaProductos && this.isPermisoCopiarDemandaProductos));
			this.jButtonVerFormDemandaProductos.setVisible((this.isVisibilidadCeldaVerFormDemandaProductos && this.isPermisoVerFormDemandaProductos));
			
			this.jButtonAbrirOrderByDemandaProductos.setVisible((this.isVisibilidadCeldaOrdenDemandaProductos && this.isPermisoOrdenDemandaProductos));			
			
			this.jButtonNuevoRelacionesDemandaProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesDemandaProductos && this.isPermisoNuevoDemandaProductos));			
			this.jButtonNuevoGuardarCambiosDemandaProductos.setVisible((this.isVisibilidadCeldaNuevoDemandaProductos && this.isPermisoNuevoDemandaProductos && this.isPermisoGuardarCambiosDemandaProductos));
			
			if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
			this.jInternalFrameDetalleFormDemandaProductos.jButtonModificarDemandaProductos.setVisible((this.isVisibilidadCeldaModificarDemandaProductos && this.isPermisoActualizarDemandaProductos));	
			this.jInternalFrameDetalleFormDemandaProductos.jButtonActualizarDemandaProductos.setVisible((this.isVisibilidadCeldaActualizarDemandaProductos && this.isPermisoActualizarDemandaProductos));	
			this.jInternalFrameDetalleFormDemandaProductos.jButtonEliminarDemandaProductos.setVisible((this.isVisibilidadCeldaEliminarDemandaProductos && this.isPermisoEliminarDemandaProductos));
			this.jInternalFrameDetalleFormDemandaProductos.jButtonCancelarDemandaProductos.setVisible(this.isVisibilidadCeldaCancelarDemandaProductos);							
			this.jInternalFrameDetalleFormDemandaProductos.jButtonGuardarCambiosDemandaProductos.setVisible((this.isVisibilidadCeldaGuardarDemandaProductos && this.isPermisoGuardarCambiosDemandaProductos));			
			
			}
						
			this.jButtonGuardarCambiosTablaDemandaProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosDemandaProductos && this.isPermisoGuardarCambiosDemandaProductos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDemandaProductos.setVisible((this.isVisibilidadCeldaNuevoDemandaProductos && this.isPermisoNuevoDemandaProductos));						
			this.jButtonDuplicarToolBarDemandaProductos.setVisible((this.isVisibilidadCeldaDuplicarDemandaProductos && this.isPermisoDuplicarDemandaProductos));						
			this.jButtonCopiarToolBarDemandaProductos.setVisible((this.isVisibilidadCeldaCopiarDemandaProductos && this.isPermisoCopiarDemandaProductos));			
			this.jButtonVerFormToolBarDemandaProductos.setVisible((this.isVisibilidadCeldaVerFormDemandaProductos && this.isPermisoVerFormDemandaProductos));			
			this.jButtonAbrirOrderByToolBarDemandaProductos.setVisible((this.isVisibilidadCeldaOrdenDemandaProductos && this.isPermisoOrdenDemandaProductos));
			this.jButtonNuevoRelacionesToolBarDemandaProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesDemandaProductos && this.isPermisoNuevoDemandaProductos));			
			this.jButtonNuevoGuardarCambiosToolBarDemandaProductos.setVisible((this.isVisibilidadCeldaNuevoDemandaProductos && this.isPermisoNuevoDemandaProductos && this.isPermisoGuardarCambiosDemandaProductos));			
			
			if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
			this.jInternalFrameDetalleFormDemandaProductos.jButtonModificarToolBarDemandaProductos.setVisible((this.isVisibilidadCeldaModificarDemandaProductos && this.isPermisoActualizarDemandaProductos));	
			this.jInternalFrameDetalleFormDemandaProductos.jButtonActualizarToolBarDemandaProductos.setVisible((this.isVisibilidadCeldaActualizarDemandaProductos  && this.isPermisoActualizarDemandaProductos));	
			this.jInternalFrameDetalleFormDemandaProductos.jButtonEliminarToolBarDemandaProductos.setVisible((this.isVisibilidadCeldaEliminarDemandaProductos && this.isPermisoEliminarDemandaProductos));
			this.jInternalFrameDetalleFormDemandaProductos.jButtonCancelarToolBarDemandaProductos.setVisible(this.isVisibilidadCeldaCancelarDemandaProductos);				
			this.jInternalFrameDetalleFormDemandaProductos.jButtonGuardarCambiosToolBarDemandaProductos.setVisible((this.isVisibilidadCeldaGuardarDemandaProductos && this.isPermisoGuardarCambiosDemandaProductos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDemandaProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosDemandaProductos && this.isPermisoGuardarCambiosDemandaProductos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDemandaProductos.setVisible((this.isVisibilidadCeldaNuevoDemandaProductos && this.isPermisoNuevoDemandaProductos));			
			this.jMenuItemDuplicarDemandaProductos.setVisible((this.isVisibilidadCeldaDuplicarDemandaProductos && this.isPermisoDuplicarDemandaProductos));			
			this.jMenuItemCopiarDemandaProductos.setVisible((this.isVisibilidadCeldaCopiarDemandaProductos && this.isPermisoCopiarDemandaProductos));			
			this.jMenuItemVerFormDemandaProductos.setVisible((this.isVisibilidadCeldaVerFormDemandaProductos && this.isPermisoVerFormDemandaProductos));			
			this.jMenuItemAbrirOrderByDemandaProductos.setVisible((this.isVisibilidadCeldaOrdenDemandaProductos && this.isPermisoOrdenDemandaProductos));			
			//this.jMenuItemMostrarOcultarDemandaProductos.setVisible((this.isVisibilidadCeldaOrdenDemandaProductos && this.isPermisoOrdenDemandaProductos));
			this.jMenuItemDetalleAbrirOrderByDemandaProductos.setVisible((this.isVisibilidadCeldaOrdenDemandaProductos && this.isPermisoOrdenDemandaProductos));			
			//this.jMenuItemDetalleMostrarOcultarDemandaProductos.setVisible((this.isVisibilidadCeldaOrdenDemandaProductos && this.isPermisoOrdenDemandaProductos));			
			this.jMenuItemNuevoRelacionesDemandaProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesDemandaProductos && this.isPermisoNuevoDemandaProductos));			
			this.jMenuItemNuevoGuardarCambiosDemandaProductos.setVisible((this.isVisibilidadCeldaNuevoDemandaProductos && this.isPermisoNuevoDemandaProductos && this.isPermisoGuardarCambiosDemandaProductos));									
			
			if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
			this.jInternalFrameDetalleFormDemandaProductos.jMenuItemModificarDemandaProductos.setVisible((this.isVisibilidadCeldaModificarDemandaProductos && this.isPermisoActualizarDemandaProductos));	
			this.jInternalFrameDetalleFormDemandaProductos.jMenuItemActualizarDemandaProductos.setVisible((this.isVisibilidadCeldaActualizarDemandaProductos && this.isPermisoActualizarDemandaProductos));	
			this.jInternalFrameDetalleFormDemandaProductos.jMenuItemEliminarDemandaProductos.setVisible((this.isVisibilidadCeldaEliminarDemandaProductos && this.isPermisoEliminarDemandaProductos));
			this.jInternalFrameDetalleFormDemandaProductos.jMenuItemCancelarDemandaProductos.setVisible(this.isVisibilidadCeldaCancelarDemandaProductos);				
			}
			
			this.jMenuItemGuardarCambiosDemandaProductos.setVisible((this.isVisibilidadCeldaGuardarDemandaProductos && this.isPermisoGuardarCambiosDemandaProductos));						
			this.jMenuItemGuardarCambiosTablaDemandaProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosDemandaProductos && this.isPermisoGuardarCambiosDemandaProductos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDemandaProductos=this.jButtonNuevoDemandaProductos.isVisible();
			this.isVisibilidadCeldaDuplicarDemandaProductos=this.jButtonDuplicarDemandaProductos.isVisible();
			this.isVisibilidadCeldaCopiarDemandaProductos=this.jButtonCopiarDemandaProductos.isVisible();
			this.isVisibilidadCeldaVerFormDemandaProductos=this.jButtonVerFormDemandaProductos.isVisible();
			
			this.isVisibilidadCeldaOrdenDemandaProductos=this.jButtonAbrirOrderByDemandaProductos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDemandaProductos=this.jButtonNuevoRelacionesDemandaProductos.isVisible();
			this.isVisibilidadCeldaModificarDemandaProductos=this.jButtonModificarDemandaProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
			this.isVisibilidadCeldaActualizarDemandaProductos=this.jInternalFrameDetalleFormDemandaProductos.jButtonActualizarDemandaProductos.isVisible();
			this.isVisibilidadCeldaEliminarDemandaProductos=this.jInternalFrameDetalleFormDemandaProductos.jButtonEliminarDemandaProductos.isVisible();
			this.isVisibilidadCeldaCancelarDemandaProductos=this.jInternalFrameDetalleFormDemandaProductos.jButtonCancelarDemandaProductos.isVisible();
			this.isVisibilidadCeldaGuardarDemandaProductos=this.jInternalFrameDetalleFormDemandaProductos.jButtonGuardarCambiosDemandaProductos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDemandaProductos=this.jButtonGuardarCambiosTablaDemandaProductos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDemandaProductos=this.jButtonNuevoToolBarDemandaProductos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDemandaProductos=this.jButtonNuevoRelacionesToolBarDemandaProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
			this.isVisibilidadCeldaModificarDemandaProductos=this.jInternalFrameDetalleFormDemandaProductos.jButtonModificarToolBarDemandaProductos.isVisible();
			this.isVisibilidadCeldaActualizarDemandaProductos=this.jInternalFrameDetalleFormDemandaProductos.jButtonActualizarToolBarDemandaProductos.isVisible();
			this.isVisibilidadCeldaEliminarDemandaProductos=this.jInternalFrameDetalleFormDemandaProductos.jButtonEliminarToolBarDemandaProductos.isVisible();
			this.isVisibilidadCeldaCancelarDemandaProductos=this.jInternalFrameDetalleFormDemandaProductos.jButtonCancelarToolBarDemandaProductos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDemandaProductos=this.jButtonGuardarCambiosToolBarDemandaProductos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDemandaProductos=this.jButtonGuardarCambiosTablaToolBarDemandaProductos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDemandaProductos=this.jMenuItemNuevoDemandaProductos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDemandaProductos=this.jMenuItemNuevoRelacionesDemandaProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
			this.isVisibilidadCeldaModificarDemandaProductos=this.jInternalFrameDetalleFormDemandaProductos.jMenuItemModificarDemandaProductos.isVisible();
			this.isVisibilidadCeldaActualizarDemandaProductos=this.jInternalFrameDetalleFormDemandaProductos.jMenuItemActualizarDemandaProductos.isVisible();
			this.isVisibilidadCeldaEliminarDemandaProductos=this.jInternalFrameDetalleFormDemandaProductos.jMenuItemEliminarDemandaProductos.isVisible();
			this.isVisibilidadCeldaCancelarDemandaProductos=this.jInternalFrameDetalleFormDemandaProductos.jMenuItemCancelarDemandaProductos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDemandaProductos=this.jMenuItemGuardarCambiosDemandaProductos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDemandaProductos=this.jMenuItemGuardarCambiosTablaDemandaProductos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDemandaProductos(Boolean esInicializar) {
		if(DemandaProductosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.demandaproductosSessionBean.getConGuardarRelaciones()) {
				//if(this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDemandaProductos();
			}
			
			this.inicializarActualizarBindingBotonesManualDemandaProductos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDemandaProductos() {
		this.jButtonNuevoDemandaProductos.setVisible(this.isPermisoNuevoDemandaProductos);			
		this.jButtonDuplicarDemandaProductos.setVisible(this.isPermisoDuplicarDemandaProductos);			
		this.jButtonCopiarDemandaProductos.setVisible(this.isPermisoCopiarDemandaProductos);			
		this.jButtonVerFormDemandaProductos.setVisible(this.isPermisoVerFormDemandaProductos);			
		
		this.jButtonAbrirOrderByDemandaProductos.setVisible(this.isPermisoOrdenDemandaProductos);					
		
		this.jButtonNuevoRelacionesDemandaProductos.setVisible(this.isPermisoNuevoDemandaProductos);			
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDemandaProductos.jButtonModificarDemandaProductos.setVisible(this.isPermisoActualizarDemandaProductos);	
			this.jInternalFrameDetalleFormDemandaProductos.jButtonActualizarDemandaProductos.setVisible(this.isPermisoActualizarDemandaProductos);	
			this.jInternalFrameDetalleFormDemandaProductos.jButtonEliminarDemandaProductos.setVisible(this.isPermisoEliminarDemandaProductos);
			this.jInternalFrameDetalleFormDemandaProductos.jButtonCancelarDemandaProductos.setVisible(this.isVisibilidadCeldaCancelarDemandaProductos);						
			this.jInternalFrameDetalleFormDemandaProductos.jButtonGuardarCambiosDemandaProductos.setVisible(this.isPermisoGuardarCambiosDemandaProductos);							
		}
		
		this.jButtonGuardarCambiosTablaDemandaProductos.setVisible(this.isPermisoActualizarDemandaProductos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDemandaProductos() {
		this.jInternalFrameDetalleFormDemandaProductos.jButtonModificarDemandaProductos.setVisible(this.isPermisoActualizarDemandaProductos);	
		this.jInternalFrameDetalleFormDemandaProductos.jButtonActualizarDemandaProductos.setVisible(this.isPermisoActualizarDemandaProductos);	
		this.jInternalFrameDetalleFormDemandaProductos.jButtonEliminarDemandaProductos.setVisible(this.isPermisoEliminarDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jButtonCancelarDemandaProductos.setVisible(this.isVisibilidadCeldaCancelarDemandaProductos);							
		this.jInternalFrameDetalleFormDemandaProductos.jButtonGuardarCambiosDemandaProductos.setVisible((this.isVisibilidadCeldaGuardarDemandaProductos && this.isPermisoGuardarCambiosDemandaProductos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDemandaProductos() {
		if(DemandaProductosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDemandaProductos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDemandaProductos() {
	}
	
	public void jTableDatosDemandaProductosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDemandaProductos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.demandaproductos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaDemandaProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebDemandaProductos(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDemandaProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDemandaProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.demandaproductosLogic.getConnexion());

				if(this.demandaproductos.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.demandaproductos.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDemandaProductos=(TitledBorder)this.jScrollPanelDatosDemandaProductos.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderDemandaProductos.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.demandaproductos.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoDemandaProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebDemandaProductos(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDemandaProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDemandaProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.demandaproductosLogic.getConnexion());

				if(this.demandaproductos.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.demandaproductos.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDemandaProductos=(TitledBorder)this.jScrollPanelDatosDemandaProductos.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderDemandaProductos.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.demandaproductos.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDemandaProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDemandaProductos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDemandaProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDemandaProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.demandaproductosLogic.getConnexion());

				if(this.demandaproductos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.demandaproductos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDemandaProductos=(TitledBorder)this.jScrollPanelDatosDemandaProductos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDemandaProductos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.demandaproductos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDemandaProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDemandaProductos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDemandaProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDemandaProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.demandaproductosLogic.getConnexion());

				if(this.demandaproductos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.demandaproductos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDemandaProductos=(TitledBorder)this.jScrollPanelDatosDemandaProductos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDemandaProductos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.demandaproductos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaDemandaProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebDemandaProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDemandaProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDemandaProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.demandaproductosLogic.getConnexion());

				if(this.demandaproductos.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.demandaproductos.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDemandaProductos=(TitledBorder)this.jScrollPanelDatosDemandaProductos.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderDemandaProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.demandaproductos.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoDemandaProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebDemandaProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDemandaProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDemandaProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.demandaproductosLogic.getConnexion());

				if(this.demandaproductos.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.demandaproductos.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDemandaProductos=(TitledBorder)this.jScrollPanelDatosDemandaProductos.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderDemandaProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.demandaproductos.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaDemandaProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebDemandaProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDemandaProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDemandaProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.demandaproductosLogic.getConnexion());

				if(this.demandaproductos.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.demandaproductos.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDemandaProductos=(TitledBorder)this.jScrollPanelDatosDemandaProductos.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderDemandaProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.demandaproductos.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaDemandaProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebDemandaProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDemandaProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDemandaProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.demandaproductosLogic.getConnexion());

				if(this.demandaproductos.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.demandaproductos.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDemandaProductos=(TitledBorder)this.jScrollPanelDatosDemandaProductos.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderDemandaProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.demandaproductos.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ultima_venta_hastaDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getfecha_ultima_venta_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_ultima_venta_hasta = '"+Funciones2.getStringPostgresDate(this.demandaproductos.getfecha_ultima_venta_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.demandaproductos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_unidadDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getnombre_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_unidad like '%"+this.demandaproductos.getnombre_unidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_disponibleDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getcantidad_disponible()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_disponible = "+this.demandaproductos.getcantidad_disponible().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonstock_minimoDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getstock_minimo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where stock_minimo = "+this.demandaproductos.getstock_minimo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_productoDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getcodigo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_producto like '%"+this.demandaproductos.getcodigo_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.demandaproductos.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondem_triDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getdem_tri()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dem_tri = "+this.demandaproductos.getdem_tri().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondem_biDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getdem_bi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dem_bi = "+this.demandaproductos.getdem_bi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondem_menDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getdem_men()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dem_men = "+this.demandaproductos.getdem_men().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoningresosDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getingresos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ingresos = "+this.demandaproductos.getingresos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonegresosDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getegresos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where egresos = "+this.demandaproductos.getegresos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonexistenciaDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getexistencia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where existencia = "+this.demandaproductos.getexistencia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncostoDemandaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.getdemandaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.demandaproductos==null) {
						this.demandaproductos = new DemandaProductos();
					}

					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);
				}

				if(this.demandaproductos.getcosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo = "+this.demandaproductos.getcosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDemandaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaDemandaProductosDemandaProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDemandaProductos(false,false);

			this.getDemandaProductossBusquedaDemandaProductos();

			this.inicializarActualizarBindingDemandaProductos(false);

			//if(DemandaProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDemandaProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaDemandaProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDemandaProductos(false,false);

			this.getDemandaProductossFK_IdBodega();

			this.inicializarActualizarBindingDemandaProductos(false);

			//if(DemandaProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDemandaProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDemandaProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDemandaProductos(false,false);

			this.getDemandaProductossFK_IdEmpresa();

			this.inicializarActualizarBindingDemandaProductos(false);

			//if(DemandaProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDemandaProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaDemandaProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDemandaProductos(false,false);

			this.getDemandaProductossFK_IdLinea();

			this.inicializarActualizarBindingDemandaProductos(false);

			//if(DemandaProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDemandaProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaDemandaProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDemandaProductos(false,false);

			this.getDemandaProductossFK_IdLineaCategoria();

			this.inicializarActualizarBindingDemandaProductos(false);

			//if(DemandaProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDemandaProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoDemandaProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDemandaProductos(false,false);

			this.getDemandaProductossFK_IdLineaGrupo();

			this.inicializarActualizarBindingDemandaProductos(false);

			//if(DemandaProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDemandaProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaDemandaProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDemandaProductos(false,false);

			this.getDemandaProductossFK_IdLineaMarca();

			this.inicializarActualizarBindingDemandaProductos(false);

			//if(DemandaProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDemandaProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoDemandaProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDemandaProductos(false,false);

			this.getDemandaProductossFK_IdProducto();

			this.inicializarActualizarBindingDemandaProductos(false);

			//if(DemandaProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDemandaProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDemandaProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDemandaProductos(false,false);

			this.getDemandaProductossFK_IdSucursal();

			this.inicializarActualizarBindingDemandaProductos(false);

			//if(DemandaProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDemandaProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.demandaproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDemandaProductos() {
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
			this.jInternalFrameDetalleFormDemandaProductos.setVisible(false);	    			
			this.jInternalFrameDetalleFormDemandaProductos.dispose();
			this.jInternalFrameDetalleFormDemandaProductos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDemandaProductos!=null) {
			this.jInternalFrameReporteDinamicoDemandaProductos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDemandaProductos.dispose();
			this.jInternalFrameReporteDinamicoDemandaProductos=null;
		}
		
		if(this.jInternalFrameImportacionDemandaProductos!=null) {
			this.jInternalFrameImportacionDemandaProductos.setVisible(false);	    			
			this.jInternalFrameImportacionDemandaProductos.dispose();
			this.jInternalFrameImportacionDemandaProductos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDemandaProductos();
			
			DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
			
			
			if(sTipo.equals("NuevoDemandaProductos")) {
				jButtonNuevoDemandaProductosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDemandaProductos")) {
				jButtonDuplicarDemandaProductosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDemandaProductos")) {
				jButtonCopiarDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("VerFormDemandaProductos")) {
				jButtonVerFormDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDemandaProductos")) {
				jButtonNuevoDemandaProductosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDemandaProductos")) {
				jButtonDuplicarDemandaProductosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDemandaProductos")) {
				jButtonNuevoDemandaProductosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDemandaProductos")) {
				jButtonDuplicarDemandaProductosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDemandaProductos")) {
				jButtonNuevoDemandaProductosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDemandaProductos")) {
				jButtonNuevoDemandaProductosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDemandaProductos")) {
				jButtonNuevoDemandaProductosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDemandaProductos")) {
				jButtonModificarDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDemandaProductos")) {
				jButtonModificarDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDemandaProductos")) {
				jButtonModificarDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDemandaProductos")) {
				jButtonActualizarDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDemandaProductos")) {
				jButtonActualizarDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDemandaProductos")) {
				jButtonActualizarDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("EliminarDemandaProductos")) {
				jButtonEliminarDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDemandaProductos")) {
				jButtonEliminarDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDemandaProductos")) {
				jButtonEliminarDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("CancelarDemandaProductos")) {
				jButtonCancelarDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDemandaProductos")) {
				jButtonCancelarDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDemandaProductos")) {
				jButtonCancelarDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("CerrarDemandaProductos")) {
				jButtonCerrarDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDemandaProductos")) {
				jButtonCerrarDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDemandaProductos")) {
				jButtonCerrarDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDemandaProductos")) {
				jButtonMostrarOcultarDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDemandaProductos")) {
				jButtonCancelarDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDemandaProductos")) {
				jButtonGuardarCambiosDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDemandaProductos")) {
				jButtonGuardarCambiosDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDemandaProductos")) {
				jButtonCopiarDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDemandaProductos")) {
				jButtonVerFormDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDemandaProductos")) {
				jButtonGuardarCambiosDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDemandaProductos")) {
				jButtonCopiarDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDemandaProductos")) {
				jButtonVerFormDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDemandaProductos")) {
				jButtonGuardarCambiosDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDemandaProductos")) {
				jButtonGuardarCambiosDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDemandaProductos")) {
				jButtonGuardarCambiosDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDemandaProductos")) {
				jButtonRecargarInformacionDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDemandaProductos")) {
				jButtonRecargarInformacionDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDemandaProductos")) {
				jButtonRecargarInformacionDemandaProductosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDemandaProductos")) {
				jButtonAnterioresDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDemandaProductos")) {
				jButtonAnterioresDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDemandaProductos")) {
				jButtonAnterioresDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDemandaProductos")) {
				jButtonSiguientesDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDemandaProductos")) {
				jButtonSiguientesDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDemandaProductos")) {
				jButtonSiguientesDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDemandaProductos") || sTipo.equals("MenuItemDetalleAbrirOrderByDemandaProductos")) {
				jButtonAbrirOrderByDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDemandaProductos") || sTipo.equals("MenuItemDetalleMostrarOcultarDemandaProductos")) {
				jButtonMostrarOcultarDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDemandaProductos")) {
				jButtonNuevoGuardarCambiosDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDemandaProductos")) {
				jButtonNuevoGuardarCambiosDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDemandaProductos")) {
				jButtonNuevoGuardarCambiosDemandaProductosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDemandaProductos")) {
				jButtonCerrarReporteDinamicoDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDemandaProductos")) {
				jButtonGenerarReporteDinamicoDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDemandaProductos")) {
				
				jButtonGenerarExcelReporteDinamicoDemandaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDemandaProductos")) {
				jButtonCerrarImportacionDemandaProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDemandaProductos")) {
				
				jButtonGenerarImportacionDemandaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDemandaProductos")) {
				
				jButtonAbrirImportacionDemandaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDemandaProductos")) {
				jComboBoxTiposAccionesDemandaProductosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDemandaProductos")) {
				jComboBoxTiposRelacionesDemandaProductosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDemandaProductos")) {
				jComboBoxTiposAccionesDemandaProductosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDemandaProductos")) {
				
				jComboBoxTiposSeleccionarDemandaProductosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDemandaProductos")) {
				jTextFieldValorCampoGeneralDemandaProductosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDemandaProductos")) {
				jButtonAbrirOrderByDemandaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDemandaProductos")) {
				jButtonAbrirOrderByDemandaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDemandaProductos")) {
				jButtonCerrarOrderByDemandaProductosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDemandaProductosBusqueda")) {
				this.jButtonidDemandaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaDemandaProductosUpdate")) {
				this.jButtonid_bodegaDemandaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaDemandaProductosBusqueda")) {
				this.jButtonid_bodegaDemandaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoDemandaProductosUpdate")) {
				this.jButtonid_productoDemandaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoDemandaProductosBusqueda")) {
				this.jButtonid_productoDemandaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDemandaProductosUpdate")) {
				this.jButtonid_empresaDemandaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDemandaProductosBusqueda")) {
				this.jButtonid_empresaDemandaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDemandaProductosUpdate")) {
				this.jButtonid_sucursalDemandaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDemandaProductosBusqueda")) {
				this.jButtonid_sucursalDemandaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaDemandaProductosUpdate")) {
				this.jButtonid_lineaDemandaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaDemandaProductosBusqueda")) {
				this.jButtonid_lineaDemandaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoDemandaProductosUpdate")) {
				this.jButtonid_linea_grupoDemandaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoDemandaProductosBusqueda")) {
				this.jButtonid_linea_grupoDemandaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaDemandaProductosUpdate")) {
				this.jButtonid_linea_categoriaDemandaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaDemandaProductosBusqueda")) {
				this.jButtonid_linea_categoriaDemandaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaDemandaProductosUpdate")) {
				this.jButtonid_linea_marcaDemandaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaDemandaProductosBusqueda")) {
				this.jButtonid_linea_marcaDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultima_venta_hastaDemandaProductosBusqueda")) {
				this.jButtonfecha_ultima_venta_hastaDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoDemandaProductosBusqueda")) {
				this.jButtoncodigoDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadDemandaProductosBusqueda")) {
				this.jButtonnombre_unidadDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_disponibleDemandaProductosBusqueda")) {
				this.jButtoncantidad_disponibleDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("stock_minimoDemandaProductosBusqueda")) {
				this.jButtonstock_minimoDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoDemandaProductosBusqueda")) {
				this.jButtoncodigo_productoDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDemandaProductosBusqueda")) {
				this.jButtonnombreDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dem_triDemandaProductosBusqueda")) {
				this.jButtondem_triDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dem_biDemandaProductosBusqueda")) {
				this.jButtondem_biDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dem_menDemandaProductosBusqueda")) {
				this.jButtondem_menDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingresosDemandaProductosBusqueda")) {
				this.jButtoningresosDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("egresosDemandaProductosBusqueda")) {
				this.jButtonegresosDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("existenciaDemandaProductosBusqueda")) {
				this.jButtonexistenciaDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoDemandaProductosBusqueda")) {
				this.jButtoncostoDemandaProductosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaDemandaProductosDemandaProductos")) {
				this.jButtonBusquedaDemandaProductosDemandaProductosActionPerformed(evt);
			}
			
			;
			
			
			DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDemandaProductos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDemandaProductosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.demandaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.demandaproductos);
				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
				
				


				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DemandaProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DemandaProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DemandaProductos demandaproductosLocal=null;
			
			if(!this.getEsControlTabla()) {
				demandaproductosLocal=this.demandaproductos;
			} else {
				demandaproductosLocal=this.demandaproductosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.demandaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.demandaproductos);
				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
							
				
				


				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DemandaProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DemandaProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDemandaProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosAnterior =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.demandaproductosAnterior =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
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
			
			DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
			
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
			
			


			
			DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDemandaProductosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.demandaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.demandaproductos);
				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
								
						
				


				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DemandaProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DemandaProductos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.demandaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.demandaproductos);
				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
								
				
				


				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DemandaProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DemandaProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDemandaProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosAnterior =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.demandaproductosAnterior =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.demandaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.demandaproductos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDemandaProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosAnterior =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.demandaproductosAnterior =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDemandaProductosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.demandaproductos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.demandaproductos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.demandaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.demandaproductos);
				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
							
				
				


				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DemandaProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DemandaProductos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDemandaProductosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductosAnterior =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.demandaproductosAnterior =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
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
			
			DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
			
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
			
			


			
			DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDemandaProductosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.demandaproductos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.demandaproductos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.demandaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.demandaproductos);
				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
								
				
				


				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DemandaProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DemandaProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDemandaProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosAnterior =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.demandaproductosAnterior =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDemandaProductosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.demandaproductos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.demandaproductos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDemandaProductosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.demandaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.demandaproductos);
				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDemandaProductos")) {
					jCheckBoxSeleccionarTodosDemandaProductosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDemandaProductos")) {
					jCheckBoxSeleccionadosDemandaProductosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDemandaProductos")) {
					
				}
				
				


				
				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DemandaProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DemandaProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.demandaproductos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.demandaproductos);
				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
												
				
				


				
				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DemandaProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DemandaProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDemandaProductosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.demandaproductosAnterior =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.demandaproductosAnterior =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDemandaProductosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.demandaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.demandaproductos);
				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
				
				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
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
			
			DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
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
			
			


			
			DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDemandaProductosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.demandaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.demandaproductos);
				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DemandaProductos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DemandaProductos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.demandaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.demandaproductos);
				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
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
				
				


				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DemandaProductos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DemandaProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDemandaProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.demandaproductosAnterior =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.demandaproductosAnterior =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDemandaProductos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDemandaProductosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDemandaProductos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.demandaproductos =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.demandaproductos =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.demandaproductos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDemandaProductos")) {
				
				}
				
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDemandaProductos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDemandaProductos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDemandaProductos")) {
			
			}
			
			DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDemandaProductos();
			
			DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
			
			if(sTipo.equals("NuevoDemandaProductos")) {
				jButtonNuevoDemandaProductosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDemandaProductos")) {
				jButtonDuplicarDemandaProductosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDemandaProductos")) {
				jButtonCopiarDemandaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDemandaProductos")) {
				jButtonVerFormDemandaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDemandaProductos")) {
				jButtonNuevoDemandaProductosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDemandaProductos")) {
				jButtonModificarDemandaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDemandaProductos")) {
				jButtonActualizarDemandaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDemandaProductos")) {
				jButtonEliminarDemandaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDemandaProductos")) {
				jButtonGuardarCambiosDemandaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDemandaProductos")) {
				jButtonCancelarDemandaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDemandaProductos")) {
				jButtonCerrarDemandaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDemandaProductos")) {
				jButtonGuardarCambiosDemandaProductosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDemandaProductos")) {
				jButtonNuevoGuardarCambiosDemandaProductosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDemandaProductos")) {
				jButtonAbrirOrderByDemandaProductosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDemandaProductos")) {
				jButtonRecargarInformacionDemandaProductosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDemandaProductos")) {
				jButtonAnterioresDemandaProductosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDemandaProductos")) {
				jButtonSiguientesDemandaProductosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDemandaProductosBusqueda")) {
				this.jButtonidDemandaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaDemandaProductosUpdate")) {
				this.jButtonid_bodegaDemandaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaDemandaProductosBusqueda")) {
				this.jButtonid_bodegaDemandaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoDemandaProductosUpdate")) {
				this.jButtonid_productoDemandaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoDemandaProductosBusqueda")) {
				this.jButtonid_productoDemandaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDemandaProductosUpdate")) {
				this.jButtonid_empresaDemandaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDemandaProductosBusqueda")) {
				this.jButtonid_empresaDemandaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDemandaProductosUpdate")) {
				this.jButtonid_sucursalDemandaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDemandaProductosBusqueda")) {
				this.jButtonid_sucursalDemandaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaDemandaProductosUpdate")) {
				this.jButtonid_lineaDemandaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaDemandaProductosBusqueda")) {
				this.jButtonid_lineaDemandaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoDemandaProductosUpdate")) {
				this.jButtonid_linea_grupoDemandaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoDemandaProductosBusqueda")) {
				this.jButtonid_linea_grupoDemandaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaDemandaProductosUpdate")) {
				this.jButtonid_linea_categoriaDemandaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaDemandaProductosBusqueda")) {
				this.jButtonid_linea_categoriaDemandaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaDemandaProductosUpdate")) {
				this.jButtonid_linea_marcaDemandaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaDemandaProductosBusqueda")) {
				this.jButtonid_linea_marcaDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultima_venta_hastaDemandaProductosBusqueda")) {
				this.jButtonfecha_ultima_venta_hastaDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoDemandaProductosBusqueda")) {
				this.jButtoncodigoDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadDemandaProductosBusqueda")) {
				this.jButtonnombre_unidadDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_disponibleDemandaProductosBusqueda")) {
				this.jButtoncantidad_disponibleDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("stock_minimoDemandaProductosBusqueda")) {
				this.jButtonstock_minimoDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoDemandaProductosBusqueda")) {
				this.jButtoncodigo_productoDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDemandaProductosBusqueda")) {
				this.jButtonnombreDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dem_triDemandaProductosBusqueda")) {
				this.jButtondem_triDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dem_biDemandaProductosBusqueda")) {
				this.jButtondem_biDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dem_menDemandaProductosBusqueda")) {
				this.jButtondem_menDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingresosDemandaProductosBusqueda")) {
				this.jButtoningresosDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("egresosDemandaProductosBusqueda")) {
				this.jButtonegresosDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("existenciaDemandaProductosBusqueda")) {
				this.jButtonexistenciaDemandaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoDemandaProductosBusqueda")) {
				this.jButtoncostoDemandaProductosBusquedaActionPerformed(evt);
			}
			
			DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDemandaProductos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDemandaProductos")) {
				closingInternalFrameDemandaProductos();
				
			} else if(sTipo.equals("jButtonCancelarDemandaProductos")) {
				JInternalFrameBase jInternalFrameDetalleFormDemandaProductos = (JInternalFrameBase)evt.getSource();
	            	
	            DemandaProductosBeanSwingJInternalFrame jInternalFrameParent=(DemandaProductosBeanSwingJInternalFrame)jInternalFrameDetalleFormDemandaProductos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDemandaProductosActionPerformed(null);
			}
			
			DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.demandaproductos,new Object(),this.demandaproductosParameterGeneral,this.demandaproductosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDemandaProductos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDemandaProductos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDemandaProductos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.demandaproductos)) {
			if(!esControlTabla) {
				if(DemandaProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);			
				}
				
				if(this.demandaproductosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDemandaProductos(this.demandaproductos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDemandaProductos(this.demandaproductosReturnGeneral,this.demandaproductosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.demandaproductosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDemandaProductos(classes,this.demandaproductosReturnGeneral,this.demandaproductosBean,false);
					}
						
					if(this.demandaproductosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDemandaProductos(this.demandaproductosReturnGeneral.getDemandaProductos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDemandaProductos(this.demandaproductosReturnGeneral.getDemandaProductos());	
					}
						
					if(this.demandaproductosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDemandaProductos(this.demandaproductosReturnGeneral.getDemandaProductos(),classes);//this.demandaproductosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDemandaProductos(this.demandaproductos,classes);//this.demandaproductosBean);									
				}
			
				if(DemandaProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDemandaProductos(this.demandaproductos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDemandaProductos(this.demandaproductos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.demandaproductosAnterior!=null) {
						this.demandaproductos=this.demandaproductosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.demandaproductosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.demandaproductosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.demandaproductosReturnGeneral.getDemandaProductos(),demandaproductosLogic.getDemandaProductoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.demandaproductosReturnGeneral.getDemandaProductos(),this.demandaproductoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDemandaProductos.repaint();
				
				//((AbstractTableModel) this.jTableDatosDemandaProductos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDemandaProductos();
			}
		}
	}
	
	public void actualizarVisualTableDatosDemandaProductos() throws Exception {
		
		DemandaProductosModel demandaproductosModel=(DemandaProductosModel)this.jTableDatosDemandaProductos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			demandaproductosModel.demandaproductoss=this.demandaproductosLogic.getDemandaProductoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			demandaproductosModel.demandaproductoss=this.demandaproductoss;
		}
		
		
		((DemandaProductosModel) this.jTableDatosDemandaProductos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDemandaProductos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdemandaproductosAnterior(),this.demandaproductosLogic.getDemandaProductoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdemandaproductosAnterior(),this.demandaproductoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDemandaProductos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDemandaProductos(DemandaProductos demandaproductos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
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
										
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.demandaproductos,new Object(),generalEntityParameterGeneral,this.demandaproductosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.demandaproductosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DemandaProductosConstantesFunciones.getClassesRelationshipsOfDemandaProductos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DemandaProductosConstantesFunciones.getClassesRelationshipsFromStringsOfDemandaProductos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDemandaProductos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DemandaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.demandaproductos,new Object(),generalEntityParameterGeneral,this.demandaproductosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDemandaProductos(DemandaProductosBean demandaproductosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDemandaProductos(ArrayList<Classe> classes,DemandaProductosReturnGeneral demandaproductosReturnGeneral,DemandaProductosBean demandaproductosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDemandaProductos(DemandaProductos demandaproductos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.demandaproductos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDemandaProductos = new DemandaProductosDetalleFormJInternalFrame(jDesktopPane,this.demandaproductosSessionBean.getConGuardarRelaciones(),this.demandaproductosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.setVisible(false);
		this.jInternalFrameDetalleFormDemandaProductos.setSelected(false);						
		
		this.jInternalFrameDetalleFormDemandaProductos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDemandaProductos.demandaproductosLogic=this.demandaproductosLogic;
		
		this.cargarCombosFrameForeignKeyDemandaProductos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDemandaProductos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDemandaProductos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDemandaProductos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDemandaProductos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDemandaProductos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDemandaProductos"));
		
		this.jInternalFrameDetalleFormDemandaProductos.jButtonModificarDemandaProductos.addActionListener(new ButtonActionListener(this,"ModificarDemandaProductos"));

		
		this.jInternalFrameDetalleFormDemandaProductos.jButtonModificarToolBarDemandaProductos.addActionListener(new ButtonActionListener(this,"ModificarToolBarDemandaProductos"));
					
		this.jInternalFrameDetalleFormDemandaProductos.jMenuItemModificarDemandaProductos.addActionListener(new ButtonActionListener(this,"MenuItemModificarDemandaProductos"));		
		
		
		
		this.jInternalFrameDetalleFormDemandaProductos.jButtonActualizarDemandaProductos.addActionListener (new ButtonActionListener(this,"ActualizarDemandaProductos"));
		
		
		this.jInternalFrameDetalleFormDemandaProductos.jButtonActualizarToolBarDemandaProductos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDemandaProductos"));
						
		this.jInternalFrameDetalleFormDemandaProductos.jMenuItemActualizarDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDemandaProductos"));		
		
		
		
		this.jInternalFrameDetalleFormDemandaProductos.jButtonEliminarDemandaProductos.addActionListener (new ButtonActionListener(this,"EliminarDemandaProductos"));
		
		
		this.jInternalFrameDetalleFormDemandaProductos.jButtonEliminarToolBarDemandaProductos.addActionListener (new ButtonActionListener(this,"EliminarToolBarDemandaProductos"));
								
		this.jInternalFrameDetalleFormDemandaProductos.jMenuItemEliminarDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDemandaProductos"));		
		
		
		
		this.jInternalFrameDetalleFormDemandaProductos.jButtonCancelarDemandaProductos.addActionListener (new ButtonActionListener(this,"CancelarDemandaProductos"));
		
		
		this.jInternalFrameDetalleFormDemandaProductos.jButtonCancelarToolBarDemandaProductos.addActionListener (new ButtonActionListener(this,"CancelarToolBarDemandaProductos"));
					
		this.jInternalFrameDetalleFormDemandaProductos.jMenuItemCancelarDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDemandaProductos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDemandaProductos.jMenuItemDetalleCerrarDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDemandaProductos"));		
		
		
		
		this.jInternalFrameDetalleFormDemandaProductos.jButtonGuardarCambiosToolBarDemandaProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDemandaProductos"));
		
		
		
		this.jInternalFrameDetalleFormDemandaProductos.jButtonGuardarCambiosToolBarDemandaProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDemandaProductos"));
		
		
		
		this.jInternalFrameDetalleFormDemandaProductos.jComboBoxTiposAccionesFormularioDemandaProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDemandaProductos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonidDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"idDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_bodegaDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_bodegaDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_productoDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_productoDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_productoDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_empresaDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_empresaDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_sucursalDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_sucursalDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_lineaDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_lineaDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_linea_grupoDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_linea_grupoDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_linea_categoriaDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_linea_categoriaDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_linea_marcaDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_linea_marcaDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonfecha_ultima_venta_hastaDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultima_venta_hastaDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtoncodigoDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigoDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonnombre_unidadDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtoncantidad_disponibleDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_disponibleDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonstock_minimoDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"stock_minimoDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtoncodigo_productoDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonnombreDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombreDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtondem_triDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"dem_triDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtondem_biDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"dem_biDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtondem_menDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"dem_menDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtoningresosDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"ingresosDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonegresosDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"egresosDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonexistenciaDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"existenciaDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtoncostoDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"costoDemandaProductosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDemandaProductos.jTabbedPaneRelacionesDemandaProductos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDemandaProductos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDemandaProductos"));
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDemandaProductos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDemandaProductos"));
		}
		
		this.jTableDatosDemandaProductos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDemandaProductos"));
		
		this.jTableDatosDemandaProductos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDemandaProductos"));
		
		this.jButtonNuevoDemandaProductos.addActionListener(new ButtonActionListener(this,"NuevoDemandaProductos"));
		
		this.jButtonDuplicarDemandaProductos.addActionListener(new ButtonActionListener(this,"DuplicarDemandaProductos"));
		
		this.jButtonCopiarDemandaProductos.addActionListener(new ButtonActionListener(this,"CopiarDemandaProductos"));
		
		this.jButtonVerFormDemandaProductos.addActionListener(new ButtonActionListener(this,"VerFormDemandaProductos"));
		
		
		this.jButtonNuevoToolBarDemandaProductos.addActionListener(new ButtonActionListener(this,"NuevoToolBarDemandaProductos"));
			
		this.jButtonDuplicarToolBarDemandaProductos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDemandaProductos"));
			
		this.jMenuItemNuevoDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDemandaProductos"));
			
		this.jMenuItemDuplicarDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDemandaProductos"));		
		
		
		this.jButtonNuevoRelacionesDemandaProductos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDemandaProductos"));
		
		
		this.jButtonNuevoRelacionesToolBarDemandaProductos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDemandaProductos"));
			
		this.jMenuItemNuevoRelacionesDemandaProductos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDemandaProductos"));		
		
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDemandaProductos.jButtonModificarDemandaProductos.addActionListener(new ButtonActionListener(this,"ModificarDemandaProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDemandaProductos.jButtonModificarToolBarDemandaProductos.addActionListener(new ButtonActionListener(this,"ModificarToolBarDemandaProductos"));
			
			this.jInternalFrameDetalleFormDemandaProductos.jMenuItemModificarDemandaProductos.addActionListener(new ButtonActionListener(this,"MenuItemModificarDemandaProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDemandaProductos.jButtonActualizarDemandaProductos.addActionListener (new ButtonActionListener(this,"ActualizarDemandaProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDemandaProductos.jButtonActualizarToolBarDemandaProductos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDemandaProductos"));
				
			this.jInternalFrameDetalleFormDemandaProductos.jMenuItemActualizarDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDemandaProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDemandaProductos.jButtonEliminarDemandaProductos.addActionListener (new ButtonActionListener(this,"EliminarDemandaProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDemandaProductos.jButtonEliminarToolBarDemandaProductos.addActionListener (new ButtonActionListener(this,"EliminarToolBarDemandaProductos"));
						
			this.jInternalFrameDetalleFormDemandaProductos.jMenuItemEliminarDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDemandaProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDemandaProductos.jButtonCancelarDemandaProductos.addActionListener (new ButtonActionListener(this,"CancelarDemandaProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDemandaProductos.jButtonCancelarToolBarDemandaProductos.addActionListener (new ButtonActionListener(this,"CancelarToolBarDemandaProductos"));
			
			this.jInternalFrameDetalleFormDemandaProductos.jMenuItemCancelarDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDemandaProductos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDemandaProductos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDemandaProductos"));		
		
		
		this.jButtonCerrarDemandaProductos.addActionListener (new ButtonActionListener(this,"CerrarDemandaProductos"));
		
		
		this.jButtonCerrarToolBarDemandaProductos.addActionListener (new ButtonActionListener(this,"CerrarToolBarDemandaProductos"));
			
		this.jMenuItemCerrarDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDemandaProductos"));
			
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDemandaProductos.jMenuItemDetalleCerrarDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDemandaProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDemandaProductos.jButtonGuardarCambiosDemandaProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosDemandaProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDemandaProductos.jButtonGuardarCambiosToolBarDemandaProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDemandaProductos"));
		}
		
		this.jButtonCopiarToolBarDemandaProductos.addActionListener (new ButtonActionListener(this,"CopiarToolBarDemandaProductos"));
			
		this.jButtonVerFormToolBarDemandaProductos.addActionListener (new ButtonActionListener(this,"VerFormToolBarDemandaProductos"));
		
		this.jMenuItemGuardarCambiosDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDemandaProductos"));
			
		this.jMenuItemCopiarDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDemandaProductos"));		
		
		this.jMenuItemVerFormDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDemandaProductos"));		
		
		
		this.jButtonGuardarCambiosTablaDemandaProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDemandaProductos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDemandaProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDemandaProductos"));
			
		this.jMenuItemGuardarCambiosTablaDemandaProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDemandaProductos"));		
		
		
		
		this.jButtonRecargarInformacionDemandaProductos.addActionListener (new ButtonActionListener(this,"RecargarInformacionDemandaProductos"));
					
		this.jButtonRecargarInformacionToolBarDemandaProductos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDemandaProductos"));
		
		this.jMenuItemRecargarInformacionDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDemandaProductos"));		
		
		
		
		this.jButtonAnterioresDemandaProductos.addActionListener (new ButtonActionListener(this,"AnterioresDemandaProductos"));
		
		
		this.jButtonAnterioresToolBarDemandaProductos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDemandaProductos"));
		
		this.jMenuItemAnterioresDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDemandaProductos"));		
		
		
		this.jButtonSiguientesDemandaProductos.addActionListener (new ButtonActionListener(this,"SiguientesDemandaProductos"));
		
		
		this.jButtonSiguientesToolBarDemandaProductos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDemandaProductos"));
			
		this.jMenuItemSiguientesDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDemandaProductos"));
			
		this.jMenuItemAbrirOrderByDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDemandaProductos"));
			
		this.jMenuItemMostrarOcultarDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDemandaProductos"));
			
		this.jMenuItemDetalleAbrirOrderByDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDemandaProductos"));
			
		this.jMenuItemDetalleMostarOcultarDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDemandaProductos"));		
		
		
		this.jButtonNuevoGuardarCambiosDemandaProductos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDemandaProductos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDemandaProductos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDemandaProductos"));
			
		this.jMenuItemNuevoGuardarCambiosDemandaProductos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDemandaProductos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDemandaProductos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDemandaProductos"));

		this.jCheckBoxSeleccionadosDemandaProductos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDemandaProductos"));
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDemandaProductos.jComboBoxTiposAccionesFormularioDemandaProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDemandaProductos"));
		}
		
		
		this.jComboBoxTiposRelacionesDemandaProductos.addActionListener (new ButtonActionListener(this,"TiposRelacionesDemandaProductos"));
			
		this.jComboBoxTiposAccionesDemandaProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesDemandaProductos"));
					
		this.jComboBoxTiposSeleccionarDemandaProductos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDemandaProductos"));
			
		this.jTextFieldValorCampoGeneralDemandaProductos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDemandaProductos"));		
		
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonidDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"idDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_bodegaDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_bodegaDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_productoDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_productoDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_productoDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_empresaDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_empresaDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_sucursalDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_sucursalDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_lineaDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_lineaDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_linea_grupoDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_linea_grupoDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_linea_categoriaDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_linea_categoriaDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_linea_marcaDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_linea_marcaDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonfecha_ultima_venta_hastaDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultima_venta_hastaDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtoncodigoDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigoDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonnombre_unidadDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtoncantidad_disponibleDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_disponibleDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonstock_minimoDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"stock_minimoDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtoncodigo_productoDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonnombreDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombreDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtondem_triDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"dem_triDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtondem_biDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"dem_biDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtondem_menDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"dem_menDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtoningresosDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"ingresosDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonegresosDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"egresosDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonexistenciaDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"existenciaDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtoncostoDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"costoDemandaProductosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaDemandaProductosDemandaProductos.addActionListener(new ButtonActionListener(this,"BusquedaDemandaProductosDemandaProductos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDemandaProductos!=null) {
				this.jInternalFrameReporteDinamicoDemandaProductos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDemandaProductos"));
				this.jInternalFrameReporteDinamicoDemandaProductos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDemandaProductos"));
				this.jInternalFrameReporteDinamicoDemandaProductos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDemandaProductos"));
			}
			
			//this.jButtonCerrarReporteDinamicoDemandaProductos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDemandaProductos"));				
			//this.jButtonGenerarReporteDinamicoDemandaProductos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDemandaProductos"));
			//this.jButtonGenerarExcelReporteDinamicoDemandaProductos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDemandaProductos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDemandaProductos!=null) {
				this.jInternalFrameImportacionDemandaProductos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDemandaProductos"));
				this.jInternalFrameImportacionDemandaProductos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDemandaProductos"));
				this.jInternalFrameImportacionDemandaProductos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDemandaProductos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDemandaProductos.addActionListener (new ButtonActionListener(this,"AbrirOrderByDemandaProductos"));
			
			this.jButtonAbrirOrderByToolBarDemandaProductos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDemandaProductos"));			
			
			if(this.jInternalFrameOrderByDemandaProductos!=null) {
				this.jInternalFrameOrderByDemandaProductos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDemandaProductos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDemandaProductos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDemandaProductos.jTabbedPaneRelacionesDemandaProductos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDemandaProductos"));
		
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
            		closingInternalFrameDemandaProductos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDemandaProductos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDemandaProductos = (JInternalFrameBase)event.getSource();
	            	
	            DemandaProductosBeanSwingJInternalFrame jInternalFrameParent=(DemandaProductosBeanSwingJInternalFrame)jInternalFrameDetalleFormDemandaProductos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDemandaProductosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDemandaProductos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDemandaProductosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDemandaProductos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDemandaProductos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDemandaProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDemandaProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDemandaProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDemandaProductos";
		inputMap = this.jButtonNuevoDemandaProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDemandaProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDemandaProductosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDemandaProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDemandaProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDemandaProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDemandaProductos";
		inputMap = this.jButtonNuevoRelacionesDemandaProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDemandaProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDemandaProductosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDemandaProductos";
		inputMap = this.jButtonModificarDemandaProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDemandaProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDemandaProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDemandaProductos";
		inputMap = this.jButtonActualizarDemandaProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDemandaProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDemandaProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDemandaProductos";
		inputMap = this.jButtonEliminarDemandaProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDemandaProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDemandaProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDemandaProductos";
		inputMap = this.jButtonCancelarDemandaProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDemandaProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDemandaProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDemandaProductos";
		inputMap = this.jButtonCerrarDemandaProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDemandaProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDemandaProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDemandaProductos.jButtonGuardarCambiosDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDemandaProductos";
		inputMap = this.jInternalFrameDetalleFormDemandaProductos.jButtonGuardarCambiosDemandaProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDemandaProductos.jButtonGuardarCambiosDemandaProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDemandaProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDemandaProductos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDemandaProductosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDemandaProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDemandaProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDemandaProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDemandaProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDemandaProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDemandaProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonidDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"idDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_bodegaDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_bodegaDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_productoDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_productoDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_productoDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_empresaDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_empresaDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_sucursalDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_sucursalDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_lineaDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_lineaDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_linea_grupoDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_linea_grupoDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_linea_categoriaDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_linea_categoriaDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaDemandaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_linea_marcaDemandaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaDemandaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonid_linea_marcaDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonfecha_ultima_venta_hastaDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultima_venta_hastaDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtoncodigoDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigoDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonnombre_unidadDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtoncantidad_disponibleDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_disponibleDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonstock_minimoDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"stock_minimoDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtoncodigo_productoDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonnombreDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombreDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtondem_triDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"dem_triDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtondem_biDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"dem_biDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtondem_menDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"dem_menDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtoningresosDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"ingresosDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonegresosDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"egresosDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtonexistenciaDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"existenciaDemandaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDemandaProductos.jButtoncostoDemandaProductosBusqueda.addActionListener(new ButtonActionListener(this,"costoDemandaProductosBusqueda"));
		
		
		this.jButtonBusquedaDemandaProductosDemandaProductos.addActionListener(new ButtonActionListener(this,"BusquedaDemandaProductosDemandaProductos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDemandaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDemandaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDemandaProductosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDemandaProductos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDemandaProductos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DemandaProductos demandaproductosAux:this.demandaproductosLogic.getDemandaProductoss()) {
					demandaproductosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DemandaProductos demandaproductosAux:demandaproductoss) {
					demandaproductosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDemandaProductosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDemandaProductos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DemandaProductos demandaproductosAux:this.demandaproductosLogic.getDemandaProductoss()) {
						demandaproductosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DemandaProductos demandaproductosAux:demandaproductoss) {
						demandaproductosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DemandaProductos demandaproductosAux:this.demandaproductosLogic.getDemandaProductoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DemandaProductos demandaproductosAux:demandaproductoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDemandaProductos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDemandaProductos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDemandaProductos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDemandaProductosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDemandaProductos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDemandaProductos.getSelectedRows();
			
			DemandaProductos demandaproductosLocal=new DemandaProductos();
			
			//this.seleccionarTodosDemandaProductos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					demandaproductosLocal =(DemandaProductos) this.demandaproductosLogic.getDemandaProductoss().toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					demandaproductosLocal =(DemandaProductos) this.demandaproductoss.toArray()[this.jTableDatosDemandaProductos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				demandaproductosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DemandaProductos demandaproductosAux:this.demandaproductosLogic.getDemandaProductoss()) {
						demandaproductosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DemandaProductos demandaproductosAux:demandaproductoss) {
						demandaproductosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDemandaProductos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDemandaProductos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDemandaProductos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDemandaProductos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDemandaProductosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDemandaProductosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDemandaProductosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDemandaProductos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDemandaProductos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DemandaProductos demandaproductosAux:this.demandaproductosLogic.getDemandaProductoss()) {
				
						if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA)) {
							existe=true;
							demandaproductosAux.setfecha_ultima_venta_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							demandaproductosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							demandaproductosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE)) {
							existe=true;
							demandaproductosAux.setcantidad_disponible(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_STOCKMINIMO)) {
							existe=true;
							demandaproductosAux.setstock_minimo(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							demandaproductosAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							demandaproductosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_DEMTRI)) {
							existe=true;
							demandaproductosAux.setdem_tri(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_DEMBI)) {
							existe=true;
							demandaproductosAux.setdem_bi(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_DEMMEN)) {
							existe=true;
							demandaproductosAux.setdem_men(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_INGRESOS)) {
							existe=true;
							demandaproductosAux.setingresos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_EGRESOS)) {
							existe=true;
							demandaproductosAux.setegresos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_EXISTENCIA)) {
							existe=true;
							demandaproductosAux.setexistencia(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							demandaproductosAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DemandaProductos demandaproductosAux:demandaproductoss) {
					
						if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA)) {
							existe=true;
							demandaproductosAux.setfecha_ultima_venta_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							demandaproductosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							demandaproductosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE)) {
							existe=true;
							demandaproductosAux.setcantidad_disponible(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_STOCKMINIMO)) {
							existe=true;
							demandaproductosAux.setstock_minimo(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							demandaproductosAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							demandaproductosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_DEMTRI)) {
							existe=true;
							demandaproductosAux.setdem_tri(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_DEMBI)) {
							existe=true;
							demandaproductosAux.setdem_bi(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_DEMMEN)) {
							existe=true;
							demandaproductosAux.setdem_men(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_INGRESOS)) {
							existe=true;
							demandaproductosAux.setingresos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_EGRESOS)) {
							existe=true;
							demandaproductosAux.setegresos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_EXISTENCIA)) {
							existe=true;
							demandaproductosAux.setexistencia(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							demandaproductosAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDemandaProductos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDemandaProductosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDemandaProductos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDemandaProductos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDemandaProductos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDemandaProductos.jComboBoxTiposAccionesFormularioDemandaProductos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDemandaProductos) {				
					conSplash=true;//false;										
					
					//this.startProcessDemandaProductos(conSplash);
				
					this.generarReporteDemandaProductossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDemandaProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDemandaProductos.jComboBoxTiposAccionesFormularioDemandaProductos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDemandaProductossSeleccionados();
				//this.jComboBoxTiposAccionesDemandaProductos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDemandaProductossSeleccionados(false);
				//this.jComboBoxTiposAccionesDemandaProductos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDemandaProductossSeleccionados(true);
				//this.jComboBoxTiposAccionesDemandaProductos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDemandaProductos();
				
				this.exportarDemandaProductossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDemandaProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDemandaProductos.jComboBoxTiposAccionesFormularioDemandaProductos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDemandaProductoss();
				//this.importarDemandaProductoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDemandaProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDemandaProductos.jComboBoxTiposAccionesFormularioDemandaProductos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDemandaProductos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDemandaProductossSeleccionados();
				//this.jComboBoxTiposAccionesDemandaProductos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Demanda Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDemandaProductos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDemandaProductos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDemandaProductos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Demanda Productos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDemandaProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDemandaProductos.jComboBoxTiposAccionesFormularioDemandaProductos.setSelectedIndex(0);					
				}	
			} 			
			else if(DemandaProductosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDemandaProductos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDemandaProductos(conSplash);
					
						//this.actualizarParametrosGeneralDemandaProductos();
						
						this.generarReporteProcesoAccionDemandaProductossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDemandaProductos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDemandaProductos.jComboBoxTiposAccionesFormularioDemandaProductos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DemandaProductosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Demanda ProductosES SELECCIONADOS?", "MANTENIMIENTO DE Demanda Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDemandaProductos();
				
						this.actualizarParametrosGeneralDemandaProductos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.demandaproductosReturnGeneral=demandaproductosLogic.procesarAccionDemandaProductossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.demandaproductosLogic.getDemandaProductoss(),this.demandaproductosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDemandaProductosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDemandaProductos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDemandaProductos.jComboBoxTiposAccionesFormularioDemandaProductos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDemandaProductos();
					
					DemandaProductosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDemandaProductosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDemandaProductos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDemandaProductos.jComboBoxTiposAccionesFormularioDemandaProductos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDemandaProductos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDemandaProductosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDemandaProductos();
			
			if(this.jInternalFrameDetalleFormDemandaProductos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DemandaProductos> demandaproductossSeleccionados=new ArrayList<DemandaProductos>();		
			DemandaProductos demandaproductos=new DemandaProductos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDemandaProductos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDemandaProductos.getSelectedItem();
			
			
			
			
			demandaproductossSeleccionados=this.getDemandaProductossSeleccionados(true);
			//this.sTipoAccion;
			
			if(demandaproductossSeleccionados.size()==1) {
				for(DemandaProductos demandaproductosAux:demandaproductossSeleccionados) {
					demandaproductos=demandaproductosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDemandaProductos();
			
      		//this.finishProcessDemandaProductos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDemandaProductosReturnGeneral() throws Exception {
		if(this.demandaproductosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.demandaproductosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.demandaproductosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.demandaproductosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.demandaproductosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.demandaproductosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDemandaProductos(false);
		}
		
		if(this.demandaproductosReturnGeneral.getConRetornoLista() || this.demandaproductosReturnGeneral.getConRetornoObjeto()) {
			if(this.demandaproductosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.demandaproductosLogic.setDemandaProductoss(this.demandaproductosReturnGeneral.getDemandaProductoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingDemandaProductos(false);
		}
	}
	
	public void actualizarParametrosGeneralDemandaProductos() throws Exception {
		
		
	}
	
	public ArrayList<DemandaProductos> getDemandaProductossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DemandaProductos> demandaproductossSeleccionados=new ArrayList<DemandaProductos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDemandaProductos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DemandaProductos demandaproductosAux:demandaproductosLogic.getDemandaProductoss()) {
					if(demandaproductosAux.getIsSelected()) {
						demandaproductossSeleccionados.add(demandaproductosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DemandaProductos demandaproductosAux:this.demandaproductoss) {
					if(demandaproductosAux.getIsSelected()) {
						demandaproductossSeleccionados.add(demandaproductosAux);				
					}
				}
			}
			
			if(demandaproductossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						demandaproductossSeleccionados.addAll(this.demandaproductosLogic.getDemandaProductoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						demandaproductossSeleccionados.addAll(this.demandaproductoss);				
					}
				}
			}
		} else {
			demandaproductossSeleccionados.add(this.demandaproductos);
		}
		
		return demandaproductossSeleccionados;
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
	
	public void generarReporteDemandaProductossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDemandaProductossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDemandaProductossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDemandaProductossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDemandaProductossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Demanda Productos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDemandaProductossSeleccionados() throws Exception {
		ArrayList<DemandaProductos> demandaproductossSeleccionados=new ArrayList<DemandaProductos>();		
		
		demandaproductossSeleccionados=this.getDemandaProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDemandaProductoss("Todos",demandaproductossSeleccionados);
		
	}	
	
	public void generarReporteNormalDemandaProductossSeleccionados() throws Exception {
		ArrayList<DemandaProductos> demandaproductossSeleccionados=new ArrayList<DemandaProductos>();		
		
		demandaproductossSeleccionados=this.getDemandaProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDemandaProductoss("Todos",demandaproductossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDemandaProductossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DemandaProductos> demandaproductossSeleccionados=new ArrayList<DemandaProductos>();
		
		demandaproductossSeleccionados=this.getDemandaProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDemandaProductoss("Todos",demandaproductossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDemandaProductossSeleccionados() throws Exception {
		ArrayList<DemandaProductos> demandaproductossSeleccionados=new ArrayList<DemandaProductos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDemandaProductos();
		
		
		demandaproductossSeleccionados=this.getDemandaProductossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDemandaProductos();
		
		
		//this.generarReporteDemandaProductoss("Todos",demandaproductossSeleccionados ,demandaproductosImplementable,demandaproductosImplementableHome);
	}
	
	public void mostrarImportacionDemandaProductoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDemandaProductos();
		
		this.abrirFrameImportacionDemandaProductos();		
		
			
		//this.generarReporteDemandaProductoss("Todos",demandaproductossSeleccionados ,demandaproductosImplementable,demandaproductosImplementableHome);
	}
	
	public void importarDemandaProductoss() throws Exception {		
	
	}
	
	public void exportarDemandaProductossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDemandaProductossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDemandaProductossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDemandaProductossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Demanda Productos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDemandaProductossSeleccionados() throws Exception {
		ArrayList<DemandaProductos> demandaproductossSeleccionados=new ArrayList<DemandaProductos>();		
		
		demandaproductossSeleccionados=this.getDemandaProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"demandaproductos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDemandaProductos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DemandaProductos demandaproductosAux:demandaproductossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDemandaProductos(demandaproductosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//demandaproductosAux.setsDetalleGeneralEntityReporte(demandaproductosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.demandaproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Demanda Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDemandaProductos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_NOMBREUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_STOCKMINIMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_DEMTRI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_DEMBI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_DEMMEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_INGRESOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_EGRESOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_EXISTENCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DemandaProductosConstantesFunciones.LABEL_COSTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDemandaProductos(DemandaProductos demandaproductos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=demandaproductos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getfecha_ultima_venta_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getnombre_unidad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getcantidad_disponible().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getstock_minimo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getcodigo_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getdem_tri().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getdem_bi().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getdem_men().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getingresos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getegresos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getexistencia().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=demandaproductos.getcosto().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDemandaProductossSeleccionados() throws Exception {
		ArrayList<DemandaProductos> demandaproductossSeleccionados=new ArrayList<DemandaProductos>();		
		
		demandaproductossSeleccionados=this.getDemandaProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"demandaproductos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DemandaProductoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDemandaProductos(row);				
				iRow++;
			}				
			
			for(DemandaProductos demandaproductosAux:demandaproductossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDemandaProductos(demandaproductosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.demandaproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Demanda Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDemandaProductossSeleccionados() throws Exception {
		ArrayList<DemandaProductos> demandaproductossSeleccionados=new ArrayList<DemandaProductos>();		
		
		demandaproductossSeleccionados=this.getDemandaProductossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"demandaproductos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("demandaproductoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("demandaproductos");
			//elementRoot.appendChild(element);
		
			for(DemandaProductos demandaproductosAux:demandaproductossSeleccionados) {
				element = document.createElement("demandaproductos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDemandaProductos(demandaproductosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.demandaproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Demanda Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDemandaProductos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_NOMBREUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_STOCKMINIMO);
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_DEMTRI);
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_DEMBI);
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_DEMMEN);
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_INGRESOS);
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_EGRESOS);
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_EXISTENCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(DemandaProductosConstantesFunciones.LABEL_COSTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDemandaProductos(DemandaProductos demandaproductos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getfecha_ultima_venta_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getnombre_unidad());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getcantidad_disponible());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getstock_minimo());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getcodigo_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getdem_tri());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getdem_bi());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getdem_men());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getingresos());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getegresos());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getexistencia());
		cell = row.createCell(iColumn++);cell.setCellValue(demandaproductos.getcosto());				
	}
	
	public void setFilaDatosExportarXmlDemandaProductos(DemandaProductos demandaproductos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DemandaProductosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(demandaproductos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DemandaProductosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(demandaproductos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementbodega_descripcion = document.createElement(DemandaProductosConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(demandaproductos.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(DemandaProductosConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(demandaproductos.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementempresa_descripcion = document.createElement(DemandaProductosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(demandaproductos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DemandaProductosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(demandaproductos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementlinea_descripcion = document.createElement(DemandaProductosConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(demandaproductos.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(DemandaProductosConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(demandaproductos.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(DemandaProductosConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(demandaproductos.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(DemandaProductosConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(demandaproductos.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementfecha_ultima_venta_hasta = document.createElement(DemandaProductosConstantesFunciones.FECHAULTIMAVENTAHASTA);
		elementfecha_ultima_venta_hasta.appendChild(document.createTextNode(demandaproductos.getfecha_ultima_venta_hasta().toString().trim()));
		element.appendChild(elementfecha_ultima_venta_hasta);

		Element elementcodigo = document.createElement(DemandaProductosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(demandaproductos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_unidad = document.createElement(DemandaProductosConstantesFunciones.NOMBREUNIDAD);
		elementnombre_unidad.appendChild(document.createTextNode(demandaproductos.getnombre_unidad().trim()));
		element.appendChild(elementnombre_unidad);

		Element elementcantidad_disponible = document.createElement(DemandaProductosConstantesFunciones.CANTIDADDISPONIBLE);
		elementcantidad_disponible.appendChild(document.createTextNode(demandaproductos.getcantidad_disponible().toString().trim()));
		element.appendChild(elementcantidad_disponible);

		Element elementstock_minimo = document.createElement(DemandaProductosConstantesFunciones.STOCKMINIMO);
		elementstock_minimo.appendChild(document.createTextNode(demandaproductos.getstock_minimo().toString().trim()));
		element.appendChild(elementstock_minimo);

		Element elementcodigo_producto = document.createElement(DemandaProductosConstantesFunciones.CODIGOPRODUCTO);
		elementcodigo_producto.appendChild(document.createTextNode(demandaproductos.getcodigo_producto().trim()));
		element.appendChild(elementcodigo_producto);

		Element elementnombre = document.createElement(DemandaProductosConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(demandaproductos.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdem_tri = document.createElement(DemandaProductosConstantesFunciones.DEMTRI);
		elementdem_tri.appendChild(document.createTextNode(demandaproductos.getdem_tri().toString().trim()));
		element.appendChild(elementdem_tri);

		Element elementdem_bi = document.createElement(DemandaProductosConstantesFunciones.DEMBI);
		elementdem_bi.appendChild(document.createTextNode(demandaproductos.getdem_bi().toString().trim()));
		element.appendChild(elementdem_bi);

		Element elementdem_men = document.createElement(DemandaProductosConstantesFunciones.DEMMEN);
		elementdem_men.appendChild(document.createTextNode(demandaproductos.getdem_men().toString().trim()));
		element.appendChild(elementdem_men);

		Element elementingresos = document.createElement(DemandaProductosConstantesFunciones.INGRESOS);
		elementingresos.appendChild(document.createTextNode(demandaproductos.getingresos().toString().trim()));
		element.appendChild(elementingresos);

		Element elementegresos = document.createElement(DemandaProductosConstantesFunciones.EGRESOS);
		elementegresos.appendChild(document.createTextNode(demandaproductos.getegresos().toString().trim()));
		element.appendChild(elementegresos);

		Element elementexistencia = document.createElement(DemandaProductosConstantesFunciones.EXISTENCIA);
		elementexistencia.appendChild(document.createTextNode(demandaproductos.getexistencia().toString().trim()));
		element.appendChild(elementexistencia);

		Element elementcosto = document.createElement(DemandaProductosConstantesFunciones.COSTO);
		elementcosto.appendChild(document.createTextNode(demandaproductos.getcosto().toString().trim()));
		element.appendChild(elementcosto);
	}
	
	public void generarReporteGroupGenericoDemandaProductossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DemandaProductos> demandaproductossSeleccionados=new ArrayList<DemandaProductos>();
		
		demandaproductossSeleccionados=this.getDemandaProductossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDemandaProductos(demandaproductossSeleccionados);
		
		this.generarReporteDemandaProductoss("Todos",demandaproductossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDemandaProductos(ArrayList<DemandaProductos> demandaproductossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DemandaProductos demandaproductosAux:demandaproductossSeleccionados) {
				demandaproductosAux.setsDetalleGeneralEntityReporte(demandaproductosAux.toString());
			
				if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					demandaproductosAux.setsDescripcionGeneralEntityReporte1(demandaproductosAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					demandaproductosAux.setsDescripcionGeneralEntityReporte1(demandaproductosAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					demandaproductosAux.setsDescripcionGeneralEntityReporte1(demandaproductosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					demandaproductosAux.setsDescripcionGeneralEntityReporte1(demandaproductosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					demandaproductosAux.setsDescripcionGeneralEntityReporte1(demandaproductosAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					demandaproductosAux.setsDescripcionGeneralEntityReporte1(demandaproductosAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					demandaproductosAux.setsDescripcionGeneralEntityReporte1(demandaproductosAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					demandaproductosAux.setsDescripcionGeneralEntityReporte1(demandaproductosAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA)) {
					existe=true;
					demandaproductosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(demandaproductosAux.getfecha_ultima_venta_hasta()));
				}
				 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					demandaproductosAux.setsDescripcionGeneralEntityReporte1(demandaproductosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
					existe=true;
					demandaproductosAux.setsDescripcionGeneralEntityReporte1(demandaproductosAux.getnombre_unidad());
				}
				 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE)) {
					existe=true;
					demandaproductosAux.setsDescripcionGeneralEntityReporte1(demandaproductosAux.getcantidad_disponible().toString());
				}
				 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_STOCKMINIMO)) {
					existe=true;
					demandaproductosAux.setsDescripcionGeneralEntityReporte1(demandaproductosAux.getstock_minimo().toString());
				}
				 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
					existe=true;
					demandaproductosAux.setsDescripcionGeneralEntityReporte1(demandaproductosAux.getcodigo_producto());
				}
				 else if(sTipoSeleccionar.equals(DemandaProductosConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					demandaproductosAux.setsDescripcionGeneralEntityReporte1(demandaproductosAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DemandaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDemandaProductos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDemandaProductos=true;
				this.isVisibilidadCeldaNuevoRelacionesDemandaProductos=true;
				this.isVisibilidadCeldaGuardarCambiosDemandaProductos=true;
			}
			
			this.isVisibilidadCeldaModificarDemandaProductos=false;
			this.isVisibilidadCeldaActualizarDemandaProductos=false;
			this.isVisibilidadCeldaEliminarDemandaProductos=false;
			this.isVisibilidadCeldaCancelarDemandaProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDemandaProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarDemandaProductos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDemandaProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesDemandaProductos=false;
			this.isVisibilidadCeldaGuardarCambiosDemandaProductos=false;
			this.isVisibilidadCeldaModificarDemandaProductos=false;
			this.isVisibilidadCeldaActualizarDemandaProductos=true;
			this.isVisibilidadCeldaEliminarDemandaProductos=false;
			this.isVisibilidadCeldaCancelarDemandaProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDemandaProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarDemandaProductos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDemandaProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesDemandaProductos=false;
			this.isVisibilidadCeldaGuardarCambiosDemandaProductos=false;
			this.isVisibilidadCeldaModificarDemandaProductos=false;
			this.isVisibilidadCeldaActualizarDemandaProductos=true;
			this.isVisibilidadCeldaEliminarDemandaProductos=true;
			this.isVisibilidadCeldaCancelarDemandaProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDemandaProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarDemandaProductos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDemandaProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesDemandaProductos=false;
			this.isVisibilidadCeldaGuardarCambiosDemandaProductos=false;
			this.isVisibilidadCeldaModificarDemandaProductos=false;
			this.isVisibilidadCeldaActualizarDemandaProductos=true;
			this.isVisibilidadCeldaEliminarDemandaProductos=false;
			this.isVisibilidadCeldaCancelarDemandaProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDemandaProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarDemandaProductos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDemandaProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesDemandaProductos=true;
			this.isVisibilidadCeldaGuardarCambiosDemandaProductos=true;
			this.isVisibilidadCeldaModificarDemandaProductos=false;
			this.isVisibilidadCeldaActualizarDemandaProductos=false;
			this.isVisibilidadCeldaEliminarDemandaProductos=false;
			this.isVisibilidadCeldaCancelarDemandaProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDemandaProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarDemandaProductos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDemandaProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesDemandaProductos=false;
			this.isVisibilidadCeldaGuardarCambiosDemandaProductos=false;
			this.isVisibilidadCeldaActualizarDemandaProductos=false;
			this.isVisibilidadCeldaEliminarDemandaProductos=false;
			this.isVisibilidadCeldaCancelarDemandaProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDemandaProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarDemandaProductos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDemandaProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesDemandaProductos=false;
			this.isVisibilidadCeldaGuardarCambiosDemandaProductos=false;
			this.isVisibilidadCeldaModificarDemandaProductos=true;
			this.isVisibilidadCeldaActualizarDemandaProductos=false;
			this.isVisibilidadCeldaEliminarDemandaProductos=false;
			this.isVisibilidadCeldaCancelarDemandaProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDemandaProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarDemandaProductos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DemandaProductosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDemandaProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesDemandaProductos=true;
			this.isVisibilidadCeldaGuardarCambiosDemandaProductos=true;
		} else {
			this.actualizarEstadoPanelsDemandaProductos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDemandaProductos=false;
			//this.isVisibilidadCeldaVerFormDemandaProductos=false;
			this.isVisibilidadCeldaDuplicarDemandaProductos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!demandaproductosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDemandaProductos=false;
		} else {
			this.isVisibilidadCeldaNuevoDemandaProductos=false;
			this.isVisibilidadCeldaGuardarCambiosDemandaProductos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(demandaproductosSessionBean.getEsGuardarRelacionado()) {
			if(!demandaproductosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDemandaProductos=false;												
			}
			
			this.jButtonCerrarDemandaProductos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDemandaProductos=false;
		}
		
		if(!this.permiteMantenimiento(this.demandaproductos)) {
			this.isVisibilidadCeldaActualizarDemandaProductos=false;
			this.isVisibilidadCeldaEliminarDemandaProductos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoDemandaProductos=false;
		this.isVisibilidadCeldaNuevoRelacionesDemandaProductos=false;
		this.isVisibilidadCeldaGuardarCambiosDemandaProductos=false;
		//this.isVisibilidadCeldaModificarDemandaProductos=true;
		this.isVisibilidadCeldaActualizarDemandaProductos=false;
		this.isVisibilidadCeldaEliminarDemandaProductos=false;
		//this.isVisibilidadCeldaCancelarDemandaProductos=true;			
		this.isVisibilidadCeldaGuardarDemandaProductos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDemandaProductos() {
	}
	
	public void actualizarEstadoPanelsDemandaProductos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDemandaProductos!=null) {
				this.jScrollPanelDatosEdicionDemandaProductos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDemandaProductos!=null) {
				this.jTabbedPaneBusquedasDemandaProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDemandaProductos!=null) {
				this.jScrollPanelDatosDemandaProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionDemandaProductos!=null) {
				this.jPanelPaginacionDemandaProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDemandaProductos!=null) {
				this.jPanelParametrosReportesDemandaProductos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDemandaProductos!=null) {
				this.jScrollPanelDatosEdicionDemandaProductos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDemandaProductos!=null) {
				this.jTabbedPaneBusquedasDemandaProductos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDemandaProductos!=null) {
				this.jScrollPanelDatosDemandaProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionDemandaProductos!=null) {
				this.jPanelPaginacionDemandaProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDemandaProductos!=null) {
				this.jPanelParametrosReportesDemandaProductos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDemandaProductos!=null) {
				this.jScrollPanelDatosEdicionDemandaProductos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDemandaProductos!=null) {
				this.jTabbedPaneBusquedasDemandaProductos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDemandaProductos!=null) {
				this.jScrollPanelDatosDemandaProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionDemandaProductos!=null) {
				this.jPanelPaginacionDemandaProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDemandaProductos!=null) {
				this.jPanelParametrosReportesDemandaProductos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDemandaProductos!=null) {
				this.jScrollPanelDatosEdicionDemandaProductos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDemandaProductos!=null) {
				this.jTabbedPaneBusquedasDemandaProductos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDemandaProductos!=null) {
				this.jScrollPanelDatosDemandaProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionDemandaProductos!=null) {
				this.jPanelPaginacionDemandaProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDemandaProductos!=null) {
				this.jPanelParametrosReportesDemandaProductos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDemandaProductos!=null) {
				this.jScrollPanelDatosEdicionDemandaProductos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDemandaProductos!=null) {
				this.jTabbedPaneBusquedasDemandaProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDemandaProductos!=null) {
				this.jScrollPanelDatosDemandaProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionDemandaProductos!=null) {
				this.jPanelPaginacionDemandaProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDemandaProductos!=null) {
				this.jPanelParametrosReportesDemandaProductos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDemandaProductos!=null) {
				this.jScrollPanelDatosEdicionDemandaProductos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDemandaProductos!=null) {
				this.jTabbedPaneBusquedasDemandaProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDemandaProductos!=null) {
				this.jScrollPanelDatosDemandaProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionDemandaProductos!=null) {
				this.jPanelPaginacionDemandaProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDemandaProductos!=null) {
				this.jPanelParametrosReportesDemandaProductos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDemandaProductos!=null) {
				this.jScrollPanelDatosEdicionDemandaProductos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDemandaProductos!=null) {
				this.jTabbedPaneBusquedasDemandaProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDemandaProductos!=null) {
				this.jScrollPanelDatosDemandaProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionDemandaProductos!=null) {
				this.jPanelPaginacionDemandaProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDemandaProductos!=null) {
				this.jPanelParametrosReportesDemandaProductos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDemandaProductos!=null) {
					this.jTabbedPaneBusquedasDemandaProductos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDemandaProductos!=null) {
				this.jPanelParametrosReportesDemandaProductos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.demandaproductosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDemandaProductos!=null) {
				this.jTabbedPaneBusquedasDemandaProductos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDemandaProductos!=null) {
				this.jPanelParametrosReportesDemandaProductos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadBusquedaDemandaProductos=isParaBodega;
			if(!this.isVisibilidadBusquedaDemandaProductos) {this.jTabbedPaneBusquedasDemandaProductos.remove(jPanelBusquedaDemandaProductosDemandaProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaDemandaProductos=isParaProducto;
			if(!this.isVisibilidadBusquedaDemandaProductos) {this.jTabbedPaneBusquedasDemandaProductos.remove(jPanelBusquedaDemandaProductosDemandaProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaDemandaProductos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaDemandaProductos) {this.jTabbedPaneBusquedasDemandaProductos.remove(jPanelBusquedaDemandaProductosDemandaProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaDemandaProductos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaDemandaProductos) {this.jTabbedPaneBusquedasDemandaProductos.remove(jPanelBusquedaDemandaProductosDemandaProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaDemandaProductos=isParaLinea;
			if(!this.isVisibilidadBusquedaDemandaProductos) {this.jTabbedPaneBusquedasDemandaProductos.remove(jPanelBusquedaDemandaProductosDemandaProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaDemandaProductos=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaDemandaProductos) {this.jTabbedPaneBusquedasDemandaProductos.remove(jPanelBusquedaDemandaProductosDemandaProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaDemandaProductos=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaDemandaProductos) {this.jTabbedPaneBusquedasDemandaProductos.remove(jPanelBusquedaDemandaProductosDemandaProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaDemandaProductos=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaDemandaProductos) {this.jTabbedPaneBusquedasDemandaProductos.remove(jPanelBusquedaDemandaProductosDemandaProductos);}
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
			
			this.inicializarActualizarBindingTablaDemandaProductos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDemandaProductos() {
		this.updateBorderResaltarBusquedasFormularioDemandaProductos();
		this.updateVisibilidadBusquedasFormularioDemandaProductos();
		this.updateHabilitarBusquedasFormularioDemandaProductos();
	}
	
	public void updateBorderResaltarBusquedasFormularioDemandaProductos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDemandaProductos.getComponents().length>0) {
	

		if(this.demandaproductosConstantesFunciones.resaltarBusquedaDemandaProductosDemandaProductos!=null) {
			index= this.jTabbedPaneBusquedasDemandaProductos.indexOfComponent(this.jPanelBusquedaDemandaProductosDemandaProductos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDemandaProductos.getComponent(index);
				jPanel.setBorder(this.demandaproductosConstantesFunciones.resaltarBusquedaDemandaProductosDemandaProductos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDemandaProductos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDemandaProductos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDemandaProductos.indexOfComponent(this.jPanelBusquedaDemandaProductosDemandaProductos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDemandaProductos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.demandaproductosConstantesFunciones.mostrarBusquedaDemandaProductosDemandaProductos);
			if(!this.demandaproductosConstantesFunciones.mostrarBusquedaDemandaProductosDemandaProductos && index>-1) {
				this.jTabbedPaneBusquedasDemandaProductos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDemandaProductos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDemandaProductos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDemandaProductos.indexOfComponent(this.jPanelBusquedaDemandaProductosDemandaProductos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDemandaProductos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.demandaproductosConstantesFunciones.activarBusquedaDemandaProductosDemandaProductos);
				this.jTabbedPaneBusquedasDemandaProductos.setEnabledAt(index,this.demandaproductosConstantesFunciones.activarBusquedaDemandaProductosDemandaProductos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDemandaProductos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaDemandaProductos")) {
			index= this.jTabbedPaneBusquedasDemandaProductos.indexOfComponent(this.jPanelBusquedaDemandaProductosDemandaProductos);

			this.jTabbedPaneBusquedasDemandaProductos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDemandaProductos.getComponent(index);

			this.demandaproductosConstantesFunciones.setResaltarBusquedaDemandaProductosDemandaProductos(resaltar);

			jPanel.setBorder(this.demandaproductosConstantesFunciones.resaltarBusquedaDemandaProductosDemandaProductos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDemandaProductos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDemandaProductos() throws Exception {

		if(this.jInternalFrameDetalleFormDemandaProductos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDemandaProductos();
		this.updateVisibilidadResaltarControlesFormularioDemandaProductos();
		this.updateHabilitarResaltarControlesFormularioDemandaProductos();
		
	}
	
	public void updateBorderResaltarControlesFormularioDemandaProductos() throws Exception {
		if(this.jInternalFrameDetalleFormDemandaProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.demandaproductosConstantesFunciones.resaltaridDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jLabelidDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltaridDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltarid_bodegaDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_bodegaDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltarid_bodegaDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltarid_productoDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_productoDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltarid_productoDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltarid_empresaDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_empresaDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltarid_empresaDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltarid_sucursalDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_sucursalDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltarid_sucursalDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltarid_lineaDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_lineaDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltarid_lineaDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltarid_linea_grupoDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_grupoDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltarid_linea_grupoDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltarid_linea_categoriaDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_categoriaDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltarid_linea_categoriaDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltarid_linea_marcaDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_marcaDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltarid_linea_marcaDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltarfecha_ultima_venta_hastaDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jDateChooserfecha_ultima_venta_hastaDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltarfecha_ultima_venta_hastaDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltarcodigoDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jTextAreacodigoDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltarcodigoDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltarnombre_unidadDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jTextFieldnombre_unidadDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltarnombre_unidadDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltarcantidad_disponibleDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcantidad_disponibleDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltarcantidad_disponibleDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltarstock_minimoDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jTextFieldstock_minimoDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltarstock_minimoDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltarcodigo_productoDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcodigo_productoDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltarcodigo_productoDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltarnombreDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jTextAreanombreDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltarnombreDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltardem_triDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_triDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltardem_triDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltardem_biDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_biDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltardem_biDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltardem_menDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_menDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltardem_menDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltaringresosDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jTextFieldingresosDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltaringresosDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltaregresosDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jTextFieldegresosDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltaregresosDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltarexistenciaDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jTextFieldexistenciaDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltarexistenciaDemandaProductos);}
		if(this.demandaproductosConstantesFunciones.resaltarcostoDemandaProductos!=null && this.jInternalFrameDetalleFormDemandaProductos!=null) {this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcostoDemandaProductos.setBorder(this.demandaproductosConstantesFunciones.resaltarcostoDemandaProductos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDemandaProductos() throws Exception {		
		if(this.jInternalFrameDetalleFormDemandaProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
	
		//this.jInternalFrameDetalleFormDemandaProductos.jLabelidDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostraridDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPanelidDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostraridDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_bodegaDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarid_bodegaDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPanelid_bodegaDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarid_bodegaDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_productoDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarid_productoDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPanelid_productoDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarid_productoDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_empresaDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarid_empresaDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPanelid_empresaDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarid_empresaDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_sucursalDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarid_sucursalDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPanelid_sucursalDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarid_sucursalDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_lineaDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarid_lineaDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPanelid_lineaDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarid_lineaDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_grupoDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarid_linea_grupoDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPanelid_linea_grupoDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarid_linea_grupoDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_categoriaDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarid_linea_categoriaDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPanelid_linea_categoriaDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarid_linea_categoriaDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_marcaDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarid_linea_marcaDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPanelid_linea_marcaDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarid_linea_marcaDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jDateChooserfecha_ultima_venta_hastaDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarfecha_ultima_venta_hastaDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPanelfecha_ultima_venta_hastaDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarfecha_ultima_venta_hastaDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jTextAreacodigoDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarcodigoDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPanelcodigoDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarcodigoDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jTextFieldnombre_unidadDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarnombre_unidadDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPanelnombre_unidadDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarnombre_unidadDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcantidad_disponibleDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarcantidad_disponibleDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPanelcantidad_disponibleDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarcantidad_disponibleDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jTextFieldstock_minimoDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarstock_minimoDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPanelstock_minimoDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarstock_minimoDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcodigo_productoDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarcodigo_productoDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPanelcodigo_productoDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarcodigo_productoDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jTextAreanombreDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarnombreDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPanelnombreDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarnombreDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_triDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrardem_triDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPaneldem_triDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrardem_triDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_biDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrardem_biDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPaneldem_biDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrardem_biDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_menDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrardem_menDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPaneldem_menDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrardem_menDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jTextFieldingresosDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostraringresosDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPanelingresosDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostraringresosDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jTextFieldegresosDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostraregresosDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPanelegresosDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostraregresosDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jTextFieldexistenciaDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarexistenciaDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPanelexistenciaDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarexistenciaDemandaProductos);
		//this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcostoDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarcostoDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jPanelcostoDemandaProductos.setVisible(this.demandaproductosConstantesFunciones.mostrarcostoDemandaProductos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDemandaProductos() throws Exception {
		if(this.jInternalFrameDetalleFormDemandaProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDemandaProductos!=null) {
	
		this.jInternalFrameDetalleFormDemandaProductos.jLabelidDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activaridDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_bodegaDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activarid_bodegaDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_productoDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activarid_productoDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_empresaDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activarid_empresaDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_sucursalDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activarid_sucursalDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_lineaDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activarid_lineaDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_grupoDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activarid_linea_grupoDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_categoriaDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activarid_linea_categoriaDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jComboBoxid_linea_marcaDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activarid_linea_marcaDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jDateChooserfecha_ultima_venta_hastaDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activarfecha_ultima_venta_hastaDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextAreacodigoDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activarcodigoDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFieldnombre_unidadDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activarnombre_unidadDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcantidad_disponibleDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activarcantidad_disponibleDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFieldstock_minimoDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activarstock_minimoDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcodigo_productoDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activarcodigo_productoDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextAreanombreDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activarnombreDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_triDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activardem_triDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_biDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activardem_biDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFielddem_menDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activardem_menDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFieldingresosDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activaringresosDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFieldegresosDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activaregresosDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFieldexistenciaDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activarexistenciaDemandaProductos);
		this.jInternalFrameDetalleFormDemandaProductos.jTextFieldcostoDemandaProductos.setEnabled(this.demandaproductosConstantesFunciones.activarcostoDemandaProductos);
		}
	}
	
		
}