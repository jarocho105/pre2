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

import com.bydan.erp.puntoventa.util.DetallePedidoPuntoVentaConstantesFunciones;
import com.bydan.erp.puntoventa.util.DetallePedidoPuntoVentaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.DetallePedidoPuntoVentaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.DetallePedidoPuntoVentaBean;
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

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class DetallePedidoPuntoVentaBeanSwingJInternalFrame extends DetallePedidoPuntoVentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetallePedidoPuntoVentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetallePedidoPuntoVenta> detallepedidopuntoventaValidator = new ClassValidator<DetallePedidoPuntoVenta>(DetallePedidoPuntoVenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetallePedidoPuntoVenta detallepedidopuntoventa;	
	public DetallePedidoPuntoVenta detallepedidopuntoventaAux;
	public DetallePedidoPuntoVenta detallepedidopuntoventaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetallePedidoPuntoVenta detallepedidopuntoventaTotales;
	public Long idDetallePedidoPuntoVentaActual;
	public Long iIdNuevoDetallePedidoPuntoVenta=0L;
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

	public String sFinalQueryComboPedidoPuntoVenta="";

	public List<PedidoPuntoVenta> pedidopuntoventasForeignKey;

	public List<PedidoPuntoVenta> getpedidopuntoventasForeignKey() {
		return pedidopuntoventasForeignKey;
	}

	public void setpedidopuntoventasForeignKey(List<PedidoPuntoVenta> pedidopuntoventasForeignKey) {
		this.pedidopuntoventasForeignKey = pedidopuntoventasForeignKey;
	}

	//OBJETO FK ACTUAL
	public PedidoPuntoVenta pedidopuntoventaForeignKey;

	public PedidoPuntoVenta getpedidopuntoventaForeignKey() {
		return pedidopuntoventaForeignKey;
	}

	public void setpedidopuntoventaForeignKey(PedidoPuntoVenta pedidopuntoventaForeignKey) {
		this.pedidopuntoventaForeignKey = pedidopuntoventaForeignKey;
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
	
	public Boolean isPermisoTodoDetallePedidoPuntoVenta;
	public Boolean isPermisoNuevoDetallePedidoPuntoVenta;
	public Boolean isPermisoActualizarDetallePedidoPuntoVenta;
	public Boolean isPermisoActualizarOriginalDetallePedidoPuntoVenta;
	public Boolean isPermisoEliminarDetallePedidoPuntoVenta;
	public Boolean isPermisoGuardarCambiosDetallePedidoPuntoVenta;
	public Boolean isPermisoConsultaDetallePedidoPuntoVenta;
	public Boolean isPermisoBusquedaDetallePedidoPuntoVenta;
	public Boolean isPermisoReporteDetallePedidoPuntoVenta;
	public Boolean isPermisoPaginacionMedioDetallePedidoPuntoVenta;
	public Boolean isPermisoPaginacionAltoDetallePedidoPuntoVenta;
	public Boolean isPermisoPaginacionTodoDetallePedidoPuntoVenta;
	public Boolean isPermisoCopiarDetallePedidoPuntoVenta;
	public Boolean isPermisoVerFormDetallePedidoPuntoVenta;
	public Boolean isPermisoDuplicarDetallePedidoPuntoVenta;
	public Boolean isPermisoOrdenDetallePedidoPuntoVenta;
	
	
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
	
	public DetallePedidoPuntoVentaParameterReturnGeneral detallepedidopuntoventaReturnGeneral;
	public DetallePedidoPuntoVentaParameterReturnGeneral detallepedidopuntoventaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetallePedidoPuntoVenta=false;
	public Boolean esParaAccionDesdeFormularioDetallePedidoPuntoVenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetallePedidoPuntoVentaSessionBeanAdditional detallepedidopuntoventaSessionBeanAdditional=null;
	
	public DetallePedidoPuntoVentaSessionBeanAdditional getDetallePedidoPuntoVentaSessionBeanAdditional() {
		return this.detallepedidopuntoventaSessionBeanAdditional;
	}
	
	public void setDetallePedidoPuntoVentaSessionBeanAdditional(DetallePedidoPuntoVentaSessionBeanAdditional detallepedidopuntoventaSessionBeanAdditional) {
		try {
			this.detallepedidopuntoventaSessionBeanAdditional=detallepedidopuntoventaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional detallepedidopuntoventaBeanSwingJInternalFrameAdditional=null;
	//public class DetallePedidoPuntoVentaBeanSwingJInternalFrame
	
	public DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional getDetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional() {
		return this.detallepedidopuntoventaBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional(DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional detallepedidopuntoventaBeanSwingJInternalFrameAdditional) {
		try {
			this.detallepedidopuntoventaBeanSwingJInternalFrameAdditional=detallepedidopuntoventaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetallePedidoPuntoVentaLogic detallepedidopuntoventaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetallePedidoPuntoVenta detallepedidopuntoventaBean;
	public DetallePedidoPuntoVentaConstantesFunciones detallepedidopuntoventaConstantesFunciones;
	//public DetallePedidoPuntoVentaParameterReturnGeneral detallepedidopuntoventaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public PedidoPuntoVentaLogic pedidopuntoventaLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public UnidadLogic unidadLogic;
	
	//PARAMETROS
	
	
	//public List<DetallePedidoPuntoVenta> detallepedidopuntoventas;	
	//public List<DetallePedidoPuntoVenta> detallepedidopuntoventasEliminados;
	//public List<DetallePedidoPuntoVenta> detallepedidopuntoventasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetallePedidoPuntoVenta=false;
	public Boolean isVisibilidadCeldaDuplicarDetallePedidoPuntoVenta=true;
	public Boolean isVisibilidadCeldaCopiarDetallePedidoPuntoVenta=true;
	public Boolean isVisibilidadCeldaVerFormDetallePedidoPuntoVenta=true;
	public Boolean isVisibilidadCeldaOrdenDetallePedidoPuntoVenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta=false;
	public Boolean isVisibilidadCeldaModificarDetallePedidoPuntoVenta=false;
	public Boolean isVisibilidadCeldaActualizarDetallePedidoPuntoVenta=false;
	public Boolean isVisibilidadCeldaEliminarDetallePedidoPuntoVenta=false;
	public Boolean isVisibilidadCeldaCancelarDetallePedidoPuntoVenta=false;
	public Boolean isVisibilidadCeldaGuardarDetallePedidoPuntoVenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPedidoPuntoVenta=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdUnidad=false;
	
	public Long getiIdNuevoDetallePedidoPuntoVenta() {
		return this.iIdNuevoDetallePedidoPuntoVenta;
	}

	public void setiIdNuevoDetallePedidoPuntoVenta(Long iIdNuevoDetallePedidoPuntoVenta) {
		this.iIdNuevoDetallePedidoPuntoVenta = iIdNuevoDetallePedidoPuntoVenta;
	}
	
	public Long getidDetallePedidoPuntoVentaActual() {
		return this.idDetallePedidoPuntoVentaActual;
	}

	public void setidDetallePedidoPuntoVentaActual(Long idDetallePedidoPuntoVentaActual) {
		this.idDetallePedidoPuntoVentaActual = idDetallePedidoPuntoVentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetallePedidoPuntoVenta getdetallepedidopuntoventa() {
		return this.detallepedidopuntoventa;
	}

	public void setdetallepedidopuntoventa(DetallePedidoPuntoVenta detallepedidopuntoventa) {
		this.detallepedidopuntoventa = detallepedidopuntoventa;
	}
	
	public DetallePedidoPuntoVenta getdetallepedidopuntoventaAux() {
		return this.detallepedidopuntoventaAux;
	}

	public void setdetallepedidopuntoventaAux(DetallePedidoPuntoVenta detallepedidopuntoventaAux) {
		this.detallepedidopuntoventaAux = detallepedidopuntoventaAux;
	}				
	
	public DetallePedidoPuntoVenta getdetallepedidopuntoventaAnterior() {
		return this.detallepedidopuntoventaAnterior;
	}

	public void setdetallepedidopuntoventaAnterior(DetallePedidoPuntoVenta detallepedidopuntoventaAnterior) {
		this.detallepedidopuntoventaAnterior = detallepedidopuntoventaAnterior;
	}	
	
	public DetallePedidoPuntoVenta getdetallepedidopuntoventaTotales() {
		return this.detallepedidopuntoventaTotales;
	}

	public void setdetallepedidopuntoventaTotales(DetallePedidoPuntoVenta detallepedidopuntoventaTotales) {
		this.detallepedidopuntoventaTotales = detallepedidopuntoventaTotales;
	}	
	
	public DetallePedidoPuntoVenta getdetallepedidopuntoventaBean() {
		return this.detallepedidopuntoventaBean;
	}

	public void setdetallepedidopuntoventaBean(DetallePedidoPuntoVenta detallepedidopuntoventaBean) {
		this.detallepedidopuntoventaBean = detallepedidopuntoventaBean;
	}	
	
	public DetallePedidoPuntoVentaParameterReturnGeneral getdetallepedidopuntoventaReturnGeneral() {
		return this.detallepedidopuntoventaReturnGeneral;
	}

	public void setdetallepedidopuntoventaReturnGeneral(DetallePedidoPuntoVentaParameterReturnGeneral detallepedidopuntoventaReturnGeneral) {
		this.detallepedidopuntoventaReturnGeneral = detallepedidopuntoventaReturnGeneral;
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

	public Long id_pedido_punto_ventaFK_IdPedidoPuntoVenta=-1L;

	public Long getid_pedido_punto_ventaFK_IdPedidoPuntoVenta() {
		return this.id_pedido_punto_ventaFK_IdPedidoPuntoVenta;
	}

	public void setid_pedido_punto_ventaFK_IdPedidoPuntoVenta(Long id_pedido_punto_ventaFK_IdPedidoPuntoVenta) {
		this.id_pedido_punto_ventaFK_IdPedidoPuntoVenta = id_pedido_punto_ventaFK_IdPedidoPuntoVenta;
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
	
	
	public DetallePedidoPuntoVentaLogic getDetallePedidoPuntoVentaLogic()	{		
		return detallepedidopuntoventaLogic;
	}

	public void setDetallePedidoPuntoVentaLogic(DetallePedidoPuntoVentaLogic detallepedidopuntoventaLogic) {
		this.detallepedidopuntoventaLogic = detallepedidopuntoventaLogic;
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
	
	public Boolean getIsEsNuevoDetallePedidoPuntoVenta() {
		return isEsNuevoDetallePedidoPuntoVenta;
	}

	public void setIsEsNuevoDetallePedidoPuntoVenta(Boolean isEsNuevoDetallePedidoPuntoVenta) {
		this.isEsNuevoDetallePedidoPuntoVenta = isEsNuevoDetallePedidoPuntoVenta;
	}

	public Boolean getEsParaAccionDesdeFormularioDetallePedidoPuntoVenta() {
		return esParaAccionDesdeFormularioDetallePedidoPuntoVenta;
	}
	
	public void setEsParaAccionDesdeFormularioDetallePedidoPuntoVenta(Boolean esParaAccionDesdeFormularioDetallePedidoPuntoVenta) {
		this.esParaAccionDesdeFormularioDetallePedidoPuntoVenta = esParaAccionDesdeFormularioDetallePedidoPuntoVenta;
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

			if(this.detallepedidopuntoventaSessionBean==null) {
				this.detallepedidopuntoventaSessionBean=new DetallePedidoPuntoVentaSessionBean();
			}

			if(!this.detallepedidopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detallepedidopuntoventaSessionBean.getlidEmpresaActual());
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

			if(this.detallepedidopuntoventaSessionBean==null) {
				this.detallepedidopuntoventaSessionBean=new DetallePedidoPuntoVentaSessionBean();
			}

			if(!this.detallepedidopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(detallepedidopuntoventaSessionBean.getlidSucursalActual());
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

	public void cargarCombosPedidoPuntoVentasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.pedidopuntoventasForeignKey=new ArrayList<PedidoPuntoVenta>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PedidoPuntoVentaLogic pedidopuntoventaLogic=new PedidoPuntoVentaLogic();

			//pedidopuntoventaLogic.getPedidoPuntoVentaDataAccess().setIsForForeingKeyData(true);

			if(this.detallepedidopuntoventaSessionBean==null) {
				this.detallepedidopuntoventaSessionBean=new DetallePedidoPuntoVentaSessionBean();
			}

			if(!this.detallepedidopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionPedidoPuntoVenta()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pedidopuntoventaLogic.getPedidoPuntoVentaDataAccess().setIsForForeingKeyData(true);

					pedidopuntoventaLogic.getTodosPedidoPuntoVentasWithConnection(sFinalQuery,new Pagination());

					this.pedidopuntoventasForeignKey=pedidopuntoventaLogic.getPedidoPuntoVentas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPedidoPuntoVenta(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidopuntoventaLogic.getEntityWithConnection(detallepedidopuntoventaSessionBean.getlidPedidoPuntoVentaActual());
					this.pedidopuntoventasForeignKey.add(pedidopuntoventaLogic.getPedidoPuntoVenta());
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

			if(this.detallepedidopuntoventaSessionBean==null) {
				this.detallepedidopuntoventaSessionBean=new DetallePedidoPuntoVentaSessionBean();
			}

			if(!this.detallepedidopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(detallepedidopuntoventaSessionBean.getlidBodegaActual());
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

			if(this.detallepedidopuntoventaSessionBean==null) {
				this.detallepedidopuntoventaSessionBean=new DetallePedidoPuntoVentaSessionBean();
			}

			if(!this.detallepedidopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(detallepedidopuntoventaSessionBean.getlidProductoActual());
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

			if(this.detallepedidopuntoventaSessionBean==null) {
				this.detallepedidopuntoventaSessionBean=new DetallePedidoPuntoVentaSessionBean();
			}

			if(!this.detallepedidopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
					unidadLogic.getEntityWithConnection(detallepedidopuntoventaSessionBean.getlidUnidadActual());
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

					if(this.detallepedidopuntoventa!=null) {
						this.detallepedidopuntoventa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
						this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_empresaDetallePedidoPuntoVenta.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetallePedidoPuntoVenta.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_empresaDetallePedidoPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_empresaDetallePedidoPuntoVenta.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetallePedidoPuntoVentaGenerico)throws Exception
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
				jComboBoxid_empresaDetallePedidoPuntoVentaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetallePedidoPuntoVentaGenerico!=null && jComboBoxid_empresaDetallePedidoPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetallePedidoPuntoVentaGenerico.setSelectedIndex(0);
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

					if(this.detallepedidopuntoventa!=null) {
						this.detallepedidopuntoventa.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
						this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_sucursalDetallePedidoPuntoVenta.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDetallePedidoPuntoVenta.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_sucursalDetallePedidoPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_sucursalDetallePedidoPuntoVenta.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDetallePedidoPuntoVentaGenerico)throws Exception
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
				jComboBoxid_sucursalDetallePedidoPuntoVentaGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDetallePedidoPuntoVentaGenerico!=null && jComboBoxid_sucursalDetallePedidoPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDetallePedidoPuntoVentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPedidoPuntoVentaForeignKey(Long idPedidoPuntoVentaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			PedidoPuntoVenta  pedidopuntoventaTemp=null;

			for(PedidoPuntoVenta pedidopuntoventaAux:pedidopuntoventasForeignKey) {
				if(pedidopuntoventaAux.getId()!=null && pedidopuntoventaAux.getId().equals(idPedidoPuntoVentaSeleccionado)) {
					pedidopuntoventaTemp=pedidopuntoventaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(pedidopuntoventaTemp!=null) {

					if(this.detallepedidopuntoventa!=null) {
						this.detallepedidopuntoventa.setPedidoPuntoVenta(pedidopuntoventaTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
						this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.setSelectedItem(pedidopuntoventaTemp);
					}
				} else {
					//jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.setSelectedItem(pedidopuntoventaTemp);
					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPedidoPuntoVenta") || sFormularioTipoBusqueda.equals("Todos")){
					if(pedidopuntoventaTemp!=null && jComboBoxid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta!=null) {
						jComboBoxid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.setSelectedItem(pedidopuntoventaTemp);
					} else {
						if(jComboBoxid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta!=null) {
							//jComboBoxid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.setSelectedItem(pedidopuntoventaTemp);
							if(jComboBoxid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.getItemCount()>0) {
								jComboBoxid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.setSelectedIndex(0);
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

	public String getActualPedidoPuntoVentaForeignKeyDescripcion(Long idPedidoPuntoVentaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			PedidoPuntoVenta  pedidopuntoventaTemp=null;

			for(PedidoPuntoVenta pedidopuntoventaAux:pedidopuntoventasForeignKey) {
				if(pedidopuntoventaAux.getId()!=null && pedidopuntoventaAux.getId().equals(idPedidoPuntoVentaSeleccionado)) {
					pedidopuntoventaTemp=pedidopuntoventaAux;
					break;
				}
			}


			sDescripcion=PedidoPuntoVentaConstantesFunciones.getPedidoPuntoVentaDescripcion(pedidopuntoventaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPedidoPuntoVentaForeignKeyGenerico(Long idPedidoPuntoVentaSeleccionado,JComboBox jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVentaGenerico)throws Exception
	{
		try
		{
			PedidoPuntoVenta  pedidopuntoventaTemp=null;

			for(PedidoPuntoVenta pedidopuntoventaAux:pedidopuntoventasForeignKey) {
				if(pedidopuntoventaAux.getId()!=null && pedidopuntoventaAux.getId().equals(idPedidoPuntoVentaSeleccionado)) {
					pedidopuntoventaTemp=pedidopuntoventaAux;
					break;
				}
			}

			if(pedidopuntoventaTemp!=null) {
				jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVentaGenerico.setSelectedItem(pedidopuntoventaTemp);
			} else {
				if(jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVentaGenerico!=null && jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVentaGenerico.setSelectedIndex(0);
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

					if(this.detallepedidopuntoventa!=null) {
						this.detallepedidopuntoventa.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
						this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaDetallePedidoPuntoVenta.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta!=null) {
						jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta!=null) {
							//jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaDetallePedidoPuntoVentaGenerico)throws Exception
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
				jComboBoxid_bodegaDetallePedidoPuntoVentaGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaDetallePedidoPuntoVentaGenerico!=null && jComboBoxid_bodegaDetallePedidoPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_bodegaDetallePedidoPuntoVentaGenerico.setSelectedIndex(0);
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

					if(this.detallepedidopuntoventa!=null) {
						this.detallepedidopuntoventa.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
						this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoDetallePedidoPuntoVenta.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta!=null) {
						jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta!=null) {
							//jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoDetallePedidoPuntoVentaGenerico)throws Exception
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
				jComboBoxid_productoDetallePedidoPuntoVentaGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoDetallePedidoPuntoVentaGenerico!=null && jComboBoxid_productoDetallePedidoPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_productoDetallePedidoPuntoVentaGenerico.setSelectedIndex(0);
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

					if(this.detallepedidopuntoventa!=null) {
						this.detallepedidopuntoventa.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
						this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_unidadDetallePedidoPuntoVenta.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadDetallePedidoPuntoVenta.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_unidadDetallePedidoPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_unidadDetallePedidoPuntoVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadDetallePedidoPuntoVenta!=null) {
						jComboBoxid_unidadFK_IdUnidadDetallePedidoPuntoVenta.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadDetallePedidoPuntoVenta!=null) {
							//jComboBoxid_unidadFK_IdUnidadDetallePedidoPuntoVenta.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadDetallePedidoPuntoVenta.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadDetallePedidoPuntoVenta.setSelectedIndex(0);
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
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadDetallePedidoPuntoVentaGenerico)throws Exception
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
				jComboBoxid_unidadDetallePedidoPuntoVentaGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadDetallePedidoPuntoVentaGenerico!=null && jComboBoxid_unidadDetallePedidoPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_unidadDetallePedidoPuntoVentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetallePedidoPuntoVenta detallepedidopuntoventa,JComboBox jComboBoxid_empresaDetallePedidoPuntoVentaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetallePedidoPuntoVentaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_empresaDetallePedidoPuntoVenta.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetallePedidoPuntoVentaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detallepedidopuntoventa.setid_empresa(empresaAux.getId());
				detallepedidopuntoventa.setempresa_descripcion(DetallePedidoPuntoVentaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detallepedidopuntoventa.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DetallePedidoPuntoVenta detallepedidopuntoventa,JComboBox jComboBoxid_sucursalDetallePedidoPuntoVentaGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDetallePedidoPuntoVentaGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_sucursalDetallePedidoPuntoVenta.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDetallePedidoPuntoVentaGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				detallepedidopuntoventa.setid_sucursal(sucursalAux.getId());
				detallepedidopuntoventa.setsucursal_descripcion(DetallePedidoPuntoVentaConstantesFunciones.getSucursalDescripcion(sucursalAux));
				detallepedidopuntoventa.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPedidoPuntoVentaForeignKey(DetallePedidoPuntoVenta detallepedidopuntoventa,JComboBox jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVentaGenerico)throws Exception
	{
		try
		{
			PedidoPuntoVenta  pedidopuntoventaAux=new PedidoPuntoVenta();

			if(jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVentaGenerico==null) {
				pedidopuntoventaAux=(PedidoPuntoVenta)this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.getSelectedItem();
			} else {
				pedidopuntoventaAux=(PedidoPuntoVenta)jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVentaGenerico.getSelectedItem();
			}

			if(pedidopuntoventaAux!=null && pedidopuntoventaAux.getId()!=null) {
				detallepedidopuntoventa.setid_pedido_punto_venta(pedidopuntoventaAux.getId());
				detallepedidopuntoventa.setpedidopuntoventa_descripcion(DetallePedidoPuntoVentaConstantesFunciones.getPedidoPuntoVentaDescripcion(pedidopuntoventaAux));
				detallepedidopuntoventa.setPedidoPuntoVenta(pedidopuntoventaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(DetallePedidoPuntoVenta detallepedidopuntoventa,JComboBox jComboBoxid_bodegaDetallePedidoPuntoVentaGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaDetallePedidoPuntoVentaGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaDetallePedidoPuntoVentaGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				detallepedidopuntoventa.setid_bodega(bodegaAux.getId());
				detallepedidopuntoventa.setbodega_descripcion(DetallePedidoPuntoVentaConstantesFunciones.getBodegaDescripcion(bodegaAux));
				detallepedidopuntoventa.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(DetallePedidoPuntoVenta detallepedidopuntoventa,JComboBox jComboBoxid_productoDetallePedidoPuntoVentaGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoDetallePedidoPuntoVentaGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoDetallePedidoPuntoVentaGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				detallepedidopuntoventa.setid_producto(productoAux.getId());
				detallepedidopuntoventa.setproducto_descripcion(DetallePedidoPuntoVentaConstantesFunciones.getProductoDescripcion(productoAux));
				detallepedidopuntoventa.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(DetallePedidoPuntoVenta detallepedidopuntoventa,JComboBox jComboBoxid_unidadDetallePedidoPuntoVentaGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadDetallePedidoPuntoVentaGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_unidadDetallePedidoPuntoVenta.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadDetallePedidoPuntoVentaGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				detallepedidopuntoventa.setid_unidad(unidadAux.getId());
				detallepedidopuntoventa.setunidad_descripcion(DetallePedidoPuntoVentaConstantesFunciones.getUnidadDescripcion(unidadAux));
				detallepedidopuntoventa.setUnidad(unidadAux);			}
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

					if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_empresaDetallePedidoPuntoVenta.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_empresaDetallePedidoPuntoVenta.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { 
					}

					if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_sucursalDetallePedidoPuntoVenta.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_sucursalDetallePedidoPuntoVenta.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { 
					}

					if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePedidoPuntoVentasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPedidoPuntoVenta=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.removeAllItems();

							for(PedidoPuntoVenta pedidopuntoventa:this.pedidopuntoventasForeignKey) {
								this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.addItem(pedidopuntoventa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { 
					}

					if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPedidoPuntoVenta") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.removeAllItems();

							for(PedidoPuntoVenta pedidopuntoventa:this.pedidopuntoventasForeignKey) {
								this.jComboBoxid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.addItem(pedidopuntoventa);
							}
						}

						if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { 
					}

					if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.addItem(bodega);
							}
						}

						if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { 
					}

					if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta.addItem(producto);
							}
						}

						if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_unidadDetallePedidoPuntoVenta.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_unidadDetallePedidoPuntoVenta.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { 
					}

					if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadDetallePedidoPuntoVenta.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadDetallePedidoPuntoVenta.addItem(unidad);
							}
						}

						if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_empresaDetallePedidoPuntoVenta.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_empresaDetallePedidoPuntoVenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_sucursalDetallePedidoPuntoVenta.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_sucursalDetallePedidoPuntoVenta.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePedidoPuntoVentaForeignKey(PedidoPuntoVenta pedidopuntoventa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.setSelectedItem(pedidopuntoventa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.setSelectedItem(pedidopuntoventa);
						} else {
							this.jComboBoxid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_unidadDetallePedidoPuntoVenta.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_unidadDetallePedidoPuntoVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadDetallePedidoPuntoVenta.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadDetallePedidoPuntoVenta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetallePedidoPuntoVenta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetallePedidoPuntoVentaConstantesFunciones.refrescarForeignKeysDescripcionesDetallePedidoPuntoVenta(this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetallePedidoPuntoVentaConstantesFunciones.refrescarForeignKeysDescripcionesDetallePedidoPuntoVenta(this.detallepedidopuntoventas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(PedidoPuntoVenta.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detallepedidopuntoventaLogic.setDetallePedidoPuntoVentas(this.detallepedidopuntoventas);
			detallepedidopuntoventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetallePedidoPuntoVentaParameterReturnGeneral getDetallePedidoPuntoVentaParameterGeneral() {
		return this.detallepedidopuntoventaParameterGeneral;
	}
	
	public void setDetallePedidoPuntoVentaParameterGeneral(DetallePedidoPuntoVentaParameterReturnGeneral detallepedidopuntoventaParameterGeneral) {
		this.detallepedidopuntoventaParameterGeneral = detallepedidopuntoventaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetallePedidoPuntoVenta() {
		return isPermisoTodoDetallePedidoPuntoVenta;
	}

	public void setIsPermisoTodoDetallePedidoPuntoVenta(Boolean isPermisoTodoDetallePedidoPuntoVenta) {
		this.isPermisoTodoDetallePedidoPuntoVenta = isPermisoTodoDetallePedidoPuntoVenta;
	}

	public Boolean getIsPermisoNuevoDetallePedidoPuntoVenta() {
		return isPermisoNuevoDetallePedidoPuntoVenta;
	}

	public void setIsPermisoNuevoDetallePedidoPuntoVenta(Boolean isPermisoNuevoDetallePedidoPuntoVenta) {
		this.isPermisoNuevoDetallePedidoPuntoVenta = isPermisoNuevoDetallePedidoPuntoVenta;
	}

	public Boolean getIsPermisoActualizarDetallePedidoPuntoVenta() {
		return isPermisoActualizarDetallePedidoPuntoVenta;
	}

	public void setIsPermisoActualizarDetallePedidoPuntoVenta(Boolean isPermisoActualizarDetallePedidoPuntoVenta) {
		this.isPermisoActualizarDetallePedidoPuntoVenta = isPermisoActualizarDetallePedidoPuntoVenta;
	}

	public Boolean getIsPermisoEliminarDetallePedidoPuntoVenta() {
		return isPermisoEliminarDetallePedidoPuntoVenta;
	}

	public void setIsPermisoEliminarDetallePedidoPuntoVenta(Boolean isPermisoEliminarDetallePedidoPuntoVenta) {
		this.isPermisoEliminarDetallePedidoPuntoVenta = isPermisoEliminarDetallePedidoPuntoVenta;
	}

	public Boolean getIsPermisoGuardarCambiosDetallePedidoPuntoVenta() {
		return isPermisoGuardarCambiosDetallePedidoPuntoVenta;
	}

	public void setIsPermisoGuardarCambiosDetallePedidoPuntoVenta(Boolean isPermisoGuardarCambiosDetallePedidoPuntoVenta) {
		this.isPermisoGuardarCambiosDetallePedidoPuntoVenta = isPermisoGuardarCambiosDetallePedidoPuntoVenta;
	}
	
	public Boolean getIsPermisoConsultaDetallePedidoPuntoVenta() {
		return isPermisoConsultaDetallePedidoPuntoVenta;
	}

	public void setIsPermisoConsultaDetallePedidoPuntoVenta(Boolean isPermisoConsultaDetallePedidoPuntoVenta) {
		this.isPermisoConsultaDetallePedidoPuntoVenta = isPermisoConsultaDetallePedidoPuntoVenta;
	}

	public Boolean getIsPermisoBusquedaDetallePedidoPuntoVenta() {
		return isPermisoBusquedaDetallePedidoPuntoVenta;
	}

	public void setIsPermisoBusquedaDetallePedidoPuntoVenta(Boolean isPermisoBusquedaDetallePedidoPuntoVenta) {
		this.isPermisoBusquedaDetallePedidoPuntoVenta = isPermisoBusquedaDetallePedidoPuntoVenta;
	}

	public Boolean getIsPermisoReporteDetallePedidoPuntoVenta() {
		return isPermisoReporteDetallePedidoPuntoVenta;
	}

	public void setIsPermisoReporteDetallePedidoPuntoVenta(Boolean isPermisoReporteDetallePedidoPuntoVenta) {
		this.isPermisoReporteDetallePedidoPuntoVenta = isPermisoReporteDetallePedidoPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetallePedidoPuntoVenta() {
		return isPermisoPaginacionMedioDetallePedidoPuntoVenta;
	}

	public void setIsPermisoPaginacionMedioDetallePedidoPuntoVenta(Boolean isPermisoPaginacionMedioDetallePedidoPuntoVenta) {
		this.isPermisoPaginacionMedioDetallePedidoPuntoVenta = isPermisoPaginacionMedioDetallePedidoPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetallePedidoPuntoVenta() {
		return isPermisoPaginacionTodoDetallePedidoPuntoVenta;
	}

	public void setIsPermisoPaginacionTodoDetallePedidoPuntoVenta(Boolean isPermisoPaginacionTodoDetallePedidoPuntoVenta) {
		this.isPermisoPaginacionTodoDetallePedidoPuntoVenta = isPermisoPaginacionTodoDetallePedidoPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetallePedidoPuntoVenta() {
		return isPermisoPaginacionAltoDetallePedidoPuntoVenta;
	}

	public void setIsPermisoPaginacionAltoDetallePedidoPuntoVenta(Boolean isPermisoPaginacionAltoDetallePedidoPuntoVenta) {
		this.isPermisoPaginacionAltoDetallePedidoPuntoVenta = isPermisoPaginacionAltoDetallePedidoPuntoVenta;
	}
	
	public Boolean getIsPermisoCopiarDetallePedidoPuntoVenta() {
		return isPermisoCopiarDetallePedidoPuntoVenta;
	}

	public void setIsPermisoCopiarDetallePedidoPuntoVenta(Boolean isPermisoCopiarDetallePedidoPuntoVenta) {
		this.isPermisoCopiarDetallePedidoPuntoVenta = isPermisoCopiarDetallePedidoPuntoVenta;
	}
	
	public Boolean getIsPermisoVerFormDetallePedidoPuntoVenta() {
		return isPermisoVerFormDetallePedidoPuntoVenta;
	}

	public void setIsPermisoVerFormDetallePedidoPuntoVenta(Boolean isPermisoVerFormDetallePedidoPuntoVenta) {
		this.isPermisoVerFormDetallePedidoPuntoVenta = isPermisoVerFormDetallePedidoPuntoVenta;
	}
	
	public Boolean getIsPermisoDuplicarDetallePedidoPuntoVenta() {
		return isPermisoDuplicarDetallePedidoPuntoVenta;
	}

	public void setIsPermisoDuplicarDetallePedidoPuntoVenta(Boolean isPermisoDuplicarDetallePedidoPuntoVenta) {
		this.isPermisoDuplicarDetallePedidoPuntoVenta = isPermisoDuplicarDetallePedidoPuntoVenta;
	}
	
	public Boolean getIsPermisoOrdenDetallePedidoPuntoVenta() {
		return isPermisoOrdenDetallePedidoPuntoVenta;
	}

	public void setIsPermisoOrdenDetallePedidoPuntoVenta(Boolean isPermisoOrdenDetallePedidoPuntoVenta) {
		this.isPermisoOrdenDetallePedidoPuntoVenta = isPermisoOrdenDetallePedidoPuntoVenta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetallePedidoPuntoVenta() {
		return isVisibilidadCeldaNuevoDetallePedidoPuntoVenta;
	}

	public void setIsVisibilidadCeldaNuevoDetallePedidoPuntoVenta(Boolean isVisibilidadCeldaNuevoDetallePedidoPuntoVenta) {
		this.isVisibilidadCeldaNuevoDetallePedidoPuntoVenta = isVisibilidadCeldaNuevoDetallePedidoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetallePedidoPuntoVenta() {
		return isVisibilidadCeldaDuplicarDetallePedidoPuntoVenta;
	}

	public void setIsVisibilidadCeldaDuplicarDetallePedidoPuntoVenta(Boolean isVisibilidadCeldaDuplicarDetallePedidoPuntoVenta) {
		this.isVisibilidadCeldaDuplicarDetallePedidoPuntoVenta = isVisibilidadCeldaDuplicarDetallePedidoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetallePedidoPuntoVenta() {
		return isVisibilidadCeldaCopiarDetallePedidoPuntoVenta;
	}

	public void setIsVisibilidadCeldaCopiarDetallePedidoPuntoVenta(Boolean isVisibilidadCeldaCopiarDetallePedidoPuntoVenta) {
		this.isVisibilidadCeldaCopiarDetallePedidoPuntoVenta = isVisibilidadCeldaCopiarDetallePedidoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetallePedidoPuntoVenta() {
		return isVisibilidadCeldaVerFormDetallePedidoPuntoVenta;
	}

	public void setIsVisibilidadCeldaVerFormDetallePedidoPuntoVenta(Boolean isVisibilidadCeldaVerFormDetallePedidoPuntoVenta) {
		this.isVisibilidadCeldaVerFormDetallePedidoPuntoVenta = isVisibilidadCeldaVerFormDetallePedidoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetallePedidoPuntoVenta() {
		return isVisibilidadCeldaOrdenDetallePedidoPuntoVenta;
	}

	public void setIsVisibilidadCeldaOrdenDetallePedidoPuntoVenta(Boolean isVisibilidadCeldaOrdenDetallePedidoPuntoVenta) {
		this.isVisibilidadCeldaOrdenDetallePedidoPuntoVenta = isVisibilidadCeldaOrdenDetallePedidoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta() {
		return isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta(Boolean isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta) {
		this.isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta = isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetallePedidoPuntoVenta() {
		return isVisibilidadCeldaModificarDetallePedidoPuntoVenta;
	}

	public void setIsVisibilidadCeldaModificarDetallePedidoPuntoVenta(Boolean isVisibilidadCeldaModificarDetallePedidoPuntoVenta) {
		this.isVisibilidadCeldaModificarDetallePedidoPuntoVenta = isVisibilidadCeldaModificarDetallePedidoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetallePedidoPuntoVenta() {
		return isVisibilidadCeldaActualizarDetallePedidoPuntoVenta;
	}

	public void setIsVisibilidadCeldaActualizarDetallePedidoPuntoVenta(Boolean isVisibilidadCeldaActualizarDetallePedidoPuntoVenta) {
		this.isVisibilidadCeldaActualizarDetallePedidoPuntoVenta = isVisibilidadCeldaActualizarDetallePedidoPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetallePedidoPuntoVenta() {
		return isVisibilidadCeldaEliminarDetallePedidoPuntoVenta;
	}

	public void setIsVisibilidadCeldaEliminarDetallePedidoPuntoVenta(Boolean isVisibilidadCeldaEliminarDetallePedidoPuntoVenta) {
		this.isVisibilidadCeldaEliminarDetallePedidoPuntoVenta = isVisibilidadCeldaEliminarDetallePedidoPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetallePedidoPuntoVenta() {
		return isVisibilidadCeldaCancelarDetallePedidoPuntoVenta;
	}

	public void setIsVisibilidadCeldaCancelarDetallePedidoPuntoVenta(Boolean isVisibilidadCeldaCancelarDetallePedidoPuntoVenta) {
		this.isVisibilidadCeldaCancelarDetallePedidoPuntoVenta = isVisibilidadCeldaCancelarDetallePedidoPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetallePedidoPuntoVenta() {
		return isVisibilidadCeldaGuardarDetallePedidoPuntoVenta;
	}

	public void setIsVisibilidadCeldaGuardarDetallePedidoPuntoVenta(Boolean isVisibilidadCeldaGuardarDetallePedidoPuntoVenta) {
		this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta = isVisibilidadCeldaGuardarDetallePedidoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta() {
		return isVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta(Boolean isVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta) {
		this.isVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta = isVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta;
	}
		
	public DetallePedidoPuntoVentaSessionBean getdetallepedidopuntoventaSessionBean() {
		return this.detallepedidopuntoventaSessionBean;
	}
	
	public void setdetallepedidopuntoventaSessionBean(DetallePedidoPuntoVentaSessionBean detallepedidopuntoventaSessionBean) {
		this.detallepedidopuntoventaSessionBean=detallepedidopuntoventaSessionBean;
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

	public Boolean getisVisibilidadFK_IdPedidoPuntoVenta() {
		return this.isVisibilidadFK_IdPedidoPuntoVenta;
	}

	public void setisVisibilidadFK_IdPedidoPuntoVenta(Boolean isVisibilidadFK_IdPedidoPuntoVenta) {
		this.isVisibilidadFK_IdPedidoPuntoVenta=isVisibilidadFK_IdPedidoPuntoVenta;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(DetallePedidoPuntoVenta detallepedidopuntoventa)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(detallepedidopuntoventa,null);
				this.setActualParaGuardarSucursalForeignKey(detallepedidopuntoventa,null);
				this.setActualParaGuardarPedidoPuntoVentaForeignKey(detallepedidopuntoventa,null);
				this.setActualParaGuardarBodegaForeignKey(detallepedidopuntoventa,null);
				this.setActualParaGuardarProductoForeignKey(detallepedidopuntoventa,null);
				this.setActualParaGuardarUnidadForeignKey(detallepedidopuntoventa,null);
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
	
	public void bugActualizarReferenciaActual(DetallePedidoPuntoVenta detallepedidopuntoventa,DetallePedidoPuntoVenta detallepedidopuntoventaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetallePedidoPuntoVenta(detallepedidopuntoventa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detallepedidopuntoventaAux.setId(detallepedidopuntoventa.getId());
		detallepedidopuntoventaAux.setVersionRow(detallepedidopuntoventa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetallePedidoPuntoVenta();
		
			int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detallepedidopuntoventaValidator.getInvalidValues(this.detallepedidopuntoventa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detallepedidopuntoventaLogic.setDatosCliente(datosCliente);
			detallepedidopuntoventaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detallepedidopuntoventaAux=new  DetallePedidoPuntoVenta();
				
				detallepedidopuntoventaAux.setIsNew(true);
				detallepedidopuntoventaAux.setIsChanged(true);
				
				detallepedidopuntoventaAux.setDetallePedidoPuntoVentaOriginal(this.detallepedidopuntoventa);
				
				detallepedidopuntoventaAux.setId(this.detallepedidopuntoventa.getId());	
				detallepedidopuntoventaAux.setVersionRow(this.detallepedidopuntoventa.getVersionRow());	
				detallepedidopuntoventaAux.setid_empresa(this.detallepedidopuntoventa.getid_empresa());	
				detallepedidopuntoventaAux.setid_sucursal(this.detallepedidopuntoventa.getid_sucursal());	
				detallepedidopuntoventaAux.setid_pedido_punto_venta(this.detallepedidopuntoventa.getid_pedido_punto_venta());	
				detallepedidopuntoventaAux.setid_bodega(this.detallepedidopuntoventa.getid_bodega());	
				detallepedidopuntoventaAux.setid_producto(this.detallepedidopuntoventa.getid_producto());	
				detallepedidopuntoventaAux.setid_unidad(this.detallepedidopuntoventa.getid_unidad());	
				detallepedidopuntoventaAux.setserie(this.detallepedidopuntoventa.getserie());	
				detallepedidopuntoventaAux.setcantidad(this.detallepedidopuntoventa.getcantidad());	
				detallepedidopuntoventaAux.setprecio(this.detallepedidopuntoventa.getprecio());	
				detallepedidopuntoventaAux.setdescuento(this.detallepedidopuntoventa.getdescuento());	
				detallepedidopuntoventaAux.setdescuento_valor(this.detallepedidopuntoventa.getdescuento_valor());	
				detallepedidopuntoventaAux.setiva(this.detallepedidopuntoventa.getiva());	
				detallepedidopuntoventaAux.setiva_valor(this.detallepedidopuntoventa.getiva_valor());	
				detallepedidopuntoventaAux.setice(this.detallepedidopuntoventa.getice());	
				detallepedidopuntoventaAux.setice_valor(this.detallepedidopuntoventa.getice_valor());	
				detallepedidopuntoventaAux.setsub_total(this.detallepedidopuntoventa.getsub_total());	
				detallepedidopuntoventaAux.settotal(this.detallepedidopuntoventa.gettotal());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallepedidopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detallepedidopuntoventaAux,detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallepedidopuntoventaAux,detallepedidopuntoventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detallepedidopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepedidopuntoventaLogic.saveDetallePedidoPuntoVentas();//WithConnection
						//detallepedidopuntoventaLogic.getSetVersionRowDetallePedidoPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallepedidopuntoventa,detallepedidopuntoventaAux);
					
					this.refrescarForeignKeysDescripcionesDetallePedidoPuntoVenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallepedidopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallepedidopuntoventaLogic.saveDetallePedidoPuntoVentaRelaciones(detallepedidopuntoventaAux);//WithConnection
								//detallepedidopuntoventaLogic.getSetVersionRowDetallePedidoPuntoVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallepedidopuntoventa,detallepedidopuntoventaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallepedidopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallepedidopuntoventaAux,detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallepedidopuntoventaAux,detallepedidopuntoventas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallepedidopuntoventa,detallepedidopuntoventaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detallepedidopuntoventaAux=new  DetallePedidoPuntoVenta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado() 
					|| (this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado() && this.detallepedidopuntoventa.getId()>=0)) {
						
					detallepedidopuntoventaAux.setIsNew(false);
				}
				
				detallepedidopuntoventaAux.setIsDeleted(false);
			
				detallepedidopuntoventaAux.setId(this.detallepedidopuntoventa.getId());	
				detallepedidopuntoventaAux.setVersionRow(this.detallepedidopuntoventa.getVersionRow());	
				detallepedidopuntoventaAux.setid_empresa(this.detallepedidopuntoventa.getid_empresa());	
				detallepedidopuntoventaAux.setid_sucursal(this.detallepedidopuntoventa.getid_sucursal());	
				detallepedidopuntoventaAux.setid_pedido_punto_venta(this.detallepedidopuntoventa.getid_pedido_punto_venta());	
				detallepedidopuntoventaAux.setid_bodega(this.detallepedidopuntoventa.getid_bodega());	
				detallepedidopuntoventaAux.setid_producto(this.detallepedidopuntoventa.getid_producto());	
				detallepedidopuntoventaAux.setid_unidad(this.detallepedidopuntoventa.getid_unidad());	
				detallepedidopuntoventaAux.setserie(this.detallepedidopuntoventa.getserie());	
				detallepedidopuntoventaAux.setcantidad(this.detallepedidopuntoventa.getcantidad());	
				detallepedidopuntoventaAux.setprecio(this.detallepedidopuntoventa.getprecio());	
				detallepedidopuntoventaAux.setdescuento(this.detallepedidopuntoventa.getdescuento());	
				detallepedidopuntoventaAux.setdescuento_valor(this.detallepedidopuntoventa.getdescuento_valor());	
				detallepedidopuntoventaAux.setiva(this.detallepedidopuntoventa.getiva());	
				detallepedidopuntoventaAux.setiva_valor(this.detallepedidopuntoventa.getiva_valor());	
				detallepedidopuntoventaAux.setice(this.detallepedidopuntoventa.getice());	
				detallepedidopuntoventaAux.setice_valor(this.detallepedidopuntoventa.getice_valor());	
				detallepedidopuntoventaAux.setsub_total(this.detallepedidopuntoventa.getsub_total());	
				detallepedidopuntoventaAux.settotal(this.detallepedidopuntoventa.gettotal());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallepedidopuntoventaAux,detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallepedidopuntoventaAux,detallepedidopuntoventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detallepedidopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepedidopuntoventaLogic.saveDetallePedidoPuntoVentas();//WithConnection
						//detallepedidopuntoventaLogic.getSetVersionRowDetallePedidoPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallepedidopuntoventa,detallepedidopuntoventaAux);
					
					this.refrescarForeignKeysDescripcionesDetallePedidoPuntoVenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallepedidopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallepedidopuntoventaLogic.saveDetallePedidoPuntoVentaRelaciones(detallepedidopuntoventaAux);//WithConnection
								//detallepedidopuntoventaLogic.getSetVersionRowDetallePedidoPuntoVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallepedidopuntoventa,detallepedidopuntoventaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallepedidopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallepedidopuntoventaAux,detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallepedidopuntoventaAux,detallepedidopuntoventas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallepedidopuntoventa,detallepedidopuntoventaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detallepedidopuntoventaAux=new  DetallePedidoPuntoVenta();
				
				detallepedidopuntoventaAux.setIsNew(false);
				detallepedidopuntoventaAux.setIsChanged(false);
				
				detallepedidopuntoventaAux.setIsDeleted(true);
				
				detallepedidopuntoventaAux.setId(this.detallepedidopuntoventa.getId());	
				detallepedidopuntoventaAux.setVersionRow(this.detallepedidopuntoventa.getVersionRow());	
				detallepedidopuntoventaAux.setid_empresa(this.detallepedidopuntoventa.getid_empresa());	
				detallepedidopuntoventaAux.setid_sucursal(this.detallepedidopuntoventa.getid_sucursal());	
				detallepedidopuntoventaAux.setid_pedido_punto_venta(this.detallepedidopuntoventa.getid_pedido_punto_venta());	
				detallepedidopuntoventaAux.setid_bodega(this.detallepedidopuntoventa.getid_bodega());	
				detallepedidopuntoventaAux.setid_producto(this.detallepedidopuntoventa.getid_producto());	
				detallepedidopuntoventaAux.setid_unidad(this.detallepedidopuntoventa.getid_unidad());	
				detallepedidopuntoventaAux.setserie(this.detallepedidopuntoventa.getserie());	
				detallepedidopuntoventaAux.setcantidad(this.detallepedidopuntoventa.getcantidad());	
				detallepedidopuntoventaAux.setprecio(this.detallepedidopuntoventa.getprecio());	
				detallepedidopuntoventaAux.setdescuento(this.detallepedidopuntoventa.getdescuento());	
				detallepedidopuntoventaAux.setdescuento_valor(this.detallepedidopuntoventa.getdescuento_valor());	
				detallepedidopuntoventaAux.setiva(this.detallepedidopuntoventa.getiva());	
				detallepedidopuntoventaAux.setiva_valor(this.detallepedidopuntoventa.getiva_valor());	
				detallepedidopuntoventaAux.setice(this.detallepedidopuntoventa.getice());	
				detallepedidopuntoventaAux.setice_valor(this.detallepedidopuntoventa.getice_valor());	
				detallepedidopuntoventaAux.setsub_total(this.detallepedidopuntoventa.getsub_total());	
				detallepedidopuntoventaAux.settotal(this.detallepedidopuntoventa.gettotal());	
				
				if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detallepedidopuntoventaAux.getId()>=0) {	
						this.detallepedidopuntoventasEliminados.add(detallepedidopuntoventaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detallepedidopuntoventaAux,detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallepedidopuntoventaAux,detallepedidopuntoventas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detallepedidopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepedidopuntoventaLogic.saveDetallePedidoPuntoVentas();//WithConnection
						//detallepedidopuntoventaLogic.getSetVersionRowDetallePedidoPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallepedidopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallepedidopuntoventaLogic.saveDetallePedidoPuntoVentaRelaciones(detallepedidopuntoventaAux);//WithConnection
								//detallepedidopuntoventaLogic.getSetVersionRowDetallePedidoPuntoVentas();//WithConnection
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
							if(this.detallepedidopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detallepedidopuntoventaAux,detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detallepedidopuntoventaAux,detallepedidopuntoventas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().addAll(this.detallepedidopuntoventasEliminados);
					
					detallepedidopuntoventaLogic.saveDetallePedidoPuntoVentas();//WithConnection
					//detallepedidopuntoventaLogic.getSetVersionRowDetallePedidoPuntoVentas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetallePedidoPuntoVenta();
				
				this.detallepedidopuntoventasEliminados= new ArrayList<DetallePedidoPuntoVenta>();		
			}
			
			if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Pedido GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Pedido",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detallepedidopuntoventa=detallepedidopuntoventaAux;
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
      		//this.finishProcessDetallePedidoPuntoVenta();
      	}
		
	}	
	
	public void actualizarRelaciones(DetallePedidoPuntoVenta detallepedidopuntoventaLocal) throws Exception {
		
		if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetallePedidoPuntoVenta detallepedidopuntoventaLocal) throws Exception {	
		if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detallepedidopuntoventaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				detallepedidopuntoventaLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PedidoPuntoVentaDetalleFormJInternalFrame.class)) {
				PedidoPuntoVentaBeanSwingJInternalFrame pedidopuntoventaBeanSwingJInternalFrameLocal=(PedidoPuntoVentaBeanSwingJInternalFrame) ((PedidoPuntoVentaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				pedidopuntoventaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPedidoPuntoVenta(pedidopuntoventaBeanSwingJInternalFrameLocal.getpedidopuntoventa(),true);
				pedidopuntoventaBeanSwingJInternalFrameLocal.actualizarLista(pedidopuntoventaBeanSwingJInternalFrameLocal.pedidopuntoventa,this.pedidopuntoventasForeignKey);

				pedidopuntoventaBeanSwingJInternalFrameLocal.actualizarRelaciones(pedidopuntoventaBeanSwingJInternalFrameLocal.pedidopuntoventa);

				detallepedidopuntoventaLocal.setPedidoPuntoVenta(pedidopuntoventaBeanSwingJInternalFrameLocal.pedidopuntoventa);

				this.addItemDefectoCombosForeignKeyPedidoPuntoVenta();
				this.cargarCombosFramePedidoPuntoVentasForeignKey("Formulario");
				this.setActualPedidoPuntoVentaForeignKey(pedidopuntoventaBeanSwingJInternalFrameLocal.pedidopuntoventa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				detallepedidopuntoventaLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				detallepedidopuntoventaLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				detallepedidopuntoventaLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetallePedidoPuntoVentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detallepedidopuntoventaValidator.getInvalidValues(this.detallepedidopuntoventa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetallePedidoPuntoVenta detallepedidopuntoventa,List<DetallePedidoPuntoVenta> detallepedidopuntoventas) throws Exception {
		try	{		
			DetallePedidoPuntoVentaConstantesFunciones.actualizarLista(detallepedidopuntoventa,detallepedidopuntoventas,this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetallePedidoPuntoVenta detallepedidopuntoventa,List<DetallePedidoPuntoVenta> detallepedidopuntoventas) throws Exception {
		try	{			
			DetallePedidoPuntoVentaConstantesFunciones.actualizarSelectedLista(detallepedidopuntoventa,detallepedidopuntoventas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetallePedidoPuntoVenta> detallepedidopuntoventasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detallepedidopuntoventasLocal=this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detallepedidopuntoventasLocal=this.detallepedidopuntoventas;
			}
			//ARCHITECTURE
		
			for(DetallePedidoPuntoVenta detallepedidopuntoventaLocal:detallepedidopuntoventasLocal) {
				if(this.permiteMantenimiento(detallepedidopuntoventaLocal) && detallepedidopuntoventaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetallePedidoPuntoVentaConstantesFunciones.getDetallePedidoPuntoVentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetallePedidoPuntoVentaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelid_empresaDetallePedidoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePedidoPuntoVentaConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelid_sucursalDetallePedidoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePedidoPuntoVentaConstantesFunciones.IDPEDIDOPUNTOVENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelid_pedido_punto_ventaDetallePedidoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePedidoPuntoVentaConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelid_bodegaDetallePedidoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePedidoPuntoVentaConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelid_productoDetallePedidoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePedidoPuntoVentaConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelid_unidadDetallePedidoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePedidoPuntoVentaConstantesFunciones.SERIE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelserieDetallePedidoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePedidoPuntoVentaConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelcantidadDetallePedidoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePedidoPuntoVentaConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelprecioDetallePedidoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePedidoPuntoVentaConstantesFunciones.DESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabeldescuentoDetallePedidoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePedidoPuntoVentaConstantesFunciones.DESCUENTOVALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabeldescuento_valorDetallePedidoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePedidoPuntoVentaConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelivaDetallePedidoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePedidoPuntoVentaConstantesFunciones.IVAVALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabeliva_valorDetallePedidoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePedidoPuntoVentaConstantesFunciones.ICE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabeliceDetallePedidoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePedidoPuntoVentaConstantesFunciones.ICEVALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelice_valorDetallePedidoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePedidoPuntoVentaConstantesFunciones.SUBTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelsub_totalDetallePedidoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePedidoPuntoVentaConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabeltotalDetallePedidoPuntoVenta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelid_empresaDetallePedidoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelid_sucursalDetallePedidoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelid_pedido_punto_ventaDetallePedidoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelid_bodegaDetallePedidoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelid_productoDetallePedidoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelid_unidadDetallePedidoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelserieDetallePedidoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelcantidadDetallePedidoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelprecioDetallePedidoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabeldescuentoDetallePedidoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabeldescuento_valorDetallePedidoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelivaDetallePedidoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabeliva_valorDetallePedidoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabeliceDetallePedidoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelice_valorDetallePedidoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelsub_totalDetallePedidoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabeltotalDetallePedidoPuntoVenta,"");
		
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
		this.iIdNuevoDetallePedidoPuntoVenta--;	
		
		
		this.detallepedidopuntoventaAux=new DetallePedidoPuntoVenta();
		
		this.detallepedidopuntoventaAux.setId(this.iIdNuevoDetallePedidoPuntoVenta);
		this.detallepedidopuntoventaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().add(this.detallepedidopuntoventaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detallepedidopuntoventas.add(this.detallepedidopuntoventaAux);
		}
		//ARCHITECTURE
		
		this.detallepedidopuntoventa=this.detallepedidopuntoventaAux;
		
		if(DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
			this.setVariablesObjetoActualToFormularioForeignKeyDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
		}
				
		//this.setDefaultControlesDetallePedidoPuntoVenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetallePedidoPuntoVenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetallePedidoPuntoVenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetallePedidoPuntoVenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventaBean,this.detallepedidopuntoventa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
			classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detallepedidopuntoventaReturnGeneral=detallepedidopuntoventaLogic.procesarEventosDetallePedidoPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas(),this.detallepedidopuntoventa,this.detallepedidopuntoventaParameterGeneral,this.isEsNuevoDetallePedidoPuntoVenta,classes);//this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVenta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetallePedidoPuntoVenta(this.detallepedidopuntoventaReturnGeneral,this.detallepedidopuntoventaBean,false);
		
		if(this.detallepedidopuntoventaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetallePedidoPuntoVenta(this.detallepedidopuntoventaReturnGeneral.getDetallePedidoPuntoVenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetallePedidoPuntoVenta(this.detallepedidopuntoventaReturnGeneral.getDetallePedidoPuntoVenta());
		}
		
		if(this.detallepedidopuntoventaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetallePedidoPuntoVenta(this.detallepedidopuntoventaReturnGeneral.getDetallePedidoPuntoVenta(),classes);//this.detallepedidopuntoventaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetallePedidoPuntoVenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetallePedidoPuntoVenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.RecargarFormDetallePedidoPuntoVenta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
						
			if(detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetallePedidoPuntoVenta();
			}
			
			this.actualizarVisualTableDatosDetallePedidoPuntoVenta();
			
			this.jTableDatosDetallePedidoPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoDetallePedidoPuntoVenta(), this.getIndiceNuevoDetallePedidoPuntoVenta());
			
			this.seleccionarFilaTablaDetallePedidoPuntoVentaActual();
						
			this.actualizarEstadoCeldasBotonesDetallePedidoPuntoVenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetallePedidoPuntoVenta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldserieDetallePedidoPuntoVenta.setEnabled(isHabilitar && this.detallepedidopuntoventaConstantesFunciones.activarserieDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldcantidadDetallePedidoPuntoVenta.setEnabled(isHabilitar && this.detallepedidopuntoventaConstantesFunciones.activarcantidadDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldprecioDetallePedidoPuntoVenta.setEnabled(isHabilitar && this.detallepedidopuntoventaConstantesFunciones.activarprecioDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuentoDetallePedidoPuntoVenta.setEnabled(isHabilitar && this.detallepedidopuntoventaConstantesFunciones.activardescuentoDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuento_valorDetallePedidoPuntoVenta.setEnabled(isHabilitar && this.detallepedidopuntoventaConstantesFunciones.activardescuento_valorDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldivaDetallePedidoPuntoVenta.setEnabled(isHabilitar && this.detallepedidopuntoventaConstantesFunciones.activarivaDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiva_valorDetallePedidoPuntoVenta.setEnabled(isHabilitar && this.detallepedidopuntoventaConstantesFunciones.activariva_valorDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiceDetallePedidoPuntoVenta.setEnabled(isHabilitar && this.detallepedidopuntoventaConstantesFunciones.activariceDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldice_valorDetallePedidoPuntoVenta.setEnabled(isHabilitar && this.detallepedidopuntoventaConstantesFunciones.activarice_valorDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldsub_totalDetallePedidoPuntoVenta.setEnabled(isHabilitar && this.detallepedidopuntoventaConstantesFunciones.activarsub_totalDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldtotalDetallePedidoPuntoVenta.setEnabled(isHabilitar && this.detallepedidopuntoventaConstantesFunciones.activartotalDetallePedidoPuntoVenta);	
		//
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_empresaDetallePedidoPuntoVenta.setEnabled(isHabilitar && this.detallepedidopuntoventaConstantesFunciones.activarid_empresaDetallePedidoPuntoVenta);//
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_sucursalDetallePedidoPuntoVenta.setEnabled(isHabilitar && this.detallepedidopuntoventaConstantesFunciones.activarid_sucursalDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.setEnabled(isHabilitar && this.detallepedidopuntoventaConstantesFunciones.activarid_pedido_punto_ventaDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta.setEnabled(isHabilitar && this.detallepedidopuntoventaConstantesFunciones.activarid_bodegaDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta.setEnabled(isHabilitar && this.detallepedidopuntoventaConstantesFunciones.activarid_productoDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_unidadDetallePedidoPuntoVenta.setEnabled(isHabilitar && this.detallepedidopuntoventaConstantesFunciones.activarid_unidadDetallePedidoPuntoVenta);
	};
	
	public void setDefaultControlesDetallePedidoPuntoVenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetallePedidoPuntoVenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detallepedidopuntoventaSessionBean.setConGuardarRelaciones(true);			
			this.detallepedidopuntoventaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTabbedPaneRelacionesDetallePedidoPuntoVenta.setVisible(true);
			
					
		} else {
			//this.detallepedidopuntoventaSessionBean.setConGuardarRelaciones(false);			
			this.detallepedidopuntoventaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTabbedPaneRelacionesDetallePedidoPuntoVenta.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetallePedidoPuntoVenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas()) {
				if(detallepedidopuntoventaAux.getId().equals(this.iIdNuevoDetallePedidoPuntoVenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:this.detallepedidopuntoventas) {
				if(detallepedidopuntoventaAux.getId().equals(this.iIdNuevoDetallePedidoPuntoVenta)) {
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
	
	public int getIndiceActualDetallePedidoPuntoVenta(DetallePedidoPuntoVenta detallepedidopuntoventa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas()) {
				if(detallepedidopuntoventaAux.getId().equals(detallepedidopuntoventa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:this.detallepedidopuntoventas) {
				if(detallepedidopuntoventaAux.getId().equals(detallepedidopuntoventa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetallePedidoPuntoVenta(DetallePedidoPuntoVenta detallepedidopuntoventaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas()) {
				if(detallepedidopuntoventaAux.getDetallePedidoPuntoVentaOriginal().getId().equals(detallepedidopuntoventaOriginal.getId())) {
					existe=true;
					detallepedidopuntoventaOriginal.setId(detallepedidopuntoventaAux.getId());
					detallepedidopuntoventaOriginal.setVersionRow(detallepedidopuntoventaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:this.detallepedidopuntoventas) {
				if(detallepedidopuntoventaAux.getDetallePedidoPuntoVentaOriginal().getId().equals(detallepedidopuntoventaOriginal.getId())) {
					existe=true;
					detallepedidopuntoventaOriginal.setId(detallepedidopuntoventaAux.getId());
					detallepedidopuntoventaOriginal.setVersionRow(detallepedidopuntoventaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetallePedidoPuntoVenta(Boolean esParaCancelar) throws Exception {
		detallepedidopuntoventasAux=new ArrayList<DetallePedidoPuntoVenta>();
		detallepedidopuntoventaAux=new DetallePedidoPuntoVenta();
		
		if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas()) {
					if(detallepedidopuntoventaAux.getId()<0) {
						detallepedidopuntoventasAux.add(detallepedidopuntoventaAux);
					}		
				}
				this.iIdNuevoDetallePedidoPuntoVenta=0L;
				this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().removeAll(detallepedidopuntoventasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:this.detallepedidopuntoventas) {
					if(detallepedidopuntoventaAux.getId()<0) {
						detallepedidopuntoventasAux.add(detallepedidopuntoventaAux);
					}		
				}
				this.iIdNuevoDetallePedidoPuntoVenta=0L;
				this.detallepedidopuntoventas.removeAll(detallepedidopuntoventasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetallePedidoPuntoVenta 
					&& this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().size()>0
					) {
					detallepedidopuntoventaAux=this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().get(this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().size() - 1);
				
					if(detallepedidopuntoventaAux.getId()<0) {
						this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().remove(detallepedidopuntoventaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetallePedidoPuntoVenta && this.detallepedidopuntoventas.size()>0) {
					detallepedidopuntoventaAux=this.detallepedidopuntoventas.get(this.detallepedidopuntoventas.size() - 1);
				
					if(detallepedidopuntoventaAux.getId()<0) {
						this.detallepedidopuntoventas.remove(detallepedidopuntoventaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetallePedidoPuntoVenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detallepedidopuntoventa.getId()<0) {
				this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().remove(this.detallepedidopuntoventa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detallepedidopuntoventa.getId()<0) {
				this.detallepedidopuntoventas.remove(this.detallepedidopuntoventa);
			}
		}			
	}
	
	public void setEstadosInicialesDetallePedidoPuntoVenta(List<DetallePedidoPuntoVenta> detallepedidopuntoventasAux) throws Exception {
		DetallePedidoPuntoVentaConstantesFunciones.setEstadosInicialesDetallePedidoPuntoVenta(detallepedidopuntoventasAux);
	}
	
	public void setEstadosInicialesDetallePedidoPuntoVenta(DetallePedidoPuntoVenta detallepedidopuntoventaAux) throws Exception {
		DetallePedidoPuntoVentaConstantesFunciones.setEstadosInicialesDetallePedidoPuntoVenta(detallepedidopuntoventaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetallePedidoPuntoVentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetallePedidoPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetallePedidoPuntoVentaActual()) {
				if(!this.isEsNuevoDetallePedidoPuntoVenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetallePedidoPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetallePedidoPuntoVenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetallePedidoPuntoVentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Pedido ?", "MANTENIMIENTO DE Detalle Pedido", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetallePedidoPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetallePedidoPuntoVenta detallepedidopuntoventa) throws Exception {
		DetallePedidoPuntoVentaConstantesFunciones.seleccionarAsignar(this.detallepedidopuntoventa,detallepedidopuntoventa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetallePedidoPuntoVenta=this.isPermisoActualizarOriginalDetallePedidoPuntoVenta;
			
			
			this.seleccionarAsignar(detallepedidopuntoventa);
			
			

			idProductoActual=detallepedidopuntoventa.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetallePedidoPuntoVentaConstantesFunciones.quitarEspaciosDetallePedidoPuntoVenta(this.detallepedidopuntoventa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetallePedidoPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detallepedidopuntoventaSessionBean.setsFuncionBusquedaRapida(this.detallepedidopuntoventaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoDetallePedidoPuntoVenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetallePedidoPuntoVenta(esParaCancelar);				
				this.cancelarNuevoDetallePedidoPuntoVenta(esParaCancelar);								
			}
			
			this.detallepedidopuntoventa=new DetallePedidoPuntoVenta();
			
			this.inicializarDetallePedidoPuntoVenta();
			
			this.actualizarEstadoCeldasBotonesDetallePedidoPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetallePedidoPuntoVenta() throws Exception {
		try {
			DetallePedidoPuntoVentaConstantesFunciones.inicializarDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
			
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
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetallePedidoPuntoVentas(String sAccionBusqueda,List<DetallePedidoPuntoVenta> detallepedidopuntoventasParaReportes) throws Exception {
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
					sPathReporteFinal="DetallePedidoPuntoVenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetallePedidoPuntoVentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetallePedidoPuntoVentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetallePedidoPuntoVenta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Pedidos");		
		parameters.put("busquedapor", DetallePedidoPuntoVentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetallePedidoPuntoVenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetallePedidoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetallePedidoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetallePedidoPuntoVenta=new JRBeanArrayDataSource(DetallePedidoPuntoVentaJInternalFrame.TraerDetallePedidoPuntoVentaBeans(detallepedidopuntoventasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetallePedidoPuntoVenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetallePedidoPuntoVentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetallePedidoPuntoVentaBean.TraerDetallePedidoPuntoVentaBeans(detallepedidopuntoventasParaReportes).toArray()));
							
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
				this.generarExcelReporteDetallePedidoPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,detallepedidopuntoventasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetallePedidoPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,detallepedidopuntoventasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetallePedidoPuntoVentaActionPerformed(null);
					//this.generarExcelReporteDetallePedidoPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,detallepedidopuntoventasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetallePedidoPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,detallepedidopuntoventasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetallePedidoPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,detallepedidopuntoventasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetallePedidoPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,detallepedidopuntoventasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetallePedidoPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<DetallePedidoPuntoVenta> detallepedidopuntoventasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepedidopuntoventa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetallePedidoPuntoVentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetallePedidoPuntoVenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetallePedidoPuntoVenta detallepedidopuntoventa : detallepedidopuntoventasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetallePedidoPuntoVentaConstantesFunciones.generarExcelReporteDataDetallePedidoPuntoVenta("NORMAL",row,workbook,detallepedidopuntoventa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pedido",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetallePedidoPuntoVenta(String sTipo,Row row,Workbook workbook) {
		
		DetallePedidoPuntoVentaConstantesFunciones.generarExcelReporteHeaderDetallePedidoPuntoVenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetallePedidoPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<DetallePedidoPuntoVenta> detallepedidopuntoventasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepedidopuntoventa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetallePedidoPuntoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetallePedidoPuntoVenta detallepedidopuntoventa : detallepedidopuntoventasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.getDetallePedidoPuntoVentaDescripcion(detallepedidopuntoventa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepedidopuntoventa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepedidopuntoventa.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPEDIDOPUNTOVENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPEDIDOPUNTOVENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepedidopuntoventa.getpedidopuntoventa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepedidopuntoventa.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepedidopuntoventa.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepedidopuntoventa.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePedidoPuntoVentaConstantesFunciones.LABEL_SERIE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_SERIE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepedidopuntoventa.getserie());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePedidoPuntoVentaConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepedidopuntoventa.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePedidoPuntoVentaConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepedidopuntoventa.getprecio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepedidopuntoventa.getdescuento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepedidopuntoventa.getdescuento_valor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepedidopuntoventa.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVAVALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVAVALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepedidopuntoventa.getiva_valor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepedidopuntoventa.getice());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICEVALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICEVALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepedidopuntoventa.getice_valor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePedidoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepedidopuntoventa.getsub_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePedidoPuntoVentaConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepedidopuntoventa.gettotal());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pedido",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetallePedidoPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<DetallePedidoPuntoVenta> detallepedidopuntoventasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetallePedidoPuntoVenta> detallepedidopuntoventasRespaldo=null;
		
		classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detallepedidopuntoventaLogic.setDatosCliente(this.datosCliente);
		this.detallepedidopuntoventaLogic.setDatosDeep(this.datosDeep);
		this.detallepedidopuntoventaLogic.setIsConDeep(true);
		
		detallepedidopuntoventasRespaldo=this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas();
		
		this.detallepedidopuntoventaLogic.setDetallePedidoPuntoVentas(detallepedidopuntoventasParaReportes);	
		this.detallepedidopuntoventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detallepedidopuntoventasParaReportes=this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas();
		this.detallepedidopuntoventaLogic.setDetallePedidoPuntoVentas(detallepedidopuntoventasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepedidopuntoventa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetallePedidoPuntoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetallePedidoPuntoVenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetallePedidoPuntoVenta detallepedidopuntoventa : detallepedidopuntoventasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetallePedidoPuntoVenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetallePedidoPuntoVentaConstantesFunciones.generarExcelReporteDataDetallePedidoPuntoVenta("NORMAL",row,workbook,detallepedidopuntoventa,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.getDetallePedidoPuntoVentaDescripcion(detallepedidopuntoventa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pedido",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetallePedidoPuntoVenta() throws Exception {		
		this.startProcessDetallePedidoPuntoVenta(true);
	}
	
	public void startProcessDetallePedidoPuntoVenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetallePedidoPuntoVenta ,this.jPanelParametrosReportesDetallePedidoPuntoVenta, this.jScrollPanelDatosDetallePedidoPuntoVenta,this.jPanelPaginacionDetallePedidoPuntoVenta, this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta, this.jPanelAccionesDetallePedidoPuntoVenta,this.jPanelAccionesFormularioDetallePedidoPuntoVenta,this.jmenuBarDetallePedidoPuntoVenta,this.jmenuBarDetalleDetallePedidoPuntoVenta,this.jTtoolBarDetallePedidoPuntoVenta,this.jTtoolBarDetalleDetallePedidoPuntoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasDetallePedidoPuntoVenta=this.jTabbedPaneBusquedasDetallePedidoPuntoVenta; 
		
		final JPanel jPanelParametrosReportesDetallePedidoPuntoVenta=this.jPanelParametrosReportesDetallePedidoPuntoVenta;
		//final JScrollPane jScrollPanelDatosDetallePedidoPuntoVenta=this.jScrollPanelDatosDetallePedidoPuntoVenta;
		final JTable jTableDatosDetallePedidoPuntoVenta=this.jTableDatosDetallePedidoPuntoVenta;		
		final JPanel jPanelPaginacionDetallePedidoPuntoVenta=this.jPanelPaginacionDetallePedidoPuntoVenta;
		//final JScrollPane jScrollPanelDatosEdicionDetallePedidoPuntoVenta=this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta;
		final JPanel jPanelAccionesDetallePedidoPuntoVenta=this.jPanelAccionesDetallePedidoPuntoVenta;
		
		JPanel jPanelCamposAuxiliarDetallePedidoPuntoVenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetallePedidoPuntoVenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
			jPanelCamposAuxiliarDetallePedidoPuntoVenta=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPanelCamposDetallePedidoPuntoVenta;
			jPanelAccionesFormularioAuxiliarDetallePedidoPuntoVenta=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPanelAccionesFormularioDetallePedidoPuntoVenta;
		}
		
		final JPanel jPanelCamposDetallePedidoPuntoVenta=jPanelCamposAuxiliarDetallePedidoPuntoVenta;
		final JPanel jPanelAccionesFormularioDetallePedidoPuntoVenta=jPanelAccionesFormularioAuxiliarDetallePedidoPuntoVenta;
		
		
		final JMenuBar jmenuBarDetallePedidoPuntoVenta=this.jmenuBarDetallePedidoPuntoVenta;
		final JToolBar jTtoolBarDetallePedidoPuntoVenta=this.jTtoolBarDetallePedidoPuntoVenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetallePedidoPuntoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetallePedidoPuntoVenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
			jmenuBarDetalleAuxiliarDetallePedidoPuntoVenta=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jmenuBarDetalleDetallePedidoPuntoVenta;
			jTtoolBarDetalleAuxiliarDetallePedidoPuntoVenta=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTtoolBarDetalleDetallePedidoPuntoVenta;
		}
		
		final JMenuBar jmenuBarDetalleDetallePedidoPuntoVenta=jmenuBarDetalleAuxiliarDetallePedidoPuntoVenta;
		final JToolBar jTtoolBarDetalleDetallePedidoPuntoVenta=jTtoolBarDetalleAuxiliarDetallePedidoPuntoVenta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetallePedidoPuntoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetallePedidoPuntoVenta;
			processRunnable.jTableDatos=jTableDatosDetallePedidoPuntoVenta;
			processRunnable.jPanelCampos=jPanelCamposDetallePedidoPuntoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetallePedidoPuntoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesDetallePedidoPuntoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetallePedidoPuntoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarDetallePedidoPuntoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetallePedidoPuntoVenta;
			processRunnable.jTtoolBar=jTtoolBarDetallePedidoPuntoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetallePedidoPuntoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetallePedidoPuntoVenta ,jPanelParametrosReportesDetallePedidoPuntoVenta,jTableDatosDetallePedidoPuntoVenta, /*jScrollPanelDatosDetallePedidoPuntoVenta,*/jPanelCamposDetallePedidoPuntoVenta,jPanelPaginacionDetallePedidoPuntoVenta, /*jScrollPanelDatosEdicionDetallePedidoPuntoVenta,*/ jPanelAccionesDetallePedidoPuntoVenta,jPanelAccionesFormularioDetallePedidoPuntoVenta,jmenuBarDetallePedidoPuntoVenta,jmenuBarDetalleDetallePedidoPuntoVenta,jTtoolBarDetallePedidoPuntoVenta,jTtoolBarDetalleDetallePedidoPuntoVenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetallePedidoPuntoVenta ,jPanelParametrosReportesDetallePedidoPuntoVenta, jScrollPanelDatosDetallePedidoPuntoVenta,jPanelPaginacionDetallePedidoPuntoVenta, jScrollPanelDatosEdicionDetallePedidoPuntoVenta, jPanelAccionesDetallePedidoPuntoVenta,jPanelAccionesFormularioDetallePedidoPuntoVenta,jmenuBarDetallePedidoPuntoVenta,jmenuBarDetalleDetallePedidoPuntoVenta,jTtoolBarDetallePedidoPuntoVenta,jTtoolBarDetalleDetallePedidoPuntoVenta);
						
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
	
	public void finishProcessDetallePedidoPuntoVenta() {// throws Exception 
		this.finishProcessDetallePedidoPuntoVenta(true);
	}
	
	public void finishProcessDetallePedidoPuntoVenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetallePedidoPuntoVenta ,this.jPanelParametrosReportesDetallePedidoPuntoVenta, this.jScrollPanelDatosDetallePedidoPuntoVenta,this.jPanelPaginacionDetallePedidoPuntoVenta, this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta, this.jPanelAccionesDetallePedidoPuntoVenta,this.jPanelAccionesFormularioDetallePedidoPuntoVenta,this.jmenuBarDetallePedidoPuntoVenta,this.jmenuBarDetalleDetallePedidoPuntoVenta,this.jTtoolBarDetallePedidoPuntoVenta,this.jTtoolBarDetalleDetallePedidoPuntoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasDetallePedidoPuntoVenta=this.jTabbedPaneBusquedasDetallePedidoPuntoVenta; 
		
		final JPanel jPanelParametrosReportesDetallePedidoPuntoVenta=this.jPanelParametrosReportesDetallePedidoPuntoVenta;
		//final JScrollPane jScrollPanelDatosDetallePedidoPuntoVenta=this.jScrollPanelDatosDetallePedidoPuntoVenta;
		final JTable jTableDatosDetallePedidoPuntoVenta=this.jTableDatosDetallePedidoPuntoVenta;		
		final JPanel jPanelPaginacionDetallePedidoPuntoVenta=this.jPanelPaginacionDetallePedidoPuntoVenta;
		//final JScrollPane jScrollPanelDatosEdicionDetallePedidoPuntoVenta=this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta;
		final JPanel jPanelAccionesDetallePedidoPuntoVenta=this.jPanelAccionesDetallePedidoPuntoVenta;
		
		JPanel jPanelCamposAuxiliarDetallePedidoPuntoVenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetallePedidoPuntoVenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
			jPanelCamposAuxiliarDetallePedidoPuntoVenta=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPanelCamposDetallePedidoPuntoVenta;
			jPanelAccionesFormularioAuxiliarDetallePedidoPuntoVenta=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPanelAccionesFormularioDetallePedidoPuntoVenta;
		}
		
		final JPanel jPanelCamposDetallePedidoPuntoVenta=jPanelCamposAuxiliarDetallePedidoPuntoVenta;
		final JPanel jPanelAccionesFormularioDetallePedidoPuntoVenta=jPanelAccionesFormularioAuxiliarDetallePedidoPuntoVenta;
		
		
		final JMenuBar jmenuBarDetallePedidoPuntoVenta=this.jmenuBarDetallePedidoPuntoVenta;		
		final JToolBar jTtoolBarDetallePedidoPuntoVenta=this.jTtoolBarDetallePedidoPuntoVenta;
				
		JMenuBar jmenuBarDetalleAuxiliarDetallePedidoPuntoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetallePedidoPuntoVenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
			jmenuBarDetalleAuxiliarDetallePedidoPuntoVenta=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jmenuBarDetalleDetallePedidoPuntoVenta;
			jTtoolBarDetalleAuxiliarDetallePedidoPuntoVenta=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTtoolBarDetalleDetallePedidoPuntoVenta;		
		}
		
		final JMenuBar jmenuBarDetalleDetallePedidoPuntoVenta=jmenuBarDetalleAuxiliarDetallePedidoPuntoVenta;
		final JToolBar jTtoolBarDetalleDetallePedidoPuntoVenta=jTtoolBarDetalleAuxiliarDetallePedidoPuntoVenta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetallePedidoPuntoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetallePedidoPuntoVenta;
			processRunnable.jTableDatos=jTableDatosDetallePedidoPuntoVenta;
			processRunnable.jPanelCampos=jPanelCamposDetallePedidoPuntoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetallePedidoPuntoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesDetallePedidoPuntoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetallePedidoPuntoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarDetallePedidoPuntoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetallePedidoPuntoVenta;
			processRunnable.jTtoolBar=jTtoolBarDetallePedidoPuntoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetallePedidoPuntoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetallePedidoPuntoVenta ,jPanelParametrosReportesDetallePedidoPuntoVenta, jTableDatosDetallePedidoPuntoVenta,/*jScrollPanelDatosDetallePedidoPuntoVenta,*/jPanelCamposDetallePedidoPuntoVenta,jPanelPaginacionDetallePedidoPuntoVenta, /*jScrollPanelDatosEdicionDetallePedidoPuntoVenta,*/ jPanelAccionesDetallePedidoPuntoVenta,jPanelAccionesFormularioDetallePedidoPuntoVenta,jmenuBarDetallePedidoPuntoVenta,jmenuBarDetalleDetallePedidoPuntoVenta,jTtoolBarDetallePedidoPuntoVenta,jTtoolBarDetalleDetallePedidoPuntoVenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetallePedidoPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetallePedidoPuntoVenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetallePedidoPuntoVenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetallePedidoPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePedidoPuntoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetallePedidoPuntoVenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetallePedidoPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePedidoPuntoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetallePedidoPuntoVenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detallepedidopuntoventaConstantesFunciones.getsFinalQueryDetallePedidoPuntoVenta();
		String  finalQueryPaginacionTodos=this.detallepedidopuntoventaConstantesFunciones.getsFinalQueryDetallePedidoPuntoVenta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetallePedidoPuntoVentaConstantesFunciones.getArrayColumnasGlobalesNoDetallePedidoPuntoVenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetallePedidoPuntoVentaConstantesFunciones.getArrayColumnasGlobalesDetallePedidoPuntoVenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetallePedidoPuntoVentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detallepedidopuntoventasEliminados= new ArrayList<DetallePedidoPuntoVenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetallePedidoPuntoVenta();
		
				///*DetallePedidoPuntoVentaSessionBean*/this.detallepedidopuntoventaSessionBean=new DetallePedidoPuntoVentaSessionBean();
			
			if(this.detallepedidopuntoventaSessionBean==null) {
				this.detallepedidopuntoventaSessionBean=new DetallePedidoPuntoVentaSessionBean();
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
					this.iNumeroPaginacion=DetallePedidoPuntoVentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesForeignKeysOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detallepedidopuntoventa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detallepedidopuntoventasAux= new ArrayList<DetallePedidoPuntoVenta>();
			
				
			detallepedidopuntoventaLogic.setDatosCliente(this.datosCliente);
			detallepedidopuntoventaLogic.setDatosDeep(this.datosDeep);
			detallepedidopuntoventaLogic.setIsConDeep(true);
			
			
			detallepedidopuntoventaLogic.getDetallePedidoPuntoVentaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detallepedidopuntoventaLogic.getTodosDetallePedidoPuntoVentas(finalQueryGlobal,pagination);
					
					//detallepedidopuntoventaLogic.getTodosDetallePedidoPuntoVentasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas()==null|| detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallepedidopuntoventasAux= new ArrayList<DetallePedidoPuntoVenta>();
							detallepedidopuntoventasAux.addAll(detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepedidopuntoventasAux= new ArrayList<DetallePedidoPuntoVenta>();
							detallepedidopuntoventasAux.addAll(detallepedidopuntoventas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallepedidopuntoventaLogic.getTodosDetallePedidoPuntoVentas(finalQueryGlobal+"",this.pagination);												
							
							//detallepedidopuntoventaLogic.getTodosDetallePedidoPuntoVentasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetallePedidoPuntoVentas("Todos",detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallepedidopuntoventaLogic.setDetallePedidoPuntoVentas(new ArrayList<DetallePedidoPuntoVenta>());					
							detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().addAll(detallepedidopuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepedidopuntoventas=new ArrayList<DetallePedidoPuntoVenta>();
							detallepedidopuntoventas.addAll(detallepedidopuntoventasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetallePedidoPuntoVenta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetallePedidoPuntoVenta=this.idActual;
				
				} else if(this.idDetallePedidoPuntoVentaActual!=null && this.idDetallePedidoPuntoVentaActual!=0L) {
					idDetallePedidoPuntoVenta=idDetallePedidoPuntoVentaActual;
				}
				
					
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndicePorId(idDetallePedidoPuntoVenta);
				
				this.detallepedidopuntoventas=new ArrayList<DetallePedidoPuntoVenta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detallepedidopuntoventaLogic.getEntity(idDetallePedidoPuntoVenta);
					
					//detallepedidopuntoventaLogic.getEntityWithConnection(idDetallePedidoPuntoVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepedidopuntoventaLogic.setDetallePedidoPuntoVentas(new ArrayList<DetallePedidoPuntoVenta>());
					detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().add(detallepedidopuntoventaLogic.getDetallePedidoPuntoVenta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepedidopuntoventas=new ArrayList<DetallePedidoPuntoVenta>();
					this.detallepedidopuntoventas.add(detallepedidopuntoventa);
				}
				
				if(detallepedidopuntoventaLogic.getDetallePedidoPuntoVenta()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallepedidopuntoventaLogic.getDetallePedidoPuntoVentasFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas()==null||detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallepedidopuntoventas==null|| detallepedidopuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepedidopuntoventasAux=new ArrayList<DetallePedidoPuntoVenta>();
						detallepedidopuntoventasAux.addAll(detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepedidopuntoventasAux=new ArrayList<DetallePedidoPuntoVenta>();
							detallepedidopuntoventasAux.addAll(detallepedidopuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallepedidopuntoventaLogic.getDetallePedidoPuntoVentasFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePedidoPuntoVentas("FK_IdBodega",detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePedidoPuntoVentas("FK_IdBodega",detallepedidopuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepedidopuntoventaLogic.setDetallePedidoPuntoVentas(new ArrayList<DetallePedidoPuntoVenta>());
						detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().addAll(detallepedidopuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepedidopuntoventas=new ArrayList<DetallePedidoPuntoVenta>();
							detallepedidopuntoventas.addAll(detallepedidopuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallepedidopuntoventaLogic.getDetallePedidoPuntoVentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas()==null||detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallepedidopuntoventas==null|| detallepedidopuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepedidopuntoventasAux=new ArrayList<DetallePedidoPuntoVenta>();
						detallepedidopuntoventasAux.addAll(detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepedidopuntoventasAux=new ArrayList<DetallePedidoPuntoVenta>();
							detallepedidopuntoventasAux.addAll(detallepedidopuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallepedidopuntoventaLogic.getDetallePedidoPuntoVentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePedidoPuntoVentas("FK_IdEmpresa",detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePedidoPuntoVentas("FK_IdEmpresa",detallepedidopuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepedidopuntoventaLogic.setDetallePedidoPuntoVentas(new ArrayList<DetallePedidoPuntoVenta>());
						detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().addAll(detallepedidopuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepedidopuntoventas=new ArrayList<DetallePedidoPuntoVenta>();
							detallepedidopuntoventas.addAll(detallepedidopuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPedidoPuntoVenta")) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdPedidoPuntoVenta(id_pedido_punto_ventaFK_IdPedidoPuntoVenta);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallepedidopuntoventaLogic.getDetallePedidoPuntoVentasFK_IdPedidoPuntoVenta(finalQueryGlobal,pagination,id_pedido_punto_ventaFK_IdPedidoPuntoVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdPedidoPuntoVenta(id_pedido_punto_ventaFK_IdPedidoPuntoVenta);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdPedidoPuntoVenta(id_pedido_punto_ventaFK_IdPedidoPuntoVenta);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas()==null||detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallepedidopuntoventas==null|| detallepedidopuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepedidopuntoventasAux=new ArrayList<DetallePedidoPuntoVenta>();
						detallepedidopuntoventasAux.addAll(detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepedidopuntoventasAux=new ArrayList<DetallePedidoPuntoVenta>();
							detallepedidopuntoventasAux.addAll(detallepedidopuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallepedidopuntoventaLogic.getDetallePedidoPuntoVentasFK_IdPedidoPuntoVenta(finalQueryGlobal,pagination,id_pedido_punto_ventaFK_IdPedidoPuntoVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdPedidoPuntoVenta(id_pedido_punto_ventaFK_IdPedidoPuntoVenta);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdPedidoPuntoVenta(id_pedido_punto_ventaFK_IdPedidoPuntoVenta);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePedidoPuntoVentas("FK_IdPedidoPuntoVenta",detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePedidoPuntoVentas("FK_IdPedidoPuntoVenta",detallepedidopuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepedidopuntoventaLogic.setDetallePedidoPuntoVentas(new ArrayList<DetallePedidoPuntoVenta>());
						detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().addAll(detallepedidopuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepedidopuntoventas=new ArrayList<DetallePedidoPuntoVenta>();
							detallepedidopuntoventas.addAll(detallepedidopuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallepedidopuntoventaLogic.getDetallePedidoPuntoVentasFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas()==null||detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallepedidopuntoventas==null|| detallepedidopuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepedidopuntoventasAux=new ArrayList<DetallePedidoPuntoVenta>();
						detallepedidopuntoventasAux.addAll(detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepedidopuntoventasAux=new ArrayList<DetallePedidoPuntoVenta>();
							detallepedidopuntoventasAux.addAll(detallepedidopuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallepedidopuntoventaLogic.getDetallePedidoPuntoVentasFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePedidoPuntoVentas("FK_IdProducto",detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePedidoPuntoVentas("FK_IdProducto",detallepedidopuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepedidopuntoventaLogic.setDetallePedidoPuntoVentas(new ArrayList<DetallePedidoPuntoVenta>());
						detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().addAll(detallepedidopuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepedidopuntoventas=new ArrayList<DetallePedidoPuntoVenta>();
							detallepedidopuntoventas.addAll(detallepedidopuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallepedidopuntoventaLogic.getDetallePedidoPuntoVentasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas()==null||detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallepedidopuntoventas==null|| detallepedidopuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepedidopuntoventasAux=new ArrayList<DetallePedidoPuntoVenta>();
						detallepedidopuntoventasAux.addAll(detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepedidopuntoventasAux=new ArrayList<DetallePedidoPuntoVenta>();
							detallepedidopuntoventasAux.addAll(detallepedidopuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallepedidopuntoventaLogic.getDetallePedidoPuntoVentasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePedidoPuntoVentas("FK_IdSucursal",detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePedidoPuntoVentas("FK_IdSucursal",detallepedidopuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepedidopuntoventaLogic.setDetallePedidoPuntoVentas(new ArrayList<DetallePedidoPuntoVenta>());
						detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().addAll(detallepedidopuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepedidopuntoventas=new ArrayList<DetallePedidoPuntoVenta>();
							detallepedidopuntoventas.addAll(detallepedidopuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidad")) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallepedidopuntoventaLogic.getDetallePedidoPuntoVentasFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas()==null||detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallepedidopuntoventas==null|| detallepedidopuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepedidopuntoventasAux=new ArrayList<DetallePedidoPuntoVenta>();
						detallepedidopuntoventasAux.addAll(detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepedidopuntoventasAux=new ArrayList<DetallePedidoPuntoVenta>();
							detallepedidopuntoventasAux.addAll(detallepedidopuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallepedidopuntoventaLogic.getDetallePedidoPuntoVentasFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePedidoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePedidoPuntoVentas("FK_IdUnidad",detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePedidoPuntoVentas("FK_IdUnidad",detallepedidopuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepedidopuntoventaLogic.setDetallePedidoPuntoVentas(new ArrayList<DetallePedidoPuntoVenta>());
						detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().addAll(detallepedidopuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepedidopuntoventas=new ArrayList<DetallePedidoPuntoVenta>();
							detallepedidopuntoventas.addAll(detallepedidopuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetallePedidoPuntoVenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetallePedidoPuntoVenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallepedidopuntoventas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallepedidopuntoventas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetallePedidoPuntoVenta detallepedidopuntoventa) {
		Boolean permite=true;
		
		if(this.detallepedidopuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetallePedidoPuntoVentaConstantesFunciones.getOrderByListaDetallePedidoPuntoVenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetallePedidoPuntoVentaConstantesFunciones.getOrderByListaDetallePedidoPuntoVenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePedidoPuntoVenta detallepedidopuntoventa:detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas()) {
				if(detallepedidopuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					detallepedidopuntoventaTotales=detallepedidopuntoventa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePedidoPuntoVenta detallepedidopuntoventa:this.detallepedidopuntoventas) {
				if(detallepedidopuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					detallepedidopuntoventaTotales=detallepedidopuntoventa;
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
			this.detallepedidopuntoventaAux=new DetallePedidoPuntoVenta();
			this.detallepedidopuntoventaAux.setsType(Constantes2.S_TOTALES);
			this.detallepedidopuntoventaAux.setIsNew(false);
			this.detallepedidopuntoventaAux.setIsChanged(false);
			this.detallepedidopuntoventaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetallePedidoPuntoVentaConstantesFunciones.TotalizarValoresFilaDetallePedidoPuntoVenta(this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas(),this.detallepedidopuntoventaAux);
				
				this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().add(this.detallepedidopuntoventaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetallePedidoPuntoVentaConstantesFunciones.TotalizarValoresFilaDetallePedidoPuntoVenta(this.detallepedidopuntoventas,this.detallepedidopuntoventaAux);
				
				this.detallepedidopuntoventas.add(this.detallepedidopuntoventaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detallepedidopuntoventaTotales=new DetallePedidoPuntoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().remove(detallepedidopuntoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallepedidopuntoventas.remove(detallepedidopuntoventaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detallepedidopuntoventaTotales=new DetallePedidoPuntoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePedidoPuntoVenta detallepedidopuntoventa:detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas()) {
				if(detallepedidopuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					detallepedidopuntoventaTotales=detallepedidopuntoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetallePedidoPuntoVentaConstantesFunciones.TotalizarValoresFilaDetallePedidoPuntoVenta(this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas(),detallepedidopuntoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePedidoPuntoVenta detallepedidopuntoventa:this.detallepedidopuntoventas) {
				if(detallepedidopuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					detallepedidopuntoventaTotales=detallepedidopuntoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetallePedidoPuntoVentaConstantesFunciones.TotalizarValoresFilaDetallePedidoPuntoVenta(this.detallepedidopuntoventas,detallepedidopuntoventaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetallePedidoPuntoVentasFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePedidoPuntoVentasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePedidoPuntoVentasFK_IdPedidoPuntoVenta()throws Exception {
		try {
			sAccionBusqueda="FK_IdPedidoPuntoVenta";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePedidoPuntoVentasFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePedidoPuntoVentasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePedidoPuntoVentasFK_IdUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetallePedidoPuntoVentasFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepedidopuntoventaLogic.getDetallePedidoPuntoVentasFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePedidoPuntoVentasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepedidopuntoventaLogic.getDetallePedidoPuntoVentasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePedidoPuntoVentasFK_IdPedidoPuntoVenta(String sFinalQuery,Long id_pedido_punto_venta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepedidopuntoventaLogic.getDetallePedidoPuntoVentasFK_IdPedidoPuntoVenta(sFinalQuery,this.pagination,id_pedido_punto_venta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePedidoPuntoVentasFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepedidopuntoventaLogic.getDetallePedidoPuntoVentasFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePedidoPuntoVentasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepedidopuntoventaLogic.getDetallePedidoPuntoVentasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePedidoPuntoVentasFK_IdUnidad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepedidopuntoventaLogic.getDetallePedidoPuntoVentasFK_IdUnidad(sFinalQuery,this.pagination,id_unidad);
				
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
	
	public void inicializarPermisosDetallePedidoPuntoVenta() {
		this.isPermisoTodoDetallePedidoPuntoVenta=false;
		this.isPermisoNuevoDetallePedidoPuntoVenta=false;
		this.isPermisoActualizarDetallePedidoPuntoVenta=false;
		this.isPermisoActualizarOriginalDetallePedidoPuntoVenta=false;
		this.isPermisoEliminarDetallePedidoPuntoVenta=false;
		this.isPermisoGuardarCambiosDetallePedidoPuntoVenta=false;
		this.isPermisoConsultaDetallePedidoPuntoVenta=false;
		this.isPermisoBusquedaDetallePedidoPuntoVenta=false;
		this.isPermisoReporteDetallePedidoPuntoVenta=false;		
		this.isPermisoOrdenDetallePedidoPuntoVenta=false;		
		this.isPermisoPaginacionMedioDetallePedidoPuntoVenta=false;		
		this.isPermisoPaginacionAltoDetallePedidoPuntoVenta=false;
		this.isPermisoPaginacionTodoDetallePedidoPuntoVenta=false;
		this.isPermisoCopiarDetallePedidoPuntoVenta=false;		
		this.isPermisoVerFormDetallePedidoPuntoVenta=false;		
		this.isPermisoDuplicarDetallePedidoPuntoVenta=false;		
		this.isPermisoOrdenDetallePedidoPuntoVenta=false;		
	}
	
	public void setPermisosUsuarioDetallePedidoPuntoVenta(Boolean isPermiso) {
		this.isPermisoTodoDetallePedidoPuntoVenta=isPermiso;
		this.isPermisoNuevoDetallePedidoPuntoVenta=isPermiso;
		this.isPermisoActualizarDetallePedidoPuntoVenta=isPermiso;
		this.isPermisoActualizarOriginalDetallePedidoPuntoVenta=isPermiso;
		this.isPermisoEliminarDetallePedidoPuntoVenta=isPermiso;
		this.isPermisoGuardarCambiosDetallePedidoPuntoVenta=isPermiso;
		this.isPermisoConsultaDetallePedidoPuntoVenta=isPermiso;
		this.isPermisoBusquedaDetallePedidoPuntoVenta=isPermiso;
		this.isPermisoReporteDetallePedidoPuntoVenta=isPermiso;
		this.isPermisoOrdenDetallePedidoPuntoVenta=isPermiso;		
		this.isPermisoPaginacionMedioDetallePedidoPuntoVenta=isPermiso;		
		this.isPermisoPaginacionAltoDetallePedidoPuntoVenta=isPermiso;		
		this.isPermisoPaginacionTodoDetallePedidoPuntoVenta=isPermiso;		
		this.isPermisoCopiarDetallePedidoPuntoVenta=isPermiso;		
		this.isPermisoVerFormDetallePedidoPuntoVenta=isPermiso;		
		this.isPermisoDuplicarDetallePedidoPuntoVenta=isPermiso;
		this.isPermisoOrdenDetallePedidoPuntoVenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetallePedidoPuntoVenta(Boolean isPermiso) {
		//this.isPermisoTodoDetallePedidoPuntoVenta=isPermiso;
		this.isPermisoNuevoDetallePedidoPuntoVenta=isPermiso;
		this.isPermisoActualizarDetallePedidoPuntoVenta=isPermiso;
		this.isPermisoActualizarOriginalDetallePedidoPuntoVenta=isPermiso;
		this.isPermisoEliminarDetallePedidoPuntoVenta=isPermiso;
		this.isPermisoGuardarCambiosDetallePedidoPuntoVenta=isPermiso;
		//this.isPermisoConsultaDetallePedidoPuntoVenta=isPermiso;
		//this.isPermisoBusquedaDetallePedidoPuntoVenta=isPermiso;
		//this.isPermisoReporteDetallePedidoPuntoVenta=isPermiso;
		//this.isPermisoOrdenDetallePedidoPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionMedioDetallePedidoPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionAltoDetallePedidoPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionTodoDetallePedidoPuntoVenta=isPermiso;		
		//this.isPermisoCopiarDetallePedidoPuntoVenta=isPermiso;		
		//this.isPermisoDuplicarDetallePedidoPuntoVenta=isPermiso;
		//this.isPermisoOrdenDetallePedidoPuntoVenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetallePedidoPuntoVentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetallePedidoPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetallePedidoPuntoVenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetallePedidoPuntoVentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetallePedidoPuntoVentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetallePedidoPuntoVentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetallePedidoPuntoVentaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetallePedidoPuntoVenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetallePedidoPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetallePedidoPuntoVentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetallePedidoPuntoVenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetallePedidoPuntoVenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetallePedidoPuntoVenta=this.isPermisoActualizarDetallePedidoPuntoVenta;
			this.isPermisoEliminarDetallePedidoPuntoVenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetallePedidoPuntoVenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetallePedidoPuntoVenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetallePedidoPuntoVenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetallePedidoPuntoVenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetallePedidoPuntoVenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetallePedidoPuntoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetallePedidoPuntoVenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetallePedidoPuntoVenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetallePedidoPuntoVenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetallePedidoPuntoVenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetallePedidoPuntoVenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetallePedidoPuntoVenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetallePedidoPuntoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetallePedidoPuntoVenta.setToolTipText(this.jTableDatosDetallePedidoPuntoVenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetallePedidoPuntoVenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetallePedidoPuntoVenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetallePedidoPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetallePedidoPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetallePedidoPuntoVenta() throws Exception {
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
	public void inicializarCombosForeignKeyDetallePedidoPuntoVentaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.pedidopuntoventasForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetallePedidoPuntoVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetallePedidoPuntoVentaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetallePedidoPuntoVentaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPedidoPuntoVentaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyPedidoPuntoVentaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.pedidopuntoventasForeignKey==null||this.pedidopuntoventasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PedidoPuntoVentaConstantesFunciones.getArrayColumnasGlobalesPedidoPuntoVenta(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PedidoPuntoVentaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PedidoPuntoVentaConstantesFunciones.SFINALQUERY;

				this.cargarCombosPedidoPuntoVentasForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyUnidadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0)) {
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
	
	public void cargarCombosLoteForeignKeyDetallePedidoPuntoVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetallePedidoPuntoVentaParameterReturnGeneral detallepedidopuntoventaReturnGeneral=new DetallePedidoPuntoVentaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detallepedidopuntoventaConstantesFunciones.cargarid_empresaDetallePedidoPuntoVenta)
					 || (this.esRecargarFks && this.detallepedidopuntoventaConstantesFunciones.cargarid_empresaDetallePedidoPuntoVenta)) {

					if(!this.detallepedidopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detallepedidopuntoventaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.detallepedidopuntoventaConstantesFunciones.cargarid_sucursalDetallePedidoPuntoVenta)
					 || (this.esRecargarFks && this.detallepedidopuntoventaConstantesFunciones.cargarid_sucursalDetallePedidoPuntoVenta)) {

					if(!this.detallepedidopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+detallepedidopuntoventaSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalPedidoPuntoVenta="";

				if(((this.pedidopuntoventasForeignKey==null||this.pedidopuntoventasForeignKey.size()<=0) && this.detallepedidopuntoventaConstantesFunciones.cargarid_pedido_punto_ventaDetallePedidoPuntoVenta)
					 || (this.esRecargarFks && this.detallepedidopuntoventaConstantesFunciones.cargarid_pedido_punto_ventaDetallePedidoPuntoVenta)) {

					if(!this.detallepedidopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionPedidoPuntoVenta()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PedidoPuntoVentaConstantesFunciones.getArrayColumnasGlobalesPedidoPuntoVenta(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPedidoPuntoVenta=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PedidoPuntoVentaConstantesFunciones.TABLENAME);

						finalQueryGlobalPedidoPuntoVenta=Funciones.GetFinalQueryAppend(finalQueryGlobalPedidoPuntoVenta, "");
						finalQueryGlobalPedidoPuntoVenta+=PedidoPuntoVentaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPedidoPuntoVentasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPedidoPuntoVenta=" WHERE " + ConstantesSql.ID + "="+detallepedidopuntoventaSessionBean.getlidPedidoPuntoVentaActual();
					}
				} else {
					finalQueryGlobalPedidoPuntoVenta="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.detallepedidopuntoventaConstantesFunciones.cargarid_bodegaDetallePedidoPuntoVenta)
					 || (this.esRecargarFks && this.detallepedidopuntoventaConstantesFunciones.cargarid_bodegaDetallePedidoPuntoVenta)) {

					if(!this.detallepedidopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+detallepedidopuntoventaSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(cargarCombosDependencia && ((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.detallepedidopuntoventaConstantesFunciones.cargarid_productoDetallePedidoPuntoVenta)
					 || (this.esRecargarFks && this.detallepedidopuntoventaConstantesFunciones.cargarid_productoDetallePedidoPuntoVenta)) {

					if(!this.detallepedidopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+detallepedidopuntoventaSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(cargarCombosDependencia && ((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.detallepedidopuntoventaConstantesFunciones.cargarid_unidadDetallePedidoPuntoVenta)
					 || (this.esRecargarFks && this.detallepedidopuntoventaConstantesFunciones.cargarid_unidadDetallePedidoPuntoVenta)) {

					if(!this.detallepedidopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+detallepedidopuntoventaSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detallepedidopuntoventaReturnGeneral=detallepedidopuntoventaLogic.cargarCombosLoteForeignKeyDetallePedidoPuntoVenta(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalPedidoPuntoVenta,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalUnidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detallepedidopuntoventaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=detallepedidopuntoventaReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalPedidoPuntoVenta.equals("NONE")) {
				this.pedidopuntoventasForeignKey=detallepedidopuntoventaReturnGeneral.getpedidopuntoventasForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=detallepedidopuntoventaReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=detallepedidopuntoventaReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=detallepedidopuntoventaReturnGeneral.getunidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetallePedidoPuntoVenta()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyPedidoPuntoVenta();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyUnidad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.detallepedidopuntoventaSessionBean==null) {
				this.detallepedidopuntoventaSessionBean=new DetallePedidoPuntoVentaSessionBean();
			}

			if(!this.detallepedidopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.detallepedidopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyPedidoPuntoVenta()throws Exception {
		try {

			if(!this.detallepedidopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionPedidoPuntoVenta()) {
				PedidoPuntoVenta pedidopuntoventa=new PedidoPuntoVenta();
				PedidoPuntoVentaConstantesFunciones.setPedidoPuntoVentaDescripcion(pedidopuntoventa,Constantes.SMENSAJE_ESCOJA_OPCION);
				pedidopuntoventa.setId(null);

				if(!PedidoPuntoVentaConstantesFunciones.ExisteEnLista(this.pedidopuntoventasForeignKey,pedidopuntoventa,true)) {

					this.pedidopuntoventasForeignKey.add(0,pedidopuntoventa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.detallepedidopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.detallepedidopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

			if(!this.detallepedidopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
	
	public void initActionsCombosTodosForeignKeyDetallePedidoPuntoVenta()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyBodega("Todos");
			this.initActionsCombosForeignKeyProducto("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetallePedidoPuntoVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyBodega(sFormularioTipoBusqueda);
			this.initActionsCombosForeignKeyProducto(sFormularioTipoBusqueda);
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
			sFinalQueryCombo=InventarioSql.GetQueryProductoFromBodega(bodegaLocal);

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboProducto=sFinalQueryCombo;

			this.productosForeignKey=new ArrayList<Producto>();
			this.cargarCombosForeignKeyProducto(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyProducto(JComboBox jComboBoxProductoGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Producto productoLocal=(Producto)jComboBoxProductoGenerico.getSelectedItem();

			if(productoLocal!=null  && productoLocal.getId()!=null  && productoLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_producto="+productoLocal.getId();
			}
			//REDEFINE
			sFinalQueryCombo=InventarioSql.GetQueryUnidadFromBodegaYProducto(productoLocal,this.detallepedidopuntoventa.getid_bodega());

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboUnidad=sFinalQueryCombo;

			this.unidadsForeignKey=new ArrayList<Unidad>();
			this.cargarCombosForeignKeyUnidad(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyBodega(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
						this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta.addItemListener(new ComboBoxItemListener(this,"id_bodegaDetallePedidoPuntoVenta"));
						this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaDetallePedidoPuntoVenta"));
					}
				} else {
					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
						this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta.addActionListener(new ComboBoxActionListener(this,"id_bodegaDetallePedidoPuntoVenta"));
						this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaDetallePedidoPuntoVenta"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta"));

						this.jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta"));

					} else {
						this.jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta"));

						this.jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void initActionsCombosForeignKeyProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
						this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta.addItemListener(new ComboBoxItemListener(this,"id_productoDetallePedidoPuntoVenta"));
						this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta.addFocusListener(new ComboBoxFocusListener(this,"id_productoDetallePedidoPuntoVenta"));
					}
				} else {
					if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
						this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta.addActionListener(new ComboBoxActionListener(this,"id_productoDetallePedidoPuntoVenta"));
						this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta.addFocusListener(new ComboBoxFocusListener(this,"id_productoDetallePedidoPuntoVenta"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta"));

						this.jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta"));

					} else {
						this.jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta"));

						this.jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyDetallePedidoPuntoVenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetallePedidoPuntoVenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetallePedidoPuntoVenta(DetallePedidoPuntoVenta detallepedidopuntoventa)throws Exception {	
		try {
			
			this.setActualPedidoPuntoVentaForeignKey(detallepedidopuntoventa.getid_pedido_punto_venta(),false,"Formulario");
			this.setActualBodegaForeignKey(detallepedidopuntoventa.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(detallepedidopuntoventa.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(detallepedidopuntoventa.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetallePedidoPuntoVenta(DetallePedidoPuntoVenta detallepedidopuntoventa,String sTipoEvento)throws Exception {	
		try {
			
			

				if(detallepedidopuntoventa.getProducto()!=null && !sTipoEvento.equals("id_productoDetallePedidoPuntoVenta")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(detallepedidopuntoventa.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetallePedidoPuntoVenta()throws Exception {	
		try {
			
			this.setActualPedidoPuntoVentaForeignKey(this.detallepedidopuntoventaConstantesFunciones.getid_pedido_punto_venta(),false,"Formulario");
			this.setActualBodegaForeignKey(this.detallepedidopuntoventaConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.detallepedidopuntoventaConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(this.detallepedidopuntoventaConstantesFunciones.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetallePedidoPuntoVenta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetallePedidoPuntoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetallePedidoPuntoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetallePedidoPuntoVenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetallePedidoPuntoVenta()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFramePedidoPuntoVentasForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetallePedidoPuntoVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePedidoPuntoVentasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetallePedidoPuntoVenta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_empresaDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_empresaDetallePedidoPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_empresaDetallePedidoPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_sucursalDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_sucursalDetallePedidoPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_sucursalDetallePedidoPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_unidadDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_unidadDetallePedidoPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_unidadDetallePedidoPuntoVenta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	







	public void recargarFormDetallePedidoPuntoVentaBodega(JComboBox<?> jComboBoxGenericoBodega,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormDetallePedidoPuntoVentaid_producto(jComboBoxGenericoBodega,sFormularioTipoBusqueda,"Bodega",false);
	}

	public void recargarFormDetallePedidoPuntoVentaProducto(JComboBox<?> jComboBoxGenericoProducto,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormDetallePedidoPuntoVentaid_unidad(jComboBoxGenericoProducto,sFormularioTipoBusqueda,"Producto",false);
	}


	
	



	public void recargarFormDetallePedidoPuntoVentaid_producto(JComboBox<?> jComboBoxGenericoProducto,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Bodega")){
				this.setActualParaGuardarBodegaForeignKey(this.detallepedidopuntoventa,jComboBoxGenericoProducto);
			}

			if(this.detallepedidopuntoventa.getid_bodega()!=null && this.detallepedidopuntoventa.getid_bodega()!=0L) {
				sFinalQuery+="  WHERE  id_bodega="+this.detallepedidopuntoventa.getid_bodega();
			} else {
				sFinalQuery+="  WHERE  id_bodega=-1";
			}



			//BUCLE RECURSIVO
			this.setActualProductoForeignKey(this.detallepedidopuntoventa.getid_bodega(),true,sFormularioTipoBusqueda);

			this.cargarCombosProductosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormDetallePedidoPuntoVentaid_unidad(JComboBox<?> jComboBoxGenericoUnidad,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Producto")){
				this.setActualParaGuardarProductoForeignKey(this.detallepedidopuntoventa,jComboBoxGenericoUnidad);
			}

			if(this.detallepedidopuntoventa.getid_producto()!=null && this.detallepedidopuntoventa.getid_producto()!=0L) {
				sFinalQuery+="  WHERE  id_producto="+this.detallepedidopuntoventa.getid_producto();
			} else {
				sFinalQuery+="  WHERE  id_producto=-1";
			}



			//BUCLE RECURSIVO
			this.setActualUnidadForeignKey(this.detallepedidopuntoventa.getid_producto(),true,sFormularioTipoBusqueda);

			this.cargarCombosUnidadsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public DetallePedidoPuntoVentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetallePedidoPuntoVentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetallePedidoPuntoVentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detallepedidopuntoventaSessionBean=new DetallePedidoPuntoVentaSessionBean(); 
		this.detallepedidopuntoventaConstantesFunciones=new DetallePedidoPuntoVentaConstantesFunciones(); 
		this.detallepedidopuntoventaBean=new DetallePedidoPuntoVenta();//(this.detallepedidopuntoventaConstantesFunciones); 		
		this.detallepedidopuntoventaReturnGeneral=new DetallePedidoPuntoVentaParameterReturnGeneral(); 
		
		this.detallepedidopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallepedidopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetallePedidoPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetallePedidoPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetallePedidoPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetallePedidoPuntoVenta(true);
			
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
			
			this.detallepedidopuntoventaConstantesFunciones=new DetallePedidoPuntoVentaConstantesFunciones(); 
			this.detallepedidopuntoventaBean=new DetallePedidoPuntoVenta();//this.detallepedidopuntoventaConstantesFunciones); 			
			this.detallepedidopuntoventaReturnGeneral=new DetallePedidoPuntoVentaParameterReturnGeneral(); 
		
			DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Pedido Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.detallepedidopuntoventa=new DetallePedidoPuntoVenta();
			this.detallepedidopuntoventas = new ArrayList<DetallePedidoPuntoVenta>();
			this.detallepedidopuntoventasAux = new ArrayList<DetallePedidoPuntoVenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic=new DetallePedidoPuntoVentaLogic();
				this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.detallepedidopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detallepedidopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta);	
					}
					
					if(this.jInternalFrameImportacionDetallePedidoPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetallePedidoPuntoVenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetallePedidoPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetallePedidoPuntoVenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta);
				this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.setVisible(false);
				this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta);
					this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.setVisible(false);
					this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetallePedidoPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetallePedidoPuntoVenta);
					this.jInternalFrameImportacionDetallePedidoPuntoVenta.setVisible(false);
					this.jInternalFrameImportacionDetallePedidoPuntoVenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetallePedidoPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetallePedidoPuntoVenta);
					this.jInternalFrameOrderByDetallePedidoPuntoVenta.setVisible(false);
					this.jInternalFrameOrderByDetallePedidoPuntoVenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetallePedidoPuntoVentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetallePedidoPuntoVentaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detallepedidopuntoventaReturnGeneral=new DetallePedidoPuntoVentaParameterReturnGeneral();
			
			this.detallepedidopuntoventaParameterGeneral=new DetallePedidoPuntoVentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detallepedidopuntoventaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetallePedidoPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetallePedidoPuntoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado(),this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetallePedidoPuntoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado(),this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaDuplicarDetallePedidoPuntoVenta=true;
			this.isVisibilidadCeldaCopiarDetallePedidoPuntoVenta=true;
			this.isVisibilidadCeldaVerFormDetallePedidoPuntoVenta=true;
			this.isVisibilidadCeldaOrdenDetallePedidoPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaModificarDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaActualizarDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaEliminarDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaCancelarDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPedidoPuntoVenta=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdUnidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetallePedidoPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetallePedidoPuntoVenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetallePedidoPuntoVenta(false);
			
			this.setPermisosUsuarioDetallePedidoPuntoVenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado() 
				|| (this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado() && this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetallePedidoPuntoVentaClasesRelacionadas();
			}
			
			if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetallePedidoPuntoVentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetallePedidoPuntoVenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetallePedidoPuntoVenta();
			}
			
			if(!this.isPermisoBusquedaDetallePedidoPuntoVenta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetallePedidoPuntoVenta,this.isPermisoPaginacionMedioDetallePedidoPuntoVenta,this.isPermisoPaginacionTodoDetallePedidoPuntoVenta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetallePedidoPuntoVentaConstantesFunciones.getTiposSeleccionarDetallePedidoPuntoVenta());
				
				this.tiposColumnasSelect=DetallePedidoPuntoVentaConstantesFunciones.getTiposSeleccionarDetallePedidoPuntoVenta(true);
				
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
			//if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetallePedidoPuntoVenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioDetallePedidoPuntoVenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioDetallePedidoPuntoVenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetallePedidoPuntoVenta() ;
			
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
			this.pedidopuntoventaLogic=new PedidoPuntoVentaLogic();
			this.bodegaLogic=new BodegaLogic();
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
				detallepedidopuntoventaImplementable= (DetallePedidoPuntoVentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetallePedidoPuntoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detallepedidopuntoventaImplementableHome= (DetallePedidoPuntoVentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetallePedidoPuntoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detallepedidopuntoventas= new ArrayList<DetallePedidoPuntoVenta>();
			this.detallepedidopuntoventasEliminados= new ArrayList<DetallePedidoPuntoVenta>();
						
			this.isEsNuevoDetallePedidoPuntoVenta=false;
			this.esParaAccionDesdeFormularioDetallePedidoPuntoVenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.pedidopuntoventasForeignKey=new ArrayList<PedidoPuntoVenta>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetallePedidoPuntoVenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetallePedidoPuntoVenta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetallePedidoPuntoVentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetallePedidoPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetallePedidoPuntoVenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetallePedidoPuntoVenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetallePedidoPuntoVenta();
			}
			
			DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetallePedidoPuntoVenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetallePedidoPuntoVenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetallePedidoPuntoVenta() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetallePedidoPuntoVenta")) {
				iIndex=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTabbedPaneRelacionesDetallePedidoPuntoVenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTabbedPaneRelacionesDetallePedidoPuntoVenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetallePedidoPuntoVenta();	
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
	
	public void cargarCombosForeignKeyDetallePedidoPuntoVenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetallePedidoPuntoVenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetallePedidoPuntoVenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetallePedidoPuntoVentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetallePedidoPuntoVenta();
		
		this.cargarCombosFrameForeignKeyDetallePedidoPuntoVenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetallePedidoPuntoVenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetallePedidoPuntoVenta();
		}
	}
	
	

	public void cargarCombosForeignKeyPedidoPuntoVenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPedidoPuntoVentaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPedidoPuntoVenta();
				this.cargarCombosFramePedidoPuntoVentasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPedidoPuntoVenta(this.pedidopuntoventasForeignKey);

		} catch(Exception e) {
			throw e;
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
					this.initActionsCombosForeignKeyProducto("Todos");
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
					this.initActionsCombosForeignKeyProducto("Todos");
				}

			this.recargarComboTablaUnidad(this.unidadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDetallePedidoPuntoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
			
			
			if(jTableDatosDetallePedidoPuntoVenta.getRowCount()>=1) {
				jTableDatosDetallePedidoPuntoVenta.removeRowSelectionInterval(0, jTableDatosDetallePedidoPuntoVenta.getRowCount()-1);						
			}
			
			this.isEsNuevoDetallePedidoPuntoVenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetallePedidoPuntoVenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetallePedidoPuntoVenta(true);			
			//this.detallepedidopuntoventa=new DetallePedidoPuntoVenta();
			//this.detallepedidopuntoventa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetallePedidoPuntoVenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallePedidoPuntoVenta() ;
			
			if(DetallePedidoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetallePedidoPuntoVenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detallepedidopuntoventa);	
			this.actualizarInformacion("INFO_PADRE",false,this.detallepedidopuntoventa);				
			
			DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
			
			if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetallePedidoPuntoVenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetallePedidoPuntoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetallePedidoPuntoVenta> detallepedidopuntoventasSeleccionados=new ArrayList<DetallePedidoPuntoVenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetallePedidoPuntoVenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetallePedidoPuntoVenta.getSelectedRows().length;			
			}
			
			detallepedidopuntoventasSeleccionados=this.getDetallePedidoPuntoVentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetallePedidoPuntoVenta--;			
				//DetallePedidoPuntoVenta detallepedidopuntoventaAux= new DetallePedidoPuntoVenta();			
				//detallepedidopuntoventaAux.setId(this.iIdNuevoDetallePedidoPuntoVenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetallePedidoPuntoVenta detallepedidopuntoventaOrigen=new DetallePedidoPuntoVenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetallePedidoPuntoVenta detallepedidopuntoventaOrigen : detallepedidopuntoventasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detallepedidopuntoventaOrigen =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepedidopuntoventaOrigen =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetallePedidoPuntoVenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detallepedidopuntoventa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetallePedidoPuntoVenta(detallepedidopuntoventaOrigen,this.detallepedidopuntoventa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().add(this.detallepedidopuntoventaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallepedidopuntoventas.add(this.detallepedidopuntoventaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetallePedidoPuntoVenta(false);
				
				this.jTableDatosDetallePedidoPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoDetallePedidoPuntoVenta(), this.getIndiceNuevoDetallePedidoPuntoVenta());
				
				int iLastRow =  this.jTableDatosDetallePedidoPuntoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetallePedidoPuntoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetallePedidoPuntoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetallePedidoPuntoVenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetallePedidoPuntoVenta> detallepedidopuntoventasSeleccionados=new ArrayList<DetallePedidoPuntoVenta>();									
		
			DetallePedidoPuntoVenta detallepedidopuntoventaOrigen=new DetallePedidoPuntoVenta();
			DetallePedidoPuntoVenta detallepedidopuntoventaDestino=new DetallePedidoPuntoVenta();
				
			detallepedidopuntoventasSeleccionados=this.getDetallePedidoPuntoVentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetallePedidoPuntoVenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detallepedidopuntoventasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetallePedidoPuntoVenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepedidopuntoventaOrigen =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallepedidopuntoventaOrigen =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepedidopuntoventaDestino =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallepedidopuntoventaDestino =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detallepedidopuntoventaOrigen =detallepedidopuntoventasSeleccionados.get(0);
				detallepedidopuntoventaDestino =detallepedidopuntoventasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetallePedidoPuntoVenta(detallepedidopuntoventaOrigen,detallepedidopuntoventaDestino,true,false);
				
				detallepedidopuntoventaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallepedidopuntoventaDestino,detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallepedidopuntoventaDestino,detallepedidopuntoventas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetallePedidoPuntoVenta(false);
				
				//this.jTableDatosDetallePedidoPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoDetallePedidoPuntoVenta(), this.getIndiceNuevoDetallePedidoPuntoVenta());
				
				int iLastRow =  this.jTableDatosDetallePedidoPuntoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetallePedidoPuntoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetallePedidoPuntoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetallePedidoPuntoVenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetallePedidoPuntoVenta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetallePedidoPuntoVenta.setVisible(!isVisible);
			this.jPanelPaginacionDetallePedidoPuntoVenta.setVisible(!isVisible);
			this.jPanelAccionesDetallePedidoPuntoVenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetallePedidoPuntoVenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetallePedidoPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetallePedidoPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetallePedidoPuntoVenta();
			
			this.abrirFrameOrderByDetallePedidoPuntoVenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetallePedidoPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetallePedidoPuntoVenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetallePedidoPuntoVenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.isMaximum()) {
					this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.setSize(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.iWidthFormulario,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.isMaximum()) {
						this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jContentPaneDetalleDetallePedidoPuntoVenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTabbedPaneRelacionesDetallePedidoPuntoVenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jContentPaneDetalleDetallePedidoPuntoVenta.getWidth(),DetallePedidoPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTabbedPaneRelacionesDetallePedidoPuntoVenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jContentPaneDetalleDetallePedidoPuntoVenta.getWidth(),DetallePedidoPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTabbedPaneRelacionesDetallePedidoPuntoVenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jContentPaneDetalleDetallePedidoPuntoVenta.getWidth(),DetallePedidoPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.setVisible(true);
	        this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetallePedidoPuntoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetallePedidoPuntoVenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetallePedidoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePedidoPuntoVenta,false,this);
				} else {
					this.jInternalFrameOrderByDetallePedidoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePedidoPuntoVenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetallePedidoPuntoVenta);
				this.jInternalFrameOrderByDetallePedidoPuntoVenta.setVisible(false);
				this.jInternalFrameOrderByDetallePedidoPuntoVenta.setSelected(false);
				
				this.jInternalFrameOrderByDetallePedidoPuntoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetallePedidoPuntoVenta"));
				
				this.inicializarActualizarBindingTablaOrderByDetallePedidoPuntoVenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetallePedidoPuntoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetallePedidoPuntoVenta==null) {
				
				this.jInternalFrameImportacionDetallePedidoPuntoVenta=new ImportacionJInternalFrame(DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetallePedidoPuntoVenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetallePedidoPuntoVenta);
				this.jInternalFrameImportacionDetallePedidoPuntoVenta.setVisible(false);
				this.jInternalFrameImportacionDetallePedidoPuntoVenta.setSelected(false);


				this.jInternalFrameImportacionDetallePedidoPuntoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetallePedidoPuntoVenta"));
				this.jInternalFrameImportacionDetallePedidoPuntoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetallePedidoPuntoVenta"));
				this.jInternalFrameImportacionDetallePedidoPuntoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetallePedidoPuntoVenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetallePedidoPuntoVenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta==null) {
				this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta=new ReporteDinamicoJInternalFrame(DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta);
				this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.setVisible(false);
				this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetallePedidoPuntoVenta"));
				this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetallePedidoPuntoVenta"));
				this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetallePedidoPuntoVenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetallePedidoPuntoVenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetallePedidoPuntoVenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetallePedidoPuntoVenta);
			
	       	this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.setVisible(false);
	        this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.dispose();
			//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetallePedidoPuntoVenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetallePedidoPuntoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetallePedidoPuntoVenta.setVisible(true);
	        this.jInternalFrameImportacionDetallePedidoPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetallePedidoPuntoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetallePedidoPuntoVenta.setVisible(true);
	        this.jInternalFrameOrderByDetallePedidoPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetallePedidoPuntoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetallePedidoPuntoVenta.setVisible(false);
	        this.jInternalFrameOrderByDetallePedidoPuntoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetallePedidoPuntoVenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetallePedidoPuntoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetallePedidoPuntoVenta.setVisible(false);
	        this.jInternalFrameImportacionDetallePedidoPuntoVenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetallePedidoPuntoVenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetallePedidoPuntoVenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetallePedidoPuntoVenta(true);
			//this.isEsNuevoDetallePedidoPuntoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetallePedidoPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetallePedidoPuntoVenta(false) ;
			
			if(detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetallePedidoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetallePedidoPuntoVenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallePedidoPuntoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetallePedidoPuntoVentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetallePedidoPuntoVenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetallePedidoPuntoVenta(true);
			//this.isEsNuevoDetallePedidoPuntoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detallepedidopuntoventa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetallePedidoPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetallePedidoPuntoVenta(false) ;
			
			if(DetallePedidoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetallePedidoPuntoVenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallePedidoPuntoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.detallepedidopuntoventaConstantesFunciones.cargarid_productoDetallePedidoPuntoVenta) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaPedidoPuntoVenta(List<PedidoPuntoVenta> pedidopuntoventasForeignKey)throws Exception{
		TableColumn tableColumnPedidoPuntoVenta=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPEDIDOPUNTOVENTA));
		TableCellEditor tableCellEditorPedidoPuntoVenta =tableColumnPedidoPuntoVenta.getCellEditor();

		PedidoPuntoVentaTableCell pedidopuntoventaTableCellFk=(PedidoPuntoVentaTableCell)tableCellEditorPedidoPuntoVenta;

		if(pedidopuntoventaTableCellFk!=null) {
			pedidopuntoventaTableCellFk.setpedidopuntoventasForeignKey(pedidopuntoventasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//pedidopuntoventaTableCellFk.setRowActual(intSelectedRow);
			//pedidopuntoventaTableCellFk.setpedidopuntoventasForeignKeyActual(pedidopuntoventasForeignKey);
		//}


		if(pedidopuntoventaTableCellFk!=null) {
			pedidopuntoventaTableCellFk.RecargarPedidoPuntoVentasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

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
		TableColumn tableColumnUnidad=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

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
	
	public void jButtonActualizarDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetallePedidoPuntoVenta(false);
			
			//if(!this.isEsNuevoDetallePedidoPuntoVenta) {								
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
				
			}
			
			if(this.permiteMantenimiento(this.detallepedidopuntoventa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetallePedidoPuntoVenta=true;
					this.inicializarActualizarBindingTablaDetallePedidoPuntoVenta(false);
					this.isEsNuevoDetallePedidoPuntoVenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetallePedidoPuntoVenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetallePedidoPuntoVenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetallePedidoPuntoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetallePedidoPuntoVenta(false);
				
				this.habilitarDeshabilitarControlesDetallePedidoPuntoVenta(false);
			
												
				
				if(DetallePedidoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetallePedidoPuntoVenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetallePedidoPuntoVentaActionPerformed(evt,detallepedidopuntoventaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetallePedidoPuntoVenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detallepedidopuntoventaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detallepedidopuntoventa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetallePedidoPuntoVenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePedidoPuntoVenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				this.detallepedidopuntoventa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				this.detallepedidopuntoventa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detallepedidopuntoventa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetallePedidoPuntoVentaModel) this.jTableDatosDetallePedidoPuntoVenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetallePedidoPuntoVenta=true;
				this.inicializarActualizarBindingTablaDetallePedidoPuntoVenta(false);
				this.isEsNuevoDetallePedidoPuntoVenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetallePedidoPuntoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetallePedidoPuntoVenta(false);
				
				this.habilitarDeshabilitarControlesDetallePedidoPuntoVenta(false);
				
				
				
				if(DetallePedidoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetallePedidoPuntoVenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetallePedidoPuntoVenta.getRowCount()>=1) {
				jTableDatosDetallePedidoPuntoVenta.removeRowSelectionInterval(0, jTableDatosDetallePedidoPuntoVenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetallePedidoPuntoVenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetallePedidoPuntoVenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetallePedidoPuntoVenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallePedidoPuntoVenta(false) ;
			
			this.isEsNuevoDetallePedidoPuntoVenta=false;
			
			if(DetallePedidoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetallePedidoPuntoVenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
				
				//SI ES MANUAL
				if(DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetallePedidoPuntoVenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetallePedidoPuntoVenta--;			
			//DetallePedidoPuntoVenta detallepedidopuntoventaAux= new DetallePedidoPuntoVenta();			
			//detallepedidopuntoventaAux.setId(this.iIdNuevoDetallePedidoPuntoVenta);
			
			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetallePedidoPuntoVenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
			
			this.detallepedidopuntoventa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().add(this.detallepedidopuntoventaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detallepedidopuntoventas.add(this.detallepedidopuntoventaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetallePedidoPuntoVenta(false);
			
			this.jTableDatosDetallePedidoPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoDetallePedidoPuntoVenta(), this.getIndiceNuevoDetallePedidoPuntoVenta());
			
			int iLastRow =  this.jTableDatosDetallePedidoPuntoVenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetallePedidoPuntoVenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetallePedidoPuntoVenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetallePedidoPuntoVenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
			
			//SI ES MANUAL
			if(DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetallePedidoPuntoVenta();
			}
			
			//this.abrirFrameTreeDetallePedidoPuntoVenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle PedidoS ?", "MANTENIMIENTO DE Detalle Pedido", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetallePedidoPuntoVenta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetallePedidoPuntoVenta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detallepedidopuntoventaReturnGeneral=detallepedidopuntoventaLogic.procesarImportacionDetallePedidoPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detallepedidopuntoventaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetallePedidoPuntoVentaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetallePedidoPuntoVenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetallePedidoPuntoVenta.setFileImportacion(this.jInternalFrameImportacionDetallePedidoPuntoVenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetallePedidoPuntoVenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetallePedidoPuntoVenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetallePedidoPuntoVenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetallePedidoPuntoVenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetallePedidoPuntoVenta> detallepedidopuntoventasSeleccionados=new ArrayList<DetallePedidoPuntoVenta>();		

		detallepedidopuntoventasSeleccionados=this.getDetallePedidoPuntoVentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetallePedidoPuntoVentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetallePedidoPuntoVentaBaseDesign.jrxml";
			
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
			
			this.generarReporteDetallePedidoPuntoVentas("Todos",detallepedidopuntoventasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPEDIDOPUNTOVENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_PedidoPuntoVenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_PedidoPuntoVenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_PedidoPuntoVenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_PedidoPuntoVenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_SERIE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rie_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rie_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rie_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rie_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuentoValor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuentoValor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuentoValor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuentoValor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVAVALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_aValor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_aValor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_aValor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_aValor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_e_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_e_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_e_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_e_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICEVALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_eValor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_eValor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_eValor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_eValor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_TOTAL:
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
		
		if(this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPEDIDOPUNTOVENTA:
					sNombreCampoCategoria="id_pedido_punto_venta";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_SERIE:
					sNombreCampoCategoria="serie";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoria="descuento";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR:
					sNombreCampoCategoria="descuento_valor";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVAVALOR:
					sNombreCampoCategoria="iva_valor";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoria="ice";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICEVALOR:
					sNombreCampoCategoria="ice_valor";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoria="sub_total";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPEDIDOPUNTOVENTA:
					sNombreCampoCategoriaValor="id_pedido_punto_venta";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_SERIE:
					sNombreCampoCategoriaValor="serie";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoriaValor="descuento";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR:
					sNombreCampoCategoriaValor="descuento_valor";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVAVALOR:
					sNombreCampoCategoriaValor="iva_valor";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoriaValor="ice";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICEVALOR:
					sNombreCampoCategoriaValor="ice_valor";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoriaValor="sub_total";
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPEDIDOPUNTOVENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pedido",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pedido_punto_venta");
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_SERIE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Serie",sNombreCampoCategoria,sNombreCampoCategoriaValor,"serie");
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento %",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento");
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento_valor");
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva %",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVAVALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva_valor");
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ice %",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ice");
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICEVALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ice",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ice_valor");
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sub Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sub_total");
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_TOTAL:
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
	
	public void jButtonGenerarExcelReporteDinamicoDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetallePedidoPuntoVenta> detallepedidopuntoventasSeleccionados=new ArrayList<DetallePedidoPuntoVenta>();		
		
		detallepedidopuntoventasSeleccionados=this.getDetallePedidoPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepedidopuntoventa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetallePedidoPuntoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetallePedidoPuntoVenta detallepedidopuntoventa:detallepedidopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepedidopuntoventa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DetallePedidoPuntoVenta detallepedidopuntoventa:detallepedidopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepedidopuntoventa.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPEDIDOPUNTOVENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPEDIDOPUNTOVENTA);
					iRow++;

					for(DetallePedidoPuntoVenta detallepedidopuntoventa:detallepedidopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepedidopuntoventa.getpedidopuntoventa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(DetallePedidoPuntoVenta detallepedidopuntoventa:detallepedidopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepedidopuntoventa.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(DetallePedidoPuntoVenta detallepedidopuntoventa:detallepedidopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepedidopuntoventa.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(DetallePedidoPuntoVenta detallepedidopuntoventa:detallepedidopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepedidopuntoventa.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_SERIE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_SERIE);
					iRow++;

					for(DetallePedidoPuntoVenta detallepedidopuntoventa:detallepedidopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepedidopuntoventa.getserie());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(DetallePedidoPuntoVenta detallepedidopuntoventa:detallepedidopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepedidopuntoventa.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(DetallePedidoPuntoVenta detallepedidopuntoventa:detallepedidopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepedidopuntoventa.getprecio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTO);
					iRow++;

					for(DetallePedidoPuntoVenta detallepedidopuntoventa:detallepedidopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepedidopuntoventa.getdescuento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR);
					iRow++;

					for(DetallePedidoPuntoVenta detallepedidopuntoventa:detallepedidopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepedidopuntoventa.getdescuento_valor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVA);
					iRow++;

					for(DetallePedidoPuntoVenta detallepedidopuntoventa:detallepedidopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepedidopuntoventa.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVAVALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVAVALOR);
					iRow++;

					for(DetallePedidoPuntoVenta detallepedidopuntoventa:detallepedidopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepedidopuntoventa.getiva_valor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICE);
					iRow++;

					for(DetallePedidoPuntoVenta detallepedidopuntoventa:detallepedidopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepedidopuntoventa.getice());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICEVALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICEVALOR);
					iRow++;

					for(DetallePedidoPuntoVenta detallepedidopuntoventa:detallepedidopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepedidopuntoventa.getice_valor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL);
					iRow++;

					for(DetallePedidoPuntoVenta detallepedidopuntoventa:detallepedidopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepedidopuntoventa.getsub_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePedidoPuntoVentaConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(DetallePedidoPuntoVenta detallepedidopuntoventa:detallepedidopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepedidopuntoventa.gettotal());
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
			//	this.getFilaCabeceraExportarExcelDetallePedidoPuntoVenta(row);				
			//	iRow++;
			//}				
			
			//for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:detallepedidopuntoventasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetallePedidoPuntoVenta(detallepedidopuntoventaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pedido",JOptionPane.INFORMATION_MESSAGE);
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
				this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
			
			//SI ES MANUAL
			if(DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetallePedidoPuntoVenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
			
			//SI ES MANUAL
			if(DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetallePedidoPuntoVenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
			
			//SI ES MANUAL
			if(DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetallePedidoPuntoVenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetallePedidoPuntoVenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetallePedidoPuntoVenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetallePedidoPuntoVenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetallePedidoPuntoVenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetallePedidoPuntoVenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetallePedidoPuntoVenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetallePedidoPuntoVenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetallePedidoPuntoVenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetallePedidoPuntoVenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetallePedidoPuntoVenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetallePedidoPuntoVenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetallePedidoPuntoVenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetallePedidoPuntoVenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetallePedidoPuntoVenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetallePedidoPuntoVenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetallePedidoPuntoVenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetallePedidoPuntoVenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetallePedidoPuntoVenta();
		
		this.inicializarActualizarBindingBotonesManualDetallePedidoPuntoVenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetallePedidoPuntoVenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetallePedidoPuntoVenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetallePedidoPuntoVenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetallePedidoPuntoVenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetallePedidoPuntoVenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetallePedidoPuntoVenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetallePedidoPuntoVenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jCheckBoxPostAccionNuevoDetallePedidoPuntoVenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jCheckBoxPostAccionSinCerrarDetallePedidoPuntoVenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jCheckBoxPostAccionSinMensajeDetallePedidoPuntoVenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetallePedidoPuntoVenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetallePedidoPuntoVenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetallePedidoPuntoVenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
				this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jCheckBoxPostAccionNuevoDetallePedidoPuntoVenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jCheckBoxPostAccionSinCerrarDetallePedidoPuntoVenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jCheckBoxPostAccionSinMensajeDetallePedidoPuntoVenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetallePedidoPuntoVenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetallePedidoPuntoVenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetallePedidoPuntoVenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetallePedidoPuntoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetallePedidoPuntoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetallePedidoPuntoVenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetallePedidoPuntoVenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetallePedidoPuntoVenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetallePedidoPuntoVenta(Boolean esInicializar) throws Exception {
		try	{	
			if(DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetallePedidoPuntoVenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetallePedidoPuntoVenta() throws Exception {
		try	{
			if(DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetallePedidoPuntoVenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetallePedidoPuntoVenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetallePedidoPuntoVenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetallePedidoPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetallePedidoPuntoVenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetallePedidoPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetallePedidoPuntoVenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetallePedidoPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetallePedidoPuntoVenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetallePedidoPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetallePedidoPuntoVenta.addItem(reporte);
			}
			
			
			if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetallePedidoPuntoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetallePedidoPuntoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetallePedidoPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetallePedidoPuntoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetallePedidoPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetallePedidoPuntoVenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetallePedidoPuntoVenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetallePedidoPuntoVenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetallePedidoPuntoVenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DetallePedidoPuntoVentaConstantesFunciones.getTiposSeleccionarDetallePedidoPuntoVenta(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DetallePedidoPuntoVentaConstantesFunciones.getTiposSeleccionarDetallePedidoPuntoVenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DetallePedidoPuntoVentaConstantesFunciones.getTiposSeleccionarDetallePedidoPuntoVenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetallePedidoPuntoVenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.getSelectedItem()!=null){this.id_pedido_punto_ventaFK_IdPedidoPuntoVenta=((PedidoPuntoVenta)this.jComboBoxid_pedido_punto_ventaFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidadFK_IdUnidadDetallePedidoPuntoVenta.getSelectedItem()!=null){this.id_unidadFK_IdUnidad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadDetallePedidoPuntoVenta.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetallePedidoPuntoVenta(Boolean esInicializar) throws Exception {				
		if(DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetallePedidoPuntoVenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetallePedidoPuntoVenta() throws Exception {
		this.inicializarActualizarBindingTablaDetallePedidoPuntoVenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetallePedidoPuntoVenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetallePedidoPuntoVenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetallePedidoPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetallePedidoPuntoVenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetallePedidoPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetallePedidoPuntoVenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetallePedidoPuntoVentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetallePedidoPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetallePedidoPuntoVenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetallePedidoPuntoVenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetallePedidoPuntoVenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detallepedidopuntoventas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetallePedidoPuntoVenta.setModel(new DetallePedidoPuntoVentaModel(this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetallePedidoPuntoVenta.setModel(new DetallePedidoPuntoVentaModel(this.detallepedidopuntoventas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetallePedidoPuntoVenta!=null && this.jInternalFrameOrderByDetallePedidoPuntoVenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetallePedidoPuntoVenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,detallepedidopuntoventaConstantesFunciones.resaltarSeleccionarDetallePedidoPuntoVenta,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetallePedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,detallepedidopuntoventaConstantesFunciones.resaltarSeleccionarDetallePedidoPuntoVenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_ID));

		if(this.detallepedidopuntoventaConstantesFunciones.mostraridDetallePedidoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePedidoPuntoVentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltaridDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activaridDetallePedidoPuntoVenta,iSizeTabla,this,true,"idDetallePedidoPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltaridDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activaridDetallePedidoPuntoVenta,this,true,"idDetallePedidoPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detallepedidopuntoventaConstantesFunciones.mostrarid_empresaDetallePedidoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detallepedidopuntoventaConstantesFunciones.resaltarid_empresaDetallePedidoPuntoVenta,this,this.detallepedidopuntoventaConstantesFunciones.activarid_empresaDetallePedidoPuntoVenta,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detallepedidopuntoventaConstantesFunciones.resaltarid_empresaDetallePedidoPuntoVenta,this,this.detallepedidopuntoventaConstantesFunciones.activarid_empresaDetallePedidoPuntoVenta,false,"id_empresaDetallePedidoPuntoVenta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.detallepedidopuntoventaConstantesFunciones.mostrarid_sucursalDetallePedidoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.detallepedidopuntoventaConstantesFunciones.resaltarid_sucursalDetallePedidoPuntoVenta,this,this.detallepedidopuntoventaConstantesFunciones.activarid_sucursalDetallePedidoPuntoVenta,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.detallepedidopuntoventaConstantesFunciones.resaltarid_sucursalDetallePedidoPuntoVenta,this,this.detallepedidopuntoventaConstantesFunciones.activarid_sucursalDetallePedidoPuntoVenta,false,"id_sucursalDetallePedidoPuntoVenta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPEDIDOPUNTOVENTA));

		if(this.detallepedidopuntoventaConstantesFunciones.mostrarid_pedido_punto_ventaDetallePedidoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPEDIDOPUNTOVENTA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PedidoPuntoVentaTableCell(this.pedidopuntoventasForeignKey,this.detallepedidopuntoventaConstantesFunciones.resaltarid_pedido_punto_ventaDetallePedidoPuntoVenta,this,this.detallepedidopuntoventaConstantesFunciones.activarid_pedido_punto_ventaDetallePedidoPuntoVenta,iSizeTabla));
			tableColumn.setCellEditor(new PedidoPuntoVentaTableCell(this.pedidopuntoventasForeignKey,this.detallepedidopuntoventaConstantesFunciones.resaltarid_pedido_punto_ventaDetallePedidoPuntoVenta,this,this.detallepedidopuntoventaConstantesFunciones.activarid_pedido_punto_ventaDetallePedidoPuntoVenta,true,"id_pedido_punto_ventaDetallePedidoPuntoVenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDBODEGA));

		if(this.detallepedidopuntoventaConstantesFunciones.mostrarid_bodegaDetallePedidoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.detallepedidopuntoventaConstantesFunciones.resaltarid_bodegaDetallePedidoPuntoVenta,this,this.detallepedidopuntoventaConstantesFunciones.activarid_bodegaDetallePedidoPuntoVenta,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.detallepedidopuntoventaConstantesFunciones.resaltarid_bodegaDetallePedidoPuntoVenta,this,this.detallepedidopuntoventaConstantesFunciones.activarid_bodegaDetallePedidoPuntoVenta,true,"id_bodegaDetallePedidoPuntoVenta","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.detallepedidopuntoventaConstantesFunciones.mostrarid_productoDetallePedidoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.detallepedidopuntoventaConstantesFunciones.resaltarid_productoDetallePedidoPuntoVenta,this,this.detallepedidopuntoventaConstantesFunciones.activarid_productoDetallePedidoPuntoVenta,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.detallepedidopuntoventaConstantesFunciones.resaltarid_productoDetallePedidoPuntoVenta,this,this.detallepedidopuntoventaConstantesFunciones.activarid_productoDetallePedidoPuntoVenta,true,"id_productoDetallePedidoPuntoVenta","CON_BUSQUEDA-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDUNIDAD));

		if(this.detallepedidopuntoventaConstantesFunciones.mostrarid_unidadDetallePedidoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.detallepedidopuntoventaConstantesFunciones.resaltarid_unidadDetallePedidoPuntoVenta,this,this.detallepedidopuntoventaConstantesFunciones.activarid_unidadDetallePedidoPuntoVenta,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.detallepedidopuntoventaConstantesFunciones.resaltarid_unidadDetallePedidoPuntoVenta,this,this.detallepedidopuntoventaConstantesFunciones.activarid_unidadDetallePedidoPuntoVenta,true,"id_unidadDetallePedidoPuntoVenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_SERIE));

		if(this.detallepedidopuntoventaConstantesFunciones.mostrarserieDetallePedidoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePedidoPuntoVentaConstantesFunciones.LABEL_SERIE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltarserieDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activarserieDetallePedidoPuntoVenta,iSizeTabla,this,true,"serieDetallePedidoPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltarserieDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activarserieDetallePedidoPuntoVenta,this,true,"serieDetallePedidoPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_CANTIDAD));

		if(this.detallepedidopuntoventaConstantesFunciones.mostrarcantidadDetallePedidoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePedidoPuntoVentaConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltarcantidadDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activarcantidadDetallePedidoPuntoVenta,iSizeTabla,this,true,"cantidadDetallePedidoPuntoVenta","BASICO-CON_EVENT_CHANGE"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltarcantidadDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activarcantidadDetallePedidoPuntoVenta,this,true,"cantidadDetallePedidoPuntoVenta","BASICO-CON_EVENT_CHANGE",true));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_PRECIO));

		if(this.detallepedidopuntoventaConstantesFunciones.mostrarprecioDetallePedidoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePedidoPuntoVentaConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltarprecioDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activarprecioDetallePedidoPuntoVenta,iSizeTabla,this,true,"precioDetallePedidoPuntoVenta","BASICO-CON_EVENT_CHANGE"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltarprecioDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activarprecioDetallePedidoPuntoVenta,this,true,"precioDetallePedidoPuntoVenta","BASICO-CON_EVENT_CHANGE",true));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTO));

		if(this.detallepedidopuntoventaConstantesFunciones.mostrardescuentoDetallePedidoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltardescuentoDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activardescuentoDetallePedidoPuntoVenta,iSizeTabla,this,true,"descuentoDetallePedidoPuntoVenta","BASICO-CON_EVENT_CHANGE"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltardescuentoDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activardescuentoDetallePedidoPuntoVenta,this,true,"descuentoDetallePedidoPuntoVenta","BASICO-CON_EVENT_CHANGE",true));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR));

		if(this.detallepedidopuntoventaConstantesFunciones.mostrardescuento_valorDetallePedidoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltardescuento_valorDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activardescuento_valorDetallePedidoPuntoVenta,iSizeTabla,this,true,"descuento_valorDetallePedidoPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltardescuento_valorDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activardescuento_valorDetallePedidoPuntoVenta,this,true,"descuento_valorDetallePedidoPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVA));

		if(this.detallepedidopuntoventaConstantesFunciones.mostrarivaDetallePedidoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltarivaDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activarivaDetallePedidoPuntoVenta,iSizeTabla,this,true,"ivaDetallePedidoPuntoVenta","BASICO-CON_EVENT_CHANGE"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltarivaDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activarivaDetallePedidoPuntoVenta,this,true,"ivaDetallePedidoPuntoVenta","BASICO-CON_EVENT_CHANGE",true));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVAVALOR));

		if(this.detallepedidopuntoventaConstantesFunciones.mostrariva_valorDetallePedidoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVAVALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltariva_valorDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activariva_valorDetallePedidoPuntoVenta,iSizeTabla,this,true,"iva_valorDetallePedidoPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltariva_valorDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activariva_valorDetallePedidoPuntoVenta,this,true,"iva_valorDetallePedidoPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICE));

		if(this.detallepedidopuntoventaConstantesFunciones.mostrariceDetallePedidoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltariceDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activariceDetallePedidoPuntoVenta,iSizeTabla,this,true,"iceDetallePedidoPuntoVenta","BASICO-CON_EVENT_CHANGE"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltariceDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activariceDetallePedidoPuntoVenta,this,true,"iceDetallePedidoPuntoVenta","BASICO-CON_EVENT_CHANGE",true));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICEVALOR));

		if(this.detallepedidopuntoventaConstantesFunciones.mostrarice_valorDetallePedidoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICEVALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltarice_valorDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activarice_valorDetallePedidoPuntoVenta,iSizeTabla,this,true,"ice_valorDetallePedidoPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltarice_valorDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activarice_valorDetallePedidoPuntoVenta,this,true,"ice_valorDetallePedidoPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL));

		if(this.detallepedidopuntoventaConstantesFunciones.mostrarsub_totalDetallePedidoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePedidoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltarsub_totalDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activarsub_totalDetallePedidoPuntoVenta,iSizeTabla,this,true,"sub_totalDetallePedidoPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltarsub_totalDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activarsub_totalDetallePedidoPuntoVenta,this,true,"sub_totalDetallePedidoPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,DetallePedidoPuntoVentaConstantesFunciones.LABEL_TOTAL));

		if(this.detallepedidopuntoventaConstantesFunciones.mostrartotalDetallePedidoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePedidoPuntoVentaConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltartotalDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activartotalDetallePedidoPuntoVenta,iSizeTabla,this,true,"totalDetallePedidoPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepedidopuntoventaConstantesFunciones.resaltartotalDetallePedidoPuntoVenta,this.detallepedidopuntoventaConstantesFunciones.activartotalDetallePedidoPuntoVenta,this,true,"totalDetallePedidoPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePedidoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetallePedidoPuntoVenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetallePedidoPuntoVenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetallePedidoPuntoVenta && this.isPermisoGuardarCambiosDetallePedidoPuntoVenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetallePedidoPuntoVenta.addColumn(tableColumn);
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
			
			this.jTableDatosDetallePedidoPuntoVenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetallePedidoPuntoVenta && this.isPermisoGuardarCambiosDetallePedidoPuntoVenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetallePedidoPuntoVenta && this.isPermisoGuardarCambiosDetallePedidoPuntoVenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetallePedidoPuntoVenta.moveColumn(this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetallePedidoPuntoVenta.moveColumn(this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetallePedidoPuntoVenta.moveColumn(this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetallePedidoPuntoVenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetallePedidoPuntoVenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetallePedidoPuntoVenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetallePedidoPuntoVenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetallePedidoPuntoVenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetallePedidoPuntoVenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detallepedidopuntoventas.size()-1;
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
		//this.jTableDatosDetallePedidoPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetallePedidoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetallePedidoPuntoVenta();
			
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
				
				//this.isEsNuevoDetallePedidoPuntoVenta=false;
					
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
			
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetallePedidoPuntoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detallepedidopuntoventa.getsType().equals("DUPLICADO")
				   || this.detallepedidopuntoventa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetallePedidoPuntoVenta=true;
				
				} else {
					this.isEsNuevoDetallePedidoPuntoVenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
					if(this.detallepedidopuntoventa.getId()>=0 && !this.detallepedidopuntoventa.getIsNew()) {						
						this.isEsNuevoDetallePedidoPuntoVenta=false;
						
					} else {
						this.isEsNuevoDetallePedidoPuntoVenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetallePedidoPuntoVenta(esRelaciones);						
				
				this.seleccionarDetallePedidoPuntoVenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detallepedidopuntoventa.getId()<0) {
					this.isEsNuevoDetallePedidoPuntoVenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetallePedidoPuntoVenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetallePedidoPuntoVenta(evt,rowIndex);
				}	
				
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetallePedidoPuntoVenta: " + this.dDif); 
					}
				}								
				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetallePedidoPuntoVenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detallepedidopuntoventa)) {
					if(this.detallepedidopuntoventa.getId()>0) {
						this.detallepedidopuntoventa.setIsDeleted(true);
						
						this.detallepedidopuntoventasEliminados.add(this.detallepedidopuntoventa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().remove(this.detallepedidopuntoventa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallepedidopuntoventas.remove(this.detallepedidopuntoventa);				
					}
					
					
					((DetallePedidoPuntoVentaModel) this.jTableDatosDetallePedidoPuntoVenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetallePedidoPuntoVenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetallePedidoPuntoVenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetallePedidoPuntoVenta) {
			
			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetallePedidoPuntoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.detallepedidopuntoventaConstantesFunciones.cargarid_empresaDetallePedidoPuntoVenta || this.detallepedidopuntoventaConstantesFunciones.event_dependid_empresaDetallePedidoPuntoVenta) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detallepedidopuntoventa.getid_empresa());
									//this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detallepedidopuntoventa.getEmpresa()!=null) {
							this.empresasForeignKey.add(detallepedidopuntoventa.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detallepedidopuntoventa.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.detallepedidopuntoventaConstantesFunciones.cargarid_sucursalDetallePedidoPuntoVenta || this.detallepedidopuntoventaConstantesFunciones.event_dependid_sucursalDetallePedidoPuntoVenta) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.detallepedidopuntoventa.getid_sucursal());
									//this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(detallepedidopuntoventa.getSucursal()!=null) {
							this.sucursalsForeignKey.add(detallepedidopuntoventa.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.detallepedidopuntoventa.getid_sucursal(),false,"Formulario");

					//PedidoPuntoVenta
					if(!this.detallepedidopuntoventaConstantesFunciones.cargarid_pedido_punto_ventaDetallePedidoPuntoVenta || this.detallepedidopuntoventaConstantesFunciones.event_dependid_pedido_punto_ventaDetallePedidoPuntoVenta) {
						//this.cargarCombosPedidoPuntoVentasForeignKeyLista(" where id="+this.detallepedidopuntoventa.getid_pedido_punto_venta());
									//this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);
						this.pedidopuntoventasForeignKey=new ArrayList<PedidoPuntoVenta>();

						if(detallepedidopuntoventa.getPedidoPuntoVenta()!=null) {
							this.pedidopuntoventasForeignKey.add(detallepedidopuntoventa.getPedidoPuntoVenta());
						}

						this.addItemDefectoCombosForeignKeyPedidoPuntoVenta();
						this.cargarCombosFramePedidoPuntoVentasForeignKey("Todos");
					}
					this.setActualPedidoPuntoVentaForeignKey(this.detallepedidopuntoventa.getid_pedido_punto_venta(),false,"Formulario");

					//Bodega
					if(!this.detallepedidopuntoventaConstantesFunciones.cargarid_bodegaDetallePedidoPuntoVenta || this.detallepedidopuntoventaConstantesFunciones.event_dependid_bodegaDetallePedidoPuntoVenta) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.detallepedidopuntoventa.getid_bodega());
									//this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(detallepedidopuntoventa.getBodega()!=null) {
							this.bodegasForeignKey.add(detallepedidopuntoventa.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.detallepedidopuntoventa.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.detallepedidopuntoventaConstantesFunciones.cargarid_productoDetallePedidoPuntoVenta || this.detallepedidopuntoventaConstantesFunciones.event_dependid_productoDetallePedidoPuntoVenta) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.detallepedidopuntoventa.getid_producto());
									//this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(detallepedidopuntoventa.getProducto()!=null) {
							this.productosForeignKey.add(detallepedidopuntoventa.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.detallepedidopuntoventa.getid_producto(),false,"Formulario");

					//Unidad
					if(!this.detallepedidopuntoventaConstantesFunciones.cargarid_unidadDetallePedidoPuntoVenta || this.detallepedidopuntoventaConstantesFunciones.event_dependid_unidadDetallePedidoPuntoVenta) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.detallepedidopuntoventa.getid_unidad());
									//this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(detallepedidopuntoventa.getUnidad()!=null) {
							this.unidadsForeignKey.add(detallepedidopuntoventa.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.detallepedidopuntoventa.getid_unidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetallePedidoPuntoVenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetallePedidoPuntoVenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetallePedidoPuntoVenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetallePedidoPuntoVenta(DetallePedidoPuntoVenta detallepedidopuntoventa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetallePedidoPuntoVenta(detallepedidopuntoventa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetallePedidoPuntoVenta(DetallePedidoPuntoVenta detallepedidopuntoventa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetallePedidoPuntoVenta(detallepedidopuntoventa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetallePedidoPuntoVenta(detallepedidopuntoventa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetallePedidoPuntoVenta(detallepedidopuntoventa);
	}
	
	public void setVariablesObjetoActualToFormularioDetallePedidoPuntoVenta(DetallePedidoPuntoVenta detallepedidopuntoventa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelidDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getId().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldserieDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getserie());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldcantidadDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getcantidad().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldprecioDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getprecio().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuentoDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getdescuento().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuento_valorDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getdescuento_valor().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldivaDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getiva().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiva_valorDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getiva_valor().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiceDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getice().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldice_valorDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getice_valor().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldsub_totalDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getsub_total().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldtotalDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.gettotal().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetallePedidoPuntoVenta detallepedidopuntoventaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detallepedidopuntoventaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetallePedidoPuntoVenta detallepedidopuntoventaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detallepedidopuntoventaLocal=this.detallepedidopuntoventa;
			} else {
				detallepedidopuntoventaLocal=this.detallepedidopuntoventaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detallepedidopuntoventaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetallePedidoPuntoVenta(detallepedidopuntoventaLocal,true);
					
					if(detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detallepedidopuntoventaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detallepedidopuntoventaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetallePedidoPuntoVenta(DetallePedidoPuntoVenta detallepedidopuntoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(detallepedidopuntoventa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(detallepedidopuntoventa);
	}
	
	public void setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(DetallePedidoPuntoVenta detallepedidopuntoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(detallepedidopuntoventa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(DetallePedidoPuntoVenta detallepedidopuntoventa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelidDetallePedidoPuntoVenta.getText()==null || this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelidDetallePedidoPuntoVenta.getText()=="" || this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelidDetallePedidoPuntoVenta.getText()=="Id") {
				this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelidDetallePedidoPuntoVenta.setText("0");
			}

			if(conColumnasBase) {detallepedidopuntoventa.setId(Long.parseLong(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelidDetallePedidoPuntoVenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePedidoPuntoVentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelIdDetallePedidoPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepedidopuntoventa.setserie(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldserieDetallePedidoPuntoVenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePedidoPuntoVentaConstantesFunciones.LABEL_SERIE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelserieDetallePedidoPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepedidopuntoventa.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldcantidadDetallePedidoPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePedidoPuntoVentaConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelcantidadDetallePedidoPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepedidopuntoventa.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldprecioDetallePedidoPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePedidoPuntoVentaConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelprecioDetallePedidoPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepedidopuntoventa.setdescuento(Double.parseDouble(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuentoDetallePedidoPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabeldescuentoDetallePedidoPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepedidopuntoventa.setdescuento_valor(Double.parseDouble(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuento_valorDetallePedidoPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabeldescuento_valorDetallePedidoPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepedidopuntoventa.setiva(Double.parseDouble(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldivaDetallePedidoPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelivaDetallePedidoPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepedidopuntoventa.setiva_valor(Double.parseDouble(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiva_valorDetallePedidoPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVAVALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabeliva_valorDetallePedidoPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepedidopuntoventa.setice(Double.parseDouble(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiceDetallePedidoPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabeliceDetallePedidoPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepedidopuntoventa.setice_valor(Double.parseDouble(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldice_valorDetallePedidoPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICEVALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelice_valorDetallePedidoPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepedidopuntoventa.setsub_total(Double.parseDouble(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldsub_totalDetallePedidoPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePedidoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelsub_totalDetallePedidoPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepedidopuntoventa.settotal(Double.parseDouble(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldtotalDetallePedidoPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePedidoPuntoVentaConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabeltotalDetallePedidoPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetallePedidoPuntoVenta(DetallePedidoPuntoVenta detallepedidopuntoventaBean,DetallePedidoPuntoVenta detallepedidopuntoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && detallepedidopuntoventaBean.getid_pedido_punto_venta()!=null && !detallepedidopuntoventaBean.getid_pedido_punto_venta().equals(-1L))) {detallepedidopuntoventa.setid_pedido_punto_venta(detallepedidopuntoventaBean.getid_pedido_punto_venta());}
			if(conDefault || (!conDefault && detallepedidopuntoventaBean.getid_bodega()!=null && !detallepedidopuntoventaBean.getid_bodega().equals(-1L))) {detallepedidopuntoventa.setid_bodega(detallepedidopuntoventaBean.getid_bodega());}
			if(conDefault || (!conDefault && detallepedidopuntoventaBean.getid_producto()!=null && !detallepedidopuntoventaBean.getid_producto().equals(-1L))) {detallepedidopuntoventa.setid_producto(detallepedidopuntoventaBean.getid_producto());}
			if(conDefault || (!conDefault && detallepedidopuntoventaBean.getid_unidad()!=null && !detallepedidopuntoventaBean.getid_unidad().equals(-1L))) {detallepedidopuntoventa.setid_unidad(detallepedidopuntoventaBean.getid_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetallePedidoPuntoVenta(DetallePedidoPuntoVenta detallepedidopuntoventaOrigen,DetallePedidoPuntoVenta detallepedidopuntoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallepedidopuntoventaOrigen.getId()!=null && !detallepedidopuntoventaOrigen.getId().equals(0L))) {detallepedidopuntoventa.setId(detallepedidopuntoventaOrigen.getId());}}
			if(conDefault || (!conDefault && detallepedidopuntoventaOrigen.getid_pedido_punto_venta()!=null && !detallepedidopuntoventaOrigen.getid_pedido_punto_venta().equals(-1L))) {detallepedidopuntoventa.setid_pedido_punto_venta(detallepedidopuntoventaOrigen.getid_pedido_punto_venta());}
			if(conDefault || (!conDefault && detallepedidopuntoventaOrigen.getid_bodega()!=null && !detallepedidopuntoventaOrigen.getid_bodega().equals(-1L))) {detallepedidopuntoventa.setid_bodega(detallepedidopuntoventaOrigen.getid_bodega());}
			if(conDefault || (!conDefault && detallepedidopuntoventaOrigen.getid_producto()!=null && !detallepedidopuntoventaOrigen.getid_producto().equals(-1L))) {detallepedidopuntoventa.setid_producto(detallepedidopuntoventaOrigen.getid_producto());}
			if(conDefault || (!conDefault && detallepedidopuntoventaOrigen.getid_unidad()!=null && !detallepedidopuntoventaOrigen.getid_unidad().equals(-1L))) {detallepedidopuntoventa.setid_unidad(detallepedidopuntoventaOrigen.getid_unidad());}
			if(conDefault || (!conDefault && detallepedidopuntoventaOrigen.getserie()!=null && !detallepedidopuntoventaOrigen.getserie().equals(""))) {detallepedidopuntoventa.setserie(detallepedidopuntoventaOrigen.getserie());}
			if(conDefault || (!conDefault && detallepedidopuntoventaOrigen.getcantidad()!=null && !detallepedidopuntoventaOrigen.getcantidad().equals(0))) {detallepedidopuntoventa.setcantidad(detallepedidopuntoventaOrigen.getcantidad());}
			if(conDefault || (!conDefault && detallepedidopuntoventaOrigen.getprecio()!=null && !detallepedidopuntoventaOrigen.getprecio().equals(0.0))) {detallepedidopuntoventa.setprecio(detallepedidopuntoventaOrigen.getprecio());}
			if(conDefault || (!conDefault && detallepedidopuntoventaOrigen.getdescuento()!=null && !detallepedidopuntoventaOrigen.getdescuento().equals(0.0))) {detallepedidopuntoventa.setdescuento(detallepedidopuntoventaOrigen.getdescuento());}
			if(conDefault || (!conDefault && detallepedidopuntoventaOrigen.getdescuento_valor()!=null && !detallepedidopuntoventaOrigen.getdescuento_valor().equals(0.0))) {detallepedidopuntoventa.setdescuento_valor(detallepedidopuntoventaOrigen.getdescuento_valor());}
			if(conDefault || (!conDefault && detallepedidopuntoventaOrigen.getiva()!=null && !detallepedidopuntoventaOrigen.getiva().equals(0.0))) {detallepedidopuntoventa.setiva(detallepedidopuntoventaOrigen.getiva());}
			if(conDefault || (!conDefault && detallepedidopuntoventaOrigen.getiva_valor()!=null && !detallepedidopuntoventaOrigen.getiva_valor().equals(0.0))) {detallepedidopuntoventa.setiva_valor(detallepedidopuntoventaOrigen.getiva_valor());}
			if(conDefault || (!conDefault && detallepedidopuntoventaOrigen.getice()!=null && !detallepedidopuntoventaOrigen.getice().equals(0.0))) {detallepedidopuntoventa.setice(detallepedidopuntoventaOrigen.getice());}
			if(conDefault || (!conDefault && detallepedidopuntoventaOrigen.getice_valor()!=null && !detallepedidopuntoventaOrigen.getice_valor().equals(0.0))) {detallepedidopuntoventa.setice_valor(detallepedidopuntoventaOrigen.getice_valor());}
			if(conDefault || (!conDefault && detallepedidopuntoventaOrigen.getsub_total()!=null && !detallepedidopuntoventaOrigen.getsub_total().equals(0.0))) {detallepedidopuntoventa.setsub_total(detallepedidopuntoventaOrigen.getsub_total());}
			if(conDefault || (!conDefault && detallepedidopuntoventaOrigen.gettotal()!=null && !detallepedidopuntoventaOrigen.gettotal().equals(0.0))) {detallepedidopuntoventa.settotal(detallepedidopuntoventaOrigen.gettotal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetallePedidoPuntoVenta(DetallePedidoPuntoVenta detallepedidopuntoventa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelidDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getId().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldserieDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getserie());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldcantidadDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getcantidad().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldprecioDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getprecio().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuentoDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getdescuento().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuento_valorDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getdescuento_valor().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldivaDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getiva().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiva_valorDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getiva_valor().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiceDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getice().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldice_valorDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getice_valor().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldsub_totalDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.getsub_total().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldtotalDetallePedidoPuntoVenta.setText(detallepedidopuntoventa.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetallePedidoPuntoVenta(DetallePedidoPuntoVentaBean detallepedidopuntoventaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelidDetallePedidoPuntoVenta.setText(detallepedidopuntoventaBean.getId().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldserieDetallePedidoPuntoVenta.setText(detallepedidopuntoventaBean.getserie());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldcantidadDetallePedidoPuntoVenta.setText(detallepedidopuntoventaBean.getcantidad().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldprecioDetallePedidoPuntoVenta.setText(detallepedidopuntoventaBean.getprecio().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuentoDetallePedidoPuntoVenta.setText(detallepedidopuntoventaBean.getdescuento().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuento_valorDetallePedidoPuntoVenta.setText(detallepedidopuntoventaBean.getdescuento_valor().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldivaDetallePedidoPuntoVenta.setText(detallepedidopuntoventaBean.getiva().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiva_valorDetallePedidoPuntoVenta.setText(detallepedidopuntoventaBean.getiva_valor().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiceDetallePedidoPuntoVenta.setText(detallepedidopuntoventaBean.getice().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldice_valorDetallePedidoPuntoVenta.setText(detallepedidopuntoventaBean.getice_valor().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldsub_totalDetallePedidoPuntoVenta.setText(detallepedidopuntoventaBean.getsub_total().toString());
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldtotalDetallePedidoPuntoVenta.setText(detallepedidopuntoventaBean.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetallePedidoPuntoVenta(DetallePedidoPuntoVentaParameterReturnGeneral detallepedidopuntoventaReturnGeneral,DetallePedidoPuntoVentaBean detallepedidopuntoventaBean,Boolean conDefault) throws Exception { 
		try {
			DetallePedidoPuntoVenta detallepedidopuntoventaLocal=new DetallePedidoPuntoVenta();
			
			detallepedidopuntoventaLocal=detallepedidopuntoventaReturnGeneral.getDetallePedidoPuntoVenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallepedidopuntoventaLocal.getId()!=null && !detallepedidopuntoventaLocal.getId().equals(0L))) {detallepedidopuntoventaBean.setId(detallepedidopuntoventaLocal.getId());}}
			if(conDefault || (!conDefault && detallepedidopuntoventaLocal.getid_pedido_punto_venta()!=null && !detallepedidopuntoventaLocal.getid_pedido_punto_venta().equals(-1L))) {detallepedidopuntoventaBean.setid_pedido_punto_venta(detallepedidopuntoventaLocal.getid_pedido_punto_venta());}
			if(conDefault || (!conDefault && detallepedidopuntoventaLocal.getid_bodega()!=null && !detallepedidopuntoventaLocal.getid_bodega().equals(-1L))) {detallepedidopuntoventaBean.setid_bodega(detallepedidopuntoventaLocal.getid_bodega());}
			if(conDefault || (!conDefault && detallepedidopuntoventaLocal.getid_producto()!=null && !detallepedidopuntoventaLocal.getid_producto().equals(-1L))) {detallepedidopuntoventaBean.setid_producto(detallepedidopuntoventaLocal.getid_producto());}
			if(conDefault || (!conDefault && detallepedidopuntoventaLocal.getid_unidad()!=null && !detallepedidopuntoventaLocal.getid_unidad().equals(-1L))) {detallepedidopuntoventaBean.setid_unidad(detallepedidopuntoventaLocal.getid_unidad());}
			if(conDefault || (!conDefault && detallepedidopuntoventaLocal.getserie()!=null && !detallepedidopuntoventaLocal.getserie().equals(""))) {detallepedidopuntoventaBean.setserie(detallepedidopuntoventaLocal.getserie());}
			if(conDefault || (!conDefault && detallepedidopuntoventaLocal.getcantidad()!=null && !detallepedidopuntoventaLocal.getcantidad().equals(0))) {detallepedidopuntoventaBean.setcantidad(detallepedidopuntoventaLocal.getcantidad());}
			if(conDefault || (!conDefault && detallepedidopuntoventaLocal.getprecio()!=null && !detallepedidopuntoventaLocal.getprecio().equals(0.0))) {detallepedidopuntoventaBean.setprecio(detallepedidopuntoventaLocal.getprecio());}
			if(conDefault || (!conDefault && detallepedidopuntoventaLocal.getdescuento()!=null && !detallepedidopuntoventaLocal.getdescuento().equals(0.0))) {detallepedidopuntoventaBean.setdescuento(detallepedidopuntoventaLocal.getdescuento());}
			if(conDefault || (!conDefault && detallepedidopuntoventaLocal.getdescuento_valor()!=null && !detallepedidopuntoventaLocal.getdescuento_valor().equals(0.0))) {detallepedidopuntoventaBean.setdescuento_valor(detallepedidopuntoventaLocal.getdescuento_valor());}
			if(conDefault || (!conDefault && detallepedidopuntoventaLocal.getiva()!=null && !detallepedidopuntoventaLocal.getiva().equals(0.0))) {detallepedidopuntoventaBean.setiva(detallepedidopuntoventaLocal.getiva());}
			if(conDefault || (!conDefault && detallepedidopuntoventaLocal.getiva_valor()!=null && !detallepedidopuntoventaLocal.getiva_valor().equals(0.0))) {detallepedidopuntoventaBean.setiva_valor(detallepedidopuntoventaLocal.getiva_valor());}
			if(conDefault || (!conDefault && detallepedidopuntoventaLocal.getice()!=null && !detallepedidopuntoventaLocal.getice().equals(0.0))) {detallepedidopuntoventaBean.setice(detallepedidopuntoventaLocal.getice());}
			if(conDefault || (!conDefault && detallepedidopuntoventaLocal.getice_valor()!=null && !detallepedidopuntoventaLocal.getice_valor().equals(0.0))) {detallepedidopuntoventaBean.setice_valor(detallepedidopuntoventaLocal.getice_valor());}
			if(conDefault || (!conDefault && detallepedidopuntoventaLocal.getsub_total()!=null && !detallepedidopuntoventaLocal.getsub_total().equals(0.0))) {detallepedidopuntoventaBean.setsub_total(detallepedidopuntoventaLocal.getsub_total());}
			if(conDefault || (!conDefault && detallepedidopuntoventaLocal.gettotal()!=null && !detallepedidopuntoventaLocal.gettotal().equals(0.0))) {detallepedidopuntoventaBean.settotal(detallepedidopuntoventaLocal.gettotal());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetallePedidoPuntoVentaGenerico(Long idDetallePedidoPuntoVentaSeleccionado,JComboBox jComboBoxDetallePedidoPuntoVenta,List<DetallePedidoPuntoVenta> detallepedidopuntoventasLocal)throws Exception {
		try {
			DetallePedidoPuntoVenta  detallepedidopuntoventaTemp=null;

			for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:detallepedidopuntoventasLocal) {
				if(detallepedidopuntoventaAux.getId()!=null && detallepedidopuntoventaAux.getId().equals(idDetallePedidoPuntoVentaSeleccionado)) {
					detallepedidopuntoventaTemp=detallepedidopuntoventaAux;
					break;
				}
			}

			jComboBoxDetallePedidoPuntoVenta.setSelectedItem(detallepedidopuntoventaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetallePedidoPuntoVentaGenerico(JComboBox jComboBoxDetallePedidoPuntoVenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetallePedidoPuntoVenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetallePedidoPuntoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetallePedidoPuntoVenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetallePedidoPuntoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetallePedidoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetallePedidoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallepedidopuntoventa=(DetallePedidoPuntoVenta) detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallepedidopuntoventa =(DetallePedidoPuntoVenta) detallepedidopuntoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detallepedidopuntoventa.getIsNew() && !detallepedidopuntoventa.getIsChanged() && !detallepedidopuntoventa.getIsDeleted()) {
				sDescripcion=detallepedidopuntoventa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detallepedidopuntoventa.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!detallepedidopuntoventa.getIsNew() && !detallepedidopuntoventa.getIsChanged() && !detallepedidopuntoventa.getIsDeleted()) {
				sDescripcion=detallepedidopuntoventa.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=detallepedidopuntoventa.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("PedidoPuntoVenta")) {
			//sDescripcion=this.getActualPedidoPuntoVentaForeignKeyDescripcion((Long)value);
			if(!detallepedidopuntoventa.getIsNew() && !detallepedidopuntoventa.getIsChanged() && !detallepedidopuntoventa.getIsDeleted()) {
				sDescripcion=detallepedidopuntoventa.getpedidopuntoventa_descripcion();
			} else {
				//sDescripcion=this.getActualPedidoPuntoVentaForeignKeyDescripcion((Long)value);
				sDescripcion=detallepedidopuntoventa.getpedidopuntoventa_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!detallepedidopuntoventa.getIsNew() && !detallepedidopuntoventa.getIsChanged() && !detallepedidopuntoventa.getIsDeleted()) {
				sDescripcion=detallepedidopuntoventa.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=detallepedidopuntoventa.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!detallepedidopuntoventa.getIsNew() && !detallepedidopuntoventa.getIsChanged() && !detallepedidopuntoventa.getIsDeleted()) {
				sDescripcion=detallepedidopuntoventa.getproducto_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=detallepedidopuntoventa.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!detallepedidopuntoventa.getIsNew() && !detallepedidopuntoventa.getIsChanged() && !detallepedidopuntoventa.getIsDeleted()) {
				sDescripcion=detallepedidopuntoventa.getunidad_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=detallepedidopuntoventa.getunidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetallePedidoPuntoVenta detallepedidopuntoventaRow=new DetallePedidoPuntoVenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallepedidopuntoventaRow=(DetallePedidoPuntoVenta) detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallepedidopuntoventaRow=(DetallePedidoPuntoVenta) detallepedidopuntoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetallePedidoPuntoVenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoDetallePedidoPuntoVenta && this.isPermisoNuevoDetallePedidoPuntoVenta));			
			this.jButtonDuplicarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarDetallePedidoPuntoVenta && this.isPermisoDuplicarDetallePedidoPuntoVenta));			
			this.jButtonCopiarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarDetallePedidoPuntoVenta && this.isPermisoCopiarDetallePedidoPuntoVenta));
			this.jButtonVerFormDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormDetallePedidoPuntoVenta && this.isPermisoVerFormDetallePedidoPuntoVenta));
			
			this.jButtonAbrirOrderByDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenDetallePedidoPuntoVenta && this.isPermisoOrdenDetallePedidoPuntoVenta));			
			
			this.jButtonNuevoRelacionesDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta && this.isPermisoNuevoDetallePedidoPuntoVenta));			
			this.jButtonNuevoGuardarCambiosDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoDetallePedidoPuntoVenta && this.isPermisoNuevoDetallePedidoPuntoVenta && this.isPermisoGuardarCambiosDetallePedidoPuntoVenta));
			
			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonModificarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaModificarDetallePedidoPuntoVenta && this.isPermisoActualizarDetallePedidoPuntoVenta));	
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonActualizarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarDetallePedidoPuntoVenta && this.isPermisoActualizarDetallePedidoPuntoVenta));	
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonEliminarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarDetallePedidoPuntoVenta && this.isPermisoEliminarDetallePedidoPuntoVenta));
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonCancelarDetallePedidoPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarDetallePedidoPuntoVenta);							
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonGuardarCambiosDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta && this.isPermisoGuardarCambiosDetallePedidoPuntoVenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta && this.isPermisoGuardarCambiosDetallePedidoPuntoVenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoDetallePedidoPuntoVenta && this.isPermisoNuevoDetallePedidoPuntoVenta));						
			this.jButtonDuplicarToolBarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarDetallePedidoPuntoVenta && this.isPermisoDuplicarDetallePedidoPuntoVenta));						
			this.jButtonCopiarToolBarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarDetallePedidoPuntoVenta && this.isPermisoCopiarDetallePedidoPuntoVenta));			
			this.jButtonVerFormToolBarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormDetallePedidoPuntoVenta && this.isPermisoVerFormDetallePedidoPuntoVenta));			
			this.jButtonAbrirOrderByToolBarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenDetallePedidoPuntoVenta && this.isPermisoOrdenDetallePedidoPuntoVenta));
			this.jButtonNuevoRelacionesToolBarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta && this.isPermisoNuevoDetallePedidoPuntoVenta));			
			this.jButtonNuevoGuardarCambiosToolBarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoDetallePedidoPuntoVenta && this.isPermisoNuevoDetallePedidoPuntoVenta && this.isPermisoGuardarCambiosDetallePedidoPuntoVenta));			
			
			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonModificarToolBarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaModificarDetallePedidoPuntoVenta && this.isPermisoActualizarDetallePedidoPuntoVenta));	
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonActualizarToolBarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarDetallePedidoPuntoVenta  && this.isPermisoActualizarDetallePedidoPuntoVenta));	
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonEliminarToolBarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarDetallePedidoPuntoVenta && this.isPermisoEliminarDetallePedidoPuntoVenta));
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonCancelarToolBarDetallePedidoPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarDetallePedidoPuntoVenta);				
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonGuardarCambiosToolBarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta && this.isPermisoGuardarCambiosDetallePedidoPuntoVenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta && this.isPermisoGuardarCambiosDetallePedidoPuntoVenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoDetallePedidoPuntoVenta && this.isPermisoNuevoDetallePedidoPuntoVenta));			
			this.jMenuItemDuplicarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarDetallePedidoPuntoVenta && this.isPermisoDuplicarDetallePedidoPuntoVenta));			
			this.jMenuItemCopiarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarDetallePedidoPuntoVenta && this.isPermisoCopiarDetallePedidoPuntoVenta));			
			this.jMenuItemVerFormDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormDetallePedidoPuntoVenta && this.isPermisoVerFormDetallePedidoPuntoVenta));			
			this.jMenuItemAbrirOrderByDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenDetallePedidoPuntoVenta && this.isPermisoOrdenDetallePedidoPuntoVenta));			
			//this.jMenuItemMostrarOcultarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenDetallePedidoPuntoVenta && this.isPermisoOrdenDetallePedidoPuntoVenta));
			this.jMenuItemDetalleAbrirOrderByDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenDetallePedidoPuntoVenta && this.isPermisoOrdenDetallePedidoPuntoVenta));			
			//this.jMenuItemDetalleMostrarOcultarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenDetallePedidoPuntoVenta && this.isPermisoOrdenDetallePedidoPuntoVenta));			
			this.jMenuItemNuevoRelacionesDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta && this.isPermisoNuevoDetallePedidoPuntoVenta));			
			this.jMenuItemNuevoGuardarCambiosDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoDetallePedidoPuntoVenta && this.isPermisoNuevoDetallePedidoPuntoVenta && this.isPermisoGuardarCambiosDetallePedidoPuntoVenta));									
			
			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jMenuItemModificarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaModificarDetallePedidoPuntoVenta && this.isPermisoActualizarDetallePedidoPuntoVenta));	
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jMenuItemActualizarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarDetallePedidoPuntoVenta && this.isPermisoActualizarDetallePedidoPuntoVenta));	
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jMenuItemEliminarDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarDetallePedidoPuntoVenta && this.isPermisoEliminarDetallePedidoPuntoVenta));
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jMenuItemCancelarDetallePedidoPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarDetallePedidoPuntoVenta);				
			}
			
			this.jMenuItemGuardarCambiosDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta && this.isPermisoGuardarCambiosDetallePedidoPuntoVenta));						
			this.jMenuItemGuardarCambiosTablaDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta && this.isPermisoGuardarCambiosDetallePedidoPuntoVenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetallePedidoPuntoVenta=this.jButtonNuevoDetallePedidoPuntoVenta.isVisible();
			this.isVisibilidadCeldaDuplicarDetallePedidoPuntoVenta=this.jButtonDuplicarDetallePedidoPuntoVenta.isVisible();
			this.isVisibilidadCeldaCopiarDetallePedidoPuntoVenta=this.jButtonCopiarDetallePedidoPuntoVenta.isVisible();
			this.isVisibilidadCeldaVerFormDetallePedidoPuntoVenta=this.jButtonVerFormDetallePedidoPuntoVenta.isVisible();
			
			this.isVisibilidadCeldaOrdenDetallePedidoPuntoVenta=this.jButtonAbrirOrderByDetallePedidoPuntoVenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta=this.jButtonNuevoRelacionesDetallePedidoPuntoVenta.isVisible();
			this.isVisibilidadCeldaModificarDetallePedidoPuntoVenta=this.jButtonModificarDetallePedidoPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
			this.isVisibilidadCeldaActualizarDetallePedidoPuntoVenta=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonActualizarDetallePedidoPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarDetallePedidoPuntoVenta=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonEliminarDetallePedidoPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarDetallePedidoPuntoVenta=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonCancelarDetallePedidoPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonGuardarCambiosDetallePedidoPuntoVenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta=this.jButtonGuardarCambiosTablaDetallePedidoPuntoVenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetallePedidoPuntoVenta=this.jButtonNuevoToolBarDetallePedidoPuntoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta=this.jButtonNuevoRelacionesToolBarDetallePedidoPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
			this.isVisibilidadCeldaModificarDetallePedidoPuntoVenta=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonModificarToolBarDetallePedidoPuntoVenta.isVisible();
			this.isVisibilidadCeldaActualizarDetallePedidoPuntoVenta=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonActualizarToolBarDetallePedidoPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarDetallePedidoPuntoVenta=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonEliminarToolBarDetallePedidoPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarDetallePedidoPuntoVenta=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonCancelarToolBarDetallePedidoPuntoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta=this.jButtonGuardarCambiosToolBarDetallePedidoPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta=this.jButtonGuardarCambiosTablaToolBarDetallePedidoPuntoVenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetallePedidoPuntoVenta=this.jMenuItemNuevoDetallePedidoPuntoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta=this.jMenuItemNuevoRelacionesDetallePedidoPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
			this.isVisibilidadCeldaModificarDetallePedidoPuntoVenta=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jMenuItemModificarDetallePedidoPuntoVenta.isVisible();
			this.isVisibilidadCeldaActualizarDetallePedidoPuntoVenta=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jMenuItemActualizarDetallePedidoPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarDetallePedidoPuntoVenta=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jMenuItemEliminarDetallePedidoPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarDetallePedidoPuntoVenta=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jMenuItemCancelarDetallePedidoPuntoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta=this.jMenuItemGuardarCambiosDetallePedidoPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta=this.jMenuItemGuardarCambiosTablaDetallePedidoPuntoVenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetallePedidoPuntoVenta(Boolean esInicializar) {
		if(DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
				//if(this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetallePedidoPuntoVenta();
			}
			
			this.inicializarActualizarBindingBotonesManualDetallePedidoPuntoVenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetallePedidoPuntoVenta() {
		this.jButtonNuevoDetallePedidoPuntoVenta.setVisible(this.isPermisoNuevoDetallePedidoPuntoVenta);			
		this.jButtonDuplicarDetallePedidoPuntoVenta.setVisible(this.isPermisoDuplicarDetallePedidoPuntoVenta);			
		this.jButtonCopiarDetallePedidoPuntoVenta.setVisible(this.isPermisoCopiarDetallePedidoPuntoVenta);			
		this.jButtonVerFormDetallePedidoPuntoVenta.setVisible(this.isPermisoVerFormDetallePedidoPuntoVenta);			
		
		this.jButtonAbrirOrderByDetallePedidoPuntoVenta.setVisible(this.isPermisoOrdenDetallePedidoPuntoVenta);					
		
		this.jButtonNuevoRelacionesDetallePedidoPuntoVenta.setVisible(this.isPermisoNuevoDetallePedidoPuntoVenta);			
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonModificarDetallePedidoPuntoVenta.setVisible(this.isPermisoActualizarDetallePedidoPuntoVenta);	
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonActualizarDetallePedidoPuntoVenta.setVisible(this.isPermisoActualizarDetallePedidoPuntoVenta);	
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonEliminarDetallePedidoPuntoVenta.setVisible(this.isPermisoEliminarDetallePedidoPuntoVenta);
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonCancelarDetallePedidoPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarDetallePedidoPuntoVenta);						
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonGuardarCambiosDetallePedidoPuntoVenta.setVisible(this.isPermisoGuardarCambiosDetallePedidoPuntoVenta);							
		}
		
		this.jButtonGuardarCambiosTablaDetallePedidoPuntoVenta.setVisible(this.isPermisoActualizarDetallePedidoPuntoVenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetallePedidoPuntoVenta() {
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonModificarDetallePedidoPuntoVenta.setVisible(this.isPermisoActualizarDetallePedidoPuntoVenta);	
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonActualizarDetallePedidoPuntoVenta.setVisible(this.isPermisoActualizarDetallePedidoPuntoVenta);	
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonEliminarDetallePedidoPuntoVenta.setVisible(this.isPermisoEliminarDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonCancelarDetallePedidoPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarDetallePedidoPuntoVenta);							
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonGuardarCambiosDetallePedidoPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta && this.isPermisoGuardarCambiosDetallePedidoPuntoVenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetallePedidoPuntoVenta() {
		if(DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetallePedidoPuntoVenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetallePedidoPuntoVenta() {
	}
	
	public void jTableDatosDetallePedidoPuntoVentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetallePedidoPuntoVenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetallePedidoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepedidopuntoventa==null) {
						this.detallepedidopuntoventa = new DetallePedidoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
				}

				if(this.detallepedidopuntoventa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detallepedidopuntoventa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetallePedidoPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetallePedidoPuntoVenta(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePedidoPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePedidoPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detallepedidopuntoventaLogic.getConnexion());

				if(this.detallepedidopuntoventa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detallepedidopuntoventa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePedidoPuntoVenta=(TitledBorder)this.jScrollPanelDatosDetallePedidoPuntoVenta.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetallePedidoPuntoVenta.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetallePedidoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepedidopuntoventa==null) {
						this.detallepedidopuntoventa = new DetallePedidoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
				}

				if(this.detallepedidopuntoventa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detallepedidopuntoventa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDetallePedidoPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDetallePedidoPuntoVenta(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePedidoPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePedidoPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.detallepedidopuntoventaLogic.getConnexion());

				if(this.detallepedidopuntoventa.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.detallepedidopuntoventa.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePedidoPuntoVenta=(TitledBorder)this.jScrollPanelDatosDetallePedidoPuntoVenta.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDetallePedidoPuntoVenta.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDetallePedidoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepedidopuntoventa==null) {
						this.detallepedidopuntoventa = new DetallePedidoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
				}

				if(this.detallepedidopuntoventa.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.detallepedidopuntoventa.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopedidopuntoventa=true;

			idTienePermisopedidopuntoventa=this.tienePermisosUsuarioEnPaginaWebDetallePedidoPuntoVenta(PedidoPuntoVentaConstantesFunciones.CLASSNAME);

			if(idTienePermisopedidopuntoventa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePedidoPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePedidoPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);

				this.pedidopuntoventaBeanSwingJInternalFrame=new PedidoPuntoVentaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.pedidopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.pedidopuntoventaBeanSwingJInternalFrame.getPedidoPuntoVentaLogic().setConnexion(this.detallepedidopuntoventaLogic.getConnexion());

				if(this.detallepedidopuntoventa.getid_pedido_punto_venta()!=null) {
					this.pedidopuntoventaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.pedidopuntoventaBeanSwingJInternalFrame.setIdActual(this.detallepedidopuntoventa.getid_pedido_punto_venta());
					this.pedidopuntoventaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.pedidopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.pedidopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoPuntoVenta();
				}

				JInternalFrameBase jinternalFrame =this.pedidopuntoventaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePedidoPuntoVenta=(TitledBorder)this.jScrollPanelDatosDetallePedidoPuntoVenta.getBorder();
				TitledBorder titledBorderpedidopuntoventa=(TitledBorder)this.pedidopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosPedidoPuntoVenta.getBorder();

				titledBorderpedidopuntoventa.setTitle(titledBorderDetallePedidoPuntoVenta.getTitle() + " -> Pedido Punto Venta");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepedidopuntoventa==null) {
						this.detallepedidopuntoventa = new DetallePedidoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
				}

				if(this.detallepedidopuntoventa.getid_pedido_punto_venta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pedido_punto_venta = "+this.detallepedidopuntoventa.getid_pedido_punto_venta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaDetallePedidoPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebDetallePedidoPuntoVenta(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePedidoPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePedidoPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.detallepedidopuntoventaLogic.getConnexion());

				if(this.detallepedidopuntoventa.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.detallepedidopuntoventa.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePedidoPuntoVenta=(TitledBorder)this.jScrollPanelDatosDetallePedidoPuntoVenta.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderDetallePedidoPuntoVenta.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaDetallePedidoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepedidopuntoventa==null) {
						this.detallepedidopuntoventa = new DetallePedidoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
				}

				if(this.detallepedidopuntoventa.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.detallepedidopuntoventa.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoDetallePedidoPuntoVentaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderDetallePedidoPuntoVenta=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosDetallePedidoPuntoVenta.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderDetallePedidoPuntoVenta=(TitledBorder)this.jScrollPanelDatosDetallePedidoPuntoVenta.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderDetallePedidoPuntoVenta.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoDetallePedidoPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebDetallePedidoPuntoVenta(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePedidoPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePedidoPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.detallepedidopuntoventaLogic.getConnexion());

				if(this.detallepedidopuntoventa.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.detallepedidopuntoventa.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePedidoPuntoVenta=(TitledBorder)this.jScrollPanelDatosDetallePedidoPuntoVenta.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderDetallePedidoPuntoVenta.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoDetallePedidoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepedidopuntoventa==null) {
						this.detallepedidopuntoventa = new DetallePedidoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
				}

				if(this.detallepedidopuntoventa.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.detallepedidopuntoventa.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadDetallePedidoPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebDetallePedidoPuntoVenta(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePedidoPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePedidoPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.detallepedidopuntoventaLogic.getConnexion());

				if(this.detallepedidopuntoventa.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.detallepedidopuntoventa.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePedidoPuntoVenta=(TitledBorder)this.jScrollPanelDatosDetallePedidoPuntoVenta.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderDetallePedidoPuntoVenta.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadDetallePedidoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepedidopuntoventa==null) {
						this.detallepedidopuntoventa = new DetallePedidoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
				}

				if(this.detallepedidopuntoventa.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.detallepedidopuntoventa.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonserieDetallePedidoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepedidopuntoventa==null) {
						this.detallepedidopuntoventa = new DetallePedidoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
				}

				if(this.detallepedidopuntoventa.getserie()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where serie like '%"+this.detallepedidopuntoventa.getserie()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadDetallePedidoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepedidopuntoventa==null) {
						this.detallepedidopuntoventa = new DetallePedidoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
				}

				if(this.detallepedidopuntoventa.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.detallepedidopuntoventa.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioDetallePedidoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepedidopuntoventa==null) {
						this.detallepedidopuntoventa = new DetallePedidoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
				}

				if(this.detallepedidopuntoventa.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.detallepedidopuntoventa.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuentoDetallePedidoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepedidopuntoventa==null) {
						this.detallepedidopuntoventa = new DetallePedidoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
				}

				if(this.detallepedidopuntoventa.getdescuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento = "+this.detallepedidopuntoventa.getdescuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuento_valorDetallePedidoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepedidopuntoventa==null) {
						this.detallepedidopuntoventa = new DetallePedidoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
				}

				if(this.detallepedidopuntoventa.getdescuento_valor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento_valor = "+this.detallepedidopuntoventa.getdescuento_valor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaDetallePedidoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepedidopuntoventa==null) {
						this.detallepedidopuntoventa = new DetallePedidoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
				}

				if(this.detallepedidopuntoventa.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.detallepedidopuntoventa.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoniva_valorDetallePedidoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepedidopuntoventa==null) {
						this.detallepedidopuntoventa = new DetallePedidoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
				}

				if(this.detallepedidopuntoventa.getiva_valor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva_valor = "+this.detallepedidopuntoventa.getiva_valor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoniceDetallePedidoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepedidopuntoventa==null) {
						this.detallepedidopuntoventa = new DetallePedidoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
				}

				if(this.detallepedidopuntoventa.getice()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ice = "+this.detallepedidopuntoventa.getice().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonice_valorDetallePedidoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepedidopuntoventa==null) {
						this.detallepedidopuntoventa = new DetallePedidoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
				}

				if(this.detallepedidopuntoventa.getice_valor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ice_valor = "+this.detallepedidopuntoventa.getice_valor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsub_totalDetallePedidoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepedidopuntoventa==null) {
						this.detallepedidopuntoventa = new DetallePedidoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
				}

				if(this.detallepedidopuntoventa.getsub_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sub_total = "+this.detallepedidopuntoventa.getsub_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalDetallePedidoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.getdetallepedidopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepedidopuntoventa==null) {
						this.detallepedidopuntoventa = new DetallePedidoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);
				}

				if(this.detallepedidopuntoventa.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.detallepedidopuntoventa.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);

			this.getDetallePedidoPuntoVentasFK_IdBodega();

			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);

			//if(DetallePedidoPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);

			this.getDetallePedidoPuntoVentasFK_IdEmpresa();

			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);

			//if(DetallePedidoPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPedidoPuntoVentaDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);

			this.getDetallePedidoPuntoVentasFK_IdPedidoPuntoVenta();

			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);

			//if(DetallePedidoPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);

			this.getDetallePedidoPuntoVentasFK_IdProducto();

			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);

			//if(DetallePedidoPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);

			this.getDetallePedidoPuntoVentasFK_IdSucursal();

			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);

			//if(DetallePedidoPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadDetallePedidoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);

			this.getDetallePedidoPuntoVentasFK_IdUnidad();

			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);

			//if(DetallePedidoPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepedidopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetallePedidoPuntoVenta() {
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.dispose();
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta!=null) {
			this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.dispose();
			this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta=null;
		}
		
		if(this.jInternalFrameImportacionDetallePedidoPuntoVenta!=null) {
			this.jInternalFrameImportacionDetallePedidoPuntoVenta.setVisible(false);	    			
			this.jInternalFrameImportacionDetallePedidoPuntoVenta.dispose();
			this.jInternalFrameImportacionDetallePedidoPuntoVenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetallePedidoPuntoVenta();
			
			DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetallePedidoPuntoVenta")) {
				jButtonNuevoDetallePedidoPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetallePedidoPuntoVenta")) {
				jButtonDuplicarDetallePedidoPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetallePedidoPuntoVenta")) {
				jButtonCopiarDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetallePedidoPuntoVenta")) {
				jButtonVerFormDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetallePedidoPuntoVenta")) {
				jButtonNuevoDetallePedidoPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetallePedidoPuntoVenta")) {
				jButtonDuplicarDetallePedidoPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetallePedidoPuntoVenta")) {
				jButtonNuevoDetallePedidoPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetallePedidoPuntoVenta")) {
				jButtonDuplicarDetallePedidoPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetallePedidoPuntoVenta")) {
				jButtonNuevoDetallePedidoPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetallePedidoPuntoVenta")) {
				jButtonNuevoDetallePedidoPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetallePedidoPuntoVenta")) {
				jButtonNuevoDetallePedidoPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetallePedidoPuntoVenta")) {
				jButtonModificarDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetallePedidoPuntoVenta")) {
				jButtonModificarDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetallePedidoPuntoVenta")) {
				jButtonModificarDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetallePedidoPuntoVenta")) {
				jButtonActualizarDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetallePedidoPuntoVenta")) {
				jButtonActualizarDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetallePedidoPuntoVenta")) {
				jButtonActualizarDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetallePedidoPuntoVenta")) {
				jButtonEliminarDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetallePedidoPuntoVenta")) {
				jButtonEliminarDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetallePedidoPuntoVenta")) {
				jButtonEliminarDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetallePedidoPuntoVenta")) {
				jButtonCancelarDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetallePedidoPuntoVenta")) {
				jButtonCancelarDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetallePedidoPuntoVenta")) {
				jButtonCancelarDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetallePedidoPuntoVenta")) {
				jButtonCerrarDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetallePedidoPuntoVenta")) {
				jButtonCerrarDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetallePedidoPuntoVenta")) {
				jButtonCerrarDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetallePedidoPuntoVenta")) {
				jButtonMostrarOcultarDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetallePedidoPuntoVenta")) {
				jButtonCancelarDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetallePedidoPuntoVenta")) {
				jButtonGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetallePedidoPuntoVenta")) {
				jButtonGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetallePedidoPuntoVenta")) {
				jButtonCopiarDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetallePedidoPuntoVenta")) {
				jButtonVerFormDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetallePedidoPuntoVenta")) {
				jButtonGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetallePedidoPuntoVenta")) {
				jButtonCopiarDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetallePedidoPuntoVenta")) {
				jButtonVerFormDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetallePedidoPuntoVenta")) {
				jButtonGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetallePedidoPuntoVenta")) {
				jButtonGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetallePedidoPuntoVenta")) {
				jButtonGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetallePedidoPuntoVenta")) {
				jButtonRecargarInformacionDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetallePedidoPuntoVenta")) {
				jButtonRecargarInformacionDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetallePedidoPuntoVenta")) {
				jButtonRecargarInformacionDetallePedidoPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetallePedidoPuntoVenta")) {
				jButtonAnterioresDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetallePedidoPuntoVenta")) {
				jButtonAnterioresDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetallePedidoPuntoVenta")) {
				jButtonAnterioresDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetallePedidoPuntoVenta")) {
				jButtonSiguientesDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetallePedidoPuntoVenta")) {
				jButtonSiguientesDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetallePedidoPuntoVenta")) {
				jButtonSiguientesDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetallePedidoPuntoVenta") || sTipo.equals("MenuItemDetalleAbrirOrderByDetallePedidoPuntoVenta")) {
				jButtonAbrirOrderByDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetallePedidoPuntoVenta") || sTipo.equals("MenuItemDetalleMostrarOcultarDetallePedidoPuntoVenta")) {
				jButtonMostrarOcultarDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetallePedidoPuntoVenta")) {
				jButtonNuevoGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetallePedidoPuntoVenta")) {
				jButtonNuevoGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetallePedidoPuntoVenta")) {
				jButtonNuevoGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetallePedidoPuntoVenta")) {
				jButtonCerrarReporteDinamicoDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetallePedidoPuntoVenta")) {
				jButtonGenerarReporteDinamicoDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetallePedidoPuntoVenta")) {
				
				jButtonGenerarExcelReporteDinamicoDetallePedidoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetallePedidoPuntoVenta")) {
				jButtonCerrarImportacionDetallePedidoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetallePedidoPuntoVenta")) {
				
				jButtonGenerarImportacionDetallePedidoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetallePedidoPuntoVenta")) {
				
				jButtonAbrirImportacionDetallePedidoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetallePedidoPuntoVenta")) {
				jComboBoxTiposAccionesDetallePedidoPuntoVentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetallePedidoPuntoVenta")) {
				jComboBoxTiposRelacionesDetallePedidoPuntoVentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetallePedidoPuntoVenta")) {
				jComboBoxTiposAccionesDetallePedidoPuntoVentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetallePedidoPuntoVenta")) {
				
				jComboBoxTiposSeleccionarDetallePedidoPuntoVentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetallePedidoPuntoVenta")) {
				jTextFieldValorCampoGeneralDetallePedidoPuntoVentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetallePedidoPuntoVenta")) {
				jButtonAbrirOrderByDetallePedidoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetallePedidoPuntoVenta")) {
				jButtonAbrirOrderByDetallePedidoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetallePedidoPuntoVenta")) {
				jButtonCerrarOrderByDetallePedidoPuntoVentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonidDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetallePedidoPuntoVentaUpdate")) {
				this.jButtonid_empresaDetallePedidoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonid_empresaDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetallePedidoPuntoVentaUpdate")) {
				this.jButtonid_sucursalDetallePedidoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonid_sucursalDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_pedido_punto_ventaDetallePedidoPuntoVentaUpdate")) {
				this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_pedido_punto_ventaDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaDetallePedidoPuntoVentaUpdate")) {
				this.jButtonid_bodegaDetallePedidoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonid_bodegaDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoDetallePedidoPuntoVenta")) {
				this.jButtonid_productoDetallePedidoPuntoVentaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoDetallePedidoPuntoVentaUpdate")) {
				this.jButtonid_productoDetallePedidoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonid_productoDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadDetallePedidoPuntoVentaUpdate")) {
				this.jButtonid_unidadDetallePedidoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonid_unidadDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("serieDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonserieDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadDetallePedidoPuntoVentaBusqueda")) {
				this.jButtoncantidadDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonprecioDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoDetallePedidoPuntoVentaBusqueda")) {
				this.jButtondescuentoDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento_valorDetallePedidoPuntoVentaBusqueda")) {
				this.jButtondescuento_valorDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonivaDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iva_valorDetallePedidoPuntoVentaBusqueda")) {
				this.jButtoniva_valorDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceDetallePedidoPuntoVentaBusqueda")) {
				this.jButtoniceDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ice_valorDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonice_valorDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sub_totalDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonsub_totalDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalDetallePedidoPuntoVentaBusqueda")) {
				this.jButtontotalDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoDetallePedidoPuntoVenta")) {
				this.jButtonid_productoDetallePedidoPuntoVentaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBodegaDetallePedidoPuntoVenta")) {
				this.jButtonFK_IdBodegaDetallePedidoPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPedidoPuntoVentaDetallePedidoPuntoVenta")) {
				this.jButtonFK_IdPedidoPuntoVentaDetallePedidoPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoDetallePedidoPuntoVenta")) {
				this.jButtonFK_IdProductoDetallePedidoPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadDetallePedidoPuntoVenta")) {
				this.jButtonFK_IdUnidadDetallePedidoPuntoVentaActionPerformed(evt);
			}
			
			;
			
			
			DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetallePedidoPuntoVenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePedidoPuntoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepedidopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepedidopuntoventa);
				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
				
				


			if(sTipo.equals("cantidadDetallePedidoPuntoVenta")) {
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("precioDetallePedidoPuntoVenta")) {
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("descuentoDetallePedidoPuntoVenta")) {
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("ivaDetallePedidoPuntoVenta")) {
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("iceDetallePedidoPuntoVenta")) {
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePedidoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePedidoPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetallePedidoPuntoVenta detallepedidopuntoventaLocal=null;
			
			if(!this.getEsControlTabla()) {
				detallepedidopuntoventaLocal=this.detallepedidopuntoventa;
			} else {
				detallepedidopuntoventaLocal=this.detallepedidopuntoventaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


				if(sTipo.equals("cantidadDetallePedidoPuntoVenta")) {
					if(detallepedidopuntoventaLocal.getcantidad()==Integer.parseInt(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldcantidadDetallePedidoPuntoVenta.getText())){existeCambio=false;};
				}
				 else if(sTipo.equals("precioDetallePedidoPuntoVenta")) {
					if(detallepedidopuntoventaLocal.getprecio()==Double.parseDouble(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldprecioDetallePedidoPuntoVenta.getText())){existeCambio=false;};
				}
				 else if(sTipo.equals("descuentoDetallePedidoPuntoVenta")) {
					if(detallepedidopuntoventaLocal.getdescuento()==Double.parseDouble(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuentoDetallePedidoPuntoVenta.getText())){existeCambio=false;};
				}
				 else if(sTipo.equals("ivaDetallePedidoPuntoVenta")) {
					if(detallepedidopuntoventaLocal.getiva()==Double.parseDouble(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldivaDetallePedidoPuntoVenta.getText())){existeCambio=false;};
				}
				 else if(sTipo.equals("iceDetallePedidoPuntoVenta")) {
					if(detallepedidopuntoventaLocal.getice()==Double.parseDouble(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiceDetallePedidoPuntoVenta.getText())){existeCambio=false;};
				}
			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepedidopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepedidopuntoventa);
				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
							
				
				


			if(sTipo.equals("cantidadDetallePedidoPuntoVenta")) {
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("precioDetallePedidoPuntoVenta")) {
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("descuentoDetallePedidoPuntoVenta")) {
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("ivaDetallePedidoPuntoVenta")) {
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("iceDetallePedidoPuntoVenta")) {
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePedidoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePedidoPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePedidoPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaAnterior =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepedidopuntoventaAnterior =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
			
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
			
			


			if(sTipo.equals("cantidadDetallePedidoPuntoVenta")) {
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("precioDetallePedidoPuntoVenta")) {
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("descuentoDetallePedidoPuntoVenta")) {
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("ivaDetallePedidoPuntoVenta")) {
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("iceDetallePedidoPuntoVenta")) {
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			
			DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePedidoPuntoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepedidopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepedidopuntoventa);
				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
								
						
				


				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePedidoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePedidoPuntoVenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepedidopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepedidopuntoventa);
				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
								
				
				


				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePedidoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePedidoPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePedidoPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaAnterior =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepedidopuntoventaAnterior =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepedidopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepedidopuntoventa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePedidoPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaAnterior =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepedidopuntoventaAnterior =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePedidoPuntoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepedidopuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallepedidopuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepedidopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepedidopuntoventa);
				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
							
				
				


				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePedidoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePedidoPuntoVenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePedidoPuntoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepedidopuntoventaAnterior =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallepedidopuntoventaAnterior =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
			
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
			
			


			
			DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePedidoPuntoVentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepedidopuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallepedidopuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepedidopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepedidopuntoventa);
				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
								
				
				


			if(sTipo.equals("cantidadDetallePedidoPuntoVenta")) {
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.LABEL,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"LABEL",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("precioDetallePedidoPuntoVenta")) {
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.LABEL,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"LABEL",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("descuentoDetallePedidoPuntoVenta")) {
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.LABEL,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"LABEL",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("ivaDetallePedidoPuntoVenta")) {
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.LABEL,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"LABEL",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("iceDetallePedidoPuntoVenta")) {
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.LABEL,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"LABEL",classes,false,esControlTabla);
			}
				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePedidoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePedidoPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePedidoPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaAnterior =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepedidopuntoventaAnterior =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePedidoPuntoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepedidopuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallepedidopuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePedidoPuntoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepedidopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepedidopuntoventa);
				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetallePedidoPuntoVenta")) {
					jCheckBoxSeleccionarTodosDetallePedidoPuntoVentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetallePedidoPuntoVenta")) {
					jCheckBoxSeleccionadosDetallePedidoPuntoVentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetallePedidoPuntoVenta")) {
					
				}
				
				


				
				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePedidoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePedidoPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepedidopuntoventa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detallepedidopuntoventa);
				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
												
				
				


				
				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePedidoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePedidoPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePedidoPuntoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepedidopuntoventaAnterior =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallepedidopuntoventaAnterior =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePedidoPuntoVentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepedidopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepedidopuntoventa);
				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
				
				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
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
			
			


			if(sTipo.equals("id_bodegaDetallePedidoPuntoVenta")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta;
				}

				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta,"FK_IdBodega");
				//recargarFormDetallePedidoPuntoVentaBodega(jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoDetallePedidoPuntoVenta")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta;
				}

				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta,"FK_IdProducto");
				//recargarFormDetallePedidoPuntoVentaProducto(jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta,"FK_IdProducto");
			}
			
			DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePedidoPuntoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepedidopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepedidopuntoventa);
				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_bodegaDetallePedidoPuntoVenta")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta;
				}

				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta,"FK_IdBodega");
				//recargarFormDetallePedidoPuntoVentaBodega(jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoDetallePedidoPuntoVenta")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta;
				}

				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta,"FK_IdProducto");
				//recargarFormDetallePedidoPuntoVentaProducto(jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta,"FK_IdProducto");
			}
				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePedidoPuntoVenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePedidoPuntoVenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepedidopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepedidopuntoventa);
				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
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
				
				


			if(sTipo.equals("id_bodegaDetallePedidoPuntoVenta")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta;
				}

				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta,"FK_IdBodega");
				//recargarFormDetallePedidoPuntoVentaBodega(jComboBoxid_bodegaFK_IdBodegaDetallePedidoPuntoVenta,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoDetallePedidoPuntoVenta")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta;
				}

				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormDetallePedidoPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta,"FK_IdProducto");
				//recargarFormDetallePedidoPuntoVentaProducto(jComboBoxid_productoFK_IdProductoDetallePedidoPuntoVenta,"FK_IdProducto");
			}
				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePedidoPuntoVenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePedidoPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePedidoPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepedidopuntoventaAnterior =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepedidopuntoventaAnterior =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetallePedidoPuntoVenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetallePedidoPuntoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetallePedidoPuntoVenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detallepedidopuntoventa =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detallepedidopuntoventa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetallePedidoPuntoVenta")) {
				
				}
				
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetallePedidoPuntoVenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetallePedidoPuntoVenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetallePedidoPuntoVenta")) {
			
			}
			
			DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetallePedidoPuntoVenta();
			
			DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
			
			if(sTipo.equals("NuevoDetallePedidoPuntoVenta")) {
				jButtonNuevoDetallePedidoPuntoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetallePedidoPuntoVenta")) {
				jButtonDuplicarDetallePedidoPuntoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetallePedidoPuntoVenta")) {
				jButtonCopiarDetallePedidoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetallePedidoPuntoVenta")) {
				jButtonVerFormDetallePedidoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetallePedidoPuntoVenta")) {
				jButtonNuevoDetallePedidoPuntoVentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetallePedidoPuntoVenta")) {
				jButtonModificarDetallePedidoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetallePedidoPuntoVenta")) {
				jButtonActualizarDetallePedidoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetallePedidoPuntoVenta")) {
				jButtonEliminarDetallePedidoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetallePedidoPuntoVenta")) {
				jButtonGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetallePedidoPuntoVenta")) {
				jButtonCancelarDetallePedidoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetallePedidoPuntoVenta")) {
				jButtonCerrarDetallePedidoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetallePedidoPuntoVenta")) {
				jButtonGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetallePedidoPuntoVenta")) {
				jButtonNuevoGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetallePedidoPuntoVenta")) {
				jButtonAbrirOrderByDetallePedidoPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetallePedidoPuntoVenta")) {
				jButtonRecargarInformacionDetallePedidoPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetallePedidoPuntoVenta")) {
				jButtonAnterioresDetallePedidoPuntoVentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetallePedidoPuntoVenta")) {
				jButtonSiguientesDetallePedidoPuntoVentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonidDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetallePedidoPuntoVentaUpdate")) {
				this.jButtonid_empresaDetallePedidoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonid_empresaDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetallePedidoPuntoVentaUpdate")) {
				this.jButtonid_sucursalDetallePedidoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonid_sucursalDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_pedido_punto_ventaDetallePedidoPuntoVentaUpdate")) {
				this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_pedido_punto_ventaDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaDetallePedidoPuntoVentaUpdate")) {
				this.jButtonid_bodegaDetallePedidoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonid_bodegaDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoDetallePedidoPuntoVenta")) {
				this.jButtonid_productoDetallePedidoPuntoVentaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoDetallePedidoPuntoVentaUpdate")) {
				this.jButtonid_productoDetallePedidoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonid_productoDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadDetallePedidoPuntoVentaUpdate")) {
				this.jButtonid_unidadDetallePedidoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonid_unidadDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("serieDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonserieDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadDetallePedidoPuntoVentaBusqueda")) {
				this.jButtoncantidadDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonprecioDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoDetallePedidoPuntoVentaBusqueda")) {
				this.jButtondescuentoDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento_valorDetallePedidoPuntoVentaBusqueda")) {
				this.jButtondescuento_valorDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonivaDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iva_valorDetallePedidoPuntoVentaBusqueda")) {
				this.jButtoniva_valorDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceDetallePedidoPuntoVentaBusqueda")) {
				this.jButtoniceDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ice_valorDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonice_valorDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sub_totalDetallePedidoPuntoVentaBusqueda")) {
				this.jButtonsub_totalDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalDetallePedidoPuntoVentaBusqueda")) {
				this.jButtontotalDetallePedidoPuntoVentaBusquedaActionPerformed(evt);
			}
			
			DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetallePedidoPuntoVenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetallePedidoPuntoVenta")) {
				closingInternalFrameDetallePedidoPuntoVenta();
				
			} else if(sTipo.equals("jButtonCancelarDetallePedidoPuntoVenta")) {
				JInternalFrameBase jInternalFrameDetalleFormDetallePedidoPuntoVenta = (JInternalFrameBase)evt.getSource();
	            	
	            DetallePedidoPuntoVentaBeanSwingJInternalFrame jInternalFrameParent=(DetallePedidoPuntoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormDetallePedidoPuntoVenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetallePedidoPuntoVentaActionPerformed(null);
			}
			
			DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallepedidopuntoventa,new Object(),this.detallepedidopuntoventaParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetallePedidoPuntoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetallePedidoPuntoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetallePedidoPuntoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detallepedidopuntoventa)) {
			if(!esControlTabla) {
				if(DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);			
				}
				
				if(this.detallepedidopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallepedidopuntoventaReturnGeneral=detallepedidopuntoventaLogic.procesarEventosDetallePedidoPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas(),this.detallepedidopuntoventa,this.detallepedidopuntoventaParameterGeneral,this.isEsNuevoDetallePedidoPuntoVenta,classes);//this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetallePedidoPuntoVenta(this.detallepedidopuntoventaReturnGeneral,this.detallepedidopuntoventaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detallepedidopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetallePedidoPuntoVenta(classes,this.detallepedidopuntoventaReturnGeneral,this.detallepedidopuntoventaBean,false);
					}
						
					if(this.detallepedidopuntoventaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetallePedidoPuntoVenta(this.detallepedidopuntoventaReturnGeneral.getDetallePedidoPuntoVenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetallePedidoPuntoVenta(this.detallepedidopuntoventaReturnGeneral.getDetallePedidoPuntoVenta());	
					}
						
					if(this.detallepedidopuntoventaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetallePedidoPuntoVenta(this.detallepedidopuntoventaReturnGeneral.getDetallePedidoPuntoVenta(),classes);//this.detallepedidopuntoventaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetallePedidoPuntoVenta(this.detallepedidopuntoventa,classes);//this.detallepedidopuntoventaBean);									
				}
			
				if(DetallePedidoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetallePedidoPuntoVenta(this.detallepedidopuntoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePedidoPuntoVenta(this.detallepedidopuntoventa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detallepedidopuntoventaAnterior!=null) {
						this.detallepedidopuntoventa=this.detallepedidopuntoventaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallepedidopuntoventaReturnGeneral=detallepedidopuntoventaLogic.procesarEventosDetallePedidoPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas(),this.detallepedidopuntoventa,this.detallepedidopuntoventaParameterGeneral,this.isEsNuevoDetallePedidoPuntoVenta,classes);//this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallepedidopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detallepedidopuntoventaReturnGeneral.getDetallePedidoPuntoVenta(),detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detallepedidopuntoventaReturnGeneral.getDetallePedidoPuntoVenta(),this.detallepedidopuntoventas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetallePedidoPuntoVenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetallePedidoPuntoVenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetallePedidoPuntoVenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetallePedidoPuntoVenta() throws Exception {
		
		DetallePedidoPuntoVentaModel detallepedidopuntoventaModel=(DetallePedidoPuntoVentaModel)this.jTableDatosDetallePedidoPuntoVenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallepedidopuntoventaModel.detallepedidopuntoventas=this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detallepedidopuntoventaModel.detallepedidopuntoventas=this.detallepedidopuntoventas;
		}
		
		
		((DetallePedidoPuntoVentaModel) this.jTableDatosDetallePedidoPuntoVenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetallePedidoPuntoVenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetallepedidopuntoventaAnterior(),this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetallepedidopuntoventaAnterior(),this.detallepedidopuntoventas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetallePedidoPuntoVenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetallePedidoPuntoVenta(DetallePedidoPuntoVenta detallepedidopuntoventa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
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
										
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallepedidopuntoventa,new Object(),generalEntityParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetallePedidoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetallePedidoPuntoVentaConstantesFunciones.getClassesRelationshipsFromStringsOfDetallePedidoPuntoVenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetallePedidoPuntoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallepedidopuntoventa,new Object(),generalEntityParameterGeneral,this.detallepedidopuntoventaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetallePedidoPuntoVenta(DetallePedidoPuntoVentaBean detallepedidopuntoventaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetallePedidoPuntoVenta(ArrayList<Classe> classes,DetallePedidoPuntoVentaReturnGeneral detallepedidopuntoventaReturnGeneral,DetallePedidoPuntoVentaBean detallepedidopuntoventaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetallePedidoPuntoVenta(DetallePedidoPuntoVenta detallepedidopuntoventa,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detallepedidopuntoventa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta = new DetallePedidoPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.detallepedidopuntoventaSessionBean.getConGuardarRelaciones(),this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.setVisible(false);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.detallepedidopuntoventaLogic=this.detallepedidopuntoventaLogic;
		
		this.cargarCombosFrameForeignKeyDetallePedidoPuntoVenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetallePedidoPuntoVenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetallePedidoPuntoVenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetallePedidoPuntoVenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetallePedidoPuntoVenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetallePedidoPuntoVenta"));
		
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonModificarDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarDetallePedidoPuntoVenta"));

		
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonModificarToolBarDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetallePedidoPuntoVenta"));
					
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jMenuItemModificarDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetallePedidoPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonActualizarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"ActualizarDetallePedidoPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonActualizarToolBarDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetallePedidoPuntoVenta"));
						
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jMenuItemActualizarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetallePedidoPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonEliminarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarDetallePedidoPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonEliminarToolBarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetallePedidoPuntoVenta"));
								
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jMenuItemEliminarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetallePedidoPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonCancelarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarDetallePedidoPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonCancelarToolBarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetallePedidoPuntoVenta"));
					
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jMenuItemCancelarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetallePedidoPuntoVenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jMenuItemDetalleCerrarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetallePedidoPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonGuardarCambiosToolBarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetallePedidoPuntoVenta"));
		
		
		
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonGuardarCambiosToolBarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetallePedidoPuntoVenta"));
		
		
		
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetallePedidoPuntoVenta"));
		
		
		//CAMPO EVENTO
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldcantidadDetallePedidoPuntoVenta.addFocusListener(new TextFieldFocusListener(this,"cantidadDetallePedidoPuntoVenta"));
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldcantidadDetallePedidoPuntoVenta.addActionListener(new TextFieldActionListener(this,"cantidadDetallePedidoPuntoVenta"));
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldcantidadDetallePedidoPuntoVenta.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldcantidadDetallePedidoPuntoVenta,"cantidadDetallePedidoPuntoVenta"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldprecioDetallePedidoPuntoVenta.addFocusListener(new TextFieldFocusListener(this,"precioDetallePedidoPuntoVenta"));
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldprecioDetallePedidoPuntoVenta.addActionListener(new TextFieldActionListener(this,"precioDetallePedidoPuntoVenta"));
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldprecioDetallePedidoPuntoVenta.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldprecioDetallePedidoPuntoVenta,"precioDetallePedidoPuntoVenta"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuentoDetallePedidoPuntoVenta.addFocusListener(new TextFieldFocusListener(this,"descuentoDetallePedidoPuntoVenta"));
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuentoDetallePedidoPuntoVenta.addActionListener(new TextFieldActionListener(this,"descuentoDetallePedidoPuntoVenta"));
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuentoDetallePedidoPuntoVenta.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFielddescuentoDetallePedidoPuntoVenta,"descuentoDetallePedidoPuntoVenta"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldivaDetallePedidoPuntoVenta.addFocusListener(new TextFieldFocusListener(this,"ivaDetallePedidoPuntoVenta"));
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldivaDetallePedidoPuntoVenta.addActionListener(new TextFieldActionListener(this,"ivaDetallePedidoPuntoVenta"));
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldivaDetallePedidoPuntoVenta.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldivaDetallePedidoPuntoVenta,"ivaDetallePedidoPuntoVenta"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiceDetallePedidoPuntoVenta.addFocusListener(new TextFieldFocusListener(this,"iceDetallePedidoPuntoVenta"));
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiceDetallePedidoPuntoVenta.addActionListener(new TextFieldActionListener(this,"iceDetallePedidoPuntoVenta"));
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiceDetallePedidoPuntoVenta.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldiceDetallePedidoPuntoVenta,"iceDetallePedidoPuntoVenta"));


				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonidDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idDetallePedidoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_empresaDetallePedidoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetallePedidoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_empresaDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetallePedidoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_sucursalDetallePedidoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePedidoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_sucursalDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePedidoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_pedido_punto_ventaDetallePedidoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_pedido_punto_ventaDetallePedidoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_bodegaDetallePedidoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDetallePedidoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_bodegaDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDetallePedidoPuntoVentaBusqueda"));
		//jButtonid_productoDetallePedidoPuntoVenta.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoDetallePedidoPuntoVentaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_productoDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"id_productoDetallePedidoPuntoVenta"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_productoDetallePedidoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_productoDetallePedidoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_productoDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDetallePedidoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_unidadDetallePedidoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_unidadDetallePedidoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_unidadDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonserieDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"serieDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtoncantidadDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"cantidadDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonprecioDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"precioDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtondescuentoDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtondescuento_valorDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"descuento_valorDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonivaDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"ivaDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtoniva_valorDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"iva_valorDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtoniceDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"iceDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonice_valorDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"ice_valorDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonsub_totalDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"sub_totalDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtontotalDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"totalDetallePedidoPuntoVentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTabbedPaneRelacionesDetallePedidoPuntoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetallePedidoPuntoVenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetallePedidoPuntoVenta"));
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetallePedidoPuntoVenta"));
		}
		
		this.jTableDatosDetallePedidoPuntoVenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetallePedidoPuntoVenta"));
		
		this.jTableDatosDetallePedidoPuntoVenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetallePedidoPuntoVenta"));
		
		this.jButtonNuevoDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoDetallePedidoPuntoVenta"));
		
		this.jButtonDuplicarDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"DuplicarDetallePedidoPuntoVenta"));
		
		this.jButtonCopiarDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"CopiarDetallePedidoPuntoVenta"));
		
		this.jButtonVerFormDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"VerFormDetallePedidoPuntoVenta"));
		
		
		this.jButtonNuevoToolBarDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetallePedidoPuntoVenta"));
			
		this.jButtonDuplicarToolBarDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetallePedidoPuntoVenta"));
			
		this.jMenuItemNuevoDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetallePedidoPuntoVenta"));
			
		this.jMenuItemDuplicarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetallePedidoPuntoVenta"));		
		
		
		this.jButtonNuevoRelacionesDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetallePedidoPuntoVenta"));
		
		
		this.jButtonNuevoRelacionesToolBarDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetallePedidoPuntoVenta"));
			
		this.jMenuItemNuevoRelacionesDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetallePedidoPuntoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonModificarDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarDetallePedidoPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonModificarToolBarDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetallePedidoPuntoVenta"));
			
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jMenuItemModificarDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetallePedidoPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonActualizarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"ActualizarDetallePedidoPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonActualizarToolBarDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetallePedidoPuntoVenta"));
				
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jMenuItemActualizarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetallePedidoPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonEliminarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarDetallePedidoPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonEliminarToolBarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetallePedidoPuntoVenta"));
						
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jMenuItemEliminarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetallePedidoPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonCancelarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarDetallePedidoPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonCancelarToolBarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetallePedidoPuntoVenta"));
			
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jMenuItemCancelarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetallePedidoPuntoVenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetallePedidoPuntoVenta"));		
		
		
		this.jButtonCerrarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarDetallePedidoPuntoVenta"));
		
		
		this.jButtonCerrarToolBarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetallePedidoPuntoVenta"));
			
		this.jMenuItemCerrarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetallePedidoPuntoVenta"));
			
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jMenuItemDetalleCerrarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetallePedidoPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonGuardarCambiosDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetallePedidoPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonGuardarCambiosToolBarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetallePedidoPuntoVenta"));
		}
		
		this.jButtonCopiarToolBarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetallePedidoPuntoVenta"));
			
		this.jButtonVerFormToolBarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetallePedidoPuntoVenta"));
		
		this.jMenuItemGuardarCambiosDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetallePedidoPuntoVenta"));
			
		this.jMenuItemCopiarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetallePedidoPuntoVenta"));		
		
		this.jMenuItemVerFormDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetallePedidoPuntoVenta"));		
		
		
		this.jButtonGuardarCambiosTablaDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetallePedidoPuntoVenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetallePedidoPuntoVenta"));
			
		this.jMenuItemGuardarCambiosTablaDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetallePedidoPuntoVenta"));		
		
		
		
		this.jButtonRecargarInformacionDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetallePedidoPuntoVenta"));
					
		this.jButtonRecargarInformacionToolBarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetallePedidoPuntoVenta"));
		
		this.jMenuItemRecargarInformacionDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetallePedidoPuntoVenta"));		
		
		
		
		this.jButtonAnterioresDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"AnterioresDetallePedidoPuntoVenta"));
		
		
		this.jButtonAnterioresToolBarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetallePedidoPuntoVenta"));
		
		this.jMenuItemAnterioresDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetallePedidoPuntoVenta"));		
		
		
		this.jButtonSiguientesDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"SiguientesDetallePedidoPuntoVenta"));
		
		
		this.jButtonSiguientesToolBarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetallePedidoPuntoVenta"));
			
		this.jMenuItemSiguientesDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetallePedidoPuntoVenta"));
			
		this.jMenuItemAbrirOrderByDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetallePedidoPuntoVenta"));
			
		this.jMenuItemMostrarOcultarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetallePedidoPuntoVenta"));
			
		this.jMenuItemDetalleAbrirOrderByDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetallePedidoPuntoVenta"));
			
		this.jMenuItemDetalleMostarOcultarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetallePedidoPuntoVenta"));		
		
		
		this.jButtonNuevoGuardarCambiosDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetallePedidoPuntoVenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetallePedidoPuntoVenta"));
			
		this.jMenuItemNuevoGuardarCambiosDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetallePedidoPuntoVenta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetallePedidoPuntoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetallePedidoPuntoVenta"));

		this.jCheckBoxSeleccionadosDetallePedidoPuntoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetallePedidoPuntoVenta"));
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetallePedidoPuntoVenta"));
		}
		
		
		this.jComboBoxTiposRelacionesDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetallePedidoPuntoVenta"));
			
		this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesDetallePedidoPuntoVenta"));
					
		this.jComboBoxTiposSeleccionarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetallePedidoPuntoVenta"));
			
		this.jTextFieldValorCampoGeneralDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetallePedidoPuntoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
		
		//CAMPO EVENTO
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldcantidadDetallePedidoPuntoVenta.addFocusListener(new TextFieldFocusListener(this,"cantidadDetallePedidoPuntoVenta"));
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldcantidadDetallePedidoPuntoVenta.addActionListener(new TextFieldActionListener(this,"cantidadDetallePedidoPuntoVenta"));
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldcantidadDetallePedidoPuntoVenta.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldcantidadDetallePedidoPuntoVenta,"cantidadDetallePedidoPuntoVenta"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldprecioDetallePedidoPuntoVenta.addFocusListener(new TextFieldFocusListener(this,"precioDetallePedidoPuntoVenta"));
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldprecioDetallePedidoPuntoVenta.addActionListener(new TextFieldActionListener(this,"precioDetallePedidoPuntoVenta"));
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldprecioDetallePedidoPuntoVenta.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldprecioDetallePedidoPuntoVenta,"precioDetallePedidoPuntoVenta"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuentoDetallePedidoPuntoVenta.addFocusListener(new TextFieldFocusListener(this,"descuentoDetallePedidoPuntoVenta"));
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuentoDetallePedidoPuntoVenta.addActionListener(new TextFieldActionListener(this,"descuentoDetallePedidoPuntoVenta"));
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuentoDetallePedidoPuntoVenta.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFielddescuentoDetallePedidoPuntoVenta,"descuentoDetallePedidoPuntoVenta"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldivaDetallePedidoPuntoVenta.addFocusListener(new TextFieldFocusListener(this,"ivaDetallePedidoPuntoVenta"));
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldivaDetallePedidoPuntoVenta.addActionListener(new TextFieldActionListener(this,"ivaDetallePedidoPuntoVenta"));
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldivaDetallePedidoPuntoVenta.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldivaDetallePedidoPuntoVenta,"ivaDetallePedidoPuntoVenta"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiceDetallePedidoPuntoVenta.addFocusListener(new TextFieldFocusListener(this,"iceDetallePedidoPuntoVenta"));
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiceDetallePedidoPuntoVenta.addActionListener(new TextFieldActionListener(this,"iceDetallePedidoPuntoVenta"));
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiceDetallePedidoPuntoVenta.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldiceDetallePedidoPuntoVenta,"iceDetallePedidoPuntoVenta"));


		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonidDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idDetallePedidoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_empresaDetallePedidoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetallePedidoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_empresaDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetallePedidoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_sucursalDetallePedidoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePedidoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_sucursalDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePedidoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_pedido_punto_ventaDetallePedidoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_pedido_punto_ventaDetallePedidoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_bodegaDetallePedidoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDetallePedidoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_bodegaDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDetallePedidoPuntoVentaBusqueda"));
		//jButtonid_productoDetallePedidoPuntoVenta.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoDetallePedidoPuntoVentaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_productoDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"id_productoDetallePedidoPuntoVenta"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_productoDetallePedidoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_productoDetallePedidoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_productoDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDetallePedidoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_unidadDetallePedidoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_unidadDetallePedidoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_unidadDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonserieDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"serieDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtoncantidadDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"cantidadDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonprecioDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"precioDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtondescuentoDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtondescuento_valorDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"descuento_valorDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonivaDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"ivaDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtoniva_valorDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"iva_valorDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtoniceDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"iceDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonice_valorDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"ice_valorDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonsub_totalDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"sub_totalDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtontotalDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"totalDetallePedidoPuntoVentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdBodegaDetallePedidoPuntoVenta"));

			this.jButtonFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdPedidoPuntoVentaDetallePedidoPuntoVenta"));

			this.jButtonFK_IdProductoDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdProductoDetallePedidoPuntoVenta"));

			this.jButtonBuscarFK_IdProductoid_productoDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"id_productoDetallePedidoPuntoVenta"));

			this.jButtonFK_IdUnidadDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdUnidadDetallePedidoPuntoVenta"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetallePedidoPuntoVenta"));
				this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetallePedidoPuntoVenta"));
				this.jInternalFrameReporteDinamicoDetallePedidoPuntoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetallePedidoPuntoVenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetallePedidoPuntoVenta"));				
			//this.jButtonGenerarReporteDinamicoDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetallePedidoPuntoVenta"));
			//this.jButtonGenerarExcelReporteDinamicoDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetallePedidoPuntoVenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetallePedidoPuntoVenta!=null) {
				this.jInternalFrameImportacionDetallePedidoPuntoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetallePedidoPuntoVenta"));
				this.jInternalFrameImportacionDetallePedidoPuntoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetallePedidoPuntoVenta"));
				this.jInternalFrameImportacionDetallePedidoPuntoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetallePedidoPuntoVenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetallePedidoPuntoVenta"));
			
			this.jButtonAbrirOrderByToolBarDetallePedidoPuntoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetallePedidoPuntoVenta"));			
			
			if(this.jInternalFrameOrderByDetallePedidoPuntoVenta!=null) {
				this.jInternalFrameOrderByDetallePedidoPuntoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetallePedidoPuntoVenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTabbedPaneRelacionesDetallePedidoPuntoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetallePedidoPuntoVenta"));
		
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
            		closingInternalFrameDetallePedidoPuntoVenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetallePedidoPuntoVenta = (JInternalFrameBase)event.getSource();
	            	
	            DetallePedidoPuntoVentaBeanSwingJInternalFrame jInternalFrameParent=(DetallePedidoPuntoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormDetallePedidoPuntoVenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetallePedidoPuntoVentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetallePedidoPuntoVenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetallePedidoPuntoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetallePedidoPuntoVenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetallePedidoPuntoVenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePedidoPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePedidoPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePedidoPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetallePedidoPuntoVenta";
		inputMap = this.jButtonNuevoDetallePedidoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetallePedidoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetallePedidoPuntoVentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePedidoPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePedidoPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePedidoPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetallePedidoPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesDetallePedidoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetallePedidoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetallePedidoPuntoVentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetallePedidoPuntoVenta";
		inputMap = this.jButtonModificarDetallePedidoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetallePedidoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetallePedidoPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetallePedidoPuntoVenta";
		inputMap = this.jButtonActualizarDetallePedidoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetallePedidoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetallePedidoPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetallePedidoPuntoVenta";
		inputMap = this.jButtonEliminarDetallePedidoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetallePedidoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetallePedidoPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetallePedidoPuntoVenta";
		inputMap = this.jButtonCancelarDetallePedidoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetallePedidoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetallePedidoPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetallePedidoPuntoVenta";
		inputMap = this.jButtonCerrarDetallePedidoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetallePedidoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetallePedidoPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonGuardarCambiosDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetallePedidoPuntoVenta";
		inputMap = this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonGuardarCambiosDetallePedidoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonGuardarCambiosDetallePedidoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetallePedidoPuntoVenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetallePedidoPuntoVentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetallePedidoPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetallePedidoPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetallePedidoPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetallePedidoPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetallePedidoPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonidDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idDetallePedidoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_empresaDetallePedidoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetallePedidoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_empresaDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetallePedidoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_sucursalDetallePedidoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePedidoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_sucursalDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePedidoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_pedido_punto_ventaDetallePedidoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_pedido_punto_ventaDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_pedido_punto_ventaDetallePedidoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_bodegaDetallePedidoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDetallePedidoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_bodegaDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDetallePedidoPuntoVentaBusqueda"));
		//jButtonid_productoDetallePedidoPuntoVenta.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoDetallePedidoPuntoVentaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_productoDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"id_productoDetallePedidoPuntoVenta"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_productoDetallePedidoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_productoDetallePedidoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_productoDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDetallePedidoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_unidadDetallePedidoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_unidadDetallePedidoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_unidadDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonserieDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"serieDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtoncantidadDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"cantidadDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonprecioDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"precioDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtondescuentoDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtondescuento_valorDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"descuento_valorDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonivaDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"ivaDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtoniva_valorDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"iva_valorDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtoniceDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"iceDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonice_valorDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"ice_valorDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonsub_totalDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"sub_totalDetallePedidoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtontotalDetallePedidoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"totalDetallePedidoPuntoVentaBusqueda"));
		
		
		this.jButtonFK_IdBodegaDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdBodegaDetallePedidoPuntoVenta"));

		this.jButtonFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdPedidoPuntoVentaDetallePedidoPuntoVenta"));

		this.jButtonFK_IdProductoDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdProductoDetallePedidoPuntoVenta"));

		this.jButtonBuscarFK_IdProductoid_productoDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"id_productoDetallePedidoPuntoVenta"));

		this.jButtonFK_IdUnidadDetallePedidoPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdUnidadDetallePedidoPuntoVenta"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetallePedidoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetallePedidoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetallePedidoPuntoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetallePedidoPuntoVenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetallePedidoPuntoVenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas()) {
					detallepedidopuntoventaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:detallepedidopuntoventas) {
					detallepedidopuntoventaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetallePedidoPuntoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas()) {
						detallepedidopuntoventaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:detallepedidopuntoventas) {
						detallepedidopuntoventaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:detallepedidopuntoventas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetallePedidoPuntoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetallePedidoPuntoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetallePedidoPuntoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetallePedidoPuntoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetallePedidoPuntoVenta.getSelectedRows();
			
			DetallePedidoPuntoVenta detallepedidopuntoventaLocal=new DetallePedidoPuntoVenta();
			
			//this.seleccionarTodosDetallePedidoPuntoVenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepedidopuntoventaLocal =(DetallePedidoPuntoVenta) this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas().toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detallepedidopuntoventaLocal =(DetallePedidoPuntoVenta) this.detallepedidopuntoventas.toArray()[this.jTableDatosDetallePedidoPuntoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detallepedidopuntoventaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas()) {
						detallepedidopuntoventaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:detallepedidopuntoventas) {
						detallepedidopuntoventaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetallePedidoPuntoVenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetallePedidoPuntoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetallePedidoPuntoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetallePedidoPuntoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetallePedidoPuntoVentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetallePedidoPuntoVentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetallePedidoPuntoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetallePedidoPuntoVenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas()) {
				
						if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_SERIE)) {
							existe=true;
							detallepedidopuntoventaAux.setserie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							detallepedidopuntoventaAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							detallepedidopuntoventaAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							detallepedidopuntoventaAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR)) {
							existe=true;
							detallepedidopuntoventaAux.setdescuento_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVA)) {
							existe=true;
							detallepedidopuntoventaAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVAVALOR)) {
							existe=true;
							detallepedidopuntoventaAux.setiva_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICE)) {
							existe=true;
							detallepedidopuntoventaAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICEVALOR)) {
							existe=true;
							detallepedidopuntoventaAux.setice_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							detallepedidopuntoventaAux.setsub_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							detallepedidopuntoventaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:detallepedidopuntoventas) {
					
						if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_SERIE)) {
							existe=true;
							detallepedidopuntoventaAux.setserie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							detallepedidopuntoventaAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							detallepedidopuntoventaAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							detallepedidopuntoventaAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR)) {
							existe=true;
							detallepedidopuntoventaAux.setdescuento_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVA)) {
							existe=true;
							detallepedidopuntoventaAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVAVALOR)) {
							existe=true;
							detallepedidopuntoventaAux.setiva_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICE)) {
							existe=true;
							detallepedidopuntoventaAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICEVALOR)) {
							existe=true;
							detallepedidopuntoventaAux.setice_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							detallepedidopuntoventaAux.setsub_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							detallepedidopuntoventaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetallePedidoPuntoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetallePedidoPuntoVentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetallePedidoPuntoVenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetallePedidoPuntoVenta) {				
					conSplash=true;//false;										
					
					//this.startProcessDetallePedidoPuntoVenta(conSplash);
				
					this.generarReporteDetallePedidoPuntoVentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetallePedidoPuntoVentasSeleccionados();
				//this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetallePedidoPuntoVentasSeleccionados(false);
				//this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetallePedidoPuntoVentasSeleccionados(true);
				//this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetallePedidoPuntoVenta();
				
				this.exportarDetallePedidoPuntoVentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetallePedidoPuntoVentas();
				//this.importarDetallePedidoPuntoVentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetallePedidoPuntoVenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetallePedidoPuntoVentasSeleccionados();
				//this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Pedido", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetallePedidoPuntoVenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetallePedidoPuntoVenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetallePedidoPuntoVenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Pedido",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta.setSelectedIndex(0);					
				}	
			} 			
			else if(DetallePedidoPuntoVentaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetallePedidoPuntoVenta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetallePedidoPuntoVenta(conSplash);
					
						//this.actualizarParametrosGeneralDetallePedidoPuntoVenta();
						
						this.generarReporteProcesoAccionDetallePedidoPuntoVentasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle PedidoS SELECCIONADOS?", "MANTENIMIENTO DE Detalle Pedido", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetallePedidoPuntoVenta();
				
						this.actualizarParametrosGeneralDetallePedidoPuntoVenta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detallepedidopuntoventaReturnGeneral=detallepedidopuntoventaLogic.procesarAccionDetallePedidoPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas(),this.detallepedidopuntoventaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetallePedidoPuntoVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetallePedidoPuntoVenta();
					
					DetallePedidoPuntoVentaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetallePedidoPuntoVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetallePedidoPuntoVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxTiposAccionesFormularioDetallePedidoPuntoVenta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetallePedidoPuntoVenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetallePedidoPuntoVentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetallePedidoPuntoVenta();
			
			if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetallePedidoPuntoVenta> detallepedidopuntoventasSeleccionados=new ArrayList<DetallePedidoPuntoVenta>();		
			DetallePedidoPuntoVenta detallepedidopuntoventa=new DetallePedidoPuntoVenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetallePedidoPuntoVenta.getSelectedItem();
			
			
			
			
			detallepedidopuntoventasSeleccionados=this.getDetallePedidoPuntoVentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(detallepedidopuntoventasSeleccionados.size()==1) {
				for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:detallepedidopuntoventasSeleccionados) {
					detallepedidopuntoventa=detallepedidopuntoventaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetallePedidoPuntoVenta();
			
      		//this.finishProcessDetallePedidoPuntoVenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetallePedidoPuntoVentaReturnGeneral() throws Exception {
		if(this.detallepedidopuntoventaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detallepedidopuntoventaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detallepedidopuntoventaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detallepedidopuntoventaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detallepedidopuntoventaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detallepedidopuntoventaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
		}
		
		if(this.detallepedidopuntoventaReturnGeneral.getConRetornoLista() || this.detallepedidopuntoventaReturnGeneral.getConRetornoObjeto()) {
			if(this.detallepedidopuntoventaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallepedidopuntoventaLogic.setDetallePedidoPuntoVentas(this.detallepedidopuntoventaReturnGeneral.getDetallePedidoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detallepedidopuntoventaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallepedidopuntoventaLogic.setDetallePedidoPuntoVenta(this.detallepedidopuntoventaReturnGeneral.getDetallePedidoPuntoVenta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetallePedidoPuntoVenta(false);
		}
	}
	
	public void actualizarParametrosGeneralDetallePedidoPuntoVenta() throws Exception {
		
		
	}
	
	public ArrayList<DetallePedidoPuntoVenta> getDetallePedidoPuntoVentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetallePedidoPuntoVenta> detallepedidopuntoventasSeleccionados=new ArrayList<DetallePedidoPuntoVenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetallePedidoPuntoVenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas()) {
					if(detallepedidopuntoventaAux.getIsSelected()) {
						detallepedidopuntoventasSeleccionados.add(detallepedidopuntoventaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:this.detallepedidopuntoventas) {
					if(detallepedidopuntoventaAux.getIsSelected()) {
						detallepedidopuntoventasSeleccionados.add(detallepedidopuntoventaAux);				
					}
				}
			}
			
			if(detallepedidopuntoventasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detallepedidopuntoventasSeleccionados.addAll(this.detallepedidopuntoventaLogic.getDetallePedidoPuntoVentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detallepedidopuntoventasSeleccionados.addAll(this.detallepedidopuntoventas);				
					}
				}
			}
		} else {
			detallepedidopuntoventasSeleccionados.add(this.detallepedidopuntoventa);
		}
		
		return detallepedidopuntoventasSeleccionados;
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
	
	public void generarReporteDetallePedidoPuntoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetallePedidoPuntoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetallePedidoPuntoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetallePedidoPuntoVentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetallePedidoPuntoVentasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Pedido",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetallePedidoPuntoVentasSeleccionados() throws Exception {
		ArrayList<DetallePedidoPuntoVenta> detallepedidopuntoventasSeleccionados=new ArrayList<DetallePedidoPuntoVenta>();		
		
		detallepedidopuntoventasSeleccionados=this.getDetallePedidoPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetallePedidoPuntoVentas("Todos",detallepedidopuntoventasSeleccionados);
		
	}	
	
	public void generarReporteNormalDetallePedidoPuntoVentasSeleccionados() throws Exception {
		ArrayList<DetallePedidoPuntoVenta> detallepedidopuntoventasSeleccionados=new ArrayList<DetallePedidoPuntoVenta>();		
		
		detallepedidopuntoventasSeleccionados=this.getDetallePedidoPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetallePedidoPuntoVentas("Todos",detallepedidopuntoventasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetallePedidoPuntoVentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetallePedidoPuntoVenta> detallepedidopuntoventasSeleccionados=new ArrayList<DetallePedidoPuntoVenta>();
		
		detallepedidopuntoventasSeleccionados=this.getDetallePedidoPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetallePedidoPuntoVentas("Todos",detallepedidopuntoventasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetallePedidoPuntoVentasSeleccionados() throws Exception {
		ArrayList<DetallePedidoPuntoVenta> detallepedidopuntoventasSeleccionados=new ArrayList<DetallePedidoPuntoVenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetallePedidoPuntoVenta();
		
		
		detallepedidopuntoventasSeleccionados=this.getDetallePedidoPuntoVentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetallePedidoPuntoVenta();
		
		
		//this.generarReporteDetallePedidoPuntoVentas("Todos",detallepedidopuntoventasSeleccionados ,detallepedidopuntoventaImplementable,detallepedidopuntoventaImplementableHome);
	}
	
	public void mostrarImportacionDetallePedidoPuntoVentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetallePedidoPuntoVenta();
		
		this.abrirFrameImportacionDetallePedidoPuntoVenta();		
		
			
		//this.generarReporteDetallePedidoPuntoVentas("Todos",detallepedidopuntoventasSeleccionados ,detallepedidopuntoventaImplementable,detallepedidopuntoventaImplementableHome);
	}
	
	public void importarDetallePedidoPuntoVentas() throws Exception {		
	
	}
	
	public void exportarDetallePedidoPuntoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetallePedidoPuntoVentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetallePedidoPuntoVentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetallePedidoPuntoVentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Pedido",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetallePedidoPuntoVentasSeleccionados() throws Exception {
		ArrayList<DetallePedidoPuntoVenta> detallepedidopuntoventasSeleccionados=new ArrayList<DetallePedidoPuntoVenta>();		
		
		detallepedidopuntoventasSeleccionados=this.getDetallePedidoPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepedidopuntoventa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetallePedidoPuntoVenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:detallepedidopuntoventasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetallePedidoPuntoVenta(detallepedidopuntoventaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detallepedidopuntoventaAux.setsDetalleGeneralEntityReporte(detallepedidopuntoventaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetallePedidoPuntoVenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetallePedidoPuntoVentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePedidoPuntoVentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPEDIDOPUNTOVENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePedidoPuntoVentaConstantesFunciones.LABEL_SERIE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePedidoPuntoVentaConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePedidoPuntoVentaConstantesFunciones.LABEL_PRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVAVALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICEVALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePedidoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePedidoPuntoVentaConstantesFunciones.LABEL_TOTAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetallePedidoPuntoVenta(DetallePedidoPuntoVenta detallepedidopuntoventa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detallepedidopuntoventa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepedidopuntoventa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepedidopuntoventa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepedidopuntoventa.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepedidopuntoventa.getpedidopuntoventa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepedidopuntoventa.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepedidopuntoventa.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepedidopuntoventa.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepedidopuntoventa.getserie();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepedidopuntoventa.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepedidopuntoventa.getprecio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepedidopuntoventa.getdescuento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepedidopuntoventa.getdescuento_valor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepedidopuntoventa.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepedidopuntoventa.getiva_valor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepedidopuntoventa.getice().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepedidopuntoventa.getice_valor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepedidopuntoventa.getsub_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepedidopuntoventa.gettotal().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetallePedidoPuntoVentasSeleccionados() throws Exception {
		ArrayList<DetallePedidoPuntoVenta> detallepedidopuntoventasSeleccionados=new ArrayList<DetallePedidoPuntoVenta>();		
		
		detallepedidopuntoventasSeleccionados=this.getDetallePedidoPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepedidopuntoventa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetallePedidoPuntoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetallePedidoPuntoVenta(row);				
				iRow++;
			}				
			
			for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:detallepedidopuntoventasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetallePedidoPuntoVenta(detallepedidopuntoventaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetallePedidoPuntoVentasSeleccionados() throws Exception {
		ArrayList<DetallePedidoPuntoVenta> detallepedidopuntoventasSeleccionados=new ArrayList<DetallePedidoPuntoVenta>();		
		
		detallepedidopuntoventasSeleccionados=this.getDetallePedidoPuntoVentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepedidopuntoventa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detallepedidopuntoventas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detallepedidopuntoventa");
			//elementRoot.appendChild(element);
		
			for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:detallepedidopuntoventasSeleccionados) {
				element = document.createElement("detallepedidopuntoventa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetallePedidoPuntoVenta(detallepedidopuntoventaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetallePedidoPuntoVenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPEDIDOPUNTOVENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_SERIE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_PRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IVAVALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_ICEVALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePedidoPuntoVentaConstantesFunciones.LABEL_TOTAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetallePedidoPuntoVenta(DetallePedidoPuntoVenta detallepedidopuntoventa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detallepedidopuntoventa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepedidopuntoventa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepedidopuntoventa.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepedidopuntoventa.getpedidopuntoventa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepedidopuntoventa.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepedidopuntoventa.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepedidopuntoventa.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepedidopuntoventa.getserie());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepedidopuntoventa.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepedidopuntoventa.getprecio());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepedidopuntoventa.getdescuento());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepedidopuntoventa.getdescuento_valor());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepedidopuntoventa.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepedidopuntoventa.getiva_valor());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepedidopuntoventa.getice());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepedidopuntoventa.getice_valor());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepedidopuntoventa.getsub_total());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepedidopuntoventa.gettotal());				
	}
	
	public void setFilaDatosExportarXmlDetallePedidoPuntoVenta(DetallePedidoPuntoVenta detallepedidopuntoventa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetallePedidoPuntoVentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detallepedidopuntoventa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetallePedidoPuntoVentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detallepedidopuntoventa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DetallePedidoPuntoVentaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detallepedidopuntoventa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DetallePedidoPuntoVentaConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(detallepedidopuntoventa.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementpedidopuntoventa_descripcion = document.createElement(DetallePedidoPuntoVentaConstantesFunciones.IDPEDIDOPUNTOVENTA);
		elementpedidopuntoventa_descripcion.appendChild(document.createTextNode(detallepedidopuntoventa.getpedidopuntoventa_descripcion()));
		element.appendChild(elementpedidopuntoventa_descripcion);

		Element elementbodega_descripcion = document.createElement(DetallePedidoPuntoVentaConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(detallepedidopuntoventa.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(DetallePedidoPuntoVentaConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(detallepedidopuntoventa.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementunidad_descripcion = document.createElement(DetallePedidoPuntoVentaConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(detallepedidopuntoventa.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementserie = document.createElement(DetallePedidoPuntoVentaConstantesFunciones.SERIE);
		elementserie.appendChild(document.createTextNode(detallepedidopuntoventa.getserie().trim()));
		element.appendChild(elementserie);

		Element elementcantidad = document.createElement(DetallePedidoPuntoVentaConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(detallepedidopuntoventa.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementprecio = document.createElement(DetallePedidoPuntoVentaConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(detallepedidopuntoventa.getprecio().toString().trim()));
		element.appendChild(elementprecio);

		Element elementdescuento = document.createElement(DetallePedidoPuntoVentaConstantesFunciones.DESCUENTO);
		elementdescuento.appendChild(document.createTextNode(detallepedidopuntoventa.getdescuento().toString().trim()));
		element.appendChild(elementdescuento);

		Element elementdescuento_valor = document.createElement(DetallePedidoPuntoVentaConstantesFunciones.DESCUENTOVALOR);
		elementdescuento_valor.appendChild(document.createTextNode(detallepedidopuntoventa.getdescuento_valor().toString().trim()));
		element.appendChild(elementdescuento_valor);

		Element elementiva = document.createElement(DetallePedidoPuntoVentaConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(detallepedidopuntoventa.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementiva_valor = document.createElement(DetallePedidoPuntoVentaConstantesFunciones.IVAVALOR);
		elementiva_valor.appendChild(document.createTextNode(detallepedidopuntoventa.getiva_valor().toString().trim()));
		element.appendChild(elementiva_valor);

		Element elementice = document.createElement(DetallePedidoPuntoVentaConstantesFunciones.ICE);
		elementice.appendChild(document.createTextNode(detallepedidopuntoventa.getice().toString().trim()));
		element.appendChild(elementice);

		Element elementice_valor = document.createElement(DetallePedidoPuntoVentaConstantesFunciones.ICEVALOR);
		elementice_valor.appendChild(document.createTextNode(detallepedidopuntoventa.getice_valor().toString().trim()));
		element.appendChild(elementice_valor);

		Element elementsub_total = document.createElement(DetallePedidoPuntoVentaConstantesFunciones.SUBTOTAL);
		elementsub_total.appendChild(document.createTextNode(detallepedidopuntoventa.getsub_total().toString().trim()));
		element.appendChild(elementsub_total);

		Element elementtotal = document.createElement(DetallePedidoPuntoVentaConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(detallepedidopuntoventa.gettotal().toString().trim()));
		element.appendChild(elementtotal);
	}
	
	public void generarReporteGroupGenericoDetallePedidoPuntoVentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetallePedidoPuntoVenta> detallepedidopuntoventasSeleccionados=new ArrayList<DetallePedidoPuntoVenta>();
		
		detallepedidopuntoventasSeleccionados=this.getDetallePedidoPuntoVentasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetallePedidoPuntoVenta(detallepedidopuntoventasSeleccionados);
		
		this.generarReporteDetallePedidoPuntoVentas("Todos",detallepedidopuntoventasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetallePedidoPuntoVenta(ArrayList<DetallePedidoPuntoVenta> detallepedidopuntoventasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetallePedidoPuntoVenta detallepedidopuntoventaAux:detallepedidopuntoventasSeleccionados) {
				detallepedidopuntoventaAux.setsDetalleGeneralEntityReporte(detallepedidopuntoventaAux.toString());
			
				if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detallepedidopuntoventaAux.setsDescripcionGeneralEntityReporte1(detallepedidopuntoventaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					detallepedidopuntoventaAux.setsDescripcionGeneralEntityReporte1(detallepedidopuntoventaAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPEDIDOPUNTOVENTA)) {
					existe=true;
					detallepedidopuntoventaAux.setsDescripcionGeneralEntityReporte1(detallepedidopuntoventaAux.getpedidopuntoventa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					detallepedidopuntoventaAux.setsDescripcionGeneralEntityReporte1(detallepedidopuntoventaAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					detallepedidopuntoventaAux.setsDescripcionGeneralEntityReporte1(detallepedidopuntoventaAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					detallepedidopuntoventaAux.setsDescripcionGeneralEntityReporte1(detallepedidopuntoventaAux.getunidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_SERIE)) {
					existe=true;
					detallepedidopuntoventaAux.setsDescripcionGeneralEntityReporte1(detallepedidopuntoventaAux.getserie());
				}
				 else if(sTipoSeleccionar.equals(DetallePedidoPuntoVentaConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					detallepedidopuntoventaAux.setsDescripcionGeneralEntityReporte1(detallepedidopuntoventaAux.getcantidad().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePedidoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetallePedidoPuntoVenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetallePedidoPuntoVenta=true;
				this.isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta=true;
				this.isVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta=true;
			}
			
			this.isVisibilidadCeldaModificarDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaActualizarDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaEliminarDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaCancelarDetallePedidoPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaModificarDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaActualizarDetallePedidoPuntoVenta=true;
			this.isVisibilidadCeldaEliminarDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaCancelarDetallePedidoPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaModificarDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaActualizarDetallePedidoPuntoVenta=true;
			this.isVisibilidadCeldaEliminarDetallePedidoPuntoVenta=true;
			this.isVisibilidadCeldaCancelarDetallePedidoPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaModificarDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaActualizarDetallePedidoPuntoVenta=true;
			this.isVisibilidadCeldaEliminarDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaCancelarDetallePedidoPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetallePedidoPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta=true;
			this.isVisibilidadCeldaModificarDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaActualizarDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaEliminarDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaCancelarDetallePedidoPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaActualizarDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaEliminarDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaCancelarDetallePedidoPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaModificarDetallePedidoPuntoVenta=true;
			this.isVisibilidadCeldaActualizarDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaEliminarDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaCancelarDetallePedidoPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarDetallePedidoPuntoVenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetallePedidoPuntoVentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetallePedidoPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta=true;
		} else {
			this.actualizarEstadoPanelsDetallePedidoPuntoVenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetallePedidoPuntoVenta=false;
			//this.isVisibilidadCeldaVerFormDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaDuplicarDetallePedidoPuntoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta=false;
		} else {
			this.isVisibilidadCeldaNuevoDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePedidoPuntoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(!detallepedidopuntoventaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta=false;												
			}
			
			this.jButtonCerrarDetallePedidoPuntoVenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetallePedidoPuntoVenta=false;
		}
		
		if(!this.permiteMantenimiento(this.detallepedidopuntoventa)) {
			this.isVisibilidadCeldaActualizarDetallePedidoPuntoVenta=false;
			this.isVisibilidadCeldaEliminarDetallePedidoPuntoVenta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetallePedidoPuntoVenta() {
	}
	
	public void actualizarEstadoPanelsDetallePedidoPuntoVenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePedidoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallePedidoPuntoVenta!=null) {
				this.jScrollPanelDatosDetallePedidoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallePedidoPuntoVenta!=null) {
				this.jPanelPaginacionDetallePedidoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallePedidoPuntoVenta!=null) {
				this.jPanelParametrosReportesDetallePedidoPuntoVenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePedidoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetallePedidoPuntoVenta!=null) {
				this.jScrollPanelDatosDetallePedidoPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetallePedidoPuntoVenta!=null) {
				this.jPanelPaginacionDetallePedidoPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetallePedidoPuntoVenta!=null) {
				this.jPanelParametrosReportesDetallePedidoPuntoVenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePedidoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetallePedidoPuntoVenta!=null) {
				this.jScrollPanelDatosDetallePedidoPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetallePedidoPuntoVenta!=null) {
				this.jPanelPaginacionDetallePedidoPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetallePedidoPuntoVenta!=null) {
				this.jPanelParametrosReportesDetallePedidoPuntoVenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePedidoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetallePedidoPuntoVenta!=null) {
				this.jScrollPanelDatosDetallePedidoPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetallePedidoPuntoVenta!=null) {
				this.jPanelPaginacionDetallePedidoPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetallePedidoPuntoVenta!=null) {
				this.jPanelParametrosReportesDetallePedidoPuntoVenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePedidoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallePedidoPuntoVenta!=null) {
				this.jScrollPanelDatosDetallePedidoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallePedidoPuntoVenta!=null) {
				this.jPanelPaginacionDetallePedidoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallePedidoPuntoVenta!=null) {
				this.jPanelParametrosReportesDetallePedidoPuntoVenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePedidoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallePedidoPuntoVenta!=null) {
				this.jScrollPanelDatosDetallePedidoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallePedidoPuntoVenta!=null) {
				this.jPanelPaginacionDetallePedidoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallePedidoPuntoVenta!=null) {
				this.jPanelParametrosReportesDetallePedidoPuntoVenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionDetallePedidoPuntoVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePedidoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallePedidoPuntoVenta!=null) {
				this.jScrollPanelDatosDetallePedidoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallePedidoPuntoVenta!=null) {
				this.jPanelPaginacionDetallePedidoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallePedidoPuntoVenta!=null) {
				this.jPanelParametrosReportesDetallePedidoPuntoVenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetallePedidoPuntoVenta!=null) {
					this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetallePedidoPuntoVenta!=null) {
				this.jPanelParametrosReportesDetallePedidoPuntoVenta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detallepedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePedidoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetallePedidoPuntoVenta!=null) {
				this.jPanelParametrosReportesDetallePedidoPuntoVenta.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdBodegaDetallePedidoPuntoVenta);}

			this.isVisibilidadFK_IdPedidoPuntoVenta=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPedidoPuntoVenta) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdProductoDetallePedidoPuntoVenta);}

			this.isVisibilidadFK_IdUnidad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdUnidadDetallePedidoPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdBodegaDetallePedidoPuntoVenta);}

			this.isVisibilidadFK_IdPedidoPuntoVenta=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdPedidoPuntoVenta) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdProductoDetallePedidoPuntoVenta);}

			this.isVisibilidadFK_IdUnidad=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdUnidadDetallePedidoPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaPedidoPuntoVenta(Boolean isParaPedidoPuntoVenta){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPedidoPuntoVentaNegation=!isParaPedidoPuntoVenta;

			this.isVisibilidadFK_IdBodega=isParaPedidoPuntoVentaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdBodegaDetallePedidoPuntoVenta);}

			this.isVisibilidadFK_IdPedidoPuntoVenta=isParaPedidoPuntoVenta;
			if(!this.isVisibilidadFK_IdPedidoPuntoVenta) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta);}

			this.isVisibilidadFK_IdProducto=isParaPedidoPuntoVentaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdProductoDetallePedidoPuntoVenta);}

			this.isVisibilidadFK_IdUnidad=isParaPedidoPuntoVentaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdUnidadDetallePedidoPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdBodegaDetallePedidoPuntoVenta);}

			this.isVisibilidadFK_IdPedidoPuntoVenta=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdPedidoPuntoVenta) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdProductoDetallePedidoPuntoVenta);}

			this.isVisibilidadFK_IdUnidad=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdUnidadDetallePedidoPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdBodegaDetallePedidoPuntoVenta);}

			this.isVisibilidadFK_IdPedidoPuntoVenta=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdPedidoPuntoVenta) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdProductoDetallePedidoPuntoVenta);}

			this.isVisibilidadFK_IdUnidad=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdUnidadDetallePedidoPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdBodega=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdBodegaDetallePedidoPuntoVenta);}

			this.isVisibilidadFK_IdPedidoPuntoVenta=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdPedidoPuntoVenta) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta);}

			this.isVisibilidadFK_IdProducto=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdProductoDetallePedidoPuntoVenta);}

			this.isVisibilidadFK_IdUnidad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(jPanelFK_IdUnidadDetallePedidoPuntoVenta);}
		}
		
	}
	
	
	
	

	public String registrarSesionDetallePedidoPuntoVentaParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(detallepedidopuntoventaSessionBean==null) {
				detallepedidopuntoventaSessionBean=new DetallePedidoPuntoVentaSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(detallepedidopuntoventaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.detallepedidopuntoventaFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(DetallePedidoPuntoVentaConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionDetallePedidoPuntoVenta(true);
			//productoSessionBean.setlidDetallePedidoPuntoVentaActual(this.idDetallePedidoPuntoVentaActual);

			detallepedidopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetallePedidoPuntoVenta(true);
			detallepedidopuntoventaSessionBean.setlIdDetallePedidoPuntoVentaActualForeignKey(this.idDetallePedidoPuntoVentaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetallePedidoPuntoVentaSessionBean detallepedidopuntoventaSessionBean=new DetallePedidoPuntoVentaSessionBean();
		
		if(this.detallepedidopuntoventaSessionBean==null) {
			this.detallepedidopuntoventaSessionBean=new DetallePedidoPuntoVentaSessionBean();
		}
		
		this.detallepedidopuntoventaSessionBean.setsUltimaBusquedaDetallePedidoPuntoVenta(this.getsAccionBusqueda());
		this.detallepedidopuntoventaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detallepedidopuntoventaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			detallepedidopuntoventaSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detallepedidopuntoventaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPedidoPuntoVenta")) {
			detallepedidopuntoventaSessionBean.setid_pedido_punto_venta(this.getid_pedido_punto_ventaFK_IdPedidoPuntoVenta());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			detallepedidopuntoventaSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			detallepedidopuntoventaSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
			detallepedidopuntoventaSessionBean.setid_unidad(this.getid_unidadFK_IdUnidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetallePedidoPuntoVentaSessionBean detallepedidopuntoventaSessionBean=new DetallePedidoPuntoVentaSessionBean();
		
		if(this.detallepedidopuntoventaSessionBean==null) {
			this.detallepedidopuntoventaSessionBean=new DetallePedidoPuntoVentaSessionBean();
		}
		
		if(this.detallepedidopuntoventaSessionBean.getsUltimaBusquedaDetallePedidoPuntoVenta()!=null&&!this.detallepedidopuntoventaSessionBean.getsUltimaBusquedaDetallePedidoPuntoVenta().equals("")) {
			this.setsAccionBusqueda(detallepedidopuntoventaSessionBean.getsUltimaBusquedaDetallePedidoPuntoVenta());
			this.setiNumeroPaginacion(detallepedidopuntoventaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detallepedidopuntoventaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(detallepedidopuntoventaSessionBean.getid_bodega());
				detallepedidopuntoventaSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detallepedidopuntoventaSessionBean.getid_empresa());
				detallepedidopuntoventaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPedidoPuntoVenta")) {
				this.setid_pedido_punto_ventaFK_IdPedidoPuntoVenta(detallepedidopuntoventaSessionBean.getid_pedido_punto_venta());
				detallepedidopuntoventaSessionBean.setid_pedido_punto_venta(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(detallepedidopuntoventaSessionBean.getid_producto());
				detallepedidopuntoventaSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(detallepedidopuntoventaSessionBean.getid_sucursal());
				detallepedidopuntoventaSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
				this.setid_unidadFK_IdUnidad(detallepedidopuntoventaSessionBean.getid_unidad());
				detallepedidopuntoventaSessionBean.setid_unidad(-1L);
			}
		}
		
		this.detallepedidopuntoventaSessionBean.setsUltimaBusquedaDetallePedidoPuntoVenta("");
		this.detallepedidopuntoventaSessionBean.setiNumeroPaginacion(DetallePedidoPuntoVentaConstantesFunciones.INUMEROPAGINACION);
		this.detallepedidopuntoventaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetallePedidoPuntoVenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetallePedidoPuntoVenta() {
		this.updateBorderResaltarBusquedasFormularioDetallePedidoPuntoVenta();
		this.updateVisibilidadBusquedasFormularioDetallePedidoPuntoVenta();
		this.updateHabilitarBusquedasFormularioDetallePedidoPuntoVenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetallePedidoPuntoVenta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.getComponents().length>0) {
	

		if(this.detallepedidopuntoventaConstantesFunciones.resaltarFK_IdBodegaDetallePedidoPuntoVenta!=null) {
			index= this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.indexOfComponent(this.jPanelFK_IdBodegaDetallePedidoPuntoVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.getComponent(index);
				jPanel.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltarFK_IdBodegaDetallePedidoPuntoVenta);
			}
		}

		if(this.detallepedidopuntoventaConstantesFunciones.resaltarFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta!=null) {
			index= this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.indexOfComponent(this.jPanelFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.getComponent(index);
				jPanel.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltarFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta);
			}
		}

		if(this.detallepedidopuntoventaConstantesFunciones.resaltarFK_IdProductoDetallePedidoPuntoVenta!=null) {
			index= this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.indexOfComponent(this.jPanelFK_IdProductoDetallePedidoPuntoVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.getComponent(index);
				jPanel.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltarFK_IdProductoDetallePedidoPuntoVenta);
			}
		}

		if(this.detallepedidopuntoventaConstantesFunciones.resaltarFK_IdUnidadDetallePedidoPuntoVenta!=null) {
			index= this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.indexOfComponent(this.jPanelFK_IdUnidadDetallePedidoPuntoVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.getComponent(index);
				jPanel.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltarFK_IdUnidadDetallePedidoPuntoVenta);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetallePedidoPuntoVenta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.indexOfComponent(this.jPanelFK_IdBodegaDetallePedidoPuntoVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarFK_IdBodegaDetallePedidoPuntoVenta);
			if(!this.detallepedidopuntoventaConstantesFunciones.mostrarFK_IdBodegaDetallePedidoPuntoVenta && index>-1) {
				this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.indexOfComponent(this.jPanelFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta);
			if(!this.detallepedidopuntoventaConstantesFunciones.mostrarFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta && index>-1) {
				this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.indexOfComponent(this.jPanelFK_IdProductoDetallePedidoPuntoVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarFK_IdProductoDetallePedidoPuntoVenta);
			if(!this.detallepedidopuntoventaConstantesFunciones.mostrarFK_IdProductoDetallePedidoPuntoVenta && index>-1) {
				this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.indexOfComponent(this.jPanelFK_IdUnidadDetallePedidoPuntoVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarFK_IdUnidadDetallePedidoPuntoVenta);
			if(!this.detallepedidopuntoventaConstantesFunciones.mostrarFK_IdUnidadDetallePedidoPuntoVenta && index>-1) {
				this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetallePedidoPuntoVenta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.indexOfComponent(this.jPanelFK_IdBodegaDetallePedidoPuntoVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activarFK_IdBodegaDetallePedidoPuntoVenta);
				this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setEnabledAt(index,this.detallepedidopuntoventaConstantesFunciones.activarFK_IdBodegaDetallePedidoPuntoVenta);
			}

			index= this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.indexOfComponent(this.jPanelFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activarFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta);
				this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setEnabledAt(index,this.detallepedidopuntoventaConstantesFunciones.activarFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta);
			}

			index= this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.indexOfComponent(this.jPanelFK_IdProductoDetallePedidoPuntoVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activarFK_IdProductoDetallePedidoPuntoVenta);
				this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setEnabledAt(index,this.detallepedidopuntoventaConstantesFunciones.activarFK_IdProductoDetallePedidoPuntoVenta);
			}

			index= this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.indexOfComponent(this.jPanelFK_IdUnidadDetallePedidoPuntoVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activarFK_IdUnidadDetallePedidoPuntoVenta);
				this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setEnabledAt(index,this.detallepedidopuntoventaConstantesFunciones.activarFK_IdUnidadDetallePedidoPuntoVenta);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetallePedidoPuntoVenta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.indexOfComponent(this.jPanelFK_IdBodegaDetallePedidoPuntoVenta);

			this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.getComponent(index);

			this.detallepedidopuntoventaConstantesFunciones.setResaltarFK_IdBodegaDetallePedidoPuntoVenta(resaltar);

			jPanel.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltarFK_IdBodegaDetallePedidoPuntoVenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPedidoPuntoVenta")) {
			index= this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.indexOfComponent(this.jPanelFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta);

			this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.getComponent(index);

			this.detallepedidopuntoventaConstantesFunciones.setResaltarFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta(resaltar);

			jPanel.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltarFK_IdPedidoPuntoVentaDetallePedidoPuntoVenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.indexOfComponent(this.jPanelFK_IdProductoDetallePedidoPuntoVenta);

			this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.getComponent(index);

			this.detallepedidopuntoventaConstantesFunciones.setResaltarFK_IdProductoDetallePedidoPuntoVenta(resaltar);

			jPanel.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltarFK_IdProductoDetallePedidoPuntoVenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidad")) {
			index= this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.indexOfComponent(this.jPanelFK_IdUnidadDetallePedidoPuntoVenta);

			this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePedidoPuntoVenta.getComponent(index);

			this.detallepedidopuntoventaConstantesFunciones.setResaltarFK_IdUnidadDetallePedidoPuntoVenta(resaltar);

			jPanel.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltarFK_IdUnidadDetallePedidoPuntoVenta);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetallePedidoPuntoVenta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetallePedidoPuntoVenta() throws Exception {

		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetallePedidoPuntoVenta();
		this.updateVisibilidadResaltarControlesFormularioDetallePedidoPuntoVenta();
		this.updateHabilitarResaltarControlesFormularioDetallePedidoPuntoVenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetallePedidoPuntoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detallepedidopuntoventaConstantesFunciones.resaltaridDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelidDetallePedidoPuntoVenta.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltaridDetallePedidoPuntoVenta);}
		if(this.detallepedidopuntoventaConstantesFunciones.resaltarid_empresaDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_empresaDetallePedidoPuntoVenta.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltarid_empresaDetallePedidoPuntoVenta);}
		if(this.detallepedidopuntoventaConstantesFunciones.resaltarid_sucursalDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_sucursalDetallePedidoPuntoVenta.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltarid_sucursalDetallePedidoPuntoVenta);}
		if(this.detallepedidopuntoventaConstantesFunciones.resaltarid_pedido_punto_ventaDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltarid_pedido_punto_ventaDetallePedidoPuntoVenta);}
		if(this.detallepedidopuntoventaConstantesFunciones.resaltarid_bodegaDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltarid_bodegaDetallePedidoPuntoVenta);}
		if(this.detallepedidopuntoventaConstantesFunciones.resaltarid_productoDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltarid_productoDetallePedidoPuntoVenta);}
		if(this.detallepedidopuntoventaConstantesFunciones.resaltarid_unidadDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_unidadDetallePedidoPuntoVenta.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltarid_unidadDetallePedidoPuntoVenta);}
		if(this.detallepedidopuntoventaConstantesFunciones.resaltarserieDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldserieDetallePedidoPuntoVenta.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltarserieDetallePedidoPuntoVenta);}
		if(this.detallepedidopuntoventaConstantesFunciones.resaltarcantidadDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldcantidadDetallePedidoPuntoVenta.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltarcantidadDetallePedidoPuntoVenta);}
		if(this.detallepedidopuntoventaConstantesFunciones.resaltarprecioDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldprecioDetallePedidoPuntoVenta.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltarprecioDetallePedidoPuntoVenta);}
		if(this.detallepedidopuntoventaConstantesFunciones.resaltardescuentoDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuentoDetallePedidoPuntoVenta.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltardescuentoDetallePedidoPuntoVenta);}
		if(this.detallepedidopuntoventaConstantesFunciones.resaltardescuento_valorDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuento_valorDetallePedidoPuntoVenta.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltardescuento_valorDetallePedidoPuntoVenta);}
		if(this.detallepedidopuntoventaConstantesFunciones.resaltarivaDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldivaDetallePedidoPuntoVenta.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltarivaDetallePedidoPuntoVenta);}
		if(this.detallepedidopuntoventaConstantesFunciones.resaltariva_valorDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiva_valorDetallePedidoPuntoVenta.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltariva_valorDetallePedidoPuntoVenta);}
		if(this.detallepedidopuntoventaConstantesFunciones.resaltariceDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiceDetallePedidoPuntoVenta.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltariceDetallePedidoPuntoVenta);}
		if(this.detallepedidopuntoventaConstantesFunciones.resaltarice_valorDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldice_valorDetallePedidoPuntoVenta.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltarice_valorDetallePedidoPuntoVenta);}
		if(this.detallepedidopuntoventaConstantesFunciones.resaltarsub_totalDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldsub_totalDetallePedidoPuntoVenta.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltarsub_totalDetallePedidoPuntoVenta);}
		if(this.detallepedidopuntoventaConstantesFunciones.resaltartotalDetallePedidoPuntoVenta!=null && this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldtotalDetallePedidoPuntoVenta.setBorder(this.detallepedidopuntoventaConstantesFunciones.resaltartotalDetallePedidoPuntoVenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetallePedidoPuntoVenta() throws Exception {		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
	
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelidDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostraridDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPanelidDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostraridDetallePedidoPuntoVenta);
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_empresaDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarid_empresaDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPanelid_empresaDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarid_empresaDetallePedidoPuntoVenta);
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_sucursalDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarid_sucursalDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPanelid_sucursalDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarid_sucursalDetallePedidoPuntoVenta);
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarid_pedido_punto_ventaDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPanelid_pedido_punto_ventaDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarid_pedido_punto_ventaDetallePedidoPuntoVenta);
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarid_bodegaDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPanelid_bodegaDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarid_bodegaDetallePedidoPuntoVenta);
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarid_productoDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPanelid_productoDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarid_productoDetallePedidoPuntoVenta);
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_productoDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarid_productoDetallePedidoPuntoVenta);
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_unidadDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarid_unidadDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPanelid_unidadDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarid_unidadDetallePedidoPuntoVenta);
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldserieDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarserieDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPanelserieDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarserieDetallePedidoPuntoVenta);
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldcantidadDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarcantidadDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPanelcantidadDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarcantidadDetallePedidoPuntoVenta);
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldprecioDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarprecioDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPanelprecioDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarprecioDetallePedidoPuntoVenta);
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuentoDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrardescuentoDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPaneldescuentoDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrardescuentoDetallePedidoPuntoVenta);
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuento_valorDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrardescuento_valorDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPaneldescuento_valorDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrardescuento_valorDetallePedidoPuntoVenta);
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldivaDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarivaDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPanelivaDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarivaDetallePedidoPuntoVenta);
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiva_valorDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrariva_valorDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPaneliva_valorDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrariva_valorDetallePedidoPuntoVenta);
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiceDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrariceDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPaneliceDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrariceDetallePedidoPuntoVenta);
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldice_valorDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarice_valorDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPanelice_valorDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarice_valorDetallePedidoPuntoVenta);
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldsub_totalDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarsub_totalDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPanelsub_totalDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrarsub_totalDetallePedidoPuntoVenta);
		//this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldtotalDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrartotalDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jPaneltotalDetallePedidoPuntoVenta.setVisible(this.detallepedidopuntoventaConstantesFunciones.mostrartotalDetallePedidoPuntoVenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetallePedidoPuntoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetallePedidoPuntoVenta!=null) {
	
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jLabelidDetallePedidoPuntoVenta.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activaridDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_empresaDetallePedidoPuntoVenta.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activarid_empresaDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_sucursalDetallePedidoPuntoVenta.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activarid_sucursalDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_pedido_punto_ventaDetallePedidoPuntoVenta.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activarid_pedido_punto_ventaDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_bodegaDetallePedidoPuntoVenta.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activarid_bodegaDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_productoDetallePedidoPuntoVenta.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activarid_productoDetallePedidoPuntoVenta);
			this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jButtonid_productoDetallePedidoPuntoVenta.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activarid_productoDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jComboBoxid_unidadDetallePedidoPuntoVenta.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activarid_unidadDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldserieDetallePedidoPuntoVenta.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activarserieDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldcantidadDetallePedidoPuntoVenta.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activarcantidadDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldprecioDetallePedidoPuntoVenta.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activarprecioDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuentoDetallePedidoPuntoVenta.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activardescuentoDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFielddescuento_valorDetallePedidoPuntoVenta.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activardescuento_valorDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldivaDetallePedidoPuntoVenta.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activarivaDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiva_valorDetallePedidoPuntoVenta.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activariva_valorDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldiceDetallePedidoPuntoVenta.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activariceDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldice_valorDetallePedidoPuntoVenta.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activarice_valorDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldsub_totalDetallePedidoPuntoVenta.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activarsub_totalDetallePedidoPuntoVenta);
		this.jInternalFrameDetalleFormDetallePedidoPuntoVenta.jTextFieldtotalDetallePedidoPuntoVenta.setEnabled(this.detallepedidopuntoventaConstantesFunciones.activartotalDetallePedidoPuntoVenta);
		}
	}
	
		
}