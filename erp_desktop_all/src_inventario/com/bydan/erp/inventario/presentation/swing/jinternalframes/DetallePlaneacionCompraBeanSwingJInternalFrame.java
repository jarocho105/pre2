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

import com.bydan.erp.inventario.util.DetallePlaneacionCompraConstantesFunciones;
import com.bydan.erp.inventario.util.DetallePlaneacionCompraParameterReturnGeneral;
//import com.bydan.erp.inventario.util.DetallePlaneacionCompraParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.DetallePlaneacionCompraBean;
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
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class DetallePlaneacionCompraBeanSwingJInternalFrame extends DetallePlaneacionCompraJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetallePlaneacionCompraBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetallePlaneacionCompra> detalleplaneacioncompraValidator = new ClassValidator<DetallePlaneacionCompra>(DetallePlaneacionCompra.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetallePlaneacionCompra detalleplaneacioncompra;	
	public DetallePlaneacionCompra detalleplaneacioncompraAux;
	public DetallePlaneacionCompra detalleplaneacioncompraAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetallePlaneacionCompra detalleplaneacioncompraTotales;
	public Long idDetallePlaneacionCompraActual;
	public Long iIdNuevoDetallePlaneacionCompra=0L;
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

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
	}

	public String sFinalQueryComboPeriodo="";

	public List<Periodo> periodosForeignKey;

	public List<Periodo> getperiodosForeignKey() {
		return periodosForeignKey;
	}

	public void setperiodosForeignKey(List<Periodo> periodosForeignKey) {
		this.periodosForeignKey = periodosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Periodo periodoForeignKey;

	public Periodo getperiodoForeignKey() {
		return periodoForeignKey;
	}

	public void setperiodoForeignKey(Periodo periodoForeignKey) {
		this.periodoForeignKey = periodoForeignKey;
	}

	public String sFinalQueryComboPlaneacionCompra="";

	public List<PlaneacionCompra> planeacioncomprasForeignKey;

	public List<PlaneacionCompra> getplaneacioncomprasForeignKey() {
		return planeacioncomprasForeignKey;
	}

	public void setplaneacioncomprasForeignKey(List<PlaneacionCompra> planeacioncomprasForeignKey) {
		this.planeacioncomprasForeignKey = planeacioncomprasForeignKey;
	}

	//OBJETO FK ACTUAL
	public PlaneacionCompra planeacioncompraForeignKey;

	public PlaneacionCompra getplaneacioncompraForeignKey() {
		return planeacioncompraForeignKey;
	}

	public void setplaneacioncompraForeignKey(PlaneacionCompra planeacioncompraForeignKey) {
		this.planeacioncompraForeignKey = planeacioncompraForeignKey;
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

	public String sFinalQueryComboUnidad="";

	public List<Unidad> unidadsForeignKey;

	public List<Unidad> getunidadsForeignKey() {
		return unidadsForeignKey;
	}

	public void setunidadsForeignKey(List<Unidad> unidadsForeignKey) {
		this.unidadsForeignKey = unidadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Unidad unidadForeignKey;

	public Unidad getunidadForeignKey() {
		return unidadForeignKey;
	}

	public void setunidadForeignKey(Unidad unidadForeignKey) {
		this.unidadForeignKey = unidadForeignKey;
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
	
	public Boolean isPermisoTodoDetallePlaneacionCompra;
	public Boolean isPermisoNuevoDetallePlaneacionCompra;
	public Boolean isPermisoActualizarDetallePlaneacionCompra;
	public Boolean isPermisoActualizarOriginalDetallePlaneacionCompra;
	public Boolean isPermisoEliminarDetallePlaneacionCompra;
	public Boolean isPermisoGuardarCambiosDetallePlaneacionCompra;
	public Boolean isPermisoConsultaDetallePlaneacionCompra;
	public Boolean isPermisoBusquedaDetallePlaneacionCompra;
	public Boolean isPermisoReporteDetallePlaneacionCompra;
	public Boolean isPermisoPaginacionMedioDetallePlaneacionCompra;
	public Boolean isPermisoPaginacionAltoDetallePlaneacionCompra;
	public Boolean isPermisoPaginacionTodoDetallePlaneacionCompra;
	public Boolean isPermisoCopiarDetallePlaneacionCompra;
	public Boolean isPermisoVerFormDetallePlaneacionCompra;
	public Boolean isPermisoDuplicarDetallePlaneacionCompra;
	public Boolean isPermisoOrdenDetallePlaneacionCompra;
	
	
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
	
	public DetallePlaneacionCompraParameterReturnGeneral detalleplaneacioncompraReturnGeneral;
	public DetallePlaneacionCompraParameterReturnGeneral detalleplaneacioncompraParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetallePlaneacionCompra=false;
	public Boolean esParaAccionDesdeFormularioDetallePlaneacionCompra=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetallePlaneacionCompraSessionBeanAdditional detalleplaneacioncompraSessionBeanAdditional=null;
	
	public DetallePlaneacionCompraSessionBeanAdditional getDetallePlaneacionCompraSessionBeanAdditional() {
		return this.detalleplaneacioncompraSessionBeanAdditional;
	}
	
	public void setDetallePlaneacionCompraSessionBeanAdditional(DetallePlaneacionCompraSessionBeanAdditional detalleplaneacioncompraSessionBeanAdditional) {
		try {
			this.detalleplaneacioncompraSessionBeanAdditional=detalleplaneacioncompraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetallePlaneacionCompraBeanSwingJInternalFrameAdditional detalleplaneacioncompraBeanSwingJInternalFrameAdditional=null;
	//public class DetallePlaneacionCompraBeanSwingJInternalFrame
	
	public DetallePlaneacionCompraBeanSwingJInternalFrameAdditional getDetallePlaneacionCompraBeanSwingJInternalFrameAdditional() {
		return this.detalleplaneacioncompraBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetallePlaneacionCompraBeanSwingJInternalFrameAdditional(DetallePlaneacionCompraBeanSwingJInternalFrameAdditional detalleplaneacioncompraBeanSwingJInternalFrameAdditional) {
		try {
			this.detalleplaneacioncompraBeanSwingJInternalFrameAdditional=detalleplaneacioncompraBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetallePlaneacionCompraLogic detalleplaneacioncompraLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetallePlaneacionCompra detalleplaneacioncompraBean;
	public DetallePlaneacionCompraConstantesFunciones detalleplaneacioncompraConstantesFunciones;
	//public DetallePlaneacionCompraParameterReturnGeneral detalleplaneacioncompraReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public PlaneacionCompraLogic planeacioncompraLogic;
	public LineaLogic lineaLogic;
	public ProductoLogic productoLogic;
	public UnidadLogic unidadLogic;
	
	//PARAMETROS
	
	
	//public List<DetallePlaneacionCompra> detalleplaneacioncompras;	
	//public List<DetallePlaneacionCompra> detalleplaneacioncomprasEliminados;
	//public List<DetallePlaneacionCompra> detalleplaneacioncomprasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetallePlaneacionCompra=false;
	public Boolean isVisibilidadCeldaDuplicarDetallePlaneacionCompra=true;
	public Boolean isVisibilidadCeldaCopiarDetallePlaneacionCompra=true;
	public Boolean isVisibilidadCeldaVerFormDetallePlaneacionCompra=true;
	public Boolean isVisibilidadCeldaOrdenDetallePlaneacionCompra=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra=false;
	public Boolean isVisibilidadCeldaModificarDetallePlaneacionCompra=false;
	public Boolean isVisibilidadCeldaActualizarDetallePlaneacionCompra=false;
	public Boolean isVisibilidadCeldaEliminarDetallePlaneacionCompra=false;
	public Boolean isVisibilidadCeldaCancelarDetallePlaneacionCompra=false;
	public Boolean isVisibilidadCeldaGuardarDetallePlaneacionCompra=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra=false;	
	
	
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdPlaneacionCompra=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdUnidad=false;
	
	public Long getiIdNuevoDetallePlaneacionCompra() {
		return this.iIdNuevoDetallePlaneacionCompra;
	}

	public void setiIdNuevoDetallePlaneacionCompra(Long iIdNuevoDetallePlaneacionCompra) {
		this.iIdNuevoDetallePlaneacionCompra = iIdNuevoDetallePlaneacionCompra;
	}
	
	public Long getidDetallePlaneacionCompraActual() {
		return this.idDetallePlaneacionCompraActual;
	}

	public void setidDetallePlaneacionCompraActual(Long idDetallePlaneacionCompraActual) {
		this.idDetallePlaneacionCompraActual = idDetallePlaneacionCompraActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetallePlaneacionCompra getdetalleplaneacioncompra() {
		return this.detalleplaneacioncompra;
	}

	public void setdetalleplaneacioncompra(DetallePlaneacionCompra detalleplaneacioncompra) {
		this.detalleplaneacioncompra = detalleplaneacioncompra;
	}
	
	public DetallePlaneacionCompra getdetalleplaneacioncompraAux() {
		return this.detalleplaneacioncompraAux;
	}

	public void setdetalleplaneacioncompraAux(DetallePlaneacionCompra detalleplaneacioncompraAux) {
		this.detalleplaneacioncompraAux = detalleplaneacioncompraAux;
	}				
	
	public DetallePlaneacionCompra getdetalleplaneacioncompraAnterior() {
		return this.detalleplaneacioncompraAnterior;
	}

	public void setdetalleplaneacioncompraAnterior(DetallePlaneacionCompra detalleplaneacioncompraAnterior) {
		this.detalleplaneacioncompraAnterior = detalleplaneacioncompraAnterior;
	}	
	
	public DetallePlaneacionCompra getdetalleplaneacioncompraTotales() {
		return this.detalleplaneacioncompraTotales;
	}

	public void setdetalleplaneacioncompraTotales(DetallePlaneacionCompra detalleplaneacioncompraTotales) {
		this.detalleplaneacioncompraTotales = detalleplaneacioncompraTotales;
	}	
	
	public DetallePlaneacionCompra getdetalleplaneacioncompraBean() {
		return this.detalleplaneacioncompraBean;
	}

	public void setdetalleplaneacioncompraBean(DetallePlaneacionCompra detalleplaneacioncompraBean) {
		this.detalleplaneacioncompraBean = detalleplaneacioncompraBean;
	}	
	
	public DetallePlaneacionCompraParameterReturnGeneral getdetalleplaneacioncompraReturnGeneral() {
		return this.detalleplaneacioncompraReturnGeneral;
	}

	public void setdetalleplaneacioncompraReturnGeneral(DetallePlaneacionCompraParameterReturnGeneral detalleplaneacioncompraReturnGeneral) {
		this.detalleplaneacioncompraReturnGeneral = detalleplaneacioncompraReturnGeneral;
	}	
	
	
	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
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

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
	}

	public Long id_planeacion_compraFK_IdPlaneacionCompra=-1L;

	public Long getid_planeacion_compraFK_IdPlaneacionCompra() {
		return this.id_planeacion_compraFK_IdPlaneacionCompra;
	}

	public void setid_planeacion_compraFK_IdPlaneacionCompra(Long id_planeacion_compraFK_IdPlaneacionCompra) {
		this.id_planeacion_compraFK_IdPlaneacionCompra = id_planeacion_compraFK_IdPlaneacionCompra;
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

	public Long id_unidadFK_IdUnidad=-1L;

	public Long getid_unidadFK_IdUnidad() {
		return this.id_unidadFK_IdUnidad;
	}

	public void setid_unidadFK_IdUnidad(Long id_unidadFK_IdUnidad) {
		this.id_unidadFK_IdUnidad = id_unidadFK_IdUnidad;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DetallePlaneacionCompraLogic getDetallePlaneacionCompraLogic()	{		
		return detalleplaneacioncompraLogic;
	}

	public void setDetallePlaneacionCompraLogic(DetallePlaneacionCompraLogic detalleplaneacioncompraLogic) {
		this.detalleplaneacioncompraLogic = detalleplaneacioncompraLogic;
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
	
	public Boolean getIsEsNuevoDetallePlaneacionCompra() {
		return isEsNuevoDetallePlaneacionCompra;
	}

	public void setIsEsNuevoDetallePlaneacionCompra(Boolean isEsNuevoDetallePlaneacionCompra) {
		this.isEsNuevoDetallePlaneacionCompra = isEsNuevoDetallePlaneacionCompra;
	}

	public Boolean getEsParaAccionDesdeFormularioDetallePlaneacionCompra() {
		return esParaAccionDesdeFormularioDetallePlaneacionCompra;
	}
	
	public void setEsParaAccionDesdeFormularioDetallePlaneacionCompra(Boolean esParaAccionDesdeFormularioDetallePlaneacionCompra) {
		this.esParaAccionDesdeFormularioDetallePlaneacionCompra = esParaAccionDesdeFormularioDetallePlaneacionCompra;
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

			if(this.detalleplaneacioncompraSessionBean==null) {
				this.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
			}

			if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detalleplaneacioncompraSessionBean.getlidEmpresaActual());
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

			if(this.detalleplaneacioncompraSessionBean==null) {
				this.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
			}

			if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(detalleplaneacioncompraSessionBean.getlidSucursalActual());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.detalleplaneacioncompraSessionBean==null) {
				this.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
			}

			if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(detalleplaneacioncompraSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

	public void cargarCombosPeriodosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periodosForeignKey=new ArrayList<Periodo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoLogic periodoLogic=new PeriodoLogic();

			//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

			if(this.detalleplaneacioncompraSessionBean==null) {
				this.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
			}

			if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

					periodoLogic.getTodosPeriodosWithConnection(sFinalQuery,new Pagination());

					this.periodosForeignKey=periodoLogic.getPeriodos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getEntityWithConnection(detalleplaneacioncompraSessionBean.getlidPeriodoActual());
					this.periodosForeignKey.add(periodoLogic.getPeriodo());
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

	public void cargarCombosPlaneacionComprasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.planeacioncomprasForeignKey=new ArrayList<PlaneacionCompra>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PlaneacionCompraLogic planeacioncompraLogic=new PlaneacionCompraLogic();

			//planeacioncompraLogic.getPlaneacionCompraDataAccess().setIsForForeingKeyData(true);

			if(this.detalleplaneacioncompraSessionBean==null) {
				this.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
			}

			if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionPlaneacionCompra()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//planeacioncompraLogic.getPlaneacionCompraDataAccess().setIsForForeingKeyData(true);

					planeacioncompraLogic.getTodosPlaneacionComprasWithConnection(sFinalQuery,new Pagination());

					this.planeacioncomprasForeignKey=planeacioncompraLogic.getPlaneacionCompras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPlaneacionCompra(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					planeacioncompraLogic.getEntityWithConnection(detalleplaneacioncompraSessionBean.getlidPlaneacionCompraActual());
					this.planeacioncomprasForeignKey.add(planeacioncompraLogic.getPlaneacionCompra());
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

			if(this.detalleplaneacioncompraSessionBean==null) {
				this.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
			}

			if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(detalleplaneacioncompraSessionBean.getlidLineaActual());
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

			if(this.detalleplaneacioncompraSessionBean==null) {
				this.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
			}

			if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(detalleplaneacioncompraSessionBean.getlidProductoActual());
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

	public void cargarCombosUnidadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.unidadsForeignKey=new ArrayList<Unidad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UnidadLogic unidadLogic=new UnidadLogic();

			//unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

			if(this.detalleplaneacioncompraSessionBean==null) {
				this.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
			}

			if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

					unidadLogic.getTodosUnidadsWithConnection(sFinalQuery,new Pagination());

					this.unidadsForeignKey=unidadLogic.getUnidads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUnidad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					unidadLogic.getEntityWithConnection(detalleplaneacioncompraSessionBean.getlidUnidadActual());
					this.unidadsForeignKey.add(unidadLogic.getUnidad());
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

					if(this.detalleplaneacioncompra!=null) {
						this.detalleplaneacioncompra.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
						this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_empresaDetallePlaneacionCompra.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetallePlaneacionCompra.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_empresaDetallePlaneacionCompra.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_empresaDetallePlaneacionCompra.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetallePlaneacionCompraGenerico)throws Exception
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
				jComboBoxid_empresaDetallePlaneacionCompraGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetallePlaneacionCompraGenerico!=null && jComboBoxid_empresaDetallePlaneacionCompraGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetallePlaneacionCompraGenerico.setSelectedIndex(0);
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

					if(this.detalleplaneacioncompra!=null) {
						this.detalleplaneacioncompra.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
						this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_sucursalDetallePlaneacionCompra.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDetallePlaneacionCompra.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_sucursalDetallePlaneacionCompra.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_sucursalDetallePlaneacionCompra.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDetallePlaneacionCompraGenerico)throws Exception
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
				jComboBoxid_sucursalDetallePlaneacionCompraGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDetallePlaneacionCompraGenerico!=null && jComboBoxid_sucursalDetallePlaneacionCompraGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDetallePlaneacionCompraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.detalleplaneacioncompra!=null) {
						this.detalleplaneacioncompra.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
						this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_ejercicioDetallePlaneacionCompra.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioDetallePlaneacionCompra.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_ejercicioDetallePlaneacionCompra.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_ejercicioDetallePlaneacionCompra.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioDetallePlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioDetallePlaneacionCompraGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioDetallePlaneacionCompraGenerico!=null && jComboBoxid_ejercicioDetallePlaneacionCompraGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioDetallePlaneacionCompraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoForeignKey(Long idPeriodoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periodoTemp!=null) {

					if(this.detalleplaneacioncompra!=null) {
						this.detalleplaneacioncompra.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
						this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_periodoDetallePlaneacionCompra.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoDetallePlaneacionCompra.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_periodoDetallePlaneacionCompra.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_periodoDetallePlaneacionCompra.setSelectedIndex(0);
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

	public String getActualPeriodoForeignKeyDescripcion(Long idPeriodoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}


			sDescripcion=PeriodoConstantesFunciones.getPeriodoDescripcion(periodoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoDetallePlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(periodoTemp!=null) {
				jComboBoxid_periodoDetallePlaneacionCompraGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoDetallePlaneacionCompraGenerico!=null && jComboBoxid_periodoDetallePlaneacionCompraGenerico.getItemCount()>0) {
					jComboBoxid_periodoDetallePlaneacionCompraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPlaneacionCompraForeignKey(Long idPlaneacionCompraSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			PlaneacionCompra  planeacioncompraTemp=null;

			for(PlaneacionCompra planeacioncompraAux:planeacioncomprasForeignKey) {
				if(planeacioncompraAux.getId()!=null && planeacioncompraAux.getId().equals(idPlaneacionCompraSeleccionado)) {
					planeacioncompraTemp=planeacioncompraAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(planeacioncompraTemp!=null) {

					if(this.detalleplaneacioncompra!=null) {
						this.detalleplaneacioncompra.setPlaneacionCompra(planeacioncompraTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
						this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_planeacion_compraDetallePlaneacionCompra.setSelectedItem(planeacioncompraTemp);
					}
				} else {
					//jComboBoxid_planeacion_compraDetallePlaneacionCompra.setSelectedItem(planeacioncompraTemp);
					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_planeacion_compraDetallePlaneacionCompra.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_planeacion_compraDetallePlaneacionCompra.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPlaneacionCompra") || sFormularioTipoBusqueda.equals("Todos")){
					if(planeacioncompraTemp!=null && jComboBoxid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra!=null) {
						jComboBoxid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra.setSelectedItem(planeacioncompraTemp);
					} else {
						if(jComboBoxid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra!=null) {
							//jComboBoxid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra.setSelectedItem(planeacioncompraTemp);
							if(jComboBoxid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra.getItemCount()>0) {
								jComboBoxid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra.setSelectedIndex(0);
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

	public String getActualPlaneacionCompraForeignKeyDescripcion(Long idPlaneacionCompraSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			PlaneacionCompra  planeacioncompraTemp=null;

			for(PlaneacionCompra planeacioncompraAux:planeacioncomprasForeignKey) {
				if(planeacioncompraAux.getId()!=null && planeacioncompraAux.getId().equals(idPlaneacionCompraSeleccionado)) {
					planeacioncompraTemp=planeacioncompraAux;
					break;
				}
			}


			sDescripcion=PlaneacionCompraConstantesFunciones.getPlaneacionCompraDescripcion(planeacioncompraTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPlaneacionCompraForeignKeyGenerico(Long idPlaneacionCompraSeleccionado,JComboBox jComboBoxid_planeacion_compraDetallePlaneacionCompraGenerico)throws Exception
	{
		try
		{
			PlaneacionCompra  planeacioncompraTemp=null;

			for(PlaneacionCompra planeacioncompraAux:planeacioncomprasForeignKey) {
				if(planeacioncompraAux.getId()!=null && planeacioncompraAux.getId().equals(idPlaneacionCompraSeleccionado)) {
					planeacioncompraTemp=planeacioncompraAux;
					break;
				}
			}

			if(planeacioncompraTemp!=null) {
				jComboBoxid_planeacion_compraDetallePlaneacionCompraGenerico.setSelectedItem(planeacioncompraTemp);
			} else {
				if(jComboBoxid_planeacion_compraDetallePlaneacionCompraGenerico!=null && jComboBoxid_planeacion_compraDetallePlaneacionCompraGenerico.getItemCount()>0) {
					jComboBoxid_planeacion_compraDetallePlaneacionCompraGenerico.setSelectedIndex(0);
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

					if(this.detalleplaneacioncompra!=null) {
						this.detalleplaneacioncompra.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
						this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_lineaDetallePlaneacionCompra.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaDetallePlaneacionCompra.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_lineaDetallePlaneacionCompra.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_lineaDetallePlaneacionCompra.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdLinea") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaFK_IdLineaDetallePlaneacionCompra!=null) {
						jComboBoxid_lineaFK_IdLineaDetallePlaneacionCompra.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaFK_IdLineaDetallePlaneacionCompra!=null) {
							//jComboBoxid_lineaFK_IdLineaDetallePlaneacionCompra.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaFK_IdLineaDetallePlaneacionCompra.getItemCount()>0) {
								jComboBoxid_lineaFK_IdLineaDetallePlaneacionCompra.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaDetallePlaneacionCompraGenerico)throws Exception
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
				jComboBoxid_lineaDetallePlaneacionCompraGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaDetallePlaneacionCompraGenerico!=null && jComboBoxid_lineaDetallePlaneacionCompraGenerico.getItemCount()>0) {
					jComboBoxid_lineaDetallePlaneacionCompraGenerico.setSelectedIndex(0);
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

					if(this.detalleplaneacioncompra!=null) {
						this.detalleplaneacioncompra.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
						this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_productoDetallePlaneacionCompra.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoDetallePlaneacionCompra.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_productoDetallePlaneacionCompra.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_productoDetallePlaneacionCompra.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoDetallePlaneacionCompra!=null) {
						jComboBoxid_productoFK_IdProductoDetallePlaneacionCompra.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoDetallePlaneacionCompra!=null) {
							//jComboBoxid_productoFK_IdProductoDetallePlaneacionCompra.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoDetallePlaneacionCompra.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoDetallePlaneacionCompra.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoDetallePlaneacionCompraGenerico)throws Exception
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
				jComboBoxid_productoDetallePlaneacionCompraGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoDetallePlaneacionCompraGenerico!=null && jComboBoxid_productoDetallePlaneacionCompraGenerico.getItemCount()>0) {
					jComboBoxid_productoDetallePlaneacionCompraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUnidadForeignKey(Long idUnidadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(unidadTemp!=null) {

					if(this.detalleplaneacioncompra!=null) {
						this.detalleplaneacioncompra.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
						this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_unidadDetallePlaneacionCompra.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadDetallePlaneacionCompra.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_unidadDetallePlaneacionCompra.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_unidadDetallePlaneacionCompra.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadDetallePlaneacionCompra!=null) {
						jComboBoxid_unidadFK_IdUnidadDetallePlaneacionCompra.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadDetallePlaneacionCompra!=null) {
							//jComboBoxid_unidadFK_IdUnidadDetallePlaneacionCompra.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadDetallePlaneacionCompra.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadDetallePlaneacionCompra.setSelectedIndex(0);
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

	public String getActualUnidadForeignKeyDescripcion(Long idUnidadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}


			sDescripcion=UnidadConstantesFunciones.getUnidadDescripcion(unidadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadDetallePlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}

			if(unidadTemp!=null) {
				jComboBoxid_unidadDetallePlaneacionCompraGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadDetallePlaneacionCompraGenerico!=null && jComboBoxid_unidadDetallePlaneacionCompraGenerico.getItemCount()>0) {
					jComboBoxid_unidadDetallePlaneacionCompraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetallePlaneacionCompra detalleplaneacioncompra,JComboBox jComboBoxid_empresaDetallePlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetallePlaneacionCompraGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_empresaDetallePlaneacionCompra.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetallePlaneacionCompraGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detalleplaneacioncompra.setid_empresa(empresaAux.getId());
				detalleplaneacioncompra.setempresa_descripcion(DetallePlaneacionCompraConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detalleplaneacioncompra.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DetallePlaneacionCompra detalleplaneacioncompra,JComboBox jComboBoxid_sucursalDetallePlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDetallePlaneacionCompraGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_sucursalDetallePlaneacionCompra.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDetallePlaneacionCompraGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				detalleplaneacioncompra.setid_sucursal(sucursalAux.getId());
				detalleplaneacioncompra.setsucursal_descripcion(DetallePlaneacionCompraConstantesFunciones.getSucursalDescripcion(sucursalAux));
				detalleplaneacioncompra.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(DetallePlaneacionCompra detalleplaneacioncompra,JComboBox jComboBoxid_ejercicioDetallePlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioDetallePlaneacionCompraGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_ejercicioDetallePlaneacionCompra.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioDetallePlaneacionCompraGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				detalleplaneacioncompra.setid_ejercicio(ejercicioAux.getId());
				detalleplaneacioncompra.setejercicio_descripcion(DetallePlaneacionCompraConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				detalleplaneacioncompra.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(DetallePlaneacionCompra detalleplaneacioncompra,JComboBox jComboBoxid_periodoDetallePlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoDetallePlaneacionCompraGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_periodoDetallePlaneacionCompra.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoDetallePlaneacionCompraGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				detalleplaneacioncompra.setid_periodo(periodoAux.getId());
				detalleplaneacioncompra.setperiodo_descripcion(DetallePlaneacionCompraConstantesFunciones.getPeriodoDescripcion(periodoAux));
				detalleplaneacioncompra.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPlaneacionCompraForeignKey(DetallePlaneacionCompra detalleplaneacioncompra,JComboBox jComboBoxid_planeacion_compraDetallePlaneacionCompraGenerico)throws Exception
	{
		try
		{
			PlaneacionCompra  planeacioncompraAux=new PlaneacionCompra();

			if(jComboBoxid_planeacion_compraDetallePlaneacionCompraGenerico==null) {
				planeacioncompraAux=(PlaneacionCompra)this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_planeacion_compraDetallePlaneacionCompra.getSelectedItem();
			} else {
				planeacioncompraAux=(PlaneacionCompra)jComboBoxid_planeacion_compraDetallePlaneacionCompraGenerico.getSelectedItem();
			}

			if(planeacioncompraAux!=null && planeacioncompraAux.getId()!=null) {
				detalleplaneacioncompra.setid_planeacion_compra(planeacioncompraAux.getId());
				detalleplaneacioncompra.setplaneacioncompra_descripcion(DetallePlaneacionCompraConstantesFunciones.getPlaneacionCompraDescripcion(planeacioncompraAux));
				detalleplaneacioncompra.setPlaneacionCompra(planeacioncompraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(DetallePlaneacionCompra detalleplaneacioncompra,JComboBox jComboBoxid_lineaDetallePlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaDetallePlaneacionCompraGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_lineaDetallePlaneacionCompra.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaDetallePlaneacionCompraGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				detalleplaneacioncompra.setid_linea(lineaAux.getId());
				detalleplaneacioncompra.setlinea_descripcion(DetallePlaneacionCompraConstantesFunciones.getLineaDescripcion(lineaAux));
				detalleplaneacioncompra.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(DetallePlaneacionCompra detalleplaneacioncompra,JComboBox jComboBoxid_productoDetallePlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoDetallePlaneacionCompraGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_productoDetallePlaneacionCompra.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoDetallePlaneacionCompraGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				detalleplaneacioncompra.setid_producto(productoAux.getId());
				detalleplaneacioncompra.setproducto_descripcion(DetallePlaneacionCompraConstantesFunciones.getProductoDescripcion(productoAux));
				detalleplaneacioncompra.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(DetallePlaneacionCompra detalleplaneacioncompra,JComboBox jComboBoxid_unidadDetallePlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadDetallePlaneacionCompraGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_unidadDetallePlaneacionCompra.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadDetallePlaneacionCompraGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				detalleplaneacioncompra.setid_unidad(unidadAux.getId());
				detalleplaneacioncompra.setunidad_descripcion(DetallePlaneacionCompraConstantesFunciones.getUnidadDescripcion(unidadAux));
				detalleplaneacioncompra.setUnidad(unidadAux);			}
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

					if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { 
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_empresaDetallePlaneacionCompra.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_empresaDetallePlaneacionCompra.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { 
					}

					if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { 
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_sucursalDetallePlaneacionCompra.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_sucursalDetallePlaneacionCompra.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { 
					}

					if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { 
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_ejercicioDetallePlaneacionCompra.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_ejercicioDetallePlaneacionCompra.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { 
					}

					if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { 
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_periodoDetallePlaneacionCompra.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_periodoDetallePlaneacionCompra.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { 
					}

					if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePlaneacionComprasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPlaneacionCompra=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { 
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_planeacion_compraDetallePlaneacionCompra.removeAllItems();

							for(PlaneacionCompra planeacioncompra:this.planeacioncomprasForeignKey) {
								this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_planeacion_compraDetallePlaneacionCompra.addItem(planeacioncompra);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { 
					}

					if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPlaneacionCompra") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra.removeAllItems();

							for(PlaneacionCompra planeacioncompra:this.planeacioncomprasForeignKey) {
								this.jComboBoxid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra.addItem(planeacioncompra);
							}
						}

						if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { 
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_lineaDetallePlaneacionCompra.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_lineaDetallePlaneacionCompra.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { 
					}

					if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdLinea") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaFK_IdLineaDetallePlaneacionCompra.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaFK_IdLineaDetallePlaneacionCompra.addItem(linea);
							}
						}

						if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { 
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_productoDetallePlaneacionCompra.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_productoDetallePlaneacionCompra.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { 
					}

					if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoDetallePlaneacionCompra.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoDetallePlaneacionCompra.addItem(producto);
							}
						}

						if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUnidadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUnidad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { 
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_unidadDetallePlaneacionCompra.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_unidadDetallePlaneacionCompra.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { 
					}

					if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadDetallePlaneacionCompra.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadDetallePlaneacionCompra.addItem(unidad);
							}
						}

						if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_empresaDetallePlaneacionCompra.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_empresaDetallePlaneacionCompra.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_sucursalDetallePlaneacionCompra.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_sucursalDetallePlaneacionCompra.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_ejercicioDetallePlaneacionCompra.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_ejercicioDetallePlaneacionCompra.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_periodoDetallePlaneacionCompra.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_periodoDetallePlaneacionCompra.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePlaneacionCompraForeignKey(PlaneacionCompra planeacioncompra,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_planeacion_compraDetallePlaneacionCompra.setSelectedItem(planeacioncompra);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_planeacion_compraDetallePlaneacionCompra.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra.setSelectedItem(planeacioncompra);
						} else {
							this.jComboBoxid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_lineaDetallePlaneacionCompra.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_lineaDetallePlaneacionCompra.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaFK_IdLineaDetallePlaneacionCompra.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaFK_IdLineaDetallePlaneacionCompra.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_productoDetallePlaneacionCompra.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_productoDetallePlaneacionCompra.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoDetallePlaneacionCompra.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoDetallePlaneacionCompra.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameUnidadForeignKey(Unidad unidad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_unidadDetallePlaneacionCompra.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_unidadDetallePlaneacionCompra.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadDetallePlaneacionCompra.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadDetallePlaneacionCompra.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetallePlaneacionCompra() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetallePlaneacionCompraConstantesFunciones.refrescarForeignKeysDescripcionesDetallePlaneacionCompra(this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetallePlaneacionCompraConstantesFunciones.refrescarForeignKeysDescripcionesDetallePlaneacionCompra(this.detalleplaneacioncompras);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(PlaneacionCompra.class));
		classes.add(new Classe(Linea.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detalleplaneacioncompraLogic.setDetallePlaneacionCompras(this.detalleplaneacioncompras);
			detalleplaneacioncompraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetallePlaneacionCompraParameterReturnGeneral getDetallePlaneacionCompraParameterGeneral() {
		return this.detalleplaneacioncompraParameterGeneral;
	}
	
	public void setDetallePlaneacionCompraParameterGeneral(DetallePlaneacionCompraParameterReturnGeneral detalleplaneacioncompraParameterGeneral) {
		this.detalleplaneacioncompraParameterGeneral = detalleplaneacioncompraParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetallePlaneacionCompra() {
		return isPermisoTodoDetallePlaneacionCompra;
	}

	public void setIsPermisoTodoDetallePlaneacionCompra(Boolean isPermisoTodoDetallePlaneacionCompra) {
		this.isPermisoTodoDetallePlaneacionCompra = isPermisoTodoDetallePlaneacionCompra;
	}

	public Boolean getIsPermisoNuevoDetallePlaneacionCompra() {
		return isPermisoNuevoDetallePlaneacionCompra;
	}

	public void setIsPermisoNuevoDetallePlaneacionCompra(Boolean isPermisoNuevoDetallePlaneacionCompra) {
		this.isPermisoNuevoDetallePlaneacionCompra = isPermisoNuevoDetallePlaneacionCompra;
	}

	public Boolean getIsPermisoActualizarDetallePlaneacionCompra() {
		return isPermisoActualizarDetallePlaneacionCompra;
	}

	public void setIsPermisoActualizarDetallePlaneacionCompra(Boolean isPermisoActualizarDetallePlaneacionCompra) {
		this.isPermisoActualizarDetallePlaneacionCompra = isPermisoActualizarDetallePlaneacionCompra;
	}

	public Boolean getIsPermisoEliminarDetallePlaneacionCompra() {
		return isPermisoEliminarDetallePlaneacionCompra;
	}

	public void setIsPermisoEliminarDetallePlaneacionCompra(Boolean isPermisoEliminarDetallePlaneacionCompra) {
		this.isPermisoEliminarDetallePlaneacionCompra = isPermisoEliminarDetallePlaneacionCompra;
	}

	public Boolean getIsPermisoGuardarCambiosDetallePlaneacionCompra() {
		return isPermisoGuardarCambiosDetallePlaneacionCompra;
	}

	public void setIsPermisoGuardarCambiosDetallePlaneacionCompra(Boolean isPermisoGuardarCambiosDetallePlaneacionCompra) {
		this.isPermisoGuardarCambiosDetallePlaneacionCompra = isPermisoGuardarCambiosDetallePlaneacionCompra;
	}
	
	public Boolean getIsPermisoConsultaDetallePlaneacionCompra() {
		return isPermisoConsultaDetallePlaneacionCompra;
	}

	public void setIsPermisoConsultaDetallePlaneacionCompra(Boolean isPermisoConsultaDetallePlaneacionCompra) {
		this.isPermisoConsultaDetallePlaneacionCompra = isPermisoConsultaDetallePlaneacionCompra;
	}

	public Boolean getIsPermisoBusquedaDetallePlaneacionCompra() {
		return isPermisoBusquedaDetallePlaneacionCompra;
	}

	public void setIsPermisoBusquedaDetallePlaneacionCompra(Boolean isPermisoBusquedaDetallePlaneacionCompra) {
		this.isPermisoBusquedaDetallePlaneacionCompra = isPermisoBusquedaDetallePlaneacionCompra;
	}

	public Boolean getIsPermisoReporteDetallePlaneacionCompra() {
		return isPermisoReporteDetallePlaneacionCompra;
	}

	public void setIsPermisoReporteDetallePlaneacionCompra(Boolean isPermisoReporteDetallePlaneacionCompra) {
		this.isPermisoReporteDetallePlaneacionCompra = isPermisoReporteDetallePlaneacionCompra;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetallePlaneacionCompra() {
		return isPermisoPaginacionMedioDetallePlaneacionCompra;
	}

	public void setIsPermisoPaginacionMedioDetallePlaneacionCompra(Boolean isPermisoPaginacionMedioDetallePlaneacionCompra) {
		this.isPermisoPaginacionMedioDetallePlaneacionCompra = isPermisoPaginacionMedioDetallePlaneacionCompra;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetallePlaneacionCompra() {
		return isPermisoPaginacionTodoDetallePlaneacionCompra;
	}

	public void setIsPermisoPaginacionTodoDetallePlaneacionCompra(Boolean isPermisoPaginacionTodoDetallePlaneacionCompra) {
		this.isPermisoPaginacionTodoDetallePlaneacionCompra = isPermisoPaginacionTodoDetallePlaneacionCompra;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetallePlaneacionCompra() {
		return isPermisoPaginacionAltoDetallePlaneacionCompra;
	}

	public void setIsPermisoPaginacionAltoDetallePlaneacionCompra(Boolean isPermisoPaginacionAltoDetallePlaneacionCompra) {
		this.isPermisoPaginacionAltoDetallePlaneacionCompra = isPermisoPaginacionAltoDetallePlaneacionCompra;
	}
	
	public Boolean getIsPermisoCopiarDetallePlaneacionCompra() {
		return isPermisoCopiarDetallePlaneacionCompra;
	}

	public void setIsPermisoCopiarDetallePlaneacionCompra(Boolean isPermisoCopiarDetallePlaneacionCompra) {
		this.isPermisoCopiarDetallePlaneacionCompra = isPermisoCopiarDetallePlaneacionCompra;
	}
	
	public Boolean getIsPermisoVerFormDetallePlaneacionCompra() {
		return isPermisoVerFormDetallePlaneacionCompra;
	}

	public void setIsPermisoVerFormDetallePlaneacionCompra(Boolean isPermisoVerFormDetallePlaneacionCompra) {
		this.isPermisoVerFormDetallePlaneacionCompra = isPermisoVerFormDetallePlaneacionCompra;
	}
	
	public Boolean getIsPermisoDuplicarDetallePlaneacionCompra() {
		return isPermisoDuplicarDetallePlaneacionCompra;
	}

	public void setIsPermisoDuplicarDetallePlaneacionCompra(Boolean isPermisoDuplicarDetallePlaneacionCompra) {
		this.isPermisoDuplicarDetallePlaneacionCompra = isPermisoDuplicarDetallePlaneacionCompra;
	}
	
	public Boolean getIsPermisoOrdenDetallePlaneacionCompra() {
		return isPermisoOrdenDetallePlaneacionCompra;
	}

	public void setIsPermisoOrdenDetallePlaneacionCompra(Boolean isPermisoOrdenDetallePlaneacionCompra) {
		this.isPermisoOrdenDetallePlaneacionCompra = isPermisoOrdenDetallePlaneacionCompra;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetallePlaneacionCompra() {
		return isVisibilidadCeldaNuevoDetallePlaneacionCompra;
	}

	public void setIsVisibilidadCeldaNuevoDetallePlaneacionCompra(Boolean isVisibilidadCeldaNuevoDetallePlaneacionCompra) {
		this.isVisibilidadCeldaNuevoDetallePlaneacionCompra = isVisibilidadCeldaNuevoDetallePlaneacionCompra;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetallePlaneacionCompra() {
		return isVisibilidadCeldaDuplicarDetallePlaneacionCompra;
	}

	public void setIsVisibilidadCeldaDuplicarDetallePlaneacionCompra(Boolean isVisibilidadCeldaDuplicarDetallePlaneacionCompra) {
		this.isVisibilidadCeldaDuplicarDetallePlaneacionCompra = isVisibilidadCeldaDuplicarDetallePlaneacionCompra;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetallePlaneacionCompra() {
		return isVisibilidadCeldaCopiarDetallePlaneacionCompra;
	}

	public void setIsVisibilidadCeldaCopiarDetallePlaneacionCompra(Boolean isVisibilidadCeldaCopiarDetallePlaneacionCompra) {
		this.isVisibilidadCeldaCopiarDetallePlaneacionCompra = isVisibilidadCeldaCopiarDetallePlaneacionCompra;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetallePlaneacionCompra() {
		return isVisibilidadCeldaVerFormDetallePlaneacionCompra;
	}

	public void setIsVisibilidadCeldaVerFormDetallePlaneacionCompra(Boolean isVisibilidadCeldaVerFormDetallePlaneacionCompra) {
		this.isVisibilidadCeldaVerFormDetallePlaneacionCompra = isVisibilidadCeldaVerFormDetallePlaneacionCompra;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetallePlaneacionCompra() {
		return isVisibilidadCeldaOrdenDetallePlaneacionCompra;
	}

	public void setIsVisibilidadCeldaOrdenDetallePlaneacionCompra(Boolean isVisibilidadCeldaOrdenDetallePlaneacionCompra) {
		this.isVisibilidadCeldaOrdenDetallePlaneacionCompra = isVisibilidadCeldaOrdenDetallePlaneacionCompra;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra() {
		return isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra(Boolean isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra) {
		this.isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra = isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetallePlaneacionCompra() {
		return isVisibilidadCeldaModificarDetallePlaneacionCompra;
	}

	public void setIsVisibilidadCeldaModificarDetallePlaneacionCompra(Boolean isVisibilidadCeldaModificarDetallePlaneacionCompra) {
		this.isVisibilidadCeldaModificarDetallePlaneacionCompra = isVisibilidadCeldaModificarDetallePlaneacionCompra;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetallePlaneacionCompra() {
		return isVisibilidadCeldaActualizarDetallePlaneacionCompra;
	}

	public void setIsVisibilidadCeldaActualizarDetallePlaneacionCompra(Boolean isVisibilidadCeldaActualizarDetallePlaneacionCompra) {
		this.isVisibilidadCeldaActualizarDetallePlaneacionCompra = isVisibilidadCeldaActualizarDetallePlaneacionCompra;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetallePlaneacionCompra() {
		return isVisibilidadCeldaEliminarDetallePlaneacionCompra;
	}

	public void setIsVisibilidadCeldaEliminarDetallePlaneacionCompra(Boolean isVisibilidadCeldaEliminarDetallePlaneacionCompra) {
		this.isVisibilidadCeldaEliminarDetallePlaneacionCompra = isVisibilidadCeldaEliminarDetallePlaneacionCompra;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetallePlaneacionCompra() {
		return isVisibilidadCeldaCancelarDetallePlaneacionCompra;
	}

	public void setIsVisibilidadCeldaCancelarDetallePlaneacionCompra(Boolean isVisibilidadCeldaCancelarDetallePlaneacionCompra) {
		this.isVisibilidadCeldaCancelarDetallePlaneacionCompra = isVisibilidadCeldaCancelarDetallePlaneacionCompra;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetallePlaneacionCompra() {
		return isVisibilidadCeldaGuardarDetallePlaneacionCompra;
	}

	public void setIsVisibilidadCeldaGuardarDetallePlaneacionCompra(Boolean isVisibilidadCeldaGuardarDetallePlaneacionCompra) {
		this.isVisibilidadCeldaGuardarDetallePlaneacionCompra = isVisibilidadCeldaGuardarDetallePlaneacionCompra;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra() {
		return isVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra(Boolean isVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra) {
		this.isVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra = isVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra;
	}
		
	public DetallePlaneacionCompraSessionBean getdetalleplaneacioncompraSessionBean() {
		return this.detalleplaneacioncompraSessionBean;
	}
	
	public void setdetalleplaneacioncompraSessionBean(DetallePlaneacionCompraSessionBean detalleplaneacioncompraSessionBean) {
		this.detalleplaneacioncompraSessionBean=detalleplaneacioncompraSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
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

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
	}

	public Boolean getisVisibilidadFK_IdPlaneacionCompra() {
		return this.isVisibilidadFK_IdPlaneacionCompra;
	}

	public void setisVisibilidadFK_IdPlaneacionCompra(Boolean isVisibilidadFK_IdPlaneacionCompra) {
		this.isVisibilidadFK_IdPlaneacionCompra=isVisibilidadFK_IdPlaneacionCompra;
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

	public Boolean getisVisibilidadFK_IdUnidad() {
		return this.isVisibilidadFK_IdUnidad;
	}

	public void setisVisibilidadFK_IdUnidad(Boolean isVisibilidadFK_IdUnidad) {
		this.isVisibilidadFK_IdUnidad=isVisibilidadFK_IdUnidad;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(DetallePlaneacionCompra detalleplaneacioncompra)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(detalleplaneacioncompra,null);
				this.setActualParaGuardarSucursalForeignKey(detalleplaneacioncompra,null);
				this.setActualParaGuardarEjercicioForeignKey(detalleplaneacioncompra,null);
				this.setActualParaGuardarPeriodoForeignKey(detalleplaneacioncompra,null);
				this.setActualParaGuardarPlaneacionCompraForeignKey(detalleplaneacioncompra,null);
				this.setActualParaGuardarLineaForeignKey(detalleplaneacioncompra,null);
				this.setActualParaGuardarProductoForeignKey(detalleplaneacioncompra,null);
				this.setActualParaGuardarUnidadForeignKey(detalleplaneacioncompra,null);
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
	
	public void bugActualizarReferenciaActual(DetallePlaneacionCompra detalleplaneacioncompra,DetallePlaneacionCompra detalleplaneacioncompraAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetallePlaneacionCompra(detalleplaneacioncompra);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detalleplaneacioncompraAux.setId(detalleplaneacioncompra.getId());
		detalleplaneacioncompraAux.setVersionRow(detalleplaneacioncompra.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetallePlaneacionCompra();
		
			int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detalleplaneacioncompraValidator.getInvalidValues(this.detalleplaneacioncompra);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detalleplaneacioncompraLogic.setDatosCliente(datosCliente);
			detalleplaneacioncompraLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detalleplaneacioncompraAux=new  DetallePlaneacionCompra();
				
				detalleplaneacioncompraAux.setIsNew(true);
				detalleplaneacioncompraAux.setIsChanged(true);
				
				detalleplaneacioncompraAux.setDetallePlaneacionCompraOriginal(this.detalleplaneacioncompra);
				
				detalleplaneacioncompraAux.setId(this.detalleplaneacioncompra.getId());	
				detalleplaneacioncompraAux.setVersionRow(this.detalleplaneacioncompra.getVersionRow());	
				detalleplaneacioncompraAux.setid_empresa(this.detalleplaneacioncompra.getid_empresa());	
				detalleplaneacioncompraAux.setid_sucursal(this.detalleplaneacioncompra.getid_sucursal());	
				detalleplaneacioncompraAux.setid_ejercicio(this.detalleplaneacioncompra.getid_ejercicio());	
				detalleplaneacioncompraAux.setid_periodo(this.detalleplaneacioncompra.getid_periodo());	
				detalleplaneacioncompraAux.setid_planeacion_compra(this.detalleplaneacioncompra.getid_planeacion_compra());	
				detalleplaneacioncompraAux.setid_linea(this.detalleplaneacioncompra.getid_linea());	
				detalleplaneacioncompraAux.setid_producto(this.detalleplaneacioncompra.getid_producto());	
				detalleplaneacioncompraAux.setid_unidad(this.detalleplaneacioncompra.getid_unidad());	
				detalleplaneacioncompraAux.setstock(this.detalleplaneacioncompra.getstock());	
				detalleplaneacioncompraAux.setdia_minimo(this.detalleplaneacioncompra.getdia_minimo());	
				detalleplaneacioncompraAux.setstock_minimo(this.detalleplaneacioncompra.getstock_minimo());	
				detalleplaneacioncompraAux.setdia_maximo(this.detalleplaneacioncompra.getdia_maximo());	
				detalleplaneacioncompraAux.setstock_maximo(this.detalleplaneacioncompra.getstock_maximo());	
				detalleplaneacioncompraAux.setsalida(this.detalleplaneacioncompra.getsalida());	
				detalleplaneacioncompraAux.setstock_mensual(this.detalleplaneacioncompra.getstock_mensual());	
				detalleplaneacioncompraAux.setdescripcion(this.detalleplaneacioncompra.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleplaneacioncompraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detalleplaneacioncompraAux,detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleplaneacioncompraAux,detalleplaneacioncompras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detalleplaneacioncompraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleplaneacioncompraLogic.saveDetallePlaneacionCompras();//WithConnection
						//detalleplaneacioncompraLogic.getSetVersionRowDetallePlaneacionCompras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleplaneacioncompra,detalleplaneacioncompraAux);
					
					this.refrescarForeignKeysDescripcionesDetallePlaneacionCompra();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleplaneacioncompraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleplaneacioncompraLogic.saveDetallePlaneacionCompraRelaciones(detalleplaneacioncompraAux);//WithConnection
								//detalleplaneacioncompraLogic.getSetVersionRowDetallePlaneacionCompras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleplaneacioncompra,detalleplaneacioncompraAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleplaneacioncompraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleplaneacioncompraAux,detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleplaneacioncompraAux,detalleplaneacioncompras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleplaneacioncompra,detalleplaneacioncompraAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detalleplaneacioncompraAux=new  DetallePlaneacionCompra();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() 
					|| (this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() && this.detalleplaneacioncompra.getId()>=0)) {
						
					detalleplaneacioncompraAux.setIsNew(false);
				}
				
				detalleplaneacioncompraAux.setIsDeleted(false);
			
				detalleplaneacioncompraAux.setId(this.detalleplaneacioncompra.getId());	
				detalleplaneacioncompraAux.setVersionRow(this.detalleplaneacioncompra.getVersionRow());	
				detalleplaneacioncompraAux.setid_empresa(this.detalleplaneacioncompra.getid_empresa());	
				detalleplaneacioncompraAux.setid_sucursal(this.detalleplaneacioncompra.getid_sucursal());	
				detalleplaneacioncompraAux.setid_ejercicio(this.detalleplaneacioncompra.getid_ejercicio());	
				detalleplaneacioncompraAux.setid_periodo(this.detalleplaneacioncompra.getid_periodo());	
				detalleplaneacioncompraAux.setid_planeacion_compra(this.detalleplaneacioncompra.getid_planeacion_compra());	
				detalleplaneacioncompraAux.setid_linea(this.detalleplaneacioncompra.getid_linea());	
				detalleplaneacioncompraAux.setid_producto(this.detalleplaneacioncompra.getid_producto());	
				detalleplaneacioncompraAux.setid_unidad(this.detalleplaneacioncompra.getid_unidad());	
				detalleplaneacioncompraAux.setstock(this.detalleplaneacioncompra.getstock());	
				detalleplaneacioncompraAux.setdia_minimo(this.detalleplaneacioncompra.getdia_minimo());	
				detalleplaneacioncompraAux.setstock_minimo(this.detalleplaneacioncompra.getstock_minimo());	
				detalleplaneacioncompraAux.setdia_maximo(this.detalleplaneacioncompra.getdia_maximo());	
				detalleplaneacioncompraAux.setstock_maximo(this.detalleplaneacioncompra.getstock_maximo());	
				detalleplaneacioncompraAux.setsalida(this.detalleplaneacioncompra.getsalida());	
				detalleplaneacioncompraAux.setstock_mensual(this.detalleplaneacioncompra.getstock_mensual());	
				detalleplaneacioncompraAux.setdescripcion(this.detalleplaneacioncompra.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleplaneacioncompraAux,detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleplaneacioncompraAux,detalleplaneacioncompras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detalleplaneacioncompraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleplaneacioncompraLogic.saveDetallePlaneacionCompras();//WithConnection
						//detalleplaneacioncompraLogic.getSetVersionRowDetallePlaneacionCompras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleplaneacioncompra,detalleplaneacioncompraAux);
					
					this.refrescarForeignKeysDescripcionesDetallePlaneacionCompra();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleplaneacioncompraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleplaneacioncompraLogic.saveDetallePlaneacionCompraRelaciones(detalleplaneacioncompraAux);//WithConnection
								//detalleplaneacioncompraLogic.getSetVersionRowDetallePlaneacionCompras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleplaneacioncompra,detalleplaneacioncompraAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleplaneacioncompraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleplaneacioncompraAux,detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleplaneacioncompraAux,detalleplaneacioncompras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleplaneacioncompra,detalleplaneacioncompraAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detalleplaneacioncompraAux=new  DetallePlaneacionCompra();
				
				detalleplaneacioncompraAux.setIsNew(false);
				detalleplaneacioncompraAux.setIsChanged(false);
				
				detalleplaneacioncompraAux.setIsDeleted(true);
				
				detalleplaneacioncompraAux.setId(this.detalleplaneacioncompra.getId());	
				detalleplaneacioncompraAux.setVersionRow(this.detalleplaneacioncompra.getVersionRow());	
				detalleplaneacioncompraAux.setid_empresa(this.detalleplaneacioncompra.getid_empresa());	
				detalleplaneacioncompraAux.setid_sucursal(this.detalleplaneacioncompra.getid_sucursal());	
				detalleplaneacioncompraAux.setid_ejercicio(this.detalleplaneacioncompra.getid_ejercicio());	
				detalleplaneacioncompraAux.setid_periodo(this.detalleplaneacioncompra.getid_periodo());	
				detalleplaneacioncompraAux.setid_planeacion_compra(this.detalleplaneacioncompra.getid_planeacion_compra());	
				detalleplaneacioncompraAux.setid_linea(this.detalleplaneacioncompra.getid_linea());	
				detalleplaneacioncompraAux.setid_producto(this.detalleplaneacioncompra.getid_producto());	
				detalleplaneacioncompraAux.setid_unidad(this.detalleplaneacioncompra.getid_unidad());	
				detalleplaneacioncompraAux.setstock(this.detalleplaneacioncompra.getstock());	
				detalleplaneacioncompraAux.setdia_minimo(this.detalleplaneacioncompra.getdia_minimo());	
				detalleplaneacioncompraAux.setstock_minimo(this.detalleplaneacioncompra.getstock_minimo());	
				detalleplaneacioncompraAux.setdia_maximo(this.detalleplaneacioncompra.getdia_maximo());	
				detalleplaneacioncompraAux.setstock_maximo(this.detalleplaneacioncompra.getstock_maximo());	
				detalleplaneacioncompraAux.setsalida(this.detalleplaneacioncompra.getsalida());	
				detalleplaneacioncompraAux.setstock_mensual(this.detalleplaneacioncompra.getstock_mensual());	
				detalleplaneacioncompraAux.setdescripcion(this.detalleplaneacioncompra.getdescripcion());	
				
				if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detalleplaneacioncompraAux.getId()>=0) {	
						this.detalleplaneacioncomprasEliminados.add(detalleplaneacioncompraAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detalleplaneacioncompraAux,detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleplaneacioncompraAux,detalleplaneacioncompras);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detalleplaneacioncompraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleplaneacioncompraLogic.saveDetallePlaneacionCompras();//WithConnection
						//detalleplaneacioncompraLogic.getSetVersionRowDetallePlaneacionCompras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleplaneacioncompraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleplaneacioncompraLogic.saveDetallePlaneacionCompraRelaciones(detalleplaneacioncompraAux);//WithConnection
								//detalleplaneacioncompraLogic.getSetVersionRowDetallePlaneacionCompras();//WithConnection
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
							if(this.detalleplaneacioncompraSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detalleplaneacioncompraAux,detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detalleplaneacioncompraAux,detalleplaneacioncompras);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().addAll(this.detalleplaneacioncomprasEliminados);
					
					detalleplaneacioncompraLogic.saveDetallePlaneacionCompras();//WithConnection
					//detalleplaneacioncompraLogic.getSetVersionRowDetallePlaneacionCompras();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetallePlaneacionCompra();
				
				this.detalleplaneacioncomprasEliminados= new ArrayList<DetallePlaneacionCompra>();		
			}
			
			if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Planeacion Compra GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Planeacion Compra",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detalleplaneacioncompra=detalleplaneacioncompraAux;
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
      		//this.finishProcessDetallePlaneacionCompra();
      	}
		
	}	
	
	public void actualizarRelaciones(DetallePlaneacionCompra detalleplaneacioncompraLocal) throws Exception {
		
		if(this.detalleplaneacioncompraSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetallePlaneacionCompra detalleplaneacioncompraLocal) throws Exception {	
		if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detalleplaneacioncompraLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				detalleplaneacioncompraLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				detalleplaneacioncompraLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				detalleplaneacioncompraLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PlaneacionCompraDetalleFormJInternalFrame.class)) {
				PlaneacionCompraBeanSwingJInternalFrame planeacioncompraBeanSwingJInternalFrameLocal=(PlaneacionCompraBeanSwingJInternalFrame) ((PlaneacionCompraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				planeacioncompraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPlaneacionCompra(planeacioncompraBeanSwingJInternalFrameLocal.getplaneacioncompra(),true);
				planeacioncompraBeanSwingJInternalFrameLocal.actualizarLista(planeacioncompraBeanSwingJInternalFrameLocal.planeacioncompra,this.planeacioncomprasForeignKey);

				planeacioncompraBeanSwingJInternalFrameLocal.actualizarRelaciones(planeacioncompraBeanSwingJInternalFrameLocal.planeacioncompra);

				detalleplaneacioncompraLocal.setPlaneacionCompra(planeacioncompraBeanSwingJInternalFrameLocal.planeacioncompra);

				this.addItemDefectoCombosForeignKeyPlaneacionCompra();
				this.cargarCombosFramePlaneacionComprasForeignKey("Formulario");
				this.setActualPlaneacionCompraForeignKey(planeacioncompraBeanSwingJInternalFrameLocal.planeacioncompra.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				detalleplaneacioncompraLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				detalleplaneacioncompraLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				detalleplaneacioncompraLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetallePlaneacionCompraActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detalleplaneacioncompraValidator.getInvalidValues(this.detalleplaneacioncompra);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetallePlaneacionCompra detalleplaneacioncompra,List<DetallePlaneacionCompra> detalleplaneacioncompras) throws Exception {
		try	{		
			DetallePlaneacionCompraConstantesFunciones.actualizarLista(detalleplaneacioncompra,detalleplaneacioncompras,this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetallePlaneacionCompra detalleplaneacioncompra,List<DetallePlaneacionCompra> detalleplaneacioncompras) throws Exception {
		try	{			
			DetallePlaneacionCompraConstantesFunciones.actualizarSelectedLista(detalleplaneacioncompra,detalleplaneacioncompras);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetallePlaneacionCompra> detalleplaneacioncomprasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detalleplaneacioncomprasLocal=this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detalleplaneacioncomprasLocal=this.detalleplaneacioncompras;
			}
			//ARCHITECTURE
		
			for(DetallePlaneacionCompra detalleplaneacioncompraLocal:detalleplaneacioncomprasLocal) {
				if(this.permiteMantenimiento(detalleplaneacioncompraLocal) && detalleplaneacioncompraLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetallePlaneacionCompraConstantesFunciones.getDetallePlaneacionCompraLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetallePlaneacionCompraConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelid_empresaDetallePlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePlaneacionCompraConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelid_sucursalDetallePlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePlaneacionCompraConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelid_ejercicioDetallePlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePlaneacionCompraConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelid_periodoDetallePlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePlaneacionCompraConstantesFunciones.IDPLANEACIONCOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelid_planeacion_compraDetallePlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePlaneacionCompraConstantesFunciones.IDLINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelid_lineaDetallePlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePlaneacionCompraConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelid_productoDetallePlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePlaneacionCompraConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelid_unidadDetallePlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePlaneacionCompraConstantesFunciones.STOCK)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelstockDetallePlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePlaneacionCompraConstantesFunciones.DIAMINIMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabeldia_minimoDetallePlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePlaneacionCompraConstantesFunciones.STOCKMINIMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelstock_minimoDetallePlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePlaneacionCompraConstantesFunciones.DIAMAXIMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabeldia_maximoDetallePlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePlaneacionCompraConstantesFunciones.STOCKMAXIMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelstock_maximoDetallePlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePlaneacionCompraConstantesFunciones.SALIDA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelsalidaDetallePlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePlaneacionCompraConstantesFunciones.STOCKMENSUAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelstock_mensualDetallePlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePlaneacionCompraConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabeldescripcionDetallePlaneacionCompra,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelid_empresaDetallePlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelid_sucursalDetallePlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelid_ejercicioDetallePlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelid_periodoDetallePlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelid_planeacion_compraDetallePlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelid_lineaDetallePlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelid_productoDetallePlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelid_unidadDetallePlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelstockDetallePlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabeldia_minimoDetallePlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelstock_minimoDetallePlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabeldia_maximoDetallePlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelstock_maximoDetallePlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelsalidaDetallePlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelstock_mensualDetallePlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabeldescripcionDetallePlaneacionCompra,"");
		
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
		this.iIdNuevoDetallePlaneacionCompra--;	
		
		
		this.detalleplaneacioncompraAux=new DetallePlaneacionCompra();
		
		this.detalleplaneacioncompraAux.setId(this.iIdNuevoDetallePlaneacionCompra);
		this.detalleplaneacioncompraAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().add(this.detalleplaneacioncompraAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detalleplaneacioncompras.add(this.detalleplaneacioncompraAux);
		}
		//ARCHITECTURE
		
		this.detalleplaneacioncompra=this.detalleplaneacioncompraAux;
		
		if(DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetallePlaneacionCompra(this.detalleplaneacioncompra);
			this.setVariablesObjetoActualToFormularioForeignKeyDetallePlaneacionCompra(this.detalleplaneacioncompra);
		}
				
		//this.setDefaultControlesDetallePlaneacionCompra();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetallePlaneacionCompra();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetallePlaneacionCompra();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetallePlaneacionCompra();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompraBean,this.detalleplaneacioncompra,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detalleplaneacioncompraSessionBean.getConGuardarRelaciones()) {
			classes=DetallePlaneacionCompraConstantesFunciones.getClassesRelationshipsOfDetallePlaneacionCompra(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detalleplaneacioncompraReturnGeneral=detalleplaneacioncompraLogic.procesarEventosDetallePlaneacionComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras(),this.detalleplaneacioncompra,this.detalleplaneacioncompraParameterGeneral,this.isEsNuevoDetallePlaneacionCompra,classes);//this.detalleplaneacioncompraLogic.getDetallePlaneacionCompra()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetallePlaneacionCompra(this.detalleplaneacioncompraReturnGeneral,this.detalleplaneacioncompraBean,false);
		
		if(this.detalleplaneacioncompraReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetallePlaneacionCompra(this.detalleplaneacioncompraReturnGeneral.getDetallePlaneacionCompra());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetallePlaneacionCompra(this.detalleplaneacioncompraReturnGeneral.getDetallePlaneacionCompra());
		}
		
		if(this.detalleplaneacioncompraReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetallePlaneacionCompra(this.detalleplaneacioncompraReturnGeneral.getDetallePlaneacionCompra(),classes);//this.detalleplaneacioncompraBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetallePlaneacionCompra();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetallePlaneacionCompra();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.RecargarFormDetallePlaneacionCompra(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetallePlaneacionCompra(false);
						
			if(detalleplaneacioncompraSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetallePlaneacionCompra();
			}
			
			this.actualizarVisualTableDatosDetallePlaneacionCompra();
			
			this.jTableDatosDetallePlaneacionCompra.setRowSelectionInterval(this.getIndiceNuevoDetallePlaneacionCompra(), this.getIndiceNuevoDetallePlaneacionCompra());
			
			this.seleccionarFilaTablaDetallePlaneacionCompraActual();
						
			this.actualizarEstadoCeldasBotonesDetallePlaneacionCompra("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetallePlaneacionCompra(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstockDetallePlaneacionCompra.setEnabled(isHabilitar && this.detalleplaneacioncompraConstantesFunciones.activarstockDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFielddia_minimoDetallePlaneacionCompra.setEnabled(isHabilitar && this.detalleplaneacioncompraConstantesFunciones.activardia_minimoDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_minimoDetallePlaneacionCompra.setEnabled(isHabilitar && this.detalleplaneacioncompraConstantesFunciones.activarstock_minimoDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFielddia_maximoDetallePlaneacionCompra.setEnabled(isHabilitar && this.detalleplaneacioncompraConstantesFunciones.activardia_maximoDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_maximoDetallePlaneacionCompra.setEnabled(isHabilitar && this.detalleplaneacioncompraConstantesFunciones.activarstock_maximoDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldsalidaDetallePlaneacionCompra.setEnabled(isHabilitar && this.detalleplaneacioncompraConstantesFunciones.activarsalidaDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_mensualDetallePlaneacionCompra.setEnabled(isHabilitar && this.detalleplaneacioncompraConstantesFunciones.activarstock_mensualDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextAreadescripcionDetallePlaneacionCompra.setEnabled(isHabilitar && this.detalleplaneacioncompraConstantesFunciones.activardescripcionDetallePlaneacionCompra);	
		//
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_empresaDetallePlaneacionCompra.setEnabled(isHabilitar && this.detalleplaneacioncompraConstantesFunciones.activarid_empresaDetallePlaneacionCompra);//
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_sucursalDetallePlaneacionCompra.setEnabled(isHabilitar && this.detalleplaneacioncompraConstantesFunciones.activarid_sucursalDetallePlaneacionCompra);//
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_ejercicioDetallePlaneacionCompra.setEnabled(isHabilitar && this.detalleplaneacioncompraConstantesFunciones.activarid_ejercicioDetallePlaneacionCompra);//
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_periodoDetallePlaneacionCompra.setEnabled(isHabilitar && this.detalleplaneacioncompraConstantesFunciones.activarid_periodoDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_planeacion_compraDetallePlaneacionCompra.setEnabled(isHabilitar && this.detalleplaneacioncompraConstantesFunciones.activarid_planeacion_compraDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_lineaDetallePlaneacionCompra.setEnabled(isHabilitar && this.detalleplaneacioncompraConstantesFunciones.activarid_lineaDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_productoDetallePlaneacionCompra.setEnabled(isHabilitar && this.detalleplaneacioncompraConstantesFunciones.activarid_productoDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_unidadDetallePlaneacionCompra.setEnabled(isHabilitar && this.detalleplaneacioncompraConstantesFunciones.activarid_unidadDetallePlaneacionCompra);
	};
	
	public void setDefaultControlesDetallePlaneacionCompra() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetallePlaneacionCompra(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detalleplaneacioncompraSessionBean.setConGuardarRelaciones(true);			
			this.detalleplaneacioncompraSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTabbedPaneRelacionesDetallePlaneacionCompra.setVisible(true);
			
					
		} else {
			//this.detalleplaneacioncompraSessionBean.setConGuardarRelaciones(false);			
			this.detalleplaneacioncompraSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTabbedPaneRelacionesDetallePlaneacionCompra.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetallePlaneacionCompra() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePlaneacionCompra detalleplaneacioncompraAux:this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras()) {
				if(detalleplaneacioncompraAux.getId().equals(this.iIdNuevoDetallePlaneacionCompra)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePlaneacionCompra detalleplaneacioncompraAux:this.detalleplaneacioncompras) {
				if(detalleplaneacioncompraAux.getId().equals(this.iIdNuevoDetallePlaneacionCompra)) {
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
	
	public int getIndiceActualDetallePlaneacionCompra(DetallePlaneacionCompra detalleplaneacioncompra,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePlaneacionCompra detalleplaneacioncompraAux:this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras()) {
				if(detalleplaneacioncompraAux.getId().equals(detalleplaneacioncompra.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePlaneacionCompra detalleplaneacioncompraAux:this.detalleplaneacioncompras) {
				if(detalleplaneacioncompraAux.getId().equals(detalleplaneacioncompra.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetallePlaneacionCompra(DetallePlaneacionCompra detalleplaneacioncompraOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePlaneacionCompra detalleplaneacioncompraAux:this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras()) {
				if(detalleplaneacioncompraAux.getDetallePlaneacionCompraOriginal().getId().equals(detalleplaneacioncompraOriginal.getId())) {
					existe=true;
					detalleplaneacioncompraOriginal.setId(detalleplaneacioncompraAux.getId());
					detalleplaneacioncompraOriginal.setVersionRow(detalleplaneacioncompraAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePlaneacionCompra detalleplaneacioncompraAux:this.detalleplaneacioncompras) {
				if(detalleplaneacioncompraAux.getDetallePlaneacionCompraOriginal().getId().equals(detalleplaneacioncompraOriginal.getId())) {
					existe=true;
					detalleplaneacioncompraOriginal.setId(detalleplaneacioncompraAux.getId());
					detalleplaneacioncompraOriginal.setVersionRow(detalleplaneacioncompraAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetallePlaneacionCompra(Boolean esParaCancelar) throws Exception {
		detalleplaneacioncomprasAux=new ArrayList<DetallePlaneacionCompra>();
		detalleplaneacioncompraAux=new DetallePlaneacionCompra();
		
		if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetallePlaneacionCompra detalleplaneacioncompraAux:this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras()) {
					if(detalleplaneacioncompraAux.getId()<0) {
						detalleplaneacioncomprasAux.add(detalleplaneacioncompraAux);
					}		
				}
				this.iIdNuevoDetallePlaneacionCompra=0L;
				this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().removeAll(detalleplaneacioncomprasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallePlaneacionCompra detalleplaneacioncompraAux:this.detalleplaneacioncompras) {
					if(detalleplaneacioncompraAux.getId()<0) {
						detalleplaneacioncomprasAux.add(detalleplaneacioncompraAux);
					}		
				}
				this.iIdNuevoDetallePlaneacionCompra=0L;
				this.detalleplaneacioncompras.removeAll(detalleplaneacioncomprasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetallePlaneacionCompra 
					&& this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().size()>0
					) {
					detalleplaneacioncompraAux=this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().get(this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().size() - 1);
				
					if(detalleplaneacioncompraAux.getId()<0) {
						this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().remove(detalleplaneacioncompraAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetallePlaneacionCompra && this.detalleplaneacioncompras.size()>0) {
					detalleplaneacioncompraAux=this.detalleplaneacioncompras.get(this.detalleplaneacioncompras.size() - 1);
				
					if(detalleplaneacioncompraAux.getId()<0) {
						this.detalleplaneacioncompras.remove(detalleplaneacioncompraAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetallePlaneacionCompra(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detalleplaneacioncompra.getId()<0) {
				this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().remove(this.detalleplaneacioncompra);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detalleplaneacioncompra.getId()<0) {
				this.detalleplaneacioncompras.remove(this.detalleplaneacioncompra);
			}
		}			
	}
	
	public void setEstadosInicialesDetallePlaneacionCompra(List<DetallePlaneacionCompra> detalleplaneacioncomprasAux) throws Exception {
		DetallePlaneacionCompraConstantesFunciones.setEstadosInicialesDetallePlaneacionCompra(detalleplaneacioncomprasAux);
	}
	
	public void setEstadosInicialesDetallePlaneacionCompra(DetallePlaneacionCompra detalleplaneacioncompraAux) throws Exception {
		DetallePlaneacionCompraConstantesFunciones.setEstadosInicialesDetallePlaneacionCompra(detalleplaneacioncompraAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetallePlaneacionCompraActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetallePlaneacionCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetallePlaneacionCompraActual()) {
				if(!this.isEsNuevoDetallePlaneacionCompra) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetallePlaneacionCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetallePlaneacionCompra=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetallePlaneacionCompraActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Planeacion Compra ?", "MANTENIMIENTO DE Detalle Planeacion Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetallePlaneacionCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetallePlaneacionCompra detalleplaneacioncompra) throws Exception {
		DetallePlaneacionCompraConstantesFunciones.seleccionarAsignar(this.detalleplaneacioncompra,detalleplaneacioncompra);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetallePlaneacionCompra=this.isPermisoActualizarOriginalDetallePlaneacionCompra;
			
			
			this.seleccionarAsignar(detalleplaneacioncompra);
			
			

			idProductoActual=detalleplaneacioncompra.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetallePlaneacionCompraConstantesFunciones.quitarEspaciosDetallePlaneacionCompra(this.detalleplaneacioncompra,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetallePlaneacionCompra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detalleplaneacioncompraSessionBean.setsFuncionBusquedaRapida(this.detalleplaneacioncompraSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoDetallePlaneacionCompra) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetallePlaneacionCompra(esParaCancelar);				
				this.cancelarNuevoDetallePlaneacionCompra(esParaCancelar);								
			}
			
			this.detalleplaneacioncompra=new DetallePlaneacionCompra();
			
			this.inicializarDetallePlaneacionCompra();
			
			this.actualizarEstadoCeldasBotonesDetallePlaneacionCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetallePlaneacionCompra() throws Exception {
		try {
			DetallePlaneacionCompraConstantesFunciones.inicializarDetallePlaneacionCompra(this.detalleplaneacioncompra);
			
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
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetallePlaneacionCompras(String sAccionBusqueda,List<DetallePlaneacionCompra> detalleplaneacioncomprasParaReportes) throws Exception {
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
					sPathReporteFinal="DetallePlaneacionCompra"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetallePlaneacionCompraMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetallePlaneacionCompraMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetallePlaneacionCompra"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Planeacion Compras");		
		parameters.put("busquedapor", DetallePlaneacionCompraConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetallePlaneacionCompra=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetallePlaneacionCompraConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetallePlaneacionCompraConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetallePlaneacionCompra=new JRBeanArrayDataSource(DetallePlaneacionCompraJInternalFrame.TraerDetallePlaneacionCompraBeans(detalleplaneacioncomprasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetallePlaneacionCompra);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetallePlaneacionCompraConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetallePlaneacionCompraConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetallePlaneacionCompraBean.TraerDetallePlaneacionCompraBeans(detalleplaneacioncomprasParaReportes).toArray()));
							
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
				this.generarExcelReporteDetallePlaneacionCompras(sAccionBusqueda,sTipoArchivoReporte,detalleplaneacioncomprasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetallePlaneacionCompras(sAccionBusqueda,sTipoArchivoReporte,detalleplaneacioncomprasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetallePlaneacionCompraActionPerformed(null);
					//this.generarExcelReporteDetallePlaneacionCompras(sAccionBusqueda,sTipoArchivoReporte,detalleplaneacioncomprasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetallePlaneacionCompras(sAccionBusqueda,sTipoArchivoReporte,detalleplaneacioncomprasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetallePlaneacionCompras(sAccionBusqueda,sTipoArchivoReporte,detalleplaneacioncomprasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetallePlaneacionCompras(sAccionBusqueda,sTipoArchivoReporte,detalleplaneacioncomprasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetallePlaneacionCompras(String sAccionBusqueda,String sTipoArchivoReporte,List<DetallePlaneacionCompra> detalleplaneacioncomprasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleplaneacioncompra";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetallePlaneacionCompras");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetallePlaneacionCompra("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetallePlaneacionCompra detalleplaneacioncompra : detalleplaneacioncomprasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetallePlaneacionCompraConstantesFunciones.generarExcelReporteDataDetallePlaneacionCompra("NORMAL",row,workbook,detalleplaneacioncompra,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Planeacion Compra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetallePlaneacionCompra(String sTipo,Row row,Workbook workbook) {
		
		DetallePlaneacionCompraConstantesFunciones.generarExcelReporteHeaderDetallePlaneacionCompra(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetallePlaneacionCompras(String sAccionBusqueda,String sTipoArchivoReporte,List<DetallePlaneacionCompra> detalleplaneacioncomprasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleplaneacioncompra_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetallePlaneacionCompras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetallePlaneacionCompra detalleplaneacioncompra : detalleplaneacioncomprasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.getDetallePlaneacionCompraDescripcion(detalleplaneacioncompra));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleplaneacioncompra.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleplaneacioncompra.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleplaneacioncompra.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePlaneacionCompraConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleplaneacioncompra.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePlaneacionCompraConstantesFunciones.LABEL_IDPLANEACIONCOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDPLANEACIONCOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleplaneacioncompra.getplaneacioncompra_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePlaneacionCompraConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleplaneacioncompra.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePlaneacionCompraConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleplaneacioncompra.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePlaneacionCompraConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleplaneacioncompra.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCK))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCK);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleplaneacioncompra.getstock());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMINIMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMINIMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleplaneacioncompra.getdia_minimo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMINIMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMINIMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleplaneacioncompra.getstock_minimo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMAXIMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMAXIMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleplaneacioncompra.getdia_maximo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMAXIMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMAXIMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleplaneacioncompra.getstock_maximo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePlaneacionCompraConstantesFunciones.LABEL_SALIDA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_SALIDA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleplaneacioncompra.getsalida());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMENSUAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMENSUAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleplaneacioncompra.getstock_mensual());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleplaneacioncompra.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Planeacion Compra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetallePlaneacionCompras(String sAccionBusqueda,String sTipoArchivoReporte,List<DetallePlaneacionCompra> detalleplaneacioncomprasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetallePlaneacionCompra> detalleplaneacioncomprasRespaldo=null;
		
		classes=DetallePlaneacionCompraConstantesFunciones.getClassesRelationshipsOfDetallePlaneacionCompra(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detalleplaneacioncompraLogic.setDatosCliente(this.datosCliente);
		this.detalleplaneacioncompraLogic.setDatosDeep(this.datosDeep);
		this.detalleplaneacioncompraLogic.setIsConDeep(true);
		
		detalleplaneacioncomprasRespaldo=this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras();
		
		this.detalleplaneacioncompraLogic.setDetallePlaneacionCompras(detalleplaneacioncomprasParaReportes);	
		this.detalleplaneacioncompraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detalleplaneacioncomprasParaReportes=this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras();
		this.detalleplaneacioncompraLogic.setDetallePlaneacionCompras(detalleplaneacioncomprasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleplaneacioncompra_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetallePlaneacionCompras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetallePlaneacionCompra("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetallePlaneacionCompra detalleplaneacioncompra : detalleplaneacioncomprasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetallePlaneacionCompra("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetallePlaneacionCompraConstantesFunciones.generarExcelReporteDataDetallePlaneacionCompra("NORMAL",row,workbook,detalleplaneacioncompra,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.getDetallePlaneacionCompraDescripcion(detalleplaneacioncompra));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Planeacion Compra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetallePlaneacionCompra() throws Exception {		
		this.startProcessDetallePlaneacionCompra(true);
	}
	
	public void startProcessDetallePlaneacionCompra(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetallePlaneacionCompra ,this.jPanelParametrosReportesDetallePlaneacionCompra, this.jScrollPanelDatosDetallePlaneacionCompra,this.jPanelPaginacionDetallePlaneacionCompra, this.jScrollPanelDatosEdicionDetallePlaneacionCompra, this.jPanelAccionesDetallePlaneacionCompra,this.jPanelAccionesFormularioDetallePlaneacionCompra,this.jmenuBarDetallePlaneacionCompra,this.jmenuBarDetalleDetallePlaneacionCompra,this.jTtoolBarDetallePlaneacionCompra,this.jTtoolBarDetalleDetallePlaneacionCompra);		
		
		final JTabbedPane jTabbedPaneBusquedasDetallePlaneacionCompra=this.jTabbedPaneBusquedasDetallePlaneacionCompra; 
		
		final JPanel jPanelParametrosReportesDetallePlaneacionCompra=this.jPanelParametrosReportesDetallePlaneacionCompra;
		//final JScrollPane jScrollPanelDatosDetallePlaneacionCompra=this.jScrollPanelDatosDetallePlaneacionCompra;
		final JTable jTableDatosDetallePlaneacionCompra=this.jTableDatosDetallePlaneacionCompra;		
		final JPanel jPanelPaginacionDetallePlaneacionCompra=this.jPanelPaginacionDetallePlaneacionCompra;
		//final JScrollPane jScrollPanelDatosEdicionDetallePlaneacionCompra=this.jScrollPanelDatosEdicionDetallePlaneacionCompra;
		final JPanel jPanelAccionesDetallePlaneacionCompra=this.jPanelAccionesDetallePlaneacionCompra;
		
		JPanel jPanelCamposAuxiliarDetallePlaneacionCompra=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetallePlaneacionCompra=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
			jPanelCamposAuxiliarDetallePlaneacionCompra=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jPanelCamposDetallePlaneacionCompra;
			jPanelAccionesFormularioAuxiliarDetallePlaneacionCompra=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jPanelAccionesFormularioDetallePlaneacionCompra;
		}
		
		final JPanel jPanelCamposDetallePlaneacionCompra=jPanelCamposAuxiliarDetallePlaneacionCompra;
		final JPanel jPanelAccionesFormularioDetallePlaneacionCompra=jPanelAccionesFormularioAuxiliarDetallePlaneacionCompra;
		
		
		final JMenuBar jmenuBarDetallePlaneacionCompra=this.jmenuBarDetallePlaneacionCompra;
		final JToolBar jTtoolBarDetallePlaneacionCompra=this.jTtoolBarDetallePlaneacionCompra;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetallePlaneacionCompra=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetallePlaneacionCompra=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
			jmenuBarDetalleAuxiliarDetallePlaneacionCompra=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jmenuBarDetalleDetallePlaneacionCompra;
			jTtoolBarDetalleAuxiliarDetallePlaneacionCompra=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTtoolBarDetalleDetallePlaneacionCompra;
		}
		
		final JMenuBar jmenuBarDetalleDetallePlaneacionCompra=jmenuBarDetalleAuxiliarDetallePlaneacionCompra;
		final JToolBar jTtoolBarDetalleDetallePlaneacionCompra=jTtoolBarDetalleAuxiliarDetallePlaneacionCompra;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetallePlaneacionCompra;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetallePlaneacionCompra;
			processRunnable.jTableDatos=jTableDatosDetallePlaneacionCompra;
			processRunnable.jPanelCampos=jPanelCamposDetallePlaneacionCompra;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetallePlaneacionCompra;
			processRunnable.jPanelAcciones=jPanelAccionesDetallePlaneacionCompra;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetallePlaneacionCompra;
			
			
			processRunnable.jmenuBar=jmenuBarDetallePlaneacionCompra;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetallePlaneacionCompra;
			processRunnable.jTtoolBar=jTtoolBarDetallePlaneacionCompra;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetallePlaneacionCompra;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetallePlaneacionCompra ,jPanelParametrosReportesDetallePlaneacionCompra,jTableDatosDetallePlaneacionCompra, /*jScrollPanelDatosDetallePlaneacionCompra,*/jPanelCamposDetallePlaneacionCompra,jPanelPaginacionDetallePlaneacionCompra, /*jScrollPanelDatosEdicionDetallePlaneacionCompra,*/ jPanelAccionesDetallePlaneacionCompra,jPanelAccionesFormularioDetallePlaneacionCompra,jmenuBarDetallePlaneacionCompra,jmenuBarDetalleDetallePlaneacionCompra,jTtoolBarDetallePlaneacionCompra,jTtoolBarDetalleDetallePlaneacionCompra);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetallePlaneacionCompra ,jPanelParametrosReportesDetallePlaneacionCompra, jScrollPanelDatosDetallePlaneacionCompra,jPanelPaginacionDetallePlaneacionCompra, jScrollPanelDatosEdicionDetallePlaneacionCompra, jPanelAccionesDetallePlaneacionCompra,jPanelAccionesFormularioDetallePlaneacionCompra,jmenuBarDetallePlaneacionCompra,jmenuBarDetalleDetallePlaneacionCompra,jTtoolBarDetallePlaneacionCompra,jTtoolBarDetalleDetallePlaneacionCompra);
						
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
	
	public void finishProcessDetallePlaneacionCompra() {// throws Exception 
		this.finishProcessDetallePlaneacionCompra(true);
	}
	
	public void finishProcessDetallePlaneacionCompra(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetallePlaneacionCompra ,this.jPanelParametrosReportesDetallePlaneacionCompra, this.jScrollPanelDatosDetallePlaneacionCompra,this.jPanelPaginacionDetallePlaneacionCompra, this.jScrollPanelDatosEdicionDetallePlaneacionCompra, this.jPanelAccionesDetallePlaneacionCompra,this.jPanelAccionesFormularioDetallePlaneacionCompra,this.jmenuBarDetallePlaneacionCompra,this.jmenuBarDetalleDetallePlaneacionCompra,this.jTtoolBarDetallePlaneacionCompra,this.jTtoolBarDetalleDetallePlaneacionCompra);		
		
		final JTabbedPane jTabbedPaneBusquedasDetallePlaneacionCompra=this.jTabbedPaneBusquedasDetallePlaneacionCompra; 
		
		final JPanel jPanelParametrosReportesDetallePlaneacionCompra=this.jPanelParametrosReportesDetallePlaneacionCompra;
		//final JScrollPane jScrollPanelDatosDetallePlaneacionCompra=this.jScrollPanelDatosDetallePlaneacionCompra;
		final JTable jTableDatosDetallePlaneacionCompra=this.jTableDatosDetallePlaneacionCompra;		
		final JPanel jPanelPaginacionDetallePlaneacionCompra=this.jPanelPaginacionDetallePlaneacionCompra;
		//final JScrollPane jScrollPanelDatosEdicionDetallePlaneacionCompra=this.jScrollPanelDatosEdicionDetallePlaneacionCompra;
		final JPanel jPanelAccionesDetallePlaneacionCompra=this.jPanelAccionesDetallePlaneacionCompra;
		
		JPanel jPanelCamposAuxiliarDetallePlaneacionCompra=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetallePlaneacionCompra=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
			jPanelCamposAuxiliarDetallePlaneacionCompra=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jPanelCamposDetallePlaneacionCompra;
			jPanelAccionesFormularioAuxiliarDetallePlaneacionCompra=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jPanelAccionesFormularioDetallePlaneacionCompra;
		}
		
		final JPanel jPanelCamposDetallePlaneacionCompra=jPanelCamposAuxiliarDetallePlaneacionCompra;
		final JPanel jPanelAccionesFormularioDetallePlaneacionCompra=jPanelAccionesFormularioAuxiliarDetallePlaneacionCompra;
		
		
		final JMenuBar jmenuBarDetallePlaneacionCompra=this.jmenuBarDetallePlaneacionCompra;		
		final JToolBar jTtoolBarDetallePlaneacionCompra=this.jTtoolBarDetallePlaneacionCompra;
				
		JMenuBar jmenuBarDetalleAuxiliarDetallePlaneacionCompra=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetallePlaneacionCompra=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
			jmenuBarDetalleAuxiliarDetallePlaneacionCompra=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jmenuBarDetalleDetallePlaneacionCompra;
			jTtoolBarDetalleAuxiliarDetallePlaneacionCompra=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTtoolBarDetalleDetallePlaneacionCompra;		
		}
		
		final JMenuBar jmenuBarDetalleDetallePlaneacionCompra=jmenuBarDetalleAuxiliarDetallePlaneacionCompra;
		final JToolBar jTtoolBarDetalleDetallePlaneacionCompra=jTtoolBarDetalleAuxiliarDetallePlaneacionCompra;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetallePlaneacionCompra;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetallePlaneacionCompra;
			processRunnable.jTableDatos=jTableDatosDetallePlaneacionCompra;
			processRunnable.jPanelCampos=jPanelCamposDetallePlaneacionCompra;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetallePlaneacionCompra;
			processRunnable.jPanelAcciones=jPanelAccionesDetallePlaneacionCompra;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetallePlaneacionCompra;
			
			
			processRunnable.jmenuBar=jmenuBarDetallePlaneacionCompra;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetallePlaneacionCompra;
			processRunnable.jTtoolBar=jTtoolBarDetallePlaneacionCompra;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetallePlaneacionCompra;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetallePlaneacionCompra ,jPanelParametrosReportesDetallePlaneacionCompra, jTableDatosDetallePlaneacionCompra,/*jScrollPanelDatosDetallePlaneacionCompra,*/jPanelCamposDetallePlaneacionCompra,jPanelPaginacionDetallePlaneacionCompra, /*jScrollPanelDatosEdicionDetallePlaneacionCompra,*/ jPanelAccionesDetallePlaneacionCompra,jPanelAccionesFormularioDetallePlaneacionCompra,jmenuBarDetallePlaneacionCompra,jmenuBarDetalleDetallePlaneacionCompra,jTtoolBarDetallePlaneacionCompra,jTtoolBarDetalleDetallePlaneacionCompra));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetallePlaneacionCompra(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetallePlaneacionCompra(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetallePlaneacionCompra(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetallePlaneacionCompra(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePlaneacionCompra,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetallePlaneacionCompra,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetallePlaneacionCompra(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePlaneacionCompra,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetallePlaneacionCompra,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detalleplaneacioncompraConstantesFunciones.getsFinalQueryDetallePlaneacionCompra();
		String  finalQueryPaginacionTodos=this.detalleplaneacioncompraConstantesFunciones.getsFinalQueryDetallePlaneacionCompra();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetallePlaneacionCompraConstantesFunciones.getArrayColumnasGlobalesNoDetallePlaneacionCompra(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetallePlaneacionCompraConstantesFunciones.getArrayColumnasGlobalesDetallePlaneacionCompra(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetallePlaneacionCompraConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detalleplaneacioncomprasEliminados= new ArrayList<DetallePlaneacionCompra>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetallePlaneacionCompra();
		
				///*DetallePlaneacionCompraSessionBean*/this.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
			
			if(this.detalleplaneacioncompraSessionBean==null) {
				this.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
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
					this.iNumeroPaginacion=DetallePlaneacionCompraConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetallePlaneacionCompraConstantesFunciones.getClassesForeignKeysOfDetallePlaneacionCompra(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detalleplaneacioncompra."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detalleplaneacioncomprasAux= new ArrayList<DetallePlaneacionCompra>();
			
				
			detalleplaneacioncompraLogic.setDatosCliente(this.datosCliente);
			detalleplaneacioncompraLogic.setDatosDeep(this.datosDeep);
			detalleplaneacioncompraLogic.setIsConDeep(true);
			
			
			detalleplaneacioncompraLogic.getDetallePlaneacionCompraDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detalleplaneacioncompraLogic.getTodosDetallePlaneacionCompras(finalQueryGlobal,pagination);
					
					//detalleplaneacioncompraLogic.getTodosDetallePlaneacionComprasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detalleplaneacioncompraLogic.getDetallePlaneacionCompras()==null|| detalleplaneacioncompraLogic.getDetallePlaneacionCompras().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleplaneacioncomprasAux= new ArrayList<DetallePlaneacionCompra>();
							detalleplaneacioncomprasAux.addAll(detalleplaneacioncompraLogic.getDetallePlaneacionCompras());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleplaneacioncomprasAux= new ArrayList<DetallePlaneacionCompra>();
							detalleplaneacioncomprasAux.addAll(detalleplaneacioncompras);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleplaneacioncompraLogic.getTodosDetallePlaneacionCompras(finalQueryGlobal+"",this.pagination);												
							
							//detalleplaneacioncompraLogic.getTodosDetallePlaneacionComprasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetallePlaneacionCompras("Todos",detalleplaneacioncompraLogic.getDetallePlaneacionCompras() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleplaneacioncompraLogic.setDetallePlaneacionCompras(new ArrayList<DetallePlaneacionCompra>());					
							detalleplaneacioncompraLogic.getDetallePlaneacionCompras().addAll(detalleplaneacioncomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleplaneacioncompras=new ArrayList<DetallePlaneacionCompra>();
							detalleplaneacioncompras.addAll(detalleplaneacioncomprasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetallePlaneacionCompra=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetallePlaneacionCompra=this.idActual;
				
				} else if(this.idDetallePlaneacionCompraActual!=null && this.idDetallePlaneacionCompraActual!=0L) {
					idDetallePlaneacionCompra=idDetallePlaneacionCompraActual;
				}
				
					
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndicePorId(idDetallePlaneacionCompra);
				
				this.detalleplaneacioncompras=new ArrayList<DetallePlaneacionCompra>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detalleplaneacioncompraLogic.getEntity(idDetallePlaneacionCompra);
					
					//detalleplaneacioncompraLogic.getEntityWithConnection(idDetallePlaneacionCompra);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleplaneacioncompraLogic.setDetallePlaneacionCompras(new ArrayList<DetallePlaneacionCompra>());
					detalleplaneacioncompraLogic.getDetallePlaneacionCompras().add(detalleplaneacioncompraLogic.getDetallePlaneacionCompra());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleplaneacioncompras=new ArrayList<DetallePlaneacionCompra>();
					this.detalleplaneacioncompras.add(detalleplaneacioncompra);
				}
				
				if(detalleplaneacioncompraLogic.getDetallePlaneacionCompra()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleplaneacioncompraLogic.getDetallePlaneacionCompras()==null||detalleplaneacioncompraLogic.getDetallePlaneacionCompras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleplaneacioncompras==null|| detalleplaneacioncompras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleplaneacioncomprasAux=new ArrayList<DetallePlaneacionCompra>();
						detalleplaneacioncomprasAux.addAll(detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleplaneacioncomprasAux=new ArrayList<DetallePlaneacionCompra>();
							detalleplaneacioncomprasAux.addAll(detalleplaneacioncompras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePlaneacionCompras("FK_IdEjercicio",detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePlaneacionCompras("FK_IdEjercicio",detalleplaneacioncompras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleplaneacioncompraLogic.setDetallePlaneacionCompras(new ArrayList<DetallePlaneacionCompra>());
						detalleplaneacioncompraLogic.getDetallePlaneacionCompras().addAll(detalleplaneacioncomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleplaneacioncompras=new ArrayList<DetallePlaneacionCompra>();
							detalleplaneacioncompras.addAll(detalleplaneacioncomprasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleplaneacioncompraLogic.getDetallePlaneacionCompras()==null||detalleplaneacioncompraLogic.getDetallePlaneacionCompras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleplaneacioncompras==null|| detalleplaneacioncompras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleplaneacioncomprasAux=new ArrayList<DetallePlaneacionCompra>();
						detalleplaneacioncomprasAux.addAll(detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleplaneacioncomprasAux=new ArrayList<DetallePlaneacionCompra>();
							detalleplaneacioncomprasAux.addAll(detalleplaneacioncompras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePlaneacionCompras("FK_IdEmpresa",detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePlaneacionCompras("FK_IdEmpresa",detalleplaneacioncompras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleplaneacioncompraLogic.setDetallePlaneacionCompras(new ArrayList<DetallePlaneacionCompra>());
						detalleplaneacioncompraLogic.getDetallePlaneacionCompras().addAll(detalleplaneacioncomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleplaneacioncompras=new ArrayList<DetallePlaneacionCompra>();
							detalleplaneacioncompras.addAll(detalleplaneacioncomprasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdLinea")) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdLinea(finalQueryGlobal,pagination,id_lineaFK_IdLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleplaneacioncompraLogic.getDetallePlaneacionCompras()==null||detalleplaneacioncompraLogic.getDetallePlaneacionCompras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleplaneacioncompras==null|| detalleplaneacioncompras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleplaneacioncomprasAux=new ArrayList<DetallePlaneacionCompra>();
						detalleplaneacioncomprasAux.addAll(detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleplaneacioncomprasAux=new ArrayList<DetallePlaneacionCompra>();
							detalleplaneacioncomprasAux.addAll(detalleplaneacioncompras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdLinea(finalQueryGlobal,pagination,id_lineaFK_IdLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePlaneacionCompras("FK_IdLinea",detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePlaneacionCompras("FK_IdLinea",detalleplaneacioncompras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleplaneacioncompraLogic.setDetallePlaneacionCompras(new ArrayList<DetallePlaneacionCompra>());
						detalleplaneacioncompraLogic.getDetallePlaneacionCompras().addAll(detalleplaneacioncomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleplaneacioncompras=new ArrayList<DetallePlaneacionCompra>();
							detalleplaneacioncompras.addAll(detalleplaneacioncomprasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleplaneacioncompraLogic.getDetallePlaneacionCompras()==null||detalleplaneacioncompraLogic.getDetallePlaneacionCompras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleplaneacioncompras==null|| detalleplaneacioncompras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleplaneacioncomprasAux=new ArrayList<DetallePlaneacionCompra>();
						detalleplaneacioncomprasAux.addAll(detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleplaneacioncomprasAux=new ArrayList<DetallePlaneacionCompra>();
							detalleplaneacioncomprasAux.addAll(detalleplaneacioncompras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePlaneacionCompras("FK_IdPeriodo",detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePlaneacionCompras("FK_IdPeriodo",detalleplaneacioncompras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleplaneacioncompraLogic.setDetallePlaneacionCompras(new ArrayList<DetallePlaneacionCompra>());
						detalleplaneacioncompraLogic.getDetallePlaneacionCompras().addAll(detalleplaneacioncomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleplaneacioncompras=new ArrayList<DetallePlaneacionCompra>();
							detalleplaneacioncompras.addAll(detalleplaneacioncomprasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPlaneacionCompra")) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdPlaneacionCompra(id_planeacion_compraFK_IdPlaneacionCompra);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdPlaneacionCompra(finalQueryGlobal,pagination,id_planeacion_compraFK_IdPlaneacionCompra);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdPlaneacionCompra(id_planeacion_compraFK_IdPlaneacionCompra);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdPlaneacionCompra(id_planeacion_compraFK_IdPlaneacionCompra);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleplaneacioncompraLogic.getDetallePlaneacionCompras()==null||detalleplaneacioncompraLogic.getDetallePlaneacionCompras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleplaneacioncompras==null|| detalleplaneacioncompras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleplaneacioncomprasAux=new ArrayList<DetallePlaneacionCompra>();
						detalleplaneacioncomprasAux.addAll(detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleplaneacioncomprasAux=new ArrayList<DetallePlaneacionCompra>();
							detalleplaneacioncomprasAux.addAll(detalleplaneacioncompras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdPlaneacionCompra(finalQueryGlobal,pagination,id_planeacion_compraFK_IdPlaneacionCompra);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdPlaneacionCompra(id_planeacion_compraFK_IdPlaneacionCompra);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdPlaneacionCompra(id_planeacion_compraFK_IdPlaneacionCompra);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePlaneacionCompras("FK_IdPlaneacionCompra",detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePlaneacionCompras("FK_IdPlaneacionCompra",detalleplaneacioncompras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleplaneacioncompraLogic.setDetallePlaneacionCompras(new ArrayList<DetallePlaneacionCompra>());
						detalleplaneacioncompraLogic.getDetallePlaneacionCompras().addAll(detalleplaneacioncomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleplaneacioncompras=new ArrayList<DetallePlaneacionCompra>();
							detalleplaneacioncompras.addAll(detalleplaneacioncomprasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleplaneacioncompraLogic.getDetallePlaneacionCompras()==null||detalleplaneacioncompraLogic.getDetallePlaneacionCompras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleplaneacioncompras==null|| detalleplaneacioncompras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleplaneacioncomprasAux=new ArrayList<DetallePlaneacionCompra>();
						detalleplaneacioncomprasAux.addAll(detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleplaneacioncomprasAux=new ArrayList<DetallePlaneacionCompra>();
							detalleplaneacioncomprasAux.addAll(detalleplaneacioncompras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePlaneacionCompras("FK_IdProducto",detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePlaneacionCompras("FK_IdProducto",detalleplaneacioncompras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleplaneacioncompraLogic.setDetallePlaneacionCompras(new ArrayList<DetallePlaneacionCompra>());
						detalleplaneacioncompraLogic.getDetallePlaneacionCompras().addAll(detalleplaneacioncomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleplaneacioncompras=new ArrayList<DetallePlaneacionCompra>();
							detalleplaneacioncompras.addAll(detalleplaneacioncomprasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleplaneacioncompraLogic.getDetallePlaneacionCompras()==null||detalleplaneacioncompraLogic.getDetallePlaneacionCompras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleplaneacioncompras==null|| detalleplaneacioncompras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleplaneacioncomprasAux=new ArrayList<DetallePlaneacionCompra>();
						detalleplaneacioncomprasAux.addAll(detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleplaneacioncomprasAux=new ArrayList<DetallePlaneacionCompra>();
							detalleplaneacioncomprasAux.addAll(detalleplaneacioncompras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePlaneacionCompras("FK_IdSucursal",detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePlaneacionCompras("FK_IdSucursal",detalleplaneacioncompras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleplaneacioncompraLogic.setDetallePlaneacionCompras(new ArrayList<DetallePlaneacionCompra>());
						detalleplaneacioncompraLogic.getDetallePlaneacionCompras().addAll(detalleplaneacioncomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleplaneacioncompras=new ArrayList<DetallePlaneacionCompra>();
							detalleplaneacioncompras.addAll(detalleplaneacioncomprasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidad")) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleplaneacioncompraLogic.getDetallePlaneacionCompras()==null||detalleplaneacioncompraLogic.getDetallePlaneacionCompras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleplaneacioncompras==null|| detalleplaneacioncompras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleplaneacioncomprasAux=new ArrayList<DetallePlaneacionCompra>();
						detalleplaneacioncomprasAux.addAll(detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleplaneacioncomprasAux=new ArrayList<DetallePlaneacionCompra>();
							detalleplaneacioncomprasAux.addAll(detalleplaneacioncompras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePlaneacionCompras("FK_IdUnidad",detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePlaneacionCompras("FK_IdUnidad",detalleplaneacioncompras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleplaneacioncompraLogic.setDetallePlaneacionCompras(new ArrayList<DetallePlaneacionCompra>());
						detalleplaneacioncompraLogic.getDetallePlaneacionCompras().addAll(detalleplaneacioncomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleplaneacioncompras=new ArrayList<DetallePlaneacionCompra>();
							detalleplaneacioncompras.addAll(detalleplaneacioncomprasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetallePlaneacionCompra();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetallePlaneacionCompra();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleplaneacioncompraLogic.getDetallePlaneacionCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleplaneacioncompras.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleplaneacioncompraLogic.getDetallePlaneacionCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleplaneacioncompras.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetallePlaneacionCompra detalleplaneacioncompra) {
		Boolean permite=true;
		
		if(this.detalleplaneacioncompra.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetallePlaneacionCompraConstantesFunciones.getOrderByListaDetallePlaneacionCompra();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetallePlaneacionCompraConstantesFunciones.getOrderByListaDetallePlaneacionCompra();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePlaneacionCompra detalleplaneacioncompra:detalleplaneacioncompraLogic.getDetallePlaneacionCompras()) {
				if(detalleplaneacioncompra.getsType().equals(Constantes2.S_TOTALES)) {
					detalleplaneacioncompraTotales=detalleplaneacioncompra;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePlaneacionCompra detalleplaneacioncompra:this.detalleplaneacioncompras) {
				if(detalleplaneacioncompra.getsType().equals(Constantes2.S_TOTALES)) {
					detalleplaneacioncompraTotales=detalleplaneacioncompra;
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
			this.detalleplaneacioncompraAux=new DetallePlaneacionCompra();
			this.detalleplaneacioncompraAux.setsType(Constantes2.S_TOTALES);
			this.detalleplaneacioncompraAux.setIsNew(false);
			this.detalleplaneacioncompraAux.setIsChanged(false);
			this.detalleplaneacioncompraAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetallePlaneacionCompraConstantesFunciones.TotalizarValoresFilaDetallePlaneacionCompra(this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras(),this.detalleplaneacioncompraAux);
				
				this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().add(this.detalleplaneacioncompraAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetallePlaneacionCompraConstantesFunciones.TotalizarValoresFilaDetallePlaneacionCompra(this.detalleplaneacioncompras,this.detalleplaneacioncompraAux);
				
				this.detalleplaneacioncompras.add(this.detalleplaneacioncompraAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detalleplaneacioncompraTotales=new DetallePlaneacionCompra();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().remove(detalleplaneacioncompraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleplaneacioncompras.remove(detalleplaneacioncompraTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detalleplaneacioncompraTotales=new DetallePlaneacionCompra();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePlaneacionCompra detalleplaneacioncompra:detalleplaneacioncompraLogic.getDetallePlaneacionCompras()) {
				if(detalleplaneacioncompra.getsType().equals(Constantes2.S_TOTALES)) {
					detalleplaneacioncompraTotales=detalleplaneacioncompra;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetallePlaneacionCompraConstantesFunciones.TotalizarValoresFilaDetallePlaneacionCompra(this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras(),detalleplaneacioncompraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePlaneacionCompra detalleplaneacioncompra:this.detalleplaneacioncompras) {
				if(detalleplaneacioncompra.getsType().equals(Constantes2.S_TOTALES)) {
					detalleplaneacioncompraTotales=detalleplaneacioncompra;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetallePlaneacionCompraConstantesFunciones.TotalizarValoresFilaDetallePlaneacionCompra(this.detalleplaneacioncompras,detalleplaneacioncompraTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetallePlaneacionComprasFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePlaneacionComprasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePlaneacionComprasFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePlaneacionComprasFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePlaneacionComprasFK_IdPlaneacionCompra()throws Exception {
		try {
			sAccionBusqueda="FK_IdPlaneacionCompra";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePlaneacionComprasFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePlaneacionComprasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePlaneacionComprasFK_IdUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetallePlaneacionComprasFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePlaneacionComprasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePlaneacionComprasFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePlaneacionComprasFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePlaneacionComprasFK_IdPlaneacionCompra(String sFinalQuery,Long id_planeacion_compra)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdPlaneacionCompra(sFinalQuery,this.pagination,id_planeacion_compra);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePlaneacionComprasFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePlaneacionComprasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePlaneacionComprasFK_IdUnidad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleplaneacioncompraLogic.getDetallePlaneacionComprasFK_IdUnidad(sFinalQuery,this.pagination,id_unidad);
				
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
	
	public void inicializarPermisosDetallePlaneacionCompra() {
		this.isPermisoTodoDetallePlaneacionCompra=false;
		this.isPermisoNuevoDetallePlaneacionCompra=false;
		this.isPermisoActualizarDetallePlaneacionCompra=false;
		this.isPermisoActualizarOriginalDetallePlaneacionCompra=false;
		this.isPermisoEliminarDetallePlaneacionCompra=false;
		this.isPermisoGuardarCambiosDetallePlaneacionCompra=false;
		this.isPermisoConsultaDetallePlaneacionCompra=false;
		this.isPermisoBusquedaDetallePlaneacionCompra=false;
		this.isPermisoReporteDetallePlaneacionCompra=false;		
		this.isPermisoOrdenDetallePlaneacionCompra=false;		
		this.isPermisoPaginacionMedioDetallePlaneacionCompra=false;		
		this.isPermisoPaginacionAltoDetallePlaneacionCompra=false;
		this.isPermisoPaginacionTodoDetallePlaneacionCompra=false;
		this.isPermisoCopiarDetallePlaneacionCompra=false;		
		this.isPermisoVerFormDetallePlaneacionCompra=false;		
		this.isPermisoDuplicarDetallePlaneacionCompra=false;		
		this.isPermisoOrdenDetallePlaneacionCompra=false;		
	}
	
	public void setPermisosUsuarioDetallePlaneacionCompra(Boolean isPermiso) {
		this.isPermisoTodoDetallePlaneacionCompra=isPermiso;
		this.isPermisoNuevoDetallePlaneacionCompra=isPermiso;
		this.isPermisoActualizarDetallePlaneacionCompra=isPermiso;
		this.isPermisoActualizarOriginalDetallePlaneacionCompra=isPermiso;
		this.isPermisoEliminarDetallePlaneacionCompra=isPermiso;
		this.isPermisoGuardarCambiosDetallePlaneacionCompra=isPermiso;
		this.isPermisoConsultaDetallePlaneacionCompra=isPermiso;
		this.isPermisoBusquedaDetallePlaneacionCompra=isPermiso;
		this.isPermisoReporteDetallePlaneacionCompra=isPermiso;
		this.isPermisoOrdenDetallePlaneacionCompra=isPermiso;		
		this.isPermisoPaginacionMedioDetallePlaneacionCompra=isPermiso;		
		this.isPermisoPaginacionAltoDetallePlaneacionCompra=isPermiso;		
		this.isPermisoPaginacionTodoDetallePlaneacionCompra=isPermiso;		
		this.isPermisoCopiarDetallePlaneacionCompra=isPermiso;		
		this.isPermisoVerFormDetallePlaneacionCompra=isPermiso;		
		this.isPermisoDuplicarDetallePlaneacionCompra=isPermiso;
		this.isPermisoOrdenDetallePlaneacionCompra=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetallePlaneacionCompra(Boolean isPermiso) {
		//this.isPermisoTodoDetallePlaneacionCompra=isPermiso;
		this.isPermisoNuevoDetallePlaneacionCompra=isPermiso;
		this.isPermisoActualizarDetallePlaneacionCompra=isPermiso;
		this.isPermisoActualizarOriginalDetallePlaneacionCompra=isPermiso;
		this.isPermisoEliminarDetallePlaneacionCompra=isPermiso;
		this.isPermisoGuardarCambiosDetallePlaneacionCompra=isPermiso;
		//this.isPermisoConsultaDetallePlaneacionCompra=isPermiso;
		//this.isPermisoBusquedaDetallePlaneacionCompra=isPermiso;
		//this.isPermisoReporteDetallePlaneacionCompra=isPermiso;
		//this.isPermisoOrdenDetallePlaneacionCompra=isPermiso;		
		//this.isPermisoPaginacionMedioDetallePlaneacionCompra=isPermiso;		
		//this.isPermisoPaginacionAltoDetallePlaneacionCompra=isPermiso;		
		//this.isPermisoPaginacionTodoDetallePlaneacionCompra=isPermiso;		
		//this.isPermisoCopiarDetallePlaneacionCompra=isPermiso;		
		//this.isPermisoDuplicarDetallePlaneacionCompra=isPermiso;
		//this.isPermisoOrdenDetallePlaneacionCompra=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetallePlaneacionCompraClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetallePlaneacionCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetallePlaneacionCompra(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetallePlaneacionCompraClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetallePlaneacionCompraClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetallePlaneacionCompraClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetallePlaneacionCompraClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetallePlaneacionCompra() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetallePlaneacionCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetallePlaneacionCompraConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetallePlaneacionCompra=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetallePlaneacionCompra=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetallePlaneacionCompra=this.isPermisoActualizarDetallePlaneacionCompra;
			this.isPermisoEliminarDetallePlaneacionCompra=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetallePlaneacionCompra=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetallePlaneacionCompra=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetallePlaneacionCompra=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetallePlaneacionCompra=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetallePlaneacionCompra=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetallePlaneacionCompra=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetallePlaneacionCompra=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetallePlaneacionCompra=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetallePlaneacionCompra=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetallePlaneacionCompra=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetallePlaneacionCompra=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetallePlaneacionCompra=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetallePlaneacionCompra=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetallePlaneacionCompra.setToolTipText(this.jTableDatosDetallePlaneacionCompra.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetallePlaneacionCompra(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetallePlaneacionCompra(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetallePlaneacionCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetallePlaneacionCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetallePlaneacionCompra() throws Exception {
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
	public void inicializarCombosForeignKeyDetallePlaneacionCompraListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.planeacioncomprasForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetallePlaneacionCompraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetallePlaneacionCompraJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetallePlaneacionCompraListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPlaneacionCompraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPeriodoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPlaneacionCompraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.planeacioncomprasForeignKey==null||this.planeacioncomprasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PlaneacionCompraConstantesFunciones.getArrayColumnasGlobalesPlaneacionCompra(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PlaneacionCompraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PlaneacionCompraConstantesFunciones.SFINALQUERY;

				this.cargarCombosPlaneacionComprasForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyUnidadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UnidadConstantesFunciones.SFINALQUERY;

				this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDetallePlaneacionCompraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetallePlaneacionCompraParameterReturnGeneral detalleplaneacioncompraReturnGeneral=new DetallePlaneacionCompraParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detalleplaneacioncompraConstantesFunciones.cargarid_empresaDetallePlaneacionCompra)
					 || (this.esRecargarFks && this.detalleplaneacioncompraConstantesFunciones.cargarid_empresaDetallePlaneacionCompra)) {

					if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detalleplaneacioncompraSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.detalleplaneacioncompraConstantesFunciones.cargarid_sucursalDetallePlaneacionCompra)
					 || (this.esRecargarFks && this.detalleplaneacioncompraConstantesFunciones.cargarid_sucursalDetallePlaneacionCompra)) {

					if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+detalleplaneacioncompraSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.detalleplaneacioncompraConstantesFunciones.cargarid_ejercicioDetallePlaneacionCompra)
					 || (this.esRecargarFks && this.detalleplaneacioncompraConstantesFunciones.cargarid_ejercicioDetallePlaneacionCompra)) {

					if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+detalleplaneacioncompraSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.detalleplaneacioncompraConstantesFunciones.cargarid_periodoDetallePlaneacionCompra)
					 || (this.esRecargarFks && this.detalleplaneacioncompraConstantesFunciones.cargarid_periodoDetallePlaneacionCompra)) {

					if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+detalleplaneacioncompraSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalPlaneacionCompra="";

				if(((this.planeacioncomprasForeignKey==null||this.planeacioncomprasForeignKey.size()<=0) && this.detalleplaneacioncompraConstantesFunciones.cargarid_planeacion_compraDetallePlaneacionCompra)
					 || (this.esRecargarFks && this.detalleplaneacioncompraConstantesFunciones.cargarid_planeacion_compraDetallePlaneacionCompra)) {

					if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionPlaneacionCompra()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PlaneacionCompraConstantesFunciones.getArrayColumnasGlobalesPlaneacionCompra(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPlaneacionCompra=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PlaneacionCompraConstantesFunciones.TABLENAME);

						finalQueryGlobalPlaneacionCompra=Funciones.GetFinalQueryAppend(finalQueryGlobalPlaneacionCompra, "");
						finalQueryGlobalPlaneacionCompra+=PlaneacionCompraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPlaneacionComprasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPlaneacionCompra=" WHERE " + ConstantesSql.ID + "="+detalleplaneacioncompraSessionBean.getlidPlaneacionCompraActual();
					}
				} else {
					finalQueryGlobalPlaneacionCompra="NONE";
				}


				String finalQueryGlobalLinea="";

				if(((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0) && this.detalleplaneacioncompraConstantesFunciones.cargarid_lineaDetallePlaneacionCompra)
					 || (this.esRecargarFks && this.detalleplaneacioncompraConstantesFunciones.cargarid_lineaDetallePlaneacionCompra)) {

					if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLinea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLinea=Funciones.GetFinalQueryAppend(finalQueryGlobalLinea, "");
						finalQueryGlobalLinea+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLinea=" WHERE " + ConstantesSql.ID + "="+detalleplaneacioncompraSessionBean.getlidLineaActual();
					}
				} else {
					finalQueryGlobalLinea="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.detalleplaneacioncompraConstantesFunciones.cargarid_productoDetallePlaneacionCompra)
					 || (this.esRecargarFks && this.detalleplaneacioncompraConstantesFunciones.cargarid_productoDetallePlaneacionCompra)) {

					if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+detalleplaneacioncompraSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.detalleplaneacioncompraConstantesFunciones.cargarid_unidadDetallePlaneacionCompra)
					 || (this.esRecargarFks && this.detalleplaneacioncompraConstantesFunciones.cargarid_unidadDetallePlaneacionCompra)) {

					if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+detalleplaneacioncompraSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detalleplaneacioncompraReturnGeneral=detalleplaneacioncompraLogic.cargarCombosLoteForeignKeyDetallePlaneacionCompra(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalPlaneacionCompra,finalQueryGlobalLinea,finalQueryGlobalProducto,finalQueryGlobalUnidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detalleplaneacioncompraReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=detalleplaneacioncompraReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=detalleplaneacioncompraReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=detalleplaneacioncompraReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalPlaneacionCompra.equals("NONE")) {
				this.planeacioncomprasForeignKey=detalleplaneacioncompraReturnGeneral.getplaneacioncomprasForeignKey();
			}

			if(!finalQueryGlobalLinea.equals("NONE")) {
				this.lineasForeignKey=detalleplaneacioncompraReturnGeneral.getlineasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=detalleplaneacioncompraReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=detalleplaneacioncompraReturnGeneral.getunidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetallePlaneacionCompra()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyPlaneacionCompra();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyUnidad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.detalleplaneacioncompraSessionBean==null) {
				this.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
			}

			if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPeriodo()throws Exception {
		try {

			if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				Periodo periodo=new Periodo();
				PeriodoConstantesFunciones.setPeriodoDescripcion(periodo,Constantes.SMENSAJE_ESCOJA_OPCION);
				periodo.setId(null);

				if(!PeriodoConstantesFunciones.ExisteEnLista(this.periodosForeignKey,periodo,true)) {

					this.periodosForeignKey.add(0,periodo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPlaneacionCompra()throws Exception {
		try {

			if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionPlaneacionCompra()) {
				PlaneacionCompra planeacioncompra=new PlaneacionCompra();
				PlaneacionCompraConstantesFunciones.setPlaneacionCompraDescripcion(planeacioncompra,Constantes.SMENSAJE_ESCOJA_OPCION);
				planeacioncompra.setId(null);

				if(!PlaneacionCompraConstantesFunciones.ExisteEnLista(this.planeacioncomprasForeignKey,planeacioncompra,true)) {

					this.planeacioncomprasForeignKey.add(0,planeacioncompra);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {

			if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyUnidad()throws Exception {
		try {

			if(!this.detalleplaneacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
				Unidad unidad=new Unidad();
				UnidadConstantesFunciones.setUnidadDescripcion(unidad,Constantes.SMENSAJE_ESCOJA_OPCION);
				unidad.setId(null);

				if(!UnidadConstantesFunciones.ExisteEnLista(this.unidadsForeignKey,unidad,true)) {

					this.unidadsForeignKey.add(0,unidad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDetallePlaneacionCompra()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetallePlaneacionCompra(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetallePlaneacionCompra()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetallePlaneacionCompra();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetallePlaneacionCompra(DetallePlaneacionCompra detalleplaneacioncompra)throws Exception {	
		try {
			
			this.setActualPlaneacionCompraForeignKey(detalleplaneacioncompra.getid_planeacion_compra(),false,"Formulario");
			this.setActualLineaForeignKey(detalleplaneacioncompra.getid_linea(),false,"Formulario");
			this.setActualProductoForeignKey(detalleplaneacioncompra.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(detalleplaneacioncompra.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetallePlaneacionCompra(DetallePlaneacionCompra detalleplaneacioncompra,String sTipoEvento)throws Exception {	
		try {
			
			

				if(detalleplaneacioncompra.getProducto()!=null && !sTipoEvento.equals("id_productoDetallePlaneacionCompra")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(detalleplaneacioncompra.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetallePlaneacionCompra()throws Exception {	
		try {
			
			this.setActualPlaneacionCompraForeignKey(this.detalleplaneacioncompraConstantesFunciones.getid_planeacion_compra(),false,"Formulario");
			this.setActualLineaForeignKey(this.detalleplaneacioncompraConstantesFunciones.getid_linea(),false,"Formulario");
			this.setActualProductoForeignKey(this.detalleplaneacioncompraConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(this.detalleplaneacioncompraConstantesFunciones.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetallePlaneacionCompra()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_ejercicioDetallePlaneacionCompra.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_periodoDetallePlaneacionCompra.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetallePlaneacionCompra()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetallePlaneacionCompra()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetallePlaneacionCompra()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetallePlaneacionCompra()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFramePlaneacionComprasForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetallePlaneacionCompra(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePlaneacionComprasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetallePlaneacionCompra()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_empresaDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_empresaDetallePlaneacionCompra.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_empresaDetallePlaneacionCompra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_sucursalDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_sucursalDetallePlaneacionCompra.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_sucursalDetallePlaneacionCompra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_ejercicioDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_ejercicioDetallePlaneacionCompra.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_ejercicioDetallePlaneacionCompra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_periodoDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_periodoDetallePlaneacionCompra.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_periodoDetallePlaneacionCompra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_planeacion_compraDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_planeacion_compraDetallePlaneacionCompra.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_planeacion_compraDetallePlaneacionCompra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_lineaDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_lineaDetallePlaneacionCompra.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_lineaDetallePlaneacionCompra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_productoDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_productoDetallePlaneacionCompra.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_productoDetallePlaneacionCompra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_unidadDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_unidadDetallePlaneacionCompra.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_unidadDetallePlaneacionCompra.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public DetallePlaneacionCompraBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetallePlaneacionCompraBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetallePlaneacionCompraBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean(); 
		this.detalleplaneacioncompraConstantesFunciones=new DetallePlaneacionCompraConstantesFunciones(); 
		this.detalleplaneacioncompraBean=new DetallePlaneacionCompra();//(this.detalleplaneacioncompraConstantesFunciones); 		
		this.detalleplaneacioncompraReturnGeneral=new DetallePlaneacionCompraParameterReturnGeneral(); 
		
		this.detalleplaneacioncompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleplaneacioncompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetallePlaneacionCompraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetallePlaneacionCompraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetallePlaneacionCompraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetallePlaneacionCompra(true);
			
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
			
			this.detalleplaneacioncompraConstantesFunciones=new DetallePlaneacionCompraConstantesFunciones(); 
			this.detalleplaneacioncompraBean=new DetallePlaneacionCompra();//this.detalleplaneacioncompraConstantesFunciones); 			
			this.detalleplaneacioncompraReturnGeneral=new DetallePlaneacionCompraParameterReturnGeneral(); 
		
			DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Planeacion Compra Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.detalleplaneacioncompra=new DetallePlaneacionCompra();
			this.detalleplaneacioncompras = new ArrayList<DetallePlaneacionCompra>();
			this.detalleplaneacioncomprasAux = new ArrayList<DetallePlaneacionCompra>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic=new DetallePlaneacionCompraLogic();
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}
			
			//this.detalleplaneacioncompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detalleplaneacioncompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetallePlaneacionCompra);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetallePlaneacionCompra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetallePlaneacionCompra);	
					}
					
					if(this.jInternalFrameImportacionDetallePlaneacionCompra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetallePlaneacionCompra);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetallePlaneacionCompra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetallePlaneacionCompra);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetallePlaneacionCompra);
				this.jInternalFrameDetalleFormDetallePlaneacionCompra.setVisible(false);
				this.jInternalFrameDetalleFormDetallePlaneacionCompra.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetallePlaneacionCompra!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetallePlaneacionCompra);
					this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.setVisible(false);
					this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetallePlaneacionCompra!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetallePlaneacionCompra);
					this.jInternalFrameImportacionDetallePlaneacionCompra.setVisible(false);
					this.jInternalFrameImportacionDetallePlaneacionCompra.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetallePlaneacionCompra!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetallePlaneacionCompra);
					this.jInternalFrameOrderByDetallePlaneacionCompra.setVisible(false);
					this.jInternalFrameOrderByDetallePlaneacionCompra.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetallePlaneacionCompraActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetallePlaneacionCompraConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detalleplaneacioncompraReturnGeneral=new DetallePlaneacionCompraParameterReturnGeneral();
			
			this.detalleplaneacioncompraParameterGeneral=new DetallePlaneacionCompraParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detalleplaneacioncompraLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetallePlaneacionCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetallePlaneacionCompraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado(),this.detalleplaneacioncompraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetallePlaneacionCompraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado(),this.detalleplaneacioncompraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaDuplicarDetallePlaneacionCompra=true;
			this.isVisibilidadCeldaCopiarDetallePlaneacionCompra=true;
			this.isVisibilidadCeldaVerFormDetallePlaneacionCompra=true;
			this.isVisibilidadCeldaOrdenDetallePlaneacionCompra=true;
			this.isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaModificarDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaActualizarDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaEliminarDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaCancelarDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaGuardarDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra=false;
			
			
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdPlaneacionCompra=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdUnidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetallePlaneacionCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetallePlaneacionCompra();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetallePlaneacionCompra(false);
			
			this.setPermisosUsuarioDetallePlaneacionCompra();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() 
				|| (this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() && this.detalleplaneacioncompraSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetallePlaneacionCompraClasesRelacionadas();
			}
			
			if(this.detalleplaneacioncompraSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetallePlaneacionCompraClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetallePlaneacionCompra();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetallePlaneacionCompra();
			}
			
			if(!this.isPermisoBusquedaDetallePlaneacionCompra) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetallePlaneacionCompra.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetallePlaneacionCompra,this.isPermisoPaginacionMedioDetallePlaneacionCompra,this.isPermisoPaginacionTodoDetallePlaneacionCompra);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetallePlaneacionCompraConstantesFunciones.getTiposSeleccionarDetallePlaneacionCompra());
				
				this.tiposColumnasSelect=DetallePlaneacionCompraConstantesFunciones.getTiposSeleccionarDetallePlaneacionCompra(true);
				
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
			//if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetallePlaneacionCompra();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioDetallePlaneacionCompra(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioDetallePlaneacionCompra(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetallePlaneacionCompra() ;
			
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
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.planeacioncompraLogic=new PlaneacionCompraLogic();
			this.lineaLogic=new LineaLogic();
			this.productoLogic=new ProductoLogic();
			this.unidadLogic=new UnidadLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				detalleplaneacioncompraImplementable= (DetallePlaneacionCompraImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetallePlaneacionCompraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detalleplaneacioncompraImplementableHome= (DetallePlaneacionCompraImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetallePlaneacionCompraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detalleplaneacioncompras= new ArrayList<DetallePlaneacionCompra>();
			this.detalleplaneacioncomprasEliminados= new ArrayList<DetallePlaneacionCompra>();
						
			this.isEsNuevoDetallePlaneacionCompra=false;
			this.esParaAccionDesdeFormularioDetallePlaneacionCompra=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.planeacioncomprasForeignKey=new ArrayList<PlaneacionCompra>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetallePlaneacionCompra(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetallePlaneacionCompra();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetallePlaneacionCompraConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetallePlaneacionCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetallePlaneacionCompra(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetallePlaneacionCompra();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetallePlaneacionCompra();
			}
			
			DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetallePlaneacionCompra.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetallePlaneacionCompra.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetallePlaneacionCompra.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetallePlaneacionCompra(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetallePlaneacionCompra: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetallePlaneacionCompra() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetallePlaneacionCompra")) {
				iIndex=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTabbedPaneRelacionesDetallePlaneacionCompra.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTabbedPaneRelacionesDetallePlaneacionCompra.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetallePlaneacionCompra();	
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
	
	public void cargarCombosForeignKeyDetallePlaneacionCompra(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetallePlaneacionCompra(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetallePlaneacionCompra(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetallePlaneacionCompraListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetallePlaneacionCompra();
		
		this.cargarCombosFrameForeignKeyDetallePlaneacionCompra();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetallePlaneacionCompra();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetallePlaneacionCompra();
		}
	}
	
	

	public void cargarCombosForeignKeyPlaneacionCompra(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPlaneacionCompraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPlaneacionCompra();
				this.cargarCombosFramePlaneacionComprasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPlaneacionCompra(this.planeacioncomprasForeignKey);

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

	public void cargarCombosForeignKeyUnidad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaUnidad(this.unidadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDetallePlaneacionCompraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detalleplaneacioncompraSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
			
			
			if(jTableDatosDetallePlaneacionCompra.getRowCount()>=1) {
				jTableDatosDetallePlaneacionCompra.removeRowSelectionInterval(0, jTableDatosDetallePlaneacionCompra.getRowCount()-1);						
			}
			
			this.isEsNuevoDetallePlaneacionCompra=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetallePlaneacionCompra(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetallePlaneacionCompra(true);			
			//this.detalleplaneacioncompra=new DetallePlaneacionCompra();
			//this.detalleplaneacioncompra.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetallePlaneacionCompra(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallePlaneacionCompra() ;
			
			if(DetallePlaneacionCompraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetallePlaneacionCompra(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detalleplaneacioncompra);	
			this.actualizarInformacion("INFO_PADRE",false,this.detalleplaneacioncompra);				
			
			DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
			
			if(this.detalleplaneacioncompraSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetallePlaneacionCompra: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetallePlaneacionCompraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetallePlaneacionCompra> detalleplaneacioncomprasSeleccionados=new ArrayList<DetallePlaneacionCompra>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetallePlaneacionCompra.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetallePlaneacionCompra.getSelectedRows().length;			
			}
			
			detalleplaneacioncomprasSeleccionados=this.getDetallePlaneacionComprasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetallePlaneacionCompra--;			
				//DetallePlaneacionCompra detalleplaneacioncompraAux= new DetallePlaneacionCompra();			
				//detalleplaneacioncompraAux.setId(this.iIdNuevoDetallePlaneacionCompra);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetallePlaneacionCompra detalleplaneacioncompraOrigen=new DetallePlaneacionCompra();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetallePlaneacionCompra detalleplaneacioncompraOrigen : detalleplaneacioncomprasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detalleplaneacioncompraOrigen =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleplaneacioncompraOrigen =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetallePlaneacionCompra();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detalleplaneacioncompra.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetallePlaneacionCompra(detalleplaneacioncompraOrigen,this.detalleplaneacioncompra,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().add(this.detalleplaneacioncompraAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleplaneacioncompras.add(this.detalleplaneacioncompraAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetallePlaneacionCompra(false);
				
				this.jTableDatosDetallePlaneacionCompra.setRowSelectionInterval(this.getIndiceNuevoDetallePlaneacionCompra(), this.getIndiceNuevoDetallePlaneacionCompra());
				
				int iLastRow =  this.jTableDatosDetallePlaneacionCompra.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetallePlaneacionCompra.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetallePlaneacionCompra.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetallePlaneacionCompra(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetallePlaneacionCompra> detalleplaneacioncomprasSeleccionados=new ArrayList<DetallePlaneacionCompra>();									
		
			DetallePlaneacionCompra detalleplaneacioncompraOrigen=new DetallePlaneacionCompra();
			DetallePlaneacionCompra detalleplaneacioncompraDestino=new DetallePlaneacionCompra();
				
			detalleplaneacioncomprasSeleccionados=this.getDetallePlaneacionComprasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetallePlaneacionCompra.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detalleplaneacioncomprasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetallePlaneacionCompra.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleplaneacioncompraOrigen =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleplaneacioncompraOrigen =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleplaneacioncompraDestino =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleplaneacioncompraDestino =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detalleplaneacioncompraOrigen =detalleplaneacioncomprasSeleccionados.get(0);
				detalleplaneacioncompraDestino =detalleplaneacioncomprasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetallePlaneacionCompra(detalleplaneacioncompraOrigen,detalleplaneacioncompraDestino,true,false);
				
				detalleplaneacioncompraDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleplaneacioncompraDestino,detalleplaneacioncompraLogic.getDetallePlaneacionCompras());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleplaneacioncompraDestino,detalleplaneacioncompras);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetallePlaneacionCompra(false);
				
				//this.jTableDatosDetallePlaneacionCompra.setRowSelectionInterval(this.getIndiceNuevoDetallePlaneacionCompra(), this.getIndiceNuevoDetallePlaneacionCompra());
				
				int iLastRow =  this.jTableDatosDetallePlaneacionCompra.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetallePlaneacionCompra.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetallePlaneacionCompra.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetallePlaneacionCompra(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetallePlaneacionCompra.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetallePlaneacionCompra.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetallePlaneacionCompra.setVisible(!isVisible);
			this.jPanelPaginacionDetallePlaneacionCompra.setVisible(!isVisible);
			this.jPanelAccionesDetallePlaneacionCompra.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetallePlaneacionCompra();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetallePlaneacionCompra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetallePlaneacionCompra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetallePlaneacionCompra();
			
			this.abrirFrameOrderByDetallePlaneacionCompra();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetallePlaneacionCompra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetallePlaneacionCompra(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetallePlaneacionCompra);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetallePlaneacionCompra.isMaximum()) {
					this.jInternalFrameDetalleFormDetallePlaneacionCompra.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetallePlaneacionCompra.setSize(this.jInternalFrameDetalleFormDetallePlaneacionCompra.iWidthFormulario,this.jInternalFrameDetalleFormDetallePlaneacionCompra.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetallePlaneacionCompra.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetallePlaneacionCompra.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetallePlaneacionCompra.isMaximum()) {
						this.jInternalFrameDetalleFormDetallePlaneacionCompra.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jContentPaneDetalleDetallePlaneacionCompra.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTabbedPaneRelacionesDetallePlaneacionCompra.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jContentPaneDetalleDetallePlaneacionCompra.getWidth(),DetallePlaneacionCompraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTabbedPaneRelacionesDetallePlaneacionCompra.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jContentPaneDetalleDetallePlaneacionCompra.getWidth(),DetallePlaneacionCompraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTabbedPaneRelacionesDetallePlaneacionCompra.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jContentPaneDetalleDetallePlaneacionCompra.getWidth(),DetallePlaneacionCompraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetallePlaneacionCompra.setVisible(true);
	        this.jInternalFrameDetalleFormDetallePlaneacionCompra.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetallePlaneacionCompra() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetallePlaneacionCompra==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetallePlaneacionCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePlaneacionCompra,false,this);
				} else {
					this.jInternalFrameOrderByDetallePlaneacionCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePlaneacionCompra,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetallePlaneacionCompra);
				this.jInternalFrameOrderByDetallePlaneacionCompra.setVisible(false);
				this.jInternalFrameOrderByDetallePlaneacionCompra.setSelected(false);
				
				this.jInternalFrameOrderByDetallePlaneacionCompra.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetallePlaneacionCompra"));
				
				this.inicializarActualizarBindingTablaOrderByDetallePlaneacionCompra();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetallePlaneacionCompra() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetallePlaneacionCompra==null) {
				
				this.jInternalFrameImportacionDetallePlaneacionCompra=new ImportacionJInternalFrame(DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetallePlaneacionCompra);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetallePlaneacionCompra);
				this.jInternalFrameImportacionDetallePlaneacionCompra.setVisible(false);
				this.jInternalFrameImportacionDetallePlaneacionCompra.setSelected(false);


				this.jInternalFrameImportacionDetallePlaneacionCompra.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetallePlaneacionCompra"));
				this.jInternalFrameImportacionDetallePlaneacionCompra.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetallePlaneacionCompra"));
				this.jInternalFrameImportacionDetallePlaneacionCompra.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetallePlaneacionCompra"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetallePlaneacionCompra() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetallePlaneacionCompra==null) {
				this.jInternalFrameReporteDinamicoDetallePlaneacionCompra=new ReporteDinamicoJInternalFrame(DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetallePlaneacionCompra);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetallePlaneacionCompra);
				this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.setVisible(false);
				this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetallePlaneacionCompra"));
				this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetallePlaneacionCompra"));
				this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetallePlaneacionCompra"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetallePlaneacionCompra();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetallePlaneacionCompra() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetallePlaneacionCompra);
			
	       	this.jInternalFrameDetalleFormDetallePlaneacionCompra.setVisible(false);
	        this.jInternalFrameDetalleFormDetallePlaneacionCompra.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetallePlaneacionCompra.dispose();
			//this.jInternalFrameDetalleFormDetallePlaneacionCompra=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetallePlaneacionCompra() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetallePlaneacionCompra() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetallePlaneacionCompra.setVisible(true);
	        this.jInternalFrameImportacionDetallePlaneacionCompra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetallePlaneacionCompra() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetallePlaneacionCompra.setVisible(true);
	        this.jInternalFrameOrderByDetallePlaneacionCompra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetallePlaneacionCompra() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetallePlaneacionCompra.setVisible(false);
	        this.jInternalFrameOrderByDetallePlaneacionCompra.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetallePlaneacionCompra() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetallePlaneacionCompra() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetallePlaneacionCompra.setVisible(false);
	        this.jInternalFrameImportacionDetallePlaneacionCompra.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderDetallePlaneacionCompra=(TitledBorder)this.jScrollPanelDatosDetallePlaneacionCompra.getBorder();
						TitledBorder titledBorderLinea=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLinea.setTitle(titledBorderDetallePlaneacionCompra.getTitle() + " -> Linea");


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
	
	public void jButtonModificarDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetallePlaneacionCompra(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetallePlaneacionCompra(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetallePlaneacionCompra(true);
			//this.isEsNuevoDetallePlaneacionCompra=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetallePlaneacionCompra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetallePlaneacionCompra(false) ;
			
			if(detalleplaneacioncompraSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetallePlaneacionCompraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetallePlaneacionCompra(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallePlaneacionCompra(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetallePlaneacionCompraActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetallePlaneacionCompra(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetallePlaneacionCompra(true);
			//this.isEsNuevoDetallePlaneacionCompra=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detalleplaneacioncompra.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetallePlaneacionCompra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetallePlaneacionCompra(false) ;
			
			if(DetallePlaneacionCompraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetallePlaneacionCompra(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallePlaneacionCompra(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.detalleplaneacioncompraConstantesFunciones.cargarid_productoDetallePlaneacionCompra) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaPlaneacionCompra(List<PlaneacionCompra> planeacioncomprasForeignKey)throws Exception{
		TableColumn tableColumnPlaneacionCompra=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,DetallePlaneacionCompraConstantesFunciones.LABEL_IDPLANEACIONCOMPRA));
		TableCellEditor tableCellEditorPlaneacionCompra =tableColumnPlaneacionCompra.getCellEditor();

		PlaneacionCompraTableCell planeacioncompraTableCellFk=(PlaneacionCompraTableCell)tableCellEditorPlaneacionCompra;

		if(planeacioncompraTableCellFk!=null) {
			planeacioncompraTableCellFk.setplaneacioncomprasForeignKey(planeacioncomprasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

		//if(intSelectedRow<=0) {
			//planeacioncompraTableCellFk.setRowActual(intSelectedRow);
			//planeacioncompraTableCellFk.setplaneacioncomprasForeignKeyActual(planeacioncomprasForeignKey);
		//}


		if(planeacioncompraTableCellFk!=null) {
			planeacioncompraTableCellFk.RecargarPlaneacionComprasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,DetallePlaneacionCompraConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,DetallePlaneacionCompraConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaUnidad(List<Unidad> unidadsForeignKey)throws Exception{
		TableColumn tableColumnUnidad=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,DetallePlaneacionCompraConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

		//if(intSelectedRow<=0) {
			//unidadTableCellFk.setRowActual(intSelectedRow);
			//unidadTableCellFk.setunidadsForeignKeyActual(unidadsForeignKey);
		//}


		if(unidadTableCellFk!=null) {
			unidadTableCellFk.RecargarUnidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetallePlaneacionCompra(false);
			
			//if(!this.isEsNuevoDetallePlaneacionCompra) {								
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
				
			}
			
			if(this.permiteMantenimiento(this.detalleplaneacioncompra)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetallePlaneacionCompra=true;
					this.inicializarActualizarBindingTablaDetallePlaneacionCompra(false);
					this.isEsNuevoDetallePlaneacionCompra=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetallePlaneacionCompra=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetallePlaneacionCompra=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetallePlaneacionCompra(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetallePlaneacionCompra(false);
				
				this.habilitarDeshabilitarControlesDetallePlaneacionCompra(false);
			
												
				
				if(DetallePlaneacionCompraJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetallePlaneacionCompra();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetallePlaneacionCompraActionPerformed(evt,detalleplaneacioncompraSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetallePlaneacionCompra(this.detalleplaneacioncompra,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetallePlaneacionCompra.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detalleplaneacioncompraSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detalleplaneacioncompra.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetallePlaneacionCompra.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePlaneacionCompra.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				this.detalleplaneacioncompra.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				this.detalleplaneacioncompra.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detalleplaneacioncompra)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetallePlaneacionCompraModel) this.jTableDatosDetallePlaneacionCompra.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetallePlaneacionCompra=true;
				this.inicializarActualizarBindingTablaDetallePlaneacionCompra(false);
				this.isEsNuevoDetallePlaneacionCompra=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetallePlaneacionCompra(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetallePlaneacionCompra(false);
				
				this.habilitarDeshabilitarControlesDetallePlaneacionCompra(false);
				
				
				
				if(DetallePlaneacionCompraJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetallePlaneacionCompra();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetallePlaneacionCompra.getRowCount()>=1) {
				jTableDatosDetallePlaneacionCompra.removeRowSelectionInterval(0, jTableDatosDetallePlaneacionCompra.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetallePlaneacionCompra(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetallePlaneacionCompra(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetallePlaneacionCompra(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallePlaneacionCompra(false) ;
			
			this.isEsNuevoDetallePlaneacionCompra=false;
			
			if(DetallePlaneacionCompraJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetallePlaneacionCompra();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetallePlaneacionCompra(false);
				
				//SI ES MANUAL
				if(DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetallePlaneacionCompra();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetallePlaneacionCompra--;			
			//DetallePlaneacionCompra detalleplaneacioncompraAux= new DetallePlaneacionCompra();			
			//detalleplaneacioncompraAux.setId(this.iIdNuevoDetallePlaneacionCompra);
			
			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetallePlaneacionCompra();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
			
			this.detalleplaneacioncompra.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().add(this.detalleplaneacioncompraAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detalleplaneacioncompras.add(this.detalleplaneacioncompraAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetallePlaneacionCompra(false);
			
			this.jTableDatosDetallePlaneacionCompra.setRowSelectionInterval(this.getIndiceNuevoDetallePlaneacionCompra(), this.getIndiceNuevoDetallePlaneacionCompra());
			
			int iLastRow =  this.jTableDatosDetallePlaneacionCompra.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetallePlaneacionCompra.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetallePlaneacionCompra.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetallePlaneacionCompra(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallePlaneacionCompra(false);
			
			//SI ES MANUAL
			if(DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetallePlaneacionCompra();
			}
			
			//this.abrirFrameTreeDetallePlaneacionCompra();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle Planeacion CompraS ?", "MANTENIMIENTO DE Detalle Planeacion Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetallePlaneacionCompra.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetallePlaneacionCompra();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detalleplaneacioncompraReturnGeneral=detalleplaneacioncompraLogic.procesarImportacionDetallePlaneacionComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detalleplaneacioncompraParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetallePlaneacionCompraReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetallePlaneacionCompra.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetallePlaneacionCompra.setFileImportacion(this.jInternalFrameImportacionDetallePlaneacionCompra.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetallePlaneacionCompra.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetallePlaneacionCompra.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetallePlaneacionCompra.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetallePlaneacionCompra.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetallePlaneacionCompra> detalleplaneacioncomprasSeleccionados=new ArrayList<DetallePlaneacionCompra>();		

		detalleplaneacioncomprasSeleccionados=this.getDetallePlaneacionComprasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetallePlaneacionCompraBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetallePlaneacionCompraBaseDesign.jrxml";
			
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
			
			this.generarReporteDetallePlaneacionCompras("Todos",detalleplaneacioncomprasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Planeacion Compra",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDPLANEACIONCOMPRA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_PlaneacionCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_PlaneacionCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_PlaneacionCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_PlaneacionCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDLINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Linea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Linea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Linea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Linea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_STOCK:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ock_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ock_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ock_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ock_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMINIMO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_aMinimo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_aMinimo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_aMinimo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_aMinimo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMINIMO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ockMinimo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ockMinimo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ockMinimo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ockMinimo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMAXIMO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_aMaximo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_aMaximo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_aMaximo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_aMaximo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMAXIMO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ockMaximo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ockMaximo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ockMaximo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ockMaximo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_SALIDA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lida_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lida_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lida_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lida_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMENSUAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ockMensual_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ockMensual_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ockMensual_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ockMensual_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDPLANEACIONCOMPRA:
					sNombreCampoCategoria="id_planeacion_compra";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoria="id_linea";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_STOCK:
					sNombreCampoCategoria="stock";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMINIMO:
					sNombreCampoCategoria="dia_minimo";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMINIMO:
					sNombreCampoCategoria="stock_minimo";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMAXIMO:
					sNombreCampoCategoria="dia_maximo";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMAXIMO:
					sNombreCampoCategoria="stock_maximo";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_SALIDA:
					sNombreCampoCategoria="salida";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMENSUAL:
					sNombreCampoCategoria="stock_mensual";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDPLANEACIONCOMPRA:
					sNombreCampoCategoriaValor="id_planeacion_compra";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoriaValor="id_linea";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_STOCK:
					sNombreCampoCategoriaValor="stock";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMINIMO:
					sNombreCampoCategoriaValor="dia_minimo";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMINIMO:
					sNombreCampoCategoriaValor="stock_minimo";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMAXIMO:
					sNombreCampoCategoriaValor="dia_maximo";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMAXIMO:
					sNombreCampoCategoriaValor="stock_maximo";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_SALIDA:
					sNombreCampoCategoriaValor="salida";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMENSUAL:
					sNombreCampoCategoriaValor="stock_mensual";
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDPLANEACIONCOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Planeacion Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_planeacion_compra");
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDLINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea");
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_STOCK:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Stock",sNombreCampoCategoria,sNombreCampoCategoriaValor,"stock");
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMINIMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dia Minimo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dia_minimo");
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMINIMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Stock Minimo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"stock_minimo");
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMAXIMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dia Maximo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dia_maximo");
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMAXIMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Stock Maximo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"stock_maximo");
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_SALIDA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Salida",sNombreCampoCategoria,sNombreCampoCategoriaValor,"salida");
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMENSUAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Stock Mensual",sNombreCampoCategoria,sNombreCampoCategoriaValor,"stock_mensual");
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetallePlaneacionCompra> detalleplaneacioncomprasSeleccionados=new ArrayList<DetallePlaneacionCompra>();		
		
		detalleplaneacioncomprasSeleccionados=this.getDetallePlaneacionComprasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleplaneacioncompra";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetallePlaneacionCompras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetallePlaneacionCompra detalleplaneacioncompra:detalleplaneacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleplaneacioncompra.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DetallePlaneacionCompra detalleplaneacioncompra:detalleplaneacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleplaneacioncompra.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(DetallePlaneacionCompra detalleplaneacioncompra:detalleplaneacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleplaneacioncompra.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(DetallePlaneacionCompra detalleplaneacioncompra:detalleplaneacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleplaneacioncompra.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDPLANEACIONCOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDPLANEACIONCOMPRA);
					iRow++;

					for(DetallePlaneacionCompra detalleplaneacioncompra:detalleplaneacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleplaneacioncompra.getplaneacioncompra_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(DetallePlaneacionCompra detalleplaneacioncompra:detalleplaneacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleplaneacioncompra.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(DetallePlaneacionCompra detalleplaneacioncompra:detalleplaneacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleplaneacioncompra.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(DetallePlaneacionCompra detalleplaneacioncompra:detalleplaneacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleplaneacioncompra.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_STOCK:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCK);
					iRow++;

					for(DetallePlaneacionCompra detalleplaneacioncompra:detalleplaneacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleplaneacioncompra.getstock());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMINIMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMINIMO);
					iRow++;

					for(DetallePlaneacionCompra detalleplaneacioncompra:detalleplaneacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleplaneacioncompra.getdia_minimo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMINIMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMINIMO);
					iRow++;

					for(DetallePlaneacionCompra detalleplaneacioncompra:detalleplaneacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleplaneacioncompra.getstock_minimo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMAXIMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMAXIMO);
					iRow++;

					for(DetallePlaneacionCompra detalleplaneacioncompra:detalleplaneacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleplaneacioncompra.getdia_maximo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMAXIMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMAXIMO);
					iRow++;

					for(DetallePlaneacionCompra detalleplaneacioncompra:detalleplaneacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleplaneacioncompra.getstock_maximo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_SALIDA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_SALIDA);
					iRow++;

					for(DetallePlaneacionCompra detalleplaneacioncompra:detalleplaneacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleplaneacioncompra.getsalida());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMENSUAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMENSUAL);
					iRow++;

					for(DetallePlaneacionCompra detalleplaneacioncompra:detalleplaneacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleplaneacioncompra.getstock_mensual());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(DetallePlaneacionCompra detalleplaneacioncompra:detalleplaneacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleplaneacioncompra.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelDetallePlaneacionCompra(row);				
			//	iRow++;
			//}				
			
			//for(DetallePlaneacionCompra detalleplaneacioncompraAux:detalleplaneacioncomprasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetallePlaneacionCompra(detalleplaneacioncompraAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Planeacion Compra",JOptionPane.INFORMATION_MESSAGE);
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
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallePlaneacionCompra(false);
			
			//SI ES MANUAL
			if(DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetallePlaneacionCompra();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallePlaneacionCompra(false);
			
			//SI ES MANUAL
			if(DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetallePlaneacionCompra();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallePlaneacionCompra(false);
			
			//SI ES MANUAL
			if(DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetallePlaneacionCompra();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetallePlaneacionCompra() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetallePlaneacionCompra.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetallePlaneacionCompra.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetallePlaneacionCompra.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetallePlaneacionCompra.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetallePlaneacionCompra.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetallePlaneacionCompra.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetallePlaneacionCompra.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetallePlaneacionCompra(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetallePlaneacionCompra(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetallePlaneacionCompra(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetallePlaneacionCompra(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetallePlaneacionCompra(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetallePlaneacionCompra(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetallePlaneacionCompra(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetallePlaneacionCompra(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetallePlaneacionCompra() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetallePlaneacionCompra();
		
		this.inicializarActualizarBindingBotonesManualDetallePlaneacionCompra(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetallePlaneacionCompra();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetallePlaneacionCompra() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetallePlaneacionCompra(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetallePlaneacionCompra(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetallePlaneacionCompra.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetallePlaneacionCompra.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetallePlaneacionCompra.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jCheckBoxPostAccionNuevoDetallePlaneacionCompra.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jCheckBoxPostAccionSinCerrarDetallePlaneacionCompra.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jCheckBoxPostAccionSinMensajeDetallePlaneacionCompra.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetallePlaneacionCompra.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetallePlaneacionCompra.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetallePlaneacionCompra.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
				this.jInternalFrameDetalleFormDetallePlaneacionCompra.jCheckBoxPostAccionNuevoDetallePlaneacionCompra.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetallePlaneacionCompra.jCheckBoxPostAccionSinCerrarDetallePlaneacionCompra.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetallePlaneacionCompra.jCheckBoxPostAccionSinMensajeDetallePlaneacionCompra.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetallePlaneacionCompra.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetallePlaneacionCompra.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetallePlaneacionCompra.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetallePlaneacionCompra!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetallePlaneacionCompra.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetallePlaneacionCompra.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetallePlaneacionCompra.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetallePlaneacionCompra.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetallePlaneacionCompra!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetallePlaneacionCompra.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetallePlaneacionCompra.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetallePlaneacionCompra(Boolean esInicializar) throws Exception {
		try	{	
			if(DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetallePlaneacionCompra(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetallePlaneacionCompra() throws Exception {
		try	{
			if(DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetallePlaneacionCompra();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetallePlaneacionCompra() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetallePlaneacionCompra() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetallePlaneacionCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetallePlaneacionCompra.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetallePlaneacionCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetallePlaneacionCompra.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetallePlaneacionCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetallePlaneacionCompra.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetallePlaneacionCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetallePlaneacionCompra.addItem(reporte);
			}
			
			
			if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetallePlaneacionCompra.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetallePlaneacionCompra.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetallePlaneacionCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetallePlaneacionCompra.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetallePlaneacionCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetallePlaneacionCompra.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetallePlaneacionCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetallePlaneacionCompra.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetallePlaneacionCompra.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetallePlaneacionCompra();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetallePlaneacionCompra() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetallePlaneacionCompra!=null) {
				this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetallePlaneacionCompra!=null) {
				this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetallePlaneacionCompra!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DetallePlaneacionCompraConstantesFunciones.getTiposSeleccionarDetallePlaneacionCompra(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DetallePlaneacionCompraConstantesFunciones.getTiposSeleccionarDetallePlaneacionCompra(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DetallePlaneacionCompraConstantesFunciones.getTiposSeleccionarDetallePlaneacionCompra(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetallePlaneacionCompra()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_lineaFK_IdLineaDetallePlaneacionCompra.getSelectedItem()!=null){this.id_lineaFK_IdLinea=((Linea)this.jComboBoxid_lineaFK_IdLineaDetallePlaneacionCompra.getSelectedItem()).getId();}
		if(this.jComboBoxid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra.getSelectedItem()!=null){this.id_planeacion_compraFK_IdPlaneacionCompra=((PlaneacionCompra)this.jComboBoxid_planeacion_compraFK_IdPlaneacionCompraDetallePlaneacionCompra.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoDetallePlaneacionCompra.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoDetallePlaneacionCompra.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidadFK_IdUnidadDetallePlaneacionCompra.getSelectedItem()!=null){this.id_unidadFK_IdUnidad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadDetallePlaneacionCompra.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetallePlaneacionCompra(Boolean esInicializar) throws Exception {				
		if(DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetallePlaneacionCompra();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetallePlaneacionCompra() throws Exception {
		this.inicializarActualizarBindingTablaDetallePlaneacionCompra(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetallePlaneacionCompra() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetallePlaneacionCompra.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetallePlaneacionCompra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetallePlaneacionCompra.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetallePlaneacionCompraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetallePlaneacionCompra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetallePlaneacionCompra.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetallePlaneacionCompraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetallePlaneacionCompraOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompraOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetallePlaneacionCompraPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetallePlaneacionCompra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetallePlaneacionCompra.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetallePlaneacionCompraPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetallePlaneacionCompra.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetallePlaneacionCompra(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detalleplaneacioncompraLogic.getDetallePlaneacionCompras().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detalleplaneacioncompras.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetallePlaneacionCompra.setModel(new DetallePlaneacionCompraModel(this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetallePlaneacionCompra.setModel(new DetallePlaneacionCompraModel(this.detalleplaneacioncompras,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetallePlaneacionCompra!=null && this.jInternalFrameOrderByDetallePlaneacionCompra.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetallePlaneacionCompra();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetallePlaneacionCompraPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO,detalleplaneacioncompraConstantesFunciones.resaltarSeleccionarDetallePlaneacionCompra,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO,detalleplaneacioncompraConstantesFunciones.resaltarSeleccionarDetallePlaneacionCompra,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,DetallePlaneacionCompraConstantesFunciones.LABEL_ID));

		if(this.detalleplaneacioncompraConstantesFunciones.mostraridDetallePlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePlaneacionCompraConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleplaneacioncompraConstantesFunciones.resaltaridDetallePlaneacionCompra,this.detalleplaneacioncompraConstantesFunciones.activaridDetallePlaneacionCompra,iSizeTabla,this,true,"idDetallePlaneacionCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleplaneacioncompraConstantesFunciones.resaltaridDetallePlaneacionCompra,this.detalleplaneacioncompraConstantesFunciones.activaridDetallePlaneacionCompra,this,true,"idDetallePlaneacionCompra","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,DetallePlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detalleplaneacioncompraConstantesFunciones.mostrarid_empresaDetallePlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detalleplaneacioncompraConstantesFunciones.resaltarid_empresaDetallePlaneacionCompra,this,this.detalleplaneacioncompraConstantesFunciones.activarid_empresaDetallePlaneacionCompra,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detalleplaneacioncompraConstantesFunciones.resaltarid_empresaDetallePlaneacionCompra,this,this.detalleplaneacioncompraConstantesFunciones.activarid_empresaDetallePlaneacionCompra,false,"id_empresaDetallePlaneacionCompra","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,DetallePlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.detalleplaneacioncompraConstantesFunciones.mostrarid_sucursalDetallePlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.detalleplaneacioncompraConstantesFunciones.resaltarid_sucursalDetallePlaneacionCompra,this,this.detalleplaneacioncompraConstantesFunciones.activarid_sucursalDetallePlaneacionCompra,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.detalleplaneacioncompraConstantesFunciones.resaltarid_sucursalDetallePlaneacionCompra,this,this.detalleplaneacioncompraConstantesFunciones.activarid_sucursalDetallePlaneacionCompra,false,"id_sucursalDetallePlaneacionCompra","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,DetallePlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.detalleplaneacioncompraConstantesFunciones.mostrarid_ejercicioDetallePlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.detalleplaneacioncompraConstantesFunciones.resaltarid_ejercicioDetallePlaneacionCompra,this,this.detalleplaneacioncompraConstantesFunciones.activarid_ejercicioDetallePlaneacionCompra,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.detalleplaneacioncompraConstantesFunciones.resaltarid_ejercicioDetallePlaneacionCompra,this,this.detalleplaneacioncompraConstantesFunciones.activarid_ejercicioDetallePlaneacionCompra,false,"id_ejercicioDetallePlaneacionCompra","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,DetallePlaneacionCompraConstantesFunciones.LABEL_IDPERIODO));

		if(this.detalleplaneacioncompraConstantesFunciones.mostrarid_periodoDetallePlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePlaneacionCompraConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.detalleplaneacioncompraConstantesFunciones.resaltarid_periodoDetallePlaneacionCompra,this,this.detalleplaneacioncompraConstantesFunciones.activarid_periodoDetallePlaneacionCompra,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.detalleplaneacioncompraConstantesFunciones.resaltarid_periodoDetallePlaneacionCompra,this,this.detalleplaneacioncompraConstantesFunciones.activarid_periodoDetallePlaneacionCompra,false,"id_periodoDetallePlaneacionCompra","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,DetallePlaneacionCompraConstantesFunciones.LABEL_IDPLANEACIONCOMPRA));

		if(this.detalleplaneacioncompraConstantesFunciones.mostrarid_planeacion_compraDetallePlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePlaneacionCompraConstantesFunciones.LABEL_IDPLANEACIONCOMPRA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PlaneacionCompraTableCell(this.planeacioncomprasForeignKey,this.detalleplaneacioncompraConstantesFunciones.resaltarid_planeacion_compraDetallePlaneacionCompra,this,this.detalleplaneacioncompraConstantesFunciones.activarid_planeacion_compraDetallePlaneacionCompra,iSizeTabla));
			tableColumn.setCellEditor(new PlaneacionCompraTableCell(this.planeacioncomprasForeignKey,this.detalleplaneacioncompraConstantesFunciones.resaltarid_planeacion_compraDetallePlaneacionCompra,this,this.detalleplaneacioncompraConstantesFunciones.activarid_planeacion_compraDetallePlaneacionCompra,true,"id_planeacion_compraDetallePlaneacionCompra","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,DetallePlaneacionCompraConstantesFunciones.LABEL_IDLINEA));

		if(this.detalleplaneacioncompraConstantesFunciones.mostrarid_lineaDetallePlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePlaneacionCompraConstantesFunciones.LABEL_IDLINEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineasForeignKey,this.detalleplaneacioncompraConstantesFunciones.resaltarid_lineaDetallePlaneacionCompra,this,this.detalleplaneacioncompraConstantesFunciones.activarid_lineaDetallePlaneacionCompra,iSizeTabla));
			tableColumn.setCellEditor(new LineaTableCell(this.lineasForeignKey,this.detalleplaneacioncompraConstantesFunciones.resaltarid_lineaDetallePlaneacionCompra,this,this.detalleplaneacioncompraConstantesFunciones.activarid_lineaDetallePlaneacionCompra,true,"id_lineaDetallePlaneacionCompra","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,DetallePlaneacionCompraConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.detalleplaneacioncompraConstantesFunciones.mostrarid_productoDetallePlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePlaneacionCompraConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.detalleplaneacioncompraConstantesFunciones.resaltarid_productoDetallePlaneacionCompra,this,this.detalleplaneacioncompraConstantesFunciones.activarid_productoDetallePlaneacionCompra,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.detalleplaneacioncompraConstantesFunciones.resaltarid_productoDetallePlaneacionCompra,this,this.detalleplaneacioncompraConstantesFunciones.activarid_productoDetallePlaneacionCompra,true,"id_productoDetallePlaneacionCompra","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new DetallePlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,DetallePlaneacionCompraConstantesFunciones.LABEL_IDUNIDAD));

		if(this.detalleplaneacioncompraConstantesFunciones.mostrarid_unidadDetallePlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePlaneacionCompraConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.detalleplaneacioncompraConstantesFunciones.resaltarid_unidadDetallePlaneacionCompra,this,this.detalleplaneacioncompraConstantesFunciones.activarid_unidadDetallePlaneacionCompra,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.detalleplaneacioncompraConstantesFunciones.resaltarid_unidadDetallePlaneacionCompra,this,this.detalleplaneacioncompraConstantesFunciones.activarid_unidadDetallePlaneacionCompra,true,"id_unidadDetallePlaneacionCompra","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,DetallePlaneacionCompraConstantesFunciones.LABEL_STOCK));

		if(this.detalleplaneacioncompraConstantesFunciones.mostrarstockDetallePlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePlaneacionCompraConstantesFunciones.LABEL_STOCK,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleplaneacioncompraConstantesFunciones.resaltarstockDetallePlaneacionCompra,this.detalleplaneacioncompraConstantesFunciones.activarstockDetallePlaneacionCompra,iSizeTabla,this,true,"stockDetallePlaneacionCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleplaneacioncompraConstantesFunciones.resaltarstockDetallePlaneacionCompra,this.detalleplaneacioncompraConstantesFunciones.activarstockDetallePlaneacionCompra,this,true,"stockDetallePlaneacionCompra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMINIMO));

		if(this.detalleplaneacioncompraConstantesFunciones.mostrardia_minimoDetallePlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMINIMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleplaneacioncompraConstantesFunciones.resaltardia_minimoDetallePlaneacionCompra,this.detalleplaneacioncompraConstantesFunciones.activardia_minimoDetallePlaneacionCompra,iSizeTabla,this,true,"dia_minimoDetallePlaneacionCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleplaneacioncompraConstantesFunciones.resaltardia_minimoDetallePlaneacionCompra,this.detalleplaneacioncompraConstantesFunciones.activardia_minimoDetallePlaneacionCompra,this,true,"dia_minimoDetallePlaneacionCompra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMINIMO));

		if(this.detalleplaneacioncompraConstantesFunciones.mostrarstock_minimoDetallePlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMINIMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleplaneacioncompraConstantesFunciones.resaltarstock_minimoDetallePlaneacionCompra,this.detalleplaneacioncompraConstantesFunciones.activarstock_minimoDetallePlaneacionCompra,iSizeTabla,this,true,"stock_minimoDetallePlaneacionCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleplaneacioncompraConstantesFunciones.resaltarstock_minimoDetallePlaneacionCompra,this.detalleplaneacioncompraConstantesFunciones.activarstock_minimoDetallePlaneacionCompra,this,true,"stock_minimoDetallePlaneacionCompra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMAXIMO));

		if(this.detalleplaneacioncompraConstantesFunciones.mostrardia_maximoDetallePlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMAXIMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleplaneacioncompraConstantesFunciones.resaltardia_maximoDetallePlaneacionCompra,this.detalleplaneacioncompraConstantesFunciones.activardia_maximoDetallePlaneacionCompra,iSizeTabla,this,true,"dia_maximoDetallePlaneacionCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleplaneacioncompraConstantesFunciones.resaltardia_maximoDetallePlaneacionCompra,this.detalleplaneacioncompraConstantesFunciones.activardia_maximoDetallePlaneacionCompra,this,true,"dia_maximoDetallePlaneacionCompra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMAXIMO));

		if(this.detalleplaneacioncompraConstantesFunciones.mostrarstock_maximoDetallePlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMAXIMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleplaneacioncompraConstantesFunciones.resaltarstock_maximoDetallePlaneacionCompra,this.detalleplaneacioncompraConstantesFunciones.activarstock_maximoDetallePlaneacionCompra,iSizeTabla,this,true,"stock_maximoDetallePlaneacionCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleplaneacioncompraConstantesFunciones.resaltarstock_maximoDetallePlaneacionCompra,this.detalleplaneacioncompraConstantesFunciones.activarstock_maximoDetallePlaneacionCompra,this,true,"stock_maximoDetallePlaneacionCompra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,DetallePlaneacionCompraConstantesFunciones.LABEL_SALIDA));

		if(this.detalleplaneacioncompraConstantesFunciones.mostrarsalidaDetallePlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePlaneacionCompraConstantesFunciones.LABEL_SALIDA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleplaneacioncompraConstantesFunciones.resaltarsalidaDetallePlaneacionCompra,this.detalleplaneacioncompraConstantesFunciones.activarsalidaDetallePlaneacionCompra,iSizeTabla,this,true,"salidaDetallePlaneacionCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleplaneacioncompraConstantesFunciones.resaltarsalidaDetallePlaneacionCompra,this.detalleplaneacioncompraConstantesFunciones.activarsalidaDetallePlaneacionCompra,this,true,"salidaDetallePlaneacionCompra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMENSUAL));

		if(this.detalleplaneacioncompraConstantesFunciones.mostrarstock_mensualDetallePlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMENSUAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleplaneacioncompraConstantesFunciones.resaltarstock_mensualDetallePlaneacionCompra,this.detalleplaneacioncompraConstantesFunciones.activarstock_mensualDetallePlaneacionCompra,iSizeTabla,this,true,"stock_mensualDetallePlaneacionCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleplaneacioncompraConstantesFunciones.resaltarstock_mensualDetallePlaneacionCompra,this.detalleplaneacioncompraConstantesFunciones.activarstock_mensualDetallePlaneacionCompra,this,true,"stock_mensualDetallePlaneacionCompra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,DetallePlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION));

		if(this.detalleplaneacioncompraConstantesFunciones.mostrardescripcionDetallePlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detalleplaneacioncompraConstantesFunciones.resaltardescripcionDetallePlaneacionCompra,this.detalleplaneacioncompraConstantesFunciones.activardescripcionDetallePlaneacionCompra,iSizeTabla,this,true,"descripcionDetallePlaneacionCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleplaneacioncompraConstantesFunciones.resaltardescripcionDetallePlaneacionCompra,this.detalleplaneacioncompraConstantesFunciones.activardescripcionDetallePlaneacionCompra,this,true,"descripcionDetallePlaneacionCompra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetallePlaneacionCompra.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetallePlaneacionCompra.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetallePlaneacionCompra && this.isPermisoGuardarCambiosDetallePlaneacionCompra) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetallePlaneacionCompra.addColumn(tableColumn);
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
			
			this.jTableDatosDetallePlaneacionCompra.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetallePlaneacionCompra && this.isPermisoGuardarCambiosDetallePlaneacionCompra) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetallePlaneacionCompra && this.isPermisoGuardarCambiosDetallePlaneacionCompra) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetallePlaneacionCompra.moveColumn(this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetallePlaneacionCompra.moveColumn(this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetallePlaneacionCompra.moveColumn(this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetallePlaneacionCompra.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetallePlaneacionCompra.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetallePlaneacionCompra,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetallePlaneacionCompra.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetallePlaneacionCompra.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetallePlaneacionCompra.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detalleplaneacioncompraLogic.getDetallePlaneacionCompras().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detalleplaneacioncompras.size()-1;
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
		//this.jTableDatosDetallePlaneacionCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetallePlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetallePlaneacionCompra();
			
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
				
				//this.isEsNuevoDetallePlaneacionCompra=false;
					
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
			
				if(this.detalleplaneacioncompraSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetallePlaneacionCompra==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetallePlaneacionCompra.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetallePlaneacionCompra.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detalleplaneacioncompra.getsType().equals("DUPLICADO")
				   || this.detalleplaneacioncompra.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetallePlaneacionCompra=true;
				
				} else {
					this.isEsNuevoDetallePlaneacionCompra=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
					if(this.detalleplaneacioncompra.getId()>=0 && !this.detalleplaneacioncompra.getIsNew()) {						
						this.isEsNuevoDetallePlaneacionCompra=false;
						
					} else {
						this.isEsNuevoDetallePlaneacionCompra=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetallePlaneacionCompra(esRelaciones);						
				
				this.seleccionarDetallePlaneacionCompra(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detalleplaneacioncompra.getId()<0) {
					this.isEsNuevoDetallePlaneacionCompra=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetallePlaneacionCompra(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetallePlaneacionCompra(evt,rowIndex);
				}	
				
				if(this.detalleplaneacioncompraSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetallePlaneacionCompra: " + this.dDif); 
					}
				}								
				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetallePlaneacionCompra(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detalleplaneacioncompra)) {
					if(this.detalleplaneacioncompra.getId()>0) {
						this.detalleplaneacioncompra.setIsDeleted(true);
						
						this.detalleplaneacioncomprasEliminados.add(this.detalleplaneacioncompra);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().remove(this.detalleplaneacioncompra);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleplaneacioncompras.remove(this.detalleplaneacioncompra);				
					}
					
					
					((DetallePlaneacionCompraModel) this.jTableDatosDetallePlaneacionCompra.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetallePlaneacionCompra(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetallePlaneacionCompra(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetallePlaneacionCompra) {
			
			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetallePlaneacionCompra.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetallePlaneacionCompra.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetallePlaneacionCompra(this.detalleplaneacioncompra);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.detalleplaneacioncompraConstantesFunciones.cargarid_empresaDetallePlaneacionCompra || this.detalleplaneacioncompraConstantesFunciones.event_dependid_empresaDetallePlaneacionCompra) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detalleplaneacioncompra.getid_empresa());
									//this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detalleplaneacioncompra.getEmpresa()!=null) {
							this.empresasForeignKey.add(detalleplaneacioncompra.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detalleplaneacioncompra.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.detalleplaneacioncompraConstantesFunciones.cargarid_sucursalDetallePlaneacionCompra || this.detalleplaneacioncompraConstantesFunciones.event_dependid_sucursalDetallePlaneacionCompra) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.detalleplaneacioncompra.getid_sucursal());
									//this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(detalleplaneacioncompra.getSucursal()!=null) {
							this.sucursalsForeignKey.add(detalleplaneacioncompra.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.detalleplaneacioncompra.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.detalleplaneacioncompraConstantesFunciones.cargarid_ejercicioDetallePlaneacionCompra || this.detalleplaneacioncompraConstantesFunciones.event_dependid_ejercicioDetallePlaneacionCompra) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.detalleplaneacioncompra.getid_ejercicio());
									//this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(detalleplaneacioncompra.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(detalleplaneacioncompra.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.detalleplaneacioncompra.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.detalleplaneacioncompraConstantesFunciones.cargarid_periodoDetallePlaneacionCompra || this.detalleplaneacioncompraConstantesFunciones.event_dependid_periodoDetallePlaneacionCompra) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.detalleplaneacioncompra.getid_periodo());
									//this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(detalleplaneacioncompra.getPeriodo()!=null) {
							this.periodosForeignKey.add(detalleplaneacioncompra.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.detalleplaneacioncompra.getid_periodo(),false,"Formulario");

					//PlaneacionCompra
					if(!this.detalleplaneacioncompraConstantesFunciones.cargarid_planeacion_compraDetallePlaneacionCompra || this.detalleplaneacioncompraConstantesFunciones.event_dependid_planeacion_compraDetallePlaneacionCompra) {
						//this.cargarCombosPlaneacionComprasForeignKeyLista(" where id="+this.detalleplaneacioncompra.getid_planeacion_compra());
									//this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
						this.planeacioncomprasForeignKey=new ArrayList<PlaneacionCompra>();

						if(detalleplaneacioncompra.getPlaneacionCompra()!=null) {
							this.planeacioncomprasForeignKey.add(detalleplaneacioncompra.getPlaneacionCompra());
						}

						this.addItemDefectoCombosForeignKeyPlaneacionCompra();
						this.cargarCombosFramePlaneacionComprasForeignKey("Todos");
					}
					this.setActualPlaneacionCompraForeignKey(this.detalleplaneacioncompra.getid_planeacion_compra(),false,"Formulario");

					//Linea
					if(!this.detalleplaneacioncompraConstantesFunciones.cargarid_lineaDetallePlaneacionCompra || this.detalleplaneacioncompraConstantesFunciones.event_dependid_lineaDetallePlaneacionCompra) {
						//this.cargarCombosLineasForeignKeyLista(" where id="+this.detalleplaneacioncompra.getid_linea());
									//this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
						this.lineasForeignKey=new ArrayList<Linea>();

						if(detalleplaneacioncompra.getLinea()!=null) {
							this.lineasForeignKey.add(detalleplaneacioncompra.getLinea());
						}

						this.addItemDefectoCombosForeignKeyLinea();
						this.cargarCombosFrameLineasForeignKey("Todos");
					}
					this.setActualLineaForeignKey(this.detalleplaneacioncompra.getid_linea(),false,"Formulario");

					//Producto
					if(!this.detalleplaneacioncompraConstantesFunciones.cargarid_productoDetallePlaneacionCompra || this.detalleplaneacioncompraConstantesFunciones.event_dependid_productoDetallePlaneacionCompra) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.detalleplaneacioncompra.getid_producto());
									//this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(detalleplaneacioncompra.getProducto()!=null) {
							this.productosForeignKey.add(detalleplaneacioncompra.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.detalleplaneacioncompra.getid_producto(),false,"Formulario");

					//Unidad
					if(!this.detalleplaneacioncompraConstantesFunciones.cargarid_unidadDetallePlaneacionCompra || this.detalleplaneacioncompraConstantesFunciones.event_dependid_unidadDetallePlaneacionCompra) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.detalleplaneacioncompra.getid_unidad());
									//this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(detalleplaneacioncompra.getUnidad()!=null) {
							this.unidadsForeignKey.add(detalleplaneacioncompra.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.detalleplaneacioncompra.getid_unidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetallePlaneacionCompra("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetallePlaneacionCompra(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetallePlaneacionCompra() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetallePlaneacionCompra(DetallePlaneacionCompra detalleplaneacioncompra) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetallePlaneacionCompra(detalleplaneacioncompra,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetallePlaneacionCompra(DetallePlaneacionCompra detalleplaneacioncompra,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetallePlaneacionCompra(detalleplaneacioncompra);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetallePlaneacionCompra(detalleplaneacioncompra,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetallePlaneacionCompra(detalleplaneacioncompra);
	}
	
	public void setVariablesObjetoActualToFormularioDetallePlaneacionCompra(DetallePlaneacionCompra detalleplaneacioncompra) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelidDetallePlaneacionCompra.setText(detalleplaneacioncompra.getId().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstockDetallePlaneacionCompra.setText(detalleplaneacioncompra.getstock().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFielddia_minimoDetallePlaneacionCompra.setText(detalleplaneacioncompra.getdia_minimo().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_minimoDetallePlaneacionCompra.setText(detalleplaneacioncompra.getstock_minimo().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFielddia_maximoDetallePlaneacionCompra.setText(detalleplaneacioncompra.getdia_maximo().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_maximoDetallePlaneacionCompra.setText(detalleplaneacioncompra.getstock_maximo().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldsalidaDetallePlaneacionCompra.setText(detalleplaneacioncompra.getsalida().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_mensualDetallePlaneacionCompra.setText(detalleplaneacioncompra.getstock_mensual().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextAreadescripcionDetallePlaneacionCompra.setText(detalleplaneacioncompra.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetallePlaneacionCompra detalleplaneacioncompraLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detalleplaneacioncompraLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetallePlaneacionCompra detalleplaneacioncompraLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detalleplaneacioncompraLocal=this.detalleplaneacioncompra;
			} else {
				detalleplaneacioncompraLocal=this.detalleplaneacioncompraAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detalleplaneacioncompraLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetallePlaneacionCompra(detalleplaneacioncompraLocal,true);
					
					if(detalleplaneacioncompraSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detalleplaneacioncompraLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detalleplaneacioncompraLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetallePlaneacionCompra(DetallePlaneacionCompra detalleplaneacioncompra,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(detalleplaneacioncompra,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(detalleplaneacioncompra);
	}
	
	public void setVariablesFormularioToObjetoActualDetallePlaneacionCompra(DetallePlaneacionCompra detalleplaneacioncompra,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(detalleplaneacioncompra,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetallePlaneacionCompra(DetallePlaneacionCompra detalleplaneacioncompra,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelidDetallePlaneacionCompra.getText()==null || this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelidDetallePlaneacionCompra.getText()=="" || this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelidDetallePlaneacionCompra.getText()=="Id") {
				this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelidDetallePlaneacionCompra.setText("0");
			}

			if(conColumnasBase) {detalleplaneacioncompra.setId(Long.parseLong(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelidDetallePlaneacionCompra.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePlaneacionCompraConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelIdDetallePlaneacionCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleplaneacioncompra.setstock(Double.parseDouble(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstockDetallePlaneacionCompra.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePlaneacionCompraConstantesFunciones.LABEL_STOCK+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelstockDetallePlaneacionCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleplaneacioncompra.setdia_minimo(Integer.parseInt(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFielddia_minimoDetallePlaneacionCompra.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMINIMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabeldia_minimoDetallePlaneacionCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleplaneacioncompra.setstock_minimo(Double.parseDouble(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_minimoDetallePlaneacionCompra.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMINIMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelstock_minimoDetallePlaneacionCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleplaneacioncompra.setdia_maximo(Integer.parseInt(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFielddia_maximoDetallePlaneacionCompra.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMAXIMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabeldia_maximoDetallePlaneacionCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleplaneacioncompra.setstock_maximo(Double.parseDouble(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_maximoDetallePlaneacionCompra.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMAXIMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelstock_maximoDetallePlaneacionCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleplaneacioncompra.setsalida(Double.parseDouble(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldsalidaDetallePlaneacionCompra.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePlaneacionCompraConstantesFunciones.LABEL_SALIDA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelsalidaDetallePlaneacionCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleplaneacioncompra.setstock_mensual(Double.parseDouble(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_mensualDetallePlaneacionCompra.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMENSUAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelstock_mensualDetallePlaneacionCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleplaneacioncompra.setdescripcion(this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextAreadescripcionDetallePlaneacionCompra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabeldescripcionDetallePlaneacionCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetallePlaneacionCompra(DetallePlaneacionCompra detalleplaneacioncompraBean,DetallePlaneacionCompra detalleplaneacioncompra,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && detalleplaneacioncompraBean.getid_planeacion_compra()!=null && !detalleplaneacioncompraBean.getid_planeacion_compra().equals(-1L))) {detalleplaneacioncompra.setid_planeacion_compra(detalleplaneacioncompraBean.getid_planeacion_compra());}
			if(conDefault || (!conDefault && detalleplaneacioncompraBean.getid_linea()!=null && !detalleplaneacioncompraBean.getid_linea().equals(-1L))) {detalleplaneacioncompra.setid_linea(detalleplaneacioncompraBean.getid_linea());}
			if(conDefault || (!conDefault && detalleplaneacioncompraBean.getid_producto()!=null && !detalleplaneacioncompraBean.getid_producto().equals(-1L))) {detalleplaneacioncompra.setid_producto(detalleplaneacioncompraBean.getid_producto());}
			if(conDefault || (!conDefault && detalleplaneacioncompraBean.getid_unidad()!=null && !detalleplaneacioncompraBean.getid_unidad().equals(-1L))) {detalleplaneacioncompra.setid_unidad(detalleplaneacioncompraBean.getid_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetallePlaneacionCompra(DetallePlaneacionCompra detalleplaneacioncompraOrigen,DetallePlaneacionCompra detalleplaneacioncompra,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleplaneacioncompraOrigen.getId()!=null && !detalleplaneacioncompraOrigen.getId().equals(0L))) {detalleplaneacioncompra.setId(detalleplaneacioncompraOrigen.getId());}}
			if(conDefault || (!conDefault && detalleplaneacioncompraOrigen.getid_planeacion_compra()!=null && !detalleplaneacioncompraOrigen.getid_planeacion_compra().equals(-1L))) {detalleplaneacioncompra.setid_planeacion_compra(detalleplaneacioncompraOrigen.getid_planeacion_compra());}
			if(conDefault || (!conDefault && detalleplaneacioncompraOrigen.getid_linea()!=null && !detalleplaneacioncompraOrigen.getid_linea().equals(-1L))) {detalleplaneacioncompra.setid_linea(detalleplaneacioncompraOrigen.getid_linea());}
			if(conDefault || (!conDefault && detalleplaneacioncompraOrigen.getid_producto()!=null && !detalleplaneacioncompraOrigen.getid_producto().equals(-1L))) {detalleplaneacioncompra.setid_producto(detalleplaneacioncompraOrigen.getid_producto());}
			if(conDefault || (!conDefault && detalleplaneacioncompraOrigen.getid_unidad()!=null && !detalleplaneacioncompraOrigen.getid_unidad().equals(-1L))) {detalleplaneacioncompra.setid_unidad(detalleplaneacioncompraOrigen.getid_unidad());}
			if(conDefault || (!conDefault && detalleplaneacioncompraOrigen.getstock()!=null && !detalleplaneacioncompraOrigen.getstock().equals(0.0))) {detalleplaneacioncompra.setstock(detalleplaneacioncompraOrigen.getstock());}
			if(conDefault || (!conDefault && detalleplaneacioncompraOrigen.getdia_minimo()!=null && !detalleplaneacioncompraOrigen.getdia_minimo().equals(0))) {detalleplaneacioncompra.setdia_minimo(detalleplaneacioncompraOrigen.getdia_minimo());}
			if(conDefault || (!conDefault && detalleplaneacioncompraOrigen.getstock_minimo()!=null && !detalleplaneacioncompraOrigen.getstock_minimo().equals(0.0))) {detalleplaneacioncompra.setstock_minimo(detalleplaneacioncompraOrigen.getstock_minimo());}
			if(conDefault || (!conDefault && detalleplaneacioncompraOrigen.getdia_maximo()!=null && !detalleplaneacioncompraOrigen.getdia_maximo().equals(0))) {detalleplaneacioncompra.setdia_maximo(detalleplaneacioncompraOrigen.getdia_maximo());}
			if(conDefault || (!conDefault && detalleplaneacioncompraOrigen.getstock_maximo()!=null && !detalleplaneacioncompraOrigen.getstock_maximo().equals(0.0))) {detalleplaneacioncompra.setstock_maximo(detalleplaneacioncompraOrigen.getstock_maximo());}
			if(conDefault || (!conDefault && detalleplaneacioncompraOrigen.getsalida()!=null && !detalleplaneacioncompraOrigen.getsalida().equals(0.0))) {detalleplaneacioncompra.setsalida(detalleplaneacioncompraOrigen.getsalida());}
			if(conDefault || (!conDefault && detalleplaneacioncompraOrigen.getstock_mensual()!=null && !detalleplaneacioncompraOrigen.getstock_mensual().equals(0.0))) {detalleplaneacioncompra.setstock_mensual(detalleplaneacioncompraOrigen.getstock_mensual());}
			if(conDefault || (!conDefault && detalleplaneacioncompraOrigen.getdescripcion()!=null && !detalleplaneacioncompraOrigen.getdescripcion().equals(""))) {detalleplaneacioncompra.setdescripcion(detalleplaneacioncompraOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetallePlaneacionCompra(DetallePlaneacionCompra detalleplaneacioncompra) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelidDetallePlaneacionCompra.setText(detalleplaneacioncompra.getId().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstockDetallePlaneacionCompra.setText(detalleplaneacioncompra.getstock().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFielddia_minimoDetallePlaneacionCompra.setText(detalleplaneacioncompra.getdia_minimo().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_minimoDetallePlaneacionCompra.setText(detalleplaneacioncompra.getstock_minimo().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFielddia_maximoDetallePlaneacionCompra.setText(detalleplaneacioncompra.getdia_maximo().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_maximoDetallePlaneacionCompra.setText(detalleplaneacioncompra.getstock_maximo().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldsalidaDetallePlaneacionCompra.setText(detalleplaneacioncompra.getsalida().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_mensualDetallePlaneacionCompra.setText(detalleplaneacioncompra.getstock_mensual().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextAreadescripcionDetallePlaneacionCompra.setText(detalleplaneacioncompra.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetallePlaneacionCompra(DetallePlaneacionCompraBean detalleplaneacioncompraBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelidDetallePlaneacionCompra.setText(detalleplaneacioncompraBean.getId().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstockDetallePlaneacionCompra.setText(detalleplaneacioncompraBean.getstock().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFielddia_minimoDetallePlaneacionCompra.setText(detalleplaneacioncompraBean.getdia_minimo().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_minimoDetallePlaneacionCompra.setText(detalleplaneacioncompraBean.getstock_minimo().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFielddia_maximoDetallePlaneacionCompra.setText(detalleplaneacioncompraBean.getdia_maximo().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_maximoDetallePlaneacionCompra.setText(detalleplaneacioncompraBean.getstock_maximo().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldsalidaDetallePlaneacionCompra.setText(detalleplaneacioncompraBean.getsalida().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_mensualDetallePlaneacionCompra.setText(detalleplaneacioncompraBean.getstock_mensual().toString());
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextAreadescripcionDetallePlaneacionCompra.setText(detalleplaneacioncompraBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetallePlaneacionCompra(DetallePlaneacionCompraParameterReturnGeneral detalleplaneacioncompraReturnGeneral,DetallePlaneacionCompraBean detalleplaneacioncompraBean,Boolean conDefault) throws Exception { 
		try {
			DetallePlaneacionCompra detalleplaneacioncompraLocal=new DetallePlaneacionCompra();
			
			detalleplaneacioncompraLocal=detalleplaneacioncompraReturnGeneral.getDetallePlaneacionCompra();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleplaneacioncompraLocal.getId()!=null && !detalleplaneacioncompraLocal.getId().equals(0L))) {detalleplaneacioncompraBean.setId(detalleplaneacioncompraLocal.getId());}}
			if(conDefault || (!conDefault && detalleplaneacioncompraLocal.getid_planeacion_compra()!=null && !detalleplaneacioncompraLocal.getid_planeacion_compra().equals(-1L))) {detalleplaneacioncompraBean.setid_planeacion_compra(detalleplaneacioncompraLocal.getid_planeacion_compra());}
			if(conDefault || (!conDefault && detalleplaneacioncompraLocal.getid_linea()!=null && !detalleplaneacioncompraLocal.getid_linea().equals(-1L))) {detalleplaneacioncompraBean.setid_linea(detalleplaneacioncompraLocal.getid_linea());}
			if(conDefault || (!conDefault && detalleplaneacioncompraLocal.getid_producto()!=null && !detalleplaneacioncompraLocal.getid_producto().equals(-1L))) {detalleplaneacioncompraBean.setid_producto(detalleplaneacioncompraLocal.getid_producto());}
			if(conDefault || (!conDefault && detalleplaneacioncompraLocal.getid_unidad()!=null && !detalleplaneacioncompraLocal.getid_unidad().equals(-1L))) {detalleplaneacioncompraBean.setid_unidad(detalleplaneacioncompraLocal.getid_unidad());}
			if(conDefault || (!conDefault && detalleplaneacioncompraLocal.getstock()!=null && !detalleplaneacioncompraLocal.getstock().equals(0.0))) {detalleplaneacioncompraBean.setstock(detalleplaneacioncompraLocal.getstock());}
			if(conDefault || (!conDefault && detalleplaneacioncompraLocal.getdia_minimo()!=null && !detalleplaneacioncompraLocal.getdia_minimo().equals(0))) {detalleplaneacioncompraBean.setdia_minimo(detalleplaneacioncompraLocal.getdia_minimo());}
			if(conDefault || (!conDefault && detalleplaneacioncompraLocal.getstock_minimo()!=null && !detalleplaneacioncompraLocal.getstock_minimo().equals(0.0))) {detalleplaneacioncompraBean.setstock_minimo(detalleplaneacioncompraLocal.getstock_minimo());}
			if(conDefault || (!conDefault && detalleplaneacioncompraLocal.getdia_maximo()!=null && !detalleplaneacioncompraLocal.getdia_maximo().equals(0))) {detalleplaneacioncompraBean.setdia_maximo(detalleplaneacioncompraLocal.getdia_maximo());}
			if(conDefault || (!conDefault && detalleplaneacioncompraLocal.getstock_maximo()!=null && !detalleplaneacioncompraLocal.getstock_maximo().equals(0.0))) {detalleplaneacioncompraBean.setstock_maximo(detalleplaneacioncompraLocal.getstock_maximo());}
			if(conDefault || (!conDefault && detalleplaneacioncompraLocal.getsalida()!=null && !detalleplaneacioncompraLocal.getsalida().equals(0.0))) {detalleplaneacioncompraBean.setsalida(detalleplaneacioncompraLocal.getsalida());}
			if(conDefault || (!conDefault && detalleplaneacioncompraLocal.getstock_mensual()!=null && !detalleplaneacioncompraLocal.getstock_mensual().equals(0.0))) {detalleplaneacioncompraBean.setstock_mensual(detalleplaneacioncompraLocal.getstock_mensual());}
			if(conDefault || (!conDefault && detalleplaneacioncompraLocal.getdescripcion()!=null && !detalleplaneacioncompraLocal.getdescripcion().equals(""))) {detalleplaneacioncompraBean.setdescripcion(detalleplaneacioncompraLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetallePlaneacionCompraGenerico(Long idDetallePlaneacionCompraSeleccionado,JComboBox jComboBoxDetallePlaneacionCompra,List<DetallePlaneacionCompra> detalleplaneacioncomprasLocal)throws Exception {
		try {
			DetallePlaneacionCompra  detalleplaneacioncompraTemp=null;

			for(DetallePlaneacionCompra detalleplaneacioncompraAux:detalleplaneacioncomprasLocal) {
				if(detalleplaneacioncompraAux.getId()!=null && detalleplaneacioncompraAux.getId().equals(idDetallePlaneacionCompraSeleccionado)) {
					detalleplaneacioncompraTemp=detalleplaneacioncompraAux;
					break;
				}
			}

			jComboBoxDetallePlaneacionCompra.setSelectedItem(detalleplaneacioncompraTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetallePlaneacionCompraGenerico(JComboBox jComboBoxDetallePlaneacionCompra,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetallePlaneacionCompra.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetallePlaneacionCompra.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetallePlaneacionCompra.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetallePlaneacionCompra.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetallePlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetallePlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleplaneacioncompra=(DetallePlaneacionCompra) detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleplaneacioncompra =(DetallePlaneacionCompra) detalleplaneacioncompras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detalleplaneacioncompra.getIsNew() && !detalleplaneacioncompra.getIsChanged() && !detalleplaneacioncompra.getIsDeleted()) {
				sDescripcion=detalleplaneacioncompra.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detalleplaneacioncompra.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!detalleplaneacioncompra.getIsNew() && !detalleplaneacioncompra.getIsChanged() && !detalleplaneacioncompra.getIsDeleted()) {
				sDescripcion=detalleplaneacioncompra.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=detalleplaneacioncompra.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!detalleplaneacioncompra.getIsNew() && !detalleplaneacioncompra.getIsChanged() && !detalleplaneacioncompra.getIsDeleted()) {
				sDescripcion=detalleplaneacioncompra.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=detalleplaneacioncompra.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!detalleplaneacioncompra.getIsNew() && !detalleplaneacioncompra.getIsChanged() && !detalleplaneacioncompra.getIsDeleted()) {
				sDescripcion=detalleplaneacioncompra.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=detalleplaneacioncompra.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("PlaneacionCompra")) {
			//sDescripcion=this.getActualPlaneacionCompraForeignKeyDescripcion((Long)value);
			if(!detalleplaneacioncompra.getIsNew() && !detalleplaneacioncompra.getIsChanged() && !detalleplaneacioncompra.getIsDeleted()) {
				sDescripcion=detalleplaneacioncompra.getplaneacioncompra_descripcion();
			} else {
				//sDescripcion=this.getActualPlaneacionCompraForeignKeyDescripcion((Long)value);
				sDescripcion=detalleplaneacioncompra.getplaneacioncompra_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!detalleplaneacioncompra.getIsNew() && !detalleplaneacioncompra.getIsChanged() && !detalleplaneacioncompra.getIsDeleted()) {
				sDescripcion=detalleplaneacioncompra.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=detalleplaneacioncompra.getlinea_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!detalleplaneacioncompra.getIsNew() && !detalleplaneacioncompra.getIsChanged() && !detalleplaneacioncompra.getIsDeleted()) {
				sDescripcion=detalleplaneacioncompra.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=detalleplaneacioncompra.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!detalleplaneacioncompra.getIsNew() && !detalleplaneacioncompra.getIsChanged() && !detalleplaneacioncompra.getIsDeleted()) {
				sDescripcion=detalleplaneacioncompra.getunidad_descripcion();
			} else {
				//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
				sDescripcion=detalleplaneacioncompra.getunidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetallePlaneacionCompra detalleplaneacioncompraRow=new DetallePlaneacionCompra();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleplaneacioncompraRow=(DetallePlaneacionCompra) detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleplaneacioncompraRow=(DetallePlaneacionCompra) detalleplaneacioncompras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetallePlaneacionCompra(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaNuevoDetallePlaneacionCompra && this.isPermisoNuevoDetallePlaneacionCompra));			
			this.jButtonDuplicarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaDuplicarDetallePlaneacionCompra && this.isPermisoDuplicarDetallePlaneacionCompra));			
			this.jButtonCopiarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaCopiarDetallePlaneacionCompra && this.isPermisoCopiarDetallePlaneacionCompra));
			this.jButtonVerFormDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaVerFormDetallePlaneacionCompra && this.isPermisoVerFormDetallePlaneacionCompra));
			
			this.jButtonAbrirOrderByDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaOrdenDetallePlaneacionCompra && this.isPermisoOrdenDetallePlaneacionCompra));			
			
			this.jButtonNuevoRelacionesDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra && this.isPermisoNuevoDetallePlaneacionCompra));			
			this.jButtonNuevoGuardarCambiosDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaNuevoDetallePlaneacionCompra && this.isPermisoNuevoDetallePlaneacionCompra && this.isPermisoGuardarCambiosDetallePlaneacionCompra));
			
			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonModificarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaModificarDetallePlaneacionCompra && this.isPermisoActualizarDetallePlaneacionCompra));	
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonActualizarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaActualizarDetallePlaneacionCompra && this.isPermisoActualizarDetallePlaneacionCompra));	
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonEliminarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaEliminarDetallePlaneacionCompra && this.isPermisoEliminarDetallePlaneacionCompra));
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonCancelarDetallePlaneacionCompra.setVisible(this.isVisibilidadCeldaCancelarDetallePlaneacionCompra);							
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonGuardarCambiosDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaGuardarDetallePlaneacionCompra && this.isPermisoGuardarCambiosDetallePlaneacionCompra));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra && this.isPermisoGuardarCambiosDetallePlaneacionCompra));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaNuevoDetallePlaneacionCompra && this.isPermisoNuevoDetallePlaneacionCompra));						
			this.jButtonDuplicarToolBarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaDuplicarDetallePlaneacionCompra && this.isPermisoDuplicarDetallePlaneacionCompra));						
			this.jButtonCopiarToolBarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaCopiarDetallePlaneacionCompra && this.isPermisoCopiarDetallePlaneacionCompra));			
			this.jButtonVerFormToolBarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaVerFormDetallePlaneacionCompra && this.isPermisoVerFormDetallePlaneacionCompra));			
			this.jButtonAbrirOrderByToolBarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaOrdenDetallePlaneacionCompra && this.isPermisoOrdenDetallePlaneacionCompra));
			this.jButtonNuevoRelacionesToolBarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra && this.isPermisoNuevoDetallePlaneacionCompra));			
			this.jButtonNuevoGuardarCambiosToolBarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaNuevoDetallePlaneacionCompra && this.isPermisoNuevoDetallePlaneacionCompra && this.isPermisoGuardarCambiosDetallePlaneacionCompra));			
			
			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonModificarToolBarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaModificarDetallePlaneacionCompra && this.isPermisoActualizarDetallePlaneacionCompra));	
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonActualizarToolBarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaActualizarDetallePlaneacionCompra  && this.isPermisoActualizarDetallePlaneacionCompra));	
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonEliminarToolBarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaEliminarDetallePlaneacionCompra && this.isPermisoEliminarDetallePlaneacionCompra));
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonCancelarToolBarDetallePlaneacionCompra.setVisible(this.isVisibilidadCeldaCancelarDetallePlaneacionCompra);				
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonGuardarCambiosToolBarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaGuardarDetallePlaneacionCompra && this.isPermisoGuardarCambiosDetallePlaneacionCompra));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra && this.isPermisoGuardarCambiosDetallePlaneacionCompra));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaNuevoDetallePlaneacionCompra && this.isPermisoNuevoDetallePlaneacionCompra));			
			this.jMenuItemDuplicarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaDuplicarDetallePlaneacionCompra && this.isPermisoDuplicarDetallePlaneacionCompra));			
			this.jMenuItemCopiarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaCopiarDetallePlaneacionCompra && this.isPermisoCopiarDetallePlaneacionCompra));			
			this.jMenuItemVerFormDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaVerFormDetallePlaneacionCompra && this.isPermisoVerFormDetallePlaneacionCompra));			
			this.jMenuItemAbrirOrderByDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaOrdenDetallePlaneacionCompra && this.isPermisoOrdenDetallePlaneacionCompra));			
			//this.jMenuItemMostrarOcultarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaOrdenDetallePlaneacionCompra && this.isPermisoOrdenDetallePlaneacionCompra));
			this.jMenuItemDetalleAbrirOrderByDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaOrdenDetallePlaneacionCompra && this.isPermisoOrdenDetallePlaneacionCompra));			
			//this.jMenuItemDetalleMostrarOcultarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaOrdenDetallePlaneacionCompra && this.isPermisoOrdenDetallePlaneacionCompra));			
			this.jMenuItemNuevoRelacionesDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra && this.isPermisoNuevoDetallePlaneacionCompra));			
			this.jMenuItemNuevoGuardarCambiosDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaNuevoDetallePlaneacionCompra && this.isPermisoNuevoDetallePlaneacionCompra && this.isPermisoGuardarCambiosDetallePlaneacionCompra));									
			
			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jMenuItemModificarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaModificarDetallePlaneacionCompra && this.isPermisoActualizarDetallePlaneacionCompra));	
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jMenuItemActualizarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaActualizarDetallePlaneacionCompra && this.isPermisoActualizarDetallePlaneacionCompra));	
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jMenuItemEliminarDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaEliminarDetallePlaneacionCompra && this.isPermisoEliminarDetallePlaneacionCompra));
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jMenuItemCancelarDetallePlaneacionCompra.setVisible(this.isVisibilidadCeldaCancelarDetallePlaneacionCompra);				
			}
			
			this.jMenuItemGuardarCambiosDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaGuardarDetallePlaneacionCompra && this.isPermisoGuardarCambiosDetallePlaneacionCompra));						
			this.jMenuItemGuardarCambiosTablaDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra && this.isPermisoGuardarCambiosDetallePlaneacionCompra));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetallePlaneacionCompra=this.jButtonNuevoDetallePlaneacionCompra.isVisible();
			this.isVisibilidadCeldaDuplicarDetallePlaneacionCompra=this.jButtonDuplicarDetallePlaneacionCompra.isVisible();
			this.isVisibilidadCeldaCopiarDetallePlaneacionCompra=this.jButtonCopiarDetallePlaneacionCompra.isVisible();
			this.isVisibilidadCeldaVerFormDetallePlaneacionCompra=this.jButtonVerFormDetallePlaneacionCompra.isVisible();
			
			this.isVisibilidadCeldaOrdenDetallePlaneacionCompra=this.jButtonAbrirOrderByDetallePlaneacionCompra.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra=this.jButtonNuevoRelacionesDetallePlaneacionCompra.isVisible();
			this.isVisibilidadCeldaModificarDetallePlaneacionCompra=this.jButtonModificarDetallePlaneacionCompra.isVisible();
			
			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
			this.isVisibilidadCeldaActualizarDetallePlaneacionCompra=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonActualizarDetallePlaneacionCompra.isVisible();
			this.isVisibilidadCeldaEliminarDetallePlaneacionCompra=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonEliminarDetallePlaneacionCompra.isVisible();
			this.isVisibilidadCeldaCancelarDetallePlaneacionCompra=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonCancelarDetallePlaneacionCompra.isVisible();
			this.isVisibilidadCeldaGuardarDetallePlaneacionCompra=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonGuardarCambiosDetallePlaneacionCompra.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra=this.jButtonGuardarCambiosTablaDetallePlaneacionCompra.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetallePlaneacionCompra=this.jButtonNuevoToolBarDetallePlaneacionCompra.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra=this.jButtonNuevoRelacionesToolBarDetallePlaneacionCompra.isVisible();
			
			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
			this.isVisibilidadCeldaModificarDetallePlaneacionCompra=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonModificarToolBarDetallePlaneacionCompra.isVisible();
			this.isVisibilidadCeldaActualizarDetallePlaneacionCompra=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonActualizarToolBarDetallePlaneacionCompra.isVisible();
			this.isVisibilidadCeldaEliminarDetallePlaneacionCompra=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonEliminarToolBarDetallePlaneacionCompra.isVisible();
			this.isVisibilidadCeldaCancelarDetallePlaneacionCompra=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonCancelarToolBarDetallePlaneacionCompra.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetallePlaneacionCompra=this.jButtonGuardarCambiosToolBarDetallePlaneacionCompra.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra=this.jButtonGuardarCambiosTablaToolBarDetallePlaneacionCompra.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetallePlaneacionCompra=this.jMenuItemNuevoDetallePlaneacionCompra.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra=this.jMenuItemNuevoRelacionesDetallePlaneacionCompra.isVisible();
			
			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
			this.isVisibilidadCeldaModificarDetallePlaneacionCompra=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jMenuItemModificarDetallePlaneacionCompra.isVisible();
			this.isVisibilidadCeldaActualizarDetallePlaneacionCompra=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jMenuItemActualizarDetallePlaneacionCompra.isVisible();
			this.isVisibilidadCeldaEliminarDetallePlaneacionCompra=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jMenuItemEliminarDetallePlaneacionCompra.isVisible();
			this.isVisibilidadCeldaCancelarDetallePlaneacionCompra=this.jInternalFrameDetalleFormDetallePlaneacionCompra.jMenuItemCancelarDetallePlaneacionCompra.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetallePlaneacionCompra=this.jMenuItemGuardarCambiosDetallePlaneacionCompra.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra=this.jMenuItemGuardarCambiosTablaDetallePlaneacionCompra.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetallePlaneacionCompra(Boolean esInicializar) {
		if(DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detalleplaneacioncompraSessionBean.getConGuardarRelaciones()) {
				//if(this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetallePlaneacionCompra();
			}
			
			this.inicializarActualizarBindingBotonesManualDetallePlaneacionCompra(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetallePlaneacionCompra() {
		this.jButtonNuevoDetallePlaneacionCompra.setVisible(this.isPermisoNuevoDetallePlaneacionCompra);			
		this.jButtonDuplicarDetallePlaneacionCompra.setVisible(this.isPermisoDuplicarDetallePlaneacionCompra);			
		this.jButtonCopiarDetallePlaneacionCompra.setVisible(this.isPermisoCopiarDetallePlaneacionCompra);			
		this.jButtonVerFormDetallePlaneacionCompra.setVisible(this.isPermisoVerFormDetallePlaneacionCompra);			
		
		this.jButtonAbrirOrderByDetallePlaneacionCompra.setVisible(this.isPermisoOrdenDetallePlaneacionCompra);					
		
		this.jButtonNuevoRelacionesDetallePlaneacionCompra.setVisible(this.isPermisoNuevoDetallePlaneacionCompra);			
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonModificarDetallePlaneacionCompra.setVisible(this.isPermisoActualizarDetallePlaneacionCompra);	
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonActualizarDetallePlaneacionCompra.setVisible(this.isPermisoActualizarDetallePlaneacionCompra);	
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonEliminarDetallePlaneacionCompra.setVisible(this.isPermisoEliminarDetallePlaneacionCompra);
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonCancelarDetallePlaneacionCompra.setVisible(this.isVisibilidadCeldaCancelarDetallePlaneacionCompra);						
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonGuardarCambiosDetallePlaneacionCompra.setVisible(this.isPermisoGuardarCambiosDetallePlaneacionCompra);							
		}
		
		this.jButtonGuardarCambiosTablaDetallePlaneacionCompra.setVisible(this.isPermisoActualizarDetallePlaneacionCompra);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetallePlaneacionCompra() {
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonModificarDetallePlaneacionCompra.setVisible(this.isPermisoActualizarDetallePlaneacionCompra);	
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonActualizarDetallePlaneacionCompra.setVisible(this.isPermisoActualizarDetallePlaneacionCompra);	
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonEliminarDetallePlaneacionCompra.setVisible(this.isPermisoEliminarDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonCancelarDetallePlaneacionCompra.setVisible(this.isVisibilidadCeldaCancelarDetallePlaneacionCompra);							
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonGuardarCambiosDetallePlaneacionCompra.setVisible((this.isVisibilidadCeldaGuardarDetallePlaneacionCompra && this.isPermisoGuardarCambiosDetallePlaneacionCompra));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetallePlaneacionCompra() {
		if(DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetallePlaneacionCompra();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetallePlaneacionCompra() {
	}
	
	public void jTableDatosDetallePlaneacionCompraListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetallePlaneacionCompra(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetallePlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleplaneacioncompra==null) {
						this.detalleplaneacioncompra = new DetallePlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
				}

				if(this.detalleplaneacioncompra.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detalleplaneacioncompra.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetallePlaneacionCompraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetallePlaneacionCompra(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePlaneacionCompra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePlaneacionCompra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detalleplaneacioncompraLogic.getConnexion());

				if(this.detalleplaneacioncompra.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detalleplaneacioncompra.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePlaneacionCompra=(TitledBorder)this.jScrollPanelDatosDetallePlaneacionCompra.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetallePlaneacionCompra.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetallePlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleplaneacioncompra==null) {
						this.detalleplaneacioncompra = new DetallePlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
				}

				if(this.detalleplaneacioncompra.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detalleplaneacioncompra.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDetallePlaneacionCompraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDetallePlaneacionCompra(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePlaneacionCompra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePlaneacionCompra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.detalleplaneacioncompraLogic.getConnexion());

				if(this.detalleplaneacioncompra.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.detalleplaneacioncompra.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePlaneacionCompra=(TitledBorder)this.jScrollPanelDatosDetallePlaneacionCompra.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDetallePlaneacionCompra.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDetallePlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleplaneacioncompra==null) {
						this.detalleplaneacioncompra = new DetallePlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
				}

				if(this.detalleplaneacioncompra.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.detalleplaneacioncompra.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioDetallePlaneacionCompraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebDetallePlaneacionCompra(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePlaneacionCompra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePlaneacionCompra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.detalleplaneacioncompraLogic.getConnexion());

				if(this.detalleplaneacioncompra.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.detalleplaneacioncompra.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePlaneacionCompra=(TitledBorder)this.jScrollPanelDatosDetallePlaneacionCompra.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderDetallePlaneacionCompra.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioDetallePlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleplaneacioncompra==null) {
						this.detalleplaneacioncompra = new DetallePlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
				}

				if(this.detalleplaneacioncompra.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.detalleplaneacioncompra.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoDetallePlaneacionCompraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebDetallePlaneacionCompra(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePlaneacionCompra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePlaneacionCompra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.detalleplaneacioncompraLogic.getConnexion());

				if(this.detalleplaneacioncompra.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.detalleplaneacioncompra.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePlaneacionCompra=(TitledBorder)this.jScrollPanelDatosDetallePlaneacionCompra.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderDetallePlaneacionCompra.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoDetallePlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleplaneacioncompra==null) {
						this.detalleplaneacioncompra = new DetallePlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
				}

				if(this.detalleplaneacioncompra.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.detalleplaneacioncompra.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_planeacion_compraDetallePlaneacionCompraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoplaneacioncompra=true;

			idTienePermisoplaneacioncompra=this.tienePermisosUsuarioEnPaginaWebDetallePlaneacionCompra(PlaneacionCompraConstantesFunciones.CLASSNAME);

			if(idTienePermisoplaneacioncompra) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePlaneacionCompra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePlaneacionCompra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);

				this.planeacioncompraBeanSwingJInternalFrame=new PlaneacionCompraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.planeacioncompraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.planeacioncompraBeanSwingJInternalFrame.getPlaneacionCompraLogic().setConnexion(this.detalleplaneacioncompraLogic.getConnexion());

				if(this.detalleplaneacioncompra.getid_planeacion_compra()!=null) {
					this.planeacioncompraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.planeacioncompraBeanSwingJInternalFrame.setIdActual(this.detalleplaneacioncompra.getid_planeacion_compra());
					this.planeacioncompraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.planeacioncompraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.planeacioncompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaPlaneacionCompra();
				}

				JInternalFrameBase jinternalFrame =this.planeacioncompraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePlaneacionCompra=(TitledBorder)this.jScrollPanelDatosDetallePlaneacionCompra.getBorder();
				TitledBorder titledBorderplaneacioncompra=(TitledBorder)this.planeacioncompraBeanSwingJInternalFrame.jScrollPanelDatosPlaneacionCompra.getBorder();

				titledBorderplaneacioncompra.setTitle(titledBorderDetallePlaneacionCompra.getTitle() + " -> Planeacion Compra");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_planeacion_compraDetallePlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleplaneacioncompra==null) {
						this.detalleplaneacioncompra = new DetallePlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
				}

				if(this.detalleplaneacioncompra.getid_planeacion_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_planeacion_compra = "+this.detalleplaneacioncompra.getid_planeacion_compra().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaDetallePlaneacionCompraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebDetallePlaneacionCompra(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePlaneacionCompra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePlaneacionCompra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.detalleplaneacioncompraLogic.getConnexion());

				if(this.detalleplaneacioncompra.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.detalleplaneacioncompra.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePlaneacionCompra=(TitledBorder)this.jScrollPanelDatosDetallePlaneacionCompra.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderDetallePlaneacionCompra.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaDetallePlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleplaneacioncompra==null) {
						this.detalleplaneacioncompra = new DetallePlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
				}

				if(this.detalleplaneacioncompra.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.detalleplaneacioncompra.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoDetallePlaneacionCompraActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderDetallePlaneacionCompra=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosDetallePlaneacionCompra.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderDetallePlaneacionCompra=(TitledBorder)this.jScrollPanelDatosDetallePlaneacionCompra.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderDetallePlaneacionCompra.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoDetallePlaneacionCompraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebDetallePlaneacionCompra(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePlaneacionCompra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePlaneacionCompra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.detalleplaneacioncompraLogic.getConnexion());

				if(this.detalleplaneacioncompra.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.detalleplaneacioncompra.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePlaneacionCompra=(TitledBorder)this.jScrollPanelDatosDetallePlaneacionCompra.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderDetallePlaneacionCompra.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoDetallePlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleplaneacioncompra==null) {
						this.detalleplaneacioncompra = new DetallePlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
				}

				if(this.detalleplaneacioncompra.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.detalleplaneacioncompra.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadDetallePlaneacionCompraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebDetallePlaneacionCompra(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePlaneacionCompra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePlaneacionCompra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.detalleplaneacioncompraLogic.getConnexion());

				if(this.detalleplaneacioncompra.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.detalleplaneacioncompra.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePlaneacionCompra=(TitledBorder)this.jScrollPanelDatosDetallePlaneacionCompra.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderDetallePlaneacionCompra.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadDetallePlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleplaneacioncompra==null) {
						this.detalleplaneacioncompra = new DetallePlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
				}

				if(this.detalleplaneacioncompra.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.detalleplaneacioncompra.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonstockDetallePlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleplaneacioncompra==null) {
						this.detalleplaneacioncompra = new DetallePlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
				}

				if(this.detalleplaneacioncompra.getstock()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where stock = "+this.detalleplaneacioncompra.getstock().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondia_minimoDetallePlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleplaneacioncompra==null) {
						this.detalleplaneacioncompra = new DetallePlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
				}

				if(this.detalleplaneacioncompra.getdia_minimo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dia_minimo = "+this.detalleplaneacioncompra.getdia_minimo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonstock_minimoDetallePlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleplaneacioncompra==null) {
						this.detalleplaneacioncompra = new DetallePlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
				}

				if(this.detalleplaneacioncompra.getstock_minimo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where stock_minimo = "+this.detalleplaneacioncompra.getstock_minimo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondia_maximoDetallePlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleplaneacioncompra==null) {
						this.detalleplaneacioncompra = new DetallePlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
				}

				if(this.detalleplaneacioncompra.getdia_maximo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dia_maximo = "+this.detalleplaneacioncompra.getdia_maximo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonstock_maximoDetallePlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleplaneacioncompra==null) {
						this.detalleplaneacioncompra = new DetallePlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
				}

				if(this.detalleplaneacioncompra.getstock_maximo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where stock_maximo = "+this.detalleplaneacioncompra.getstock_maximo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsalidaDetallePlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleplaneacioncompra==null) {
						this.detalleplaneacioncompra = new DetallePlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
				}

				if(this.detalleplaneacioncompra.getsalida()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where salida = "+this.detalleplaneacioncompra.getsalida().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonstock_mensualDetallePlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleplaneacioncompra==null) {
						this.detalleplaneacioncompra = new DetallePlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
				}

				if(this.detalleplaneacioncompra.getstock_mensual()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where stock_mensual = "+this.detalleplaneacioncompra.getstock_mensual().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionDetallePlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.getdetalleplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleplaneacioncompra==null) {
						this.detalleplaneacioncompra = new DetallePlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);
				}

				if(this.detalleplaneacioncompra.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.detalleplaneacioncompra.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEjercicioDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);

			this.getDetallePlaneacionComprasFK_IdEjercicio();

			this.inicializarActualizarBindingDetallePlaneacionCompra(false);

			//if(DetallePlaneacionCompraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);

			this.getDetallePlaneacionComprasFK_IdEmpresa();

			this.inicializarActualizarBindingDetallePlaneacionCompra(false);

			//if(DetallePlaneacionCompraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);

			this.getDetallePlaneacionComprasFK_IdLinea();

			this.inicializarActualizarBindingDetallePlaneacionCompra(false);

			//if(DetallePlaneacionCompraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);

			this.getDetallePlaneacionComprasFK_IdPeriodo();

			this.inicializarActualizarBindingDetallePlaneacionCompra(false);

			//if(DetallePlaneacionCompraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPlaneacionCompraDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);

			this.getDetallePlaneacionComprasFK_IdPlaneacionCompra();

			this.inicializarActualizarBindingDetallePlaneacionCompra(false);

			//if(DetallePlaneacionCompraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);

			this.getDetallePlaneacionComprasFK_IdProducto();

			this.inicializarActualizarBindingDetallePlaneacionCompra(false);

			//if(DetallePlaneacionCompraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);

			this.getDetallePlaneacionComprasFK_IdSucursal();

			this.inicializarActualizarBindingDetallePlaneacionCompra(false);

			//if(DetallePlaneacionCompraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadDetallePlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);

			this.getDetallePlaneacionComprasFK_IdUnidad();

			this.inicializarActualizarBindingDetallePlaneacionCompra(false);

			//if(DetallePlaneacionCompraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleplaneacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetallePlaneacionCompra() {
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.dispose();
			this.jInternalFrameDetalleFormDetallePlaneacionCompra=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetallePlaneacionCompra!=null) {
			this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.dispose();
			this.jInternalFrameReporteDinamicoDetallePlaneacionCompra=null;
		}
		
		if(this.jInternalFrameImportacionDetallePlaneacionCompra!=null) {
			this.jInternalFrameImportacionDetallePlaneacionCompra.setVisible(false);	    			
			this.jInternalFrameImportacionDetallePlaneacionCompra.dispose();
			this.jInternalFrameImportacionDetallePlaneacionCompra=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetallePlaneacionCompra();
			
			DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetallePlaneacionCompra")) {
				jButtonNuevoDetallePlaneacionCompraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetallePlaneacionCompra")) {
				jButtonDuplicarDetallePlaneacionCompraActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetallePlaneacionCompra")) {
				jButtonCopiarDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetallePlaneacionCompra")) {
				jButtonVerFormDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetallePlaneacionCompra")) {
				jButtonNuevoDetallePlaneacionCompraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetallePlaneacionCompra")) {
				jButtonDuplicarDetallePlaneacionCompraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetallePlaneacionCompra")) {
				jButtonNuevoDetallePlaneacionCompraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetallePlaneacionCompra")) {
				jButtonDuplicarDetallePlaneacionCompraActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetallePlaneacionCompra")) {
				jButtonNuevoDetallePlaneacionCompraActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetallePlaneacionCompra")) {
				jButtonNuevoDetallePlaneacionCompraActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetallePlaneacionCompra")) {
				jButtonNuevoDetallePlaneacionCompraActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetallePlaneacionCompra")) {
				jButtonModificarDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetallePlaneacionCompra")) {
				jButtonModificarDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetallePlaneacionCompra")) {
				jButtonModificarDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetallePlaneacionCompra")) {
				jButtonActualizarDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetallePlaneacionCompra")) {
				jButtonActualizarDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetallePlaneacionCompra")) {
				jButtonActualizarDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetallePlaneacionCompra")) {
				jButtonEliminarDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetallePlaneacionCompra")) {
				jButtonEliminarDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetallePlaneacionCompra")) {
				jButtonEliminarDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetallePlaneacionCompra")) {
				jButtonCancelarDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetallePlaneacionCompra")) {
				jButtonCancelarDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetallePlaneacionCompra")) {
				jButtonCancelarDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetallePlaneacionCompra")) {
				jButtonCerrarDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetallePlaneacionCompra")) {
				jButtonCerrarDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetallePlaneacionCompra")) {
				jButtonCerrarDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetallePlaneacionCompra")) {
				jButtonMostrarOcultarDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetallePlaneacionCompra")) {
				jButtonCancelarDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetallePlaneacionCompra")) {
				jButtonGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetallePlaneacionCompra")) {
				jButtonGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetallePlaneacionCompra")) {
				jButtonCopiarDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetallePlaneacionCompra")) {
				jButtonVerFormDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetallePlaneacionCompra")) {
				jButtonGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetallePlaneacionCompra")) {
				jButtonCopiarDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetallePlaneacionCompra")) {
				jButtonVerFormDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetallePlaneacionCompra")) {
				jButtonGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetallePlaneacionCompra")) {
				jButtonGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetallePlaneacionCompra")) {
				jButtonGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetallePlaneacionCompra")) {
				jButtonRecargarInformacionDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetallePlaneacionCompra")) {
				jButtonRecargarInformacionDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetallePlaneacionCompra")) {
				jButtonRecargarInformacionDetallePlaneacionCompraActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetallePlaneacionCompra")) {
				jButtonAnterioresDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetallePlaneacionCompra")) {
				jButtonAnterioresDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetallePlaneacionCompra")) {
				jButtonAnterioresDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetallePlaneacionCompra")) {
				jButtonSiguientesDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetallePlaneacionCompra")) {
				jButtonSiguientesDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetallePlaneacionCompra")) {
				jButtonSiguientesDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetallePlaneacionCompra") || sTipo.equals("MenuItemDetalleAbrirOrderByDetallePlaneacionCompra")) {
				jButtonAbrirOrderByDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetallePlaneacionCompra") || sTipo.equals("MenuItemDetalleMostrarOcultarDetallePlaneacionCompra")) {
				jButtonMostrarOcultarDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetallePlaneacionCompra")) {
				jButtonNuevoGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetallePlaneacionCompra")) {
				jButtonNuevoGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetallePlaneacionCompra")) {
				jButtonNuevoGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetallePlaneacionCompra")) {
				jButtonCerrarReporteDinamicoDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetallePlaneacionCompra")) {
				jButtonGenerarReporteDinamicoDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetallePlaneacionCompra")) {
				
				jButtonGenerarExcelReporteDinamicoDetallePlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetallePlaneacionCompra")) {
				jButtonCerrarImportacionDetallePlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetallePlaneacionCompra")) {
				
				jButtonGenerarImportacionDetallePlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetallePlaneacionCompra")) {
				
				jButtonAbrirImportacionDetallePlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetallePlaneacionCompra")) {
				jComboBoxTiposAccionesDetallePlaneacionCompraActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetallePlaneacionCompra")) {
				jComboBoxTiposRelacionesDetallePlaneacionCompraActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetallePlaneacionCompra")) {
				jComboBoxTiposAccionesDetallePlaneacionCompraActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetallePlaneacionCompra")) {
				
				jComboBoxTiposSeleccionarDetallePlaneacionCompraActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetallePlaneacionCompra")) {
				jTextFieldValorCampoGeneralDetallePlaneacionCompraActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetallePlaneacionCompra")) {
				jButtonAbrirOrderByDetallePlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetallePlaneacionCompra")) {
				jButtonAbrirOrderByDetallePlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetallePlaneacionCompra")) {
				jButtonCerrarOrderByDetallePlaneacionCompraActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetallePlaneacionCompraBusqueda")) {
				this.jButtonidDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetallePlaneacionCompraUpdate")) {
				this.jButtonid_empresaDetallePlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetallePlaneacionCompraBusqueda")) {
				this.jButtonid_empresaDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetallePlaneacionCompraUpdate")) {
				this.jButtonid_sucursalDetallePlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetallePlaneacionCompraBusqueda")) {
				this.jButtonid_sucursalDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDetallePlaneacionCompraUpdate")) {
				this.jButtonid_ejercicioDetallePlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDetallePlaneacionCompraBusqueda")) {
				this.jButtonid_ejercicioDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoDetallePlaneacionCompraUpdate")) {
				this.jButtonid_periodoDetallePlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoDetallePlaneacionCompraBusqueda")) {
				this.jButtonid_periodoDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_planeacion_compraDetallePlaneacionCompraUpdate")) {
				this.jButtonid_planeacion_compraDetallePlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_planeacion_compraDetallePlaneacionCompraBusqueda")) {
				this.jButtonid_planeacion_compraDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaDetallePlaneacionCompraUpdate")) {
				this.jButtonid_lineaDetallePlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaDetallePlaneacionCompraBusqueda")) {
				this.jButtonid_lineaDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoDetallePlaneacionCompra")) {
				this.jButtonid_productoDetallePlaneacionCompraActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoDetallePlaneacionCompraUpdate")) {
				this.jButtonid_productoDetallePlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoDetallePlaneacionCompraBusqueda")) {
				this.jButtonid_productoDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadDetallePlaneacionCompraUpdate")) {
				this.jButtonid_unidadDetallePlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadDetallePlaneacionCompraBusqueda")) {
				this.jButtonid_unidadDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("stockDetallePlaneacionCompraBusqueda")) {
				this.jButtonstockDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_minimoDetallePlaneacionCompraBusqueda")) {
				this.jButtondia_minimoDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("stock_minimoDetallePlaneacionCompraBusqueda")) {
				this.jButtonstock_minimoDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_maximoDetallePlaneacionCompraBusqueda")) {
				this.jButtondia_maximoDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("stock_maximoDetallePlaneacionCompraBusqueda")) {
				this.jButtonstock_maximoDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("salidaDetallePlaneacionCompraBusqueda")) {
				this.jButtonsalidaDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("stock_mensualDetallePlaneacionCompraBusqueda")) {
				this.jButtonstock_mensualDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetallePlaneacionCompraBusqueda")) {
				this.jButtondescripcionDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoDetallePlaneacionCompra")) {
				this.jButtonid_productoDetallePlaneacionCompraActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdLineaDetallePlaneacionCompra")) {
				this.jButtonFK_IdLineaDetallePlaneacionCompraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPlaneacionCompraDetallePlaneacionCompra")) {
				this.jButtonFK_IdPlaneacionCompraDetallePlaneacionCompraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoDetallePlaneacionCompra")) {
				this.jButtonFK_IdProductoDetallePlaneacionCompraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadDetallePlaneacionCompra")) {
				this.jButtonFK_IdUnidadDetallePlaneacionCompraActionPerformed(evt);
			}
			
			;
			
			
			DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetallePlaneacionCompra();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePlaneacionCompraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleplaneacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleplaneacioncompra);
				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
				
				


				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePlaneacionCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePlaneacionCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetallePlaneacionCompra detalleplaneacioncompraLocal=null;
			
			if(!this.getEsControlTabla()) {
				detalleplaneacioncompraLocal=this.detalleplaneacioncompra;
			} else {
				detalleplaneacioncompraLocal=this.detalleplaneacioncompraAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleplaneacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleplaneacioncompra);
				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
							
				
				


				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePlaneacionCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePlaneacionCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePlaneacionCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraAnterior =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleplaneacioncompraAnterior =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
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
			
			DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
			
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
			
			


			
			DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePlaneacionCompraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleplaneacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleplaneacioncompra);
				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
								
						
				


				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePlaneacionCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePlaneacionCompra.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleplaneacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleplaneacioncompra);
				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
								
				
				


				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePlaneacionCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePlaneacionCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePlaneacionCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraAnterior =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleplaneacioncompraAnterior =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleplaneacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleplaneacioncompra);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePlaneacionCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraAnterior =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleplaneacioncompraAnterior =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePlaneacionCompraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleplaneacioncompra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleplaneacioncompra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleplaneacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleplaneacioncompra);
				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
							
				
				


				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePlaneacionCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePlaneacionCompra.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePlaneacionCompraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleplaneacioncompraAnterior =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleplaneacioncompraAnterior =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
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
			
			DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
			
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
			
			


			
			DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePlaneacionCompraActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleplaneacioncompra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleplaneacioncompra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleplaneacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleplaneacioncompra);
				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
								
				
				


				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePlaneacionCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePlaneacionCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePlaneacionCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraAnterior =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleplaneacioncompraAnterior =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePlaneacionCompraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleplaneacioncompra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleplaneacioncompra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePlaneacionCompraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleplaneacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleplaneacioncompra);
				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetallePlaneacionCompra")) {
					jCheckBoxSeleccionarTodosDetallePlaneacionCompraItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetallePlaneacionCompra")) {
					jCheckBoxSeleccionadosDetallePlaneacionCompraItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetallePlaneacionCompra")) {
					
				}
				
				


				
				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePlaneacionCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePlaneacionCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleplaneacioncompra);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detalleplaneacioncompra);
				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
												
				
				


				
				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePlaneacionCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePlaneacionCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePlaneacionCompraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleplaneacioncompraAnterior =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleplaneacioncompraAnterior =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePlaneacionCompraActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleplaneacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleplaneacioncompra);
				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
				
				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
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
			
			DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
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
			
			


			
			DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePlaneacionCompraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleplaneacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleplaneacioncompra);
				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePlaneacionCompra.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePlaneacionCompra.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleplaneacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleplaneacioncompra);
				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
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
				
				


				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePlaneacionCompra.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePlaneacionCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePlaneacionCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleplaneacioncompraAnterior =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleplaneacioncompraAnterior =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetallePlaneacionCompra")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetallePlaneacionCompraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetallePlaneacionCompra.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detalleplaneacioncompra =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detalleplaneacioncompra);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetallePlaneacionCompra")) {
				
				}
				
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetallePlaneacionCompra")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetallePlaneacionCompra.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetallePlaneacionCompra")) {
			
			}
			
			DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetallePlaneacionCompra();
			
			DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
			
			if(sTipo.equals("NuevoDetallePlaneacionCompra")) {
				jButtonNuevoDetallePlaneacionCompraActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetallePlaneacionCompra")) {
				jButtonDuplicarDetallePlaneacionCompraActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetallePlaneacionCompra")) {
				jButtonCopiarDetallePlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetallePlaneacionCompra")) {
				jButtonVerFormDetallePlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetallePlaneacionCompra")) {
				jButtonNuevoDetallePlaneacionCompraActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetallePlaneacionCompra")) {
				jButtonModificarDetallePlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetallePlaneacionCompra")) {
				jButtonActualizarDetallePlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetallePlaneacionCompra")) {
				jButtonEliminarDetallePlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetallePlaneacionCompra")) {
				jButtonGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetallePlaneacionCompra")) {
				jButtonCancelarDetallePlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetallePlaneacionCompra")) {
				jButtonCerrarDetallePlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetallePlaneacionCompra")) {
				jButtonGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetallePlaneacionCompra")) {
				jButtonNuevoGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetallePlaneacionCompra")) {
				jButtonAbrirOrderByDetallePlaneacionCompraActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetallePlaneacionCompra")) {
				jButtonRecargarInformacionDetallePlaneacionCompraActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetallePlaneacionCompra")) {
				jButtonAnterioresDetallePlaneacionCompraActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetallePlaneacionCompra")) {
				jButtonSiguientesDetallePlaneacionCompraActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetallePlaneacionCompraBusqueda")) {
				this.jButtonidDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetallePlaneacionCompraUpdate")) {
				this.jButtonid_empresaDetallePlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetallePlaneacionCompraBusqueda")) {
				this.jButtonid_empresaDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetallePlaneacionCompraUpdate")) {
				this.jButtonid_sucursalDetallePlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetallePlaneacionCompraBusqueda")) {
				this.jButtonid_sucursalDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDetallePlaneacionCompraUpdate")) {
				this.jButtonid_ejercicioDetallePlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDetallePlaneacionCompraBusqueda")) {
				this.jButtonid_ejercicioDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoDetallePlaneacionCompraUpdate")) {
				this.jButtonid_periodoDetallePlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoDetallePlaneacionCompraBusqueda")) {
				this.jButtonid_periodoDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_planeacion_compraDetallePlaneacionCompraUpdate")) {
				this.jButtonid_planeacion_compraDetallePlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_planeacion_compraDetallePlaneacionCompraBusqueda")) {
				this.jButtonid_planeacion_compraDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaDetallePlaneacionCompraUpdate")) {
				this.jButtonid_lineaDetallePlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaDetallePlaneacionCompraBusqueda")) {
				this.jButtonid_lineaDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoDetallePlaneacionCompra")) {
				this.jButtonid_productoDetallePlaneacionCompraActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoDetallePlaneacionCompraUpdate")) {
				this.jButtonid_productoDetallePlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoDetallePlaneacionCompraBusqueda")) {
				this.jButtonid_productoDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadDetallePlaneacionCompraUpdate")) {
				this.jButtonid_unidadDetallePlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadDetallePlaneacionCompraBusqueda")) {
				this.jButtonid_unidadDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("stockDetallePlaneacionCompraBusqueda")) {
				this.jButtonstockDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_minimoDetallePlaneacionCompraBusqueda")) {
				this.jButtondia_minimoDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("stock_minimoDetallePlaneacionCompraBusqueda")) {
				this.jButtonstock_minimoDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_maximoDetallePlaneacionCompraBusqueda")) {
				this.jButtondia_maximoDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("stock_maximoDetallePlaneacionCompraBusqueda")) {
				this.jButtonstock_maximoDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("salidaDetallePlaneacionCompraBusqueda")) {
				this.jButtonsalidaDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("stock_mensualDetallePlaneacionCompraBusqueda")) {
				this.jButtonstock_mensualDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetallePlaneacionCompraBusqueda")) {
				this.jButtondescripcionDetallePlaneacionCompraBusquedaActionPerformed(evt);
			}
			
			DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetallePlaneacionCompra();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetallePlaneacionCompra")) {
				closingInternalFrameDetallePlaneacionCompra();
				
			} else if(sTipo.equals("jButtonCancelarDetallePlaneacionCompra")) {
				JInternalFrameBase jInternalFrameDetalleFormDetallePlaneacionCompra = (JInternalFrameBase)evt.getSource();
	            	
	            DetallePlaneacionCompraBeanSwingJInternalFrame jInternalFrameParent=(DetallePlaneacionCompraBeanSwingJInternalFrame)jInternalFrameDetalleFormDetallePlaneacionCompra.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetallePlaneacionCompraActionPerformed(null);
			}
			
			DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleplaneacioncompra,new Object(),this.detalleplaneacioncompraParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetallePlaneacionCompra(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetallePlaneacionCompra(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetallePlaneacionCompra(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detalleplaneacioncompra)) {
			if(!esControlTabla) {
				if(DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);			
				}
				
				if(this.detalleplaneacioncompraSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleplaneacioncompraReturnGeneral=detalleplaneacioncompraLogic.procesarEventosDetallePlaneacionComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras(),this.detalleplaneacioncompra,this.detalleplaneacioncompraParameterGeneral,this.isEsNuevoDetallePlaneacionCompra,classes);//this.detalleplaneacioncompraLogic.getDetallePlaneacionCompra()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetallePlaneacionCompra(this.detalleplaneacioncompraReturnGeneral,this.detalleplaneacioncompraBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detalleplaneacioncompraSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetallePlaneacionCompra(classes,this.detalleplaneacioncompraReturnGeneral,this.detalleplaneacioncompraBean,false);
					}
						
					if(this.detalleplaneacioncompraReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetallePlaneacionCompra(this.detalleplaneacioncompraReturnGeneral.getDetallePlaneacionCompra());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetallePlaneacionCompra(this.detalleplaneacioncompraReturnGeneral.getDetallePlaneacionCompra());	
					}
						
					if(this.detalleplaneacioncompraReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetallePlaneacionCompra(this.detalleplaneacioncompraReturnGeneral.getDetallePlaneacionCompra(),classes);//this.detalleplaneacioncompraBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetallePlaneacionCompra(this.detalleplaneacioncompra,classes);//this.detalleplaneacioncompraBean);									
				}
			
				if(DetallePlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetallePlaneacionCompra(this.detalleplaneacioncompra,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePlaneacionCompra(this.detalleplaneacioncompra);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detalleplaneacioncompraAnterior!=null) {
						this.detalleplaneacioncompra=this.detalleplaneacioncompraAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleplaneacioncompraReturnGeneral=detalleplaneacioncompraLogic.procesarEventosDetallePlaneacionComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras(),this.detalleplaneacioncompra,this.detalleplaneacioncompraParameterGeneral,this.isEsNuevoDetallePlaneacionCompra,classes);//this.detalleplaneacioncompraLogic.getDetallePlaneacionCompra()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleplaneacioncompraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detalleplaneacioncompraReturnGeneral.getDetallePlaneacionCompra(),detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detalleplaneacioncompraReturnGeneral.getDetallePlaneacionCompra(),this.detalleplaneacioncompras);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetallePlaneacionCompra.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetallePlaneacionCompra.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetallePlaneacionCompra();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetallePlaneacionCompra() throws Exception {
		
		DetallePlaneacionCompraModel detalleplaneacioncompraModel=(DetallePlaneacionCompraModel)this.jTableDatosDetallePlaneacionCompra.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleplaneacioncompraModel.detalleplaneacioncompras=this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detalleplaneacioncompraModel.detalleplaneacioncompras=this.detalleplaneacioncompras;
		}
		
		
		((DetallePlaneacionCompraModel) this.jTableDatosDetallePlaneacionCompra.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetallePlaneacionCompra() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetalleplaneacioncompraAnterior(),this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetalleplaneacioncompraAnterior(),this.detalleplaneacioncompras);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetallePlaneacionCompra();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetallePlaneacionCompra(DetallePlaneacionCompra detalleplaneacioncompra,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
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
										
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleplaneacioncompra,new Object(),generalEntityParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detalleplaneacioncompraSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetallePlaneacionCompraConstantesFunciones.getClassesRelationshipsOfDetallePlaneacionCompra(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetallePlaneacionCompraConstantesFunciones.getClassesRelationshipsFromStringsOfDetallePlaneacionCompra(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetallePlaneacionCompra(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleplaneacioncompra,new Object(),generalEntityParameterGeneral,this.detalleplaneacioncompraReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetallePlaneacionCompra(DetallePlaneacionCompraBean detalleplaneacioncompraBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetallePlaneacionCompra(ArrayList<Classe> classes,DetallePlaneacionCompraReturnGeneral detalleplaneacioncompraReturnGeneral,DetallePlaneacionCompraBean detalleplaneacioncompraBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetallePlaneacionCompra(DetallePlaneacionCompra detalleplaneacioncompra,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detalleplaneacioncompra)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetallePlaneacionCompra = new DetallePlaneacionCompraDetalleFormJInternalFrame(jDesktopPane,this.detalleplaneacioncompraSessionBean.getConGuardarRelaciones(),this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.setVisible(false);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.detalleplaneacioncompraLogic=this.detalleplaneacioncompraLogic;
		
		this.cargarCombosFrameForeignKeyDetallePlaneacionCompra("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetallePlaneacionCompra();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetallePlaneacionCompra();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetallePlaneacionCompra("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetallePlaneacionCompra();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetallePlaneacionCompra"));
		
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonModificarDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"ModificarDetallePlaneacionCompra"));

		
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonModificarToolBarDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetallePlaneacionCompra"));
					
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jMenuItemModificarDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetallePlaneacionCompra"));		
		
		
		
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonActualizarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"ActualizarDetallePlaneacionCompra"));
		
		
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonActualizarToolBarDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetallePlaneacionCompra"));
						
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jMenuItemActualizarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetallePlaneacionCompra"));		
		
		
		
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonEliminarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"EliminarDetallePlaneacionCompra"));
		
		
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonEliminarToolBarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetallePlaneacionCompra"));
								
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jMenuItemEliminarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetallePlaneacionCompra"));		
		
		
		
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonCancelarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"CancelarDetallePlaneacionCompra"));
		
		
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonCancelarToolBarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetallePlaneacionCompra"));
					
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jMenuItemCancelarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetallePlaneacionCompra"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jMenuItemDetalleCerrarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetallePlaneacionCompra"));		
		
		
		
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonGuardarCambiosToolBarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetallePlaneacionCompra"));
		
		
		
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonGuardarCambiosToolBarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetallePlaneacionCompra"));
		
		
		
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetallePlaneacionCompra"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonidDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"idDetallePlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_empresaDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_empresaDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetallePlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_sucursalDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_sucursalDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_ejercicioDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_ejercicioDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallePlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_periodoDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_periodoDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetallePlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_planeacion_compraDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_planeacion_compraDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_planeacion_compraDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_planeacion_compraDetallePlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_lineaDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_lineaDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_lineaDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaDetallePlaneacionCompraBusqueda"));
		//jButtonid_productoDetallePlaneacionCompra.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoDetallePlaneacionCompraActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_productoDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"id_productoDetallePlaneacionCompra"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_productoDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_productoDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_productoDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDetallePlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_unidadDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_unidadDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_unidadDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonstockDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"stockDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtondia_minimoDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"dia_minimoDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonstock_minimoDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"stock_minimoDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtondia_maximoDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"dia_maximoDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonstock_maximoDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"stock_maximoDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonsalidaDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"salidaDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonstock_mensualDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"stock_mensualDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtondescripcionDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetallePlaneacionCompraBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTabbedPaneRelacionesDetallePlaneacionCompra.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetallePlaneacionCompra"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetallePlaneacionCompra"));
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetallePlaneacionCompra"));
		}
		
		this.jTableDatosDetallePlaneacionCompra.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetallePlaneacionCompra"));
		
		this.jTableDatosDetallePlaneacionCompra.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetallePlaneacionCompra"));
		
		this.jButtonNuevoDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"NuevoDetallePlaneacionCompra"));
		
		this.jButtonDuplicarDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"DuplicarDetallePlaneacionCompra"));
		
		this.jButtonCopiarDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"CopiarDetallePlaneacionCompra"));
		
		this.jButtonVerFormDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"VerFormDetallePlaneacionCompra"));
		
		
		this.jButtonNuevoToolBarDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetallePlaneacionCompra"));
			
		this.jButtonDuplicarToolBarDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetallePlaneacionCompra"));
			
		this.jMenuItemNuevoDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetallePlaneacionCompra"));
			
		this.jMenuItemDuplicarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetallePlaneacionCompra"));		
		
		
		this.jButtonNuevoRelacionesDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetallePlaneacionCompra"));
		
		
		this.jButtonNuevoRelacionesToolBarDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetallePlaneacionCompra"));
			
		this.jMenuItemNuevoRelacionesDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetallePlaneacionCompra"));		
		
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonModificarDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"ModificarDetallePlaneacionCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonModificarToolBarDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetallePlaneacionCompra"));
			
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jMenuItemModificarDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetallePlaneacionCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonActualizarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"ActualizarDetallePlaneacionCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonActualizarToolBarDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetallePlaneacionCompra"));
				
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jMenuItemActualizarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetallePlaneacionCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonEliminarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"EliminarDetallePlaneacionCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonEliminarToolBarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetallePlaneacionCompra"));
						
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jMenuItemEliminarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetallePlaneacionCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonCancelarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"CancelarDetallePlaneacionCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonCancelarToolBarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetallePlaneacionCompra"));
			
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jMenuItemCancelarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetallePlaneacionCompra"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetallePlaneacionCompra"));		
		
		
		this.jButtonCerrarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"CerrarDetallePlaneacionCompra"));
		
		
		this.jButtonCerrarToolBarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetallePlaneacionCompra"));
			
		this.jMenuItemCerrarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetallePlaneacionCompra"));
			
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jMenuItemDetalleCerrarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetallePlaneacionCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonGuardarCambiosDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetallePlaneacionCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonGuardarCambiosToolBarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetallePlaneacionCompra"));
		}
		
		this.jButtonCopiarToolBarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetallePlaneacionCompra"));
			
		this.jButtonVerFormToolBarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetallePlaneacionCompra"));
		
		this.jMenuItemGuardarCambiosDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetallePlaneacionCompra"));
			
		this.jMenuItemCopiarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetallePlaneacionCompra"));		
		
		this.jMenuItemVerFormDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetallePlaneacionCompra"));		
		
		
		this.jButtonGuardarCambiosTablaDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetallePlaneacionCompra"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetallePlaneacionCompra"));
			
		this.jMenuItemGuardarCambiosTablaDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetallePlaneacionCompra"));		
		
		
		
		this.jButtonRecargarInformacionDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetallePlaneacionCompra"));
					
		this.jButtonRecargarInformacionToolBarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetallePlaneacionCompra"));
		
		this.jMenuItemRecargarInformacionDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetallePlaneacionCompra"));		
		
		
		
		this.jButtonAnterioresDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"AnterioresDetallePlaneacionCompra"));
		
		
		this.jButtonAnterioresToolBarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetallePlaneacionCompra"));
		
		this.jMenuItemAnterioresDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetallePlaneacionCompra"));		
		
		
		this.jButtonSiguientesDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"SiguientesDetallePlaneacionCompra"));
		
		
		this.jButtonSiguientesToolBarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetallePlaneacionCompra"));
			
		this.jMenuItemSiguientesDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetallePlaneacionCompra"));
			
		this.jMenuItemAbrirOrderByDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetallePlaneacionCompra"));
			
		this.jMenuItemMostrarOcultarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetallePlaneacionCompra"));
			
		this.jMenuItemDetalleAbrirOrderByDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetallePlaneacionCompra"));
			
		this.jMenuItemDetalleMostarOcultarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetallePlaneacionCompra"));		
		
		
		this.jButtonNuevoGuardarCambiosDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetallePlaneacionCompra"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetallePlaneacionCompra"));
			
		this.jMenuItemNuevoGuardarCambiosDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetallePlaneacionCompra"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetallePlaneacionCompra.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetallePlaneacionCompra"));

		this.jCheckBoxSeleccionadosDetallePlaneacionCompra.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetallePlaneacionCompra"));
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetallePlaneacionCompra"));
		}
		
		
		this.jComboBoxTiposRelacionesDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetallePlaneacionCompra"));
			
		this.jComboBoxTiposAccionesDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"TiposAccionesDetallePlaneacionCompra"));
					
		this.jComboBoxTiposSeleccionarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetallePlaneacionCompra"));
			
		this.jTextFieldValorCampoGeneralDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetallePlaneacionCompra"));		
		
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonidDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"idDetallePlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_empresaDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_empresaDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetallePlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_sucursalDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_sucursalDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_ejercicioDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_ejercicioDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallePlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_periodoDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_periodoDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetallePlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_planeacion_compraDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_planeacion_compraDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_planeacion_compraDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_planeacion_compraDetallePlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_lineaDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_lineaDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_lineaDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaDetallePlaneacionCompraBusqueda"));
		//jButtonid_productoDetallePlaneacionCompra.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoDetallePlaneacionCompraActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_productoDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"id_productoDetallePlaneacionCompra"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_productoDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_productoDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_productoDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDetallePlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_unidadDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_unidadDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_unidadDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonstockDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"stockDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtondia_minimoDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"dia_minimoDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonstock_minimoDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"stock_minimoDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtondia_maximoDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"dia_maximoDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonstock_maximoDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"stock_maximoDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonsalidaDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"salidaDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonstock_mensualDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"stock_mensualDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtondescripcionDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetallePlaneacionCompraBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdLineaDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"FK_IdLineaDetallePlaneacionCompra"));

			this.jButtonFK_IdPlaneacionCompraDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"FK_IdPlaneacionCompraDetallePlaneacionCompra"));

			this.jButtonFK_IdProductoDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"FK_IdProductoDetallePlaneacionCompra"));

			this.jButtonBuscarFK_IdProductoid_productoDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"id_productoDetallePlaneacionCompra"));

			this.jButtonFK_IdUnidadDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"FK_IdUnidadDetallePlaneacionCompra"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetallePlaneacionCompra!=null) {
				this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetallePlaneacionCompra"));
				this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetallePlaneacionCompra"));
				this.jInternalFrameReporteDinamicoDetallePlaneacionCompra.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetallePlaneacionCompra"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetallePlaneacionCompra"));				
			//this.jButtonGenerarReporteDinamicoDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetallePlaneacionCompra"));
			//this.jButtonGenerarExcelReporteDinamicoDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetallePlaneacionCompra"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetallePlaneacionCompra!=null) {
				this.jInternalFrameImportacionDetallePlaneacionCompra.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetallePlaneacionCompra"));
				this.jInternalFrameImportacionDetallePlaneacionCompra.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetallePlaneacionCompra"));
				this.jInternalFrameImportacionDetallePlaneacionCompra.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetallePlaneacionCompra"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetallePlaneacionCompra"));
			
			this.jButtonAbrirOrderByToolBarDetallePlaneacionCompra.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetallePlaneacionCompra"));			
			
			if(this.jInternalFrameOrderByDetallePlaneacionCompra!=null) {
				this.jInternalFrameOrderByDetallePlaneacionCompra.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetallePlaneacionCompra"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTabbedPaneRelacionesDetallePlaneacionCompra.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetallePlaneacionCompra"));
		
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
            		closingInternalFrameDetallePlaneacionCompra();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetallePlaneacionCompra = (JInternalFrameBase)event.getSource();
	            	
	            DetallePlaneacionCompraBeanSwingJInternalFrame jInternalFrameParent=(DetallePlaneacionCompraBeanSwingJInternalFrame)jInternalFrameDetalleFormDetallePlaneacionCompra.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetallePlaneacionCompraActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetallePlaneacionCompra.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetallePlaneacionCompraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetallePlaneacionCompra.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetallePlaneacionCompra.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePlaneacionCompraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePlaneacionCompraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePlaneacionCompraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetallePlaneacionCompra";
		inputMap = this.jButtonNuevoDetallePlaneacionCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetallePlaneacionCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetallePlaneacionCompraActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePlaneacionCompraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePlaneacionCompraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePlaneacionCompraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetallePlaneacionCompra";
		inputMap = this.jButtonNuevoRelacionesDetallePlaneacionCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetallePlaneacionCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetallePlaneacionCompraActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetallePlaneacionCompra";
		inputMap = this.jButtonModificarDetallePlaneacionCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetallePlaneacionCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetallePlaneacionCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetallePlaneacionCompra";
		inputMap = this.jButtonActualizarDetallePlaneacionCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetallePlaneacionCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetallePlaneacionCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetallePlaneacionCompra";
		inputMap = this.jButtonEliminarDetallePlaneacionCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetallePlaneacionCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetallePlaneacionCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetallePlaneacionCompra";
		inputMap = this.jButtonCancelarDetallePlaneacionCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetallePlaneacionCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetallePlaneacionCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetallePlaneacionCompra";
		inputMap = this.jButtonCerrarDetallePlaneacionCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetallePlaneacionCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetallePlaneacionCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonGuardarCambiosDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetallePlaneacionCompra";
		inputMap = this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonGuardarCambiosDetallePlaneacionCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonGuardarCambiosDetallePlaneacionCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetallePlaneacionCompra.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetallePlaneacionCompraItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetallePlaneacionCompra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetallePlaneacionCompraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetallePlaneacionCompra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetallePlaneacionCompraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetallePlaneacionCompra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetallePlaneacionCompraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonidDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"idDetallePlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_empresaDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_empresaDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetallePlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_sucursalDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_sucursalDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_ejercicioDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_ejercicioDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallePlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_periodoDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_periodoDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetallePlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_planeacion_compraDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_planeacion_compraDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_planeacion_compraDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_planeacion_compraDetallePlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_lineaDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_lineaDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_lineaDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaDetallePlaneacionCompraBusqueda"));
		//jButtonid_productoDetallePlaneacionCompra.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoDetallePlaneacionCompraActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_productoDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"id_productoDetallePlaneacionCompra"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_productoDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_productoDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_productoDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDetallePlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_unidadDetallePlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_unidadDetallePlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_unidadDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonstockDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"stockDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtondia_minimoDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"dia_minimoDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonstock_minimoDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"stock_minimoDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtondia_maximoDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"dia_maximoDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonstock_maximoDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"stock_maximoDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonsalidaDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"salidaDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonstock_mensualDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"stock_mensualDetallePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtondescripcionDetallePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetallePlaneacionCompraBusqueda"));
		
		
		this.jButtonFK_IdLineaDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"FK_IdLineaDetallePlaneacionCompra"));

		this.jButtonFK_IdPlaneacionCompraDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"FK_IdPlaneacionCompraDetallePlaneacionCompra"));

		this.jButtonFK_IdProductoDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"FK_IdProductoDetallePlaneacionCompra"));

		this.jButtonBuscarFK_IdProductoid_productoDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"id_productoDetallePlaneacionCompra"));

		this.jButtonFK_IdUnidadDetallePlaneacionCompra.addActionListener(new ButtonActionListener(this,"FK_IdUnidadDetallePlaneacionCompra"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetallePlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetallePlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetallePlaneacionCompraActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetallePlaneacionCompra.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetallePlaneacionCompra(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetallePlaneacionCompra detalleplaneacioncompraAux:this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras()) {
					detalleplaneacioncompraAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallePlaneacionCompra detalleplaneacioncompraAux:detalleplaneacioncompras) {
					detalleplaneacioncompraAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetallePlaneacionCompraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetallePlaneacionCompra detalleplaneacioncompraAux:this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras()) {
						detalleplaneacioncompraAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetallePlaneacionCompra detalleplaneacioncompraAux:detalleplaneacioncompras) {
						detalleplaneacioncompraAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetallePlaneacionCompra detalleplaneacioncompraAux:this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetallePlaneacionCompra detalleplaneacioncompraAux:detalleplaneacioncompras) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetallePlaneacionCompra(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetallePlaneacionCompra.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetallePlaneacionCompra.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetallePlaneacionCompraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetallePlaneacionCompra.getSelectedRows();
			
			DetallePlaneacionCompra detalleplaneacioncompraLocal=new DetallePlaneacionCompra();
			
			//this.seleccionarTodosDetallePlaneacionCompra(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleplaneacioncompraLocal =(DetallePlaneacionCompra) this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detalleplaneacioncompraLocal =(DetallePlaneacionCompra) this.detalleplaneacioncompras.toArray()[this.jTableDatosDetallePlaneacionCompra.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detalleplaneacioncompraLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetallePlaneacionCompra detalleplaneacioncompraAux:this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras()) {
						detalleplaneacioncompraAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetallePlaneacionCompra detalleplaneacioncompraAux:detalleplaneacioncompras) {
						detalleplaneacioncompraAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetallePlaneacionCompra(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetallePlaneacionCompra.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetallePlaneacionCompra.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetallePlaneacionCompra,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetallePlaneacionCompraItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetallePlaneacionCompraParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetallePlaneacionCompraActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetallePlaneacionCompra.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetallePlaneacionCompra detalleplaneacioncompraAux:this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras()) {
				
						if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCK)) {
							existe=true;
							detalleplaneacioncompraAux.setstock(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMINIMO)) {
							existe=true;
							detalleplaneacioncompraAux.setdia_minimo(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMINIMO)) {
							existe=true;
							detalleplaneacioncompraAux.setstock_minimo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMAXIMO)) {
							existe=true;
							detalleplaneacioncompraAux.setdia_maximo(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMAXIMO)) {
							existe=true;
							detalleplaneacioncompraAux.setstock_maximo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_SALIDA)) {
							existe=true;
							detalleplaneacioncompraAux.setsalida(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMENSUAL)) {
							existe=true;
							detalleplaneacioncompraAux.setstock_mensual(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detalleplaneacioncompraAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallePlaneacionCompra detalleplaneacioncompraAux:detalleplaneacioncompras) {
					
						if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCK)) {
							existe=true;
							detalleplaneacioncompraAux.setstock(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMINIMO)) {
							existe=true;
							detalleplaneacioncompraAux.setdia_minimo(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMINIMO)) {
							existe=true;
							detalleplaneacioncompraAux.setstock_minimo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMAXIMO)) {
							existe=true;
							detalleplaneacioncompraAux.setdia_maximo(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMAXIMO)) {
							existe=true;
							detalleplaneacioncompraAux.setstock_maximo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_SALIDA)) {
							existe=true;
							detalleplaneacioncompraAux.setsalida(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMENSUAL)) {
							existe=true;
							detalleplaneacioncompraAux.setstock_mensual(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detalleplaneacioncompraAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetallePlaneacionCompra(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetallePlaneacionCompraActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetallePlaneacionCompra=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetallePlaneacionCompra.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetallePlaneacionCompra) {				
					conSplash=true;//false;										
					
					//this.startProcessDetallePlaneacionCompra(conSplash);
				
					this.generarReporteDetallePlaneacionComprasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallePlaneacionCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetallePlaneacionComprasSeleccionados();
				//this.jComboBoxTiposAccionesDetallePlaneacionCompra.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetallePlaneacionComprasSeleccionados(false);
				//this.jComboBoxTiposAccionesDetallePlaneacionCompra.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetallePlaneacionComprasSeleccionados(true);
				//this.jComboBoxTiposAccionesDetallePlaneacionCompra.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetallePlaneacionCompra();
				
				this.exportarDetallePlaneacionComprasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallePlaneacionCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetallePlaneacionCompras();
				//this.importarDetallePlaneacionCompras();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallePlaneacionCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetallePlaneacionCompra();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetallePlaneacionComprasSeleccionados();
				//this.jComboBoxTiposAccionesDetallePlaneacionCompra.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Planeacion Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetallePlaneacionCompra();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetallePlaneacionCompra)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetallePlaneacionCompra(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Planeacion Compra",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallePlaneacionCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra.setSelectedIndex(0);					
				}	
			} 			
			else if(DetallePlaneacionCompraBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetallePlaneacionCompra) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetallePlaneacionCompra(conSplash);
					
						//this.actualizarParametrosGeneralDetallePlaneacionCompra();
						
						this.generarReporteProcesoAccionDetallePlaneacionComprasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetallePlaneacionCompra.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle Planeacion CompraS SELECCIONADOS?", "MANTENIMIENTO DE Detalle Planeacion Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetallePlaneacionCompra();
				
						this.actualizarParametrosGeneralDetallePlaneacionCompra();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detalleplaneacioncompraReturnGeneral=detalleplaneacioncompraLogic.procesarAccionDetallePlaneacionComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras(),this.detalleplaneacioncompraParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetallePlaneacionCompraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetallePlaneacionCompra.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetallePlaneacionCompra();
					
					DetallePlaneacionCompraBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetallePlaneacionCompraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetallePlaneacionCompra.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxTiposAccionesFormularioDetallePlaneacionCompra.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetallePlaneacionCompra(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetallePlaneacionCompraActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetallePlaneacionCompra();
			
			if(this.jInternalFrameDetalleFormDetallePlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetallePlaneacionCompra> detalleplaneacioncomprasSeleccionados=new ArrayList<DetallePlaneacionCompra>();		
			DetallePlaneacionCompra detalleplaneacioncompra=new DetallePlaneacionCompra();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetallePlaneacionCompra(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetallePlaneacionCompra.getSelectedItem();
			
			
			
			
			detalleplaneacioncomprasSeleccionados=this.getDetallePlaneacionComprasSeleccionados(true);
			//this.sTipoAccion;
			
			if(detalleplaneacioncomprasSeleccionados.size()==1) {
				for(DetallePlaneacionCompra detalleplaneacioncompraAux:detalleplaneacioncomprasSeleccionados) {
					detalleplaneacioncompra=detalleplaneacioncompraAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetallePlaneacionCompra();
			
      		//this.finishProcessDetallePlaneacionCompra(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetallePlaneacionCompraReturnGeneral() throws Exception {
		if(this.detalleplaneacioncompraReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detalleplaneacioncompraReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detalleplaneacioncompraReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detalleplaneacioncompraReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detalleplaneacioncompraReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detalleplaneacioncompraReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetallePlaneacionCompra(false);
		}
		
		if(this.detalleplaneacioncompraReturnGeneral.getConRetornoLista() || this.detalleplaneacioncompraReturnGeneral.getConRetornoObjeto()) {
			if(this.detalleplaneacioncompraReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleplaneacioncompraLogic.setDetallePlaneacionCompras(this.detalleplaneacioncompraReturnGeneral.getDetallePlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detalleplaneacioncompraReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleplaneacioncompraLogic.setDetallePlaneacionCompra(this.detalleplaneacioncompraReturnGeneral.getDetallePlaneacionCompra());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetallePlaneacionCompra(false);
		}
	}
	
	public void actualizarParametrosGeneralDetallePlaneacionCompra() throws Exception {
		
		
	}
	
	public ArrayList<DetallePlaneacionCompra> getDetallePlaneacionComprasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetallePlaneacionCompra> detalleplaneacioncomprasSeleccionados=new ArrayList<DetallePlaneacionCompra>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetallePlaneacionCompra) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetallePlaneacionCompra detalleplaneacioncompraAux:detalleplaneacioncompraLogic.getDetallePlaneacionCompras()) {
					if(detalleplaneacioncompraAux.getIsSelected()) {
						detalleplaneacioncomprasSeleccionados.add(detalleplaneacioncompraAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallePlaneacionCompra detalleplaneacioncompraAux:this.detalleplaneacioncompras) {
					if(detalleplaneacioncompraAux.getIsSelected()) {
						detalleplaneacioncomprasSeleccionados.add(detalleplaneacioncompraAux);				
					}
				}
			}
			
			if(detalleplaneacioncomprasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detalleplaneacioncomprasSeleccionados.addAll(this.detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detalleplaneacioncomprasSeleccionados.addAll(this.detalleplaneacioncompras);				
					}
				}
			}
		} else {
			detalleplaneacioncomprasSeleccionados.add(this.detalleplaneacioncompra);
		}
		
		return detalleplaneacioncomprasSeleccionados;
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
	
	public void generarReporteDetallePlaneacionComprasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetallePlaneacionComprasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetallePlaneacionComprasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetallePlaneacionComprasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetallePlaneacionComprasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Planeacion Compra",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetallePlaneacionComprasSeleccionados() throws Exception {
		ArrayList<DetallePlaneacionCompra> detalleplaneacioncomprasSeleccionados=new ArrayList<DetallePlaneacionCompra>();		
		
		detalleplaneacioncomprasSeleccionados=this.getDetallePlaneacionComprasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetallePlaneacionCompras("Todos",detalleplaneacioncomprasSeleccionados);
		
	}	
	
	public void generarReporteNormalDetallePlaneacionComprasSeleccionados() throws Exception {
		ArrayList<DetallePlaneacionCompra> detalleplaneacioncomprasSeleccionados=new ArrayList<DetallePlaneacionCompra>();		
		
		detalleplaneacioncomprasSeleccionados=this.getDetallePlaneacionComprasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetallePlaneacionCompras("Todos",detalleplaneacioncomprasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetallePlaneacionComprasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetallePlaneacionCompra> detalleplaneacioncomprasSeleccionados=new ArrayList<DetallePlaneacionCompra>();
		
		detalleplaneacioncomprasSeleccionados=this.getDetallePlaneacionComprasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetallePlaneacionCompras("Todos",detalleplaneacioncomprasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetallePlaneacionComprasSeleccionados() throws Exception {
		ArrayList<DetallePlaneacionCompra> detalleplaneacioncomprasSeleccionados=new ArrayList<DetallePlaneacionCompra>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetallePlaneacionCompra();
		
		
		detalleplaneacioncomprasSeleccionados=this.getDetallePlaneacionComprasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetallePlaneacionCompra();
		
		
		//this.generarReporteDetallePlaneacionCompras("Todos",detalleplaneacioncomprasSeleccionados ,detalleplaneacioncompraImplementable,detalleplaneacioncompraImplementableHome);
	}
	
	public void mostrarImportacionDetallePlaneacionCompras() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetallePlaneacionCompra();
		
		this.abrirFrameImportacionDetallePlaneacionCompra();		
		
			
		//this.generarReporteDetallePlaneacionCompras("Todos",detalleplaneacioncomprasSeleccionados ,detalleplaneacioncompraImplementable,detalleplaneacioncompraImplementableHome);
	}
	
	public void importarDetallePlaneacionCompras() throws Exception {		
	
	}
	
	public void exportarDetallePlaneacionComprasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetallePlaneacionComprasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetallePlaneacionComprasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetallePlaneacionComprasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Planeacion Compra",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetallePlaneacionComprasSeleccionados() throws Exception {
		ArrayList<DetallePlaneacionCompra> detalleplaneacioncomprasSeleccionados=new ArrayList<DetallePlaneacionCompra>();		
		
		detalleplaneacioncomprasSeleccionados=this.getDetallePlaneacionComprasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleplaneacioncompra."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetallePlaneacionCompra(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetallePlaneacionCompra detalleplaneacioncompraAux:detalleplaneacioncomprasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetallePlaneacionCompra(detalleplaneacioncompraAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detalleplaneacioncompraAux.setsDetalleGeneralEntityReporte(detalleplaneacioncompraAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Planeacion Compra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetallePlaneacionCompra(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetallePlaneacionCompraConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePlaneacionCompraConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePlaneacionCompraConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePlaneacionCompraConstantesFunciones.LABEL_IDPLANEACIONCOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePlaneacionCompraConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePlaneacionCompraConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePlaneacionCompraConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePlaneacionCompraConstantesFunciones.LABEL_STOCK;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMINIMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMINIMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMAXIMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMAXIMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePlaneacionCompraConstantesFunciones.LABEL_SALIDA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMENSUAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetallePlaneacionCompra(DetallePlaneacionCompra detalleplaneacioncompra,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detalleplaneacioncompra.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleplaneacioncompra.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleplaneacioncompra.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleplaneacioncompra.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleplaneacioncompra.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleplaneacioncompra.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleplaneacioncompra.getplaneacioncompra_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleplaneacioncompra.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleplaneacioncompra.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleplaneacioncompra.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleplaneacioncompra.getstock().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleplaneacioncompra.getdia_minimo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleplaneacioncompra.getstock_minimo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleplaneacioncompra.getdia_maximo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleplaneacioncompra.getstock_maximo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleplaneacioncompra.getsalida().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleplaneacioncompra.getstock_mensual().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleplaneacioncompra.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetallePlaneacionComprasSeleccionados() throws Exception {
		ArrayList<DetallePlaneacionCompra> detalleplaneacioncomprasSeleccionados=new ArrayList<DetallePlaneacionCompra>();		
		
		detalleplaneacioncomprasSeleccionados=this.getDetallePlaneacionComprasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleplaneacioncompra.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetallePlaneacionCompras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetallePlaneacionCompra(row);				
				iRow++;
			}				
			
			for(DetallePlaneacionCompra detalleplaneacioncompraAux:detalleplaneacioncomprasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetallePlaneacionCompra(detalleplaneacioncompraAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Planeacion Compra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetallePlaneacionComprasSeleccionados() throws Exception {
		ArrayList<DetallePlaneacionCompra> detalleplaneacioncomprasSeleccionados=new ArrayList<DetallePlaneacionCompra>();		
		
		detalleplaneacioncomprasSeleccionados=this.getDetallePlaneacionComprasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleplaneacioncompra.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detalleplaneacioncompras");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detalleplaneacioncompra");
			//elementRoot.appendChild(element);
		
			for(DetallePlaneacionCompra detalleplaneacioncompraAux:detalleplaneacioncomprasSeleccionados) {
				element = document.createElement("detalleplaneacioncompra");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetallePlaneacionCompra(detalleplaneacioncompraAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Planeacion Compra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetallePlaneacionCompra(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDPLANEACIONCOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCK);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMINIMO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMINIMO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMAXIMO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMAXIMO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_SALIDA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_STOCKMENSUAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetallePlaneacionCompra(DetallePlaneacionCompra detalleplaneacioncompra,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detalleplaneacioncompra.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleplaneacioncompra.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleplaneacioncompra.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleplaneacioncompra.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleplaneacioncompra.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleplaneacioncompra.getplaneacioncompra_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleplaneacioncompra.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleplaneacioncompra.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleplaneacioncompra.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleplaneacioncompra.getstock());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleplaneacioncompra.getdia_minimo());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleplaneacioncompra.getstock_minimo());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleplaneacioncompra.getdia_maximo());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleplaneacioncompra.getstock_maximo());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleplaneacioncompra.getsalida());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleplaneacioncompra.getstock_mensual());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleplaneacioncompra.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlDetallePlaneacionCompra(DetallePlaneacionCompra detalleplaneacioncompra,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetallePlaneacionCompraConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detalleplaneacioncompra.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetallePlaneacionCompraConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detalleplaneacioncompra.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DetallePlaneacionCompraConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detalleplaneacioncompra.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DetallePlaneacionCompraConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(detalleplaneacioncompra.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(DetallePlaneacionCompraConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(detalleplaneacioncompra.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(DetallePlaneacionCompraConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(detalleplaneacioncompra.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementplaneacioncompra_descripcion = document.createElement(DetallePlaneacionCompraConstantesFunciones.IDPLANEACIONCOMPRA);
		elementplaneacioncompra_descripcion.appendChild(document.createTextNode(detalleplaneacioncompra.getplaneacioncompra_descripcion()));
		element.appendChild(elementplaneacioncompra_descripcion);

		Element elementlinea_descripcion = document.createElement(DetallePlaneacionCompraConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(detalleplaneacioncompra.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementproducto_descripcion = document.createElement(DetallePlaneacionCompraConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(detalleplaneacioncompra.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementunidad_descripcion = document.createElement(DetallePlaneacionCompraConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(detalleplaneacioncompra.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementstock = document.createElement(DetallePlaneacionCompraConstantesFunciones.STOCK);
		elementstock.appendChild(document.createTextNode(detalleplaneacioncompra.getstock().toString().trim()));
		element.appendChild(elementstock);

		Element elementdia_minimo = document.createElement(DetallePlaneacionCompraConstantesFunciones.DIAMINIMO);
		elementdia_minimo.appendChild(document.createTextNode(detalleplaneacioncompra.getdia_minimo().toString().trim()));
		element.appendChild(elementdia_minimo);

		Element elementstock_minimo = document.createElement(DetallePlaneacionCompraConstantesFunciones.STOCKMINIMO);
		elementstock_minimo.appendChild(document.createTextNode(detalleplaneacioncompra.getstock_minimo().toString().trim()));
		element.appendChild(elementstock_minimo);

		Element elementdia_maximo = document.createElement(DetallePlaneacionCompraConstantesFunciones.DIAMAXIMO);
		elementdia_maximo.appendChild(document.createTextNode(detalleplaneacioncompra.getdia_maximo().toString().trim()));
		element.appendChild(elementdia_maximo);

		Element elementstock_maximo = document.createElement(DetallePlaneacionCompraConstantesFunciones.STOCKMAXIMO);
		elementstock_maximo.appendChild(document.createTextNode(detalleplaneacioncompra.getstock_maximo().toString().trim()));
		element.appendChild(elementstock_maximo);

		Element elementsalida = document.createElement(DetallePlaneacionCompraConstantesFunciones.SALIDA);
		elementsalida.appendChild(document.createTextNode(detalleplaneacioncompra.getsalida().toString().trim()));
		element.appendChild(elementsalida);

		Element elementstock_mensual = document.createElement(DetallePlaneacionCompraConstantesFunciones.STOCKMENSUAL);
		elementstock_mensual.appendChild(document.createTextNode(detalleplaneacioncompra.getstock_mensual().toString().trim()));
		element.appendChild(elementstock_mensual);

		Element elementdescripcion = document.createElement(DetallePlaneacionCompraConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(detalleplaneacioncompra.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoDetallePlaneacionComprasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetallePlaneacionCompra> detalleplaneacioncomprasSeleccionados=new ArrayList<DetallePlaneacionCompra>();
		
		detalleplaneacioncomprasSeleccionados=this.getDetallePlaneacionComprasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetallePlaneacionCompra(detalleplaneacioncomprasSeleccionados);
		
		this.generarReporteDetallePlaneacionCompras("Todos",detalleplaneacioncomprasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetallePlaneacionCompra(ArrayList<DetallePlaneacionCompra> detalleplaneacioncomprasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetallePlaneacionCompra detalleplaneacioncompraAux:detalleplaneacioncomprasSeleccionados) {
				detalleplaneacioncompraAux.setsDetalleGeneralEntityReporte(detalleplaneacioncompraAux.toString());
			
				if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detalleplaneacioncompraAux.setsDescripcionGeneralEntityReporte1(detalleplaneacioncompraAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					detalleplaneacioncompraAux.setsDescripcionGeneralEntityReporte1(detalleplaneacioncompraAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					detalleplaneacioncompraAux.setsDescripcionGeneralEntityReporte1(detalleplaneacioncompraAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					detalleplaneacioncompraAux.setsDescripcionGeneralEntityReporte1(detalleplaneacioncompraAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_IDPLANEACIONCOMPRA)) {
					existe=true;
					detalleplaneacioncompraAux.setsDescripcionGeneralEntityReporte1(detalleplaneacioncompraAux.getplaneacioncompra_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					detalleplaneacioncompraAux.setsDescripcionGeneralEntityReporte1(detalleplaneacioncompraAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					detalleplaneacioncompraAux.setsDescripcionGeneralEntityReporte1(detalleplaneacioncompraAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					detalleplaneacioncompraAux.setsDescripcionGeneralEntityReporte1(detalleplaneacioncompraAux.getunidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMINIMO)) {
					existe=true;
					detalleplaneacioncompraAux.setsDescripcionGeneralEntityReporte1(detalleplaneacioncompraAux.getdia_minimo().toString());
				}
				 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_DIAMAXIMO)) {
					existe=true;
					detalleplaneacioncompraAux.setsDescripcionGeneralEntityReporte1(detalleplaneacioncompraAux.getdia_maximo().toString());
				}
				 else if(sTipoSeleccionar.equals(DetallePlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					detalleplaneacioncompraAux.setsDescripcionGeneralEntityReporte1(detalleplaneacioncompraAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetallePlaneacionCompra(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetallePlaneacionCompra=true;
				this.isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra=true;
				this.isVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra=true;
			}
			
			this.isVisibilidadCeldaModificarDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaActualizarDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaEliminarDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaCancelarDetallePlaneacionCompra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePlaneacionCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallePlaneacionCompra=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaModificarDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaActualizarDetallePlaneacionCompra=true;
			this.isVisibilidadCeldaEliminarDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaCancelarDetallePlaneacionCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePlaneacionCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallePlaneacionCompra=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaModificarDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaActualizarDetallePlaneacionCompra=true;
			this.isVisibilidadCeldaEliminarDetallePlaneacionCompra=true;
			this.isVisibilidadCeldaCancelarDetallePlaneacionCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePlaneacionCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallePlaneacionCompra=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaModificarDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaActualizarDetallePlaneacionCompra=true;
			this.isVisibilidadCeldaEliminarDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaCancelarDetallePlaneacionCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePlaneacionCompra=false;
				} else {
					this.isVisibilidadCeldaGuardarDetallePlaneacionCompra=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetallePlaneacionCompra=true;
			this.isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra=true;
			this.isVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra=true;
			this.isVisibilidadCeldaModificarDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaActualizarDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaEliminarDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaCancelarDetallePlaneacionCompra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePlaneacionCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallePlaneacionCompra=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaActualizarDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaEliminarDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaCancelarDetallePlaneacionCompra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePlaneacionCompra=false;
				} else {
					this.isVisibilidadCeldaGuardarDetallePlaneacionCompra=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaModificarDetallePlaneacionCompra=true;
			this.isVisibilidadCeldaActualizarDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaEliminarDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaCancelarDetallePlaneacionCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePlaneacionCompra=false;
				} else {
					this.isVisibilidadCeldaGuardarDetallePlaneacionCompra=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetallePlaneacionCompraJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetallePlaneacionCompra=true;
			this.isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra=true;
			this.isVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra=true;
		} else {
			this.actualizarEstadoPanelsDetallePlaneacionCompra(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetallePlaneacionCompra=false;
			//this.isVisibilidadCeldaVerFormDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaDuplicarDetallePlaneacionCompra=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detalleplaneacioncompraSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra=false;
		} else {
			this.isVisibilidadCeldaNuevoDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePlaneacionCompra=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
			if(!detalleplaneacioncompraSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra=false;												
			}
			
			this.jButtonCerrarDetallePlaneacionCompra.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetallePlaneacionCompra=false;
		}
		
		if(!this.permiteMantenimiento(this.detalleplaneacioncompra)) {
			this.isVisibilidadCeldaActualizarDetallePlaneacionCompra=false;
			this.isVisibilidadCeldaEliminarDetallePlaneacionCompra=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetallePlaneacionCompra() {
	}
	
	public void actualizarEstadoPanelsDetallePlaneacionCompra(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetallePlaneacionCompra!=null) {
				this.jScrollPanelDatosEdicionDetallePlaneacionCompra.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePlaneacionCompra!=null) {
				this.jTabbedPaneBusquedasDetallePlaneacionCompra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallePlaneacionCompra!=null) {
				this.jScrollPanelDatosDetallePlaneacionCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallePlaneacionCompra!=null) {
				this.jPanelPaginacionDetallePlaneacionCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallePlaneacionCompra!=null) {
				this.jPanelParametrosReportesDetallePlaneacionCompra.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetallePlaneacionCompra!=null) {
				this.jScrollPanelDatosEdicionDetallePlaneacionCompra.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePlaneacionCompra!=null) {
				this.jTabbedPaneBusquedasDetallePlaneacionCompra.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetallePlaneacionCompra!=null) {
				this.jScrollPanelDatosDetallePlaneacionCompra.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetallePlaneacionCompra!=null) {
				this.jPanelPaginacionDetallePlaneacionCompra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetallePlaneacionCompra!=null) {
				this.jPanelParametrosReportesDetallePlaneacionCompra.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetallePlaneacionCompra!=null) {
				this.jScrollPanelDatosEdicionDetallePlaneacionCompra.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePlaneacionCompra!=null) {
				this.jTabbedPaneBusquedasDetallePlaneacionCompra.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetallePlaneacionCompra!=null) {
				this.jScrollPanelDatosDetallePlaneacionCompra.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetallePlaneacionCompra!=null) {
				this.jPanelPaginacionDetallePlaneacionCompra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetallePlaneacionCompra!=null) {
				this.jPanelParametrosReportesDetallePlaneacionCompra.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetallePlaneacionCompra!=null) {
				this.jScrollPanelDatosEdicionDetallePlaneacionCompra.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePlaneacionCompra!=null) {
				this.jTabbedPaneBusquedasDetallePlaneacionCompra.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetallePlaneacionCompra!=null) {
				this.jScrollPanelDatosDetallePlaneacionCompra.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetallePlaneacionCompra!=null) {
				this.jPanelPaginacionDetallePlaneacionCompra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetallePlaneacionCompra!=null) {
				this.jPanelParametrosReportesDetallePlaneacionCompra.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetallePlaneacionCompra!=null) {
				this.jScrollPanelDatosEdicionDetallePlaneacionCompra.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePlaneacionCompra!=null) {
				this.jTabbedPaneBusquedasDetallePlaneacionCompra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallePlaneacionCompra!=null) {
				this.jScrollPanelDatosDetallePlaneacionCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallePlaneacionCompra!=null) {
				this.jPanelPaginacionDetallePlaneacionCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallePlaneacionCompra!=null) {
				this.jPanelParametrosReportesDetallePlaneacionCompra.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetallePlaneacionCompra!=null) {
				this.jScrollPanelDatosEdicionDetallePlaneacionCompra.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePlaneacionCompra!=null) {
				this.jTabbedPaneBusquedasDetallePlaneacionCompra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallePlaneacionCompra!=null) {
				this.jScrollPanelDatosDetallePlaneacionCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallePlaneacionCompra!=null) {
				this.jPanelPaginacionDetallePlaneacionCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallePlaneacionCompra!=null) {
				this.jPanelParametrosReportesDetallePlaneacionCompra.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetallePlaneacionCompra!=null) {
				this.jScrollPanelDatosEdicionDetallePlaneacionCompra.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePlaneacionCompra!=null) {
				this.jTabbedPaneBusquedasDetallePlaneacionCompra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallePlaneacionCompra!=null) {
				this.jScrollPanelDatosDetallePlaneacionCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallePlaneacionCompra!=null) {
				this.jPanelPaginacionDetallePlaneacionCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallePlaneacionCompra!=null) {
				this.jPanelParametrosReportesDetallePlaneacionCompra.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetallePlaneacionCompra!=null) {
					this.jTabbedPaneBusquedasDetallePlaneacionCompra.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetallePlaneacionCompra!=null) {
				this.jPanelParametrosReportesDetallePlaneacionCompra.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePlaneacionCompra!=null) {
				this.jTabbedPaneBusquedasDetallePlaneacionCompra.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetallePlaneacionCompra!=null) {
				this.jPanelParametrosReportesDetallePlaneacionCompra.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdLinea=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdLineaDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdPlaneacionCompra=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPlaneacionCompra) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdPlaneacionCompraDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdProductoDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdUnidad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdUnidadDetallePlaneacionCompra);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdLinea=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdLineaDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdPlaneacionCompra=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdPlaneacionCompra) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdPlaneacionCompraDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdProductoDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdUnidad=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdUnidadDetallePlaneacionCompra);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdLinea=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdLineaDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdPlaneacionCompra=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdPlaneacionCompra) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdPlaneacionCompraDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdProducto=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdProductoDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdUnidad=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdUnidadDetallePlaneacionCompra);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdLinea=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdLineaDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdPlaneacionCompra=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdPlaneacionCompra) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdPlaneacionCompraDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdProducto=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdProductoDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdUnidad=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdUnidadDetallePlaneacionCompra);}
		}
		
	}

	public void setVisibilidadBusquedasParaPlaneacionCompra(Boolean isParaPlaneacionCompra){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPlaneacionCompraNegation=!isParaPlaneacionCompra;

			this.isVisibilidadFK_IdLinea=isParaPlaneacionCompraNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdLineaDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdPlaneacionCompra=isParaPlaneacionCompra;
			if(!this.isVisibilidadFK_IdPlaneacionCompra) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdPlaneacionCompraDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdProducto=isParaPlaneacionCompraNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdProductoDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdUnidad=isParaPlaneacionCompraNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdUnidadDetallePlaneacionCompra);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadFK_IdLinea=isParaLinea;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdLineaDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdPlaneacionCompra=isParaLineaNegation;
			if(!this.isVisibilidadFK_IdPlaneacionCompra) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdPlaneacionCompraDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdProducto=isParaLineaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdProductoDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdUnidad=isParaLineaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdUnidadDetallePlaneacionCompra);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdLinea=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdLineaDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdPlaneacionCompra=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdPlaneacionCompra) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdPlaneacionCompraDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdProductoDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdUnidad=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdUnidadDetallePlaneacionCompra);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdLinea=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdLineaDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdPlaneacionCompra=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdPlaneacionCompra) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdPlaneacionCompraDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdProducto=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdProductoDetallePlaneacionCompra);}

			this.isVisibilidadFK_IdUnidad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(jPanelFK_IdUnidadDetallePlaneacionCompra);}
		}
		
	}
	
	
	
	

	public String registrarSesionDetallePlaneacionCompraParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(detalleplaneacioncompraSessionBean==null) {
				detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(detalleplaneacioncompraSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.detalleplaneacioncompraFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(DetallePlaneacionCompraConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionDetallePlaneacionCompra(true);
			//productoSessionBean.setlidDetallePlaneacionCompraActual(this.idDetallePlaneacionCompraActual);

			detalleplaneacioncompraSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetallePlaneacionCompra(true);
			detalleplaneacioncompraSessionBean.setlIdDetallePlaneacionCompraActualForeignKey(this.idDetallePlaneacionCompraActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetallePlaneacionCompraSessionBean detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
		
		if(this.detalleplaneacioncompraSessionBean==null) {
			this.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
		}
		
		this.detalleplaneacioncompraSessionBean.setsUltimaBusquedaDetallePlaneacionCompra(this.getsAccionBusqueda());
		this.detalleplaneacioncompraSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detalleplaneacioncompraSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			detalleplaneacioncompraSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detalleplaneacioncompraSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdLinea")) {
			detalleplaneacioncompraSessionBean.setid_linea(this.getid_lineaFK_IdLinea());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			detalleplaneacioncompraSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPlaneacionCompra")) {
			detalleplaneacioncompraSessionBean.setid_planeacion_compra(this.getid_planeacion_compraFK_IdPlaneacionCompra());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			detalleplaneacioncompraSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			detalleplaneacioncompraSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
			detalleplaneacioncompraSessionBean.setid_unidad(this.getid_unidadFK_IdUnidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetallePlaneacionCompraSessionBean detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
		
		if(this.detalleplaneacioncompraSessionBean==null) {
			this.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
		}
		
		if(this.detalleplaneacioncompraSessionBean.getsUltimaBusquedaDetallePlaneacionCompra()!=null&&!this.detalleplaneacioncompraSessionBean.getsUltimaBusquedaDetallePlaneacionCompra().equals("")) {
			this.setsAccionBusqueda(detalleplaneacioncompraSessionBean.getsUltimaBusquedaDetallePlaneacionCompra());
			this.setiNumeroPaginacion(detalleplaneacioncompraSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detalleplaneacioncompraSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(detalleplaneacioncompraSessionBean.getid_ejercicio());
				detalleplaneacioncompraSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detalleplaneacioncompraSessionBean.getid_empresa());
				detalleplaneacioncompraSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdLinea")) {
				this.setid_lineaFK_IdLinea(detalleplaneacioncompraSessionBean.getid_linea());
				detalleplaneacioncompraSessionBean.setid_linea(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(detalleplaneacioncompraSessionBean.getid_periodo());
				detalleplaneacioncompraSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPlaneacionCompra")) {
				this.setid_planeacion_compraFK_IdPlaneacionCompra(detalleplaneacioncompraSessionBean.getid_planeacion_compra());
				detalleplaneacioncompraSessionBean.setid_planeacion_compra(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(detalleplaneacioncompraSessionBean.getid_producto());
				detalleplaneacioncompraSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(detalleplaneacioncompraSessionBean.getid_sucursal());
				detalleplaneacioncompraSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
				this.setid_unidadFK_IdUnidad(detalleplaneacioncompraSessionBean.getid_unidad());
				detalleplaneacioncompraSessionBean.setid_unidad(-1L);
			}
		}
		
		this.detalleplaneacioncompraSessionBean.setsUltimaBusquedaDetallePlaneacionCompra("");
		this.detalleplaneacioncompraSessionBean.setiNumeroPaginacion(DetallePlaneacionCompraConstantesFunciones.INUMEROPAGINACION);
		this.detalleplaneacioncompraSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetallePlaneacionCompra(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetallePlaneacionCompra() {
		this.updateBorderResaltarBusquedasFormularioDetallePlaneacionCompra();
		this.updateVisibilidadBusquedasFormularioDetallePlaneacionCompra();
		this.updateHabilitarBusquedasFormularioDetallePlaneacionCompra();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetallePlaneacionCompra() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetallePlaneacionCompra.getComponents().length>0) {
	

		if(this.detalleplaneacioncompraConstantesFunciones.resaltarFK_IdLineaDetallePlaneacionCompra!=null) {
			index= this.jTabbedPaneBusquedasDetallePlaneacionCompra.indexOfComponent(this.jPanelFK_IdLineaDetallePlaneacionCompra);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePlaneacionCompra.getComponent(index);
				jPanel.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltarFK_IdLineaDetallePlaneacionCompra);
			}
		}

		if(this.detalleplaneacioncompraConstantesFunciones.resaltarFK_IdPlaneacionCompraDetallePlaneacionCompra!=null) {
			index= this.jTabbedPaneBusquedasDetallePlaneacionCompra.indexOfComponent(this.jPanelFK_IdPlaneacionCompraDetallePlaneacionCompra);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePlaneacionCompra.getComponent(index);
				jPanel.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltarFK_IdPlaneacionCompraDetallePlaneacionCompra);
			}
		}

		if(this.detalleplaneacioncompraConstantesFunciones.resaltarFK_IdProductoDetallePlaneacionCompra!=null) {
			index= this.jTabbedPaneBusquedasDetallePlaneacionCompra.indexOfComponent(this.jPanelFK_IdProductoDetallePlaneacionCompra);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePlaneacionCompra.getComponent(index);
				jPanel.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltarFK_IdProductoDetallePlaneacionCompra);
			}
		}

		if(this.detalleplaneacioncompraConstantesFunciones.resaltarFK_IdUnidadDetallePlaneacionCompra!=null) {
			index= this.jTabbedPaneBusquedasDetallePlaneacionCompra.indexOfComponent(this.jPanelFK_IdUnidadDetallePlaneacionCompra);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePlaneacionCompra.getComponent(index);
				jPanel.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltarFK_IdUnidadDetallePlaneacionCompra);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetallePlaneacionCompra() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetallePlaneacionCompra.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetallePlaneacionCompra.indexOfComponent(this.jPanelFK_IdLineaDetallePlaneacionCompra);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePlaneacionCompra.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarFK_IdLineaDetallePlaneacionCompra);
			if(!this.detalleplaneacioncompraConstantesFunciones.mostrarFK_IdLineaDetallePlaneacionCompra && index>-1) {
				this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetallePlaneacionCompra.indexOfComponent(this.jPanelFK_IdPlaneacionCompraDetallePlaneacionCompra);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePlaneacionCompra.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarFK_IdPlaneacionCompraDetallePlaneacionCompra);
			if(!this.detalleplaneacioncompraConstantesFunciones.mostrarFK_IdPlaneacionCompraDetallePlaneacionCompra && index>-1) {
				this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetallePlaneacionCompra.indexOfComponent(this.jPanelFK_IdProductoDetallePlaneacionCompra);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePlaneacionCompra.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarFK_IdProductoDetallePlaneacionCompra);
			if(!this.detalleplaneacioncompraConstantesFunciones.mostrarFK_IdProductoDetallePlaneacionCompra && index>-1) {
				this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetallePlaneacionCompra.indexOfComponent(this.jPanelFK_IdUnidadDetallePlaneacionCompra);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePlaneacionCompra.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarFK_IdUnidadDetallePlaneacionCompra);
			if(!this.detalleplaneacioncompraConstantesFunciones.mostrarFK_IdUnidadDetallePlaneacionCompra && index>-1) {
				this.jTabbedPaneBusquedasDetallePlaneacionCompra.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetallePlaneacionCompra() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetallePlaneacionCompra.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetallePlaneacionCompra.indexOfComponent(this.jPanelFK_IdLineaDetallePlaneacionCompra);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePlaneacionCompra.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activarFK_IdLineaDetallePlaneacionCompra);
				this.jTabbedPaneBusquedasDetallePlaneacionCompra.setEnabledAt(index,this.detalleplaneacioncompraConstantesFunciones.activarFK_IdLineaDetallePlaneacionCompra);
			}

			index= this.jTabbedPaneBusquedasDetallePlaneacionCompra.indexOfComponent(this.jPanelFK_IdPlaneacionCompraDetallePlaneacionCompra);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePlaneacionCompra.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activarFK_IdPlaneacionCompraDetallePlaneacionCompra);
				this.jTabbedPaneBusquedasDetallePlaneacionCompra.setEnabledAt(index,this.detalleplaneacioncompraConstantesFunciones.activarFK_IdPlaneacionCompraDetallePlaneacionCompra);
			}

			index= this.jTabbedPaneBusquedasDetallePlaneacionCompra.indexOfComponent(this.jPanelFK_IdProductoDetallePlaneacionCompra);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePlaneacionCompra.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activarFK_IdProductoDetallePlaneacionCompra);
				this.jTabbedPaneBusquedasDetallePlaneacionCompra.setEnabledAt(index,this.detalleplaneacioncompraConstantesFunciones.activarFK_IdProductoDetallePlaneacionCompra);
			}

			index= this.jTabbedPaneBusquedasDetallePlaneacionCompra.indexOfComponent(this.jPanelFK_IdUnidadDetallePlaneacionCompra);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePlaneacionCompra.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activarFK_IdUnidadDetallePlaneacionCompra);
				this.jTabbedPaneBusquedasDetallePlaneacionCompra.setEnabledAt(index,this.detalleplaneacioncompraConstantesFunciones.activarFK_IdUnidadDetallePlaneacionCompra);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetallePlaneacionCompra(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdLinea")) {
			index= this.jTabbedPaneBusquedasDetallePlaneacionCompra.indexOfComponent(this.jPanelFK_IdLineaDetallePlaneacionCompra);

			this.jTabbedPaneBusquedasDetallePlaneacionCompra.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePlaneacionCompra.getComponent(index);

			this.detalleplaneacioncompraConstantesFunciones.setResaltarFK_IdLineaDetallePlaneacionCompra(resaltar);

			jPanel.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltarFK_IdLineaDetallePlaneacionCompra);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPlaneacionCompra")) {
			index= this.jTabbedPaneBusquedasDetallePlaneacionCompra.indexOfComponent(this.jPanelFK_IdPlaneacionCompraDetallePlaneacionCompra);

			this.jTabbedPaneBusquedasDetallePlaneacionCompra.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePlaneacionCompra.getComponent(index);

			this.detalleplaneacioncompraConstantesFunciones.setResaltarFK_IdPlaneacionCompraDetallePlaneacionCompra(resaltar);

			jPanel.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltarFK_IdPlaneacionCompraDetallePlaneacionCompra);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasDetallePlaneacionCompra.indexOfComponent(this.jPanelFK_IdProductoDetallePlaneacionCompra);

			this.jTabbedPaneBusquedasDetallePlaneacionCompra.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePlaneacionCompra.getComponent(index);

			this.detalleplaneacioncompraConstantesFunciones.setResaltarFK_IdProductoDetallePlaneacionCompra(resaltar);

			jPanel.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltarFK_IdProductoDetallePlaneacionCompra);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidad")) {
			index= this.jTabbedPaneBusquedasDetallePlaneacionCompra.indexOfComponent(this.jPanelFK_IdUnidadDetallePlaneacionCompra);

			this.jTabbedPaneBusquedasDetallePlaneacionCompra.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePlaneacionCompra.getComponent(index);

			this.detalleplaneacioncompraConstantesFunciones.setResaltarFK_IdUnidadDetallePlaneacionCompra(resaltar);

			jPanel.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltarFK_IdUnidadDetallePlaneacionCompra);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetallePlaneacionCompra.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetallePlaneacionCompra() throws Exception {

		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetallePlaneacionCompra();
		this.updateVisibilidadResaltarControlesFormularioDetallePlaneacionCompra();
		this.updateHabilitarResaltarControlesFormularioDetallePlaneacionCompra();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetallePlaneacionCompra() throws Exception {
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detalleplaneacioncompraConstantesFunciones.resaltaridDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelidDetallePlaneacionCompra.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltaridDetallePlaneacionCompra);}
		if(this.detalleplaneacioncompraConstantesFunciones.resaltarid_empresaDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_empresaDetallePlaneacionCompra.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltarid_empresaDetallePlaneacionCompra);}
		if(this.detalleplaneacioncompraConstantesFunciones.resaltarid_sucursalDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_sucursalDetallePlaneacionCompra.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltarid_sucursalDetallePlaneacionCompra);}
		if(this.detalleplaneacioncompraConstantesFunciones.resaltarid_ejercicioDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_ejercicioDetallePlaneacionCompra.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltarid_ejercicioDetallePlaneacionCompra);}
		if(this.detalleplaneacioncompraConstantesFunciones.resaltarid_periodoDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_periodoDetallePlaneacionCompra.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltarid_periodoDetallePlaneacionCompra);}
		if(this.detalleplaneacioncompraConstantesFunciones.resaltarid_planeacion_compraDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_planeacion_compraDetallePlaneacionCompra.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltarid_planeacion_compraDetallePlaneacionCompra);}
		if(this.detalleplaneacioncompraConstantesFunciones.resaltarid_lineaDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_lineaDetallePlaneacionCompra.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltarid_lineaDetallePlaneacionCompra);}
		if(this.detalleplaneacioncompraConstantesFunciones.resaltarid_productoDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_productoDetallePlaneacionCompra.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltarid_productoDetallePlaneacionCompra);}
		if(this.detalleplaneacioncompraConstantesFunciones.resaltarid_unidadDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_unidadDetallePlaneacionCompra.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltarid_unidadDetallePlaneacionCompra);}
		if(this.detalleplaneacioncompraConstantesFunciones.resaltarstockDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstockDetallePlaneacionCompra.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltarstockDetallePlaneacionCompra);}
		if(this.detalleplaneacioncompraConstantesFunciones.resaltardia_minimoDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFielddia_minimoDetallePlaneacionCompra.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltardia_minimoDetallePlaneacionCompra);}
		if(this.detalleplaneacioncompraConstantesFunciones.resaltarstock_minimoDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_minimoDetallePlaneacionCompra.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltarstock_minimoDetallePlaneacionCompra);}
		if(this.detalleplaneacioncompraConstantesFunciones.resaltardia_maximoDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFielddia_maximoDetallePlaneacionCompra.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltardia_maximoDetallePlaneacionCompra);}
		if(this.detalleplaneacioncompraConstantesFunciones.resaltarstock_maximoDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_maximoDetallePlaneacionCompra.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltarstock_maximoDetallePlaneacionCompra);}
		if(this.detalleplaneacioncompraConstantesFunciones.resaltarsalidaDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldsalidaDetallePlaneacionCompra.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltarsalidaDetallePlaneacionCompra);}
		if(this.detalleplaneacioncompraConstantesFunciones.resaltarstock_mensualDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_mensualDetallePlaneacionCompra.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltarstock_mensualDetallePlaneacionCompra);}
		if(this.detalleplaneacioncompraConstantesFunciones.resaltardescripcionDetallePlaneacionCompra!=null && this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextAreadescripcionDetallePlaneacionCompra.setBorder(this.detalleplaneacioncompraConstantesFunciones.resaltardescripcionDetallePlaneacionCompra);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetallePlaneacionCompra() throws Exception {		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
	
		//this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelidDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostraridDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jPanelidDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostraridDetallePlaneacionCompra);
		//this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_empresaDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarid_empresaDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jPanelid_empresaDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarid_empresaDetallePlaneacionCompra);
		//this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_sucursalDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarid_sucursalDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jPanelid_sucursalDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarid_sucursalDetallePlaneacionCompra);
		//this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_ejercicioDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarid_ejercicioDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jPanelid_ejercicioDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarid_ejercicioDetallePlaneacionCompra);
		//this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_periodoDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarid_periodoDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jPanelid_periodoDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarid_periodoDetallePlaneacionCompra);
		//this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_planeacion_compraDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarid_planeacion_compraDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jPanelid_planeacion_compraDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarid_planeacion_compraDetallePlaneacionCompra);
		//this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_lineaDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarid_lineaDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jPanelid_lineaDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarid_lineaDetallePlaneacionCompra);
		//this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_productoDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarid_productoDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jPanelid_productoDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarid_productoDetallePlaneacionCompra);
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_productoDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarid_productoDetallePlaneacionCompra);
		//this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_unidadDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarid_unidadDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jPanelid_unidadDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarid_unidadDetallePlaneacionCompra);
		//this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstockDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarstockDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jPanelstockDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarstockDetallePlaneacionCompra);
		//this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFielddia_minimoDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrardia_minimoDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jPaneldia_minimoDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrardia_minimoDetallePlaneacionCompra);
		//this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_minimoDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarstock_minimoDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jPanelstock_minimoDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarstock_minimoDetallePlaneacionCompra);
		//this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFielddia_maximoDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrardia_maximoDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jPaneldia_maximoDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrardia_maximoDetallePlaneacionCompra);
		//this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_maximoDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarstock_maximoDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jPanelstock_maximoDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarstock_maximoDetallePlaneacionCompra);
		//this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldsalidaDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarsalidaDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jPanelsalidaDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarsalidaDetallePlaneacionCompra);
		//this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_mensualDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarstock_mensualDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jPanelstock_mensualDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrarstock_mensualDetallePlaneacionCompra);
		//this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextAreadescripcionDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrardescripcionDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jPaneldescripcionDetallePlaneacionCompra.setVisible(this.detalleplaneacioncompraConstantesFunciones.mostrardescripcionDetallePlaneacionCompra);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetallePlaneacionCompra() throws Exception {
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetallePlaneacionCompra!=null) {
	
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jLabelidDetallePlaneacionCompra.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activaridDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_empresaDetallePlaneacionCompra.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activarid_empresaDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_sucursalDetallePlaneacionCompra.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activarid_sucursalDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_ejercicioDetallePlaneacionCompra.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activarid_ejercicioDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_periodoDetallePlaneacionCompra.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activarid_periodoDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_planeacion_compraDetallePlaneacionCompra.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activarid_planeacion_compraDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_lineaDetallePlaneacionCompra.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activarid_lineaDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_productoDetallePlaneacionCompra.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activarid_productoDetallePlaneacionCompra);
			this.jInternalFrameDetalleFormDetallePlaneacionCompra.jButtonid_productoDetallePlaneacionCompra.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activarid_productoDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jComboBoxid_unidadDetallePlaneacionCompra.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activarid_unidadDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstockDetallePlaneacionCompra.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activarstockDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFielddia_minimoDetallePlaneacionCompra.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activardia_minimoDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_minimoDetallePlaneacionCompra.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activarstock_minimoDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFielddia_maximoDetallePlaneacionCompra.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activardia_maximoDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_maximoDetallePlaneacionCompra.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activarstock_maximoDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldsalidaDetallePlaneacionCompra.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activarsalidaDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextFieldstock_mensualDetallePlaneacionCompra.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activarstock_mensualDetallePlaneacionCompra);
		this.jInternalFrameDetalleFormDetallePlaneacionCompra.jTextAreadescripcionDetallePlaneacionCompra.setEnabled(this.detalleplaneacioncompraConstantesFunciones.activardescripcionDetallePlaneacionCompra);
		}
	}
	
		
}