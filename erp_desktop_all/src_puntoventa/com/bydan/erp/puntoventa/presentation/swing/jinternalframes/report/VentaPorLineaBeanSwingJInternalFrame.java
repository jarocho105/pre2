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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.puntoventa.util.VentaPorLineaConstantesFunciones;
import com.bydan.erp.puntoventa.util.report.VentaPorLineaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.report.VentaPorLineaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.report.VentaPorLineaBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.puntoventa.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.puntoventa.util.*;

import com.bydan.erp.puntoventa.util.report.*;
import com.bydan.erp.puntoventa.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.report.*;
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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;

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
public class VentaPorLineaBeanSwingJInternalFrame extends VentaPorLineaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(VentaPorLineaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<VentaPorLinea> ventaporlineaValidator = new ClassValidator<VentaPorLinea>(VentaPorLinea.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public VentaPorLinea ventaporlinea;	
	public VentaPorLinea ventaporlineaAux;
	public VentaPorLinea ventaporlineaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public VentaPorLinea ventaporlineaTotales;
	public Long idVentaPorLineaActual;
	public Long iIdNuevoVentaPorLinea=0L;
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
	
	public Boolean isPermisoTodoVentaPorLinea;
	public Boolean isPermisoNuevoVentaPorLinea;
	public Boolean isPermisoActualizarVentaPorLinea;
	public Boolean isPermisoActualizarOriginalVentaPorLinea;
	public Boolean isPermisoEliminarVentaPorLinea;
	public Boolean isPermisoGuardarCambiosVentaPorLinea;
	public Boolean isPermisoConsultaVentaPorLinea;
	public Boolean isPermisoBusquedaVentaPorLinea;
	public Boolean isPermisoReporteVentaPorLinea;
	public Boolean isPermisoPaginacionMedioVentaPorLinea;
	public Boolean isPermisoPaginacionAltoVentaPorLinea;
	public Boolean isPermisoPaginacionTodoVentaPorLinea;
	public Boolean isPermisoCopiarVentaPorLinea;
	public Boolean isPermisoVerFormVentaPorLinea;
	public Boolean isPermisoDuplicarVentaPorLinea;
	public Boolean isPermisoOrdenVentaPorLinea;
	
	
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
	
	public VentaPorLineaParameterReturnGeneral ventaporlineaReturnGeneral;
	public VentaPorLineaParameterReturnGeneral ventaporlineaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoVentaPorLinea=false;
	public Boolean esParaAccionDesdeFormularioVentaPorLinea=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected VentaPorLineaSessionBeanAdditional ventaporlineaSessionBeanAdditional=null;
	
	public VentaPorLineaSessionBeanAdditional getVentaPorLineaSessionBeanAdditional() {
		return this.ventaporlineaSessionBeanAdditional;
	}
	
	public void setVentaPorLineaSessionBeanAdditional(VentaPorLineaSessionBeanAdditional ventaporlineaSessionBeanAdditional) {
		try {
			this.ventaporlineaSessionBeanAdditional=ventaporlineaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected VentaPorLineaBeanSwingJInternalFrameAdditional ventaporlineaBeanSwingJInternalFrameAdditional=null;
	//public class VentaPorLineaBeanSwingJInternalFrame
	
	public VentaPorLineaBeanSwingJInternalFrameAdditional getVentaPorLineaBeanSwingJInternalFrameAdditional() {
		return this.ventaporlineaBeanSwingJInternalFrameAdditional;
	}
	
	public void setVentaPorLineaBeanSwingJInternalFrameAdditional(VentaPorLineaBeanSwingJInternalFrameAdditional ventaporlineaBeanSwingJInternalFrameAdditional) {
		try {
			this.ventaporlineaBeanSwingJInternalFrameAdditional=ventaporlineaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public VentaPorLineaLogic ventaporlineaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public VentaPorLinea ventaporlineaBean;
	public VentaPorLineaConstantesFunciones ventaporlineaConstantesFunciones;
	//public VentaPorLineaParameterReturnGeneral ventaporlineaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ProductoLogic productoLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	
	//PARAMETROS
	
	
	//public List<VentaPorLinea> ventaporlineas;	
	//public List<VentaPorLinea> ventaporlineasEliminados;
	//public List<VentaPorLinea> ventaporlineasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoVentaPorLinea=false;
	public Boolean isVisibilidadCeldaDuplicarVentaPorLinea=true;
	public Boolean isVisibilidadCeldaCopiarVentaPorLinea=true;
	public Boolean isVisibilidadCeldaVerFormVentaPorLinea=true;
	public Boolean isVisibilidadCeldaOrdenVentaPorLinea=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesVentaPorLinea=false;
	public Boolean isVisibilidadCeldaModificarVentaPorLinea=false;
	public Boolean isVisibilidadCeldaActualizarVentaPorLinea=false;
	public Boolean isVisibilidadCeldaEliminarVentaPorLinea=false;
	public Boolean isVisibilidadCeldaCancelarVentaPorLinea=false;
	public Boolean isVisibilidadCeldaGuardarVentaPorLinea=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosVentaPorLinea=false;	
	
	
	public Boolean isVisibilidadBusquedaVentaPorLinea=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoVentaPorLinea() {
		return this.iIdNuevoVentaPorLinea;
	}

	public void setiIdNuevoVentaPorLinea(Long iIdNuevoVentaPorLinea) {
		this.iIdNuevoVentaPorLinea = iIdNuevoVentaPorLinea;
	}
	
	public Long getidVentaPorLineaActual() {
		return this.idVentaPorLineaActual;
	}

	public void setidVentaPorLineaActual(Long idVentaPorLineaActual) {
		this.idVentaPorLineaActual = idVentaPorLineaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public VentaPorLinea getventaporlinea() {
		return this.ventaporlinea;
	}

	public void setventaporlinea(VentaPorLinea ventaporlinea) {
		this.ventaporlinea = ventaporlinea;
	}
	
	public VentaPorLinea getventaporlineaAux() {
		return this.ventaporlineaAux;
	}

	public void setventaporlineaAux(VentaPorLinea ventaporlineaAux) {
		this.ventaporlineaAux = ventaporlineaAux;
	}				
	
	public VentaPorLinea getventaporlineaAnterior() {
		return this.ventaporlineaAnterior;
	}

	public void setventaporlineaAnterior(VentaPorLinea ventaporlineaAnterior) {
		this.ventaporlineaAnterior = ventaporlineaAnterior;
	}	
	
	public VentaPorLinea getventaporlineaTotales() {
		return this.ventaporlineaTotales;
	}

	public void setventaporlineaTotales(VentaPorLinea ventaporlineaTotales) {
		this.ventaporlineaTotales = ventaporlineaTotales;
	}	
	
	public VentaPorLinea getventaporlineaBean() {
		return this.ventaporlineaBean;
	}

	public void setventaporlineaBean(VentaPorLinea ventaporlineaBean) {
		this.ventaporlineaBean = ventaporlineaBean;
	}	
	
	public VentaPorLineaParameterReturnGeneral getventaporlineaReturnGeneral() {
		return this.ventaporlineaReturnGeneral;
	}

	public void setventaporlineaReturnGeneral(VentaPorLineaParameterReturnGeneral ventaporlineaReturnGeneral) {
		this.ventaporlineaReturnGeneral = ventaporlineaReturnGeneral;
	}	
	
	
	public Date fecha_desdeBusquedaVentaPorLinea=new Date();

	public Date getfecha_desdeBusquedaVentaPorLinea() {
		return this.fecha_desdeBusquedaVentaPorLinea;
	}

	public void setfecha_desdeBusquedaVentaPorLinea(Date fecha_desdeBusquedaVentaPorLinea) {
		this.fecha_desdeBusquedaVentaPorLinea = fecha_desdeBusquedaVentaPorLinea;
	}

;
	public Date fecha_hastaBusquedaVentaPorLinea=new Date();

	public Date getfecha_hastaBusquedaVentaPorLinea() {
		return this.fecha_hastaBusquedaVentaPorLinea;
	}

	public void setfecha_hastaBusquedaVentaPorLinea(Date fecha_hastaBusquedaVentaPorLinea) {
		this.fecha_hastaBusquedaVentaPorLinea = fecha_hastaBusquedaVentaPorLinea;
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
	
	
	public VentaPorLineaLogic getVentaPorLineaLogic()	{		
		return ventaporlineaLogic;
	}

	public void setVentaPorLineaLogic(VentaPorLineaLogic ventaporlineaLogic) {
		this.ventaporlineaLogic = ventaporlineaLogic;
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
	
	public Boolean getIsEsNuevoVentaPorLinea() {
		return isEsNuevoVentaPorLinea;
	}

	public void setIsEsNuevoVentaPorLinea(Boolean isEsNuevoVentaPorLinea) {
		this.isEsNuevoVentaPorLinea = isEsNuevoVentaPorLinea;
	}

	public Boolean getEsParaAccionDesdeFormularioVentaPorLinea() {
		return esParaAccionDesdeFormularioVentaPorLinea;
	}
	
	public void setEsParaAccionDesdeFormularioVentaPorLinea(Boolean esParaAccionDesdeFormularioVentaPorLinea) {
		this.esParaAccionDesdeFormularioVentaPorLinea = esParaAccionDesdeFormularioVentaPorLinea;
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

			if(this.ventaporlineaSessionBean==null) {
				this.ventaporlineaSessionBean=new VentaPorLineaSessionBean();
			}

			if(!this.ventaporlineaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(ventaporlineaSessionBean.getlidEmpresaActual());
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

			if(this.ventaporlineaSessionBean==null) {
				this.ventaporlineaSessionBean=new VentaPorLineaSessionBean();
			}

			if(!this.ventaporlineaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(ventaporlineaSessionBean.getlidSucursalActual());
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

			if(this.ventaporlineaSessionBean==null) {
				this.ventaporlineaSessionBean=new VentaPorLineaSessionBean();
			}

			if(!this.ventaporlineaSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(ventaporlineaSessionBean.getlidProductoActual());
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

			if(this.ventaporlineaSessionBean==null) {
				this.ventaporlineaSessionBean=new VentaPorLineaSessionBean();
			}

			if(!this.ventaporlineaSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(ventaporlineaSessionBean.getlidLineaActual());
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

			if(this.ventaporlineaSessionBean==null) {
				this.ventaporlineaSessionBean=new VentaPorLineaSessionBean();
			}

			if(!this.ventaporlineaSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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
					lineaLogic.getEntityWithConnection(ventaporlineaSessionBean.getlidLineaGrupoActual());
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

			if(this.ventaporlineaSessionBean==null) {
				this.ventaporlineaSessionBean=new VentaPorLineaSessionBean();
			}

			if(!this.ventaporlineaSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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
					lineaLogic.getEntityWithConnection(ventaporlineaSessionBean.getlidLineaCategoriaActual());
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

			if(this.ventaporlineaSessionBean==null) {
				this.ventaporlineaSessionBean=new VentaPorLineaSessionBean();
			}

			if(!this.ventaporlineaSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
					lineaLogic.getEntityWithConnection(ventaporlineaSessionBean.getlidLineaMarcaActual());
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

					if(this.ventaporlinea!=null) {
						this.ventaporlinea.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
						this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_empresaVentaPorLinea.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaVentaPorLinea.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
						if(this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_empresaVentaPorLinea.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_empresaVentaPorLinea.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaVentaPorLineaGenerico)throws Exception
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
				jComboBoxid_empresaVentaPorLineaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaVentaPorLineaGenerico!=null && jComboBoxid_empresaVentaPorLineaGenerico.getItemCount()>0) {
					jComboBoxid_empresaVentaPorLineaGenerico.setSelectedIndex(0);
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

					if(this.ventaporlinea!=null) {
						this.ventaporlinea.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
						this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_sucursalVentaPorLinea.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalVentaPorLinea.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
						if(this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_sucursalVentaPorLinea.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_sucursalVentaPorLinea.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalVentaPorLineaGenerico)throws Exception
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
				jComboBoxid_sucursalVentaPorLineaGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalVentaPorLineaGenerico!=null && jComboBoxid_sucursalVentaPorLineaGenerico.getItemCount()>0) {
					jComboBoxid_sucursalVentaPorLineaGenerico.setSelectedIndex(0);
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

					if(this.ventaporlinea!=null) {
						this.ventaporlinea.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
						this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_productoVentaPorLinea.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoVentaPorLinea.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
						if(this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_productoVentaPorLinea.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_productoVentaPorLinea.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoVentaPorLineaGenerico)throws Exception
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
				jComboBoxid_productoVentaPorLineaGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoVentaPorLineaGenerico!=null && jComboBoxid_productoVentaPorLineaGenerico.getItemCount()>0) {
					jComboBoxid_productoVentaPorLineaGenerico.setSelectedIndex(0);
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

					if(this.ventaporlinea!=null) {
						this.ventaporlinea.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
						this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_lineaVentaPorLinea.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaVentaPorLinea.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
						if(this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_lineaVentaPorLinea.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_lineaVentaPorLinea.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaVentaPorLineaGenerico)throws Exception
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
				jComboBoxid_lineaVentaPorLineaGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaVentaPorLineaGenerico!=null && jComboBoxid_lineaVentaPorLineaGenerico.getItemCount()>0) {
					jComboBoxid_lineaVentaPorLineaGenerico.setSelectedIndex(0);
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

					if(this.ventaporlinea!=null) {
						this.ventaporlinea.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
						this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_grupoVentaPorLinea.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoVentaPorLinea.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
						if(this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_grupoVentaPorLinea.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_grupoVentaPorLinea.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoVentaPorLineaGenerico)throws Exception
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
				jComboBoxid_linea_grupoVentaPorLineaGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoVentaPorLineaGenerico!=null && jComboBoxid_linea_grupoVentaPorLineaGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoVentaPorLineaGenerico.setSelectedIndex(0);
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

					if(this.ventaporlinea!=null) {
						this.ventaporlinea.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
						this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_categoriaVentaPorLinea.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaVentaPorLinea.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
						if(this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_categoriaVentaPorLinea.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_categoriaVentaPorLinea.setSelectedIndex(0);
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
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaVentaPorLineaGenerico)throws Exception
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
				jComboBoxid_linea_categoriaVentaPorLineaGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaVentaPorLineaGenerico!=null && jComboBoxid_linea_categoriaVentaPorLineaGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaVentaPorLineaGenerico.setSelectedIndex(0);
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

					if(this.ventaporlinea!=null) {
						this.ventaporlinea.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
						this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_marcaVentaPorLinea.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaVentaPorLinea.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
						if(this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_marcaVentaPorLinea.getItemCount()>0) {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_marcaVentaPorLinea.setSelectedIndex(0);
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
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaVentaPorLineaGenerico)throws Exception
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
				jComboBoxid_linea_marcaVentaPorLineaGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaVentaPorLineaGenerico!=null && jComboBoxid_linea_marcaVentaPorLineaGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaVentaPorLineaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(VentaPorLinea ventaporlinea,JComboBox jComboBoxid_empresaVentaPorLineaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaVentaPorLineaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_empresaVentaPorLinea.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaVentaPorLineaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				ventaporlinea.setid_empresa(empresaAux.getId());
				ventaporlinea.setempresa_descripcion(VentaPorLineaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				ventaporlinea.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(VentaPorLinea ventaporlinea,JComboBox jComboBoxid_sucursalVentaPorLineaGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalVentaPorLineaGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_sucursalVentaPorLinea.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalVentaPorLineaGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				ventaporlinea.setid_sucursal(sucursalAux.getId());
				ventaporlinea.setsucursal_descripcion(VentaPorLineaConstantesFunciones.getSucursalDescripcion(sucursalAux));
				ventaporlinea.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(VentaPorLinea ventaporlinea,JComboBox jComboBoxid_productoVentaPorLineaGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoVentaPorLineaGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_productoVentaPorLinea.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoVentaPorLineaGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				ventaporlinea.setid_producto(productoAux.getId());
				ventaporlinea.setproducto_descripcion(VentaPorLineaConstantesFunciones.getProductoDescripcion(productoAux));
				ventaporlinea.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(VentaPorLinea ventaporlinea,JComboBox jComboBoxid_lineaVentaPorLineaGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaVentaPorLineaGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_lineaVentaPorLinea.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaVentaPorLineaGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				ventaporlinea.setid_linea(lineaAux.getId());
				ventaporlinea.setlinea_descripcion(VentaPorLineaConstantesFunciones.getLineaDescripcion(lineaAux));
				ventaporlinea.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(VentaPorLinea ventaporlinea,JComboBox jComboBoxid_linea_grupoVentaPorLineaGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoVentaPorLineaGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_grupoVentaPorLinea.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoVentaPorLineaGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				ventaporlinea.setid_linea_grupo(lineaAux.getId());
				ventaporlinea.setlineagrupo_descripcion(VentaPorLineaConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				ventaporlinea.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(VentaPorLinea ventaporlinea,JComboBox jComboBoxid_linea_categoriaVentaPorLineaGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaVentaPorLineaGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_categoriaVentaPorLinea.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaVentaPorLineaGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				ventaporlinea.setid_linea_categoria(lineaAux.getId());
				ventaporlinea.setlineacategoria_descripcion(VentaPorLineaConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				ventaporlinea.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(VentaPorLinea ventaporlinea,JComboBox jComboBoxid_linea_marcaVentaPorLineaGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaVentaPorLineaGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_marcaVentaPorLinea.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaVentaPorLineaGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				ventaporlinea.setid_linea_marca(lineaAux.getId());
				ventaporlinea.setlineamarca_descripcion(VentaPorLineaConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				ventaporlinea.setLineaMarca(lineaAux);			}
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

					if(!VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { 
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_empresaVentaPorLinea.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_empresaVentaPorLinea.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { 
					}

					if(!VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { 
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_sucursalVentaPorLinea.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_sucursalVentaPorLinea.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { 
					}

					if(!VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { 
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_productoVentaPorLinea.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_productoVentaPorLinea.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { 
					}

					if(!VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { 
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_lineaVentaPorLinea.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_lineaVentaPorLinea.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { 
					}

					if(!VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { 
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_grupoVentaPorLinea.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_grupoVentaPorLinea.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { 
					}

					if(!VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { 
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_categoriaVentaPorLinea.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_categoriaVentaPorLinea.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { 
					}

					if(!VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { 
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_marcaVentaPorLinea.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_marcaVentaPorLinea.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { 
					}

					if(!VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_empresaVentaPorLinea.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_empresaVentaPorLinea.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_sucursalVentaPorLinea.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_sucursalVentaPorLinea.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameProductoForeignKey(Producto producto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_productoVentaPorLinea.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_productoVentaPorLinea.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_lineaVentaPorLinea.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_lineaVentaPorLinea.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameLineaGrupoForeignKey(Linea lineagrupo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_grupoVentaPorLinea.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_grupoVentaPorLinea.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameLineaCategoriaForeignKey(Linea lineacategoria,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_categoriaVentaPorLinea.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_categoriaVentaPorLinea.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameLineaMarcaForeignKey(Linea lineamarca,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_marcaVentaPorLinea.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_marcaVentaPorLinea.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesVentaPorLinea() throws Exception {
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
		
	public VentaPorLineaParameterReturnGeneral getVentaPorLineaParameterGeneral() {
		return this.ventaporlineaParameterGeneral;
	}
	
	public void setVentaPorLineaParameterGeneral(VentaPorLineaParameterReturnGeneral ventaporlineaParameterGeneral) {
		this.ventaporlineaParameterGeneral = ventaporlineaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoVentaPorLinea() {
		return isPermisoTodoVentaPorLinea;
	}

	public void setIsPermisoTodoVentaPorLinea(Boolean isPermisoTodoVentaPorLinea) {
		this.isPermisoTodoVentaPorLinea = isPermisoTodoVentaPorLinea;
	}

	public Boolean getIsPermisoNuevoVentaPorLinea() {
		return isPermisoNuevoVentaPorLinea;
	}

	public void setIsPermisoNuevoVentaPorLinea(Boolean isPermisoNuevoVentaPorLinea) {
		this.isPermisoNuevoVentaPorLinea = isPermisoNuevoVentaPorLinea;
	}

	public Boolean getIsPermisoActualizarVentaPorLinea() {
		return isPermisoActualizarVentaPorLinea;
	}

	public void setIsPermisoActualizarVentaPorLinea(Boolean isPermisoActualizarVentaPorLinea) {
		this.isPermisoActualizarVentaPorLinea = isPermisoActualizarVentaPorLinea;
	}

	public Boolean getIsPermisoEliminarVentaPorLinea() {
		return isPermisoEliminarVentaPorLinea;
	}

	public void setIsPermisoEliminarVentaPorLinea(Boolean isPermisoEliminarVentaPorLinea) {
		this.isPermisoEliminarVentaPorLinea = isPermisoEliminarVentaPorLinea;
	}

	public Boolean getIsPermisoGuardarCambiosVentaPorLinea() {
		return isPermisoGuardarCambiosVentaPorLinea;
	}

	public void setIsPermisoGuardarCambiosVentaPorLinea(Boolean isPermisoGuardarCambiosVentaPorLinea) {
		this.isPermisoGuardarCambiosVentaPorLinea = isPermisoGuardarCambiosVentaPorLinea;
	}
	
	public Boolean getIsPermisoConsultaVentaPorLinea() {
		return isPermisoConsultaVentaPorLinea;
	}

	public void setIsPermisoConsultaVentaPorLinea(Boolean isPermisoConsultaVentaPorLinea) {
		this.isPermisoConsultaVentaPorLinea = isPermisoConsultaVentaPorLinea;
	}

	public Boolean getIsPermisoBusquedaVentaPorLinea() {
		return isPermisoBusquedaVentaPorLinea;
	}

	public void setIsPermisoBusquedaVentaPorLinea(Boolean isPermisoBusquedaVentaPorLinea) {
		this.isPermisoBusquedaVentaPorLinea = isPermisoBusquedaVentaPorLinea;
	}

	public Boolean getIsPermisoReporteVentaPorLinea() {
		return isPermisoReporteVentaPorLinea;
	}

	public void setIsPermisoReporteVentaPorLinea(Boolean isPermisoReporteVentaPorLinea) {
		this.isPermisoReporteVentaPorLinea = isPermisoReporteVentaPorLinea;
	}
	
	public Boolean getIsPermisoPaginacionMedioVentaPorLinea() {
		return isPermisoPaginacionMedioVentaPorLinea;
	}

	public void setIsPermisoPaginacionMedioVentaPorLinea(Boolean isPermisoPaginacionMedioVentaPorLinea) {
		this.isPermisoPaginacionMedioVentaPorLinea = isPermisoPaginacionMedioVentaPorLinea;
	}
	
	public Boolean getIsPermisoPaginacionTodoVentaPorLinea() {
		return isPermisoPaginacionTodoVentaPorLinea;
	}

	public void setIsPermisoPaginacionTodoVentaPorLinea(Boolean isPermisoPaginacionTodoVentaPorLinea) {
		this.isPermisoPaginacionTodoVentaPorLinea = isPermisoPaginacionTodoVentaPorLinea;
	}
	
	public Boolean getIsPermisoPaginacionAltoVentaPorLinea() {
		return isPermisoPaginacionAltoVentaPorLinea;
	}

	public void setIsPermisoPaginacionAltoVentaPorLinea(Boolean isPermisoPaginacionAltoVentaPorLinea) {
		this.isPermisoPaginacionAltoVentaPorLinea = isPermisoPaginacionAltoVentaPorLinea;
	}
	
	public Boolean getIsPermisoCopiarVentaPorLinea() {
		return isPermisoCopiarVentaPorLinea;
	}

	public void setIsPermisoCopiarVentaPorLinea(Boolean isPermisoCopiarVentaPorLinea) {
		this.isPermisoCopiarVentaPorLinea = isPermisoCopiarVentaPorLinea;
	}
	
	public Boolean getIsPermisoVerFormVentaPorLinea() {
		return isPermisoVerFormVentaPorLinea;
	}

	public void setIsPermisoVerFormVentaPorLinea(Boolean isPermisoVerFormVentaPorLinea) {
		this.isPermisoVerFormVentaPorLinea = isPermisoVerFormVentaPorLinea;
	}
	
	public Boolean getIsPermisoDuplicarVentaPorLinea() {
		return isPermisoDuplicarVentaPorLinea;
	}

	public void setIsPermisoDuplicarVentaPorLinea(Boolean isPermisoDuplicarVentaPorLinea) {
		this.isPermisoDuplicarVentaPorLinea = isPermisoDuplicarVentaPorLinea;
	}
	
	public Boolean getIsPermisoOrdenVentaPorLinea() {
		return isPermisoOrdenVentaPorLinea;
	}

	public void setIsPermisoOrdenVentaPorLinea(Boolean isPermisoOrdenVentaPorLinea) {
		this.isPermisoOrdenVentaPorLinea = isPermisoOrdenVentaPorLinea;
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
	
	public Boolean getIsVisibilidadCeldaNuevoVentaPorLinea() {
		return isVisibilidadCeldaNuevoVentaPorLinea;
	}

	public void setIsVisibilidadCeldaNuevoVentaPorLinea(Boolean isVisibilidadCeldaNuevoVentaPorLinea) {
		this.isVisibilidadCeldaNuevoVentaPorLinea = isVisibilidadCeldaNuevoVentaPorLinea;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarVentaPorLinea() {
		return isVisibilidadCeldaDuplicarVentaPorLinea;
	}

	public void setIsVisibilidadCeldaDuplicarVentaPorLinea(Boolean isVisibilidadCeldaDuplicarVentaPorLinea) {
		this.isVisibilidadCeldaDuplicarVentaPorLinea = isVisibilidadCeldaDuplicarVentaPorLinea;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarVentaPorLinea() {
		return isVisibilidadCeldaCopiarVentaPorLinea;
	}

	public void setIsVisibilidadCeldaCopiarVentaPorLinea(Boolean isVisibilidadCeldaCopiarVentaPorLinea) {
		this.isVisibilidadCeldaCopiarVentaPorLinea = isVisibilidadCeldaCopiarVentaPorLinea;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormVentaPorLinea() {
		return isVisibilidadCeldaVerFormVentaPorLinea;
	}

	public void setIsVisibilidadCeldaVerFormVentaPorLinea(Boolean isVisibilidadCeldaVerFormVentaPorLinea) {
		this.isVisibilidadCeldaVerFormVentaPorLinea = isVisibilidadCeldaVerFormVentaPorLinea;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenVentaPorLinea() {
		return isVisibilidadCeldaOrdenVentaPorLinea;
	}

	public void setIsVisibilidadCeldaOrdenVentaPorLinea(Boolean isVisibilidadCeldaOrdenVentaPorLinea) {
		this.isVisibilidadCeldaOrdenVentaPorLinea = isVisibilidadCeldaOrdenVentaPorLinea;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesVentaPorLinea() {
		return isVisibilidadCeldaNuevoRelacionesVentaPorLinea;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesVentaPorLinea(Boolean isVisibilidadCeldaNuevoRelacionesVentaPorLinea) {
		this.isVisibilidadCeldaNuevoRelacionesVentaPorLinea = isVisibilidadCeldaNuevoRelacionesVentaPorLinea;
	}
	
	public Boolean getIsVisibilidadCeldaModificarVentaPorLinea() {
		return isVisibilidadCeldaModificarVentaPorLinea;
	}

	public void setIsVisibilidadCeldaModificarVentaPorLinea(Boolean isVisibilidadCeldaModificarVentaPorLinea) {
		this.isVisibilidadCeldaModificarVentaPorLinea = isVisibilidadCeldaModificarVentaPorLinea;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarVentaPorLinea() {
		return isVisibilidadCeldaActualizarVentaPorLinea;
	}

	public void setIsVisibilidadCeldaActualizarVentaPorLinea(Boolean isVisibilidadCeldaActualizarVentaPorLinea) {
		this.isVisibilidadCeldaActualizarVentaPorLinea = isVisibilidadCeldaActualizarVentaPorLinea;
	}

	public Boolean getIsVisibilidadCeldaEliminarVentaPorLinea() {
		return isVisibilidadCeldaEliminarVentaPorLinea;
	}

	public void setIsVisibilidadCeldaEliminarVentaPorLinea(Boolean isVisibilidadCeldaEliminarVentaPorLinea) {
		this.isVisibilidadCeldaEliminarVentaPorLinea = isVisibilidadCeldaEliminarVentaPorLinea;
	}

	public Boolean getIsVisibilidadCeldaCancelarVentaPorLinea() {
		return isVisibilidadCeldaCancelarVentaPorLinea;
	}

	public void setIsVisibilidadCeldaCancelarVentaPorLinea(Boolean isVisibilidadCeldaCancelarVentaPorLinea) {
		this.isVisibilidadCeldaCancelarVentaPorLinea = isVisibilidadCeldaCancelarVentaPorLinea;
	}

	public Boolean getIsVisibilidadCeldaGuardarVentaPorLinea() {
		return isVisibilidadCeldaGuardarVentaPorLinea;
	}

	public void setIsVisibilidadCeldaGuardarVentaPorLinea(Boolean isVisibilidadCeldaGuardarVentaPorLinea) {
		this.isVisibilidadCeldaGuardarVentaPorLinea = isVisibilidadCeldaGuardarVentaPorLinea;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosVentaPorLinea() {
		return isVisibilidadCeldaGuardarCambiosVentaPorLinea;
	}

	public void setIsVisibilidadCeldaGuardarCambiosVentaPorLinea(Boolean isVisibilidadCeldaGuardarCambiosVentaPorLinea) {
		this.isVisibilidadCeldaGuardarCambiosVentaPorLinea = isVisibilidadCeldaGuardarCambiosVentaPorLinea;
	}
		
	public VentaPorLineaSessionBean getventaporlineaSessionBean() {
		return this.ventaporlineaSessionBean;
	}
	
	public void setventaporlineaSessionBean(VentaPorLineaSessionBean ventaporlineaSessionBean) {
		this.ventaporlineaSessionBean=ventaporlineaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaVentaPorLinea() {
		return this.isVisibilidadBusquedaVentaPorLinea;
	}

	public void setisVisibilidadBusquedaVentaPorLinea(Boolean isVisibilidadBusquedaVentaPorLinea) {
		this.isVisibilidadBusquedaVentaPorLinea=isVisibilidadBusquedaVentaPorLinea;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(VentaPorLinea ventaporlinea)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(ventaporlinea,null);
				this.setActualParaGuardarSucursalForeignKey(ventaporlinea,null);
				this.setActualParaGuardarProductoForeignKey(ventaporlinea,null);
				this.setActualParaGuardarLineaForeignKey(ventaporlinea,null);
				this.setActualParaGuardarLineaGrupoForeignKey(ventaporlinea,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(ventaporlinea,null);
				this.setActualParaGuardarLineaMarcaForeignKey(ventaporlinea,null);
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
	
	public void bugActualizarReferenciaActual(VentaPorLinea ventaporlinea,VentaPorLinea ventaporlineaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalVentaPorLinea(ventaporlinea);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		ventaporlineaAux.setId(ventaporlinea.getId());
		ventaporlineaAux.setVersionRow(ventaporlinea.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(VentaPorLinea ventaporlineaLocal) throws Exception {
		
		if(this.ventaporlineaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(VentaPorLinea ventaporlineaLocal) throws Exception {	
		if(this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				ventaporlineaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				ventaporlineaLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				ventaporlineaLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				ventaporlineaLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				ventaporlineaLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				ventaporlineaLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				ventaporlineaLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarVentaPorLineaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = ventaporlineaValidator.getInvalidValues(this.ventaporlinea);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(VentaPorLinea ventaporlinea,List<VentaPorLinea> ventaporlineas) throws Exception {
	}		
	
	public void actualizarSelectedLista(VentaPorLinea ventaporlinea,List<VentaPorLinea> ventaporlineas) throws Exception {
		try	{			
			VentaPorLineaConstantesFunciones.actualizarSelectedLista(ventaporlinea,ventaporlineas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<VentaPorLinea> ventaporlineasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ventaporlineasLocal=this.ventaporlineaLogic.getVentaPorLineas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ventaporlineasLocal=this.ventaporlineas;
			}
			//ARCHITECTURE
		
			for(VentaPorLinea ventaporlineaLocal:ventaporlineasLocal) {
				if(this.permiteMantenimiento(ventaporlineaLocal) && ventaporlineaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+VentaPorLineaConstantesFunciones.getVentaPorLineaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(VentaPorLineaConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelid_productoVentaPorLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaPorLineaConstantesFunciones.IDLINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelid_lineaVentaPorLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaPorLineaConstantesFunciones.IDLINEAGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelid_linea_grupoVentaPorLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaPorLineaConstantesFunciones.IDLINEACATEGORIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelid_linea_categoriaVentaPorLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaPorLineaConstantesFunciones.IDLINEAMARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelid_linea_marcaVentaPorLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaPorLineaConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelnombre_productoVentaPorLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaPorLineaConstantesFunciones.NOMBRELINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelnombre_lineaVentaPorLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaPorLineaConstantesFunciones.NOMBREGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelnombre_grupoVentaPorLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaPorLineaConstantesFunciones.NOMBRECATEGORIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelnombre_categoriaVentaPorLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaPorLineaConstantesFunciones.NOMBREMARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelnombre_marcaVentaPorLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaPorLineaConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelfechaVentaPorLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaPorLineaConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelsecuencialVentaPorLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaPorLineaConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelcantidadVentaPorLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaPorLineaConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelprecioVentaPorLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaPorLineaConstantesFunciones.DESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabeldescuentoVentaPorLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaPorLineaConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelivaVentaPorLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VentaPorLineaConstantesFunciones.ICE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabeliceVentaPorLinea,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaPorLinea.jLabelid_productoVentaPorLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaPorLinea.jLabelid_lineaVentaPorLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaPorLinea.jLabelid_linea_grupoVentaPorLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaPorLinea.jLabelid_linea_categoriaVentaPorLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaPorLinea.jLabelid_linea_marcaVentaPorLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaPorLinea.jLabelnombre_productoVentaPorLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaPorLinea.jLabelnombre_lineaVentaPorLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaPorLinea.jLabelnombre_grupoVentaPorLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaPorLinea.jLabelnombre_categoriaVentaPorLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaPorLinea.jLabelnombre_marcaVentaPorLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaPorLinea.jLabelfechaVentaPorLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaPorLinea.jLabelsecuencialVentaPorLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaPorLinea.jLabelcantidadVentaPorLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaPorLinea.jLabelprecioVentaPorLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaPorLinea.jLabeldescuentoVentaPorLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaPorLinea.jLabelivaVentaPorLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVentaPorLinea.jLabeliceVentaPorLinea,"");
		
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
		this.iIdNuevoVentaPorLinea--;	
		
		
		this.ventaporlineaAux=new VentaPorLinea();
		
		this.ventaporlineaAux.setId(this.iIdNuevoVentaPorLinea);
		this.ventaporlineaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ventaporlineaLogic.getVentaPorLineas().add(this.ventaporlineaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.ventaporlineas.add(this.ventaporlineaAux);
		}
		//ARCHITECTURE
		
		this.ventaporlinea=this.ventaporlineaAux;
		
		if(VentaPorLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioVentaPorLinea(this.ventaporlinea);
			this.setVariablesObjetoActualToFormularioForeignKeyVentaPorLinea(this.ventaporlinea);
		}
				
		//this.setDefaultControlesVentaPorLinea();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyVentaPorLinea();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyVentaPorLinea();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyVentaPorLinea();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVentaPorLinea(this.ventaporlineaBean,this.ventaporlinea,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanVentaPorLinea(this.ventaporlineaReturnGeneral,this.ventaporlineaBean,false);
		
		if(this.ventaporlineaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyVentaPorLinea(this.ventaporlineaReturnGeneral.getVentaPorLinea());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioVentaPorLinea(this.ventaporlineaReturnGeneral.getVentaPorLinea());
		}
		
		if(this.ventaporlineaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioVentaPorLinea(this.ventaporlineaReturnGeneral.getVentaPorLinea(),classes);//this.ventaporlineaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyVentaPorLinea();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyVentaPorLinea();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VentaPorLineaBeanSwingJInternalFrameAdditional.RecargarFormVentaPorLinea(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingVentaPorLinea(false);
						
			if(ventaporlineaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentaPorLinea();
			}
			
			this.actualizarVisualTableDatosVentaPorLinea();
			
			this.jTableDatosVentaPorLinea.setRowSelectionInterval(this.getIndiceNuevoVentaPorLinea(), this.getIndiceNuevoVentaPorLinea());
			
			this.seleccionarFilaTablaVentaPorLineaActual();
						
			this.actualizarEstadoCeldasBotonesVentaPorLinea("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesVentaPorLinea(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormVentaPorLinea.jDateChooserfecha_desdeVentaPorLinea.setEnabled(isHabilitar && this.ventaporlineaConstantesFunciones.activarfecha_desdeVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jDateChooserfecha_hastaVentaPorLinea.setEnabled(isHabilitar && this.ventaporlineaConstantesFunciones.activarfecha_hastaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_productoVentaPorLinea.setEnabled(isHabilitar && this.ventaporlineaConstantesFunciones.activarnombre_productoVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_lineaVentaPorLinea.setEnabled(isHabilitar && this.ventaporlineaConstantesFunciones.activarnombre_lineaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_grupoVentaPorLinea.setEnabled(isHabilitar && this.ventaporlineaConstantesFunciones.activarnombre_grupoVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_categoriaVentaPorLinea.setEnabled(isHabilitar && this.ventaporlineaConstantesFunciones.activarnombre_categoriaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_marcaVentaPorLinea.setEnabled(isHabilitar && this.ventaporlineaConstantesFunciones.activarnombre_marcaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jDateChooserfechaVentaPorLinea.setEnabled(isHabilitar && this.ventaporlineaConstantesFunciones.activarfechaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldsecuencialVentaPorLinea.setEnabled(isHabilitar && this.ventaporlineaConstantesFunciones.activarsecuencialVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldcantidadVentaPorLinea.setEnabled(isHabilitar && this.ventaporlineaConstantesFunciones.activarcantidadVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldprecioVentaPorLinea.setEnabled(isHabilitar && this.ventaporlineaConstantesFunciones.activarprecioVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextFielddescuentoVentaPorLinea.setEnabled(isHabilitar && this.ventaporlineaConstantesFunciones.activardescuentoVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldivaVentaPorLinea.setEnabled(isHabilitar && this.ventaporlineaConstantesFunciones.activarivaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldiceVentaPorLinea.setEnabled(isHabilitar && this.ventaporlineaConstantesFunciones.activariceVentaPorLinea);	
		//
		this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_empresaVentaPorLinea.setEnabled(isHabilitar && this.ventaporlineaConstantesFunciones.activarid_empresaVentaPorLinea);//
		this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_sucursalVentaPorLinea.setEnabled(isHabilitar && this.ventaporlineaConstantesFunciones.activarid_sucursalVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_productoVentaPorLinea.setEnabled(isHabilitar && this.ventaporlineaConstantesFunciones.activarid_productoVentaPorLinea);//
		this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_lineaVentaPorLinea.setEnabled(isHabilitar && this.ventaporlineaConstantesFunciones.activarid_lineaVentaPorLinea);//
		this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_grupoVentaPorLinea.setEnabled(isHabilitar && this.ventaporlineaConstantesFunciones.activarid_linea_grupoVentaPorLinea);//
		this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_categoriaVentaPorLinea.setEnabled(isHabilitar && this.ventaporlineaConstantesFunciones.activarid_linea_categoriaVentaPorLinea);//
		this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_marcaVentaPorLinea.setEnabled(isHabilitar && this.ventaporlineaConstantesFunciones.activarid_linea_marcaVentaPorLinea);
	};
	
	public void setDefaultControlesVentaPorLinea() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoVentaPorLinea(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.ventaporlineaSessionBean.setConGuardarRelaciones(true);			
			this.ventaporlineaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormVentaPorLinea.jTabbedPaneRelacionesVentaPorLinea.setVisible(true);
			
					
		} else {
			//this.ventaporlineaSessionBean.setConGuardarRelaciones(false);			
			this.ventaporlineaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormVentaPorLinea.jTabbedPaneRelacionesVentaPorLinea.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoVentaPorLinea() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentaPorLinea ventaporlineaAux:this.ventaporlineaLogic.getVentaPorLineas()) {
				if(ventaporlineaAux.getId().equals(this.iIdNuevoVentaPorLinea)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentaPorLinea ventaporlineaAux:this.ventaporlineas) {
				if(ventaporlineaAux.getId().equals(this.iIdNuevoVentaPorLinea)) {
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
	
	public int getIndiceActualVentaPorLinea(VentaPorLinea ventaporlinea,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentaPorLinea ventaporlineaAux:this.ventaporlineaLogic.getVentaPorLineas()) {
				if(ventaporlineaAux.getId().equals(ventaporlinea.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentaPorLinea ventaporlineaAux:this.ventaporlineas) {
				if(ventaporlineaAux.getId().equals(ventaporlinea.getId())) {
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
	
	public void setCamposBaseDesdeOriginalVentaPorLinea(VentaPorLinea ventaporlineaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentaPorLinea ventaporlineaAux:this.ventaporlineaLogic.getVentaPorLineas()) {
				if(ventaporlineaAux.getVentaPorLineaOriginal().getId().equals(ventaporlineaOriginal.getId())) {
					existe=true;
					ventaporlineaOriginal.setId(ventaporlineaAux.getId());
					ventaporlineaOriginal.setVersionRow(ventaporlineaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentaPorLinea ventaporlineaAux:this.ventaporlineas) {
				if(ventaporlineaAux.getVentaPorLineaOriginal().getId().equals(ventaporlineaOriginal.getId())) {
					existe=true;
					ventaporlineaOriginal.setId(ventaporlineaAux.getId());
					ventaporlineaOriginal.setVersionRow(ventaporlineaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosVentaPorLinea(Boolean esParaCancelar) throws Exception {
		ventaporlineasAux=new ArrayList<VentaPorLinea>();
		ventaporlineaAux=new VentaPorLinea();
		
		if(!this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VentaPorLinea ventaporlineaAux:this.ventaporlineaLogic.getVentaPorLineas()) {
					if(ventaporlineaAux.getId()<0) {
						ventaporlineasAux.add(ventaporlineaAux);
					}		
				}
				this.iIdNuevoVentaPorLinea=0L;
				this.ventaporlineaLogic.getVentaPorLineas().removeAll(ventaporlineasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentaPorLinea ventaporlineaAux:this.ventaporlineas) {
					if(ventaporlineaAux.getId()<0) {
						ventaporlineasAux.add(ventaporlineaAux);
					}		
				}
				this.iIdNuevoVentaPorLinea=0L;
				this.ventaporlineas.removeAll(ventaporlineasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoVentaPorLinea 
					&& this.ventaporlineaLogic.getVentaPorLineas().size()>0
					) {
					ventaporlineaAux=this.ventaporlineaLogic.getVentaPorLineas().get(this.ventaporlineaLogic.getVentaPorLineas().size() - 1);
				
					if(ventaporlineaAux.getId()<0) {
						this.ventaporlineaLogic.getVentaPorLineas().remove(ventaporlineaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoVentaPorLinea && this.ventaporlineas.size()>0) {
					ventaporlineaAux=this.ventaporlineas.get(this.ventaporlineas.size() - 1);
				
					if(ventaporlineaAux.getId()<0) {
						this.ventaporlineas.remove(ventaporlineaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoVentaPorLinea(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(ventaporlinea.getId()<0) {
				this.ventaporlineaLogic.getVentaPorLineas().remove(this.ventaporlinea);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(ventaporlinea.getId()<0) {
				this.ventaporlineas.remove(this.ventaporlinea);
			}
		}			
	}
	
	public void setEstadosInicialesVentaPorLinea(List<VentaPorLinea> ventaporlineasAux) throws Exception {
		VentaPorLineaConstantesFunciones.setEstadosInicialesVentaPorLinea(ventaporlineasAux);
	}
	
	public void setEstadosInicialesVentaPorLinea(VentaPorLinea ventaporlineaAux) throws Exception {
		VentaPorLineaConstantesFunciones.setEstadosInicialesVentaPorLinea(ventaporlineaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarVentaPorLineaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesVentaPorLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarVentaPorLineaActual()) {
				if(!this.isEsNuevoVentaPorLinea) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesVentaPorLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoVentaPorLinea=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarVentaPorLineaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Venta Por Linea ?", "MANTENIMIENTO DE Venta Por Linea", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesVentaPorLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(VentaPorLinea ventaporlinea) throws Exception {
		VentaPorLineaConstantesFunciones.seleccionarAsignar(this.ventaporlinea,ventaporlinea);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarVentaPorLinea=this.isPermisoActualizarOriginalVentaPorLinea;
			
			
			this.seleccionarAsignar(ventaporlinea);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesVentaPorLinea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.ventaporlineaSessionBean.setsFuncionBusquedaRapida(this.ventaporlineaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoVentaPorLinea) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosVentaPorLinea(esParaCancelar);				
				this.cancelarNuevoVentaPorLinea(esParaCancelar);								
			}
			
			this.ventaporlinea=new VentaPorLinea();
			
			this.inicializarVentaPorLinea();
			
			this.actualizarEstadoCeldasBotonesVentaPorLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarVentaPorLinea() throws Exception {
		try {
			VentaPorLineaConstantesFunciones.inicializarVentaPorLinea(this.ventaporlinea);
			
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
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.ventaporlineaLogic.getVentaPorLineas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteVentaPorLineas(String sAccionBusqueda,List<VentaPorLinea> ventaporlineasParaReportes) throws Exception {
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
					sPathReporteFinal="VentaPorLinea"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="VentaPorLineaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("VentaPorLineaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="VentaPorLinea"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Venta Por Lineas");		
		parameters.put("busquedapor", VentaPorLineaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceVentaPorLinea=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			VentaPorLineaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			VentaPorLineaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceVentaPorLinea=new JRBeanArrayDataSource(VentaPorLineaJInternalFrame.TraerVentaPorLineaBeans(ventaporlineasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceVentaPorLinea);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+VentaPorLineaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+VentaPorLineaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(VentaPorLineaBean.TraerVentaPorLineaBeans(ventaporlineasParaReportes).toArray()));
							
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
				this.generarExcelReporteVentaPorLineas(sAccionBusqueda,sTipoArchivoReporte,ventaporlineasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalVentaPorLineas(sAccionBusqueda,sTipoArchivoReporte,ventaporlineasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoVentaPorLineaActionPerformed(null);
					//this.generarExcelReporteVentaPorLineas(sAccionBusqueda,sTipoArchivoReporte,ventaporlineasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalVentaPorLineas(sAccionBusqueda,sTipoArchivoReporte,ventaporlineasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesVentaPorLineas(sAccionBusqueda,sTipoArchivoReporte,ventaporlineasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesVentaPorLineas(sAccionBusqueda,sTipoArchivoReporte,ventaporlineasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteVentaPorLineas(String sAccionBusqueda,String sTipoArchivoReporte,List<VentaPorLinea> ventaporlineasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventaporlinea";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentaPorLineas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVentaPorLinea("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(VentaPorLinea ventaporlinea : ventaporlineasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			VentaPorLineaConstantesFunciones.generarExcelReporteDataVentaPorLinea("NORMAL",row,workbook,ventaporlinea,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Venta Por Linea",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderVentaPorLinea(String sTipo,Row row,Workbook workbook) {
		
		VentaPorLineaConstantesFunciones.generarExcelReporteHeaderVentaPorLinea(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalVentaPorLineas(String sAccionBusqueda,String sTipoArchivoReporte,List<VentaPorLinea> ventaporlineasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventaporlinea_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentaPorLineas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(VentaPorLinea ventaporlinea : ventaporlineasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(VentaPorLineaConstantesFunciones.getVentaPorLineaDescripcion(ventaporlinea));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaPorLineaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaporlinea.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaPorLineaConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaporlinea.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaPorLineaConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaporlinea.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaPorLineaConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaporlinea.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaPorLineaConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaporlinea.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaPorLineaConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaporlinea.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaPorLineaConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaporlinea.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaPorLineaConstantesFunciones.LABEL_FECHADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_FECHADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaporlinea.getfecha_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaPorLineaConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaporlinea.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaPorLineaConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaporlinea.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaPorLineaConstantesFunciones.LABEL_NOMBRELINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_NOMBRELINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaporlinea.getnombre_linea());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaPorLineaConstantesFunciones.LABEL_NOMBREGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_NOMBREGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaporlinea.getnombre_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaPorLineaConstantesFunciones.LABEL_NOMBRECATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_NOMBRECATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaporlinea.getnombre_categoria());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaPorLineaConstantesFunciones.LABEL_NOMBREMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_NOMBREMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaporlinea.getnombre_marca());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaPorLineaConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaporlinea.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaPorLineaConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaporlinea.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaPorLineaConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaporlinea.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaPorLineaConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaporlinea.getprecio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaPorLineaConstantesFunciones.LABEL_DESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_DESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaporlinea.getdescuento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaPorLineaConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaporlinea.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VentaPorLineaConstantesFunciones.LABEL_ICE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_ICE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ventaporlinea.getice());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Venta Por Linea",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesVentaPorLineas(String sAccionBusqueda,String sTipoArchivoReporte,List<VentaPorLinea> ventaporlineasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<VentaPorLinea> ventaporlineasRespaldo=null;
		
		classes=VentaPorLineaConstantesFunciones.getClassesRelationshipsOfVentaPorLinea(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.ventaporlineaLogic.setDatosCliente(this.datosCliente);
		this.ventaporlineaLogic.setDatosDeep(this.datosDeep);
		this.ventaporlineaLogic.setIsConDeep(true);
		
		ventaporlineasRespaldo=this.ventaporlineaLogic.getVentaPorLineas();
		
		this.ventaporlineaLogic.setVentaPorLineas(ventaporlineasParaReportes);	
		this.ventaporlineaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		ventaporlineasParaReportes=this.ventaporlineaLogic.getVentaPorLineas();
		this.ventaporlineaLogic.setVentaPorLineas(ventaporlineasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventaporlinea_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VentaPorLineas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVentaPorLinea("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(VentaPorLinea ventaporlinea : ventaporlineasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderVentaPorLinea("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			VentaPorLineaConstantesFunciones.generarExcelReporteDataVentaPorLinea("NORMAL",row,workbook,ventaporlinea,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(VentaPorLineaConstantesFunciones.getVentaPorLineaDescripcion(ventaporlinea));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Venta Por Linea",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVentaPorLinea.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentaPorLinea.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoVentaPorLinea.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentaPorLinea.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessVentaPorLinea() throws Exception {		
		this.startProcessVentaPorLinea(true);
	}
	
	public void startProcessVentaPorLinea(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasVentaPorLinea ,this.jPanelParametrosReportesVentaPorLinea, this.jScrollPanelDatosVentaPorLinea,this.jPanelPaginacionVentaPorLinea, this.jScrollPanelDatosEdicionVentaPorLinea, this.jPanelAccionesVentaPorLinea,this.jPanelAccionesFormularioVentaPorLinea,this.jmenuBarVentaPorLinea,this.jmenuBarDetalleVentaPorLinea,this.jTtoolBarVentaPorLinea,this.jTtoolBarDetalleVentaPorLinea);		
		
		final JTabbedPane jTabbedPaneBusquedasVentaPorLinea=this.jTabbedPaneBusquedasVentaPorLinea; 
		
		final JPanel jPanelParametrosReportesVentaPorLinea=this.jPanelParametrosReportesVentaPorLinea;
		//final JScrollPane jScrollPanelDatosVentaPorLinea=this.jScrollPanelDatosVentaPorLinea;
		final JTable jTableDatosVentaPorLinea=this.jTableDatosVentaPorLinea;		
		final JPanel jPanelPaginacionVentaPorLinea=this.jPanelPaginacionVentaPorLinea;
		//final JScrollPane jScrollPanelDatosEdicionVentaPorLinea=this.jScrollPanelDatosEdicionVentaPorLinea;
		final JPanel jPanelAccionesVentaPorLinea=this.jPanelAccionesVentaPorLinea;
		
		JPanel jPanelCamposAuxiliarVentaPorLinea=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarVentaPorLinea=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
			jPanelCamposAuxiliarVentaPorLinea=this.jInternalFrameDetalleFormVentaPorLinea.jPanelCamposVentaPorLinea;
			jPanelAccionesFormularioAuxiliarVentaPorLinea=this.jInternalFrameDetalleFormVentaPorLinea.jPanelAccionesFormularioVentaPorLinea;
		}
		
		final JPanel jPanelCamposVentaPorLinea=jPanelCamposAuxiliarVentaPorLinea;
		final JPanel jPanelAccionesFormularioVentaPorLinea=jPanelAccionesFormularioAuxiliarVentaPorLinea;
		
		
		final JMenuBar jmenuBarVentaPorLinea=this.jmenuBarVentaPorLinea;
		final JToolBar jTtoolBarVentaPorLinea=this.jTtoolBarVentaPorLinea;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarVentaPorLinea=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVentaPorLinea=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
			jmenuBarDetalleAuxiliarVentaPorLinea=this.jInternalFrameDetalleFormVentaPorLinea.jmenuBarDetalleVentaPorLinea;
			jTtoolBarDetalleAuxiliarVentaPorLinea=this.jInternalFrameDetalleFormVentaPorLinea.jTtoolBarDetalleVentaPorLinea;
		}
		
		final JMenuBar jmenuBarDetalleVentaPorLinea=jmenuBarDetalleAuxiliarVentaPorLinea;
		final JToolBar jTtoolBarDetalleVentaPorLinea=jTtoolBarDetalleAuxiliarVentaPorLinea;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVentaPorLinea;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVentaPorLinea;
			processRunnable.jTableDatos=jTableDatosVentaPorLinea;
			processRunnable.jPanelCampos=jPanelCamposVentaPorLinea;
			processRunnable.jPanelPaginacion=jPanelPaginacionVentaPorLinea;
			processRunnable.jPanelAcciones=jPanelAccionesVentaPorLinea;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVentaPorLinea;
			
			
			processRunnable.jmenuBar=jmenuBarVentaPorLinea;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVentaPorLinea;
			processRunnable.jTtoolBar=jTtoolBarVentaPorLinea;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVentaPorLinea;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVentaPorLinea ,jPanelParametrosReportesVentaPorLinea,jTableDatosVentaPorLinea, /*jScrollPanelDatosVentaPorLinea,*/jPanelCamposVentaPorLinea,jPanelPaginacionVentaPorLinea, /*jScrollPanelDatosEdicionVentaPorLinea,*/ jPanelAccionesVentaPorLinea,jPanelAccionesFormularioVentaPorLinea,jmenuBarVentaPorLinea,jmenuBarDetalleVentaPorLinea,jTtoolBarVentaPorLinea,jTtoolBarDetalleVentaPorLinea);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVentaPorLinea ,jPanelParametrosReportesVentaPorLinea, jScrollPanelDatosVentaPorLinea,jPanelPaginacionVentaPorLinea, jScrollPanelDatosEdicionVentaPorLinea, jPanelAccionesVentaPorLinea,jPanelAccionesFormularioVentaPorLinea,jmenuBarVentaPorLinea,jmenuBarDetalleVentaPorLinea,jTtoolBarVentaPorLinea,jTtoolBarDetalleVentaPorLinea);
						
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
	
	public void finishProcessVentaPorLinea() {// throws Exception 
		this.finishProcessVentaPorLinea(true);
	}
	
	public void finishProcessVentaPorLinea(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasVentaPorLinea ,this.jPanelParametrosReportesVentaPorLinea, this.jScrollPanelDatosVentaPorLinea,this.jPanelPaginacionVentaPorLinea, this.jScrollPanelDatosEdicionVentaPorLinea, this.jPanelAccionesVentaPorLinea,this.jPanelAccionesFormularioVentaPorLinea,this.jmenuBarVentaPorLinea,this.jmenuBarDetalleVentaPorLinea,this.jTtoolBarVentaPorLinea,this.jTtoolBarDetalleVentaPorLinea);		
		
		final JTabbedPane jTabbedPaneBusquedasVentaPorLinea=this.jTabbedPaneBusquedasVentaPorLinea; 
		
		final JPanel jPanelParametrosReportesVentaPorLinea=this.jPanelParametrosReportesVentaPorLinea;
		//final JScrollPane jScrollPanelDatosVentaPorLinea=this.jScrollPanelDatosVentaPorLinea;
		final JTable jTableDatosVentaPorLinea=this.jTableDatosVentaPorLinea;		
		final JPanel jPanelPaginacionVentaPorLinea=this.jPanelPaginacionVentaPorLinea;
		//final JScrollPane jScrollPanelDatosEdicionVentaPorLinea=this.jScrollPanelDatosEdicionVentaPorLinea;
		final JPanel jPanelAccionesVentaPorLinea=this.jPanelAccionesVentaPorLinea;
		
		JPanel jPanelCamposAuxiliarVentaPorLinea=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarVentaPorLinea=new JPanel();
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
			jPanelCamposAuxiliarVentaPorLinea=this.jInternalFrameDetalleFormVentaPorLinea.jPanelCamposVentaPorLinea;
			jPanelAccionesFormularioAuxiliarVentaPorLinea=this.jInternalFrameDetalleFormVentaPorLinea.jPanelAccionesFormularioVentaPorLinea;
		}
		
		final JPanel jPanelCamposVentaPorLinea=jPanelCamposAuxiliarVentaPorLinea;
		final JPanel jPanelAccionesFormularioVentaPorLinea=jPanelAccionesFormularioAuxiliarVentaPorLinea;
		
		
		final JMenuBar jmenuBarVentaPorLinea=this.jmenuBarVentaPorLinea;		
		final JToolBar jTtoolBarVentaPorLinea=this.jTtoolBarVentaPorLinea;
				
		JMenuBar jmenuBarDetalleAuxiliarVentaPorLinea=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVentaPorLinea=new JToolBar();
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
			jmenuBarDetalleAuxiliarVentaPorLinea=this.jInternalFrameDetalleFormVentaPorLinea.jmenuBarDetalleVentaPorLinea;
			jTtoolBarDetalleAuxiliarVentaPorLinea=this.jInternalFrameDetalleFormVentaPorLinea.jTtoolBarDetalleVentaPorLinea;		
		}
		
		final JMenuBar jmenuBarDetalleVentaPorLinea=jmenuBarDetalleAuxiliarVentaPorLinea;
		final JToolBar jTtoolBarDetalleVentaPorLinea=jTtoolBarDetalleAuxiliarVentaPorLinea;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVentaPorLinea;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVentaPorLinea;
			processRunnable.jTableDatos=jTableDatosVentaPorLinea;
			processRunnable.jPanelCampos=jPanelCamposVentaPorLinea;
			processRunnable.jPanelPaginacion=jPanelPaginacionVentaPorLinea;
			processRunnable.jPanelAcciones=jPanelAccionesVentaPorLinea;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVentaPorLinea;
			
			
			processRunnable.jmenuBar=jmenuBarVentaPorLinea;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVentaPorLinea;
			processRunnable.jTtoolBar=jTtoolBarVentaPorLinea;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVentaPorLinea;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasVentaPorLinea ,jPanelParametrosReportesVentaPorLinea, jTableDatosVentaPorLinea,/*jScrollPanelDatosVentaPorLinea,*/jPanelCamposVentaPorLinea,jPanelPaginacionVentaPorLinea, /*jScrollPanelDatosEdicionVentaPorLinea,*/ jPanelAccionesVentaPorLinea,jPanelAccionesFormularioVentaPorLinea,jmenuBarVentaPorLinea,jmenuBarDetalleVentaPorLinea,jTtoolBarVentaPorLinea,jTtoolBarDetalleVentaPorLinea));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesVentaPorLinea(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarVentaPorLinea(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuVentaPorLinea(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarVentaPorLinea(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarVentaPorLinea,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleVentaPorLinea,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuVentaPorLinea(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarVentaPorLinea,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleVentaPorLinea,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.ventaporlineaConstantesFunciones.getsFinalQueryVentaPorLinea();
		String  finalQueryPaginacionTodos=this.ventaporlineaConstantesFunciones.getsFinalQueryVentaPorLinea();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=VentaPorLineaConstantesFunciones.getArrayColumnasGlobalesNoVentaPorLinea(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=VentaPorLineaConstantesFunciones.getArrayColumnasGlobalesVentaPorLinea(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,VentaPorLineaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.ventaporlineasEliminados= new ArrayList<VentaPorLinea>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessVentaPorLinea();
		
				///*VentaPorLineaSessionBean*/this.ventaporlineaSessionBean=new VentaPorLineaSessionBean();
			
			if(this.ventaporlineaSessionBean==null) {
				this.ventaporlineaSessionBean=new VentaPorLineaSessionBean();
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
					this.iNumeroPaginacion=VentaPorLineaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=VentaPorLineaConstantesFunciones.getClassesForeignKeysOfVentaPorLinea(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/ventaporlinea."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			ventaporlineasAux= new ArrayList<VentaPorLinea>();
			
				
			ventaporlineaLogic.setDatosCliente(this.datosCliente);
			ventaporlineaLogic.setDatosDeep(this.datosDeep);
			ventaporlineaLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaVentaPorLinea")) {
				this.sDetalleReporte=VentaPorLineaConstantesFunciones.getDetalleIndiceBusquedaVentaPorLinea(fecha_desdeBusquedaVentaPorLinea,fecha_hastaBusquedaVentaPorLinea);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ventaporlineaLogic.getVentaPorLineasBusquedaVentaPorLinea(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_desdeBusquedaVentaPorLinea,fecha_hastaBusquedaVentaPorLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VentaPorLineaConstantesFunciones.getDetalleIndiceBusquedaVentaPorLinea(fecha_desdeBusquedaVentaPorLinea,fecha_hastaBusquedaVentaPorLinea);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VentaPorLineaConstantesFunciones.getDetalleIndiceBusquedaVentaPorLinea(fecha_desdeBusquedaVentaPorLinea,fecha_hastaBusquedaVentaPorLinea);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ventaporlineaLogic.getVentaPorLineas()==null||ventaporlineaLogic.getVentaPorLineas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ventaporlineas==null|| ventaporlineas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ventaporlineasAux=new ArrayList<VentaPorLinea>();
						ventaporlineasAux.addAll(ventaporlineaLogic.getVentaPorLineas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventaporlineasAux=new ArrayList<VentaPorLinea>();
							ventaporlineasAux.addAll(ventaporlineas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ventaporlineaLogic.getVentaPorLineasBusquedaVentaPorLinea(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_desdeBusquedaVentaPorLinea,fecha_hastaBusquedaVentaPorLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VentaPorLineaConstantesFunciones.getDetalleIndiceBusquedaVentaPorLinea(fecha_desdeBusquedaVentaPorLinea,fecha_hastaBusquedaVentaPorLinea);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VentaPorLineaConstantesFunciones.getDetalleIndiceBusquedaVentaPorLinea(fecha_desdeBusquedaVentaPorLinea,fecha_hastaBusquedaVentaPorLinea);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVentaPorLineas("BusquedaVentaPorLinea",ventaporlineaLogic.getVentaPorLineas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVentaPorLineas("BusquedaVentaPorLinea",ventaporlineas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ventaporlineaLogic.setVentaPorLineas(new ArrayList<VentaPorLinea>());
						ventaporlineaLogic.getVentaPorLineas().addAll(ventaporlineasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventaporlineas=new ArrayList<VentaPorLinea>();
							ventaporlineas.addAll(ventaporlineasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesVentaPorLinea();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessVentaPorLinea();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ventaporlineaLogic.getVentaPorLineas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventaporlineas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ventaporlineaLogic.getVentaPorLineas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventaporlineas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(VentaPorLinea ventaporlinea) {
		Boolean permite=true;
		
		if(this.ventaporlinea.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=VentaPorLineaConstantesFunciones.getOrderByListaVentaPorLinea();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=VentaPorLineaConstantesFunciones.getOrderByListaVentaPorLinea();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentaPorLinea ventaporlinea:ventaporlineaLogic.getVentaPorLineas()) {
				if(ventaporlinea.getsType().equals(Constantes2.S_TOTALES)) {
					ventaporlineaTotales=ventaporlinea;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentaPorLinea ventaporlinea:this.ventaporlineas) {
				if(ventaporlinea.getsType().equals(Constantes2.S_TOTALES)) {
					ventaporlineaTotales=ventaporlinea;
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
			this.ventaporlineaAux=new VentaPorLinea();
			this.ventaporlineaAux.setsType(Constantes2.S_TOTALES);
			this.ventaporlineaAux.setIsNew(false);
			this.ventaporlineaAux.setIsChanged(false);
			this.ventaporlineaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//VentaPorLineaConstantesFunciones.TotalizarValoresFilaVentaPorLinea(this.ventaporlineaLogic.getVentaPorLineas(),this.ventaporlineaAux);
				
				//this.ventaporlineaLogic.getVentaPorLineas().add(this.ventaporlineaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				VentaPorLineaConstantesFunciones.TotalizarValoresFilaVentaPorLinea(this.ventaporlineas,this.ventaporlineaAux);
				
				this.ventaporlineas.add(this.ventaporlineaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		ventaporlineaTotales=new VentaPorLinea();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ventaporlineaLogic.getVentaPorLineas().remove(ventaporlineaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ventaporlineas.remove(ventaporlineaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		ventaporlineaTotales=new VentaPorLinea();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VentaPorLinea ventaporlinea:ventaporlineaLogic.getVentaPorLineas()) {
				if(ventaporlinea.getsType().equals(Constantes2.S_TOTALES)) {
					ventaporlineaTotales=ventaporlinea;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VentaPorLineaConstantesFunciones.TotalizarValoresFilaVentaPorLinea(this.ventaporlineaLogic.getVentaPorLineas(),ventaporlineaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VentaPorLinea ventaporlinea:this.ventaporlineas) {
				if(ventaporlinea.getsType().equals(Constantes2.S_TOTALES)) {
					ventaporlineaTotales=ventaporlinea;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VentaPorLineaConstantesFunciones.TotalizarValoresFilaVentaPorLinea(this.ventaporlineas,ventaporlineaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getVentaPorLineasBusquedaVentaPorLinea()throws Exception {
		try {
			sAccionBusqueda="BusquedaVentaPorLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentaPorLineasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentaPorLineasFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentaPorLineasFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentaPorLineasFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentaPorLineasFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentaPorLineasFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVentaPorLineasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getVentaPorLineasBusquedaVentaPorLinea(String sFinalQuery,Date fecha_desde,Date fecha_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventaporlineaLogic.getVentaPorLineasBusquedaVentaPorLinea(sFinalQuery,this.pagination,fecha_desde,fecha_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentaPorLineasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventaporlineaLogic.getVentaPorLineasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentaPorLineasFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventaporlineaLogic.getVentaPorLineasFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentaPorLineasFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventaporlineaLogic.getVentaPorLineasFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentaPorLineasFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventaporlineaLogic.getVentaPorLineasFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentaPorLineasFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventaporlineaLogic.getVentaPorLineasFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentaPorLineasFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventaporlineaLogic.getVentaPorLineasFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVentaPorLineasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ventaporlineaLogic.getVentaPorLineasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosVentaPorLinea() {
		this.isPermisoTodoVentaPorLinea=false;
		this.isPermisoNuevoVentaPorLinea=false;
		this.isPermisoActualizarVentaPorLinea=false;
		this.isPermisoActualizarOriginalVentaPorLinea=false;
		this.isPermisoEliminarVentaPorLinea=false;
		this.isPermisoGuardarCambiosVentaPorLinea=false;
		this.isPermisoConsultaVentaPorLinea=true;
		this.isPermisoBusquedaVentaPorLinea=true;
		this.isPermisoReporteVentaPorLinea=true;
		this.isPermisoOrdenVentaPorLinea=false;		
		this.isPermisoPaginacionMedioVentaPorLinea=false;		
		this.isPermisoPaginacionAltoVentaPorLinea=false;		
		this.isPermisoPaginacionTodoVentaPorLinea=false;		
		this.isPermisoCopiarVentaPorLinea=false;		
		this.isPermisoVerFormVentaPorLinea=false;		
		this.isPermisoDuplicarVentaPorLinea=false;
		this.isPermisoOrdenVentaPorLinea=false;
	}
	
	public void setPermisosUsuarioVentaPorLinea(Boolean isPermiso) {
		this.isPermisoTodoVentaPorLinea=isPermiso;
		this.isPermisoNuevoVentaPorLinea=isPermiso;
		this.isPermisoActualizarVentaPorLinea=isPermiso;
		this.isPermisoActualizarOriginalVentaPorLinea=isPermiso;
		this.isPermisoEliminarVentaPorLinea=isPermiso;
		this.isPermisoGuardarCambiosVentaPorLinea=isPermiso;
		this.isPermisoConsultaVentaPorLinea=isPermiso;
		this.isPermisoBusquedaVentaPorLinea=isPermiso;
		this.isPermisoReporteVentaPorLinea=isPermiso;
		this.isPermisoOrdenVentaPorLinea=isPermiso;		
		this.isPermisoPaginacionMedioVentaPorLinea=isPermiso;		
		this.isPermisoPaginacionAltoVentaPorLinea=isPermiso;		
		this.isPermisoPaginacionTodoVentaPorLinea=isPermiso;		
		this.isPermisoCopiarVentaPorLinea=isPermiso;		
		this.isPermisoVerFormVentaPorLinea=isPermiso;		
		this.isPermisoDuplicarVentaPorLinea=isPermiso;
		this.isPermisoOrdenVentaPorLinea=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioVentaPorLinea(Boolean isPermiso) {
		//this.isPermisoTodoVentaPorLinea=isPermiso;
		this.isPermisoNuevoVentaPorLinea=isPermiso;
		this.isPermisoActualizarVentaPorLinea=isPermiso;
		this.isPermisoActualizarOriginalVentaPorLinea=isPermiso;
		this.isPermisoEliminarVentaPorLinea=isPermiso;
		this.isPermisoGuardarCambiosVentaPorLinea=isPermiso;
		//this.isPermisoConsultaVentaPorLinea=isPermiso;
		//this.isPermisoBusquedaVentaPorLinea=isPermiso;
		//this.isPermisoReporteVentaPorLinea=isPermiso;
		//this.isPermisoOrdenVentaPorLinea=isPermiso;		
		//this.isPermisoPaginacionMedioVentaPorLinea=isPermiso;		
		//this.isPermisoPaginacionAltoVentaPorLinea=isPermiso;		
		//this.isPermisoPaginacionTodoVentaPorLinea=isPermiso;		
		//this.isPermisoCopiarVentaPorLinea=isPermiso;		
		//this.isPermisoDuplicarVentaPorLinea=isPermiso;
		//this.isPermisoOrdenVentaPorLinea=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioVentaPorLineaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(VentaPorLineaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebVentaPorLinea(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioVentaPorLineaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioVentaPorLineaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionVentaPorLineaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioVentaPorLineaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioVentaPorLinea() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(VentaPorLineaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, VentaPorLineaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoVentaPorLinea=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarVentaPorLinea=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalVentaPorLinea=this.isPermisoActualizarVentaPorLinea;
			this.isPermisoEliminarVentaPorLinea=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosVentaPorLinea=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaVentaPorLinea=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaVentaPorLinea=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoVentaPorLinea=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteVentaPorLinea=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVentaPorLinea=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioVentaPorLinea=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoVentaPorLinea=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoVentaPorLinea=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarVentaPorLinea=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormVentaPorLinea=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarVentaPorLinea=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVentaPorLinea=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosVentaPorLinea.setToolTipText(this.jTableDatosVentaPorLinea.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioVentaPorLinea(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioVentaPorLinea(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(VentaPorLineaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(VentaPorLineaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioVentaPorLinea() throws Exception {
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
	public void inicializarCombosForeignKeyVentaPorLineaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyVentaPorLineaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(VentaPorLineaJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyVentaPorLinea()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyProducto();
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
			if(this.ventaporlineaSessionBean==null) {
				this.ventaporlineaSessionBean=new VentaPorLineaSessionBean();
			}

			if(!this.ventaporlineaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.ventaporlineaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {

			if(!this.ventaporlineaSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

			if(!this.ventaporlineaSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.ventaporlineaSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

			if(!this.ventaporlineaSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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

			if(!this.ventaporlineaSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
	
	public void initActionsCombosTodosForeignKeyVentaPorLinea()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyVentaPorLinea(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyVentaPorLinea()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyVentaPorLinea();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyVentaPorLinea(VentaPorLinea ventaporlinea)throws Exception {	
		try {
			
			this.setActualProductoForeignKey(ventaporlinea.getid_producto(),false,"Formulario");
			this.setActualLineaForeignKey(ventaporlinea.getid_linea(),false,"Formulario");
			this.setActualLineaGrupoForeignKey(ventaporlinea.getid_linea_grupo(),false,"Formulario");
			this.setActualLineaCategoriaForeignKey(ventaporlinea.getid_linea_categoria(),false,"Formulario");
			this.setActualLineaMarcaForeignKey(ventaporlinea.getid_linea_marca(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyVentaPorLinea(VentaPorLinea ventaporlinea,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyVentaPorLinea()throws Exception {	
		try {
			
			this.setActualProductoForeignKey(this.ventaporlineaConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualLineaForeignKey(this.ventaporlineaConstantesFunciones.getid_linea(),false,"Formulario");
			this.setActualLineaGrupoForeignKey(this.ventaporlineaConstantesFunciones.getid_linea_grupo(),false,"Formulario");
			this.setActualLineaCategoriaForeignKey(this.ventaporlineaConstantesFunciones.getid_linea_categoria(),false,"Formulario");
			this.setActualLineaMarcaForeignKey(this.ventaporlineaConstantesFunciones.getid_linea_marca(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyVentaPorLinea()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyVentaPorLinea()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyVentaPorLinea()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroVentaPorLinea()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyVentaPorLinea()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyVentaPorLinea(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyVentaPorLinea()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_empresaVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_empresaVentaPorLinea.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_empresaVentaPorLinea.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_sucursalVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_sucursalVentaPorLinea.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_sucursalVentaPorLinea.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_productoVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_productoVentaPorLinea.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_productoVentaPorLinea.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_lineaVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_lineaVentaPorLinea.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_lineaVentaPorLinea.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_grupoVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_grupoVentaPorLinea.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_grupoVentaPorLinea.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_categoriaVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_categoriaVentaPorLinea.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_categoriaVentaPorLinea.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_marcaVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_marcaVentaPorLinea.getItemCount()>0) {
				this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_marcaVentaPorLinea.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public VentaPorLineaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VentaPorLineaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VentaPorLineaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.ventaporlineaSessionBean=new VentaPorLineaSessionBean(); 
		this.ventaporlineaConstantesFunciones=new VentaPorLineaConstantesFunciones(); 
		this.ventaporlineaBean=new VentaPorLinea();//(this.ventaporlineaConstantesFunciones); 		
		this.ventaporlineaReturnGeneral=new VentaPorLineaParameterReturnGeneral(); 
		
		this.ventaporlineaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventaporlineaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public VentaPorLineaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public VentaPorLineaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public VentaPorLineaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessVentaPorLinea(true);
			
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
			
			this.ventaporlineaConstantesFunciones=new VentaPorLineaConstantesFunciones(); 
			this.ventaporlineaBean=new VentaPorLinea();//this.ventaporlineaConstantesFunciones); 			
			this.ventaporlineaReturnGeneral=new VentaPorLineaParameterReturnGeneral(); 
		
			VentaPorLineaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Venta Por Linea Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.ventaporlinea=new VentaPorLinea();
			this.ventaporlineas = new ArrayList<VentaPorLinea>();
			this.ventaporlineasAux = new ArrayList<VentaPorLinea>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic=new VentaPorLineaLogic();
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}
			
			//this.ventaporlineaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.ventaporlineaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormVentaPorLinea);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoVentaPorLinea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVentaPorLinea);	
					}
					
					if(this.jInternalFrameImportacionVentaPorLinea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVentaPorLinea);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByVentaPorLinea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByVentaPorLinea);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormVentaPorLinea);
				this.jInternalFrameDetalleFormVentaPorLinea.setVisible(false);
				this.jInternalFrameDetalleFormVentaPorLinea.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoVentaPorLinea!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVentaPorLinea);
					this.jInternalFrameReporteDinamicoVentaPorLinea.setVisible(false);
					this.jInternalFrameReporteDinamicoVentaPorLinea.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionVentaPorLinea!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionVentaPorLinea);
					this.jInternalFrameImportacionVentaPorLinea.setVisible(false);
					this.jInternalFrameImportacionVentaPorLinea.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByVentaPorLinea!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByVentaPorLinea);
					this.jInternalFrameOrderByVentaPorLinea.setVisible(false);
					this.jInternalFrameOrderByVentaPorLinea.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idVentaPorLineaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=VentaPorLineaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.ventaporlineaReturnGeneral=new VentaPorLineaParameterReturnGeneral();
			
			this.ventaporlineaParameterGeneral=new VentaPorLineaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.ventaporlineaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(VentaPorLineaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VentaPorLineaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ventaporlineaSessionBean.getEsGuardarRelacionado(),this.ventaporlineaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VentaPorLineaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ventaporlineaSessionBean.getEsGuardarRelacionado(),this.ventaporlineaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoVentaPorLinea=false;
			this.isVisibilidadCeldaDuplicarVentaPorLinea=true;
			this.isVisibilidadCeldaCopiarVentaPorLinea=true;
			this.isVisibilidadCeldaVerFormVentaPorLinea=true;
			this.isVisibilidadCeldaOrdenVentaPorLinea=true;
			this.isVisibilidadCeldaNuevoRelacionesVentaPorLinea=false;
			this.isVisibilidadCeldaModificarVentaPorLinea=false;
			this.isVisibilidadCeldaActualizarVentaPorLinea=false;
			this.isVisibilidadCeldaEliminarVentaPorLinea=false;
			this.isVisibilidadCeldaCancelarVentaPorLinea=false;
			this.isVisibilidadCeldaGuardarVentaPorLinea=false;
			this.isVisibilidadCeldaGuardarCambiosVentaPorLinea=false;
			
			
			this.isVisibilidadBusquedaVentaPorLinea=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesVentaPorLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosVentaPorLinea();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioVentaPorLinea(false);
			
			this.setPermisosUsuarioVentaPorLinea();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventaporlineaSessionBean.getEsGuardarRelacionado() 
				|| (this.ventaporlineaSessionBean.getEsGuardarRelacionado() && this.ventaporlineaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioVentaPorLineaClasesRelacionadas();
			}
			
			if(this.ventaporlineaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioVentaPorLineaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosVentaPorLinea();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualVentaPorLinea();
			}
			
			if(!this.isPermisoBusquedaVentaPorLinea) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasVentaPorLinea.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(VentaPorLineaConstantesFunciones.getTiposSeleccionarVentaPorLinea());
				
				this.tiposColumnasSelect=VentaPorLineaConstantesFunciones.getTiposSeleccionarVentaPorLinea(true);
				
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
			//if(!this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioVentaPorLinea();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioVentaPorLinea(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioVentaPorLinea(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesVentaPorLinea() ;
			
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
			this.productoLogic=new ProductoLogic();
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
				ventaporlineaImplementable= (VentaPorLineaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VentaPorLineaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				ventaporlineaImplementableHome= (VentaPorLineaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VentaPorLineaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.ventaporlineas= new ArrayList<VentaPorLinea>();
			this.ventaporlineasEliminados= new ArrayList<VentaPorLinea>();
						
			this.isEsNuevoVentaPorLinea=false;
			this.esParaAccionDesdeFormularioVentaPorLinea=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyVentaPorLinea(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroVentaPorLinea();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			VentaPorLineaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=VentaPorLineaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesVentaPorLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingVentaPorLinea(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioVentaPorLinea();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioVentaPorLinea();
			}
			
			VentaPorLineaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasVentaPorLinea.getTabCount(); i++) {
					this.jTabbedPaneBusquedasVentaPorLinea.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasVentaPorLinea.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessVentaPorLinea(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga VentaPorLinea: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectVentaPorLinea() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesVentaPorLinea")) {
				iIndex=this.jInternalFrameDetalleFormVentaPorLinea.jTabbedPaneRelacionesVentaPorLinea.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormVentaPorLinea.jTabbedPaneRelacionesVentaPorLinea.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessVentaPorLinea();	
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
	
	public void cargarCombosForeignKeyVentaPorLinea(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyVentaPorLinea(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyVentaPorLinea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyVentaPorLineaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyVentaPorLinea();
		
		this.cargarCombosFrameForeignKeyVentaPorLinea();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyVentaPorLinea();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyVentaPorLinea();
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
	
	public void jButtonNuevoVentaPorLineaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.ventaporlineaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormVentaPorLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
			
			
			if(jTableDatosVentaPorLinea.getRowCount()>=1) {
				jTableDatosVentaPorLinea.removeRowSelectionInterval(0, jTableDatosVentaPorLinea.getRowCount()-1);						
			}
			
			this.isEsNuevoVentaPorLinea=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoVentaPorLinea(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesVentaPorLinea(true);			
			//this.ventaporlinea=new VentaPorLinea();
			//this.ventaporlinea.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentaPorLinea(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentaPorLinea() ;
			
			if(VentaPorLineaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentaPorLinea(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.ventaporlinea);	
			this.actualizarInformacion("INFO_PADRE",false,this.ventaporlinea);				
			
			VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
			
			if(this.ventaporlineaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar VentaPorLinea: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarVentaPorLineaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<VentaPorLinea> ventaporlineasSeleccionados=new ArrayList<VentaPorLinea>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosVentaPorLinea.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosVentaPorLinea.getSelectedRows().length;			
			}
			
			ventaporlineasSeleccionados=this.getVentaPorLineasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoVentaPorLinea--;			
				//VentaPorLinea ventaporlineaAux= new VentaPorLinea();			
				//ventaporlineaAux.setId(this.iIdNuevoVentaPorLinea);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//VentaPorLinea ventaporlineaOrigen=new VentaPorLinea();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(VentaPorLinea ventaporlineaOrigen : ventaporlineasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							ventaporlineaOrigen =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ventaporlineaOrigen =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaVentaPorLinea();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.ventaporlinea.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosVentaPorLinea(ventaporlineaOrigen,this.ventaporlinea,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ventaporlineaLogic.getVentaPorLineas().add(this.ventaporlineaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ventaporlineas.add(this.ventaporlineaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaVentaPorLinea(false);
				
				this.jTableDatosVentaPorLinea.setRowSelectionInterval(this.getIndiceNuevoVentaPorLinea(), this.getIndiceNuevoVentaPorLinea());
				
				int iLastRow =  this.jTableDatosVentaPorLinea.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVentaPorLinea.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVentaPorLinea.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVentaPorLinea(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<VentaPorLinea> ventaporlineasSeleccionados=new ArrayList<VentaPorLinea>();									
		
			VentaPorLinea ventaporlineaOrigen=new VentaPorLinea();
			VentaPorLinea ventaporlineaDestino=new VentaPorLinea();
				
			ventaporlineasSeleccionados=this.getVentaPorLineasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosVentaPorLinea.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || ventaporlineasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosVentaPorLinea.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ventaporlineaOrigen =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ventaporlineaOrigen =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ventaporlineaDestino =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ventaporlineaDestino =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				ventaporlineaOrigen =ventaporlineasSeleccionados.get(0);
				ventaporlineaDestino =ventaporlineasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosVentaPorLinea(ventaporlineaOrigen,ventaporlineaDestino,true,false);
				
				ventaporlineaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ventaporlineaDestino,ventaporlineaLogic.getVentaPorLineas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ventaporlineaDestino,ventaporlineas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaVentaPorLinea(false);
				
				//this.jTableDatosVentaPorLinea.setRowSelectionInterval(this.getIndiceNuevoVentaPorLinea(), this.getIndiceNuevoVentaPorLinea());
				
				int iLastRow =  this.jTableDatosVentaPorLinea.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVentaPorLinea.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVentaPorLinea.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVentaPorLinea(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVentaPorLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormVentaPorLinea.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesVentaPorLinea.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasVentaPorLinea.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesVentaPorLinea.setVisible(!isVisible);
			this.jPanelPaginacionVentaPorLinea.setVisible(!isVisible);
			this.jPanelAccionesVentaPorLinea.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameVentaPorLinea();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoVentaPorLinea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionVentaPorLinea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByVentaPorLinea();
			
			this.abrirFrameOrderByVentaPorLinea();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByVentaPorLinea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleVentaPorLinea(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormVentaPorLinea);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormVentaPorLinea.isMaximum()) {
					this.jInternalFrameDetalleFormVentaPorLinea.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormVentaPorLinea.setSize(this.jInternalFrameDetalleFormVentaPorLinea.iWidthFormulario,this.jInternalFrameDetalleFormVentaPorLinea.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormVentaPorLinea.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormVentaPorLinea.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormVentaPorLinea.isMaximum()) {
						this.jInternalFrameDetalleFormVentaPorLinea.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormVentaPorLinea.jContentPaneDetalleVentaPorLinea.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormVentaPorLinea.jTabbedPaneRelacionesVentaPorLinea.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormVentaPorLinea.jContentPaneDetalleVentaPorLinea.getWidth(),VentaPorLineaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVentaPorLinea.jTabbedPaneRelacionesVentaPorLinea.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormVentaPorLinea.jContentPaneDetalleVentaPorLinea.getWidth(),VentaPorLineaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVentaPorLinea.jTabbedPaneRelacionesVentaPorLinea.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormVentaPorLinea.jContentPaneDetalleVentaPorLinea.getWidth(),VentaPorLineaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormVentaPorLinea.setVisible(true);
	        this.jInternalFrameDetalleFormVentaPorLinea.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByVentaPorLinea() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByVentaPorLinea==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByVentaPorLinea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentaPorLinea,false,this);
				} else {
					this.jInternalFrameOrderByVentaPorLinea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentaPorLinea,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByVentaPorLinea);
				this.jInternalFrameOrderByVentaPorLinea.setVisible(false);
				this.jInternalFrameOrderByVentaPorLinea.setSelected(false);
				
				this.jInternalFrameOrderByVentaPorLinea.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVentaPorLinea"));
				
				this.inicializarActualizarBindingTablaOrderByVentaPorLinea();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionVentaPorLinea() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionVentaPorLinea==null) {
				
				this.jInternalFrameImportacionVentaPorLinea=new ImportacionJInternalFrame(VentaPorLineaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVentaPorLinea);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionVentaPorLinea);
				this.jInternalFrameImportacionVentaPorLinea.setVisible(false);
				this.jInternalFrameImportacionVentaPorLinea.setSelected(false);


				this.jInternalFrameImportacionVentaPorLinea.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVentaPorLinea"));
				this.jInternalFrameImportacionVentaPorLinea.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVentaPorLinea"));
				this.jInternalFrameImportacionVentaPorLinea.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVentaPorLinea"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoVentaPorLinea() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoVentaPorLinea==null) {
				this.jInternalFrameReporteDinamicoVentaPorLinea=new ReporteDinamicoJInternalFrame(VentaPorLineaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVentaPorLinea);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVentaPorLinea);
				this.jInternalFrameReporteDinamicoVentaPorLinea.setVisible(false);
				this.jInternalFrameReporteDinamicoVentaPorLinea.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoVentaPorLinea.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentaPorLinea"));
				this.jInternalFrameReporteDinamicoVentaPorLinea.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentaPorLinea"));
				this.jInternalFrameReporteDinamicoVentaPorLinea.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentaPorLinea"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentaPorLinea();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleVentaPorLinea() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormVentaPorLinea);
			
	       	this.jInternalFrameDetalleFormVentaPorLinea.setVisible(false);
	        this.jInternalFrameDetalleFormVentaPorLinea.setSelected(false);
			
			//this.jInternalFrameDetalleFormVentaPorLinea.dispose();
			//this.jInternalFrameDetalleFormVentaPorLinea=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoVentaPorLinea() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoVentaPorLinea.setVisible(true);
	        this.jInternalFrameReporteDinamicoVentaPorLinea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionVentaPorLinea() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionVentaPorLinea.setVisible(true);
	        this.jInternalFrameImportacionVentaPorLinea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByVentaPorLinea() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByVentaPorLinea.setVisible(true);
	        this.jInternalFrameOrderByVentaPorLinea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByVentaPorLinea() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByVentaPorLinea.setVisible(false);
	        this.jInternalFrameOrderByVentaPorLinea.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoVentaPorLinea() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoVentaPorLinea.setVisible(false);
	        this.jInternalFrameReporteDinamicoVentaPorLinea.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionVentaPorLinea() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionVentaPorLinea.setVisible(false);
	        this.jInternalFrameImportacionVentaPorLinea.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarVentaPorLinea(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarVentaPorLinea(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesVentaPorLinea(true);
			//this.isEsNuevoVentaPorLinea=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesVentaPorLinea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentaPorLinea(false) ;
			
			if(ventaporlineaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(VentaPorLineaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentaPorLinea(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentaPorLinea(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaVentaPorLineaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarVentaPorLinea(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVentaPorLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesVentaPorLinea(true);
			//this.isEsNuevoVentaPorLinea=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.ventaporlinea.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesVentaPorLinea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesVentaPorLinea(false) ;
			
			if(VentaPorLineaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVentaPorLinea(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentaPorLinea(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosVentaPorLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,VentaPorLineaConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVentaPorLinea.getSelectedRow();

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
		TableColumn tableColumnLinea=this.jTableDatosVentaPorLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,VentaPorLineaConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVentaPorLinea.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosVentaPorLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,VentaPorLineaConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVentaPorLinea.getSelectedRow();

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
		TableColumn tableColumnLineaCategoria=this.jTableDatosVentaPorLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,VentaPorLineaConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVentaPorLinea.getSelectedRow();

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
		TableColumn tableColumnLineaMarca=this.jTableDatosVentaPorLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,VentaPorLineaConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVentaPorLinea.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesVentaPorLinea(false);
			
			//if(!this.isEsNuevoVentaPorLinea) {								
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(VentaPorLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				
			}
			
			if(this.permiteMantenimiento(this.ventaporlinea)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoVentaPorLinea=true;
					this.inicializarActualizarBindingTablaVentaPorLinea(false);
					this.isEsNuevoVentaPorLinea=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoVentaPorLinea=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoVentaPorLinea=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVentaPorLinea(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentaPorLinea(false);
				
				this.habilitarDeshabilitarControlesVentaPorLinea(false);
			
												
				
				if(VentaPorLineaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleVentaPorLinea();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoVentaPorLineaActionPerformed(evt,ventaporlineaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualVentaPorLinea(this.ventaporlinea,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosVentaPorLinea.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,ventaporlineaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.ventaporlinea.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(VentaPorLinea.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaPorLinea.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				this.ventaporlinea.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				this.ventaporlinea.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.ventaporlinea)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((VentaPorLineaModel) this.jTableDatosVentaPorLinea.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoVentaPorLinea=true;
				this.inicializarActualizarBindingTablaVentaPorLinea(false);
				this.isEsNuevoVentaPorLinea=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVentaPorLinea(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentaPorLinea(false);
				
				this.habilitarDeshabilitarControlesVentaPorLinea(false);
				
				
				
				if(VentaPorLineaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleVentaPorLinea();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosVentaPorLinea.getRowCount()>=1) {
				jTableDatosVentaPorLinea.removeRowSelectionInterval(0, jTableDatosVentaPorLinea.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesVentaPorLinea(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaVentaPorLinea(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVentaPorLinea(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVentaPorLinea(false) ;
			
			this.isEsNuevoVentaPorLinea=false;
			
			if(VentaPorLineaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleVentaPorLinea();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingVentaPorLinea(false);
				
				//SI ES MANUAL
				if(VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualVentaPorLinea();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoVentaPorLinea--;			
			//VentaPorLinea ventaporlineaAux= new VentaPorLinea();			
			//ventaporlineaAux.setId(this.iIdNuevoVentaPorLinea);
			
			if(this.jInternalFrameDetalleFormVentaPorLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaVentaPorLinea();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
			
			this.ventaporlinea.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.ventaporlineaLogic.getVentaPorLineas().add(this.ventaporlineaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.ventaporlineas.add(this.ventaporlineaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaVentaPorLinea(false);
			
			this.jTableDatosVentaPorLinea.setRowSelectionInterval(this.getIndiceNuevoVentaPorLinea(), this.getIndiceNuevoVentaPorLinea());
			
			int iLastRow =  this.jTableDatosVentaPorLinea.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosVentaPorLinea.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosVentaPorLinea.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaVentaPorLinea(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingVentaPorLinea(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentaPorLinea(false);
			
			//SI ES MANUAL
			if(VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentaPorLinea();
			}
			
			//this.abrirFrameTreeVentaPorLinea();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionVentaPorLinea.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionVentaPorLinea.setFileImportacion(this.jInternalFrameImportacionVentaPorLinea.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionVentaPorLinea.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionVentaPorLinea.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionVentaPorLinea.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionVentaPorLinea.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<VentaPorLinea> ventaporlineasSeleccionados=new ArrayList<VentaPorLinea>();		

		ventaporlineasSeleccionados=this.getVentaPorLineasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentaPorLinea.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentaPorLinea.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("VentaPorLineaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"VentaPorLineaBaseDesign.jrxml";
			
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
			
			this.generarReporteVentaPorLineas("Todos",ventaporlineasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Venta Por Linea",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoVentaPorLinea.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentaPorLinea.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VentaPorLineaConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDLINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Linea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Linea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Linea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Linea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDLINEAGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaCategoria_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaCategoria_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaCategoria_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaCategoria_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDLINEAMARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaMarca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaMarca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaMarca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaMarca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBRELINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLinea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLinea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLinea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLinea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBREGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBRECATEGORIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCategoria_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCategoria_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCategoria_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCategoria_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBREMARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreMarca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreMarca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreMarca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreMarca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaPorLineaConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaPorLineaConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaPorLineaConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaPorLineaConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaPorLineaConstantesFunciones.LABEL_DESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaPorLineaConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VentaPorLineaConstantesFunciones.LABEL_ICE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_e_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_e_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_e_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_e_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoVentaPorLinea.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoVentaPorLinea.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoVentaPorLinea.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case VentaPorLineaConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoria="id_linea";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDLINEAGRUPO:
					sNombreCampoCategoria="id_linea_grupo";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDLINEACATEGORIA:
					sNombreCampoCategoria="id_linea_categoria";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDLINEAMARCA:
					sNombreCampoCategoria="id_linea_marca";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoria="nombre_linea";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBREGRUPO:
					sNombreCampoCategoria="nombre_grupo";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBRECATEGORIA:
					sNombreCampoCategoria="nombre_categoria";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBREMARCA:
					sNombreCampoCategoria="nombre_marca";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoria="descuento";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoria="ice";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoVentaPorLinea.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case VentaPorLineaConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoriaValor="id_linea";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDLINEAGRUPO:
					sNombreCampoCategoriaValor="id_linea_grupo";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDLINEACATEGORIA:
					sNombreCampoCategoriaValor="id_linea_categoria";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDLINEAMARCA:
					sNombreCampoCategoriaValor="id_linea_marca";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoriaValor="nombre_linea";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBREGRUPO:
					sNombreCampoCategoriaValor="nombre_grupo";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBRECATEGORIA:
					sNombreCampoCategoriaValor="nombre_categoria";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBREMARCA:
					sNombreCampoCategoriaValor="nombre_marca";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoriaValor="descuento";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case VentaPorLineaConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoriaValor="ice";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoVentaPorLinea.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVentaPorLinea.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VentaPorLineaConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDLINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea");
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDLINEAGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_grupo");
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDLINEACATEGORIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Categoria",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_categoria");
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDLINEAMARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_marca");
					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBRELINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea");
					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBREGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_grupo");
					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBRECATEGORIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Categoria",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_categoria");
					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBREMARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_marca");
					break;

				case VentaPorLineaConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case VentaPorLineaConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case VentaPorLineaConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case VentaPorLineaConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
					break;

				case VentaPorLineaConstantesFunciones.LABEL_DESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento");
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case VentaPorLineaConstantesFunciones.LABEL_ICE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ice",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ice");
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
	
	public void jButtonGenerarExcelReporteDinamicoVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<VentaPorLinea> ventaporlineasSeleccionados=new ArrayList<VentaPorLinea>();		
		
		ventaporlineasSeleccionados=this.getVentaPorLineasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventaporlinea";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("VentaPorLineas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoVentaPorLinea.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoVentaPorLinea.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case VentaPorLineaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(VentaPorLinea ventaporlinea:ventaporlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaporlinea.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(VentaPorLinea ventaporlinea:ventaporlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaporlinea.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(VentaPorLinea ventaporlinea:ventaporlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaporlinea.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(VentaPorLinea ventaporlinea:ventaporlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaporlinea.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(VentaPorLinea ventaporlinea:ventaporlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaporlinea.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(VentaPorLinea ventaporlinea:ventaporlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaporlinea.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(VentaPorLinea ventaporlinea:ventaporlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaporlinea.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaPorLineaConstantesFunciones.LABEL_FECHADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_FECHADESDE);
					iRow++;

					for(VentaPorLinea ventaporlinea:ventaporlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaporlinea.getfecha_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaPorLineaConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(VentaPorLinea ventaporlinea:ventaporlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaporlinea.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(VentaPorLinea ventaporlinea:ventaporlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaporlinea.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBRELINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_NOMBRELINEA);
					iRow++;

					for(VentaPorLinea ventaporlinea:ventaporlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaporlinea.getnombre_linea());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBREGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_NOMBREGRUPO);
					iRow++;

					for(VentaPorLinea ventaporlinea:ventaporlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaporlinea.getnombre_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBRECATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_NOMBRECATEGORIA);
					iRow++;

					for(VentaPorLinea ventaporlinea:ventaporlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaporlinea.getnombre_categoria());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaPorLineaConstantesFunciones.LABEL_NOMBREMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_NOMBREMARCA);
					iRow++;

					for(VentaPorLinea ventaporlinea:ventaporlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaporlinea.getnombre_marca());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaPorLineaConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(VentaPorLinea ventaporlinea:ventaporlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaporlinea.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaPorLineaConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(VentaPorLinea ventaporlinea:ventaporlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaporlinea.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaPorLineaConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(VentaPorLinea ventaporlinea:ventaporlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaporlinea.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaPorLineaConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(VentaPorLinea ventaporlinea:ventaporlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaporlinea.getprecio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaPorLineaConstantesFunciones.LABEL_DESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_DESCUENTO);
					iRow++;

					for(VentaPorLinea ventaporlinea:ventaporlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaporlinea.getdescuento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaPorLineaConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IVA);
					iRow++;

					for(VentaPorLinea ventaporlinea:ventaporlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaporlinea.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VentaPorLineaConstantesFunciones.LABEL_ICE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_ICE);
					iRow++;

					for(VentaPorLinea ventaporlinea:ventaporlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ventaporlinea.getice());
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
			//	this.getFilaCabeceraExportarExcelVentaPorLinea(row);				
			//	iRow++;
			//}				
			
			//for(VentaPorLinea ventaporlineaAux:ventaporlineasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelVentaPorLinea(ventaporlineaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Venta Por Linea",JOptionPane.INFORMATION_MESSAGE);
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
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentaPorLinea(false);
			
			//SI ES MANUAL
			if(VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVentaPorLinea();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentaPorLinea(false);
			
			//SI ES MANUAL
			if(VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVentaPorLinea();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVentaPorLinea(false);
			
			//SI ES MANUAL
			if(VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVentaPorLinea();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaVentaPorLinea() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosVentaPorLinea.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosVentaPorLinea.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosVentaPorLinea.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosVentaPorLinea.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosVentaPorLinea.setMinimumSize(dimensionMinimum);
		this.jTableDatosVentaPorLinea.setMaximumSize(dimensionMaximum);
		this.jTableDatosVentaPorLinea.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingVentaPorLinea(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingVentaPorLinea(esInicializar,true);
	}
	
	public void inicializarActualizarBindingVentaPorLinea(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaVentaPorLinea(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesVentaPorLinea(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasVentaPorLinea(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVentaPorLinea(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesVentaPorLinea(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !VentaPorLineaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualVentaPorLinea() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaVentaPorLinea();
		
		this.inicializarActualizarBindingBotonesManualVentaPorLinea(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualVentaPorLinea();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVentaPorLinea() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualVentaPorLinea(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualVentaPorLinea(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosVentaPorLinea.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosVentaPorLinea.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteVentaPorLinea.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormVentaPorLinea.jCheckBoxPostAccionNuevoVentaPorLinea.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormVentaPorLinea.jCheckBoxPostAccionSinCerrarVentaPorLinea.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormVentaPorLinea.jCheckBoxPostAccionSinMensajeVentaPorLinea.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosVentaPorLinea.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosVentaPorLinea.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteVentaPorLinea.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
				this.jInternalFrameDetalleFormVentaPorLinea.jCheckBoxPostAccionNuevoVentaPorLinea.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormVentaPorLinea.jCheckBoxPostAccionSinCerrarVentaPorLinea.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormVentaPorLinea.jCheckBoxPostAccionSinMensajeVentaPorLinea.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionVentaPorLinea.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionVentaPorLinea.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxTiposAccionesFormularioVentaPorLinea.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesVentaPorLinea.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoVentaPorLinea!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentaPorLinea.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesVentaPorLinea.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesVentaPorLinea.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarVentaPorLinea.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesVentaPorLinea.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoVentaPorLinea!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVentaPorLinea.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesVentaPorLinea.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralVentaPorLinea.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesVentaPorLinea(Boolean esInicializar) throws Exception {
		try	{	
			if(VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualVentaPorLinea(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesVentaPorLinea() throws Exception {
		try	{
			if(VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualVentaPorLinea();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVentaPorLinea() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxTiposAccionesFormularioVentaPorLinea.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxTiposAccionesFormularioVentaPorLinea.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualVentaPorLinea() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesVentaPorLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesVentaPorLinea.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesVentaPorLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesVentaPorLinea.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesVentaPorLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesVentaPorLinea.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionVentaPorLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionVentaPorLinea.addItem(reporte);
			}
			
			
			if(!this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionVentaPorLinea.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionVentaPorLinea.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesVentaPorLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesVentaPorLinea.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesVentaPorLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesVentaPorLinea.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxTiposAccionesFormularioVentaPorLinea.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxTiposAccionesFormularioVentaPorLinea.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarVentaPorLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarVentaPorLinea.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarVentaPorLinea.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentaPorLinea();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVentaPorLinea() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVentaPorLinea!=null) {
				this.jInternalFrameReporteDinamicoVentaPorLinea.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoVentaPorLinea.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVentaPorLinea!=null) {
				this.jInternalFrameReporteDinamicoVentaPorLinea.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoVentaPorLinea.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoVentaPorLinea!=null) {
				
				if(this.jInternalFrameReporteDinamicoVentaPorLinea.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVentaPorLinea.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentaPorLinea.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoVentaPorLinea.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVentaPorLinea.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentaPorLinea.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoVentaPorLinea.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVentaPorLinea.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=VentaPorLineaConstantesFunciones.getTiposSeleccionarVentaPorLinea(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVentaPorLinea.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoVentaPorLinea.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoVentaPorLinea.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=VentaPorLineaConstantesFunciones.getTiposSeleccionarVentaPorLinea(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVentaPorLinea.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoVentaPorLinea.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVentaPorLinea.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=VentaPorLineaConstantesFunciones.getTiposSeleccionarVentaPorLinea(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVentaPorLinea.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoVentaPorLinea.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoVentaPorLinea.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoVentaPorLinea.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualVentaPorLinea()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_desdeBusquedaVentaPorLinea=new Date(this.jDateChooserfecha_desdeBusquedaVentaPorLineaVentaPorLinea.getDate().getTime());
		this.fecha_hastaBusquedaVentaPorLinea=new Date(this.jDateChooserfecha_hastaBusquedaVentaPorLineaVentaPorLinea.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasVentaPorLinea(Boolean esInicializar) throws Exception {				
		if(VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualVentaPorLinea();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaVentaPorLinea() throws Exception {
		this.inicializarActualizarBindingTablaVentaPorLinea(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByVentaPorLinea() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByVentaPorLinea.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByVentaPorLinea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentaPorLinea.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new VentaPorLineaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByVentaPorLinea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentaPorLinea.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new VentaPorLineaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosVentaPorLineaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLineaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new VentaPorLineaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByVentaPorLinea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVentaPorLinea.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new VentaPorLineaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByVentaPorLinea.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaVentaPorLinea(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=ventaporlineaLogic.getVentaPorLineas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=ventaporlineas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(VentaPorLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosVentaPorLinea.setModel(new VentaPorLineaModel(this.ventaporlineaLogic.getVentaPorLineas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosVentaPorLinea.setModel(new VentaPorLineaModel(this.ventaporlineas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByVentaPorLinea!=null && this.jInternalFrameOrderByVentaPorLinea.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByVentaPorLinea();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosVentaPorLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new VentaPorLineaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO,ventaporlineaConstantesFunciones.resaltarSeleccionarVentaPorLinea,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+VentaPorLineaConstantesFunciones.SCLASSWEBTITULO,ventaporlineaConstantesFunciones.resaltarSeleccionarVentaPorLinea,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosVentaPorLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,VentaPorLineaConstantesFunciones.LABEL_ID));

		if(this.ventaporlineaConstantesFunciones.mostraridVentaPorLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaPorLineaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventaporlineaConstantesFunciones.resaltaridVentaPorLinea,this.ventaporlineaConstantesFunciones.activaridVentaPorLinea,iSizeTabla,this,true,"idVentaPorLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaporlineaConstantesFunciones.resaltaridVentaPorLinea,this.ventaporlineaConstantesFunciones.activaridVentaPorLinea,this,true,"idVentaPorLinea","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaPorLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,VentaPorLineaConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.ventaporlineaConstantesFunciones.mostrarid_productoVentaPorLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaPorLineaConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.ventaporlineaConstantesFunciones.resaltarid_productoVentaPorLinea,this,this.ventaporlineaConstantesFunciones.activarid_productoVentaPorLinea,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.ventaporlineaConstantesFunciones.resaltarid_productoVentaPorLinea,this,this.ventaporlineaConstantesFunciones.activarid_productoVentaPorLinea,true,"id_productoVentaPorLinea","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentaPorLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaPorLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,VentaPorLineaConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.ventaporlineaConstantesFunciones.mostrarnombre_productoVentaPorLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaPorLineaConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventaporlineaConstantesFunciones.resaltarnombre_productoVentaPorLinea,this.ventaporlineaConstantesFunciones.activarnombre_productoVentaPorLinea,iSizeTabla,this,true,"nombre_productoVentaPorLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaporlineaConstantesFunciones.resaltarnombre_productoVentaPorLinea,this.ventaporlineaConstantesFunciones.activarnombre_productoVentaPorLinea,this,true,"nombre_productoVentaPorLinea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentaPorLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaPorLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,VentaPorLineaConstantesFunciones.LABEL_NOMBRELINEA));

		if(this.ventaporlineaConstantesFunciones.mostrarnombre_lineaVentaPorLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaPorLineaConstantesFunciones.LABEL_NOMBRELINEA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventaporlineaConstantesFunciones.resaltarnombre_lineaVentaPorLinea,this.ventaporlineaConstantesFunciones.activarnombre_lineaVentaPorLinea,iSizeTabla,this,true,"nombre_lineaVentaPorLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaporlineaConstantesFunciones.resaltarnombre_lineaVentaPorLinea,this.ventaporlineaConstantesFunciones.activarnombre_lineaVentaPorLinea,this,true,"nombre_lineaVentaPorLinea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentaPorLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaPorLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,VentaPorLineaConstantesFunciones.LABEL_NOMBREGRUPO));

		if(this.ventaporlineaConstantesFunciones.mostrarnombre_grupoVentaPorLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaPorLineaConstantesFunciones.LABEL_NOMBREGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventaporlineaConstantesFunciones.resaltarnombre_grupoVentaPorLinea,this.ventaporlineaConstantesFunciones.activarnombre_grupoVentaPorLinea,iSizeTabla,this,true,"nombre_grupoVentaPorLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaporlineaConstantesFunciones.resaltarnombre_grupoVentaPorLinea,this.ventaporlineaConstantesFunciones.activarnombre_grupoVentaPorLinea,this,true,"nombre_grupoVentaPorLinea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentaPorLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaPorLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,VentaPorLineaConstantesFunciones.LABEL_NOMBRECATEGORIA));

		if(this.ventaporlineaConstantesFunciones.mostrarnombre_categoriaVentaPorLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaPorLineaConstantesFunciones.LABEL_NOMBRECATEGORIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventaporlineaConstantesFunciones.resaltarnombre_categoriaVentaPorLinea,this.ventaporlineaConstantesFunciones.activarnombre_categoriaVentaPorLinea,iSizeTabla,this,true,"nombre_categoriaVentaPorLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaporlineaConstantesFunciones.resaltarnombre_categoriaVentaPorLinea,this.ventaporlineaConstantesFunciones.activarnombre_categoriaVentaPorLinea,this,true,"nombre_categoriaVentaPorLinea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentaPorLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaPorLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,VentaPorLineaConstantesFunciones.LABEL_NOMBREMARCA));

		if(this.ventaporlineaConstantesFunciones.mostrarnombre_marcaVentaPorLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaPorLineaConstantesFunciones.LABEL_NOMBREMARCA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventaporlineaConstantesFunciones.resaltarnombre_marcaVentaPorLinea,this.ventaporlineaConstantesFunciones.activarnombre_marcaVentaPorLinea,iSizeTabla,this,true,"nombre_marcaVentaPorLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaporlineaConstantesFunciones.resaltarnombre_marcaVentaPorLinea,this.ventaporlineaConstantesFunciones.activarnombre_marcaVentaPorLinea,this,true,"nombre_marcaVentaPorLinea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentaPorLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaPorLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,VentaPorLineaConstantesFunciones.LABEL_FECHA));

		if(this.ventaporlineaConstantesFunciones.mostrarfechaVentaPorLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaPorLineaConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.ventaporlineaConstantesFunciones.resaltarfechaVentaPorLinea,this.ventaporlineaConstantesFunciones.activarfechaVentaPorLinea,iSizeTabla,this,true,"fechaVentaPorLinea","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.ventaporlineaConstantesFunciones.resaltarfechaVentaPorLinea,this.ventaporlineaConstantesFunciones.activarfechaVentaPorLinea,this,true,"fechaVentaPorLinea","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new VentaPorLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaPorLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,VentaPorLineaConstantesFunciones.LABEL_SECUENCIAL));

		if(this.ventaporlineaConstantesFunciones.mostrarsecuencialVentaPorLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaPorLineaConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ventaporlineaConstantesFunciones.resaltarsecuencialVentaPorLinea,this.ventaporlineaConstantesFunciones.activarsecuencialVentaPorLinea,iSizeTabla,this,true,"secuencialVentaPorLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaporlineaConstantesFunciones.resaltarsecuencialVentaPorLinea,this.ventaporlineaConstantesFunciones.activarsecuencialVentaPorLinea,this,true,"secuencialVentaPorLinea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VentaPorLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaPorLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,VentaPorLineaConstantesFunciones.LABEL_CANTIDAD));

		if(this.ventaporlineaConstantesFunciones.mostrarcantidadVentaPorLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaPorLineaConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventaporlineaConstantesFunciones.resaltarcantidadVentaPorLinea,this.ventaporlineaConstantesFunciones.activarcantidadVentaPorLinea,iSizeTabla,this,true,"cantidadVentaPorLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaporlineaConstantesFunciones.resaltarcantidadVentaPorLinea,this.ventaporlineaConstantesFunciones.activarcantidadVentaPorLinea,this,true,"cantidadVentaPorLinea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentaPorLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaPorLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,VentaPorLineaConstantesFunciones.LABEL_PRECIO));

		if(this.ventaporlineaConstantesFunciones.mostrarprecioVentaPorLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaPorLineaConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventaporlineaConstantesFunciones.resaltarprecioVentaPorLinea,this.ventaporlineaConstantesFunciones.activarprecioVentaPorLinea,iSizeTabla,this,true,"precioVentaPorLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaporlineaConstantesFunciones.resaltarprecioVentaPorLinea,this.ventaporlineaConstantesFunciones.activarprecioVentaPorLinea,this,true,"precioVentaPorLinea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentaPorLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaPorLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,VentaPorLineaConstantesFunciones.LABEL_DESCUENTO));

		if(this.ventaporlineaConstantesFunciones.mostrardescuentoVentaPorLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaPorLineaConstantesFunciones.LABEL_DESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventaporlineaConstantesFunciones.resaltardescuentoVentaPorLinea,this.ventaporlineaConstantesFunciones.activardescuentoVentaPorLinea,iSizeTabla,this,true,"descuentoVentaPorLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaporlineaConstantesFunciones.resaltardescuentoVentaPorLinea,this.ventaporlineaConstantesFunciones.activardescuentoVentaPorLinea,this,true,"descuentoVentaPorLinea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentaPorLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaPorLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,VentaPorLineaConstantesFunciones.LABEL_IVA));

		if(this.ventaporlineaConstantesFunciones.mostrarivaVentaPorLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaPorLineaConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventaporlineaConstantesFunciones.resaltarivaVentaPorLinea,this.ventaporlineaConstantesFunciones.activarivaVentaPorLinea,iSizeTabla,this,true,"ivaVentaPorLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaporlineaConstantesFunciones.resaltarivaVentaPorLinea,this.ventaporlineaConstantesFunciones.activarivaVentaPorLinea,this,true,"ivaVentaPorLinea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentaPorLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVentaPorLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,VentaPorLineaConstantesFunciones.LABEL_ICE));

		if(this.ventaporlineaConstantesFunciones.mostrariceVentaPorLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VentaPorLineaConstantesFunciones.LABEL_ICE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ventaporlineaConstantesFunciones.resaltariceVentaPorLinea,this.ventaporlineaConstantesFunciones.activariceVentaPorLinea,iSizeTabla,this,true,"iceVentaPorLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ventaporlineaConstantesFunciones.resaltariceVentaPorLinea,this.ventaporlineaConstantesFunciones.activariceVentaPorLinea,this,true,"iceVentaPorLinea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VentaPorLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.ventaporlineaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ventaporlineaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ventaporlineaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVentaPorLinea.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ventaporlineaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ventaporlineaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVentaPorLinea.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarVentaPorLinea && this.isPermisoGuardarCambiosVentaPorLinea) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.ventaporlineaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.ventaporlineaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosVentaPorLinea.addColumn(tableColumn);
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
			
			this.jTableDatosVentaPorLinea.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVentaPorLinea && this.isPermisoGuardarCambiosVentaPorLinea) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVentaPorLinea && this.isPermisoGuardarCambiosVentaPorLinea) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosVentaPorLinea.moveColumn(this.jTableDatosVentaPorLinea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosVentaPorLinea.moveColumn(this.jTableDatosVentaPorLinea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosVentaPorLinea.moveColumn(this.jTableDatosVentaPorLinea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosVentaPorLinea.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosVentaPorLinea.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosVentaPorLinea,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!VentaPorLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosVentaPorLinea.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosVentaPorLinea.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!VentaPorLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!VentaPorLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosVentaPorLinea.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosVentaPorLinea.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosVentaPorLinea.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=ventaporlineaLogic.getVentaPorLineas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=ventaporlineas.size()-1;
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
		//this.jTableDatosVentaPorLinea.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosVentaPorLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosVentaPorLinea();
			
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
				
				//this.isEsNuevoVentaPorLinea=false;
					
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
			
				if(this.ventaporlineaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormVentaPorLinea==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVentaPorLinea.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVentaPorLinea.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.ventaporlinea.getsType().equals("DUPLICADO")
				   || this.ventaporlinea.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoVentaPorLinea=true;
				
				} else {
					this.isEsNuevoVentaPorLinea=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
					if(this.ventaporlinea.getId()>=0 && !this.ventaporlinea.getIsNew()) {						
						this.isEsNuevoVentaPorLinea=false;
						
					} else {
						this.isEsNuevoVentaPorLinea=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoVentaPorLinea(esRelaciones);						
				
				this.seleccionarVentaPorLinea(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.ventaporlinea.getId()<0) {
					this.isEsNuevoVentaPorLinea=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarVentaPorLinea(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarVentaPorLinea(evt,rowIndex);
				}	
				
				if(this.ventaporlineaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion VentaPorLinea: " + this.dDif); 
					}
				}								
				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarVentaPorLinea(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.ventaporlinea)) {
					if(this.ventaporlinea.getId()>0) {
						this.ventaporlinea.setIsDeleted(true);
						
						this.ventaporlineasEliminados.add(this.ventaporlinea);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ventaporlineaLogic.getVentaPorLineas().remove(this.ventaporlinea);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ventaporlineas.remove(this.ventaporlinea);				
					}
					
					
					((VentaPorLineaModel) this.jTableDatosVentaPorLinea.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaVentaPorLinea(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarVentaPorLinea(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoVentaPorLinea) {
			
			if(this.jInternalFrameDetalleFormVentaPorLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVentaPorLinea.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVentaPorLinea.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(VentaPorLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioVentaPorLinea(this.ventaporlinea);
				}
				
				//ARCHITECTURE
				try {
					

					//Producto
					if(!this.ventaporlineaConstantesFunciones.cargarid_productoVentaPorLinea || this.ventaporlineaConstantesFunciones.event_dependid_productoVentaPorLinea) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.ventaporlinea.getid_producto());
									//this.inicializarActualizarBindingVentaPorLinea(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(ventaporlinea.getProducto()!=null) {
							this.productosForeignKey.add(ventaporlinea.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.ventaporlinea.getid_producto(),false,"Formulario");

					//Linea
					if(!this.ventaporlineaConstantesFunciones.cargarid_lineaVentaPorLinea || this.ventaporlineaConstantesFunciones.event_dependid_lineaVentaPorLinea) {
						//this.cargarCombosLineasForeignKeyLista(" where id="+this.ventaporlinea.getid_linea());
									//this.inicializarActualizarBindingVentaPorLinea(false,false);
						this.lineasForeignKey=new ArrayList<Linea>();

						if(ventaporlinea.getLinea()!=null) {
							this.lineasForeignKey.add(ventaporlinea.getLinea());
						}

						this.addItemDefectoCombosForeignKeyLinea();
						this.cargarCombosFrameLineasForeignKey("Todos");
					}
					this.setActualLineaForeignKey(this.ventaporlinea.getid_linea(),false,"Formulario");

					//LineaGrupo
					if(!this.ventaporlineaConstantesFunciones.cargarid_linea_grupoVentaPorLinea || this.ventaporlineaConstantesFunciones.event_dependid_linea_grupoVentaPorLinea) {
						//this.cargarCombosLineaGruposForeignKeyLista(" where id="+this.ventaporlinea.getid_linea_grupo());
									//this.inicializarActualizarBindingVentaPorLinea(false,false);
						this.lineagruposForeignKey=new ArrayList<Linea>();

						if(ventaporlinea.getLineaGrupo()!=null) {
							this.lineagruposForeignKey.add(ventaporlinea.getLineaGrupo());
						}

						this.addItemDefectoCombosForeignKeyLineaGrupo();
						this.cargarCombosFrameLineaGruposForeignKey("Todos");
					}
					this.setActualLineaGrupoForeignKey(this.ventaporlinea.getid_linea_grupo(),false,"Formulario");

					//LineaCategoria
					if(!this.ventaporlineaConstantesFunciones.cargarid_linea_categoriaVentaPorLinea || this.ventaporlineaConstantesFunciones.event_dependid_linea_categoriaVentaPorLinea) {
						//this.cargarCombosLineaCategoriasForeignKeyLista(" where id="+this.ventaporlinea.getid_linea_categoria());
									//this.inicializarActualizarBindingVentaPorLinea(false,false);
						this.lineacategoriasForeignKey=new ArrayList<Linea>();

						if(ventaporlinea.getLineaCategoria()!=null) {
							this.lineacategoriasForeignKey.add(ventaporlinea.getLineaCategoria());
						}

						this.addItemDefectoCombosForeignKeyLineaCategoria();
						this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
					}
					this.setActualLineaCategoriaForeignKey(this.ventaporlinea.getid_linea_categoria(),false,"Formulario");

					//LineaMarca
					if(!this.ventaporlineaConstantesFunciones.cargarid_linea_marcaVentaPorLinea || this.ventaporlineaConstantesFunciones.event_dependid_linea_marcaVentaPorLinea) {
						//this.cargarCombosLineaMarcasForeignKeyLista(" where id="+this.ventaporlinea.getid_linea_marca());
									//this.inicializarActualizarBindingVentaPorLinea(false,false);
						this.lineamarcasForeignKey=new ArrayList<Linea>();

						if(ventaporlinea.getLineaMarca()!=null) {
							this.lineamarcasForeignKey.add(ventaporlinea.getLineaMarca());
						}

						this.addItemDefectoCombosForeignKeyLineaMarca();
						this.cargarCombosFrameLineaMarcasForeignKey("Todos");
					}
					this.setActualLineaMarcaForeignKey(this.ventaporlinea.getid_linea_marca(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesVentaPorLinea("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesVentaPorLinea(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVentaPorLinea() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoVentaPorLinea(VentaPorLinea ventaporlinea) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoVentaPorLinea(ventaporlinea,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoVentaPorLinea(VentaPorLinea ventaporlinea,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioVentaPorLinea(ventaporlinea);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyVentaPorLinea(ventaporlinea,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyVentaPorLinea(ventaporlinea);
	}
	
	public void setVariablesObjetoActualToFormularioVentaPorLinea(VentaPorLinea ventaporlinea) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormVentaPorLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormVentaPorLinea.jLabelidVentaPorLinea.setText(ventaporlinea.getId().toString());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_productoVentaPorLinea.setText(ventaporlinea.getnombre_producto());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_lineaVentaPorLinea.setText(ventaporlinea.getnombre_linea());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_grupoVentaPorLinea.setText(ventaporlinea.getnombre_grupo());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_categoriaVentaPorLinea.setText(ventaporlinea.getnombre_categoria());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_marcaVentaPorLinea.setText(ventaporlinea.getnombre_marca());
			this.jInternalFrameDetalleFormVentaPorLinea.jDateChooserfechaVentaPorLinea.setDate(ventaporlinea.getfecha());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldsecuencialVentaPorLinea.setText(ventaporlinea.getsecuencial());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldcantidadVentaPorLinea.setText(ventaporlinea.getcantidad().toString());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldprecioVentaPorLinea.setText(ventaporlinea.getprecio().toString());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextFielddescuentoVentaPorLinea.setText(ventaporlinea.getdescuento().toString());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldivaVentaPorLinea.setText(ventaporlinea.getiva().toString());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldiceVentaPorLinea.setText(ventaporlinea.getice().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,VentaPorLinea ventaporlineaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,ventaporlineaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,VentaPorLinea ventaporlineaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				ventaporlineaLocal=this.ventaporlinea;
			} else {
				ventaporlineaLocal=this.ventaporlineaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(ventaporlineaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoVentaPorLinea(ventaporlineaLocal,true);
					
					if(ventaporlineaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(ventaporlineaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(ventaporlineaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoVentaPorLinea(VentaPorLinea ventaporlinea,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVentaPorLinea(ventaporlinea,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(ventaporlinea);
	}
	
	public void setVariablesFormularioToObjetoActualVentaPorLinea(VentaPorLinea ventaporlinea,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVentaPorLinea(ventaporlinea,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualVentaPorLinea(VentaPorLinea ventaporlinea,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormVentaPorLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormVentaPorLinea.jLabelidVentaPorLinea.getText()==null || this.jInternalFrameDetalleFormVentaPorLinea.jLabelidVentaPorLinea.getText()=="" || this.jInternalFrameDetalleFormVentaPorLinea.jLabelidVentaPorLinea.getText()=="Id") {
				this.jInternalFrameDetalleFormVentaPorLinea.jLabelidVentaPorLinea.setText("0");
			}

			if(conColumnasBase) {ventaporlinea.setId(Long.parseLong(this.jInternalFrameDetalleFormVentaPorLinea.jLabelidVentaPorLinea.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaPorLineaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelIdVentaPorLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaporlinea.setnombre_producto(this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_productoVentaPorLinea.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaPorLineaConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelnombre_productoVentaPorLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaporlinea.setnombre_linea(this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_lineaVentaPorLinea.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaPorLineaConstantesFunciones.LABEL_NOMBRELINEA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelnombre_lineaVentaPorLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaporlinea.setnombre_grupo(this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_grupoVentaPorLinea.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaPorLineaConstantesFunciones.LABEL_NOMBREGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelnombre_grupoVentaPorLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaporlinea.setnombre_categoria(this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_categoriaVentaPorLinea.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaPorLineaConstantesFunciones.LABEL_NOMBRECATEGORIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelnombre_categoriaVentaPorLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaporlinea.setnombre_marca(this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_marcaVentaPorLinea.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaPorLineaConstantesFunciones.LABEL_NOMBREMARCA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelnombre_marcaVentaPorLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaporlinea.setfecha(this.jInternalFrameDetalleFormVentaPorLinea.jDateChooserfechaVentaPorLinea.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaPorLineaConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelfechaVentaPorLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaporlinea.setsecuencial(this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldsecuencialVentaPorLinea.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaPorLineaConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelsecuencialVentaPorLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaporlinea.setcantidad(Double.parseDouble(this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldcantidadVentaPorLinea.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaPorLineaConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelcantidadVentaPorLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaporlinea.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldprecioVentaPorLinea.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaPorLineaConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelprecioVentaPorLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaporlinea.setdescuento(Double.parseDouble(this.jInternalFrameDetalleFormVentaPorLinea.jTextFielddescuentoVentaPorLinea.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaPorLineaConstantesFunciones.LABEL_DESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabeldescuentoVentaPorLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaporlinea.setiva(Double.parseDouble(this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldivaVentaPorLinea.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaPorLineaConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabelivaVentaPorLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ventaporlinea.setice(Double.parseDouble(this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldiceVentaPorLinea.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VentaPorLineaConstantesFunciones.LABEL_ICE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVentaPorLinea.jLabeliceVentaPorLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVentaPorLinea(VentaPorLinea ventaporlineaBean,VentaPorLinea ventaporlinea,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && ventaporlineaBean.getid_producto()!=null && !ventaporlineaBean.getid_producto().equals(-1L))) {ventaporlinea.setid_producto(ventaporlineaBean.getid_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosVentaPorLinea(VentaPorLinea ventaporlineaOrigen,VentaPorLinea ventaporlinea,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ventaporlineaOrigen.getId()!=null && !ventaporlineaOrigen.getId().equals(0L))) {ventaporlinea.setId(ventaporlineaOrigen.getId());}}
			if(conDefault || (!conDefault && ventaporlineaOrigen.getid_producto()!=null && !ventaporlineaOrigen.getid_producto().equals(-1L))) {ventaporlinea.setid_producto(ventaporlineaOrigen.getid_producto());}
			if(conDefault || (!conDefault && ventaporlineaOrigen.getid_linea()!=null && !ventaporlineaOrigen.getid_linea().equals(-1L))) {ventaporlinea.setid_linea(ventaporlineaOrigen.getid_linea());}
			if(conDefault || (!conDefault && ventaporlineaOrigen.getid_linea_grupo()!=null && !ventaporlineaOrigen.getid_linea_grupo().equals(-1L))) {ventaporlinea.setid_linea_grupo(ventaporlineaOrigen.getid_linea_grupo());}
			if(conDefault || (!conDefault && ventaporlineaOrigen.getid_linea_categoria()!=null && !ventaporlineaOrigen.getid_linea_categoria().equals(-1L))) {ventaporlinea.setid_linea_categoria(ventaporlineaOrigen.getid_linea_categoria());}
			if(conDefault || (!conDefault && ventaporlineaOrigen.getid_linea_marca()!=null && !ventaporlineaOrigen.getid_linea_marca().equals(-1L))) {ventaporlinea.setid_linea_marca(ventaporlineaOrigen.getid_linea_marca());}
			if(conDefault || (!conDefault && ventaporlineaOrigen.getfecha_desde()!=null && !ventaporlineaOrigen.getfecha_desde().equals(new Date()))) {ventaporlinea.setfecha_desde(ventaporlineaOrigen.getfecha_desde());}
			if(conDefault || (!conDefault && ventaporlineaOrigen.getfecha_hasta()!=null && !ventaporlineaOrigen.getfecha_hasta().equals(new Date()))) {ventaporlinea.setfecha_hasta(ventaporlineaOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && ventaporlineaOrigen.getnombre_producto()!=null && !ventaporlineaOrigen.getnombre_producto().equals(""))) {ventaporlinea.setnombre_producto(ventaporlineaOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && ventaporlineaOrigen.getnombre_linea()!=null && !ventaporlineaOrigen.getnombre_linea().equals(""))) {ventaporlinea.setnombre_linea(ventaporlineaOrigen.getnombre_linea());}
			if(conDefault || (!conDefault && ventaporlineaOrigen.getnombre_grupo()!=null && !ventaporlineaOrigen.getnombre_grupo().equals(""))) {ventaporlinea.setnombre_grupo(ventaporlineaOrigen.getnombre_grupo());}
			if(conDefault || (!conDefault && ventaporlineaOrigen.getnombre_categoria()!=null && !ventaporlineaOrigen.getnombre_categoria().equals(""))) {ventaporlinea.setnombre_categoria(ventaporlineaOrigen.getnombre_categoria());}
			if(conDefault || (!conDefault && ventaporlineaOrigen.getnombre_marca()!=null && !ventaporlineaOrigen.getnombre_marca().equals(""))) {ventaporlinea.setnombre_marca(ventaporlineaOrigen.getnombre_marca());}
			if(conDefault || (!conDefault && ventaporlineaOrigen.getfecha()!=null && !ventaporlineaOrigen.getfecha().equals(new Date()))) {ventaporlinea.setfecha(ventaporlineaOrigen.getfecha());}
			if(conDefault || (!conDefault && ventaporlineaOrigen.getsecuencial()!=null && !ventaporlineaOrigen.getsecuencial().equals(""))) {ventaporlinea.setsecuencial(ventaporlineaOrigen.getsecuencial());}
			if(conDefault || (!conDefault && ventaporlineaOrigen.getcantidad()!=null && !ventaporlineaOrigen.getcantidad().equals(0.0))) {ventaporlinea.setcantidad(ventaporlineaOrigen.getcantidad());}
			if(conDefault || (!conDefault && ventaporlineaOrigen.getprecio()!=null && !ventaporlineaOrigen.getprecio().equals(0.0))) {ventaporlinea.setprecio(ventaporlineaOrigen.getprecio());}
			if(conDefault || (!conDefault && ventaporlineaOrigen.getdescuento()!=null && !ventaporlineaOrigen.getdescuento().equals(0.0))) {ventaporlinea.setdescuento(ventaporlineaOrigen.getdescuento());}
			if(conDefault || (!conDefault && ventaporlineaOrigen.getiva()!=null && !ventaporlineaOrigen.getiva().equals(0.0))) {ventaporlinea.setiva(ventaporlineaOrigen.getiva());}
			if(conDefault || (!conDefault && ventaporlineaOrigen.getice()!=null && !ventaporlineaOrigen.getice().equals(0.0))) {ventaporlinea.setice(ventaporlineaOrigen.getice());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVentaPorLinea(VentaPorLinea ventaporlinea) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVentaPorLinea.jLabelidVentaPorLinea.setText(ventaporlinea.getId().toString());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_productoVentaPorLinea.setText(ventaporlinea.getnombre_producto());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_lineaVentaPorLinea.setText(ventaporlinea.getnombre_linea());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_grupoVentaPorLinea.setText(ventaporlinea.getnombre_grupo());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_categoriaVentaPorLinea.setText(ventaporlinea.getnombre_categoria());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_marcaVentaPorLinea.setText(ventaporlinea.getnombre_marca());
			this.jInternalFrameDetalleFormVentaPorLinea.jDateChooserfechaVentaPorLinea.setDate(ventaporlinea.getfecha());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldsecuencialVentaPorLinea.setText(ventaporlinea.getsecuencial());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldcantidadVentaPorLinea.setText(ventaporlinea.getcantidad().toString());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldprecioVentaPorLinea.setText(ventaporlinea.getprecio().toString());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextFielddescuentoVentaPorLinea.setText(ventaporlinea.getdescuento().toString());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldivaVentaPorLinea.setText(ventaporlinea.getiva().toString());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldiceVentaPorLinea.setText(ventaporlinea.getice().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVentaPorLinea(VentaPorLineaBean ventaporlineaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVentaPorLinea.jLabelidVentaPorLinea.setText(ventaporlineaBean.getId().toString());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_productoVentaPorLinea.setText(ventaporlineaBean.getnombre_producto());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_lineaVentaPorLinea.setText(ventaporlineaBean.getnombre_linea());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_grupoVentaPorLinea.setText(ventaporlineaBean.getnombre_grupo());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_categoriaVentaPorLinea.setText(ventaporlineaBean.getnombre_categoria());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_marcaVentaPorLinea.setText(ventaporlineaBean.getnombre_marca());
			this.jInternalFrameDetalleFormVentaPorLinea.jDateChooserfechaVentaPorLinea.setDate(ventaporlineaBean.getfecha());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldsecuencialVentaPorLinea.setText(ventaporlineaBean.getsecuencial());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldcantidadVentaPorLinea.setText(ventaporlineaBean.getcantidad().toString());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldprecioVentaPorLinea.setText(ventaporlineaBean.getprecio().toString());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextFielddescuentoVentaPorLinea.setText(ventaporlineaBean.getdescuento().toString());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldivaVentaPorLinea.setText(ventaporlineaBean.getiva().toString());
			this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldiceVentaPorLinea.setText(ventaporlineaBean.getice().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanVentaPorLinea(VentaPorLineaParameterReturnGeneral ventaporlineaReturnGeneral,VentaPorLineaBean ventaporlineaBean,Boolean conDefault) throws Exception { 
		try {
			VentaPorLinea ventaporlineaLocal=new VentaPorLinea();
			
			ventaporlineaLocal=ventaporlineaReturnGeneral.getVentaPorLinea();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ventaporlineaLocal.getId()!=null && !ventaporlineaLocal.getId().equals(0L))) {ventaporlineaBean.setId(ventaporlineaLocal.getId());}}
			if(conDefault || (!conDefault && ventaporlineaLocal.getid_producto()!=null && !ventaporlineaLocal.getid_producto().equals(-1L))) {ventaporlineaBean.setid_producto(ventaporlineaLocal.getid_producto());}
			if(conDefault || (!conDefault && ventaporlineaLocal.getnombre_producto()!=null && !ventaporlineaLocal.getnombre_producto().equals(""))) {ventaporlineaBean.setnombre_producto(ventaporlineaLocal.getnombre_producto());}
			if(conDefault || (!conDefault && ventaporlineaLocal.getnombre_linea()!=null && !ventaporlineaLocal.getnombre_linea().equals(""))) {ventaporlineaBean.setnombre_linea(ventaporlineaLocal.getnombre_linea());}
			if(conDefault || (!conDefault && ventaporlineaLocal.getnombre_grupo()!=null && !ventaporlineaLocal.getnombre_grupo().equals(""))) {ventaporlineaBean.setnombre_grupo(ventaporlineaLocal.getnombre_grupo());}
			if(conDefault || (!conDefault && ventaporlineaLocal.getnombre_categoria()!=null && !ventaporlineaLocal.getnombre_categoria().equals(""))) {ventaporlineaBean.setnombre_categoria(ventaporlineaLocal.getnombre_categoria());}
			if(conDefault || (!conDefault && ventaporlineaLocal.getnombre_marca()!=null && !ventaporlineaLocal.getnombre_marca().equals(""))) {ventaporlineaBean.setnombre_marca(ventaporlineaLocal.getnombre_marca());}
			if(conDefault || (!conDefault && ventaporlineaLocal.getfecha()!=null && !ventaporlineaLocal.getfecha().equals(new Date()))) {ventaporlineaBean.setfecha(ventaporlineaLocal.getfecha());}
			if(conDefault || (!conDefault && ventaporlineaLocal.getsecuencial()!=null && !ventaporlineaLocal.getsecuencial().equals(""))) {ventaporlineaBean.setsecuencial(ventaporlineaLocal.getsecuencial());}
			if(conDefault || (!conDefault && ventaporlineaLocal.getcantidad()!=null && !ventaporlineaLocal.getcantidad().equals(0.0))) {ventaporlineaBean.setcantidad(ventaporlineaLocal.getcantidad());}
			if(conDefault || (!conDefault && ventaporlineaLocal.getprecio()!=null && !ventaporlineaLocal.getprecio().equals(0.0))) {ventaporlineaBean.setprecio(ventaporlineaLocal.getprecio());}
			if(conDefault || (!conDefault && ventaporlineaLocal.getdescuento()!=null && !ventaporlineaLocal.getdescuento().equals(0.0))) {ventaporlineaBean.setdescuento(ventaporlineaLocal.getdescuento());}
			if(conDefault || (!conDefault && ventaporlineaLocal.getiva()!=null && !ventaporlineaLocal.getiva().equals(0.0))) {ventaporlineaBean.setiva(ventaporlineaLocal.getiva());}
			if(conDefault || (!conDefault && ventaporlineaLocal.getice()!=null && !ventaporlineaLocal.getice().equals(0.0))) {ventaporlineaBean.setice(ventaporlineaLocal.getice());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxVentaPorLineaGenerico(Long idVentaPorLineaSeleccionado,JComboBox jComboBoxVentaPorLinea,List<VentaPorLinea> ventaporlineasLocal)throws Exception {
		try {
			VentaPorLinea  ventaporlineaTemp=null;

			for(VentaPorLinea ventaporlineaAux:ventaporlineasLocal) {
				if(ventaporlineaAux.getId()!=null && ventaporlineaAux.getId().equals(idVentaPorLineaSeleccionado)) {
					ventaporlineaTemp=ventaporlineaAux;
					break;
				}
			}

			jComboBoxVentaPorLinea.setSelectedItem(ventaporlineaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxVentaPorLineaGenerico(JComboBox jComboBoxVentaPorLinea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVentaPorLinea.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVentaPorLinea.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVentaPorLinea.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVentaPorLinea.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVentaPorLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVentaPorLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventaporlinea=(VentaPorLinea) ventaporlineaLogic.getVentaPorLineas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ventaporlinea =(VentaPorLinea) ventaporlineas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!ventaporlinea.getIsNew() && !ventaporlinea.getIsChanged() && !ventaporlinea.getIsDeleted()) {
				sDescripcion=ventaporlinea.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=ventaporlinea.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!ventaporlinea.getIsNew() && !ventaporlinea.getIsChanged() && !ventaporlinea.getIsDeleted()) {
				sDescripcion=ventaporlinea.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=ventaporlinea.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!ventaporlinea.getIsNew() && !ventaporlinea.getIsChanged() && !ventaporlinea.getIsDeleted()) {
				sDescripcion=ventaporlinea.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=ventaporlinea.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!ventaporlinea.getIsNew() && !ventaporlinea.getIsChanged() && !ventaporlinea.getIsDeleted()) {
				sDescripcion=ventaporlinea.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=ventaporlinea.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!ventaporlinea.getIsNew() && !ventaporlinea.getIsChanged() && !ventaporlinea.getIsDeleted()) {
				sDescripcion=ventaporlinea.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=ventaporlinea.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!ventaporlinea.getIsNew() && !ventaporlinea.getIsChanged() && !ventaporlinea.getIsDeleted()) {
				sDescripcion=ventaporlinea.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=ventaporlinea.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!ventaporlinea.getIsNew() && !ventaporlinea.getIsChanged() && !ventaporlinea.getIsDeleted()) {
				sDescripcion=ventaporlinea.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=ventaporlinea.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		VentaPorLinea ventaporlineaRow=new VentaPorLinea();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventaporlineaRow=(VentaPorLinea) ventaporlineaLogic.getVentaPorLineas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ventaporlineaRow=(VentaPorLinea) ventaporlineas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualVentaPorLinea(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoVentaPorLinea.setVisible((this.isVisibilidadCeldaNuevoVentaPorLinea && this.isPermisoNuevoVentaPorLinea));			
			this.jButtonDuplicarVentaPorLinea.setVisible((this.isVisibilidadCeldaDuplicarVentaPorLinea && this.isPermisoDuplicarVentaPorLinea));			
			this.jButtonCopiarVentaPorLinea.setVisible((this.isVisibilidadCeldaCopiarVentaPorLinea && this.isPermisoCopiarVentaPorLinea));
			this.jButtonVerFormVentaPorLinea.setVisible((this.isVisibilidadCeldaVerFormVentaPorLinea && this.isPermisoVerFormVentaPorLinea));
			
			this.jButtonAbrirOrderByVentaPorLinea.setVisible((this.isVisibilidadCeldaOrdenVentaPorLinea && this.isPermisoOrdenVentaPorLinea));			
			
			this.jButtonNuevoRelacionesVentaPorLinea.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentaPorLinea && this.isPermisoNuevoVentaPorLinea));			
			this.jButtonNuevoGuardarCambiosVentaPorLinea.setVisible((this.isVisibilidadCeldaNuevoVentaPorLinea && this.isPermisoNuevoVentaPorLinea && this.isPermisoGuardarCambiosVentaPorLinea));
			
			if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonModificarVentaPorLinea.setVisible((this.isVisibilidadCeldaModificarVentaPorLinea && this.isPermisoActualizarVentaPorLinea));	
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonActualizarVentaPorLinea.setVisible((this.isVisibilidadCeldaActualizarVentaPorLinea && this.isPermisoActualizarVentaPorLinea));	
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonEliminarVentaPorLinea.setVisible((this.isVisibilidadCeldaEliminarVentaPorLinea && this.isPermisoEliminarVentaPorLinea));
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonCancelarVentaPorLinea.setVisible(this.isVisibilidadCeldaCancelarVentaPorLinea);							
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonGuardarCambiosVentaPorLinea.setVisible((this.isVisibilidadCeldaGuardarVentaPorLinea && this.isPermisoGuardarCambiosVentaPorLinea));			
			
			}
						
			this.jButtonGuardarCambiosTablaVentaPorLinea.setVisible((this.isVisibilidadCeldaGuardarCambiosVentaPorLinea && this.isPermisoGuardarCambiosVentaPorLinea));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarVentaPorLinea.setVisible((this.isVisibilidadCeldaNuevoVentaPorLinea && this.isPermisoNuevoVentaPorLinea));						
			this.jButtonDuplicarToolBarVentaPorLinea.setVisible((this.isVisibilidadCeldaDuplicarVentaPorLinea && this.isPermisoDuplicarVentaPorLinea));						
			this.jButtonCopiarToolBarVentaPorLinea.setVisible((this.isVisibilidadCeldaCopiarVentaPorLinea && this.isPermisoCopiarVentaPorLinea));			
			this.jButtonVerFormToolBarVentaPorLinea.setVisible((this.isVisibilidadCeldaVerFormVentaPorLinea && this.isPermisoVerFormVentaPorLinea));			
			this.jButtonAbrirOrderByToolBarVentaPorLinea.setVisible((this.isVisibilidadCeldaOrdenVentaPorLinea && this.isPermisoOrdenVentaPorLinea));
			this.jButtonNuevoRelacionesToolBarVentaPorLinea.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentaPorLinea && this.isPermisoNuevoVentaPorLinea));			
			this.jButtonNuevoGuardarCambiosToolBarVentaPorLinea.setVisible((this.isVisibilidadCeldaNuevoVentaPorLinea && this.isPermisoNuevoVentaPorLinea && this.isPermisoGuardarCambiosVentaPorLinea));			
			
			if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonModificarToolBarVentaPorLinea.setVisible((this.isVisibilidadCeldaModificarVentaPorLinea && this.isPermisoActualizarVentaPorLinea));	
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonActualizarToolBarVentaPorLinea.setVisible((this.isVisibilidadCeldaActualizarVentaPorLinea  && this.isPermisoActualizarVentaPorLinea));	
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonEliminarToolBarVentaPorLinea.setVisible((this.isVisibilidadCeldaEliminarVentaPorLinea && this.isPermisoEliminarVentaPorLinea));
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonCancelarToolBarVentaPorLinea.setVisible(this.isVisibilidadCeldaCancelarVentaPorLinea);				
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonGuardarCambiosToolBarVentaPorLinea.setVisible((this.isVisibilidadCeldaGuardarVentaPorLinea && this.isPermisoGuardarCambiosVentaPorLinea));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarVentaPorLinea.setVisible((this.isVisibilidadCeldaGuardarCambiosVentaPorLinea && this.isPermisoGuardarCambiosVentaPorLinea));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoVentaPorLinea.setVisible((this.isVisibilidadCeldaNuevoVentaPorLinea && this.isPermisoNuevoVentaPorLinea));			
			this.jMenuItemDuplicarVentaPorLinea.setVisible((this.isVisibilidadCeldaDuplicarVentaPorLinea && this.isPermisoDuplicarVentaPorLinea));			
			this.jMenuItemCopiarVentaPorLinea.setVisible((this.isVisibilidadCeldaCopiarVentaPorLinea && this.isPermisoCopiarVentaPorLinea));			
			this.jMenuItemVerFormVentaPorLinea.setVisible((this.isVisibilidadCeldaVerFormVentaPorLinea && this.isPermisoVerFormVentaPorLinea));			
			this.jMenuItemAbrirOrderByVentaPorLinea.setVisible((this.isVisibilidadCeldaOrdenVentaPorLinea && this.isPermisoOrdenVentaPorLinea));			
			//this.jMenuItemMostrarOcultarVentaPorLinea.setVisible((this.isVisibilidadCeldaOrdenVentaPorLinea && this.isPermisoOrdenVentaPorLinea));
			this.jMenuItemDetalleAbrirOrderByVentaPorLinea.setVisible((this.isVisibilidadCeldaOrdenVentaPorLinea && this.isPermisoOrdenVentaPorLinea));			
			//this.jMenuItemDetalleMostrarOcultarVentaPorLinea.setVisible((this.isVisibilidadCeldaOrdenVentaPorLinea && this.isPermisoOrdenVentaPorLinea));			
			this.jMenuItemNuevoRelacionesVentaPorLinea.setVisible((this.isVisibilidadCeldaNuevoRelacionesVentaPorLinea && this.isPermisoNuevoVentaPorLinea));			
			this.jMenuItemNuevoGuardarCambiosVentaPorLinea.setVisible((this.isVisibilidadCeldaNuevoVentaPorLinea && this.isPermisoNuevoVentaPorLinea && this.isPermisoGuardarCambiosVentaPorLinea));									
			
			if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
			this.jInternalFrameDetalleFormVentaPorLinea.jMenuItemModificarVentaPorLinea.setVisible((this.isVisibilidadCeldaModificarVentaPorLinea && this.isPermisoActualizarVentaPorLinea));	
			this.jInternalFrameDetalleFormVentaPorLinea.jMenuItemActualizarVentaPorLinea.setVisible((this.isVisibilidadCeldaActualizarVentaPorLinea && this.isPermisoActualizarVentaPorLinea));	
			this.jInternalFrameDetalleFormVentaPorLinea.jMenuItemEliminarVentaPorLinea.setVisible((this.isVisibilidadCeldaEliminarVentaPorLinea && this.isPermisoEliminarVentaPorLinea));
			this.jInternalFrameDetalleFormVentaPorLinea.jMenuItemCancelarVentaPorLinea.setVisible(this.isVisibilidadCeldaCancelarVentaPorLinea);				
			}
			
			this.jMenuItemGuardarCambiosVentaPorLinea.setVisible((this.isVisibilidadCeldaGuardarVentaPorLinea && this.isPermisoGuardarCambiosVentaPorLinea));						
			this.jMenuItemGuardarCambiosTablaVentaPorLinea.setVisible((this.isVisibilidadCeldaGuardarCambiosVentaPorLinea && this.isPermisoGuardarCambiosVentaPorLinea));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoVentaPorLinea=this.jButtonNuevoVentaPorLinea.isVisible();
			this.isVisibilidadCeldaDuplicarVentaPorLinea=this.jButtonDuplicarVentaPorLinea.isVisible();
			this.isVisibilidadCeldaCopiarVentaPorLinea=this.jButtonCopiarVentaPorLinea.isVisible();
			this.isVisibilidadCeldaVerFormVentaPorLinea=this.jButtonVerFormVentaPorLinea.isVisible();
			
			this.isVisibilidadCeldaOrdenVentaPorLinea=this.jButtonAbrirOrderByVentaPorLinea.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesVentaPorLinea=this.jButtonNuevoRelacionesVentaPorLinea.isVisible();
			this.isVisibilidadCeldaModificarVentaPorLinea=this.jButtonModificarVentaPorLinea.isVisible();
			
			if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
			this.isVisibilidadCeldaActualizarVentaPorLinea=this.jInternalFrameDetalleFormVentaPorLinea.jButtonActualizarVentaPorLinea.isVisible();
			this.isVisibilidadCeldaEliminarVentaPorLinea=this.jInternalFrameDetalleFormVentaPorLinea.jButtonEliminarVentaPorLinea.isVisible();
			this.isVisibilidadCeldaCancelarVentaPorLinea=this.jInternalFrameDetalleFormVentaPorLinea.jButtonCancelarVentaPorLinea.isVisible();
			this.isVisibilidadCeldaGuardarVentaPorLinea=this.jInternalFrameDetalleFormVentaPorLinea.jButtonGuardarCambiosVentaPorLinea.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosVentaPorLinea=this.jButtonGuardarCambiosTablaVentaPorLinea.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoVentaPorLinea=this.jButtonNuevoToolBarVentaPorLinea.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVentaPorLinea=this.jButtonNuevoRelacionesToolBarVentaPorLinea.isVisible();
			
			if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
			this.isVisibilidadCeldaModificarVentaPorLinea=this.jInternalFrameDetalleFormVentaPorLinea.jButtonModificarToolBarVentaPorLinea.isVisible();
			this.isVisibilidadCeldaActualizarVentaPorLinea=this.jInternalFrameDetalleFormVentaPorLinea.jButtonActualizarToolBarVentaPorLinea.isVisible();
			this.isVisibilidadCeldaEliminarVentaPorLinea=this.jInternalFrameDetalleFormVentaPorLinea.jButtonEliminarToolBarVentaPorLinea.isVisible();
			this.isVisibilidadCeldaCancelarVentaPorLinea=this.jInternalFrameDetalleFormVentaPorLinea.jButtonCancelarToolBarVentaPorLinea.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVentaPorLinea=this.jButtonGuardarCambiosToolBarVentaPorLinea.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVentaPorLinea=this.jButtonGuardarCambiosTablaToolBarVentaPorLinea.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoVentaPorLinea=this.jMenuItemNuevoVentaPorLinea.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVentaPorLinea=this.jMenuItemNuevoRelacionesVentaPorLinea.isVisible();
			
			if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
			this.isVisibilidadCeldaModificarVentaPorLinea=this.jInternalFrameDetalleFormVentaPorLinea.jMenuItemModificarVentaPorLinea.isVisible();
			this.isVisibilidadCeldaActualizarVentaPorLinea=this.jInternalFrameDetalleFormVentaPorLinea.jMenuItemActualizarVentaPorLinea.isVisible();
			this.isVisibilidadCeldaEliminarVentaPorLinea=this.jInternalFrameDetalleFormVentaPorLinea.jMenuItemEliminarVentaPorLinea.isVisible();
			this.isVisibilidadCeldaCancelarVentaPorLinea=this.jInternalFrameDetalleFormVentaPorLinea.jMenuItemCancelarVentaPorLinea.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVentaPorLinea=this.jMenuItemGuardarCambiosVentaPorLinea.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVentaPorLinea=this.jMenuItemGuardarCambiosTablaVentaPorLinea.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesVentaPorLinea(Boolean esInicializar) {
		if(VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.ventaporlineaSessionBean.getConGuardarRelaciones()) {
				//if(this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesVentaPorLinea();
			}
			
			this.inicializarActualizarBindingBotonesManualVentaPorLinea(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualVentaPorLinea() {
		this.jButtonNuevoVentaPorLinea.setVisible(this.isPermisoNuevoVentaPorLinea);			
		this.jButtonDuplicarVentaPorLinea.setVisible(this.isPermisoDuplicarVentaPorLinea);			
		this.jButtonCopiarVentaPorLinea.setVisible(this.isPermisoCopiarVentaPorLinea);			
		this.jButtonVerFormVentaPorLinea.setVisible(this.isPermisoVerFormVentaPorLinea);			
		
		this.jButtonAbrirOrderByVentaPorLinea.setVisible(this.isPermisoOrdenVentaPorLinea);					
		
		this.jButtonNuevoRelacionesVentaPorLinea.setVisible(this.isPermisoNuevoVentaPorLinea);			
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonModificarVentaPorLinea.setVisible(this.isPermisoActualizarVentaPorLinea);	
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonActualizarVentaPorLinea.setVisible(this.isPermisoActualizarVentaPorLinea);	
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonEliminarVentaPorLinea.setVisible(this.isPermisoEliminarVentaPorLinea);
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonCancelarVentaPorLinea.setVisible(this.isVisibilidadCeldaCancelarVentaPorLinea);						
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonGuardarCambiosVentaPorLinea.setVisible(this.isPermisoGuardarCambiosVentaPorLinea);							
		}
		
		this.jButtonGuardarCambiosTablaVentaPorLinea.setVisible(this.isPermisoActualizarVentaPorLinea);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleVentaPorLinea() {
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonModificarVentaPorLinea.setVisible(this.isPermisoActualizarVentaPorLinea);	
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonActualizarVentaPorLinea.setVisible(this.isPermisoActualizarVentaPorLinea);	
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonEliminarVentaPorLinea.setVisible(this.isPermisoEliminarVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonCancelarVentaPorLinea.setVisible(this.isVisibilidadCeldaCancelarVentaPorLinea);							
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonGuardarCambiosVentaPorLinea.setVisible((this.isVisibilidadCeldaGuardarVentaPorLinea && this.isPermisoGuardarCambiosVentaPorLinea));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosVentaPorLinea() {
		if(VentaPorLineaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualVentaPorLinea();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesVentaPorLinea() {
	}
	
	public void jTableDatosVentaPorLineaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarVentaPorLinea(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.ventaporlinea.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaVentaPorLineaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebVentaPorLinea(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentaPorLinea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentaPorLinea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.ventaporlineaLogic.getConnexion());

				if(this.ventaporlinea.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.ventaporlinea.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentaPorLinea=(TitledBorder)this.jScrollPanelDatosVentaPorLinea.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderVentaPorLinea.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.ventaporlinea.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalVentaPorLineaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebVentaPorLinea(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentaPorLinea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentaPorLinea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.ventaporlineaLogic.getConnexion());

				if(this.ventaporlinea.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.ventaporlinea.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentaPorLinea=(TitledBorder)this.jScrollPanelDatosVentaPorLinea.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderVentaPorLinea.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.ventaporlinea.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoVentaPorLineaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebVentaPorLinea(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentaPorLinea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentaPorLinea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.ventaporlineaLogic.getConnexion());

				if(this.ventaporlinea.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.ventaporlinea.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentaPorLinea=(TitledBorder)this.jScrollPanelDatosVentaPorLinea.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderVentaPorLinea.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.ventaporlinea.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaVentaPorLineaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebVentaPorLinea(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentaPorLinea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentaPorLinea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.ventaporlineaLogic.getConnexion());

				if(this.ventaporlinea.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.ventaporlinea.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentaPorLinea=(TitledBorder)this.jScrollPanelDatosVentaPorLinea.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderVentaPorLinea.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.ventaporlinea.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoVentaPorLineaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebVentaPorLinea(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentaPorLinea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentaPorLinea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.ventaporlineaLogic.getConnexion());

				if(this.ventaporlinea.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.ventaporlinea.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentaPorLinea=(TitledBorder)this.jScrollPanelDatosVentaPorLinea.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderVentaPorLinea.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.ventaporlinea.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaVentaPorLineaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebVentaPorLinea(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentaPorLinea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentaPorLinea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.ventaporlineaLogic.getConnexion());

				if(this.ventaporlinea.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.ventaporlinea.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentaPorLinea=(TitledBorder)this.jScrollPanelDatosVentaPorLinea.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderVentaPorLinea.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.ventaporlinea.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaVentaPorLineaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebVentaPorLinea(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVentaPorLinea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVentaPorLinea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.ventaporlineaLogic.getConnexion());

				if(this.ventaporlinea.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.ventaporlinea.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVentaPorLinea=(TitledBorder)this.jScrollPanelDatosVentaPorLinea.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderVentaPorLinea.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.ventaporlinea.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_desdeVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getfecha_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_desde = '"+Funciones2.getStringPostgresDate(this.ventaporlinea.getfecha_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.ventaporlinea.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.ventaporlinea.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_lineaVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getnombre_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea like '%"+this.ventaporlinea.getnombre_linea()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_grupoVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getnombre_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_grupo like '%"+this.ventaporlinea.getnombre_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_categoriaVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getnombre_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_categoria like '%"+this.ventaporlinea.getnombre_categoria()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_marcaVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getnombre_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_marca like '%"+this.ventaporlinea.getnombre_marca()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.ventaporlinea.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.ventaporlinea.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.ventaporlinea.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.ventaporlinea.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuentoVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getdescuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento = "+this.ventaporlinea.getdescuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.ventaporlinea.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoniceVentaPorLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.getventaporlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ventaporlinea==null) {
						this.ventaporlinea = new VentaPorLinea();
					}

					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);
				}

				if(this.ventaporlinea.getice()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ice = "+this.ventaporlinea.getice().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVentaPorLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaVentaPorLineaVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentaPorLinea(false,false);

			this.getVentaPorLineasBusquedaVentaPorLinea();

			this.inicializarActualizarBindingVentaPorLinea(false);

			//if(VentaPorLineaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentaPorLinea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentaPorLinea(false,false);

			this.getVentaPorLineasFK_IdEmpresa();

			this.inicializarActualizarBindingVentaPorLinea(false);

			//if(VentaPorLineaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentaPorLinea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentaPorLinea(false,false);

			this.getVentaPorLineasFK_IdLinea();

			this.inicializarActualizarBindingVentaPorLinea(false);

			//if(VentaPorLineaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentaPorLinea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentaPorLinea(false,false);

			this.getVentaPorLineasFK_IdLineaCategoria();

			this.inicializarActualizarBindingVentaPorLinea(false);

			//if(VentaPorLineaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentaPorLinea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentaPorLinea(false,false);

			this.getVentaPorLineasFK_IdLineaGrupo();

			this.inicializarActualizarBindingVentaPorLinea(false);

			//if(VentaPorLineaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentaPorLinea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentaPorLinea(false,false);

			this.getVentaPorLineasFK_IdLineaMarca();

			this.inicializarActualizarBindingVentaPorLinea(false);

			//if(VentaPorLineaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentaPorLinea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentaPorLinea(false,false);

			this.getVentaPorLineasFK_IdProducto();

			this.inicializarActualizarBindingVentaPorLinea(false);

			//if(VentaPorLineaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentaPorLinea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalVentaPorLineaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVentaPorLinea(false,false);

			this.getVentaPorLineasFK_IdSucursal();

			this.inicializarActualizarBindingVentaPorLinea(false);

			//if(VentaPorLineaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVentaPorLinea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ventaporlineaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameVentaPorLinea() {
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
			this.jInternalFrameDetalleFormVentaPorLinea.setVisible(false);	    			
			this.jInternalFrameDetalleFormVentaPorLinea.dispose();
			this.jInternalFrameDetalleFormVentaPorLinea=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoVentaPorLinea!=null) {
			this.jInternalFrameReporteDinamicoVentaPorLinea.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoVentaPorLinea.dispose();
			this.jInternalFrameReporteDinamicoVentaPorLinea=null;
		}
		
		if(this.jInternalFrameImportacionVentaPorLinea!=null) {
			this.jInternalFrameImportacionVentaPorLinea.setVisible(false);	    			
			this.jInternalFrameImportacionVentaPorLinea.dispose();
			this.jInternalFrameImportacionVentaPorLinea=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessVentaPorLinea();
			
			VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
			
			
			if(sTipo.equals("NuevoVentaPorLinea")) {
				jButtonNuevoVentaPorLineaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarVentaPorLinea")) {
				jButtonDuplicarVentaPorLineaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarVentaPorLinea")) {
				jButtonCopiarVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("VerFormVentaPorLinea")) {
				jButtonVerFormVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarVentaPorLinea")) {
				jButtonNuevoVentaPorLineaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarVentaPorLinea")) {
				jButtonDuplicarVentaPorLineaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoVentaPorLinea")) {
				jButtonNuevoVentaPorLineaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarVentaPorLinea")) {
				jButtonDuplicarVentaPorLineaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesVentaPorLinea")) {
				jButtonNuevoVentaPorLineaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarVentaPorLinea")) {
				jButtonNuevoVentaPorLineaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesVentaPorLinea")) {
				jButtonNuevoVentaPorLineaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarVentaPorLinea")) {
				jButtonModificarVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarVentaPorLinea")) {
				jButtonModificarVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarVentaPorLinea")) {
				jButtonModificarVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarVentaPorLinea")) {
				jButtonActualizarVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarVentaPorLinea")) {
				jButtonActualizarVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarVentaPorLinea")) {
				jButtonActualizarVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("EliminarVentaPorLinea")) {
				jButtonEliminarVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarVentaPorLinea")) {
				jButtonEliminarVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarVentaPorLinea")) {
				jButtonEliminarVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("CancelarVentaPorLinea")) {
				jButtonCancelarVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarVentaPorLinea")) {
				jButtonCancelarVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarVentaPorLinea")) {
				jButtonCancelarVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("CerrarVentaPorLinea")) {
				jButtonCerrarVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarVentaPorLinea")) {
				jButtonCerrarVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarVentaPorLinea")) {
				jButtonCerrarVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarVentaPorLinea")) {
				jButtonMostrarOcultarVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarVentaPorLinea")) {
				jButtonCancelarVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosVentaPorLinea")) {
				jButtonGuardarCambiosVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarVentaPorLinea")) {
				jButtonGuardarCambiosVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarVentaPorLinea")) {
				jButtonCopiarVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarVentaPorLinea")) {
				jButtonVerFormVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosVentaPorLinea")) {
				jButtonGuardarCambiosVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarVentaPorLinea")) {
				jButtonCopiarVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormVentaPorLinea")) {
				jButtonVerFormVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaVentaPorLinea")) {
				jButtonGuardarCambiosVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarVentaPorLinea")) {
				jButtonGuardarCambiosVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaVentaPorLinea")) {
				jButtonGuardarCambiosVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionVentaPorLinea")) {
				jButtonRecargarInformacionVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarVentaPorLinea")) {
				jButtonRecargarInformacionVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionVentaPorLinea")) {
				jButtonRecargarInformacionVentaPorLineaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresVentaPorLinea")) {
				jButtonAnterioresVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarVentaPorLinea")) {
				jButtonAnterioresVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreVentaPorLinea")) {
				jButtonAnterioresVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesVentaPorLinea")) {
				jButtonSiguientesVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarVentaPorLinea")) {
				jButtonSiguientesVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesVentaPorLinea")) {
				jButtonSiguientesVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByVentaPorLinea") || sTipo.equals("MenuItemDetalleAbrirOrderByVentaPorLinea")) {
				jButtonAbrirOrderByVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarVentaPorLinea") || sTipo.equals("MenuItemDetalleMostrarOcultarVentaPorLinea")) {
				jButtonMostrarOcultarVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosVentaPorLinea")) {
				jButtonNuevoGuardarCambiosVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarVentaPorLinea")) {
				jButtonNuevoGuardarCambiosVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosVentaPorLinea")) {
				jButtonNuevoGuardarCambiosVentaPorLineaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoVentaPorLinea")) {
				jButtonCerrarReporteDinamicoVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoVentaPorLinea")) {
				jButtonGenerarReporteDinamicoVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoVentaPorLinea")) {
				
				jButtonGenerarExcelReporteDinamicoVentaPorLineaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionVentaPorLinea")) {
				jButtonCerrarImportacionVentaPorLineaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionVentaPorLinea")) {
				
				jButtonGenerarImportacionVentaPorLineaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionVentaPorLinea")) {
				
				jButtonAbrirImportacionVentaPorLineaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesVentaPorLinea")) {
				jComboBoxTiposAccionesVentaPorLineaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesVentaPorLinea")) {
				jComboBoxTiposRelacionesVentaPorLineaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioVentaPorLinea")) {
				jComboBoxTiposAccionesVentaPorLineaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarVentaPorLinea")) {
				
				jComboBoxTiposSeleccionarVentaPorLineaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralVentaPorLinea")) {
				jTextFieldValorCampoGeneralVentaPorLineaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByVentaPorLinea")) {
				jButtonAbrirOrderByVentaPorLineaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarVentaPorLinea")) {
				jButtonAbrirOrderByVentaPorLineaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByVentaPorLinea")) {
				jButtonCerrarOrderByVentaPorLineaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVentaPorLineaBusqueda")) {
				this.jButtonidVentaPorLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVentaPorLineaUpdate")) {
				this.jButtonid_empresaVentaPorLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVentaPorLineaBusqueda")) {
				this.jButtonid_empresaVentaPorLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalVentaPorLineaUpdate")) {
				this.jButtonid_sucursalVentaPorLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalVentaPorLineaBusqueda")) {
				this.jButtonid_sucursalVentaPorLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoVentaPorLineaUpdate")) {
				this.jButtonid_productoVentaPorLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoVentaPorLineaBusqueda")) {
				this.jButtonid_productoVentaPorLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaVentaPorLineaUpdate")) {
				this.jButtonid_lineaVentaPorLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaVentaPorLineaBusqueda")) {
				this.jButtonid_lineaVentaPorLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoVentaPorLineaUpdate")) {
				this.jButtonid_linea_grupoVentaPorLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoVentaPorLineaBusqueda")) {
				this.jButtonid_linea_grupoVentaPorLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaVentaPorLineaUpdate")) {
				this.jButtonid_linea_categoriaVentaPorLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaVentaPorLineaBusqueda")) {
				this.jButtonid_linea_categoriaVentaPorLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaVentaPorLineaUpdate")) {
				this.jButtonid_linea_marcaVentaPorLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaVentaPorLineaBusqueda")) {
				this.jButtonid_linea_marcaVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeVentaPorLineaBusqueda")) {
				this.jButtonfecha_desdeVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaVentaPorLineaBusqueda")) {
				this.jButtonfecha_hastaVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoVentaPorLineaBusqueda")) {
				this.jButtonnombre_productoVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaVentaPorLineaBusqueda")) {
				this.jButtonnombre_lineaVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_grupoVentaPorLineaBusqueda")) {
				this.jButtonnombre_grupoVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_categoriaVentaPorLineaBusqueda")) {
				this.jButtonnombre_categoriaVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_marcaVentaPorLineaBusqueda")) {
				this.jButtonnombre_marcaVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaVentaPorLineaBusqueda")) {
				this.jButtonfechaVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialVentaPorLineaBusqueda")) {
				this.jButtonsecuencialVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadVentaPorLineaBusqueda")) {
				this.jButtoncantidadVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioVentaPorLineaBusqueda")) {
				this.jButtonprecioVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoVentaPorLineaBusqueda")) {
				this.jButtondescuentoVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaVentaPorLineaBusqueda")) {
				this.jButtonivaVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceVentaPorLineaBusqueda")) {
				this.jButtoniceVentaPorLineaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaVentaPorLineaVentaPorLinea")) {
				this.jButtonBusquedaVentaPorLineaVentaPorLineaActionPerformed(evt);
			}
			
			;
			
			
			VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessVentaPorLinea();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentaPorLineaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaporlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaporlinea);
				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
				
				


				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentaPorLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaPorLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			VentaPorLinea ventaporlineaLocal=null;
			
			if(!this.getEsControlTabla()) {
				ventaporlineaLocal=this.ventaporlinea;
			} else {
				ventaporlineaLocal=this.ventaporlineaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaporlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaporlinea);
				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
							
				
				


				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentaPorLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaPorLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentaPorLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaAnterior =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventaporlineaAnterior =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
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
			
			VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
			
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
			
			


			
			VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentaPorLineaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaporlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaporlinea);
				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
								
						
				


				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentaPorLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaPorLinea.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaporlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaporlinea);
				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
								
				
				


				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentaPorLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaPorLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentaPorLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaAnterior =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventaporlineaAnterior =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaporlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaporlinea);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentaPorLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaAnterior =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventaporlineaAnterior =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentaPorLineaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaporlinea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventaporlinea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaporlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaporlinea);
				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
							
				
				


				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentaPorLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaPorLinea.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentaPorLineaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlineaAnterior =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ventaporlineaAnterior =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
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
			
			VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
			
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
			
			


			
			VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentaPorLineaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaporlinea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventaporlinea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaporlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaporlinea);
				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
								
				
				


				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentaPorLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaPorLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentaPorLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaAnterior =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventaporlineaAnterior =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentaPorLineaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaporlinea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ventaporlinea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentaPorLineaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaporlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaporlinea);
				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosVentaPorLinea")) {
					jCheckBoxSeleccionarTodosVentaPorLineaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosVentaPorLinea")) {
					jCheckBoxSeleccionadosVentaPorLineaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarVentaPorLinea")) {
					
				}
				
				


				
				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentaPorLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaPorLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaporlinea);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.ventaporlinea);
				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
												
				
				


				
				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentaPorLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaPorLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentaPorLineaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ventaporlineaAnterior =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ventaporlineaAnterior =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentaPorLineaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaporlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaporlinea);
				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
				
				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
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
			
			VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
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
			
			


			
			VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVentaPorLineaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaporlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaporlinea);
				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentaPorLinea.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaPorLinea.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ventaporlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ventaporlinea);
				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
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
				
				


				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VentaPorLinea.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VentaPorLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVentaPorLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ventaporlineaAnterior =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ventaporlineaAnterior =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarVentaPorLinea")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosVentaPorLineaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosVentaPorLinea.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.ventaporlinea =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.ventaporlinea =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.ventaporlinea);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarVentaPorLinea")) {
				
				}
				
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarVentaPorLinea")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosVentaPorLinea.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarVentaPorLinea")) {
			
			}
			
			VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessVentaPorLinea();
			
			VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
			
			if(sTipo.equals("NuevoVentaPorLinea")) {
				jButtonNuevoVentaPorLineaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarVentaPorLinea")) {
				jButtonDuplicarVentaPorLineaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarVentaPorLinea")) {
				jButtonCopiarVentaPorLineaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormVentaPorLinea")) {
				jButtonVerFormVentaPorLineaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesVentaPorLinea")) {
				jButtonNuevoVentaPorLineaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarVentaPorLinea")) {
				jButtonModificarVentaPorLineaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarVentaPorLinea")) {
				jButtonActualizarVentaPorLineaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarVentaPorLinea")) {
				jButtonEliminarVentaPorLineaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaVentaPorLinea")) {
				jButtonGuardarCambiosVentaPorLineaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarVentaPorLinea")) {
				jButtonCancelarVentaPorLineaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarVentaPorLinea")) {
				jButtonCerrarVentaPorLineaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosVentaPorLinea")) {
				jButtonGuardarCambiosVentaPorLineaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosVentaPorLinea")) {
				jButtonNuevoGuardarCambiosVentaPorLineaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByVentaPorLinea")) {
				jButtonAbrirOrderByVentaPorLineaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionVentaPorLinea")) {
				jButtonRecargarInformacionVentaPorLineaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresVentaPorLinea")) {
				jButtonAnterioresVentaPorLineaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesVentaPorLinea")) {
				jButtonSiguientesVentaPorLineaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVentaPorLineaBusqueda")) {
				this.jButtonidVentaPorLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVentaPorLineaUpdate")) {
				this.jButtonid_empresaVentaPorLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVentaPorLineaBusqueda")) {
				this.jButtonid_empresaVentaPorLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalVentaPorLineaUpdate")) {
				this.jButtonid_sucursalVentaPorLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalVentaPorLineaBusqueda")) {
				this.jButtonid_sucursalVentaPorLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoVentaPorLineaUpdate")) {
				this.jButtonid_productoVentaPorLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoVentaPorLineaBusqueda")) {
				this.jButtonid_productoVentaPorLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaVentaPorLineaUpdate")) {
				this.jButtonid_lineaVentaPorLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaVentaPorLineaBusqueda")) {
				this.jButtonid_lineaVentaPorLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoVentaPorLineaUpdate")) {
				this.jButtonid_linea_grupoVentaPorLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoVentaPorLineaBusqueda")) {
				this.jButtonid_linea_grupoVentaPorLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaVentaPorLineaUpdate")) {
				this.jButtonid_linea_categoriaVentaPorLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaVentaPorLineaBusqueda")) {
				this.jButtonid_linea_categoriaVentaPorLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaVentaPorLineaUpdate")) {
				this.jButtonid_linea_marcaVentaPorLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaVentaPorLineaBusqueda")) {
				this.jButtonid_linea_marcaVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeVentaPorLineaBusqueda")) {
				this.jButtonfecha_desdeVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaVentaPorLineaBusqueda")) {
				this.jButtonfecha_hastaVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoVentaPorLineaBusqueda")) {
				this.jButtonnombre_productoVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaVentaPorLineaBusqueda")) {
				this.jButtonnombre_lineaVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_grupoVentaPorLineaBusqueda")) {
				this.jButtonnombre_grupoVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_categoriaVentaPorLineaBusqueda")) {
				this.jButtonnombre_categoriaVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_marcaVentaPorLineaBusqueda")) {
				this.jButtonnombre_marcaVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaVentaPorLineaBusqueda")) {
				this.jButtonfechaVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialVentaPorLineaBusqueda")) {
				this.jButtonsecuencialVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadVentaPorLineaBusqueda")) {
				this.jButtoncantidadVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioVentaPorLineaBusqueda")) {
				this.jButtonprecioVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoVentaPorLineaBusqueda")) {
				this.jButtondescuentoVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaVentaPorLineaBusqueda")) {
				this.jButtonivaVentaPorLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceVentaPorLineaBusqueda")) {
				this.jButtoniceVentaPorLineaBusquedaActionPerformed(evt);
			}
			
			VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessVentaPorLinea();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameVentaPorLinea")) {
				closingInternalFrameVentaPorLinea();
				
			} else if(sTipo.equals("jButtonCancelarVentaPorLinea")) {
				JInternalFrameBase jInternalFrameDetalleFormVentaPorLinea = (JInternalFrameBase)evt.getSource();
	            	
	            VentaPorLineaBeanSwingJInternalFrame jInternalFrameParent=(VentaPorLineaBeanSwingJInternalFrame)jInternalFrameDetalleFormVentaPorLinea.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarVentaPorLineaActionPerformed(null);
			}
			
			VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ventaporlinea,new Object(),this.ventaporlineaParameterGeneral,this.ventaporlineaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormVentaPorLinea(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormVentaPorLinea(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormVentaPorLinea(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.ventaporlinea)) {
			if(!esControlTabla) {
				if(VentaPorLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);			
				}
				
				if(this.ventaporlineaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualVentaPorLinea(this.ventaporlinea,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanVentaPorLinea(this.ventaporlineaReturnGeneral,this.ventaporlineaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.ventaporlineaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanVentaPorLinea(classes,this.ventaporlineaReturnGeneral,this.ventaporlineaBean,false);
					}
						
					if(this.ventaporlineaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyVentaPorLinea(this.ventaporlineaReturnGeneral.getVentaPorLinea());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioVentaPorLinea(this.ventaporlineaReturnGeneral.getVentaPorLinea());	
					}
						
					if(this.ventaporlineaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioVentaPorLinea(this.ventaporlineaReturnGeneral.getVentaPorLinea(),classes);//this.ventaporlineaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioVentaPorLinea(this.ventaporlinea,classes);//this.ventaporlineaBean);									
				}
			
				if(VentaPorLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualVentaPorLinea(this.ventaporlinea,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVentaPorLinea(this.ventaporlinea);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.ventaporlineaAnterior!=null) {
						this.ventaporlinea=this.ventaporlineaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ventaporlineaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ventaporlineaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.ventaporlineaReturnGeneral.getVentaPorLinea(),ventaporlineaLogic.getVentaPorLineas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.ventaporlineaReturnGeneral.getVentaPorLinea(),this.ventaporlineas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosVentaPorLinea.repaint();
				
				//((AbstractTableModel) this.jTableDatosVentaPorLinea.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosVentaPorLinea();
			}
		}
	}
	
	public void actualizarVisualTableDatosVentaPorLinea() throws Exception {
		
		VentaPorLineaModel ventaporlineaModel=(VentaPorLineaModel)this.jTableDatosVentaPorLinea.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ventaporlineaModel.ventaporlineas=this.ventaporlineaLogic.getVentaPorLineas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			ventaporlineaModel.ventaporlineas=this.ventaporlineas;
		}
		
		
		((VentaPorLineaModel) this.jTableDatosVentaPorLinea.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaVentaPorLinea() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getventaporlineaAnterior(),this.ventaporlineaLogic.getVentaPorLineas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getventaporlineaAnterior(),this.ventaporlineas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosVentaPorLinea();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioVentaPorLinea(VentaPorLinea ventaporlinea,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
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
										
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ventaporlinea,new Object(),generalEntityParameterGeneral,this.ventaporlineaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.ventaporlineaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=VentaPorLineaConstantesFunciones.getClassesRelationshipsOfVentaPorLinea(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=VentaPorLineaConstantesFunciones.getClassesRelationshipsFromStringsOfVentaPorLinea(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormVentaPorLinea(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				VentaPorLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ventaporlinea,new Object(),generalEntityParameterGeneral,this.ventaporlineaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioVentaPorLinea(VentaPorLineaBean ventaporlineaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanVentaPorLinea(ArrayList<Classe> classes,VentaPorLineaReturnGeneral ventaporlineaReturnGeneral,VentaPorLineaBean ventaporlineaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualVentaPorLinea(VentaPorLinea ventaporlinea,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.ventaporlinea)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormVentaPorLinea = new VentaPorLineaDetalleFormJInternalFrame(jDesktopPane,this.ventaporlineaSessionBean.getConGuardarRelaciones(),this.ventaporlineaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.setVisible(false);
		this.jInternalFrameDetalleFormVentaPorLinea.setSelected(false);						
		
		this.jInternalFrameDetalleFormVentaPorLinea.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormVentaPorLinea.ventaporlineaLogic=this.ventaporlineaLogic;
		
		this.cargarCombosFrameForeignKeyVentaPorLinea("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleVentaPorLinea();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVentaPorLinea();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyVentaPorLinea("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyVentaPorLinea();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormVentaPorLinea.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVentaPorLinea"));
		
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonModificarVentaPorLinea.addActionListener(new ButtonActionListener(this,"ModificarVentaPorLinea"));

		
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonModificarToolBarVentaPorLinea.addActionListener(new ButtonActionListener(this,"ModificarToolBarVentaPorLinea"));
					
		this.jInternalFrameDetalleFormVentaPorLinea.jMenuItemModificarVentaPorLinea.addActionListener(new ButtonActionListener(this,"MenuItemModificarVentaPorLinea"));		
		
		
		
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonActualizarVentaPorLinea.addActionListener (new ButtonActionListener(this,"ActualizarVentaPorLinea"));
		
		
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonActualizarToolBarVentaPorLinea.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVentaPorLinea"));
						
		this.jInternalFrameDetalleFormVentaPorLinea.jMenuItemActualizarVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVentaPorLinea"));		
		
		
		
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonEliminarVentaPorLinea.addActionListener (new ButtonActionListener(this,"EliminarVentaPorLinea"));
		
		
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonEliminarToolBarVentaPorLinea.addActionListener (new ButtonActionListener(this,"EliminarToolBarVentaPorLinea"));
								
		this.jInternalFrameDetalleFormVentaPorLinea.jMenuItemEliminarVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVentaPorLinea"));		
		
		
		
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonCancelarVentaPorLinea.addActionListener (new ButtonActionListener(this,"CancelarVentaPorLinea"));
		
		
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonCancelarToolBarVentaPorLinea.addActionListener (new ButtonActionListener(this,"CancelarToolBarVentaPorLinea"));
					
		this.jInternalFrameDetalleFormVentaPorLinea.jMenuItemCancelarVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVentaPorLinea"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormVentaPorLinea.jMenuItemDetalleCerrarVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVentaPorLinea"));		
		
		
		
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonGuardarCambiosToolBarVentaPorLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentaPorLinea"));
		
		
		
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonGuardarCambiosToolBarVentaPorLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentaPorLinea"));
		
		
		
		this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxTiposAccionesFormularioVentaPorLinea.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVentaPorLinea"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonidVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"idVentaPorLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_empresaVentaPorLineaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentaPorLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_empresaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentaPorLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_sucursalVentaPorLineaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVentaPorLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_sucursalVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVentaPorLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_productoVentaPorLineaUpdate.addActionListener(new ButtonActionListener(this,"id_productoVentaPorLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_productoVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_productoVentaPorLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_lineaVentaPorLineaUpdate.addActionListener(new ButtonActionListener(this,"id_lineaVentaPorLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_lineaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaVentaPorLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_linea_grupoVentaPorLineaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoVentaPorLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_linea_grupoVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoVentaPorLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_linea_categoriaVentaPorLineaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaVentaPorLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_linea_categoriaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaVentaPorLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_linea_marcaVentaPorLineaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaVentaPorLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_linea_marcaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonfecha_desdeVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonfecha_hastaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonnombre_productoVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonnombre_lineaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonnombre_grupoVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupoVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonnombre_categoriaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_categoriaVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonnombre_marcaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_marcaVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonfechaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"fechaVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonsecuencialVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"secuencialVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtoncantidadVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"cantidadVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonprecioVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"precioVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtondescuentoVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonivaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"ivaVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtoniceVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"iceVentaPorLineaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormVentaPorLinea.jTabbedPaneRelacionesVentaPorLinea.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVentaPorLinea"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameVentaPorLinea"));
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaPorLinea.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVentaPorLinea"));
		}
		
		this.jTableDatosVentaPorLinea.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarVentaPorLinea"));
		
		this.jTableDatosVentaPorLinea.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarVentaPorLinea"));
		
		this.jButtonNuevoVentaPorLinea.addActionListener(new ButtonActionListener(this,"NuevoVentaPorLinea"));
		
		this.jButtonDuplicarVentaPorLinea.addActionListener(new ButtonActionListener(this,"DuplicarVentaPorLinea"));
		
		this.jButtonCopiarVentaPorLinea.addActionListener(new ButtonActionListener(this,"CopiarVentaPorLinea"));
		
		this.jButtonVerFormVentaPorLinea.addActionListener(new ButtonActionListener(this,"VerFormVentaPorLinea"));
		
		
		this.jButtonNuevoToolBarVentaPorLinea.addActionListener(new ButtonActionListener(this,"NuevoToolBarVentaPorLinea"));
			
		this.jButtonDuplicarToolBarVentaPorLinea.addActionListener(new ButtonActionListener(this,"DuplicarToolBarVentaPorLinea"));
			
		this.jMenuItemNuevoVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemNuevoVentaPorLinea"));
			
		this.jMenuItemDuplicarVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarVentaPorLinea"));		
		
		
		this.jButtonNuevoRelacionesVentaPorLinea.addActionListener (new ButtonActionListener(this,"NuevoRelacionesVentaPorLinea"));
		
		
		this.jButtonNuevoRelacionesToolBarVentaPorLinea.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarVentaPorLinea"));
			
		this.jMenuItemNuevoRelacionesVentaPorLinea.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesVentaPorLinea"));		
		
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonModificarVentaPorLinea.addActionListener(new ButtonActionListener(this,"ModificarVentaPorLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonModificarToolBarVentaPorLinea.addActionListener(new ButtonActionListener(this,"ModificarToolBarVentaPorLinea"));
			
			this.jInternalFrameDetalleFormVentaPorLinea.jMenuItemModificarVentaPorLinea.addActionListener(new ButtonActionListener(this,"MenuItemModificarVentaPorLinea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonActualizarVentaPorLinea.addActionListener (new ButtonActionListener(this,"ActualizarVentaPorLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonActualizarToolBarVentaPorLinea.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVentaPorLinea"));
				
			this.jInternalFrameDetalleFormVentaPorLinea.jMenuItemActualizarVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVentaPorLinea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonEliminarVentaPorLinea.addActionListener (new ButtonActionListener(this,"EliminarVentaPorLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonEliminarToolBarVentaPorLinea.addActionListener (new ButtonActionListener(this,"EliminarToolBarVentaPorLinea"));
						
			this.jInternalFrameDetalleFormVentaPorLinea.jMenuItemEliminarVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVentaPorLinea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonCancelarVentaPorLinea.addActionListener (new ButtonActionListener(this,"CancelarVentaPorLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonCancelarToolBarVentaPorLinea.addActionListener (new ButtonActionListener(this,"CancelarToolBarVentaPorLinea"));
			
			this.jInternalFrameDetalleFormVentaPorLinea.jMenuItemCancelarVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVentaPorLinea"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarVentaPorLinea.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarVentaPorLinea"));		
		
		
		this.jButtonCerrarVentaPorLinea.addActionListener (new ButtonActionListener(this,"CerrarVentaPorLinea"));
		
		
		this.jButtonCerrarToolBarVentaPorLinea.addActionListener (new ButtonActionListener(this,"CerrarToolBarVentaPorLinea"));
			
		this.jMenuItemCerrarVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemCerrarVentaPorLinea"));
			
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaPorLinea.jMenuItemDetalleCerrarVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVentaPorLinea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonGuardarCambiosVentaPorLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosVentaPorLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaPorLinea.jButtonGuardarCambiosToolBarVentaPorLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVentaPorLinea"));
		}
		
		this.jButtonCopiarToolBarVentaPorLinea.addActionListener (new ButtonActionListener(this,"CopiarToolBarVentaPorLinea"));
			
		this.jButtonVerFormToolBarVentaPorLinea.addActionListener (new ButtonActionListener(this,"VerFormToolBarVentaPorLinea"));
		
		this.jMenuItemGuardarCambiosVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosVentaPorLinea"));
			
		this.jMenuItemCopiarVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemCopiarVentaPorLinea"));		
		
		this.jMenuItemVerFormVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemVerFormVentaPorLinea"));		
		
		
		this.jButtonGuardarCambiosTablaVentaPorLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVentaPorLinea"));
		
		
		this.jButtonGuardarCambiosTablaToolBarVentaPorLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarVentaPorLinea"));
			
		this.jMenuItemGuardarCambiosTablaVentaPorLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVentaPorLinea"));		
		
		
		
		this.jButtonRecargarInformacionVentaPorLinea.addActionListener (new ButtonActionListener(this,"RecargarInformacionVentaPorLinea"));
					
		this.jButtonRecargarInformacionToolBarVentaPorLinea.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarVentaPorLinea"));
		
		this.jMenuItemRecargarInformacionVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionVentaPorLinea"));		
		
		
		
		this.jButtonAnterioresVentaPorLinea.addActionListener (new ButtonActionListener(this,"AnterioresVentaPorLinea"));
		
		
		this.jButtonAnterioresToolBarVentaPorLinea.addActionListener (new ButtonActionListener(this,"AnterioresToolBarVentaPorLinea"));
		
		this.jMenuItemAnterioresVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresVentaPorLinea"));		
		
		
		this.jButtonSiguientesVentaPorLinea.addActionListener (new ButtonActionListener(this,"SiguientesVentaPorLinea"));
		
		
		this.jButtonSiguientesToolBarVentaPorLinea.addActionListener (new ButtonActionListener(this,"SiguientesToolBarVentaPorLinea"));
			
		this.jMenuItemSiguientesVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesVentaPorLinea"));
			
		this.jMenuItemAbrirOrderByVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByVentaPorLinea"));
			
		this.jMenuItemMostrarOcultarVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarVentaPorLinea"));
			
		this.jMenuItemDetalleAbrirOrderByVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByVentaPorLinea"));
			
		this.jMenuItemDetalleMostarOcultarVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarVentaPorLinea"));		
		
		
		this.jButtonNuevoGuardarCambiosVentaPorLinea.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosVentaPorLinea"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarVentaPorLinea.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarVentaPorLinea"));
			
		this.jMenuItemNuevoGuardarCambiosVentaPorLinea.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosVentaPorLinea"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosVentaPorLinea.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosVentaPorLinea"));

		this.jCheckBoxSeleccionadosVentaPorLinea.addItemListener(new CheckBoxItemListener(this,"SeleccionadosVentaPorLinea"));
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxTiposAccionesFormularioVentaPorLinea.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVentaPorLinea"));
		}
		
		
		this.jComboBoxTiposRelacionesVentaPorLinea.addActionListener (new ButtonActionListener(this,"TiposRelacionesVentaPorLinea"));
			
		this.jComboBoxTiposAccionesVentaPorLinea.addActionListener (new ButtonActionListener(this,"TiposAccionesVentaPorLinea"));
					
		this.jComboBoxTiposSeleccionarVentaPorLinea.addActionListener (new ButtonActionListener(this,"TiposSeleccionarVentaPorLinea"));
			
		this.jTextFieldValorCampoGeneralVentaPorLinea.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralVentaPorLinea"));		
		
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonidVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"idVentaPorLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_empresaVentaPorLineaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentaPorLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_empresaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentaPorLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_sucursalVentaPorLineaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVentaPorLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_sucursalVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVentaPorLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_productoVentaPorLineaUpdate.addActionListener(new ButtonActionListener(this,"id_productoVentaPorLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_productoVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_productoVentaPorLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_lineaVentaPorLineaUpdate.addActionListener(new ButtonActionListener(this,"id_lineaVentaPorLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_lineaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaVentaPorLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_linea_grupoVentaPorLineaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoVentaPorLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_linea_grupoVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoVentaPorLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_linea_categoriaVentaPorLineaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaVentaPorLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_linea_categoriaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaVentaPorLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_linea_marcaVentaPorLineaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaVentaPorLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_linea_marcaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonfecha_desdeVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonfecha_hastaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonnombre_productoVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonnombre_lineaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonnombre_grupoVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupoVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonnombre_categoriaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_categoriaVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonnombre_marcaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_marcaVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonfechaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"fechaVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonsecuencialVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"secuencialVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtoncantidadVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"cantidadVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonprecioVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"precioVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtondescuentoVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonivaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"ivaVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtoniceVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"iceVentaPorLineaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaVentaPorLineaVentaPorLinea.addActionListener(new ButtonActionListener(this,"BusquedaVentaPorLineaVentaPorLinea"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoVentaPorLinea!=null) {
				this.jInternalFrameReporteDinamicoVentaPorLinea.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentaPorLinea"));
				this.jInternalFrameReporteDinamicoVentaPorLinea.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentaPorLinea"));
				this.jInternalFrameReporteDinamicoVentaPorLinea.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentaPorLinea"));
			}
			
			//this.jButtonCerrarReporteDinamicoVentaPorLinea.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVentaPorLinea"));				
			//this.jButtonGenerarReporteDinamicoVentaPorLinea.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVentaPorLinea"));
			//this.jButtonGenerarExcelReporteDinamicoVentaPorLinea.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVentaPorLinea"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionVentaPorLinea!=null) {
				this.jInternalFrameImportacionVentaPorLinea.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVentaPorLinea"));
				this.jInternalFrameImportacionVentaPorLinea.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVentaPorLinea"));
				this.jInternalFrameImportacionVentaPorLinea.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVentaPorLinea"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByVentaPorLinea.addActionListener (new ButtonActionListener(this,"AbrirOrderByVentaPorLinea"));
			
			this.jButtonAbrirOrderByToolBarVentaPorLinea.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarVentaPorLinea"));			
			
			if(this.jInternalFrameOrderByVentaPorLinea!=null) {
				this.jInternalFrameOrderByVentaPorLinea.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVentaPorLinea"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVentaPorLinea.jTabbedPaneRelacionesVentaPorLinea.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVentaPorLinea"));
		
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
            		closingInternalFrameVentaPorLinea();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormVentaPorLinea.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormVentaPorLinea = (JInternalFrameBase)event.getSource();
	            	
	            VentaPorLineaBeanSwingJInternalFrame jInternalFrameParent=(VentaPorLineaBeanSwingJInternalFrame)jInternalFrameDetalleFormVentaPorLinea.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarVentaPorLineaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosVentaPorLinea.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosVentaPorLineaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosVentaPorLinea.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosVentaPorLinea.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentaPorLineaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentaPorLineaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentaPorLineaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoVentaPorLinea";
		inputMap = this.jButtonNuevoVentaPorLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoVentaPorLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVentaPorLineaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentaPorLineaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentaPorLineaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVentaPorLineaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesVentaPorLinea";
		inputMap = this.jButtonNuevoRelacionesVentaPorLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesVentaPorLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVentaPorLineaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarVentaPorLinea";
		inputMap = this.jButtonModificarVentaPorLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarVentaPorLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarVentaPorLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarVentaPorLinea";
		inputMap = this.jButtonActualizarVentaPorLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarVentaPorLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarVentaPorLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarVentaPorLinea";
		inputMap = this.jButtonEliminarVentaPorLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarVentaPorLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarVentaPorLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarVentaPorLinea";
		inputMap = this.jButtonCancelarVentaPorLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarVentaPorLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarVentaPorLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarVentaPorLinea";
		inputMap = this.jButtonCerrarVentaPorLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarVentaPorLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarVentaPorLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonGuardarCambiosVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosVentaPorLinea";
		inputMap = this.jInternalFrameDetalleFormVentaPorLinea.jButtonGuardarCambiosVentaPorLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonGuardarCambiosVentaPorLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosVentaPorLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosVentaPorLinea.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosVentaPorLineaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesVentaPorLinea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesVentaPorLineaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarVentaPorLinea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarVentaPorLineaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralVentaPorLinea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralVentaPorLineaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonidVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"idVentaPorLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_empresaVentaPorLineaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVentaPorLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_empresaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVentaPorLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_sucursalVentaPorLineaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVentaPorLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_sucursalVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVentaPorLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_productoVentaPorLineaUpdate.addActionListener(new ButtonActionListener(this,"id_productoVentaPorLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_productoVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_productoVentaPorLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_lineaVentaPorLineaUpdate.addActionListener(new ButtonActionListener(this,"id_lineaVentaPorLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_lineaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaVentaPorLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_linea_grupoVentaPorLineaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoVentaPorLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_linea_grupoVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoVentaPorLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_linea_categoriaVentaPorLineaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaVentaPorLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_linea_categoriaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaVentaPorLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_linea_marcaVentaPorLineaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaVentaPorLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonid_linea_marcaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonfecha_desdeVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonfecha_hastaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonnombre_productoVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonnombre_lineaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonnombre_grupoVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupoVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonnombre_categoriaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_categoriaVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonnombre_marcaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_marcaVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonfechaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"fechaVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonsecuencialVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"secuencialVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtoncantidadVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"cantidadVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonprecioVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"precioVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtondescuentoVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtonivaVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"ivaVentaPorLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVentaPorLinea.jButtoniceVentaPorLineaBusqueda.addActionListener(new ButtonActionListener(this,"iceVentaPorLineaBusqueda"));
		
		
		this.jButtonBusquedaVentaPorLineaVentaPorLinea.addActionListener(new ButtonActionListener(this,"BusquedaVentaPorLineaVentaPorLinea"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionVentaPorLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionVentaPorLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarVentaPorLineaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarVentaPorLinea.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosVentaPorLinea(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(VentaPorLinea ventaporlineaAux:this.ventaporlineaLogic.getVentaPorLineas()) {
					ventaporlineaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentaPorLinea ventaporlineaAux:ventaporlineas) {
					ventaporlineaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosVentaPorLineaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVentaPorLinea(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VentaPorLinea ventaporlineaAux:this.ventaporlineaLogic.getVentaPorLineas()) {
						ventaporlineaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentaPorLinea ventaporlineaAux:ventaporlineas) {
						ventaporlineaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(VentaPorLinea ventaporlineaAux:this.ventaporlineaLogic.getVentaPorLineas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentaPorLinea ventaporlineaAux:ventaporlineas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaVentaPorLinea(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVentaPorLinea.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVentaPorLinea.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosVentaPorLineaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVentaPorLinea(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosVentaPorLinea.getSelectedRows();
			
			VentaPorLinea ventaporlineaLocal=new VentaPorLinea();
			
			//this.seleccionarTodosVentaPorLinea(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ventaporlineaLocal =(VentaPorLinea) this.ventaporlineaLogic.getVentaPorLineas().toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					ventaporlineaLocal =(VentaPorLinea) this.ventaporlineas.toArray()[this.jTableDatosVentaPorLinea.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				ventaporlineaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VentaPorLinea ventaporlineaAux:this.ventaporlineaLogic.getVentaPorLineas()) {
						ventaporlineaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VentaPorLinea ventaporlineaAux:ventaporlineas) {
						ventaporlineaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaVentaPorLinea(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVentaPorLinea.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVentaPorLinea.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVentaPorLinea,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualVentaPorLineaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarVentaPorLineaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralVentaPorLineaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingVentaPorLinea(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralVentaPorLinea.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VentaPorLinea ventaporlineaAux:this.ventaporlineaLogic.getVentaPorLineas()) {
				
						if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							ventaporlineaAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							ventaporlineaAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							ventaporlineaAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							ventaporlineaAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_NOMBREGRUPO)) {
							existe=true;
							ventaporlineaAux.setnombre_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_NOMBRECATEGORIA)) {
							existe=true;
							ventaporlineaAux.setnombre_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_NOMBREMARCA)) {
							existe=true;
							ventaporlineaAux.setnombre_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							ventaporlineaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							ventaporlineaAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							ventaporlineaAux.setcantidad(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							ventaporlineaAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							ventaporlineaAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_IVA)) {
							existe=true;
							ventaporlineaAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_ICE)) {
							existe=true;
							ventaporlineaAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentaPorLinea ventaporlineaAux:ventaporlineas) {
					
						if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							ventaporlineaAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							ventaporlineaAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							ventaporlineaAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							ventaporlineaAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_NOMBREGRUPO)) {
							existe=true;
							ventaporlineaAux.setnombre_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_NOMBRECATEGORIA)) {
							existe=true;
							ventaporlineaAux.setnombre_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_NOMBREMARCA)) {
							existe=true;
							ventaporlineaAux.setnombre_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							ventaporlineaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							ventaporlineaAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							ventaporlineaAux.setcantidad(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							ventaporlineaAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							ventaporlineaAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_IVA)) {
							existe=true;
							ventaporlineaAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_ICE)) {
							existe=true;
							ventaporlineaAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaVentaPorLinea(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesVentaPorLineaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingVentaPorLinea(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioVentaPorLinea=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesVentaPorLinea.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxTiposAccionesFormularioVentaPorLinea.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteVentaPorLinea) {				
					conSplash=true;//false;										
					
					//this.startProcessVentaPorLinea(conSplash);
				
					this.generarReporteVentaPorLineasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentaPorLinea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxTiposAccionesFormularioVentaPorLinea.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoVentaPorLineasSeleccionados();
				//this.jComboBoxTiposAccionesVentaPorLinea.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVentaPorLineasSeleccionados(false);
				//this.jComboBoxTiposAccionesVentaPorLinea.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVentaPorLineasSeleccionados(true);
				//this.jComboBoxTiposAccionesVentaPorLinea.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVentaPorLinea();
				
				this.exportarVentaPorLineasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentaPorLinea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxTiposAccionesFormularioVentaPorLinea.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionVentaPorLineas();
				//this.importarVentaPorLineas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentaPorLinea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxTiposAccionesFormularioVentaPorLinea.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVentaPorLinea();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelVentaPorLineasSeleccionados();
				//this.jComboBoxTiposAccionesVentaPorLinea.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Venta Por Linea", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessVentaPorLinea();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoVentaPorLinea)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyVentaPorLinea(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Venta Por Linea",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVentaPorLinea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxTiposAccionesFormularioVentaPorLinea.setSelectedIndex(0);					
				}	
			} 			
			else if(VentaPorLineaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteVentaPorLinea) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessVentaPorLinea(conSplash);
					
						//this.actualizarParametrosGeneralVentaPorLinea();
						
						this.generarReporteProcesoAccionVentaPorLineasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesVentaPorLinea.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxTiposAccionesFormularioVentaPorLinea.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(VentaPorLineaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Venta Por LineaS SELECCIONADOS?", "MANTENIMIENTO DE Venta Por Linea", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessVentaPorLinea();
				
						this.actualizarParametrosGeneralVentaPorLinea();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.ventaporlineaReturnGeneral=ventaporlineaLogic.procesarAccionVentaPorLineasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.ventaporlineaLogic.getVentaPorLineas(),this.ventaporlineaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarVentaPorLineaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVentaPorLinea.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxTiposAccionesFormularioVentaPorLinea.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralVentaPorLinea();
					
					VentaPorLineaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarVentaPorLineaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVentaPorLinea.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxTiposAccionesFormularioVentaPorLinea.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessVentaPorLinea(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesVentaPorLineaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessVentaPorLinea();
			
			if(this.jInternalFrameDetalleFormVentaPorLinea==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<VentaPorLinea> ventaporlineasSeleccionados=new ArrayList<VentaPorLinea>();		
			VentaPorLinea ventaporlinea=new VentaPorLinea();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingVentaPorLinea(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesVentaPorLinea.getSelectedItem();
			
			
			
			
			ventaporlineasSeleccionados=this.getVentaPorLineasSeleccionados(true);
			//this.sTipoAccion;
			
			if(ventaporlineasSeleccionados.size()==1) {
				for(VentaPorLinea ventaporlineaAux:ventaporlineasSeleccionados) {
					ventaporlinea=ventaporlineaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessVentaPorLinea();
			
      		//this.finishProcessVentaPorLinea(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarVentaPorLineaReturnGeneral() throws Exception {
		if(this.ventaporlineaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.ventaporlineaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.ventaporlineaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.ventaporlineaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.ventaporlineaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.ventaporlineaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingVentaPorLinea(false);
		}
		
		if(this.ventaporlineaReturnGeneral.getConRetornoLista() || this.ventaporlineaReturnGeneral.getConRetornoObjeto()) {
			if(this.ventaporlineaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ventaporlineaLogic.setVentaPorLineas(this.ventaporlineaReturnGeneral.getVentaPorLineas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingVentaPorLinea(false);
		}
	}
	
	public void actualizarParametrosGeneralVentaPorLinea() throws Exception {
		
		
	}
	
	public ArrayList<VentaPorLinea> getVentaPorLineasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<VentaPorLinea> ventaporlineasSeleccionados=new ArrayList<VentaPorLinea>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioVentaPorLinea) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(VentaPorLinea ventaporlineaAux:ventaporlineaLogic.getVentaPorLineas()) {
					if(ventaporlineaAux.getIsSelected()) {
						ventaporlineasSeleccionados.add(ventaporlineaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VentaPorLinea ventaporlineaAux:this.ventaporlineas) {
					if(ventaporlineaAux.getIsSelected()) {
						ventaporlineasSeleccionados.add(ventaporlineaAux);				
					}
				}
			}
			
			if(ventaporlineasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						ventaporlineasSeleccionados.addAll(this.ventaporlineaLogic.getVentaPorLineas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						ventaporlineasSeleccionados.addAll(this.ventaporlineas);				
					}
				}
			}
		} else {
			ventaporlineasSeleccionados.add(this.ventaporlinea);
		}
		
		return ventaporlineasSeleccionados;
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
	
	public void generarReporteVentaPorLineasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalVentaPorLineasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoVentaPorLineasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVentaPorLineasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVentaPorLineasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Venta Por Linea",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesVentaPorLineasSeleccionados() throws Exception {
		ArrayList<VentaPorLinea> ventaporlineasSeleccionados=new ArrayList<VentaPorLinea>();		
		
		ventaporlineasSeleccionados=this.getVentaPorLineasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteVentaPorLineas("Todos",ventaporlineasSeleccionados);
		
	}	
	
	public void generarReporteNormalVentaPorLineasSeleccionados() throws Exception {
		ArrayList<VentaPorLinea> ventaporlineasSeleccionados=new ArrayList<VentaPorLinea>();		
		
		ventaporlineasSeleccionados=this.getVentaPorLineasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteVentaPorLineas("Todos",ventaporlineasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionVentaPorLineasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<VentaPorLinea> ventaporlineasSeleccionados=new ArrayList<VentaPorLinea>();
		
		ventaporlineasSeleccionados=this.getVentaPorLineasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteVentaPorLineas("Todos",ventaporlineasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoVentaPorLineasSeleccionados() throws Exception {
		ArrayList<VentaPorLinea> ventaporlineasSeleccionados=new ArrayList<VentaPorLinea>();		
		
		
		this.abrirInicializarFrameReporteDinamicoVentaPorLinea();
		
		
		ventaporlineasSeleccionados=this.getVentaPorLineasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoVentaPorLinea();
		
		
		//this.generarReporteVentaPorLineas("Todos",ventaporlineasSeleccionados ,ventaporlineaImplementable,ventaporlineaImplementableHome);
	}
	
	public void mostrarImportacionVentaPorLineas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionVentaPorLinea();
		
		this.abrirFrameImportacionVentaPorLinea();		
		
			
		//this.generarReporteVentaPorLineas("Todos",ventaporlineasSeleccionados ,ventaporlineaImplementable,ventaporlineaImplementableHome);
	}
	
	public void importarVentaPorLineas() throws Exception {		
	
	}
	
	public void exportarVentaPorLineasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelVentaPorLineasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoVentaPorLineasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlVentaPorLineasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Venta Por Linea",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoVentaPorLineasSeleccionados() throws Exception {
		ArrayList<VentaPorLinea> ventaporlineasSeleccionados=new ArrayList<VentaPorLinea>();		
		
		ventaporlineasSeleccionados=this.getVentaPorLineasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventaporlinea."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarVentaPorLinea(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(VentaPorLinea ventaporlineaAux:ventaporlineasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarVentaPorLinea(ventaporlineaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//ventaporlineaAux.setsDetalleGeneralEntityReporte(ventaporlineaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Venta Por Linea",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarVentaPorLinea(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_FECHADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_NOMBRELINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_NOMBREGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_NOMBRECATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_NOMBREMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_PRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_DESCUENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VentaPorLineaConstantesFunciones.LABEL_ICE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarVentaPorLinea(VentaPorLinea ventaporlinea,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=ventaporlinea.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getfecha_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getnombre_linea();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getnombre_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getnombre_categoria();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getnombre_marca();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getprecio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getdescuento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ventaporlinea.getice().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelVentaPorLineasSeleccionados() throws Exception {
		ArrayList<VentaPorLinea> ventaporlineasSeleccionados=new ArrayList<VentaPorLinea>();		
		
		ventaporlineasSeleccionados=this.getVentaPorLineasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventaporlinea.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("VentaPorLineas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelVentaPorLinea(row);				
				iRow++;
			}				
			
			for(VentaPorLinea ventaporlineaAux:ventaporlineasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelVentaPorLinea(ventaporlineaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Venta Por Linea",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlVentaPorLineasSeleccionados() throws Exception {
		ArrayList<VentaPorLinea> ventaporlineasSeleccionados=new ArrayList<VentaPorLinea>();		
		
		ventaporlineasSeleccionados=this.getVentaPorLineasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ventaporlinea.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("ventaporlineas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("ventaporlinea");
			//elementRoot.appendChild(element);
		
			for(VentaPorLinea ventaporlineaAux:ventaporlineasSeleccionados) {
				element = document.createElement("ventaporlinea");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlVentaPorLinea(ventaporlineaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Venta Por Linea",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelVentaPorLinea(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_FECHADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_NOMBRELINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_NOMBREGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_NOMBRECATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_NOMBREMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_PRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_DESCUENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(VentaPorLineaConstantesFunciones.LABEL_ICE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelVentaPorLinea(VentaPorLinea ventaporlinea,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getfecha_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getnombre_linea());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getnombre_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getnombre_categoria());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getnombre_marca());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getprecio());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getdescuento());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(ventaporlinea.getice());				
	}
	
	public void setFilaDatosExportarXmlVentaPorLinea(VentaPorLinea ventaporlinea,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VentaPorLineaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(ventaporlinea.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VentaPorLineaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(ventaporlinea.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(VentaPorLineaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(ventaporlinea.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(VentaPorLineaConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(ventaporlinea.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementproducto_descripcion = document.createElement(VentaPorLineaConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(ventaporlinea.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementlinea_descripcion = document.createElement(VentaPorLineaConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(ventaporlinea.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(VentaPorLineaConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(ventaporlinea.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(VentaPorLineaConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(ventaporlinea.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(VentaPorLineaConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(ventaporlinea.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementfecha_desde = document.createElement(VentaPorLineaConstantesFunciones.FECHADESDE);
		elementfecha_desde.appendChild(document.createTextNode(ventaporlinea.getfecha_desde().toString().trim()));
		element.appendChild(elementfecha_desde);

		Element elementfecha_hasta = document.createElement(VentaPorLineaConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(ventaporlinea.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementnombre_producto = document.createElement(VentaPorLineaConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(ventaporlinea.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementnombre_linea = document.createElement(VentaPorLineaConstantesFunciones.NOMBRELINEA);
		elementnombre_linea.appendChild(document.createTextNode(ventaporlinea.getnombre_linea().trim()));
		element.appendChild(elementnombre_linea);

		Element elementnombre_grupo = document.createElement(VentaPorLineaConstantesFunciones.NOMBREGRUPO);
		elementnombre_grupo.appendChild(document.createTextNode(ventaporlinea.getnombre_grupo().trim()));
		element.appendChild(elementnombre_grupo);

		Element elementnombre_categoria = document.createElement(VentaPorLineaConstantesFunciones.NOMBRECATEGORIA);
		elementnombre_categoria.appendChild(document.createTextNode(ventaporlinea.getnombre_categoria().trim()));
		element.appendChild(elementnombre_categoria);

		Element elementnombre_marca = document.createElement(VentaPorLineaConstantesFunciones.NOMBREMARCA);
		elementnombre_marca.appendChild(document.createTextNode(ventaporlinea.getnombre_marca().trim()));
		element.appendChild(elementnombre_marca);

		Element elementfecha = document.createElement(VentaPorLineaConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(ventaporlinea.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementsecuencial = document.createElement(VentaPorLineaConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(ventaporlinea.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementcantidad = document.createElement(VentaPorLineaConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(ventaporlinea.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementprecio = document.createElement(VentaPorLineaConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(ventaporlinea.getprecio().toString().trim()));
		element.appendChild(elementprecio);

		Element elementdescuento = document.createElement(VentaPorLineaConstantesFunciones.DESCUENTO);
		elementdescuento.appendChild(document.createTextNode(ventaporlinea.getdescuento().toString().trim()));
		element.appendChild(elementdescuento);

		Element elementiva = document.createElement(VentaPorLineaConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(ventaporlinea.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementice = document.createElement(VentaPorLineaConstantesFunciones.ICE);
		elementice.appendChild(document.createTextNode(ventaporlinea.getice().toString().trim()));
		element.appendChild(elementice);
	}
	
	public void generarReporteGroupGenericoVentaPorLineasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<VentaPorLinea> ventaporlineasSeleccionados=new ArrayList<VentaPorLinea>();
		
		ventaporlineasSeleccionados=this.getVentaPorLineasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoVentaPorLinea(ventaporlineasSeleccionados);
		
		this.generarReporteVentaPorLineas("Todos",ventaporlineasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoVentaPorLinea(ArrayList<VentaPorLinea> ventaporlineasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(VentaPorLinea ventaporlineaAux:ventaporlineasSeleccionados) {
				ventaporlineaAux.setsDetalleGeneralEntityReporte(ventaporlineaAux.toString());
			
				if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					ventaporlineaAux.setsDescripcionGeneralEntityReporte1(ventaporlineaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					ventaporlineaAux.setsDescripcionGeneralEntityReporte1(ventaporlineaAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					ventaporlineaAux.setsDescripcionGeneralEntityReporte1(ventaporlineaAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					ventaporlineaAux.setsDescripcionGeneralEntityReporte1(ventaporlineaAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					ventaporlineaAux.setsDescripcionGeneralEntityReporte1(ventaporlineaAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					ventaporlineaAux.setsDescripcionGeneralEntityReporte1(ventaporlineaAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					ventaporlineaAux.setsDescripcionGeneralEntityReporte1(ventaporlineaAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_FECHADESDE)) {
					existe=true;
					ventaporlineaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventaporlineaAux.getfecha_desde()));
				}
				 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					ventaporlineaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventaporlineaAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					ventaporlineaAux.setsDescripcionGeneralEntityReporte1(ventaporlineaAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_NOMBRELINEA)) {
					existe=true;
					ventaporlineaAux.setsDescripcionGeneralEntityReporte1(ventaporlineaAux.getnombre_linea());
				}
				 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_NOMBREGRUPO)) {
					existe=true;
					ventaporlineaAux.setsDescripcionGeneralEntityReporte1(ventaporlineaAux.getnombre_grupo());
				}
				 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_NOMBRECATEGORIA)) {
					existe=true;
					ventaporlineaAux.setsDescripcionGeneralEntityReporte1(ventaporlineaAux.getnombre_categoria());
				}
				 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_NOMBREMARCA)) {
					existe=true;
					ventaporlineaAux.setsDescripcionGeneralEntityReporte1(ventaporlineaAux.getnombre_marca());
				}
				 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					ventaporlineaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ventaporlineaAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(VentaPorLineaConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					ventaporlineaAux.setsDescripcionGeneralEntityReporte1(ventaporlineaAux.getsecuencial());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VentaPorLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesVentaPorLinea(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoVentaPorLinea=true;
				this.isVisibilidadCeldaNuevoRelacionesVentaPorLinea=true;
				this.isVisibilidadCeldaGuardarCambiosVentaPorLinea=true;
			}
			
			this.isVisibilidadCeldaModificarVentaPorLinea=false;
			this.isVisibilidadCeldaActualizarVentaPorLinea=false;
			this.isVisibilidadCeldaEliminarVentaPorLinea=false;
			this.isVisibilidadCeldaCancelarVentaPorLinea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentaPorLinea=true;
				} else {
					this.isVisibilidadCeldaGuardarVentaPorLinea=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoVentaPorLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesVentaPorLinea=false;
			this.isVisibilidadCeldaGuardarCambiosVentaPorLinea=false;
			this.isVisibilidadCeldaModificarVentaPorLinea=false;
			this.isVisibilidadCeldaActualizarVentaPorLinea=true;
			this.isVisibilidadCeldaEliminarVentaPorLinea=false;
			this.isVisibilidadCeldaCancelarVentaPorLinea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentaPorLinea=true;
				} else {
					this.isVisibilidadCeldaGuardarVentaPorLinea=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoVentaPorLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesVentaPorLinea=false;
			this.isVisibilidadCeldaGuardarCambiosVentaPorLinea=false;
			this.isVisibilidadCeldaModificarVentaPorLinea=false;
			this.isVisibilidadCeldaActualizarVentaPorLinea=true;
			this.isVisibilidadCeldaEliminarVentaPorLinea=true;
			this.isVisibilidadCeldaCancelarVentaPorLinea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentaPorLinea=true;
				} else {
					this.isVisibilidadCeldaGuardarVentaPorLinea=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoVentaPorLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesVentaPorLinea=false;
			this.isVisibilidadCeldaGuardarCambiosVentaPorLinea=false;
			this.isVisibilidadCeldaModificarVentaPorLinea=false;
			this.isVisibilidadCeldaActualizarVentaPorLinea=true;
			this.isVisibilidadCeldaEliminarVentaPorLinea=false;
			this.isVisibilidadCeldaCancelarVentaPorLinea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentaPorLinea=false;
				} else {
					this.isVisibilidadCeldaGuardarVentaPorLinea=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoVentaPorLinea=true;
			this.isVisibilidadCeldaNuevoRelacionesVentaPorLinea=true;
			this.isVisibilidadCeldaGuardarCambiosVentaPorLinea=true;
			this.isVisibilidadCeldaModificarVentaPorLinea=false;
			this.isVisibilidadCeldaActualizarVentaPorLinea=false;
			this.isVisibilidadCeldaEliminarVentaPorLinea=false;
			this.isVisibilidadCeldaCancelarVentaPorLinea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentaPorLinea=true;
				} else {
					this.isVisibilidadCeldaGuardarVentaPorLinea=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoVentaPorLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesVentaPorLinea=false;
			this.isVisibilidadCeldaGuardarCambiosVentaPorLinea=false;
			this.isVisibilidadCeldaActualizarVentaPorLinea=false;
			this.isVisibilidadCeldaEliminarVentaPorLinea=false;
			this.isVisibilidadCeldaCancelarVentaPorLinea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentaPorLinea=false;
				} else {
					this.isVisibilidadCeldaGuardarVentaPorLinea=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoVentaPorLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesVentaPorLinea=false;
			this.isVisibilidadCeldaGuardarCambiosVentaPorLinea=false;
			this.isVisibilidadCeldaModificarVentaPorLinea=true;
			this.isVisibilidadCeldaActualizarVentaPorLinea=false;
			this.isVisibilidadCeldaEliminarVentaPorLinea=false;
			this.isVisibilidadCeldaCancelarVentaPorLinea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVentaPorLinea=false;
				} else {
					this.isVisibilidadCeldaGuardarVentaPorLinea=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(VentaPorLineaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoVentaPorLinea=true;
			this.isVisibilidadCeldaNuevoRelacionesVentaPorLinea=true;
			this.isVisibilidadCeldaGuardarCambiosVentaPorLinea=true;
		} else {
			this.actualizarEstadoPanelsVentaPorLinea(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarVentaPorLinea=false;
			//this.isVisibilidadCeldaVerFormVentaPorLinea=false;
			this.isVisibilidadCeldaDuplicarVentaPorLinea=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!ventaporlineaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesVentaPorLinea=false;
		} else {
			this.isVisibilidadCeldaNuevoVentaPorLinea=false;
			this.isVisibilidadCeldaGuardarCambiosVentaPorLinea=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(ventaporlineaSessionBean.getEsGuardarRelacionado()) {
			if(!ventaporlineaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesVentaPorLinea=false;												
			}
			
			this.jButtonCerrarVentaPorLinea.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesVentaPorLinea=false;
		}
		
		if(!this.permiteMantenimiento(this.ventaporlinea)) {
			this.isVisibilidadCeldaActualizarVentaPorLinea=false;
			this.isVisibilidadCeldaEliminarVentaPorLinea=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoVentaPorLinea=false;
		this.isVisibilidadCeldaNuevoRelacionesVentaPorLinea=false;
		this.isVisibilidadCeldaGuardarCambiosVentaPorLinea=false;
		//this.isVisibilidadCeldaModificarVentaPorLinea=true;
		this.isVisibilidadCeldaActualizarVentaPorLinea=false;
		this.isVisibilidadCeldaEliminarVentaPorLinea=false;
		//this.isVisibilidadCeldaCancelarVentaPorLinea=true;			
		this.isVisibilidadCeldaGuardarVentaPorLinea=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesVentaPorLinea() {
	}
	
	public void actualizarEstadoPanelsVentaPorLinea(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionVentaPorLinea!=null) {
				this.jScrollPanelDatosEdicionVentaPorLinea.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentaPorLinea!=null) {
				this.jTabbedPaneBusquedasVentaPorLinea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentaPorLinea!=null) {
				this.jScrollPanelDatosVentaPorLinea.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentaPorLinea!=null) {
				this.jPanelPaginacionVentaPorLinea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentaPorLinea!=null) {
				this.jPanelParametrosReportesVentaPorLinea.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionVentaPorLinea!=null) {
				this.jScrollPanelDatosEdicionVentaPorLinea.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentaPorLinea!=null) {
				this.jTabbedPaneBusquedasVentaPorLinea.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosVentaPorLinea!=null) {
				this.jScrollPanelDatosVentaPorLinea.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentaPorLinea!=null) {
				this.jPanelPaginacionVentaPorLinea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentaPorLinea!=null) {
				this.jPanelParametrosReportesVentaPorLinea.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionVentaPorLinea!=null) {
				this.jScrollPanelDatosEdicionVentaPorLinea.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentaPorLinea!=null) {
				this.jTabbedPaneBusquedasVentaPorLinea.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVentaPorLinea!=null) {
				this.jScrollPanelDatosVentaPorLinea.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentaPorLinea!=null) {
				this.jPanelPaginacionVentaPorLinea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentaPorLinea!=null) {
				this.jPanelParametrosReportesVentaPorLinea.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionVentaPorLinea!=null) {
				this.jScrollPanelDatosEdicionVentaPorLinea.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentaPorLinea!=null) {
				this.jTabbedPaneBusquedasVentaPorLinea.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVentaPorLinea!=null) {
				this.jScrollPanelDatosVentaPorLinea.setVisible(false);
			}
			
			if(this.jPanelPaginacionVentaPorLinea!=null) {
				this.jPanelPaginacionVentaPorLinea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVentaPorLinea!=null) {
				this.jPanelParametrosReportesVentaPorLinea.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionVentaPorLinea!=null) {
				this.jScrollPanelDatosEdicionVentaPorLinea.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentaPorLinea!=null) {
				this.jTabbedPaneBusquedasVentaPorLinea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentaPorLinea!=null) {
				this.jScrollPanelDatosVentaPorLinea.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentaPorLinea!=null) {
				this.jPanelPaginacionVentaPorLinea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentaPorLinea!=null) {
				this.jPanelParametrosReportesVentaPorLinea.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionVentaPorLinea!=null) {
				this.jScrollPanelDatosEdicionVentaPorLinea.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentaPorLinea!=null) {
				this.jTabbedPaneBusquedasVentaPorLinea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentaPorLinea!=null) {
				this.jScrollPanelDatosVentaPorLinea.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentaPorLinea!=null) {
				this.jPanelPaginacionVentaPorLinea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentaPorLinea!=null) {
				this.jPanelParametrosReportesVentaPorLinea.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionVentaPorLinea!=null) {
				this.jScrollPanelDatosEdicionVentaPorLinea.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentaPorLinea!=null) {
				this.jTabbedPaneBusquedasVentaPorLinea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVentaPorLinea!=null) {
				this.jScrollPanelDatosVentaPorLinea.setVisible(true);
			}
			
			if(this.jPanelPaginacionVentaPorLinea!=null) {
				this.jPanelPaginacionVentaPorLinea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVentaPorLinea!=null) {
				this.jPanelParametrosReportesVentaPorLinea.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasVentaPorLinea!=null) {
					this.jTabbedPaneBusquedasVentaPorLinea.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesVentaPorLinea!=null) {
				this.jPanelParametrosReportesVentaPorLinea.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.ventaporlineaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVentaPorLinea!=null) {
				this.jTabbedPaneBusquedasVentaPorLinea.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesVentaPorLinea!=null) {
				this.jPanelParametrosReportesVentaPorLinea.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaVentaPorLinea=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaVentaPorLinea) {this.jTabbedPaneBusquedasVentaPorLinea.remove(jPanelBusquedaVentaPorLineaVentaPorLinea);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaVentaPorLinea=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaVentaPorLinea) {this.jTabbedPaneBusquedasVentaPorLinea.remove(jPanelBusquedaVentaPorLineaVentaPorLinea);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaVentaPorLinea=isParaProductoNegation;
			if(!this.isVisibilidadBusquedaVentaPorLinea) {this.jTabbedPaneBusquedasVentaPorLinea.remove(jPanelBusquedaVentaPorLineaVentaPorLinea);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaVentaPorLinea=isParaLineaNegation;
			if(!this.isVisibilidadBusquedaVentaPorLinea) {this.jTabbedPaneBusquedasVentaPorLinea.remove(jPanelBusquedaVentaPorLineaVentaPorLinea);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaVentaPorLinea=isParaLineaGrupoNegation;
			if(!this.isVisibilidadBusquedaVentaPorLinea) {this.jTabbedPaneBusquedasVentaPorLinea.remove(jPanelBusquedaVentaPorLineaVentaPorLinea);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaVentaPorLinea=isParaLineaCategoriaNegation;
			if(!this.isVisibilidadBusquedaVentaPorLinea) {this.jTabbedPaneBusquedasVentaPorLinea.remove(jPanelBusquedaVentaPorLineaVentaPorLinea);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaVentaPorLinea=isParaLineaMarcaNegation;
			if(!this.isVisibilidadBusquedaVentaPorLinea) {this.jTabbedPaneBusquedasVentaPorLinea.remove(jPanelBusquedaVentaPorLineaVentaPorLinea);}
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
			
			this.inicializarActualizarBindingTablaVentaPorLinea(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioVentaPorLinea() {
		this.updateBorderResaltarBusquedasFormularioVentaPorLinea();
		this.updateVisibilidadBusquedasFormularioVentaPorLinea();
		this.updateHabilitarBusquedasFormularioVentaPorLinea();
	}
	
	public void updateBorderResaltarBusquedasFormularioVentaPorLinea() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasVentaPorLinea.getComponents().length>0) {
	

		if(this.ventaporlineaConstantesFunciones.resaltarBusquedaVentaPorLineaVentaPorLinea!=null) {
			index= this.jTabbedPaneBusquedasVentaPorLinea.indexOfComponent(this.jPanelBusquedaVentaPorLineaVentaPorLinea);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVentaPorLinea.getComponent(index);
				jPanel.setBorder(this.ventaporlineaConstantesFunciones.resaltarBusquedaVentaPorLineaVentaPorLinea);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioVentaPorLinea() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasVentaPorLinea.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVentaPorLinea.indexOfComponent(this.jPanelBusquedaVentaPorLineaVentaPorLinea);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVentaPorLinea.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ventaporlineaConstantesFunciones.mostrarBusquedaVentaPorLineaVentaPorLinea);
			if(!this.ventaporlineaConstantesFunciones.mostrarBusquedaVentaPorLineaVentaPorLinea && index>-1) {
				this.jTabbedPaneBusquedasVentaPorLinea.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioVentaPorLinea() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasVentaPorLinea.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVentaPorLinea.indexOfComponent(this.jPanelBusquedaVentaPorLineaVentaPorLinea);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVentaPorLinea.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ventaporlineaConstantesFunciones.activarBusquedaVentaPorLineaVentaPorLinea);
				this.jTabbedPaneBusquedasVentaPorLinea.setEnabledAt(index,this.ventaporlineaConstantesFunciones.activarBusquedaVentaPorLineaVentaPorLinea);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaVentaPorLinea(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaVentaPorLinea")) {
			index= this.jTabbedPaneBusquedasVentaPorLinea.indexOfComponent(this.jPanelBusquedaVentaPorLineaVentaPorLinea);

			this.jTabbedPaneBusquedasVentaPorLinea.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVentaPorLinea.getComponent(index);

			this.ventaporlineaConstantesFunciones.setResaltarBusquedaVentaPorLineaVentaPorLinea(resaltar);

			jPanel.setBorder(this.ventaporlineaConstantesFunciones.resaltarBusquedaVentaPorLineaVentaPorLinea);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarVentaPorLinea.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioVentaPorLinea() throws Exception {

		if(this.jInternalFrameDetalleFormVentaPorLinea==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioVentaPorLinea();
		this.updateVisibilidadResaltarControlesFormularioVentaPorLinea();
		this.updateHabilitarResaltarControlesFormularioVentaPorLinea();
		
	}
	
	public void updateBorderResaltarControlesFormularioVentaPorLinea() throws Exception {
		if(this.jInternalFrameDetalleFormVentaPorLinea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.ventaporlineaConstantesFunciones.resaltaridVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jLabelidVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltaridVentaPorLinea);}
		if(this.ventaporlineaConstantesFunciones.resaltarid_empresaVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_empresaVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltarid_empresaVentaPorLinea);}
		if(this.ventaporlineaConstantesFunciones.resaltarid_sucursalVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_sucursalVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltarid_sucursalVentaPorLinea);}
		if(this.ventaporlineaConstantesFunciones.resaltarid_productoVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_productoVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltarid_productoVentaPorLinea);}
		if(this.ventaporlineaConstantesFunciones.resaltarid_lineaVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_lineaVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltarid_lineaVentaPorLinea);}
		if(this.ventaporlineaConstantesFunciones.resaltarid_linea_grupoVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_grupoVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltarid_linea_grupoVentaPorLinea);}
		if(this.ventaporlineaConstantesFunciones.resaltarid_linea_categoriaVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_categoriaVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltarid_linea_categoriaVentaPorLinea);}
		if(this.ventaporlineaConstantesFunciones.resaltarid_linea_marcaVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_marcaVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltarid_linea_marcaVentaPorLinea);}
		if(this.ventaporlineaConstantesFunciones.resaltarfecha_desdeVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jDateChooserfecha_desdeVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltarfecha_desdeVentaPorLinea);}
		if(this.ventaporlineaConstantesFunciones.resaltarfecha_hastaVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jDateChooserfecha_hastaVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltarfecha_hastaVentaPorLinea);}
		if(this.ventaporlineaConstantesFunciones.resaltarnombre_productoVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_productoVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltarnombre_productoVentaPorLinea);}
		if(this.ventaporlineaConstantesFunciones.resaltarnombre_lineaVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_lineaVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltarnombre_lineaVentaPorLinea);}
		if(this.ventaporlineaConstantesFunciones.resaltarnombre_grupoVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_grupoVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltarnombre_grupoVentaPorLinea);}
		if(this.ventaporlineaConstantesFunciones.resaltarnombre_categoriaVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_categoriaVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltarnombre_categoriaVentaPorLinea);}
		if(this.ventaporlineaConstantesFunciones.resaltarnombre_marcaVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_marcaVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltarnombre_marcaVentaPorLinea);}
		if(this.ventaporlineaConstantesFunciones.resaltarfechaVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jDateChooserfechaVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltarfechaVentaPorLinea);}
		if(this.ventaporlineaConstantesFunciones.resaltarsecuencialVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldsecuencialVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltarsecuencialVentaPorLinea);}
		if(this.ventaporlineaConstantesFunciones.resaltarcantidadVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldcantidadVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltarcantidadVentaPorLinea);}
		if(this.ventaporlineaConstantesFunciones.resaltarprecioVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldprecioVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltarprecioVentaPorLinea);}
		if(this.ventaporlineaConstantesFunciones.resaltardescuentoVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jTextFielddescuentoVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltardescuentoVentaPorLinea);}
		if(this.ventaporlineaConstantesFunciones.resaltarivaVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldivaVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltarivaVentaPorLinea);}
		if(this.ventaporlineaConstantesFunciones.resaltariceVentaPorLinea!=null && this.jInternalFrameDetalleFormVentaPorLinea!=null) {this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldiceVentaPorLinea.setBorder(this.ventaporlineaConstantesFunciones.resaltariceVentaPorLinea);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioVentaPorLinea() throws Exception {		
		if(this.jInternalFrameDetalleFormVentaPorLinea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
	
		//this.jInternalFrameDetalleFormVentaPorLinea.jLabelidVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostraridVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPanelidVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostraridVentaPorLinea);
		//this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_empresaVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarid_empresaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPanelid_empresaVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarid_empresaVentaPorLinea);
		//this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_sucursalVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarid_sucursalVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPanelid_sucursalVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarid_sucursalVentaPorLinea);
		//this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_productoVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarid_productoVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPanelid_productoVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarid_productoVentaPorLinea);
		//this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_lineaVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarid_lineaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPanelid_lineaVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarid_lineaVentaPorLinea);
		//this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_grupoVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarid_linea_grupoVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPanelid_linea_grupoVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarid_linea_grupoVentaPorLinea);
		//this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_categoriaVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarid_linea_categoriaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPanelid_linea_categoriaVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarid_linea_categoriaVentaPorLinea);
		//this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_marcaVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarid_linea_marcaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPanelid_linea_marcaVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarid_linea_marcaVentaPorLinea);
		//this.jInternalFrameDetalleFormVentaPorLinea.jDateChooserfecha_desdeVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarfecha_desdeVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPanelfecha_desdeVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarfecha_desdeVentaPorLinea);
		//this.jInternalFrameDetalleFormVentaPorLinea.jDateChooserfecha_hastaVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarfecha_hastaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPanelfecha_hastaVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarfecha_hastaVentaPorLinea);
		//this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_productoVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarnombre_productoVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPanelnombre_productoVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarnombre_productoVentaPorLinea);
		//this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_lineaVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarnombre_lineaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPanelnombre_lineaVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarnombre_lineaVentaPorLinea);
		//this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_grupoVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarnombre_grupoVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPanelnombre_grupoVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarnombre_grupoVentaPorLinea);
		//this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_categoriaVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarnombre_categoriaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPanelnombre_categoriaVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarnombre_categoriaVentaPorLinea);
		//this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_marcaVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarnombre_marcaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPanelnombre_marcaVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarnombre_marcaVentaPorLinea);
		//this.jInternalFrameDetalleFormVentaPorLinea.jDateChooserfechaVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarfechaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPanelfechaVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarfechaVentaPorLinea);
		//this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldsecuencialVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarsecuencialVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPanelsecuencialVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarsecuencialVentaPorLinea);
		//this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldcantidadVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarcantidadVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPanelcantidadVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarcantidadVentaPorLinea);
		//this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldprecioVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarprecioVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPanelprecioVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarprecioVentaPorLinea);
		//this.jInternalFrameDetalleFormVentaPorLinea.jTextFielddescuentoVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrardescuentoVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPaneldescuentoVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrardescuentoVentaPorLinea);
		//this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldivaVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarivaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPanelivaVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrarivaVentaPorLinea);
		//this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldiceVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrariceVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jPaneliceVentaPorLinea.setVisible(this.ventaporlineaConstantesFunciones.mostrariceVentaPorLinea);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioVentaPorLinea() throws Exception {
		if(this.jInternalFrameDetalleFormVentaPorLinea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVentaPorLinea!=null) {
	
		this.jInternalFrameDetalleFormVentaPorLinea.jLabelidVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activaridVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_empresaVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activarid_empresaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_sucursalVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activarid_sucursalVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_productoVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activarid_productoVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_lineaVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activarid_lineaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_grupoVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activarid_linea_grupoVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_categoriaVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activarid_linea_categoriaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jComboBoxid_linea_marcaVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activarid_linea_marcaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jDateChooserfecha_desdeVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activarfecha_desdeVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jDateChooserfecha_hastaVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activarfecha_hastaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_productoVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activarnombre_productoVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_lineaVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activarnombre_lineaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_grupoVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activarnombre_grupoVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_categoriaVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activarnombre_categoriaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextAreanombre_marcaVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activarnombre_marcaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jDateChooserfechaVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activarfechaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldsecuencialVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activarsecuencialVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldcantidadVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activarcantidadVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldprecioVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activarprecioVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextFielddescuentoVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activardescuentoVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldivaVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activarivaVentaPorLinea);
		this.jInternalFrameDetalleFormVentaPorLinea.jTextFieldiceVentaPorLinea.setEnabled(this.ventaporlineaConstantesFunciones.activariceVentaPorLinea);
		}
	}
	
		
}