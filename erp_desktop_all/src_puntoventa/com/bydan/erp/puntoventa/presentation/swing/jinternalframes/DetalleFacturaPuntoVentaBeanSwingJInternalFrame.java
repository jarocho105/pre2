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

import com.bydan.erp.puntoventa.util.DetalleFacturaPuntoVentaConstantesFunciones;
import com.bydan.erp.puntoventa.util.DetalleFacturaPuntoVentaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.DetalleFacturaPuntoVentaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.DetalleFacturaPuntoVentaBean;
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
public class DetalleFacturaPuntoVentaBeanSwingJInternalFrame extends DetalleFacturaPuntoVentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleFacturaPuntoVentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleFacturaPuntoVenta> detallefacturapuntoventaValidator = new ClassValidator<DetalleFacturaPuntoVenta>(DetalleFacturaPuntoVenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleFacturaPuntoVenta detallefacturapuntoventa;	
	public DetalleFacturaPuntoVenta detallefacturapuntoventaAux;
	public DetalleFacturaPuntoVenta detallefacturapuntoventaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleFacturaPuntoVenta detallefacturapuntoventaTotales;
	public Long idDetalleFacturaPuntoVentaActual;
	public Long iIdNuevoDetalleFacturaPuntoVenta=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboFacturaPuntoVenta="";

	public List<FacturaPuntoVenta> facturapuntoventasForeignKey;

	public List<FacturaPuntoVenta> getfacturapuntoventasForeignKey() {
		return facturapuntoventasForeignKey;
	}

	public void setfacturapuntoventasForeignKey(List<FacturaPuntoVenta> facturapuntoventasForeignKey) {
		this.facturapuntoventasForeignKey = facturapuntoventasForeignKey;
	}

	//OBJETO FK ACTUAL
	public FacturaPuntoVenta facturapuntoventaForeignKey;

	public FacturaPuntoVenta getfacturapuntoventaForeignKey() {
		return facturapuntoventaForeignKey;
	}

	public void setfacturapuntoventaForeignKey(FacturaPuntoVenta facturapuntoventaForeignKey) {
		this.facturapuntoventaForeignKey = facturapuntoventaForeignKey;
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
	
	public Boolean isPermisoTodoDetalleFacturaPuntoVenta;
	public Boolean isPermisoNuevoDetalleFacturaPuntoVenta;
	public Boolean isPermisoActualizarDetalleFacturaPuntoVenta;
	public Boolean isPermisoActualizarOriginalDetalleFacturaPuntoVenta;
	public Boolean isPermisoEliminarDetalleFacturaPuntoVenta;
	public Boolean isPermisoGuardarCambiosDetalleFacturaPuntoVenta;
	public Boolean isPermisoConsultaDetalleFacturaPuntoVenta;
	public Boolean isPermisoBusquedaDetalleFacturaPuntoVenta;
	public Boolean isPermisoReporteDetalleFacturaPuntoVenta;
	public Boolean isPermisoPaginacionMedioDetalleFacturaPuntoVenta;
	public Boolean isPermisoPaginacionAltoDetalleFacturaPuntoVenta;
	public Boolean isPermisoPaginacionTodoDetalleFacturaPuntoVenta;
	public Boolean isPermisoCopiarDetalleFacturaPuntoVenta;
	public Boolean isPermisoVerFormDetalleFacturaPuntoVenta;
	public Boolean isPermisoDuplicarDetalleFacturaPuntoVenta;
	public Boolean isPermisoOrdenDetalleFacturaPuntoVenta;
	
	
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
	
	public DetalleFacturaPuntoVentaParameterReturnGeneral detallefacturapuntoventaReturnGeneral;
	public DetalleFacturaPuntoVentaParameterReturnGeneral detallefacturapuntoventaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleFacturaPuntoVenta=false;
	public Boolean esParaAccionDesdeFormularioDetalleFacturaPuntoVenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleFacturaPuntoVentaSessionBeanAdditional detallefacturapuntoventaSessionBeanAdditional=null;
	
	public DetalleFacturaPuntoVentaSessionBeanAdditional getDetalleFacturaPuntoVentaSessionBeanAdditional() {
		return this.detallefacturapuntoventaSessionBeanAdditional;
	}
	
	public void setDetalleFacturaPuntoVentaSessionBeanAdditional(DetalleFacturaPuntoVentaSessionBeanAdditional detallefacturapuntoventaSessionBeanAdditional) {
		try {
			this.detallefacturapuntoventaSessionBeanAdditional=detallefacturapuntoventaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional detallefacturapuntoventaBeanSwingJInternalFrameAdditional=null;
	//public class DetalleFacturaPuntoVentaBeanSwingJInternalFrame
	
	public DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional getDetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional() {
		return this.detallefacturapuntoventaBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional(DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional detallefacturapuntoventaBeanSwingJInternalFrameAdditional) {
		try {
			this.detallefacturapuntoventaBeanSwingJInternalFrameAdditional=detallefacturapuntoventaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleFacturaPuntoVentaLogic detallefacturapuntoventaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleFacturaPuntoVenta detallefacturapuntoventaBean;
	public DetalleFacturaPuntoVentaConstantesFunciones detallefacturapuntoventaConstantesFunciones;
	//public DetalleFacturaPuntoVentaParameterReturnGeneral detallefacturapuntoventaReturnGeneral;
	
	//FK
	
	public FacturaPuntoVentaLogic facturapuntoventaLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public UnidadLogic unidadLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleFacturaPuntoVenta> detallefacturapuntoventas;	
	//public List<DetalleFacturaPuntoVenta> detallefacturapuntoventasEliminados;
	//public List<DetalleFacturaPuntoVenta> detallefacturapuntoventasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleFacturaPuntoVenta=true;
	public Boolean isVisibilidadCeldaCopiarDetalleFacturaPuntoVenta=true;
	public Boolean isVisibilidadCeldaVerFormDetalleFacturaPuntoVenta=true;
	public Boolean isVisibilidadCeldaOrdenDetalleFacturaPuntoVenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta=false;
	public Boolean isVisibilidadCeldaModificarDetalleFacturaPuntoVenta=false;
	public Boolean isVisibilidadCeldaActualizarDetalleFacturaPuntoVenta=false;
	public Boolean isVisibilidadCeldaEliminarDetalleFacturaPuntoVenta=false;
	public Boolean isVisibilidadCeldaCancelarDetalleFacturaPuntoVenta=false;
	public Boolean isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFacturaPuntoVenta=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdUnidad=false;
	
	public Long getiIdNuevoDetalleFacturaPuntoVenta() {
		return this.iIdNuevoDetalleFacturaPuntoVenta;
	}

	public void setiIdNuevoDetalleFacturaPuntoVenta(Long iIdNuevoDetalleFacturaPuntoVenta) {
		this.iIdNuevoDetalleFacturaPuntoVenta = iIdNuevoDetalleFacturaPuntoVenta;
	}
	
	public Long getidDetalleFacturaPuntoVentaActual() {
		return this.idDetalleFacturaPuntoVentaActual;
	}

	public void setidDetalleFacturaPuntoVentaActual(Long idDetalleFacturaPuntoVentaActual) {
		this.idDetalleFacturaPuntoVentaActual = idDetalleFacturaPuntoVentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleFacturaPuntoVenta getdetallefacturapuntoventa() {
		return this.detallefacturapuntoventa;
	}

	public void setdetallefacturapuntoventa(DetalleFacturaPuntoVenta detallefacturapuntoventa) {
		this.detallefacturapuntoventa = detallefacturapuntoventa;
	}
	
	public DetalleFacturaPuntoVenta getdetallefacturapuntoventaAux() {
		return this.detallefacturapuntoventaAux;
	}

	public void setdetallefacturapuntoventaAux(DetalleFacturaPuntoVenta detallefacturapuntoventaAux) {
		this.detallefacturapuntoventaAux = detallefacturapuntoventaAux;
	}				
	
	public DetalleFacturaPuntoVenta getdetallefacturapuntoventaAnterior() {
		return this.detallefacturapuntoventaAnterior;
	}

	public void setdetallefacturapuntoventaAnterior(DetalleFacturaPuntoVenta detallefacturapuntoventaAnterior) {
		this.detallefacturapuntoventaAnterior = detallefacturapuntoventaAnterior;
	}	
	
	public DetalleFacturaPuntoVenta getdetallefacturapuntoventaTotales() {
		return this.detallefacturapuntoventaTotales;
	}

	public void setdetallefacturapuntoventaTotales(DetalleFacturaPuntoVenta detallefacturapuntoventaTotales) {
		this.detallefacturapuntoventaTotales = detallefacturapuntoventaTotales;
	}	
	
	public DetalleFacturaPuntoVenta getdetallefacturapuntoventaBean() {
		return this.detallefacturapuntoventaBean;
	}

	public void setdetallefacturapuntoventaBean(DetalleFacturaPuntoVenta detallefacturapuntoventaBean) {
		this.detallefacturapuntoventaBean = detallefacturapuntoventaBean;
	}	
	
	public DetalleFacturaPuntoVentaParameterReturnGeneral getdetallefacturapuntoventaReturnGeneral() {
		return this.detallefacturapuntoventaReturnGeneral;
	}

	public void setdetallefacturapuntoventaReturnGeneral(DetalleFacturaPuntoVentaParameterReturnGeneral detallefacturapuntoventaReturnGeneral) {
		this.detallefacturapuntoventaReturnGeneral = detallefacturapuntoventaReturnGeneral;
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

	public Long id_factura_punto_ventaFK_IdFacturaPuntoVenta=-1L;

	public Long getid_factura_punto_ventaFK_IdFacturaPuntoVenta() {
		return this.id_factura_punto_ventaFK_IdFacturaPuntoVenta;
	}

	public void setid_factura_punto_ventaFK_IdFacturaPuntoVenta(Long id_factura_punto_ventaFK_IdFacturaPuntoVenta) {
		this.id_factura_punto_ventaFK_IdFacturaPuntoVenta = id_factura_punto_ventaFK_IdFacturaPuntoVenta;
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
	
	
	public DetalleFacturaPuntoVentaLogic getDetalleFacturaPuntoVentaLogic()	{		
		return detallefacturapuntoventaLogic;
	}

	public void setDetalleFacturaPuntoVentaLogic(DetalleFacturaPuntoVentaLogic detallefacturapuntoventaLogic) {
		this.detallefacturapuntoventaLogic = detallefacturapuntoventaLogic;
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
	
	public Boolean getIsEsNuevoDetalleFacturaPuntoVenta() {
		return isEsNuevoDetalleFacturaPuntoVenta;
	}

	public void setIsEsNuevoDetalleFacturaPuntoVenta(Boolean isEsNuevoDetalleFacturaPuntoVenta) {
		this.isEsNuevoDetalleFacturaPuntoVenta = isEsNuevoDetalleFacturaPuntoVenta;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleFacturaPuntoVenta() {
		return esParaAccionDesdeFormularioDetalleFacturaPuntoVenta;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleFacturaPuntoVenta(Boolean esParaAccionDesdeFormularioDetalleFacturaPuntoVenta) {
		this.esParaAccionDesdeFormularioDetalleFacturaPuntoVenta = esParaAccionDesdeFormularioDetalleFacturaPuntoVenta;
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
	
	
	public void cargarCombosFacturaPuntoVentasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.facturapuntoventasForeignKey=new ArrayList<FacturaPuntoVenta>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FacturaPuntoVentaLogic facturapuntoventaLogic=new FacturaPuntoVentaLogic();

			facturapuntoventaLogic.getFacturaPuntoVentaDataAccess().setIsForForeingKeyData(true);

			if(this.detallefacturapuntoventaSessionBean==null) {
				this.detallefacturapuntoventaSessionBean=new DetalleFacturaPuntoVentaSessionBean();
			}

			if(!this.detallefacturapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionFacturaPuntoVenta()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturapuntoventaLogic.getFacturaPuntoVentaDataAccess().setIsForForeingKeyData(true);

					facturapuntoventaLogic.getTodosFacturaPuntoVentasWithConnection(sFinalQuery,new Pagination());

					this.facturapuntoventasForeignKey=facturapuntoventaLogic.getFacturaPuntoVentas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFacturaPuntoVenta(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturapuntoventaLogic.getEntityWithConnection(detallefacturapuntoventaSessionBean.getlidFacturaPuntoVentaActual());
					this.facturapuntoventasForeignKey.add(facturapuntoventaLogic.getFacturaPuntoVenta());
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

			if(this.detallefacturapuntoventaSessionBean==null) {
				this.detallefacturapuntoventaSessionBean=new DetalleFacturaPuntoVentaSessionBean();
			}

			if(!this.detallefacturapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detallefacturapuntoventaSessionBean.getlidEmpresaActual());
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

			if(this.detallefacturapuntoventaSessionBean==null) {
				this.detallefacturapuntoventaSessionBean=new DetalleFacturaPuntoVentaSessionBean();
			}

			if(!this.detallefacturapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(detallefacturapuntoventaSessionBean.getlidSucursalActual());
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

			if(this.detallefacturapuntoventaSessionBean==null) {
				this.detallefacturapuntoventaSessionBean=new DetalleFacturaPuntoVentaSessionBean();
			}

			if(!this.detallefacturapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(detallefacturapuntoventaSessionBean.getlidBodegaActual());
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

			if(this.detallefacturapuntoventaSessionBean==null) {
				this.detallefacturapuntoventaSessionBean=new DetalleFacturaPuntoVentaSessionBean();
			}

			if(!this.detallefacturapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(detallefacturapuntoventaSessionBean.getlidProductoActual());
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

			if(this.detallefacturapuntoventaSessionBean==null) {
				this.detallefacturapuntoventaSessionBean=new DetalleFacturaPuntoVentaSessionBean();
			}

			if(!this.detallefacturapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
					unidadLogic.getEntityWithConnection(detallefacturapuntoventaSessionBean.getlidUnidadActual());
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

	
	
	public void setActualFacturaPuntoVentaForeignKey(Long idFacturaPuntoVentaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			FacturaPuntoVenta  facturapuntoventaTemp=null;

			for(FacturaPuntoVenta facturapuntoventaAux:facturapuntoventasForeignKey) {
				if(facturapuntoventaAux.getId()!=null && facturapuntoventaAux.getId().equals(idFacturaPuntoVentaSeleccionado)) {
					facturapuntoventaTemp=facturapuntoventaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(facturapuntoventaTemp!=null) {

					if(this.detallefacturapuntoventa!=null) {
						this.detallefacturapuntoventa.setFacturaPuntoVenta(facturapuntoventaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
						this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.setSelectedItem(facturapuntoventaTemp);
					}
				} else {
					//jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.setSelectedItem(facturapuntoventaTemp);
					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFacturaPuntoVenta") || sFormularioTipoBusqueda.equals("Todos")){
					if(facturapuntoventaTemp!=null && jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta!=null) {
						jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.setSelectedItem(facturapuntoventaTemp);
					} else {
						if(jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta!=null) {
							//jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.setSelectedItem(facturapuntoventaTemp);
							if(jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.getItemCount()>0) {
								jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.setSelectedIndex(0);
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

	public String getActualFacturaPuntoVentaForeignKeyDescripcion(Long idFacturaPuntoVentaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			FacturaPuntoVenta  facturapuntoventaTemp=null;

			for(FacturaPuntoVenta facturapuntoventaAux:facturapuntoventasForeignKey) {
				if(facturapuntoventaAux.getId()!=null && facturapuntoventaAux.getId().equals(idFacturaPuntoVentaSeleccionado)) {
					facturapuntoventaTemp=facturapuntoventaAux;
					break;
				}
			}


			sDescripcion=FacturaPuntoVentaConstantesFunciones.getFacturaPuntoVentaDescripcion(facturapuntoventaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFacturaPuntoVentaForeignKeyGenerico(Long idFacturaPuntoVentaSeleccionado,JComboBox jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVentaGenerico)throws Exception
	{
		try
		{
			FacturaPuntoVenta  facturapuntoventaTemp=null;

			for(FacturaPuntoVenta facturapuntoventaAux:facturapuntoventasForeignKey) {
				if(facturapuntoventaAux.getId()!=null && facturapuntoventaAux.getId().equals(idFacturaPuntoVentaSeleccionado)) {
					facturapuntoventaTemp=facturapuntoventaAux;
					break;
				}
			}

			if(facturapuntoventaTemp!=null) {
				jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVentaGenerico.setSelectedItem(facturapuntoventaTemp);
			} else {
				if(jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVentaGenerico!=null && jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVentaGenerico.setSelectedIndex(0);
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

					if(this.detallefacturapuntoventa!=null) {
						this.detallefacturapuntoventa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
						this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_empresaDetalleFacturaPuntoVenta.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetalleFacturaPuntoVenta.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_empresaDetalleFacturaPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_empresaDetalleFacturaPuntoVenta.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetalleFacturaPuntoVentaGenerico)throws Exception
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
				jComboBoxid_empresaDetalleFacturaPuntoVentaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetalleFacturaPuntoVentaGenerico!=null && jComboBoxid_empresaDetalleFacturaPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetalleFacturaPuntoVentaGenerico.setSelectedIndex(0);
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

					if(this.detallefacturapuntoventa!=null) {
						this.detallefacturapuntoventa.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
						this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_sucursalDetalleFacturaPuntoVenta.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDetalleFacturaPuntoVenta.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_sucursalDetalleFacturaPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_sucursalDetalleFacturaPuntoVenta.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDetalleFacturaPuntoVentaGenerico)throws Exception
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
				jComboBoxid_sucursalDetalleFacturaPuntoVentaGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDetalleFacturaPuntoVentaGenerico!=null && jComboBoxid_sucursalDetalleFacturaPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDetalleFacturaPuntoVentaGenerico.setSelectedIndex(0);
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

					if(this.detallefacturapuntoventa!=null) {
						this.detallefacturapuntoventa.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
						this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaDetalleFacturaPuntoVenta.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta!=null) {
						jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta!=null) {
							//jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaDetalleFacturaPuntoVentaGenerico)throws Exception
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
				jComboBoxid_bodegaDetalleFacturaPuntoVentaGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaDetalleFacturaPuntoVentaGenerico!=null && jComboBoxid_bodegaDetalleFacturaPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_bodegaDetalleFacturaPuntoVentaGenerico.setSelectedIndex(0);
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

					if(this.detallefacturapuntoventa!=null) {
						this.detallefacturapuntoventa.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
						this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoDetalleFacturaPuntoVenta.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta!=null) {
						jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta!=null) {
							//jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoDetalleFacturaPuntoVentaGenerico)throws Exception
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
				jComboBoxid_productoDetalleFacturaPuntoVentaGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoDetalleFacturaPuntoVentaGenerico!=null && jComboBoxid_productoDetalleFacturaPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_productoDetalleFacturaPuntoVentaGenerico.setSelectedIndex(0);
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

					if(this.detallefacturapuntoventa!=null) {
						this.detallefacturapuntoventa.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
						this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_unidadDetalleFacturaPuntoVenta.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadDetalleFacturaPuntoVenta.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_unidadDetalleFacturaPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_unidadDetalleFacturaPuntoVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadDetalleFacturaPuntoVenta!=null) {
						jComboBoxid_unidadFK_IdUnidadDetalleFacturaPuntoVenta.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadDetalleFacturaPuntoVenta!=null) {
							//jComboBoxid_unidadFK_IdUnidadDetalleFacturaPuntoVenta.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadDetalleFacturaPuntoVenta.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadDetalleFacturaPuntoVenta.setSelectedIndex(0);
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
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadDetalleFacturaPuntoVentaGenerico)throws Exception
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
				jComboBoxid_unidadDetalleFacturaPuntoVentaGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadDetalleFacturaPuntoVentaGenerico!=null && jComboBoxid_unidadDetalleFacturaPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_unidadDetalleFacturaPuntoVentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFacturaPuntoVentaForeignKey(DetalleFacturaPuntoVenta detallefacturapuntoventa,JComboBox jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVentaGenerico)throws Exception
	{
		try
		{
			FacturaPuntoVenta  facturapuntoventaAux=new FacturaPuntoVenta();

			if(jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVentaGenerico==null) {
				facturapuntoventaAux=(FacturaPuntoVenta)this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.getSelectedItem();
			} else {
				facturapuntoventaAux=(FacturaPuntoVenta)jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVentaGenerico.getSelectedItem();
			}

			if(facturapuntoventaAux!=null && facturapuntoventaAux.getId()!=null) {
				detallefacturapuntoventa.setid_factura_punto_venta(facturapuntoventaAux.getId());
				detallefacturapuntoventa.setfacturapuntoventa_descripcion(DetalleFacturaPuntoVentaConstantesFunciones.getFacturaPuntoVentaDescripcion(facturapuntoventaAux));
				detallefacturapuntoventa.setFacturaPuntoVenta(facturapuntoventaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetalleFacturaPuntoVenta detallefacturapuntoventa,JComboBox jComboBoxid_empresaDetalleFacturaPuntoVentaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetalleFacturaPuntoVentaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_empresaDetalleFacturaPuntoVenta.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetalleFacturaPuntoVentaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detallefacturapuntoventa.setid_empresa(empresaAux.getId());
				detallefacturapuntoventa.setempresa_descripcion(DetalleFacturaPuntoVentaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detallefacturapuntoventa.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DetalleFacturaPuntoVenta detallefacturapuntoventa,JComboBox jComboBoxid_sucursalDetalleFacturaPuntoVentaGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDetalleFacturaPuntoVentaGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_sucursalDetalleFacturaPuntoVenta.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDetalleFacturaPuntoVentaGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				detallefacturapuntoventa.setid_sucursal(sucursalAux.getId());
				detallefacturapuntoventa.setsucursal_descripcion(DetalleFacturaPuntoVentaConstantesFunciones.getSucursalDescripcion(sucursalAux));
				detallefacturapuntoventa.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(DetalleFacturaPuntoVenta detallefacturapuntoventa,JComboBox jComboBoxid_bodegaDetalleFacturaPuntoVentaGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaDetalleFacturaPuntoVentaGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaDetalleFacturaPuntoVentaGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				detallefacturapuntoventa.setid_bodega(bodegaAux.getId());
				detallefacturapuntoventa.setbodega_descripcion(DetalleFacturaPuntoVentaConstantesFunciones.getBodegaDescripcion(bodegaAux));
				detallefacturapuntoventa.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(DetalleFacturaPuntoVenta detallefacturapuntoventa,JComboBox jComboBoxid_productoDetalleFacturaPuntoVentaGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoDetalleFacturaPuntoVentaGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoDetalleFacturaPuntoVentaGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				detallefacturapuntoventa.setid_producto(productoAux.getId());
				detallefacturapuntoventa.setproducto_descripcion(DetalleFacturaPuntoVentaConstantesFunciones.getProductoDescripcion(productoAux));
				detallefacturapuntoventa.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(DetalleFacturaPuntoVenta detallefacturapuntoventa,JComboBox jComboBoxid_unidadDetalleFacturaPuntoVentaGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadDetalleFacturaPuntoVentaGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_unidadDetalleFacturaPuntoVenta.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadDetalleFacturaPuntoVentaGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				detallefacturapuntoventa.setid_unidad(unidadAux.getId());
				detallefacturapuntoventa.setunidad_descripcion(DetalleFacturaPuntoVentaConstantesFunciones.getUnidadDescripcion(unidadAux));
				detallefacturapuntoventa.setUnidad(unidadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFacturaPuntoVentasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFacturaPuntoVenta=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.removeAllItems();

							for(FacturaPuntoVenta facturapuntoventa:this.facturapuntoventasForeignKey) {
								this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.addItem(facturapuntoventa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { 
					}

					if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFacturaPuntoVenta") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.removeAllItems();

							for(FacturaPuntoVenta facturapuntoventa:this.facturapuntoventasForeignKey) {
								this.jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.addItem(facturapuntoventa);
							}
						}

						if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_empresaDetalleFacturaPuntoVenta.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_empresaDetalleFacturaPuntoVenta.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { 
					}

					if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_sucursalDetalleFacturaPuntoVenta.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_sucursalDetalleFacturaPuntoVenta.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { 
					}

					if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { 
					}

					if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.addItem(bodega);
							}
						}

						if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { 
					}

					if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta.addItem(producto);
							}
						}

						if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_unidadDetalleFacturaPuntoVenta.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_unidadDetalleFacturaPuntoVenta.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { 
					}

					if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadDetalleFacturaPuntoVenta.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadDetalleFacturaPuntoVenta.addItem(unidad);
							}
						}

						if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameFacturaPuntoVentaForeignKey(FacturaPuntoVenta facturapuntoventa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.setSelectedItem(facturapuntoventa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.setSelectedItem(facturapuntoventa);
						} else {
							this.jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_empresaDetalleFacturaPuntoVenta.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_empresaDetalleFacturaPuntoVenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_sucursalDetalleFacturaPuntoVenta.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_sucursalDetalleFacturaPuntoVenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_unidadDetalleFacturaPuntoVenta.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_unidadDetalleFacturaPuntoVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadDetalleFacturaPuntoVenta.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadDetalleFacturaPuntoVenta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetalleFacturaPuntoVenta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetalleFacturaPuntoVentaConstantesFunciones.refrescarForeignKeysDescripcionesDetalleFacturaPuntoVenta(this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetalleFacturaPuntoVentaConstantesFunciones.refrescarForeignKeysDescripcionesDetalleFacturaPuntoVenta(this.detallefacturapuntoventas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(FacturaPuntoVenta.class));
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detallefacturapuntoventaLogic.setDetalleFacturaPuntoVentas(this.detallefacturapuntoventas);
			detallefacturapuntoventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetalleFacturaPuntoVentaParameterReturnGeneral getDetalleFacturaPuntoVentaParameterGeneral() {
		return this.detallefacturapuntoventaParameterGeneral;
	}
	
	public void setDetalleFacturaPuntoVentaParameterGeneral(DetalleFacturaPuntoVentaParameterReturnGeneral detallefacturapuntoventaParameterGeneral) {
		this.detallefacturapuntoventaParameterGeneral = detallefacturapuntoventaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetalleFacturaPuntoVenta() {
		return isPermisoTodoDetalleFacturaPuntoVenta;
	}

	public void setIsPermisoTodoDetalleFacturaPuntoVenta(Boolean isPermisoTodoDetalleFacturaPuntoVenta) {
		this.isPermisoTodoDetalleFacturaPuntoVenta = isPermisoTodoDetalleFacturaPuntoVenta;
	}

	public Boolean getIsPermisoNuevoDetalleFacturaPuntoVenta() {
		return isPermisoNuevoDetalleFacturaPuntoVenta;
	}

	public void setIsPermisoNuevoDetalleFacturaPuntoVenta(Boolean isPermisoNuevoDetalleFacturaPuntoVenta) {
		this.isPermisoNuevoDetalleFacturaPuntoVenta = isPermisoNuevoDetalleFacturaPuntoVenta;
	}

	public Boolean getIsPermisoActualizarDetalleFacturaPuntoVenta() {
		return isPermisoActualizarDetalleFacturaPuntoVenta;
	}

	public void setIsPermisoActualizarDetalleFacturaPuntoVenta(Boolean isPermisoActualizarDetalleFacturaPuntoVenta) {
		this.isPermisoActualizarDetalleFacturaPuntoVenta = isPermisoActualizarDetalleFacturaPuntoVenta;
	}

	public Boolean getIsPermisoEliminarDetalleFacturaPuntoVenta() {
		return isPermisoEliminarDetalleFacturaPuntoVenta;
	}

	public void setIsPermisoEliminarDetalleFacturaPuntoVenta(Boolean isPermisoEliminarDetalleFacturaPuntoVenta) {
		this.isPermisoEliminarDetalleFacturaPuntoVenta = isPermisoEliminarDetalleFacturaPuntoVenta;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleFacturaPuntoVenta() {
		return isPermisoGuardarCambiosDetalleFacturaPuntoVenta;
	}

	public void setIsPermisoGuardarCambiosDetalleFacturaPuntoVenta(Boolean isPermisoGuardarCambiosDetalleFacturaPuntoVenta) {
		this.isPermisoGuardarCambiosDetalleFacturaPuntoVenta = isPermisoGuardarCambiosDetalleFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoConsultaDetalleFacturaPuntoVenta() {
		return isPermisoConsultaDetalleFacturaPuntoVenta;
	}

	public void setIsPermisoConsultaDetalleFacturaPuntoVenta(Boolean isPermisoConsultaDetalleFacturaPuntoVenta) {
		this.isPermisoConsultaDetalleFacturaPuntoVenta = isPermisoConsultaDetalleFacturaPuntoVenta;
	}

	public Boolean getIsPermisoBusquedaDetalleFacturaPuntoVenta() {
		return isPermisoBusquedaDetalleFacturaPuntoVenta;
	}

	public void setIsPermisoBusquedaDetalleFacturaPuntoVenta(Boolean isPermisoBusquedaDetalleFacturaPuntoVenta) {
		this.isPermisoBusquedaDetalleFacturaPuntoVenta = isPermisoBusquedaDetalleFacturaPuntoVenta;
	}

	public Boolean getIsPermisoReporteDetalleFacturaPuntoVenta() {
		return isPermisoReporteDetalleFacturaPuntoVenta;
	}

	public void setIsPermisoReporteDetalleFacturaPuntoVenta(Boolean isPermisoReporteDetalleFacturaPuntoVenta) {
		this.isPermisoReporteDetalleFacturaPuntoVenta = isPermisoReporteDetalleFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleFacturaPuntoVenta() {
		return isPermisoPaginacionMedioDetalleFacturaPuntoVenta;
	}

	public void setIsPermisoPaginacionMedioDetalleFacturaPuntoVenta(Boolean isPermisoPaginacionMedioDetalleFacturaPuntoVenta) {
		this.isPermisoPaginacionMedioDetalleFacturaPuntoVenta = isPermisoPaginacionMedioDetalleFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleFacturaPuntoVenta() {
		return isPermisoPaginacionTodoDetalleFacturaPuntoVenta;
	}

	public void setIsPermisoPaginacionTodoDetalleFacturaPuntoVenta(Boolean isPermisoPaginacionTodoDetalleFacturaPuntoVenta) {
		this.isPermisoPaginacionTodoDetalleFacturaPuntoVenta = isPermisoPaginacionTodoDetalleFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleFacturaPuntoVenta() {
		return isPermisoPaginacionAltoDetalleFacturaPuntoVenta;
	}

	public void setIsPermisoPaginacionAltoDetalleFacturaPuntoVenta(Boolean isPermisoPaginacionAltoDetalleFacturaPuntoVenta) {
		this.isPermisoPaginacionAltoDetalleFacturaPuntoVenta = isPermisoPaginacionAltoDetalleFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoCopiarDetalleFacturaPuntoVenta() {
		return isPermisoCopiarDetalleFacturaPuntoVenta;
	}

	public void setIsPermisoCopiarDetalleFacturaPuntoVenta(Boolean isPermisoCopiarDetalleFacturaPuntoVenta) {
		this.isPermisoCopiarDetalleFacturaPuntoVenta = isPermisoCopiarDetalleFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoVerFormDetalleFacturaPuntoVenta() {
		return isPermisoVerFormDetalleFacturaPuntoVenta;
	}

	public void setIsPermisoVerFormDetalleFacturaPuntoVenta(Boolean isPermisoVerFormDetalleFacturaPuntoVenta) {
		this.isPermisoVerFormDetalleFacturaPuntoVenta = isPermisoVerFormDetalleFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoDuplicarDetalleFacturaPuntoVenta() {
		return isPermisoDuplicarDetalleFacturaPuntoVenta;
	}

	public void setIsPermisoDuplicarDetalleFacturaPuntoVenta(Boolean isPermisoDuplicarDetalleFacturaPuntoVenta) {
		this.isPermisoDuplicarDetalleFacturaPuntoVenta = isPermisoDuplicarDetalleFacturaPuntoVenta;
	}
	
	public Boolean getIsPermisoOrdenDetalleFacturaPuntoVenta() {
		return isPermisoOrdenDetalleFacturaPuntoVenta;
	}

	public void setIsPermisoOrdenDetalleFacturaPuntoVenta(Boolean isPermisoOrdenDetalleFacturaPuntoVenta) {
		this.isPermisoOrdenDetalleFacturaPuntoVenta = isPermisoOrdenDetalleFacturaPuntoVenta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleFacturaPuntoVenta() {
		return isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaNuevoDetalleFacturaPuntoVenta(Boolean isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta) {
		this.isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta = isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleFacturaPuntoVenta() {
		return isVisibilidadCeldaDuplicarDetalleFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleFacturaPuntoVenta(Boolean isVisibilidadCeldaDuplicarDetalleFacturaPuntoVenta) {
		this.isVisibilidadCeldaDuplicarDetalleFacturaPuntoVenta = isVisibilidadCeldaDuplicarDetalleFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleFacturaPuntoVenta() {
		return isVisibilidadCeldaCopiarDetalleFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaCopiarDetalleFacturaPuntoVenta(Boolean isVisibilidadCeldaCopiarDetalleFacturaPuntoVenta) {
		this.isVisibilidadCeldaCopiarDetalleFacturaPuntoVenta = isVisibilidadCeldaCopiarDetalleFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleFacturaPuntoVenta() {
		return isVisibilidadCeldaVerFormDetalleFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaVerFormDetalleFacturaPuntoVenta(Boolean isVisibilidadCeldaVerFormDetalleFacturaPuntoVenta) {
		this.isVisibilidadCeldaVerFormDetalleFacturaPuntoVenta = isVisibilidadCeldaVerFormDetalleFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleFacturaPuntoVenta() {
		return isVisibilidadCeldaOrdenDetalleFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaOrdenDetalleFacturaPuntoVenta(Boolean isVisibilidadCeldaOrdenDetalleFacturaPuntoVenta) {
		this.isVisibilidadCeldaOrdenDetalleFacturaPuntoVenta = isVisibilidadCeldaOrdenDetalleFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta() {
		return isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta(Boolean isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta = isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleFacturaPuntoVenta() {
		return isVisibilidadCeldaModificarDetalleFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaModificarDetalleFacturaPuntoVenta(Boolean isVisibilidadCeldaModificarDetalleFacturaPuntoVenta) {
		this.isVisibilidadCeldaModificarDetalleFacturaPuntoVenta = isVisibilidadCeldaModificarDetalleFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleFacturaPuntoVenta() {
		return isVisibilidadCeldaActualizarDetalleFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaActualizarDetalleFacturaPuntoVenta(Boolean isVisibilidadCeldaActualizarDetalleFacturaPuntoVenta) {
		this.isVisibilidadCeldaActualizarDetalleFacturaPuntoVenta = isVisibilidadCeldaActualizarDetalleFacturaPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleFacturaPuntoVenta() {
		return isVisibilidadCeldaEliminarDetalleFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaEliminarDetalleFacturaPuntoVenta(Boolean isVisibilidadCeldaEliminarDetalleFacturaPuntoVenta) {
		this.isVisibilidadCeldaEliminarDetalleFacturaPuntoVenta = isVisibilidadCeldaEliminarDetalleFacturaPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleFacturaPuntoVenta() {
		return isVisibilidadCeldaCancelarDetalleFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaCancelarDetalleFacturaPuntoVenta(Boolean isVisibilidadCeldaCancelarDetalleFacturaPuntoVenta) {
		this.isVisibilidadCeldaCancelarDetalleFacturaPuntoVenta = isVisibilidadCeldaCancelarDetalleFacturaPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleFacturaPuntoVenta() {
		return isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaGuardarDetalleFacturaPuntoVenta(Boolean isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta) {
		this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta = isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta() {
		return isVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta(Boolean isVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta) {
		this.isVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta = isVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta;
	}
		
	public DetalleFacturaPuntoVentaSessionBean getdetallefacturapuntoventaSessionBean() {
		return this.detallefacturapuntoventaSessionBean;
	}
	
	public void setdetallefacturapuntoventaSessionBean(DetalleFacturaPuntoVentaSessionBean detallefacturapuntoventaSessionBean) {
		this.detallefacturapuntoventaSessionBean=detallefacturapuntoventaSessionBean;
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

	public Boolean getisVisibilidadFK_IdFacturaPuntoVenta() {
		return this.isVisibilidadFK_IdFacturaPuntoVenta;
	}

	public void setisVisibilidadFK_IdFacturaPuntoVenta(Boolean isVisibilidadFK_IdFacturaPuntoVenta) {
		this.isVisibilidadFK_IdFacturaPuntoVenta=isVisibilidadFK_IdFacturaPuntoVenta;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(DetalleFacturaPuntoVenta detallefacturapuntoventa)throws Exception {
		try {
			
				this.setActualParaGuardarFacturaPuntoVentaForeignKey(detallefacturapuntoventa,null);
				this.setActualParaGuardarEmpresaForeignKey(detallefacturapuntoventa,null);
				this.setActualParaGuardarSucursalForeignKey(detallefacturapuntoventa,null);
				this.setActualParaGuardarBodegaForeignKey(detallefacturapuntoventa,null);
				this.setActualParaGuardarProductoForeignKey(detallefacturapuntoventa,null);
				this.setActualParaGuardarUnidadForeignKey(detallefacturapuntoventa,null);
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
	
	public void bugActualizarReferenciaActual(DetalleFacturaPuntoVenta detallefacturapuntoventa,DetalleFacturaPuntoVenta detallefacturapuntoventaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleFacturaPuntoVenta(detallefacturapuntoventa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detallefacturapuntoventaAux.setId(detallefacturapuntoventa.getId());
		detallefacturapuntoventaAux.setVersionRow(detallefacturapuntoventa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetalleFacturaPuntoVenta();
		
			int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detallefacturapuntoventaValidator.getInvalidValues(this.detallefacturapuntoventa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detallefacturapuntoventaLogic.setDatosCliente(datosCliente);
			detallefacturapuntoventaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detallefacturapuntoventaAux=new  DetalleFacturaPuntoVenta();
				
				detallefacturapuntoventaAux.setIsNew(true);
				detallefacturapuntoventaAux.setIsChanged(true);
				
				detallefacturapuntoventaAux.setDetalleFacturaPuntoVentaOriginal(this.detallefacturapuntoventa);
				
				detallefacturapuntoventaAux.setId(this.detallefacturapuntoventa.getId());	
				detallefacturapuntoventaAux.setVersionRow(this.detallefacturapuntoventa.getVersionRow());	
				detallefacturapuntoventaAux.setid_factura_punto_venta(this.detallefacturapuntoventa.getid_factura_punto_venta());	
				detallefacturapuntoventaAux.setid_empresa(this.detallefacturapuntoventa.getid_empresa());	
				detallefacturapuntoventaAux.setid_sucursal(this.detallefacturapuntoventa.getid_sucursal());	
				detallefacturapuntoventaAux.setid_bodega(this.detallefacturapuntoventa.getid_bodega());	
				detallefacturapuntoventaAux.setid_producto(this.detallefacturapuntoventa.getid_producto());	
				detallefacturapuntoventaAux.setid_unidad(this.detallefacturapuntoventa.getid_unidad());	
				detallefacturapuntoventaAux.setserie(this.detallefacturapuntoventa.getserie());	
				detallefacturapuntoventaAux.setcantidad(this.detallefacturapuntoventa.getcantidad());	
				detallefacturapuntoventaAux.setprecio(this.detallefacturapuntoventa.getprecio());	
				detallefacturapuntoventaAux.setdescuento(this.detallefacturapuntoventa.getdescuento());	
				detallefacturapuntoventaAux.setdescuento_valor(this.detallefacturapuntoventa.getdescuento_valor());	
				detallefacturapuntoventaAux.setiva(this.detallefacturapuntoventa.getiva());	
				detallefacturapuntoventaAux.setiva_valor(this.detallefacturapuntoventa.getiva_valor());	
				detallefacturapuntoventaAux.setice(this.detallefacturapuntoventa.getice());	
				detallefacturapuntoventaAux.setice_valor(this.detallefacturapuntoventa.getice_valor());	
				detallefacturapuntoventaAux.setsub_total(this.detallefacturapuntoventa.getsub_total());	
				detallefacturapuntoventaAux.settotal(this.detallefacturapuntoventa.gettotal());	
				detallefacturapuntoventaAux.setdescripcion(this.detallefacturapuntoventa.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallefacturapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detallefacturapuntoventaAux,detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallefacturapuntoventaAux,detallefacturapuntoventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detallefacturapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallefacturapuntoventaLogic.saveDetalleFacturaPuntoVentas();//WithConnection
						//detallefacturapuntoventaLogic.getSetVersionRowDetalleFacturaPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallefacturapuntoventa,detallefacturapuntoventaAux);
					
					this.refrescarForeignKeysDescripcionesDetalleFacturaPuntoVenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallefacturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallefacturapuntoventaLogic.saveDetalleFacturaPuntoVentaRelaciones(detallefacturapuntoventaAux);//WithConnection
								//detallefacturapuntoventaLogic.getSetVersionRowDetalleFacturaPuntoVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallefacturapuntoventa,detallefacturapuntoventaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallefacturapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallefacturapuntoventaAux,detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallefacturapuntoventaAux,detallefacturapuntoventas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallefacturapuntoventa,detallefacturapuntoventaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detallefacturapuntoventaAux=new  DetalleFacturaPuntoVenta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() 
					|| (this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() && this.detallefacturapuntoventa.getId()>=0)) {
						
					detallefacturapuntoventaAux.setIsNew(false);
				}
				
				detallefacturapuntoventaAux.setIsDeleted(false);
			
				detallefacturapuntoventaAux.setId(this.detallefacturapuntoventa.getId());	
				detallefacturapuntoventaAux.setVersionRow(this.detallefacturapuntoventa.getVersionRow());	
				detallefacturapuntoventaAux.setid_factura_punto_venta(this.detallefacturapuntoventa.getid_factura_punto_venta());	
				detallefacturapuntoventaAux.setid_empresa(this.detallefacturapuntoventa.getid_empresa());	
				detallefacturapuntoventaAux.setid_sucursal(this.detallefacturapuntoventa.getid_sucursal());	
				detallefacturapuntoventaAux.setid_bodega(this.detallefacturapuntoventa.getid_bodega());	
				detallefacturapuntoventaAux.setid_producto(this.detallefacturapuntoventa.getid_producto());	
				detallefacturapuntoventaAux.setid_unidad(this.detallefacturapuntoventa.getid_unidad());	
				detallefacturapuntoventaAux.setserie(this.detallefacturapuntoventa.getserie());	
				detallefacturapuntoventaAux.setcantidad(this.detallefacturapuntoventa.getcantidad());	
				detallefacturapuntoventaAux.setprecio(this.detallefacturapuntoventa.getprecio());	
				detallefacturapuntoventaAux.setdescuento(this.detallefacturapuntoventa.getdescuento());	
				detallefacturapuntoventaAux.setdescuento_valor(this.detallefacturapuntoventa.getdescuento_valor());	
				detallefacturapuntoventaAux.setiva(this.detallefacturapuntoventa.getiva());	
				detallefacturapuntoventaAux.setiva_valor(this.detallefacturapuntoventa.getiva_valor());	
				detallefacturapuntoventaAux.setice(this.detallefacturapuntoventa.getice());	
				detallefacturapuntoventaAux.setice_valor(this.detallefacturapuntoventa.getice_valor());	
				detallefacturapuntoventaAux.setsub_total(this.detallefacturapuntoventa.getsub_total());	
				detallefacturapuntoventaAux.settotal(this.detallefacturapuntoventa.gettotal());	
				detallefacturapuntoventaAux.setdescripcion(this.detallefacturapuntoventa.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallefacturapuntoventaAux,detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallefacturapuntoventaAux,detallefacturapuntoventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detallefacturapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallefacturapuntoventaLogic.saveDetalleFacturaPuntoVentas();//WithConnection
						//detallefacturapuntoventaLogic.getSetVersionRowDetalleFacturaPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallefacturapuntoventa,detallefacturapuntoventaAux);
					
					this.refrescarForeignKeysDescripcionesDetalleFacturaPuntoVenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallefacturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallefacturapuntoventaLogic.saveDetalleFacturaPuntoVentaRelaciones(detallefacturapuntoventaAux);//WithConnection
								//detallefacturapuntoventaLogic.getSetVersionRowDetalleFacturaPuntoVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallefacturapuntoventa,detallefacturapuntoventaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallefacturapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallefacturapuntoventaAux,detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallefacturapuntoventaAux,detallefacturapuntoventas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallefacturapuntoventa,detallefacturapuntoventaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detallefacturapuntoventaAux=new  DetalleFacturaPuntoVenta();
				
				detallefacturapuntoventaAux.setIsNew(false);
				detallefacturapuntoventaAux.setIsChanged(false);
				
				detallefacturapuntoventaAux.setIsDeleted(true);
				
				detallefacturapuntoventaAux.setId(this.detallefacturapuntoventa.getId());	
				detallefacturapuntoventaAux.setVersionRow(this.detallefacturapuntoventa.getVersionRow());	
				detallefacturapuntoventaAux.setid_factura_punto_venta(this.detallefacturapuntoventa.getid_factura_punto_venta());	
				detallefacturapuntoventaAux.setid_empresa(this.detallefacturapuntoventa.getid_empresa());	
				detallefacturapuntoventaAux.setid_sucursal(this.detallefacturapuntoventa.getid_sucursal());	
				detallefacturapuntoventaAux.setid_bodega(this.detallefacturapuntoventa.getid_bodega());	
				detallefacturapuntoventaAux.setid_producto(this.detallefacturapuntoventa.getid_producto());	
				detallefacturapuntoventaAux.setid_unidad(this.detallefacturapuntoventa.getid_unidad());	
				detallefacturapuntoventaAux.setserie(this.detallefacturapuntoventa.getserie());	
				detallefacturapuntoventaAux.setcantidad(this.detallefacturapuntoventa.getcantidad());	
				detallefacturapuntoventaAux.setprecio(this.detallefacturapuntoventa.getprecio());	
				detallefacturapuntoventaAux.setdescuento(this.detallefacturapuntoventa.getdescuento());	
				detallefacturapuntoventaAux.setdescuento_valor(this.detallefacturapuntoventa.getdescuento_valor());	
				detallefacturapuntoventaAux.setiva(this.detallefacturapuntoventa.getiva());	
				detallefacturapuntoventaAux.setiva_valor(this.detallefacturapuntoventa.getiva_valor());	
				detallefacturapuntoventaAux.setice(this.detallefacturapuntoventa.getice());	
				detallefacturapuntoventaAux.setice_valor(this.detallefacturapuntoventa.getice_valor());	
				detallefacturapuntoventaAux.setsub_total(this.detallefacturapuntoventa.getsub_total());	
				detallefacturapuntoventaAux.settotal(this.detallefacturapuntoventa.gettotal());	
				detallefacturapuntoventaAux.setdescripcion(this.detallefacturapuntoventa.getdescripcion());	
				
				if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detallefacturapuntoventaAux.getId()>=0) {	
						this.detallefacturapuntoventasEliminados.add(detallefacturapuntoventaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detallefacturapuntoventaAux,detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallefacturapuntoventaAux,detallefacturapuntoventas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detallefacturapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallefacturapuntoventaLogic.saveDetalleFacturaPuntoVentas();//WithConnection
						//detallefacturapuntoventaLogic.getSetVersionRowDetalleFacturaPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallefacturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallefacturapuntoventaLogic.saveDetalleFacturaPuntoVentaRelaciones(detallefacturapuntoventaAux);//WithConnection
								//detallefacturapuntoventaLogic.getSetVersionRowDetalleFacturaPuntoVentas();//WithConnection
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
							if(this.detallefacturapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detallefacturapuntoventaAux,detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detallefacturapuntoventaAux,detallefacturapuntoventas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().addAll(this.detallefacturapuntoventasEliminados);
					
					detallefacturapuntoventaLogic.saveDetalleFacturaPuntoVentas();//WithConnection
					//detallefacturapuntoventaLogic.getSetVersionRowDetalleFacturaPuntoVentas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetalleFacturaPuntoVenta();
				
				this.detallefacturapuntoventasEliminados= new ArrayList<DetalleFacturaPuntoVenta>();		
			}
			
			if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Factura GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Factura",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detallefacturapuntoventa=detallefacturapuntoventaAux;
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
      		//this.finishProcessDetalleFacturaPuntoVenta();
      	}
		
	}	
	
	public void actualizarRelaciones(DetalleFacturaPuntoVenta detallefacturapuntoventaLocal) throws Exception {
		
		if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleFacturaPuntoVenta detallefacturapuntoventaLocal) throws Exception {	
		if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(FacturaPuntoVentaDetalleFormJInternalFrame.class)) {
				FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrameLocal=(FacturaPuntoVentaBeanSwingJInternalFrame) ((FacturaPuntoVentaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				facturapuntoventaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFacturaPuntoVenta(facturapuntoventaBeanSwingJInternalFrameLocal.getfacturapuntoventa(),true);
				facturapuntoventaBeanSwingJInternalFrameLocal.actualizarLista(facturapuntoventaBeanSwingJInternalFrameLocal.facturapuntoventa,this.facturapuntoventasForeignKey);

				facturapuntoventaBeanSwingJInternalFrameLocal.actualizarRelaciones(facturapuntoventaBeanSwingJInternalFrameLocal.facturapuntoventa);

				detallefacturapuntoventaLocal.setFacturaPuntoVenta(facturapuntoventaBeanSwingJInternalFrameLocal.facturapuntoventa);

				this.addItemDefectoCombosForeignKeyFacturaPuntoVenta();
				this.cargarCombosFrameFacturaPuntoVentasForeignKey("Formulario");
				this.setActualFacturaPuntoVentaForeignKey(facturapuntoventaBeanSwingJInternalFrameLocal.facturapuntoventa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detallefacturapuntoventaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				detallefacturapuntoventaLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				detallefacturapuntoventaLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				detallefacturapuntoventaLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				detallefacturapuntoventaLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleFacturaPuntoVentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detallefacturapuntoventaValidator.getInvalidValues(this.detallefacturapuntoventa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleFacturaPuntoVenta detallefacturapuntoventa,List<DetalleFacturaPuntoVenta> detallefacturapuntoventas) throws Exception {
		try	{		
			DetalleFacturaPuntoVentaConstantesFunciones.actualizarLista(detallefacturapuntoventa,detallefacturapuntoventas,this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetalleFacturaPuntoVenta detallefacturapuntoventa,List<DetalleFacturaPuntoVenta> detallefacturapuntoventas) throws Exception {
		try	{			
			DetalleFacturaPuntoVentaConstantesFunciones.actualizarSelectedLista(detallefacturapuntoventa,detallefacturapuntoventas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleFacturaPuntoVenta> detallefacturapuntoventasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detallefacturapuntoventasLocal=this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detallefacturapuntoventasLocal=this.detallefacturapuntoventas;
			}
			//ARCHITECTURE
		
			for(DetalleFacturaPuntoVenta detallefacturapuntoventaLocal:detallefacturapuntoventasLocal) {
				if(this.permiteMantenimiento(detallefacturapuntoventaLocal) && detallefacturapuntoventaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetalleFacturaPuntoVentaConstantesFunciones.getDetalleFacturaPuntoVentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleFacturaPuntoVentaConstantesFunciones.IDFACTURAPUNTOVENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelid_factura_punto_ventaDetalleFacturaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleFacturaPuntoVentaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelid_empresaDetalleFacturaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleFacturaPuntoVentaConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelid_sucursalDetalleFacturaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleFacturaPuntoVentaConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelid_bodegaDetalleFacturaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleFacturaPuntoVentaConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelid_productoDetalleFacturaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleFacturaPuntoVentaConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelid_unidadDetalleFacturaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleFacturaPuntoVentaConstantesFunciones.SERIE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelserieDetalleFacturaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleFacturaPuntoVentaConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelcantidadDetalleFacturaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleFacturaPuntoVentaConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelprecioDetalleFacturaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleFacturaPuntoVentaConstantesFunciones.DESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabeldescuentoDetalleFacturaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleFacturaPuntoVentaConstantesFunciones.DESCUENTOVALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabeldescuento_valorDetalleFacturaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleFacturaPuntoVentaConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelivaDetalleFacturaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleFacturaPuntoVentaConstantesFunciones.IVAVALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabeliva_valorDetalleFacturaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleFacturaPuntoVentaConstantesFunciones.ICE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabeliceDetalleFacturaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleFacturaPuntoVentaConstantesFunciones.ICEVALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelice_valorDetalleFacturaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleFacturaPuntoVentaConstantesFunciones.SUBTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelsub_totalDetalleFacturaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleFacturaPuntoVentaConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabeltotalDetalleFacturaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleFacturaPuntoVentaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabeldescripcionDetalleFacturaPuntoVenta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelid_factura_punto_ventaDetalleFacturaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelid_empresaDetalleFacturaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelid_sucursalDetalleFacturaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelid_bodegaDetalleFacturaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelid_productoDetalleFacturaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelid_unidadDetalleFacturaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelserieDetalleFacturaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelcantidadDetalleFacturaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelprecioDetalleFacturaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabeldescuentoDetalleFacturaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabeldescuento_valorDetalleFacturaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelivaDetalleFacturaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabeliva_valorDetalleFacturaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabeliceDetalleFacturaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelice_valorDetalleFacturaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelsub_totalDetalleFacturaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabeltotalDetalleFacturaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabeldescripcionDetalleFacturaPuntoVenta,"");
		
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
		this.iIdNuevoDetalleFacturaPuntoVenta--;	
		
		
		this.detallefacturapuntoventaAux=new DetalleFacturaPuntoVenta();
		
		this.detallefacturapuntoventaAux.setId(this.iIdNuevoDetalleFacturaPuntoVenta);
		this.detallefacturapuntoventaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().add(this.detallefacturapuntoventaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detallefacturapuntoventas.add(this.detallefacturapuntoventaAux);
		}
		//ARCHITECTURE
		
		this.detallefacturapuntoventa=this.detallefacturapuntoventaAux;
		
		if(DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
		}
				
		//this.setDefaultControlesDetalleFacturaPuntoVenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleFacturaPuntoVenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleFacturaPuntoVenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleFacturaPuntoVenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventaBean,this.detallefacturapuntoventa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
			classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detallefacturapuntoventaReturnGeneral=detallefacturapuntoventaLogic.procesarEventosDetalleFacturaPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas(),this.detallefacturapuntoventa,this.detallefacturapuntoventaParameterGeneral,this.isEsNuevoDetalleFacturaPuntoVenta,classes);//this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVenta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleFacturaPuntoVenta(this.detallefacturapuntoventaReturnGeneral,this.detallefacturapuntoventaBean,false);
		
		if(this.detallefacturapuntoventaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleFacturaPuntoVenta(this.detallefacturapuntoventaReturnGeneral.getDetalleFacturaPuntoVenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleFacturaPuntoVenta(this.detallefacturapuntoventaReturnGeneral.getDetalleFacturaPuntoVenta());
		}
		
		if(this.detallefacturapuntoventaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleFacturaPuntoVenta(this.detallefacturapuntoventaReturnGeneral.getDetalleFacturaPuntoVenta(),classes);//this.detallefacturapuntoventaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleFacturaPuntoVenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleFacturaPuntoVenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.RecargarFormDetalleFacturaPuntoVenta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
						
			if(detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleFacturaPuntoVenta();
			}
			
			this.actualizarVisualTableDatosDetalleFacturaPuntoVenta();
			
			this.jTableDatosDetalleFacturaPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoDetalleFacturaPuntoVenta(), this.getIndiceNuevoDetalleFacturaPuntoVenta());
			
			this.seleccionarFilaTablaDetalleFacturaPuntoVentaActual();
						
			this.actualizarEstadoCeldasBotonesDetalleFacturaPuntoVenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleFacturaPuntoVenta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldserieDetalleFacturaPuntoVenta.setEnabled(isHabilitar && this.detallefacturapuntoventaConstantesFunciones.activarserieDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldcantidadDetalleFacturaPuntoVenta.setEnabled(isHabilitar && this.detallefacturapuntoventaConstantesFunciones.activarcantidadDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldprecioDetalleFacturaPuntoVenta.setEnabled(isHabilitar && this.detallefacturapuntoventaConstantesFunciones.activarprecioDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuentoDetalleFacturaPuntoVenta.setEnabled(isHabilitar && this.detallefacturapuntoventaConstantesFunciones.activardescuentoDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuento_valorDetalleFacturaPuntoVenta.setEnabled(isHabilitar && this.detallefacturapuntoventaConstantesFunciones.activardescuento_valorDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldivaDetalleFacturaPuntoVenta.setEnabled(isHabilitar && this.detallefacturapuntoventaConstantesFunciones.activarivaDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiva_valorDetalleFacturaPuntoVenta.setEnabled(isHabilitar && this.detallefacturapuntoventaConstantesFunciones.activariva_valorDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiceDetalleFacturaPuntoVenta.setEnabled(isHabilitar && this.detallefacturapuntoventaConstantesFunciones.activariceDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldice_valorDetalleFacturaPuntoVenta.setEnabled(isHabilitar && this.detallefacturapuntoventaConstantesFunciones.activarice_valorDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldsub_totalDetalleFacturaPuntoVenta.setEnabled(isHabilitar && this.detallefacturapuntoventaConstantesFunciones.activarsub_totalDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldtotalDetalleFacturaPuntoVenta.setEnabled(isHabilitar && this.detallefacturapuntoventaConstantesFunciones.activartotalDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextAreadescripcionDetalleFacturaPuntoVenta.setEnabled(isHabilitar && this.detallefacturapuntoventaConstantesFunciones.activardescripcionDetalleFacturaPuntoVenta);	
		
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.setEnabled(isHabilitar && this.detallefacturapuntoventaConstantesFunciones.activarid_factura_punto_ventaDetalleFacturaPuntoVenta);//
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_empresaDetalleFacturaPuntoVenta.setEnabled(isHabilitar && this.detallefacturapuntoventaConstantesFunciones.activarid_empresaDetalleFacturaPuntoVenta);//
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_sucursalDetalleFacturaPuntoVenta.setEnabled(isHabilitar && this.detallefacturapuntoventaConstantesFunciones.activarid_sucursalDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta.setEnabled(isHabilitar && this.detallefacturapuntoventaConstantesFunciones.activarid_bodegaDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta.setEnabled(isHabilitar && this.detallefacturapuntoventaConstantesFunciones.activarid_productoDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_unidadDetalleFacturaPuntoVenta.setEnabled(isHabilitar && this.detallefacturapuntoventaConstantesFunciones.activarid_unidadDetalleFacturaPuntoVenta);
	};
	
	public void setDefaultControlesDetalleFacturaPuntoVenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleFacturaPuntoVenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detallefacturapuntoventaSessionBean.setConGuardarRelaciones(true);			
			this.detallefacturapuntoventaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTabbedPaneRelacionesDetalleFacturaPuntoVenta.setVisible(true);
			
					
		} else {
			//this.detallefacturapuntoventaSessionBean.setConGuardarRelaciones(false);			
			this.detallefacturapuntoventaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTabbedPaneRelacionesDetalleFacturaPuntoVenta.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetalleFacturaPuntoVenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas()) {
				if(detallefacturapuntoventaAux.getId().equals(this.iIdNuevoDetalleFacturaPuntoVenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:this.detallefacturapuntoventas) {
				if(detallefacturapuntoventaAux.getId().equals(this.iIdNuevoDetalleFacturaPuntoVenta)) {
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
	
	public int getIndiceActualDetalleFacturaPuntoVenta(DetalleFacturaPuntoVenta detallefacturapuntoventa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas()) {
				if(detallefacturapuntoventaAux.getId().equals(detallefacturapuntoventa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:this.detallefacturapuntoventas) {
				if(detallefacturapuntoventaAux.getId().equals(detallefacturapuntoventa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetalleFacturaPuntoVenta(DetalleFacturaPuntoVenta detallefacturapuntoventaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas()) {
				if(detallefacturapuntoventaAux.getDetalleFacturaPuntoVentaOriginal().getId().equals(detallefacturapuntoventaOriginal.getId())) {
					existe=true;
					detallefacturapuntoventaOriginal.setId(detallefacturapuntoventaAux.getId());
					detallefacturapuntoventaOriginal.setVersionRow(detallefacturapuntoventaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:this.detallefacturapuntoventas) {
				if(detallefacturapuntoventaAux.getDetalleFacturaPuntoVentaOriginal().getId().equals(detallefacturapuntoventaOriginal.getId())) {
					existe=true;
					detallefacturapuntoventaOriginal.setId(detallefacturapuntoventaAux.getId());
					detallefacturapuntoventaOriginal.setVersionRow(detallefacturapuntoventaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleFacturaPuntoVenta(Boolean esParaCancelar) throws Exception {
		detallefacturapuntoventasAux=new ArrayList<DetalleFacturaPuntoVenta>();
		detallefacturapuntoventaAux=new DetalleFacturaPuntoVenta();
		
		if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas()) {
					if(detallefacturapuntoventaAux.getId()<0) {
						detallefacturapuntoventasAux.add(detallefacturapuntoventaAux);
					}		
				}
				this.iIdNuevoDetalleFacturaPuntoVenta=0L;
				this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().removeAll(detallefacturapuntoventasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:this.detallefacturapuntoventas) {
					if(detallefacturapuntoventaAux.getId()<0) {
						detallefacturapuntoventasAux.add(detallefacturapuntoventaAux);
					}		
				}
				this.iIdNuevoDetalleFacturaPuntoVenta=0L;
				this.detallefacturapuntoventas.removeAll(detallefacturapuntoventasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleFacturaPuntoVenta 
					&& this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().size()>0
					) {
					detallefacturapuntoventaAux=this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().get(this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().size() - 1);
				
					if(detallefacturapuntoventaAux.getId()<0) {
						this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().remove(detallefacturapuntoventaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleFacturaPuntoVenta && this.detallefacturapuntoventas.size()>0) {
					detallefacturapuntoventaAux=this.detallefacturapuntoventas.get(this.detallefacturapuntoventas.size() - 1);
				
					if(detallefacturapuntoventaAux.getId()<0) {
						this.detallefacturapuntoventas.remove(detallefacturapuntoventaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleFacturaPuntoVenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detallefacturapuntoventa.getId()<0) {
				this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().remove(this.detallefacturapuntoventa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detallefacturapuntoventa.getId()<0) {
				this.detallefacturapuntoventas.remove(this.detallefacturapuntoventa);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleFacturaPuntoVenta(List<DetalleFacturaPuntoVenta> detallefacturapuntoventasAux) throws Exception {
		DetalleFacturaPuntoVentaConstantesFunciones.setEstadosInicialesDetalleFacturaPuntoVenta(detallefacturapuntoventasAux);
	}
	
	public void setEstadosInicialesDetalleFacturaPuntoVenta(DetalleFacturaPuntoVenta detallefacturapuntoventaAux) throws Exception {
		DetalleFacturaPuntoVentaConstantesFunciones.setEstadosInicialesDetalleFacturaPuntoVenta(detallefacturapuntoventaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleFacturaPuntoVentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleFacturaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleFacturaPuntoVentaActual()) {
				if(!this.isEsNuevoDetalleFacturaPuntoVenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleFacturaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleFacturaPuntoVenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleFacturaPuntoVentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Factura ?", "MANTENIMIENTO DE Detalle Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleFacturaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleFacturaPuntoVenta detallefacturapuntoventa) throws Exception {
		DetalleFacturaPuntoVentaConstantesFunciones.seleccionarAsignar(this.detallefacturapuntoventa,detallefacturapuntoventa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleFacturaPuntoVenta=this.isPermisoActualizarOriginalDetalleFacturaPuntoVenta;
			
			
			this.seleccionarAsignar(detallefacturapuntoventa);
			
			

			idProductoActual=detallefacturapuntoventa.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleFacturaPuntoVentaConstantesFunciones.quitarEspaciosDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetalleFacturaPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detallefacturapuntoventaSessionBean.setsFuncionBusquedaRapida(this.detallefacturapuntoventaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoDetalleFacturaPuntoVenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleFacturaPuntoVenta(esParaCancelar);				
				this.cancelarNuevoDetalleFacturaPuntoVenta(esParaCancelar);								
			}
			
			this.detallefacturapuntoventa=new DetalleFacturaPuntoVenta();
			
			this.inicializarDetalleFacturaPuntoVenta();
			
			this.actualizarEstadoCeldasBotonesDetalleFacturaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleFacturaPuntoVenta() throws Exception {
		try {
			DetalleFacturaPuntoVentaConstantesFunciones.inicializarDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
			
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
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleFacturaPuntoVentas(String sAccionBusqueda,List<DetalleFacturaPuntoVenta> detallefacturapuntoventasParaReportes) throws Exception {
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
					sPathReporteFinal="DetalleFacturaPuntoVenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleFacturaPuntoVentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleFacturaPuntoVentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleFacturaPuntoVenta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Facturas");		
		parameters.put("busquedapor", DetalleFacturaPuntoVentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleFacturaPuntoVenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleFacturaPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleFacturaPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleFacturaPuntoVenta=new JRBeanArrayDataSource(DetalleFacturaPuntoVentaJInternalFrame.TraerDetalleFacturaPuntoVentaBeans(detallefacturapuntoventasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleFacturaPuntoVenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleFacturaPuntoVentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleFacturaPuntoVentaBean.TraerDetalleFacturaPuntoVentaBeans(detallefacturapuntoventasParaReportes).toArray()));
							
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
				this.generarExcelReporteDetalleFacturaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,detallefacturapuntoventasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleFacturaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,detallefacturapuntoventasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleFacturaPuntoVentaActionPerformed(null);
					//this.generarExcelReporteDetalleFacturaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,detallefacturapuntoventasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleFacturaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,detallefacturapuntoventasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleFacturaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,detallefacturapuntoventasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleFacturaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,detallefacturapuntoventasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleFacturaPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleFacturaPuntoVenta> detallefacturapuntoventasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallefacturapuntoventa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleFacturaPuntoVentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleFacturaPuntoVenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleFacturaPuntoVenta detallefacturapuntoventa : detallefacturapuntoventasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleFacturaPuntoVentaConstantesFunciones.generarExcelReporteDataDetalleFacturaPuntoVenta("NORMAL",row,workbook,detallefacturapuntoventa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleFacturaPuntoVenta(String sTipo,Row row,Workbook workbook) {
		
		DetalleFacturaPuntoVentaConstantesFunciones.generarExcelReporteHeaderDetalleFacturaPuntoVenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleFacturaPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleFacturaPuntoVenta> detallefacturapuntoventasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallefacturapuntoventa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleFacturaPuntoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleFacturaPuntoVenta detallefacturapuntoventa : detallefacturapuntoventasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.getDetalleFacturaPuntoVentaDescripcion(detallefacturapuntoventa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturapuntoventa.getfacturapuntoventa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturapuntoventa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturapuntoventa.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturapuntoventa.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturapuntoventa.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturapuntoventa.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SERIE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SERIE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturapuntoventa.getserie());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturapuntoventa.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturapuntoventa.getprecio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturapuntoventa.getdescuento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturapuntoventa.getdescuento_valor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturapuntoventa.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVAVALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVAVALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturapuntoventa.getiva_valor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturapuntoventa.getice());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICEVALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICEVALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturapuntoventa.getice_valor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SUBTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SUBTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturapuntoventa.getsub_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturapuntoventa.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturapuntoventa.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleFacturaPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleFacturaPuntoVenta> detallefacturapuntoventasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleFacturaPuntoVenta> detallefacturapuntoventasRespaldo=null;
		
		classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detallefacturapuntoventaLogic.setDatosCliente(this.datosCliente);
		this.detallefacturapuntoventaLogic.setDatosDeep(this.datosDeep);
		this.detallefacturapuntoventaLogic.setIsConDeep(true);
		
		detallefacturapuntoventasRespaldo=this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas();
		
		this.detallefacturapuntoventaLogic.setDetalleFacturaPuntoVentas(detallefacturapuntoventasParaReportes);	
		this.detallefacturapuntoventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detallefacturapuntoventasParaReportes=this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas();
		this.detallefacturapuntoventaLogic.setDetalleFacturaPuntoVentas(detallefacturapuntoventasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallefacturapuntoventa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleFacturaPuntoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleFacturaPuntoVenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleFacturaPuntoVenta detallefacturapuntoventa : detallefacturapuntoventasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleFacturaPuntoVenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleFacturaPuntoVentaConstantesFunciones.generarExcelReporteDataDetalleFacturaPuntoVenta("NORMAL",row,workbook,detallefacturapuntoventa,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.getDetalleFacturaPuntoVentaDescripcion(detallefacturapuntoventa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleFacturaPuntoVenta() throws Exception {		
		this.startProcessDetalleFacturaPuntoVenta(true);
	}
	
	public void startProcessDetalleFacturaPuntoVenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta ,this.jPanelParametrosReportesDetalleFacturaPuntoVenta, this.jScrollPanelDatosDetalleFacturaPuntoVenta,this.jPanelPaginacionDetalleFacturaPuntoVenta, this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta, this.jPanelAccionesDetalleFacturaPuntoVenta,this.jPanelAccionesFormularioDetalleFacturaPuntoVenta,this.jmenuBarDetalleFacturaPuntoVenta,this.jmenuBarDetalleDetalleFacturaPuntoVenta,this.jTtoolBarDetalleFacturaPuntoVenta,this.jTtoolBarDetalleDetalleFacturaPuntoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleFacturaPuntoVenta=this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta; 
		
		final JPanel jPanelParametrosReportesDetalleFacturaPuntoVenta=this.jPanelParametrosReportesDetalleFacturaPuntoVenta;
		//final JScrollPane jScrollPanelDatosDetalleFacturaPuntoVenta=this.jScrollPanelDatosDetalleFacturaPuntoVenta;
		final JTable jTableDatosDetalleFacturaPuntoVenta=this.jTableDatosDetalleFacturaPuntoVenta;		
		final JPanel jPanelPaginacionDetalleFacturaPuntoVenta=this.jPanelPaginacionDetalleFacturaPuntoVenta;
		//final JScrollPane jScrollPanelDatosEdicionDetalleFacturaPuntoVenta=this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta;
		final JPanel jPanelAccionesDetalleFacturaPuntoVenta=this.jPanelAccionesDetalleFacturaPuntoVenta;
		
		JPanel jPanelCamposAuxiliarDetalleFacturaPuntoVenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleFacturaPuntoVenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
			jPanelCamposAuxiliarDetalleFacturaPuntoVenta=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPanelCamposDetalleFacturaPuntoVenta;
			jPanelAccionesFormularioAuxiliarDetalleFacturaPuntoVenta=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPanelAccionesFormularioDetalleFacturaPuntoVenta;
		}
		
		final JPanel jPanelCamposDetalleFacturaPuntoVenta=jPanelCamposAuxiliarDetalleFacturaPuntoVenta;
		final JPanel jPanelAccionesFormularioDetalleFacturaPuntoVenta=jPanelAccionesFormularioAuxiliarDetalleFacturaPuntoVenta;
		
		
		final JMenuBar jmenuBarDetalleFacturaPuntoVenta=this.jmenuBarDetalleFacturaPuntoVenta;
		final JToolBar jTtoolBarDetalleFacturaPuntoVenta=this.jTtoolBarDetalleFacturaPuntoVenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleFacturaPuntoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleFacturaPuntoVenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
			jmenuBarDetalleAuxiliarDetalleFacturaPuntoVenta=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jmenuBarDetalleDetalleFacturaPuntoVenta;
			jTtoolBarDetalleAuxiliarDetalleFacturaPuntoVenta=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTtoolBarDetalleDetalleFacturaPuntoVenta;
		}
		
		final JMenuBar jmenuBarDetalleDetalleFacturaPuntoVenta=jmenuBarDetalleAuxiliarDetalleFacturaPuntoVenta;
		final JToolBar jTtoolBarDetalleDetalleFacturaPuntoVenta=jTtoolBarDetalleAuxiliarDetalleFacturaPuntoVenta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleFacturaPuntoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleFacturaPuntoVenta;
			processRunnable.jTableDatos=jTableDatosDetalleFacturaPuntoVenta;
			processRunnable.jPanelCampos=jPanelCamposDetalleFacturaPuntoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleFacturaPuntoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleFacturaPuntoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleFacturaPuntoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleFacturaPuntoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleFacturaPuntoVenta;
			processRunnable.jTtoolBar=jTtoolBarDetalleFacturaPuntoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleFacturaPuntoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleFacturaPuntoVenta ,jPanelParametrosReportesDetalleFacturaPuntoVenta,jTableDatosDetalleFacturaPuntoVenta, /*jScrollPanelDatosDetalleFacturaPuntoVenta,*/jPanelCamposDetalleFacturaPuntoVenta,jPanelPaginacionDetalleFacturaPuntoVenta, /*jScrollPanelDatosEdicionDetalleFacturaPuntoVenta,*/ jPanelAccionesDetalleFacturaPuntoVenta,jPanelAccionesFormularioDetalleFacturaPuntoVenta,jmenuBarDetalleFacturaPuntoVenta,jmenuBarDetalleDetalleFacturaPuntoVenta,jTtoolBarDetalleFacturaPuntoVenta,jTtoolBarDetalleDetalleFacturaPuntoVenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleFacturaPuntoVenta ,jPanelParametrosReportesDetalleFacturaPuntoVenta, jScrollPanelDatosDetalleFacturaPuntoVenta,jPanelPaginacionDetalleFacturaPuntoVenta, jScrollPanelDatosEdicionDetalleFacturaPuntoVenta, jPanelAccionesDetalleFacturaPuntoVenta,jPanelAccionesFormularioDetalleFacturaPuntoVenta,jmenuBarDetalleFacturaPuntoVenta,jmenuBarDetalleDetalleFacturaPuntoVenta,jTtoolBarDetalleFacturaPuntoVenta,jTtoolBarDetalleDetalleFacturaPuntoVenta);
						
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
	
	public void finishProcessDetalleFacturaPuntoVenta() {// throws Exception 
		this.finishProcessDetalleFacturaPuntoVenta(true);
	}
	
	public void finishProcessDetalleFacturaPuntoVenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta ,this.jPanelParametrosReportesDetalleFacturaPuntoVenta, this.jScrollPanelDatosDetalleFacturaPuntoVenta,this.jPanelPaginacionDetalleFacturaPuntoVenta, this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta, this.jPanelAccionesDetalleFacturaPuntoVenta,this.jPanelAccionesFormularioDetalleFacturaPuntoVenta,this.jmenuBarDetalleFacturaPuntoVenta,this.jmenuBarDetalleDetalleFacturaPuntoVenta,this.jTtoolBarDetalleFacturaPuntoVenta,this.jTtoolBarDetalleDetalleFacturaPuntoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleFacturaPuntoVenta=this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta; 
		
		final JPanel jPanelParametrosReportesDetalleFacturaPuntoVenta=this.jPanelParametrosReportesDetalleFacturaPuntoVenta;
		//final JScrollPane jScrollPanelDatosDetalleFacturaPuntoVenta=this.jScrollPanelDatosDetalleFacturaPuntoVenta;
		final JTable jTableDatosDetalleFacturaPuntoVenta=this.jTableDatosDetalleFacturaPuntoVenta;		
		final JPanel jPanelPaginacionDetalleFacturaPuntoVenta=this.jPanelPaginacionDetalleFacturaPuntoVenta;
		//final JScrollPane jScrollPanelDatosEdicionDetalleFacturaPuntoVenta=this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta;
		final JPanel jPanelAccionesDetalleFacturaPuntoVenta=this.jPanelAccionesDetalleFacturaPuntoVenta;
		
		JPanel jPanelCamposAuxiliarDetalleFacturaPuntoVenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleFacturaPuntoVenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
			jPanelCamposAuxiliarDetalleFacturaPuntoVenta=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPanelCamposDetalleFacturaPuntoVenta;
			jPanelAccionesFormularioAuxiliarDetalleFacturaPuntoVenta=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPanelAccionesFormularioDetalleFacturaPuntoVenta;
		}
		
		final JPanel jPanelCamposDetalleFacturaPuntoVenta=jPanelCamposAuxiliarDetalleFacturaPuntoVenta;
		final JPanel jPanelAccionesFormularioDetalleFacturaPuntoVenta=jPanelAccionesFormularioAuxiliarDetalleFacturaPuntoVenta;
		
		
		final JMenuBar jmenuBarDetalleFacturaPuntoVenta=this.jmenuBarDetalleFacturaPuntoVenta;		
		final JToolBar jTtoolBarDetalleFacturaPuntoVenta=this.jTtoolBarDetalleFacturaPuntoVenta;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleFacturaPuntoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleFacturaPuntoVenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
			jmenuBarDetalleAuxiliarDetalleFacturaPuntoVenta=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jmenuBarDetalleDetalleFacturaPuntoVenta;
			jTtoolBarDetalleAuxiliarDetalleFacturaPuntoVenta=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTtoolBarDetalleDetalleFacturaPuntoVenta;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleFacturaPuntoVenta=jmenuBarDetalleAuxiliarDetalleFacturaPuntoVenta;
		final JToolBar jTtoolBarDetalleDetalleFacturaPuntoVenta=jTtoolBarDetalleAuxiliarDetalleFacturaPuntoVenta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleFacturaPuntoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleFacturaPuntoVenta;
			processRunnable.jTableDatos=jTableDatosDetalleFacturaPuntoVenta;
			processRunnable.jPanelCampos=jPanelCamposDetalleFacturaPuntoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleFacturaPuntoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleFacturaPuntoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleFacturaPuntoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleFacturaPuntoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleFacturaPuntoVenta;
			processRunnable.jTtoolBar=jTtoolBarDetalleFacturaPuntoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleFacturaPuntoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleFacturaPuntoVenta ,jPanelParametrosReportesDetalleFacturaPuntoVenta, jTableDatosDetalleFacturaPuntoVenta,/*jScrollPanelDatosDetalleFacturaPuntoVenta,*/jPanelCamposDetalleFacturaPuntoVenta,jPanelPaginacionDetalleFacturaPuntoVenta, /*jScrollPanelDatosEdicionDetalleFacturaPuntoVenta,*/ jPanelAccionesDetalleFacturaPuntoVenta,jPanelAccionesFormularioDetalleFacturaPuntoVenta,jmenuBarDetalleFacturaPuntoVenta,jmenuBarDetalleDetalleFacturaPuntoVenta,jTtoolBarDetalleFacturaPuntoVenta,jTtoolBarDetalleDetalleFacturaPuntoVenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleFacturaPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleFacturaPuntoVenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleFacturaPuntoVenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleFacturaPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFacturaPuntoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleFacturaPuntoVenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleFacturaPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFacturaPuntoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleFacturaPuntoVenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detallefacturapuntoventaConstantesFunciones.getsFinalQueryDetalleFacturaPuntoVenta();
		String  finalQueryPaginacionTodos=this.detallefacturapuntoventaConstantesFunciones.getsFinalQueryDetalleFacturaPuntoVenta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleFacturaPuntoVentaConstantesFunciones.getArrayColumnasGlobalesNoDetalleFacturaPuntoVenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleFacturaPuntoVentaConstantesFunciones.getArrayColumnasGlobalesDetalleFacturaPuntoVenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleFacturaPuntoVentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detallefacturapuntoventasEliminados= new ArrayList<DetalleFacturaPuntoVenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleFacturaPuntoVenta();
		
				///*DetalleFacturaPuntoVentaSessionBean*/this.detallefacturapuntoventaSessionBean=new DetalleFacturaPuntoVentaSessionBean();
			
			if(this.detallefacturapuntoventaSessionBean==null) {
				this.detallefacturapuntoventaSessionBean=new DetalleFacturaPuntoVentaSessionBean();
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
					this.iNumeroPaginacion=DetalleFacturaPuntoVentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesForeignKeysOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detallefacturapuntoventa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detallefacturapuntoventasAux= new ArrayList<DetalleFacturaPuntoVenta>();
			
				
			detallefacturapuntoventaLogic.setDatosCliente(this.datosCliente);
			detallefacturapuntoventaLogic.setDatosDeep(this.datosDeep);
			detallefacturapuntoventaLogic.setIsConDeep(true);
			
			
			detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detallefacturapuntoventaLogic.getTodosDetalleFacturaPuntoVentas(finalQueryGlobal,pagination);
					
					//detallefacturapuntoventaLogic.getTodosDetalleFacturaPuntoVentasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas()==null|| detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallefacturapuntoventasAux= new ArrayList<DetalleFacturaPuntoVenta>();
							detallefacturapuntoventasAux.addAll(detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallefacturapuntoventasAux= new ArrayList<DetalleFacturaPuntoVenta>();
							detallefacturapuntoventasAux.addAll(detallefacturapuntoventas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallefacturapuntoventaLogic.getTodosDetalleFacturaPuntoVentas(finalQueryGlobal+"",this.pagination);												
							
							//detallefacturapuntoventaLogic.getTodosDetalleFacturaPuntoVentasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetalleFacturaPuntoVentas("Todos",detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallefacturapuntoventaLogic.setDetalleFacturaPuntoVentas(new ArrayList<DetalleFacturaPuntoVenta>());					
							detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().addAll(detallefacturapuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallefacturapuntoventas=new ArrayList<DetalleFacturaPuntoVenta>();
							detallefacturapuntoventas.addAll(detallefacturapuntoventasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetalleFacturaPuntoVenta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetalleFacturaPuntoVenta=this.idActual;
				
				} else if(this.idDetalleFacturaPuntoVentaActual!=null && this.idDetalleFacturaPuntoVentaActual!=0L) {
					idDetalleFacturaPuntoVenta=idDetalleFacturaPuntoVentaActual;
				}
				
					
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndicePorId(idDetalleFacturaPuntoVenta);
				
				this.detallefacturapuntoventas=new ArrayList<DetalleFacturaPuntoVenta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detallefacturapuntoventaLogic.getEntity(idDetalleFacturaPuntoVenta);
					
					//detallefacturapuntoventaLogic.getEntityWithConnection(idDetalleFacturaPuntoVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallefacturapuntoventaLogic.setDetalleFacturaPuntoVentas(new ArrayList<DetalleFacturaPuntoVenta>());
					detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().add(detallefacturapuntoventaLogic.getDetalleFacturaPuntoVenta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallefacturapuntoventas=new ArrayList<DetalleFacturaPuntoVenta>();
					this.detallefacturapuntoventas.add(detallefacturapuntoventa);
				}
				
				if(detallefacturapuntoventaLogic.getDetalleFacturaPuntoVenta()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentasFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas()==null||detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallefacturapuntoventas==null|| detallefacturapuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallefacturapuntoventasAux=new ArrayList<DetalleFacturaPuntoVenta>();
						detallefacturapuntoventasAux.addAll(detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallefacturapuntoventasAux=new ArrayList<DetalleFacturaPuntoVenta>();
							detallefacturapuntoventasAux.addAll(detallefacturapuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentasFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleFacturaPuntoVentas("FK_IdBodega",detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleFacturaPuntoVentas("FK_IdBodega",detallefacturapuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallefacturapuntoventaLogic.setDetalleFacturaPuntoVentas(new ArrayList<DetalleFacturaPuntoVenta>());
						detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().addAll(detallefacturapuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallefacturapuntoventas=new ArrayList<DetalleFacturaPuntoVenta>();
							detallefacturapuntoventas.addAll(detallefacturapuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas()==null||detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallefacturapuntoventas==null|| detallefacturapuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallefacturapuntoventasAux=new ArrayList<DetalleFacturaPuntoVenta>();
						detallefacturapuntoventasAux.addAll(detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallefacturapuntoventasAux=new ArrayList<DetalleFacturaPuntoVenta>();
							detallefacturapuntoventasAux.addAll(detallefacturapuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleFacturaPuntoVentas("FK_IdEmpresa",detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleFacturaPuntoVentas("FK_IdEmpresa",detallefacturapuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallefacturapuntoventaLogic.setDetalleFacturaPuntoVentas(new ArrayList<DetalleFacturaPuntoVenta>());
						detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().addAll(detallefacturapuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallefacturapuntoventas=new ArrayList<DetalleFacturaPuntoVenta>();
							detallefacturapuntoventas.addAll(detallefacturapuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFacturaPuntoVenta")) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdFacturaPuntoVenta(id_factura_punto_ventaFK_IdFacturaPuntoVenta);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentasFK_IdFacturaPuntoVenta(finalQueryGlobal,pagination,id_factura_punto_ventaFK_IdFacturaPuntoVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdFacturaPuntoVenta(id_factura_punto_ventaFK_IdFacturaPuntoVenta);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdFacturaPuntoVenta(id_factura_punto_ventaFK_IdFacturaPuntoVenta);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas()==null||detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallefacturapuntoventas==null|| detallefacturapuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallefacturapuntoventasAux=new ArrayList<DetalleFacturaPuntoVenta>();
						detallefacturapuntoventasAux.addAll(detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallefacturapuntoventasAux=new ArrayList<DetalleFacturaPuntoVenta>();
							detallefacturapuntoventasAux.addAll(detallefacturapuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentasFK_IdFacturaPuntoVenta(finalQueryGlobal,pagination,id_factura_punto_ventaFK_IdFacturaPuntoVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdFacturaPuntoVenta(id_factura_punto_ventaFK_IdFacturaPuntoVenta);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdFacturaPuntoVenta(id_factura_punto_ventaFK_IdFacturaPuntoVenta);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleFacturaPuntoVentas("FK_IdFacturaPuntoVenta",detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleFacturaPuntoVentas("FK_IdFacturaPuntoVenta",detallefacturapuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallefacturapuntoventaLogic.setDetalleFacturaPuntoVentas(new ArrayList<DetalleFacturaPuntoVenta>());
						detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().addAll(detallefacturapuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallefacturapuntoventas=new ArrayList<DetalleFacturaPuntoVenta>();
							detallefacturapuntoventas.addAll(detallefacturapuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentasFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas()==null||detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallefacturapuntoventas==null|| detallefacturapuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallefacturapuntoventasAux=new ArrayList<DetalleFacturaPuntoVenta>();
						detallefacturapuntoventasAux.addAll(detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallefacturapuntoventasAux=new ArrayList<DetalleFacturaPuntoVenta>();
							detallefacturapuntoventasAux.addAll(detallefacturapuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentasFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleFacturaPuntoVentas("FK_IdProducto",detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleFacturaPuntoVentas("FK_IdProducto",detallefacturapuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallefacturapuntoventaLogic.setDetalleFacturaPuntoVentas(new ArrayList<DetalleFacturaPuntoVenta>());
						detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().addAll(detallefacturapuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallefacturapuntoventas=new ArrayList<DetalleFacturaPuntoVenta>();
							detallefacturapuntoventas.addAll(detallefacturapuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas()==null||detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallefacturapuntoventas==null|| detallefacturapuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallefacturapuntoventasAux=new ArrayList<DetalleFacturaPuntoVenta>();
						detallefacturapuntoventasAux.addAll(detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallefacturapuntoventasAux=new ArrayList<DetalleFacturaPuntoVenta>();
							detallefacturapuntoventasAux.addAll(detallefacturapuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleFacturaPuntoVentas("FK_IdSucursal",detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleFacturaPuntoVentas("FK_IdSucursal",detallefacturapuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallefacturapuntoventaLogic.setDetalleFacturaPuntoVentas(new ArrayList<DetalleFacturaPuntoVenta>());
						detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().addAll(detallefacturapuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallefacturapuntoventas=new ArrayList<DetalleFacturaPuntoVenta>();
							detallefacturapuntoventas.addAll(detallefacturapuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidad")) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentasFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas()==null||detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallefacturapuntoventas==null|| detallefacturapuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallefacturapuntoventasAux=new ArrayList<DetalleFacturaPuntoVenta>();
						detallefacturapuntoventasAux.addAll(detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallefacturapuntoventasAux=new ArrayList<DetalleFacturaPuntoVenta>();
							detallefacturapuntoventasAux.addAll(detallefacturapuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentasFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleFacturaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleFacturaPuntoVentas("FK_IdUnidad",detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleFacturaPuntoVentas("FK_IdUnidad",detallefacturapuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallefacturapuntoventaLogic.setDetalleFacturaPuntoVentas(new ArrayList<DetalleFacturaPuntoVenta>());
						detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().addAll(detallefacturapuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallefacturapuntoventas=new ArrayList<DetalleFacturaPuntoVenta>();
							detallefacturapuntoventas.addAll(detallefacturapuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleFacturaPuntoVenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleFacturaPuntoVenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallefacturapuntoventas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallefacturapuntoventas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleFacturaPuntoVenta detallefacturapuntoventa) {
		Boolean permite=true;
		
		if(this.detallefacturapuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleFacturaPuntoVentaConstantesFunciones.getOrderByListaDetalleFacturaPuntoVenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleFacturaPuntoVentaConstantesFunciones.getOrderByListaDetalleFacturaPuntoVenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleFacturaPuntoVenta detallefacturapuntoventa:detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas()) {
				if(detallefacturapuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					detallefacturapuntoventaTotales=detallefacturapuntoventa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleFacturaPuntoVenta detallefacturapuntoventa:this.detallefacturapuntoventas) {
				if(detallefacturapuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					detallefacturapuntoventaTotales=detallefacturapuntoventa;
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
			this.detallefacturapuntoventaAux=new DetalleFacturaPuntoVenta();
			this.detallefacturapuntoventaAux.setsType(Constantes2.S_TOTALES);
			this.detallefacturapuntoventaAux.setIsNew(false);
			this.detallefacturapuntoventaAux.setIsChanged(false);
			this.detallefacturapuntoventaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetalleFacturaPuntoVentaConstantesFunciones.TotalizarValoresFilaDetalleFacturaPuntoVenta(this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas(),this.detallefacturapuntoventaAux);
				
				this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().add(this.detallefacturapuntoventaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleFacturaPuntoVentaConstantesFunciones.TotalizarValoresFilaDetalleFacturaPuntoVenta(this.detallefacturapuntoventas,this.detallefacturapuntoventaAux);
				
				this.detallefacturapuntoventas.add(this.detallefacturapuntoventaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detallefacturapuntoventaTotales=new DetalleFacturaPuntoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().remove(detallefacturapuntoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallefacturapuntoventas.remove(detallefacturapuntoventaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detallefacturapuntoventaTotales=new DetalleFacturaPuntoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleFacturaPuntoVenta detallefacturapuntoventa:detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas()) {
				if(detallefacturapuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					detallefacturapuntoventaTotales=detallefacturapuntoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleFacturaPuntoVentaConstantesFunciones.TotalizarValoresFilaDetalleFacturaPuntoVenta(this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas(),detallefacturapuntoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleFacturaPuntoVenta detallefacturapuntoventa:this.detallefacturapuntoventas) {
				if(detallefacturapuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					detallefacturapuntoventaTotales=detallefacturapuntoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleFacturaPuntoVentaConstantesFunciones.TotalizarValoresFilaDetalleFacturaPuntoVenta(this.detallefacturapuntoventas,detallefacturapuntoventaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleFacturaPuntoVentasFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleFacturaPuntoVentasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleFacturaPuntoVentasFK_IdFacturaPuntoVenta()throws Exception {
		try {
			sAccionBusqueda="FK_IdFacturaPuntoVenta";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleFacturaPuntoVentasFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleFacturaPuntoVentasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleFacturaPuntoVentasFK_IdUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleFacturaPuntoVentasFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentasFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleFacturaPuntoVentasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleFacturaPuntoVentasFK_IdFacturaPuntoVenta(String sFinalQuery,Long id_factura_punto_venta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentasFK_IdFacturaPuntoVenta(sFinalQuery,this.pagination,id_factura_punto_venta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleFacturaPuntoVentasFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentasFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleFacturaPuntoVentasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleFacturaPuntoVentasFK_IdUnidad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentasFK_IdUnidad(sFinalQuery,this.pagination,id_unidad);
				
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
	
	public void inicializarPermisosDetalleFacturaPuntoVenta() {
		this.isPermisoTodoDetalleFacturaPuntoVenta=false;
		this.isPermisoNuevoDetalleFacturaPuntoVenta=false;
		this.isPermisoActualizarDetalleFacturaPuntoVenta=false;
		this.isPermisoActualizarOriginalDetalleFacturaPuntoVenta=false;
		this.isPermisoEliminarDetalleFacturaPuntoVenta=false;
		this.isPermisoGuardarCambiosDetalleFacturaPuntoVenta=false;
		this.isPermisoConsultaDetalleFacturaPuntoVenta=false;
		this.isPermisoBusquedaDetalleFacturaPuntoVenta=false;
		this.isPermisoReporteDetalleFacturaPuntoVenta=false;		
		this.isPermisoOrdenDetalleFacturaPuntoVenta=false;		
		this.isPermisoPaginacionMedioDetalleFacturaPuntoVenta=false;		
		this.isPermisoPaginacionAltoDetalleFacturaPuntoVenta=false;
		this.isPermisoPaginacionTodoDetalleFacturaPuntoVenta=false;
		this.isPermisoCopiarDetalleFacturaPuntoVenta=false;		
		this.isPermisoVerFormDetalleFacturaPuntoVenta=false;		
		this.isPermisoDuplicarDetalleFacturaPuntoVenta=false;		
		this.isPermisoOrdenDetalleFacturaPuntoVenta=false;		
	}
	
	public void setPermisosUsuarioDetalleFacturaPuntoVenta(Boolean isPermiso) {
		this.isPermisoTodoDetalleFacturaPuntoVenta=isPermiso;
		this.isPermisoNuevoDetalleFacturaPuntoVenta=isPermiso;
		this.isPermisoActualizarDetalleFacturaPuntoVenta=isPermiso;
		this.isPermisoActualizarOriginalDetalleFacturaPuntoVenta=isPermiso;
		this.isPermisoEliminarDetalleFacturaPuntoVenta=isPermiso;
		this.isPermisoGuardarCambiosDetalleFacturaPuntoVenta=isPermiso;
		this.isPermisoConsultaDetalleFacturaPuntoVenta=isPermiso;
		this.isPermisoBusquedaDetalleFacturaPuntoVenta=isPermiso;
		this.isPermisoReporteDetalleFacturaPuntoVenta=isPermiso;
		this.isPermisoOrdenDetalleFacturaPuntoVenta=isPermiso;		
		this.isPermisoPaginacionMedioDetalleFacturaPuntoVenta=isPermiso;		
		this.isPermisoPaginacionAltoDetalleFacturaPuntoVenta=isPermiso;		
		this.isPermisoPaginacionTodoDetalleFacturaPuntoVenta=isPermiso;		
		this.isPermisoCopiarDetalleFacturaPuntoVenta=isPermiso;		
		this.isPermisoVerFormDetalleFacturaPuntoVenta=isPermiso;		
		this.isPermisoDuplicarDetalleFacturaPuntoVenta=isPermiso;
		this.isPermisoOrdenDetalleFacturaPuntoVenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleFacturaPuntoVenta(Boolean isPermiso) {
		//this.isPermisoTodoDetalleFacturaPuntoVenta=isPermiso;
		this.isPermisoNuevoDetalleFacturaPuntoVenta=isPermiso;
		this.isPermisoActualizarDetalleFacturaPuntoVenta=isPermiso;
		this.isPermisoActualizarOriginalDetalleFacturaPuntoVenta=isPermiso;
		this.isPermisoEliminarDetalleFacturaPuntoVenta=isPermiso;
		this.isPermisoGuardarCambiosDetalleFacturaPuntoVenta=isPermiso;
		//this.isPermisoConsultaDetalleFacturaPuntoVenta=isPermiso;
		//this.isPermisoBusquedaDetalleFacturaPuntoVenta=isPermiso;
		//this.isPermisoReporteDetalleFacturaPuntoVenta=isPermiso;
		//this.isPermisoOrdenDetalleFacturaPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleFacturaPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleFacturaPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleFacturaPuntoVenta=isPermiso;		
		//this.isPermisoCopiarDetalleFacturaPuntoVenta=isPermiso;		
		//this.isPermisoDuplicarDetalleFacturaPuntoVenta=isPermiso;
		//this.isPermisoOrdenDetalleFacturaPuntoVenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleFacturaPuntoVentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetalleFacturaPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleFacturaPuntoVenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleFacturaPuntoVentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleFacturaPuntoVentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleFacturaPuntoVentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleFacturaPuntoVentaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetalleFacturaPuntoVenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleFacturaPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleFacturaPuntoVentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleFacturaPuntoVenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleFacturaPuntoVenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleFacturaPuntoVenta=this.isPermisoActualizarDetalleFacturaPuntoVenta;
			this.isPermisoEliminarDetalleFacturaPuntoVenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleFacturaPuntoVenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleFacturaPuntoVenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleFacturaPuntoVenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleFacturaPuntoVenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleFacturaPuntoVenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleFacturaPuntoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleFacturaPuntoVenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleFacturaPuntoVenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleFacturaPuntoVenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleFacturaPuntoVenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleFacturaPuntoVenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleFacturaPuntoVenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleFacturaPuntoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleFacturaPuntoVenta.setToolTipText(this.jTableDatosDetalleFacturaPuntoVenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleFacturaPuntoVenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleFacturaPuntoVenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleFacturaPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetalleFacturaPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetalleFacturaPuntoVenta() throws Exception {
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
	public void inicializarCombosForeignKeyDetalleFacturaPuntoVentaListas()throws Exception {
		try	{						
			
				this.facturapuntoventasForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleFacturaPuntoVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleFacturaPuntoVentaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetalleFacturaPuntoVentaListas(false);
			} else {
			
				this.cargarCombosForeignKeyFacturaPuntoVentaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyFacturaPuntoVentaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.facturapuntoventasForeignKey==null||this.facturapuntoventasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FacturaPuntoVentaConstantesFunciones.getArrayColumnasGlobalesFacturaPuntoVenta(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaPuntoVentaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FacturaPuntoVentaConstantesFunciones.SFINALQUERY;

				this.cargarCombosFacturaPuntoVentasForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyDetalleFacturaPuntoVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetalleFacturaPuntoVentaParameterReturnGeneral detallefacturapuntoventaReturnGeneral=new DetalleFacturaPuntoVentaParameterReturnGeneral();
						
			


				String finalQueryGlobalFacturaPuntoVenta="";

				if(((this.facturapuntoventasForeignKey==null||this.facturapuntoventasForeignKey.size()<=0) && this.detallefacturapuntoventaConstantesFunciones.cargarid_factura_punto_ventaDetalleFacturaPuntoVenta)
					 || (this.esRecargarFks && this.detallefacturapuntoventaConstantesFunciones.cargarid_factura_punto_ventaDetalleFacturaPuntoVenta)) {

					if(!this.detallefacturapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionFacturaPuntoVenta()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FacturaPuntoVentaConstantesFunciones.getArrayColumnasGlobalesFacturaPuntoVenta(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFacturaPuntoVenta=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaPuntoVentaConstantesFunciones.TABLENAME);

						finalQueryGlobalFacturaPuntoVenta=Funciones.GetFinalQueryAppend(finalQueryGlobalFacturaPuntoVenta, "");
						finalQueryGlobalFacturaPuntoVenta+=FacturaPuntoVentaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFacturaPuntoVentasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFacturaPuntoVenta=" WHERE " + ConstantesSql.ID + "="+detallefacturapuntoventaSessionBean.getlidFacturaPuntoVentaActual();
					}
				} else {
					finalQueryGlobalFacturaPuntoVenta="NONE";
				}


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detallefacturapuntoventaConstantesFunciones.cargarid_empresaDetalleFacturaPuntoVenta)
					 || (this.esRecargarFks && this.detallefacturapuntoventaConstantesFunciones.cargarid_empresaDetalleFacturaPuntoVenta)) {

					if(!this.detallefacturapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detallefacturapuntoventaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.detallefacturapuntoventaConstantesFunciones.cargarid_sucursalDetalleFacturaPuntoVenta)
					 || (this.esRecargarFks && this.detallefacturapuntoventaConstantesFunciones.cargarid_sucursalDetalleFacturaPuntoVenta)) {

					if(!this.detallefacturapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+detallefacturapuntoventaSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.detallefacturapuntoventaConstantesFunciones.cargarid_bodegaDetalleFacturaPuntoVenta)
					 || (this.esRecargarFks && this.detallefacturapuntoventaConstantesFunciones.cargarid_bodegaDetalleFacturaPuntoVenta)) {

					if(!this.detallefacturapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+detallefacturapuntoventaSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(cargarCombosDependencia && ((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.detallefacturapuntoventaConstantesFunciones.cargarid_productoDetalleFacturaPuntoVenta)
					 || (this.esRecargarFks && this.detallefacturapuntoventaConstantesFunciones.cargarid_productoDetalleFacturaPuntoVenta)) {

					if(!this.detallefacturapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+detallefacturapuntoventaSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(cargarCombosDependencia && ((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.detallefacturapuntoventaConstantesFunciones.cargarid_unidadDetalleFacturaPuntoVenta)
					 || (this.esRecargarFks && this.detallefacturapuntoventaConstantesFunciones.cargarid_unidadDetalleFacturaPuntoVenta)) {

					if(!this.detallefacturapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+detallefacturapuntoventaSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detallefacturapuntoventaReturnGeneral=detallefacturapuntoventaLogic.cargarCombosLoteForeignKeyDetalleFacturaPuntoVenta(finalQueryGlobalFacturaPuntoVenta,finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalUnidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalFacturaPuntoVenta.equals("NONE")) {
				this.facturapuntoventasForeignKey=detallefacturapuntoventaReturnGeneral.getfacturapuntoventasForeignKey();
			}

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detallefacturapuntoventaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=detallefacturapuntoventaReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=detallefacturapuntoventaReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=detallefacturapuntoventaReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=detallefacturapuntoventaReturnGeneral.getunidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetalleFacturaPuntoVenta()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyFacturaPuntoVenta();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyUnidad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyFacturaPuntoVenta()throws Exception {
		try {
			if(this.detallefacturapuntoventaSessionBean==null) {
				this.detallefacturapuntoventaSessionBean=new DetalleFacturaPuntoVentaSessionBean();
			}

			if(!this.detallefacturapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionFacturaPuntoVenta()) {
				FacturaPuntoVenta facturapuntoventa=new FacturaPuntoVenta();
				FacturaPuntoVentaConstantesFunciones.setFacturaPuntoVentaDescripcion(facturapuntoventa,Constantes.SMENSAJE_ESCOJA_OPCION);
				facturapuntoventa.setId(null);

				if(!FacturaPuntoVentaConstantesFunciones.ExisteEnLista(this.facturapuntoventasForeignKey,facturapuntoventa,true)) {

					this.facturapuntoventasForeignKey.add(0,facturapuntoventa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.detallefacturapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.detallefacturapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.detallefacturapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.detallefacturapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

			if(!this.detallefacturapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
	
	public void initActionsCombosTodosForeignKeyDetalleFacturaPuntoVenta()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyBodega("Todos");
			this.initActionsCombosForeignKeyProducto("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleFacturaPuntoVenta(String sFormularioTipoBusqueda)throws Exception {
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
			sFinalQueryCombo=InventarioSql.GetQueryUnidadFromBodegaYProducto(productoLocal,this.detallefacturapuntoventa.getid_bodega());

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
					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
						this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta.addItemListener(new ComboBoxItemListener(this,"id_bodegaDetalleFacturaPuntoVenta"));
						this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaDetalleFacturaPuntoVenta"));
					}
				} else {
					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
						this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta.addActionListener(new ComboBoxActionListener(this,"id_bodegaDetalleFacturaPuntoVenta"));
						this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaDetalleFacturaPuntoVenta"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta"));

						this.jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta"));

					} else {
						this.jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta"));

						this.jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta"));

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
					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
						this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta.addItemListener(new ComboBoxItemListener(this,"id_productoDetalleFacturaPuntoVenta"));
						this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta.addFocusListener(new ComboBoxFocusListener(this,"id_productoDetalleFacturaPuntoVenta"));
					}
				} else {
					if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
						this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta.addActionListener(new ComboBoxActionListener(this,"id_productoDetalleFacturaPuntoVenta"));
						this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta.addFocusListener(new ComboBoxFocusListener(this,"id_productoDetalleFacturaPuntoVenta"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta"));

						this.jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta"));

					} else {
						this.jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta"));

						this.jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyDetalleFacturaPuntoVenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleFacturaPuntoVenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleFacturaPuntoVenta(DetalleFacturaPuntoVenta detallefacturapuntoventa)throws Exception {	
		try {
			
			this.setActualFacturaPuntoVentaForeignKey(detallefacturapuntoventa.getid_factura_punto_venta(),false,"Formulario");
			this.setActualBodegaForeignKey(detallefacturapuntoventa.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(detallefacturapuntoventa.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(detallefacturapuntoventa.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleFacturaPuntoVenta(DetalleFacturaPuntoVenta detallefacturapuntoventa,String sTipoEvento)throws Exception {	
		try {
			
			

				if(detallefacturapuntoventa.getProducto()!=null && !sTipoEvento.equals("id_productoDetalleFacturaPuntoVenta")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(detallefacturapuntoventa.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleFacturaPuntoVenta()throws Exception {	
		try {
			
			this.setActualFacturaPuntoVentaForeignKey(this.detallefacturapuntoventaConstantesFunciones.getid_factura_punto_venta(),false,"Formulario");
			this.setActualBodegaForeignKey(this.detallefacturapuntoventaConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.detallefacturapuntoventaConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(this.detallefacturapuntoventaConstantesFunciones.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleFacturaPuntoVenta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleFacturaPuntoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleFacturaPuntoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleFacturaPuntoVenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleFacturaPuntoVenta()throws Exception {
		try {
			

			this.cargarCombosFrameFacturaPuntoVentasForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleFacturaPuntoVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameFacturaPuntoVentasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleFacturaPuntoVenta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_empresaDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_empresaDetalleFacturaPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_empresaDetalleFacturaPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_sucursalDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_sucursalDetalleFacturaPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_sucursalDetalleFacturaPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_unidadDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_unidadDetalleFacturaPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_unidadDetalleFacturaPuntoVenta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	







	public void recargarFormDetalleFacturaPuntoVentaBodega(JComboBox<?> jComboBoxGenericoBodega,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormDetalleFacturaPuntoVentaid_producto(jComboBoxGenericoBodega,sFormularioTipoBusqueda,"Bodega",false);
	}

	public void recargarFormDetalleFacturaPuntoVentaProducto(JComboBox<?> jComboBoxGenericoProducto,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormDetalleFacturaPuntoVentaid_unidad(jComboBoxGenericoProducto,sFormularioTipoBusqueda,"Producto",false);
	}


	
	



	public void recargarFormDetalleFacturaPuntoVentaid_producto(JComboBox<?> jComboBoxGenericoProducto,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Bodega")){
				this.setActualParaGuardarBodegaForeignKey(this.detallefacturapuntoventa,jComboBoxGenericoProducto);
			}

			if(this.detallefacturapuntoventa.getid_bodega()!=null && this.detallefacturapuntoventa.getid_bodega()!=0L) {
				sFinalQuery+="  WHERE  id_bodega="+this.detallefacturapuntoventa.getid_bodega();
			} else {
				sFinalQuery+="  WHERE  id_bodega=-1";
			}



			//BUCLE RECURSIVO
			this.setActualProductoForeignKey(this.detallefacturapuntoventa.getid_bodega(),true,sFormularioTipoBusqueda);

			this.cargarCombosProductosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormDetalleFacturaPuntoVentaid_unidad(JComboBox<?> jComboBoxGenericoUnidad,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Producto")){
				this.setActualParaGuardarProductoForeignKey(this.detallefacturapuntoventa,jComboBoxGenericoUnidad);
			}

			if(this.detallefacturapuntoventa.getid_producto()!=null && this.detallefacturapuntoventa.getid_producto()!=0L) {
				sFinalQuery+="  WHERE  id_producto="+this.detallefacturapuntoventa.getid_producto();
			} else {
				sFinalQuery+="  WHERE  id_producto=-1";
			}



			//BUCLE RECURSIVO
			this.setActualUnidadForeignKey(this.detallefacturapuntoventa.getid_producto(),true,sFormularioTipoBusqueda);

			this.cargarCombosUnidadsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public DetalleFacturaPuntoVentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleFacturaPuntoVentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleFacturaPuntoVentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detallefacturapuntoventaSessionBean=new DetalleFacturaPuntoVentaSessionBean(); 
		this.detallefacturapuntoventaConstantesFunciones=new DetalleFacturaPuntoVentaConstantesFunciones(); 
		this.detallefacturapuntoventaBean=new DetalleFacturaPuntoVenta();//(this.detallefacturapuntoventaConstantesFunciones); 		
		this.detallefacturapuntoventaReturnGeneral=new DetalleFacturaPuntoVentaParameterReturnGeneral(); 
		
		this.detallefacturapuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallefacturapuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleFacturaPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleFacturaPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleFacturaPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleFacturaPuntoVenta(true);
			
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
			
			this.detallefacturapuntoventaConstantesFunciones=new DetalleFacturaPuntoVentaConstantesFunciones(); 
			this.detallefacturapuntoventaBean=new DetalleFacturaPuntoVenta();//this.detallefacturapuntoventaConstantesFunciones); 			
			this.detallefacturapuntoventaReturnGeneral=new DetalleFacturaPuntoVentaParameterReturnGeneral(); 
		
			DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Factura Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.detallefacturapuntoventa=new DetalleFacturaPuntoVenta();
			this.detallefacturapuntoventas = new ArrayList<DetalleFacturaPuntoVenta>();
			this.detallefacturapuntoventasAux = new ArrayList<DetalleFacturaPuntoVenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic=new DetalleFacturaPuntoVentaLogic();
				this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.detallefacturapuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detallefacturapuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta);	
					}
					
					if(this.jInternalFrameImportacionDetalleFacturaPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleFacturaPuntoVenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleFacturaPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleFacturaPuntoVenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta);
				this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.setVisible(false);
				this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta);
					this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleFacturaPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleFacturaPuntoVenta);
					this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setVisible(false);
					this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleFacturaPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleFacturaPuntoVenta);
					this.jInternalFrameOrderByDetalleFacturaPuntoVenta.setVisible(false);
					this.jInternalFrameOrderByDetalleFacturaPuntoVenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleFacturaPuntoVentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleFacturaPuntoVentaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detallefacturapuntoventaReturnGeneral=new DetalleFacturaPuntoVentaParameterReturnGeneral();
			
			this.detallefacturapuntoventaParameterGeneral=new DetalleFacturaPuntoVentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detallefacturapuntoventaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetalleFacturaPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleFacturaPuntoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado(),this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleFacturaPuntoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado(),this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaDuplicarDetalleFacturaPuntoVenta=true;
			this.isVisibilidadCeldaCopiarDetalleFacturaPuntoVenta=true;
			this.isVisibilidadCeldaVerFormDetalleFacturaPuntoVenta=true;
			this.isVisibilidadCeldaOrdenDetalleFacturaPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaModificarDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFacturaPuntoVenta=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdUnidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleFacturaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleFacturaPuntoVenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleFacturaPuntoVenta(false);
			
			this.setPermisosUsuarioDetalleFacturaPuntoVenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() 
				|| (this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado() && this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleFacturaPuntoVentaClasesRelacionadas();
			}
			
			if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleFacturaPuntoVentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleFacturaPuntoVenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleFacturaPuntoVenta();
			}
			
			if(!this.isPermisoBusquedaDetalleFacturaPuntoVenta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetalleFacturaPuntoVenta,this.isPermisoPaginacionMedioDetalleFacturaPuntoVenta,this.isPermisoPaginacionTodoDetalleFacturaPuntoVenta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleFacturaPuntoVentaConstantesFunciones.getTiposSeleccionarDetalleFacturaPuntoVenta());
				
				this.tiposColumnasSelect=DetalleFacturaPuntoVentaConstantesFunciones.getTiposSeleccionarDetalleFacturaPuntoVenta(true);
				
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
			//if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleFacturaPuntoVenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioDetalleFacturaPuntoVenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioDetalleFacturaPuntoVenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleFacturaPuntoVenta() ;
			
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
			
			this.facturapuntoventaLogic=new FacturaPuntoVentaLogic();
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
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
				detallefacturapuntoventaImplementable= (DetalleFacturaPuntoVentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleFacturaPuntoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detallefacturapuntoventaImplementableHome= (DetalleFacturaPuntoVentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleFacturaPuntoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detallefacturapuntoventas= new ArrayList<DetalleFacturaPuntoVenta>();
			this.detallefacturapuntoventasEliminados= new ArrayList<DetalleFacturaPuntoVenta>();
						
			this.isEsNuevoDetalleFacturaPuntoVenta=false;
			this.esParaAccionDesdeFormularioDetalleFacturaPuntoVenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.facturapuntoventasForeignKey=new ArrayList<FacturaPuntoVenta>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleFacturaPuntoVenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleFacturaPuntoVenta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleFacturaPuntoVentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleFacturaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleFacturaPuntoVenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleFacturaPuntoVenta();
			}
			
			DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleFacturaPuntoVenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleFacturaPuntoVenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleFacturaPuntoVenta() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleFacturaPuntoVenta")) {
				iIndex=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTabbedPaneRelacionesDetalleFacturaPuntoVenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTabbedPaneRelacionesDetalleFacturaPuntoVenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleFacturaPuntoVenta();	
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
	
	public void cargarCombosForeignKeyDetalleFacturaPuntoVenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleFacturaPuntoVenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleFacturaPuntoVenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleFacturaPuntoVentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleFacturaPuntoVenta();
		
		this.cargarCombosFrameForeignKeyDetalleFacturaPuntoVenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleFacturaPuntoVenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleFacturaPuntoVenta();
		}
	}
	
	

	public void cargarCombosForeignKeyFacturaPuntoVenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFacturaPuntoVentaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFacturaPuntoVenta();
				this.cargarCombosFrameFacturaPuntoVentasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFacturaPuntoVenta(this.facturapuntoventasForeignKey);

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
	
	public void jButtonNuevoDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
			
			
			if(jTableDatosDetalleFacturaPuntoVenta.getRowCount()>=1) {
				jTableDatosDetalleFacturaPuntoVenta.removeRowSelectionInterval(0, jTableDatosDetalleFacturaPuntoVenta.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleFacturaPuntoVenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleFacturaPuntoVenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleFacturaPuntoVenta(true);			
			//this.detallefacturapuntoventa=new DetalleFacturaPuntoVenta();
			//this.detallefacturapuntoventa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleFacturaPuntoVenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleFacturaPuntoVenta() ;
			
			if(DetalleFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleFacturaPuntoVenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detallefacturapuntoventa);	
			this.actualizarInformacion("INFO_PADRE",false,this.detallefacturapuntoventa);				
			
			DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
			
			if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleFacturaPuntoVenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleFacturaPuntoVenta> detallefacturapuntoventasSeleccionados=new ArrayList<DetalleFacturaPuntoVenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRows().length;			
			}
			
			detallefacturapuntoventasSeleccionados=this.getDetalleFacturaPuntoVentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleFacturaPuntoVenta--;			
				//DetalleFacturaPuntoVenta detallefacturapuntoventaAux= new DetalleFacturaPuntoVenta();			
				//detallefacturapuntoventaAux.setId(this.iIdNuevoDetalleFacturaPuntoVenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleFacturaPuntoVenta detallefacturapuntoventaOrigen=new DetalleFacturaPuntoVenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleFacturaPuntoVenta detallefacturapuntoventaOrigen : detallefacturapuntoventasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detallefacturapuntoventaOrigen =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallefacturapuntoventaOrigen =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleFacturaPuntoVenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detallefacturapuntoventa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleFacturaPuntoVenta(detallefacturapuntoventaOrigen,this.detallefacturapuntoventa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().add(this.detallefacturapuntoventaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallefacturapuntoventas.add(this.detallefacturapuntoventaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleFacturaPuntoVenta(false);
				
				this.jTableDatosDetalleFacturaPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoDetalleFacturaPuntoVenta(), this.getIndiceNuevoDetalleFacturaPuntoVenta());
				
				int iLastRow =  this.jTableDatosDetalleFacturaPuntoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleFacturaPuntoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleFacturaPuntoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleFacturaPuntoVenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleFacturaPuntoVenta> detallefacturapuntoventasSeleccionados=new ArrayList<DetalleFacturaPuntoVenta>();									
		
			DetalleFacturaPuntoVenta detallefacturapuntoventaOrigen=new DetalleFacturaPuntoVenta();
			DetalleFacturaPuntoVenta detallefacturapuntoventaDestino=new DetalleFacturaPuntoVenta();
				
			detallefacturapuntoventasSeleccionados=this.getDetalleFacturaPuntoVentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detallefacturapuntoventasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallefacturapuntoventaOrigen =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallefacturapuntoventaOrigen =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallefacturapuntoventaDestino =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallefacturapuntoventaDestino =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detallefacturapuntoventaOrigen =detallefacturapuntoventasSeleccionados.get(0);
				detallefacturapuntoventaDestino =detallefacturapuntoventasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleFacturaPuntoVenta(detallefacturapuntoventaOrigen,detallefacturapuntoventaDestino,true,false);
				
				detallefacturapuntoventaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallefacturapuntoventaDestino,detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallefacturapuntoventaDestino,detallefacturapuntoventas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleFacturaPuntoVenta(false);
				
				//this.jTableDatosDetalleFacturaPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoDetalleFacturaPuntoVenta(), this.getIndiceNuevoDetalleFacturaPuntoVenta());
				
				int iLastRow =  this.jTableDatosDetalleFacturaPuntoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleFacturaPuntoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleFacturaPuntoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleFacturaPuntoVenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleFacturaPuntoVenta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleFacturaPuntoVenta.setVisible(!isVisible);
			this.jPanelPaginacionDetalleFacturaPuntoVenta.setVisible(!isVisible);
			this.jPanelAccionesDetalleFacturaPuntoVenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleFacturaPuntoVenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleFacturaPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleFacturaPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleFacturaPuntoVenta();
			
			this.abrirFrameOrderByDetalleFacturaPuntoVenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleFacturaPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleFacturaPuntoVenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleFacturaPuntoVenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.setSize(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.iWidthFormulario,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jContentPaneDetalleDetalleFacturaPuntoVenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTabbedPaneRelacionesDetalleFacturaPuntoVenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jContentPaneDetalleDetalleFacturaPuntoVenta.getWidth(),DetalleFacturaPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTabbedPaneRelacionesDetalleFacturaPuntoVenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jContentPaneDetalleDetalleFacturaPuntoVenta.getWidth(),DetalleFacturaPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTabbedPaneRelacionesDetalleFacturaPuntoVenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jContentPaneDetalleDetalleFacturaPuntoVenta.getWidth(),DetalleFacturaPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleFacturaPuntoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleFacturaPuntoVenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleFacturaPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleFacturaPuntoVenta,false,this);
				} else {
					this.jInternalFrameOrderByDetalleFacturaPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleFacturaPuntoVenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleFacturaPuntoVenta);
				this.jInternalFrameOrderByDetalleFacturaPuntoVenta.setVisible(false);
				this.jInternalFrameOrderByDetalleFacturaPuntoVenta.setSelected(false);
				
				this.jInternalFrameOrderByDetalleFacturaPuntoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleFacturaPuntoVenta"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleFacturaPuntoVenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleFacturaPuntoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleFacturaPuntoVenta==null) {
				
				this.jInternalFrameImportacionDetalleFacturaPuntoVenta=new ImportacionJInternalFrame(DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleFacturaPuntoVenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleFacturaPuntoVenta);
				this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setVisible(false);
				this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setSelected(false);


				this.jInternalFrameImportacionDetalleFacturaPuntoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleFacturaPuntoVenta"));
				this.jInternalFrameImportacionDetalleFacturaPuntoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleFacturaPuntoVenta"));
				this.jInternalFrameImportacionDetalleFacturaPuntoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleFacturaPuntoVenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleFacturaPuntoVenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta==null) {
				this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta=new ReporteDinamicoJInternalFrame(DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta);
				this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleFacturaPuntoVenta"));
				this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleFacturaPuntoVenta"));
				this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleFacturaPuntoVenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleFacturaPuntoVenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetalleFacturaPuntoVenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleFacturaPuntoVenta);
			
	       	this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.dispose();
			//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleFacturaPuntoVenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleFacturaPuntoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setVisible(true);
	        this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetalleFacturaPuntoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleFacturaPuntoVenta.setVisible(true);
	        this.jInternalFrameOrderByDetalleFacturaPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleFacturaPuntoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleFacturaPuntoVenta.setVisible(false);
	        this.jInternalFrameOrderByDetalleFacturaPuntoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleFacturaPuntoVenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleFacturaPuntoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setVisible(false);
	        this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleFacturaPuntoVenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleFacturaPuntoVenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleFacturaPuntoVenta(true);
			//this.isEsNuevoDetalleFacturaPuntoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleFacturaPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleFacturaPuntoVenta(false) ;
			
			if(detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetalleFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleFacturaPuntoVenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleFacturaPuntoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleFacturaPuntoVentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleFacturaPuntoVenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleFacturaPuntoVenta(true);
			//this.isEsNuevoDetalleFacturaPuntoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detallefacturapuntoventa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleFacturaPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleFacturaPuntoVenta(false) ;
			
			if(DetalleFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleFacturaPuntoVenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleFacturaPuntoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.detallefacturapuntoventaConstantesFunciones.cargarid_productoDetalleFacturaPuntoVenta) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaFacturaPuntoVenta(List<FacturaPuntoVenta> facturapuntoventasForeignKey)throws Exception{
		TableColumn tableColumnFacturaPuntoVenta=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA));
		TableCellEditor tableCellEditorFacturaPuntoVenta =tableColumnFacturaPuntoVenta.getCellEditor();

		FacturaPuntoVentaTableCell facturapuntoventaTableCellFk=(FacturaPuntoVentaTableCell)tableCellEditorFacturaPuntoVenta;

		if(facturapuntoventaTableCellFk!=null) {
			facturapuntoventaTableCellFk.setfacturapuntoventasForeignKey(facturapuntoventasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//facturapuntoventaTableCellFk.setRowActual(intSelectedRow);
			//facturapuntoventaTableCellFk.setfacturapuntoventasForeignKeyActual(facturapuntoventasForeignKey);
		//}


		if(facturapuntoventaTableCellFk!=null) {
			facturapuntoventaTableCellFk.RecargarFacturaPuntoVentasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

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
		TableColumn tableColumnUnidad=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

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
	
	public void jButtonActualizarDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleFacturaPuntoVenta(false);
			
			//if(!this.isEsNuevoDetalleFacturaPuntoVenta) {								
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				
			}
			
			if(this.permiteMantenimiento(this.detallefacturapuntoventa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleFacturaPuntoVenta=true;
					this.inicializarActualizarBindingTablaDetalleFacturaPuntoVenta(false);
					this.isEsNuevoDetalleFacturaPuntoVenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleFacturaPuntoVenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleFacturaPuntoVenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleFacturaPuntoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleFacturaPuntoVenta(false);
				
				this.habilitarDeshabilitarControlesDetalleFacturaPuntoVenta(false);
			
												
				
				if(DetalleFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleFacturaPuntoVenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleFacturaPuntoVentaActionPerformed(evt,detallefacturapuntoventaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleFacturaPuntoVenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detallefacturapuntoventaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detallefacturapuntoventa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleFacturaPuntoVenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturaPuntoVenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				this.detallefacturapuntoventa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				this.detallefacturapuntoventa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detallefacturapuntoventa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleFacturaPuntoVentaModel) this.jTableDatosDetalleFacturaPuntoVenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleFacturaPuntoVenta=true;
				this.inicializarActualizarBindingTablaDetalleFacturaPuntoVenta(false);
				this.isEsNuevoDetalleFacturaPuntoVenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleFacturaPuntoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleFacturaPuntoVenta(false);
				
				this.habilitarDeshabilitarControlesDetalleFacturaPuntoVenta(false);
				
				
				
				if(DetalleFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleFacturaPuntoVenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleFacturaPuntoVenta.getRowCount()>=1) {
				jTableDatosDetalleFacturaPuntoVenta.removeRowSelectionInterval(0, jTableDatosDetalleFacturaPuntoVenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleFacturaPuntoVenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleFacturaPuntoVenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleFacturaPuntoVenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleFacturaPuntoVenta(false) ;
			
			this.isEsNuevoDetalleFacturaPuntoVenta=false;
			
			if(DetalleFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleFacturaPuntoVenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
				
				//SI ES MANUAL
				if(DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleFacturaPuntoVenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleFacturaPuntoVenta--;			
			//DetalleFacturaPuntoVenta detallefacturapuntoventaAux= new DetalleFacturaPuntoVenta();			
			//detallefacturapuntoventaAux.setId(this.iIdNuevoDetalleFacturaPuntoVenta);
			
			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleFacturaPuntoVenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
			
			this.detallefacturapuntoventa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().add(this.detallefacturapuntoventaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detallefacturapuntoventas.add(this.detallefacturapuntoventaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleFacturaPuntoVenta(false);
			
			this.jTableDatosDetalleFacturaPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoDetalleFacturaPuntoVenta(), this.getIndiceNuevoDetalleFacturaPuntoVenta());
			
			int iLastRow =  this.jTableDatosDetalleFacturaPuntoVenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleFacturaPuntoVenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleFacturaPuntoVenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleFacturaPuntoVenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
			
			//SI ES MANUAL
			if(DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleFacturaPuntoVenta();
			}
			
			//this.abrirFrameTreeDetalleFacturaPuntoVenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle FacturaS ?", "MANTENIMIENTO DE Detalle Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetalleFacturaPuntoVenta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetalleFacturaPuntoVenta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detallefacturapuntoventaReturnGeneral=detallefacturapuntoventaLogic.procesarImportacionDetalleFacturaPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detallefacturapuntoventaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetalleFacturaPuntoVentaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleFacturaPuntoVenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setFileImportacion(this.jInternalFrameImportacionDetalleFacturaPuntoVenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleFacturaPuntoVenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleFacturaPuntoVenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleFacturaPuntoVenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleFacturaPuntoVenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleFacturaPuntoVenta> detallefacturapuntoventasSeleccionados=new ArrayList<DetalleFacturaPuntoVenta>();		

		detallefacturapuntoventasSeleccionados=this.getDetalleFacturaPuntoVentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleFacturaPuntoVentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleFacturaPuntoVentaBaseDesign.jrxml";
			
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
			
			this.generarReporteDetalleFacturaPuntoVentas("Todos",detallefacturapuntoventasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Factura",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_FacturaPuntoVenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_FacturaPuntoVenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_FacturaPuntoVenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_FacturaPuntoVenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SERIE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rie_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rie_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rie_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rie_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuentoValor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuentoValor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuentoValor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuentoValor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVAVALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_aValor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_aValor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_aValor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_aValor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_e_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_e_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_e_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_e_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICEVALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_eValor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_eValor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_eValor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_eValor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SUBTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA:
					sNombreCampoCategoria="id_factura_punto_venta";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SERIE:
					sNombreCampoCategoria="serie";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoria="descuento";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR:
					sNombreCampoCategoria="descuento_valor";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVAVALOR:
					sNombreCampoCategoria="iva_valor";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoria="ice";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICEVALOR:
					sNombreCampoCategoria="ice_valor";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoria="sub_total";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA:
					sNombreCampoCategoriaValor="id_factura_punto_venta";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SERIE:
					sNombreCampoCategoriaValor="serie";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoriaValor="descuento";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR:
					sNombreCampoCategoriaValor="descuento_valor";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVAVALOR:
					sNombreCampoCategoriaValor="iva_valor";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoriaValor="ice";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICEVALOR:
					sNombreCampoCategoriaValor="ice_valor";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoriaValor="sub_total";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_factura_punto_venta");
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SERIE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Serie",sNombreCampoCategoria,sNombreCampoCategoriaValor,"serie");
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento %",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento");
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento_valor");
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva %",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVAVALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva_valor");
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ice %",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ice");
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICEVALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ice",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ice_valor");
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SUBTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sub Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sub_total");
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleFacturaPuntoVenta> detallefacturapuntoventasSeleccionados=new ArrayList<DetalleFacturaPuntoVenta>();		
		
		detallefacturapuntoventasSeleccionados=this.getDetalleFacturaPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallefacturapuntoventa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetalleFacturaPuntoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA);
					iRow++;

					for(DetalleFacturaPuntoVenta detallefacturapuntoventa:detallefacturapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturapuntoventa.getfacturapuntoventa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetalleFacturaPuntoVenta detallefacturapuntoventa:detallefacturapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturapuntoventa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DetalleFacturaPuntoVenta detallefacturapuntoventa:detallefacturapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturapuntoventa.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(DetalleFacturaPuntoVenta detallefacturapuntoventa:detallefacturapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturapuntoventa.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(DetalleFacturaPuntoVenta detallefacturapuntoventa:detallefacturapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturapuntoventa.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(DetalleFacturaPuntoVenta detallefacturapuntoventa:detallefacturapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturapuntoventa.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SERIE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SERIE);
					iRow++;

					for(DetalleFacturaPuntoVenta detallefacturapuntoventa:detallefacturapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturapuntoventa.getserie());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(DetalleFacturaPuntoVenta detallefacturapuntoventa:detallefacturapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturapuntoventa.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(DetalleFacturaPuntoVenta detallefacturapuntoventa:detallefacturapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturapuntoventa.getprecio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTO);
					iRow++;

					for(DetalleFacturaPuntoVenta detallefacturapuntoventa:detallefacturapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturapuntoventa.getdescuento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR);
					iRow++;

					for(DetalleFacturaPuntoVenta detallefacturapuntoventa:detallefacturapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturapuntoventa.getdescuento_valor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVA);
					iRow++;

					for(DetalleFacturaPuntoVenta detallefacturapuntoventa:detallefacturapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturapuntoventa.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVAVALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVAVALOR);
					iRow++;

					for(DetalleFacturaPuntoVenta detallefacturapuntoventa:detallefacturapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturapuntoventa.getiva_valor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICE);
					iRow++;

					for(DetalleFacturaPuntoVenta detallefacturapuntoventa:detallefacturapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturapuntoventa.getice());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICEVALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICEVALOR);
					iRow++;

					for(DetalleFacturaPuntoVenta detallefacturapuntoventa:detallefacturapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturapuntoventa.getice_valor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SUBTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SUBTOTAL);
					iRow++;

					for(DetalleFacturaPuntoVenta detallefacturapuntoventa:detallefacturapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturapuntoventa.getsub_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(DetalleFacturaPuntoVenta detallefacturapuntoventa:detallefacturapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturapuntoventa.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(DetalleFacturaPuntoVenta detallefacturapuntoventa:detallefacturapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturapuntoventa.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelDetalleFacturaPuntoVenta(row);				
			//	iRow++;
			//}				
			
			//for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:detallefacturapuntoventasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleFacturaPuntoVenta(detallefacturapuntoventaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Factura",JOptionPane.INFORMATION_MESSAGE);
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
				this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
			
			//SI ES MANUAL
			if(DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleFacturaPuntoVenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
			
			//SI ES MANUAL
			if(DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleFacturaPuntoVenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
			
			//SI ES MANUAL
			if(DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleFacturaPuntoVenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleFacturaPuntoVenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleFacturaPuntoVenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleFacturaPuntoVenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleFacturaPuntoVenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleFacturaPuntoVenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleFacturaPuntoVenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleFacturaPuntoVenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleFacturaPuntoVenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleFacturaPuntoVenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleFacturaPuntoVenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleFacturaPuntoVenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleFacturaPuntoVenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleFacturaPuntoVenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleFacturaPuntoVenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleFacturaPuntoVenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleFacturaPuntoVenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleFacturaPuntoVenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleFacturaPuntoVenta();
		
		this.inicializarActualizarBindingBotonesManualDetalleFacturaPuntoVenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleFacturaPuntoVenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleFacturaPuntoVenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleFacturaPuntoVenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleFacturaPuntoVenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleFacturaPuntoVenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleFacturaPuntoVenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleFacturaPuntoVenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jCheckBoxPostAccionNuevoDetalleFacturaPuntoVenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jCheckBoxPostAccionSinCerrarDetalleFacturaPuntoVenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jCheckBoxPostAccionSinMensajeDetalleFacturaPuntoVenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleFacturaPuntoVenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleFacturaPuntoVenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleFacturaPuntoVenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
				this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jCheckBoxPostAccionNuevoDetalleFacturaPuntoVenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jCheckBoxPostAccionSinCerrarDetalleFacturaPuntoVenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jCheckBoxPostAccionSinMensajeDetalleFacturaPuntoVenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleFacturaPuntoVenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleFacturaPuntoVenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleFacturaPuntoVenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleFacturaPuntoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleFacturaPuntoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleFacturaPuntoVenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleFacturaPuntoVenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleFacturaPuntoVenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleFacturaPuntoVenta(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleFacturaPuntoVenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleFacturaPuntoVenta() throws Exception {
		try	{
			if(DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleFacturaPuntoVenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleFacturaPuntoVenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleFacturaPuntoVenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleFacturaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleFacturaPuntoVenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleFacturaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleFacturaPuntoVenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleFacturaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleFacturaPuntoVenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleFacturaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleFacturaPuntoVenta.addItem(reporte);
			}
			
			
			if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleFacturaPuntoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleFacturaPuntoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleFacturaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleFacturaPuntoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleFacturaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleFacturaPuntoVenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleFacturaPuntoVenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleFacturaPuntoVenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleFacturaPuntoVenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DetalleFacturaPuntoVentaConstantesFunciones.getTiposSeleccionarDetalleFacturaPuntoVenta(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DetalleFacturaPuntoVentaConstantesFunciones.getTiposSeleccionarDetalleFacturaPuntoVenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DetalleFacturaPuntoVentaConstantesFunciones.getTiposSeleccionarDetalleFacturaPuntoVenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleFacturaPuntoVenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.getSelectedItem()!=null){this.id_factura_punto_ventaFK_IdFacturaPuntoVenta=((FacturaPuntoVenta)this.jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidadFK_IdUnidadDetalleFacturaPuntoVenta.getSelectedItem()!=null){this.id_unidadFK_IdUnidad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadDetalleFacturaPuntoVenta.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleFacturaPuntoVenta(Boolean esInicializar) throws Exception {				
		if(DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleFacturaPuntoVenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleFacturaPuntoVenta() throws Exception {
		this.inicializarActualizarBindingTablaDetalleFacturaPuntoVenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleFacturaPuntoVenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleFacturaPuntoVenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleFacturaPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleFacturaPuntoVenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleFacturaPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleFacturaPuntoVenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleFacturaPuntoVentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleFacturaPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleFacturaPuntoVenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleFacturaPuntoVenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetalleFacturaPuntoVenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detallefacturapuntoventas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleFacturaPuntoVenta.setModel(new DetalleFacturaPuntoVentaModel(this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleFacturaPuntoVenta.setModel(new DetalleFacturaPuntoVentaModel(this.detallefacturapuntoventas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetalleFacturaPuntoVenta!=null && this.jInternalFrameOrderByDetalleFacturaPuntoVenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleFacturaPuntoVenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,detallefacturapuntoventaConstantesFunciones.resaltarSeleccionarDetalleFacturaPuntoVenta,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleFacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,detallefacturapuntoventaConstantesFunciones.resaltarSeleccionarDetalleFacturaPuntoVenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ID));

		if(this.detallefacturapuntoventaConstantesFunciones.mostraridDetalleFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltaridDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activaridDetalleFacturaPuntoVenta,iSizeTabla,this,true,"idDetalleFacturaPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltaridDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activaridDetalleFacturaPuntoVenta,this,true,"idDetalleFacturaPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA));

		if(this.detallefacturapuntoventaConstantesFunciones.mostrarid_factura_punto_ventaDetalleFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FacturaPuntoVentaTableCell(this.facturapuntoventasForeignKey,this.detallefacturapuntoventaConstantesFunciones.resaltarid_factura_punto_ventaDetalleFacturaPuntoVenta,this,this.detallefacturapuntoventaConstantesFunciones.activarid_factura_punto_ventaDetalleFacturaPuntoVenta,iSizeTabla));
			tableColumn.setCellEditor(new FacturaPuntoVentaTableCell(this.facturapuntoventasForeignKey,this.detallefacturapuntoventaConstantesFunciones.resaltarid_factura_punto_ventaDetalleFacturaPuntoVenta,this,this.detallefacturapuntoventaConstantesFunciones.activarid_factura_punto_ventaDetalleFacturaPuntoVenta,true,"id_factura_punto_ventaDetalleFacturaPuntoVenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detallefacturapuntoventaConstantesFunciones.mostrarid_empresaDetalleFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detallefacturapuntoventaConstantesFunciones.resaltarid_empresaDetalleFacturaPuntoVenta,this,this.detallefacturapuntoventaConstantesFunciones.activarid_empresaDetalleFacturaPuntoVenta,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detallefacturapuntoventaConstantesFunciones.resaltarid_empresaDetalleFacturaPuntoVenta,this,this.detallefacturapuntoventaConstantesFunciones.activarid_empresaDetalleFacturaPuntoVenta,false,"id_empresaDetalleFacturaPuntoVenta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.detallefacturapuntoventaConstantesFunciones.mostrarid_sucursalDetalleFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.detallefacturapuntoventaConstantesFunciones.resaltarid_sucursalDetalleFacturaPuntoVenta,this,this.detallefacturapuntoventaConstantesFunciones.activarid_sucursalDetalleFacturaPuntoVenta,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.detallefacturapuntoventaConstantesFunciones.resaltarid_sucursalDetalleFacturaPuntoVenta,this,this.detallefacturapuntoventaConstantesFunciones.activarid_sucursalDetalleFacturaPuntoVenta,false,"id_sucursalDetalleFacturaPuntoVenta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDBODEGA));

		if(this.detallefacturapuntoventaConstantesFunciones.mostrarid_bodegaDetalleFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.detallefacturapuntoventaConstantesFunciones.resaltarid_bodegaDetalleFacturaPuntoVenta,this,this.detallefacturapuntoventaConstantesFunciones.activarid_bodegaDetalleFacturaPuntoVenta,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.detallefacturapuntoventaConstantesFunciones.resaltarid_bodegaDetalleFacturaPuntoVenta,this,this.detallefacturapuntoventaConstantesFunciones.activarid_bodegaDetalleFacturaPuntoVenta,true,"id_bodegaDetalleFacturaPuntoVenta","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.detallefacturapuntoventaConstantesFunciones.mostrarid_productoDetalleFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.detallefacturapuntoventaConstantesFunciones.resaltarid_productoDetalleFacturaPuntoVenta,this,this.detallefacturapuntoventaConstantesFunciones.activarid_productoDetalleFacturaPuntoVenta,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.detallefacturapuntoventaConstantesFunciones.resaltarid_productoDetalleFacturaPuntoVenta,this,this.detallefacturapuntoventaConstantesFunciones.activarid_productoDetalleFacturaPuntoVenta,true,"id_productoDetalleFacturaPuntoVenta","CON_BUSQUEDA-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDUNIDAD));

		if(this.detallefacturapuntoventaConstantesFunciones.mostrarid_unidadDetalleFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.detallefacturapuntoventaConstantesFunciones.resaltarid_unidadDetalleFacturaPuntoVenta,this,this.detallefacturapuntoventaConstantesFunciones.activarid_unidadDetalleFacturaPuntoVenta,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.detallefacturapuntoventaConstantesFunciones.resaltarid_unidadDetalleFacturaPuntoVenta,this,this.detallefacturapuntoventaConstantesFunciones.activarid_unidadDetalleFacturaPuntoVenta,true,"id_unidadDetalleFacturaPuntoVenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SERIE));

		if(this.detallefacturapuntoventaConstantesFunciones.mostrarserieDetalleFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SERIE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltarserieDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activarserieDetalleFacturaPuntoVenta,iSizeTabla,this,true,"serieDetalleFacturaPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltarserieDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activarserieDetalleFacturaPuntoVenta,this,true,"serieDetalleFacturaPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_CANTIDAD));

		if(this.detallefacturapuntoventaConstantesFunciones.mostrarcantidadDetalleFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltarcantidadDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activarcantidadDetalleFacturaPuntoVenta,iSizeTabla,this,true,"cantidadDetalleFacturaPuntoVenta","BASICO-CON_EVENT_CHANGE"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltarcantidadDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activarcantidadDetalleFacturaPuntoVenta,this,true,"cantidadDetalleFacturaPuntoVenta","BASICO-CON_EVENT_CHANGE",true));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_PRECIO));

		if(this.detallefacturapuntoventaConstantesFunciones.mostrarprecioDetalleFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltarprecioDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activarprecioDetalleFacturaPuntoVenta,iSizeTabla,this,true,"precioDetalleFacturaPuntoVenta","BASICO-CON_EVENT_CHANGE"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltarprecioDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activarprecioDetalleFacturaPuntoVenta,this,true,"precioDetalleFacturaPuntoVenta","BASICO-CON_EVENT_CHANGE",true));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTO));

		if(this.detallefacturapuntoventaConstantesFunciones.mostrardescuentoDetalleFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltardescuentoDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activardescuentoDetalleFacturaPuntoVenta,iSizeTabla,this,true,"descuentoDetalleFacturaPuntoVenta","BASICO-CON_EVENT_CHANGE"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltardescuentoDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activardescuentoDetalleFacturaPuntoVenta,this,true,"descuentoDetalleFacturaPuntoVenta","BASICO-CON_EVENT_CHANGE",true));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR));

		if(this.detallefacturapuntoventaConstantesFunciones.mostrardescuento_valorDetalleFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltardescuento_valorDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activardescuento_valorDetalleFacturaPuntoVenta,iSizeTabla,this,true,"descuento_valorDetalleFacturaPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltardescuento_valorDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activardescuento_valorDetalleFacturaPuntoVenta,this,true,"descuento_valorDetalleFacturaPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVA));

		if(this.detallefacturapuntoventaConstantesFunciones.mostrarivaDetalleFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltarivaDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activarivaDetalleFacturaPuntoVenta,iSizeTabla,this,true,"ivaDetalleFacturaPuntoVenta","BASICO-CON_EVENT_CHANGE"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltarivaDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activarivaDetalleFacturaPuntoVenta,this,true,"ivaDetalleFacturaPuntoVenta","BASICO-CON_EVENT_CHANGE",true));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVAVALOR));

		if(this.detallefacturapuntoventaConstantesFunciones.mostrariva_valorDetalleFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVAVALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltariva_valorDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activariva_valorDetalleFacturaPuntoVenta,iSizeTabla,this,true,"iva_valorDetalleFacturaPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltariva_valorDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activariva_valorDetalleFacturaPuntoVenta,this,true,"iva_valorDetalleFacturaPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICE));

		if(this.detallefacturapuntoventaConstantesFunciones.mostrariceDetalleFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltariceDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activariceDetalleFacturaPuntoVenta,iSizeTabla,this,true,"iceDetalleFacturaPuntoVenta","BASICO-CON_EVENT_CHANGE"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltariceDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activariceDetalleFacturaPuntoVenta,this,true,"iceDetalleFacturaPuntoVenta","BASICO-CON_EVENT_CHANGE",true));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICEVALOR));

		if(this.detallefacturapuntoventaConstantesFunciones.mostrarice_valorDetalleFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICEVALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltarice_valorDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activarice_valorDetalleFacturaPuntoVenta,iSizeTabla,this,true,"ice_valorDetalleFacturaPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltarice_valorDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activarice_valorDetalleFacturaPuntoVenta,this,true,"ice_valorDetalleFacturaPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SUBTOTAL));

		if(this.detallefacturapuntoventaConstantesFunciones.mostrarsub_totalDetalleFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SUBTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltarsub_totalDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activarsub_totalDetalleFacturaPuntoVenta,iSizeTabla,this,true,"sub_totalDetalleFacturaPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltarsub_totalDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activarsub_totalDetalleFacturaPuntoVenta,this,true,"sub_totalDetalleFacturaPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_TOTAL));

		if(this.detallefacturapuntoventaConstantesFunciones.mostrartotalDetalleFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltartotalDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activartotalDetalleFacturaPuntoVenta,iSizeTabla,this,true,"totalDetalleFacturaPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltartotalDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activartotalDetalleFacturaPuntoVenta,this,true,"totalDetalleFacturaPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.detallefacturapuntoventaConstantesFunciones.mostrardescripcionDetalleFacturaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltardescripcionDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activardescripcionDetalleFacturaPuntoVenta,iSizeTabla,this,true,"descripcionDetalleFacturaPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallefacturapuntoventaConstantesFunciones.resaltardescripcionDetalleFacturaPuntoVenta,this.detallefacturapuntoventaConstantesFunciones.activardescripcionDetalleFacturaPuntoVenta,this,true,"descripcionDetalleFacturaPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleFacturaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleFacturaPuntoVenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleFacturaPuntoVenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleFacturaPuntoVenta && this.isPermisoGuardarCambiosDetalleFacturaPuntoVenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleFacturaPuntoVenta.addColumn(tableColumn);
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
			
			this.jTableDatosDetalleFacturaPuntoVenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleFacturaPuntoVenta && this.isPermisoGuardarCambiosDetalleFacturaPuntoVenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleFacturaPuntoVenta && this.isPermisoGuardarCambiosDetalleFacturaPuntoVenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleFacturaPuntoVenta.moveColumn(this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleFacturaPuntoVenta.moveColumn(this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleFacturaPuntoVenta.moveColumn(this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleFacturaPuntoVenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleFacturaPuntoVenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleFacturaPuntoVenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleFacturaPuntoVenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleFacturaPuntoVenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleFacturaPuntoVenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detallefacturapuntoventas.size()-1;
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
		//this.jTableDatosDetalleFacturaPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleFacturaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleFacturaPuntoVenta();
			
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
				
				//this.isEsNuevoDetalleFacturaPuntoVenta=false;
					
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
			
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleFacturaPuntoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detallefacturapuntoventa.getsType().equals("DUPLICADO")
				   || this.detallefacturapuntoventa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleFacturaPuntoVenta=true;
				
				} else {
					this.isEsNuevoDetalleFacturaPuntoVenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
					if(this.detallefacturapuntoventa.getId()>=0 && !this.detallefacturapuntoventa.getIsNew()) {						
						this.isEsNuevoDetalleFacturaPuntoVenta=false;
						
					} else {
						this.isEsNuevoDetalleFacturaPuntoVenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleFacturaPuntoVenta(esRelaciones);						
				
				this.seleccionarDetalleFacturaPuntoVenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detallefacturapuntoventa.getId()<0) {
					this.isEsNuevoDetalleFacturaPuntoVenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleFacturaPuntoVenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleFacturaPuntoVenta(evt,rowIndex);
				}	
				
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleFacturaPuntoVenta: " + this.dDif); 
					}
				}								
				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleFacturaPuntoVenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detallefacturapuntoventa)) {
					if(this.detallefacturapuntoventa.getId()>0) {
						this.detallefacturapuntoventa.setIsDeleted(true);
						
						this.detallefacturapuntoventasEliminados.add(this.detallefacturapuntoventa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().remove(this.detallefacturapuntoventa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallefacturapuntoventas.remove(this.detallefacturapuntoventa);				
					}
					
					
					((DetalleFacturaPuntoVentaModel) this.jTableDatosDetalleFacturaPuntoVenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleFacturaPuntoVenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleFacturaPuntoVenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleFacturaPuntoVenta) {
			
			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleFacturaPuntoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				}
				
				//ARCHITECTURE
				try {
					

					//FacturaPuntoVenta
					if(!this.detallefacturapuntoventaConstantesFunciones.cargarid_factura_punto_ventaDetalleFacturaPuntoVenta || this.detallefacturapuntoventaConstantesFunciones.event_dependid_factura_punto_ventaDetalleFacturaPuntoVenta) {
						//this.cargarCombosFacturaPuntoVentasForeignKeyLista(" where id="+this.detallefacturapuntoventa.getid_factura_punto_venta());
									//this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);
						this.facturapuntoventasForeignKey=new ArrayList<FacturaPuntoVenta>();

						if(detallefacturapuntoventa.getFacturaPuntoVenta()!=null) {
							this.facturapuntoventasForeignKey.add(detallefacturapuntoventa.getFacturaPuntoVenta());
						}

						this.addItemDefectoCombosForeignKeyFacturaPuntoVenta();
						this.cargarCombosFrameFacturaPuntoVentasForeignKey("Todos");
					}
					this.setActualFacturaPuntoVentaForeignKey(this.detallefacturapuntoventa.getid_factura_punto_venta(),false,"Formulario");

					//Empresa
					if(!this.detallefacturapuntoventaConstantesFunciones.cargarid_empresaDetalleFacturaPuntoVenta || this.detallefacturapuntoventaConstantesFunciones.event_dependid_empresaDetalleFacturaPuntoVenta) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detallefacturapuntoventa.getid_empresa());
									//this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detallefacturapuntoventa.getEmpresa()!=null) {
							this.empresasForeignKey.add(detallefacturapuntoventa.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detallefacturapuntoventa.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.detallefacturapuntoventaConstantesFunciones.cargarid_sucursalDetalleFacturaPuntoVenta || this.detallefacturapuntoventaConstantesFunciones.event_dependid_sucursalDetalleFacturaPuntoVenta) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.detallefacturapuntoventa.getid_sucursal());
									//this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(detallefacturapuntoventa.getSucursal()!=null) {
							this.sucursalsForeignKey.add(detallefacturapuntoventa.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.detallefacturapuntoventa.getid_sucursal(),false,"Formulario");

					//Bodega
					if(!this.detallefacturapuntoventaConstantesFunciones.cargarid_bodegaDetalleFacturaPuntoVenta || this.detallefacturapuntoventaConstantesFunciones.event_dependid_bodegaDetalleFacturaPuntoVenta) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.detallefacturapuntoventa.getid_bodega());
									//this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(detallefacturapuntoventa.getBodega()!=null) {
							this.bodegasForeignKey.add(detallefacturapuntoventa.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.detallefacturapuntoventa.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.detallefacturapuntoventaConstantesFunciones.cargarid_productoDetalleFacturaPuntoVenta || this.detallefacturapuntoventaConstantesFunciones.event_dependid_productoDetalleFacturaPuntoVenta) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.detallefacturapuntoventa.getid_producto());
									//this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(detallefacturapuntoventa.getProducto()!=null) {
							this.productosForeignKey.add(detallefacturapuntoventa.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.detallefacturapuntoventa.getid_producto(),false,"Formulario");

					//Unidad
					if(!this.detallefacturapuntoventaConstantesFunciones.cargarid_unidadDetalleFacturaPuntoVenta || this.detallefacturapuntoventaConstantesFunciones.event_dependid_unidadDetalleFacturaPuntoVenta) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.detallefacturapuntoventa.getid_unidad());
									//this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(detallefacturapuntoventa.getUnidad()!=null) {
							this.unidadsForeignKey.add(detallefacturapuntoventa.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.detallefacturapuntoventa.getid_unidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleFacturaPuntoVenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleFacturaPuntoVenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleFacturaPuntoVenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleFacturaPuntoVenta(DetalleFacturaPuntoVenta detallefacturapuntoventa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleFacturaPuntoVenta(detallefacturapuntoventa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleFacturaPuntoVenta(DetalleFacturaPuntoVenta detallefacturapuntoventa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleFacturaPuntoVenta(detallefacturapuntoventa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleFacturaPuntoVenta(detallefacturapuntoventa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleFacturaPuntoVenta(detallefacturapuntoventa);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleFacturaPuntoVenta(DetalleFacturaPuntoVenta detallefacturapuntoventa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelidDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getId().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldserieDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getserie());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldcantidadDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getcantidad().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldprecioDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getprecio().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuentoDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getdescuento().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuento_valorDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getdescuento_valor().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldivaDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getiva().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiva_valorDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getiva_valor().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiceDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getice().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldice_valorDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getice_valor().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldsub_totalDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getsub_total().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldtotalDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.gettotal().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextAreadescripcionDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleFacturaPuntoVenta detallefacturapuntoventaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detallefacturapuntoventaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleFacturaPuntoVenta detallefacturapuntoventaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detallefacturapuntoventaLocal=this.detallefacturapuntoventa;
			} else {
				detallefacturapuntoventaLocal=this.detallefacturapuntoventaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detallefacturapuntoventaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleFacturaPuntoVenta(detallefacturapuntoventaLocal,true);
					
					if(detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detallefacturapuntoventaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detallefacturapuntoventaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleFacturaPuntoVenta(DetalleFacturaPuntoVenta detallefacturapuntoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(detallefacturapuntoventa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(detallefacturapuntoventa);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(DetalleFacturaPuntoVenta detallefacturapuntoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(detallefacturapuntoventa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(DetalleFacturaPuntoVenta detallefacturapuntoventa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelidDetalleFacturaPuntoVenta.getText()==null || this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelidDetalleFacturaPuntoVenta.getText()=="" || this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelidDetalleFacturaPuntoVenta.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelidDetalleFacturaPuntoVenta.setText("0");
			}

			if(conColumnasBase) {detallefacturapuntoventa.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelidDetalleFacturaPuntoVenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelIdDetalleFacturaPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallefacturapuntoventa.setserie(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldserieDetalleFacturaPuntoVenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SERIE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelserieDetalleFacturaPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallefacturapuntoventa.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldcantidadDetalleFacturaPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelcantidadDetalleFacturaPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallefacturapuntoventa.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldprecioDetalleFacturaPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelprecioDetalleFacturaPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallefacturapuntoventa.setdescuento(Double.parseDouble(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuentoDetalleFacturaPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabeldescuentoDetalleFacturaPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallefacturapuntoventa.setdescuento_valor(Double.parseDouble(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuento_valorDetalleFacturaPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabeldescuento_valorDetalleFacturaPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallefacturapuntoventa.setiva(Double.parseDouble(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldivaDetalleFacturaPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelivaDetalleFacturaPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallefacturapuntoventa.setiva_valor(Double.parseDouble(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiva_valorDetalleFacturaPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVAVALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabeliva_valorDetalleFacturaPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallefacturapuntoventa.setice(Double.parseDouble(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiceDetalleFacturaPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabeliceDetalleFacturaPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallefacturapuntoventa.setice_valor(Double.parseDouble(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldice_valorDetalleFacturaPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICEVALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelice_valorDetalleFacturaPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallefacturapuntoventa.setsub_total(Double.parseDouble(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldsub_totalDetalleFacturaPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SUBTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelsub_totalDetalleFacturaPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallefacturapuntoventa.settotal(Double.parseDouble(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldtotalDetalleFacturaPuntoVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabeltotalDetalleFacturaPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallefacturapuntoventa.setdescripcion(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextAreadescripcionDetalleFacturaPuntoVenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabeldescripcionDetalleFacturaPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleFacturaPuntoVenta(DetalleFacturaPuntoVenta detallefacturapuntoventaBean,DetalleFacturaPuntoVenta detallefacturapuntoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && detallefacturapuntoventaBean.getid_factura_punto_venta()!=null && !detallefacturapuntoventaBean.getid_factura_punto_venta().equals(-1L))) {detallefacturapuntoventa.setid_factura_punto_venta(detallefacturapuntoventaBean.getid_factura_punto_venta());}
			if(conDefault || (!conDefault && detallefacturapuntoventaBean.getid_bodega()!=null && !detallefacturapuntoventaBean.getid_bodega().equals(-1L))) {detallefacturapuntoventa.setid_bodega(detallefacturapuntoventaBean.getid_bodega());}
			if(conDefault || (!conDefault && detallefacturapuntoventaBean.getid_producto()!=null && !detallefacturapuntoventaBean.getid_producto().equals(-1L))) {detallefacturapuntoventa.setid_producto(detallefacturapuntoventaBean.getid_producto());}
			if(conDefault || (!conDefault && detallefacturapuntoventaBean.getid_unidad()!=null && !detallefacturapuntoventaBean.getid_unidad().equals(-1L))) {detallefacturapuntoventa.setid_unidad(detallefacturapuntoventaBean.getid_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleFacturaPuntoVenta(DetalleFacturaPuntoVenta detallefacturapuntoventaOrigen,DetalleFacturaPuntoVenta detallefacturapuntoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallefacturapuntoventaOrigen.getId()!=null && !detallefacturapuntoventaOrigen.getId().equals(0L))) {detallefacturapuntoventa.setId(detallefacturapuntoventaOrigen.getId());}}
			if(conDefault || (!conDefault && detallefacturapuntoventaOrigen.getid_factura_punto_venta()!=null && !detallefacturapuntoventaOrigen.getid_factura_punto_venta().equals(-1L))) {detallefacturapuntoventa.setid_factura_punto_venta(detallefacturapuntoventaOrigen.getid_factura_punto_venta());}
			if(conDefault || (!conDefault && detallefacturapuntoventaOrigen.getid_bodega()!=null && !detallefacturapuntoventaOrigen.getid_bodega().equals(-1L))) {detallefacturapuntoventa.setid_bodega(detallefacturapuntoventaOrigen.getid_bodega());}
			if(conDefault || (!conDefault && detallefacturapuntoventaOrigen.getid_producto()!=null && !detallefacturapuntoventaOrigen.getid_producto().equals(-1L))) {detallefacturapuntoventa.setid_producto(detallefacturapuntoventaOrigen.getid_producto());}
			if(conDefault || (!conDefault && detallefacturapuntoventaOrigen.getid_unidad()!=null && !detallefacturapuntoventaOrigen.getid_unidad().equals(-1L))) {detallefacturapuntoventa.setid_unidad(detallefacturapuntoventaOrigen.getid_unidad());}
			if(conDefault || (!conDefault && detallefacturapuntoventaOrigen.getserie()!=null && !detallefacturapuntoventaOrigen.getserie().equals(""))) {detallefacturapuntoventa.setserie(detallefacturapuntoventaOrigen.getserie());}
			if(conDefault || (!conDefault && detallefacturapuntoventaOrigen.getcantidad()!=null && !detallefacturapuntoventaOrigen.getcantidad().equals(0))) {detallefacturapuntoventa.setcantidad(detallefacturapuntoventaOrigen.getcantidad());}
			if(conDefault || (!conDefault && detallefacturapuntoventaOrigen.getprecio()!=null && !detallefacturapuntoventaOrigen.getprecio().equals(0.0))) {detallefacturapuntoventa.setprecio(detallefacturapuntoventaOrigen.getprecio());}
			if(conDefault || (!conDefault && detallefacturapuntoventaOrigen.getdescuento()!=null && !detallefacturapuntoventaOrigen.getdescuento().equals(0.0))) {detallefacturapuntoventa.setdescuento(detallefacturapuntoventaOrigen.getdescuento());}
			if(conDefault || (!conDefault && detallefacturapuntoventaOrigen.getdescuento_valor()!=null && !detallefacturapuntoventaOrigen.getdescuento_valor().equals(0.0))) {detallefacturapuntoventa.setdescuento_valor(detallefacturapuntoventaOrigen.getdescuento_valor());}
			if(conDefault || (!conDefault && detallefacturapuntoventaOrigen.getiva()!=null && !detallefacturapuntoventaOrigen.getiva().equals(0.0))) {detallefacturapuntoventa.setiva(detallefacturapuntoventaOrigen.getiva());}
			if(conDefault || (!conDefault && detallefacturapuntoventaOrigen.getiva_valor()!=null && !detallefacturapuntoventaOrigen.getiva_valor().equals(0.0))) {detallefacturapuntoventa.setiva_valor(detallefacturapuntoventaOrigen.getiva_valor());}
			if(conDefault || (!conDefault && detallefacturapuntoventaOrigen.getice()!=null && !detallefacturapuntoventaOrigen.getice().equals(0.0))) {detallefacturapuntoventa.setice(detallefacturapuntoventaOrigen.getice());}
			if(conDefault || (!conDefault && detallefacturapuntoventaOrigen.getice_valor()!=null && !detallefacturapuntoventaOrigen.getice_valor().equals(0.0))) {detallefacturapuntoventa.setice_valor(detallefacturapuntoventaOrigen.getice_valor());}
			if(conDefault || (!conDefault && detallefacturapuntoventaOrigen.getsub_total()!=null && !detallefacturapuntoventaOrigen.getsub_total().equals(0.0))) {detallefacturapuntoventa.setsub_total(detallefacturapuntoventaOrigen.getsub_total());}
			if(conDefault || (!conDefault && detallefacturapuntoventaOrigen.gettotal()!=null && !detallefacturapuntoventaOrigen.gettotal().equals(0.0))) {detallefacturapuntoventa.settotal(detallefacturapuntoventaOrigen.gettotal());}
			if(conDefault || (!conDefault && detallefacturapuntoventaOrigen.getdescripcion()!=null && !detallefacturapuntoventaOrigen.getdescripcion().equals(""))) {detallefacturapuntoventa.setdescripcion(detallefacturapuntoventaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleFacturaPuntoVenta(DetalleFacturaPuntoVenta detallefacturapuntoventa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelidDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getId().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldserieDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getserie());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldcantidadDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getcantidad().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldprecioDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getprecio().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuentoDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getdescuento().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuento_valorDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getdescuento_valor().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldivaDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getiva().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiva_valorDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getiva_valor().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiceDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getice().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldice_valorDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getice_valor().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldsub_totalDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getsub_total().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldtotalDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.gettotal().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextAreadescripcionDetalleFacturaPuntoVenta.setText(detallefacturapuntoventa.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleFacturaPuntoVenta(DetalleFacturaPuntoVentaBean detallefacturapuntoventaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelidDetalleFacturaPuntoVenta.setText(detallefacturapuntoventaBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldserieDetalleFacturaPuntoVenta.setText(detallefacturapuntoventaBean.getserie());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldcantidadDetalleFacturaPuntoVenta.setText(detallefacturapuntoventaBean.getcantidad().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldprecioDetalleFacturaPuntoVenta.setText(detallefacturapuntoventaBean.getprecio().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuentoDetalleFacturaPuntoVenta.setText(detallefacturapuntoventaBean.getdescuento().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuento_valorDetalleFacturaPuntoVenta.setText(detallefacturapuntoventaBean.getdescuento_valor().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldivaDetalleFacturaPuntoVenta.setText(detallefacturapuntoventaBean.getiva().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiva_valorDetalleFacturaPuntoVenta.setText(detallefacturapuntoventaBean.getiva_valor().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiceDetalleFacturaPuntoVenta.setText(detallefacturapuntoventaBean.getice().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldice_valorDetalleFacturaPuntoVenta.setText(detallefacturapuntoventaBean.getice_valor().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldsub_totalDetalleFacturaPuntoVenta.setText(detallefacturapuntoventaBean.getsub_total().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldtotalDetalleFacturaPuntoVenta.setText(detallefacturapuntoventaBean.gettotal().toString());
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextAreadescripcionDetalleFacturaPuntoVenta.setText(detallefacturapuntoventaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleFacturaPuntoVenta(DetalleFacturaPuntoVentaParameterReturnGeneral detallefacturapuntoventaReturnGeneral,DetalleFacturaPuntoVentaBean detallefacturapuntoventaBean,Boolean conDefault) throws Exception { 
		try {
			DetalleFacturaPuntoVenta detallefacturapuntoventaLocal=new DetalleFacturaPuntoVenta();
			
			detallefacturapuntoventaLocal=detallefacturapuntoventaReturnGeneral.getDetalleFacturaPuntoVenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallefacturapuntoventaLocal.getId()!=null && !detallefacturapuntoventaLocal.getId().equals(0L))) {detallefacturapuntoventaBean.setId(detallefacturapuntoventaLocal.getId());}}
			if(conDefault || (!conDefault && detallefacturapuntoventaLocal.getid_factura_punto_venta()!=null && !detallefacturapuntoventaLocal.getid_factura_punto_venta().equals(-1L))) {detallefacturapuntoventaBean.setid_factura_punto_venta(detallefacturapuntoventaLocal.getid_factura_punto_venta());}
			if(conDefault || (!conDefault && detallefacturapuntoventaLocal.getid_bodega()!=null && !detallefacturapuntoventaLocal.getid_bodega().equals(-1L))) {detallefacturapuntoventaBean.setid_bodega(detallefacturapuntoventaLocal.getid_bodega());}
			if(conDefault || (!conDefault && detallefacturapuntoventaLocal.getid_producto()!=null && !detallefacturapuntoventaLocal.getid_producto().equals(-1L))) {detallefacturapuntoventaBean.setid_producto(detallefacturapuntoventaLocal.getid_producto());}
			if(conDefault || (!conDefault && detallefacturapuntoventaLocal.getid_unidad()!=null && !detallefacturapuntoventaLocal.getid_unidad().equals(-1L))) {detallefacturapuntoventaBean.setid_unidad(detallefacturapuntoventaLocal.getid_unidad());}
			if(conDefault || (!conDefault && detallefacturapuntoventaLocal.getserie()!=null && !detallefacturapuntoventaLocal.getserie().equals(""))) {detallefacturapuntoventaBean.setserie(detallefacturapuntoventaLocal.getserie());}
			if(conDefault || (!conDefault && detallefacturapuntoventaLocal.getcantidad()!=null && !detallefacturapuntoventaLocal.getcantidad().equals(0))) {detallefacturapuntoventaBean.setcantidad(detallefacturapuntoventaLocal.getcantidad());}
			if(conDefault || (!conDefault && detallefacturapuntoventaLocal.getprecio()!=null && !detallefacturapuntoventaLocal.getprecio().equals(0.0))) {detallefacturapuntoventaBean.setprecio(detallefacturapuntoventaLocal.getprecio());}
			if(conDefault || (!conDefault && detallefacturapuntoventaLocal.getdescuento()!=null && !detallefacturapuntoventaLocal.getdescuento().equals(0.0))) {detallefacturapuntoventaBean.setdescuento(detallefacturapuntoventaLocal.getdescuento());}
			if(conDefault || (!conDefault && detallefacturapuntoventaLocal.getdescuento_valor()!=null && !detallefacturapuntoventaLocal.getdescuento_valor().equals(0.0))) {detallefacturapuntoventaBean.setdescuento_valor(detallefacturapuntoventaLocal.getdescuento_valor());}
			if(conDefault || (!conDefault && detallefacturapuntoventaLocal.getiva()!=null && !detallefacturapuntoventaLocal.getiva().equals(0.0))) {detallefacturapuntoventaBean.setiva(detallefacturapuntoventaLocal.getiva());}
			if(conDefault || (!conDefault && detallefacturapuntoventaLocal.getiva_valor()!=null && !detallefacturapuntoventaLocal.getiva_valor().equals(0.0))) {detallefacturapuntoventaBean.setiva_valor(detallefacturapuntoventaLocal.getiva_valor());}
			if(conDefault || (!conDefault && detallefacturapuntoventaLocal.getice()!=null && !detallefacturapuntoventaLocal.getice().equals(0.0))) {detallefacturapuntoventaBean.setice(detallefacturapuntoventaLocal.getice());}
			if(conDefault || (!conDefault && detallefacturapuntoventaLocal.getice_valor()!=null && !detallefacturapuntoventaLocal.getice_valor().equals(0.0))) {detallefacturapuntoventaBean.setice_valor(detallefacturapuntoventaLocal.getice_valor());}
			if(conDefault || (!conDefault && detallefacturapuntoventaLocal.getsub_total()!=null && !detallefacturapuntoventaLocal.getsub_total().equals(0.0))) {detallefacturapuntoventaBean.setsub_total(detallefacturapuntoventaLocal.getsub_total());}
			if(conDefault || (!conDefault && detallefacturapuntoventaLocal.gettotal()!=null && !detallefacturapuntoventaLocal.gettotal().equals(0.0))) {detallefacturapuntoventaBean.settotal(detallefacturapuntoventaLocal.gettotal());}
			if(conDefault || (!conDefault && detallefacturapuntoventaLocal.getdescripcion()!=null && !detallefacturapuntoventaLocal.getdescripcion().equals(""))) {detallefacturapuntoventaBean.setdescripcion(detallefacturapuntoventaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleFacturaPuntoVentaGenerico(Long idDetalleFacturaPuntoVentaSeleccionado,JComboBox jComboBoxDetalleFacturaPuntoVenta,List<DetalleFacturaPuntoVenta> detallefacturapuntoventasLocal)throws Exception {
		try {
			DetalleFacturaPuntoVenta  detallefacturapuntoventaTemp=null;

			for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:detallefacturapuntoventasLocal) {
				if(detallefacturapuntoventaAux.getId()!=null && detallefacturapuntoventaAux.getId().equals(idDetalleFacturaPuntoVentaSeleccionado)) {
					detallefacturapuntoventaTemp=detallefacturapuntoventaAux;
					break;
				}
			}

			jComboBoxDetalleFacturaPuntoVenta.setSelectedItem(detallefacturapuntoventaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleFacturaPuntoVentaGenerico(JComboBox jComboBoxDetalleFacturaPuntoVenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleFacturaPuntoVenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleFacturaPuntoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleFacturaPuntoVenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleFacturaPuntoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallefacturapuntoventa=(DetalleFacturaPuntoVenta) detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallefacturapuntoventa =(DetalleFacturaPuntoVenta) detallefacturapuntoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("FacturaPuntoVenta")) {
			//sDescripcion=this.getActualFacturaPuntoVentaForeignKeyDescripcion((Long)value);
			if(!detallefacturapuntoventa.getIsNew() && !detallefacturapuntoventa.getIsChanged() && !detallefacturapuntoventa.getIsDeleted()) {
				sDescripcion=detallefacturapuntoventa.getfacturapuntoventa_descripcion();
			} else {
				//sDescripcion=this.getActualFacturaPuntoVentaForeignKeyDescripcion((Long)value);
				sDescripcion=detallefacturapuntoventa.getfacturapuntoventa_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detallefacturapuntoventa.getIsNew() && !detallefacturapuntoventa.getIsChanged() && !detallefacturapuntoventa.getIsDeleted()) {
				sDescripcion=detallefacturapuntoventa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detallefacturapuntoventa.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!detallefacturapuntoventa.getIsNew() && !detallefacturapuntoventa.getIsChanged() && !detallefacturapuntoventa.getIsDeleted()) {
				sDescripcion=detallefacturapuntoventa.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=detallefacturapuntoventa.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!detallefacturapuntoventa.getIsNew() && !detallefacturapuntoventa.getIsChanged() && !detallefacturapuntoventa.getIsDeleted()) {
				sDescripcion=detallefacturapuntoventa.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=detallefacturapuntoventa.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!detallefacturapuntoventa.getIsNew() && !detallefacturapuntoventa.getIsChanged() && !detallefacturapuntoventa.getIsDeleted()) {
				sDescripcion=detallefacturapuntoventa.getproducto_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=detallefacturapuntoventa.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!detallefacturapuntoventa.getIsNew() && !detallefacturapuntoventa.getIsChanged() && !detallefacturapuntoventa.getIsDeleted()) {
				sDescripcion=detallefacturapuntoventa.getunidad_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=detallefacturapuntoventa.getunidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleFacturaPuntoVenta detallefacturapuntoventaRow=new DetalleFacturaPuntoVenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallefacturapuntoventaRow=(DetalleFacturaPuntoVenta) detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallefacturapuntoventaRow=(DetalleFacturaPuntoVenta) detallefacturapuntoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleFacturaPuntoVenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta && this.isPermisoNuevoDetalleFacturaPuntoVenta));			
			this.jButtonDuplicarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarDetalleFacturaPuntoVenta && this.isPermisoDuplicarDetalleFacturaPuntoVenta));			
			this.jButtonCopiarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarDetalleFacturaPuntoVenta && this.isPermisoCopiarDetalleFacturaPuntoVenta));
			this.jButtonVerFormDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormDetalleFacturaPuntoVenta && this.isPermisoVerFormDetalleFacturaPuntoVenta));
			
			this.jButtonAbrirOrderByDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenDetalleFacturaPuntoVenta && this.isPermisoOrdenDetalleFacturaPuntoVenta));			
			
			this.jButtonNuevoRelacionesDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta && this.isPermisoNuevoDetalleFacturaPuntoVenta));			
			this.jButtonNuevoGuardarCambiosDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta && this.isPermisoNuevoDetalleFacturaPuntoVenta && this.isPermisoGuardarCambiosDetalleFacturaPuntoVenta));
			
			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonModificarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaModificarDetalleFacturaPuntoVenta && this.isPermisoActualizarDetalleFacturaPuntoVenta));	
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonActualizarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarDetalleFacturaPuntoVenta && this.isPermisoActualizarDetalleFacturaPuntoVenta));	
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonEliminarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarDetalleFacturaPuntoVenta && this.isPermisoEliminarDetalleFacturaPuntoVenta));
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonCancelarDetalleFacturaPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarDetalleFacturaPuntoVenta);							
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonGuardarCambiosDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta && this.isPermisoGuardarCambiosDetalleFacturaPuntoVenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta && this.isPermisoGuardarCambiosDetalleFacturaPuntoVenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta && this.isPermisoNuevoDetalleFacturaPuntoVenta));						
			this.jButtonDuplicarToolBarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarDetalleFacturaPuntoVenta && this.isPermisoDuplicarDetalleFacturaPuntoVenta));						
			this.jButtonCopiarToolBarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarDetalleFacturaPuntoVenta && this.isPermisoCopiarDetalleFacturaPuntoVenta));			
			this.jButtonVerFormToolBarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormDetalleFacturaPuntoVenta && this.isPermisoVerFormDetalleFacturaPuntoVenta));			
			this.jButtonAbrirOrderByToolBarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenDetalleFacturaPuntoVenta && this.isPermisoOrdenDetalleFacturaPuntoVenta));
			this.jButtonNuevoRelacionesToolBarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta && this.isPermisoNuevoDetalleFacturaPuntoVenta));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta && this.isPermisoNuevoDetalleFacturaPuntoVenta && this.isPermisoGuardarCambiosDetalleFacturaPuntoVenta));			
			
			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonModificarToolBarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaModificarDetalleFacturaPuntoVenta && this.isPermisoActualizarDetalleFacturaPuntoVenta));	
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonActualizarToolBarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarDetalleFacturaPuntoVenta  && this.isPermisoActualizarDetalleFacturaPuntoVenta));	
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonEliminarToolBarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarDetalleFacturaPuntoVenta && this.isPermisoEliminarDetalleFacturaPuntoVenta));
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonCancelarToolBarDetalleFacturaPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarDetalleFacturaPuntoVenta);				
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonGuardarCambiosToolBarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta && this.isPermisoGuardarCambiosDetalleFacturaPuntoVenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta && this.isPermisoGuardarCambiosDetalleFacturaPuntoVenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta && this.isPermisoNuevoDetalleFacturaPuntoVenta));			
			this.jMenuItemDuplicarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarDetalleFacturaPuntoVenta && this.isPermisoDuplicarDetalleFacturaPuntoVenta));			
			this.jMenuItemCopiarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarDetalleFacturaPuntoVenta && this.isPermisoCopiarDetalleFacturaPuntoVenta));			
			this.jMenuItemVerFormDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormDetalleFacturaPuntoVenta && this.isPermisoVerFormDetalleFacturaPuntoVenta));			
			this.jMenuItemAbrirOrderByDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenDetalleFacturaPuntoVenta && this.isPermisoOrdenDetalleFacturaPuntoVenta));			
			//this.jMenuItemMostrarOcultarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenDetalleFacturaPuntoVenta && this.isPermisoOrdenDetalleFacturaPuntoVenta));
			this.jMenuItemDetalleAbrirOrderByDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenDetalleFacturaPuntoVenta && this.isPermisoOrdenDetalleFacturaPuntoVenta));			
			//this.jMenuItemDetalleMostrarOcultarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenDetalleFacturaPuntoVenta && this.isPermisoOrdenDetalleFacturaPuntoVenta));			
			this.jMenuItemNuevoRelacionesDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta && this.isPermisoNuevoDetalleFacturaPuntoVenta));			
			this.jMenuItemNuevoGuardarCambiosDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta && this.isPermisoNuevoDetalleFacturaPuntoVenta && this.isPermisoGuardarCambiosDetalleFacturaPuntoVenta));									
			
			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jMenuItemModificarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaModificarDetalleFacturaPuntoVenta && this.isPermisoActualizarDetalleFacturaPuntoVenta));	
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jMenuItemActualizarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarDetalleFacturaPuntoVenta && this.isPermisoActualizarDetalleFacturaPuntoVenta));	
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jMenuItemEliminarDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarDetalleFacturaPuntoVenta && this.isPermisoEliminarDetalleFacturaPuntoVenta));
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jMenuItemCancelarDetalleFacturaPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarDetalleFacturaPuntoVenta);				
			}
			
			this.jMenuItemGuardarCambiosDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta && this.isPermisoGuardarCambiosDetalleFacturaPuntoVenta));						
			this.jMenuItemGuardarCambiosTablaDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta && this.isPermisoGuardarCambiosDetalleFacturaPuntoVenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta=this.jButtonNuevoDetalleFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleFacturaPuntoVenta=this.jButtonDuplicarDetalleFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaCopiarDetalleFacturaPuntoVenta=this.jButtonCopiarDetalleFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaVerFormDetalleFacturaPuntoVenta=this.jButtonVerFormDetalleFacturaPuntoVenta.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleFacturaPuntoVenta=this.jButtonAbrirOrderByDetalleFacturaPuntoVenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta=this.jButtonNuevoRelacionesDetalleFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaModificarDetalleFacturaPuntoVenta=this.jButtonModificarDetalleFacturaPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
			this.isVisibilidadCeldaActualizarDetalleFacturaPuntoVenta=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonActualizarDetalleFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarDetalleFacturaPuntoVenta=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonEliminarDetalleFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarDetalleFacturaPuntoVenta=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonCancelarDetalleFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonGuardarCambiosDetalleFacturaPuntoVenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta=this.jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta=this.jButtonNuevoToolBarDetalleFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta=this.jButtonNuevoRelacionesToolBarDetalleFacturaPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
			this.isVisibilidadCeldaModificarDetalleFacturaPuntoVenta=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonModificarToolBarDetalleFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaActualizarDetalleFacturaPuntoVenta=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonActualizarToolBarDetalleFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarDetalleFacturaPuntoVenta=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonEliminarToolBarDetalleFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarDetalleFacturaPuntoVenta=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonCancelarToolBarDetalleFacturaPuntoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta=this.jButtonGuardarCambiosToolBarDetalleFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta=this.jButtonGuardarCambiosTablaToolBarDetalleFacturaPuntoVenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta=this.jMenuItemNuevoDetalleFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta=this.jMenuItemNuevoRelacionesDetalleFacturaPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
			this.isVisibilidadCeldaModificarDetalleFacturaPuntoVenta=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jMenuItemModificarDetalleFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaActualizarDetalleFacturaPuntoVenta=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jMenuItemActualizarDetalleFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarDetalleFacturaPuntoVenta=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jMenuItemEliminarDetalleFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarDetalleFacturaPuntoVenta=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jMenuItemCancelarDetalleFacturaPuntoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta=this.jMenuItemGuardarCambiosDetalleFacturaPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta=this.jMenuItemGuardarCambiosTablaDetalleFacturaPuntoVenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleFacturaPuntoVenta(Boolean esInicializar) {
		if(DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
				//if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleFacturaPuntoVenta();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleFacturaPuntoVenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleFacturaPuntoVenta() {
		this.jButtonNuevoDetalleFacturaPuntoVenta.setVisible(this.isPermisoNuevoDetalleFacturaPuntoVenta);			
		this.jButtonDuplicarDetalleFacturaPuntoVenta.setVisible(this.isPermisoDuplicarDetalleFacturaPuntoVenta);			
		this.jButtonCopiarDetalleFacturaPuntoVenta.setVisible(this.isPermisoCopiarDetalleFacturaPuntoVenta);			
		this.jButtonVerFormDetalleFacturaPuntoVenta.setVisible(this.isPermisoVerFormDetalleFacturaPuntoVenta);			
		
		this.jButtonAbrirOrderByDetalleFacturaPuntoVenta.setVisible(this.isPermisoOrdenDetalleFacturaPuntoVenta);					
		
		this.jButtonNuevoRelacionesDetalleFacturaPuntoVenta.setVisible(this.isPermisoNuevoDetalleFacturaPuntoVenta);			
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonModificarDetalleFacturaPuntoVenta.setVisible(this.isPermisoActualizarDetalleFacturaPuntoVenta);	
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonActualizarDetalleFacturaPuntoVenta.setVisible(this.isPermisoActualizarDetalleFacturaPuntoVenta);	
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonEliminarDetalleFacturaPuntoVenta.setVisible(this.isPermisoEliminarDetalleFacturaPuntoVenta);
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonCancelarDetalleFacturaPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarDetalleFacturaPuntoVenta);						
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonGuardarCambiosDetalleFacturaPuntoVenta.setVisible(this.isPermisoGuardarCambiosDetalleFacturaPuntoVenta);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta.setVisible(this.isPermisoActualizarDetalleFacturaPuntoVenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleFacturaPuntoVenta() {
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonModificarDetalleFacturaPuntoVenta.setVisible(this.isPermisoActualizarDetalleFacturaPuntoVenta);	
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonActualizarDetalleFacturaPuntoVenta.setVisible(this.isPermisoActualizarDetalleFacturaPuntoVenta);	
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonEliminarDetalleFacturaPuntoVenta.setVisible(this.isPermisoEliminarDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonCancelarDetalleFacturaPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarDetalleFacturaPuntoVenta);							
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonGuardarCambiosDetalleFacturaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta && this.isPermisoGuardarCambiosDetalleFacturaPuntoVenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleFacturaPuntoVenta() {
		if(DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleFacturaPuntoVenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleFacturaPuntoVenta() {
	}
	
	public void jTableDatosDetalleFacturaPuntoVentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleFacturaPuntoVenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturapuntoventa==null) {
						this.detallefacturapuntoventa = new DetalleFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				}

				if(this.detallefacturapuntoventa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detallefacturapuntoventa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisofacturapuntoventa=true;

			idTienePermisofacturapuntoventa=this.tienePermisosUsuarioEnPaginaWebDetalleFacturaPuntoVenta(FacturaPuntoVentaConstantesFunciones.CLASSNAME);

			if(idTienePermisofacturapuntoventa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleFacturaPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleFacturaPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);

				this.facturapuntoventaBeanSwingJInternalFrame=new FacturaPuntoVentaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.facturapuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.facturapuntoventaBeanSwingJInternalFrame.getFacturaPuntoVentaLogic().setConnexion(this.detallefacturapuntoventaLogic.getConnexion());

				if(this.detallefacturapuntoventa.getid_factura_punto_venta()!=null) {
					this.facturapuntoventaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.facturapuntoventaBeanSwingJInternalFrame.setIdActual(this.detallefacturapuntoventa.getid_factura_punto_venta());
					this.facturapuntoventaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.facturapuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.facturapuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaPuntoVenta();
				}

				JInternalFrameBase jinternalFrame =this.facturapuntoventaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleFacturaPuntoVenta=(TitledBorder)this.jScrollPanelDatosDetalleFacturaPuntoVenta.getBorder();
				TitledBorder titledBorderfacturapuntoventa=(TitledBorder)this.facturapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFacturaPuntoVenta.getBorder();

				titledBorderfacturapuntoventa.setTitle(titledBorderDetalleFacturaPuntoVenta.getTitle() + " -> Factura Punto Venta");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturapuntoventa==null) {
						this.detallefacturapuntoventa = new DetalleFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				}

				if(this.detallefacturapuntoventa.getid_factura_punto_venta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_factura_punto_venta = "+this.detallefacturapuntoventa.getid_factura_punto_venta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetalleFacturaPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetalleFacturaPuntoVenta(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleFacturaPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleFacturaPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detallefacturapuntoventaLogic.getConnexion());

				if(this.detallefacturapuntoventa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detallefacturapuntoventa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleFacturaPuntoVenta=(TitledBorder)this.jScrollPanelDatosDetalleFacturaPuntoVenta.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetalleFacturaPuntoVenta.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetalleFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturapuntoventa==null) {
						this.detallefacturapuntoventa = new DetalleFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				}

				if(this.detallefacturapuntoventa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detallefacturapuntoventa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDetalleFacturaPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDetalleFacturaPuntoVenta(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleFacturaPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleFacturaPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.detallefacturapuntoventaLogic.getConnexion());

				if(this.detallefacturapuntoventa.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.detallefacturapuntoventa.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleFacturaPuntoVenta=(TitledBorder)this.jScrollPanelDatosDetalleFacturaPuntoVenta.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDetalleFacturaPuntoVenta.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDetalleFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturapuntoventa==null) {
						this.detallefacturapuntoventa = new DetalleFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				}

				if(this.detallefacturapuntoventa.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.detallefacturapuntoventa.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaDetalleFacturaPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebDetalleFacturaPuntoVenta(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleFacturaPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleFacturaPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.detallefacturapuntoventaLogic.getConnexion());

				if(this.detallefacturapuntoventa.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.detallefacturapuntoventa.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleFacturaPuntoVenta=(TitledBorder)this.jScrollPanelDatosDetalleFacturaPuntoVenta.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderDetalleFacturaPuntoVenta.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaDetalleFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturapuntoventa==null) {
						this.detallefacturapuntoventa = new DetalleFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				}

				if(this.detallefacturapuntoventa.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.detallefacturapuntoventa.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoDetalleFacturaPuntoVentaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderDetalleFacturaPuntoVenta=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosDetalleFacturaPuntoVenta.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderDetalleFacturaPuntoVenta=(TitledBorder)this.jScrollPanelDatosDetalleFacturaPuntoVenta.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderDetalleFacturaPuntoVenta.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoDetalleFacturaPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebDetalleFacturaPuntoVenta(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleFacturaPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleFacturaPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.detallefacturapuntoventaLogic.getConnexion());

				if(this.detallefacturapuntoventa.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.detallefacturapuntoventa.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleFacturaPuntoVenta=(TitledBorder)this.jScrollPanelDatosDetalleFacturaPuntoVenta.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderDetalleFacturaPuntoVenta.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoDetalleFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturapuntoventa==null) {
						this.detallefacturapuntoventa = new DetalleFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				}

				if(this.detallefacturapuntoventa.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.detallefacturapuntoventa.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadDetalleFacturaPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebDetalleFacturaPuntoVenta(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleFacturaPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleFacturaPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.detallefacturapuntoventaLogic.getConnexion());

				if(this.detallefacturapuntoventa.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.detallefacturapuntoventa.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleFacturaPuntoVenta=(TitledBorder)this.jScrollPanelDatosDetalleFacturaPuntoVenta.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderDetalleFacturaPuntoVenta.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadDetalleFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturapuntoventa==null) {
						this.detallefacturapuntoventa = new DetalleFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				}

				if(this.detallefacturapuntoventa.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.detallefacturapuntoventa.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonserieDetalleFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturapuntoventa==null) {
						this.detallefacturapuntoventa = new DetalleFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				}

				if(this.detallefacturapuntoventa.getserie()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where serie like '%"+this.detallefacturapuntoventa.getserie()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadDetalleFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturapuntoventa==null) {
						this.detallefacturapuntoventa = new DetalleFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				}

				if(this.detallefacturapuntoventa.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.detallefacturapuntoventa.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioDetalleFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturapuntoventa==null) {
						this.detallefacturapuntoventa = new DetalleFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				}

				if(this.detallefacturapuntoventa.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.detallefacturapuntoventa.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuentoDetalleFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturapuntoventa==null) {
						this.detallefacturapuntoventa = new DetalleFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				}

				if(this.detallefacturapuntoventa.getdescuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento = "+this.detallefacturapuntoventa.getdescuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuento_valorDetalleFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturapuntoventa==null) {
						this.detallefacturapuntoventa = new DetalleFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				}

				if(this.detallefacturapuntoventa.getdescuento_valor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento_valor = "+this.detallefacturapuntoventa.getdescuento_valor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaDetalleFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturapuntoventa==null) {
						this.detallefacturapuntoventa = new DetalleFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				}

				if(this.detallefacturapuntoventa.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.detallefacturapuntoventa.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoniva_valorDetalleFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturapuntoventa==null) {
						this.detallefacturapuntoventa = new DetalleFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				}

				if(this.detallefacturapuntoventa.getiva_valor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva_valor = "+this.detallefacturapuntoventa.getiva_valor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoniceDetalleFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturapuntoventa==null) {
						this.detallefacturapuntoventa = new DetalleFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				}

				if(this.detallefacturapuntoventa.getice()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ice = "+this.detallefacturapuntoventa.getice().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonice_valorDetalleFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturapuntoventa==null) {
						this.detallefacturapuntoventa = new DetalleFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				}

				if(this.detallefacturapuntoventa.getice_valor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ice_valor = "+this.detallefacturapuntoventa.getice_valor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsub_totalDetalleFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturapuntoventa==null) {
						this.detallefacturapuntoventa = new DetalleFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				}

				if(this.detallefacturapuntoventa.getsub_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sub_total = "+this.detallefacturapuntoventa.getsub_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalDetalleFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturapuntoventa==null) {
						this.detallefacturapuntoventa = new DetalleFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				}

				if(this.detallefacturapuntoventa.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.detallefacturapuntoventa.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionDetalleFacturaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.getdetallefacturapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturapuntoventa==null) {
						this.detallefacturapuntoventa = new DetalleFacturaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);
				}

				if(this.detallefacturapuntoventa.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.detallefacturapuntoventa.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);

			this.getDetalleFacturaPuntoVentasFK_IdBodega();

			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);

			//if(DetalleFacturaPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);

			this.getDetalleFacturaPuntoVentasFK_IdEmpresa();

			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);

			//if(DetalleFacturaPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFacturaPuntoVentaDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);

			this.getDetalleFacturaPuntoVentasFK_IdFacturaPuntoVenta();

			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);

			//if(DetalleFacturaPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);

			this.getDetalleFacturaPuntoVentasFK_IdProducto();

			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);

			//if(DetalleFacturaPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);

			this.getDetalleFacturaPuntoVentasFK_IdSucursal();

			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);

			//if(DetalleFacturaPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadDetalleFacturaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);

			this.getDetalleFacturaPuntoVentasFK_IdUnidad();

			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);

			//if(DetalleFacturaPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleFacturaPuntoVenta() {
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.dispose();
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta!=null) {
			this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.dispose();
			this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta=null;
		}
		
		if(this.jInternalFrameImportacionDetalleFacturaPuntoVenta!=null) {
			this.jInternalFrameImportacionDetalleFacturaPuntoVenta.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleFacturaPuntoVenta.dispose();
			this.jInternalFrameImportacionDetalleFacturaPuntoVenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleFacturaPuntoVenta();
			
			DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleFacturaPuntoVenta")) {
				jButtonNuevoDetalleFacturaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleFacturaPuntoVenta")) {
				jButtonDuplicarDetalleFacturaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleFacturaPuntoVenta")) {
				jButtonCopiarDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleFacturaPuntoVenta")) {
				jButtonVerFormDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleFacturaPuntoVenta")) {
				jButtonNuevoDetalleFacturaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleFacturaPuntoVenta")) {
				jButtonDuplicarDetalleFacturaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleFacturaPuntoVenta")) {
				jButtonNuevoDetalleFacturaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleFacturaPuntoVenta")) {
				jButtonDuplicarDetalleFacturaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleFacturaPuntoVenta")) {
				jButtonNuevoDetalleFacturaPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleFacturaPuntoVenta")) {
				jButtonNuevoDetalleFacturaPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleFacturaPuntoVenta")) {
				jButtonNuevoDetalleFacturaPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleFacturaPuntoVenta")) {
				jButtonModificarDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleFacturaPuntoVenta")) {
				jButtonModificarDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleFacturaPuntoVenta")) {
				jButtonModificarDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleFacturaPuntoVenta")) {
				jButtonActualizarDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleFacturaPuntoVenta")) {
				jButtonActualizarDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleFacturaPuntoVenta")) {
				jButtonActualizarDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleFacturaPuntoVenta")) {
				jButtonEliminarDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleFacturaPuntoVenta")) {
				jButtonEliminarDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleFacturaPuntoVenta")) {
				jButtonEliminarDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleFacturaPuntoVenta")) {
				jButtonCancelarDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleFacturaPuntoVenta")) {
				jButtonCancelarDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleFacturaPuntoVenta")) {
				jButtonCancelarDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleFacturaPuntoVenta")) {
				jButtonCerrarDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleFacturaPuntoVenta")) {
				jButtonCerrarDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleFacturaPuntoVenta")) {
				jButtonCerrarDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleFacturaPuntoVenta")) {
				jButtonMostrarOcultarDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleFacturaPuntoVenta")) {
				jButtonCancelarDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleFacturaPuntoVenta")) {
				jButtonGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleFacturaPuntoVenta")) {
				jButtonGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleFacturaPuntoVenta")) {
				jButtonCopiarDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleFacturaPuntoVenta")) {
				jButtonVerFormDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleFacturaPuntoVenta")) {
				jButtonGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleFacturaPuntoVenta")) {
				jButtonCopiarDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleFacturaPuntoVenta")) {
				jButtonVerFormDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleFacturaPuntoVenta")) {
				jButtonGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleFacturaPuntoVenta")) {
				jButtonGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleFacturaPuntoVenta")) {
				jButtonGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleFacturaPuntoVenta")) {
				jButtonRecargarInformacionDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleFacturaPuntoVenta")) {
				jButtonRecargarInformacionDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleFacturaPuntoVenta")) {
				jButtonRecargarInformacionDetalleFacturaPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleFacturaPuntoVenta")) {
				jButtonAnterioresDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleFacturaPuntoVenta")) {
				jButtonAnterioresDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleFacturaPuntoVenta")) {
				jButtonAnterioresDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleFacturaPuntoVenta")) {
				jButtonSiguientesDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleFacturaPuntoVenta")) {
				jButtonSiguientesDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleFacturaPuntoVenta")) {
				jButtonSiguientesDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleFacturaPuntoVenta") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleFacturaPuntoVenta")) {
				jButtonAbrirOrderByDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleFacturaPuntoVenta") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleFacturaPuntoVenta")) {
				jButtonMostrarOcultarDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleFacturaPuntoVenta")) {
				jButtonNuevoGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleFacturaPuntoVenta")) {
				jButtonNuevoGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleFacturaPuntoVenta")) {
				jButtonNuevoGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleFacturaPuntoVenta")) {
				jButtonCerrarReporteDinamicoDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleFacturaPuntoVenta")) {
				jButtonGenerarReporteDinamicoDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleFacturaPuntoVenta")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleFacturaPuntoVenta")) {
				jButtonCerrarImportacionDetalleFacturaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleFacturaPuntoVenta")) {
				
				jButtonGenerarImportacionDetalleFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleFacturaPuntoVenta")) {
				
				jButtonAbrirImportacionDetalleFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleFacturaPuntoVenta")) {
				jComboBoxTiposAccionesDetalleFacturaPuntoVentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleFacturaPuntoVenta")) {
				jComboBoxTiposRelacionesDetalleFacturaPuntoVentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleFacturaPuntoVenta")) {
				jComboBoxTiposAccionesDetalleFacturaPuntoVentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleFacturaPuntoVenta")) {
				
				jComboBoxTiposSeleccionarDetalleFacturaPuntoVentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleFacturaPuntoVenta")) {
				jTextFieldValorCampoGeneralDetalleFacturaPuntoVentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetalleFacturaPuntoVenta")) {
				jButtonAbrirOrderByDetalleFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleFacturaPuntoVenta")) {
				jButtonAbrirOrderByDetalleFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleFacturaPuntoVenta")) {
				jButtonCerrarOrderByDetalleFacturaPuntoVentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonidDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_factura_punto_ventaDetalleFacturaPuntoVentaUpdate")) {
				this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_factura_punto_ventaDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleFacturaPuntoVentaUpdate")) {
				this.jButtonid_empresaDetalleFacturaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonid_empresaDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleFacturaPuntoVentaUpdate")) {
				this.jButtonid_sucursalDetalleFacturaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonid_sucursalDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaDetalleFacturaPuntoVentaUpdate")) {
				this.jButtonid_bodegaDetalleFacturaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonid_bodegaDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoDetalleFacturaPuntoVenta")) {
				this.jButtonid_productoDetalleFacturaPuntoVentaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoDetalleFacturaPuntoVentaUpdate")) {
				this.jButtonid_productoDetalleFacturaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonid_productoDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadDetalleFacturaPuntoVentaUpdate")) {
				this.jButtonid_unidadDetalleFacturaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonid_unidadDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("serieDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonserieDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtoncantidadDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonprecioDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtondescuentoDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento_valorDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtondescuento_valorDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonivaDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iva_valorDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtoniva_valorDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtoniceDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ice_valorDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonice_valorDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sub_totalDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonsub_totalDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtontotalDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtondescripcionDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoDetalleFacturaPuntoVenta")) {
				this.jButtonid_productoDetalleFacturaPuntoVentaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBodegaDetalleFacturaPuntoVenta")) {
				this.jButtonFK_IdBodegaDetalleFacturaPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta")) {
				this.jButtonFK_IdFacturaPuntoVentaDetalleFacturaPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoDetalleFacturaPuntoVenta")) {
				this.jButtonFK_IdProductoDetalleFacturaPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadDetalleFacturaPuntoVenta")) {
				this.jButtonFK_IdUnidadDetalleFacturaPuntoVentaActionPerformed(evt);
			}
			
			;
			
			
			DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleFacturaPuntoVenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleFacturaPuntoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturapuntoventa);
				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
				
				


			if(sTipo.equals("cantidadDetalleFacturaPuntoVenta")) {
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("precioDetalleFacturaPuntoVenta")) {
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("descuentoDetalleFacturaPuntoVenta")) {
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("ivaDetalleFacturaPuntoVenta")) {
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("iceDetalleFacturaPuntoVenta")) {
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleFacturaPuntoVenta detallefacturapuntoventaLocal=null;
			
			if(!this.getEsControlTabla()) {
				detallefacturapuntoventaLocal=this.detallefacturapuntoventa;
			} else {
				detallefacturapuntoventaLocal=this.detallefacturapuntoventaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


				if(sTipo.equals("cantidadDetalleFacturaPuntoVenta")) {
					if(detallefacturapuntoventaLocal.getcantidad()==Integer.parseInt(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldcantidadDetalleFacturaPuntoVenta.getText())){existeCambio=false;};
				}
				 else if(sTipo.equals("precioDetalleFacturaPuntoVenta")) {
					if(detallefacturapuntoventaLocal.getprecio()==Double.parseDouble(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldprecioDetalleFacturaPuntoVenta.getText())){existeCambio=false;};
				}
				 else if(sTipo.equals("descuentoDetalleFacturaPuntoVenta")) {
					if(detallefacturapuntoventaLocal.getdescuento()==Double.parseDouble(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuentoDetalleFacturaPuntoVenta.getText())){existeCambio=false;};
				}
				 else if(sTipo.equals("ivaDetalleFacturaPuntoVenta")) {
					if(detallefacturapuntoventaLocal.getiva()==Double.parseDouble(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldivaDetalleFacturaPuntoVenta.getText())){existeCambio=false;};
				}
				 else if(sTipo.equals("iceDetalleFacturaPuntoVenta")) {
					if(detallefacturapuntoventaLocal.getice()==Double.parseDouble(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiceDetalleFacturaPuntoVenta.getText())){existeCambio=false;};
				}
			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturapuntoventa);
				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
							
				
				


			if(sTipo.equals("cantidadDetalleFacturaPuntoVenta")) {
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("precioDetalleFacturaPuntoVenta")) {
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("descuentoDetalleFacturaPuntoVenta")) {
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("ivaDetalleFacturaPuntoVenta")) {
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("iceDetalleFacturaPuntoVenta")) {
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleFacturaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaAnterior =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallefacturapuntoventaAnterior =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
			
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
			
			


			if(sTipo.equals("cantidadDetalleFacturaPuntoVenta")) {
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("precioDetalleFacturaPuntoVenta")) {
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("descuentoDetalleFacturaPuntoVenta")) {
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("ivaDetalleFacturaPuntoVenta")) {
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("iceDetalleFacturaPuntoVenta")) {
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			
			DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleFacturaPuntoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturapuntoventa);
				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
								
						
				


				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturaPuntoVenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturapuntoventa);
				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
								
				
				


				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleFacturaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaAnterior =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallefacturapuntoventaAnterior =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturapuntoventa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleFacturaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaAnterior =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallefacturapuntoventaAnterior =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleFacturaPuntoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturapuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallefacturapuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturapuntoventa);
				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
							
				
				


				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturaPuntoVenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleFacturaPuntoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturapuntoventaAnterior =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallefacturapuntoventaAnterior =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
			
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
			
			


			
			DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleFacturaPuntoVentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturapuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallefacturapuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturapuntoventa);
				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
								
				
				


			if(sTipo.equals("cantidadDetalleFacturaPuntoVenta")) {
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.LABEL,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"LABEL",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("precioDetalleFacturaPuntoVenta")) {
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.LABEL,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"LABEL",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("descuentoDetalleFacturaPuntoVenta")) {
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.LABEL,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"LABEL",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("ivaDetalleFacturaPuntoVenta")) {
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.LABEL,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"LABEL",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("iceDetalleFacturaPuntoVenta")) {
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.LABEL,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"LABEL",classes,false,esControlTabla);
			}
				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleFacturaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaAnterior =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallefacturapuntoventaAnterior =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleFacturaPuntoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturapuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallefacturapuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleFacturaPuntoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturapuntoventa);
				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleFacturaPuntoVenta")) {
					jCheckBoxSeleccionarTodosDetalleFacturaPuntoVentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleFacturaPuntoVenta")) {
					jCheckBoxSeleccionadosDetalleFacturaPuntoVentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleFacturaPuntoVenta")) {
					
				}
				
				


				
				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturapuntoventa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detallefacturapuntoventa);
				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
												
				
				


				
				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleFacturaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleFacturaPuntoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturapuntoventaAnterior =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallefacturapuntoventaAnterior =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleFacturaPuntoVentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturapuntoventa);
				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
				
				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
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
			
			


			if(sTipo.equals("id_bodegaDetalleFacturaPuntoVenta")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta;
				}

				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta,"FK_IdBodega");
				//recargarFormDetalleFacturaPuntoVentaBodega(jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoDetalleFacturaPuntoVenta")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta;
				}

				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta,"FK_IdProducto");
				//recargarFormDetalleFacturaPuntoVentaProducto(jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta,"FK_IdProducto");
			}
			
			DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleFacturaPuntoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturapuntoventa);
				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_bodegaDetalleFacturaPuntoVenta")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta;
				}

				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta,"FK_IdBodega");
				//recargarFormDetalleFacturaPuntoVentaBodega(jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoDetalleFacturaPuntoVenta")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta;
				}

				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta,"FK_IdProducto");
				//recargarFormDetalleFacturaPuntoVentaProducto(jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta,"FK_IdProducto");
			}
				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleFacturaPuntoVenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturaPuntoVenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturapuntoventa);
				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
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
				
				


			if(sTipo.equals("id_bodegaDetalleFacturaPuntoVenta")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta;
				}

				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta,"FK_IdBodega");
				//recargarFormDetalleFacturaPuntoVentaBodega(jComboBoxid_bodegaFK_IdBodegaDetalleFacturaPuntoVenta,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoDetalleFacturaPuntoVenta")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta;
				}

				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormDetalleFacturaPuntoVenta(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta,"FK_IdProducto");
				//recargarFormDetalleFacturaPuntoVentaProducto(jComboBoxid_productoFK_IdProductoDetalleFacturaPuntoVenta,"FK_IdProducto");
			}
				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleFacturaPuntoVenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleFacturaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturapuntoventaAnterior =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallefacturapuntoventaAnterior =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleFacturaPuntoVenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleFacturaPuntoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detallefacturapuntoventa =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detallefacturapuntoventa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleFacturaPuntoVenta")) {
				
				}
				
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleFacturaPuntoVenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleFacturaPuntoVenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleFacturaPuntoVenta")) {
			
			}
			
			DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleFacturaPuntoVenta();
			
			DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleFacturaPuntoVenta")) {
				jButtonNuevoDetalleFacturaPuntoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleFacturaPuntoVenta")) {
				jButtonDuplicarDetalleFacturaPuntoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleFacturaPuntoVenta")) {
				jButtonCopiarDetalleFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleFacturaPuntoVenta")) {
				jButtonVerFormDetalleFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleFacturaPuntoVenta")) {
				jButtonNuevoDetalleFacturaPuntoVentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleFacturaPuntoVenta")) {
				jButtonModificarDetalleFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleFacturaPuntoVenta")) {
				jButtonActualizarDetalleFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleFacturaPuntoVenta")) {
				jButtonEliminarDetalleFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleFacturaPuntoVenta")) {
				jButtonGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleFacturaPuntoVenta")) {
				jButtonCancelarDetalleFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleFacturaPuntoVenta")) {
				jButtonCerrarDetalleFacturaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleFacturaPuntoVenta")) {
				jButtonGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleFacturaPuntoVenta")) {
				jButtonNuevoGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleFacturaPuntoVenta")) {
				jButtonAbrirOrderByDetalleFacturaPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleFacturaPuntoVenta")) {
				jButtonRecargarInformacionDetalleFacturaPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleFacturaPuntoVenta")) {
				jButtonAnterioresDetalleFacturaPuntoVentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleFacturaPuntoVenta")) {
				jButtonSiguientesDetalleFacturaPuntoVentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonidDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_factura_punto_ventaDetalleFacturaPuntoVentaUpdate")) {
				this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_factura_punto_ventaDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleFacturaPuntoVentaUpdate")) {
				this.jButtonid_empresaDetalleFacturaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonid_empresaDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleFacturaPuntoVentaUpdate")) {
				this.jButtonid_sucursalDetalleFacturaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonid_sucursalDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaDetalleFacturaPuntoVentaUpdate")) {
				this.jButtonid_bodegaDetalleFacturaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonid_bodegaDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoDetalleFacturaPuntoVenta")) {
				this.jButtonid_productoDetalleFacturaPuntoVentaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoDetalleFacturaPuntoVentaUpdate")) {
				this.jButtonid_productoDetalleFacturaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonid_productoDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadDetalleFacturaPuntoVentaUpdate")) {
				this.jButtonid_unidadDetalleFacturaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonid_unidadDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("serieDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonserieDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtoncantidadDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonprecioDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtondescuentoDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento_valorDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtondescuento_valorDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonivaDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iva_valorDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtoniva_valorDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtoniceDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ice_valorDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonice_valorDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sub_totalDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtonsub_totalDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtontotalDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetalleFacturaPuntoVentaBusqueda")) {
				this.jButtondescripcionDetalleFacturaPuntoVentaBusquedaActionPerformed(evt);
			}
			
			DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleFacturaPuntoVenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleFacturaPuntoVenta")) {
				closingInternalFrameDetalleFacturaPuntoVenta();
				
			} else if(sTipo.equals("jButtonCancelarDetalleFacturaPuntoVenta")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleFacturaPuntoVenta = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleFacturaPuntoVentaBeanSwingJInternalFrame jInternalFrameParent=(DetalleFacturaPuntoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleFacturaPuntoVenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleFacturaPuntoVentaActionPerformed(null);
			}
			
			DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallefacturapuntoventa,new Object(),this.detallefacturapuntoventaParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleFacturaPuntoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleFacturaPuntoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleFacturaPuntoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detallefacturapuntoventa)) {
			if(!esControlTabla) {
				if(DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);			
				}
				
				if(this.detallefacturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallefacturapuntoventaReturnGeneral=detallefacturapuntoventaLogic.procesarEventosDetalleFacturaPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas(),this.detallefacturapuntoventa,this.detallefacturapuntoventaParameterGeneral,this.isEsNuevoDetalleFacturaPuntoVenta,classes);//this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleFacturaPuntoVenta(this.detallefacturapuntoventaReturnGeneral,this.detallefacturapuntoventaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detallefacturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleFacturaPuntoVenta(classes,this.detallefacturapuntoventaReturnGeneral,this.detallefacturapuntoventaBean,false);
					}
						
					if(this.detallefacturapuntoventaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleFacturaPuntoVenta(this.detallefacturapuntoventaReturnGeneral.getDetalleFacturaPuntoVenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleFacturaPuntoVenta(this.detallefacturapuntoventaReturnGeneral.getDetalleFacturaPuntoVenta());	
					}
						
					if(this.detallefacturapuntoventaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleFacturaPuntoVenta(this.detallefacturapuntoventaReturnGeneral.getDetalleFacturaPuntoVenta(),classes);//this.detallefacturapuntoventaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,classes);//this.detallefacturapuntoventaBean);									
				}
			
				if(DetalleFacturaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleFacturaPuntoVenta(this.detallefacturapuntoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturaPuntoVenta(this.detallefacturapuntoventa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detallefacturapuntoventaAnterior!=null) {
						this.detallefacturapuntoventa=this.detallefacturapuntoventaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallefacturapuntoventaReturnGeneral=detallefacturapuntoventaLogic.procesarEventosDetalleFacturaPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas(),this.detallefacturapuntoventa,this.detallefacturapuntoventaParameterGeneral,this.isEsNuevoDetalleFacturaPuntoVenta,classes);//this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallefacturapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detallefacturapuntoventaReturnGeneral.getDetalleFacturaPuntoVenta(),detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detallefacturapuntoventaReturnGeneral.getDetalleFacturaPuntoVenta(),this.detallefacturapuntoventas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleFacturaPuntoVenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleFacturaPuntoVenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleFacturaPuntoVenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleFacturaPuntoVenta() throws Exception {
		
		DetalleFacturaPuntoVentaModel detallefacturapuntoventaModel=(DetalleFacturaPuntoVentaModel)this.jTableDatosDetalleFacturaPuntoVenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallefacturapuntoventaModel.detallefacturapuntoventas=this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detallefacturapuntoventaModel.detallefacturapuntoventas=this.detallefacturapuntoventas;
		}
		
		
		((DetalleFacturaPuntoVentaModel) this.jTableDatosDetalleFacturaPuntoVenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleFacturaPuntoVenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetallefacturapuntoventaAnterior(),this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetallefacturapuntoventaAnterior(),this.detallefacturapuntoventas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleFacturaPuntoVenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleFacturaPuntoVenta(DetalleFacturaPuntoVenta detallefacturapuntoventa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
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
										
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallefacturapuntoventa,new Object(),generalEntityParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsOfDetalleFacturaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleFacturaPuntoVentaConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleFacturaPuntoVenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleFacturaPuntoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallefacturapuntoventa,new Object(),generalEntityParameterGeneral,this.detallefacturapuntoventaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleFacturaPuntoVenta(DetalleFacturaPuntoVentaBean detallefacturapuntoventaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleFacturaPuntoVenta(ArrayList<Classe> classes,DetalleFacturaPuntoVentaReturnGeneral detallefacturapuntoventaReturnGeneral,DetalleFacturaPuntoVentaBean detallefacturapuntoventaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleFacturaPuntoVenta(DetalleFacturaPuntoVenta detallefacturapuntoventa,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detallefacturapuntoventa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta = new DetalleFacturaPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.detallefacturapuntoventaSessionBean.getConGuardarRelaciones(),this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.setVisible(false);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.detallefacturapuntoventaLogic=this.detallefacturapuntoventaLogic;
		
		this.cargarCombosFrameForeignKeyDetalleFacturaPuntoVenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleFacturaPuntoVenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleFacturaPuntoVenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleFacturaPuntoVenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleFacturaPuntoVenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleFacturaPuntoVenta"));
		
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonModificarDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarDetalleFacturaPuntoVenta"));

		
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonModificarToolBarDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleFacturaPuntoVenta"));
					
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jMenuItemModificarDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleFacturaPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonActualizarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"ActualizarDetalleFacturaPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonActualizarToolBarDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleFacturaPuntoVenta"));
						
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jMenuItemActualizarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleFacturaPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonEliminarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarDetalleFacturaPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonEliminarToolBarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleFacturaPuntoVenta"));
								
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jMenuItemEliminarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleFacturaPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonCancelarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarDetalleFacturaPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonCancelarToolBarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleFacturaPuntoVenta"));
					
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jMenuItemCancelarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleFacturaPuntoVenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jMenuItemDetalleCerrarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleFacturaPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonGuardarCambiosToolBarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleFacturaPuntoVenta"));
		
		
		
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonGuardarCambiosToolBarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleFacturaPuntoVenta"));
		
		
		
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleFacturaPuntoVenta"));
		
		
		//CAMPO EVENTO
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldcantidadDetalleFacturaPuntoVenta.addFocusListener(new TextFieldFocusListener(this,"cantidadDetalleFacturaPuntoVenta"));
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldcantidadDetalleFacturaPuntoVenta.addActionListener(new TextFieldActionListener(this,"cantidadDetalleFacturaPuntoVenta"));
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldcantidadDetalleFacturaPuntoVenta.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldcantidadDetalleFacturaPuntoVenta,"cantidadDetalleFacturaPuntoVenta"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldprecioDetalleFacturaPuntoVenta.addFocusListener(new TextFieldFocusListener(this,"precioDetalleFacturaPuntoVenta"));
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldprecioDetalleFacturaPuntoVenta.addActionListener(new TextFieldActionListener(this,"precioDetalleFacturaPuntoVenta"));
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldprecioDetalleFacturaPuntoVenta.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldprecioDetalleFacturaPuntoVenta,"precioDetalleFacturaPuntoVenta"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuentoDetalleFacturaPuntoVenta.addFocusListener(new TextFieldFocusListener(this,"descuentoDetalleFacturaPuntoVenta"));
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuentoDetalleFacturaPuntoVenta.addActionListener(new TextFieldActionListener(this,"descuentoDetalleFacturaPuntoVenta"));
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuentoDetalleFacturaPuntoVenta.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFielddescuentoDetalleFacturaPuntoVenta,"descuentoDetalleFacturaPuntoVenta"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldivaDetalleFacturaPuntoVenta.addFocusListener(new TextFieldFocusListener(this,"ivaDetalleFacturaPuntoVenta"));
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldivaDetalleFacturaPuntoVenta.addActionListener(new TextFieldActionListener(this,"ivaDetalleFacturaPuntoVenta"));
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldivaDetalleFacturaPuntoVenta.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldivaDetalleFacturaPuntoVenta,"ivaDetalleFacturaPuntoVenta"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiceDetalleFacturaPuntoVenta.addFocusListener(new TextFieldFocusListener(this,"iceDetalleFacturaPuntoVenta"));
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiceDetalleFacturaPuntoVenta.addActionListener(new TextFieldActionListener(this,"iceDetalleFacturaPuntoVenta"));
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiceDetalleFacturaPuntoVenta.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldiceDetalleFacturaPuntoVenta,"iceDetalleFacturaPuntoVenta"));


				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonidDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleFacturaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_factura_punto_ventaDetalleFacturaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_factura_punto_ventaDetalleFacturaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_empresaDetalleFacturaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleFacturaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_empresaDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleFacturaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_sucursalDetalleFacturaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleFacturaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_sucursalDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleFacturaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_bodegaDetalleFacturaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleFacturaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_bodegaDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleFacturaPuntoVentaBusqueda"));
		//jButtonid_productoDetalleFacturaPuntoVenta.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoDetalleFacturaPuntoVentaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_productoDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"id_productoDetalleFacturaPuntoVenta"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_productoDetalleFacturaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_productoDetalleFacturaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_productoDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDetalleFacturaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_unidadDetalleFacturaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_unidadDetalleFacturaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_unidadDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonserieDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"serieDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtoncantidadDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"cantidadDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonprecioDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"precioDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtondescuentoDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtondescuento_valorDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"descuento_valorDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonivaDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"ivaDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtoniva_valorDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"iva_valorDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtoniceDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"iceDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonice_valorDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"ice_valorDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonsub_totalDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"sub_totalDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtontotalDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"totalDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtondescripcionDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleFacturaPuntoVentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTabbedPaneRelacionesDetalleFacturaPuntoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleFacturaPuntoVenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleFacturaPuntoVenta"));
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleFacturaPuntoVenta"));
		}
		
		this.jTableDatosDetalleFacturaPuntoVenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleFacturaPuntoVenta"));
		
		this.jTableDatosDetalleFacturaPuntoVenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleFacturaPuntoVenta"));
		
		this.jButtonNuevoDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoDetalleFacturaPuntoVenta"));
		
		this.jButtonDuplicarDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"DuplicarDetalleFacturaPuntoVenta"));
		
		this.jButtonCopiarDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"CopiarDetalleFacturaPuntoVenta"));
		
		this.jButtonVerFormDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"VerFormDetalleFacturaPuntoVenta"));
		
		
		this.jButtonNuevoToolBarDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleFacturaPuntoVenta"));
			
		this.jButtonDuplicarToolBarDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleFacturaPuntoVenta"));
			
		this.jMenuItemNuevoDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleFacturaPuntoVenta"));
			
		this.jMenuItemDuplicarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleFacturaPuntoVenta"));		
		
		
		this.jButtonNuevoRelacionesDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleFacturaPuntoVenta"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleFacturaPuntoVenta"));
			
		this.jMenuItemNuevoRelacionesDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleFacturaPuntoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonModificarDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarDetalleFacturaPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonModificarToolBarDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleFacturaPuntoVenta"));
			
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jMenuItemModificarDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleFacturaPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonActualizarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"ActualizarDetalleFacturaPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonActualizarToolBarDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleFacturaPuntoVenta"));
				
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jMenuItemActualizarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleFacturaPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonEliminarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarDetalleFacturaPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonEliminarToolBarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleFacturaPuntoVenta"));
						
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jMenuItemEliminarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleFacturaPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonCancelarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarDetalleFacturaPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonCancelarToolBarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleFacturaPuntoVenta"));
			
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jMenuItemCancelarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleFacturaPuntoVenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleFacturaPuntoVenta"));		
		
		
		this.jButtonCerrarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarDetalleFacturaPuntoVenta"));
		
		
		this.jButtonCerrarToolBarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleFacturaPuntoVenta"));
			
		this.jMenuItemCerrarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleFacturaPuntoVenta"));
			
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jMenuItemDetalleCerrarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleFacturaPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonGuardarCambiosDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleFacturaPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonGuardarCambiosToolBarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleFacturaPuntoVenta"));
		}
		
		this.jButtonCopiarToolBarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleFacturaPuntoVenta"));
			
		this.jButtonVerFormToolBarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleFacturaPuntoVenta"));
		
		this.jMenuItemGuardarCambiosDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleFacturaPuntoVenta"));
			
		this.jMenuItemCopiarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleFacturaPuntoVenta"));		
		
		this.jMenuItemVerFormDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleFacturaPuntoVenta"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleFacturaPuntoVenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleFacturaPuntoVenta"));
			
		this.jMenuItemGuardarCambiosTablaDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleFacturaPuntoVenta"));		
		
		
		
		this.jButtonRecargarInformacionDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleFacturaPuntoVenta"));
					
		this.jButtonRecargarInformacionToolBarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleFacturaPuntoVenta"));
		
		this.jMenuItemRecargarInformacionDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleFacturaPuntoVenta"));		
		
		
		
		this.jButtonAnterioresDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"AnterioresDetalleFacturaPuntoVenta"));
		
		
		this.jButtonAnterioresToolBarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleFacturaPuntoVenta"));
		
		this.jMenuItemAnterioresDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleFacturaPuntoVenta"));		
		
		
		this.jButtonSiguientesDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"SiguientesDetalleFacturaPuntoVenta"));
		
		
		this.jButtonSiguientesToolBarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleFacturaPuntoVenta"));
			
		this.jMenuItemSiguientesDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleFacturaPuntoVenta"));
			
		this.jMenuItemAbrirOrderByDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleFacturaPuntoVenta"));
			
		this.jMenuItemMostrarOcultarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleFacturaPuntoVenta"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleFacturaPuntoVenta"));
			
		this.jMenuItemDetalleMostarOcultarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleFacturaPuntoVenta"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleFacturaPuntoVenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleFacturaPuntoVenta"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleFacturaPuntoVenta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleFacturaPuntoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleFacturaPuntoVenta"));

		this.jCheckBoxSeleccionadosDetalleFacturaPuntoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleFacturaPuntoVenta"));
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleFacturaPuntoVenta"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleFacturaPuntoVenta"));
			
		this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleFacturaPuntoVenta"));
					
		this.jComboBoxTiposSeleccionarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleFacturaPuntoVenta"));
			
		this.jTextFieldValorCampoGeneralDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleFacturaPuntoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
		
		//CAMPO EVENTO
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldcantidadDetalleFacturaPuntoVenta.addFocusListener(new TextFieldFocusListener(this,"cantidadDetalleFacturaPuntoVenta"));
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldcantidadDetalleFacturaPuntoVenta.addActionListener(new TextFieldActionListener(this,"cantidadDetalleFacturaPuntoVenta"));
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldcantidadDetalleFacturaPuntoVenta.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldcantidadDetalleFacturaPuntoVenta,"cantidadDetalleFacturaPuntoVenta"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldprecioDetalleFacturaPuntoVenta.addFocusListener(new TextFieldFocusListener(this,"precioDetalleFacturaPuntoVenta"));
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldprecioDetalleFacturaPuntoVenta.addActionListener(new TextFieldActionListener(this,"precioDetalleFacturaPuntoVenta"));
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldprecioDetalleFacturaPuntoVenta.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldprecioDetalleFacturaPuntoVenta,"precioDetalleFacturaPuntoVenta"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuentoDetalleFacturaPuntoVenta.addFocusListener(new TextFieldFocusListener(this,"descuentoDetalleFacturaPuntoVenta"));
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuentoDetalleFacturaPuntoVenta.addActionListener(new TextFieldActionListener(this,"descuentoDetalleFacturaPuntoVenta"));
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuentoDetalleFacturaPuntoVenta.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFielddescuentoDetalleFacturaPuntoVenta,"descuentoDetalleFacturaPuntoVenta"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldivaDetalleFacturaPuntoVenta.addFocusListener(new TextFieldFocusListener(this,"ivaDetalleFacturaPuntoVenta"));
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldivaDetalleFacturaPuntoVenta.addActionListener(new TextFieldActionListener(this,"ivaDetalleFacturaPuntoVenta"));
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldivaDetalleFacturaPuntoVenta.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldivaDetalleFacturaPuntoVenta,"ivaDetalleFacturaPuntoVenta"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiceDetalleFacturaPuntoVenta.addFocusListener(new TextFieldFocusListener(this,"iceDetalleFacturaPuntoVenta"));
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiceDetalleFacturaPuntoVenta.addActionListener(new TextFieldActionListener(this,"iceDetalleFacturaPuntoVenta"));
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiceDetalleFacturaPuntoVenta.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldiceDetalleFacturaPuntoVenta,"iceDetalleFacturaPuntoVenta"));


		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonidDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleFacturaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_factura_punto_ventaDetalleFacturaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_factura_punto_ventaDetalleFacturaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_empresaDetalleFacturaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleFacturaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_empresaDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleFacturaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_sucursalDetalleFacturaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleFacturaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_sucursalDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleFacturaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_bodegaDetalleFacturaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleFacturaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_bodegaDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleFacturaPuntoVentaBusqueda"));
		//jButtonid_productoDetalleFacturaPuntoVenta.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoDetalleFacturaPuntoVentaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_productoDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"id_productoDetalleFacturaPuntoVenta"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_productoDetalleFacturaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_productoDetalleFacturaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_productoDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDetalleFacturaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_unidadDetalleFacturaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_unidadDetalleFacturaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_unidadDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonserieDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"serieDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtoncantidadDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"cantidadDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonprecioDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"precioDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtondescuentoDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtondescuento_valorDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"descuento_valorDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonivaDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"ivaDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtoniva_valorDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"iva_valorDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtoniceDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"iceDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonice_valorDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"ice_valorDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonsub_totalDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"sub_totalDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtontotalDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"totalDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtondescripcionDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleFacturaPuntoVentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdBodegaDetalleFacturaPuntoVenta"));

			this.jButtonFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta"));

			this.jButtonFK_IdProductoDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdProductoDetalleFacturaPuntoVenta"));

			this.jButtonBuscarFK_IdProductoid_productoDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"id_productoDetalleFacturaPuntoVenta"));

			this.jButtonFK_IdUnidadDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdUnidadDetalleFacturaPuntoVenta"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleFacturaPuntoVenta"));
				this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleFacturaPuntoVenta"));
				this.jInternalFrameReporteDinamicoDetalleFacturaPuntoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleFacturaPuntoVenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleFacturaPuntoVenta"));				
			//this.jButtonGenerarReporteDinamicoDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleFacturaPuntoVenta"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleFacturaPuntoVenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleFacturaPuntoVenta!=null) {
				this.jInternalFrameImportacionDetalleFacturaPuntoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleFacturaPuntoVenta"));
				this.jInternalFrameImportacionDetalleFacturaPuntoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleFacturaPuntoVenta"));
				this.jInternalFrameImportacionDetalleFacturaPuntoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleFacturaPuntoVenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleFacturaPuntoVenta"));
			
			this.jButtonAbrirOrderByToolBarDetalleFacturaPuntoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleFacturaPuntoVenta"));			
			
			if(this.jInternalFrameOrderByDetalleFacturaPuntoVenta!=null) {
				this.jInternalFrameOrderByDetalleFacturaPuntoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleFacturaPuntoVenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTabbedPaneRelacionesDetalleFacturaPuntoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleFacturaPuntoVenta"));
		
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
            		closingInternalFrameDetalleFacturaPuntoVenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleFacturaPuntoVenta = (JInternalFrameBase)event.getSource();
	            	
	            DetalleFacturaPuntoVentaBeanSwingJInternalFrame jInternalFrameParent=(DetalleFacturaPuntoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleFacturaPuntoVenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleFacturaPuntoVentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleFacturaPuntoVenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleFacturaPuntoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleFacturaPuntoVenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleFacturaPuntoVenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleFacturaPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleFacturaPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleFacturaPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleFacturaPuntoVenta";
		inputMap = this.jButtonNuevoDetalleFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleFacturaPuntoVentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleFacturaPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleFacturaPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleFacturaPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleFacturaPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesDetalleFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleFacturaPuntoVentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleFacturaPuntoVenta";
		inputMap = this.jButtonModificarDetalleFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleFacturaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleFacturaPuntoVenta";
		inputMap = this.jButtonActualizarDetalleFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleFacturaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleFacturaPuntoVenta";
		inputMap = this.jButtonEliminarDetalleFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleFacturaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleFacturaPuntoVenta";
		inputMap = this.jButtonCancelarDetalleFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleFacturaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleFacturaPuntoVenta";
		inputMap = this.jButtonCerrarDetalleFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleFacturaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonGuardarCambiosDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleFacturaPuntoVenta";
		inputMap = this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonGuardarCambiosDetalleFacturaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonGuardarCambiosDetalleFacturaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleFacturaPuntoVenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleFacturaPuntoVentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleFacturaPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleFacturaPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleFacturaPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleFacturaPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleFacturaPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonidDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleFacturaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_factura_punto_ventaDetalleFacturaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_factura_punto_ventaDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_factura_punto_ventaDetalleFacturaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_empresaDetalleFacturaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleFacturaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_empresaDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleFacturaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_sucursalDetalleFacturaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleFacturaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_sucursalDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleFacturaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_bodegaDetalleFacturaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleFacturaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_bodegaDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleFacturaPuntoVentaBusqueda"));
		//jButtonid_productoDetalleFacturaPuntoVenta.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoDetalleFacturaPuntoVentaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_productoDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"id_productoDetalleFacturaPuntoVenta"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_productoDetalleFacturaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_productoDetalleFacturaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_productoDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDetalleFacturaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_unidadDetalleFacturaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_unidadDetalleFacturaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_unidadDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonserieDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"serieDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtoncantidadDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"cantidadDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonprecioDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"precioDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtondescuentoDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtondescuento_valorDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"descuento_valorDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonivaDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"ivaDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtoniva_valorDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"iva_valorDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtoniceDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"iceDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonice_valorDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"ice_valorDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonsub_totalDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"sub_totalDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtontotalDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"totalDetalleFacturaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtondescripcionDetalleFacturaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleFacturaPuntoVentaBusqueda"));
		
		
		this.jButtonFK_IdBodegaDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdBodegaDetalleFacturaPuntoVenta"));

		this.jButtonFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta"));

		this.jButtonFK_IdProductoDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdProductoDetalleFacturaPuntoVenta"));

		this.jButtonBuscarFK_IdProductoid_productoDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"id_productoDetalleFacturaPuntoVenta"));

		this.jButtonFK_IdUnidadDetalleFacturaPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdUnidadDetalleFacturaPuntoVenta"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleFacturaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleFacturaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleFacturaPuntoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleFacturaPuntoVenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleFacturaPuntoVenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas()) {
					detallefacturapuntoventaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:detallefacturapuntoventas) {
					detallefacturapuntoventaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleFacturaPuntoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas()) {
						detallefacturapuntoventaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:detallefacturapuntoventas) {
						detallefacturapuntoventaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:detallefacturapuntoventas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleFacturaPuntoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleFacturaPuntoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleFacturaPuntoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleFacturaPuntoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleFacturaPuntoVenta.getSelectedRows();
			
			DetalleFacturaPuntoVenta detallefacturapuntoventaLocal=new DetalleFacturaPuntoVenta();
			
			//this.seleccionarTodosDetalleFacturaPuntoVenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallefacturapuntoventaLocal =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas().toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detallefacturapuntoventaLocal =(DetalleFacturaPuntoVenta) this.detallefacturapuntoventas.toArray()[this.jTableDatosDetalleFacturaPuntoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detallefacturapuntoventaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas()) {
						detallefacturapuntoventaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:detallefacturapuntoventas) {
						detallefacturapuntoventaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleFacturaPuntoVenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleFacturaPuntoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleFacturaPuntoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturaPuntoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleFacturaPuntoVentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleFacturaPuntoVentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleFacturaPuntoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleFacturaPuntoVenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas()) {
				
						if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SERIE)) {
							existe=true;
							detallefacturapuntoventaAux.setserie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							detallefacturapuntoventaAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							detallefacturapuntoventaAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							detallefacturapuntoventaAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR)) {
							existe=true;
							detallefacturapuntoventaAux.setdescuento_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVA)) {
							existe=true;
							detallefacturapuntoventaAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVAVALOR)) {
							existe=true;
							detallefacturapuntoventaAux.setiva_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICE)) {
							existe=true;
							detallefacturapuntoventaAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICEVALOR)) {
							existe=true;
							detallefacturapuntoventaAux.setice_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							detallefacturapuntoventaAux.setsub_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							detallefacturapuntoventaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detallefacturapuntoventaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:detallefacturapuntoventas) {
					
						if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SERIE)) {
							existe=true;
							detallefacturapuntoventaAux.setserie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							detallefacturapuntoventaAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							detallefacturapuntoventaAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							detallefacturapuntoventaAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR)) {
							existe=true;
							detallefacturapuntoventaAux.setdescuento_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVA)) {
							existe=true;
							detallefacturapuntoventaAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVAVALOR)) {
							existe=true;
							detallefacturapuntoventaAux.setiva_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICE)) {
							existe=true;
							detallefacturapuntoventaAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICEVALOR)) {
							existe=true;
							detallefacturapuntoventaAux.setice_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							detallefacturapuntoventaAux.setsub_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							detallefacturapuntoventaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detallefacturapuntoventaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleFacturaPuntoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleFacturaPuntoVentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleFacturaPuntoVenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleFacturaPuntoVenta) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleFacturaPuntoVenta(conSplash);
				
					this.generarReporteDetalleFacturaPuntoVentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleFacturaPuntoVentasSeleccionados();
				//this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleFacturaPuntoVentasSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleFacturaPuntoVentasSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleFacturaPuntoVenta();
				
				this.exportarDetalleFacturaPuntoVentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleFacturaPuntoVentas();
				//this.importarDetalleFacturaPuntoVentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleFacturaPuntoVenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleFacturaPuntoVentasSeleccionados();
				//this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleFacturaPuntoVenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleFacturaPuntoVenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleFacturaPuntoVenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Factura",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleFacturaPuntoVentaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleFacturaPuntoVenta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleFacturaPuntoVenta(conSplash);
					
						//this.actualizarParametrosGeneralDetalleFacturaPuntoVenta();
						
						this.generarReporteProcesoAccionDetalleFacturaPuntoVentasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle FacturaS SELECCIONADOS?", "MANTENIMIENTO DE Detalle Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleFacturaPuntoVenta();
				
						this.actualizarParametrosGeneralDetalleFacturaPuntoVenta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detallefacturapuntoventaReturnGeneral=detallefacturapuntoventaLogic.procesarAccionDetalleFacturaPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas(),this.detallefacturapuntoventaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleFacturaPuntoVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleFacturaPuntoVenta();
					
					DetalleFacturaPuntoVentaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleFacturaPuntoVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleFacturaPuntoVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxTiposAccionesFormularioDetalleFacturaPuntoVenta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleFacturaPuntoVenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleFacturaPuntoVentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleFacturaPuntoVenta();
			
			if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleFacturaPuntoVenta> detallefacturapuntoventasSeleccionados=new ArrayList<DetalleFacturaPuntoVenta>();		
			DetalleFacturaPuntoVenta detallefacturapuntoventa=new DetalleFacturaPuntoVenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleFacturaPuntoVenta.getSelectedItem();
			
			
			
			
			detallefacturapuntoventasSeleccionados=this.getDetalleFacturaPuntoVentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(detallefacturapuntoventasSeleccionados.size()==1) {
				for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:detallefacturapuntoventasSeleccionados) {
					detallefacturapuntoventa=detallefacturapuntoventaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleFacturaPuntoVenta();
			
      		//this.finishProcessDetalleFacturaPuntoVenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleFacturaPuntoVentaReturnGeneral() throws Exception {
		if(this.detallefacturapuntoventaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detallefacturapuntoventaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detallefacturapuntoventaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detallefacturapuntoventaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detallefacturapuntoventaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detallefacturapuntoventaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
		}
		
		if(this.detallefacturapuntoventaReturnGeneral.getConRetornoLista() || this.detallefacturapuntoventaReturnGeneral.getConRetornoObjeto()) {
			if(this.detallefacturapuntoventaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallefacturapuntoventaLogic.setDetalleFacturaPuntoVentas(this.detallefacturapuntoventaReturnGeneral.getDetalleFacturaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detallefacturapuntoventaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallefacturapuntoventaLogic.setDetalleFacturaPuntoVenta(this.detallefacturapuntoventaReturnGeneral.getDetalleFacturaPuntoVenta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetalleFacturaPuntoVenta(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleFacturaPuntoVenta() throws Exception {
		
		
	}
	
	public ArrayList<DetalleFacturaPuntoVenta> getDetalleFacturaPuntoVentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleFacturaPuntoVenta> detallefacturapuntoventasSeleccionados=new ArrayList<DetalleFacturaPuntoVenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleFacturaPuntoVenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas()) {
					if(detallefacturapuntoventaAux.getIsSelected()) {
						detallefacturapuntoventasSeleccionados.add(detallefacturapuntoventaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:this.detallefacturapuntoventas) {
					if(detallefacturapuntoventaAux.getIsSelected()) {
						detallefacturapuntoventasSeleccionados.add(detallefacturapuntoventaAux);				
					}
				}
			}
			
			if(detallefacturapuntoventasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detallefacturapuntoventasSeleccionados.addAll(this.detallefacturapuntoventaLogic.getDetalleFacturaPuntoVentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detallefacturapuntoventasSeleccionados.addAll(this.detallefacturapuntoventas);				
					}
				}
			}
		} else {
			detallefacturapuntoventasSeleccionados.add(this.detallefacturapuntoventa);
		}
		
		return detallefacturapuntoventasSeleccionados;
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
	
	public void generarReporteDetalleFacturaPuntoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleFacturaPuntoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleFacturaPuntoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleFacturaPuntoVentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleFacturaPuntoVentasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Factura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleFacturaPuntoVentasSeleccionados() throws Exception {
		ArrayList<DetalleFacturaPuntoVenta> detallefacturapuntoventasSeleccionados=new ArrayList<DetalleFacturaPuntoVenta>();		
		
		detallefacturapuntoventasSeleccionados=this.getDetalleFacturaPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleFacturaPuntoVentas("Todos",detallefacturapuntoventasSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleFacturaPuntoVentasSeleccionados() throws Exception {
		ArrayList<DetalleFacturaPuntoVenta> detallefacturapuntoventasSeleccionados=new ArrayList<DetalleFacturaPuntoVenta>();		
		
		detallefacturapuntoventasSeleccionados=this.getDetalleFacturaPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleFacturaPuntoVentas("Todos",detallefacturapuntoventasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleFacturaPuntoVentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleFacturaPuntoVenta> detallefacturapuntoventasSeleccionados=new ArrayList<DetalleFacturaPuntoVenta>();
		
		detallefacturapuntoventasSeleccionados=this.getDetalleFacturaPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleFacturaPuntoVentas("Todos",detallefacturapuntoventasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleFacturaPuntoVentasSeleccionados() throws Exception {
		ArrayList<DetalleFacturaPuntoVenta> detallefacturapuntoventasSeleccionados=new ArrayList<DetalleFacturaPuntoVenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleFacturaPuntoVenta();
		
		
		detallefacturapuntoventasSeleccionados=this.getDetalleFacturaPuntoVentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleFacturaPuntoVenta();
		
		
		//this.generarReporteDetalleFacturaPuntoVentas("Todos",detallefacturapuntoventasSeleccionados ,detallefacturapuntoventaImplementable,detallefacturapuntoventaImplementableHome);
	}
	
	public void mostrarImportacionDetalleFacturaPuntoVentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleFacturaPuntoVenta();
		
		this.abrirFrameImportacionDetalleFacturaPuntoVenta();		
		
			
		//this.generarReporteDetalleFacturaPuntoVentas("Todos",detallefacturapuntoventasSeleccionados ,detallefacturapuntoventaImplementable,detallefacturapuntoventaImplementableHome);
	}
	
	public void importarDetalleFacturaPuntoVentas() throws Exception {		
	
	}
	
	public void exportarDetalleFacturaPuntoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleFacturaPuntoVentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleFacturaPuntoVentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleFacturaPuntoVentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Factura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleFacturaPuntoVentasSeleccionados() throws Exception {
		ArrayList<DetalleFacturaPuntoVenta> detallefacturapuntoventasSeleccionados=new ArrayList<DetalleFacturaPuntoVenta>();		
		
		detallefacturapuntoventasSeleccionados=this.getDetalleFacturaPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallefacturapuntoventa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleFacturaPuntoVenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:detallefacturapuntoventasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleFacturaPuntoVenta(detallefacturapuntoventaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detallefacturapuntoventaAux.setsDetalleGeneralEntityReporte(detallefacturapuntoventaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleFacturaPuntoVenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturaPuntoVentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SERIE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturaPuntoVentaConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturaPuntoVentaConstantesFunciones.LABEL_PRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVAVALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICEVALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SUBTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturaPuntoVentaConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleFacturaPuntoVenta(DetalleFacturaPuntoVenta detallefacturapuntoventa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detallefacturapuntoventa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturapuntoventa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturapuntoventa.getfacturapuntoventa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturapuntoventa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturapuntoventa.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturapuntoventa.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturapuntoventa.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturapuntoventa.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturapuntoventa.getserie();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturapuntoventa.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturapuntoventa.getprecio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturapuntoventa.getdescuento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturapuntoventa.getdescuento_valor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturapuntoventa.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturapuntoventa.getiva_valor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturapuntoventa.getice().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturapuntoventa.getice_valor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturapuntoventa.getsub_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturapuntoventa.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturapuntoventa.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleFacturaPuntoVentasSeleccionados() throws Exception {
		ArrayList<DetalleFacturaPuntoVenta> detallefacturapuntoventasSeleccionados=new ArrayList<DetalleFacturaPuntoVenta>();		
		
		detallefacturapuntoventasSeleccionados=this.getDetalleFacturaPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallefacturapuntoventa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleFacturaPuntoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleFacturaPuntoVenta(row);				
				iRow++;
			}				
			
			for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:detallefacturapuntoventasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleFacturaPuntoVenta(detallefacturapuntoventaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleFacturaPuntoVentasSeleccionados() throws Exception {
		ArrayList<DetalleFacturaPuntoVenta> detallefacturapuntoventasSeleccionados=new ArrayList<DetalleFacturaPuntoVenta>();		
		
		detallefacturapuntoventasSeleccionados=this.getDetalleFacturaPuntoVentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallefacturapuntoventa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detallefacturapuntoventas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detallefacturapuntoventa");
			//elementRoot.appendChild(element);
		
			for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:detallefacturapuntoventasSeleccionados) {
				element = document.createElement("detallefacturapuntoventa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleFacturaPuntoVenta(detallefacturapuntoventaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleFacturaPuntoVenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SERIE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_PRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTOVALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IVAVALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_ICEVALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SUBTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleFacturaPuntoVenta(DetalleFacturaPuntoVenta detallefacturapuntoventa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturapuntoventa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturapuntoventa.getfacturapuntoventa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturapuntoventa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturapuntoventa.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturapuntoventa.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturapuntoventa.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturapuntoventa.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturapuntoventa.getserie());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturapuntoventa.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturapuntoventa.getprecio());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturapuntoventa.getdescuento());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturapuntoventa.getdescuento_valor());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturapuntoventa.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturapuntoventa.getiva_valor());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturapuntoventa.getice());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturapuntoventa.getice_valor());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturapuntoventa.getsub_total());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturapuntoventa.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturapuntoventa.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlDetalleFacturaPuntoVenta(DetalleFacturaPuntoVenta detallefacturapuntoventa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleFacturaPuntoVentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detallefacturapuntoventa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleFacturaPuntoVentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detallefacturapuntoventa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementfacturapuntoventa_descripcion = document.createElement(DetalleFacturaPuntoVentaConstantesFunciones.IDFACTURAPUNTOVENTA);
		elementfacturapuntoventa_descripcion.appendChild(document.createTextNode(detallefacturapuntoventa.getfacturapuntoventa_descripcion()));
		element.appendChild(elementfacturapuntoventa_descripcion);

		Element elementempresa_descripcion = document.createElement(DetalleFacturaPuntoVentaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detallefacturapuntoventa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DetalleFacturaPuntoVentaConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(detallefacturapuntoventa.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(DetalleFacturaPuntoVentaConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(detallefacturapuntoventa.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(DetalleFacturaPuntoVentaConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(detallefacturapuntoventa.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementunidad_descripcion = document.createElement(DetalleFacturaPuntoVentaConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(detallefacturapuntoventa.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementserie = document.createElement(DetalleFacturaPuntoVentaConstantesFunciones.SERIE);
		elementserie.appendChild(document.createTextNode(detallefacturapuntoventa.getserie().trim()));
		element.appendChild(elementserie);

		Element elementcantidad = document.createElement(DetalleFacturaPuntoVentaConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(detallefacturapuntoventa.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementprecio = document.createElement(DetalleFacturaPuntoVentaConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(detallefacturapuntoventa.getprecio().toString().trim()));
		element.appendChild(elementprecio);

		Element elementdescuento = document.createElement(DetalleFacturaPuntoVentaConstantesFunciones.DESCUENTO);
		elementdescuento.appendChild(document.createTextNode(detallefacturapuntoventa.getdescuento().toString().trim()));
		element.appendChild(elementdescuento);

		Element elementdescuento_valor = document.createElement(DetalleFacturaPuntoVentaConstantesFunciones.DESCUENTOVALOR);
		elementdescuento_valor.appendChild(document.createTextNode(detallefacturapuntoventa.getdescuento_valor().toString().trim()));
		element.appendChild(elementdescuento_valor);

		Element elementiva = document.createElement(DetalleFacturaPuntoVentaConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(detallefacturapuntoventa.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementiva_valor = document.createElement(DetalleFacturaPuntoVentaConstantesFunciones.IVAVALOR);
		elementiva_valor.appendChild(document.createTextNode(detallefacturapuntoventa.getiva_valor().toString().trim()));
		element.appendChild(elementiva_valor);

		Element elementice = document.createElement(DetalleFacturaPuntoVentaConstantesFunciones.ICE);
		elementice.appendChild(document.createTextNode(detallefacturapuntoventa.getice().toString().trim()));
		element.appendChild(elementice);

		Element elementice_valor = document.createElement(DetalleFacturaPuntoVentaConstantesFunciones.ICEVALOR);
		elementice_valor.appendChild(document.createTextNode(detallefacturapuntoventa.getice_valor().toString().trim()));
		element.appendChild(elementice_valor);

		Element elementsub_total = document.createElement(DetalleFacturaPuntoVentaConstantesFunciones.SUBTOTAL);
		elementsub_total.appendChild(document.createTextNode(detallefacturapuntoventa.getsub_total().toString().trim()));
		element.appendChild(elementsub_total);

		Element elementtotal = document.createElement(DetalleFacturaPuntoVentaConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(detallefacturapuntoventa.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementdescripcion = document.createElement(DetalleFacturaPuntoVentaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(detallefacturapuntoventa.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoDetalleFacturaPuntoVentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleFacturaPuntoVenta> detallefacturapuntoventasSeleccionados=new ArrayList<DetalleFacturaPuntoVenta>();
		
		detallefacturapuntoventasSeleccionados=this.getDetalleFacturaPuntoVentasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleFacturaPuntoVenta(detallefacturapuntoventasSeleccionados);
		
		this.generarReporteDetalleFacturaPuntoVentas("Todos",detallefacturapuntoventasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleFacturaPuntoVenta(ArrayList<DetalleFacturaPuntoVenta> detallefacturapuntoventasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleFacturaPuntoVenta detallefacturapuntoventaAux:detallefacturapuntoventasSeleccionados) {
				detallefacturapuntoventaAux.setsDetalleGeneralEntityReporte(detallefacturapuntoventaAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA)) {
					existe=true;
					detallefacturapuntoventaAux.setsDescripcionGeneralEntityReporte1(detallefacturapuntoventaAux.getfacturapuntoventa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detallefacturapuntoventaAux.setsDescripcionGeneralEntityReporte1(detallefacturapuntoventaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					detallefacturapuntoventaAux.setsDescripcionGeneralEntityReporte1(detallefacturapuntoventaAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					detallefacturapuntoventaAux.setsDescripcionGeneralEntityReporte1(detallefacturapuntoventaAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					detallefacturapuntoventaAux.setsDescripcionGeneralEntityReporte1(detallefacturapuntoventaAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					detallefacturapuntoventaAux.setsDescripcionGeneralEntityReporte1(detallefacturapuntoventaAux.getunidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_SERIE)) {
					existe=true;
					detallefacturapuntoventaAux.setsDescripcionGeneralEntityReporte1(detallefacturapuntoventaAux.getserie());
				}
				 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					detallefacturapuntoventaAux.setsDescripcionGeneralEntityReporte1(detallefacturapuntoventaAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(DetalleFacturaPuntoVentaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					detallefacturapuntoventaAux.setsDescripcionGeneralEntityReporte1(detallefacturapuntoventaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleFacturaPuntoVenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarDetalleFacturaPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaModificarDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarDetalleFacturaPuntoVenta=true;
			this.isVisibilidadCeldaEliminarDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarDetalleFacturaPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaModificarDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarDetalleFacturaPuntoVenta=true;
			this.isVisibilidadCeldaEliminarDetalleFacturaPuntoVenta=true;
			this.isVisibilidadCeldaCancelarDetalleFacturaPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaModificarDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarDetalleFacturaPuntoVenta=true;
			this.isVisibilidadCeldaEliminarDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarDetalleFacturaPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta=true;
			this.isVisibilidadCeldaModificarDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarDetalleFacturaPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarDetalleFacturaPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaModificarDetalleFacturaPuntoVenta=true;
			this.isVisibilidadCeldaActualizarDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarDetalleFacturaPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleFacturaPuntoVenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleFacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta=true;
		} else {
			this.actualizarEstadoPanelsDetalleFacturaPuntoVenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleFacturaPuntoVenta=false;
			//this.isVisibilidadCeldaVerFormDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaDuplicarDetalleFacturaPuntoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturaPuntoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(!detallefacturapuntoventaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta=false;												
			}
			
			this.jButtonCerrarDetalleFacturaPuntoVenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturaPuntoVenta=false;
		}
		
		if(!this.permiteMantenimiento(this.detallefacturapuntoventa)) {
			this.isVisibilidadCeldaActualizarDetalleFacturaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarDetalleFacturaPuntoVenta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleFacturaPuntoVenta() {
	}
	
	public void actualizarEstadoPanelsDetalleFacturaPuntoVenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta!=null) {
				this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosDetalleFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleFacturaPuntoVenta!=null) {
				this.jPanelPaginacionDetalleFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesDetalleFacturaPuntoVenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta!=null) {
				this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosDetalleFacturaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleFacturaPuntoVenta!=null) {
				this.jPanelPaginacionDetalleFacturaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesDetalleFacturaPuntoVenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta!=null) {
				this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosDetalleFacturaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleFacturaPuntoVenta!=null) {
				this.jPanelPaginacionDetalleFacturaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesDetalleFacturaPuntoVenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta!=null) {
				this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosDetalleFacturaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleFacturaPuntoVenta!=null) {
				this.jPanelPaginacionDetalleFacturaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesDetalleFacturaPuntoVenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta!=null) {
				this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosDetalleFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleFacturaPuntoVenta!=null) {
				this.jPanelPaginacionDetalleFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesDetalleFacturaPuntoVenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta!=null) {
				this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosDetalleFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleFacturaPuntoVenta!=null) {
				this.jPanelPaginacionDetalleFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesDetalleFacturaPuntoVenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionDetalleFacturaPuntoVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta!=null) {
				this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleFacturaPuntoVenta!=null) {
				this.jScrollPanelDatosDetalleFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleFacturaPuntoVenta!=null) {
				this.jPanelPaginacionDetalleFacturaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesDetalleFacturaPuntoVenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta!=null) {
					this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesDetalleFacturaPuntoVenta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta!=null) {
				this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleFacturaPuntoVenta!=null) {
				this.jPanelParametrosReportesDetalleFacturaPuntoVenta.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaFacturaPuntoVenta(Boolean isParaFacturaPuntoVenta){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFacturaPuntoVentaNegation=!isParaFacturaPuntoVenta;

			this.isVisibilidadFK_IdBodega=isParaFacturaPuntoVentaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdBodegaDetalleFacturaPuntoVenta);}

			this.isVisibilidadFK_IdFacturaPuntoVenta=isParaFacturaPuntoVenta;
			if(!this.isVisibilidadFK_IdFacturaPuntoVenta) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta);}

			this.isVisibilidadFK_IdProducto=isParaFacturaPuntoVentaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdProductoDetalleFacturaPuntoVenta);}

			this.isVisibilidadFK_IdUnidad=isParaFacturaPuntoVentaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdUnidadDetalleFacturaPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdBodegaDetalleFacturaPuntoVenta);}

			this.isVisibilidadFK_IdFacturaPuntoVenta=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFacturaPuntoVenta) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdProductoDetalleFacturaPuntoVenta);}

			this.isVisibilidadFK_IdUnidad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdUnidadDetalleFacturaPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdBodegaDetalleFacturaPuntoVenta);}

			this.isVisibilidadFK_IdFacturaPuntoVenta=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFacturaPuntoVenta) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdProductoDetalleFacturaPuntoVenta);}

			this.isVisibilidadFK_IdUnidad=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdUnidadDetalleFacturaPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdBodegaDetalleFacturaPuntoVenta);}

			this.isVisibilidadFK_IdFacturaPuntoVenta=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdFacturaPuntoVenta) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdProductoDetalleFacturaPuntoVenta);}

			this.isVisibilidadFK_IdUnidad=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdUnidadDetalleFacturaPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdBodegaDetalleFacturaPuntoVenta);}

			this.isVisibilidadFK_IdFacturaPuntoVenta=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdFacturaPuntoVenta) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdProductoDetalleFacturaPuntoVenta);}

			this.isVisibilidadFK_IdUnidad=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdUnidadDetalleFacturaPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdBodega=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdBodegaDetalleFacturaPuntoVenta);}

			this.isVisibilidadFK_IdFacturaPuntoVenta=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdFacturaPuntoVenta) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta);}

			this.isVisibilidadFK_IdProducto=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdProductoDetalleFacturaPuntoVenta);}

			this.isVisibilidadFK_IdUnidad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(jPanelFK_IdUnidadDetalleFacturaPuntoVenta);}
		}
		
	}
	
	
	
	

	public String registrarSesionDetalleFacturaPuntoVentaParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(detallefacturapuntoventaSessionBean==null) {
				detallefacturapuntoventaSessionBean=new DetalleFacturaPuntoVentaSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(detallefacturapuntoventaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.detallefacturapuntoventaFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(DetalleFacturaPuntoVentaConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionDetalleFacturaPuntoVenta(true);
			//productoSessionBean.setlidDetalleFacturaPuntoVentaActual(this.idDetalleFacturaPuntoVentaActual);

			detallefacturapuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetalleFacturaPuntoVenta(true);
			detallefacturapuntoventaSessionBean.setlIdDetalleFacturaPuntoVentaActualForeignKey(this.idDetalleFacturaPuntoVentaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetalleFacturaPuntoVentaSessionBean detallefacturapuntoventaSessionBean=new DetalleFacturaPuntoVentaSessionBean();
		
		if(this.detallefacturapuntoventaSessionBean==null) {
			this.detallefacturapuntoventaSessionBean=new DetalleFacturaPuntoVentaSessionBean();
		}
		
		this.detallefacturapuntoventaSessionBean.setsUltimaBusquedaDetalleFacturaPuntoVenta(this.getsAccionBusqueda());
		this.detallefacturapuntoventaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detallefacturapuntoventaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			detallefacturapuntoventaSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detallefacturapuntoventaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFacturaPuntoVenta")) {
			detallefacturapuntoventaSessionBean.setid_factura_punto_venta(this.getid_factura_punto_ventaFK_IdFacturaPuntoVenta());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			detallefacturapuntoventaSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			detallefacturapuntoventaSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
			detallefacturapuntoventaSessionBean.setid_unidad(this.getid_unidadFK_IdUnidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetalleFacturaPuntoVentaSessionBean detallefacturapuntoventaSessionBean=new DetalleFacturaPuntoVentaSessionBean();
		
		if(this.detallefacturapuntoventaSessionBean==null) {
			this.detallefacturapuntoventaSessionBean=new DetalleFacturaPuntoVentaSessionBean();
		}
		
		if(this.detallefacturapuntoventaSessionBean.getsUltimaBusquedaDetalleFacturaPuntoVenta()!=null&&!this.detallefacturapuntoventaSessionBean.getsUltimaBusquedaDetalleFacturaPuntoVenta().equals("")) {
			this.setsAccionBusqueda(detallefacturapuntoventaSessionBean.getsUltimaBusquedaDetalleFacturaPuntoVenta());
			this.setiNumeroPaginacion(detallefacturapuntoventaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detallefacturapuntoventaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(detallefacturapuntoventaSessionBean.getid_bodega());
				detallefacturapuntoventaSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detallefacturapuntoventaSessionBean.getid_empresa());
				detallefacturapuntoventaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFacturaPuntoVenta")) {
				this.setid_factura_punto_ventaFK_IdFacturaPuntoVenta(detallefacturapuntoventaSessionBean.getid_factura_punto_venta());
				detallefacturapuntoventaSessionBean.setid_factura_punto_venta(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(detallefacturapuntoventaSessionBean.getid_producto());
				detallefacturapuntoventaSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(detallefacturapuntoventaSessionBean.getid_sucursal());
				detallefacturapuntoventaSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
				this.setid_unidadFK_IdUnidad(detallefacturapuntoventaSessionBean.getid_unidad());
				detallefacturapuntoventaSessionBean.setid_unidad(-1L);
			}
		}
		
		this.detallefacturapuntoventaSessionBean.setsUltimaBusquedaDetalleFacturaPuntoVenta("");
		this.detallefacturapuntoventaSessionBean.setiNumeroPaginacion(DetalleFacturaPuntoVentaConstantesFunciones.INUMEROPAGINACION);
		this.detallefacturapuntoventaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetalleFacturaPuntoVenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleFacturaPuntoVenta() {
		this.updateBorderResaltarBusquedasFormularioDetalleFacturaPuntoVenta();
		this.updateVisibilidadBusquedasFormularioDetalleFacturaPuntoVenta();
		this.updateHabilitarBusquedasFormularioDetalleFacturaPuntoVenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleFacturaPuntoVenta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.getComponents().length>0) {
	

		if(this.detallefacturapuntoventaConstantesFunciones.resaltarFK_IdBodegaDetalleFacturaPuntoVenta!=null) {
			index= this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.indexOfComponent(this.jPanelFK_IdBodegaDetalleFacturaPuntoVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.getComponent(index);
				jPanel.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltarFK_IdBodegaDetalleFacturaPuntoVenta);
			}
		}

		if(this.detallefacturapuntoventaConstantesFunciones.resaltarFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta!=null) {
			index= this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.indexOfComponent(this.jPanelFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.getComponent(index);
				jPanel.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltarFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta);
			}
		}

		if(this.detallefacturapuntoventaConstantesFunciones.resaltarFK_IdProductoDetalleFacturaPuntoVenta!=null) {
			index= this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.indexOfComponent(this.jPanelFK_IdProductoDetalleFacturaPuntoVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.getComponent(index);
				jPanel.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltarFK_IdProductoDetalleFacturaPuntoVenta);
			}
		}

		if(this.detallefacturapuntoventaConstantesFunciones.resaltarFK_IdUnidadDetalleFacturaPuntoVenta!=null) {
			index= this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.indexOfComponent(this.jPanelFK_IdUnidadDetalleFacturaPuntoVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.getComponent(index);
				jPanel.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltarFK_IdUnidadDetalleFacturaPuntoVenta);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleFacturaPuntoVenta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.indexOfComponent(this.jPanelFK_IdBodegaDetalleFacturaPuntoVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarFK_IdBodegaDetalleFacturaPuntoVenta);
			if(!this.detallefacturapuntoventaConstantesFunciones.mostrarFK_IdBodegaDetalleFacturaPuntoVenta && index>-1) {
				this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.indexOfComponent(this.jPanelFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta);
			if(!this.detallefacturapuntoventaConstantesFunciones.mostrarFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta && index>-1) {
				this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.indexOfComponent(this.jPanelFK_IdProductoDetalleFacturaPuntoVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarFK_IdProductoDetalleFacturaPuntoVenta);
			if(!this.detallefacturapuntoventaConstantesFunciones.mostrarFK_IdProductoDetalleFacturaPuntoVenta && index>-1) {
				this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.indexOfComponent(this.jPanelFK_IdUnidadDetalleFacturaPuntoVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarFK_IdUnidadDetalleFacturaPuntoVenta);
			if(!this.detallefacturapuntoventaConstantesFunciones.mostrarFK_IdUnidadDetalleFacturaPuntoVenta && index>-1) {
				this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleFacturaPuntoVenta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.indexOfComponent(this.jPanelFK_IdBodegaDetalleFacturaPuntoVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activarFK_IdBodegaDetalleFacturaPuntoVenta);
				this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setEnabledAt(index,this.detallefacturapuntoventaConstantesFunciones.activarFK_IdBodegaDetalleFacturaPuntoVenta);
			}

			index= this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.indexOfComponent(this.jPanelFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activarFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta);
				this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setEnabledAt(index,this.detallefacturapuntoventaConstantesFunciones.activarFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta);
			}

			index= this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.indexOfComponent(this.jPanelFK_IdProductoDetalleFacturaPuntoVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activarFK_IdProductoDetalleFacturaPuntoVenta);
				this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setEnabledAt(index,this.detallefacturapuntoventaConstantesFunciones.activarFK_IdProductoDetalleFacturaPuntoVenta);
			}

			index= this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.indexOfComponent(this.jPanelFK_IdUnidadDetalleFacturaPuntoVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activarFK_IdUnidadDetalleFacturaPuntoVenta);
				this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setEnabledAt(index,this.detallefacturapuntoventaConstantesFunciones.activarFK_IdUnidadDetalleFacturaPuntoVenta);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleFacturaPuntoVenta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.indexOfComponent(this.jPanelFK_IdBodegaDetalleFacturaPuntoVenta);

			this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.getComponent(index);

			this.detallefacturapuntoventaConstantesFunciones.setResaltarFK_IdBodegaDetalleFacturaPuntoVenta(resaltar);

			jPanel.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltarFK_IdBodegaDetalleFacturaPuntoVenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFacturaPuntoVenta")) {
			index= this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.indexOfComponent(this.jPanelFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta);

			this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.getComponent(index);

			this.detallefacturapuntoventaConstantesFunciones.setResaltarFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta(resaltar);

			jPanel.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltarFK_IdFacturaPuntoVentaDetalleFacturaPuntoVenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.indexOfComponent(this.jPanelFK_IdProductoDetalleFacturaPuntoVenta);

			this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.getComponent(index);

			this.detallefacturapuntoventaConstantesFunciones.setResaltarFK_IdProductoDetalleFacturaPuntoVenta(resaltar);

			jPanel.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltarFK_IdProductoDetalleFacturaPuntoVenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidad")) {
			index= this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.indexOfComponent(this.jPanelFK_IdUnidadDetalleFacturaPuntoVenta);

			this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleFacturaPuntoVenta.getComponent(index);

			this.detallefacturapuntoventaConstantesFunciones.setResaltarFK_IdUnidadDetalleFacturaPuntoVenta(resaltar);

			jPanel.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltarFK_IdUnidadDetalleFacturaPuntoVenta);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleFacturaPuntoVenta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetalleFacturaPuntoVenta() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleFacturaPuntoVenta();
		this.updateVisibilidadResaltarControlesFormularioDetalleFacturaPuntoVenta();
		this.updateHabilitarResaltarControlesFormularioDetalleFacturaPuntoVenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleFacturaPuntoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detallefacturapuntoventaConstantesFunciones.resaltaridDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelidDetalleFacturaPuntoVenta.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltaridDetalleFacturaPuntoVenta);}
		if(this.detallefacturapuntoventaConstantesFunciones.resaltarid_factura_punto_ventaDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltarid_factura_punto_ventaDetalleFacturaPuntoVenta);}
		if(this.detallefacturapuntoventaConstantesFunciones.resaltarid_empresaDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_empresaDetalleFacturaPuntoVenta.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltarid_empresaDetalleFacturaPuntoVenta);}
		if(this.detallefacturapuntoventaConstantesFunciones.resaltarid_sucursalDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_sucursalDetalleFacturaPuntoVenta.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltarid_sucursalDetalleFacturaPuntoVenta);}
		if(this.detallefacturapuntoventaConstantesFunciones.resaltarid_bodegaDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltarid_bodegaDetalleFacturaPuntoVenta);}
		if(this.detallefacturapuntoventaConstantesFunciones.resaltarid_productoDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltarid_productoDetalleFacturaPuntoVenta);}
		if(this.detallefacturapuntoventaConstantesFunciones.resaltarid_unidadDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_unidadDetalleFacturaPuntoVenta.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltarid_unidadDetalleFacturaPuntoVenta);}
		if(this.detallefacturapuntoventaConstantesFunciones.resaltarserieDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldserieDetalleFacturaPuntoVenta.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltarserieDetalleFacturaPuntoVenta);}
		if(this.detallefacturapuntoventaConstantesFunciones.resaltarcantidadDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldcantidadDetalleFacturaPuntoVenta.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltarcantidadDetalleFacturaPuntoVenta);}
		if(this.detallefacturapuntoventaConstantesFunciones.resaltarprecioDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldprecioDetalleFacturaPuntoVenta.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltarprecioDetalleFacturaPuntoVenta);}
		if(this.detallefacturapuntoventaConstantesFunciones.resaltardescuentoDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuentoDetalleFacturaPuntoVenta.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltardescuentoDetalleFacturaPuntoVenta);}
		if(this.detallefacturapuntoventaConstantesFunciones.resaltardescuento_valorDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuento_valorDetalleFacturaPuntoVenta.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltardescuento_valorDetalleFacturaPuntoVenta);}
		if(this.detallefacturapuntoventaConstantesFunciones.resaltarivaDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldivaDetalleFacturaPuntoVenta.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltarivaDetalleFacturaPuntoVenta);}
		if(this.detallefacturapuntoventaConstantesFunciones.resaltariva_valorDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiva_valorDetalleFacturaPuntoVenta.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltariva_valorDetalleFacturaPuntoVenta);}
		if(this.detallefacturapuntoventaConstantesFunciones.resaltariceDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiceDetalleFacturaPuntoVenta.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltariceDetalleFacturaPuntoVenta);}
		if(this.detallefacturapuntoventaConstantesFunciones.resaltarice_valorDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldice_valorDetalleFacturaPuntoVenta.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltarice_valorDetalleFacturaPuntoVenta);}
		if(this.detallefacturapuntoventaConstantesFunciones.resaltarsub_totalDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldsub_totalDetalleFacturaPuntoVenta.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltarsub_totalDetalleFacturaPuntoVenta);}
		if(this.detallefacturapuntoventaConstantesFunciones.resaltartotalDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldtotalDetalleFacturaPuntoVenta.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltartotalDetalleFacturaPuntoVenta);}
		if(this.detallefacturapuntoventaConstantesFunciones.resaltardescripcionDetalleFacturaPuntoVenta!=null && this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextAreadescripcionDetalleFacturaPuntoVenta.setBorder(this.detallefacturapuntoventaConstantesFunciones.resaltardescripcionDetalleFacturaPuntoVenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleFacturaPuntoVenta() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
	
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelidDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostraridDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPanelidDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostraridDetalleFacturaPuntoVenta);
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarid_factura_punto_ventaDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPanelid_factura_punto_ventaDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarid_factura_punto_ventaDetalleFacturaPuntoVenta);
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_empresaDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarid_empresaDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPanelid_empresaDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarid_empresaDetalleFacturaPuntoVenta);
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_sucursalDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarid_sucursalDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPanelid_sucursalDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarid_sucursalDetalleFacturaPuntoVenta);
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarid_bodegaDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPanelid_bodegaDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarid_bodegaDetalleFacturaPuntoVenta);
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarid_productoDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPanelid_productoDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarid_productoDetalleFacturaPuntoVenta);
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_productoDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarid_productoDetalleFacturaPuntoVenta);
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_unidadDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarid_unidadDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPanelid_unidadDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarid_unidadDetalleFacturaPuntoVenta);
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldserieDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarserieDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPanelserieDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarserieDetalleFacturaPuntoVenta);
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldcantidadDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarcantidadDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPanelcantidadDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarcantidadDetalleFacturaPuntoVenta);
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldprecioDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarprecioDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPanelprecioDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarprecioDetalleFacturaPuntoVenta);
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuentoDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrardescuentoDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPaneldescuentoDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrardescuentoDetalleFacturaPuntoVenta);
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuento_valorDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrardescuento_valorDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPaneldescuento_valorDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrardescuento_valorDetalleFacturaPuntoVenta);
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldivaDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarivaDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPanelivaDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarivaDetalleFacturaPuntoVenta);
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiva_valorDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrariva_valorDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPaneliva_valorDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrariva_valorDetalleFacturaPuntoVenta);
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiceDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrariceDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPaneliceDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrariceDetalleFacturaPuntoVenta);
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldice_valorDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarice_valorDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPanelice_valorDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarice_valorDetalleFacturaPuntoVenta);
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldsub_totalDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarsub_totalDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPanelsub_totalDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrarsub_totalDetalleFacturaPuntoVenta);
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldtotalDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrartotalDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPaneltotalDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrartotalDetalleFacturaPuntoVenta);
		//this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextAreadescripcionDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrardescripcionDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jPaneldescripcionDetalleFacturaPuntoVenta.setVisible(this.detallefacturapuntoventaConstantesFunciones.mostrardescripcionDetalleFacturaPuntoVenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleFacturaPuntoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta!=null) {
	
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jLabelidDetalleFacturaPuntoVenta.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activaridDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_factura_punto_ventaDetalleFacturaPuntoVenta.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activarid_factura_punto_ventaDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_empresaDetalleFacturaPuntoVenta.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activarid_empresaDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_sucursalDetalleFacturaPuntoVenta.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activarid_sucursalDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_bodegaDetalleFacturaPuntoVenta.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activarid_bodegaDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_productoDetalleFacturaPuntoVenta.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activarid_productoDetalleFacturaPuntoVenta);
			this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jButtonid_productoDetalleFacturaPuntoVenta.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activarid_productoDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jComboBoxid_unidadDetalleFacturaPuntoVenta.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activarid_unidadDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldserieDetalleFacturaPuntoVenta.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activarserieDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldcantidadDetalleFacturaPuntoVenta.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activarcantidadDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldprecioDetalleFacturaPuntoVenta.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activarprecioDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuentoDetalleFacturaPuntoVenta.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activardescuentoDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFielddescuento_valorDetalleFacturaPuntoVenta.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activardescuento_valorDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldivaDetalleFacturaPuntoVenta.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activarivaDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiva_valorDetalleFacturaPuntoVenta.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activariva_valorDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldiceDetalleFacturaPuntoVenta.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activariceDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldice_valorDetalleFacturaPuntoVenta.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activarice_valorDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldsub_totalDetalleFacturaPuntoVenta.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activarsub_totalDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextFieldtotalDetalleFacturaPuntoVenta.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activartotalDetalleFacturaPuntoVenta);
		this.jInternalFrameDetalleFormDetalleFacturaPuntoVenta.jTextAreadescripcionDetalleFacturaPuntoVenta.setEnabled(this.detallefacturapuntoventaConstantesFunciones.activardescripcionDetalleFacturaPuntoVenta);
		}
	}
	
		
}