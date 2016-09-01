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

//import com.bydan.erp.inventario.util.DisponiblesCostosConstantesFunciones;
import com.bydan.erp.inventario.util.report.DisponiblesCostosParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.DisponiblesCostosParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.DisponiblesCostosBean;
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
public class DisponiblesCostosBeanSwingJInternalFrame extends DisponiblesCostosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DisponiblesCostosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DisponiblesCostos> disponiblescostosValidator = new ClassValidator<DisponiblesCostos>(DisponiblesCostos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DisponiblesCostos disponiblescostos;	
	public DisponiblesCostos disponiblescostosAux;
	public DisponiblesCostos disponiblescostosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DisponiblesCostos disponiblescostosTotales;
	public Long idDisponiblesCostosActual;
	public Long iIdNuevoDisponiblesCostos=0L;
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
	
	public Boolean isPermisoTodoDisponiblesCostos;
	public Boolean isPermisoNuevoDisponiblesCostos;
	public Boolean isPermisoActualizarDisponiblesCostos;
	public Boolean isPermisoActualizarOriginalDisponiblesCostos;
	public Boolean isPermisoEliminarDisponiblesCostos;
	public Boolean isPermisoGuardarCambiosDisponiblesCostos;
	public Boolean isPermisoConsultaDisponiblesCostos;
	public Boolean isPermisoBusquedaDisponiblesCostos;
	public Boolean isPermisoReporteDisponiblesCostos;
	public Boolean isPermisoPaginacionMedioDisponiblesCostos;
	public Boolean isPermisoPaginacionAltoDisponiblesCostos;
	public Boolean isPermisoPaginacionTodoDisponiblesCostos;
	public Boolean isPermisoCopiarDisponiblesCostos;
	public Boolean isPermisoVerFormDisponiblesCostos;
	public Boolean isPermisoDuplicarDisponiblesCostos;
	public Boolean isPermisoOrdenDisponiblesCostos;
	
	
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
	
	public DisponiblesCostosParameterReturnGeneral disponiblescostosReturnGeneral;
	public DisponiblesCostosParameterReturnGeneral disponiblescostosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDisponiblesCostos=false;
	public Boolean esParaAccionDesdeFormularioDisponiblesCostos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DisponiblesCostosSessionBeanAdditional disponiblescostosSessionBeanAdditional=null;
	
	public DisponiblesCostosSessionBeanAdditional getDisponiblesCostosSessionBeanAdditional() {
		return this.disponiblescostosSessionBeanAdditional;
	}
	
	public void setDisponiblesCostosSessionBeanAdditional(DisponiblesCostosSessionBeanAdditional disponiblescostosSessionBeanAdditional) {
		try {
			this.disponiblescostosSessionBeanAdditional=disponiblescostosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DisponiblesCostosBeanSwingJInternalFrameAdditional disponiblescostosBeanSwingJInternalFrameAdditional=null;
	//public class DisponiblesCostosBeanSwingJInternalFrame
	
	public DisponiblesCostosBeanSwingJInternalFrameAdditional getDisponiblesCostosBeanSwingJInternalFrameAdditional() {
		return this.disponiblescostosBeanSwingJInternalFrameAdditional;
	}
	
	public void setDisponiblesCostosBeanSwingJInternalFrameAdditional(DisponiblesCostosBeanSwingJInternalFrameAdditional disponiblescostosBeanSwingJInternalFrameAdditional) {
		try {
			this.disponiblescostosBeanSwingJInternalFrameAdditional=disponiblescostosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DisponiblesCostosLogic disponiblescostosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DisponiblesCostos disponiblescostosBean;
	public DisponiblesCostosConstantesFunciones disponiblescostosConstantesFunciones;
	//public DisponiblesCostosParameterReturnGeneral disponiblescostosReturnGeneral;
	
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
	
	
	//public List<DisponiblesCostos> disponiblescostoss;	
	//public List<DisponiblesCostos> disponiblescostossEliminados;
	//public List<DisponiblesCostos> disponiblescostossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDisponiblesCostos=false;
	public Boolean isVisibilidadCeldaDuplicarDisponiblesCostos=true;
	public Boolean isVisibilidadCeldaCopiarDisponiblesCostos=true;
	public Boolean isVisibilidadCeldaVerFormDisponiblesCostos=true;
	public Boolean isVisibilidadCeldaOrdenDisponiblesCostos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDisponiblesCostos=false;
	public Boolean isVisibilidadCeldaModificarDisponiblesCostos=false;
	public Boolean isVisibilidadCeldaActualizarDisponiblesCostos=false;
	public Boolean isVisibilidadCeldaEliminarDisponiblesCostos=false;
	public Boolean isVisibilidadCeldaCancelarDisponiblesCostos=false;
	public Boolean isVisibilidadCeldaGuardarDisponiblesCostos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDisponiblesCostos=false;	
	
	
	public Boolean isVisibilidadBusquedaDisponiblesCostos=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoDisponiblesCostos() {
		return this.iIdNuevoDisponiblesCostos;
	}

	public void setiIdNuevoDisponiblesCostos(Long iIdNuevoDisponiblesCostos) {
		this.iIdNuevoDisponiblesCostos = iIdNuevoDisponiblesCostos;
	}
	
	public Long getidDisponiblesCostosActual() {
		return this.idDisponiblesCostosActual;
	}

	public void setidDisponiblesCostosActual(Long idDisponiblesCostosActual) {
		this.idDisponiblesCostosActual = idDisponiblesCostosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DisponiblesCostos getdisponiblescostos() {
		return this.disponiblescostos;
	}

	public void setdisponiblescostos(DisponiblesCostos disponiblescostos) {
		this.disponiblescostos = disponiblescostos;
	}
	
	public DisponiblesCostos getdisponiblescostosAux() {
		return this.disponiblescostosAux;
	}

	public void setdisponiblescostosAux(DisponiblesCostos disponiblescostosAux) {
		this.disponiblescostosAux = disponiblescostosAux;
	}				
	
	public DisponiblesCostos getdisponiblescostosAnterior() {
		return this.disponiblescostosAnterior;
	}

	public void setdisponiblescostosAnterior(DisponiblesCostos disponiblescostosAnterior) {
		this.disponiblescostosAnterior = disponiblescostosAnterior;
	}	
	
	public DisponiblesCostos getdisponiblescostosTotales() {
		return this.disponiblescostosTotales;
	}

	public void setdisponiblescostosTotales(DisponiblesCostos disponiblescostosTotales) {
		this.disponiblescostosTotales = disponiblescostosTotales;
	}	
	
	public DisponiblesCostos getdisponiblescostosBean() {
		return this.disponiblescostosBean;
	}

	public void setdisponiblescostosBean(DisponiblesCostos disponiblescostosBean) {
		this.disponiblescostosBean = disponiblescostosBean;
	}	
	
	public DisponiblesCostosParameterReturnGeneral getdisponiblescostosReturnGeneral() {
		return this.disponiblescostosReturnGeneral;
	}

	public void setdisponiblescostosReturnGeneral(DisponiblesCostosParameterReturnGeneral disponiblescostosReturnGeneral) {
		this.disponiblescostosReturnGeneral = disponiblescostosReturnGeneral;
	}	
	
	
	public Long id_bodegaBusquedaDisponiblesCostos=-1L;

	public Long getid_bodegaBusquedaDisponiblesCostos() {
		return this.id_bodegaBusquedaDisponiblesCostos;
	}

	public void setid_bodegaBusquedaDisponiblesCostos(Long id_bodegaBusquedaDisponiblesCostos) {
		this.id_bodegaBusquedaDisponiblesCostos = id_bodegaBusquedaDisponiblesCostos;
	}

;
	public Long id_productoBusquedaDisponiblesCostos=-1L;

	public Long getid_productoBusquedaDisponiblesCostos() {
		return this.id_productoBusquedaDisponiblesCostos;
	}

	public void setid_productoBusquedaDisponiblesCostos(Long id_productoBusquedaDisponiblesCostos) {
		this.id_productoBusquedaDisponiblesCostos = id_productoBusquedaDisponiblesCostos;
	}

;
	public Long id_lineaBusquedaDisponiblesCostos=-1L;

	public Long getid_lineaBusquedaDisponiblesCostos() {
		return this.id_lineaBusquedaDisponiblesCostos;
	}

	public void setid_lineaBusquedaDisponiblesCostos(Long id_lineaBusquedaDisponiblesCostos) {
		this.id_lineaBusquedaDisponiblesCostos = id_lineaBusquedaDisponiblesCostos;
	}

;
	public Long id_linea_grupoBusquedaDisponiblesCostos=-1L;

	public Long getid_linea_grupoBusquedaDisponiblesCostos() {
		return this.id_linea_grupoBusquedaDisponiblesCostos;
	}

	public void setid_linea_grupoBusquedaDisponiblesCostos(Long id_linea_grupoBusquedaDisponiblesCostos) {
		this.id_linea_grupoBusquedaDisponiblesCostos = id_linea_grupoBusquedaDisponiblesCostos;
	}

;
	public Long id_linea_categoriaBusquedaDisponiblesCostos=-1L;

	public Long getid_linea_categoriaBusquedaDisponiblesCostos() {
		return this.id_linea_categoriaBusquedaDisponiblesCostos;
	}

	public void setid_linea_categoriaBusquedaDisponiblesCostos(Long id_linea_categoriaBusquedaDisponiblesCostos) {
		this.id_linea_categoriaBusquedaDisponiblesCostos = id_linea_categoriaBusquedaDisponiblesCostos;
	}

;
	public Long id_linea_marcaBusquedaDisponiblesCostos=-1L;

	public Long getid_linea_marcaBusquedaDisponiblesCostos() {
		return this.id_linea_marcaBusquedaDisponiblesCostos;
	}

	public void setid_linea_marcaBusquedaDisponiblesCostos(Long id_linea_marcaBusquedaDisponiblesCostos) {
		this.id_linea_marcaBusquedaDisponiblesCostos = id_linea_marcaBusquedaDisponiblesCostos;
	}

;
	public Date fecha_emision_hastaBusquedaDisponiblesCostos=new Date();

	public Date getfecha_emision_hastaBusquedaDisponiblesCostos() {
		return this.fecha_emision_hastaBusquedaDisponiblesCostos;
	}

	public void setfecha_emision_hastaBusquedaDisponiblesCostos(Date fecha_emision_hastaBusquedaDisponiblesCostos) {
		this.fecha_emision_hastaBusquedaDisponiblesCostos = fecha_emision_hastaBusquedaDisponiblesCostos;
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
	
	
	public DisponiblesCostosLogic getDisponiblesCostosLogic()	{		
		return disponiblescostosLogic;
	}

	public void setDisponiblesCostosLogic(DisponiblesCostosLogic disponiblescostosLogic) {
		this.disponiblescostosLogic = disponiblescostosLogic;
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
	
	public Boolean getIsEsNuevoDisponiblesCostos() {
		return isEsNuevoDisponiblesCostos;
	}

	public void setIsEsNuevoDisponiblesCostos(Boolean isEsNuevoDisponiblesCostos) {
		this.isEsNuevoDisponiblesCostos = isEsNuevoDisponiblesCostos;
	}

	public Boolean getEsParaAccionDesdeFormularioDisponiblesCostos() {
		return esParaAccionDesdeFormularioDisponiblesCostos;
	}
	
	public void setEsParaAccionDesdeFormularioDisponiblesCostos(Boolean esParaAccionDesdeFormularioDisponiblesCostos) {
		this.esParaAccionDesdeFormularioDisponiblesCostos = esParaAccionDesdeFormularioDisponiblesCostos;
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

			if(this.disponiblescostosSessionBean==null) {
				this.disponiblescostosSessionBean=new DisponiblesCostosSessionBean();
			}

			if(!this.disponiblescostosSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(disponiblescostosSessionBean.getlidBodegaActual());
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

			if(this.disponiblescostosSessionBean==null) {
				this.disponiblescostosSessionBean=new DisponiblesCostosSessionBean();
			}

			if(!this.disponiblescostosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(disponiblescostosSessionBean.getlidProductoActual());
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

			if(this.disponiblescostosSessionBean==null) {
				this.disponiblescostosSessionBean=new DisponiblesCostosSessionBean();
			}

			if(!this.disponiblescostosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(disponiblescostosSessionBean.getlidEmpresaActual());
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

			if(this.disponiblescostosSessionBean==null) {
				this.disponiblescostosSessionBean=new DisponiblesCostosSessionBean();
			}

			if(!this.disponiblescostosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(disponiblescostosSessionBean.getlidSucursalActual());
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

			if(this.disponiblescostosSessionBean==null) {
				this.disponiblescostosSessionBean=new DisponiblesCostosSessionBean();
			}

			if(!this.disponiblescostosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(disponiblescostosSessionBean.getlidLineaActual());
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

			if(this.disponiblescostosSessionBean==null) {
				this.disponiblescostosSessionBean=new DisponiblesCostosSessionBean();
			}

			if(!this.disponiblescostosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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
					lineaLogic.getEntityWithConnection(disponiblescostosSessionBean.getlidLineaGrupoActual());
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

			if(this.disponiblescostosSessionBean==null) {
				this.disponiblescostosSessionBean=new DisponiblesCostosSessionBean();
			}

			if(!this.disponiblescostosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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
					lineaLogic.getEntityWithConnection(disponiblescostosSessionBean.getlidLineaCategoriaActual());
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

			if(this.disponiblescostosSessionBean==null) {
				this.disponiblescostosSessionBean=new DisponiblesCostosSessionBean();
			}

			if(!this.disponiblescostosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
					lineaLogic.getEntityWithConnection(disponiblescostosSessionBean.getlidLineaMarcaActual());
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

					if(this.disponiblescostos!=null) {
						this.disponiblescostos.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
						this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_bodegaDisponiblesCostos.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaDisponiblesCostos.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
						if(this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_bodegaDisponiblesCostos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_bodegaDisponiblesCostos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDisponiblesCostos") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaBusquedaDisponiblesCostosDisponiblesCostos!=null) {
						jComboBoxid_bodegaBusquedaDisponiblesCostosDisponiblesCostos.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaBusquedaDisponiblesCostosDisponiblesCostos!=null) {
							//jComboBoxid_bodegaBusquedaDisponiblesCostosDisponiblesCostos.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaBusquedaDisponiblesCostosDisponiblesCostos.getItemCount()>0) {
								jComboBoxid_bodegaBusquedaDisponiblesCostosDisponiblesCostos.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaDisponiblesCostosGenerico)throws Exception
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
				jComboBoxid_bodegaDisponiblesCostosGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaDisponiblesCostosGenerico!=null && jComboBoxid_bodegaDisponiblesCostosGenerico.getItemCount()>0) {
					jComboBoxid_bodegaDisponiblesCostosGenerico.setSelectedIndex(0);
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

					if(this.disponiblescostos!=null) {
						this.disponiblescostos.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
						this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_productoDisponiblesCostos.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoDisponiblesCostos.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
						if(this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_productoDisponiblesCostos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_productoDisponiblesCostos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDisponiblesCostos") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaDisponiblesCostosDisponiblesCostos!=null) {
						jComboBoxid_productoBusquedaDisponiblesCostosDisponiblesCostos.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaDisponiblesCostosDisponiblesCostos!=null) {
							//jComboBoxid_productoBusquedaDisponiblesCostosDisponiblesCostos.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaDisponiblesCostosDisponiblesCostos.getItemCount()>0) {
								jComboBoxid_productoBusquedaDisponiblesCostosDisponiblesCostos.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoDisponiblesCostosGenerico)throws Exception
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
				jComboBoxid_productoDisponiblesCostosGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoDisponiblesCostosGenerico!=null && jComboBoxid_productoDisponiblesCostosGenerico.getItemCount()>0) {
					jComboBoxid_productoDisponiblesCostosGenerico.setSelectedIndex(0);
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

					if(this.disponiblescostos!=null) {
						this.disponiblescostos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
						this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_empresaDisponiblesCostos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDisponiblesCostos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
						if(this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_empresaDisponiblesCostos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_empresaDisponiblesCostos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDisponiblesCostosGenerico)throws Exception
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
				jComboBoxid_empresaDisponiblesCostosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDisponiblesCostosGenerico!=null && jComboBoxid_empresaDisponiblesCostosGenerico.getItemCount()>0) {
					jComboBoxid_empresaDisponiblesCostosGenerico.setSelectedIndex(0);
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

					if(this.disponiblescostos!=null) {
						this.disponiblescostos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
						this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_sucursalDisponiblesCostos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDisponiblesCostos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
						if(this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_sucursalDisponiblesCostos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_sucursalDisponiblesCostos.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDisponiblesCostosGenerico)throws Exception
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
				jComboBoxid_sucursalDisponiblesCostosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDisponiblesCostosGenerico!=null && jComboBoxid_sucursalDisponiblesCostosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDisponiblesCostosGenerico.setSelectedIndex(0);
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

					if(this.disponiblescostos!=null) {
						this.disponiblescostos.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
						this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_lineaDisponiblesCostos.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaDisponiblesCostos.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
						if(this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_lineaDisponiblesCostos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_lineaDisponiblesCostos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDisponiblesCostos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaDisponiblesCostosDisponiblesCostos!=null) {
						jComboBoxid_lineaBusquedaDisponiblesCostosDisponiblesCostos.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaDisponiblesCostosDisponiblesCostos!=null) {
							//jComboBoxid_lineaBusquedaDisponiblesCostosDisponiblesCostos.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaDisponiblesCostosDisponiblesCostos.getItemCount()>0) {
								jComboBoxid_lineaBusquedaDisponiblesCostosDisponiblesCostos.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaDisponiblesCostosGenerico)throws Exception
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
				jComboBoxid_lineaDisponiblesCostosGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaDisponiblesCostosGenerico!=null && jComboBoxid_lineaDisponiblesCostosGenerico.getItemCount()>0) {
					jComboBoxid_lineaDisponiblesCostosGenerico.setSelectedIndex(0);
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

					if(this.disponiblescostos!=null) {
						this.disponiblescostos.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
						this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_grupoDisponiblesCostos.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoDisponiblesCostos.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
						if(this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_grupoDisponiblesCostos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_grupoDisponiblesCostos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDisponiblesCostos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos!=null) {
						jComboBoxid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos!=null) {
							//jComboBoxid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoDisponiblesCostosGenerico)throws Exception
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
				jComboBoxid_linea_grupoDisponiblesCostosGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoDisponiblesCostosGenerico!=null && jComboBoxid_linea_grupoDisponiblesCostosGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoDisponiblesCostosGenerico.setSelectedIndex(0);
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

					if(this.disponiblescostos!=null) {
						this.disponiblescostos.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
						this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_categoriaDisponiblesCostos.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaDisponiblesCostos.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
						if(this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_categoriaDisponiblesCostos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_categoriaDisponiblesCostos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDisponiblesCostos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos!=null) {
						jComboBoxid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos!=null) {
							//jComboBoxid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos.setSelectedIndex(0);
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
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaDisponiblesCostosGenerico)throws Exception
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
				jComboBoxid_linea_categoriaDisponiblesCostosGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaDisponiblesCostosGenerico!=null && jComboBoxid_linea_categoriaDisponiblesCostosGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaDisponiblesCostosGenerico.setSelectedIndex(0);
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

					if(this.disponiblescostos!=null) {
						this.disponiblescostos.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
						this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_marcaDisponiblesCostos.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaDisponiblesCostos.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
						if(this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_marcaDisponiblesCostos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_marcaDisponiblesCostos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDisponiblesCostos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos!=null) {
						jComboBoxid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos!=null) {
							//jComboBoxid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos.setSelectedIndex(0);
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
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaDisponiblesCostosGenerico)throws Exception
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
				jComboBoxid_linea_marcaDisponiblesCostosGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaDisponiblesCostosGenerico!=null && jComboBoxid_linea_marcaDisponiblesCostosGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaDisponiblesCostosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(DisponiblesCostos disponiblescostos,JComboBox jComboBoxid_bodegaDisponiblesCostosGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaDisponiblesCostosGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_bodegaDisponiblesCostos.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaDisponiblesCostosGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				disponiblescostos.setid_bodega(bodegaAux.getId());
				disponiblescostos.setbodega_descripcion(DisponiblesCostosConstantesFunciones.getBodegaDescripcion(bodegaAux));
				disponiblescostos.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(DisponiblesCostos disponiblescostos,JComboBox jComboBoxid_productoDisponiblesCostosGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoDisponiblesCostosGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_productoDisponiblesCostos.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoDisponiblesCostosGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				disponiblescostos.setid_producto(productoAux.getId());
				disponiblescostos.setproducto_descripcion(DisponiblesCostosConstantesFunciones.getProductoDescripcion(productoAux));
				disponiblescostos.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DisponiblesCostos disponiblescostos,JComboBox jComboBoxid_empresaDisponiblesCostosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDisponiblesCostosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_empresaDisponiblesCostos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDisponiblesCostosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				disponiblescostos.setid_empresa(empresaAux.getId());
				disponiblescostos.setempresa_descripcion(DisponiblesCostosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				disponiblescostos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DisponiblesCostos disponiblescostos,JComboBox jComboBoxid_sucursalDisponiblesCostosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDisponiblesCostosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_sucursalDisponiblesCostos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDisponiblesCostosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				disponiblescostos.setid_sucursal(sucursalAux.getId());
				disponiblescostos.setsucursal_descripcion(DisponiblesCostosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				disponiblescostos.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(DisponiblesCostos disponiblescostos,JComboBox jComboBoxid_lineaDisponiblesCostosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaDisponiblesCostosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_lineaDisponiblesCostos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaDisponiblesCostosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				disponiblescostos.setid_linea(lineaAux.getId());
				disponiblescostos.setlinea_descripcion(DisponiblesCostosConstantesFunciones.getLineaDescripcion(lineaAux));
				disponiblescostos.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(DisponiblesCostos disponiblescostos,JComboBox jComboBoxid_linea_grupoDisponiblesCostosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoDisponiblesCostosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_grupoDisponiblesCostos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoDisponiblesCostosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				disponiblescostos.setid_linea_grupo(lineaAux.getId());
				disponiblescostos.setlineagrupo_descripcion(DisponiblesCostosConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				disponiblescostos.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(DisponiblesCostos disponiblescostos,JComboBox jComboBoxid_linea_categoriaDisponiblesCostosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaDisponiblesCostosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_categoriaDisponiblesCostos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaDisponiblesCostosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				disponiblescostos.setid_linea_categoria(lineaAux.getId());
				disponiblescostos.setlineacategoria_descripcion(DisponiblesCostosConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				disponiblescostos.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(DisponiblesCostos disponiblescostos,JComboBox jComboBoxid_linea_marcaDisponiblesCostosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaDisponiblesCostosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_marcaDisponiblesCostos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaDisponiblesCostosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				disponiblescostos.setid_linea_marca(lineaAux.getId());
				disponiblescostos.setlineamarca_descripcion(DisponiblesCostosConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				disponiblescostos.setLineaMarca(lineaAux);			}
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

					if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { 
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_bodegaDisponiblesCostos.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_bodegaDisponiblesCostos.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { 
					}

					if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDisponiblesCostos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaBusquedaDisponiblesCostosDisponiblesCostos.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaBusquedaDisponiblesCostosDisponiblesCostos.addItem(bodega);
							}
						}

						if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { 
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_productoDisponiblesCostos.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_productoDisponiblesCostos.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { 
					}

					if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDisponiblesCostos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaDisponiblesCostosDisponiblesCostos.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaDisponiblesCostosDisponiblesCostos.addItem(producto);
							}
						}

						if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { 
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_empresaDisponiblesCostos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_empresaDisponiblesCostos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { 
					}

					if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { 
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_sucursalDisponiblesCostos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_sucursalDisponiblesCostos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { 
					}

					if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { 
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_lineaDisponiblesCostos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_lineaDisponiblesCostos.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { 
					}

					if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDisponiblesCostos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaDisponiblesCostosDisponiblesCostos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaDisponiblesCostosDisponiblesCostos.addItem(linea);
							}
						}

						if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { 
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_grupoDisponiblesCostos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_grupoDisponiblesCostos.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { 
					}

					if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDisponiblesCostos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos.addItem(lineagrupo);
							}
						}

						if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { 
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_categoriaDisponiblesCostos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_categoriaDisponiblesCostos.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { 
					}

					if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDisponiblesCostos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos.addItem(lineacategoria);
							}
						}

						if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { 
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_marcaDisponiblesCostos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_marcaDisponiblesCostos.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { 
					}

					if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDisponiblesCostos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos.addItem(lineamarca);
							}
						}

						if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_bodegaDisponiblesCostos.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_bodegaDisponiblesCostos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaBusquedaDisponiblesCostosDisponiblesCostos.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaBusquedaDisponiblesCostosDisponiblesCostos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_productoDisponiblesCostos.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_productoDisponiblesCostos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaDisponiblesCostosDisponiblesCostos.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaDisponiblesCostosDisponiblesCostos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_empresaDisponiblesCostos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_empresaDisponiblesCostos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_sucursalDisponiblesCostos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_sucursalDisponiblesCostos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_lineaDisponiblesCostos.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_lineaDisponiblesCostos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaDisponiblesCostosDisponiblesCostos.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaDisponiblesCostosDisponiblesCostos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_grupoDisponiblesCostos.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_grupoDisponiblesCostos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_categoriaDisponiblesCostos.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_categoriaDisponiblesCostos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_marcaDisponiblesCostos.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_marcaDisponiblesCostos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDisponiblesCostos() throws Exception {
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
		
	public DisponiblesCostosParameterReturnGeneral getDisponiblesCostosParameterGeneral() {
		return this.disponiblescostosParameterGeneral;
	}
	
	public void setDisponiblesCostosParameterGeneral(DisponiblesCostosParameterReturnGeneral disponiblescostosParameterGeneral) {
		this.disponiblescostosParameterGeneral = disponiblescostosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDisponiblesCostos() {
		return isPermisoTodoDisponiblesCostos;
	}

	public void setIsPermisoTodoDisponiblesCostos(Boolean isPermisoTodoDisponiblesCostos) {
		this.isPermisoTodoDisponiblesCostos = isPermisoTodoDisponiblesCostos;
	}

	public Boolean getIsPermisoNuevoDisponiblesCostos() {
		return isPermisoNuevoDisponiblesCostos;
	}

	public void setIsPermisoNuevoDisponiblesCostos(Boolean isPermisoNuevoDisponiblesCostos) {
		this.isPermisoNuevoDisponiblesCostos = isPermisoNuevoDisponiblesCostos;
	}

	public Boolean getIsPermisoActualizarDisponiblesCostos() {
		return isPermisoActualizarDisponiblesCostos;
	}

	public void setIsPermisoActualizarDisponiblesCostos(Boolean isPermisoActualizarDisponiblesCostos) {
		this.isPermisoActualizarDisponiblesCostos = isPermisoActualizarDisponiblesCostos;
	}

	public Boolean getIsPermisoEliminarDisponiblesCostos() {
		return isPermisoEliminarDisponiblesCostos;
	}

	public void setIsPermisoEliminarDisponiblesCostos(Boolean isPermisoEliminarDisponiblesCostos) {
		this.isPermisoEliminarDisponiblesCostos = isPermisoEliminarDisponiblesCostos;
	}

	public Boolean getIsPermisoGuardarCambiosDisponiblesCostos() {
		return isPermisoGuardarCambiosDisponiblesCostos;
	}

	public void setIsPermisoGuardarCambiosDisponiblesCostos(Boolean isPermisoGuardarCambiosDisponiblesCostos) {
		this.isPermisoGuardarCambiosDisponiblesCostos = isPermisoGuardarCambiosDisponiblesCostos;
	}
	
	public Boolean getIsPermisoConsultaDisponiblesCostos() {
		return isPermisoConsultaDisponiblesCostos;
	}

	public void setIsPermisoConsultaDisponiblesCostos(Boolean isPermisoConsultaDisponiblesCostos) {
		this.isPermisoConsultaDisponiblesCostos = isPermisoConsultaDisponiblesCostos;
	}

	public Boolean getIsPermisoBusquedaDisponiblesCostos() {
		return isPermisoBusquedaDisponiblesCostos;
	}

	public void setIsPermisoBusquedaDisponiblesCostos(Boolean isPermisoBusquedaDisponiblesCostos) {
		this.isPermisoBusquedaDisponiblesCostos = isPermisoBusquedaDisponiblesCostos;
	}

	public Boolean getIsPermisoReporteDisponiblesCostos() {
		return isPermisoReporteDisponiblesCostos;
	}

	public void setIsPermisoReporteDisponiblesCostos(Boolean isPermisoReporteDisponiblesCostos) {
		this.isPermisoReporteDisponiblesCostos = isPermisoReporteDisponiblesCostos;
	}
	
	public Boolean getIsPermisoPaginacionMedioDisponiblesCostos() {
		return isPermisoPaginacionMedioDisponiblesCostos;
	}

	public void setIsPermisoPaginacionMedioDisponiblesCostos(Boolean isPermisoPaginacionMedioDisponiblesCostos) {
		this.isPermisoPaginacionMedioDisponiblesCostos = isPermisoPaginacionMedioDisponiblesCostos;
	}
	
	public Boolean getIsPermisoPaginacionTodoDisponiblesCostos() {
		return isPermisoPaginacionTodoDisponiblesCostos;
	}

	public void setIsPermisoPaginacionTodoDisponiblesCostos(Boolean isPermisoPaginacionTodoDisponiblesCostos) {
		this.isPermisoPaginacionTodoDisponiblesCostos = isPermisoPaginacionTodoDisponiblesCostos;
	}
	
	public Boolean getIsPermisoPaginacionAltoDisponiblesCostos() {
		return isPermisoPaginacionAltoDisponiblesCostos;
	}

	public void setIsPermisoPaginacionAltoDisponiblesCostos(Boolean isPermisoPaginacionAltoDisponiblesCostos) {
		this.isPermisoPaginacionAltoDisponiblesCostos = isPermisoPaginacionAltoDisponiblesCostos;
	}
	
	public Boolean getIsPermisoCopiarDisponiblesCostos() {
		return isPermisoCopiarDisponiblesCostos;
	}

	public void setIsPermisoCopiarDisponiblesCostos(Boolean isPermisoCopiarDisponiblesCostos) {
		this.isPermisoCopiarDisponiblesCostos = isPermisoCopiarDisponiblesCostos;
	}
	
	public Boolean getIsPermisoVerFormDisponiblesCostos() {
		return isPermisoVerFormDisponiblesCostos;
	}

	public void setIsPermisoVerFormDisponiblesCostos(Boolean isPermisoVerFormDisponiblesCostos) {
		this.isPermisoVerFormDisponiblesCostos = isPermisoVerFormDisponiblesCostos;
	}
	
	public Boolean getIsPermisoDuplicarDisponiblesCostos() {
		return isPermisoDuplicarDisponiblesCostos;
	}

	public void setIsPermisoDuplicarDisponiblesCostos(Boolean isPermisoDuplicarDisponiblesCostos) {
		this.isPermisoDuplicarDisponiblesCostos = isPermisoDuplicarDisponiblesCostos;
	}
	
	public Boolean getIsPermisoOrdenDisponiblesCostos() {
		return isPermisoOrdenDisponiblesCostos;
	}

	public void setIsPermisoOrdenDisponiblesCostos(Boolean isPermisoOrdenDisponiblesCostos) {
		this.isPermisoOrdenDisponiblesCostos = isPermisoOrdenDisponiblesCostos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDisponiblesCostos() {
		return isVisibilidadCeldaNuevoDisponiblesCostos;
	}

	public void setIsVisibilidadCeldaNuevoDisponiblesCostos(Boolean isVisibilidadCeldaNuevoDisponiblesCostos) {
		this.isVisibilidadCeldaNuevoDisponiblesCostos = isVisibilidadCeldaNuevoDisponiblesCostos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDisponiblesCostos() {
		return isVisibilidadCeldaDuplicarDisponiblesCostos;
	}

	public void setIsVisibilidadCeldaDuplicarDisponiblesCostos(Boolean isVisibilidadCeldaDuplicarDisponiblesCostos) {
		this.isVisibilidadCeldaDuplicarDisponiblesCostos = isVisibilidadCeldaDuplicarDisponiblesCostos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDisponiblesCostos() {
		return isVisibilidadCeldaCopiarDisponiblesCostos;
	}

	public void setIsVisibilidadCeldaCopiarDisponiblesCostos(Boolean isVisibilidadCeldaCopiarDisponiblesCostos) {
		this.isVisibilidadCeldaCopiarDisponiblesCostos = isVisibilidadCeldaCopiarDisponiblesCostos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDisponiblesCostos() {
		return isVisibilidadCeldaVerFormDisponiblesCostos;
	}

	public void setIsVisibilidadCeldaVerFormDisponiblesCostos(Boolean isVisibilidadCeldaVerFormDisponiblesCostos) {
		this.isVisibilidadCeldaVerFormDisponiblesCostos = isVisibilidadCeldaVerFormDisponiblesCostos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDisponiblesCostos() {
		return isVisibilidadCeldaOrdenDisponiblesCostos;
	}

	public void setIsVisibilidadCeldaOrdenDisponiblesCostos(Boolean isVisibilidadCeldaOrdenDisponiblesCostos) {
		this.isVisibilidadCeldaOrdenDisponiblesCostos = isVisibilidadCeldaOrdenDisponiblesCostos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDisponiblesCostos() {
		return isVisibilidadCeldaNuevoRelacionesDisponiblesCostos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDisponiblesCostos(Boolean isVisibilidadCeldaNuevoRelacionesDisponiblesCostos) {
		this.isVisibilidadCeldaNuevoRelacionesDisponiblesCostos = isVisibilidadCeldaNuevoRelacionesDisponiblesCostos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDisponiblesCostos() {
		return isVisibilidadCeldaModificarDisponiblesCostos;
	}

	public void setIsVisibilidadCeldaModificarDisponiblesCostos(Boolean isVisibilidadCeldaModificarDisponiblesCostos) {
		this.isVisibilidadCeldaModificarDisponiblesCostos = isVisibilidadCeldaModificarDisponiblesCostos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDisponiblesCostos() {
		return isVisibilidadCeldaActualizarDisponiblesCostos;
	}

	public void setIsVisibilidadCeldaActualizarDisponiblesCostos(Boolean isVisibilidadCeldaActualizarDisponiblesCostos) {
		this.isVisibilidadCeldaActualizarDisponiblesCostos = isVisibilidadCeldaActualizarDisponiblesCostos;
	}

	public Boolean getIsVisibilidadCeldaEliminarDisponiblesCostos() {
		return isVisibilidadCeldaEliminarDisponiblesCostos;
	}

	public void setIsVisibilidadCeldaEliminarDisponiblesCostos(Boolean isVisibilidadCeldaEliminarDisponiblesCostos) {
		this.isVisibilidadCeldaEliminarDisponiblesCostos = isVisibilidadCeldaEliminarDisponiblesCostos;
	}

	public Boolean getIsVisibilidadCeldaCancelarDisponiblesCostos() {
		return isVisibilidadCeldaCancelarDisponiblesCostos;
	}

	public void setIsVisibilidadCeldaCancelarDisponiblesCostos(Boolean isVisibilidadCeldaCancelarDisponiblesCostos) {
		this.isVisibilidadCeldaCancelarDisponiblesCostos = isVisibilidadCeldaCancelarDisponiblesCostos;
	}

	public Boolean getIsVisibilidadCeldaGuardarDisponiblesCostos() {
		return isVisibilidadCeldaGuardarDisponiblesCostos;
	}

	public void setIsVisibilidadCeldaGuardarDisponiblesCostos(Boolean isVisibilidadCeldaGuardarDisponiblesCostos) {
		this.isVisibilidadCeldaGuardarDisponiblesCostos = isVisibilidadCeldaGuardarDisponiblesCostos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDisponiblesCostos() {
		return isVisibilidadCeldaGuardarCambiosDisponiblesCostos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDisponiblesCostos(Boolean isVisibilidadCeldaGuardarCambiosDisponiblesCostos) {
		this.isVisibilidadCeldaGuardarCambiosDisponiblesCostos = isVisibilidadCeldaGuardarCambiosDisponiblesCostos;
	}
		
	public DisponiblesCostosSessionBean getdisponiblescostosSessionBean() {
		return this.disponiblescostosSessionBean;
	}
	
	public void setdisponiblescostosSessionBean(DisponiblesCostosSessionBean disponiblescostosSessionBean) {
		this.disponiblescostosSessionBean=disponiblescostosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaDisponiblesCostos() {
		return this.isVisibilidadBusquedaDisponiblesCostos;
	}

	public void setisVisibilidadBusquedaDisponiblesCostos(Boolean isVisibilidadBusquedaDisponiblesCostos) {
		this.isVisibilidadBusquedaDisponiblesCostos=isVisibilidadBusquedaDisponiblesCostos;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(DisponiblesCostos disponiblescostos)throws Exception {
		try {
			
				this.setActualParaGuardarBodegaForeignKey(disponiblescostos,null);
				this.setActualParaGuardarProductoForeignKey(disponiblescostos,null);
				this.setActualParaGuardarEmpresaForeignKey(disponiblescostos,null);
				this.setActualParaGuardarSucursalForeignKey(disponiblescostos,null);
				this.setActualParaGuardarLineaForeignKey(disponiblescostos,null);
				this.setActualParaGuardarLineaGrupoForeignKey(disponiblescostos,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(disponiblescostos,null);
				this.setActualParaGuardarLineaMarcaForeignKey(disponiblescostos,null);
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
	
	public void bugActualizarReferenciaActual(DisponiblesCostos disponiblescostos,DisponiblesCostos disponiblescostosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDisponiblesCostos(disponiblescostos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		disponiblescostosAux.setId(disponiblescostos.getId());
		disponiblescostosAux.setVersionRow(disponiblescostos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(DisponiblesCostos disponiblescostosLocal) throws Exception {
		
		if(this.disponiblescostosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DisponiblesCostos disponiblescostosLocal) throws Exception {	
		if(this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				disponiblescostosLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				disponiblescostosLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				disponiblescostosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				disponiblescostosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				disponiblescostosLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				disponiblescostosLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				disponiblescostosLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				disponiblescostosLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDisponiblesCostosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = disponiblescostosValidator.getInvalidValues(this.disponiblescostos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DisponiblesCostos disponiblescostos,List<DisponiblesCostos> disponiblescostoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(DisponiblesCostos disponiblescostos,List<DisponiblesCostos> disponiblescostoss) throws Exception {
		try	{			
			DisponiblesCostosConstantesFunciones.actualizarSelectedLista(disponiblescostos,disponiblescostoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DisponiblesCostos> disponiblescostossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				disponiblescostossLocal=this.disponiblescostosLogic.getDisponiblesCostoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				disponiblescostossLocal=this.disponiblescostoss;
			}
			//ARCHITECTURE
		
			for(DisponiblesCostos disponiblescostosLocal:disponiblescostossLocal) {
				if(this.permiteMantenimiento(disponiblescostosLocal) && disponiblescostosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DisponiblesCostosConstantesFunciones.getDisponiblesCostosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DisponiblesCostosConstantesFunciones.NOMBRESUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombre_sucursalDisponiblesCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DisponiblesCostosConstantesFunciones.NOMBRELINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombre_lineaDisponiblesCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DisponiblesCostosConstantesFunciones.NOMBRELINEAGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombre_linea_grupoDisponiblesCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DisponiblesCostosConstantesFunciones.NOMBRELINEACATEGORIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombre_linea_categoriaDisponiblesCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DisponiblesCostosConstantesFunciones.NOMBRELINEAMARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombre_linea_marcaDisponiblesCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DisponiblesCostosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelcodigoDisponiblesCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DisponiblesCostosConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombreDisponiblesCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DisponiblesCostosConstantesFunciones.NOMBREBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombre_bodegaDisponiblesCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DisponiblesCostosConstantesFunciones.NOMBREUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombre_unidadDisponiblesCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DisponiblesCostosConstantesFunciones.INGRESOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelingresosDisponiblesCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DisponiblesCostosConstantesFunciones.EGRESOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelegresosDisponiblesCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DisponiblesCostosConstantesFunciones.DISPONIBLECORTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabeldisponible_corteDisponiblesCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DisponiblesCostosConstantesFunciones.COSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelcostoDisponiblesCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DisponiblesCostosConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabeltotalDisponiblesCostos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombre_sucursalDisponiblesCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombre_lineaDisponiblesCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombre_linea_grupoDisponiblesCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombre_linea_categoriaDisponiblesCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombre_linea_marcaDisponiblesCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelcodigoDisponiblesCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombreDisponiblesCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombre_bodegaDisponiblesCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombre_unidadDisponiblesCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelingresosDisponiblesCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelegresosDisponiblesCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDisponiblesCostos.jLabeldisponible_corteDisponiblesCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelcostoDisponiblesCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDisponiblesCostos.jLabeltotalDisponiblesCostos,"");
		
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
		this.iIdNuevoDisponiblesCostos--;	
		
		
		this.disponiblescostosAux=new DisponiblesCostos();
		
		this.disponiblescostosAux.setId(this.iIdNuevoDisponiblesCostos);
		this.disponiblescostosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.disponiblescostosLogic.getDisponiblesCostoss().add(this.disponiblescostosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.disponiblescostoss.add(this.disponiblescostosAux);
		}
		//ARCHITECTURE
		
		this.disponiblescostos=this.disponiblescostosAux;
		
		if(DisponiblesCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDisponiblesCostos(this.disponiblescostos);
			this.setVariablesObjetoActualToFormularioForeignKeyDisponiblesCostos(this.disponiblescostos);
		}
				
		//this.setDefaultControlesDisponiblesCostos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDisponiblesCostos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDisponiblesCostos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDisponiblesCostos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDisponiblesCostos(this.disponiblescostosBean,this.disponiblescostos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDisponiblesCostos(this.disponiblescostosReturnGeneral,this.disponiblescostosBean,false);
		
		if(this.disponiblescostosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDisponiblesCostos(this.disponiblescostosReturnGeneral.getDisponiblesCostos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDisponiblesCostos(this.disponiblescostosReturnGeneral.getDisponiblesCostos());
		}
		
		if(this.disponiblescostosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDisponiblesCostos(this.disponiblescostosReturnGeneral.getDisponiblesCostos(),classes);//this.disponiblescostosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDisponiblesCostos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDisponiblesCostos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DisponiblesCostosBeanSwingJInternalFrameAdditional.RecargarFormDisponiblesCostos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDisponiblesCostos(false);
						
			if(disponiblescostosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDisponiblesCostos();
			}
			
			this.actualizarVisualTableDatosDisponiblesCostos();
			
			this.jTableDatosDisponiblesCostos.setRowSelectionInterval(this.getIndiceNuevoDisponiblesCostos(), this.getIndiceNuevoDisponiblesCostos());
			
			this.seleccionarFilaTablaDisponiblesCostosActual();
						
			this.actualizarEstadoCeldasBotonesDisponiblesCostos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDisponiblesCostos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDisponiblesCostos.jDateChooserfecha_emision_hastaDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activarfecha_emision_hastaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_sucursalDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activarnombre_sucursalDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_lineaDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activarnombre_lineaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_grupoDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activarnombre_linea_grupoDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_categoriaDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activarnombre_linea_categoriaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_marcaDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activarnombre_linea_marcaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldcodigoDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activarcodigoDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombreDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activarnombreDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_bodegaDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activarnombre_bodegaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldnombre_unidadDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activarnombre_unidadDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldingresosDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activaringresosDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldegresosDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activaregresosDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextFielddisponible_corteDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activardisponible_corteDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldcostoDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activarcostoDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldtotalDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activartotalDisponiblesCostos);	
		
		this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_bodegaDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activarid_bodegaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_productoDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activarid_productoDisponiblesCostos);//
		this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_empresaDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activarid_empresaDisponiblesCostos);//
		this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_sucursalDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activarid_sucursalDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_lineaDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activarid_lineaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_grupoDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activarid_linea_grupoDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_categoriaDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activarid_linea_categoriaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_marcaDisponiblesCostos.setEnabled(isHabilitar && this.disponiblescostosConstantesFunciones.activarid_linea_marcaDisponiblesCostos);
	};
	
	public void setDefaultControlesDisponiblesCostos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDisponiblesCostos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.disponiblescostosSessionBean.setConGuardarRelaciones(true);			
			this.disponiblescostosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDisponiblesCostos.jTabbedPaneRelacionesDisponiblesCostos.setVisible(true);
			
					
		} else {
			//this.disponiblescostosSessionBean.setConGuardarRelaciones(false);			
			this.disponiblescostosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDisponiblesCostos.jTabbedPaneRelacionesDisponiblesCostos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDisponiblesCostos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DisponiblesCostos disponiblescostosAux:this.disponiblescostosLogic.getDisponiblesCostoss()) {
				if(disponiblescostosAux.getId().equals(this.iIdNuevoDisponiblesCostos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DisponiblesCostos disponiblescostosAux:this.disponiblescostoss) {
				if(disponiblescostosAux.getId().equals(this.iIdNuevoDisponiblesCostos)) {
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
	
	public int getIndiceActualDisponiblesCostos(DisponiblesCostos disponiblescostos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DisponiblesCostos disponiblescostosAux:this.disponiblescostosLogic.getDisponiblesCostoss()) {
				if(disponiblescostosAux.getId().equals(disponiblescostos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DisponiblesCostos disponiblescostosAux:this.disponiblescostoss) {
				if(disponiblescostosAux.getId().equals(disponiblescostos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDisponiblesCostos(DisponiblesCostos disponiblescostosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DisponiblesCostos disponiblescostosAux:this.disponiblescostosLogic.getDisponiblesCostoss()) {
				if(disponiblescostosAux.getDisponiblesCostosOriginal().getId().equals(disponiblescostosOriginal.getId())) {
					existe=true;
					disponiblescostosOriginal.setId(disponiblescostosAux.getId());
					disponiblescostosOriginal.setVersionRow(disponiblescostosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DisponiblesCostos disponiblescostosAux:this.disponiblescostoss) {
				if(disponiblescostosAux.getDisponiblesCostosOriginal().getId().equals(disponiblescostosOriginal.getId())) {
					existe=true;
					disponiblescostosOriginal.setId(disponiblescostosAux.getId());
					disponiblescostosOriginal.setVersionRow(disponiblescostosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDisponiblesCostos(Boolean esParaCancelar) throws Exception {
		disponiblescostossAux=new ArrayList<DisponiblesCostos>();
		disponiblescostosAux=new DisponiblesCostos();
		
		if(!this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DisponiblesCostos disponiblescostosAux:this.disponiblescostosLogic.getDisponiblesCostoss()) {
					if(disponiblescostosAux.getId()<0) {
						disponiblescostossAux.add(disponiblescostosAux);
					}		
				}
				this.iIdNuevoDisponiblesCostos=0L;
				this.disponiblescostosLogic.getDisponiblesCostoss().removeAll(disponiblescostossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DisponiblesCostos disponiblescostosAux:this.disponiblescostoss) {
					if(disponiblescostosAux.getId()<0) {
						disponiblescostossAux.add(disponiblescostosAux);
					}		
				}
				this.iIdNuevoDisponiblesCostos=0L;
				this.disponiblescostoss.removeAll(disponiblescostossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDisponiblesCostos 
					&& this.disponiblescostosLogic.getDisponiblesCostoss().size()>0
					) {
					disponiblescostosAux=this.disponiblescostosLogic.getDisponiblesCostoss().get(this.disponiblescostosLogic.getDisponiblesCostoss().size() - 1);
				
					if(disponiblescostosAux.getId()<0) {
						this.disponiblescostosLogic.getDisponiblesCostoss().remove(disponiblescostosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDisponiblesCostos && this.disponiblescostoss.size()>0) {
					disponiblescostosAux=this.disponiblescostoss.get(this.disponiblescostoss.size() - 1);
				
					if(disponiblescostosAux.getId()<0) {
						this.disponiblescostoss.remove(disponiblescostosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDisponiblesCostos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(disponiblescostos.getId()<0) {
				this.disponiblescostosLogic.getDisponiblesCostoss().remove(this.disponiblescostos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(disponiblescostos.getId()<0) {
				this.disponiblescostoss.remove(this.disponiblescostos);
			}
		}			
	}
	
	public void setEstadosInicialesDisponiblesCostos(List<DisponiblesCostos> disponiblescostossAux) throws Exception {
		DisponiblesCostosConstantesFunciones.setEstadosInicialesDisponiblesCostos(disponiblescostossAux);
	}
	
	public void setEstadosInicialesDisponiblesCostos(DisponiblesCostos disponiblescostosAux) throws Exception {
		DisponiblesCostosConstantesFunciones.setEstadosInicialesDisponiblesCostos(disponiblescostosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDisponiblesCostosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDisponiblesCostos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDisponiblesCostosActual()) {
				if(!this.isEsNuevoDisponiblesCostos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDisponiblesCostos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDisponiblesCostos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDisponiblesCostosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Disponibles Costos ?", "MANTENIMIENTO DE Disponibles Costos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDisponiblesCostos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DisponiblesCostos disponiblescostos) throws Exception {
		DisponiblesCostosConstantesFunciones.seleccionarAsignar(this.disponiblescostos,disponiblescostos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDisponiblesCostos=this.isPermisoActualizarOriginalDisponiblesCostos;
			
			
			this.seleccionarAsignar(disponiblescostos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesDisponiblesCostos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.disponiblescostosSessionBean.setsFuncionBusquedaRapida(this.disponiblescostosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDisponiblesCostos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDisponiblesCostos(esParaCancelar);				
				this.cancelarNuevoDisponiblesCostos(esParaCancelar);								
			}
			
			this.disponiblescostos=new DisponiblesCostos();
			
			this.inicializarDisponiblesCostos();
			
			this.actualizarEstadoCeldasBotonesDisponiblesCostos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDisponiblesCostos() throws Exception {
		try {
			DisponiblesCostosConstantesFunciones.inicializarDisponiblesCostos(this.disponiblescostos);
			
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
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.disponiblescostosLogic.getDisponiblesCostoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDisponiblesCostoss(String sAccionBusqueda,List<DisponiblesCostos> disponiblescostossParaReportes) throws Exception {
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
					sPathReporteFinal="DisponiblesCostos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DisponiblesCostosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DisponiblesCostosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DisponiblesCostos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Disponibles Costoses");		
		parameters.put("busquedapor", DisponiblesCostosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDisponiblesCostos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DisponiblesCostosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DisponiblesCostosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDisponiblesCostos=new JRBeanArrayDataSource(DisponiblesCostosJInternalFrame.TraerDisponiblesCostosBeans(disponiblescostossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDisponiblesCostos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DisponiblesCostosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DisponiblesCostosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DisponiblesCostosBean.TraerDisponiblesCostosBeans(disponiblescostossParaReportes).toArray()));
							
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
				this.generarExcelReporteDisponiblesCostoss(sAccionBusqueda,sTipoArchivoReporte,disponiblescostossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDisponiblesCostoss(sAccionBusqueda,sTipoArchivoReporte,disponiblescostossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDisponiblesCostosActionPerformed(null);
					//this.generarExcelReporteDisponiblesCostoss(sAccionBusqueda,sTipoArchivoReporte,disponiblescostossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDisponiblesCostoss(sAccionBusqueda,sTipoArchivoReporte,disponiblescostossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDisponiblesCostoss(sAccionBusqueda,sTipoArchivoReporte,disponiblescostossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDisponiblesCostoss(sAccionBusqueda,sTipoArchivoReporte,disponiblescostossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDisponiblesCostoss(String sAccionBusqueda,String sTipoArchivoReporte,List<DisponiblesCostos> disponiblescostossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"disponiblescostos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DisponiblesCostoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDisponiblesCostos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DisponiblesCostos disponiblescostos : disponiblescostossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DisponiblesCostosConstantesFunciones.generarExcelReporteDataDisponiblesCostos("NORMAL",row,workbook,disponiblescostos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Disponibles Costos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDisponiblesCostos(String sTipo,Row row,Workbook workbook) {
		
		DisponiblesCostosConstantesFunciones.generarExcelReporteHeaderDisponiblesCostos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDisponiblesCostoss(String sAccionBusqueda,String sTipoArchivoReporte,List<DisponiblesCostos> disponiblescostossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"disponiblescostos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DisponiblesCostoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DisponiblesCostos disponiblescostos : disponiblescostossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DisponiblesCostosConstantesFunciones.getDisponiblesCostosDescripcion(disponiblescostos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_NOMBRESUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBRESUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getnombre_sucursal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getnombre_linea());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getnombre_linea_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getnombre_linea_categoria());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getnombre_linea_marca());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_NOMBREBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBREBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getnombre_bodega());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_NOMBREUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBREUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getnombre_unidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_INGRESOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_INGRESOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getingresos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_EGRESOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_EGRESOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getegresos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_DISPONIBLECORTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_DISPONIBLECORTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getdisponible_corte());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_COSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_COSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.getcosto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DisponiblesCostosConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(disponiblescostos.gettotal());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Disponibles Costos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDisponiblesCostoss(String sAccionBusqueda,String sTipoArchivoReporte,List<DisponiblesCostos> disponiblescostossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DisponiblesCostos> disponiblescostossRespaldo=null;
		
		classes=DisponiblesCostosConstantesFunciones.getClassesRelationshipsOfDisponiblesCostos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.disponiblescostosLogic.setDatosCliente(this.datosCliente);
		this.disponiblescostosLogic.setDatosDeep(this.datosDeep);
		this.disponiblescostosLogic.setIsConDeep(true);
		
		disponiblescostossRespaldo=this.disponiblescostosLogic.getDisponiblesCostoss();
		
		this.disponiblescostosLogic.setDisponiblesCostoss(disponiblescostossParaReportes);	
		this.disponiblescostosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		disponiblescostossParaReportes=this.disponiblescostosLogic.getDisponiblesCostoss();
		this.disponiblescostosLogic.setDisponiblesCostoss(disponiblescostossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"disponiblescostos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DisponiblesCostoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDisponiblesCostos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DisponiblesCostos disponiblescostos : disponiblescostossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDisponiblesCostos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DisponiblesCostosConstantesFunciones.generarExcelReporteDataDisponiblesCostos("NORMAL",row,workbook,disponiblescostos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DisponiblesCostosConstantesFunciones.getDisponiblesCostosDescripcion(disponiblescostos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Disponibles Costos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDisponiblesCostos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDisponiblesCostos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDisponiblesCostos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDisponiblesCostos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDisponiblesCostos() throws Exception {		
		this.startProcessDisponiblesCostos(true);
	}
	
	public void startProcessDisponiblesCostos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDisponiblesCostos ,this.jPanelParametrosReportesDisponiblesCostos, this.jScrollPanelDatosDisponiblesCostos,this.jPanelPaginacionDisponiblesCostos, this.jScrollPanelDatosEdicionDisponiblesCostos, this.jPanelAccionesDisponiblesCostos,this.jPanelAccionesFormularioDisponiblesCostos,this.jmenuBarDisponiblesCostos,this.jmenuBarDetalleDisponiblesCostos,this.jTtoolBarDisponiblesCostos,this.jTtoolBarDetalleDisponiblesCostos);		
		
		final JTabbedPane jTabbedPaneBusquedasDisponiblesCostos=this.jTabbedPaneBusquedasDisponiblesCostos; 
		
		final JPanel jPanelParametrosReportesDisponiblesCostos=this.jPanelParametrosReportesDisponiblesCostos;
		//final JScrollPane jScrollPanelDatosDisponiblesCostos=this.jScrollPanelDatosDisponiblesCostos;
		final JTable jTableDatosDisponiblesCostos=this.jTableDatosDisponiblesCostos;		
		final JPanel jPanelPaginacionDisponiblesCostos=this.jPanelPaginacionDisponiblesCostos;
		//final JScrollPane jScrollPanelDatosEdicionDisponiblesCostos=this.jScrollPanelDatosEdicionDisponiblesCostos;
		final JPanel jPanelAccionesDisponiblesCostos=this.jPanelAccionesDisponiblesCostos;
		
		JPanel jPanelCamposAuxiliarDisponiblesCostos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDisponiblesCostos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
			jPanelCamposAuxiliarDisponiblesCostos=this.jInternalFrameDetalleFormDisponiblesCostos.jPanelCamposDisponiblesCostos;
			jPanelAccionesFormularioAuxiliarDisponiblesCostos=this.jInternalFrameDetalleFormDisponiblesCostos.jPanelAccionesFormularioDisponiblesCostos;
		}
		
		final JPanel jPanelCamposDisponiblesCostos=jPanelCamposAuxiliarDisponiblesCostos;
		final JPanel jPanelAccionesFormularioDisponiblesCostos=jPanelAccionesFormularioAuxiliarDisponiblesCostos;
		
		
		final JMenuBar jmenuBarDisponiblesCostos=this.jmenuBarDisponiblesCostos;
		final JToolBar jTtoolBarDisponiblesCostos=this.jTtoolBarDisponiblesCostos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDisponiblesCostos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDisponiblesCostos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
			jmenuBarDetalleAuxiliarDisponiblesCostos=this.jInternalFrameDetalleFormDisponiblesCostos.jmenuBarDetalleDisponiblesCostos;
			jTtoolBarDetalleAuxiliarDisponiblesCostos=this.jInternalFrameDetalleFormDisponiblesCostos.jTtoolBarDetalleDisponiblesCostos;
		}
		
		final JMenuBar jmenuBarDetalleDisponiblesCostos=jmenuBarDetalleAuxiliarDisponiblesCostos;
		final JToolBar jTtoolBarDetalleDisponiblesCostos=jTtoolBarDetalleAuxiliarDisponiblesCostos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDisponiblesCostos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDisponiblesCostos;
			processRunnable.jTableDatos=jTableDatosDisponiblesCostos;
			processRunnable.jPanelCampos=jPanelCamposDisponiblesCostos;
			processRunnable.jPanelPaginacion=jPanelPaginacionDisponiblesCostos;
			processRunnable.jPanelAcciones=jPanelAccionesDisponiblesCostos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDisponiblesCostos;
			
			
			processRunnable.jmenuBar=jmenuBarDisponiblesCostos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDisponiblesCostos;
			processRunnable.jTtoolBar=jTtoolBarDisponiblesCostos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDisponiblesCostos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDisponiblesCostos ,jPanelParametrosReportesDisponiblesCostos,jTableDatosDisponiblesCostos, /*jScrollPanelDatosDisponiblesCostos,*/jPanelCamposDisponiblesCostos,jPanelPaginacionDisponiblesCostos, /*jScrollPanelDatosEdicionDisponiblesCostos,*/ jPanelAccionesDisponiblesCostos,jPanelAccionesFormularioDisponiblesCostos,jmenuBarDisponiblesCostos,jmenuBarDetalleDisponiblesCostos,jTtoolBarDisponiblesCostos,jTtoolBarDetalleDisponiblesCostos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDisponiblesCostos ,jPanelParametrosReportesDisponiblesCostos, jScrollPanelDatosDisponiblesCostos,jPanelPaginacionDisponiblesCostos, jScrollPanelDatosEdicionDisponiblesCostos, jPanelAccionesDisponiblesCostos,jPanelAccionesFormularioDisponiblesCostos,jmenuBarDisponiblesCostos,jmenuBarDetalleDisponiblesCostos,jTtoolBarDisponiblesCostos,jTtoolBarDetalleDisponiblesCostos);
						
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
	
	public void finishProcessDisponiblesCostos() {// throws Exception 
		this.finishProcessDisponiblesCostos(true);
	}
	
	public void finishProcessDisponiblesCostos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDisponiblesCostos ,this.jPanelParametrosReportesDisponiblesCostos, this.jScrollPanelDatosDisponiblesCostos,this.jPanelPaginacionDisponiblesCostos, this.jScrollPanelDatosEdicionDisponiblesCostos, this.jPanelAccionesDisponiblesCostos,this.jPanelAccionesFormularioDisponiblesCostos,this.jmenuBarDisponiblesCostos,this.jmenuBarDetalleDisponiblesCostos,this.jTtoolBarDisponiblesCostos,this.jTtoolBarDetalleDisponiblesCostos);		
		
		final JTabbedPane jTabbedPaneBusquedasDisponiblesCostos=this.jTabbedPaneBusquedasDisponiblesCostos; 
		
		final JPanel jPanelParametrosReportesDisponiblesCostos=this.jPanelParametrosReportesDisponiblesCostos;
		//final JScrollPane jScrollPanelDatosDisponiblesCostos=this.jScrollPanelDatosDisponiblesCostos;
		final JTable jTableDatosDisponiblesCostos=this.jTableDatosDisponiblesCostos;		
		final JPanel jPanelPaginacionDisponiblesCostos=this.jPanelPaginacionDisponiblesCostos;
		//final JScrollPane jScrollPanelDatosEdicionDisponiblesCostos=this.jScrollPanelDatosEdicionDisponiblesCostos;
		final JPanel jPanelAccionesDisponiblesCostos=this.jPanelAccionesDisponiblesCostos;
		
		JPanel jPanelCamposAuxiliarDisponiblesCostos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDisponiblesCostos=new JPanel();
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
			jPanelCamposAuxiliarDisponiblesCostos=this.jInternalFrameDetalleFormDisponiblesCostos.jPanelCamposDisponiblesCostos;
			jPanelAccionesFormularioAuxiliarDisponiblesCostos=this.jInternalFrameDetalleFormDisponiblesCostos.jPanelAccionesFormularioDisponiblesCostos;
		}
		
		final JPanel jPanelCamposDisponiblesCostos=jPanelCamposAuxiliarDisponiblesCostos;
		final JPanel jPanelAccionesFormularioDisponiblesCostos=jPanelAccionesFormularioAuxiliarDisponiblesCostos;
		
		
		final JMenuBar jmenuBarDisponiblesCostos=this.jmenuBarDisponiblesCostos;		
		final JToolBar jTtoolBarDisponiblesCostos=this.jTtoolBarDisponiblesCostos;
				
		JMenuBar jmenuBarDetalleAuxiliarDisponiblesCostos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDisponiblesCostos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
			jmenuBarDetalleAuxiliarDisponiblesCostos=this.jInternalFrameDetalleFormDisponiblesCostos.jmenuBarDetalleDisponiblesCostos;
			jTtoolBarDetalleAuxiliarDisponiblesCostos=this.jInternalFrameDetalleFormDisponiblesCostos.jTtoolBarDetalleDisponiblesCostos;		
		}
		
		final JMenuBar jmenuBarDetalleDisponiblesCostos=jmenuBarDetalleAuxiliarDisponiblesCostos;
		final JToolBar jTtoolBarDetalleDisponiblesCostos=jTtoolBarDetalleAuxiliarDisponiblesCostos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDisponiblesCostos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDisponiblesCostos;
			processRunnable.jTableDatos=jTableDatosDisponiblesCostos;
			processRunnable.jPanelCampos=jPanelCamposDisponiblesCostos;
			processRunnable.jPanelPaginacion=jPanelPaginacionDisponiblesCostos;
			processRunnable.jPanelAcciones=jPanelAccionesDisponiblesCostos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDisponiblesCostos;
			
			
			processRunnable.jmenuBar=jmenuBarDisponiblesCostos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDisponiblesCostos;
			processRunnable.jTtoolBar=jTtoolBarDisponiblesCostos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDisponiblesCostos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDisponiblesCostos ,jPanelParametrosReportesDisponiblesCostos, jTableDatosDisponiblesCostos,/*jScrollPanelDatosDisponiblesCostos,*/jPanelCamposDisponiblesCostos,jPanelPaginacionDisponiblesCostos, /*jScrollPanelDatosEdicionDisponiblesCostos,*/ jPanelAccionesDisponiblesCostos,jPanelAccionesFormularioDisponiblesCostos,jmenuBarDisponiblesCostos,jmenuBarDetalleDisponiblesCostos,jTtoolBarDisponiblesCostos,jTtoolBarDetalleDisponiblesCostos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDisponiblesCostos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDisponiblesCostos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDisponiblesCostos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDisponiblesCostos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDisponiblesCostos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDisponiblesCostos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDisponiblesCostos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDisponiblesCostos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDisponiblesCostos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.disponiblescostosConstantesFunciones.getsFinalQueryDisponiblesCostos();
		String  finalQueryPaginacionTodos=this.disponiblescostosConstantesFunciones.getsFinalQueryDisponiblesCostos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DisponiblesCostosConstantesFunciones.getArrayColumnasGlobalesNoDisponiblesCostos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DisponiblesCostosConstantesFunciones.getArrayColumnasGlobalesDisponiblesCostos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DisponiblesCostosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.disponiblescostossEliminados= new ArrayList<DisponiblesCostos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDisponiblesCostos();
		
				///*DisponiblesCostosSessionBean*/this.disponiblescostosSessionBean=new DisponiblesCostosSessionBean();
			
			if(this.disponiblescostosSessionBean==null) {
				this.disponiblescostosSessionBean=new DisponiblesCostosSessionBean();
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
					this.iNumeroPaginacion=DisponiblesCostosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DisponiblesCostosConstantesFunciones.getClassesForeignKeysOfDisponiblesCostos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/disponiblescostos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			disponiblescostossAux= new ArrayList<DisponiblesCostos>();
			
				
			disponiblescostosLogic.setDatosCliente(this.datosCliente);
			disponiblescostosLogic.setDatosDeep(this.datosDeep);
			disponiblescostosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaDisponiblesCostos")) {
				this.sDetalleReporte=DisponiblesCostosConstantesFunciones.getDetalleIndiceBusquedaDisponiblesCostos(id_bodegaBusquedaDisponiblesCostos,id_productoBusquedaDisponiblesCostos,id_lineaBusquedaDisponiblesCostos,id_linea_grupoBusquedaDisponiblesCostos,id_linea_categoriaBusquedaDisponiblesCostos,id_linea_marcaBusquedaDisponiblesCostos,fecha_emision_hastaBusquedaDisponiblesCostos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					disponiblescostosLogic.getDisponiblesCostossBusquedaDisponiblesCostos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaDisponiblesCostos,id_productoBusquedaDisponiblesCostos,id_lineaBusquedaDisponiblesCostos,id_linea_grupoBusquedaDisponiblesCostos,id_linea_categoriaBusquedaDisponiblesCostos,id_linea_marcaBusquedaDisponiblesCostos,fecha_emision_hastaBusquedaDisponiblesCostos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DisponiblesCostosConstantesFunciones.getDetalleIndiceBusquedaDisponiblesCostos(id_bodegaBusquedaDisponiblesCostos,id_productoBusquedaDisponiblesCostos,id_lineaBusquedaDisponiblesCostos,id_linea_grupoBusquedaDisponiblesCostos,id_linea_categoriaBusquedaDisponiblesCostos,id_linea_marcaBusquedaDisponiblesCostos,fecha_emision_hastaBusquedaDisponiblesCostos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DisponiblesCostosConstantesFunciones.getDetalleIndiceBusquedaDisponiblesCostos(id_bodegaBusquedaDisponiblesCostos,id_productoBusquedaDisponiblesCostos,id_lineaBusquedaDisponiblesCostos,id_linea_grupoBusquedaDisponiblesCostos,id_linea_categoriaBusquedaDisponiblesCostos,id_linea_marcaBusquedaDisponiblesCostos,fecha_emision_hastaBusquedaDisponiblesCostos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=disponiblescostosLogic.getDisponiblesCostoss()==null||disponiblescostosLogic.getDisponiblesCostoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=disponiblescostoss==null|| disponiblescostoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						disponiblescostossAux=new ArrayList<DisponiblesCostos>();
						disponiblescostossAux.addAll(disponiblescostosLogic.getDisponiblesCostoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							disponiblescostossAux=new ArrayList<DisponiblesCostos>();
							disponiblescostossAux.addAll(disponiblescostoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							disponiblescostosLogic.getDisponiblesCostossBusquedaDisponiblesCostos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaDisponiblesCostos,id_productoBusquedaDisponiblesCostos,id_lineaBusquedaDisponiblesCostos,id_linea_grupoBusquedaDisponiblesCostos,id_linea_categoriaBusquedaDisponiblesCostos,id_linea_marcaBusquedaDisponiblesCostos,fecha_emision_hastaBusquedaDisponiblesCostos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DisponiblesCostosConstantesFunciones.getDetalleIndiceBusquedaDisponiblesCostos(id_bodegaBusquedaDisponiblesCostos,id_productoBusquedaDisponiblesCostos,id_lineaBusquedaDisponiblesCostos,id_linea_grupoBusquedaDisponiblesCostos,id_linea_categoriaBusquedaDisponiblesCostos,id_linea_marcaBusquedaDisponiblesCostos,fecha_emision_hastaBusquedaDisponiblesCostos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DisponiblesCostosConstantesFunciones.getDetalleIndiceBusquedaDisponiblesCostos(id_bodegaBusquedaDisponiblesCostos,id_productoBusquedaDisponiblesCostos,id_lineaBusquedaDisponiblesCostos,id_linea_grupoBusquedaDisponiblesCostos,id_linea_categoriaBusquedaDisponiblesCostos,id_linea_marcaBusquedaDisponiblesCostos,fecha_emision_hastaBusquedaDisponiblesCostos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDisponiblesCostoss("BusquedaDisponiblesCostos",disponiblescostosLogic.getDisponiblesCostoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDisponiblesCostoss("BusquedaDisponiblesCostos",disponiblescostoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						disponiblescostosLogic.setDisponiblesCostoss(new ArrayList<DisponiblesCostos>());
						disponiblescostosLogic.getDisponiblesCostoss().addAll(disponiblescostossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							disponiblescostoss=new ArrayList<DisponiblesCostos>();
							disponiblescostoss.addAll(disponiblescostossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDisponiblesCostos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDisponiblesCostos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=disponiblescostosLogic.getDisponiblesCostoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=disponiblescostoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=disponiblescostosLogic.getDisponiblesCostoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=disponiblescostoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DisponiblesCostos disponiblescostos) {
		Boolean permite=true;
		
		if(this.disponiblescostos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DisponiblesCostosConstantesFunciones.getOrderByListaDisponiblesCostos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DisponiblesCostosConstantesFunciones.getOrderByListaDisponiblesCostos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DisponiblesCostos disponiblescostos:disponiblescostosLogic.getDisponiblesCostoss()) {
				if(disponiblescostos.getsType().equals(Constantes2.S_TOTALES)) {
					disponiblescostosTotales=disponiblescostos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DisponiblesCostos disponiblescostos:this.disponiblescostoss) {
				if(disponiblescostos.getsType().equals(Constantes2.S_TOTALES)) {
					disponiblescostosTotales=disponiblescostos;
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
			this.disponiblescostosAux=new DisponiblesCostos();
			this.disponiblescostosAux.setsType(Constantes2.S_TOTALES);
			this.disponiblescostosAux.setIsNew(false);
			this.disponiblescostosAux.setIsChanged(false);
			this.disponiblescostosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//DisponiblesCostosConstantesFunciones.TotalizarValoresFilaDisponiblesCostos(this.disponiblescostosLogic.getDisponiblesCostoss(),this.disponiblescostosAux);
				
				//this.disponiblescostosLogic.getDisponiblesCostoss().add(this.disponiblescostosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DisponiblesCostosConstantesFunciones.TotalizarValoresFilaDisponiblesCostos(this.disponiblescostoss,this.disponiblescostosAux);
				
				this.disponiblescostoss.add(this.disponiblescostosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		disponiblescostosTotales=new DisponiblesCostos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.disponiblescostosLogic.getDisponiblesCostoss().remove(disponiblescostosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.disponiblescostoss.remove(disponiblescostosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		disponiblescostosTotales=new DisponiblesCostos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DisponiblesCostos disponiblescostos:disponiblescostosLogic.getDisponiblesCostoss()) {
				if(disponiblescostos.getsType().equals(Constantes2.S_TOTALES)) {
					disponiblescostosTotales=disponiblescostos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DisponiblesCostosConstantesFunciones.TotalizarValoresFilaDisponiblesCostos(this.disponiblescostosLogic.getDisponiblesCostoss(),disponiblescostosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DisponiblesCostos disponiblescostos:this.disponiblescostoss) {
				if(disponiblescostos.getsType().equals(Constantes2.S_TOTALES)) {
					disponiblescostosTotales=disponiblescostos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DisponiblesCostosConstantesFunciones.TotalizarValoresFilaDisponiblesCostos(this.disponiblescostoss,disponiblescostosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDisponiblesCostossBusquedaDisponiblesCostos()throws Exception {
		try {
			sAccionBusqueda="BusquedaDisponiblesCostos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDisponiblesCostossFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDisponiblesCostossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDisponiblesCostossFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDisponiblesCostossFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDisponiblesCostossFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDisponiblesCostossFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDisponiblesCostossFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDisponiblesCostossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDisponiblesCostossBusquedaDisponiblesCostos(String sFinalQuery,Long id_bodega,Long id_producto,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//disponiblescostosLogic.getDisponiblesCostossBusquedaDisponiblesCostos(sFinalQuery,this.pagination,id_bodega,id_producto,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDisponiblesCostossFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//disponiblescostosLogic.getDisponiblesCostossFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDisponiblesCostossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//disponiblescostosLogic.getDisponiblesCostossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDisponiblesCostossFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//disponiblescostosLogic.getDisponiblesCostossFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDisponiblesCostossFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//disponiblescostosLogic.getDisponiblesCostossFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDisponiblesCostossFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//disponiblescostosLogic.getDisponiblesCostossFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDisponiblesCostossFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//disponiblescostosLogic.getDisponiblesCostossFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDisponiblesCostossFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//disponiblescostosLogic.getDisponiblesCostossFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDisponiblesCostossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//disponiblescostosLogic.getDisponiblesCostossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosDisponiblesCostos() {
		this.isPermisoTodoDisponiblesCostos=false;
		this.isPermisoNuevoDisponiblesCostos=false;
		this.isPermisoActualizarDisponiblesCostos=false;
		this.isPermisoActualizarOriginalDisponiblesCostos=false;
		this.isPermisoEliminarDisponiblesCostos=false;
		this.isPermisoGuardarCambiosDisponiblesCostos=false;
		this.isPermisoConsultaDisponiblesCostos=true;
		this.isPermisoBusquedaDisponiblesCostos=true;
		this.isPermisoReporteDisponiblesCostos=true;
		this.isPermisoOrdenDisponiblesCostos=false;		
		this.isPermisoPaginacionMedioDisponiblesCostos=false;		
		this.isPermisoPaginacionAltoDisponiblesCostos=false;		
		this.isPermisoPaginacionTodoDisponiblesCostos=false;		
		this.isPermisoCopiarDisponiblesCostos=false;		
		this.isPermisoVerFormDisponiblesCostos=false;		
		this.isPermisoDuplicarDisponiblesCostos=false;
		this.isPermisoOrdenDisponiblesCostos=false;
	}
	
	public void setPermisosUsuarioDisponiblesCostos(Boolean isPermiso) {
		this.isPermisoTodoDisponiblesCostos=isPermiso;
		this.isPermisoNuevoDisponiblesCostos=isPermiso;
		this.isPermisoActualizarDisponiblesCostos=isPermiso;
		this.isPermisoActualizarOriginalDisponiblesCostos=isPermiso;
		this.isPermisoEliminarDisponiblesCostos=isPermiso;
		this.isPermisoGuardarCambiosDisponiblesCostos=isPermiso;
		this.isPermisoConsultaDisponiblesCostos=isPermiso;
		this.isPermisoBusquedaDisponiblesCostos=isPermiso;
		this.isPermisoReporteDisponiblesCostos=isPermiso;
		this.isPermisoOrdenDisponiblesCostos=isPermiso;		
		this.isPermisoPaginacionMedioDisponiblesCostos=isPermiso;		
		this.isPermisoPaginacionAltoDisponiblesCostos=isPermiso;		
		this.isPermisoPaginacionTodoDisponiblesCostos=isPermiso;		
		this.isPermisoCopiarDisponiblesCostos=isPermiso;		
		this.isPermisoVerFormDisponiblesCostos=isPermiso;		
		this.isPermisoDuplicarDisponiblesCostos=isPermiso;
		this.isPermisoOrdenDisponiblesCostos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDisponiblesCostos(Boolean isPermiso) {
		//this.isPermisoTodoDisponiblesCostos=isPermiso;
		this.isPermisoNuevoDisponiblesCostos=isPermiso;
		this.isPermisoActualizarDisponiblesCostos=isPermiso;
		this.isPermisoActualizarOriginalDisponiblesCostos=isPermiso;
		this.isPermisoEliminarDisponiblesCostos=isPermiso;
		this.isPermisoGuardarCambiosDisponiblesCostos=isPermiso;
		//this.isPermisoConsultaDisponiblesCostos=isPermiso;
		//this.isPermisoBusquedaDisponiblesCostos=isPermiso;
		//this.isPermisoReporteDisponiblesCostos=isPermiso;
		//this.isPermisoOrdenDisponiblesCostos=isPermiso;		
		//this.isPermisoPaginacionMedioDisponiblesCostos=isPermiso;		
		//this.isPermisoPaginacionAltoDisponiblesCostos=isPermiso;		
		//this.isPermisoPaginacionTodoDisponiblesCostos=isPermiso;		
		//this.isPermisoCopiarDisponiblesCostos=isPermiso;		
		//this.isPermisoDuplicarDisponiblesCostos=isPermiso;
		//this.isPermisoOrdenDisponiblesCostos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDisponiblesCostosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DisponiblesCostosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDisponiblesCostos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDisponiblesCostosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDisponiblesCostosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDisponiblesCostosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDisponiblesCostosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDisponiblesCostos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DisponiblesCostosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DisponiblesCostosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDisponiblesCostos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDisponiblesCostos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDisponiblesCostos=this.isPermisoActualizarDisponiblesCostos;
			this.isPermisoEliminarDisponiblesCostos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDisponiblesCostos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDisponiblesCostos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDisponiblesCostos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDisponiblesCostos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDisponiblesCostos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDisponiblesCostos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDisponiblesCostos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDisponiblesCostos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDisponiblesCostos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDisponiblesCostos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDisponiblesCostos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDisponiblesCostos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDisponiblesCostos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDisponiblesCostos.setToolTipText(this.jTableDatosDisponiblesCostos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDisponiblesCostos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDisponiblesCostos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DisponiblesCostosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DisponiblesCostosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDisponiblesCostos() throws Exception {
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
	public void inicializarCombosForeignKeyDisponiblesCostosListas()throws Exception {
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
	
	public void cargarCombosTodosForeignKeyDisponiblesCostosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DisponiblesCostosJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyDisponiblesCostos()throws Exception {
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
			if(this.disponiblescostosSessionBean==null) {
				this.disponiblescostosSessionBean=new DisponiblesCostosSessionBean();
			}

			if(!this.disponiblescostosSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.disponiblescostosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

			if(!this.disponiblescostosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.disponiblescostosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.disponiblescostosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.disponiblescostosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

			if(!this.disponiblescostosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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

			if(!this.disponiblescostosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
	
	public void initActionsCombosTodosForeignKeyDisponiblesCostos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDisponiblesCostos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDisponiblesCostos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDisponiblesCostos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDisponiblesCostos(DisponiblesCostos disponiblescostos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDisponiblesCostos(DisponiblesCostos disponiblescostos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDisponiblesCostos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDisponiblesCostos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDisponiblesCostos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDisponiblesCostos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDisponiblesCostos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDisponiblesCostos()throws Exception {
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
	
	public void cargarCombosFrameForeignKeyDisponiblesCostos(String sFormularioTipoBusqueda)throws Exception {
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
	
	public void setItemDefectoCombosForeignKeyDisponiblesCostos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_bodegaDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_bodegaDisponiblesCostos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_bodegaDisponiblesCostos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_productoDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_productoDisponiblesCostos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_productoDisponiblesCostos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_empresaDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_empresaDisponiblesCostos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_empresaDisponiblesCostos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_sucursalDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_sucursalDisponiblesCostos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_sucursalDisponiblesCostos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_lineaDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_lineaDisponiblesCostos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_lineaDisponiblesCostos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_grupoDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_grupoDisponiblesCostos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_grupoDisponiblesCostos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_categoriaDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_categoriaDisponiblesCostos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_categoriaDisponiblesCostos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_marcaDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_marcaDisponiblesCostos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_marcaDisponiblesCostos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public DisponiblesCostosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DisponiblesCostosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DisponiblesCostosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.disponiblescostosSessionBean=new DisponiblesCostosSessionBean(); 
		this.disponiblescostosConstantesFunciones=new DisponiblesCostosConstantesFunciones(); 
		this.disponiblescostosBean=new DisponiblesCostos();//(this.disponiblescostosConstantesFunciones); 		
		this.disponiblescostosReturnGeneral=new DisponiblesCostosParameterReturnGeneral(); 
		
		this.disponiblescostosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.disponiblescostosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DisponiblesCostosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DisponiblesCostosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DisponiblesCostosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDisponiblesCostos(true);
			
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
			
			this.disponiblescostosConstantesFunciones=new DisponiblesCostosConstantesFunciones(); 
			this.disponiblescostosBean=new DisponiblesCostos();//this.disponiblescostosConstantesFunciones); 			
			this.disponiblescostosReturnGeneral=new DisponiblesCostosParameterReturnGeneral(); 
		
			DisponiblesCostosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Disponibles Costos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.disponiblescostos=new DisponiblesCostos();
			this.disponiblescostoss = new ArrayList<DisponiblesCostos>();
			this.disponiblescostossAux = new ArrayList<DisponiblesCostos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic=new DisponiblesCostosLogic();
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}
			
			//this.disponiblescostosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.disponiblescostosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDisponiblesCostos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDisponiblesCostos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDisponiblesCostos);	
					}
					
					if(this.jInternalFrameImportacionDisponiblesCostos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDisponiblesCostos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDisponiblesCostos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDisponiblesCostos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDisponiblesCostos);
				this.jInternalFrameDetalleFormDisponiblesCostos.setVisible(false);
				this.jInternalFrameDetalleFormDisponiblesCostos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDisponiblesCostos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDisponiblesCostos);
					this.jInternalFrameReporteDinamicoDisponiblesCostos.setVisible(false);
					this.jInternalFrameReporteDinamicoDisponiblesCostos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDisponiblesCostos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDisponiblesCostos);
					this.jInternalFrameImportacionDisponiblesCostos.setVisible(false);
					this.jInternalFrameImportacionDisponiblesCostos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDisponiblesCostos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDisponiblesCostos);
					this.jInternalFrameOrderByDisponiblesCostos.setVisible(false);
					this.jInternalFrameOrderByDisponiblesCostos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDisponiblesCostosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DisponiblesCostosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.disponiblescostosReturnGeneral=new DisponiblesCostosParameterReturnGeneral();
			
			this.disponiblescostosParameterGeneral=new DisponiblesCostosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.disponiblescostosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DisponiblesCostosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DisponiblesCostosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.disponiblescostosSessionBean.getEsGuardarRelacionado(),this.disponiblescostosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DisponiblesCostosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.disponiblescostosSessionBean.getEsGuardarRelacionado(),this.disponiblescostosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDisponiblesCostos=false;
			this.isVisibilidadCeldaDuplicarDisponiblesCostos=true;
			this.isVisibilidadCeldaCopiarDisponiblesCostos=true;
			this.isVisibilidadCeldaVerFormDisponiblesCostos=true;
			this.isVisibilidadCeldaOrdenDisponiblesCostos=true;
			this.isVisibilidadCeldaNuevoRelacionesDisponiblesCostos=false;
			this.isVisibilidadCeldaModificarDisponiblesCostos=false;
			this.isVisibilidadCeldaActualizarDisponiblesCostos=false;
			this.isVisibilidadCeldaEliminarDisponiblesCostos=false;
			this.isVisibilidadCeldaCancelarDisponiblesCostos=false;
			this.isVisibilidadCeldaGuardarDisponiblesCostos=false;
			this.isVisibilidadCeldaGuardarCambiosDisponiblesCostos=false;
			
			
			this.isVisibilidadBusquedaDisponiblesCostos=true;
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
			
			//this.actualizarEstadoCeldasBotonesDisponiblesCostos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDisponiblesCostos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDisponiblesCostos(false);
			
			this.setPermisosUsuarioDisponiblesCostos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.disponiblescostosSessionBean.getEsGuardarRelacionado() 
				|| (this.disponiblescostosSessionBean.getEsGuardarRelacionado() && this.disponiblescostosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDisponiblesCostosClasesRelacionadas();
			}
			
			if(this.disponiblescostosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDisponiblesCostosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDisponiblesCostos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDisponiblesCostos();
			}
			
			if(!this.isPermisoBusquedaDisponiblesCostos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDisponiblesCostos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DisponiblesCostosConstantesFunciones.getTiposSeleccionarDisponiblesCostos());
				
				this.tiposColumnasSelect=DisponiblesCostosConstantesFunciones.getTiposSeleccionarDisponiblesCostos(true);
				
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
			//if(!this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDisponiblesCostos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioDisponiblesCostos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioDisponiblesCostos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDisponiblesCostos() ;
			
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
				disponiblescostosImplementable= (DisponiblesCostosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DisponiblesCostosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				disponiblescostosImplementableHome= (DisponiblesCostosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DisponiblesCostosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.disponiblescostoss= new ArrayList<DisponiblesCostos>();
			this.disponiblescostossEliminados= new ArrayList<DisponiblesCostos>();
						
			this.isEsNuevoDisponiblesCostos=false;
			this.esParaAccionDesdeFormularioDisponiblesCostos=false;
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
				this.cargarCombosForeignKeyDisponiblesCostos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDisponiblesCostos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DisponiblesCostosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DisponiblesCostosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDisponiblesCostos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDisponiblesCostos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDisponiblesCostos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDisponiblesCostos();
			}
			
			DisponiblesCostosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDisponiblesCostos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDisponiblesCostos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDisponiblesCostos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDisponiblesCostos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DisponiblesCostos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDisponiblesCostos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDisponiblesCostos")) {
				iIndex=this.jInternalFrameDetalleFormDisponiblesCostos.jTabbedPaneRelacionesDisponiblesCostos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDisponiblesCostos.jTabbedPaneRelacionesDisponiblesCostos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDisponiblesCostos();	
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
	
	public void cargarCombosForeignKeyDisponiblesCostos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDisponiblesCostos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDisponiblesCostos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDisponiblesCostosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDisponiblesCostos();
		
		this.cargarCombosFrameForeignKeyDisponiblesCostos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDisponiblesCostos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDisponiblesCostos();
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
	
	public void jButtonNuevoDisponiblesCostosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.disponiblescostosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDisponiblesCostos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
			
			
			if(jTableDatosDisponiblesCostos.getRowCount()>=1) {
				jTableDatosDisponiblesCostos.removeRowSelectionInterval(0, jTableDatosDisponiblesCostos.getRowCount()-1);						
			}
			
			this.isEsNuevoDisponiblesCostos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDisponiblesCostos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDisponiblesCostos(true);			
			//this.disponiblescostos=new DisponiblesCostos();
			//this.disponiblescostos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDisponiblesCostos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDisponiblesCostos() ;
			
			if(DisponiblesCostosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDisponiblesCostos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.disponiblescostos);	
			this.actualizarInformacion("INFO_PADRE",false,this.disponiblescostos);				
			
			DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
			
			if(this.disponiblescostosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DisponiblesCostos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDisponiblesCostosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DisponiblesCostos> disponiblescostossSeleccionados=new ArrayList<DisponiblesCostos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDisponiblesCostos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDisponiblesCostos.getSelectedRows().length;			
			}
			
			disponiblescostossSeleccionados=this.getDisponiblesCostossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDisponiblesCostos--;			
				//DisponiblesCostos disponiblescostosAux= new DisponiblesCostos();			
				//disponiblescostosAux.setId(this.iIdNuevoDisponiblesCostos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DisponiblesCostos disponiblescostosOrigen=new DisponiblesCostos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DisponiblesCostos disponiblescostosOrigen : disponiblescostossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							disponiblescostosOrigen =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							disponiblescostosOrigen =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDisponiblesCostos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.disponiblescostos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDisponiblesCostos(disponiblescostosOrigen,this.disponiblescostos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.disponiblescostosLogic.getDisponiblesCostoss().add(this.disponiblescostosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.disponiblescostoss.add(this.disponiblescostosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDisponiblesCostos(false);
				
				this.jTableDatosDisponiblesCostos.setRowSelectionInterval(this.getIndiceNuevoDisponiblesCostos(), this.getIndiceNuevoDisponiblesCostos());
				
				int iLastRow =  this.jTableDatosDisponiblesCostos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDisponiblesCostos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDisponiblesCostos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDisponiblesCostos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DisponiblesCostos> disponiblescostossSeleccionados=new ArrayList<DisponiblesCostos>();									
		
			DisponiblesCostos disponiblescostosOrigen=new DisponiblesCostos();
			DisponiblesCostos disponiblescostosDestino=new DisponiblesCostos();
				
			disponiblescostossSeleccionados=this.getDisponiblesCostossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDisponiblesCostos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || disponiblescostossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDisponiblesCostos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						disponiblescostosOrigen =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						disponiblescostosOrigen =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						disponiblescostosDestino =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						disponiblescostosDestino =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				disponiblescostosOrigen =disponiblescostossSeleccionados.get(0);
				disponiblescostosDestino =disponiblescostossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDisponiblesCostos(disponiblescostosOrigen,disponiblescostosDestino,true,false);
				
				disponiblescostosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(disponiblescostosDestino,disponiblescostosLogic.getDisponiblesCostoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(disponiblescostosDestino,disponiblescostoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDisponiblesCostos(false);
				
				//this.jTableDatosDisponiblesCostos.setRowSelectionInterval(this.getIndiceNuevoDisponiblesCostos(), this.getIndiceNuevoDisponiblesCostos());
				
				int iLastRow =  this.jTableDatosDisponiblesCostos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDisponiblesCostos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDisponiblesCostos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDisponiblesCostos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDisponiblesCostos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDisponiblesCostos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDisponiblesCostos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDisponiblesCostos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDisponiblesCostos.setVisible(!isVisible);
			this.jPanelPaginacionDisponiblesCostos.setVisible(!isVisible);
			this.jPanelAccionesDisponiblesCostos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDisponiblesCostos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDisponiblesCostos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDisponiblesCostos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDisponiblesCostos();
			
			this.abrirFrameOrderByDisponiblesCostos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDisponiblesCostos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDisponiblesCostos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDisponiblesCostos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDisponiblesCostos.isMaximum()) {
					this.jInternalFrameDetalleFormDisponiblesCostos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDisponiblesCostos.setSize(this.jInternalFrameDetalleFormDisponiblesCostos.iWidthFormulario,this.jInternalFrameDetalleFormDisponiblesCostos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDisponiblesCostos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDisponiblesCostos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDisponiblesCostos.isMaximum()) {
						this.jInternalFrameDetalleFormDisponiblesCostos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDisponiblesCostos.jContentPaneDetalleDisponiblesCostos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDisponiblesCostos.jTabbedPaneRelacionesDisponiblesCostos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDisponiblesCostos.jContentPaneDetalleDisponiblesCostos.getWidth(),DisponiblesCostosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDisponiblesCostos.jTabbedPaneRelacionesDisponiblesCostos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDisponiblesCostos.jContentPaneDetalleDisponiblesCostos.getWidth(),DisponiblesCostosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDisponiblesCostos.jTabbedPaneRelacionesDisponiblesCostos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDisponiblesCostos.jContentPaneDetalleDisponiblesCostos.getWidth(),DisponiblesCostosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDisponiblesCostos.setVisible(true);
	        this.jInternalFrameDetalleFormDisponiblesCostos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDisponiblesCostos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDisponiblesCostos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDisponiblesCostos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDisponiblesCostos,false,this);
				} else {
					this.jInternalFrameOrderByDisponiblesCostos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDisponiblesCostos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDisponiblesCostos);
				this.jInternalFrameOrderByDisponiblesCostos.setVisible(false);
				this.jInternalFrameOrderByDisponiblesCostos.setSelected(false);
				
				this.jInternalFrameOrderByDisponiblesCostos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDisponiblesCostos"));
				
				this.inicializarActualizarBindingTablaOrderByDisponiblesCostos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDisponiblesCostos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDisponiblesCostos==null) {
				
				this.jInternalFrameImportacionDisponiblesCostos=new ImportacionJInternalFrame(DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDisponiblesCostos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDisponiblesCostos);
				this.jInternalFrameImportacionDisponiblesCostos.setVisible(false);
				this.jInternalFrameImportacionDisponiblesCostos.setSelected(false);


				this.jInternalFrameImportacionDisponiblesCostos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDisponiblesCostos"));
				this.jInternalFrameImportacionDisponiblesCostos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDisponiblesCostos"));
				this.jInternalFrameImportacionDisponiblesCostos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDisponiblesCostos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDisponiblesCostos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDisponiblesCostos==null) {
				this.jInternalFrameReporteDinamicoDisponiblesCostos=new ReporteDinamicoJInternalFrame(DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDisponiblesCostos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDisponiblesCostos);
				this.jInternalFrameReporteDinamicoDisponiblesCostos.setVisible(false);
				this.jInternalFrameReporteDinamicoDisponiblesCostos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDisponiblesCostos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDisponiblesCostos"));
				this.jInternalFrameReporteDinamicoDisponiblesCostos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDisponiblesCostos"));
				this.jInternalFrameReporteDinamicoDisponiblesCostos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDisponiblesCostos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDisponiblesCostos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDisponiblesCostos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDisponiblesCostos);
			
	       	this.jInternalFrameDetalleFormDisponiblesCostos.setVisible(false);
	        this.jInternalFrameDetalleFormDisponiblesCostos.setSelected(false);
			
			//this.jInternalFrameDetalleFormDisponiblesCostos.dispose();
			//this.jInternalFrameDetalleFormDisponiblesCostos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDisponiblesCostos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDisponiblesCostos.setVisible(true);
	        this.jInternalFrameReporteDinamicoDisponiblesCostos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDisponiblesCostos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDisponiblesCostos.setVisible(true);
	        this.jInternalFrameImportacionDisponiblesCostos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDisponiblesCostos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDisponiblesCostos.setVisible(true);
	        this.jInternalFrameOrderByDisponiblesCostos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDisponiblesCostos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDisponiblesCostos.setVisible(false);
	        this.jInternalFrameOrderByDisponiblesCostos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDisponiblesCostos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDisponiblesCostos.setVisible(false);
	        this.jInternalFrameReporteDinamicoDisponiblesCostos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDisponiblesCostos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDisponiblesCostos.setVisible(false);
	        this.jInternalFrameImportacionDisponiblesCostos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDisponiblesCostos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDisponiblesCostos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDisponiblesCostos(true);
			//this.isEsNuevoDisponiblesCostos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDisponiblesCostos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDisponiblesCostos(false) ;
			
			if(disponiblescostosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DisponiblesCostosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDisponiblesCostos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDisponiblesCostos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDisponiblesCostosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDisponiblesCostos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDisponiblesCostos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDisponiblesCostos(true);
			//this.isEsNuevoDisponiblesCostos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.disponiblescostos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDisponiblesCostos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDisponiblesCostos(false) ;
			
			if(DisponiblesCostosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDisponiblesCostos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDisponiblesCostos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,DisponiblesCostosConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDisponiblesCostos.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,DisponiblesCostosConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDisponiblesCostos.getSelectedRow();

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
		TableColumn tableColumnLinea=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,DisponiblesCostosConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDisponiblesCostos.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,DisponiblesCostosConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDisponiblesCostos.getSelectedRow();

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
		TableColumn tableColumnLineaCategoria=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,DisponiblesCostosConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDisponiblesCostos.getSelectedRow();

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
		TableColumn tableColumnLineaMarca=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,DisponiblesCostosConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDisponiblesCostos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDisponiblesCostos(false);
			
			//if(!this.isEsNuevoDisponiblesCostos) {								
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DisponiblesCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				
			}
			
			if(this.permiteMantenimiento(this.disponiblescostos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDisponiblesCostos=true;
					this.inicializarActualizarBindingTablaDisponiblesCostos(false);
					this.isEsNuevoDisponiblesCostos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDisponiblesCostos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDisponiblesCostos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDisponiblesCostos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDisponiblesCostos(false);
				
				this.habilitarDeshabilitarControlesDisponiblesCostos(false);
			
												
				
				if(DisponiblesCostosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDisponiblesCostos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDisponiblesCostosActionPerformed(evt,disponiblescostosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDisponiblesCostos(this.disponiblescostos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDisponiblesCostos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,disponiblescostosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.disponiblescostos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DisponiblesCostos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DisponiblesCostos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				this.disponiblescostos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				this.disponiblescostos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.disponiblescostos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DisponiblesCostosModel) this.jTableDatosDisponiblesCostos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDisponiblesCostos=true;
				this.inicializarActualizarBindingTablaDisponiblesCostos(false);
				this.isEsNuevoDisponiblesCostos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDisponiblesCostos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDisponiblesCostos(false);
				
				this.habilitarDeshabilitarControlesDisponiblesCostos(false);
				
				
				
				if(DisponiblesCostosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDisponiblesCostos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDisponiblesCostos.getRowCount()>=1) {
				jTableDatosDisponiblesCostos.removeRowSelectionInterval(0, jTableDatosDisponiblesCostos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDisponiblesCostos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDisponiblesCostos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDisponiblesCostos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDisponiblesCostos(false) ;
			
			this.isEsNuevoDisponiblesCostos=false;
			
			if(DisponiblesCostosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDisponiblesCostos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDisponiblesCostos(false);
				
				//SI ES MANUAL
				if(DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDisponiblesCostos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDisponiblesCostos--;			
			//DisponiblesCostos disponiblescostosAux= new DisponiblesCostos();			
			//disponiblescostosAux.setId(this.iIdNuevoDisponiblesCostos);
			
			if(this.jInternalFrameDetalleFormDisponiblesCostos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDisponiblesCostos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
			
			this.disponiblescostos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.disponiblescostosLogic.getDisponiblesCostoss().add(this.disponiblescostosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.disponiblescostoss.add(this.disponiblescostosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDisponiblesCostos(false);
			
			this.jTableDatosDisponiblesCostos.setRowSelectionInterval(this.getIndiceNuevoDisponiblesCostos(), this.getIndiceNuevoDisponiblesCostos());
			
			int iLastRow =  this.jTableDatosDisponiblesCostos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDisponiblesCostos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDisponiblesCostos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDisponiblesCostos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDisponiblesCostos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDisponiblesCostos(false);
			
			//SI ES MANUAL
			if(DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDisponiblesCostos();
			}
			
			//this.abrirFrameTreeDisponiblesCostos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDisponiblesCostos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDisponiblesCostos.setFileImportacion(this.jInternalFrameImportacionDisponiblesCostos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDisponiblesCostos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDisponiblesCostos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDisponiblesCostos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDisponiblesCostos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DisponiblesCostos> disponiblescostossSeleccionados=new ArrayList<DisponiblesCostos>();		

		disponiblescostossSeleccionados=this.getDisponiblesCostossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDisponiblesCostos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDisponiblesCostos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DisponiblesCostosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DisponiblesCostosBaseDesign.jrxml";
			
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
			
			this.generarReporteDisponiblesCostoss("Todos",disponiblescostossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Disponibles Costos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDisponiblesCostos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDisponiblesCostos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLinea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLinea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLinea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLinea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaCategoria_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaCategoria_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaCategoria_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaCategoria_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaMarca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaMarca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaMarca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaMarca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DisponiblesCostosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBREBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUnidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DisponiblesCostosConstantesFunciones.LABEL_INGRESOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_gresos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_gresos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_gresos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_gresos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DisponiblesCostosConstantesFunciones.LABEL_EGRESOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_resos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_resos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_resos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_resos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DisponiblesCostosConstantesFunciones.LABEL_DISPONIBLECORTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sponibleCorte_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sponibleCorte_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sponibleCorte_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sponibleCorte_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DisponiblesCostosConstantesFunciones.LABEL_COSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DisponiblesCostosConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDisponiblesCostos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDisponiblesCostos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDisponiblesCostos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoria="nombre_sucursal";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoria="nombre_linea";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					sNombreCampoCategoria="nombre_linea_grupo";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					sNombreCampoCategoria="nombre_linea_categoria";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					sNombreCampoCategoria="nombre_linea_marca";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoria="nombre_bodega";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoria="nombre_unidad";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_INGRESOS:
					sNombreCampoCategoria="ingresos";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_EGRESOS:
					sNombreCampoCategoria="egresos";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_DISPONIBLECORTE:
					sNombreCampoCategoria="disponible_corte";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoria="costo";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDisponiblesCostos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoriaValor="nombre_sucursal";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoriaValor="nombre_linea";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					sNombreCampoCategoriaValor="nombre_linea_grupo";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					sNombreCampoCategoriaValor="nombre_linea_categoria";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					sNombreCampoCategoriaValor="nombre_linea_marca";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoriaValor="nombre_bodega";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoriaValor="nombre_unidad";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_INGRESOS:
					sNombreCampoCategoriaValor="ingresos";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_EGRESOS:
					sNombreCampoCategoriaValor="egresos";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_DISPONIBLECORTE:
					sNombreCampoCategoriaValor="disponible_corte";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoriaValor="costo";
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDisponiblesCostos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDisponiblesCostos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sucursal");
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea");
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_grupo");
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Categoria",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_categoria");
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_marca");
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBREBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_bodega");
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBREUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_unidad");
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_INGRESOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ingresos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ingresos");
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_EGRESOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Egresos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"egresos");
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_DISPONIBLECORTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Disponible Corte",sNombreCampoCategoria,sNombreCampoCategoriaValor,"disponible_corte");
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_COSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo");
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
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
	
	public void jButtonGenerarExcelReporteDinamicoDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DisponiblesCostos> disponiblescostossSeleccionados=new ArrayList<DisponiblesCostos>();		
		
		disponiblescostossSeleccionados=this.getDisponiblesCostossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"disponiblescostos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DisponiblesCostoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDisponiblesCostos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDisponiblesCostos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DisponiblesCostosConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBRESUCURSAL);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getnombre_sucursal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEA);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getnombre_linea());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getnombre_linea_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getnombre_linea_categoria());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getnombre_linea_marca());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBREBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBREBODEGA);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getnombre_bodega());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBREUNIDAD);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getnombre_unidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_INGRESOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_INGRESOS);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getingresos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_EGRESOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_EGRESOS);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getegresos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_DISPONIBLECORTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_DISPONIBLECORTE);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getdisponible_corte());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_COSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_COSTO);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.getcosto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DisponiblesCostosConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(DisponiblesCostos disponiblescostos:disponiblescostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(disponiblescostos.gettotal());
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
			//	this.getFilaCabeceraExportarExcelDisponiblesCostos(row);				
			//	iRow++;
			//}				
			
			//for(DisponiblesCostos disponiblescostosAux:disponiblescostossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDisponiblesCostos(disponiblescostosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Disponibles Costos",JOptionPane.INFORMATION_MESSAGE);
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
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDisponiblesCostos(false);
			
			//SI ES MANUAL
			if(DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDisponiblesCostos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDisponiblesCostos(false);
			
			//SI ES MANUAL
			if(DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDisponiblesCostos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDisponiblesCostos(false);
			
			//SI ES MANUAL
			if(DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDisponiblesCostos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDisponiblesCostos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDisponiblesCostos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDisponiblesCostos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDisponiblesCostos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDisponiblesCostos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDisponiblesCostos.setMinimumSize(dimensionMinimum);
		this.jTableDatosDisponiblesCostos.setMaximumSize(dimensionMaximum);
		this.jTableDatosDisponiblesCostos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDisponiblesCostos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDisponiblesCostos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDisponiblesCostos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDisponiblesCostos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDisponiblesCostos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDisponiblesCostos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDisponiblesCostos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDisponiblesCostos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DisponiblesCostosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDisponiblesCostos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDisponiblesCostos();
		
		this.inicializarActualizarBindingBotonesManualDisponiblesCostos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDisponiblesCostos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDisponiblesCostos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDisponiblesCostos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDisponiblesCostos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDisponiblesCostos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDisponiblesCostos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDisponiblesCostos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDisponiblesCostos.jCheckBoxPostAccionNuevoDisponiblesCostos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDisponiblesCostos.jCheckBoxPostAccionSinCerrarDisponiblesCostos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDisponiblesCostos.jCheckBoxPostAccionSinMensajeDisponiblesCostos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDisponiblesCostos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDisponiblesCostos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDisponiblesCostos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
				this.jInternalFrameDetalleFormDisponiblesCostos.jCheckBoxPostAccionNuevoDisponiblesCostos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDisponiblesCostos.jCheckBoxPostAccionSinCerrarDisponiblesCostos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDisponiblesCostos.jCheckBoxPostAccionSinMensajeDisponiblesCostos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDisponiblesCostos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDisponiblesCostos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxTiposAccionesFormularioDisponiblesCostos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDisponiblesCostos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDisponiblesCostos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDisponiblesCostos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDisponiblesCostos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDisponiblesCostos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDisponiblesCostos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDisponiblesCostos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDisponiblesCostos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDisponiblesCostos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDisponiblesCostos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDisponiblesCostos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDisponiblesCostos(Boolean esInicializar) throws Exception {
		try	{	
			if(DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDisponiblesCostos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDisponiblesCostos() throws Exception {
		try	{
			if(DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDisponiblesCostos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDisponiblesCostos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxTiposAccionesFormularioDisponiblesCostos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxTiposAccionesFormularioDisponiblesCostos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDisponiblesCostos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDisponiblesCostos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDisponiblesCostos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDisponiblesCostos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDisponiblesCostos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDisponiblesCostos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDisponiblesCostos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDisponiblesCostos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDisponiblesCostos.addItem(reporte);
			}
			
			
			if(!this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDisponiblesCostos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDisponiblesCostos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDisponiblesCostos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDisponiblesCostos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDisponiblesCostos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDisponiblesCostos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxTiposAccionesFormularioDisponiblesCostos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxTiposAccionesFormularioDisponiblesCostos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDisponiblesCostos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDisponiblesCostos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDisponiblesCostos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDisponiblesCostos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDisponiblesCostos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDisponiblesCostos!=null) {
				this.jInternalFrameReporteDinamicoDisponiblesCostos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDisponiblesCostos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDisponiblesCostos!=null) {
				this.jInternalFrameReporteDinamicoDisponiblesCostos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDisponiblesCostos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDisponiblesCostos!=null) {
				
				if(this.jInternalFrameReporteDinamicoDisponiblesCostos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDisponiblesCostos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDisponiblesCostos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDisponiblesCostos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDisponiblesCostos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDisponiblesCostos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDisponiblesCostos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDisponiblesCostos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DisponiblesCostosConstantesFunciones.getTiposSeleccionarDisponiblesCostos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDisponiblesCostos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDisponiblesCostos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDisponiblesCostos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DisponiblesCostosConstantesFunciones.getTiposSeleccionarDisponiblesCostos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDisponiblesCostos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDisponiblesCostos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDisponiblesCostos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DisponiblesCostosConstantesFunciones.getTiposSeleccionarDisponiblesCostos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDisponiblesCostos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDisponiblesCostos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDisponiblesCostos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDisponiblesCostos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDisponiblesCostos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaBusquedaDisponiblesCostosDisponiblesCostos.getSelectedItem()!=null){this.id_bodegaBusquedaDisponiblesCostos=((Bodega)this.jComboBoxid_bodegaBusquedaDisponiblesCostosDisponiblesCostos.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoBusquedaDisponiblesCostosDisponiblesCostos.getSelectedItem()!=null){this.id_productoBusquedaDisponiblesCostos=((Producto)this.jComboBoxid_productoBusquedaDisponiblesCostosDisponiblesCostos.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaDisponiblesCostosDisponiblesCostos.getSelectedItem()!=null){this.id_lineaBusquedaDisponiblesCostos=((Linea)this.jComboBoxid_lineaBusquedaDisponiblesCostosDisponiblesCostos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos.getSelectedItem()!=null){this.id_linea_grupoBusquedaDisponiblesCostos=((Linea)this.jComboBoxid_linea_grupoBusquedaDisponiblesCostosDisponiblesCostos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos.getSelectedItem()!=null){this.id_linea_categoriaBusquedaDisponiblesCostos=((Linea)this.jComboBoxid_linea_categoriaBusquedaDisponiblesCostosDisponiblesCostos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos.getSelectedItem()!=null){this.id_linea_marcaBusquedaDisponiblesCostos=((Linea)this.jComboBoxid_linea_marcaBusquedaDisponiblesCostosDisponiblesCostos.getSelectedItem()).getId();}
		this.fecha_emision_hastaBusquedaDisponiblesCostos=new Date(this.jDateChooserfecha_emision_hastaBusquedaDisponiblesCostosDisponiblesCostos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDisponiblesCostos(Boolean esInicializar) throws Exception {				
		if(DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDisponiblesCostos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDisponiblesCostos() throws Exception {
		this.inicializarActualizarBindingTablaDisponiblesCostos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDisponiblesCostos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDisponiblesCostos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDisponiblesCostos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDisponiblesCostos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DisponiblesCostosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDisponiblesCostos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDisponiblesCostos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DisponiblesCostosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDisponiblesCostosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DisponiblesCostosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDisponiblesCostos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDisponiblesCostos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DisponiblesCostosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDisponiblesCostos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDisponiblesCostos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=disponiblescostosLogic.getDisponiblesCostoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=disponiblescostoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DisponiblesCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDisponiblesCostos.setModel(new DisponiblesCostosModel(this.disponiblescostosLogic.getDisponiblesCostoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDisponiblesCostos.setModel(new DisponiblesCostosModel(this.disponiblescostoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDisponiblesCostos!=null && this.jInternalFrameOrderByDisponiblesCostos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDisponiblesCostos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DisponiblesCostosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO,disponiblescostosConstantesFunciones.resaltarSeleccionarDisponiblesCostos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DisponiblesCostosConstantesFunciones.SCLASSWEBTITULO,disponiblescostosConstantesFunciones.resaltarSeleccionarDisponiblesCostos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,DisponiblesCostosConstantesFunciones.LABEL_ID));

		if(this.disponiblescostosConstantesFunciones.mostraridDisponiblesCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DisponiblesCostosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.disponiblescostosConstantesFunciones.resaltaridDisponiblesCostos,this.disponiblescostosConstantesFunciones.activaridDisponiblesCostos,iSizeTabla,this,true,"idDisponiblesCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.disponiblescostosConstantesFunciones.resaltaridDisponiblesCostos,this.disponiblescostosConstantesFunciones.activaridDisponiblesCostos,this,true,"idDisponiblesCostos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,DisponiblesCostosConstantesFunciones.LABEL_NOMBRESUCURSAL));

		if(this.disponiblescostosConstantesFunciones.mostrarnombre_sucursalDisponiblesCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DisponiblesCostosConstantesFunciones.LABEL_NOMBRESUCURSAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.disponiblescostosConstantesFunciones.resaltarnombre_sucursalDisponiblesCostos,this.disponiblescostosConstantesFunciones.activarnombre_sucursalDisponiblesCostos,iSizeTabla,this,true,"nombre_sucursalDisponiblesCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.disponiblescostosConstantesFunciones.resaltarnombre_sucursalDisponiblesCostos,this.disponiblescostosConstantesFunciones.activarnombre_sucursalDisponiblesCostos,this,true,"nombre_sucursalDisponiblesCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DisponiblesCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEA));

		if(this.disponiblescostosConstantesFunciones.mostrarnombre_lineaDisponiblesCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.disponiblescostosConstantesFunciones.resaltarnombre_lineaDisponiblesCostos,this.disponiblescostosConstantesFunciones.activarnombre_lineaDisponiblesCostos,iSizeTabla,this,true,"nombre_lineaDisponiblesCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.disponiblescostosConstantesFunciones.resaltarnombre_lineaDisponiblesCostos,this.disponiblescostosConstantesFunciones.activarnombre_lineaDisponiblesCostos,this,true,"nombre_lineaDisponiblesCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DisponiblesCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO));

		if(this.disponiblescostosConstantesFunciones.mostrarnombre_linea_grupoDisponiblesCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.disponiblescostosConstantesFunciones.resaltarnombre_linea_grupoDisponiblesCostos,this.disponiblescostosConstantesFunciones.activarnombre_linea_grupoDisponiblesCostos,iSizeTabla,this,true,"nombre_linea_grupoDisponiblesCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.disponiblescostosConstantesFunciones.resaltarnombre_linea_grupoDisponiblesCostos,this.disponiblescostosConstantesFunciones.activarnombre_linea_grupoDisponiblesCostos,this,true,"nombre_linea_grupoDisponiblesCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DisponiblesCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA));

		if(this.disponiblescostosConstantesFunciones.mostrarnombre_linea_categoriaDisponiblesCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.disponiblescostosConstantesFunciones.resaltarnombre_linea_categoriaDisponiblesCostos,this.disponiblescostosConstantesFunciones.activarnombre_linea_categoriaDisponiblesCostos,iSizeTabla,this,true,"nombre_linea_categoriaDisponiblesCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.disponiblescostosConstantesFunciones.resaltarnombre_linea_categoriaDisponiblesCostos,this.disponiblescostosConstantesFunciones.activarnombre_linea_categoriaDisponiblesCostos,this,true,"nombre_linea_categoriaDisponiblesCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DisponiblesCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA));

		if(this.disponiblescostosConstantesFunciones.mostrarnombre_linea_marcaDisponiblesCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.disponiblescostosConstantesFunciones.resaltarnombre_linea_marcaDisponiblesCostos,this.disponiblescostosConstantesFunciones.activarnombre_linea_marcaDisponiblesCostos,iSizeTabla,this,true,"nombre_linea_marcaDisponiblesCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.disponiblescostosConstantesFunciones.resaltarnombre_linea_marcaDisponiblesCostos,this.disponiblescostosConstantesFunciones.activarnombre_linea_marcaDisponiblesCostos,this,true,"nombre_linea_marcaDisponiblesCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DisponiblesCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,DisponiblesCostosConstantesFunciones.LABEL_CODIGO));

		if(this.disponiblescostosConstantesFunciones.mostrarcodigoDisponiblesCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DisponiblesCostosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.disponiblescostosConstantesFunciones.resaltarcodigoDisponiblesCostos,this.disponiblescostosConstantesFunciones.activarcodigoDisponiblesCostos,iSizeTabla,this,true,"codigoDisponiblesCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.disponiblescostosConstantesFunciones.resaltarcodigoDisponiblesCostos,this.disponiblescostosConstantesFunciones.activarcodigoDisponiblesCostos,this,true,"codigoDisponiblesCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DisponiblesCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,DisponiblesCostosConstantesFunciones.LABEL_NOMBRE));

		if(this.disponiblescostosConstantesFunciones.mostrarnombreDisponiblesCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DisponiblesCostosConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.disponiblescostosConstantesFunciones.resaltarnombreDisponiblesCostos,this.disponiblescostosConstantesFunciones.activarnombreDisponiblesCostos,iSizeTabla,this,true,"nombreDisponiblesCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.disponiblescostosConstantesFunciones.resaltarnombreDisponiblesCostos,this.disponiblescostosConstantesFunciones.activarnombreDisponiblesCostos,this,true,"nombreDisponiblesCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DisponiblesCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,DisponiblesCostosConstantesFunciones.LABEL_NOMBREBODEGA));

		if(this.disponiblescostosConstantesFunciones.mostrarnombre_bodegaDisponiblesCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DisponiblesCostosConstantesFunciones.LABEL_NOMBREBODEGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.disponiblescostosConstantesFunciones.resaltarnombre_bodegaDisponiblesCostos,this.disponiblescostosConstantesFunciones.activarnombre_bodegaDisponiblesCostos,iSizeTabla,this,true,"nombre_bodegaDisponiblesCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.disponiblescostosConstantesFunciones.resaltarnombre_bodegaDisponiblesCostos,this.disponiblescostosConstantesFunciones.activarnombre_bodegaDisponiblesCostos,this,true,"nombre_bodegaDisponiblesCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DisponiblesCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,DisponiblesCostosConstantesFunciones.LABEL_NOMBREUNIDAD));

		if(this.disponiblescostosConstantesFunciones.mostrarnombre_unidadDisponiblesCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DisponiblesCostosConstantesFunciones.LABEL_NOMBREUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.disponiblescostosConstantesFunciones.resaltarnombre_unidadDisponiblesCostos,this.disponiblescostosConstantesFunciones.activarnombre_unidadDisponiblesCostos,iSizeTabla,this,true,"nombre_unidadDisponiblesCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.disponiblescostosConstantesFunciones.resaltarnombre_unidadDisponiblesCostos,this.disponiblescostosConstantesFunciones.activarnombre_unidadDisponiblesCostos,this,true,"nombre_unidadDisponiblesCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DisponiblesCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,DisponiblesCostosConstantesFunciones.LABEL_INGRESOS));

		if(this.disponiblescostosConstantesFunciones.mostraringresosDisponiblesCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DisponiblesCostosConstantesFunciones.LABEL_INGRESOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.disponiblescostosConstantesFunciones.resaltaringresosDisponiblesCostos,this.disponiblescostosConstantesFunciones.activaringresosDisponiblesCostos,iSizeTabla,this,true,"ingresosDisponiblesCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.disponiblescostosConstantesFunciones.resaltaringresosDisponiblesCostos,this.disponiblescostosConstantesFunciones.activaringresosDisponiblesCostos,this,true,"ingresosDisponiblesCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DisponiblesCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,DisponiblesCostosConstantesFunciones.LABEL_EGRESOS));

		if(this.disponiblescostosConstantesFunciones.mostraregresosDisponiblesCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DisponiblesCostosConstantesFunciones.LABEL_EGRESOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.disponiblescostosConstantesFunciones.resaltaregresosDisponiblesCostos,this.disponiblescostosConstantesFunciones.activaregresosDisponiblesCostos,iSizeTabla,this,true,"egresosDisponiblesCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.disponiblescostosConstantesFunciones.resaltaregresosDisponiblesCostos,this.disponiblescostosConstantesFunciones.activaregresosDisponiblesCostos,this,true,"egresosDisponiblesCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DisponiblesCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,DisponiblesCostosConstantesFunciones.LABEL_DISPONIBLECORTE));

		if(this.disponiblescostosConstantesFunciones.mostrardisponible_corteDisponiblesCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DisponiblesCostosConstantesFunciones.LABEL_DISPONIBLECORTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.disponiblescostosConstantesFunciones.resaltardisponible_corteDisponiblesCostos,this.disponiblescostosConstantesFunciones.activardisponible_corteDisponiblesCostos,iSizeTabla,this,true,"disponible_corteDisponiblesCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.disponiblescostosConstantesFunciones.resaltardisponible_corteDisponiblesCostos,this.disponiblescostosConstantesFunciones.activardisponible_corteDisponiblesCostos,this,true,"disponible_corteDisponiblesCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DisponiblesCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,DisponiblesCostosConstantesFunciones.LABEL_COSTO));

		if(this.disponiblescostosConstantesFunciones.mostrarcostoDisponiblesCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DisponiblesCostosConstantesFunciones.LABEL_COSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.disponiblescostosConstantesFunciones.resaltarcostoDisponiblesCostos,this.disponiblescostosConstantesFunciones.activarcostoDisponiblesCostos,iSizeTabla,this,true,"costoDisponiblesCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.disponiblescostosConstantesFunciones.resaltarcostoDisponiblesCostos,this.disponiblescostosConstantesFunciones.activarcostoDisponiblesCostos,this,true,"costoDisponiblesCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DisponiblesCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,DisponiblesCostosConstantesFunciones.LABEL_TOTAL));

		if(this.disponiblescostosConstantesFunciones.mostrartotalDisponiblesCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DisponiblesCostosConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.disponiblescostosConstantesFunciones.resaltartotalDisponiblesCostos,this.disponiblescostosConstantesFunciones.activartotalDisponiblesCostos,iSizeTabla,this,true,"totalDisponiblesCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.disponiblescostosConstantesFunciones.resaltartotalDisponiblesCostos,this.disponiblescostosConstantesFunciones.activartotalDisponiblesCostos,this,true,"totalDisponiblesCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DisponiblesCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.disponiblescostosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.disponiblescostosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.disponiblescostosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDisponiblesCostos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.disponiblescostosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.disponiblescostosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDisponiblesCostos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDisponiblesCostos && this.isPermisoGuardarCambiosDisponiblesCostos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.disponiblescostosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.disponiblescostosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDisponiblesCostos.addColumn(tableColumn);
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
			
			this.jTableDatosDisponiblesCostos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDisponiblesCostos && this.isPermisoGuardarCambiosDisponiblesCostos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDisponiblesCostos && this.isPermisoGuardarCambiosDisponiblesCostos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDisponiblesCostos.moveColumn(this.jTableDatosDisponiblesCostos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDisponiblesCostos.moveColumn(this.jTableDatosDisponiblesCostos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDisponiblesCostos.moveColumn(this.jTableDatosDisponiblesCostos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDisponiblesCostos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDisponiblesCostos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDisponiblesCostos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDisponiblesCostos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DisponiblesCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDisponiblesCostos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDisponiblesCostos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDisponiblesCostos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=disponiblescostosLogic.getDisponiblesCostoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=disponiblescostoss.size()-1;
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
		//this.jTableDatosDisponiblesCostos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDisponiblesCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDisponiblesCostos();
			
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
				
				//this.isEsNuevoDisponiblesCostos=false;
					
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
			
				if(this.disponiblescostosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDisponiblesCostos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDisponiblesCostos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDisponiblesCostos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.disponiblescostos.getsType().equals("DUPLICADO")
				   || this.disponiblescostos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDisponiblesCostos=true;
				
				} else {
					this.isEsNuevoDisponiblesCostos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
					if(this.disponiblescostos.getId()>=0 && !this.disponiblescostos.getIsNew()) {						
						this.isEsNuevoDisponiblesCostos=false;
						
					} else {
						this.isEsNuevoDisponiblesCostos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDisponiblesCostos(esRelaciones);						
				
				this.seleccionarDisponiblesCostos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.disponiblescostos.getId()<0) {
					this.isEsNuevoDisponiblesCostos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDisponiblesCostos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDisponiblesCostos(evt,rowIndex);
				}	
				
				if(this.disponiblescostosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DisponiblesCostos: " + this.dDif); 
					}
				}								
				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDisponiblesCostos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.disponiblescostos)) {
					if(this.disponiblescostos.getId()>0) {
						this.disponiblescostos.setIsDeleted(true);
						
						this.disponiblescostossEliminados.add(this.disponiblescostos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.disponiblescostosLogic.getDisponiblesCostoss().remove(this.disponiblescostos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.disponiblescostoss.remove(this.disponiblescostos);				
					}
					
					
					((DisponiblesCostosModel) this.jTableDatosDisponiblesCostos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDisponiblesCostos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDisponiblesCostos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDisponiblesCostos) {
			
			if(this.jInternalFrameDetalleFormDisponiblesCostos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDisponiblesCostos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDisponiblesCostos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DisponiblesCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDisponiblesCostos(this.disponiblescostos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDisponiblesCostos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDisponiblesCostos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDisponiblesCostos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDisponiblesCostos(DisponiblesCostos disponiblescostos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDisponiblesCostos(disponiblescostos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDisponiblesCostos(DisponiblesCostos disponiblescostos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDisponiblesCostos(disponiblescostos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDisponiblesCostos(disponiblescostos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDisponiblesCostos(disponiblescostos);
	}
	
	public void setVariablesObjetoActualToFormularioDisponiblesCostos(DisponiblesCostos disponiblescostos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDisponiblesCostos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDisponiblesCostos.jLabelidDisponiblesCostos.setText(disponiblescostos.getId().toString());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_sucursalDisponiblesCostos.setText(disponiblescostos.getnombre_sucursal());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_lineaDisponiblesCostos.setText(disponiblescostos.getnombre_linea());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_grupoDisponiblesCostos.setText(disponiblescostos.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_categoriaDisponiblesCostos.setText(disponiblescostos.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_marcaDisponiblesCostos.setText(disponiblescostos.getnombre_linea_marca());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldcodigoDisponiblesCostos.setText(disponiblescostos.getcodigo());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombreDisponiblesCostos.setText(disponiblescostos.getnombre());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_bodegaDisponiblesCostos.setText(disponiblescostos.getnombre_bodega());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldnombre_unidadDisponiblesCostos.setText(disponiblescostos.getnombre_unidad());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldingresosDisponiblesCostos.setText(disponiblescostos.getingresos().toString());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldegresosDisponiblesCostos.setText(disponiblescostos.getegresos().toString());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextFielddisponible_corteDisponiblesCostos.setText(disponiblescostos.getdisponible_corte().toString());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldcostoDisponiblesCostos.setText(disponiblescostos.getcosto().toString());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldtotalDisponiblesCostos.setText(disponiblescostos.gettotal().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DisponiblesCostos disponiblescostosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,disponiblescostosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DisponiblesCostos disponiblescostosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				disponiblescostosLocal=this.disponiblescostos;
			} else {
				disponiblescostosLocal=this.disponiblescostosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(disponiblescostosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDisponiblesCostos(disponiblescostosLocal,true);
					
					if(disponiblescostosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(disponiblescostosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(disponiblescostosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDisponiblesCostos(DisponiblesCostos disponiblescostos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDisponiblesCostos(disponiblescostos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(disponiblescostos);
	}
	
	public void setVariablesFormularioToObjetoActualDisponiblesCostos(DisponiblesCostos disponiblescostos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDisponiblesCostos(disponiblescostos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDisponiblesCostos(DisponiblesCostos disponiblescostos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDisponiblesCostos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDisponiblesCostos.jLabelidDisponiblesCostos.getText()==null || this.jInternalFrameDetalleFormDisponiblesCostos.jLabelidDisponiblesCostos.getText()=="" || this.jInternalFrameDetalleFormDisponiblesCostos.jLabelidDisponiblesCostos.getText()=="Id") {
				this.jInternalFrameDetalleFormDisponiblesCostos.jLabelidDisponiblesCostos.setText("0");
			}

			if(conColumnasBase) {disponiblescostos.setId(Long.parseLong(this.jInternalFrameDetalleFormDisponiblesCostos.jLabelidDisponiblesCostos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DisponiblesCostosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelIdDisponiblesCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			disponiblescostos.setnombre_sucursal(this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_sucursalDisponiblesCostos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DisponiblesCostosConstantesFunciones.LABEL_NOMBRESUCURSAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombre_sucursalDisponiblesCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			disponiblescostos.setnombre_linea(this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_lineaDisponiblesCostos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombre_lineaDisponiblesCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			disponiblescostos.setnombre_linea_grupo(this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_grupoDisponiblesCostos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombre_linea_grupoDisponiblesCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			disponiblescostos.setnombre_linea_categoria(this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_categoriaDisponiblesCostos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombre_linea_categoriaDisponiblesCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			disponiblescostos.setnombre_linea_marca(this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_marcaDisponiblesCostos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombre_linea_marcaDisponiblesCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			disponiblescostos.setcodigo(this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldcodigoDisponiblesCostos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DisponiblesCostosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelcodigoDisponiblesCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			disponiblescostos.setnombre(this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombreDisponiblesCostos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DisponiblesCostosConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombreDisponiblesCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			disponiblescostos.setnombre_bodega(this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_bodegaDisponiblesCostos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DisponiblesCostosConstantesFunciones.LABEL_NOMBREBODEGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombre_bodegaDisponiblesCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			disponiblescostos.setnombre_unidad(this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldnombre_unidadDisponiblesCostos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DisponiblesCostosConstantesFunciones.LABEL_NOMBREUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelnombre_unidadDisponiblesCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			disponiblescostos.setingresos(Double.parseDouble(this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldingresosDisponiblesCostos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DisponiblesCostosConstantesFunciones.LABEL_INGRESOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelingresosDisponiblesCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			disponiblescostos.setegresos(Double.parseDouble(this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldegresosDisponiblesCostos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DisponiblesCostosConstantesFunciones.LABEL_EGRESOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelegresosDisponiblesCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			disponiblescostos.setdisponible_corte(Double.parseDouble(this.jInternalFrameDetalleFormDisponiblesCostos.jTextFielddisponible_corteDisponiblesCostos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DisponiblesCostosConstantesFunciones.LABEL_DISPONIBLECORTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabeldisponible_corteDisponiblesCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			disponiblescostos.setcosto(Double.parseDouble(this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldcostoDisponiblesCostos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DisponiblesCostosConstantesFunciones.LABEL_COSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabelcostoDisponiblesCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			disponiblescostos.settotal(Double.parseDouble(this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldtotalDisponiblesCostos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DisponiblesCostosConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDisponiblesCostos.jLabeltotalDisponiblesCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDisponiblesCostos(DisponiblesCostos disponiblescostosBean,DisponiblesCostos disponiblescostos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDisponiblesCostos(DisponiblesCostos disponiblescostosOrigen,DisponiblesCostos disponiblescostos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && disponiblescostosOrigen.getId()!=null && !disponiblescostosOrigen.getId().equals(0L))) {disponiblescostos.setId(disponiblescostosOrigen.getId());}}
			if(conDefault || (!conDefault && disponiblescostosOrigen.getfecha_emision_hasta()!=null && !disponiblescostosOrigen.getfecha_emision_hasta().equals(new Date()))) {disponiblescostos.setfecha_emision_hasta(disponiblescostosOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && disponiblescostosOrigen.getnombre_sucursal()!=null && !disponiblescostosOrigen.getnombre_sucursal().equals(""))) {disponiblescostos.setnombre_sucursal(disponiblescostosOrigen.getnombre_sucursal());}
			if(conDefault || (!conDefault && disponiblescostosOrigen.getnombre_linea()!=null && !disponiblescostosOrigen.getnombre_linea().equals(""))) {disponiblescostos.setnombre_linea(disponiblescostosOrigen.getnombre_linea());}
			if(conDefault || (!conDefault && disponiblescostosOrigen.getnombre_linea_grupo()!=null && !disponiblescostosOrigen.getnombre_linea_grupo().equals(""))) {disponiblescostos.setnombre_linea_grupo(disponiblescostosOrigen.getnombre_linea_grupo());}
			if(conDefault || (!conDefault && disponiblescostosOrigen.getnombre_linea_categoria()!=null && !disponiblescostosOrigen.getnombre_linea_categoria().equals(""))) {disponiblescostos.setnombre_linea_categoria(disponiblescostosOrigen.getnombre_linea_categoria());}
			if(conDefault || (!conDefault && disponiblescostosOrigen.getnombre_linea_marca()!=null && !disponiblescostosOrigen.getnombre_linea_marca().equals(""))) {disponiblescostos.setnombre_linea_marca(disponiblescostosOrigen.getnombre_linea_marca());}
			if(conDefault || (!conDefault && disponiblescostosOrigen.getcodigo()!=null && !disponiblescostosOrigen.getcodigo().equals(""))) {disponiblescostos.setcodigo(disponiblescostosOrigen.getcodigo());}
			if(conDefault || (!conDefault && disponiblescostosOrigen.getnombre()!=null && !disponiblescostosOrigen.getnombre().equals(""))) {disponiblescostos.setnombre(disponiblescostosOrigen.getnombre());}
			if(conDefault || (!conDefault && disponiblescostosOrigen.getnombre_bodega()!=null && !disponiblescostosOrigen.getnombre_bodega().equals(""))) {disponiblescostos.setnombre_bodega(disponiblescostosOrigen.getnombre_bodega());}
			if(conDefault || (!conDefault && disponiblescostosOrigen.getnombre_unidad()!=null && !disponiblescostosOrigen.getnombre_unidad().equals(""))) {disponiblescostos.setnombre_unidad(disponiblescostosOrigen.getnombre_unidad());}
			if(conDefault || (!conDefault && disponiblescostosOrigen.getingresos()!=null && !disponiblescostosOrigen.getingresos().equals(0.0))) {disponiblescostos.setingresos(disponiblescostosOrigen.getingresos());}
			if(conDefault || (!conDefault && disponiblescostosOrigen.getegresos()!=null && !disponiblescostosOrigen.getegresos().equals(0.0))) {disponiblescostos.setegresos(disponiblescostosOrigen.getegresos());}
			if(conDefault || (!conDefault && disponiblescostosOrigen.getdisponible_corte()!=null && !disponiblescostosOrigen.getdisponible_corte().equals(0.0))) {disponiblescostos.setdisponible_corte(disponiblescostosOrigen.getdisponible_corte());}
			if(conDefault || (!conDefault && disponiblescostosOrigen.getcosto()!=null && !disponiblescostosOrigen.getcosto().equals(0.0))) {disponiblescostos.setcosto(disponiblescostosOrigen.getcosto());}
			if(conDefault || (!conDefault && disponiblescostosOrigen.gettotal()!=null && !disponiblescostosOrigen.gettotal().equals(0.0))) {disponiblescostos.settotal(disponiblescostosOrigen.gettotal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDisponiblesCostos(DisponiblesCostos disponiblescostos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDisponiblesCostos.jLabelidDisponiblesCostos.setText(disponiblescostos.getId().toString());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_sucursalDisponiblesCostos.setText(disponiblescostos.getnombre_sucursal());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_lineaDisponiblesCostos.setText(disponiblescostos.getnombre_linea());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_grupoDisponiblesCostos.setText(disponiblescostos.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_categoriaDisponiblesCostos.setText(disponiblescostos.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_marcaDisponiblesCostos.setText(disponiblescostos.getnombre_linea_marca());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldcodigoDisponiblesCostos.setText(disponiblescostos.getcodigo());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombreDisponiblesCostos.setText(disponiblescostos.getnombre());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_bodegaDisponiblesCostos.setText(disponiblescostos.getnombre_bodega());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldnombre_unidadDisponiblesCostos.setText(disponiblescostos.getnombre_unidad());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldingresosDisponiblesCostos.setText(disponiblescostos.getingresos().toString());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldegresosDisponiblesCostos.setText(disponiblescostos.getegresos().toString());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextFielddisponible_corteDisponiblesCostos.setText(disponiblescostos.getdisponible_corte().toString());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldcostoDisponiblesCostos.setText(disponiblescostos.getcosto().toString());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldtotalDisponiblesCostos.setText(disponiblescostos.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDisponiblesCostos(DisponiblesCostosBean disponiblescostosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDisponiblesCostos.jLabelidDisponiblesCostos.setText(disponiblescostosBean.getId().toString());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_sucursalDisponiblesCostos.setText(disponiblescostosBean.getnombre_sucursal());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_lineaDisponiblesCostos.setText(disponiblescostosBean.getnombre_linea());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_grupoDisponiblesCostos.setText(disponiblescostosBean.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_categoriaDisponiblesCostos.setText(disponiblescostosBean.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_marcaDisponiblesCostos.setText(disponiblescostosBean.getnombre_linea_marca());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldcodigoDisponiblesCostos.setText(disponiblescostosBean.getcodigo());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombreDisponiblesCostos.setText(disponiblescostosBean.getnombre());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_bodegaDisponiblesCostos.setText(disponiblescostosBean.getnombre_bodega());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldnombre_unidadDisponiblesCostos.setText(disponiblescostosBean.getnombre_unidad());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldingresosDisponiblesCostos.setText(disponiblescostosBean.getingresos().toString());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldegresosDisponiblesCostos.setText(disponiblescostosBean.getegresos().toString());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextFielddisponible_corteDisponiblesCostos.setText(disponiblescostosBean.getdisponible_corte().toString());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldcostoDisponiblesCostos.setText(disponiblescostosBean.getcosto().toString());
			this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldtotalDisponiblesCostos.setText(disponiblescostosBean.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDisponiblesCostos(DisponiblesCostosParameterReturnGeneral disponiblescostosReturnGeneral,DisponiblesCostosBean disponiblescostosBean,Boolean conDefault) throws Exception { 
		try {
			DisponiblesCostos disponiblescostosLocal=new DisponiblesCostos();
			
			disponiblescostosLocal=disponiblescostosReturnGeneral.getDisponiblesCostos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && disponiblescostosLocal.getId()!=null && !disponiblescostosLocal.getId().equals(0L))) {disponiblescostosBean.setId(disponiblescostosLocal.getId());}}
			if(conDefault || (!conDefault && disponiblescostosLocal.getnombre_sucursal()!=null && !disponiblescostosLocal.getnombre_sucursal().equals(""))) {disponiblescostosBean.setnombre_sucursal(disponiblescostosLocal.getnombre_sucursal());}
			if(conDefault || (!conDefault && disponiblescostosLocal.getnombre_linea()!=null && !disponiblescostosLocal.getnombre_linea().equals(""))) {disponiblescostosBean.setnombre_linea(disponiblescostosLocal.getnombre_linea());}
			if(conDefault || (!conDefault && disponiblescostosLocal.getnombre_linea_grupo()!=null && !disponiblescostosLocal.getnombre_linea_grupo().equals(""))) {disponiblescostosBean.setnombre_linea_grupo(disponiblescostosLocal.getnombre_linea_grupo());}
			if(conDefault || (!conDefault && disponiblescostosLocal.getnombre_linea_categoria()!=null && !disponiblescostosLocal.getnombre_linea_categoria().equals(""))) {disponiblescostosBean.setnombre_linea_categoria(disponiblescostosLocal.getnombre_linea_categoria());}
			if(conDefault || (!conDefault && disponiblescostosLocal.getnombre_linea_marca()!=null && !disponiblescostosLocal.getnombre_linea_marca().equals(""))) {disponiblescostosBean.setnombre_linea_marca(disponiblescostosLocal.getnombre_linea_marca());}
			if(conDefault || (!conDefault && disponiblescostosLocal.getcodigo()!=null && !disponiblescostosLocal.getcodigo().equals(""))) {disponiblescostosBean.setcodigo(disponiblescostosLocal.getcodigo());}
			if(conDefault || (!conDefault && disponiblescostosLocal.getnombre()!=null && !disponiblescostosLocal.getnombre().equals(""))) {disponiblescostosBean.setnombre(disponiblescostosLocal.getnombre());}
			if(conDefault || (!conDefault && disponiblescostosLocal.getnombre_bodega()!=null && !disponiblescostosLocal.getnombre_bodega().equals(""))) {disponiblescostosBean.setnombre_bodega(disponiblescostosLocal.getnombre_bodega());}
			if(conDefault || (!conDefault && disponiblescostosLocal.getnombre_unidad()!=null && !disponiblescostosLocal.getnombre_unidad().equals(""))) {disponiblescostosBean.setnombre_unidad(disponiblescostosLocal.getnombre_unidad());}
			if(conDefault || (!conDefault && disponiblescostosLocal.getingresos()!=null && !disponiblescostosLocal.getingresos().equals(0.0))) {disponiblescostosBean.setingresos(disponiblescostosLocal.getingresos());}
			if(conDefault || (!conDefault && disponiblescostosLocal.getegresos()!=null && !disponiblescostosLocal.getegresos().equals(0.0))) {disponiblescostosBean.setegresos(disponiblescostosLocal.getegresos());}
			if(conDefault || (!conDefault && disponiblescostosLocal.getdisponible_corte()!=null && !disponiblescostosLocal.getdisponible_corte().equals(0.0))) {disponiblescostosBean.setdisponible_corte(disponiblescostosLocal.getdisponible_corte());}
			if(conDefault || (!conDefault && disponiblescostosLocal.getcosto()!=null && !disponiblescostosLocal.getcosto().equals(0.0))) {disponiblescostosBean.setcosto(disponiblescostosLocal.getcosto());}
			if(conDefault || (!conDefault && disponiblescostosLocal.gettotal()!=null && !disponiblescostosLocal.gettotal().equals(0.0))) {disponiblescostosBean.settotal(disponiblescostosLocal.gettotal());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDisponiblesCostosGenerico(Long idDisponiblesCostosSeleccionado,JComboBox jComboBoxDisponiblesCostos,List<DisponiblesCostos> disponiblescostossLocal)throws Exception {
		try {
			DisponiblesCostos  disponiblescostosTemp=null;

			for(DisponiblesCostos disponiblescostosAux:disponiblescostossLocal) {
				if(disponiblescostosAux.getId()!=null && disponiblescostosAux.getId().equals(idDisponiblesCostosSeleccionado)) {
					disponiblescostosTemp=disponiblescostosAux;
					break;
				}
			}

			jComboBoxDisponiblesCostos.setSelectedItem(disponiblescostosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDisponiblesCostosGenerico(JComboBox jComboBoxDisponiblesCostos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDisponiblesCostos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDisponiblesCostos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDisponiblesCostos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDisponiblesCostos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDisponiblesCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDisponiblesCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			disponiblescostos=(DisponiblesCostos) disponiblescostosLogic.getDisponiblesCostoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			disponiblescostos =(DisponiblesCostos) disponiblescostoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!disponiblescostos.getIsNew() && !disponiblescostos.getIsChanged() && !disponiblescostos.getIsDeleted()) {
				sDescripcion=disponiblescostos.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=disponiblescostos.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!disponiblescostos.getIsNew() && !disponiblescostos.getIsChanged() && !disponiblescostos.getIsDeleted()) {
				sDescripcion=disponiblescostos.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=disponiblescostos.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!disponiblescostos.getIsNew() && !disponiblescostos.getIsChanged() && !disponiblescostos.getIsDeleted()) {
				sDescripcion=disponiblescostos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=disponiblescostos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!disponiblescostos.getIsNew() && !disponiblescostos.getIsChanged() && !disponiblescostos.getIsDeleted()) {
				sDescripcion=disponiblescostos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=disponiblescostos.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!disponiblescostos.getIsNew() && !disponiblescostos.getIsChanged() && !disponiblescostos.getIsDeleted()) {
				sDescripcion=disponiblescostos.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=disponiblescostos.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!disponiblescostos.getIsNew() && !disponiblescostos.getIsChanged() && !disponiblescostos.getIsDeleted()) {
				sDescripcion=disponiblescostos.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=disponiblescostos.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!disponiblescostos.getIsNew() && !disponiblescostos.getIsChanged() && !disponiblescostos.getIsDeleted()) {
				sDescripcion=disponiblescostos.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=disponiblescostos.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!disponiblescostos.getIsNew() && !disponiblescostos.getIsChanged() && !disponiblescostos.getIsDeleted()) {
				sDescripcion=disponiblescostos.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=disponiblescostos.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DisponiblesCostos disponiblescostosRow=new DisponiblesCostos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			disponiblescostosRow=(DisponiblesCostos) disponiblescostosLogic.getDisponiblesCostoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			disponiblescostosRow=(DisponiblesCostos) disponiblescostoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDisponiblesCostos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDisponiblesCostos.setVisible((this.isVisibilidadCeldaNuevoDisponiblesCostos && this.isPermisoNuevoDisponiblesCostos));			
			this.jButtonDuplicarDisponiblesCostos.setVisible((this.isVisibilidadCeldaDuplicarDisponiblesCostos && this.isPermisoDuplicarDisponiblesCostos));			
			this.jButtonCopiarDisponiblesCostos.setVisible((this.isVisibilidadCeldaCopiarDisponiblesCostos && this.isPermisoCopiarDisponiblesCostos));
			this.jButtonVerFormDisponiblesCostos.setVisible((this.isVisibilidadCeldaVerFormDisponiblesCostos && this.isPermisoVerFormDisponiblesCostos));
			
			this.jButtonAbrirOrderByDisponiblesCostos.setVisible((this.isVisibilidadCeldaOrdenDisponiblesCostos && this.isPermisoOrdenDisponiblesCostos));			
			
			this.jButtonNuevoRelacionesDisponiblesCostos.setVisible((this.isVisibilidadCeldaNuevoRelacionesDisponiblesCostos && this.isPermisoNuevoDisponiblesCostos));			
			this.jButtonNuevoGuardarCambiosDisponiblesCostos.setVisible((this.isVisibilidadCeldaNuevoDisponiblesCostos && this.isPermisoNuevoDisponiblesCostos && this.isPermisoGuardarCambiosDisponiblesCostos));
			
			if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonModificarDisponiblesCostos.setVisible((this.isVisibilidadCeldaModificarDisponiblesCostos && this.isPermisoActualizarDisponiblesCostos));	
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonActualizarDisponiblesCostos.setVisible((this.isVisibilidadCeldaActualizarDisponiblesCostos && this.isPermisoActualizarDisponiblesCostos));	
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonEliminarDisponiblesCostos.setVisible((this.isVisibilidadCeldaEliminarDisponiblesCostos && this.isPermisoEliminarDisponiblesCostos));
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonCancelarDisponiblesCostos.setVisible(this.isVisibilidadCeldaCancelarDisponiblesCostos);							
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonGuardarCambiosDisponiblesCostos.setVisible((this.isVisibilidadCeldaGuardarDisponiblesCostos && this.isPermisoGuardarCambiosDisponiblesCostos));			
			
			}
						
			this.jButtonGuardarCambiosTablaDisponiblesCostos.setVisible((this.isVisibilidadCeldaGuardarCambiosDisponiblesCostos && this.isPermisoGuardarCambiosDisponiblesCostos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDisponiblesCostos.setVisible((this.isVisibilidadCeldaNuevoDisponiblesCostos && this.isPermisoNuevoDisponiblesCostos));						
			this.jButtonDuplicarToolBarDisponiblesCostos.setVisible((this.isVisibilidadCeldaDuplicarDisponiblesCostos && this.isPermisoDuplicarDisponiblesCostos));						
			this.jButtonCopiarToolBarDisponiblesCostos.setVisible((this.isVisibilidadCeldaCopiarDisponiblesCostos && this.isPermisoCopiarDisponiblesCostos));			
			this.jButtonVerFormToolBarDisponiblesCostos.setVisible((this.isVisibilidadCeldaVerFormDisponiblesCostos && this.isPermisoVerFormDisponiblesCostos));			
			this.jButtonAbrirOrderByToolBarDisponiblesCostos.setVisible((this.isVisibilidadCeldaOrdenDisponiblesCostos && this.isPermisoOrdenDisponiblesCostos));
			this.jButtonNuevoRelacionesToolBarDisponiblesCostos.setVisible((this.isVisibilidadCeldaNuevoRelacionesDisponiblesCostos && this.isPermisoNuevoDisponiblesCostos));			
			this.jButtonNuevoGuardarCambiosToolBarDisponiblesCostos.setVisible((this.isVisibilidadCeldaNuevoDisponiblesCostos && this.isPermisoNuevoDisponiblesCostos && this.isPermisoGuardarCambiosDisponiblesCostos));			
			
			if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonModificarToolBarDisponiblesCostos.setVisible((this.isVisibilidadCeldaModificarDisponiblesCostos && this.isPermisoActualizarDisponiblesCostos));	
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonActualizarToolBarDisponiblesCostos.setVisible((this.isVisibilidadCeldaActualizarDisponiblesCostos  && this.isPermisoActualizarDisponiblesCostos));	
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonEliminarToolBarDisponiblesCostos.setVisible((this.isVisibilidadCeldaEliminarDisponiblesCostos && this.isPermisoEliminarDisponiblesCostos));
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonCancelarToolBarDisponiblesCostos.setVisible(this.isVisibilidadCeldaCancelarDisponiblesCostos);				
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonGuardarCambiosToolBarDisponiblesCostos.setVisible((this.isVisibilidadCeldaGuardarDisponiblesCostos && this.isPermisoGuardarCambiosDisponiblesCostos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDisponiblesCostos.setVisible((this.isVisibilidadCeldaGuardarCambiosDisponiblesCostos && this.isPermisoGuardarCambiosDisponiblesCostos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDisponiblesCostos.setVisible((this.isVisibilidadCeldaNuevoDisponiblesCostos && this.isPermisoNuevoDisponiblesCostos));			
			this.jMenuItemDuplicarDisponiblesCostos.setVisible((this.isVisibilidadCeldaDuplicarDisponiblesCostos && this.isPermisoDuplicarDisponiblesCostos));			
			this.jMenuItemCopiarDisponiblesCostos.setVisible((this.isVisibilidadCeldaCopiarDisponiblesCostos && this.isPermisoCopiarDisponiblesCostos));			
			this.jMenuItemVerFormDisponiblesCostos.setVisible((this.isVisibilidadCeldaVerFormDisponiblesCostos && this.isPermisoVerFormDisponiblesCostos));			
			this.jMenuItemAbrirOrderByDisponiblesCostos.setVisible((this.isVisibilidadCeldaOrdenDisponiblesCostos && this.isPermisoOrdenDisponiblesCostos));			
			//this.jMenuItemMostrarOcultarDisponiblesCostos.setVisible((this.isVisibilidadCeldaOrdenDisponiblesCostos && this.isPermisoOrdenDisponiblesCostos));
			this.jMenuItemDetalleAbrirOrderByDisponiblesCostos.setVisible((this.isVisibilidadCeldaOrdenDisponiblesCostos && this.isPermisoOrdenDisponiblesCostos));			
			//this.jMenuItemDetalleMostrarOcultarDisponiblesCostos.setVisible((this.isVisibilidadCeldaOrdenDisponiblesCostos && this.isPermisoOrdenDisponiblesCostos));			
			this.jMenuItemNuevoRelacionesDisponiblesCostos.setVisible((this.isVisibilidadCeldaNuevoRelacionesDisponiblesCostos && this.isPermisoNuevoDisponiblesCostos));			
			this.jMenuItemNuevoGuardarCambiosDisponiblesCostos.setVisible((this.isVisibilidadCeldaNuevoDisponiblesCostos && this.isPermisoNuevoDisponiblesCostos && this.isPermisoGuardarCambiosDisponiblesCostos));									
			
			if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
			this.jInternalFrameDetalleFormDisponiblesCostos.jMenuItemModificarDisponiblesCostos.setVisible((this.isVisibilidadCeldaModificarDisponiblesCostos && this.isPermisoActualizarDisponiblesCostos));	
			this.jInternalFrameDetalleFormDisponiblesCostos.jMenuItemActualizarDisponiblesCostos.setVisible((this.isVisibilidadCeldaActualizarDisponiblesCostos && this.isPermisoActualizarDisponiblesCostos));	
			this.jInternalFrameDetalleFormDisponiblesCostos.jMenuItemEliminarDisponiblesCostos.setVisible((this.isVisibilidadCeldaEliminarDisponiblesCostos && this.isPermisoEliminarDisponiblesCostos));
			this.jInternalFrameDetalleFormDisponiblesCostos.jMenuItemCancelarDisponiblesCostos.setVisible(this.isVisibilidadCeldaCancelarDisponiblesCostos);				
			}
			
			this.jMenuItemGuardarCambiosDisponiblesCostos.setVisible((this.isVisibilidadCeldaGuardarDisponiblesCostos && this.isPermisoGuardarCambiosDisponiblesCostos));						
			this.jMenuItemGuardarCambiosTablaDisponiblesCostos.setVisible((this.isVisibilidadCeldaGuardarCambiosDisponiblesCostos && this.isPermisoGuardarCambiosDisponiblesCostos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDisponiblesCostos=this.jButtonNuevoDisponiblesCostos.isVisible();
			this.isVisibilidadCeldaDuplicarDisponiblesCostos=this.jButtonDuplicarDisponiblesCostos.isVisible();
			this.isVisibilidadCeldaCopiarDisponiblesCostos=this.jButtonCopiarDisponiblesCostos.isVisible();
			this.isVisibilidadCeldaVerFormDisponiblesCostos=this.jButtonVerFormDisponiblesCostos.isVisible();
			
			this.isVisibilidadCeldaOrdenDisponiblesCostos=this.jButtonAbrirOrderByDisponiblesCostos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDisponiblesCostos=this.jButtonNuevoRelacionesDisponiblesCostos.isVisible();
			this.isVisibilidadCeldaModificarDisponiblesCostos=this.jButtonModificarDisponiblesCostos.isVisible();
			
			if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
			this.isVisibilidadCeldaActualizarDisponiblesCostos=this.jInternalFrameDetalleFormDisponiblesCostos.jButtonActualizarDisponiblesCostos.isVisible();
			this.isVisibilidadCeldaEliminarDisponiblesCostos=this.jInternalFrameDetalleFormDisponiblesCostos.jButtonEliminarDisponiblesCostos.isVisible();
			this.isVisibilidadCeldaCancelarDisponiblesCostos=this.jInternalFrameDetalleFormDisponiblesCostos.jButtonCancelarDisponiblesCostos.isVisible();
			this.isVisibilidadCeldaGuardarDisponiblesCostos=this.jInternalFrameDetalleFormDisponiblesCostos.jButtonGuardarCambiosDisponiblesCostos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDisponiblesCostos=this.jButtonGuardarCambiosTablaDisponiblesCostos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDisponiblesCostos=this.jButtonNuevoToolBarDisponiblesCostos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDisponiblesCostos=this.jButtonNuevoRelacionesToolBarDisponiblesCostos.isVisible();
			
			if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
			this.isVisibilidadCeldaModificarDisponiblesCostos=this.jInternalFrameDetalleFormDisponiblesCostos.jButtonModificarToolBarDisponiblesCostos.isVisible();
			this.isVisibilidadCeldaActualizarDisponiblesCostos=this.jInternalFrameDetalleFormDisponiblesCostos.jButtonActualizarToolBarDisponiblesCostos.isVisible();
			this.isVisibilidadCeldaEliminarDisponiblesCostos=this.jInternalFrameDetalleFormDisponiblesCostos.jButtonEliminarToolBarDisponiblesCostos.isVisible();
			this.isVisibilidadCeldaCancelarDisponiblesCostos=this.jInternalFrameDetalleFormDisponiblesCostos.jButtonCancelarToolBarDisponiblesCostos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDisponiblesCostos=this.jButtonGuardarCambiosToolBarDisponiblesCostos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDisponiblesCostos=this.jButtonGuardarCambiosTablaToolBarDisponiblesCostos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDisponiblesCostos=this.jMenuItemNuevoDisponiblesCostos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDisponiblesCostos=this.jMenuItemNuevoRelacionesDisponiblesCostos.isVisible();
			
			if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
			this.isVisibilidadCeldaModificarDisponiblesCostos=this.jInternalFrameDetalleFormDisponiblesCostos.jMenuItemModificarDisponiblesCostos.isVisible();
			this.isVisibilidadCeldaActualizarDisponiblesCostos=this.jInternalFrameDetalleFormDisponiblesCostos.jMenuItemActualizarDisponiblesCostos.isVisible();
			this.isVisibilidadCeldaEliminarDisponiblesCostos=this.jInternalFrameDetalleFormDisponiblesCostos.jMenuItemEliminarDisponiblesCostos.isVisible();
			this.isVisibilidadCeldaCancelarDisponiblesCostos=this.jInternalFrameDetalleFormDisponiblesCostos.jMenuItemCancelarDisponiblesCostos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDisponiblesCostos=this.jMenuItemGuardarCambiosDisponiblesCostos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDisponiblesCostos=this.jMenuItemGuardarCambiosTablaDisponiblesCostos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDisponiblesCostos(Boolean esInicializar) {
		if(DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.disponiblescostosSessionBean.getConGuardarRelaciones()) {
				//if(this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDisponiblesCostos();
			}
			
			this.inicializarActualizarBindingBotonesManualDisponiblesCostos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDisponiblesCostos() {
		this.jButtonNuevoDisponiblesCostos.setVisible(this.isPermisoNuevoDisponiblesCostos);			
		this.jButtonDuplicarDisponiblesCostos.setVisible(this.isPermisoDuplicarDisponiblesCostos);			
		this.jButtonCopiarDisponiblesCostos.setVisible(this.isPermisoCopiarDisponiblesCostos);			
		this.jButtonVerFormDisponiblesCostos.setVisible(this.isPermisoVerFormDisponiblesCostos);			
		
		this.jButtonAbrirOrderByDisponiblesCostos.setVisible(this.isPermisoOrdenDisponiblesCostos);					
		
		this.jButtonNuevoRelacionesDisponiblesCostos.setVisible(this.isPermisoNuevoDisponiblesCostos);			
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonModificarDisponiblesCostos.setVisible(this.isPermisoActualizarDisponiblesCostos);	
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonActualizarDisponiblesCostos.setVisible(this.isPermisoActualizarDisponiblesCostos);	
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonEliminarDisponiblesCostos.setVisible(this.isPermisoEliminarDisponiblesCostos);
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonCancelarDisponiblesCostos.setVisible(this.isVisibilidadCeldaCancelarDisponiblesCostos);						
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonGuardarCambiosDisponiblesCostos.setVisible(this.isPermisoGuardarCambiosDisponiblesCostos);							
		}
		
		this.jButtonGuardarCambiosTablaDisponiblesCostos.setVisible(this.isPermisoActualizarDisponiblesCostos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDisponiblesCostos() {
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonModificarDisponiblesCostos.setVisible(this.isPermisoActualizarDisponiblesCostos);	
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonActualizarDisponiblesCostos.setVisible(this.isPermisoActualizarDisponiblesCostos);	
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonEliminarDisponiblesCostos.setVisible(this.isPermisoEliminarDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonCancelarDisponiblesCostos.setVisible(this.isVisibilidadCeldaCancelarDisponiblesCostos);							
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonGuardarCambiosDisponiblesCostos.setVisible((this.isVisibilidadCeldaGuardarDisponiblesCostos && this.isPermisoGuardarCambiosDisponiblesCostos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDisponiblesCostos() {
		if(DisponiblesCostosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDisponiblesCostos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDisponiblesCostos() {
	}
	
	public void jTableDatosDisponiblesCostosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDisponiblesCostos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.disponiblescostos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaDisponiblesCostosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebDisponiblesCostos(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDisponiblesCostos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDisponiblesCostos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.disponiblescostosLogic.getConnexion());

				if(this.disponiblescostos.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.disponiblescostos.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDisponiblesCostos=(TitledBorder)this.jScrollPanelDatosDisponiblesCostos.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderDisponiblesCostos.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.disponiblescostos.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoDisponiblesCostosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebDisponiblesCostos(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDisponiblesCostos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDisponiblesCostos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.disponiblescostosLogic.getConnexion());

				if(this.disponiblescostos.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.disponiblescostos.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDisponiblesCostos=(TitledBorder)this.jScrollPanelDatosDisponiblesCostos.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderDisponiblesCostos.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.disponiblescostos.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDisponiblesCostosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDisponiblesCostos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDisponiblesCostos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDisponiblesCostos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.disponiblescostosLogic.getConnexion());

				if(this.disponiblescostos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.disponiblescostos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDisponiblesCostos=(TitledBorder)this.jScrollPanelDatosDisponiblesCostos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDisponiblesCostos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.disponiblescostos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDisponiblesCostosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDisponiblesCostos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDisponiblesCostos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDisponiblesCostos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.disponiblescostosLogic.getConnexion());

				if(this.disponiblescostos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.disponiblescostos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDisponiblesCostos=(TitledBorder)this.jScrollPanelDatosDisponiblesCostos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDisponiblesCostos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.disponiblescostos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaDisponiblesCostosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebDisponiblesCostos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDisponiblesCostos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDisponiblesCostos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.disponiblescostosLogic.getConnexion());

				if(this.disponiblescostos.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.disponiblescostos.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDisponiblesCostos=(TitledBorder)this.jScrollPanelDatosDisponiblesCostos.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderDisponiblesCostos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.disponiblescostos.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoDisponiblesCostosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebDisponiblesCostos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDisponiblesCostos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDisponiblesCostos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.disponiblescostosLogic.getConnexion());

				if(this.disponiblescostos.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.disponiblescostos.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDisponiblesCostos=(TitledBorder)this.jScrollPanelDatosDisponiblesCostos.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderDisponiblesCostos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.disponiblescostos.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaDisponiblesCostosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebDisponiblesCostos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDisponiblesCostos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDisponiblesCostos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.disponiblescostosLogic.getConnexion());

				if(this.disponiblescostos.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.disponiblescostos.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDisponiblesCostos=(TitledBorder)this.jScrollPanelDatosDisponiblesCostos.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderDisponiblesCostos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.disponiblescostos.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaDisponiblesCostosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebDisponiblesCostos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDisponiblesCostos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDisponiblesCostos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.disponiblescostosLogic.getConnexion());

				if(this.disponiblescostos.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.disponiblescostos.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDisponiblesCostos=(TitledBorder)this.jScrollPanelDatosDisponiblesCostos.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderDisponiblesCostos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.disponiblescostos.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.disponiblescostos.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sucursalDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getnombre_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sucursal like '%"+this.disponiblescostos.getnombre_sucursal()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_lineaDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getnombre_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea like '%"+this.disponiblescostos.getnombre_linea()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_grupoDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getnombre_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_grupo like '%"+this.disponiblescostos.getnombre_linea_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_categoriaDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getnombre_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_categoria like '%"+this.disponiblescostos.getnombre_linea_categoria()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_marcaDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getnombre_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_marca like '%"+this.disponiblescostos.getnombre_linea_marca()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.disponiblescostos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.disponiblescostos.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_bodegaDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getnombre_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_bodega like '%"+this.disponiblescostos.getnombre_bodega()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_unidadDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getnombre_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_unidad like '%"+this.disponiblescostos.getnombre_unidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoningresosDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getingresos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ingresos = "+this.disponiblescostos.getingresos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonegresosDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getegresos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where egresos = "+this.disponiblescostos.getegresos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondisponible_corteDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getdisponible_corte()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where disponible_corte = "+this.disponiblescostos.getdisponible_corte().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncostoDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.getcosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo = "+this.disponiblescostos.getcosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalDisponiblesCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.getdisponiblescostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.disponiblescostos==null) {
						this.disponiblescostos = new DisponiblesCostos();
					}

					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);
				}

				if(this.disponiblescostos.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.disponiblescostos.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDisponiblesCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaDisponiblesCostosDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDisponiblesCostos(false,false);

			this.getDisponiblesCostossBusquedaDisponiblesCostos();

			this.inicializarActualizarBindingDisponiblesCostos(false);

			//if(DisponiblesCostosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDisponiblesCostos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDisponiblesCostos(false,false);

			this.getDisponiblesCostossFK_IdBodega();

			this.inicializarActualizarBindingDisponiblesCostos(false);

			//if(DisponiblesCostosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDisponiblesCostos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDisponiblesCostos(false,false);

			this.getDisponiblesCostossFK_IdEmpresa();

			this.inicializarActualizarBindingDisponiblesCostos(false);

			//if(DisponiblesCostosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDisponiblesCostos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDisponiblesCostos(false,false);

			this.getDisponiblesCostossFK_IdLinea();

			this.inicializarActualizarBindingDisponiblesCostos(false);

			//if(DisponiblesCostosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDisponiblesCostos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDisponiblesCostos(false,false);

			this.getDisponiblesCostossFK_IdLineaCategoria();

			this.inicializarActualizarBindingDisponiblesCostos(false);

			//if(DisponiblesCostosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDisponiblesCostos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDisponiblesCostos(false,false);

			this.getDisponiblesCostossFK_IdLineaGrupo();

			this.inicializarActualizarBindingDisponiblesCostos(false);

			//if(DisponiblesCostosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDisponiblesCostos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDisponiblesCostos(false,false);

			this.getDisponiblesCostossFK_IdLineaMarca();

			this.inicializarActualizarBindingDisponiblesCostos(false);

			//if(DisponiblesCostosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDisponiblesCostos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDisponiblesCostos(false,false);

			this.getDisponiblesCostossFK_IdProducto();

			this.inicializarActualizarBindingDisponiblesCostos(false);

			//if(DisponiblesCostosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDisponiblesCostos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDisponiblesCostosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDisponiblesCostos(false,false);

			this.getDisponiblesCostossFK_IdSucursal();

			this.inicializarActualizarBindingDisponiblesCostos(false);

			//if(DisponiblesCostosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDisponiblesCostos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.disponiblescostosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDisponiblesCostos() {
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
			this.jInternalFrameDetalleFormDisponiblesCostos.setVisible(false);	    			
			this.jInternalFrameDetalleFormDisponiblesCostos.dispose();
			this.jInternalFrameDetalleFormDisponiblesCostos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDisponiblesCostos!=null) {
			this.jInternalFrameReporteDinamicoDisponiblesCostos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDisponiblesCostos.dispose();
			this.jInternalFrameReporteDinamicoDisponiblesCostos=null;
		}
		
		if(this.jInternalFrameImportacionDisponiblesCostos!=null) {
			this.jInternalFrameImportacionDisponiblesCostos.setVisible(false);	    			
			this.jInternalFrameImportacionDisponiblesCostos.dispose();
			this.jInternalFrameImportacionDisponiblesCostos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDisponiblesCostos();
			
			DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
			
			
			if(sTipo.equals("NuevoDisponiblesCostos")) {
				jButtonNuevoDisponiblesCostosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDisponiblesCostos")) {
				jButtonDuplicarDisponiblesCostosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDisponiblesCostos")) {
				jButtonCopiarDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("VerFormDisponiblesCostos")) {
				jButtonVerFormDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDisponiblesCostos")) {
				jButtonNuevoDisponiblesCostosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDisponiblesCostos")) {
				jButtonDuplicarDisponiblesCostosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDisponiblesCostos")) {
				jButtonNuevoDisponiblesCostosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDisponiblesCostos")) {
				jButtonDuplicarDisponiblesCostosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDisponiblesCostos")) {
				jButtonNuevoDisponiblesCostosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDisponiblesCostos")) {
				jButtonNuevoDisponiblesCostosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDisponiblesCostos")) {
				jButtonNuevoDisponiblesCostosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDisponiblesCostos")) {
				jButtonModificarDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDisponiblesCostos")) {
				jButtonModificarDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDisponiblesCostos")) {
				jButtonModificarDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDisponiblesCostos")) {
				jButtonActualizarDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDisponiblesCostos")) {
				jButtonActualizarDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDisponiblesCostos")) {
				jButtonActualizarDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("EliminarDisponiblesCostos")) {
				jButtonEliminarDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDisponiblesCostos")) {
				jButtonEliminarDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDisponiblesCostos")) {
				jButtonEliminarDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("CancelarDisponiblesCostos")) {
				jButtonCancelarDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDisponiblesCostos")) {
				jButtonCancelarDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDisponiblesCostos")) {
				jButtonCancelarDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("CerrarDisponiblesCostos")) {
				jButtonCerrarDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDisponiblesCostos")) {
				jButtonCerrarDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDisponiblesCostos")) {
				jButtonCerrarDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDisponiblesCostos")) {
				jButtonMostrarOcultarDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDisponiblesCostos")) {
				jButtonCancelarDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDisponiblesCostos")) {
				jButtonGuardarCambiosDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDisponiblesCostos")) {
				jButtonGuardarCambiosDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDisponiblesCostos")) {
				jButtonCopiarDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDisponiblesCostos")) {
				jButtonVerFormDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDisponiblesCostos")) {
				jButtonGuardarCambiosDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDisponiblesCostos")) {
				jButtonCopiarDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDisponiblesCostos")) {
				jButtonVerFormDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDisponiblesCostos")) {
				jButtonGuardarCambiosDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDisponiblesCostos")) {
				jButtonGuardarCambiosDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDisponiblesCostos")) {
				jButtonGuardarCambiosDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDisponiblesCostos")) {
				jButtonRecargarInformacionDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDisponiblesCostos")) {
				jButtonRecargarInformacionDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDisponiblesCostos")) {
				jButtonRecargarInformacionDisponiblesCostosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDisponiblesCostos")) {
				jButtonAnterioresDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDisponiblesCostos")) {
				jButtonAnterioresDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDisponiblesCostos")) {
				jButtonAnterioresDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDisponiblesCostos")) {
				jButtonSiguientesDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDisponiblesCostos")) {
				jButtonSiguientesDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDisponiblesCostos")) {
				jButtonSiguientesDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDisponiblesCostos") || sTipo.equals("MenuItemDetalleAbrirOrderByDisponiblesCostos")) {
				jButtonAbrirOrderByDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDisponiblesCostos") || sTipo.equals("MenuItemDetalleMostrarOcultarDisponiblesCostos")) {
				jButtonMostrarOcultarDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDisponiblesCostos")) {
				jButtonNuevoGuardarCambiosDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDisponiblesCostos")) {
				jButtonNuevoGuardarCambiosDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDisponiblesCostos")) {
				jButtonNuevoGuardarCambiosDisponiblesCostosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDisponiblesCostos")) {
				jButtonCerrarReporteDinamicoDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDisponiblesCostos")) {
				jButtonGenerarReporteDinamicoDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDisponiblesCostos")) {
				
				jButtonGenerarExcelReporteDinamicoDisponiblesCostosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDisponiblesCostos")) {
				jButtonCerrarImportacionDisponiblesCostosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDisponiblesCostos")) {
				
				jButtonGenerarImportacionDisponiblesCostosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDisponiblesCostos")) {
				
				jButtonAbrirImportacionDisponiblesCostosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDisponiblesCostos")) {
				jComboBoxTiposAccionesDisponiblesCostosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDisponiblesCostos")) {
				jComboBoxTiposRelacionesDisponiblesCostosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDisponiblesCostos")) {
				jComboBoxTiposAccionesDisponiblesCostosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDisponiblesCostos")) {
				
				jComboBoxTiposSeleccionarDisponiblesCostosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDisponiblesCostos")) {
				jTextFieldValorCampoGeneralDisponiblesCostosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDisponiblesCostos")) {
				jButtonAbrirOrderByDisponiblesCostosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDisponiblesCostos")) {
				jButtonAbrirOrderByDisponiblesCostosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDisponiblesCostos")) {
				jButtonCerrarOrderByDisponiblesCostosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDisponiblesCostosBusqueda")) {
				this.jButtonidDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaDisponiblesCostosUpdate")) {
				this.jButtonid_bodegaDisponiblesCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaDisponiblesCostosBusqueda")) {
				this.jButtonid_bodegaDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoDisponiblesCostosUpdate")) {
				this.jButtonid_productoDisponiblesCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoDisponiblesCostosBusqueda")) {
				this.jButtonid_productoDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDisponiblesCostosUpdate")) {
				this.jButtonid_empresaDisponiblesCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDisponiblesCostosBusqueda")) {
				this.jButtonid_empresaDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDisponiblesCostosUpdate")) {
				this.jButtonid_sucursalDisponiblesCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDisponiblesCostosBusqueda")) {
				this.jButtonid_sucursalDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaDisponiblesCostosUpdate")) {
				this.jButtonid_lineaDisponiblesCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaDisponiblesCostosBusqueda")) {
				this.jButtonid_lineaDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoDisponiblesCostosUpdate")) {
				this.jButtonid_linea_grupoDisponiblesCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoDisponiblesCostosBusqueda")) {
				this.jButtonid_linea_grupoDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaDisponiblesCostosUpdate")) {
				this.jButtonid_linea_categoriaDisponiblesCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaDisponiblesCostosBusqueda")) {
				this.jButtonid_linea_categoriaDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaDisponiblesCostosUpdate")) {
				this.jButtonid_linea_marcaDisponiblesCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaDisponiblesCostosBusqueda")) {
				this.jButtonid_linea_marcaDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaDisponiblesCostosBusqueda")) {
				this.jButtonfecha_emision_hastaDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalDisponiblesCostosBusqueda")) {
				this.jButtonnombre_sucursalDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaDisponiblesCostosBusqueda")) {
				this.jButtonnombre_lineaDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_grupoDisponiblesCostosBusqueda")) {
				this.jButtonnombre_linea_grupoDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_categoriaDisponiblesCostosBusqueda")) {
				this.jButtonnombre_linea_categoriaDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_marcaDisponiblesCostosBusqueda")) {
				this.jButtonnombre_linea_marcaDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoDisponiblesCostosBusqueda")) {
				this.jButtoncodigoDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDisponiblesCostosBusqueda")) {
				this.jButtonnombreDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaDisponiblesCostosBusqueda")) {
				this.jButtonnombre_bodegaDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadDisponiblesCostosBusqueda")) {
				this.jButtonnombre_unidadDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingresosDisponiblesCostosBusqueda")) {
				this.jButtoningresosDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("egresosDisponiblesCostosBusqueda")) {
				this.jButtonegresosDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("disponible_corteDisponiblesCostosBusqueda")) {
				this.jButtondisponible_corteDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoDisponiblesCostosBusqueda")) {
				this.jButtoncostoDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalDisponiblesCostosBusqueda")) {
				this.jButtontotalDisponiblesCostosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaDisponiblesCostosDisponiblesCostos")) {
				this.jButtonBusquedaDisponiblesCostosDisponiblesCostosActionPerformed(evt);
			}
			
			;
			
			
			DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDisponiblesCostos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDisponiblesCostosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.disponiblescostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.disponiblescostos);
				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
				
				


				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DisponiblesCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DisponiblesCostos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DisponiblesCostos disponiblescostosLocal=null;
			
			if(!this.getEsControlTabla()) {
				disponiblescostosLocal=this.disponiblescostos;
			} else {
				disponiblescostosLocal=this.disponiblescostosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.disponiblescostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.disponiblescostos);
				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
							
				
				


				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DisponiblesCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DisponiblesCostos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDisponiblesCostosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosAnterior =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.disponiblescostosAnterior =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
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
			
			DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
			
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
			
			


			
			DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDisponiblesCostosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.disponiblescostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.disponiblescostos);
				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
								
						
				


				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DisponiblesCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DisponiblesCostos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.disponiblescostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.disponiblescostos);
				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
								
				
				


				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DisponiblesCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DisponiblesCostos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDisponiblesCostosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosAnterior =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.disponiblescostosAnterior =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.disponiblescostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.disponiblescostos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDisponiblesCostosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosAnterior =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.disponiblescostosAnterior =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDisponiblesCostosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.disponiblescostos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.disponiblescostos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.disponiblescostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.disponiblescostos);
				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
							
				
				


				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DisponiblesCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DisponiblesCostos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDisponiblesCostosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostosAnterior =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.disponiblescostosAnterior =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
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
			
			DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
			
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
			
			


			
			DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDisponiblesCostosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.disponiblescostos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.disponiblescostos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.disponiblescostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.disponiblescostos);
				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
								
				
				


				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DisponiblesCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DisponiblesCostos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDisponiblesCostosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosAnterior =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.disponiblescostosAnterior =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDisponiblesCostosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.disponiblescostos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.disponiblescostos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDisponiblesCostosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.disponiblescostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.disponiblescostos);
				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDisponiblesCostos")) {
					jCheckBoxSeleccionarTodosDisponiblesCostosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDisponiblesCostos")) {
					jCheckBoxSeleccionadosDisponiblesCostosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDisponiblesCostos")) {
					
				}
				
				


				
				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DisponiblesCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DisponiblesCostos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.disponiblescostos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.disponiblescostos);
				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
												
				
				


				
				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DisponiblesCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DisponiblesCostos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDisponiblesCostosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.disponiblescostosAnterior =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.disponiblescostosAnterior =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDisponiblesCostosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.disponiblescostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.disponiblescostos);
				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
				
				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
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
			
			DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
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
			
			


			
			DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDisponiblesCostosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.disponiblescostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.disponiblescostos);
				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DisponiblesCostos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DisponiblesCostos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.disponiblescostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.disponiblescostos);
				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
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
				
				


				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DisponiblesCostos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DisponiblesCostos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDisponiblesCostosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.disponiblescostosAnterior =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.disponiblescostosAnterior =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDisponiblesCostos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDisponiblesCostosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDisponiblesCostos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.disponiblescostos =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.disponiblescostos =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.disponiblescostos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDisponiblesCostos")) {
				
				}
				
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDisponiblesCostos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDisponiblesCostos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDisponiblesCostos")) {
			
			}
			
			DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDisponiblesCostos();
			
			DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
			
			if(sTipo.equals("NuevoDisponiblesCostos")) {
				jButtonNuevoDisponiblesCostosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDisponiblesCostos")) {
				jButtonDuplicarDisponiblesCostosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDisponiblesCostos")) {
				jButtonCopiarDisponiblesCostosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDisponiblesCostos")) {
				jButtonVerFormDisponiblesCostosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDisponiblesCostos")) {
				jButtonNuevoDisponiblesCostosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDisponiblesCostos")) {
				jButtonModificarDisponiblesCostosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDisponiblesCostos")) {
				jButtonActualizarDisponiblesCostosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDisponiblesCostos")) {
				jButtonEliminarDisponiblesCostosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDisponiblesCostos")) {
				jButtonGuardarCambiosDisponiblesCostosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDisponiblesCostos")) {
				jButtonCancelarDisponiblesCostosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDisponiblesCostos")) {
				jButtonCerrarDisponiblesCostosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDisponiblesCostos")) {
				jButtonGuardarCambiosDisponiblesCostosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDisponiblesCostos")) {
				jButtonNuevoGuardarCambiosDisponiblesCostosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDisponiblesCostos")) {
				jButtonAbrirOrderByDisponiblesCostosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDisponiblesCostos")) {
				jButtonRecargarInformacionDisponiblesCostosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDisponiblesCostos")) {
				jButtonAnterioresDisponiblesCostosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDisponiblesCostos")) {
				jButtonSiguientesDisponiblesCostosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDisponiblesCostosBusqueda")) {
				this.jButtonidDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaDisponiblesCostosUpdate")) {
				this.jButtonid_bodegaDisponiblesCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaDisponiblesCostosBusqueda")) {
				this.jButtonid_bodegaDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoDisponiblesCostosUpdate")) {
				this.jButtonid_productoDisponiblesCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoDisponiblesCostosBusqueda")) {
				this.jButtonid_productoDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDisponiblesCostosUpdate")) {
				this.jButtonid_empresaDisponiblesCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDisponiblesCostosBusqueda")) {
				this.jButtonid_empresaDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDisponiblesCostosUpdate")) {
				this.jButtonid_sucursalDisponiblesCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDisponiblesCostosBusqueda")) {
				this.jButtonid_sucursalDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaDisponiblesCostosUpdate")) {
				this.jButtonid_lineaDisponiblesCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaDisponiblesCostosBusqueda")) {
				this.jButtonid_lineaDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoDisponiblesCostosUpdate")) {
				this.jButtonid_linea_grupoDisponiblesCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoDisponiblesCostosBusqueda")) {
				this.jButtonid_linea_grupoDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaDisponiblesCostosUpdate")) {
				this.jButtonid_linea_categoriaDisponiblesCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaDisponiblesCostosBusqueda")) {
				this.jButtonid_linea_categoriaDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaDisponiblesCostosUpdate")) {
				this.jButtonid_linea_marcaDisponiblesCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaDisponiblesCostosBusqueda")) {
				this.jButtonid_linea_marcaDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaDisponiblesCostosBusqueda")) {
				this.jButtonfecha_emision_hastaDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalDisponiblesCostosBusqueda")) {
				this.jButtonnombre_sucursalDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaDisponiblesCostosBusqueda")) {
				this.jButtonnombre_lineaDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_grupoDisponiblesCostosBusqueda")) {
				this.jButtonnombre_linea_grupoDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_categoriaDisponiblesCostosBusqueda")) {
				this.jButtonnombre_linea_categoriaDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_marcaDisponiblesCostosBusqueda")) {
				this.jButtonnombre_linea_marcaDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoDisponiblesCostosBusqueda")) {
				this.jButtoncodigoDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDisponiblesCostosBusqueda")) {
				this.jButtonnombreDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaDisponiblesCostosBusqueda")) {
				this.jButtonnombre_bodegaDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadDisponiblesCostosBusqueda")) {
				this.jButtonnombre_unidadDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingresosDisponiblesCostosBusqueda")) {
				this.jButtoningresosDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("egresosDisponiblesCostosBusqueda")) {
				this.jButtonegresosDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("disponible_corteDisponiblesCostosBusqueda")) {
				this.jButtondisponible_corteDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoDisponiblesCostosBusqueda")) {
				this.jButtoncostoDisponiblesCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalDisponiblesCostosBusqueda")) {
				this.jButtontotalDisponiblesCostosBusquedaActionPerformed(evt);
			}
			
			DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDisponiblesCostos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDisponiblesCostos")) {
				closingInternalFrameDisponiblesCostos();
				
			} else if(sTipo.equals("jButtonCancelarDisponiblesCostos")) {
				JInternalFrameBase jInternalFrameDetalleFormDisponiblesCostos = (JInternalFrameBase)evt.getSource();
	            	
	            DisponiblesCostosBeanSwingJInternalFrame jInternalFrameParent=(DisponiblesCostosBeanSwingJInternalFrame)jInternalFrameDetalleFormDisponiblesCostos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDisponiblesCostosActionPerformed(null);
			}
			
			DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.disponiblescostos,new Object(),this.disponiblescostosParameterGeneral,this.disponiblescostosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDisponiblesCostos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDisponiblesCostos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDisponiblesCostos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.disponiblescostos)) {
			if(!esControlTabla) {
				if(DisponiblesCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);			
				}
				
				if(this.disponiblescostosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDisponiblesCostos(this.disponiblescostos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDisponiblesCostos(this.disponiblescostosReturnGeneral,this.disponiblescostosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.disponiblescostosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDisponiblesCostos(classes,this.disponiblescostosReturnGeneral,this.disponiblescostosBean,false);
					}
						
					if(this.disponiblescostosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDisponiblesCostos(this.disponiblescostosReturnGeneral.getDisponiblesCostos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDisponiblesCostos(this.disponiblescostosReturnGeneral.getDisponiblesCostos());	
					}
						
					if(this.disponiblescostosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDisponiblesCostos(this.disponiblescostosReturnGeneral.getDisponiblesCostos(),classes);//this.disponiblescostosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDisponiblesCostos(this.disponiblescostos,classes);//this.disponiblescostosBean);									
				}
			
				if(DisponiblesCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDisponiblesCostos(this.disponiblescostos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDisponiblesCostos(this.disponiblescostos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.disponiblescostosAnterior!=null) {
						this.disponiblescostos=this.disponiblescostosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.disponiblescostosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.disponiblescostosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.disponiblescostosReturnGeneral.getDisponiblesCostos(),disponiblescostosLogic.getDisponiblesCostoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.disponiblescostosReturnGeneral.getDisponiblesCostos(),this.disponiblescostoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDisponiblesCostos.repaint();
				
				//((AbstractTableModel) this.jTableDatosDisponiblesCostos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDisponiblesCostos();
			}
		}
	}
	
	public void actualizarVisualTableDatosDisponiblesCostos() throws Exception {
		
		DisponiblesCostosModel disponiblescostosModel=(DisponiblesCostosModel)this.jTableDatosDisponiblesCostos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			disponiblescostosModel.disponiblescostoss=this.disponiblescostosLogic.getDisponiblesCostoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			disponiblescostosModel.disponiblescostoss=this.disponiblescostoss;
		}
		
		
		((DisponiblesCostosModel) this.jTableDatosDisponiblesCostos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDisponiblesCostos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdisponiblescostosAnterior(),this.disponiblescostosLogic.getDisponiblesCostoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdisponiblescostosAnterior(),this.disponiblescostoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDisponiblesCostos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDisponiblesCostos(DisponiblesCostos disponiblescostos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
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
										
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.disponiblescostos,new Object(),generalEntityParameterGeneral,this.disponiblescostosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.disponiblescostosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DisponiblesCostosConstantesFunciones.getClassesRelationshipsOfDisponiblesCostos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DisponiblesCostosConstantesFunciones.getClassesRelationshipsFromStringsOfDisponiblesCostos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDisponiblesCostos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DisponiblesCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.disponiblescostos,new Object(),generalEntityParameterGeneral,this.disponiblescostosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDisponiblesCostos(DisponiblesCostosBean disponiblescostosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDisponiblesCostos(ArrayList<Classe> classes,DisponiblesCostosReturnGeneral disponiblescostosReturnGeneral,DisponiblesCostosBean disponiblescostosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDisponiblesCostos(DisponiblesCostos disponiblescostos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.disponiblescostos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDisponiblesCostos = new DisponiblesCostosDetalleFormJInternalFrame(jDesktopPane,this.disponiblescostosSessionBean.getConGuardarRelaciones(),this.disponiblescostosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.setVisible(false);
		this.jInternalFrameDetalleFormDisponiblesCostos.setSelected(false);						
		
		this.jInternalFrameDetalleFormDisponiblesCostos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDisponiblesCostos.disponiblescostosLogic=this.disponiblescostosLogic;
		
		this.cargarCombosFrameForeignKeyDisponiblesCostos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDisponiblesCostos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDisponiblesCostos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDisponiblesCostos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDisponiblesCostos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDisponiblesCostos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDisponiblesCostos"));
		
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonModificarDisponiblesCostos.addActionListener(new ButtonActionListener(this,"ModificarDisponiblesCostos"));

		
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonModificarToolBarDisponiblesCostos.addActionListener(new ButtonActionListener(this,"ModificarToolBarDisponiblesCostos"));
					
		this.jInternalFrameDetalleFormDisponiblesCostos.jMenuItemModificarDisponiblesCostos.addActionListener(new ButtonActionListener(this,"MenuItemModificarDisponiblesCostos"));		
		
		
		
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonActualizarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"ActualizarDisponiblesCostos"));
		
		
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonActualizarToolBarDisponiblesCostos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDisponiblesCostos"));
						
		this.jInternalFrameDetalleFormDisponiblesCostos.jMenuItemActualizarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDisponiblesCostos"));		
		
		
		
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonEliminarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"EliminarDisponiblesCostos"));
		
		
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonEliminarToolBarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"EliminarToolBarDisponiblesCostos"));
								
		this.jInternalFrameDetalleFormDisponiblesCostos.jMenuItemEliminarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDisponiblesCostos"));		
		
		
		
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonCancelarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"CancelarDisponiblesCostos"));
		
		
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonCancelarToolBarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"CancelarToolBarDisponiblesCostos"));
					
		this.jInternalFrameDetalleFormDisponiblesCostos.jMenuItemCancelarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDisponiblesCostos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDisponiblesCostos.jMenuItemDetalleCerrarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDisponiblesCostos"));		
		
		
		
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonGuardarCambiosToolBarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDisponiblesCostos"));
		
		
		
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonGuardarCambiosToolBarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDisponiblesCostos"));
		
		
		
		this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxTiposAccionesFormularioDisponiblesCostos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDisponiblesCostos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonidDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"idDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_bodegaDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_bodegaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_productoDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_productoDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_productoDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_empresaDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_empresaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_sucursalDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_sucursalDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_lineaDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_lineaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_linea_grupoDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_linea_grupoDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_linea_categoriaDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_linea_categoriaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_linea_marcaDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_linea_marcaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonfecha_emision_hastaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombre_sucursalDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombre_lineaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombre_linea_grupoDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombre_linea_categoriaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombre_linea_marcaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtoncodigoDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"codigoDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombreDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombreDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombre_bodegaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombre_unidadDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtoningresosDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"ingresosDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonegresosDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"egresosDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtondisponible_corteDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"disponible_corteDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtoncostoDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"costoDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtontotalDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"totalDisponiblesCostosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDisponiblesCostos.jTabbedPaneRelacionesDisponiblesCostos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDisponiblesCostos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDisponiblesCostos"));
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDisponiblesCostos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDisponiblesCostos"));
		}
		
		this.jTableDatosDisponiblesCostos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDisponiblesCostos"));
		
		this.jTableDatosDisponiblesCostos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDisponiblesCostos"));
		
		this.jButtonNuevoDisponiblesCostos.addActionListener(new ButtonActionListener(this,"NuevoDisponiblesCostos"));
		
		this.jButtonDuplicarDisponiblesCostos.addActionListener(new ButtonActionListener(this,"DuplicarDisponiblesCostos"));
		
		this.jButtonCopiarDisponiblesCostos.addActionListener(new ButtonActionListener(this,"CopiarDisponiblesCostos"));
		
		this.jButtonVerFormDisponiblesCostos.addActionListener(new ButtonActionListener(this,"VerFormDisponiblesCostos"));
		
		
		this.jButtonNuevoToolBarDisponiblesCostos.addActionListener(new ButtonActionListener(this,"NuevoToolBarDisponiblesCostos"));
			
		this.jButtonDuplicarToolBarDisponiblesCostos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDisponiblesCostos"));
			
		this.jMenuItemNuevoDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDisponiblesCostos"));
			
		this.jMenuItemDuplicarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDisponiblesCostos"));		
		
		
		this.jButtonNuevoRelacionesDisponiblesCostos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDisponiblesCostos"));
		
		
		this.jButtonNuevoRelacionesToolBarDisponiblesCostos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDisponiblesCostos"));
			
		this.jMenuItemNuevoRelacionesDisponiblesCostos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDisponiblesCostos"));		
		
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonModificarDisponiblesCostos.addActionListener(new ButtonActionListener(this,"ModificarDisponiblesCostos"));
		}
		
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonModificarToolBarDisponiblesCostos.addActionListener(new ButtonActionListener(this,"ModificarToolBarDisponiblesCostos"));
			
			this.jInternalFrameDetalleFormDisponiblesCostos.jMenuItemModificarDisponiblesCostos.addActionListener(new ButtonActionListener(this,"MenuItemModificarDisponiblesCostos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonActualizarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"ActualizarDisponiblesCostos"));
		}
		
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonActualizarToolBarDisponiblesCostos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDisponiblesCostos"));
				
			this.jInternalFrameDetalleFormDisponiblesCostos.jMenuItemActualizarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDisponiblesCostos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonEliminarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"EliminarDisponiblesCostos"));
		}
		
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonEliminarToolBarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"EliminarToolBarDisponiblesCostos"));
						
			this.jInternalFrameDetalleFormDisponiblesCostos.jMenuItemEliminarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDisponiblesCostos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonCancelarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"CancelarDisponiblesCostos"));
		}
		
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonCancelarToolBarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"CancelarToolBarDisponiblesCostos"));
			
			this.jInternalFrameDetalleFormDisponiblesCostos.jMenuItemCancelarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDisponiblesCostos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDisponiblesCostos"));		
		
		
		this.jButtonCerrarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"CerrarDisponiblesCostos"));
		
		
		this.jButtonCerrarToolBarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"CerrarToolBarDisponiblesCostos"));
			
		this.jMenuItemCerrarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDisponiblesCostos"));
			
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDisponiblesCostos.jMenuItemDetalleCerrarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDisponiblesCostos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonGuardarCambiosDisponiblesCostos.addActionListener (new ButtonActionListener(this,"GuardarCambiosDisponiblesCostos"));
		}
		
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDisponiblesCostos.jButtonGuardarCambiosToolBarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDisponiblesCostos"));
		}
		
		this.jButtonCopiarToolBarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"CopiarToolBarDisponiblesCostos"));
			
		this.jButtonVerFormToolBarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"VerFormToolBarDisponiblesCostos"));
		
		this.jMenuItemGuardarCambiosDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDisponiblesCostos"));
			
		this.jMenuItemCopiarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDisponiblesCostos"));		
		
		this.jMenuItemVerFormDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDisponiblesCostos"));		
		
		
		this.jButtonGuardarCambiosTablaDisponiblesCostos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDisponiblesCostos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDisponiblesCostos"));
			
		this.jMenuItemGuardarCambiosTablaDisponiblesCostos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDisponiblesCostos"));		
		
		
		
		this.jButtonRecargarInformacionDisponiblesCostos.addActionListener (new ButtonActionListener(this,"RecargarInformacionDisponiblesCostos"));
					
		this.jButtonRecargarInformacionToolBarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDisponiblesCostos"));
		
		this.jMenuItemRecargarInformacionDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDisponiblesCostos"));		
		
		
		
		this.jButtonAnterioresDisponiblesCostos.addActionListener (new ButtonActionListener(this,"AnterioresDisponiblesCostos"));
		
		
		this.jButtonAnterioresToolBarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDisponiblesCostos"));
		
		this.jMenuItemAnterioresDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDisponiblesCostos"));		
		
		
		this.jButtonSiguientesDisponiblesCostos.addActionListener (new ButtonActionListener(this,"SiguientesDisponiblesCostos"));
		
		
		this.jButtonSiguientesToolBarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDisponiblesCostos"));
			
		this.jMenuItemSiguientesDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDisponiblesCostos"));
			
		this.jMenuItemAbrirOrderByDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDisponiblesCostos"));
			
		this.jMenuItemMostrarOcultarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDisponiblesCostos"));
			
		this.jMenuItemDetalleAbrirOrderByDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDisponiblesCostos"));
			
		this.jMenuItemDetalleMostarOcultarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDisponiblesCostos"));		
		
		
		this.jButtonNuevoGuardarCambiosDisponiblesCostos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDisponiblesCostos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDisponiblesCostos"));
			
		this.jMenuItemNuevoGuardarCambiosDisponiblesCostos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDisponiblesCostos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDisponiblesCostos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDisponiblesCostos"));

		this.jCheckBoxSeleccionadosDisponiblesCostos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDisponiblesCostos"));
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxTiposAccionesFormularioDisponiblesCostos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDisponiblesCostos"));
		}
		
		
		this.jComboBoxTiposRelacionesDisponiblesCostos.addActionListener (new ButtonActionListener(this,"TiposRelacionesDisponiblesCostos"));
			
		this.jComboBoxTiposAccionesDisponiblesCostos.addActionListener (new ButtonActionListener(this,"TiposAccionesDisponiblesCostos"));
					
		this.jComboBoxTiposSeleccionarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDisponiblesCostos"));
			
		this.jTextFieldValorCampoGeneralDisponiblesCostos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDisponiblesCostos"));		
		
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonidDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"idDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_bodegaDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_bodegaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_productoDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_productoDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_productoDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_empresaDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_empresaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_sucursalDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_sucursalDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_lineaDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_lineaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_linea_grupoDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_linea_grupoDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_linea_categoriaDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_linea_categoriaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_linea_marcaDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_linea_marcaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonfecha_emision_hastaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombre_sucursalDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombre_lineaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombre_linea_grupoDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombre_linea_categoriaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombre_linea_marcaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtoncodigoDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"codigoDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombreDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombreDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombre_bodegaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombre_unidadDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtoningresosDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"ingresosDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonegresosDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"egresosDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtondisponible_corteDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"disponible_corteDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtoncostoDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"costoDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtontotalDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"totalDisponiblesCostosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaDisponiblesCostosDisponiblesCostos.addActionListener(new ButtonActionListener(this,"BusquedaDisponiblesCostosDisponiblesCostos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDisponiblesCostos!=null) {
				this.jInternalFrameReporteDinamicoDisponiblesCostos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDisponiblesCostos"));
				this.jInternalFrameReporteDinamicoDisponiblesCostos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDisponiblesCostos"));
				this.jInternalFrameReporteDinamicoDisponiblesCostos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDisponiblesCostos"));
			}
			
			//this.jButtonCerrarReporteDinamicoDisponiblesCostos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDisponiblesCostos"));				
			//this.jButtonGenerarReporteDinamicoDisponiblesCostos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDisponiblesCostos"));
			//this.jButtonGenerarExcelReporteDinamicoDisponiblesCostos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDisponiblesCostos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDisponiblesCostos!=null) {
				this.jInternalFrameImportacionDisponiblesCostos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDisponiblesCostos"));
				this.jInternalFrameImportacionDisponiblesCostos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDisponiblesCostos"));
				this.jInternalFrameImportacionDisponiblesCostos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDisponiblesCostos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDisponiblesCostos.addActionListener (new ButtonActionListener(this,"AbrirOrderByDisponiblesCostos"));
			
			this.jButtonAbrirOrderByToolBarDisponiblesCostos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDisponiblesCostos"));			
			
			if(this.jInternalFrameOrderByDisponiblesCostos!=null) {
				this.jInternalFrameOrderByDisponiblesCostos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDisponiblesCostos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDisponiblesCostos.jTabbedPaneRelacionesDisponiblesCostos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDisponiblesCostos"));
		
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
            		closingInternalFrameDisponiblesCostos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDisponiblesCostos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDisponiblesCostos = (JInternalFrameBase)event.getSource();
	            	
	            DisponiblesCostosBeanSwingJInternalFrame jInternalFrameParent=(DisponiblesCostosBeanSwingJInternalFrame)jInternalFrameDetalleFormDisponiblesCostos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDisponiblesCostosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDisponiblesCostos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDisponiblesCostosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDisponiblesCostos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDisponiblesCostos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDisponiblesCostosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDisponiblesCostosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDisponiblesCostosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDisponiblesCostos";
		inputMap = this.jButtonNuevoDisponiblesCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDisponiblesCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDisponiblesCostosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDisponiblesCostosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDisponiblesCostosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDisponiblesCostosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDisponiblesCostos";
		inputMap = this.jButtonNuevoRelacionesDisponiblesCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDisponiblesCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDisponiblesCostosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDisponiblesCostos";
		inputMap = this.jButtonModificarDisponiblesCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDisponiblesCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDisponiblesCostosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDisponiblesCostos";
		inputMap = this.jButtonActualizarDisponiblesCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDisponiblesCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDisponiblesCostosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDisponiblesCostos";
		inputMap = this.jButtonEliminarDisponiblesCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDisponiblesCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDisponiblesCostosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDisponiblesCostos";
		inputMap = this.jButtonCancelarDisponiblesCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDisponiblesCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDisponiblesCostosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDisponiblesCostos";
		inputMap = this.jButtonCerrarDisponiblesCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDisponiblesCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDisponiblesCostosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonGuardarCambiosDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDisponiblesCostos";
		inputMap = this.jInternalFrameDetalleFormDisponiblesCostos.jButtonGuardarCambiosDisponiblesCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonGuardarCambiosDisponiblesCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDisponiblesCostosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDisponiblesCostos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDisponiblesCostosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDisponiblesCostos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDisponiblesCostosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDisponiblesCostos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDisponiblesCostosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDisponiblesCostos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDisponiblesCostosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonidDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"idDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_bodegaDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_bodegaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_productoDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_productoDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_productoDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_empresaDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_empresaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_sucursalDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_sucursalDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_lineaDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_lineaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_linea_grupoDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_linea_grupoDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_linea_categoriaDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_linea_categoriaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaDisponiblesCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_linea_marcaDisponiblesCostosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaDisponiblesCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonid_linea_marcaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonfecha_emision_hastaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombre_sucursalDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombre_lineaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombre_linea_grupoDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombre_linea_categoriaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombre_linea_marcaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtoncodigoDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"codigoDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombreDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombreDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombre_bodegaDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonnombre_unidadDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtoningresosDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"ingresosDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtonegresosDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"egresosDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtondisponible_corteDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"disponible_corteDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtoncostoDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"costoDisponiblesCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDisponiblesCostos.jButtontotalDisponiblesCostosBusqueda.addActionListener(new ButtonActionListener(this,"totalDisponiblesCostosBusqueda"));
		
		
		this.jButtonBusquedaDisponiblesCostosDisponiblesCostos.addActionListener(new ButtonActionListener(this,"BusquedaDisponiblesCostosDisponiblesCostos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDisponiblesCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDisponiblesCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDisponiblesCostosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDisponiblesCostos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDisponiblesCostos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DisponiblesCostos disponiblescostosAux:this.disponiblescostosLogic.getDisponiblesCostoss()) {
					disponiblescostosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DisponiblesCostos disponiblescostosAux:disponiblescostoss) {
					disponiblescostosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDisponiblesCostosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDisponiblesCostos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DisponiblesCostos disponiblescostosAux:this.disponiblescostosLogic.getDisponiblesCostoss()) {
						disponiblescostosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DisponiblesCostos disponiblescostosAux:disponiblescostoss) {
						disponiblescostosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DisponiblesCostos disponiblescostosAux:this.disponiblescostosLogic.getDisponiblesCostoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DisponiblesCostos disponiblescostosAux:disponiblescostoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDisponiblesCostos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDisponiblesCostos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDisponiblesCostos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDisponiblesCostosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDisponiblesCostos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDisponiblesCostos.getSelectedRows();
			
			DisponiblesCostos disponiblescostosLocal=new DisponiblesCostos();
			
			//this.seleccionarTodosDisponiblesCostos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					disponiblescostosLocal =(DisponiblesCostos) this.disponiblescostosLogic.getDisponiblesCostoss().toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					disponiblescostosLocal =(DisponiblesCostos) this.disponiblescostoss.toArray()[this.jTableDatosDisponiblesCostos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				disponiblescostosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DisponiblesCostos disponiblescostosAux:this.disponiblescostosLogic.getDisponiblesCostoss()) {
						disponiblescostosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DisponiblesCostos disponiblescostosAux:disponiblescostoss) {
						disponiblescostosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDisponiblesCostos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDisponiblesCostos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDisponiblesCostos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDisponiblesCostos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDisponiblesCostosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDisponiblesCostosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDisponiblesCostosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDisponiblesCostos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDisponiblesCostos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DisponiblesCostos disponiblescostosAux:this.disponiblescostosLogic.getDisponiblesCostoss()) {
				
						if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							disponiblescostosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							disponiblescostosAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							disponiblescostosAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
							existe=true;
							disponiblescostosAux.setnombre_linea_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
							existe=true;
							disponiblescostosAux.setnombre_linea_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
							existe=true;
							disponiblescostosAux.setnombre_linea_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							disponiblescostosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							disponiblescostosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							disponiblescostosAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							disponiblescostosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_INGRESOS)) {
							existe=true;
							disponiblescostosAux.setingresos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_EGRESOS)) {
							existe=true;
							disponiblescostosAux.setegresos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_DISPONIBLECORTE)) {
							existe=true;
							disponiblescostosAux.setdisponible_corte(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							disponiblescostosAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							disponiblescostosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DisponiblesCostos disponiblescostosAux:disponiblescostoss) {
					
						if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							disponiblescostosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							disponiblescostosAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							disponiblescostosAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
							existe=true;
							disponiblescostosAux.setnombre_linea_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
							existe=true;
							disponiblescostosAux.setnombre_linea_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
							existe=true;
							disponiblescostosAux.setnombre_linea_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							disponiblescostosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							disponiblescostosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							disponiblescostosAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							disponiblescostosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_INGRESOS)) {
							existe=true;
							disponiblescostosAux.setingresos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_EGRESOS)) {
							existe=true;
							disponiblescostosAux.setegresos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_DISPONIBLECORTE)) {
							existe=true;
							disponiblescostosAux.setdisponible_corte(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							disponiblescostosAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							disponiblescostosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDisponiblesCostos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDisponiblesCostosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDisponiblesCostos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDisponiblesCostos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDisponiblesCostos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxTiposAccionesFormularioDisponiblesCostos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDisponiblesCostos) {				
					conSplash=true;//false;										
					
					//this.startProcessDisponiblesCostos(conSplash);
				
					this.generarReporteDisponiblesCostossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDisponiblesCostos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxTiposAccionesFormularioDisponiblesCostos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDisponiblesCostossSeleccionados();
				//this.jComboBoxTiposAccionesDisponiblesCostos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDisponiblesCostossSeleccionados(false);
				//this.jComboBoxTiposAccionesDisponiblesCostos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDisponiblesCostossSeleccionados(true);
				//this.jComboBoxTiposAccionesDisponiblesCostos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDisponiblesCostos();
				
				this.exportarDisponiblesCostossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDisponiblesCostos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxTiposAccionesFormularioDisponiblesCostos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDisponiblesCostoss();
				//this.importarDisponiblesCostoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDisponiblesCostos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxTiposAccionesFormularioDisponiblesCostos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDisponiblesCostos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDisponiblesCostossSeleccionados();
				//this.jComboBoxTiposAccionesDisponiblesCostos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Disponibles Costos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDisponiblesCostos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDisponiblesCostos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDisponiblesCostos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Disponibles Costos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDisponiblesCostos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxTiposAccionesFormularioDisponiblesCostos.setSelectedIndex(0);					
				}	
			} 			
			else if(DisponiblesCostosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDisponiblesCostos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDisponiblesCostos(conSplash);
					
						//this.actualizarParametrosGeneralDisponiblesCostos();
						
						this.generarReporteProcesoAccionDisponiblesCostossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDisponiblesCostos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxTiposAccionesFormularioDisponiblesCostos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DisponiblesCostosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Disponibles CostosES SELECCIONADOS?", "MANTENIMIENTO DE Disponibles Costos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDisponiblesCostos();
				
						this.actualizarParametrosGeneralDisponiblesCostos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.disponiblescostosReturnGeneral=disponiblescostosLogic.procesarAccionDisponiblesCostossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.disponiblescostosLogic.getDisponiblesCostoss(),this.disponiblescostosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDisponiblesCostosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDisponiblesCostos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxTiposAccionesFormularioDisponiblesCostos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDisponiblesCostos();
					
					DisponiblesCostosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDisponiblesCostosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDisponiblesCostos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxTiposAccionesFormularioDisponiblesCostos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDisponiblesCostos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDisponiblesCostosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDisponiblesCostos();
			
			if(this.jInternalFrameDetalleFormDisponiblesCostos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DisponiblesCostos> disponiblescostossSeleccionados=new ArrayList<DisponiblesCostos>();		
			DisponiblesCostos disponiblescostos=new DisponiblesCostos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDisponiblesCostos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDisponiblesCostos.getSelectedItem();
			
			
			
			
			disponiblescostossSeleccionados=this.getDisponiblesCostossSeleccionados(true);
			//this.sTipoAccion;
			
			if(disponiblescostossSeleccionados.size()==1) {
				for(DisponiblesCostos disponiblescostosAux:disponiblescostossSeleccionados) {
					disponiblescostos=disponiblescostosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDisponiblesCostos();
			
      		//this.finishProcessDisponiblesCostos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDisponiblesCostosReturnGeneral() throws Exception {
		if(this.disponiblescostosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.disponiblescostosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.disponiblescostosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.disponiblescostosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.disponiblescostosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.disponiblescostosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDisponiblesCostos(false);
		}
		
		if(this.disponiblescostosReturnGeneral.getConRetornoLista() || this.disponiblescostosReturnGeneral.getConRetornoObjeto()) {
			if(this.disponiblescostosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.disponiblescostosLogic.setDisponiblesCostoss(this.disponiblescostosReturnGeneral.getDisponiblesCostoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingDisponiblesCostos(false);
		}
	}
	
	public void actualizarParametrosGeneralDisponiblesCostos() throws Exception {
		
		
	}
	
	public ArrayList<DisponiblesCostos> getDisponiblesCostossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DisponiblesCostos> disponiblescostossSeleccionados=new ArrayList<DisponiblesCostos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDisponiblesCostos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DisponiblesCostos disponiblescostosAux:disponiblescostosLogic.getDisponiblesCostoss()) {
					if(disponiblescostosAux.getIsSelected()) {
						disponiblescostossSeleccionados.add(disponiblescostosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DisponiblesCostos disponiblescostosAux:this.disponiblescostoss) {
					if(disponiblescostosAux.getIsSelected()) {
						disponiblescostossSeleccionados.add(disponiblescostosAux);				
					}
				}
			}
			
			if(disponiblescostossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						disponiblescostossSeleccionados.addAll(this.disponiblescostosLogic.getDisponiblesCostoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						disponiblescostossSeleccionados.addAll(this.disponiblescostoss);				
					}
				}
			}
		} else {
			disponiblescostossSeleccionados.add(this.disponiblescostos);
		}
		
		return disponiblescostossSeleccionados;
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
	
	public void generarReporteDisponiblesCostossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDisponiblesCostossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDisponiblesCostossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDisponiblesCostossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDisponiblesCostossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Disponibles Costos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDisponiblesCostossSeleccionados() throws Exception {
		ArrayList<DisponiblesCostos> disponiblescostossSeleccionados=new ArrayList<DisponiblesCostos>();		
		
		disponiblescostossSeleccionados=this.getDisponiblesCostossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDisponiblesCostoss("Todos",disponiblescostossSeleccionados);
		
	}	
	
	public void generarReporteNormalDisponiblesCostossSeleccionados() throws Exception {
		ArrayList<DisponiblesCostos> disponiblescostossSeleccionados=new ArrayList<DisponiblesCostos>();		
		
		disponiblescostossSeleccionados=this.getDisponiblesCostossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDisponiblesCostoss("Todos",disponiblescostossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDisponiblesCostossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DisponiblesCostos> disponiblescostossSeleccionados=new ArrayList<DisponiblesCostos>();
		
		disponiblescostossSeleccionados=this.getDisponiblesCostossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDisponiblesCostoss("Todos",disponiblescostossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDisponiblesCostossSeleccionados() throws Exception {
		ArrayList<DisponiblesCostos> disponiblescostossSeleccionados=new ArrayList<DisponiblesCostos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDisponiblesCostos();
		
		
		disponiblescostossSeleccionados=this.getDisponiblesCostossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDisponiblesCostos();
		
		
		//this.generarReporteDisponiblesCostoss("Todos",disponiblescostossSeleccionados ,disponiblescostosImplementable,disponiblescostosImplementableHome);
	}
	
	public void mostrarImportacionDisponiblesCostoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDisponiblesCostos();
		
		this.abrirFrameImportacionDisponiblesCostos();		
		
			
		//this.generarReporteDisponiblesCostoss("Todos",disponiblescostossSeleccionados ,disponiblescostosImplementable,disponiblescostosImplementableHome);
	}
	
	public void importarDisponiblesCostoss() throws Exception {		
	
	}
	
	public void exportarDisponiblesCostossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDisponiblesCostossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDisponiblesCostossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDisponiblesCostossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Disponibles Costos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDisponiblesCostossSeleccionados() throws Exception {
		ArrayList<DisponiblesCostos> disponiblescostossSeleccionados=new ArrayList<DisponiblesCostos>();		
		
		disponiblescostossSeleccionados=this.getDisponiblesCostossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"disponiblescostos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDisponiblesCostos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DisponiblesCostos disponiblescostosAux:disponiblescostossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDisponiblesCostos(disponiblescostosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//disponiblescostosAux.setsDetalleGeneralEntityReporte(disponiblescostosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Disponibles Costos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDisponiblesCostos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_NOMBRESUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_NOMBREBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_NOMBREUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_INGRESOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_EGRESOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_DISPONIBLECORTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_COSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DisponiblesCostosConstantesFunciones.LABEL_TOTAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDisponiblesCostos(DisponiblesCostos disponiblescostos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=disponiblescostos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getnombre_sucursal();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getnombre_linea();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getnombre_linea_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getnombre_linea_categoria();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getnombre_linea_marca();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getnombre_bodega();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getnombre_unidad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getingresos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getegresos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getdisponible_corte().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.getcosto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=disponiblescostos.gettotal().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDisponiblesCostossSeleccionados() throws Exception {
		ArrayList<DisponiblesCostos> disponiblescostossSeleccionados=new ArrayList<DisponiblesCostos>();		
		
		disponiblescostossSeleccionados=this.getDisponiblesCostossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"disponiblescostos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DisponiblesCostoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDisponiblesCostos(row);				
				iRow++;
			}				
			
			for(DisponiblesCostos disponiblescostosAux:disponiblescostossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDisponiblesCostos(disponiblescostosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Disponibles Costos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDisponiblesCostossSeleccionados() throws Exception {
		ArrayList<DisponiblesCostos> disponiblescostossSeleccionados=new ArrayList<DisponiblesCostos>();		
		
		disponiblescostossSeleccionados=this.getDisponiblesCostossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"disponiblescostos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("disponiblescostoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("disponiblescostos");
			//elementRoot.appendChild(element);
		
			for(DisponiblesCostos disponiblescostosAux:disponiblescostossSeleccionados) {
				element = document.createElement("disponiblescostos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDisponiblesCostos(disponiblescostosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Disponibles Costos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDisponiblesCostos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBRESUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBREBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_NOMBREUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_INGRESOS);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_EGRESOS);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_DISPONIBLECORTE);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_COSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DisponiblesCostosConstantesFunciones.LABEL_TOTAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDisponiblesCostos(DisponiblesCostos disponiblescostos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getnombre_sucursal());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getnombre_linea());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getnombre_linea_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getnombre_linea_categoria());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getnombre_linea_marca());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getnombre_bodega());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getnombre_unidad());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getingresos());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getegresos());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getdisponible_corte());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.getcosto());
		cell = row.createCell(iColumn++);cell.setCellValue(disponiblescostos.gettotal());				
	}
	
	public void setFilaDatosExportarXmlDisponiblesCostos(DisponiblesCostos disponiblescostos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DisponiblesCostosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(disponiblescostos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DisponiblesCostosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(disponiblescostos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementbodega_descripcion = document.createElement(DisponiblesCostosConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(disponiblescostos.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(DisponiblesCostosConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(disponiblescostos.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementempresa_descripcion = document.createElement(DisponiblesCostosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(disponiblescostos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DisponiblesCostosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(disponiblescostos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementlinea_descripcion = document.createElement(DisponiblesCostosConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(disponiblescostos.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(DisponiblesCostosConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(disponiblescostos.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(DisponiblesCostosConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(disponiblescostos.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(DisponiblesCostosConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(disponiblescostos.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementfecha_emision_hasta = document.createElement(DisponiblesCostosConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(disponiblescostos.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_sucursal = document.createElement(DisponiblesCostosConstantesFunciones.NOMBRESUCURSAL);
		elementnombre_sucursal.appendChild(document.createTextNode(disponiblescostos.getnombre_sucursal().trim()));
		element.appendChild(elementnombre_sucursal);

		Element elementnombre_linea = document.createElement(DisponiblesCostosConstantesFunciones.NOMBRELINEA);
		elementnombre_linea.appendChild(document.createTextNode(disponiblescostos.getnombre_linea().trim()));
		element.appendChild(elementnombre_linea);

		Element elementnombre_linea_grupo = document.createElement(DisponiblesCostosConstantesFunciones.NOMBRELINEAGRUPO);
		elementnombre_linea_grupo.appendChild(document.createTextNode(disponiblescostos.getnombre_linea_grupo().trim()));
		element.appendChild(elementnombre_linea_grupo);

		Element elementnombre_linea_categoria = document.createElement(DisponiblesCostosConstantesFunciones.NOMBRELINEACATEGORIA);
		elementnombre_linea_categoria.appendChild(document.createTextNode(disponiblescostos.getnombre_linea_categoria().trim()));
		element.appendChild(elementnombre_linea_categoria);

		Element elementnombre_linea_marca = document.createElement(DisponiblesCostosConstantesFunciones.NOMBRELINEAMARCA);
		elementnombre_linea_marca.appendChild(document.createTextNode(disponiblescostos.getnombre_linea_marca().trim()));
		element.appendChild(elementnombre_linea_marca);

		Element elementcodigo = document.createElement(DisponiblesCostosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(disponiblescostos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(DisponiblesCostosConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(disponiblescostos.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementnombre_bodega = document.createElement(DisponiblesCostosConstantesFunciones.NOMBREBODEGA);
		elementnombre_bodega.appendChild(document.createTextNode(disponiblescostos.getnombre_bodega().trim()));
		element.appendChild(elementnombre_bodega);

		Element elementnombre_unidad = document.createElement(DisponiblesCostosConstantesFunciones.NOMBREUNIDAD);
		elementnombre_unidad.appendChild(document.createTextNode(disponiblescostos.getnombre_unidad().trim()));
		element.appendChild(elementnombre_unidad);

		Element elementingresos = document.createElement(DisponiblesCostosConstantesFunciones.INGRESOS);
		elementingresos.appendChild(document.createTextNode(disponiblescostos.getingresos().toString().trim()));
		element.appendChild(elementingresos);

		Element elementegresos = document.createElement(DisponiblesCostosConstantesFunciones.EGRESOS);
		elementegresos.appendChild(document.createTextNode(disponiblescostos.getegresos().toString().trim()));
		element.appendChild(elementegresos);

		Element elementdisponible_corte = document.createElement(DisponiblesCostosConstantesFunciones.DISPONIBLECORTE);
		elementdisponible_corte.appendChild(document.createTextNode(disponiblescostos.getdisponible_corte().toString().trim()));
		element.appendChild(elementdisponible_corte);

		Element elementcosto = document.createElement(DisponiblesCostosConstantesFunciones.COSTO);
		elementcosto.appendChild(document.createTextNode(disponiblescostos.getcosto().toString().trim()));
		element.appendChild(elementcosto);

		Element elementtotal = document.createElement(DisponiblesCostosConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(disponiblescostos.gettotal().toString().trim()));
		element.appendChild(elementtotal);
	}
	
	public void generarReporteGroupGenericoDisponiblesCostossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DisponiblesCostos> disponiblescostossSeleccionados=new ArrayList<DisponiblesCostos>();
		
		disponiblescostossSeleccionados=this.getDisponiblesCostossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDisponiblesCostos(disponiblescostossSeleccionados);
		
		this.generarReporteDisponiblesCostoss("Todos",disponiblescostossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDisponiblesCostos(ArrayList<DisponiblesCostos> disponiblescostossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DisponiblesCostos disponiblescostosAux:disponiblescostossSeleccionados) {
				disponiblescostosAux.setsDetalleGeneralEntityReporte(disponiblescostosAux.toString());
			
				if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					disponiblescostosAux.setsDescripcionGeneralEntityReporte1(disponiblescostosAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					disponiblescostosAux.setsDescripcionGeneralEntityReporte1(disponiblescostosAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					disponiblescostosAux.setsDescripcionGeneralEntityReporte1(disponiblescostosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					disponiblescostosAux.setsDescripcionGeneralEntityReporte1(disponiblescostosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					disponiblescostosAux.setsDescripcionGeneralEntityReporte1(disponiblescostosAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					disponiblescostosAux.setsDescripcionGeneralEntityReporte1(disponiblescostosAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					disponiblescostosAux.setsDescripcionGeneralEntityReporte1(disponiblescostosAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					disponiblescostosAux.setsDescripcionGeneralEntityReporte1(disponiblescostosAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					disponiblescostosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(disponiblescostosAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
					existe=true;
					disponiblescostosAux.setsDescripcionGeneralEntityReporte1(disponiblescostosAux.getnombre_sucursal());
				}
				 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEA)) {
					existe=true;
					disponiblescostosAux.setsDescripcionGeneralEntityReporte1(disponiblescostosAux.getnombre_linea());
				}
				 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
					existe=true;
					disponiblescostosAux.setsDescripcionGeneralEntityReporte1(disponiblescostosAux.getnombre_linea_grupo());
				}
				 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
					existe=true;
					disponiblescostosAux.setsDescripcionGeneralEntityReporte1(disponiblescostosAux.getnombre_linea_categoria());
				}
				 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
					existe=true;
					disponiblescostosAux.setsDescripcionGeneralEntityReporte1(disponiblescostosAux.getnombre_linea_marca());
				}
				 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					disponiblescostosAux.setsDescripcionGeneralEntityReporte1(disponiblescostosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					disponiblescostosAux.setsDescripcionGeneralEntityReporte1(disponiblescostosAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBREBODEGA)) {
					existe=true;
					disponiblescostosAux.setsDescripcionGeneralEntityReporte1(disponiblescostosAux.getnombre_bodega());
				}
				 else if(sTipoSeleccionar.equals(DisponiblesCostosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
					existe=true;
					disponiblescostosAux.setsDescripcionGeneralEntityReporte1(disponiblescostosAux.getnombre_unidad());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DisponiblesCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDisponiblesCostos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDisponiblesCostos=true;
				this.isVisibilidadCeldaNuevoRelacionesDisponiblesCostos=true;
				this.isVisibilidadCeldaGuardarCambiosDisponiblesCostos=true;
			}
			
			this.isVisibilidadCeldaModificarDisponiblesCostos=false;
			this.isVisibilidadCeldaActualizarDisponiblesCostos=false;
			this.isVisibilidadCeldaEliminarDisponiblesCostos=false;
			this.isVisibilidadCeldaCancelarDisponiblesCostos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDisponiblesCostos=true;
				} else {
					this.isVisibilidadCeldaGuardarDisponiblesCostos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDisponiblesCostos=false;
			this.isVisibilidadCeldaNuevoRelacionesDisponiblesCostos=false;
			this.isVisibilidadCeldaGuardarCambiosDisponiblesCostos=false;
			this.isVisibilidadCeldaModificarDisponiblesCostos=false;
			this.isVisibilidadCeldaActualizarDisponiblesCostos=true;
			this.isVisibilidadCeldaEliminarDisponiblesCostos=false;
			this.isVisibilidadCeldaCancelarDisponiblesCostos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDisponiblesCostos=true;
				} else {
					this.isVisibilidadCeldaGuardarDisponiblesCostos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDisponiblesCostos=false;
			this.isVisibilidadCeldaNuevoRelacionesDisponiblesCostos=false;
			this.isVisibilidadCeldaGuardarCambiosDisponiblesCostos=false;
			this.isVisibilidadCeldaModificarDisponiblesCostos=false;
			this.isVisibilidadCeldaActualizarDisponiblesCostos=true;
			this.isVisibilidadCeldaEliminarDisponiblesCostos=true;
			this.isVisibilidadCeldaCancelarDisponiblesCostos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDisponiblesCostos=true;
				} else {
					this.isVisibilidadCeldaGuardarDisponiblesCostos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDisponiblesCostos=false;
			this.isVisibilidadCeldaNuevoRelacionesDisponiblesCostos=false;
			this.isVisibilidadCeldaGuardarCambiosDisponiblesCostos=false;
			this.isVisibilidadCeldaModificarDisponiblesCostos=false;
			this.isVisibilidadCeldaActualizarDisponiblesCostos=true;
			this.isVisibilidadCeldaEliminarDisponiblesCostos=false;
			this.isVisibilidadCeldaCancelarDisponiblesCostos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDisponiblesCostos=false;
				} else {
					this.isVisibilidadCeldaGuardarDisponiblesCostos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDisponiblesCostos=true;
			this.isVisibilidadCeldaNuevoRelacionesDisponiblesCostos=true;
			this.isVisibilidadCeldaGuardarCambiosDisponiblesCostos=true;
			this.isVisibilidadCeldaModificarDisponiblesCostos=false;
			this.isVisibilidadCeldaActualizarDisponiblesCostos=false;
			this.isVisibilidadCeldaEliminarDisponiblesCostos=false;
			this.isVisibilidadCeldaCancelarDisponiblesCostos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDisponiblesCostos=true;
				} else {
					this.isVisibilidadCeldaGuardarDisponiblesCostos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDisponiblesCostos=false;
			this.isVisibilidadCeldaNuevoRelacionesDisponiblesCostos=false;
			this.isVisibilidadCeldaGuardarCambiosDisponiblesCostos=false;
			this.isVisibilidadCeldaActualizarDisponiblesCostos=false;
			this.isVisibilidadCeldaEliminarDisponiblesCostos=false;
			this.isVisibilidadCeldaCancelarDisponiblesCostos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDisponiblesCostos=false;
				} else {
					this.isVisibilidadCeldaGuardarDisponiblesCostos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDisponiblesCostos=false;
			this.isVisibilidadCeldaNuevoRelacionesDisponiblesCostos=false;
			this.isVisibilidadCeldaGuardarCambiosDisponiblesCostos=false;
			this.isVisibilidadCeldaModificarDisponiblesCostos=true;
			this.isVisibilidadCeldaActualizarDisponiblesCostos=false;
			this.isVisibilidadCeldaEliminarDisponiblesCostos=false;
			this.isVisibilidadCeldaCancelarDisponiblesCostos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDisponiblesCostos=false;
				} else {
					this.isVisibilidadCeldaGuardarDisponiblesCostos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DisponiblesCostosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDisponiblesCostos=true;
			this.isVisibilidadCeldaNuevoRelacionesDisponiblesCostos=true;
			this.isVisibilidadCeldaGuardarCambiosDisponiblesCostos=true;
		} else {
			this.actualizarEstadoPanelsDisponiblesCostos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDisponiblesCostos=false;
			//this.isVisibilidadCeldaVerFormDisponiblesCostos=false;
			this.isVisibilidadCeldaDuplicarDisponiblesCostos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!disponiblescostosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDisponiblesCostos=false;
		} else {
			this.isVisibilidadCeldaNuevoDisponiblesCostos=false;
			this.isVisibilidadCeldaGuardarCambiosDisponiblesCostos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(disponiblescostosSessionBean.getEsGuardarRelacionado()) {
			if(!disponiblescostosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDisponiblesCostos=false;												
			}
			
			this.jButtonCerrarDisponiblesCostos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDisponiblesCostos=false;
		}
		
		if(!this.permiteMantenimiento(this.disponiblescostos)) {
			this.isVisibilidadCeldaActualizarDisponiblesCostos=false;
			this.isVisibilidadCeldaEliminarDisponiblesCostos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoDisponiblesCostos=false;
		this.isVisibilidadCeldaNuevoRelacionesDisponiblesCostos=false;
		this.isVisibilidadCeldaGuardarCambiosDisponiblesCostos=false;
		//this.isVisibilidadCeldaModificarDisponiblesCostos=true;
		this.isVisibilidadCeldaActualizarDisponiblesCostos=false;
		this.isVisibilidadCeldaEliminarDisponiblesCostos=false;
		//this.isVisibilidadCeldaCancelarDisponiblesCostos=true;			
		this.isVisibilidadCeldaGuardarDisponiblesCostos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDisponiblesCostos() {
	}
	
	public void actualizarEstadoPanelsDisponiblesCostos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDisponiblesCostos!=null) {
				this.jScrollPanelDatosEdicionDisponiblesCostos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDisponiblesCostos!=null) {
				this.jTabbedPaneBusquedasDisponiblesCostos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDisponiblesCostos!=null) {
				this.jScrollPanelDatosDisponiblesCostos.setVisible(true);
			}
			
			if(this.jPanelPaginacionDisponiblesCostos!=null) {
				this.jPanelPaginacionDisponiblesCostos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDisponiblesCostos!=null) {
				this.jPanelParametrosReportesDisponiblesCostos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDisponiblesCostos!=null) {
				this.jScrollPanelDatosEdicionDisponiblesCostos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDisponiblesCostos!=null) {
				this.jTabbedPaneBusquedasDisponiblesCostos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDisponiblesCostos!=null) {
				this.jScrollPanelDatosDisponiblesCostos.setVisible(false);
			}
			
			if(this.jPanelPaginacionDisponiblesCostos!=null) {
				this.jPanelPaginacionDisponiblesCostos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDisponiblesCostos!=null) {
				this.jPanelParametrosReportesDisponiblesCostos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDisponiblesCostos!=null) {
				this.jScrollPanelDatosEdicionDisponiblesCostos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDisponiblesCostos!=null) {
				this.jTabbedPaneBusquedasDisponiblesCostos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDisponiblesCostos!=null) {
				this.jScrollPanelDatosDisponiblesCostos.setVisible(false);
			}
			
			if(this.jPanelPaginacionDisponiblesCostos!=null) {
				this.jPanelPaginacionDisponiblesCostos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDisponiblesCostos!=null) {
				this.jPanelParametrosReportesDisponiblesCostos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDisponiblesCostos!=null) {
				this.jScrollPanelDatosEdicionDisponiblesCostos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDisponiblesCostos!=null) {
				this.jTabbedPaneBusquedasDisponiblesCostos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDisponiblesCostos!=null) {
				this.jScrollPanelDatosDisponiblesCostos.setVisible(false);
			}
			
			if(this.jPanelPaginacionDisponiblesCostos!=null) {
				this.jPanelPaginacionDisponiblesCostos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDisponiblesCostos!=null) {
				this.jPanelParametrosReportesDisponiblesCostos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDisponiblesCostos!=null) {
				this.jScrollPanelDatosEdicionDisponiblesCostos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDisponiblesCostos!=null) {
				this.jTabbedPaneBusquedasDisponiblesCostos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDisponiblesCostos!=null) {
				this.jScrollPanelDatosDisponiblesCostos.setVisible(true);
			}
			
			if(this.jPanelPaginacionDisponiblesCostos!=null) {
				this.jPanelPaginacionDisponiblesCostos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDisponiblesCostos!=null) {
				this.jPanelParametrosReportesDisponiblesCostos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDisponiblesCostos!=null) {
				this.jScrollPanelDatosEdicionDisponiblesCostos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDisponiblesCostos!=null) {
				this.jTabbedPaneBusquedasDisponiblesCostos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDisponiblesCostos!=null) {
				this.jScrollPanelDatosDisponiblesCostos.setVisible(true);
			}
			
			if(this.jPanelPaginacionDisponiblesCostos!=null) {
				this.jPanelPaginacionDisponiblesCostos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDisponiblesCostos!=null) {
				this.jPanelParametrosReportesDisponiblesCostos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDisponiblesCostos!=null) {
				this.jScrollPanelDatosEdicionDisponiblesCostos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDisponiblesCostos!=null) {
				this.jTabbedPaneBusquedasDisponiblesCostos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDisponiblesCostos!=null) {
				this.jScrollPanelDatosDisponiblesCostos.setVisible(true);
			}
			
			if(this.jPanelPaginacionDisponiblesCostos!=null) {
				this.jPanelPaginacionDisponiblesCostos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDisponiblesCostos!=null) {
				this.jPanelParametrosReportesDisponiblesCostos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDisponiblesCostos!=null) {
					this.jTabbedPaneBusquedasDisponiblesCostos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDisponiblesCostos!=null) {
				this.jPanelParametrosReportesDisponiblesCostos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.disponiblescostosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDisponiblesCostos!=null) {
				this.jTabbedPaneBusquedasDisponiblesCostos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDisponiblesCostos!=null) {
				this.jPanelParametrosReportesDisponiblesCostos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadBusquedaDisponiblesCostos=isParaBodega;
			if(!this.isVisibilidadBusquedaDisponiblesCostos) {this.jTabbedPaneBusquedasDisponiblesCostos.remove(jPanelBusquedaDisponiblesCostosDisponiblesCostos);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaDisponiblesCostos=isParaProducto;
			if(!this.isVisibilidadBusquedaDisponiblesCostos) {this.jTabbedPaneBusquedasDisponiblesCostos.remove(jPanelBusquedaDisponiblesCostosDisponiblesCostos);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaDisponiblesCostos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaDisponiblesCostos) {this.jTabbedPaneBusquedasDisponiblesCostos.remove(jPanelBusquedaDisponiblesCostosDisponiblesCostos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaDisponiblesCostos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaDisponiblesCostos) {this.jTabbedPaneBusquedasDisponiblesCostos.remove(jPanelBusquedaDisponiblesCostosDisponiblesCostos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaDisponiblesCostos=isParaLinea;
			if(!this.isVisibilidadBusquedaDisponiblesCostos) {this.jTabbedPaneBusquedasDisponiblesCostos.remove(jPanelBusquedaDisponiblesCostosDisponiblesCostos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaDisponiblesCostos=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaDisponiblesCostos) {this.jTabbedPaneBusquedasDisponiblesCostos.remove(jPanelBusquedaDisponiblesCostosDisponiblesCostos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaDisponiblesCostos=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaDisponiblesCostos) {this.jTabbedPaneBusquedasDisponiblesCostos.remove(jPanelBusquedaDisponiblesCostosDisponiblesCostos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaDisponiblesCostos=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaDisponiblesCostos) {this.jTabbedPaneBusquedasDisponiblesCostos.remove(jPanelBusquedaDisponiblesCostosDisponiblesCostos);}
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
			
			this.inicializarActualizarBindingTablaDisponiblesCostos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDisponiblesCostos() {
		this.updateBorderResaltarBusquedasFormularioDisponiblesCostos();
		this.updateVisibilidadBusquedasFormularioDisponiblesCostos();
		this.updateHabilitarBusquedasFormularioDisponiblesCostos();
	}
	
	public void updateBorderResaltarBusquedasFormularioDisponiblesCostos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDisponiblesCostos.getComponents().length>0) {
	

		if(this.disponiblescostosConstantesFunciones.resaltarBusquedaDisponiblesCostosDisponiblesCostos!=null) {
			index= this.jTabbedPaneBusquedasDisponiblesCostos.indexOfComponent(this.jPanelBusquedaDisponiblesCostosDisponiblesCostos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDisponiblesCostos.getComponent(index);
				jPanel.setBorder(this.disponiblescostosConstantesFunciones.resaltarBusquedaDisponiblesCostosDisponiblesCostos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDisponiblesCostos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDisponiblesCostos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDisponiblesCostos.indexOfComponent(this.jPanelBusquedaDisponiblesCostosDisponiblesCostos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDisponiblesCostos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.disponiblescostosConstantesFunciones.mostrarBusquedaDisponiblesCostosDisponiblesCostos);
			if(!this.disponiblescostosConstantesFunciones.mostrarBusquedaDisponiblesCostosDisponiblesCostos && index>-1) {
				this.jTabbedPaneBusquedasDisponiblesCostos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDisponiblesCostos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDisponiblesCostos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDisponiblesCostos.indexOfComponent(this.jPanelBusquedaDisponiblesCostosDisponiblesCostos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDisponiblesCostos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.disponiblescostosConstantesFunciones.activarBusquedaDisponiblesCostosDisponiblesCostos);
				this.jTabbedPaneBusquedasDisponiblesCostos.setEnabledAt(index,this.disponiblescostosConstantesFunciones.activarBusquedaDisponiblesCostosDisponiblesCostos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDisponiblesCostos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaDisponiblesCostos")) {
			index= this.jTabbedPaneBusquedasDisponiblesCostos.indexOfComponent(this.jPanelBusquedaDisponiblesCostosDisponiblesCostos);

			this.jTabbedPaneBusquedasDisponiblesCostos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDisponiblesCostos.getComponent(index);

			this.disponiblescostosConstantesFunciones.setResaltarBusquedaDisponiblesCostosDisponiblesCostos(resaltar);

			jPanel.setBorder(this.disponiblescostosConstantesFunciones.resaltarBusquedaDisponiblesCostosDisponiblesCostos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDisponiblesCostos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDisponiblesCostos() throws Exception {

		if(this.jInternalFrameDetalleFormDisponiblesCostos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDisponiblesCostos();
		this.updateVisibilidadResaltarControlesFormularioDisponiblesCostos();
		this.updateHabilitarResaltarControlesFormularioDisponiblesCostos();
		
	}
	
	public void updateBorderResaltarControlesFormularioDisponiblesCostos() throws Exception {
		if(this.jInternalFrameDetalleFormDisponiblesCostos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.disponiblescostosConstantesFunciones.resaltaridDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jLabelidDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltaridDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltarid_bodegaDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_bodegaDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltarid_bodegaDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltarid_productoDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_productoDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltarid_productoDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltarid_empresaDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_empresaDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltarid_empresaDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltarid_sucursalDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_sucursalDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltarid_sucursalDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltarid_lineaDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_lineaDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltarid_lineaDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltarid_linea_grupoDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_grupoDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltarid_linea_grupoDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltarid_linea_categoriaDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_categoriaDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltarid_linea_categoriaDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltarid_linea_marcaDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_marcaDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltarid_linea_marcaDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltarfecha_emision_hastaDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jDateChooserfecha_emision_hastaDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltarfecha_emision_hastaDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltarnombre_sucursalDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_sucursalDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltarnombre_sucursalDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltarnombre_lineaDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_lineaDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltarnombre_lineaDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltarnombre_linea_grupoDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_grupoDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltarnombre_linea_grupoDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltarnombre_linea_categoriaDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_categoriaDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltarnombre_linea_categoriaDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltarnombre_linea_marcaDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_marcaDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltarnombre_linea_marcaDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltarcodigoDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldcodigoDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltarcodigoDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltarnombreDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombreDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltarnombreDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltarnombre_bodegaDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_bodegaDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltarnombre_bodegaDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltarnombre_unidadDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldnombre_unidadDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltarnombre_unidadDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltaringresosDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldingresosDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltaringresosDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltaregresosDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldegresosDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltaregresosDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltardisponible_corteDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jTextFielddisponible_corteDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltardisponible_corteDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltarcostoDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldcostoDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltarcostoDisponiblesCostos);}
		if(this.disponiblescostosConstantesFunciones.resaltartotalDisponiblesCostos!=null && this.jInternalFrameDetalleFormDisponiblesCostos!=null) {this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldtotalDisponiblesCostos.setBorder(this.disponiblescostosConstantesFunciones.resaltartotalDisponiblesCostos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDisponiblesCostos() throws Exception {		
		if(this.jInternalFrameDetalleFormDisponiblesCostos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
	
		//this.jInternalFrameDetalleFormDisponiblesCostos.jLabelidDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostraridDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelidDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostraridDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_bodegaDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarid_bodegaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelid_bodegaDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarid_bodegaDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_productoDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarid_productoDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelid_productoDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarid_productoDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_empresaDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarid_empresaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelid_empresaDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarid_empresaDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_sucursalDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarid_sucursalDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelid_sucursalDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarid_sucursalDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_lineaDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarid_lineaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelid_lineaDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarid_lineaDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_grupoDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarid_linea_grupoDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelid_linea_grupoDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarid_linea_grupoDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_categoriaDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarid_linea_categoriaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelid_linea_categoriaDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarid_linea_categoriaDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_marcaDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarid_linea_marcaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelid_linea_marcaDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarid_linea_marcaDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jDateChooserfecha_emision_hastaDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarfecha_emision_hastaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelfecha_emision_hastaDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarfecha_emision_hastaDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_sucursalDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarnombre_sucursalDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelnombre_sucursalDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarnombre_sucursalDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_lineaDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarnombre_lineaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelnombre_lineaDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarnombre_lineaDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_grupoDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarnombre_linea_grupoDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelnombre_linea_grupoDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarnombre_linea_grupoDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_categoriaDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarnombre_linea_categoriaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelnombre_linea_categoriaDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarnombre_linea_categoriaDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_marcaDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarnombre_linea_marcaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelnombre_linea_marcaDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarnombre_linea_marcaDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldcodigoDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarcodigoDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelcodigoDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarcodigoDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombreDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarnombreDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelnombreDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarnombreDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_bodegaDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarnombre_bodegaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelnombre_bodegaDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarnombre_bodegaDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldnombre_unidadDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarnombre_unidadDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelnombre_unidadDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarnombre_unidadDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldingresosDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostraringresosDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelingresosDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostraringresosDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldegresosDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostraregresosDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelegresosDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostraregresosDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jTextFielddisponible_corteDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrardisponible_corteDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPaneldisponible_corteDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrardisponible_corteDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldcostoDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarcostoDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPanelcostoDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrarcostoDisponiblesCostos);
		//this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldtotalDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrartotalDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jPaneltotalDisponiblesCostos.setVisible(this.disponiblescostosConstantesFunciones.mostrartotalDisponiblesCostos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDisponiblesCostos() throws Exception {
		if(this.jInternalFrameDetalleFormDisponiblesCostos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDisponiblesCostos!=null) {
	
		this.jInternalFrameDetalleFormDisponiblesCostos.jLabelidDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activaridDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_bodegaDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activarid_bodegaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_productoDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activarid_productoDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_empresaDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activarid_empresaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_sucursalDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activarid_sucursalDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_lineaDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activarid_lineaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_grupoDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activarid_linea_grupoDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_categoriaDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activarid_linea_categoriaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jComboBoxid_linea_marcaDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activarid_linea_marcaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jDateChooserfecha_emision_hastaDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activarfecha_emision_hastaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_sucursalDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activarnombre_sucursalDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_lineaDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activarnombre_lineaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_grupoDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activarnombre_linea_grupoDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_categoriaDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activarnombre_linea_categoriaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_linea_marcaDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activarnombre_linea_marcaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldcodigoDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activarcodigoDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombreDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activarnombreDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextAreanombre_bodegaDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activarnombre_bodegaDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldnombre_unidadDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activarnombre_unidadDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldingresosDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activaringresosDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldegresosDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activaregresosDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextFielddisponible_corteDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activardisponible_corteDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldcostoDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activarcostoDisponiblesCostos);
		this.jInternalFrameDetalleFormDisponiblesCostos.jTextFieldtotalDisponiblesCostos.setEnabled(this.disponiblescostosConstantesFunciones.activartotalDisponiblesCostos);
		}
	}
	
		
}